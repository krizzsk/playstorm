package com.ironsource.sdk.p293g;

/* renamed from: com.ironsource.sdk.g.d */
public class C8343d {

    /* renamed from: a */
    private boolean f20026a;

    /* renamed from: b */
    private boolean f20027b;

    /* renamed from: c */
    private boolean f20028c;

    /* renamed from: d */
    private String f20029d;

    /* renamed from: e */
    private String f20030e;

    /* renamed from: f */
    private int f20031f;

    /* renamed from: g */
    private int f20032g;

    /* renamed from: h */
    private int f20033h;

    /* renamed from: i */
    private int[] f20034i;

    /* renamed from: j */
    private int[] f20035j;

    /* renamed from: k */
    private int[] f20036k;

    /* renamed from: l */
    private int[] f20037l;

    /* renamed from: com.ironsource.sdk.g.d$a */
    public enum C8344a {
        ;
        

        /* renamed from: a */
        public static final int f20038a = 1;

        /* renamed from: b */
        public static final int f20039b = 2;

        /* renamed from: c */
        public static final int f20040c = 3;

        static {
            f20041d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m23923a() {
            return (int[]) f20041d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$b */
    public enum C8345b {
        None,
        Loaded,
        Ready,
        f20045d
    }

    /* renamed from: com.ironsource.sdk.g.d$c */
    public enum C8346c {
        Web,
        Native
    }

    /* renamed from: com.ironsource.sdk.g.d$d */
    public enum C8347d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);
        

        /* renamed from: d */
        public int f20055d;

        private C8347d(int i) {
            this.f20055d = i;
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$e */
    public enum C8348e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        None
    }

    public C8343d() {
    }

    public C8343d(boolean z, boolean z2, boolean z3, String str, String str2, int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.f20026a = z;
        this.f20027b = z2;
        this.f20028c = z3;
        this.f20029d = str;
        this.f20030e = str2;
        this.f20031f = i;
        this.f20032g = i2;
        this.f20033h = i3;
        this.f20034i = iArr;
        this.f20035j = iArr2;
        this.f20036k = iArr3;
        this.f20037l = iArr4;
    }

    /* renamed from: a */
    public boolean mo56847a() {
        return this.f20026a;
    }

    /* renamed from: b */
    public boolean mo56848b() {
        return this.f20027b;
    }

    /* renamed from: c */
    public boolean mo56849c() {
        return this.f20028c;
    }

    /* renamed from: d */
    public String mo56850d() {
        return this.f20029d;
    }

    /* renamed from: e */
    public String mo56851e() {
        return this.f20030e;
    }

    /* renamed from: f */
    public int mo56852f() {
        return this.f20031f;
    }

    /* renamed from: g */
    public int mo56853g() {
        return this.f20032g;
    }

    /* renamed from: h */
    public int mo56854h() {
        return this.f20033h;
    }

    /* renamed from: i */
    public int[] mo56855i() {
        return this.f20034i;
    }

    /* renamed from: j */
    public int[] mo56856j() {
        return this.f20035j;
    }

    /* renamed from: k */
    public int[] mo56857k() {
        return this.f20036k;
    }

    /* renamed from: l */
    public int[] mo56858l() {
        return this.f20037l;
    }
}
