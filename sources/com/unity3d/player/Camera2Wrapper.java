package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;

public class Camera2Wrapper implements C11919d {

    /* renamed from: a */
    private Context f28973a;

    /* renamed from: b */
    private C11910b f28974b = null;

    /* renamed from: c */
    private final int f28975c = 100;

    public Camera2Wrapper(Context context) {
        this.f28973a = context;
        initCamera2Jni();
    }

    /* renamed from: a */
    private static int m34429a(float f) {
        return (int) Math.min(Math.max((f * 2000.0f) - 0.0040893555f, -900.0f), 900.0f);
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    /* renamed from: a */
    public final void mo72843a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    /* renamed from: a */
    public final void mo72844a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    /* renamed from: a */
    public final void mo72845a(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        nativeFrameReady(obj, obj2, obj3, i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void closeCamera2() {
        C11910b bVar = this.f28974b;
        if (bVar != null) {
            bVar.mo73024b();
        }
        this.f28974b = null;
    }

    /* access modifiers changed from: protected */
    public int getCamera2Count() {
        if (C11925j.f29204a) {
            return C11910b.m34495a(this.f28973a);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int[] getCamera2Resolutions(int i) {
        if (C11925j.f29204a) {
            return C11910b.m34517d(this.f28973a, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int getCamera2SensorOrientation(int i) {
        if (C11925j.f29204a) {
            return C11910b.m34496a(this.f28973a, i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public Object getCameraFocusArea(float f, float f2) {
        int a = m34429a(f);
        int a2 = m34429a(1.0f - f2);
        return new Camera.Area(new Rect(a - 100, a2 - 100, a + 100, a2 + 100), 1000);
    }

    /* access modifiers changed from: protected */
    public Rect getFrameSizeCamera2() {
        C11910b bVar = this.f28974b;
        return bVar != null ? bVar.mo73021a() : new Rect();
    }

    /* access modifiers changed from: protected */
    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5) {
        if (!C11925j.f29204a || this.f28974b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C11910b bVar = new C11910b(this);
        this.f28974b = bVar;
        return bVar.mo73023a(this.f28973a, i, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public boolean isCamera2AutoFocusPointSupported(int i) {
        if (C11925j.f29204a) {
            return C11910b.m34514c(this.f28973a, i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isCamera2FrontFacing(int i) {
        if (C11925j.f29204a) {
            return C11910b.m34512b(this.f28973a, i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void pauseCamera2() {
        C11910b bVar = this.f28974b;
        if (bVar != null) {
            bVar.mo73026d();
        }
    }

    /* access modifiers changed from: protected */
    public boolean setAutoFocusPoint(float f, float f2) {
        C11910b bVar;
        if (!C11925j.f29204a || (bVar = this.f28974b) == null) {
            return false;
        }
        return bVar.mo73022a(f, f2);
    }

    /* access modifiers changed from: protected */
    public void startCamera2() {
        C11910b bVar = this.f28974b;
        if (bVar != null) {
            bVar.mo73025c();
        }
    }

    /* access modifiers changed from: protected */
    public void stopCamera2() {
        C11910b bVar = this.f28974b;
        if (bVar != null) {
            bVar.mo73027e();
        }
    }
}
