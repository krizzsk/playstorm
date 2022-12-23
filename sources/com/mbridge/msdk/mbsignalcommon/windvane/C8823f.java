package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.base.C8797e;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.f */
/* compiled from: WindVaneApiManager */
public final class C8823f {

    /* renamed from: a */
    private static HashMap<String, Class> f21463a = new HashMap<>();

    /* renamed from: b */
    private Context f21464b;

    /* renamed from: c */
    private Object f21465c;

    /* renamed from: d */
    private WindVaneWebView f21466d;

    public C8823f(Context context, WindVaneWebView windVaneWebView) {
        this.f21464b = context;
        this.f21466d = windVaneWebView;
        try {
            mo58308a(C8797e.f21391a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            mo58308a(C8797e.f21392b, Class.forName("com.mbridge.msdk.video.signal.communication.RewardSignal"));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            mo58308a(C8797e.f21393c, Class.forName("com.mbridge.msdk.video.signal.communication.VideoCommunication"));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            mo58308a(C8797e.f21394d, Class.forName("com.mbridge.msdk.interactiveads.signalcommon.Interactive"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            mo58308a(C8797e.f21395e, Class.forName("com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication"));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            mo58308a(C8797e.f21396f, Class.forName("com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin"));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            mo58308a(C8797e.f21397g, Class.forName("com.mbridge.msdk.splash.signal.SplashSignal"));
        } catch (ClassNotFoundException unused7) {
        }
        try {
            mo58308a(C8797e.f21398h, Class.forName("com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal"));
        } catch (ClassNotFoundException unused8) {
        }
    }

    /* renamed from: a */
    public final void mo58306a(Context context) {
        this.f21464b = context;
    }

    /* renamed from: a */
    public final void mo58307a(Object obj) {
        this.f21465c = obj;
    }

    /* renamed from: a */
    private Object m25665a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f21463a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!C8825h.class.isAssignableFrom(cls)) {
                return null;
            }
            C8825h hVar = (C8825h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f21465c, windVaneWebView);
            return hVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo58308a(String str, Class cls) {
        if (f21463a == null) {
            f21463a = new HashMap<>();
        }
        f21463a.put(str, cls);
    }

    /* renamed from: a */
    public final Object mo58305a(String str) {
        if (f21463a == null) {
            f21463a = new HashMap<>();
        }
        return m25665a(str, this.f21466d, this.f21464b);
    }
}
