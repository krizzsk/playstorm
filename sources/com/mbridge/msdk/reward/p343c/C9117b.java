package com.mbridge.msdk.reward.p343c;

import android.content.Context;
import android.os.Build;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p311g.C8491a;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.net.p311g.C8495e;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.out.MBConfiguration;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;

/* renamed from: com.mbridge.msdk.reward.c.b */
/* compiled from: RewardMvLoadVideoRequest */
public final class C9117b extends C8491a {
    public C9117b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo15557a(String str, C8494d dVar) {
        super.mo15557a(str, dVar);
        dVar.mo57606a(TapjoyConstants.TJC_PLATFORM, "1");
        dVar.mo57606a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
        dVar.mo57606a(CampaignEx.JSON_KEY_PACKAGE_NAME, C8596q.m24843k(this.f20559a));
        dVar.mo57606a("app_version_name", C8596q.m24833f(this.f20559a));
        dVar.mo57606a("app_version_code", C8596q.m24830e(this.f20559a) + "");
        dVar.mo57606a("orientation", C8596q.m24828d(this.f20559a) + "");
        dVar.mo57606a(DeviceRequestsHelper.DEVICE_INFO_MODEL, C8596q.m24817a());
        dVar.mo57606a("brand", C8596q.m24825c());
        dVar.mo57606a(VungleApiClient.GAID, "");
        dVar.mo57606a("gaid2", C8596q.m24840j());
        int n = C8596q.m24849n(this.f20559a);
        dVar.mo57606a("network_type", n + "");
        dVar.mo57606a("network_str", C8596q.m24818a(this.f20559a, n) + "");
        dVar.mo57606a("language", C8596q.m24826c(this.f20559a));
        dVar.mo57606a(TapjoyConstants.TJC_DEVICE_TIMEZONE, C8596q.m24831e());
        dVar.mo57606a("useragent", C8596q.m24829d());
        dVar.mo57606a("sdk_version", MBConfiguration.SDK_VERSION);
        dVar.mo57606a("screen_size", C8596q.m24837h(this.f20559a) + "x" + C8596q.m24838i(this.f20559a));
        dVar.mo57606a("version_flag", "1");
        C8495e.m24526a(dVar, this.f20559a);
        C8495e.m24525a(dVar);
    }
}
