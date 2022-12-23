package com.mbridge.msdk.video.signal.p369a;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.C9432c;
import com.mbridge.msdk.videocommon.p373d.C9551c;

/* renamed from: com.mbridge.msdk.video.signal.a.c */
/* compiled from: DefaultJSCommon */
public class C9416c implements C9432c {

    /* renamed from: a */
    protected boolean f23017a = false;

    /* renamed from: b */
    protected boolean f23018b = false;

    /* renamed from: c */
    protected int f23019c = 0;

    /* renamed from: d */
    protected int f23020d = 0;

    /* renamed from: e */
    protected int f23021e = 0;

    /* renamed from: f */
    protected int f23022f = 0;

    /* renamed from: g */
    protected int f23023g = 1;

    /* renamed from: h */
    protected int f23024h = -1;

    /* renamed from: i */
    protected String f23025i;

    /* renamed from: j */
    protected C9551c f23026j;

    /* renamed from: k */
    protected C2295a f23027k;

    /* renamed from: l */
    public C9432c.C9433a f23028l = new C9417a();

    /* renamed from: m */
    protected int f23029m = 2;

    /* renamed from: f */
    public void mo62828f() {
    }

    /* renamed from: a */
    public final void mo62811a(int i) {
        this.f23029m = i;
    }

    /* renamed from: c */
    public final void mo62823c(int i) {
        this.f23019c = i;
    }

    /* renamed from: b */
    public final void mo62818b(int i) {
        this.f23020d = i;
    }

    /* renamed from: d */
    public final void mo62825d(int i) {
        this.f23021e = i;
    }

    /* renamed from: j */
    public final int mo62835j() {
        if (this.f23019c == 0 && this.f23018b) {
            this.f23019c = 1;
        }
        return this.f23019c;
    }

    /* renamed from: k */
    public final int mo62836k() {
        if (this.f23020d == 0 && this.f23018b) {
            this.f23020d = 1;
        }
        return this.f23020d;
    }

    /* renamed from: l */
    public final int mo62837l() {
        if (this.f23021e == 0 && this.f23018b) {
            this.f23021e = 1;
        }
        return this.f23021e;
    }

    /* renamed from: e */
    public final void mo62827e(int i) {
        this.f23022f = i;
    }

    /* renamed from: a */
    public final int mo62810a() {
        return this.f23022f;
    }

    /* renamed from: m */
    public final boolean mo62838m() {
        return this.f23018b;
    }

    /* renamed from: a */
    public final void mo62817a(boolean z) {
        C8608u.m24880a("DefaultJSCommon", "setIsShowingTransparent:" + z);
        this.f23018b = z;
    }

    /* renamed from: b */
    public final boolean mo62821b() {
        return this.f23017a;
    }

    /* renamed from: b */
    public final void mo62820b(boolean z) {
        this.f23017a = z;
    }

    /* renamed from: a */
    public final void mo62816a(String str) {
        C8608u.m24880a("DefaultJSCommon", "setUnitId:" + str);
        this.f23025i = str;
    }

    /* renamed from: a */
    public final void mo62814a(C9432c.C9433a aVar) {
        C8608u.m24880a("DefaultJSCommon", "setTrackingListener:" + aVar);
        this.f23028l = aVar;
    }

    /* renamed from: a */
    public final void mo62815a(C9551c cVar) {
        C8608u.m24880a("DefaultJSCommon", "setSetting:" + cVar);
        this.f23026j = cVar;
    }

    /* renamed from: e */
    public final void mo62826e() {
        C8608u.m24880a("DefaultJSCommon", "release");
        C2295a aVar = this.f23027k;
        if (aVar != null) {
            aVar.mo15644a(false);
            this.f23027k.mo15642a((NativeListener.NativeTrackingListener) null);
            this.f23027k.mo15638a();
        }
    }

    /* renamed from: a */
    public void mo62812a(int i, String str) {
        C8608u.m24880a("DefaultJSCommon", "statistics,type:" + i + ",json:" + str);
    }

    /* renamed from: f */
    public final void mo62829f(int i) {
        this.f23024h = i;
    }

    /* renamed from: g */
    public final int mo62830g() {
        return this.f23024h;
    }

