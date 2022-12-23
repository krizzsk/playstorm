package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.unity3d.player.GoogleVrVideo;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicLong;

class GoogleVrProxy extends C11917c implements GoogleVrVideo {

    /* renamed from: f */
    private boolean f28977f = false;

    /* renamed from: g */
    private boolean f28978g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Runnable f28979h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Vector f28980i = new Vector();

    /* renamed from: j */
    private SurfaceView f28981j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11860a f28982k = new C11860a();

    /* renamed from: l */
    private Thread f28983l = null;

    /* renamed from: m */
    private Handler f28984m = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (message.what != 135711) {
                super.handleMessage(message);
                return;
            }
            switch (message.arg1) {
                case 2147483645:
                    Iterator it = GoogleVrProxy.this.f28980i.iterator();
                    while (it.hasNext()) {
                        ((GoogleVrVideo.GoogleVrVideoCallbacks) it.next()).onFrameAvailable();
                    }
                    return;
                case 2147483646:
                    Surface surface = (Surface) message.obj;
                    Iterator it2 = GoogleVrProxy.this.f28980i.iterator();
                    while (it2.hasNext()) {
                        ((GoogleVrVideo.GoogleVrVideoCallbacks) it2.next()).onSurfaceAvailable(surface);
                    }
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    };

    /* renamed from: com.unity3d.player.GoogleVrProxy$a */
    class C11860a {

        /* renamed from: a */
        public boolean f28996a = false;

        /* renamed from: b */
        public boolean f28997b = false;

        /* renamed from: c */
        public boolean f28998c = false;

        /* renamed from: d */
        public boolean f28999d = false;

        /* renamed from: e */
        public boolean f29000e = true;

        /* renamed from: f */
        public boolean f29001f = false;

        C11860a() {
        }

        /* renamed from: a */
        public final boolean mo72881a() {
            return this.f28996a && this.f28997b;
        }

        /* renamed from: b */
        public final void mo72882b() {
            this.f28996a = false;
            this.f28997b = false;
            this.f28999d = false;
            this.f29000e = true;
            this.f29001f = false;
        }
    }

