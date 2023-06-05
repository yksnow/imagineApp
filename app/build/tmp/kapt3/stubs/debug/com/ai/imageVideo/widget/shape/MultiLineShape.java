package com.ai.imageVideo.widget.shape;

import java.lang.System;

/**
 * Created by user on 2016/10/27.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0016\u00a8\u0006\u0015"}, d2 = {"Lcom/ai/imageVideo/widget/shape/MultiLineShape;", "Lcom/ai/imageVideo/widget/shape/DrawShape;", "()V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getNextPointX", "", "getNextPointY", "touchDown", "startX", "", "startY", "touchMove", "currentX", "currentY", "touchUp", "endX", "endY", "Companion", "app_debug"})
public final class MultiLineShape extends com.ai.imageVideo.widget.shape.DrawShape {
    @org.jetbrains.annotations.NotNull()
    public static final com.ai.imageVideo.widget.shape.MultiLineShape.Companion Companion = null;
    private static final com.ai.imageVideo.widget.shape.WritablePath mPath = null;
    private static float mNextStartX = -1.0F;
    private static float mNextStartY = -1.0F;
    
    public MultiLineShape() {
        super();
    }
    
    @java.lang.Override()
    public void touchDown(int startX, int startY) {
    }
    
    @java.lang.Override()
    public void touchMove(int currentX, int currentY) {
    }
    
    @java.lang.Override()
    public void touchUp(int endX, int endY) {
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    public final float getNextPointX() {
        return 0.0F;
    }
    
    public final float getNextPointY() {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ai/imageVideo/widget/shape/MultiLineShape$Companion;", "", "()V", "<set-?>", "", "mNextStartX", "getMNextStartX", "()F", "setMNextStartX", "(F)V", "mNextStartY", "getMNextStartY", "setMNextStartY", "mPath", "Lcom/ai/imageVideo/widget/shape/WritablePath;", "clear", "", "setNewStartPoint", "x", "y", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final float getMNextStartX() {
            return 0.0F;
        }
        
        private final void setMNextStartX(float p0) {
        }
        
        public final float getMNextStartY() {
            return 0.0F;
        }
        
        private final void setMNextStartY(float p0) {
        }
        
        public final void clear() {
        }
        
        public final void setNewStartPoint(float x, float y) {
        }
    }
}