    /* renamed from: g */
    public String mo62831g(int i) {
        C8608u.m24880a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    /* renamed from: h */
    public final void mo62833h(int i) {
        C8608u.m24880a("DefaultJSCommon", "setAlertDialogRole " + i);
        this.f23023g = i;
    }

    /* renamed from: h */
    public final int mo62832h() {
        C8608u.m24880a("DefaultJSCommon", "getAlertDialogRole " + this.f23023g);
        return this.f23023g;
    }

    /* renamed from: a */
    public void mo62813a(Activity activity) {
        C8608u.m24880a("DefaultJSCommon", "setActivity ");
    }

    /* renamed from: c */
    public String mo62822c() {
        C8608u.m24880a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    public void click(int i, String str) {
        C8608u.m24880a("DefaultJSCommon", "click:type" + i + ",pt:" + str);
    }

    public void handlerH5Exception(int i, String str) {
        C8608u.m24880a("DefaultJSCommon", "handlerH5Exception,code=" + i + ",msg:" + str);
    }

    /* renamed from: d */
    public void mo62824d() {
        C8608u.m24880a("DefaultJSCommon", "finish");
    }

    /* renamed from: b */
    public void mo62819b(String str) {
        C8608u.m24880a("DefaultJSCommon", "setNotchArea");
    }

    /* renamed from: i */
    public String mo62834i() {
        C8608u.m24880a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    /* renamed from: com.mbridge.msdk.video.signal.a.c$b */
    /* compiled from: DefaultJSCommon */
    public static class C9418b implements C9432c.C9433a {

        /* renamed from: a */
        private C9432c f23030a;

        /* renamed from: b */
        private C9432c.C9433a f23031b;

        public C9418b(C9432c cVar, C9432c.C9433a aVar) {
            this.f23030a = cVar;
            this.f23031b = aVar;
        }

        public final boolean onInterceptDefaultLoadingDialog() {
            C9432c.C9433a aVar = this.f23031b;
            return aVar != null && aVar.onInterceptDefaultLoadingDialog();
        }

        public final void onShowLoading(Campaign campaign) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.onShowLoading(campaign);
            }
        }

        public final void onDismissLoading(Campaign campaign) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.onDismissLoading(campaign);
            }
        }

        public final void onStartRedirection(Campaign campaign, String str) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.onStartRedirection(campaign, str);
            }
        }

        public final void onFinishRedirection(Campaign campaign, String str) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.onFinishRedirection(campaign, str);
            }
            C9432c cVar = this.f23030a;
            if (cVar != null) {
                cVar.mo62824d();
            }
        }

        public final void onRedirectionFailed(Campaign campaign, String str) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.onRedirectionFailed(campaign, str);
            }
            C9432c cVar = this.f23030a;
            if (cVar != null) {
                cVar.mo62824d();
            }
        }

        public final void onDownloadStart(Campaign campaign) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.onDownloadStart(campaign);
            }
        }

        public final void onDownloadFinish(Campaign campaign) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.onDownloadFinish(campaign);
            }
        }

        public final void onDownloadProgress(int i) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.onDownloadProgress(i);
            }
        }

        /* renamed from: a */
        public final void mo62253a() {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.mo62253a();
            }
        }

        /* renamed from: a */
        public final void mo62255a(boolean z) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.mo62255a(z);
            }
        }

        /* renamed from: a */
        public final void mo62254a(int i, String str) {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.mo62254a(i, str);
            }
        }

        /* renamed from: b */
        public final void mo62256b() {
            C9432c.C9433a aVar = this.f23031b;
            if (aVar != null) {
                aVar.mo62256b();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.signal.a.c$a */
    /* compiled from: DefaultJSCommon */
    public static class C9417a implements C9432c.C9433a {
        public boolean onInterceptDefaultLoadingDialog() {
            C8608u.m24880a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        public void onShowLoading(Campaign campaign) {
            C8608u.m24880a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        public void onDismissLoading(Campaign campaign) {
            C8608u.m24880a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        public void onStartRedirection(Campaign campaign, String str) {
            C8608u.m24880a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onFinishRedirection(Campaign campaign, String str) {
            C8608u.m24880a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onRedirectionFailed(Campaign campaign, String str) {
            C8608u.m24880a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onDownloadStart(Campaign campaign) {
            C8608u.m24880a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        public void onDownloadFinish(Campaign campaign) {
            C8608u.m24880a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        public void onDownloadProgress(int i) {
            C8608u.m24880a("DefaultJSCommon", "onDownloadProgress,progress:" + i);
        }

        /* renamed from: a */
        public void mo62253a() {
            C8608u.m24880a("DefaultJSCommon", "onInitSuccess");
        }

        /* renamed from: a */
        public void mo62255a(boolean z) {
            C8608u.m24880a("DefaultJSCommon", "onStartInstall");
        }

        /* renamed from: a */
        public void mo62254a(int i, String str) {
            C8608u.m24880a("DefaultJSCommon", "onH5Error,code:" + i + "，msg:" + str);
        }

        /* renamed from: b */
        public void mo62256b() {
            C8608u.m24880a("DefaultJSCommon", "videoLocationReady");
        }
    }
}
