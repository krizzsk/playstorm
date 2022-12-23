package com.mbridge.msdk.p054c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8400a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.tools.C8582k;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.a */
/* compiled from: Setting */
public final class C2278a {

    /* renamed from: a */
    public static int f4521a = 1500;

    /* renamed from: A */
    private String f4522A = C8487d.m24492a().f20533c;

    /* renamed from: B */
    private String f4523B = C8487d.m24492a().f20534d;

    /* renamed from: C */
    private int f4524C = 120;

    /* renamed from: D */
    private String f4525D = "";

    /* renamed from: E */
    private int f4526E = 1;

    /* renamed from: F */
    private int f4527F = 1;

    /* renamed from: G */
    private int f4528G = 1;

    /* renamed from: H */
    private int f4529H = 0;

    /* renamed from: I */
    private int f4530I = 1;

    /* renamed from: J */
    private int f4531J = 0;

    /* renamed from: K */
    private String f4532K;

    /* renamed from: L */
    private int f4533L = 30;

    /* renamed from: M */
    private int f4534M = 5;

    /* renamed from: N */
    private int f4535N = 0;

    /* renamed from: O */
    private int f4536O = 0;

    /* renamed from: P */
    private int f4537P = 9377;

    /* renamed from: Q */
    private int f4538Q = 0;

    /* renamed from: R */
    private int f4539R = 0;

    /* renamed from: S */
    private int f4540S = 0;

    /* renamed from: T */
    private int f4541T = 2;

    /* renamed from: U */
    private int f4542U = 10;

    /* renamed from: V */
    private String f4543V;

    /* renamed from: W */
    private JSONArray f4544W = new JSONArray();

    /* renamed from: X */
    private JSONArray f4545X = new JSONArray();

    /* renamed from: Y */
    private int f4546Y = 0;

    /* renamed from: Z */
    private int f4547Z = 0;

    /* renamed from: aA */
    private String f4548aA = "";

    /* renamed from: aB */
    private String f4549aB = "";

    /* renamed from: aC */
    private String f4550aC;

    /* renamed from: aD */
    private String f4551aD;

    /* renamed from: aE */
    private int f4552aE = 0;

    /* renamed from: aF */
    private boolean f4553aF = false;

    /* renamed from: aG */
    private int f4554aG = 120;

    /* renamed from: aH */
    private ArrayList<Integer> f4555aH;

    /* renamed from: aI */
    private HashMap<String, String> f4556aI;

    /* renamed from: aJ */
    private int f4557aJ = 0;

    /* renamed from: aK */
    private int f4558aK = 0;

    /* renamed from: aL */
    private int f4559aL = 0;

    /* renamed from: aM */
    private int f4560aM = 0;

    /* renamed from: aN */
    private int f4561aN = 0;

    /* renamed from: aO */
    private int f4562aO = 1;

    /* renamed from: aa */
    private int f4563aa = 0;

    /* renamed from: ab */
    private int f4564ab = 3;

    /* renamed from: ac */
    private int f4565ac = 600;

    /* renamed from: ad */
    private int f4566ad = 10;

    /* renamed from: ae */
    private int f4567ae = 8000;

    /* renamed from: af */
    private int f4568af = 8000;

    /* renamed from: ag */
    private int f4569ag = IronSourceConstants.RV_AUCTION_REQUEST;

    /* renamed from: ah */
    private int f4570ah = f4521a;

    /* renamed from: ai */
    private boolean f4571ai = false;

    /* renamed from: aj */
    private List<Integer> f4572aj = new ArrayList();

    /* renamed from: ak */
    private long f4573ak;

    /* renamed from: al */
    private int f4574al;

    /* renamed from: am */
    private String f4575am = "";

    /* renamed from: an */
    private String f4576an = "";

    /* renamed from: ao */
    private String f4577ao = "";

    /* renamed from: ap */
    private String f4578ap = "";

    /* renamed from: aq */
    private String f4579aq = "";

    /* renamed from: ar */
    private String f4580ar = "";

    /* renamed from: as */
    private String f4581as = "";

    /* renamed from: at */
    private String f4582at = "";

    /* renamed from: au */
    private String f4583au = "";

    /* renamed from: av */
    private String f4584av = "";

    /* renamed from: aw */
    private Map<String, C2279a> f4585aw;

    /* renamed from: ax */
    private int f4586ax = 0;

    /* renamed from: ay */
    private C2280b f4587ay;

    /* renamed from: az */
    private int f4588az = 0;

    /* renamed from: b */
    private int f4589b = 0;

    /* renamed from: c */
    private String f4590c;

    /* renamed from: d */
    private int f4591d;

    /* renamed from: e */
    private long f4592e = 86400;

    /* renamed from: f */
    private long f4593f;

    /* renamed from: g */
    private Map<String, String> f4594g;

    /* renamed from: h */
    private boolean f4595h;

    /* renamed from: i */
    private long f4596i;

    /* renamed from: j */
    private boolean f4597j;

    /* renamed from: k */
    private long f4598k;

    /* renamed from: l */
    private long f4599l;

    /* renamed from: m */
    private long f4600m;

    /* renamed from: n */
    private boolean f4601n;

    /* renamed from: o */
    private int f4602o;

    /* renamed from: p */
    private int f4603p;

    /* renamed from: q */
    private long f4604q;

    /* renamed from: r */
    private int f4605r;

    /* renamed from: s */
    private int f4606s;

    /* renamed from: t */
    private String f4607t;

    /* renamed from: u */
    private int f4608u;

    /* renamed from: v */
    private List<C8400a> f4609v;

    /* renamed from: w */
    private boolean f4610w = false;

    /* renamed from: x */
    private int f4611x = 3;

    /* renamed from: y */
    private boolean f4612y = true;

    /* renamed from: z */
    private int f4613z;

