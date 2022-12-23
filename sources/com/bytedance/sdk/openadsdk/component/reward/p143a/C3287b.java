package com.bytedance.sdk.openadsdk.component.reward.p143a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3432e;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3748c;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3749d;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.b */
/* compiled from: RewardFullPlayableManager */
public class C3287b {

    /* renamed from: a */
    protected final AtomicBoolean f7792a = new AtomicBoolean(false);

    /* renamed from: b */
    protected final AtomicBoolean f7793b = new AtomicBoolean(false);

    /* renamed from: c */
    boolean f7794c = false;

    /* renamed from: d */
    boolean f7795d = false;

    /* renamed from: e */
    long f7796e = 0;

    /* renamed from: f */
    int f7797f = 0;

    /* renamed from: g */
    int f7798g = 0;

    /* renamed from: h */
    int f7799h = 0;

    /* renamed from: i */
    private Activity f7800i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3498n f7801j;

    /* renamed from: k */
    private C3300f f7802k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f7803l;

    /* renamed from: m */
    private int f7804m = 1;

    /* renamed from: n */
    private PlayableLoadingView f7805n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f7806o = true;

    /* renamed from: p */
    private HomeWatcherReceiver f7807p;

    /* renamed from: q */
    private boolean f7808q = false;

    public C3287b(Activity activity) {
        this.f7800i = activity;
    }

    /* renamed from: a */
    public void mo19003a(C3300f fVar, C3498n nVar, String str, int i) {
        if (!this.f7808q) {
            this.f7808q = true;
            this.f7802k = fVar;
            this.f7801j = nVar;
            this.f7803l = str;
            this.f7804m = i;
            m9623l();
        }
    }

    /* renamed from: l */
    private void m9623l() {
        Activity activity = this.f7800i;
        this.f7805n = (PlayableLoadingView) activity.findViewById(C2984t.m8432e(activity, "tt_reward_playable_loading"));
    }

    /* renamed from: a */
    public boolean mo19008a() {
        if (this.f7805n == null) {
            return false;
        }
        C3498n nVar = this.f7801j;
        if (nVar == null || !nVar.mo19653aG() || !C3501p.m10769i(this.f7801j)) {
            this.f7805n.mo20475a();
            return false;
        }
        this.f7805n.mo20476b();
        return true;
    }

    /* renamed from: b */
    public void mo19010b() {
        if (!this.f7792a.getAndSet(true) && this.f7802k.mo19113c() != null && this.f7802k.mo19115d() != null) {
            C4020v.m13282a((View) this.f7802k.mo19113c(), 0);
            C4020v.m13282a((View) this.f7802k.mo19115d(), 8);
        }
    }

