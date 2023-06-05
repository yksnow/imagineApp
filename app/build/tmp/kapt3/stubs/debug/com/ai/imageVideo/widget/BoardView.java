package com.ai.imageVideo.widget;

import java.lang.System;

/**
 * Created by linlongxin on 2016/10/24.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001@B\'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020$J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0014H\u0014J0\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0014J\u0010\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u000203H\u0016J\u0006\u00104\u001a\u00020$J\u0016\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0007J\u000e\u00108\u001a\u00020$2\u0006\u00107\u001a\u00020\u0007J\u0010\u00109\u001a\u00020$2\b\u0010:\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010;\u001a\u00020$J\u0006\u0010<\u001a\u00020$J\u0014\u0010=\u001a\u00020$2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170?R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u0006A"}, d2 = {"Lcom/ai/imageVideo/widget/BoardView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "<set-?>", "Landroid/graphics/Bitmap;", "drawBitmap", "getDrawBitmap", "()Landroid/graphics/Bitmap;", "isClearScreen", "", "isRecentRecallOrUndo", "mCanvas", "Landroid/graphics/Canvas;", "mDeletePath", "Ljava/util/ArrayList;", "Lcom/ai/imageVideo/widget/shape/ShapeResource;", "Lkotlin/collections/ArrayList;", "mDownAction", "Lcom/ai/imageVideo/widget/BoardView$OnDownAction;", "mDrawType", "mPaint", "Landroid/graphics/Paint;", "mShape", "Lcom/ai/imageVideo/widget/shape/DrawShape;", "notePath", "getNotePath", "()Ljava/util/ArrayList;", "clearScreen", "", "createBitmap", "width", "height", "loadBitmapFromLocal", "onDraw", "canvas", "onLayout", "changed", "left", "top", "right", "bottom", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "reCall", "saveShapeResource", "resource", "type", "setDrawType", "setOnDownAction", "action", "undo", "updateBitmap", "updateDrawFromPaths", "data", "", "OnDownAction", "app_debug"})
public final class BoardView extends android.view.View {
    private final java.lang.String TAG = "BoardView";
    private int mDrawType = 123;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap drawBitmap;
    private android.graphics.Canvas mCanvas;
    private final android.graphics.Paint mPaint = null;
    private com.ai.imageVideo.widget.shape.DrawShape mShape;
    private boolean isClearScreen = false;
    private boolean isRecentRecallOrUndo = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.ai.imageVideo.widget.shape.ShapeResource> notePath = null;
    private final java.util.ArrayList<com.ai.imageVideo.widget.shape.ShapeResource> mDeletePath = null;
    private com.ai.imageVideo.widget.BoardView.OnDownAction mDownAction;
    
    @kotlin.jvm.JvmOverloads()
    public BoardView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BoardView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BoardView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getDrawBitmap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ai.imageVideo.widget.shape.ShapeResource> getNotePath() {
        return null;
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public final void saveShapeResource(@org.jetbrains.annotations.NotNull()
    com.ai.imageVideo.widget.shape.ShapeResource resource, int type) {
    }
    
    public final void reCall() {
    }
    
    public final void undo() {
    }
    
    public final void updateBitmap() {
    }
    
    public final void clearScreen() {
    }
    
    public final void updateDrawFromPaths(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ai.imageVideo.widget.shape.ShapeResource> data) {
    }
    
    public final void loadBitmapFromLocal() {
    }
    
    public final void setDrawType(int type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap createBitmap(int width, int height) {
        return null;
    }
    
    public final void setOnDownAction(@org.jetbrains.annotations.Nullable()
    com.ai.imageVideo.widget.BoardView.OnDownAction action) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/ai/imageVideo/widget/BoardView$OnDownAction;", "", "dealDownAction", "", "app_debug"})
    public static abstract interface OnDownAction {
        
        public abstract void dealDownAction();
    }
}