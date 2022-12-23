package com.ogury.p376ed.internal;

import android.content.Context;
import android.util.Log;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10410cp;
import com.ogury.p376ed.internal.C10420cw;
import com.ogury.p376ed.internal.C10517fc;
import com.ogury.p376ed.internal.C10527fk;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p394io.presage.common.PresageSdkInitCallback;

/* renamed from: com.ogury.ed.internal.de */
public final class C10432de {

    /* renamed from: a */
    public static final C10433a f26377a = new C10433a((byte) 0);

    /* renamed from: b */
    private final C10410cp.C10411a f26378b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10527fk.C10528a f26379c;

    /* renamed from: d */
    private final C10517fc.C10518a f26380d;

    /* renamed from: e */
    private final C10445di f26381e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10531fn f26382f;

    /* renamed from: g */
    private final C10668jp f26383g;

    /* renamed from: h */
    private final C10442df f26384h;

    /* renamed from: i */
    private final C10560gm f26385i;

    /* renamed from: j */
    private final C10428db f26386j;

    /* renamed from: k */
    private final C10424cz f26387k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f26388l;

    /* renamed from: m */
    private List<PresageSdkInitCallback> f26389m;

    /* renamed from: d */
    public static String m31571d() {
        return "4.2.0";
    }

    private C10432de(C10410cp.C10411a aVar, C10527fk.C10528a aVar2, C10517fc.C10518a aVar3, C10445di diVar, C10531fn fnVar, C10668jp jpVar, C10442df dfVar, C10560gm gmVar, C10428db dbVar, C10424cz czVar) {
        C10765mq.m32773b(aVar, "completableFactory");
        C10765mq.m32773b(aVar2, "profigDaoFactory");
        C10765mq.m32773b(aVar3, "profigFactory");
        C10765mq.m32773b(diVar, "measurementsEventsLogger");
        C10765mq.m32773b(fnVar, "profigGateway");
        C10765mq.m32773b(jpVar, "omidSdk");
        C10765mq.m32773b(dfVar, "sdkIntegrationChecker");
        C10765mq.m32773b(gmVar, "topActivityMonitor");
        C10765mq.m32773b(dbVar, "crashReportWrapper");
        C10765mq.m32773b(czVar, "consentEventBus");
        this.f26378b = aVar;
        this.f26379c = aVar2;
        this.f26380d = aVar3;
        this.f26381e = diVar;
        this.f26382f = fnVar;
        this.f26383g = jpVar;
        this.f26384h = dfVar;
        this.f26385i = gmVar;
        this.f26386j = dbVar;
        this.f26387k = czVar;
        List<PresageSdkInitCallback> synchronizedList = Collections.synchronizedList(new LinkedList());
        C10765mq.m32770a((Object) synchronizedList, "synchronizedList(LinkedList())");
        this.f26389m = synchronizedList;
    }

    public /* synthetic */ C10432de() {
        this(C10410cp.f26347a, C10527fk.f26610a, C10517fc.f26576a, C10445di.f26411a, C10531fn.f26635a, C10668jp.f26926a, C10442df.f26404a, C10560gm.f26679a, new C10428db(), C10424cz.f26365a);
    }

    /* renamed from: com.ogury.ed.internal.de$a */
    public static final class C10433a {
        public /* synthetic */ C10433a(byte b) {
            this();
        }

        private C10433a() {
        }
    }

    /* renamed from: a */
    public final void mo67178a(C10423cy cyVar) {
        C10765mq.m32773b(cyVar, "adsConfig");
        OguryIntegrationLogger.m30996d("[Ads][setup] Starting...");
        Context a = cyVar.mo67176a();
        m31555a(a);
        C10442df.m31596a(a);
        int i = this.f26388l;
        if (i == 0 || i == 3) {
            this.f26388l = 2;
            CharSequence b = cyVar.mo67177b();
            if (!(b == null || b.length() == 0)) {
                C10410cp.C10411a.m31506a(new C10436d(this, a, cyVar)).mo67163a((C10730lk<? super Throwable, C10684ke>) new C10437e(this)).mo67164a((C10729lj<C10684ke>) new C10438f(this, a));
                return;
            }
            OguryIntegrationLogger.m30997e("[Ads][setup] Failed to set up (invalid asset key: \"" + cyVar.mo67177b() + "\")");
            Log.e("Presage", "PresageSdk.init() error", new IllegalArgumentException("The api key is null empty. Please provide a valid api key"));
            this.f26388l = 0;
            return;
        }
        OguryIntegrationLogger.m30996d("[Ads][setup] Already setting up or set up");
    }

