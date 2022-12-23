package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.j */
public class C4292j extends C4287e {

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$a */
    public static /* synthetic */ class C4293a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10628a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10628a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.global.features.C4292j.C4293a.<clinit>():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$b */
    public enum C4294b {
        NONE("none"),
        OPEN("open");
        

        /* renamed from: a */
        public String f10632a;

        /* access modifiers changed from: public */
        C4294b(String str) {
            this.f10632a = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$c */
    public enum C4295c {
        NONE("none"),
        ZOOM_IN("endcard_zoom_in");
        

        /* renamed from: a */
        public String f10636a;

        /* access modifiers changed from: public */
        C4295c(String str) {
            this.f10636a = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$d */
    public enum C4296d {
        LEGACY("legacy");
        

        /* renamed from: a */
        public String f10639a;

        /* access modifiers changed from: public */
        C4296d(String str) {
            this.f10639a = str;
        }
    }

    public C4292j() {
        super("video_player");
    }

    /* renamed from: a */
    public int mo24319a(UnitDisplayType unitDisplayType) {
        if (unitDisplayType == UnitDisplayType.INTERSTITIAL) {
            Integer b = mo24314b("prebuffer_interstitial");
            if (b != null) {
                return b.intValue();
            }
            return 3;
        }
        Integer b2 = mo24314b("prebuffer_rewarded");
        if (b2 != null) {
            return b2.intValue();
        }
        return 3;
    }

    /* renamed from: b */
    public C4287e mo24308b() {
        C4292j jVar = new C4292j();
        mo24312a((C4287e) jVar);
        return jVar;
    }

    /* renamed from: c */
    public boolean mo24320c() {
        return mo24313a("cta_text_all_caps", false);
    }

    /* renamed from: g */
    public C4295c mo24324g() {
        String a = mo24311a("endcard_animation_type", "none");
        for (C4295c cVar : C4295c.values()) {
            if (a.equalsIgnoreCase(cVar.f10636a)) {
                return cVar;
            }
        }
        return C4295c.NONE;
    }

    /* renamed from: d */
    public int mo24321d() {
        Integer b = mo24314b("dl_retries");
        if (b != null) {
            return b.intValue();
        }
        return 10;
    }

    /* renamed from: e */
    public int mo24322e() {
        Integer b = mo24314b("dl_retry_delay");
        if (b != null) {
            return b.intValue();
        }
        return 500;
    }

    /* renamed from: f */
    public int mo24323f() {
        Integer b = mo24314b("endcard_animation_duration");
        int intValue = b != null ? b.intValue() : 500;
        if (intValue < 500 || intValue > 3000) {
            return 500;
        }
        return intValue;
    }

    /* renamed from: h */
    public int mo24325h() {
        Integer b = mo24314b("max_tries");
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }

    /* renamed from: i */
    public int mo24326i() {
        Integer b = mo24314b("second_checkpoint");
        if (b != null) {
            return b.intValue();
        }
        return 25;
    }
}
