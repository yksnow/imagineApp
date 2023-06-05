package com.ai.imageVideo.utils;

import java.lang.System;

/**
 * 业务名:    <br></br>
 * 功能说明: Activity路由 <br></br>
 * 编写日期:	2019-07-18
 * 作者:	姚乐天
 *
 *
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nJ,\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nJ \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH\u0002J(\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J0\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u001d\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\u0004\b\u0000\u0010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J0\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u001a\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\rH\u0002J0\u0010\"\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J0\u0010#\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J,\u0010#\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\rJ6\u0010#\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/ai/imageVideo/utils/ActivityRouter;", "", "()V", "PARCELABLE_EXTRA_KEY", "", "checkToken", "", "context", "Landroid/content/Context;", "targetClazz", "Ljava/lang/Class;", "Landroid/app/Activity;", "code", "", "forward", "parcelable", "Landroid/os/Parcelable;", "serializable", "Ljava/io/Serializable;", "flags", "getAppDetailSettingIntent", "packageName", "getParcelableExtra", "T", "activity", "(Landroid/app/Activity;)Ljava/lang/Object;", "isActivity", "", "overlay", "putParcelableExtra", "intent", "Landroid/content/Intent;", "putSerializableExtra", "setFlags", "setResult", "startForResult", "bundle", "Landroid/os/Bundle;", "app_debug"})
public final class ActivityRouter {
    @org.jetbrains.annotations.NotNull()
    public static final com.ai.imageVideo.utils.ActivityRouter INSTANCE = null;
    private static final java.lang.String PARCELABLE_EXTRA_KEY = "ROUTER_PARCELABLE_EXTRA_KEY";
    
    private ActivityRouter() {
        super();
    }
    
    /**
     * @param context
     * @param targetClazz 检查token
     */
    public final void checkToken(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Class<? extends android.app.Activity> targetClazz) {
    }
    
    /**
     * @param context
     * @param code
     * @param targetClazz 检查token
     */
    public final void checkToken(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int code, @org.jetbrains.annotations.Nullable()
    java.lang.Class<? extends android.app.Activity> targetClazz) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getParcelableExtra(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
        return null;
    }
    
    private final void overlay(android.content.Context context, java.lang.Class<? extends android.app.Activity> targetClazz, int flags, android.os.Parcelable parcelable) {
    }
    
    private final void forward(android.content.Context context, java.lang.Class<? extends android.app.Activity> targetClazz, int flags, android.os.Parcelable parcelable) {
    }
    
    private final void forward(android.content.Context context, java.lang.Class<? extends android.app.Activity> targetClazz, android.os.Parcelable parcelable) {
    }
    
    private final void forward(android.content.Context context, java.lang.Class<? extends android.app.Activity> targetClazz, java.io.Serializable serializable) {
    }
    
    private final void forward(android.content.Context context, java.lang.Class<? extends android.app.Activity> targetClazz) {
    }
    
    public final void startForResult(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Class<? extends android.app.Activity> targetClazz, int flags) {
    }
    
    public final void startForResult(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Class<? extends android.app.Activity> targetClazz, int flags, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    private final void startForResult(android.content.Context context, java.lang.Class<? extends android.app.Activity> targetClazz, int flags, android.os.Parcelable parcelable) {
    }
    
    private final void setResult(android.content.Context context, java.lang.Class<? extends android.app.Activity> targetClazz, int flags, android.os.Parcelable parcelable) {
    }
    
    private final boolean isActivity(android.content.Context context) {
        return false;
    }
    
    private final void setFlags(android.content.Intent intent, int flags) {
    }
    
    private final void putParcelableExtra(android.content.Intent intent, android.os.Parcelable parcelable) {
    }
    
    private final void putSerializableExtra(android.content.Intent intent, java.io.Serializable serializable) {
    }
    
    /**
     * 跳转到权限设置界面
     */
    public final void getAppDetailSettingIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String packageName) {
    }
}