    /* renamed from: com.ogury.ed.internal.de$d */
    static final class C10436d extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10432de f26392a;

        /* renamed from: b */
        final /* synthetic */ Context f26393b;

        /* renamed from: c */
        final /* synthetic */ C10423cy f26394c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10436d(C10432de deVar, Context context, C10423cy cyVar) {
            super(0);
            this.f26392a = deVar;
            this.f26393b = context;
            this.f26394c = cyVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31584b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m31584b() {
            C10527fk.C10528a unused = this.f26392a.f26379c;
            C10527fk a = C10527fk.C10528a.m31966a(this.f26393b);
            C10432de.m31566b(a, this.f26394c);
            this.f26392a.m31556a(this.f26393b, a);
        }
    }

    /* renamed from: com.ogury.ed.internal.de$e */
    static final class C10437e extends C10766mr implements C10730lk<Throwable, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10432de f26395a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10437e(C10432de deVar) {
            super(1);
            this.f26395a = deVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31586a((Throwable) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m31586a(Throwable th) {
            C10765mq.m32773b(th, "it");
            this.f26395a.f26388l = 3;
            OguryIntegrationLogger.m30997e(C10765mq.m32765a("[Ads][setup] Failed to set up ", (Object) th.getMessage()));
            this.f26395a.m31574g();
        }
    }

    /* renamed from: com.ogury.ed.internal.de$f */
    static final class C10438f extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10432de f26396a;

        /* renamed from: b */
        final /* synthetic */ Context f26397b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10438f(C10432de deVar, Context context) {
            super(0);
            this.f26396a = deVar;
            this.f26397b = context;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31588b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m31588b() {
            OguryIntegrationLogger.m30996d("[Ads][setup] Completed!");
            this.f26396a.f26388l = 1;
            this.f26396a.m31573f();
            this.f26396a.m31563b(this.f26397b);
        }
    }

