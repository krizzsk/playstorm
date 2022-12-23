package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.entity.C8410k;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.same.report.p313b.C8522a;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.p052b.C2273a;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2290c;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.mbridge.msdk.foundation.controller.b */
/* compiled from: SDKController */
public final class C2358b {

    /* renamed from: h */
    private static C2358b f4933h;

    /* renamed from: a */
    public final int f4934a = 1;

    /* renamed from: b */
    public final int f4935b = 2;

    /* renamed from: c */
    public final int f4936c = 3;

    /* renamed from: d */
    public final int f4937d = 4;

    /* renamed from: e */
    public final int f4938e = 5;

    /* renamed from: f */
    public final int f4939f = 6;

    /* renamed from: g */
    Handler f4940g = new Handler() {
        public final void handleMessage(Message message) {
            List list;
            try {
                int i = message.what;
                if (i != 2) {
                    if (i == 3) {
                        File file = (File) message.obj;
                        if (file != null) {
                            String a = C8602s.m24862a(file);
                            if (!TextUtils.isEmpty(a)) {
                                String[] split = a.split("====");
                                if (split.length > 0) {
                                    new C8526d(C2358b.this.f4941i).mo57693a(split[0], file);
                                }
                            }
                        }
                    } else if (i == 4) {
                        String str = (String) message.obj;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        if (C8518b.m24607a().mo57681c()) {
                            C8518b.m24607a().mo57679a(str);
                        } else {
                            new C8526d(C2358b.this.f4941i, 0).mo57695a("click_duration", str, (String) null, (Frame) null);
                        }
                    } else if (i == 5) {
                        String str2 = (String) message.obj;
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        if (C8518b.m24607a().mo57681c()) {
                            C8518b.m24607a().mo57679a(str2);
                        } else {
                            new C8526d(C2358b.this.f4941i, 0).mo57695a("load_duration", str2, (String) null, (Frame) null);
                        }
                    } else if (i != 6) {
                        if (i == 9) {
                            if (((C2278a) message.obj).mo15432F() == 1) {
                                C8522a.m24622a(C2358b.this.f4941i).mo57684a();
                            }
                        }
                    } else if (message.obj != null && (message.obj instanceof String)) {
                        String str3 = (String) message.obj;
                        if (TextUtils.isEmpty(str3)) {
                            return;
                        }
                        if (C8518b.m24607a().mo57681c()) {
                            C8518b.m24607a().mo57679a(str3);
                        } else {
                            new C8526d(C2358b.this.f4941i, 0).mo57695a("device_data", str3, (String) null, (Frame) null);
                        }
                    }
                } else if ((message.obj instanceof List) && (list = (List) message.obj) != null && list.size() > 0) {
                    C8526d dVar = new C8526d(C2358b.this.f4941i, 0);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C8410k kVar = (C8410k) list.get(i2);
                        boolean z = false;
                        if (i2 == list.size() - 1) {
                            z = true;
                        }
                        dVar.mo57691a(kVar, z);
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d("SDKController", e.getMessage());
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f4941i;

    /* renamed from: j */
    private String f4942j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f4943k;

    /* renamed from: l */
    private String f4944l;

    /* renamed from: m */
    private boolean f4945m = false;

    /* renamed from: n */
    private C2273a f4946n;

    /* renamed from: o */
    private String f4947o;

    /* renamed from: p */
    private boolean f4948p = false;

    /* renamed from: q */
    private AtomicBoolean f4949q = null;

    /* renamed from: r */
    private FastKV f4950r = null;

    /* renamed from: s */
    private Map<String, Object> f4951s;

    /* renamed from: t */
    private int f4952t;

    private C2358b() {
    }

    /* renamed from: a */
    public static synchronized C2358b m5644a() {
        C2358b bVar;
        synchronized (C2358b.class) {
            if (f4933h == null) {
                f4933h = new C2358b();
            }
            bVar = f4933h;
        }
        return bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:(4:89|90|91|92)|95|96|(1:100)|101|(2:111|112)(2:105|(2:109|110))) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x02f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01ea */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x021a A[Catch:{ Exception -> 0x01c5, all -> 0x02ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0244 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02fb A[Catch:{ Exception -> 0x0323 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0308 A[Catch:{ Exception -> 0x0323 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15826a(java.util.Map r13, final android.content.Context r14) {
        /*
            r12 = this;
            java.lang.String r0 = "SDKController"
            java.lang.String r1 = ""
            if (r14 == 0) goto L_0x0357
            java.lang.String r2 = "mbridge_appid"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0016
            java.lang.Object r3 = r13.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r12.f4943k = r3
        L_0x0016:
            android.content.Context r3 = r14.getApplicationContext()
            r12.f4941i = r3
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r4 = r12.f4941i
            r3.mo15785b((android.content.Context) r4)
            java.lang.Object r3 = r13.get(r2)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            if (r4 != 0) goto L_0x0046
            com.mbridge.msdk.foundation.a.a.a r4 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            java.lang.String r5 = "sdk_app_id"
            r4.mo15733a((java.lang.String) r5, (java.lang.String) r3)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            goto L_0x0046
        L_0x003b:
            r3 = move-exception
            goto L_0x003f
        L_0x003d:
            r3 = move-exception
            goto L_0x0043
        L_0x003f:
            r3.printStackTrace()
            goto L_0x0046
        L_0x0043:
            r3.printStackTrace()
        L_0x0046:
            boolean r3 = r12.f4945m
            r4 = 1
            if (r3 != r4) goto L_0x0054
            com.mbridge.msdk.foundation.same.report.d r13 = new com.mbridge.msdk.foundation.same.report.d
            r13.<init>(r14)
            r13.mo57687a()
            return
        L_0x0054:
            com.mbridge.msdk.foundation.tools.C8596q.m24847m(r14)
            if (r13 == 0) goto L_0x0335
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0067
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12.f4943k = r2
        L_0x0067:
            java.lang.String r2 = "mbridge_appkey"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12.f4944l = r2
        L_0x0077:
            java.lang.String r2 = "applicationID"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0087
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12.f4947o = r2
        L_0x0087:
            java.lang.String r2 = "mbridge_appstartupcarsh"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0097
            java.lang.Object r13 = r13.get(r2)
            java.lang.String r13 = (java.lang.String) r13
            r12.f4942j = r13
        L_0x0097:
            r13 = 0
            com.mbridge.msdk.c.b r2 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ all -> 0x0142 }
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x0142 }
            java.lang.String r3 = r3.mo15793h()     // Catch:{ all -> 0x0142 }
            com.mbridge.msdk.c.a r2 = r2.mo15563b(r3)     // Catch:{ all -> 0x0142 }
            if (r2 == 0) goto L_0x014a
            java.util.List r2 = r2.mo15488b()     // Catch:{ all -> 0x0142 }
            if (r2 == 0) goto L_0x014a
            int r3 = r2.size()     // Catch:{ all -> 0x0142 }
            if (r3 <= 0) goto L_0x014a
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0142 }
        L_0x00ba:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0142 }
            if (r3 == 0) goto L_0x014a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0142 }
            com.mbridge.msdk.foundation.entity.a r3 = (com.mbridge.msdk.foundation.entity.C8400a) r3     // Catch:{ all -> 0x0142 }
            int r5 = r3.mo57291a()     // Catch:{ all -> 0x0142 }
            r6 = 287(0x11f, float:4.02E-43)
            java.lang.String r7 = "loadFormSelfFilling"
            r8 = 2
            if (r5 != r6) goto L_0x0107
            java.lang.String r5 = "com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0142 }
            android.content.Context r6 = r12.f4941i     // Catch:{ all -> 0x0142 }
            if (r6 == 0) goto L_0x00ba
            if (r5 == 0) goto L_0x00ba
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0142 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r13] = r9     // Catch:{ all -> 0x0142 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r4] = r9     // Catch:{ all -> 0x0142 }
            java.lang.reflect.Constructor r6 = r5.getConstructor(r6)     // Catch:{ all -> 0x0142 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0142 }
            r8[r13] = r1     // Catch:{ all -> 0x0142 }
            java.lang.String r3 = r3.mo57292b()     // Catch:{ all -> 0x0142 }
            r8[r4] = r3     // Catch:{ all -> 0x0142 }
            java.lang.Object r3 = r6.newInstance(r8)     // Catch:{ all -> 0x0142 }
            if (r3 == 0) goto L_0x00ba
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x0142 }
            java.lang.reflect.Method r5 = r5.getMethod(r7, r6)     // Catch:{ all -> 0x0142 }
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0142 }
            r5.invoke(r3, r6)     // Catch:{ all -> 0x0142 }
            goto L_0x00ba
        L_0x0107:
            int r5 = r3.mo57291a()     // Catch:{ all -> 0x0142 }
            r6 = 94
            if (r5 != r6) goto L_0x00ba
            java.lang.String r5 = "com.mbridge.msdk.out.MBRewardVideoHandler"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x00ba
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0142 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r13] = r9     // Catch:{ all -> 0x0142 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r4] = r9     // Catch:{ all -> 0x0142 }
            java.lang.reflect.Constructor r6 = r5.getConstructor(r6)     // Catch:{ all -> 0x0142 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0142 }
            r8[r13] = r1     // Catch:{ all -> 0x0142 }
            java.lang.String r3 = r3.mo57292b()     // Catch:{ all -> 0x0142 }
            r8[r4] = r3     // Catch:{ all -> 0x0142 }
            java.lang.Object r3 = r6.newInstance(r8)     // Catch:{ all -> 0x0142 }
            if (r3 == 0) goto L_0x00ba
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x0142 }
            java.lang.reflect.Method r5 = r5.getMethod(r7, r6)     // Catch:{ all -> 0x0142 }
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0142 }
            r5.invoke(r3, r6)     // Catch:{ all -> 0x0142 }
            goto L_0x00ba
        L_0x0142:
            r2 = move-exception
            boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r3 == 0) goto L_0x014a
            r2.printStackTrace()
        L_0x014a:
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r3 = r12.f4943k
            r2.mo15786b((java.lang.String) r3)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r3 = r12.f4944l
            r2.mo15789c((java.lang.String) r3)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r3 = r12.f4947o
            r2.mo15780a((java.lang.String) r3)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            com.mbridge.msdk.foundation.controller.b$6 r3 = new com.mbridge.msdk.foundation.controller.b$6
            r3.<init>()
            android.os.Handler r5 = r12.f4940g
            r2.mo15779a((com.mbridge.msdk.foundation.controller.C2350a.C2356b) r3, (android.os.Handler) r5)
            android.content.Context r2 = r12.f4941i
            android.content.Context r2 = r2.getApplicationContext()
            com.iab.omid.library.mmadbridge.Omid.activate(r2)     // Catch:{ IllegalArgumentException -> 0x0195 }
            boolean r3 = com.iab.omid.library.mmadbridge.Omid.isActive()     // Catch:{ IllegalArgumentException -> 0x0195 }
            if (r3 != 0) goto L_0x019d
            com.mbridge.msdk.foundation.same.report.d r5 = new com.mbridge.msdk.foundation.same.report.d     // Catch:{ IllegalArgumentException -> 0x0195 }
            r5.<init>(r2, r13)     // Catch:{ IllegalArgumentException -> 0x0195 }
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = "activate om failed"
            r5.mo57696a((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10)     // Catch:{ IllegalArgumentException -> 0x0195 }
            goto L_0x019d
        L_0x0195:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r3, r2)
        L_0x019d:
            android.content.Context r2 = r12.f4941i
            android.content.Context r2 = r2.getApplicationContext()
            boolean r3 = r12.mo15829d()     // Catch:{ all -> 0x02ef }
            java.lang.String r5 = "H+tU+FeXHM=="
            if (r3 == 0) goto L_0x01c8
            com.mbridge.msdk.foundation.tools.FastKV r3 = r12.f4950r     // Catch:{ all -> 0x02ef }
            if (r3 != 0) goto L_0x01c8
            com.mbridge.msdk.foundation.tools.FastKV$Builder r3 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x01c5 }
            com.mbridge.msdk.foundation.same.b.c r6 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r6 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r6)     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r7 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r5)     // Catch:{ Exception -> 0x01c5 }
            r3.<init>(r6, r7)     // Catch:{ Exception -> 0x01c5 }
            com.mbridge.msdk.foundation.tools.FastKV r3 = r3.build()     // Catch:{ Exception -> 0x01c5 }
            r12.f4950r = r3     // Catch:{ Exception -> 0x01c5 }
            goto L_0x01c8
        L_0x01c5:
            r3 = 0
            r12.f4950r = r3     // Catch:{ all -> 0x02ef }
        L_0x01c8:
            com.mbridge.msdk.foundation.tools.FastKV r3 = r12.f4950r     // Catch:{ all -> 0x02ef }
            java.lang.String r6 = "c"
            java.lang.String r7 = "b"
            java.lang.String r8 = "H+tU+Fz8"
            java.lang.String r9 = "H+tU+bfPhM=="
            if (r3 == 0) goto L_0x025c
            com.mbridge.msdk.foundation.tools.FastKV r13 = r12.f4950r     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r9)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r13 = r13.getString(r2, r1)     // Catch:{ Exception -> 0x01e9 }
            com.mbridge.msdk.foundation.tools.FastKV r2 = r12.f4950r     // Catch:{ Exception -> 0x01ea }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r8)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r1 = r2.getString(r3, r1)     // Catch:{ Exception -> 0x01ea }
            goto L_0x01ea
        L_0x01e9:
            r13 = r1
        L_0x01ea:
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x02ef }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02ef }
            if (r2 == 0) goto L_0x020e
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x02ef }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02ef }
            if (r2 == 0) goto L_0x020e
            com.mbridge.msdk.foundation.a.a.a r2 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ all -> 0x02ef }
            java.lang.String r2 = r2.mo15735b(r7)     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.same.C8413a.f20329k = r2     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.a.a.a r2 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ all -> 0x02ef }
            java.lang.String r2 = r2.mo15735b(r6)     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.same.C8413a.f20330l = r2     // Catch:{ all -> 0x02ef }
        L_0x020e:
            boolean r2 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x02ef }
            if (r2 == 0) goto L_0x0244
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02ef }
            if (r2 == 0) goto L_0x0244
            java.lang.String r13 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x02ef }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x02ef }
            if (r13 == 0) goto L_0x022c
            java.lang.String r13 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x02ef }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x02ef }
            if (r13 == 0) goto L_0x022c
            goto L_0x02f7
        L_0x022c:
            com.mbridge.msdk.foundation.tools.FastKV r13 = r12.f4950r     // Catch:{ Exception -> 0x02f7 }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r9)     // Catch:{ Exception -> 0x02f7 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ Exception -> 0x02f7 }
            r13.putString(r1, r2)     // Catch:{ Exception -> 0x02f7 }
            com.mbridge.msdk.foundation.tools.FastKV r13 = r12.f4950r     // Catch:{ Exception -> 0x02f7 }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r8)     // Catch:{ Exception -> 0x02f7 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ Exception -> 0x02f7 }
            r13.putString(r1, r2)     // Catch:{ Exception -> 0x02f7 }
            goto L_0x02f7
        L_0x0244:
            com.mbridge.msdk.foundation.same.C8413a.f20329k = r13     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.same.C8413a.f20330l = r1     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.a.a.a r13 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x02ef }
            r13.mo15733a((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.a.a.a r13 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x02ef }
            r13.mo15733a((java.lang.String) r6, (java.lang.String) r1)     // Catch:{ all -> 0x02ef }
            goto L_0x02f7
        L_0x025c:
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r5)     // Catch:{ all -> 0x02ef }
            android.content.SharedPreferences r13 = r2.getSharedPreferences(r3, r13)     // Catch:{ all -> 0x02ef }
            if (r13 == 0) goto L_0x027a
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r9)     // Catch:{ all -> 0x02ef }
            java.lang.String r2 = r13.getString(r2, r1)     // Catch:{ all -> 0x02ef }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r8)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = r13.getString(r3, r1)     // Catch:{ all -> 0x02ef }
            r11 = r2
            r2 = r1
            r1 = r11
            goto L_0x027b
        L_0x027a:
            r2 = r1
        L_0x027b:
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x02ef }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x02ef }
            if (r3 == 0) goto L_0x029f
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x02ef }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x02ef }
            if (r3 == 0) goto L_0x029f
            com.mbridge.msdk.foundation.a.a.a r3 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ all -> 0x02ef }
            java.lang.String r3 = r3.mo15735b(r7)     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.same.C8413a.f20329k = r3     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.a.a.a r3 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ all -> 0x02ef }
            java.lang.String r3 = r3.mo15735b(r6)     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.same.C8413a.f20330l = r3     // Catch:{ all -> 0x02ef }
        L_0x029f:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02ef }
            if (r3 == 0) goto L_0x02d8
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02ef }
            if (r3 == 0) goto L_0x02d8
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x02ef }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02ef }
            if (r1 == 0) goto L_0x02bc
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x02ef }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02ef }
            if (r1 == 0) goto L_0x02bc
            goto L_0x02f7
        L_0x02bc:
            if (r13 == 0) goto L_0x02f7
            android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r9)     // Catch:{ all -> 0x02ef }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x02ef }
            r13.putString(r1, r2)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r8)     // Catch:{ all -> 0x02ef }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x02ef }
            r13.putString(r1, r2)     // Catch:{ all -> 0x02ef }
            r13.apply()     // Catch:{ all -> 0x02ef }
            goto L_0x02f7
        L_0x02d8:
            com.mbridge.msdk.foundation.same.C8413a.f20329k = r1     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.same.C8413a.f20330l = r2     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.a.a.a r13 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x02ef }
            r13.mo15733a((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ all -> 0x02ef }
            com.mbridge.msdk.foundation.a.a.a r13 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x02ef }
            r13.mo15733a((java.lang.String) r6, (java.lang.String) r1)     // Catch:{ all -> 0x02ef }
            goto L_0x02f7
        L_0x02ef:
            r13 = move-exception
            java.lang.String r1 = r13.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r1, r13)
        L_0x02f7:
            boolean r13 = com.mbridge.msdk.MBridgeConstans.INIT_UA_IN     // Catch:{ Exception -> 0x0323 }
            if (r13 == 0) goto L_0x0308
            java.util.concurrent.ThreadPoolExecutor r13 = com.mbridge.msdk.foundation.same.p304f.C8442b.m24388a()     // Catch:{ Exception -> 0x0323 }
            com.mbridge.msdk.foundation.controller.b$2 r1 = new com.mbridge.msdk.foundation.controller.b$2     // Catch:{ Exception -> 0x0323 }
            r1.<init>()     // Catch:{ Exception -> 0x0323 }
            r13.execute(r1)     // Catch:{ Exception -> 0x0323 }
            goto L_0x032b
        L_0x0308:
            android.os.Looper r13 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x0323 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0323 }
            if (r13 != r1) goto L_0x031f
            java.util.concurrent.ThreadPoolExecutor r13 = com.mbridge.msdk.foundation.same.p304f.C8442b.m24388a()     // Catch:{ Exception -> 0x0323 }
            com.mbridge.msdk.foundation.controller.b$3 r1 = new com.mbridge.msdk.foundation.controller.b$3     // Catch:{ Exception -> 0x0323 }
            r1.<init>()     // Catch:{ Exception -> 0x0323 }
            r13.execute(r1)     // Catch:{ Exception -> 0x0323 }
            goto L_0x032b
        L_0x031f:
            r12.m5649e()     // Catch:{ Exception -> 0x0323 }
            goto L_0x032b
        L_0x0323:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r13)
        L_0x032b:
            r12.mo15828c()
            android.content.Context r13 = r12.f4941i
            com.mbridge.msdk.foundation.tools.C8610w.m24892a((android.content.Context) r13)
            r12.f4945m = r4
        L_0x0335:
            com.mbridge.msdk.c.b r13 = com.mbridge.msdk.p054c.C2283b.m5275a()
            java.lang.String r0 = r12.f4943k
            com.mbridge.msdk.c.a r13 = r13.mo15571f(r0)
            int r13 = r13.mo15507f()
            long r0 = (long) r13
            r2 = 1300(0x514, double:6.423E-321)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0357
            android.os.Handler r13 = new android.os.Handler
            r13.<init>()
            com.mbridge.msdk.foundation.controller.b$1 r2 = new com.mbridge.msdk.foundation.controller.b$1
            r2.<init>(r14)
            r13.postDelayed(r2, r0)
        L_0x0357:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C2358b.mo15826a(java.util.Map, android.content.Context):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m5649e() {
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.d.b");
            cls.getDeclaredMethod("start", new Class[0]).invoke(cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            C8608u.m24881a("SDKController", th.getMessage(), th);
        }
    }

    /* renamed from: b */
    public final void mo15827b() {
        Handler handler = this.f4940g;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: c */
    public final void mo15828c() {
        new Thread(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x007e A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0228 A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r11 = this;
                    com.mbridge.msdk.foundation.same.report.p314c.C8525a.m24643a()     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C2358b.this     // Catch:{ Exception -> 0x025c }
                    android.content.Context r0 = r0.f4941i     // Catch:{ Exception -> 0x025c }
                    r1 = 0
                    r2 = 5
                    if (r0 != 0) goto L_0x000e
                    goto L_0x0029
                L_0x000e:
                    com.mbridge.msdk.foundation.db.g r3 = com.mbridge.msdk.foundation.p066db.C2376g.m5723a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.m r3 = com.mbridge.msdk.foundation.p066db.C2382m.m5755a((com.mbridge.msdk.foundation.p066db.C2374f) r3)     // Catch:{ Exception -> 0x025c }
                    int r3 = r3.mo15917a()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x0029
                    com.mbridge.msdk.foundation.db.g r0 = com.mbridge.msdk.foundation.p066db.C2376g.m5723a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.m r0 = com.mbridge.msdk.foundation.p066db.C2382m.m5755a((com.mbridge.msdk.foundation.p066db.C2374f) r0)     // Catch:{ Exception -> 0x025c }
                    java.util.List r0 = r0.mo15921a((int) r2)     // Catch:{ Exception -> 0x025c }
                    goto L_0x002a
                L_0x0029:
                    r0 = r1
                L_0x002a:
                    if (r0 == 0) goto L_0x0046
                    int r3 = r0.size()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x0046
                    com.mbridge.msdk.foundation.controller.b r3 = com.mbridge.msdk.foundation.controller.C2358b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r3 = r3.f4940g     // Catch:{ Exception -> 0x025c }
                    android.os.Message r3 = r3.obtainMessage()     // Catch:{ Exception -> 0x025c }
                    r4 = 2
                    r3.what = r4     // Catch:{ Exception -> 0x025c }
                    r3.obj = r0     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C2358b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r0 = r0.f4940g     // Catch:{ Exception -> 0x025c }
                    r0.sendMessage(r3)     // Catch:{ Exception -> 0x025c }
                L_0x0046:
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C2358b.this     // Catch:{ Exception -> 0x025c }
                    android.content.Context r0 = r0.f4941i     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.g r0 = com.mbridge.msdk.foundation.p066db.C2376g.m5723a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.d r3 = com.mbridge.msdk.foundation.p066db.C2371d.m5675a((com.mbridge.msdk.foundation.p066db.C2374f) r0)     // Catch:{ Exception -> 0x025c }
                    int r4 = r3.mo15855a()     // Catch:{ Exception -> 0x025c }
                    r5 = 20
                    if (r4 < r5) goto L_0x0074
                    java.util.List r3 = r3.mo15856a((int) r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = com.mbridge.msdk.foundation.entity.C8403d.m24103a((java.util.List<com.mbridge.msdk.foundation.entity.C8403d>) r3)     // Catch:{ Exception -> 0x025c }
                    android.os.Message r4 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r4.obj = r3     // Catch:{ Exception -> 0x025c }
                    r3 = 4
                    r4.what = r3     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r3 = com.mbridge.msdk.foundation.controller.C2358b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r3 = r3.f4940g     // Catch:{ Exception -> 0x025c }
                    r3.sendMessage(r4)     // Catch:{ Exception -> 0x025c }
                L_0x0074:
                    com.mbridge.msdk.foundation.db.k r0 = com.mbridge.msdk.foundation.p066db.C2380k.m5747a((com.mbridge.msdk.foundation.p066db.C2374f) r0)     // Catch:{ Exception -> 0x025c }
                    int r3 = r0.mo15911a()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= r5) goto L_0x0208
                    java.util.List r0 = r0.mo15912a((int) r5)     // Catch:{ Exception -> 0x025c }
                    if (r0 == 0) goto L_0x01f9
                    int r3 = r0.size()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x01f9
                    java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x025c }
                    r1.<init>()     // Catch:{ Exception -> 0x025c }
                    java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x025c }
                L_0x0093:
                    boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x025c }
                    if (r3 == 0) goto L_0x01f5
                    java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.entity.g r3 = (com.mbridge.msdk.foundation.entity.C8406g) r3     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.authoritycontroller.a r4 = com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a.m5633a()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "authority_general_data"
                    boolean r4 = r4.mo15819a((java.lang.String) r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "&fb="
                    java.lang.String r6 = "&key=2000006"
                    java.lang.String r7 = "&unit_id="
                    java.lang.String r8 = "&num="
                    java.lang.String r9 = "&time="
                    java.lang.String r10 = "ad_source_id="
                    if (r4 == 0) goto L_0x0159
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r10)     // Catch:{ Exception -> 0x025c }
                    int r10 = r3.mo57359b()     // Catch:{ Exception -> 0x025c }
                    r4.append(r10)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r9 = r3.mo57362c()     // Catch:{ Exception -> 0x025c }
                    r4.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r8)     // Catch:{ Exception -> 0x025c }
                    int r8 = r3.mo57365d()     // Catch:{ Exception -> 0x025c }
                    r4.append(r8)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r7 = r3.mo57367e()     // Catch:{ Exception -> 0x025c }
                    r4.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    r1.append(r6)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    int r5 = r3.mo57368f()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "&network_str="
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = r3.mo57371i()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "&network_type="
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    int r5 = r3.mo57370h()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    goto L_0x01ca
                L_0x0159:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r10)     // Catch:{ Exception -> 0x025c }
                    int r10 = r3.mo57359b()     // Catch:{ Exception -> 0x025c }
                    r4.append(r10)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r9 = r3.mo57362c()     // Catch:{ Exception -> 0x025c }
                    r4.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r8)     // Catch:{ Exception -> 0x025c }
                    int r8 = r3.mo57365d()     // Catch:{ Exception -> 0x025c }
                    r4.append(r8)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r7 = r3.mo57367e()     // Catch:{ Exception -> 0x025c }
                    r4.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    r1.append(r6)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    int r5 = r3.mo57368f()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                L_0x01ca:
                    int r4 = r3.mo57356a()     // Catch:{ Exception -> 0x025c }
                    r5 = 1
                    if (r4 != r5) goto L_0x01d6
                    java.lang.String r4 = "&hb=1"
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                L_0x01d6:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "&timeout="
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    int r3 = r3.mo57369g()     // Catch:{ Exception -> 0x025c }
                    r4.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = "\n"
                    r4.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    goto L_0x0093
                L_0x01f5:
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x025c }
                L_0x01f9:
                    android.os.Message r0 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r0.obj = r1     // Catch:{ Exception -> 0x025c }
                    r0.what = r2     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r1 = com.mbridge.msdk.foundation.controller.C2358b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r1 = r1.f4940g     // Catch:{ Exception -> 0x025c }
                    r1.sendMessage(r0)     // Catch:{ Exception -> 0x025c }
                L_0x0208:
                    com.mbridge.msdk.foundation.same.b.c r0 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_CRASH_INFO     // Catch:{ Exception -> 0x025c }
                    java.lang.String r0 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r0)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r1 = "/"
                    java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x025c }
                    r2.<init>(r0)     // Catch:{ Exception -> 0x025c }
                    boolean r3 = r2.exists()     // Catch:{ Exception -> 0x025c }
                    if (r3 == 0) goto L_0x0266
                    boolean r3 = r2.isDirectory()     // Catch:{ Exception -> 0x025c }
                    if (r3 == 0) goto L_0x0266
                    java.lang.String[] r3 = r2.list()     // Catch:{ Exception -> 0x025c }
                    int r3 = r3.length     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x0266
                    java.lang.String[] r2 = r2.list()     // Catch:{ Exception -> 0x025c }
                    int r3 = r2.length     // Catch:{ Exception -> 0x025c }
                    r4 = 0
                L_0x022e:
                    if (r4 >= r3) goto L_0x0266
                    r5 = r2[r4]     // Catch:{ Exception -> 0x025c }
                    java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r7.<init>()     // Catch:{ Exception -> 0x025c }
                    r7.append(r0)     // Catch:{ Exception -> 0x025c }
                    r7.append(r1)     // Catch:{ Exception -> 0x025c }
                    r7.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x025c }
                    r6.<init>(r5)     // Catch:{ Exception -> 0x025c }
                    android.os.Message r5 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r5.obj = r6     // Catch:{ Exception -> 0x025c }
                    r6 = 3
                    r5.what = r6     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r6 = com.mbridge.msdk.foundation.controller.C2358b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r6 = r6.f4940g     // Catch:{ Exception -> 0x025c }
                    r6.sendMessage(r5)     // Catch:{ Exception -> 0x025c }
                    int r4 = r4 + 1
                    goto L_0x022e
                L_0x025c:
                    r0 = move-exception
                    java.lang.String r0 = r0.getMessage()
                    java.lang.String r1 = "SDKController"
                    com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)
                L_0x0266:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C2358b.C23635.run():void");
            }
        }).start();
    }

    /* renamed from: a */
    public final void mo15825a(Map<String, Object> map, int i) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            this.f4951s = map;
            this.f4952t = i;
            C2350a.m5601e().mo15793h();
            if (map != null) {
                if (this.f4946n == null) {
                    this.f4946n = new C2273a();
                }
                try {
                    if (this.f4951s != null && this.f4951s.size() > 0 && this.f4951s.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE) && ((Integer) this.f4951s.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue() == 0) {
                        Map<String, Object> map2 = this.f4951s;
                        int i2 = this.f4952t;
                        try {
                            Class<?> cls = Class.forName("com.mbridge.msdk.mbnative.e.a");
                            Object newInstance = cls.newInstance();
                            cls.getMethod("preload", new Class[]{Map.class, Integer.TYPE}).invoke(newInstance, new Object[]{map2, Integer.valueOf(i2)});
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo15829d() {
        Context context = this.f4941i;
        if (context != null && this.f4949q == null) {
            boolean z = false;
            int i = context.getSharedPreferences("mb_optimization_setting", 0).getInt("use_thread_pool", 0);
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            this.f4949q = atomicBoolean;
            if (i == 0) {
                z = true;
            }
            atomicBoolean.set(z);
        }
        AtomicBoolean atomicBoolean2 = this.f4949q;
        if (atomicBoolean2 != null) {
            return atomicBoolean2.get();
        }
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m5646a(C2358b bVar, String str) {
        if (C2283b.m5275a() != null) {
            C2283b a = C2283b.m5275a();
            if (a != null) {
                C2278a b = a.mo15563b(str);
                if (b != null) {
                    MBridgeConstans.OMID_JS_SERVICE_URL = b.mo15478aq();
                    MBridgeConstans.OMID_JS_H5_URL = b.mo15477ap();
                    if (!TextUtils.isEmpty(b.mo15544x())) {
                        C8487d.m24492a().f20533c = b.mo15544x();
                        C8487d.m24492a().mo57596e();
                    }
                    if (!TextUtils.isEmpty(b.mo15546y())) {
                        C8487d.m24492a().f20534d = b.mo15546y();
                        C8487d.m24492a().mo57597f();
                    }
                } else {
                    MBridgeConstans.OMID_JS_SERVICE_URL = "https://cdn-adn-https.rayjump.com/cdn-adn/v2/portal/19/08/20/11/06/5d5b63cb457e2.js";
                    MBridgeConstans.OMID_JS_H5_URL = "https://mtg-native.rayjump.com/omsdk/omsdkjs_common_js.txt";
                }
            }
            if (!C2283b.m5275a().mo15559a(str) || !C2283b.m5275a().mo15560a(str, 1, (String) null)) {
                new C8526d(bVar.f4941i).mo57687a();
            } else {
                new C2290c().mo15579a(bVar.f4941i, str, bVar.f4944l);
            }
        }
    }
}