    /* renamed from: a */
    public final void mo15454a(int i) {
        this.f4613z = i;
    }

    /* renamed from: a */
    public final int mo15453a() {
        return this.f4613z;
    }

    /* renamed from: b */
    public final List<C8400a> mo15488b() {
        return this.f4609v;
    }

    /* renamed from: c */
    public final String mo15493c() {
        return this.f4525D;
    }

    /* renamed from: d */
    public final int mo15497d() {
        return this.f4524C;
    }

    /* renamed from: b */
    public final void mo15489b(int i) {
        this.f4524C = i;
    }

    /* renamed from: e */
    public final int mo15502e() {
        return this.f4589b;
    }

    /* renamed from: c */
    public final void mo15494c(int i) {
        this.f4589b = i;
    }

    /* renamed from: f */
    public final int mo15507f() {
        return this.f4569ag;
    }

    /* renamed from: g */
    public final int mo15509g() {
        return this.f4567ae;
    }

    /* renamed from: h */
    public final int mo15511h() {
        return this.f4568af;
    }

    /* renamed from: a */
    public final void mo15457a(boolean z) {
        this.f4571ai = z;
    }

    /* renamed from: i */
    public final boolean mo15513i() {
        return this.f4571ai;
    }

    /* renamed from: j */
    public final int mo15515j() {
        return this.f4547Z;
    }

    /* renamed from: k */
    public final int mo15517k() {
        return this.f4563aa;
    }

    /* renamed from: l */
    public final int mo15519l() {
        return this.f4564ab;
    }

    /* renamed from: m */
    public final int mo15521m() {
        return this.f4565ac;
    }

    /* renamed from: n */
    public final int mo15523n() {
        return this.f4566ad;
    }

    /* renamed from: o */
    public final int mo15525o() {
        return this.f4546Y;
    }

    /* renamed from: p */
    public final JSONArray mo15527p() {
        return this.f4544W;
    }

    /* renamed from: q */
    public final JSONArray mo15529q() {
        return this.f4545X;
    }

    /* renamed from: r */
    public final String mo15531r() {
        return this.f4543V;
    }

    /* renamed from: a */
    public final void mo15456a(String str) {
        this.f4543V = str;
    }

    /* renamed from: d */
    public final void mo15498d(int i) {
        if (i > 0) {
            this.f4542U = i;
        }
    }

    /* renamed from: s */
    public final int mo15533s() {
        return this.f4542U;
    }

    /* renamed from: e */
    public final void mo15503e(int i) {
        this.f4538Q = i;
    }

    /* renamed from: t */
    public final int mo15535t() {
        return this.f4538Q;
    }

    /* renamed from: f */
    public final void mo15508f(int i) {
        this.f4539R = i;
    }

    /* renamed from: u */
    public final int mo15538u() {
        return this.f4539R;
    }

    /* renamed from: g */
    public final void mo15510g(int i) {
        this.f4540S = i;
    }

    /* renamed from: v */
    public final int mo15540v() {
        return this.f4540S;
    }

    /* renamed from: h */
    public final void mo15512h(int i) {
        this.f4541T = i;
    }

    /* renamed from: w */
    public final int mo15542w() {
        return this.f4541T;
    }

    /* renamed from: x */
    public final String mo15544x() {
        return this.f4522A;
    }

    /* renamed from: y */
    public final String mo15546y() {
        return this.f4523B;
    }

    /* renamed from: i */
    public final boolean mo15514i(int i) {
        return this.f4572aj.contains(Integer.valueOf(i));
    }

    /* renamed from: z */
    public final int mo15547z() {
        return this.f4526E;
    }

    /* renamed from: j */
    public final void mo15516j(int i) {
        this.f4526E = i;
    }

    /* renamed from: A */
    public final int mo15427A() {
        return this.f4527F;
    }

    /* renamed from: k */
    public final void mo15518k(int i) {
        this.f4527F = i;
    }

    /* renamed from: B */
    public final int mo15428B() {
        return this.f4528G;
    }

    /* renamed from: l */
    public final void mo15520l(int i) {
        this.f4528G = i;
    }

    /* renamed from: C */
    public final int mo15429C() {
        return this.f4529H;
    }

    /* renamed from: m */
    public final void mo15522m(int i) {
        this.f4529H = i;
    }

    /* renamed from: D */
    public final int mo15430D() {
        return this.f4530I;
    }

    /* renamed from: n */
    public final void mo15524n(int i) {
        this.f4530I = i;
    }

    /* renamed from: E */
    public final int mo15431E() {
        return this.f4531J;
    }

    /* renamed from: o */
    public final void mo15526o(int i) {
        this.f4531J = i;
    }

    /* renamed from: F */
    public final int mo15432F() {
        return this.f4608u;
    }

    /* renamed from: p */
    public final void mo15528p(int i) {
        this.f4608u = i;
    }

    /* renamed from: G */
    public final String mo15433G() {
        return this.f4607t;
    }

    /* renamed from: b */
    public final void mo15491b(String str) {
        this.f4607t = str;
    }

    /* renamed from: H */
    public final int mo15434H() {
        return this.f4606s;
    }

    /* renamed from: I */
    public final int mo15435I() {
        return this.f4605r;
    }

    /* renamed from: J */
    public final long mo15436J() {
        if (this.f4604q <= 0) {
            this.f4604q = 7200;
        }
        return this.f4604q;
    }

    /* renamed from: a */
    public final void mo15455a(long j) {
        this.f4604q = j;
    }

    /* renamed from: K */
    public final int mo15437K() {
        return this.f4574al;
    }

    /* renamed from: q */
    public final void mo15530q(int i) {
        this.f4574al = i;
    }

    /* renamed from: L */
    public final long mo15438L() {
        return this.f4573ak;
    }