    /* renamed from: a */
    private final void m31555a(Context context) {
        try {
            this.f26385i.mo67496a(context);
        } catch (Throwable th) {
            C10559gl.m32093a(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31566b(C10527fk fkVar, C10423cy cyVar) {
        String b = cyVar.mo67177b();
        C10765mq.m32769a((Object) b);
        fkVar.mo67401e(b);
    }

    /* renamed from: a */
    public final boolean mo67180a() {
        return this.f26388l == 2;
    }

    /* renamed from: b */
    public final boolean mo67181b() {
        return this.f26388l == 1;
    }

    /* renamed from: e */
    private boolean m31572e() {
        return this.f26388l == 0;
    }

    /* renamed from: c */
    public final boolean mo67182c() {
        return this.f26388l == 3;
    }

    /* renamed from: a */
    public final void mo67179a(PresageSdkInitCallback presageSdkInitCallback) {
        C10765mq.m32773b(presageSdkInitCallback, "presageSdkInitCallback");
        if (mo67181b()) {
            presageSdkInitCallback.onSdkInitialized();
        } else if (mo67180a()) {
            this.f26389m.add(presageSdkInitCallback);
        } else if (m31572e()) {
            presageSdkInitCallback.onSdkNotInitialized();
        } else if (mo67182c()) {
            presageSdkInitCallback.onSdkInitFailed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31556a(Context context, C10527fk fkVar) {
        if (!m31569c(context)) {
            Context applicationContext = context.getApplicationContext();
            String i = fkVar.mo67405i();
            if (!C10765mq.m32772a((Object) i, (Object) "")) {
                C10517fc.C10518a aVar = this.f26380d;
                C10765mq.m32770a((Object) applicationContext, "appContext");
                C10517fc a = aVar.mo67367a(applicationContext);
                a.mo67366b();
                C10424cz.m31540b((C10729lj<C10684ke>) new C10439g(this, a));
                C10445di.m31607a(applicationContext);
                C10428db.m31545a(applicationContext, i);
                return;
            }
            OguryIntegrationLogger.m30997e("[Ads][setup] Failed to set up (invalid asset key: \"" + i + "\")");
            IllegalStateException illegalStateException = new IllegalStateException("There is no api key. Please call PresageSdk.init(context, apiKey) before trying to load or display an ad");
            Log.e("Presage", "Init Error", illegalStateException);
            throw illegalStateException;
        }
        OguryIntegrationLogger.m30997e("[Ads][setup] The app is not in main application process");
        throw new IllegalStateException("The app is not in main application process");
    }

    /* renamed from: com.ogury.ed.internal.de$g */
    static final class C10439g extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10432de f26398a;

        /* renamed from: b */
        final /* synthetic */ C10517fc f26399b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10439g(C10432de deVar, C10517fc fcVar) {
            super(0);
            this.f26398a = deVar;
            this.f26399b = fcVar;
        }

        /* renamed from: b */
        private void m31590b() {
            C10432de.m31565b(this.f26399b);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31590b();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.de$b */
    static final class C10434b extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10517fc f26390a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10434b(C10517fc fcVar) {
            super(0);
            this.f26390a = fcVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31580b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m31580b() {
            this.f26390a.mo67365a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31565b(C10517fc fcVar) {
        C10420cw.C10421a aVar = C10420cw.f26359a;
        C10420cw.C10421a.m31531a(new C10434b(fcVar)).mo67170b(C10435c.f26391a);
    }

    /* renamed from: com.ogury.ed.internal.de$c */
    static final class C10435c extends C10766mr implements C10730lk<C10684ke, C10684ke> {

        /* renamed from: a */
        public static final C10435c f26391a = new C10435c();

        C10435c() {
            super(1);
        }

        /* renamed from: a */
        private static void m31582a(C10684ke keVar) {
            C10765mq.m32773b(keVar, "it");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31582a((C10684ke) obj);
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.de$h */
    static final class C10440h extends C10766mr implements C10729lj<C10530fm> {

        /* renamed from: a */
        final /* synthetic */ C10432de f26400a;

        /* renamed from: b */
        final /* synthetic */ Context f26401b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10440h(C10432de deVar, Context context) {
            super(0);
            this.f26400a = deVar;
            this.f26401b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C10530fm mo67074a() {
            C10531fn unused = this.f26400a.f26382f;
            return C10531fn.m32005a(this.f26401b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m31563b(Context context) {
        C10420cw.C10421a aVar = C10420cw.f26359a;
        C10420cw.C10421a.m31531a(new C10440h(this, context)).mo67170b(new C10441i(this, context));
    }

    /* renamed from: com.ogury.ed.internal.de$i */
    static final class C10441i extends C10766mr implements C10730lk<C10530fm, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10432de f26402a;

        /* renamed from: b */
        final /* synthetic */ Context f26403b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10441i(C10432de deVar, Context context) {
            super(1);
            this.f26402a = deVar;
            this.f26403b = context;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31594a((C10530fm) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m31594a(C10530fm fmVar) {
            C10432de.m31567b(fmVar, this.f26403b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31567b(C10530fm fmVar, Context context) {
        if (fmVar != null && fmVar.mo67420c()) {
            C10668jp.m32617a(context);
        }
    }

    /* renamed from: c */
    private final boolean m31569c(Context context) {
        return !mo67181b() && !C10557gj.m32089a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m31573f() {
        for (PresageSdkInitCallback onSdkInitialized : this.f26389m) {
            onSdkInitialized.onSdkInitialized();
        }
        this.f26389m.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m31574g() {
        for (PresageSdkInitCallback onSdkInitFailed : this.f26389m) {
            onSdkInitFailed.onSdkInitFailed();
        }
        this.f26389m.clear();
    }
}
