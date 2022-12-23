package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.adcolony.sdk.C0817e0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.x0 */
class C1005x0 {

    /* renamed from: com.adcolony.sdk.x0$a */
    class C1006a implements C0856j0 {
        C1006a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C1005x0.this.m1104f(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$b */
    class C1007b implements C0856j0 {
        C1007b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C1005x0.this.m1096a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$c */
    class C1008c implements C0856j0 {
        C1008c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11123c(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$d */
    class C1009d implements C0856j0 {
        C1009d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C1005x0.this.m1107n(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$e */
    class C1010e implements C0856j0 {
        C1010e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C1005x0.this.m1106j(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$f */
    class C1011f implements C0856j0 {
        C1011f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C1005x0.this.m1105i(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$g */
    class C1012g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f864a;

        C1012g(C1005x0 x0Var, String str) {
            this.f864a = str;
        }

        public void run() {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m319a(b, "type", "open_hook");
            C0764c0.m319a(b, "message", this.f864a);
            new C0841h0("CustomMessage.controller_send", 0, b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.x0$h */
    class C1013h implements C0856j0 {
        C1013h() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11127h(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$i */
    class C1014i implements C0856j0 {
        C1014i() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11130m(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$j */
    class C1015j implements C0856j0 {
        C1015j() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11128k(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$k */
    class C1016k implements C0856j0 {
        C1016k() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11131o(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$l */
    class C1017l implements C0856j0 {
        C1017l() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11126g(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$m */
    class C1018m implements C0856j0 {
        C1018m() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11125e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$n */
    class C1019n implements C0856j0 {
        C1019n() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11124d(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$o */
    class C1020o implements C0856j0 {
        C1020o() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11121b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$p */
    class C1021p implements C0856j0 {
        C1021p() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1005x0.this.mo11129l(h0Var);
        }
    }

    C1005x0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m1104f(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        C0781d c = C0714a.m136b().mo10827c();
        String h = C0764c0.m336h(a, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = c.mo10661f().get(h);
        AdColonyAdView adColonyAdView = c.mo10658d().get(h);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.mo10381d() == null) && (adColonyAdView == null || adColonyAdView.getListener() == null)) {
            return false;
        }
        if (adColonyAdView == null) {
            new C0841h0("AdUnit.make_in_app_purchase", adColonyInterstitial.mo10381d().mo10591k()).mo10776c();
        }
        mo11120a(h);
        m1099b(h);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m1105i(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(C0764c0.m334f(a, "clickOverride"), "url");
        String h2 = C0764c0.m336h(a, "ad_session_id");
        C0781d c = C0714a.m136b().mo10827c();
        AdColonyInterstitial adColonyInterstitial = c.mo10661f().get(h2);
        AdColonyAdView adColonyAdView = c.mo10658d().get(h2);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.mo10376b(h);
            return true;
        } else if (adColonyAdView == null) {
            return false;
        } else {
            adColonyAdView.setClickOverride(h);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m1106j(C0841h0 h0Var) {
        int i;
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "ad_session_id");
        int d = C0764c0.m332d(a, "orientation");
        C0781d c = C0714a.m136b().mo10827c();
        AdColonyAdView adColonyAdView = c.mo10658d().get(h);
        AdColonyInterstitial adColonyInterstitial = c.mo10661f().get(h);
        Context a2 = C0714a.m129a();
        if (adColonyAdView != null) {
            adColonyAdView.setOrientation(d);
        } else if (adColonyInterstitial != null) {
            adColonyInterstitial.mo10367a(d);
        }
        if (adColonyInterstitial == null && adColonyAdView == null) {
            new C0817e0.C0818a().mo10684a("Invalid ad session id sent with set orientation properties message: ").mo10684a(h).mo10685a(C0817e0.f434i);
            return false;
        } else if (!(a2 instanceof C0730b)) {
            return true;
        } else {
            C0730b bVar = (C0730b) a2;
            if (adColonyAdView == null) {
                i = adColonyInterstitial.mo10386f();
            } else {
                i = adColonyAdView.getOrientation();
            }
            bVar.mo10495a(i);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m1107n(C0841h0 h0Var) {
        AdColonyAdView adColonyAdView = C0714a.m136b().mo10827c().mo10658d().get(C0764c0.m336h(h0Var.mo10772a(), "ad_session_id"));
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setNoCloseButton(C0764c0.m325b(h0Var.mo10772a(), "use_custom_close"));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo11126g(C0841h0 h0Var) {
        C0823f1 b = C0764c0.m322b();
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "url");
        String h2 = C0764c0.m336h(a, "ad_session_id");
        AdColonyAdView adColonyAdView = C0714a.m136b().mo10827c().mo10658d().get(h2);
        if (adColonyAdView != null && !adColonyAdView.getTrustedDemandSource() && !adColonyAdView.mo10270c()) {
            return false;
        }
        if (h.startsWith("browser")) {
            h = h.replaceFirst("browser", "http");
        }
        if (h.startsWith("safari")) {
            h = h.replaceFirst("safari", "http");
        }
        m1101d(h);
        if (C1038z0.m1183a(new Intent("android.intent.action.VIEW", Uri.parse(h)))) {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            mo11122c(h2);
            mo11120a(h2);
            m1099b(h2);
            return true;
        }
        C1038z0.m1188a("Failed to launch browser.", 0);
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo11127h(C0841h0 h0Var) {
        C0823f1 b = C0764c0.m322b();
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "product_id");
        String h2 = C0764c0.m336h(a, "ad_session_id");
        if (h.equals("")) {
            h = C0764c0.m336h(a, "handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(h));
        m1101d(h);
        if (C1038z0.m1183a(intent)) {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            mo11122c(h2);
            mo11120a(h2);
            m1099b(h2);
            return true;
        }
        C1038z0.m1188a("Unable to open.", 0);
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo11128k(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        C0823f1 b = C0764c0.m322b();
        String h = C0764c0.m336h(a, "ad_session_id");
        C0819e1 a2 = C0764c0.m309a(a, "recipients");
        String str = "";
        for (int i = 0; i < a2.mo10690b(); i++) {
            if (i != 0) {
                str = str + ";";
            }
            str = str + C0764c0.m324b(a2, i);
        }
        if (C1038z0.m1183a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", C0764c0.m336h(a, "body")))) {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            mo11122c(h);
            mo11120a(h);
            m1099b(h);
            return true;
        }
        C1038z0.m1188a("Failed to create sms.", 0);
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo11129l(C0841h0 h0Var) {
        C0823f1 b = C0764c0.m322b();
        C0823f1 a = h0Var.mo10772a();
        Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
        Intent putExtra = type.putExtra("android.intent.extra.TEXT", C0764c0.m336h(a, "text") + " " + C0764c0.m336h(a, "url"));
        String h = C0764c0.m336h(a, "ad_session_id");
        if (C1038z0.m1184a(putExtra, true)) {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            mo11122c(h);
            mo11120a(h);
            m1099b(h);
            return true;
        }
        C1038z0.m1188a("Unable to create social post.", 0);
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo11130m(C0841h0 h0Var) {
        C0823f1 b = C0764c0.m322b();
        C0823f1 a = h0Var.mo10772a();
        Intent intent = new Intent("android.intent.action.DIAL");
        Intent data = intent.setData(Uri.parse("tel:" + C0764c0.m336h(a, "phone_number")));
        String h = C0764c0.m336h(a, "ad_session_id");
        if (C1038z0.m1183a(data)) {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            mo11122c(h);
            mo11120a(h);
            m1099b(h);
            return true;
        }
        C1038z0.m1188a("Failed to dial number.", 0);
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo11131o(C0841h0 h0Var) {
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        int a2 = C0764c0.m306a(h0Var.mo10772a(), "length_ms", 500);
        C0823f1 b = C0764c0.m322b();
        C0819e1 e = C1038z0.m1212e(a);
        boolean z = false;
        for (int i = 0; i < e.mo10690b(); i++) {
            if (C0764c0.m324b(e, i).equals("android.permission.VIBRATE")) {
                z = true;
            }
        }
        if (!z) {
            new C0817e0.C0818a().mo10684a("No vibrate permission detected.").mo10685a(C0817e0.f431f);
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        } else if (Build.VERSION.SDK_INT < 11 || !C1038z0.m1182a(a, (long) a2)) {
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        } else {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11119a() {
        C0714a.m135a("System.open_store", (C0856j0) new C1013h());
        C0714a.m135a("System.telephone", (C0856j0) new C1014i());
        C0714a.m135a("System.sms", (C0856j0) new C1015j());
        C0714a.m135a("System.vibrate", (C0856j0) new C1016k());
        C0714a.m135a("System.open_browser", (C0856j0) new C1017l());
        C0714a.m135a("System.mail", (C0856j0) new C1018m());
        C0714a.m135a("System.launch_app", (C0856j0) new C1019n());
        C0714a.m135a("System.create_calendar_event", (C0856j0) new C1020o());
        C0714a.m135a("System.social_post", (C0856j0) new C1021p());
        C0714a.m135a("System.make_in_app_purchase", (C0856j0) new C1006a());
        C0714a.m135a("System.close", (C0856j0) new C1007b());
        C0714a.m135a("System.expand", (C0856j0) new C1008c());
        C0714a.m135a("System.use_custom_close", (C0856j0) new C1009d());
        C0714a.m135a("System.set_orientation_properties", (C0856j0) new C1010e());
        C0714a.m135a("System.click_override", (C0856j0) new C1011f());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ed  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11121b(com.adcolony.sdk.C0841h0 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            com.adcolony.sdk.f1 r2 = com.adcolony.sdk.C0764c0.m322b()
            com.adcolony.sdk.f1 r3 = r25.mo10772a()
            java.lang.String r4 = "ad_session_id"
            java.lang.String r4 = com.adcolony.sdk.C0764c0.m336h(r3, r4)
            java.lang.String r5 = "params"
            com.adcolony.sdk.f1 r3 = com.adcolony.sdk.C0764c0.m334f(r3, r5)
            java.lang.String r5 = "recurrence"
            com.adcolony.sdk.f1 r5 = com.adcolony.sdk.C0764c0.m334f(r3, r5)
            com.adcolony.sdk.e1 r6 = com.adcolony.sdk.C0764c0.m308a()
            com.adcolony.sdk.e1 r7 = com.adcolony.sdk.C0764c0.m308a()
            com.adcolony.sdk.e1 r8 = com.adcolony.sdk.C0764c0.m308a()
            java.lang.String r9 = "description"
            java.lang.String r10 = com.adcolony.sdk.C0764c0.m336h(r3, r9)
            java.lang.String r11 = "location"
            com.adcolony.sdk.C0764c0.m336h(r3, r11)
            java.lang.String r11 = "start"
            java.lang.String r11 = com.adcolony.sdk.C0764c0.m336h(r3, r11)
            java.lang.String r12 = "end"
            java.lang.String r12 = com.adcolony.sdk.C0764c0.m336h(r3, r12)
            java.lang.String r13 = "summary"
            java.lang.String r3 = com.adcolony.sdk.C0764c0.m336h(r3, r13)
            java.lang.String r13 = ""
            if (r5 == 0) goto L_0x0078
            boolean r14 = r5.mo10729b()
            if (r14 != 0) goto L_0x0078
            java.lang.String r6 = "expires"
            java.lang.String r6 = com.adcolony.sdk.C0764c0.m336h(r5, r6)
            java.lang.String r7 = "frequency"
            java.lang.String r7 = com.adcolony.sdk.C0764c0.m336h(r5, r7)
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.toUpperCase(r8)
            java.lang.String r8 = "daysInWeek"
            com.adcolony.sdk.e1 r8 = com.adcolony.sdk.C0764c0.m309a((com.adcolony.sdk.C0823f1) r5, (java.lang.String) r8)
            java.lang.String r14 = "daysInMonth"
            com.adcolony.sdk.e1 r14 = com.adcolony.sdk.C0764c0.m309a((com.adcolony.sdk.C0823f1) r5, (java.lang.String) r14)
            java.lang.String r15 = "daysInYear"
            com.adcolony.sdk.e1 r15 = com.adcolony.sdk.C0764c0.m309a((com.adcolony.sdk.C0823f1) r5, (java.lang.String) r15)
            goto L_0x007d
        L_0x0078:
            r14 = r7
            r15 = r8
            r7 = r13
            r8 = r6
            r6 = r7
        L_0x007d:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0084
            r3 = r10
        L_0x0084:
            java.util.Date r11 = com.adcolony.sdk.C1038z0.m1217g(r11)
            java.util.Date r12 = com.adcolony.sdk.C1038z0.m1217g(r12)
            java.util.Date r6 = com.adcolony.sdk.C1038z0.m1217g(r6)
            java.lang.String r13 = "success"
            if (r11 == 0) goto L_0x0206
            if (r12 != 0) goto L_0x0098
            goto L_0x0206
        L_0x0098:
            long r0 = r11.getTime()
            r16 = r13
            long r12 = r12.getTime()
            r17 = 0
            if (r6 == 0) goto L_0x00b5
            long r19 = r6.getTime()
            long r21 = r11.getTime()
            long r19 = r19 - r21
            r21 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 / r21
            goto L_0x00b7
        L_0x00b5:
            r19 = r17
        L_0x00b7:
            java.lang.String r6 = "DAILY"
            boolean r6 = r7.equals(r6)
            r21 = 1
            if (r6 == 0) goto L_0x00cd
            r17 = 86400(0x15180, double:4.26873E-319)
            long r19 = r19 / r17
        L_0x00c6:
            long r17 = r19 + r21
        L_0x00c8:
            r19 = r12
            r11 = r17
            goto L_0x00f7
        L_0x00cd:
            java.lang.String r6 = "WEEKLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00db
            r17 = 604800(0x93a80, double:2.98811E-318)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00db:
            java.lang.String r6 = "MONTHLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00e9
            r17 = 2629800(0x2820a8, double:1.299294E-317)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00e9:
            java.lang.String r6 = "YEARLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00c8
            r17 = 31557600(0x1e187e0, double:1.5591526E-316)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00f7:
            java.lang.String r6 = "endTime"
            java.lang.String r13 = "beginTime"
            r17 = r4
            java.lang.String r4 = "title"
            r18 = r2
            java.lang.String r2 = "vnd.android.cursor.item/event"
            r21 = r6
            java.lang.String r6 = "android.intent.action.EDIT"
            if (r5 == 0) goto L_0x01aa
            boolean r5 = r5.mo10729b()
            if (r5 != 0) goto L_0x01aa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r22 = r0
            java.lang.String r0 = "FREQ="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = ";COUNT="
            r5.append(r0)
            r5.append(r11)
            java.lang.String r0 = r5.toString()
            int r1 = r8.mo10690b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0148
            java.lang.String r1 = com.adcolony.sdk.C1038z0.m1179a((com.adcolony.sdk.C0819e1) r8)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0148:
            int r1 = r14.mo10690b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0166
            java.lang.String r1 = com.adcolony.sdk.C1038z0.m1198b((com.adcolony.sdk.C0819e1) r14)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYMONTHDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0166:
            int r1 = r15.mo10690b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0184
            java.lang.String r1 = com.adcolony.sdk.C1038z0.m1198b((com.adcolony.sdk.C0819e1) r15)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYYEARDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0184:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.content.Intent r1 = r1.setType(r2)
            android.content.Intent r1 = r1.putExtra(r4, r3)
            android.content.Intent r1 = r1.putExtra(r9, r10)
            r7 = r22
            android.content.Intent r1 = r1.putExtra(r13, r7)
            r11 = r19
            r5 = r21
            android.content.Intent r1 = r1.putExtra(r5, r11)
            java.lang.String r2 = "rrule"
            android.content.Intent r0 = r1.putExtra(r2, r0)
            goto L_0x01c8
        L_0x01aa:
            r7 = r0
            r11 = r19
            r5 = r21
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            android.content.Intent r0 = r0.setType(r2)
            android.content.Intent r0 = r0.putExtra(r4, r3)
            android.content.Intent r0 = r0.putExtra(r9, r10)
            android.content.Intent r0 = r0.putExtra(r13, r7)
            android.content.Intent r0 = r0.putExtra(r5, r11)
        L_0x01c8:
            boolean r0 = com.adcolony.sdk.C1038z0.m1183a((android.content.Intent) r0)
            if (r0 == 0) goto L_0x01ed
            r0 = 1
            r2 = r16
            r1 = r18
            com.adcolony.sdk.C0764c0.m328b((com.adcolony.sdk.C0823f1) r1, (java.lang.String) r2, (boolean) r0)
            r3 = r25
            com.adcolony.sdk.h0 r1 = r3.mo10773a(r1)
            r1.mo10776c()
            r4 = r24
            r1 = r17
            r4.mo11122c((java.lang.String) r1)
            r4.mo11120a((java.lang.String) r1)
            r4.m1099b((java.lang.String) r1)
            return r0
        L_0x01ed:
            r4 = r24
            r3 = r25
            r2 = r16
            r1 = r18
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event."
            com.adcolony.sdk.C1038z0.m1188a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C0764c0.m328b((com.adcolony.sdk.C0823f1) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.h0 r1 = r3.mo10773a(r1)
            r1.mo10776c()
            return r0
        L_0x0206:
            r4 = r24
            r3 = r1
            r1 = r2
            r2 = r13
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event"
            com.adcolony.sdk.C1038z0.m1188a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C0764c0.m328b((com.adcolony.sdk.C0823f1) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.h0 r1 = r3.mo10773a(r1)
            r1.mo10776c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C1005x0.mo11121b(com.adcolony.sdk.h0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo11123c(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        Context a2 = C0714a.m129a();
        if (a2 != null && C0714a.m139d()) {
            String h = C0764c0.m336h(a, "ad_session_id");
            C0857k b = C0714a.m136b();
            AdColonyAdView adColonyAdView = b.mo10827c().mo10658d().get(h);
            if (adColonyAdView != null && ((adColonyAdView.getTrustedDemandSource() || adColonyAdView.mo10270c()) && b.mo10840k() != adColonyAdView)) {
                adColonyAdView.setExpandMessage(h0Var);
                adColonyAdView.setExpandedWidth(C0764c0.m332d(a, "width"));
                adColonyAdView.setExpandedHeight(C0764c0.m332d(a, "height"));
                adColonyAdView.setOrientation(C0764c0.m306a(a, "orientation", -1));
                adColonyAdView.setNoCloseButton(C0764c0.m325b(a, "use_custom_close"));
                b.mo10817a(adColonyAdView);
                b.mo10822a(adColonyAdView.getContainer());
                Intent intent = new Intent(a2, AdColonyAdViewActivity.class);
                m1099b(h);
                mo11120a(h);
                C1038z0.m1183a(intent);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo11124d(C0841h0 h0Var) {
        C0823f1 b = C0764c0.m322b();
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "ad_session_id");
        if (C0764c0.m325b(a, CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
            return mo11127h(h0Var);
        }
        Context a2 = C0714a.m129a();
        if (a2 == null) {
            return false;
        }
        if (C1038z0.m1183a(a2.getPackageManager().getLaunchIntentForPackage(C0764c0.m336h(a, "handle")))) {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            mo11122c(h);
            mo11120a(h);
            m1099b(h);
            return true;
        }
        C1038z0.m1188a("Failed to launch external application.", 0);
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo11125e(C0841h0 h0Var) {
        C0823f1 b = C0764c0.m322b();
        C0823f1 a = h0Var.mo10772a();
        C0819e1 a2 = C0764c0.m309a(a, "recipients");
        boolean b2 = C0764c0.m325b(a, TJAdUnitConstants.String.HTML);
        String h = C0764c0.m336h(a, "subject");
        String h2 = C0764c0.m336h(a, "body");
        String h3 = C0764c0.m336h(a, "ad_session_id");
        String[] strArr = new String[a2.mo10690b()];
        for (int i = 0; i < a2.mo10690b(); i++) {
            strArr[i] = C0764c0.m324b(a2, i);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!b2) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", h).putExtra("android.intent.extra.TEXT", h2).putExtra("android.intent.extra.EMAIL", strArr);
        if (C1038z0.m1183a(intent)) {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            mo11122c(h3);
            mo11120a(h3);
            m1099b(h3);
            return true;
        }
        C1038z0.m1188a("Failed to send email.", 0);
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11122c(String str) {
        C0781d c = C0714a.m136b().mo10827c();
        AdColonyInterstitial adColonyInterstitial = c.mo10661f().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            AdColonyAdView adColonyAdView = c.mo10658d().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null) {
                listener.onLeftApplication(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
    }

    /* renamed from: d */
    private void m1101d(String str) {
        if (!C1038z0.m1186a((Runnable) new C1012g(this, str))) {
            new C0817e0.C0818a().mo10684a("Executing ADCSystem.sendOpenCustomMessage failed").mo10685a(C0817e0.f434i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m1096a(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "ad_session_id");
        Activity activity = C0714a.m129a() instanceof Activity ? (Activity) C0714a.m129a() : null;
        boolean z = activity instanceof AdColonyAdViewActivity;
        if (!(activity instanceof C0730b)) {
            return false;
        }
        if (z) {
            ((AdColonyAdViewActivity) activity).mo10297b();
            return true;
        }
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "id", h);
        new C0841h0("AdSession.on_request_close", ((C0730b) activity).f253c, b).mo10776c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11120a(String str) {
        C0781d c = C0714a.m136b().mo10827c();
        AdColonyInterstitial adColonyInterstitial = c.mo10661f().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null || !adColonyInterstitial.mo10391h()) {
            AdColonyAdView adColonyAdView = c.mo10658d().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null && adColonyAdView.mo10270c()) {
                listener.onClicked(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
    }

    /* renamed from: b */
    private boolean m1099b(String str) {
        if (C0714a.m136b().mo10827c().mo10658d().get(str) == null) {
            return false;
        }
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "ad_session_id", str);
        new C0841h0("MRAID.on_event", 1, b).mo10776c();
        return true;
    }
}
