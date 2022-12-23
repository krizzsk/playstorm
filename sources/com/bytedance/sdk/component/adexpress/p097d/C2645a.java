package com.bytedance.sdk.component.adexpress.p097d;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2598a;
import com.bytedance.sdk.component.adexpress.C2618b;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2616b;
import com.bytedance.sdk.component.adexpress.p095b.C2623d;
import com.bytedance.sdk.component.adexpress.p095b.C2626f;
import com.bytedance.sdk.component.adexpress.p095b.C2627g;
import com.bytedance.sdk.component.adexpress.p095b.C2631j;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.adexpress.p095b.C2635m;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.theme.C2746a;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.C2959b;
import com.bytedance.sdk.component.utils.C2971k;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.d.a */
/* compiled from: BaseWebViewRender */
public abstract class C2645a implements C2598a, C2623d<SSWebView>, C2631j, C2746a {

    /* renamed from: a */
    protected SSWebView f5703a;

    /* renamed from: b */
    protected int f5704b = 8;

    /* renamed from: c */
    protected C2616b f5705c;

    /* renamed from: d */
    protected AtomicBoolean f5706d = new AtomicBoolean(false);

    /* renamed from: e */
    private Context f5707e;

    /* renamed from: f */
    private String f5708f;

    /* renamed from: g */
    private JSONObject f5709g;

    /* renamed from: h */
    private String f5710h;

    /* renamed from: i */
    private C2626f f5711i;

    /* renamed from: j */
    private boolean f5712j = false;

    /* renamed from: k */
    private boolean f5713k;

    /* renamed from: l */
    private C2627g f5714l;

    /* renamed from: m */
    private C2633l f5715m;

    /* renamed from: n */
    private boolean f5716n;

    /* renamed from: o */
    private int f5717o;

    /* renamed from: a */
    public abstract void mo16814a(int i);

    /* renamed from: c */
    public int mo16710c() {
        return 0;
    }

    /* renamed from: g */
    public abstract void mo16821g();

    /* renamed from: h */
    public void mo16822h() {
    }

    /* renamed from: i */
    public void mo16823i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo16825k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo16826l() {
    }

    public C2645a(Context context, C2633l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f5707e = context;
        this.f5715m = lVar;
        this.f5708f = lVar.mo16750b();
        this.f5709g = lVar.mo16749a();
        themeStatusBroadcastReceiver.mo17315a(this);
        SSWebView b = C2650e.m6932a().mo16861b();
        this.f5703a = b;
        if (b == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (C2640c.m6890a() != null) {
                this.f5703a = new SSWebView(C2640c.m6890a());
                return;
            }
            return;
        }
        this.f5712j = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    /* renamed from: a */
    public void mo16816a(String str) {
        this.f5710h = str;
    }

    /* renamed from: a */
    public SSWebView mo16813a() {
        return this.f5703a;
    }

    /* renamed from: a */
    public void mo16815a(C2627g gVar) {
        this.f5714l = gVar;
    }

    /* renamed from: a */
    public void mo16719a(C2626f fVar) {
        this.f5711i = fVar;
        if (mo16813a() == null || mo16813a().getWebView() == null) {
            this.f5711i.mo16716a(102);
        } else if (!C2603a.m6648f()) {
            this.f5711i.mo16716a(102);
        } else if (TextUtils.isEmpty(this.f5710h)) {
            this.f5711i.mo16716a(102);
        } else if (this.f5705c != null || C2603a.m6641a(this.f5709g)) {
            this.f5715m.mo16751c().mo16726a(this.f5712j);
            if (this.f5712j) {
                try {
                    this.f5703a.mo17953m();
                    this.f5715m.mo16751c().mo16727b();
                    C2971k.m8372a(this.f5703a.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                } catch (Exception unused) {
                    C2975l.m8384b("WebViewRender", "reuse webview load fail ");
                    C2650e.m6932a().mo16864c(this.f5703a);
                    this.f5711i.mo16716a(102);
                }
            } else {
                SSWebView a = mo16813a();
                a.mo17953m();
                this.f5715m.mo16751c().mo16727b();
                a.mo17925a(this.f5710h);
            }
        } else {
            this.f5711i.mo16716a(103);
        }
    }

    /* renamed from: b */
    public SSWebView mo16720e() {
        return mo16813a();
    }

    /* renamed from: d */
    public void mo16819d() {
        if (!this.f5706d.get()) {
            this.f5706d.set(true);
            mo16821g();
            if (this.f5703a.getParent() != null) {
                ((ViewGroup) this.f5703a.getParent()).removeView(this.f5703a);
            }
            if (this.f5713k) {
                C2650e.m6932a().mo16859a(this.f5703a);
            } else {
                C2650e.m6932a().mo16864c(this.f5703a);
            }
        }
    }

    /* renamed from: f */
    public void mo16820f() {
        if (mo16813a() != null) {
            try {
                mo16813a().getWebView().resumeTimers();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo16817a(boolean z) {
        this.f5716n = z;
    }

    /* renamed from: a */
    public void mo16748a(final C2635m mVar) {
        if (mVar == null) {
            this.f5711i.mo16716a(105);
            return;
        }
        boolean a = mVar.mo16786a();
        final float b = (float) mVar.mo16787b();
        final float c = (float) mVar.mo16792c();
        if (b <= 0.0f || c <= 0.0f) {
            this.f5711i.mo16716a(105);
            return;
        }
        this.f5713k = a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m6905a(mVar, b, c);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C2645a.this.m6905a(mVar, b, c);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6905a(C2635m mVar, float f, float f2) {
        if (!this.f5713k || this.f5716n) {
            C2650e.m6932a().mo16864c(this.f5703a);
            m6907c(mVar.mo16803h());
            return;
        }
        m6904a(f, f2);
        mo16814a(this.f5704b);
        C2626f fVar = this.f5711i;
        if (fVar != null) {
            fVar.mo16717a(mo16813a(), mVar);
        }
    }

    /* renamed from: a */
    public void mo16747a(View view, int i, C2618b bVar) {
        C2627g gVar = this.f5714l;
        if (gVar != null) {
            gVar.mo16722a(view, i, bVar);
        }
    }

    /* renamed from: a */
    private void m6904a(float f, float f2) {
        this.f5715m.mo16751c().mo16729c();
        int a = (int) C2642b.m6894a(this.f5707e, f);
        int a2 = (int) C2642b.m6894a(this.f5707e, f2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mo16813a().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(a, a2);
        }
        layoutParams.width = a;
        layoutParams.height = a2;
        mo16813a().setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private void m6907c(int i) {
        C2626f fVar = this.f5711i;
        if (fVar != null) {
            fVar.mo16716a(i);
        }
    }

    /* renamed from: j */
    public void mo16824j() {
        mo16825k();
        Activity a = C2959b.m8338a(this.f5703a);
        if (a != null) {
            this.f5717o = a.hashCode();
        }
    }

    /* renamed from: a */
    public void mo16622a(Activity activity) {
        if (this.f5717o != 0 && activity != null && activity.hashCode() == this.f5717o) {
            C2975l.m8384b("WebViewRender", "release from activity onDestroy");
            mo16819d();
            mo16826l();
        }
    }
}