    /* renamed from: a */
    public void mo19002a(DownloadListener downloadListener) {
        if (this.f7802k.mo19115d() != null) {
            String m = m9624m();
            if (!TextUtils.isEmpty(m)) {
                this.f7802k.mo19115d().setWebViewClient(new C3749d(this.f7800i, this.f7802k.mo19118f(), this.f7801j.mo19622Y(), (C3171n) null, false) {
                    public void onPageFinished(WebView webView, String str) {
                        if (C3287b.this.f7806o) {
                            C3156e.m9199c(this.f9742d, C3287b.this.f7801j, C3287b.this.f7803l, "loading_h5_success", (JSONObject) null);
                        }
                        super.onPageFinished(webView, str);
                    }

                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        boolean unused = C3287b.this.f7806o = false;
                    }

                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        boolean unused = C3287b.this.f7806o = false;
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = C3287b.this.f7806o = false;
                    }
                });
                this.f7802k.mo19115d().mo17925a(m);
                this.f7802k.mo19115d().setDisplayZoomControls(false);
                this.f7802k.mo19115d().setWebChromeClient(new C3748c(this.f7802k.mo19118f(), this.f7802k.mo19119g()));
                this.f7802k.mo19115d().setDownloadListener(downloadListener);
            }
        }
    }

    /* renamed from: m */
    private String m9624m() {
        C3498n nVar;
        String l = C3578m.m11241h().mo19957l();
        C2975l.m8387c("Playable", "getPlayableLoadH5Url->loadH5Url=" + l);
        if (TextUtils.isEmpty(l) || (nVar = this.f7801j) == null || nVar.mo19657aa() == null) {
            return l;
        }
        String b = this.f7801j.mo19657aa().mo19495b();
        double d = this.f7801j.mo19657aa().mo19500d();
        int e = this.f7801j.mo19657aa().mo19501e();
        String a = (this.f7801j.mo19610M() == null || TextUtils.isEmpty(this.f7801j.mo19610M().mo19559a())) ? "" : this.f7801j.mo19610M().mo19559a();
        String Y = this.f7801j.mo19622Y();
        String c = this.f7801j.mo19657aa().mo19498c();
        String a2 = this.f7801j.mo19657aa().mo19491a();
        String b2 = this.f7801j.mo19657aa().mo19495b();
        String U = this.f7801j.mo19618U();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appname=");
        stringBuffer.append(URLEncoder.encode(b));
        stringBuffer.append("&stars=");
        stringBuffer.append(d);
        stringBuffer.append("&comments=");
        stringBuffer.append(e);
        stringBuffer.append("&icon=");
        stringBuffer.append(URLEncoder.encode(a));
        stringBuffer.append("&downloading=");
        stringBuffer.append(true);
        stringBuffer.append("&id=");
        stringBuffer.append(URLEncoder.encode(Y));
        stringBuffer.append("&packageName=");
        stringBuffer.append(URLEncoder.encode(c));
        stringBuffer.append("&downloadUrl=");
        stringBuffer.append(URLEncoder.encode(a2));
        stringBuffer.append("&name=");
        stringBuffer.append(URLEncoder.encode(b2));
        stringBuffer.append("&orientation=");
        stringBuffer.append(this.f7804m == 1 ? "portrait" : "landscape");
        stringBuffer.append("&apptitle=");
        stringBuffer.append(URLEncoder.encode(U));
        String str = l + "?" + stringBuffer.toString();
        C2975l.m8387c("Playable", "Playable-loadH5Url=" + str);
        return str;
    }

    /* renamed from: c */
    public void mo19012c() {
        this.f7794c = true;
    }

    /* renamed from: d */
    public boolean mo19015d() {
        return this.f7794c;
    }

    /* renamed from: a */
    public void mo19007a(boolean z) {
        if (Build.VERSION.SDK_INT >= 19 && z) {
            this.f7802k.mo19113c().setDomStorageEnabled(true);
        }
    }

    /* renamed from: b */
    public void mo19011b(boolean z) {
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.f7802k.mo19128p()) && this.f7802k.mo19126n() != 0) {
                    C3815b.m12552a().mo20661a(this.f7802k.mo19128p(), this.f7802k.mo19126n(), this.f7802k.mo19127o());
                }
            } catch (Throwable unused) {
            }
        }
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.f7802k.mo19128p())) {
                    C3815b.m12552a().mo20666b(this.f7802k.mo19128p());
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: e */
    public void mo19016e() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.f7807p = homeWatcherReceiver;
            homeWatcherReceiver.mo17883a(new HomeWatcherReceiver.C2957a() {
                /* renamed from: a */
                public void mo17885a() {
                    C3287b.this.f7795d = true;
                }

                /* renamed from: b */
                public void mo17886b() {
                    C3287b.this.f7795d = true;
                }
            });
            this.f7800i.getApplicationContext().registerReceiver(this.f7807p, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo19001a(Context context) {
        try {
            this.f7807p.mo17883a((HomeWatcherReceiver.C2957a) null);
            context.getApplicationContext().unregisterReceiver(this.f7807p);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo19005a(String str) {
        if (this.f7795d) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.f7796e));
            C3156e.m9198c((Context) this.f7800i, this.f7801j, this.f7803l, str, (Map<String, Object>) hashMap);
            if ("return_foreground".equals(str)) {
                this.f7795d = false;
            }
        }
    }

    /* renamed from: f */
    public void mo19017f() {
        this.f7796e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo19006a(Map<String, Object> map) {
        if (map != null) {
            map.put("duration", Long.valueOf(System.currentTimeMillis() - this.f7796e));
        }
    }

    /* renamed from: a */
    public void mo18999a(int i) {
        PlayableLoadingView playableLoadingView = this.f7805n;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i);
        }
    }

    /* renamed from: a */
    public void mo19004a(C3432e eVar) {
        PlayableLoadingView playableLoadingView = this.f7805n;
        if (playableLoadingView != null && playableLoadingView.getPlayView() != null && C3501p.m10769i(this.f7801j)) {
            this.f7805n.getPlayView().setOnClickListener(eVar);
            this.f7805n.getPlayView().setOnTouchListener(eVar);
        }
    }

    /* renamed from: g */
    public void mo19018g() {
        PlayableLoadingView playableLoadingView = this.f7805n;
        if (playableLoadingView != null) {
            playableLoadingView.mo20475a();
        }
    }

    /* renamed from: h */
    public void mo19019h() {
        this.f7793b.set(true);
    }

    /* renamed from: i */
    public boolean mo19020i() {
        return this.f7793b.get();
    }

    /* renamed from: b */
    public int mo19009b(int i) {
        return this.f7799h - (this.f7798g - i);
    }

    /* renamed from: j */
    public int mo19021j() {
        return this.f7798g;
    }

    /* renamed from: k */
    public int mo19022k() {
        return this.f7797f;
    }

    /* renamed from: a */
    public void mo19000a(int i, C3498n nVar, boolean z) {
        if (nVar != null) {
            this.f7798g = nVar.mo19676at();
            this.f7799h = C3578m.m11241h().mo19924a(String.valueOf(i), z);
        }
    }

    /* renamed from: c */
    public void mo19013c(int i) {
        this.f7797f = i - 1;
    }

    /* renamed from: d */
    public void mo19014d(int i) {
        this.f7797f = i;
    }
}
