package com.ogury.p375cm.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ogury.core.OguryError;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.crash.CrashConfig;
import com.ogury.core.internal.crash.OguryCrashReport;
import com.ogury.core.internal.crash.SdkInfo;
import com.ogury.p375cm.OguryChoiceManager;
import com.ogury.p375cm.OguryConsentListener;
import com.ogury.p375cm.internal.aacaa;
import com.ogury.p375cm.internal.aacab;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aaaaa */
public final class aaaaa implements aacbc {

    /* renamed from: a */
    private bbbbb f25558a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f25559b;

    /* renamed from: c */
    private Handler f25560c;

    /* renamed from: d */
    private ababb f25561d;

    /* renamed from: e */
    private abbbb f25562e;

    /* renamed from: f */
    private abcba f25563f;

    /* renamed from: g */
    private baccc f25564g;

    /* renamed from: h */
    private com.ogury.p375cm.aaaac f25565h;

    /* renamed from: i */
    private accba f25566i;

    /* renamed from: j */
    private aacca f25567j;

    /* renamed from: k */
    private boolean f25568k;

    /* renamed from: l */
    private String f25569l;

    /* renamed from: m */
    private final aaaac f25570m;

    /* renamed from: n */
    private final babac f25571n;

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaaa  reason: collision with other inner class name */
    public static final class C12475aaaaa implements babaa {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f25572a;

        C12475aaaaa(CountDownLatch countDownLatch) {
            this.f25572a = countDownLatch;
        }

