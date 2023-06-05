package com.ai.imageVideo.widget.shape;

import java.lang.System;

/**
 * yaoletian on 2016/10/24.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016J\u0018\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H&J\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u0011\u0010\u0019\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010\u00a8\u0006-"}, d2 = {"Lcom/ai/imageVideo/widget/shape/DrawShape;", "", "()V", "<set-?>", "", "mEndX", "getMEndX", "()I", "setMEndX", "(I)V", "mEndY", "getMEndY", "setMEndY", "mPaint", "Lcom/ai/imageVideo/widget/shape/WritablePaint;", "getMPaint", "()Lcom/ai/imageVideo/widget/shape/WritablePaint;", "setMPaint", "(Lcom/ai/imageVideo/widget/shape/WritablePaint;)V", "mStartX", "getMStartX", "setMStartX", "mStartY", "getMStartY", "setMStartY", "paint", "getPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getEndX", "getEndY", "getStartX", "getStartY", "touchDown", "startX", "startY", "touchMove", "currentX", "currentY", "touchUp", "endX", "endY", "Companion", "app_debug"})
public abstract class DrawShape {
    @org.jetbrains.annotations.NotNull()
    private com.ai.imageVideo.widget.shape.WritablePaint mPaint;
    private int mStartX = 0;
    private int mStartY = 0;
    private int mEndX = 0;
    private int mEndY = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.ai.imageVideo.widget.shape.DrawShape.Companion Companion = null;
    private static int mPaintColor = android.graphics.Color.BLACK;
    private static float mPaintWidth = 5.0F;
    
    public DrawShape() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.ai.imageVideo.widget.shape.WritablePaint getMPaint() {
        return null;
    }
    
    protected final void setMPaint(@org.jetbrains.annotations.NotNull()
    com.ai.imageVideo.widget.shape.WritablePaint p0) {
    }
    
    public final int getMStartX() {
        return 0;
    }
    
    protected final void setMStartX(int p0) {
    }
    
    public final int getMStartY() {
        return 0;
    }
    
    protected final void setMStartY(int p0) {
    }
    
    public final int getMEndX() {
        return 0;
    }
    
    protected final void setMEndX(int p0) {
    }
    
    public final int getMEndY() {
        return 0;
    }
    
    protected final void setMEndY(int p0) {
    }
    
    public void touchDown(int startX, int startY) {
    }
    
    public void touchUp(int endX, int endY) {
    }
    
    public abstract void touchMove(int currentX, int currentY);
    
    public abstract void draw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas);
    
    @org.jetbrains.annotations.NotNull()
    public final com.ai.imageVideo.widget.shape.WritablePaint getPaint() {
        return null;
    }
    
    public int getStartX() {
        return 0;
    }
    
    public int getStartY() {
        return 0;
    }
    
    public int getEndX() {
        return 0;
    }
    
    public int getEndY() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/ai/imageVideo/widget/shape/DrawShape$Companion;", "", "()V", "mPaintColor", "", "getMPaintColor", "()I", "setMPaintColor", "(I)V", "mPaintWidth", "", "getMPaintWidth", "()F", "setMPaintWidth", "(F)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getMPaintColor() {
            return 0;
        }
        
        public final void setMPaintColor(int p0) {
        }
        
        public final float getMPaintWidth() {
            return 0.0F;
        }
        
        public final void setMPaintWidth(float p0) {
        }
    }
}