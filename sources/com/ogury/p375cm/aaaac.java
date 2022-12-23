package com.ogury.p375cm;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.ogury.core.OguryError;
import com.ogury.p375cm.ConsentActivity;
import com.ogury.p375cm.internal.aabca;
import com.ogury.p375cm.internal.ababa;
import com.ogury.p375cm.internal.ababb;
import com.ogury.p375cm.internal.abbba;
import com.ogury.p375cm.internal.abbbb;
import com.ogury.p375cm.internal.abbbc;
import com.ogury.p375cm.internal.accba;
import com.ogury.p375cm.internal.baaba;
import com.ogury.p375cm.internal.babca;
import com.ogury.p375cm.internal.bbabc;
import com.ogury.p375cm.internal.bbacb;
import com.ogury.p375cm.internal.bbcbc;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.cm.aaaac */
public final class aaaac {

    /* renamed from: a */
    public static final aaaac f25543a = new aaaac();

    /* renamed from: b */
    private static abbbb f25544b;

    /* renamed from: c */
    private static aaaaa f25545c;

    /* renamed from: d */
    private static WebView f25546d;

    /* renamed from: e */
    private static final Handler f25547e = new Handler(Looper.getMainLooper());

    /* renamed from: com.ogury.cm.aaaac$aaaaa */
    public static final class aaaaa implements abbbb {

        /* renamed from: a */
        final /* synthetic */ bbacb.aaaaa f25548a;

        /* renamed from: b */
        final /* synthetic */ bbacb.aaaaa f25549b;

        /* renamed from: c */
        final /* synthetic */ Context f25550c;

        aaaaa(bbacb.aaaaa aaaaa, bbacb.aaaaa aaaaa2, Context context) {
            this.f25548a = aaaaa;
            this.f25549b = aaaaa2;
            this.f25550c = context;
        }

        /* renamed from: a */
        public final void mo66485a(OguryError oguryError) {
            bbabc.m30943b(oguryError, "error");
            aaaac aaaac = aaaac.f25543a;
            aaaac.m30544d().removeCallbacksAndMessages((Object) null);
            aaaac aaaac2 = aaaac.f25543a;
            abbbb a = aaaac.m30532a();
            if (a != null) {
                a.mo66485a(oguryError);
            }
        }

        /* renamed from: a */
        public final void mo66486a(String str) {
            bbabc.m30943b(str, "response");
            if (bbabc.m30942a((Object) str, (Object) "ready")) {
                this.f25548a.f25923a = true;
                aaaac aaaac = aaaac.f25543a;
                boolean z = this.f25549b.f25923a;
                aaaac aaaac2 = aaaac.f25543a;
                aaaac.m30541a(z, aaaac.m30532a(), 15000);
            } else if (bbabc.m30942a((Object) str, (Object) "success")) {
                this.f25549b.f25923a = true;
                aaaac.m30536a(aaaac.f25543a, this.f25550c);
                aaaac aaaac3 = aaaac.f25543a;
                aaaac.m30544d().removeCallbacksAndMessages((Object) null);
            } else if (bbcbc.m30981a(str, "parsedConfig=", false, 2, (Object) null)) {
                aaaac.m30537a(aaaac.f25543a, this.f25550c, str);
                aabca aabca = aabca.f25663a;
                aabca.m30654a("ANSWERED");
            }
        }
    }

    /* renamed from: com.ogury.cm.aaaac$aaaab */
    public static final class aaaab implements ababa {

        /* renamed from: a */
        final /* synthetic */ Context f25551a;

        /* renamed from: b */
        final /* synthetic */ String f25552b;

        /* renamed from: com.ogury.cm.aaaac$aaaab$aaaaa */
        static final class aaaaa implements Runnable {

            /* renamed from: a */
            final /* synthetic */ aaaab f25553a;

            /* renamed from: b */
            final /* synthetic */ String f25554b;

            aaaaa(aaaab aaaab, String str) {
                this.f25553a = aaaab;
                this.f25554b = str;
            }

            public final void run() {
                abbba abbba = abbba.f25716a;
                abbba.m30727e(this.f25554b);
                abbba abbba2 = abbba.f25716a;
                abbba.m30724d().mo66625a(this.f25553a.f25551a);
                abbba abbba3 = abbba.f25716a;
                accba.m30853a(abbba.m30726e(), this.f25553a.f25551a, (String) null, 2, (Object) null);
                aabca aabca = aabca.f25663a;
                aabca.m30652a();
                aaaac aaaac = aaaac.f25543a;
                abbbb a = aaaac.m30532a();
                if (a != null) {
                    a.mo66486a(this.f25553a.f25552b);
                }
            }
        }

