package com.ai.imageVideo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ai.imageVideo.databinding.AcivityDrawBindingImpl;
import com.ai.imageVideo.databinding.ActivityDemoBindingImpl;
import com.ai.imageVideo.databinding.ActivityMainBindingImpl;
import com.ai.imageVideo.databinding.FragmentExploreBindingImpl;
import com.ai.imageVideo.databinding.FragmentLoginBindingImpl;
import com.ai.imageVideo.databinding.FragmentProfileBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACIVITYDRAW = 1;

  private static final int LAYOUT_ACTIVITYDEMO = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_FRAGMENTEXPLORE = 4;

  private static final int LAYOUT_FRAGMENTLOGIN = 5;

  private static final int LAYOUT_FRAGMENTPROFILE = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ai.imageVideo.R.layout.acivity_draw, LAYOUT_ACIVITYDRAW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ai.imageVideo.R.layout.activity_demo, LAYOUT_ACTIVITYDEMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ai.imageVideo.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ai.imageVideo.R.layout.fragment_explore, LAYOUT_FRAGMENTEXPLORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ai.imageVideo.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ai.imageVideo.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACIVITYDRAW: {
          if ("layout/acivity_draw_0".equals(tag)) {
            return new AcivityDrawBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for acivity_draw is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDEMO: {
          if ("layout/activity_demo_0".equals(tag)) {
            return new ActivityDemoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_demo is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXPLORE: {
          if ("layout/fragment_explore_0".equals(tag)) {
            return new FragmentExploreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_explore is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/acivity_draw_0", com.ai.imageVideo.R.layout.acivity_draw);
      sKeys.put("layout/activity_demo_0", com.ai.imageVideo.R.layout.activity_demo);
      sKeys.put("layout/activity_main_0", com.ai.imageVideo.R.layout.activity_main);
      sKeys.put("layout/fragment_explore_0", com.ai.imageVideo.R.layout.fragment_explore);
      sKeys.put("layout/fragment_login_0", com.ai.imageVideo.R.layout.fragment_login);
      sKeys.put("layout/fragment_profile_0", com.ai.imageVideo.R.layout.fragment_profile);
    }
  }
}
