package com.example.test.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.test.R
import com.example.test.bean.RecommendedFeedBeen

/**
 * Created by yaoletian on 2023/4/5.
 */
class RecommendedFeedAdapter(val context:Context, var datas: List<RecommendedFeedBeen>) :
    RecyclerView.Adapter<RecommendedFeedAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivBig: ImageView = view.findViewById(R.id.iv_big)
        val ivDraw: ImageView = view.findViewById(R.id.iv_draw)
        val ivIcon: ImageView = view.findViewById(R.id.iv_icon)
        val tvUserName: TextView = view.findViewById(R.id.tv_username)
        val tvLike: TextView = view.findViewById(R.id.tv_like)
        val tvUnLike: TextView = view.findViewById(R.id.tv_unlike)
        val ivUnlike: ImageView = view.findViewById(R.id.iv_unlike)
        val ivLike: ImageView = view.findViewById(R.id.iv_like)
        val ivShare: ImageView = view.findViewById(R.id.iv_share)
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bean = datas[position]
        Glide.with(context).load(bean.url).into(holder.ivBig)
        Glide.with(context)
            .load(bean.structured_prompt?.drawed_pic)
            .transform(RoundedCorners(16))
            .into(holder.ivDraw)
        Glide.with(context)
            .load(bean.owner_profile)
            .transform(CircleCrop())
            .into(holder.ivIcon)
        holder.tvUserName.setText(bean.owner_name)
        holder.tvLike.setText(bean.num_likes.toString())
        holder.tvDesc.setText(bean.prompt)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    fun updateAdapter(data: List<RecommendedFeedBeen>){
        datas = data
        notifyDataSetChanged()
    }
}