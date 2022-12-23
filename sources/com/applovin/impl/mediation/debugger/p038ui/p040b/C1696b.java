package com.applovin.impl.mediation.debugger.p038ui.p040b;

import android.app.Activity;
import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1655a;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1656b;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1657c;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1658d;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.mediation.debugger.p038ui.p040b.p041a.C1694a;
import com.applovin.impl.mediation.debugger.p038ui.p040b.p041a.C1695b;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1711d;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1714e;
import com.applovin.impl.sdk.C1873e;
import com.applovin.impl.sdk.C1944j;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2038f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2392R;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.b */
public class C1696b extends C1711d implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private C1959m f2478a;

    /* renamed from: b */
    private List<C1655a> f2479b;

    /* renamed from: d */
    private String f2480d;

    /* renamed from: e */
    private String f2481e;

    /* renamed from: f */
    private String f2482f;

    /* renamed from: g */
    private final StringBuilder f2483g = new StringBuilder("");

    /* renamed from: h */
    private final AtomicBoolean f2484h = new AtomicBoolean();

    /* renamed from: i */
    private boolean f2485i = false;

    /* renamed from: j */
    private List<C1661b> f2486j = new ArrayList();

    /* renamed from: k */
    private List<C1661b> f2487k = new ArrayList();

    /* renamed from: l */
    private List<C1661b> f2488l = new ArrayList();

    /* renamed from: m */
    private List<C1658d> f2489m = new ArrayList();

    /* renamed from: n */
    private List<C1658d> f2490n = new ArrayList();

    /* renamed from: o */
    private List<C1707c> f2491o = new ArrayList();

    /* renamed from: p */
    private List<C1707c> f2492p = new ArrayList();

    /* renamed from: q */
    private List<C1707c> f2493q = new ArrayList();

    /* renamed from: r */
    private List<C1707c> f2494r = new ArrayList();

    /* renamed from: s */
    private List<C1707c> f2495s = new ArrayList();

    /* renamed from: t */
    private List<C1707c> f2496t = new ArrayList();

    /* renamed from: u */
    private List<C1707c> f2497u = new ArrayList();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$a */
    public enum C1698a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        COUNT
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b */
    public enum C1699b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public C1696b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private C1707c m3488a(String str, String str2) {
        C1707c.C1709a a = C1707c.m3545p().mo13541a(str);
        if (StringUtils.isValidString(str2)) {
            a.mo13546b(str2);
        } else {
            a.mo13538a(C2392R.C2393drawable.applovin_ic_x_mark);
            a.mo13548c(C2038f.m4879a(C2392R.color.applovin_sdk_xmarkColor, this.f2575c));
        }
        return a.mo13543a();
    }

    /* renamed from: a */
    private void m3489a(C1707c.C1709a aVar, String str) {
        aVar.mo13549c("MAX Ad Review").mo13550d(str).mo13538a(C2392R.C2393drawable.applovin_ic_x_mark).mo13548c(C2038f.m4879a(C2392R.color.applovin_sdk_xmarkColor, this.f2575c)).mo13542a(true);
    }

    /* renamed from: a */
    private void m3490a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (sb2.length() + str.length() >= ((Integer) this.f2478a.mo14311a(C1857b.f3108al)).intValue()) {
            C2092v.m5050f("MediationDebuggerListAdapter", sb2);
            this.f2483g.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    /* renamed from: a */
    private void m3491a(List<C1661b> list) {
        List<C1661b> list2;
        for (C1661b next : list) {
            if (!next.mo13435g()) {
                if (next.mo13428a() == C1661b.C1662a.INCOMPLETE_INTEGRATION || next.mo13428a() == C1661b.C1662a.INVALID_INTEGRATION) {
                    list2 = this.f2486j;
                } else if (next.mo13428a() == C1661b.C1662a.COMPLETE) {
                    list2 = this.f2487k;
                } else if (next.mo13428a() == C1661b.C1662a.MISSING) {
                    list2 = this.f2488l;
                }
                list2.add(next);
            }
        }
    }

    /* renamed from: b */
    private void m3492b(List<C1655a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1655a e : list) {
            C1657c e2 = e.mo13404e();
            for (C1656b a : e2.mo13411a()) {
                hashSet.add(a.mo13406a());
            }
            for (C1656b a2 : e2.mo13412b()) {
                hashSet2.add(a2.mo13406a());
            }
        }
        this.f2489m = new ArrayList(hashSet);
        this.f2490n = new ArrayList(hashSet2);
        Collections.sort(this.f2489m);
        Collections.sort(this.f2490n);
    }

    /* renamed from: c */
    private List<C1707c> m3493c(List<C1661b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C1661b aVar : list) {
            arrayList.add(new C1694a(aVar, this.f2575c));
        }
        return arrayList;
    }

    /* renamed from: l */
    private void m3494l() {
        Map<String, String> metaData;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + Utils.isPubInDebugMode(this.f2575c, this.f2478a));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.f2478a.mo14295J().mo13583a() ? TJAdUnitConstants.String.ENABLED : "disabled");
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.f2478a.mo14306V().mo14606h().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f2478a.mo14311a(C1857b.f3279dz);
        String a = C1873e.m4119a();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        String str3 = "None";
        if (!StringUtils.isValidString(str2)) {
            str2 = str3;
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(a)) {
            a = "Disabled";
        }
        sb4.append(a);
        sb.append(sb4.toString());
        if (this.f2478a.mo14354g() && (metaData = Utils.getMetaData(this.f2478a.mo14363p())) != null) {
            String str4 = metaData.get("UnityVersion");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            if (StringUtils.isValidString(str4)) {
                str3 = str4;
            }
            sb5.append(str3);
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(C1944j.m4362a(this.f2575c));
        sb.append("\n========== NETWORKS ==========");
        for (C1661b w : this.f2487k) {
            m3490a(sb, w.mo13452w());
        }
        for (C1661b w2 : this.f2486j) {
            m3490a(sb, w2.mo13452w());
        }
        sb.append("\n========== AD UNITS ==========");
        for (C1655a f : this.f2479b) {
            m3490a(sb, f.mo13405f());
        }
        sb.append("\n========== END ==========");
        C2092v.m5050f("MediationDebuggerListAdapter", sb.toString());
        this.f2483g.append(sb.toString());
    }

    /* renamed from: m */
    private List<C1707c> m3495m() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.f2575c.getPackageManager().getPackageInfo(this.f2575c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(C1707c.m3545p().mo13541a("Package Name").mo13546b(this.f2575c.getPackageName()).mo13543a());
        C1707c.C1709a a = C1707c.m3545p().mo13541a("App Version");
        String str2 = "None";
        if (!StringUtils.isValidString(str)) {
            str = str2;
        }
        arrayList.add(a.mo13546b(str).mo13543a());
        arrayList.add(C1707c.m3545p().mo13541a("OS").mo13546b(Utils.getAndroidOSInfo()).mo13543a());
        arrayList.add(C1707c.m3545p().mo13541a("Account").mo13546b(StringUtils.isValidString(this.f2482f) ? this.f2482f : str2).mo13543a());
        C1707c.C1709a a2 = C1707c.m3545p().mo13541a("Mediation Provider");
        if (StringUtils.isValidString(this.f2478a.mo14367t())) {
            str2 = this.f2478a.mo14367t();
        }
        arrayList.add(a2.mo13546b(str2).mo13543a());
        arrayList.add(C1707c.m3545p().mo13541a("OM SDK Version").mo13546b(this.f2478a.mo14339al().mo13863c()).mo13543a());
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c4  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c> m3496n() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c.m3545p()
            java.lang.String r2 = "SDK Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo13541a((java.lang.String) r2)
            java.lang.String r2 = com.applovin.sdk.AppLovinSdk.VERSION
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo13546b((java.lang.String) r2)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo13543a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.f2478a
            com.applovin.impl.sdk.c.b<java.lang.String> r2 = com.applovin.impl.sdk.p048c.C1857b.f3279dz
            java.lang.Object r1 = r1.mo14311a(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c.m3545p()
            java.lang.String r3 = "Plugin Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = r2.mo13541a((java.lang.String) r3)
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            java.lang.String r4 = "None"
            if (r3 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r2.mo13546b((java.lang.String) r1)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo13543a()
            r0.add(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c.m3545p()
            java.lang.String r2 = "Ad Review Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo13541a((java.lang.String) r2)
            java.lang.String r2 = com.applovin.impl.sdk.C1873e.m4119a()
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)
            if (r3 == 0) goto L_0x0096
            java.lang.String r3 = com.applovin.impl.sdk.C1873e.m4120b()
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)
            if (r5 == 0) goto L_0x0092
            com.applovin.impl.sdk.m r5 = r6.f2478a
            java.lang.String r5 = r5.mo14374z()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0071
            goto L_0x0092
        L_0x0071:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MAX Ad Review integrated with wrong SDK key. Please check that your "
            r2.<init>(r3)
            com.applovin.impl.sdk.m r3 = r6.f2478a
            boolean r3 = r3.mo14354g()
            if (r3 == 0) goto L_0x0083
            java.lang.String r3 = "SDK key is downloaded"
            goto L_0x0085
        L_0x0083:
            java.lang.String r3 = "Gradle plugin snippet is integrated"
        L_0x0085:
            r2.append(r3)
            java.lang.String r3 = " from the correct account."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0098
        L_0x0092:
            r1.mo13546b((java.lang.String) r2)
            goto L_0x009b
        L_0x0096:
            java.lang.String r2 = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps."
        L_0x0098:
            r6.m3489a((com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c.C1709a) r1, (java.lang.String) r2)
        L_0x009b:
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo13543a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.f2478a
            boolean r1 = r1.mo14354g()
            if (r1 == 0) goto L_0x00ce
            com.applovin.impl.sdk.m r1 = r6.f2478a
            com.applovin.sdk.AppLovinSdkSettings r1 = r1.mo14363p()
            java.util.Map r1 = com.applovin.impl.sdk.utils.Utils.getMetaData(r1)
            if (r1 == 0) goto L_0x00ce
            java.lang.String r2 = "UnityVersion"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 == 0) goto L_0x00c5
            r4 = r1
        L_0x00c5:
            java.lang.String r1 = "Unity Version"
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r6.m3488a((java.lang.String) r1, (java.lang.String) r4)
            r0.add(r1)
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p038ui.p040b.C1696b.m3496n():java.util.List");
    }

    /* renamed from: o */
    private List<C1707c> m3497o() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new C1695b(C1944j.m4361a(), true, this.f2575c));
        arrayList.add(new C1695b(C1944j.m4366b(), false, this.f2575c));
        arrayList.add(new C1695b(C1944j.m4368c(), true, this.f2575c));
        return arrayList;
    }

    /* renamed from: p */
    private List<C1707c> m3498p() {
        ArrayList arrayList = new ArrayList(2);
        C1707c.C1709a p = C1707c.m3545p();
        arrayList.add(p.mo13541a("View Ad Units (" + this.f2479b.size() + ")").mo13539a(this.f2575c).mo13542a(true).mo13543a());
        arrayList.add(m3499q());
        return arrayList;
    }

    /* renamed from: q */
    private C1707c m3499q() {
        C1707c.C1709a p = C1707c.m3545p();
        if (!this.f2478a.mo14295J().mo13583a()) {
            p.mo13539a(this.f2575c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2478a.mo14295J().mo13586c() != null ? "" : "Select ");
        sb.append("Live Network");
        return p.mo13541a(sb.toString()).mo13546b(this.f2478a.mo14295J().mo13583a() ? "Enable" : null).mo13544b(-16776961).mo13550d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").mo13542a(true).mo13543a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13480a(int i) {
        return (i == C1699b.APP_INFO.ordinal() ? this.f2491o : i == C1699b.MAX.ordinal() ? this.f2492p : i == C1699b.PRIVACY.ordinal() ? this.f2493q : i == C1699b.ADS.ordinal() ? this.f2494r : i == C1699b.INCOMPLETE_NETWORKS.ordinal() ? this.f2495s : i == C1699b.COMPLETED_NETWORKS.ordinal() ? this.f2496t : this.f2497u).size();
    }

    /* renamed from: a */
    public void mo13510a(List<C1661b> list, List<C1655a> list2, String str, String str2, String str3, C1959m mVar) {
        Activity an;
        this.f2478a = mVar;
        this.f2479b = list2;
        this.f2480d = str;
        this.f2481e = str2;
        this.f2482f = str3;
        if (!(this.f2575c instanceof Activity) && (an = mVar.mo14341an()) != null) {
            this.f2575c = an;
        }
        if (list != null && this.f2484h.compareAndSet(false, true)) {
            mVar.mo14286A().mo14789b("MediationDebuggerListAdapter", "Populating networks...");
            m3491a(list);
            m3492b(list2);
            this.f2491o.addAll(m3495m());
            this.f2492p.addAll(m3496n());
            this.f2493q.addAll(m3497o());
            this.f2494r.addAll(m3498p());
            this.f2495s = m3493c(this.f2486j);
            this.f2496t = m3493c(this.f2487k);
            this.f2497u = m3493c(this.f2488l);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            AppLovinCommunicator.getInstance(this.f2575c).subscribe((AppLovinCommunicatorSubscriber) this, (List<String>) arrayList);
            m3494l();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C1696b.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    public void mo13511a(boolean z) {
        this.f2485i = z;
    }

    /* renamed from: a */
    public boolean mo13481a() {
        return this.f2484h.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13482b() {
        return C1699b.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1707c mo13483b(int i) {
        return i == C1699b.APP_INFO.ordinal() ? new C1714e("APP INFO") : i == C1699b.MAX.ordinal() ? new C1714e("MAX") : i == C1699b.PRIVACY.ordinal() ? new C1714e("PRIVACY") : i == C1699b.ADS.ordinal() ? new C1714e("ADS") : i == C1699b.INCOMPLETE_NETWORKS.ordinal() ? new C1714e("INCOMPLETE INTEGRATIONS") : i == C1699b.COMPLETED_NETWORKS.ordinal() ? new C1714e("COMPLETED INTEGRATIONS") : new C1714e("MISSING INTEGRATIONS");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C1707c> mo13484c(int i) {
        return i == C1699b.APP_INFO.ordinal() ? this.f2491o : i == C1699b.MAX.ordinal() ? this.f2492p : i == C1699b.PRIVACY.ordinal() ? this.f2493q : i == C1699b.ADS.ordinal() ? this.f2494r : i == C1699b.INCOMPLETE_NETWORKS.ordinal() ? this.f2495s : i == C1699b.COMPLETED_NETWORKS.ordinal() ? this.f2496t : this.f2497u;
    }

    /* renamed from: c */
    public boolean mo13512c() {
        return this.f2485i;
    }

    /* renamed from: d */
    public C1959m mo13513d() {
        return this.f2478a;
    }

    /* renamed from: e */
    public List<C1655a> mo13514e() {
        return this.f2479b;
    }

    /* renamed from: f */
    public String mo13515f() {
        return this.f2480d;
    }

    /* renamed from: g */
    public String mo13516g() {
        return this.f2481e;
    }

    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    /* renamed from: h */
    public List<C1658d> mo13517h() {
        return this.f2489m;
    }

    /* renamed from: i */
    public List<C1658d> mo13518i() {
        return this.f2490n;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f2493q = m3497o();
        } else if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f2495s = m3493c(this.f2486j);
            this.f2496t = m3493c(this.f2487k);
        } else {
            return;
        }
        mo13564j();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f2484h.get() + "}";
    }
}