    /* renamed from: b */
    public final void mo15490b(long j) {
        this.f4573ak = j;
    }

    /* renamed from: M */
    public final boolean mo15439M() {
        return this.f4601n;
    }

    /* renamed from: b */
    public final void mo15492b(boolean z) {
        this.f4601n = z;
    }

    /* renamed from: N */
    public final long mo15440N() {
        return this.f4600m;
    }

    /* renamed from: O */
    public final boolean mo15441O() {
        return this.f4597j;
    }

    /* renamed from: c */
    public final void mo15496c(boolean z) {
        this.f4597j = z;
    }

    /* renamed from: P */
    public final long mo15442P() {
        return this.f4598k;
    }

    /* renamed from: c */
    public final void mo15495c(long j) {
        this.f4598k = j;
    }

    /* renamed from: d */
    public final void mo15499d(long j) {
        this.f4599l = j;
    }

    public final String toString() {
        return " cfc=" + this.f4591d + " getpf=" + this.f4592e + " rurl=" + this.f4597j;
    }

    /* renamed from: Q */
    public final int mo15443Q() {
        return this.f4591d;
    }

    /* renamed from: r */
    public final void mo15532r(int i) {
        this.f4591d = i;
    }

    /* renamed from: R */
    public final long mo15444R() {
        return this.f4592e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.mbridge.msdk.c.a} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.List<com.mbridge.msdk.foundation.entity.a>] */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:163|164) */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r8.f4571ai = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x0504 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.mbridge.msdk.p054c.C2278a m5142c(java.lang.String r16) {
        /*
            java.lang.String r1 = "omsdkjs_h5_url"
            java.lang.String r2 = "omsdkjs_url"
            java.lang.String r0 = "plctb"
            java.lang.String r3 = "pcrn"
            java.lang.String r4 = "plct"
            java.lang.String r5 = ""
            r6 = 0
            boolean r7 = android.text.TextUtils.isEmpty(r16)     // Catch:{ Exception -> 0x050b }
            if (r7 != 0) goto L_0x050f
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x050b }
            r8 = r16
            r7.<init>(r8)     // Catch:{ Exception -> 0x050b }
            com.mbridge.msdk.c.a r8 = new com.mbridge.msdk.c.a     // Catch:{ Exception -> 0x050b }
            r8.<init>()     // Catch:{ Exception -> 0x050b }
            java.lang.String r9 = "cc"
            java.lang.String r9 = r7.optString(r9)     // Catch:{ Exception -> 0x0508 }
            r8.f4590c = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r9 = "mv_wildcard"
            java.lang.String r10 = "mbridge"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ Exception -> 0x0508 }
            r8.f4607t = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r9 = "cfc"
            int r9 = r7.optInt(r9)     // Catch:{ Exception -> 0x0508 }
            r8.f4591d = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r9 = "getpf"
            long r9 = r7.optLong(r9)     // Catch:{ Exception -> 0x0508 }
            r8.f4592e = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r9 = "current_time"
            long r9 = r7.optLong(r9)     // Catch:{ Exception -> 0x0508 }
            r8.f4596i = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r9 = "cfb"
            boolean r9 = r7.optBoolean(r9)     // Catch:{ Exception -> 0x0508 }
            r8.f4595h = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r9 = "awct"
            long r9 = r7.optLong(r9)     // Catch:{ Exception -> 0x0508 }
            r8.f4599l = r9     // Catch:{ Exception -> 0x0508 }
            long r9 = r7.optLong(r4)     // Catch:{ Exception -> 0x0508 }
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0066
            r9 = 3600(0xe10, double:1.7786E-320)
            goto L_0x006a
        L_0x0066:
            long r9 = r7.optLong(r4)     // Catch:{ Exception -> 0x0508 }
        L_0x006a:
            r8.f4598k = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r4 = "rurl"
            boolean r4 = r7.optBoolean(r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4597j = r4     // Catch:{ Exception -> 0x0508 }
            java.lang.String r4 = "uct"
            long r9 = r7.optLong(r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4600m = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r4 = "ujds"
            boolean r4 = r7.optBoolean(r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4601n = r4     // Catch:{ Exception -> 0x0508 }
            java.lang.String r4 = "n2"
            int r4 = r7.optInt(r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4602o = r4     // Catch:{ Exception -> 0x0508 }
            java.lang.String r4 = "n3"
            int r4 = r7.optInt(r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4603p = r4     // Catch:{ Exception -> 0x0508 }
            java.lang.String r4 = "is_startup_crashsystem"
            int r4 = r7.optInt(r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4608u = r4     // Catch:{ Exception -> 0x0508 }
            int r4 = r7.optInt(r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4605r = r4     // Catch:{ Exception -> 0x0508 }
            long r9 = r7.optLong(r0)     // Catch:{ Exception -> 0x0508 }
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x00ad
            r9 = 7200(0x1c20, double:3.5573E-320)
            goto L_0x00b1
        L_0x00ad:
            long r9 = r7.optLong(r0)     // Catch:{ Exception -> 0x0508 }
        L_0x00b1:
            r8.f4604q = r9     // Catch:{ Exception -> 0x0508 }
            r0 = 100
            int r0 = r7.optInt(r3, r0)     // Catch:{ Exception -> 0x0508 }
            r8.f4605r = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "opent"
            r3 = 1
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4606s = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "sfct"
            r9 = 1800(0x708, double:8.893E-321)
            long r9 = r7.optLong(r0, r9)     // Catch:{ Exception -> 0x0508 }
            r8.f4573ak = r9     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "upgd"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4527F = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "upsrl"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4526E = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "updevid"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4528G = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "sc"
            r4 = 0
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4529H = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "up_tips"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4530I = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "iseu"
            r9 = -1
            int r0 = r7.optInt(r0, r9)     // Catch:{ Exception -> 0x0508 }
            r8.f4531J = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "jm_unit"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x0508 }
            r8.f4532K = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "atf"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x0149
            int r10 = r0.length()     // Catch:{ Exception -> 0x014e }
            if (r10 <= 0) goto L_0x0149
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x014e }
            r6.<init>()     // Catch:{ Exception -> 0x014e }
            r10 = r4
        L_0x011c:
            int r13 = r0.length()     // Catch:{ Exception -> 0x014e }
            if (r10 >= r13) goto L_0x0149
            java.lang.String r13 = r0.optString(r10)     // Catch:{ Exception -> 0x014e }
            boolean r14 = com.mbridge.msdk.foundation.tools.C8556ac.m24738b(r13)     // Catch:{ Exception -> 0x014e }
            if (r14 == 0) goto L_0x0145
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x014e }
            r14.<init>(r13)     // Catch:{ Exception -> 0x014e }
            com.mbridge.msdk.foundation.entity.a r13 = new com.mbridge.msdk.foundation.entity.a     // Catch:{ Exception -> 0x014e }
            java.lang.String r15 = "adtype"
            int r15 = r14.optInt(r15)     // Catch:{ Exception -> 0x014e }
            java.lang.String r3 = "unitid"
            java.lang.String r3 = r14.optString(r3)     // Catch:{ Exception -> 0x014e }
            r13.<init>(r15, r3)     // Catch:{ Exception -> 0x014e }
            r6.add(r13)     // Catch:{ Exception -> 0x014e }
        L_0x0145:
            int r10 = r10 + 1
            r3 = 1
            goto L_0x011c
        L_0x0149:
            if (r6 == 0) goto L_0x0152
            r8.f4609v = r6     // Catch:{ Exception -> 0x014e }
            goto L_0x0152
        L_0x014e:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x0508 }
        L_0x0152:
            java.lang.String r0 = "adct"
            r3 = 259200(0x3f480, float:3.63217E-40)
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4574al = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "confirm_title"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4575am = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "confirm_description"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4576an = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "confirm_t"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4577ao = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "confirm_c_rv"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4578ap = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "confirm_c_play"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4579aq = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "adchoice_icon"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4580ar = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "adchoice_link"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4582at = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "adchoice_size"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4581as = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "platform_logo"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4584av = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "platform_name"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4583au = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "cdnate_cfg"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            java.util.Map r0 = m5143f((java.lang.String) r0)     // Catch:{ Exception -> 0x0508 }
            r8.f4585aw = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "atrqt"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4589b = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "iupdid"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4588az = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "mcs"
            r3 = 120(0x78, float:1.68E-43)
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4524C = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "ab_id"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4525D = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = r7.optString(r2, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4548aA = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = r7.optString(r1, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4549aB = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "rty_tk_clk"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4563aa = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "rty_tk_imp"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4547Z = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "rty_cnt"
            r6 = 3
            int r0 = r7.optInt(r0, r6)     // Catch:{ Exception -> 0x0508 }
            r8.f4564ab = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "rty_to"
            r10 = 600(0x258, float:8.41E-43)
            int r0 = r7.optInt(r0, r10)     // Catch:{ Exception -> 0x0508 }
            r8.f4565ac = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "rty_inr"
            r10 = 10
            int r0 = r7.optInt(r0, r10)     // Catch:{ Exception -> 0x0508 }
            r8.f4566ad = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = r7.optString(r2, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4548aA = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = r7.optString(r1, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4549aB = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "tcto"
            long r0 = r7.optLong(r0)     // Catch:{ Exception -> 0x0508 }
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x022f
            r0 = 10
            r8.f4593f = r0     // Catch:{ Exception -> 0x0508 }
            goto L_0x0263
        L_0x022f:
            r8.f4593f = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "jt"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x0508 }
            if (r0 == 0) goto L_0x0263
            int r1 = r0.length()     // Catch:{ Exception -> 0x0508 }
            if (r1 <= 0) goto L_0x0263
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x0508 }
            r1.<init>()     // Catch:{ Exception -> 0x0508 }
            r2 = r4
        L_0x0245:
            int r11 = r0.length()     // Catch:{ Exception -> 0x0508 }
            if (r2 >= r11) goto L_0x0261
            org.json.JSONObject r11 = r0.optJSONObject(r2)     // Catch:{ Exception -> 0x0508 }
            java.lang.String r12 = "domain"
            java.lang.String r12 = r11.optString(r12)     // Catch:{ Exception -> 0x0508 }
            java.lang.String r13 = "format"
            java.lang.String r11 = r11.optString(r13)     // Catch:{ Exception -> 0x0508 }
            r1.put(r12, r11)     // Catch:{ Exception -> 0x0508 }
            int r2 = r2 + 1
            goto L_0x0245
        L_0x0261:
            r8.f4594g = r1     // Catch:{ Exception -> 0x0508 }
        L_0x0263:
            java.lang.String r0 = "mraid_js"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x0508 }
            r8.f4551aD = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "web_env_url"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x0508 }
            r8.f4550aC = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "alrbs"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r1 = 2
            if (r0 > r1) goto L_0x027e
            if (r0 >= 0) goto L_0x027f
        L_0x027e:
            r0 = r4
        L_0x027f:
            r8.f4552aE = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "GDPR_area"
            boolean r0 = r7.optBoolean(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4553aF = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "ct"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x0508 }
            r8.f4554aG = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "ercd"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x0508 }
            if (r0 == 0) goto L_0x02ca
            int r1 = r0.length()     // Catch:{ Exception -> 0x0508 }
            if (r1 <= 0) goto L_0x02ca
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0508 }
            r1.<init>()     // Catch:{ Exception -> 0x0508 }
            r2 = r4
        L_0x02a5:
            int r3 = r0.length()     // Catch:{ Exception -> 0x0508 }
            if (r2 >= r3) goto L_0x02bb
            int r3 = r0.optInt(r2)     // Catch:{ Exception -> 0x0508 }
            if (r3 == 0) goto L_0x02b8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0508 }
            r1.add(r3)     // Catch:{ Exception -> 0x0508 }
        L_0x02b8:
            int r2 = r2 + 1
            goto L_0x02a5
        L_0x02bb:
            int r0 = r1.size()     // Catch:{ Exception -> 0x0508 }
            if (r0 <= 0) goto L_0x02ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0508 }
            r1.add(r0)     // Catch:{ Exception -> 0x0508 }
            r8.f4555aH = r1     // Catch:{ Exception -> 0x0508 }
        L_0x02ca:
            java.lang.String r0 = "hst"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x0508 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0508 }
            if (r1 != 0) goto L_0x032d
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r0)     // Catch:{ Exception -> 0x0323 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0323 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0323 }
            java.util.Iterator r0 = r1.keys()     // Catch:{ Exception -> 0x0323 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0323 }
            r2.<init>()     // Catch:{ Exception -> 0x0323 }
        L_0x02e8:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x0323 }
            if (r3 == 0) goto L_0x031a
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x0323 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0323 }
            boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0323 }
            if (r9 != 0) goto L_0x02e8
            java.lang.String r9 = r1.optString(r3)     // Catch:{ Exception -> 0x0323 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0323 }
            if (r9 != 0) goto L_0x02e8
            java.lang.String r9 = r1.optString(r3)     // Catch:{ Exception -> 0x0323 }
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r9)     // Catch:{ Exception -> 0x0323 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0323 }
            if (r9 != 0) goto L_0x02e8
            java.lang.String r9 = r1.optString(r3)     // Catch:{ Exception -> 0x0323 }
            r2.put(r3, r9)     // Catch:{ Exception -> 0x0323 }
            goto L_0x02e8
        L_0x031a:
            int r0 = r2.size()     // Catch:{ Exception -> 0x0323 }
            if (r0 <= 0) goto L_0x032d
            r8.f4556aI = r2     // Catch:{ Exception -> 0x0323 }
            goto L_0x032d
        L_0x0323:
            r0 = move-exception
            java.lang.String r1 = "SETTING"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0508 }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)     // Catch:{ Exception -> 0x0508 }
        L_0x032d:
            java.lang.String r0 = "refactor_switch"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x0508 }
            if (r0 == 0) goto L_0x0373
            int r1 = r0.length()     // Catch:{ Exception -> 0x0508 }
            if (r1 <= 0) goto L_0x0373
            r1 = r4
        L_0x033c:
            int r2 = r0.length()     // Catch:{ Exception -> 0x0508 }
            if (r1 >= r2) goto L_0x0373
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x0508 }
            java.util.Iterator r3 = r2.keys()     // Catch:{ Exception -> 0x0508 }
        L_0x034a:
            boolean r9 = r3.hasNext()     // Catch:{ Exception -> 0x0508 }
            if (r9 == 0) goto L_0x0370
            java.lang.Object r9 = r3.next()     // Catch:{ Exception -> 0x0508 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0508 }
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0508 }
            if (r11 != 0) goto L_0x034a
            boolean r11 = r2.getBoolean(r9)     // Catch:{ Exception -> 0x0508 }
            if (r11 == 0) goto L_0x034a
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0508 }
            java.util.List<java.lang.Integer> r11 = r8.f4572aj     // Catch:{ Exception -> 0x0508 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0508 }
            r11.add(r9)     // Catch:{ Exception -> 0x0508 }
            goto L_0x034a
        L_0x0370:
            int r1 = r1 + 1
            goto L_0x033c
        L_0x0373:
            java.lang.String r0 = "lqcnt"
            r1 = 30
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "lqto"
            r2 = 5
            int r1 = r7.optInt(r1, r2)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r2 = "lqswt"
            int r2 = r7.optInt(r2, r4)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r3 = "lqtype"
            int r3 = r7.optInt(r3, r4)     // Catch:{ Exception -> 0x0420 }
            r8.f4534M = r1     // Catch:{ Exception -> 0x0420 }
            r8.f4533L = r0     // Catch:{ Exception -> 0x0420 }
            r8.f4535N = r2     // Catch:{ Exception -> 0x0420 }
            r8.f4536O = r3     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lg_bl"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x0420 }
            if (r0 != 0) goto L_0x03a8
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0420 }
            r0.<init>()     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000088"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
        L_0x03a8:
            r8.f4545X = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lg_wl"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x0420 }
            if (r0 != 0) goto L_0x03cb
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0420 }
            r0.<init>()     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000041"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000042"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000032"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000079"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
        L_0x03cb:
            r8.f4544W = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lg_wl_rt"
            int r0 = r7.optInt(r0)     // Catch:{ Exception -> 0x0420 }
            r8.f4546Y = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "srml"
            r1 = 8000(0x1f40, float:1.121E-41)
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            r8.f4567ae = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lrml"
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            r8.f4568af = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "wgl_d_ms"
            r1 = 1300(0x514, float:1.822E-42)
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            r8.f4569ag = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "dp_ct"
            int r1 = f4521a     // Catch:{ Exception -> 0x0420 }
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            r8.f4570ah = r0     // Catch:{ Exception -> 0x0420 }
            com.mbridge.msdk.click.p058b.C2312a.f4769c = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lqpt"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r0)     // Catch:{ Exception -> 0x0420 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0420 }
            if (r0 <= 0) goto L_0x0420
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 >= r1) goto L_0x0420
            r8.f4537P = r0     // Catch:{ Exception -> 0x0420 }
            com.mbridge.msdk.foundation.same.net.f.d r1 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x0420 }
            r1.f20536f = r0     // Catch:{ Exception -> 0x0420 }
            com.mbridge.msdk.foundation.same.net.f.d r1 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x0420 }
            r1.f20537g = r0     // Catch:{ Exception -> 0x0420 }
        L_0x0420:
            java.lang.String r0 = "wvddt"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4557aJ = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "hst_st"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4522A = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "hst_st_t"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x0508 }
            r8.f4523B = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "l"
            int r0 = r7.optInt(r0, r6)     // Catch:{ Exception -> 0x045c }
            java.lang.String r1 = "k"
            int r1 = r7.optInt(r1, r4)     // Catch:{ Exception -> 0x045c }
            r2 = 1
            if (r1 != r2) goto L_0x0449
            r1 = r2
            goto L_0x044a
        L_0x0449:
            r1 = r4
        L_0x044a:
            java.lang.String r3 = "m"
            int r3 = r7.optInt(r3, r2)     // Catch:{ Exception -> 0x045c }
            if (r3 != r2) goto L_0x0454
            r2 = 1
            goto L_0x0455
        L_0x0454:
            r2 = r4
        L_0x0455:
            r8.f4611x = r0     // Catch:{ Exception -> 0x045c }
            r8.f4610w = r1     // Catch:{ Exception -> 0x045c }
            r8.f4612y = r2     // Catch:{ Exception -> 0x045c }
            goto L_0x0466
        L_0x045c:
            r0 = move-exception
            java.lang.String r1 = "Setting"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0508 }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)     // Catch:{ Exception -> 0x0508 }
        L_0x0466:
            java.lang.String r0 = "fbk_swt"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0508 }
            r8.f4586ax = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "fbk"
            org.json.JSONObject r0 = r7.optJSONObject(r0)     // Catch:{ Exception -> 0x0508 }
            com.mbridge.msdk.c.a$b r0 = com.mbridge.msdk.p054c.C2278a.C2280b.m5269a(r0)     // Catch:{ Exception -> 0x0508 }
            r8.f4587ay = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "ad_connection_timeout"
            int r1 = com.mbridge.msdk.foundation.same.C8413a.f20341w     // Catch:{ Exception -> 0x04e5 }
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r1 = "ad_read_timeout"
            int r2 = com.mbridge.msdk.foundation.same.C8413a.f20342x     // Catch:{ Exception -> 0x04e5 }
            int r1 = r7.optInt(r1, r2)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = "ad_write_timeout"
            int r3 = com.mbridge.msdk.foundation.same.C8413a.f20343y     // Catch:{ Exception -> 0x04e5 }
            int r2 = r7.optInt(r2, r3)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r3 = "ad_retry_count"
            int r6 = com.mbridge.msdk.foundation.same.C8413a.f20344z     // Catch:{ Exception -> 0x04e5 }
            int r3 = r7.optInt(r3, r6)     // Catch:{ Exception -> 0x04e5 }
            if (r0 > 0) goto L_0x049e
            int r0 = com.mbridge.msdk.foundation.same.C8413a.f20341w     // Catch:{ Exception -> 0x04e5 }
        L_0x049e:
            if (r1 > 0) goto L_0x04a2
            int r1 = com.mbridge.msdk.foundation.same.C8413a.f20342x     // Catch:{ Exception -> 0x04e5 }
        L_0x04a2:
            if (r2 > 0) goto L_0x04a6
            int r2 = com.mbridge.msdk.foundation.same.C8413a.f20343y     // Catch:{ Exception -> 0x04e5 }
        L_0x04a6:
            if (r3 >= 0) goto L_0x04aa
            int r3 = com.mbridge.msdk.foundation.same.C8413a.f20344z     // Catch:{ Exception -> 0x04e5 }
        L_0x04aa:
            r8.f4540S = r0     // Catch:{ Exception -> 0x04e5 }
            r8.f4538Q = r1     // Catch:{ Exception -> 0x04e5 }
            r8.f4539R = r2     // Catch:{ Exception -> 0x04e5 }
            r8.f4541T = r3     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "max_download_task_size"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x04e5 }
            if (r0 >= 0) goto L_0x04bb
            r0 = r4
        L_0x04bb:
            r8.f4613z = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "max_bitmap_cache_size"
            int r0 = r7.optInt(r0, r10)     // Catch:{ Exception -> 0x04e5 }
            r8.mo15498d((int) r0)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "t_t"
            int r0 = r7.optInt(r0)     // Catch:{ Exception -> 0x04e5 }
            r8.f4560aM = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "h_t"
            int r0 = r7.optInt(r0)     // Catch:{ Exception -> 0x04e5 }
            r8.f4559aL = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "gtp"
            int r0 = r7.optInt(r0)     // Catch:{ Exception -> 0x04e5 }
            r8.f4561aN = r0     // Catch:{ Exception -> 0x04e5 }
            com.mbridge.msdk.foundation.same.net.f.d r1 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x04e5 }
            r1.mo57592a((int) r0)     // Catch:{ Exception -> 0x04e5 }
        L_0x04e5:
            java.lang.String r0 = "http_track_url"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x04ed }
            r8.f4543V = r0     // Catch:{ Exception -> 0x04ed }
        L_0x04ed:
            java.lang.String r0 = "st_net"
            r1 = 1
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0508 }
            r8.f4562aO = r0     // Catch:{ Exception -> 0x0508 }
            java.lang.String r0 = "check_webview"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0504 }
            if (r0 != 0) goto L_0x0500
            r3 = r4
            goto L_0x0501
        L_0x0500:
            r3 = r1
        L_0x0501:
            r8.f4571ai = r3     // Catch:{ Exception -> 0x0504 }
            goto L_0x0506
        L_0x0504:
            r8.f4571ai = r4     // Catch:{ Exception -> 0x0508 }
        L_0x0506:
            r6 = r8
            goto L_0x050f
        L_0x0508:
            r0 = move-exception
            r6 = r8
            goto L_0x050c
        L_0x050b:
            r0 = move-exception
        L_0x050c:
            r0.printStackTrace()
        L_0x050f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p054c.C2278a.m5142c(java.lang.String):com.mbridge.msdk.c.a");
    }

    /* renamed from: S */
    public final long mo15445S() {
        return this.f4596i;
    }

    /* renamed from: T */
    public final long mo15446T() {
        return this.f4593f * 1000;
    }

    /* renamed from: e */
    public final void mo15504e(long j) {
        this.f4593f = j;
    }

    /* renamed from: a */
    public static String m5141a(Context context, String str) {
        try {
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b == null) {
                return "";
            }
            if (b.f4594g == null) {
                return "";
            }
            String host = Uri.parse(str).getHost();
            for (Map.Entry<String, String> key : b.f4594g.entrySet()) {
                String str2 = (String) key.getKey();
                if (!TextUtils.isEmpty(host) && host.contains(str2)) {
                    String str3 = b.f4594g.get(str2);
                    if (TextUtils.isEmpty(str3)) {
                        return "";
                    }
                    return str3.replace("{gaid}", C8596q.m24839i());
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    public final void mo15501d(boolean z) {
        this.f4595h = z;
    }

    /* renamed from: U */
    public final int mo15447U() {
        return this.f4602o;
    }

    /* renamed from: V */
    public final int mo15448V() {
        return this.f4603p;
    }

    /* renamed from: W */
    public final String mo15449W() {
        return this.f4575am;
    }

    /* renamed from: X */
    public final String mo15450X() {
        return this.f4576an;
    }

    /* renamed from: Y */
    public final String mo15451Y() {
        return this.f4577ao;
    }

    /* renamed from: Z */
    public final String mo15452Z() {
        return this.f4578ap;
    }

    /* renamed from: aa */
    public final String mo15462aa() {
        return this.f4579aq;
    }

    /* renamed from: ab */
    public final void mo15463ab() {
        String language = Locale.getDefault().getLanguage();
        boolean z = true;
        if (!(!TextUtils.isEmpty(this.f4575am) && !TextUtils.isEmpty(this.f4576an) && !TextUtils.isEmpty(this.f4577ao) && !TextUtils.isEmpty(this.f4578ap))) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.f4575am = "Confirm to close? ";
                this.f4576an = "You will not be rewarded after closing the window";
                this.f4577ao = "Close it";
                this.f4578ap = "Continue";
            } else {
                this.f4575am = "确认关闭？";
                this.f4576an = "关闭后您将不会获得任何奖励噢~ ";
                this.f4577ao = "确认关闭";
                this.f4578ap = "继续观看";
            }
        }
        if (TextUtils.isEmpty(this.f4575am) || TextUtils.isEmpty(this.f4576an) || TextUtils.isEmpty(this.f4577ao) || TextUtils.isEmpty(this.f4579aq)) {
            z = false;
        }
        if (z) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.f4575am = "Confirm to close? ";
            this.f4576an = "You will not be rewarded after closing the window";
            this.f4577ao = "Close it";
            this.f4579aq = "Continue";
            return;
        }
        this.f4575am = "确认关闭？";
        this.f4576an = "关闭后您将不会获得任何奖励噢~ ";
        this.f4577ao = "确认关闭";
        this.f4579aq = "继续试玩";
    }

    /* renamed from: ac */
    public final String mo15464ac() {
        return this.f4580ar;
    }

    /* renamed from: ad */
    public final String mo15465ad() {
        return this.f4581as;
    }

    /* renamed from: ae */
    public final String mo15466ae() {
        return this.f4582at;
    }

    /* renamed from: af */
    public final Map<String, C2279a> mo15467af() {
        return this.f4585aw;
    }

    /* renamed from: f */
    private static Map<String, C2279a> m5143f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C2279a aVar = new C2279a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    aVar.mo15549a(optJSONObject);
                }
                hashMap.put(next, aVar);
            }
            return hashMap;
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: ag */
    public final int mo15468ag() {
        return this.f4533L;
    }

    /* renamed from: ah */
    public final int mo15469ah() {
        return this.f4534M;
    }

    /* renamed from: ai */
    public final int mo15470ai() {
        return this.f4535N;
    }

    /* renamed from: aj */
    public final int mo15471aj() {
        return this.f4536O;
    }

    /* renamed from: ak */
    public final boolean mo15472ak() {
        return this.f4610w;
    }

    /* renamed from: al */
    public final int mo15473al() {
        return this.f4611x;
    }

    /* renamed from: am */
    public final boolean mo15474am() {
        return this.f4612y;
    }

    /* renamed from: an */
    public final int mo15475an() {
        return this.f4586ax;
    }

    /* renamed from: ao */
    public final C2280b mo15476ao() {
        return this.f4587ay;
    }

    /* renamed from: com.mbridge.msdk.c.a$b */
    /* compiled from: Setting */
    public static class C2280b {

        /* renamed from: a */
        private String f4618a;

        /* renamed from: b */
        private String f4619b;

        /* renamed from: c */
        private String f4620c;

        /* renamed from: d */
        private JSONArray f4621d;

        /* renamed from: a */
        public static C2280b m5269a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C2280b bVar = new C2280b();
            Context g = C2350a.m5601e().mo15792g();
            bVar.f4618a = jSONObject.optString("title", g.getString(C8594o.m24812a(g, "mbridge_cm_feedback_dialog_title", "string")));
            bVar.f4619b = jSONObject.optString("cancel", g.getString(C8594o.m24812a(g, "mbridge_cm_feedback_dialog_close_close", "string")));
            bVar.f4620c = jSONObject.optString("submit", g.getString(C8594o.m24812a(g, "mbridge_cm_feedback_dialog_close_submit", "string")));
            JSONArray optJSONArray = jSONObject.optJSONArray("content");
            bVar.f4621d = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.f4621d = jSONArray;
                jSONArray.put(g.getString(C8594o.m24812a(g, "mbridge_cm_feedback_dialog_content_stuck", "string")));
                bVar.f4621d.put(g.getString(C8594o.m24812a(g, "mbridge_cm_feedback_dialog_content_cnr", "string")));
                bVar.f4621d.put(g.getString(C8594o.m24812a(g, "mbridge_cm_feedback_dialog_content_balck_screen", "string")));
                bVar.f4621d.put(g.getString(C8594o.m24812a(g, "mbridge_cm_feedback_dialog_content_other", "string")));
            }
            return bVar;
        }

        /* renamed from: a */
        public final String mo15553a() {
            return this.f4618a;
        }

        /* renamed from: b */
        public final String mo15554b() {
            return this.f4619b;
        }

        /* renamed from: c */
        public final String mo15555c() {
            return this.f4620c;
        }

        /* renamed from: d */
        public final JSONArray mo15556d() {
            return this.f4621d;
        }
    }

    /* renamed from: com.mbridge.msdk.c.a$a */
    /* compiled from: Setting */
    public static class C2279a {

        /* renamed from: a */
        private List<String> f4614a;

        /* renamed from: b */
        private List<String> f4615b;

        /* renamed from: c */
        private List<String> f4616c;

        /* renamed from: d */
        private List<String> f4617d;

        /* renamed from: a */
        public final List<String> mo15548a() {
            return this.f4614a;
        }

        /* renamed from: b */
        public final List<String> mo15550b() {
            return this.f4615b;
        }

        /* renamed from: c */
        public final List<String> mo15551c() {
            return this.f4616c;
        }

        /* renamed from: d */
        public final List<String> mo15552d() {
            return this.f4617d;
        }

        /* renamed from: a */
        public final void mo15549a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f4614a = C8582k.m24788a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f4615b = C8582k.m24788a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.f4616c = C8582k.m24788a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.f4617d = C8582k.m24788a(optJSONArray4);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: ap */
    public final String mo15477ap() {
        return this.f4549aB;
    }

    /* renamed from: d */
    public final void mo15500d(String str) {
        this.f4549aB = str;
    }

    /* renamed from: aq */
    public final String mo15478aq() {
        return this.f4548aA;
    }

    /* renamed from: e */
    public final void mo15505e(String str) {
        this.f4548aA = str;
    }

    /* renamed from: ar */
    public final String mo15479ar() {
        return this.f4550aC;
    }

    /* renamed from: as */
    public final String mo15480as() {
        return this.f4551aD;
    }

    /* renamed from: at */
    public final int mo15481at() {
        return this.f4552aE;
    }

    /* renamed from: s */
    public final void mo15534s(int i) {
        this.f4552aE = i;
    }

    /* renamed from: au */
    public final boolean mo15482au() {
        return this.f4553aF;
    }

    /* renamed from: e */
    public final void mo15506e(boolean z) {
        this.f4553aF = z;
    }

    /* renamed from: av */
    public final int mo15483av() {
        return this.f4554aG;
    }

    /* renamed from: t */
    public final void mo15536t(int i) {
        this.f4554aG = i;
    }

    /* renamed from: aw */
    public final ArrayList<Integer> mo15484aw() {
        return this.f4555aH;
    }

    /* renamed from: ax */
    public final HashMap<String, String> mo15485ax() {
        return this.f4556aI;
    }

    /* renamed from: ay */
    public final int mo15486ay() {
        return this.f4557aJ;
    }

    /* renamed from: u */
    public final void mo15539u(int i) {
        this.f4558aK = i;
    }

    /* renamed from: az */
    public final String mo15487az() {
        return this.f4590c;
    }

    /* renamed from: aA */
    public final int mo15458aA() {
        return this.f4559aL;
    }

    /* renamed from: v */
    public final void mo15541v(int i) {
        this.f4559aL = i;
    }

    /* renamed from: aB */
    public final int mo15459aB() {
        return this.f4560aM;
    }

    /* renamed from: w */
    public final void mo15543w(int i) {
        this.f4560aM = i;
    }

    /* renamed from: aC */
    public final int mo15460aC() {
        return this.f4562aO;
    }

    /* renamed from: x */
    public final void mo15545x(int i) {
        this.f4562aO = i;
    }

    /* renamed from: aD */
    public final String mo15461aD() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", this.f4590c);
            jSONObject.put("cfc", this.f4591d);
            jSONObject.put("cfb", this.f4595h);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f4598k);
            jSONObject.put("awct", this.f4599l);
            jSONObject.put("rurl", this.f4597j);
            jSONObject.put("ujds", this.f4601n);
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, this.f4604q);
            jSONObject.put("tcto", this.f4593f);
            jSONObject.put("mv_wildcard", this.f4607t);
            jSONObject.put("is_startup_crashsystem", this.f4608u);
            jSONObject.put("sfct", this.f4573ak);
            jSONObject.put("pcrn", this.f4605r);
            jSONObject.put("adct", this.f4574al);
            jSONObject.put("atrqt", this.f4589b);
            jSONObject.put("omsdkjs_url", this.f4548aA);
            jSONObject.put("mcs", this.f4524C);
            jSONObject.put("GDPR_area", this.f4553aF);
            jSONObject.put("alrbs", this.f4552aE);
            jSONObject.put(UserDataStore.CITY, this.f4554aG);
            jSONObject.put("isDefault", this.f4558aK);
            jSONObject.put("st_net", this.f4562aO);
            return jSONObject.toString();
        } catch (Throwable th) {
            C8608u.m24884d("Setting", th.getMessage());
            return null;
        }
    }
}