        aaaab(Context context, String str) {
            this.f25551a = context;
            this.f25552b = str;
        }

        /* renamed from: a */
        public final void mo66487a(String str) {
            bbabc.m30943b(str, "aaid");
            new Handler(Looper.getMainLooper()).post(new aaaaa(this, str));
        }
    }

    /* renamed from: com.ogury.cm.aaaac$aaaac  reason: collision with other inner class name */
    static final class C12474aaaac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f25555a;

        /* renamed from: b */
        final /* synthetic */ abbbb f25556b;

        C12474aaaac(boolean z, abbbb abbbb) {
            this.f25555a = z;
            this.f25556b = abbbb;
        }

        public final void run() {
            if (!this.f25555a) {
                aaaac.m30540a(this.f25556b, new OguryError(1002, "Timeout error"));
            }
        }
    }

    private aaaac() {
    }

    /* renamed from: a */
    public static abbbb m30532a() {
        return f25544b;
    }

    /* renamed from: a */
    public static void m30533a(Context context, abbbb abbbb) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(abbbb, "callback");
        baaba.f25874a.queryProductDetails();
        f25544b = abbbb;
        bbacb.aaaaa aaaaa2 = new bbacb.aaaaa();
        aaaaa2.f25923a = false;
        bbacb.aaaaa aaaaa3 = new bbacb.aaaaa();
        aaaaa3.f25923a = false;
        try {
            WebView webView = new WebView(context.getApplicationContext(), (AttributeSet) null);
            f25546d = webView;
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
            WebView webView2 = f25546d;
            if (webView2 != null) {
                webView2.setBackgroundColor(0);
            }
            WebView webView3 = f25546d;
            if (webView3 != null) {
                webView3.setLayerType(1, (Paint) null);
            }
            aaaaa aaaaa4 = new aaaaa(context, new aaaaa(aaaaa2, aaaaa3, context));
            f25545c = aaaaa4;
            WebView webView4 = f25546d;
            if (webView4 != null) {
                webView4.setWebViewClient(aaaaa4);
            }
            m30541a(aaaaa2.f25923a, abbbb, (long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US);
            WebView webView5 = f25546d;
            if (webView5 != null) {
                StringBuilder sb = new StringBuilder("https://consent-form.ogury.co");
                abbba abbba = abbba.f25716a;
                sb.append(abbba.m30730g().mo66567c());
                sb.append("?assetType=android");
                webView5.loadUrl(sb.toString());
            }
        } catch (Exception unused) {
            abbbc abbbc = abbbc.f25732a;
            abbbc.m30748b("Cannot create WebView");
            m30540a(f25544b, new OguryError(4, "Cannot create WebView"));
        }
    }

    /* renamed from: a */
    public static void m30534a(WebView webView) {
        f25546d = null;
    }

    /* renamed from: a */
    public static void m30535a(aaaaa aaaaa2) {
        f25545c = null;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30536a(aaaac aaaac, Context context) {
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            boolean z = false;
            if (runningAppProcesses != null) {
                String packageName = context.getPackageName();
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.importance == 100 && bbabc.m30942a((Object) next.processName, (Object) packageName)) {
                        break;
                    }
                }
            }
            if (!z) {
                ConsentActivity.aaaaa aaaaa2 = ConsentActivity.f25527a;
                bbabc.m30943b(context, "context");
                context.startActivity(new Intent(context, ConsentActivity.class));
                return;
            }
            m30540a(f25544b, new OguryError(4, "App in background"));
            return;
        }
        throw new babca("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30537a(aaaac aaaac, Context context, String str) {
        if (str != null) {
            String substring = str.substring(13);
            bbabc.m30940a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            ababb ababb = ababb.f25701a;
            ababb.m30698a(context, new aaaab(context, substring));
            return;
        }
        throw new babca("null cannot be cast to non-null type java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m30540a(abbbb abbbb, OguryError oguryError) {
        f25546d = null;
        f25545c = null;
        if (abbbb != null) {
            abbbb.mo66485a(oguryError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m30541a(boolean z, abbbb abbbb, long j) {
        f25547e.postDelayed(new C12474aaaac(z, abbbb), j);
    }

    /* renamed from: b */
    public static aaaaa m30542b() {
        return f25545c;
    }

    /* renamed from: c */
    public static WebView m30543c() {
        return f25546d;
    }

    /* renamed from: d */
    public static Handler m30544d() {
        return f25547e;
    }
}