        /* renamed from: a */
        public final void mo66497a() {
            this.f25572a.countDown();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaab */
    public static final class aaaab implements ababa {

        /* renamed from: a */
        final /* synthetic */ aaaaa f25573a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f25574b;

        aaaab(aaaaa aaaaa, CountDownLatch countDownLatch) {
            this.f25573a = aaaaa;
            this.f25574b = countDownLatch;
        }

        /* renamed from: a */
        public final void mo66487a(String str) {
            bbabc.m30943b(str, "aaid");
            this.f25573a.mo66494a(str);
            this.f25574b.countDown();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaac */
    public static final class aaaac implements acabb {

        /* renamed from: a */
        final /* synthetic */ aaaaa f25575a;

        /* renamed from: b */
        final /* synthetic */ Context f25576b;

        aaaac(aaaaa aaaaa, Context context) {
            this.f25575a = aaaaa;
            this.f25576b = context;
        }

        /* renamed from: a */
        public final void mo66498a(int i, String str) {
            OguryError oguryError;
            bbabc.m30943b(str, "error");
            if (i == 0 || (500 <= i && 599 >= i)) {
                oguryError = new OguryError(3, str);
            } else {
                aacab.aaaaa aaaaa = aacab.f25670a;
                oguryError = aacab.aaaaa.m30668a(str);
            }
            aaaaa.m30555a(this.f25575a, oguryError);
            baaba.f25874a.endDataSourceConnections();
            Context context = this.f25576b;
            String message = oguryError.getMessage();
            String a = this.f25575a.f25559b;
            if (message != null && bbabc.m30942a((Object) message, (Object) aacaa.aaaaa.m30667e("assetKey-unknown"))) {
                accba.m30855b(context, a);
            }
            aaaaa aaaaa2 = this.f25575a;
            aaaaa.m30553a(aaaaa2, this.f25576b, aaaaa2.f25559b);
        }

        /* renamed from: a */
        public final void mo66499a(String str) {
            bbabc.m30943b(str, "response");
            abbba.m30720b(abbba.m30741r());
            abbba abbba = abbba.f25716a;
            abbba.m30728f().mo66627a(str, true);
            abbba abbba2 = abbba.f25716a;
            if (abbba.m30740q()) {
                aaaaa.m30552a(this.f25575a, this.f25576b);
            } else {
                aaaaa aaaaa = this.f25575a;
                abbba abbba3 = abbba.f25716a;
                aaaaa.m30555a(aaaaa, abbba.m30732i().mo66630b());
            }
            accba.m30857c(this.f25576b);
            aaaaa aaaaa2 = this.f25575a;
            aaaaa.m30553a(aaaaa2, this.f25576b, aaaaa2.f25559b);
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaba */
    static final class aaaba implements Runnable {

        /* renamed from: a */
        final /* synthetic */ bbaaa f25577a;

        aaaba(bbaaa bbaaa) {
            this.f25577a = bbaaa;
        }

        public final void run() {
            this.f25577a.mo66502a();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaabb */
    static final class aaabb implements Runnable {

        /* renamed from: a */
        final /* synthetic */ aaaaa f25578a;

        /* renamed from: b */
        final /* synthetic */ Context f25579b;

        aaabb(aaaaa aaaaa, Context context) {
            this.f25578a = aaaaa;
            this.f25579b = context;
        }

        public final void run() {
            aaaaa.m30560b(this.f25578a, this.f25579b);
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaabc */
    public static final class aaabc implements abbbb {

        /* renamed from: a */
        final /* synthetic */ aaaaa f25580a;

        /* renamed from: b */
        final /* synthetic */ OguryConsentListener f25581b;

        /* renamed from: com.ogury.cm.internal.aaaaa$aaabc$aaaaa  reason: collision with other inner class name */
        static final class C12476aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaabc f25582a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12476aaaaa(aaabc aaabc) {
                super(0);
                this.f25582a = aaabc;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo66502a() {
                OguryConsentListener oguryConsentListener = this.f25582a.f25581b;
                abbba abbba = abbba.f25716a;
                oguryConsentListener.onComplete(abbba.m30722c().mo66556a());
                return babcc.f25908a;
            }
        }

        /* renamed from: com.ogury.cm.internal.aaaaa$aaabc$aaaab */
        static final class aaaab extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaabc f25583a;

            /* renamed from: b */
            final /* synthetic */ OguryError f25584b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaab(aaabc aaabc, OguryError oguryError) {
                super(0);
                this.f25583a = aaabc;
                this.f25584b = oguryError;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo66502a() {
                this.f25583a.f25581b.onError(this.f25584b);
                return babcc.f25908a;
            }
        }

        aaabc(aaaaa aaaaa, OguryConsentListener oguryConsentListener) {
            this.f25580a = aaaaa;
            this.f25581b = oguryConsentListener;
        }

        /* renamed from: a */
        public final void mo66485a(OguryError oguryError) {
            bbabc.m30943b(oguryError, "error");
            OguryIntegrationLogger.m30997e("[Consent][sync] Failed to sync consent data (" + oguryError.getMessage() + ')');
            this.f25580a.mo66495a(false);
            aaaaa.m30554a(this.f25580a, (bbaaa) new aaaab(this, oguryError));
            aabca aabca = aabca.f25663a;
            aabca.m30654a("ERROR");
        }

        /* renamed from: a */
        public final void mo66486a(String str) {
            bbabc.m30943b(str, "response");
            OguryIntegrationLogger.m30996d("[Consent][sync] Consent data successfully synced!");
            StringBuilder sb = new StringBuilder("[Consent][data] Answer: ");
            abbba abbba = abbba.f25716a;
            sb.append(abbba.m30722c().mo66556a().name());
            OguryIntegrationLogger.m30996d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Consent][data] IAB string: ");
            abbba abbba2 = abbba.f25716a;
            sb2.append(abbba.m30722c().mo66560c().mo66578a());
            OguryIntegrationLogger.m30996d(sb2.toString());
            StringBuilder sb3 = new StringBuilder("[Consent][data] USP string: ");
            abbba abbba3 = abbba.f25716a;
            sb3.append(abbba.m30722c().mo66561d().mo66568a());
            OguryIntegrationLogger.m30996d(sb3.toString());
            StringBuilder sb4 = new StringBuilder("[Consent][data] Has paid: ");
            abbba abbba4 = abbba.f25716a;
            sb4.append(abbba.m30722c().mo66559b());
            OguryIntegrationLogger.m30996d(sb4.toString());
            this.f25580a.mo66495a(false);
            aaaaa.m30554a(this.f25580a, (bbaaa) new C12476aaaaa(this));
            aabca aabca = aabca.f25663a;
            aabca.m30654a("COMPLETE");
        }
    }

    public aaaaa() {
        this((aaaac) null, (babac) null, 3, (bbabb) null);
    }

    private aaaaa(aaaac aaaac2, babac babac) {
        bbabc.m30943b(aaaac2, "clientConsentImplTcf");
        bbabc.m30943b(babac, "clientConsentImplCcpafV1");
        this.f25570m = aaaac2;
        this.f25571n = babac;
        this.f25558a = new bbbbb();
        this.f25559b = "";
        this.f25560c = new Handler(Looper.getMainLooper());
        this.f25561d = ababb.f25701a;
        this.f25563f = new abcba();
        this.f25564g = new baccc();
        this.f25565h = com.ogury.p375cm.aaaac.f25543a;
        abbba abbba = abbba.f25716a;
        this.f25566i = abbba.m30726e();
        this.f25567j = new aaccb(this);
        this.f25569l = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaaaa(aaaac aaaac2, babac babac, int i, bbabb bbabb) {
        this((i & 1) != 0 ? new aaaba() : aaaac2, (i & 2) != 0 ? new babac() : babac);
    }

    /* renamed from: a */
    private final acabb m30548a(Context context) {
        return new aaaac(this, context);
    }

    /* renamed from: a */
    private final void m30550a(Context context, String str, acabc acabc) {
        this.f25568k = true;
        this.f25559b = str;
        aabca aabca = aabca.f25663a;
        aabca.m30654a("ASKING");
        OguryIntegrationLogger.m30996d("[Consent][sync] Syncing...");
        if (bbbbb.m30958a(context)) {
            this.f25567j.mo66537a(context, acabc, new CountDownLatch(2));
            return;
        }
        abbbb abbbb = this.f25562e;
        if (abbbb == null) {
            bbabc.m30941a("consentCallback");
        }
        abbbb.mo66485a(new OguryError(0, "No internet connection"));
    }

    /* renamed from: a */
    private final void m30551a(OguryConsentListener oguryConsentListener) {
        this.f25562e = new aaabc(this, oguryConsentListener);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30552a(aaaaa aaaaa, Context context) {
        aaaaa.f25560c.post(new aaabb(aaaaa, context));
        abbba abbba = abbba.f25716a;
        abbba.m30724d().mo66625a(context);
        aaaaa.f25566i.mo66635a(context, aaaaa.f25559b);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30553a(aaaaa aaaaa, Context context, String str) {
        aaaaa.f25564g.mo66719a(context);
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        try {
            abbba abbba = abbba.f25716a;
            SdkInfo sdkInfo = new SdkInfo("3.3.0", str, abbba.m30738o());
            abbba abbba2 = abbba.f25716a;
            OguryCrashReport.start("consent", context, sdkInfo, new CrashConfig(abbba.m30730g().mo66562a(), context.getPackageName(), 5, 50));
        } catch (Throwable unused) {
            abbbc abbbc = abbbc.f25732a;
            abbbc.m30748b("crash report init failed");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30554a(aaaaa aaaaa, bbaaa bbaaa) {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        bbabc.m30940a((Object) mainLooper, "Looper.getMainLooper()");
        if (bbabc.m30942a((Object) currentThread, (Object) mainLooper.getThread())) {
            bbaaa.mo66502a();
        } else {
            aaaaa.f25560c.post(new aaaba(bbaaa));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30555a(aaaaa aaaaa, OguryError oguryError) {
        abbbb abbbb = aaaaa.f25562e;
        if (abbbb == null) {
            bbabc.m30941a("consentCallback");
        }
        abbbb.mo66485a(oguryError);
    }

    /* renamed from: a */
    private final void m30557a(acabc acabc, Context context) {
        OguryIntegrationLogger.m30996d("[Consent][sync] Syncing consent data from servers...");
        abcba.m30796a(context, this.f25559b, acabc, m30548a(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30558a(OguryError oguryError) {
        baaba.f25874a.endDataSourceConnections();
        abbba abbba = abbba.f25716a;
        if (abbba.m30722c().mo66556a() != OguryChoiceManager.Answer.NO_ANSWER) {
            abbbb abbbb = this.f25562e;
            if (abbbb == null) {
                bbabc.m30941a("consentCallback");
            }
            abbba abbba2 = abbba.f25716a;
            abbbb.mo66486a(abbba.m30722c().mo66556a().toString());
            return;
        }
        abbbb abbbb2 = this.f25562e;
        if (abbbb2 == null) {
            bbabc.m30941a("consentCallback");
        }
        abbbb2.mo66485a(oguryError);
    }

    /* renamed from: b */
    private static void m30559b(Context context) {
        abbba abbba = abbba.f25716a;
        Context applicationContext = context.getApplicationContext();
        bbabc.m30940a((Object) applicationContext, "context.applicationContext");
        String packageName = applicationContext.getPackageName();
        bbabc.m30940a((Object) packageName, "context.applicationContext.packageName");
        abbba.m30725d(packageName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m30560b(com.ogury.p375cm.internal.aaaaa r6, android.content.Context r7) {
        /*
            com.ogury.cm.internal.abbba r0 = com.ogury.p375cm.internal.abbba.f25716a
            java.lang.String r0 = com.ogury.p375cm.internal.abbba.m30735l()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0012
            r0 = r1
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            if (r0 == 0) goto L_0x0068
            boolean r0 = com.ogury.p375cm.internal.bbbbb.m30958a(r7)
            java.lang.String r3 = "consentCallback"
            if (r0 != 0) goto L_0x0030
            com.ogury.cm.internal.abbbb r0 = r6.f25562e
            if (r0 != 0) goto L_0x0024
            com.ogury.p375cm.internal.bbabc.m30941a((java.lang.String) r3)
        L_0x0024:
            com.ogury.core.OguryError r1 = new com.ogury.core.OguryError
            java.lang.String r4 = "No internet connection"
            r1.<init>(r2, r4)
            r0.mo66485a((com.ogury.core.OguryError) r1)
        L_0x002e:
            r1 = r2
            goto L_0x005b
        L_0x0030:
            com.ogury.cm.internal.abbba r0 = com.ogury.p375cm.internal.abbba.f25716a
            java.lang.String r0 = com.ogury.p375cm.internal.abbba.m30733j()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0040
            r0 = r1
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            if (r0 == 0) goto L_0x005b
            com.ogury.cm.internal.abbbb r0 = r6.f25562e
            if (r0 != 0) goto L_0x004a
            com.ogury.p375cm.internal.bbabc.m30941a((java.lang.String) r3)
        L_0x004a:
            com.ogury.core.OguryError r1 = new com.ogury.core.OguryError
            r4 = 4
            java.lang.String r5 = "Missing consent configuration"
            r1.<init>(r4, r5)
            r0.mo66485a((com.ogury.core.OguryError) r1)
            com.ogury.cm.internal.abbbc r0 = com.ogury.p375cm.internal.abbbc.f25732a
            com.ogury.p375cm.internal.abbbc.m30748b(r5)
            goto L_0x002e
        L_0x005b:
            if (r1 == 0) goto L_0x0067
            com.ogury.cm.internal.abbbb r6 = r6.f25562e
            if (r6 != 0) goto L_0x0064
            com.ogury.p375cm.internal.bbabc.m30941a((java.lang.String) r3)
        L_0x0064:
            com.ogury.p375cm.aaaac.m30533a((android.content.Context) r7, (com.ogury.p375cm.internal.abbbb) r6)
        L_0x0067:
            return
        L_0x0068:
            r7 = 0
            r6.m30558a(new com.ogury.core.OguryError(4, "Consent not received"))
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p375cm.internal.aaaaa.m30560b(com.ogury.cm.internal.aaaaa, android.content.Context):void");
    }

    /* renamed from: a */
    public final aaaac mo66490a() {
        return this.f25570m;
    }

    /* renamed from: a */
    public final void mo66491a(Context context, acabc acabc, CountDownLatch countDownLatch) {
        boolean z;
        acabc acabc2;
        bbabc.m30943b(context, "context");
        bbabc.m30943b(acabc, "requestType");
        bbabc.m30943b(countDownLatch, "countDownLatch");
        abbba abbba = abbba.f25716a;
        abbba.m30727e(this.f25569l);
        String str = this.f25559b;
        this.f25566i.mo66636a(str, context);
        this.f25559b = str;
        if (acabc == acabc.EDIT) {
            acabc2 = acabc.EDIT;
        } else {
            String d = accba.m30858d(context);
            boolean z2 = false;
            if (bbcbc.m30979a(d) || (!bbabc.m30942a((Object) d, (Object) this.f25559b))) {
                z = false;
            } else {
                m30558a(new OguryError(1, aacaa.aaaaa.m30667e("assetKey-unknown")));
                z = true;
            }
            if (!z) {
                abbba abbba2 = abbba.f25716a;
                boolean z3 = !abbba.m30731h().after(new Date());
                boolean z4 = baaba.f25874a.tokenExistsForActiveProduct();
                boolean a = accba.m30854a(context);
                boolean z5 = z4 && !a;
                boolean z6 = !z4 && a;
                aacac aacac = aacac.f25671a;
                boolean a2 = bbabc.m30942a((Object) aacac.m30669a("IS_CHILD_UNDER_COPPA"), (Object) Boolean.TRUE);
                aacac aacac2 = aacac.f25671a;
                boolean a3 = bbabc.m30942a((Object) aacac.m30669a("IS_UNDER_AGE_OF_GDPR_CONSENT"), (Object) Boolean.TRUE);
                if (z3 || z5 || z6 || a2 || a3) {
                    z2 = true;
                }
                if (z2) {
                    OguryIntegrationLogger.m30996d("[Consent][sync] Consent cache needs to be synced with servers");
                    acabc2 = acabc.ASK;
                } else {
                    m30558a(new OguryError(4, "Consent not received"));
                    return;
                }
            } else {
                return;
            }
        }
        m30557a(acabc2, context);
    }

    /* renamed from: a */
    public final void mo66492a(Context context, String str, OguryConsentListener oguryConsentListener) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        bbabc.m30943b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m30996d("[Consent] Syncing consent data...");
        if (!this.f25568k) {
            m30559b(context);
            m30551a(oguryConsentListener);
            m30550a(context, str, acabc.ASK);
        }
    }

    /* renamed from: a */
    public final void mo66493a(Context context, CountDownLatch countDownLatch) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(countDownLatch, "countDownLatch");
        ababb.m30698a(context, new aaaab(this, countDownLatch));
        baaba.f25874a.startDataSourceConnections(context);
        baaba.f25874a.queryPurchase(new C12475aaaaa(countDownLatch));
    }

    /* renamed from: a */
    public final void mo66494a(String str) {
        bbabc.m30943b(str, "<set-?>");
        this.f25569l = str;
    }

    /* renamed from: a */
    public final void mo66495a(boolean z) {
        this.f25568k = false;
    }

    /* renamed from: b */
    public final void mo66496b(Context context, String str, OguryConsentListener oguryConsentListener) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        bbabc.m30943b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m30996d("[Consent] Syncing consent data...");
        if (!this.f25568k) {
            m30559b(context);
            m30551a(oguryConsentListener);
            m30550a(context, str, acabc.EDIT);
        }
    }
}