    public GoogleVrProxy(C11921f fVar) {
        super("Google VR", fVar);
        initVrJni();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34438a(boolean z) {
        this.f28982k.f28999d = z;
    }

    /* renamed from: a */
    private boolean m34439a(ClassLoader classLoader) {
        try {
            Class<?> loadClass = classLoader.loadClass("com.unity3d.unitygvr.GoogleVR");
            C11936o oVar = new C11936o(loadClass, loadClass.getConstructor(new Class[0]).newInstance(new Object[0]));
            oVar.mo73079a("initialize", new Class[]{Activity.class, Context.class, SurfaceView.class, Boolean.TYPE, Handler.class});
            oVar.mo73079a("deinitialize", new Class[0]);
            oVar.mo73079a("load", new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Runnable.class});
            oVar.mo73079a("enable", new Class[]{Boolean.TYPE});
            oVar.mo73079a(MraidJsMethods.UNLOAD, new Class[0]);
            oVar.mo73079a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new Class[0]);
            oVar.mo73079a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, new Class[0]);
            oVar.mo73079a("getGvrLayout", new Class[0]);
            oVar.mo73079a("getVideoSurfaceId", new Class[0]);
            oVar.mo73079a("getVideoSurface", new Class[0]);
            this.f29195a = oVar;
            return true;
        } catch (Exception e) {
            reportError("Exception initializing GoogleVR from Unity library. " + e.getLocalizedMessage());
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m34442d() {
        return this.f28982k.f28999d;
    }

    /* renamed from: e */
    private void m34444e() {
        Activity activity = (Activity) this.f29197c;
        if (this.f28978g && !this.f28982k.f29001f && activity != null) {
            this.f28982k.f29001f = true;
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            activity.startActivity(intent);
        }
    }

    /* renamed from: f */
    private static boolean m34445f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    private final native void initVrJni();

    private final native boolean isQuiting();

    private final native void setVrVideoTransform(float[][] fArr);

    /* renamed from: a */
    public final void mo72862a(Intent intent) {
        if (intent != null && intent.getBooleanExtra("android.intent.extra.VR_LAUNCH", false)) {
            this.f28978g = true;
        }
    }

    /* renamed from: a */
    public final boolean mo72863a() {
        return this.f28982k.f28996a;
    }

    /* renamed from: a */
    public final boolean mo72864a(Activity activity, Context context, SurfaceView surfaceView, Runnable runnable) {
        String str;
        boolean z;
        if (activity == null || context == null || surfaceView == null || runnable == null) {
            str = "Invalid parameters passed to Google VR initialization.";
        } else {
            this.f28982k.mo72882b();
            this.f29197c = context;
            this.f28979h = runnable;
            if (this.f28978g && !m34445f()) {
                str = "Daydream requires a device that supports an api version of 24 (Nougat) or better.";
            } else if (!m34439a(UnityPlayer.class.getClassLoader())) {
                return false;
            } else {
                try {
                    z = ((Boolean) this.f29195a.mo73078a("initialize", activity, context, surfaceView, Boolean.valueOf(this.f28978g), this.f28984m)).booleanValue();
                } catch (Exception e) {
                    reportError("Exception while trying to initialize Unity Google VR Library. " + e.getLocalizedMessage());
                    z = false;
                }
                if (!z) {
                    str = "Unable to initialize GoogleVR library.";
                } else {
                    this.f28981j = surfaceView;
                    this.f28982k.f28996a = true;
                    this.f29198d = "";
                    return true;
                }
            }
        }
        reportError(str);
        return false;
    }

    /* renamed from: b */
    public final void mo72865b() {
        resumeGvrLayout();
    }

    /* renamed from: c */
    public final void mo72866c() {
        SurfaceView surfaceView = this.f28981j;
        if (surfaceView != null) {
            surfaceView.getHolder().setSizeFromLayout();
        }
    }

    public void deregisterGoogleVrVideoListener(GoogleVrVideo.GoogleVrVideoCallbacks googleVrVideoCallbacks) {
        if (this.f28980i.contains(googleVrVideoCallbacks)) {
            googleVrVideoCallbacks.onSurfaceUnavailable();
            this.f28980i.remove(googleVrVideoCallbacks);
        }
    }

    /* access modifiers changed from: protected */
    public Object getVideoSurface() {
        if (m34442d() && !this.f28982k.f29000e) {
            try {
                return this.f29195a.mo73078a("getVideoSurface", new Object[0]);
            } catch (Exception e) {
                reportError("Exception caught while Getting GoogleVR Video Surface. " + e.getLocalizedMessage());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int getVideoSurfaceId() {
        if (m34442d() && !this.f28982k.f29000e) {
            try {
                return ((Integer) this.f29195a.mo73078a("getVideoSurfaceId", new Object[0])).intValue();
            } catch (Exception e) {
                reportError("Exception caught while getting Video Surface ID from GoogleVR. " + e.getLocalizedMessage());
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public long loadGoogleVr(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (!this.f28982k.f28996a) {
            return 0;
        }
        AtomicLong atomicLong = new AtomicLong(0);
        this.f29198d = (z || z2) ? "Daydream" : "Cardboard";
        final AtomicLong atomicLong2 = atomicLong;
        final boolean z6 = z;
        final boolean z7 = z2;
        final boolean z8 = z3;
        final boolean z9 = z4;
        final boolean z10 = z5;
        if (!runOnUiThreadWithSync(new Runnable() {
            public final void run() {
                try {
                    atomicLong2.set(((Long) GoogleVrProxy.this.f29195a.mo73078a("load", Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), Boolean.valueOf(z9), Boolean.valueOf(z10), GoogleVrProxy.this.f28979h)).longValue());
                    GoogleVrProxy.this.f28982k.f28997b = true;
                } catch (Exception e) {
                    GoogleVrProxy googleVrProxy = GoogleVrProxy.this;
                    googleVrProxy.reportError("Exception caught while loading GoogleVR. " + e.getLocalizedMessage());
                    atomicLong2.set(0);
                }
            }
        }) || atomicLong.longValue() == 0) {
            reportError("Google VR had a fatal issue while loading. VR will not be available.");
        }
        return atomicLong.longValue();
    }

    /* access modifiers changed from: protected */
    public void pauseGvrLayout() {
        if (this.f28982k.mo72881a() && !this.f28982k.f29000e) {
            if (m34442d()) {
                Iterator it = this.f28980i.iterator();
                while (it.hasNext()) {
                    ((GoogleVrVideo.GoogleVrVideoCallbacks) it.next()).onSurfaceUnavailable();
                }
            }
            if (this.f29195a != null) {
                this.f29195a.mo73078a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new Object[0]);
            }
            this.f28982k.f29000e = true;
        }
    }

    public void registerGoogleVrVideoListener(GoogleVrVideo.GoogleVrVideoCallbacks googleVrVideoCallbacks) {
        if (!this.f28980i.contains(googleVrVideoCallbacks)) {
            this.f28980i.add(googleVrVideoCallbacks);
            Surface surface = (Surface) getVideoSurface();
            if (surface != null) {
                googleVrVideoCallbacks.onSurfaceAvailable(surface);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void resumeGvrLayout() {
        if (this.f28982k.mo72881a() && this.f28982k.f29000e) {
            if (this.f29195a != null) {
                this.f29195a.mo73078a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, new Object[0]);
            }
            this.f28982k.f29000e = false;
        }
    }

    /* access modifiers changed from: protected */
    public void setGoogleVrModeEnabled(final boolean z) {
        if (this.f28982k.mo72881a() && this.f29196b != null && this.f29197c != null) {
            if (!z && isQuiting()) {
                m34444e();
            }
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (z != GoogleVrProxy.this.m34442d()) {
                        try {
                            if (z) {
                                if (!GoogleVrProxy.this.m34442d()) {
                                    if (GoogleVrProxy.this.f29195a == null || GoogleVrProxy.this.f29196b == null || GoogleVrProxy.this.f29196b.addViewToPlayer((View) GoogleVrProxy.this.f29195a.mo73078a("getGvrLayout", new Object[0]), true)) {
                                        if (GoogleVrProxy.this.f29195a != null) {
                                            GoogleVrProxy.this.f29195a.mo73078a("enable", true);
                                        }
                                        GoogleVrProxy.this.m34438a(true);
                                        return;
                                    }
                                    GoogleVrProxy.this.reportError("Unable to add Google VR to view hierarchy.");
                                    return;
                                }
                            }
                            if (!z && GoogleVrProxy.this.m34442d()) {
                                GoogleVrProxy.this.m34438a(false);
                                if (GoogleVrProxy.this.f29195a != null) {
                                    GoogleVrProxy.this.f29195a.mo73078a("enable", false);
                                }
                                if (GoogleVrProxy.this.f29195a != null && GoogleVrProxy.this.f29196b != null) {
                                    GoogleVrProxy.this.f29196b.removeViewFromPlayer((View) GoogleVrProxy.this.f29195a.mo73078a("getGvrLayout", new Object[0]));
                                }
                            }
                        } catch (Exception e) {
                            GoogleVrProxy googleVrProxy = GoogleVrProxy.this;
                            googleVrProxy.reportError("Exception enabling Google VR on UI Thread. " + e.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    public void setVideoLocationTransform(float[] fArr) {
        float[][] fArr2 = (float[][]) Array.newInstance(float.class, new int[]{4, 4});
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                fArr2[i][i2] = fArr[(i * 4) + i2];
            }
        }
        setVrVideoTransform(fArr2);
    }

    /* access modifiers changed from: protected */
    public void unloadGoogleVr() {
        if (this.f28982k.f28999d) {
            setGoogleVrModeEnabled(false);
        }
        if (this.f28982k.f28998c) {
            this.f28982k.f28998c = false;
        }
        this.f28981j = null;
        runOnUiThread(new Runnable() {
            public final void run() {
                try {
                    if (GoogleVrProxy.this.f29195a != null) {
                        GoogleVrProxy.this.f29195a.mo73078a(MraidJsMethods.UNLOAD, new Object[0]);
                        GoogleVrProxy.this.f29195a.mo73078a("deinitialize", new Object[0]);
                        GoogleVrProxy.this.f29195a = null;
                    }
                    GoogleVrProxy.this.f28982k.f28997b = false;
                } catch (Exception e) {
                    GoogleVrProxy googleVrProxy = GoogleVrProxy.this;
                    googleVrProxy.reportError("Exception unloading Google VR on UI Thread. " + e.getLocalizedMessage());
                }
            }
        });
    }
}
