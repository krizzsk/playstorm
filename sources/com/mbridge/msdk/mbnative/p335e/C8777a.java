package com.mbridge.msdk.mbnative.p335e;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbnative.controller.C8762b;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.p333c.C8738a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.mbnative.e.a */
/* compiled from: NativeProvider */
public class C8777a {

    /* renamed from: a */
    private NativeController f21362a;

    /* renamed from: b */
    private Handler f21363b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private C8738a f21364c;

    /* renamed from: d */
    private NativeListener.NativeTrackingListener f21365d;

    /* renamed from: a */
    public final void mo58167a(C8738a aVar) {
        this.f21364c = aVar;
    }

    /* renamed from: a */
    public final void mo58168a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f21365d = nativeTrackingListener;
    }

    public C8777a() {
    }

    public C8777a(C8738a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f21364c = aVar;
        this.f21365d = nativeTrackingListener;
    }

    /* renamed from: a */
    public final void mo58164a(Context context, Resources resources, Map<String, Object> map) {
        this.f21362a = new NativeController(this.f21364c, this.f21365d, map, context);
    }

    /* renamed from: a */
    public final void mo58163a() {
        m25516a(0, "");
    }

    /* renamed from: a */
    public final void mo58169a(String str) {
        m25516a(0, str);
    }

    /* renamed from: b */
    public final void mo58170b() {
        m25516a(1, "");
    }

    /* renamed from: d */
    public final void mo58174d() {
        try {
            this.f21362a.mo58113a();
        } catch (Exception unused) {
            C8608u.m24884d("NativeProvider", "release failed");
        }
    }

    /* renamed from: a */
    public final void mo58166a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f21362a;
        if (nativeController != null) {
            nativeController.mo58116a(campaign, view, list);
        }
    }

    /* renamed from: a */
    public final void mo58165a(View view, Campaign campaign) {
        C8608u.m24882b("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f21362a;
        if (nativeController != null) {
            nativeController.mo58115a(campaign, view);
        }
    }

    /* renamed from: b */
    public final void mo58171b(View view, Campaign campaign) {
        C8608u.m24882b("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f21362a;
        if (nativeController != null) {
            nativeController.mo58120b(campaign, view);
        }
    }

    /* renamed from: b */
    public final void mo58172b(View view, List<View> list, Campaign campaign) {
        C8608u.m24882b("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f21362a;
        if (nativeController != null) {
            nativeController.mo58121b(campaign, view, list);
        }
    }

    public static void preload(Map<String, Object> map, int i) {
        C8608u.m24882b("NativeProvider", "native provider preload");
        new C8762b().mo58143a(map, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25518f() {
        this.f21364c.onAdLoadError("current request is loading");
        this.f21364c.mo58112b();
    }

    /* renamed from: a */
    private void m25516a(int i, String str) {
        if (this.f21362a != null) {
            C8738a aVar = this.f21364c;
            if (aVar == null || !aVar.mo58111a()) {
                C8738a aVar2 = this.f21364c;
                if (aVar2 != null) {
                    aVar2.mo58112b();
                }
                this.f21362a.mo58114a(i, str);
            } else if (C8613y.m24933b()) {
                m25518f();
            } else {
                this.f21363b.post(new Runnable() {
                    public final void run() {
                        C8777a.this.m25518f();
                    }
                });
            }
        }
    }

    /* renamed from: e */
    public final String mo58175e() {
        NativeController nativeController = this.f21362a;
        return nativeController != null ? nativeController.mo58118b() : "";
    }

    /* renamed from: c */
    public final void mo58173c() {
        try {
            C8602s.m24864a();
        } catch (Exception unused) {
            C8608u.m24884d("NativeProvider", "clear cache failed");
        }
    }
}
