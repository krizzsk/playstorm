package com.ogury.p376ed.internal;

import android.content.Context;
import com.vungle.warren.model.VisionDataDBAdapter;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dj */
public final class C10446dj {

    /* renamed from: a */
    public static final C10447a f26413a = new C10447a((byte) 0);

    /* renamed from: b */
    private final C10469dv f26414b;

    /* renamed from: c */
    private final C10462dp f26415c;

    /* renamed from: d */
    private final Context f26416d;

    public /* synthetic */ C10446dj(C10469dv dvVar, C10462dp dpVar, Context context, byte b) {
        this(dvVar, dpVar, context);
    }

    private C10446dj(C10469dv dvVar, C10462dp dpVar, Context context) {
        this.f26414b = dvVar;
        this.f26415c = dpVar;
        this.f26416d = context;
    }

    /* renamed from: com.ogury.ed.internal.dj$a */
    public static final class C10447a {
        public /* synthetic */ C10447a(byte b) {
            this();
        }

        private C10447a() {
        }

        /* renamed from: a */
        public static C10446dj m31617a(Context context) {
            C10765mq.m32773b(context, "context");
            C10470dw dwVar = C10470dw.f26453a;
            return new C10446dj(C10470dw.m31662a(context), new C10462dp(context), context, (byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo67189a(C10444dh dhVar) {
        C10765mq.m32773b(dhVar, "event");
        if (dhVar instanceof C10454dk) {
            m31611a((C10454dk) dhVar);
        } else if (dhVar instanceof C10455dl) {
            m31612a((C10455dl) dhVar);
        } else if (dhVar instanceof C10443dg) {
            m31610a((C10443dg) dhVar);
        }
    }

    /* renamed from: a */
    private final void m31611a(C10454dk dkVar) {
        this.f26414b.mo67206a(m31614b(dkVar), dkVar.mo67190a()).mo67163a((C10730lk<? super Throwable, C10684ke>) new C10450d(C10553gf.f26677a)).mo67164a((C10729lj<C10684ke>) C10451e.f26418a);
    }

    /* renamed from: com.ogury.ed.internal.dj$d */
    /* synthetic */ class C10450d extends C10764mp implements C10730lk<Throwable, C10684ke> {
        C10450d(Object obj) {
            super(1, obj, C10553gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m31621a(Throwable th) {
            C10765mq.m32773b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31621a((Throwable) obj);
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$e */
    static final class C10451e extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        public static final C10451e f26418a = new C10451e();

        C10451e() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo67074a() {
            return C10684ke.f26938a;
        }
    }

    /* renamed from: b */
    private static JSONObject m31614b(C10454dk dkVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", dkVar.mo67188f());
        jSONObject.put("timestamp_diff", 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("content", jSONObject);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m31612a(C10455dl dlVar) {
        this.f26414b.mo67209b(m31615b(dlVar), dlVar.mo67191a().mo67267z()).mo67163a((C10730lk<? super Throwable, C10684ke>) new C10452f(C10553gf.f26677a)).mo67164a((C10729lj<C10684ke>) C10453g.f26419a);
    }

    /* renamed from: com.ogury.ed.internal.dj$f */
    /* synthetic */ class C10452f extends C10764mp implements C10730lk<Throwable, C10684ke> {
        C10452f(Object obj) {
            super(1, obj, C10553gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m31624a(Throwable th) {
            C10765mq.m32773b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31624a((Throwable) obj);
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$g */
    static final class C10453g extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        public static final C10453g f26419a = new C10453g();

        C10453g() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo67074a() {
            return C10684ke.f26938a;
        }
    }

    /* renamed from: a */
    private final String m31609a() {
        String str = this.f26416d.getPackageManager().getPackageInfo(this.f26416d.getPackageName(), 0).versionName;
        C10765mq.m32770a((Object) str, "context.packageManager.g…ckageName, 0).versionName");
        return str;
    }

    /* renamed from: b */
    private final JSONObject m31615b(C10455dl dlVar) {
        C10483eb a = dlVar.mo67191a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", dlVar.mo67188f());
        jSONObject.put("campaign", a.mo67237g());
        jSONObject.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, a.mo67234f());
        jSONObject.put("advert", a.mo67222b());
        jSONObject.put("ad_unit_id", a.mo67249m().mo67292a());
        jSONObject.put("version_publisher_app", m31609a());
        JSONObject a2 = this.f26415c.mo67195a();
        a2.put("content", jSONObject);
        return a2;
    }

    /* renamed from: a */
    private final void m31610a(C10443dg dgVar) {
        this.f26414b.mo67210c(m31613b(dgVar), dgVar.mo67183a().mo67213B()).mo67163a((C10730lk<? super Throwable, C10684ke>) new C10448b(C10553gf.f26677a)).mo67164a((C10729lj<C10684ke>) C10449c.f26417a);
    }

    /* renamed from: com.ogury.ed.internal.dj$b */
    /* synthetic */ class C10448b extends C10764mp implements C10730lk<Throwable, C10684ke> {
        C10448b(Object obj) {
            super(1, obj, C10553gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m31618a(Throwable th) {
            C10765mq.m32773b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31618a((Throwable) obj);
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$c */
    static final class C10449c extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        public static final C10449c f26417a = new C10449c();

        C10449c() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo67074a() {
            return C10684ke.f26938a;
        }
    }

    /* renamed from: b */
    private final JSONObject m31613b(C10443dg dgVar) {
        C10483eb a = dgVar.mo67183a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("campaign_id", a.mo67237g());
        jSONObject.put("advert_id", a.mo67222b());
        jSONObject.put("advertiser_id", a.mo67234f());
        jSONObject.put("ad_unit_id", a.mo67249m().mo67292a());
        jSONObject.put("url", dgVar.mo67184b());
        jSONObject.put("source", dgVar.mo67185c());
        if (dgVar.mo67186d() != null) {
            jSONObject.put("tracker_pattern", dgVar.mo67186d());
        }
        if (dgVar.mo67187e() != null) {
            jSONObject.put("tracker_url", dgVar.mo67187e());
        }
        JSONObject a2 = this.f26415c.mo67195a();
        a2.put("content", jSONObject);
        return a2;
    }
}
