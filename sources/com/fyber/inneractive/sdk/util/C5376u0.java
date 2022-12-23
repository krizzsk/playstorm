package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.util.u0 */
public class C5376u0 {

    /* renamed from: a */
    public volatile String f14251a = null;

    /* renamed from: b */
    public Context f14252b = null;

    /* renamed from: c */
    public AtomicBoolean f14253c = new AtomicBoolean(false);

    /* renamed from: d */
    public final Runnable f14254d = new C5377a();

    /* renamed from: com.fyber.inneractive.sdk.util.u0$a */
    public class C5377a implements Runnable {
        public C5377a() {
        }

        public void run() {
            C5376u0.this.mo26474e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$b */
    public class C5378b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f14256a;

        public C5378b(String str) {
            this.f14256a = str;
        }

        public void run() {
            C5376u0.this.f14252b.getSharedPreferences("fyber.ua", 0).edit().putString("ua", this.f14256a).apply();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$c */
    public class C5379c implements Runnable {
        public C5379c() {
        }

        public void run() {
            C5376u0 u0Var = C5376u0.this;
            Context context = u0Var.f14252b;
            if (context != null) {
                String str = null;
                try {
                    str = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(str)) {
                    u0Var.mo26470a(str);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$d */
    public class C5380d implements Runnable {
        public C5380d() {
        }

        public void run() {
            C5376u0.this.mo26471b();
        }
    }

    /* renamed from: a */
    public String mo26469a() {
        if (!TextUtils.isEmpty(this.f14251a)) {
            return this.f14251a;
        }
        Runnable runnable = this.f14254d;
        if (runnable != null) {
            Handler handler = C5357n.f14225b;
            handler.removeCallbacks(runnable);
            handler.postDelayed(this.f14254d, 50);
        }
        return System.getProperty("http.agent");
    }

    /* renamed from: b */
    public final void mo26471b() {
        WebView webView;
        String str = null;
        try {
            webView = new WebView(this.f14252b);
            try {
                str = webView.getSettings().getUserAgentString();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            webView = null;
        }
        if (!TextUtils.isEmpty(str)) {
            mo26470a(str);
        }
        if (webView != null) {
            webView.destroy();
        }
    }

    /* renamed from: c */
    public final void mo26472c() {
        if (this.f14252b != null && TextUtils.isEmpty(this.f14251a)) {
            this.f14251a = this.f14252b.getSharedPreferences("fyber.ua", 0).getString("ua", (String) null);
            if (!TextUtils.isEmpty(this.f14251a)) {
                IAlog.m16699a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
                this.f14253c.compareAndSet(false, true);
            }
            mo26474e();
        }
    }

    /* renamed from: d */
    public void mo26473d() {
        Context context;
        mo26472c();
        if (!this.f14253c.get() && Build.VERSION.SDK_INT >= 17 && (context = this.f14252b) != null) {
            String str = null;
            try {
                str = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                mo26470a(str);
            }
        }
    }

    /* renamed from: e */
    public final void mo26474e() {
        if (Build.VERSION.SDK_INT >= 17) {
            C5357n.m16773a(new C5379c());
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            mo26471b();
        } else {
            C5357n.f14225b.post(new C5380d());
        }
    }

    /* renamed from: a */
    public final void mo26470a(String str) {
        this.f14251a = str;
        if (!TextUtils.isEmpty(this.f14251a)) {
            IAlog.m16699a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
            this.f14253c.compareAndSet(false, true);
        }
        C5357n.m16773a(new C5378b(str));
    }
}
