package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5851bc;
import com.inmobi.media.C6042er;
import com.inmobi.media.C6145fs;
import com.inmobi.media.C6318n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p374my.tracker.ads.AdFormat;
import com.smaato.sdk.video.vast.model.C11286Ad;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.squareup.picasso.Picasso;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ad */
/* compiled from: AdUnit */
public abstract class C5762ad extends C6357s implements C5798ai, C5851bc.C5856a, C5896bo, C5983dj, C5999dr, C6145fs.C6148c, C6315k {

    /* renamed from: G */
    private static HashSet<Byte> f14526G = new HashSet<>(Arrays.asList(new Byte[]{(byte) 5, (byte) 53, Byte.valueOf(Ascii.DLE), (byte) 39, Byte.valueOf(Ascii.NAK)}));

    /* renamed from: a */
    static final String f14527a = C5762ad.class.getSimpleName();

    /* renamed from: A */
    private WeakReference<C5780a> f14528A;

    /* renamed from: B */
    private long f14529B = 0;

    /* renamed from: C */
    private HashMap<Integer, Set<C6002du>> f14530C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f14531D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C6337q f14532E;

    /* renamed from: F */
    private C5984dk f14533F;

    /* renamed from: H */
    private String f14534H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C6357s f14535I;

    /* renamed from: b */
    byte f14536b;

    /* renamed from: c */
    C6125fq f14537c;

    /* renamed from: d */
    protected ArrayList<C6337q> f14538d = new ArrayList<>();

    /* renamed from: e */
    long f14539e;

    /* renamed from: f */
    long f14540f = 0;

    /* renamed from: g */
    public C6318n f14541g;

    /* renamed from: h */
    byte f14542h;

    /* renamed from: i */
    public Handler f14543i;

    /* renamed from: j */
    boolean f14544j;

    /* renamed from: k */
    boolean f14545k;

    /* renamed from: l */
    boolean f14546l = false;

    /* renamed from: m */
    boolean f14547m;

    /* renamed from: n */
    C5927cj f14548n;
    /* access modifiers changed from: package-private */

    /* renamed from: o */
    public C5846ba f14549o;

    /* renamed from: p */
    C5849bb f14550p;

    /* renamed from: q */
    boolean f14551q = false;

    /* renamed from: r */
    int f14552r = 0;

    /* renamed from: s */
    int f14553s = 0;

    /* renamed from: t */
    long f14554t = -1;

    /* renamed from: u */
    TreeSet<Integer> f14555u = new TreeSet<>();

    /* renamed from: v */
    boolean f14556v = false;

    /* renamed from: w */
    final C6229hq f14557w;

    /* renamed from: x */
    private WeakReference<Context> f14558x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C6305jh f14559y;

    /* renamed from: z */
    private C5851bc f14560z;

    /* renamed from: com.inmobi.media.ad$a */
    /* compiled from: AdUnit */
    public static abstract class C5780a {
        /* renamed from: a */
        public void mo34580a() {
        }

        /* renamed from: a */
        public void mo34581a(int i, int i2, C6337q qVar) {
        }

        /* renamed from: a */
        public void mo34582a(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: a */
        public void mo34583a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo34584a(C5762ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo34585a(C5762ad adVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo34586a(C5846ba baVar, C5849bb bbVar) {
        }

        /* renamed from: a */
        public void mo34587a(Map<Object, Object> map) {
        }

        /* renamed from: a */
        public void mo34588a(boolean z) {
        }

        /* renamed from: a */
        public void mo34589a(byte[] bArr) {
        }

        /* renamed from: b */
        public void mo34590b() {
        }

        /* renamed from: b */
        public void mo34591b(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: b */
        public void mo34592b(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: b */
        public void mo34593b(C5762ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: b */
        public void mo34594b(Map<Object, Object> map) {
        }

        /* renamed from: c */
        public void mo34595c() {
        }

        /* renamed from: c */
        public void mo34596c(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: d */
        public void mo34597d() {
        }

        /* renamed from: e */
        public void mo34598e() {
        }

        /* renamed from: f */
        public void mo34599f() {
        }

        /* renamed from: g */
        public boolean mo34600g() {
            return true;
        }

        /* renamed from: h */
        public void mo34601h() {
        }

        /* renamed from: i */
        public void mo34602i() {
        }

        /* renamed from: j */
        public void mo34603j() {
        }

        /* renamed from: k */
        public void mo34604k() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo34453P() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo34454Q() {
    }

    /* renamed from: S */
    public abstract void mo34456S();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34478a(C5846ba baVar, boolean z) {
    }

    /* renamed from: a */
    public void mo34482a(C6337q qVar, Context context) {
    }

    /* renamed from: b */
    public boolean mo34506b(C6337q qVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo34528f(C5780a aVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo34531g(C5780a aVar) {
    }

    /* renamed from: k */
    public abstract String mo34539k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract byte mo34541l();

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Integer mo34553w() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x006c, code lost:
        if (r1 != null) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5762ad(android.content.Context r4, com.inmobi.media.C5846ba r5, com.inmobi.media.C5762ad.C5780a r6) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f14538d = r0
            r0 = 0
            r3.f14540f = r0
            r3.f14529B = r0
            r0 = 0
            r3.f14546l = r0
            r3.f14551q = r0
            r3.f14552r = r0
            r3.f14553s = r0
            r1 = -1
            r3.f14554t = r1
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            r3.f14555u = r1
            r3.f14556v = r0
            r1 = 0
            r3.f14534H = r1
            com.inmobi.media.hq r2 = com.inmobi.media.C6229hq.m18582a()
            r3.f14557w = r2
            com.inmobi.media.ad$3 r2 = new com.inmobi.media.ad$3
            r2.<init>()
            r3.f14535I = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            r3.f14558x = r2
            r3.f14549o = r5
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r6)
            r3.f14528A = r4
            java.lang.String r4 = com.inmobi.media.C6227ho.m18559f()
            java.lang.String r5 = "ads"
            com.inmobi.media.fr r4 = com.inmobi.media.C6145fs.m18321a(r5, r4, r3)
            com.inmobi.media.fq r4 = (com.inmobi.media.C6125fq) r4
            r3.f14537c = r4
            com.inmobi.media.ba r4 = r3.f14549o
            java.lang.String r4 = r4.mo34771a()
            java.lang.String r5 = "AerServ"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x006f
            com.inmobi.media.jd r4 = com.inmobi.media.C6295jf.m18826c()
            if (r4 == 0) goto L_0x006c
            com.inmobi.media.jh r1 = r4.mo35520f()
        L_0x006c:
            if (r1 == 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            com.inmobi.media.fq r4 = r3.f14537c
            com.inmobi.media.jh r1 = r4.timeouts
        L_0x0073:
            r3.f14559y = r1
            r3.f14536b = r0
            com.inmobi.media.bc r4 = new com.inmobi.media.bc
            com.inmobi.media.ba r5 = r3.f14549o
            r4.<init>(r3, r3, r5)
            r3.f14560z = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.f14530C = r4
            r4 = -1
            r3.f14542h = r4
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            r3.f14543i = r4
            r3.f14544j = r0
            com.inmobi.media.dk r4 = new com.inmobi.media.dk
            r4.<init>(r3)
            r3.f14533F = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5762ad.<init>(android.content.Context, com.inmobi.media.ba, com.inmobi.media.ad$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34470a(Context context, C5846ba baVar, C5780a aVar) {
        mo34469a(context);
        mo34473a(aVar);
        this.f14549o = baVar;
    }

    /* renamed from: a */
    public void mo34481a(C6144fr frVar) {
        if (frVar instanceof C6125fq) {
            this.f14537c = (C6125fq) frVar;
        }
    }

    /* renamed from: h */
    public final Context mo34533h() {
        WeakReference<Context> weakReference = this.f14558x;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    /* renamed from: a */
    public void mo34469a(Context context) {
        this.f14558x = new WeakReference<>(context);
    }

    /* renamed from: i */
    public final C5846ba mo34535i() {
        return this.f14549o;
    }

    /* renamed from: j */
    public final byte mo34537j() {
        return this.f14536b;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Set<C6002du> m17011f(int i) {
        return this.f14530C.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<String, String> mo34543m() {
        return new HashMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final String mo34544n() {
        C5838au u = mo34551u();
        if (u == null) {
            return "unknown";
        }
        return u.mo34736i();
    }

    /* renamed from: o */
    public final C6125fq mo34545o() {
        return this.f14537c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C5780a mo34546p() {
        C5780a aVar = (C5780a) this.f14528A.get();
        if (aVar == null) {
            C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo34473a(C5780a aVar) {
        this.f14528A = new WeakReference<>(aVar);
    }

    /* renamed from: q */
    public final boolean mo34547q() {
        C5838au u = mo34551u();
        return u != null && u.mo34726a(this.f14537c.mo35324a(mo34539k()).timeToLive);
    }

    /* renamed from: r */
    public final C5851bc mo34548r() {
        if (this.f14560z == null) {
            this.f14560z = new C5851bc(this, this, mo34535i());
        }
        return this.f14560z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[ADDED_TO_REGION] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.inmobi.media.C6286j mo34549s() {
        /*
            r7 = this;
            byte r0 = r7.mo34537j()
            java.lang.String r1 = r7.mo34544n()
            int r2 = r1.hashCode()
            r3 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            r4 = 2
            r5 = 3
            r6 = 1
            if (r2 == r3) goto L_0x0033
            r3 = 3213227(0x3107ab, float:4.50269E-39)
            if (r2 == r3) goto L_0x0029
            r3 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r2 == r3) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.lang.String r2 = "htmlUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003d
            r1 = r6
            goto L_0x003e
        L_0x0029:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003d
            r1 = r4
            goto L_0x003e
        L_0x0033:
            java.lang.String r2 = "inmobiJson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003d
            r1 = r5
            goto L_0x003e
        L_0x003d:
            r1 = -1
        L_0x003e:
            r2 = 0
            if (r1 == r6) goto L_0x0053
            if (r1 == r4) goto L_0x0053
            if (r1 == r5) goto L_0x0046
            return r2
        L_0x0046:
            if (r0 == 0) goto L_0x0052
            if (r6 == r0) goto L_0x0052
            if (r5 == r0) goto L_0x0052
            if (r4 != r0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            com.inmobi.media.n r0 = r7.f14541g
            return r0
        L_0x0052:
            return r2
        L_0x0053:
            if (r0 == 0) goto L_0x005f
            if (r6 == r0) goto L_0x005f
            if (r5 != r0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            com.inmobi.media.q r0 = r7.mo34550t()
            return r0
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5762ad.mo34549s():com.inmobi.media.j");
    }

    /* renamed from: t */
    public C6337q mo34550t() {
        return this.f14538d.get(this.f14553s);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m17014g(int i) {
        C5838au b = mo34496b(i);
        return b != null && b.mo34732e();
    }

    /* renamed from: u */
    public C5838au mo34551u() {
        return mo34496b(0);
    }

    /* renamed from: b */
    public C5838au mo34496b(int i) {
        if (i > 0) {
            C5849bb bbVar = this.f14550p;
            if (bbVar == null) {
                return null;
            }
            return bbVar.mo34812b().get(i);
        }
        C5849bb bbVar2 = this.f14550p;
        if (bbVar2 == null) {
            return null;
        }
        return bbVar2.mo34822l();
    }

    /* renamed from: Y */
    private AdMetaInfo mo34607Y() {
        C5838au u = mo34551u();
        if (u == null) {
            return null;
        }
        return u.mo34734g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34499b(C5780a aVar) {
        AdMetaInfo Y = mo34607Y();
        if (Y == null) {
            mo34465a((byte) 3);
            aVar.mo34583a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        aVar.mo34582a(Y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34511c(C5780a aVar) {
        AdMetaInfo Y = mo34607Y();
        if (Y == null) {
            aVar.mo34584a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            aVar.mo34591b(Y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo34519d(C5780a aVar) {
        AdMetaInfo Y = mo34607Y();
        if (Y == null) {
            mo34474a(aVar, (byte) 85);
        } else {
            aVar.mo34596c(Y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34474a(C5780a aVar, byte b) {
        mo34510c((int) b);
        aVar.mo34580a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r11 = com.inmobi.media.C6227ho.m18551c();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34494a(com.inmobi.media.C5838au r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "creativeType"
            java.lang.String r2 = "omidEnabled"
            java.lang.String r3 = "omsdkInfo"
            java.lang.String r4 = "tracking"
            java.lang.String r5 = "metaInfo"
            java.lang.String r6 = "viewability"
            java.lang.String r7 = "unknown"
            java.lang.String r8 = "reason"
            java.lang.String r9 = "errorCode"
            r11 = 0
            org.json.JSONObject r12 = r19.mo34727b()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            java.lang.String r13 = r19.mo34736i()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            boolean r14 = r7.equals(r13)     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            if (r14 == 0) goto L_0x0024
            return r11
        L_0x0024:
            java.lang.String r14 = r19.mo34737j()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            int r15 = r14.length()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            if (r15 == 0) goto L_0x0047
            java.lang.String r15 = "@__imm_aft@"
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            long r10 = r1.f14539e     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            long r16 = r16 - r10
            java.lang.String r10 = java.lang.String.valueOf(r16)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r10 = r14.replace(r15, r10)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r11 = r19
            r11.mo34728b((java.lang.String) r10)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r10 = 1
            goto L_0x0048
        L_0x0047:
            r10 = 0
        L_0x0048:
            java.lang.String r11 = "mediationJson"
            boolean r11 = r11.equals(r13)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r11 == 0) goto L_0x0051
            return r10
        L_0x0051:
            android.content.Context r11 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r11 != 0) goto L_0x0058
            return r10
        L_0x0058:
            java.util.HashMap<java.lang.Integer, java.util.Set<com.inmobi.media.du>> r13 = r1.f14530C     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r13 != 0) goto L_0x0072
            java.util.HashMap<java.lang.Integer, java.util.Set<com.inmobi.media.du>> r13 = r1.f14530C     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.HashSet r15 = new java.util.HashSet     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r15.<init>()     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r13.put(r14, r15)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
        L_0x0072:
            java.util.HashMap<java.lang.Integer, java.util.Set<com.inmobi.media.du>> r13 = r1.f14530C     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r13 == 0) goto L_0x0135
            boolean r14 = r13.isEmpty()     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x0135
            com.inmobi.media.fq r14 = r1.f14537c     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            com.inmobi.media.fq$m r14 = r14.viewability     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            com.inmobi.media.fq$h r14 = r14.omidConfig     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            boolean r14 = r14.omidEnabled     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x00ec
            boolean r14 = r12.has(r5)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x00ec
            org.json.JSONObject r5 = r12.getJSONObject(r5)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            boolean r14 = r5.has(r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x00ec
            org.json.JSONObject r3 = r5.getJSONObject(r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            boolean r14 = r3.has(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x00ec
            boolean r2 = r3.getBoolean(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r2 == 0) goto L_0x00ec
            boolean r2 = r5.has(r0)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r7 = r5.getString(r0)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
        L_0x00ba:
            android.os.Handler r0 = r1.f14543i     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            com.inmobi.media.ad$1 r2 = new com.inmobi.media.ad$1     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r2.<init>(r11)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r0.post(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            com.inmobi.media.du r0 = new com.inmobi.media.du     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r2 = 3
            r0.<init>(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r2 = "isolateVerificationScripts"
            boolean r2 = r3.optBoolean(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r5 = "customReferenceData"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r11 = "macros"
            org.json.JSONObject r11 = r3.optJSONObject(r11)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r14 = "impressionType"
            int r3 = r3.optInt(r14)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            byte r3 = (byte) r3     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.Map r2 = com.inmobi.media.C5762ad.C5781b.m17180a(r7, r5, r2, r11, r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r0.f15270b = r2     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r13.add(r0)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
        L_0x00ec:
            boolean r0 = r12.has(r6)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x011b
            org.json.JSONArray r0 = r12.getJSONArray(r6)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.Map r0 = m16999a((org.json.JSONArray) r0)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x011b
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r2 != 0) goto L_0x011b
            com.inmobi.media.du r2 = new com.inmobi.media.du     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r3 = 2
            r2.<init>(r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r2.f15270b = r0     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.HashMap<java.lang.Integer, java.util.Set<com.inmobi.media.du>> r0 = r1.f14530C     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x011b
            r0.add(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
        L_0x011b:
            boolean r0 = r12.has(r4)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "web"
            java.lang.String r2 = r12.getString(r4)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x0135
            r2 = 0
            r1.f14542h = r2     // Catch:{ JSONException -> 0x0133, IllegalArgumentException -> 0x0131 }
            goto L_0x0135
        L_0x0131:
            r0 = move-exception
            goto L_0x013f
        L_0x0133:
            r0 = move-exception
            goto L_0x0165
        L_0x0135:
            r11 = r10
            goto L_0x0189
        L_0x0137:
            r0 = move-exception
            r2 = 0
            goto L_0x013f
        L_0x013a:
            r0 = move-exception
            r2 = 0
            goto L_0x0165
        L_0x013d:
            r0 = move-exception
            r2 = r11
        L_0x013f:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r3.put(r9, r4)
            java.lang.String r4 = r0.getMessage()
            r3.put(r8, r4)
            r1.mo34504b((java.util.Map<java.lang.String, java.lang.Object>) r3)
            com.inmobi.media.gg r3 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r4 = new com.inmobi.media.hg
            r4.<init>(r0)
            r3.mo35357a((com.inmobi.media.C6217hg) r4)
            goto L_0x0188
        L_0x0163:
            r0 = move-exception
            r2 = r11
        L_0x0165:
            com.inmobi.media.gg r3 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r4 = new com.inmobi.media.hg
            r4.<init>(r0)
            r3.mo35357a((com.inmobi.media.C6217hg) r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r3.put(r9, r4)
            java.lang.String r0 = r0.getMessage()
            r3.put(r8, r0)
            r1.mo34504b((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0188:
            r11 = r2
        L_0x0189:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5762ad.mo34494a(com.inmobi.media.au, int):boolean");
    }

    /* renamed from: a */
    private static Map<String, Object> m16999a(JSONArray jSONArray) {
        JSONObject jSONObject;
        try {
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    jSONObject = null;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("inmobi")) {
                    jSONObject = jSONObject2.getJSONObject("inmobi");
                    break;
                }
                i++;
            }
            if (jSONObject == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("frame", jSONObject.optJSONArray("frame"));
            int c = mo34617c(jSONObject.optString("time"));
            if (c != -1) {
                hashMap.put("time", Integer.valueOf(c));
            }
            int c2 = mo34617c(jSONObject.optString("view"));
            if (c2 != -1) {
                hashMap.put("view", Integer.valueOf(c2));
            }
            int c3 = mo34617c(jSONObject.optString("pixel"));
            if (c3 != -1) {
                hashMap.put("pixel", Integer.valueOf(c3));
            }
            int optInt = jSONObject.optInt("type");
            if (optInt != -1) {
                hashMap.put("type", Integer.valueOf(optInt));
            }
            return hashMap;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    /* renamed from: c */
    private static int mo34617c(String str) {
        if (str.startsWith("track_")) {
            str = str.substring(6);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo34500b(C5849bb bbVar) {
        if (mo34537j() == 1) {
            this.f14550p = bbVar;
            this.f14556v = bbVar.mo34814d();
            this.f14538d = new ArrayList<>(this.f14550p.mo34812b().size());
            for (int i = 0; i < this.f14550p.mo34812b().size(); i++) {
                this.f14538d.add((Object) null);
            }
            C5838au l = bbVar.mo34822l();
            if (l == null) {
                mo34492a(false, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            this.f14557w.mo35434a(hashCode(), new C5824ar(this, l, bbVar, false, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR)));
        }
    }

    /* renamed from: a */
    public final void mo34472a(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z, byte b) {
        if (mo34537j() == 1 && z) {
            this.f14536b = 3;
        }
        C5780a p = mo34546p();
        if (p != null) {
            p.mo34584a(this, inMobiAdRequestStatus);
        }
        if (f14526G.contains(Byte.valueOf(b))) {
            mo34497b(b);
        } else if (b != 0) {
            mo34465a(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34491a(boolean z) {
        C5838au b;
        List<String> c;
        try {
            int i = this.f14552r;
            Context h = mo34533h();
            if (h != null) {
                try {
                    if (this.f14538d.get(i) == null || this.f14538d.get(i).f16119q.get()) {
                        C5838au b2 = mo34496b(i);
                        C6337q qVar = new C6337q(h, mo34541l(), this.f14530C.get(Integer.valueOf(i)), b2 == null ? null : b2.mo34733f(), Boolean.FALSE, b2.mo34748u() != null ? b2.mo34748u() : "DEFAULT");
                        if (b2 != null) {
                            qVar.f16126x = b2.mo34749v();
                            qVar.setMarkupType(b2.mo34736i());
                        }
                        this.f14538d.set(i, qVar);
                        if (this.f14549o.mo34788l().equals(AdFormat.BANNER)) {
                            qVar.setAdSize(this.f14549o.mo34789m());
                        }
                        qVar.mo35608a(this, mo34545o(), mo34458U(), true);
                        qVar.setAdPodHandler(this);
                        qVar.setPlacementId(this.f14549o.mo34779e());
                        qVar.setAllowAutoRedirection(m17014g(i));
                        qVar.setContentUrl(this.f14549o.mo34783h());
                        AdMetaInfo Y = mo34607Y();
                        if (Y != null) {
                            qVar.setCreativeId(Y.getCreativeID());
                        }
                        if (this.f14549o.mo34781f()) {
                            qVar.mo35497a();
                        }
                    }
                } catch (Exception e) {
                    mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                }
            }
            if (!z || mo34525e((byte) 2)) {
                this.f14550p.mo34812b().get(this.f14552r).mo34733f();
                C6337q qVar2 = this.f14538d.get(this.f14552r);
                if (qVar2 != null) {
                    if (qVar2.getMarkupType().equals(TJAdUnitConstants.String.HTML)) {
                        qVar2.mo35610a(mo34463a(this.f14552r));
                    } else if (qVar2.getMarkupType().equals("htmlUrl")) {
                        qVar2.mo35613b(mo34463a(this.f14552r));
                    }
                }
                mo34542l(qVar2);
                if (qVar2 != null && qVar2.getMarkupType().equals("htmlUrl") && (b = mo34496b(this.f14538d.indexOf(qVar2))) != null && (c = b.mo34730c(C5838au.LOAD_AD_TOKEN_URL)) != null) {
                    for (String a : c) {
                        C5874bk.m17607a().mo34847a(a, true);
                    }
                }
            }
        } catch (Exception e2) {
            mo34527f((byte) 2);
            C6238hu.m18605a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
            C6181gg.m18398a().mo35357a(new C6217hg(e2));
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
        }
    }

    /* renamed from: b */
    public void mo34501b(String str) {
        this.f14549o.mo34774b(str);
    }

    /* renamed from: a */
    public void mo34489a(Map<String, String> map) {
        this.f14549o.mo34775b(map);
    }

    /* renamed from: v */
    public Map<String, String> mo34552v() {
        return this.f14549o.mo34776c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo34554x() {
        try {
            RecyclerView.class.getName();
            Picasso.class.getName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* renamed from: a */
    public void mo34490a(final JSONObject jSONObject) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C5762ad.this.f14557w.mo35434a(C5762ad.this.hashCode(), new C5782ae(C5762ad.this, jSONObject));
            }
        });
    }

    /* renamed from: y */
    public void mo34555y() {
        this.f14540f = SystemClock.elapsedRealtime();
        if (!C6239hv.m18616a()) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, (byte) 5);
        } else {
            mo34608Z();
        }
    }

    /* renamed from: a */
    public void mo34493a(byte[] bArr) {
        if (!mo34438A()) {
            if (bArr == null || bArr.length == 0) {
                mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (byte) 3);
                return;
            }
            if (this.f14548n == null) {
                this.f14548n = new C5927cj(this);
            }
            this.f14536b = 1;
            this.f14557w.mo35434a(hashCode(), new C5813an(this, this.f14548n, bArr, mo34535i().mo34779e()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34512c(C5849bb bbVar) {
        mo34480a(bbVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34556z() {
        /*
            r6 = this;
            com.inmobi.media.ad$a r0 = r6.mo34546p()
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = r6.f14547m
            r4 = 1
            if (r3 == 0) goto L_0x0017
            r0 = 2
            java.lang.String r3 = "InMobi"
            java.lang.String r5 = "getSignals() call is already in progress. Please wait for its execution to get complete"
            com.inmobi.media.C6238hu.m18605a((byte) r0, (java.lang.String) r3, (java.lang.String) r5)
        L_0x0015:
            r0 = r4
            goto L_0x0030
        L_0x0017:
            boolean r3 = r6.mo34554x()
            if (r3 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x0029
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r5 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES
            r3.<init>(r5)
            r0.mo34592b((com.inmobi.ads.InMobiAdRequestStatus) r3)
        L_0x0029:
            r0 = 39
            r6.mo34466a((int) r0, (long) r1)
            goto L_0x0015
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0033
            return
        L_0x0033:
            r6.f14547m = r4
            com.inmobi.media.cj r0 = r6.f14548n
            if (r0 != 0) goto L_0x0040
            com.inmobi.media.cj r0 = new com.inmobi.media.cj
            r0.<init>(r6)
            r6.f14548n = r0
        L_0x0040:
            com.inmobi.media.hq r0 = r6.f14557w
            int r3 = r6.hashCode()
            com.inmobi.media.aj r4 = new com.inmobi.media.aj
            r4.<init>(r6, r1)
            r0.mo35434a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5762ad.mo34556z():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo34438A() {
        if (!C6239hv.m18616a()) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, (byte) 5);
            return true;
        } else if (!C6256ie.m18678h()) {
            mo34441D();
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), false, (byte) Ascii.NAK);
            return true;
        } else if (mo34554x()) {
            mo34539k();
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (byte) 39);
            return true;
        } else {
            byte b = this.f14536b;
            if (b == 1) {
                mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (byte) 53);
                return true;
            } else if (b != 7) {
                return false;
            } else {
                mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (byte) Ascii.f17944SI);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final byte mo34521e(C5780a aVar) {
        C6000ds dsVar;
        final WeakReference weakReference = new WeakReference(aVar);
        try {
            byte l = mo34541l();
            JSONObject jSONObject = new JSONObject(mo34463a(0));
            C6125fq o = mo34545o();
            HashMap<String, String> a = this.f14550p == null ? null : C6239hv.m18612a(this.f14550p.mo34823m());
            C5838au u = mo34551u();
            if (u != null) {
                if (u instanceof C5893bl) {
                    C5893bl blVar = (C5893bl) u;
                    C5858be.m17531a();
                    C5839av b = C5858be.m17534b(blVar.f14874a);
                    if (b == null || !b.mo34750a()) {
                        throw new IllegalStateException("Asset not available in cache");
                    }
                    dsVar = new C6000ds(b.f14716e, blVar.f14875b, blVar.f14876c, blVar.f14877d, blVar.f14878e, mo34545o().vastVideo);
                } else {
                    dsVar = null;
                }
                C5907bx bxVar = new C5907bx((int) l, jSONObject, o, a, dsVar);
                C5838au u2 = mo34551u();
                if (!bxVar.mo34900d() || mo34533h() == null || u2 == null) {
                    return Ascii.DC4;
                }
                C6318n a2 = C6318n.C6330b.m18993a(mo34533h(), mo34541l(), bxVar, u2.mo34733f(), m17011f(0), mo34545o(), this.f14549o.mo34779e(), m17014g(0), u2.mo34747t());
                a2.mo35559a((C6318n.C6331c) new C6318n.C6331c() {
                    /* renamed from: a */
                    public final void mo34564a() {
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                C5762ad.this.mo34474a(aVar, (byte) 91);
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo34567b() {
                        C5762ad.this.mo34527f((byte) 4);
                        if (!C5762ad.this.f14546l) {
                            C5762ad.this.f14543i.post(new Runnable() {
                                public final void run() {
                                    C5762ad.this.mo34528f((C5780a) weakReference.get());
                                }
                            });
                        }
                    }

                    /* renamed from: c */
                    public final void mo34568c() {
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34590b();
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: d */
                    public final void mo34569d() {
                        C6238hu.m18605a((byte) 2, "InMobi", "Successfully impressed ad for placement id: " + C5762ad.this.f14549o.toString());
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34598e();
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: e */
                    public final void mo34570e() {
                        C6238hu.m18605a((byte) 2, "InMobi", "Ad interaction for placement id: " + C5762ad.this.f14549o.toString());
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34587a((Map<Object, Object>) new HashMap());
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: f */
                    public final void mo34571f() {
                        if (!C5762ad.this.f14546l) {
                            C6238hu.m18605a((byte) 2, "InMobi", "Ad dismissed for placement id: " + C5762ad.this.f14549o.toString());
                            C5762ad.this.f14543i.post(new Runnable() {
                                public final void run() {
                                    C5762ad.this.mo34531g((C5780a) weakReference.get());
                                }
                            });
                        }
                    }

                    /* renamed from: a */
                    public final void mo34565a(Map<String, String> map) {
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34594b((Map<Object, Object>) new HashMap(map));
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: g */
                    public final void mo34572g() {
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34597d();
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: h */
                    public final void mo34573h() {
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34599f();
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: i */
                    public final void mo34574i() {
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34601h();
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo34566a(boolean z) {
                        if (!C5762ad.this.f14546l) {
                            C5780a aVar = (C5780a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34588a(z);
                            } else {
                                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }
                });
                this.f14541g = a2;
                return 0;
            }
            throw new IllegalStateException("No ad");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return Ascii.f17935CR;
        } catch (IllegalStateException unused) {
            return 83;
        } catch (Exception e2) {
            C6181gg.m18398a().mo35357a(new C6217hg(e2));
            return 88;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo34439B() {
        C6286j s = mo34549s();
        if (s != null) {
            s.mo35498a((byte) 2, (Map<String, String>) null);
        }
    }

    /* renamed from: C */
    public C5930cm mo34440C() {
        String str = this.f14537c.url;
        C6271ir irVar = new C6271ir(this.f14537c.mo35330f());
        C5858be.m17531a();
        C5930cm cmVar = new C5930cm(str, irVar, C5858be.m17539e(), this.f14549o);
        cmVar.f15031c = this.f14549o.mo34777d();
        cmVar.f15030b = mo34539k();
        cmVar.f15029a = "unifiedSdkJson";
        cmVar.f15032d = mo34543m();
        cmVar.f15712l = this.f14537c.fetchTimeout * 1000;
        cmVar.f15713m = this.f14537c.fetchTimeout * 1000;
        cmVar.mo35386a(this.f14537c.rendering.enablePubMuteControl && C6227ho.m18558e());
        cmVar.f15033e = this.f14549o.mo34782g();
        return cmVar;
    }

    /* renamed from: D */
    public void mo34441D() {
        if (!this.f14546l) {
            this.f14546l = true;
            mo34442E();
            this.f14530C.clear();
            mo34443F();
            this.f14536b = 0;
            this.f14557w.mo35433a(hashCode());
            this.f14531D = false;
            this.f14532E = null;
            this.f14544j = false;
            this.f14545k = false;
            this.f14547m = false;
            this.f14550p = null;
            this.f14556v = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo34443F() {
        int i;
        C6318n nVar = this.f14541g;
        if (nVar != null) {
            nVar.destroy();
            this.f14541g = null;
        }
        if (this.f14553s >= 0 && this.f14538d.size() > (i = this.f14553s) && this.f14538d.get(i) != null) {
            mo34518d(this.f14553s);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo34538j(C6337q qVar) {
        this.f14538d.indexOf(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo34540k(C6337q qVar) {
        this.f14538d.indexOf(qVar);
        if (qVar != null && qVar.getMarkupType().equals("htmlUrl")) {
            m17015m(qVar);
        }
        mo34465a((byte) Ascii.SYN);
    }

    /* renamed from: e */
    public void mo34524e(C6337q qVar) {
        this.f14538d.indexOf(qVar);
    }

    /* renamed from: f */
    public void mo34529f(C6337q qVar) {
        this.f14538d.indexOf(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo34444G() {
        if (2 == mo34537j()) {
            mo34527f((byte) 2);
            this.f14536b = 3;
            mo34465a((byte) 42);
            if (mo34546p() != null) {
                mo34546p().mo34584a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34471a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (mo34445H()) {
            try {
                C6337q M = mo34450M();
                if (M != null) {
                    M.stopLoading();
                    return;
                }
                C6286j s = mo34549s();
                if (s instanceof C6337q) {
                    ((C6337q) s).stopLoading();
                }
                this.f14536b = 3;
                mo34465a((byte) 41);
                if (mo34546p() != null) {
                    mo34546p().mo34584a(this, inMobiAdRequestStatus);
                }
            } catch (Exception e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo34445H() {
        return mo34537j() == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo34446I() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14540f));
        hashMap.put("markupType", mo34544n());
        m17006c((Map<String, Object>) hashMap);
        mo34514c("AdLoadSuccessful", hashMap);
    }

    /* renamed from: c */
    private void m17006c(Map<String, Object> map) {
        map.put(C11286Ad.AD_TYPE, mo34539k());
        map.put("networkType", C6251ib.m18652b());
        map.put("plId", Long.valueOf(this.f14549o.mo34779e()));
        map.put("plType", this.f14549o.mo34792p());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34465a(byte b) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14540f));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(b));
        hashMap.put("markupType", mo34544n());
        m17006c((Map<String, Object>) hashMap);
        m17009d((Map<String, Object>) hashMap);
        mo34514c("AdLoadFailed", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo34447J() {
        HashMap hashMap = new HashMap();
        m17006c((Map<String, Object>) hashMap);
        mo34514c("AdLoadCalled", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34497b(byte b) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(b));
        m17006c((Map<String, Object>) hashMap);
        mo34514c("AdLoadDroppedAtSDK", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34504b(Map<String, Object> map) {
        if (this.f14560z != null) {
            if (map.get(IronSourceConstants.EVENTS_ERROR_REASON) == null) {
                map.put(IronSourceConstants.EVENTS_ERROR_REASON, "");
            }
            m17009d(map);
            this.f14560z.mo34827a(map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34466a(int i, long j) {
        this.f14547m = false;
        HashMap hashMap = new HashMap();
        hashMap.put(C11286Ad.AD_TYPE, mo34539k());
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
        hashMap.put("networkType", C6251ib.m18652b());
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo34514c("AdGetSignalsFailed", hashMap);
    }

    /* renamed from: K */
    public void mo34448K() {
        this.f14529B = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("markupType", mo34544n());
        m17006c((Map<String, Object>) hashMap);
        mo34514c("AdShowCalled", hashMap);
    }

    /* renamed from: L */
    public void mo34449L() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14529B));
        hashMap.put("markupType", mo34544n());
        m17006c((Map<String, Object>) hashMap);
        mo34514c("AdShowSuccessful", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34510c(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14529B));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("markupType", mo34544n());
        m17006c((Map<String, Object>) hashMap);
        m17009d((Map<String, Object>) hashMap);
        mo34514c("AdShowFailed", hashMap);
    }

    /* renamed from: d */
    private void m17009d(Map<String, Object> map) {
        C5838au u = mo34551u();
        if (u != null) {
            map.put("creativeId", "\"" + u.mo34747t() + "\"");
            map.put("impressionId", "\"" + u.mo34733f() + "\"");
        }
    }

    /* renamed from: a */
    public void mo34486a(String str, Map<String, Object> map) {
        mo34514c(str, map);
    }

    /* renamed from: b */
    public final void mo34502b(String str, Map<String, Object> map) {
        mo34514c(str, map);
    }

    /* renamed from: c */
    public void mo34514c(String str, Map<String, Object> map) {
        C6218hh.m18506a().mo35424a(str, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34475a(C5838au auVar) {
        VerificationScriptResource verificationScriptResource;
        C5838au auVar2 = auVar;
        Context h = mo34533h();
        if (mo34545o().viewability.omidConfig.omidEnabled && C6042er.C6043a.f15376a.mo35170a()) {
            boolean z = auVar2 instanceof C5893bl;
            for (C6002du next : m17011f(0)) {
                if (3 == next.f15269a) {
                    if ("video" != next.f15270b.get(StaticResource.CREATIVE_TYPE) || !z) {
                        m17000a(h, next);
                    } else {
                        C5893bl blVar = (C5893bl) auVar2;
                        try {
                            C5907bx bxVar = new C5907bx((int) mo34541l(), new JSONObject(mo34463a(0)), mo34545o(), this.f14550p == null ? null : C6239hv.m18612a(this.f14550p.mo34823m()), new C6000ds(blVar.f14874a, blVar.f14875b, blVar.f14876c, blVar.f14877d, blVar.f14878e, mo34545o().vastVideo));
                            C5923cg cgVar = (C5923cg) bxVar.mo34899c(ShareConstants.VIDEO_URL).get(0);
                            if (h != null) {
                                ArrayList arrayList = new ArrayList();
                                for (C5922cf next2 : cgVar.f14912u) {
                                    if ("OMID_VIEWABILITY".equals(next2.f15004d) && (next2 instanceof C6036em)) {
                                        C6036em emVar = (C6036em) next2;
                                        Map map = (Map) next.mo35113a("macros", Map.class);
                                        String d = m17008d(emVar.f15357g, map);
                                        String str = emVar.f15358h;
                                        String d2 = m17008d(emVar.f15002b, map);
                                        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(str)) {
                                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(d2));
                                        } else {
                                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(d2), d);
                                        }
                                        arrayList.add(verificationScriptResource);
                                    }
                                }
                                if (arrayList.size() != 0) {
                                    C5901bt a = m16997a(bxVar);
                                    if (a != null) {
                                        next.f15270b.put("videoSkippable", Boolean.TRUE);
                                        next.f15270b.put("videoSkipOffset", Integer.valueOf(a.f14906o));
                                    } else {
                                        next.f15270b.put("videoSkippable", Boolean.FALSE);
                                        next.f15270b.put("videoSkipOffset", 0);
                                    }
                                    next.f15270b.put("videoAutoPlay", cgVar.f14913v.get("shouldAutoPlay"));
                                    next.f15270b.put("omidAdSession", C6041eq.m18074a((List<VerificationScriptResource>) arrayList, (String) next.f15270b.get(StaticResource.CREATIVE_TYPE), this.f14549o.mo34783h()));
                                    next.f15270b.put("deferred", Boolean.TRUE);
                                }
                            }
                        } catch (Exception e) {
                            C6181gg.m18398a().mo35357a(new C6217hg(e));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m17000a(Context context, C6002du duVar) {
        VerificationScriptResource verificationScriptResource;
        try {
            C5901bt btVar = new C5907bx((int) mo34541l(), new JSONObject(mo34463a(0)), mo34545o(), this.f14550p == null ? null : C6239hv.m18612a(this.f14550p.mo34823m()), (C6000ds) null).mo34899c("CONTAINER").get(0);
            if (context != null) {
                ArrayList arrayList = new ArrayList();
                for (C5922cf next : btVar.f14912u) {
                    if ("OMID_VIEWABILITY".equals(next.f15004d) && (next instanceof C6036em)) {
                        C6036em emVar = (C6036em) next;
                        Map map = (Map) duVar.mo35113a("macros", Map.class);
                        String d = m17008d(emVar.f15357g, map);
                        String str = emVar.f15358h;
                        String d2 = m17008d(emVar.f15002b, map);
                        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(str)) {
                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(d2));
                        } else {
                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(d2), d);
                        }
                        arrayList.add(verificationScriptResource);
                    }
                }
                if (arrayList.size() != 0) {
                    duVar.f15270b.put("omidAdSession", C6040ep.m18065a((List<VerificationScriptResource>) arrayList, this.f14549o.mo34783h(), (String) duVar.f15270b.get(StaticResource.CREATIVE_TYPE)));
                    duVar.f15270b.put("deferred", Boolean.TRUE);
                }
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    /* renamed from: a */
    private static C5901bt m16997a(C5907bx bxVar) {
        for (String c : bxVar.mo34901e()) {
            C5901bt btVar = bxVar.mo34899c(c).get(0);
            if (2 == btVar.f14903l) {
                return btVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo34542l(C6337q qVar) {
        if (mo34545o().viewability.omidConfig.omidEnabled && C6042er.C6043a.f15376a.mo35170a()) {
            for (C6002du next : m17011f(this.f14538d.indexOf(qVar))) {
                if (3 == next.f15269a) {
                    try {
                        C6034ek a = C6039eo.m18056a((String) next.mo35113a(StaticResource.CREATIVE_TYPE, String.class), qVar, ((Boolean) next.mo35113a("isolateVerificationScripts", Boolean.class)).booleanValue(), this.f14549o.mo34783h(), ((Byte) next.mo35113a("impressionType", Byte.class)).byteValue(), (String) next.mo35113a("customReferenceData", String.class));
                        if (a != null) {
                            next.f15270b.put("omidAdSession", a);
                            next.f15270b.put("deferred", Boolean.TRUE);
                        }
                    } catch (Exception e) {
                        C6181gg.m18398a().mo35357a(new C6217hg(e));
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static String m17008d(String str, Map map) {
        if (!(map == null || str == null)) {
            for (Object next : map.keySet()) {
                str = str.replace(next.toString(), map.get(next).toString());
            }
        }
        return str;
    }

    /* renamed from: com.inmobi.media.ad$b */
    /* compiled from: AdUnit */
    public static class C5781b {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static java.util.Map<java.lang.String, java.lang.Object> m17180a(java.lang.String r7, java.lang.String r8, boolean r9, org.json.JSONObject r10, byte r11) {
            /*
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                int r1 = r7.hashCode()
                r2 = 112202875(0x6b0147b, float:6.6233935E-35)
                java.lang.String r3 = "nonvideo"
                java.lang.String r4 = "video"
                r5 = 2
                r6 = 1
                if (r1 == r2) goto L_0x0022
                r2 = 1425678798(0x54fa21ce, float:8.5944718E12)
                if (r1 == r2) goto L_0x001a
                goto L_0x002a
            L_0x001a:
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L_0x002a
                r7 = r6
                goto L_0x002b
            L_0x0022:
                boolean r7 = r7.equals(r4)
                if (r7 == 0) goto L_0x002a
                r7 = r5
                goto L_0x002b
            L_0x002a:
                r7 = -1
            L_0x002b:
                if (r7 == r6) goto L_0x0033
                if (r7 == r5) goto L_0x0032
                java.lang.String r3 = "unknown"
                goto L_0x0033
            L_0x0032:
                r3 = r4
            L_0x0033:
                java.lang.String r7 = "creativeType"
                r0.put(r7, r3)
                java.lang.String r7 = "customReferenceData"
                r0.put(r7, r8)
                java.lang.Byte r7 = java.lang.Byte.valueOf(r11)
                java.lang.String r8 = "impressionType"
                r0.put(r8, r7)
                java.util.HashMap r7 = new java.util.HashMap
                r7.<init>()
                if (r10 == 0) goto L_0x0065
                java.util.Iterator r8 = r10.keys()
            L_0x0051:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x0065
                java.lang.Object r11 = r8.next()
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r1 = r10.optString(r11)
                r7.put(r11, r1)
                goto L_0x0051
            L_0x0065:
                java.lang.String r8 = "macros"
                r0.put(r8, r7)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
                java.lang.String r8 = "isolateVerificationScripts"
                r0.put(r8, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5762ad.C5781b.m17180a(java.lang.String, java.lang.String, boolean, org.json.JSONObject, byte):java.util.Map");
        }
    }

    /* renamed from: M */
    public C6337q mo34450M() {
        return this.f14532E;
    }

    /* renamed from: a */
    public void mo34484a(final String str, final String str2) {
        this.f14557w.mo35434a(hashCode(), new C5783af<C5762ad>(this) {
            /* renamed from: a */
            public final void mo34435a() {
                C5762ad adVar = (C5762ad) this.f14596f.get();
                if (adVar != null) {
                    C5838au u = adVar.mo34551u();
                    if (u == null || str == null || !u.mo34733f().equals(str2)) {
                        String str = C5762ad.f14527a;
                        return;
                    }
                    C5762ad.m17001a(adVar, u, str);
                    String str2 = C5762ad.f14527a;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34485a(String str, String str2, C6316l lVar, String str3) {
        final String str4 = str3;
        final C6316l lVar2 = lVar;
        final String str5 = str;
        final String str6 = str2;
        this.f14557w.mo35434a(hashCode(), new C5783af<C5762ad>(this) {
            /* renamed from: a */
            public final void mo34435a() {
                C5762ad adVar = (C5762ad) this.f14596f.get();
                if (adVar != null) {
                    try {
                        C5838au u = adVar.mo34551u();
                        if (u == null || !u.mo34733f().equals(str4)) {
                            String str = C5762ad.f14527a;
                            lVar2.mo35543a(str5, str6, "");
                            return;
                        }
                        lVar2.mo35543a(str5, str6, u.mo34729c());
                        String str2 = C5762ad.f14527a;
                    } catch (Exception e) {
                        String str3 = C5762ad.f14527a;
                        C6181gg.m18398a().mo35357a(new C6217hg(e));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo34451N() {
        this.f14557w.mo35434a(hashCode(), new C5783af<C5762ad>(this) {
            /* renamed from: a */
            public final void mo34435a() {
                C5762ad adVar = (C5762ad) this.f14596f.get();
                if (adVar != null) {
                    try {
                        final C5907bx bxVar = new C5907bx((int) adVar.mo34541l(), new JSONObject(adVar.mo34463a(0)), adVar.mo34545o(), adVar.f14550p == null ? null : C6239hv.m18612a(adVar.f14550p.mo34823m()), (C6000ds) null);
                        C5762ad.this.f14543i.post(new Runnable() {
                            public final void run() {
                                try {
                                    C5925ch chVar = bxVar.f14945k;
                                    C5838au u = C5762ad.this.mo34551u();
                                    if (chVar != null && C5762ad.this.mo34533h() != null && u != null) {
                                        C5762ad adVar = C5762ad.this;
                                        Context h = C5762ad.this.mo34533h();
                                        byte l = C5762ad.this.mo34541l();
                                        Set b = C5762ad.this.m17011f(0);
                                        C5762ad adVar2 = C5762ad.this;
                                        C6337q unused = adVar.f14532E = new C6337q(h, l, b, adVar2.f14550p == null ? null : adVar2.f14550p.mo34815e(), Boolean.FALSE, "DEFAULT");
                                        C5762ad.this.f14532E.mo35608a(C5762ad.this.f14535I, C5762ad.this.mo34545o(), C5762ad.this.mo34458U(), false);
                                        C5762ad.this.f14532E.f16111i = true;
                                        C5762ad.this.f14532E.setBlobProvider(C5762ad.this);
                                        C5762ad.this.f14532E.setIsPreload(true);
                                        C5762ad.this.f14532E.setPlacementId(C5762ad.this.f14549o.mo34779e());
                                        C5762ad.this.f14532E.setCreativeId(u.mo34747t());
                                        C5762ad.this.f14532E.setAllowAutoRedirection(C5762ad.this.m17014g(0));
                                        C5762ad.this.f14532E.setShouldFireRenderBeacon(false);
                                        if (C5762ad.this.f14542h == 0) {
                                            C5762ad.this.mo34542l(C5762ad.this.f14532E);
                                        }
                                        if (C5762ad.this.mo34525e((byte) 2)) {
                                            if ("URL".equals(chVar.f15018z)) {
                                                C5762ad.this.f14532E.mo35613b((String) chVar.f14896e);
                                            } else {
                                                C5762ad.this.f14532E.mo35610a((String) chVar.f14896e);
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    String str = C5762ad.f14527a;
                                    C5762ad.this.f14536b = 3;
                                    C5762ad.this.mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 76);
                                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                                }
                            }
                        });
                    } catch (Exception e) {
                        String str = C5762ad.f14527a;
                        adVar.f14536b = 3;
                        adVar.mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 76);
                        C6181gg.m18398a().mo35357a(new C6217hg(e));
                    }
                }
            }

            /* renamed from: b */
            public final void mo34437b() {
                super.mo34437b();
                C5762ad adVar = (C5762ad) this.f14596f.get();
                if (adVar != null) {
                    adVar.f14536b = 3;
                    adVar.mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), false, (byte) 40);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo34452O() {
        if (this.f14544j && this.f14545k && this.f14531D) {
            mo34453P();
        }
    }

    /* renamed from: b */
    public void mo34498b(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C5849bb bbVar = this.f14550p;
        C5838au k = bbVar == null ? null : bbVar.mo34821k();
        if (k == null) {
            C5780a p = mo34546p();
            if (p != null) {
                p.mo34585a(this, false, inMobiAdRequestStatus);
                return;
            }
            return;
        }
        this.f14557w.mo35434a(hashCode(), new C5824ar(this, k, this.f14550p, true, inMobiAdRequestStatus));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo34455R() {
        C5838au u = mo34551u();
        if (u != null && 4 == mo34537j() && !mo34547q()) {
            C5780a p = mo34546p();
            if (p != null) {
                mo34511c(p);
            }
            return true;
        } else if (u != null && 2 == mo34537j() && !mo34547q()) {
            return false;
        } else {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (byte) 49);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo34457T() throws IllegalStateException {
        C5838au aa = mo34611aa();
        if (aa != null) {
            String i = aa.mo34736i();
            char c = 65535;
            switch (i.hashCode()) {
                case -1470802432:
                    if (i.equals("mediationJson")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1084172778:
                    if (i.equals("inmobiJson")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3213227:
                    if (i.equals(TJAdUnitConstants.String.HTML)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1236050372:
                    if (i.equals("htmlUrl")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (!(c == 2 || c == 3)) {
                if (c == 4) {
                    aa.mo34733f();
                    C5849bb bbVar = this.f14550p;
                    if (bbVar != null) {
                        bbVar.mo34810a(this.f14537c, (C5999dr) this);
                    }
                } else {
                    aa.mo34736i();
                    throw new IllegalStateException("Can not handle fallback for markup type: " + aa.mo34736i());
                }
            }
            List<String> c2 = aa.mo34730c(C5838au.WIN_BEACON);
            if (this.f14556v) {
                for (int i2 = 1; i2 < this.f14550p.mo34812b().size(); i2++) {
                    List<String> c3 = this.f14550p.mo34812b().get(i2).mo34730c(C5838au.WIN_BEACON);
                    if (c3 != null) {
                        c2.addAll(c3);
                    }
                }
            }
            if (c2 != null) {
                for (String a : c2) {
                    C5874bk.m17607a().mo34847a(a, true);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to get topAd");
    }

    /* renamed from: aa */
    private C5838au mo34611aa() {
        C5838au u = mo34551u();
        if (u != null && !mo34547q()) {
            return u;
        }
        return null;
    }

    /* renamed from: a */
    public void mo34476a(C5838au auVar, boolean z, byte b) {
        C5849bb bbVar;
        C5838au aa = mo34611aa();
        if (aa != null) {
            aa.mo34733f();
            String i = aa.mo34736i();
            char c = 65535;
            switch (i.hashCode()) {
                case -1470802432:
                    if (i.equals("mediationJson")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1084172778:
                    if (i.equals("inmobiJson")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3213227:
                    if (i.equals(TJAdUnitConstants.String.HTML)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1236050372:
                    if (i.equals("htmlUrl")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c != 2 && c != 3) {
                if (c != 4) {
                    aa.mo34736i();
                    throw new IllegalStateException("Can not handle fallback for markup type: " + aa.mo34736i());
                } else if (mo34537j() == 2 && (bbVar = this.f14550p) != null) {
                    bbVar.mo34809a(auVar);
                    C5851bc r = mo34548r();
                    String h = this.f14550p.mo34818h();
                    if (auVar != null) {
                        Set<C5895bn> h2 = auVar.mo34735h();
                        if (h2.size() == 0) {
                            r.f14774a.mo34479a(r.f14775b, true, (byte) 0);
                            return;
                        }
                        C5841aw awVar = new C5841aw(UUID.randomUUID().toString(), h, h2, r.f14777d);
                        C5861bg a = C5861bg.m17544a();
                        a.f14790a.execute(new Runnable(awVar, auVar.mo34723a()) {

                            /* renamed from: a */
                            final /* synthetic */ C5841aw f14807a;

                            /* renamed from: b */
                            final /* synthetic */ String f14808b;

                            public final void run(
/*
Method generation error in method: com.inmobi.media.bg.4.run():void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.bg.4.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final boolean mo34458U() {
        C5838au u = mo34551u();
        return u != null && u.mo34745r();
    }

    /* renamed from: f */
    public void mo34526f() {
        mo34527f((byte) 4);
        C5780a p = mo34546p();
        if (p != null) {
            p.mo34604k();
            p.mo34598e();
        }
    }

    /* renamed from: a */
    public void mo34467a(int i, C6337q qVar, Context context) {
        this.f14538d.indexOf(qVar);
        if (i >= 0) {
            this.f14553s = i;
        } else {
            this.f14553s++;
        }
    }

    /* renamed from: c */
    public JSONArray mo34508c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it = this.f14555u.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().intValue());
        }
        return jSONArray;
    }

    /* renamed from: g */
    public void mo34530g() {
        this.f14543i.post(new Runnable() {
            public final void run() {
                C5780a p;
                if ((C5762ad.this.mo34537j() == 6 || C5762ad.this.mo34537j() == 7) && (p = C5762ad.this.mo34546p()) != null) {
                    p.mo34603j();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo34509c(byte b) {
        C5780a p;
        if (b == 0) {
            mo34477a(this.f14549o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (byte) 7);
        } else if (b != 1) {
            if (b == 2) {
                int size = this.f14538d.size();
                int i = this.f14553s;
                if (size > i && this.f14538d.get(i) != null && this.f14538d.get(this.f14553s).getMarkupType().equals("htmlUrl")) {
                    m17015m(this.f14538d.get(this.f14553s));
                }
                mo34471a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else if (b == 4 && (p = mo34546p()) != null) {
                p.mo34602i();
            }
        } else if (2 == mo34537j()) {
            this.f14536b = 3;
            C5780a p2 = mo34546p();
            if (p2 != null) {
                p2.mo34593b(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            mo34465a((byte) 47);
        }
    }

    /* renamed from: d */
    public void mo34517d(byte b) {
        C5780a p;
        if (b == 0) {
            mo34477a(this.f14549o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (byte) 56);
        } else if (b != 1) {
            if (b == 2) {
                mo34471a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
            } else if (b == 4 && (p = mo34546p()) != null) {
                p.mo34602i();
            }
        } else if (2 == mo34537j()) {
            this.f14536b = 3;
            C5780a p2 = mo34546p();
            if (p2 != null) {
                p2.mo34593b(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
            }
            mo34465a((byte) 40);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo34525e(byte b) {
        int i;
        if (b == 0) {
            i = this.f14559y.mo35533c();
        } else if (b == 1) {
            i = this.f14559y.mo35536f();
        } else if (b == 2) {
            i = this.f14559y.mo35539i();
        } else if (b != 4) {
            return false;
        } else {
            i = this.f14559y.mo35537g();
        }
        long j = (long) i;
        C5984dk dkVar = this.f14533F;
        return dkVar != null && dkVar.mo35089a(b, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34527f(byte b) {
        C5984dk dkVar = this.f14533F;
        if (dkVar != null) {
            dkVar.mo35088a(b);
        }
    }

    /* renamed from: c_ */
    public C6305jh mo34515c_() {
        return this.f14559y;
    }

    /* renamed from: V */
    public boolean mo34459V() {
        return this.f14551q;
    }

    /* renamed from: W */
    public void mo34460W() {
        this.f14551q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final void mo34461X() {
        for (int i = 0; i < this.f14538d.size(); i++) {
            mo34518d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo34518d(int i) {
        if (this.f14538d.size() > i && this.f14538d.get(i) != null) {
            this.f14538d.get(i).stopLoading();
            this.f14538d.get(i).destroy();
            this.f14538d.set(i, (Object) null);
        }
    }

    /* renamed from: a */
    public void mo34468a(int i, boolean z) {
        C6337q qVar;
        if (i >= 0 && i < this.f14538d.size() && (qVar = this.f14538d.get(i)) != null) {
            qVar.mo35621d(z);
        }
    }

    /* renamed from: e */
    public void mo34523e(int i) {
        this.f14553s = i;
    }

    /* renamed from: h */
    public void mo34534h(C6337q qVar) {
        List<String> c;
        super.mo34534h(qVar);
        C5838au b = mo34496b(this.f14538d.indexOf(qVar));
        if ((b == null || b.mo34749v() == null || !b.mo34749v().equals("video")) && b != null && (c = b.mo34730c("click")) != null) {
            for (String a : c) {
                C5874bk.m17607a().mo34847a(a, true);
            }
        }
    }

    /* renamed from: i */
    public void mo34536i(C6337q qVar) {
        List<String> c;
        super.mo34536i(qVar);
        C5838au b = mo34496b(this.f14538d.indexOf(qVar));
        if ((b == null || b.mo34749v() == null || !b.mo34749v().equals("video")) && b != null && (c = b.mo34730c("impression")) != null) {
            for (String a : c) {
                C5874bk.m17607a().mo34847a(a, true);
            }
        }
    }

    /* renamed from: m */
    private void m17015m(C6337q qVar) {
        List<String> c;
        C5838au b = mo34496b(this.f14538d.indexOf(qVar));
        if (b != null && (c = b.mo34730c(C5838au.LOAD_AD_TOKEN_URL_FAILURE)) != null) {
            for (String a : c) {
                C5874bk.m17607a().mo34847a(a, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo34463a(int i) {
        if (i > 0 && !this.f14556v) {
            return "";
        }
        if (mo34496b(i) == null) {
            return null;
        }
        return mo34496b(i).mo34737j();
    }

    /* renamed from: a */
    public void mo34479a(C5846ba baVar, boolean z, byte b) {
        if (!this.f14546l && mo34533h() != null) {
            if (b != 0) {
                mo34465a(b);
            }
            mo34478a(baVar, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34480a(C5849bb bbVar) {
        if (!this.f14546l && mo34533h() != null) {
            mo34500b(bbVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34492a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            this.f14536b = 2;
        } else {
            mo34472a(inMobiAdRequestStatus, true, (byte) 0);
        }
    }

    /* renamed from: a */
    public void mo34477a(C5846ba baVar, InMobiAdRequestStatus inMobiAdRequestStatus, byte b) {
        if (!this.f14546l && mo34533h() != null) {
            try {
                if (this.f14549o.equals(baVar) && mo34537j() == 1) {
                    C6238hu.m18605a((byte) 2, "InMobi", "Failed to fetch ad for placement id: " + this.f14549o.toString() + ", reason phrase available in onAdLoadFailed callback.");
                    inMobiAdRequestStatus.getMessage();
                    this.f14536b = 3;
                    if (b != 0) {
                        mo34497b(b);
                    }
                    C5780a p = mo34546p();
                    if (p != null) {
                        p.mo34583a(inMobiAdRequestStatus);
                    }
                }
            } catch (Exception e) {
                C6238hu.m18605a((byte) 1, "InMobi", "Unable to load Ad; SDK encountered an unexpected error");
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        }
    }

    /* renamed from: Z */
    private int mo34608Z() {
        try {
            this.f14536b = 1;
            C6269iq.m18729a().mo35477c();
            if (!mo34525e((byte) 0)) {
                return -2;
            }
            this.f14557w.mo35434a(hashCode(), new C5761ac(this));
            return 0;
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34487a(WeakReference<C5780a> weakReference, byte b, InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f14536b = 3;
        if (!this.f14546l) {
            C5780a aVar = (C5780a) weakReference.get();
            if (aVar == null) {
                C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            } else if ("int".equals(mo34539k())) {
                mo34474a(aVar, b);
            } else {
                mo34465a(b);
                aVar.mo34584a(this, inMobiAdRequestStatus);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo34442E() {
        if (this.f14556v) {
            mo34461X();
            this.f14538d.clear();
            this.f14552r = 0;
            this.f14553s = 0;
            this.f14555u.clear();
        }
    }

    /* renamed from: c */
    public final void mo34513c(final C6337q qVar) {
        if (!this.f14546l && mo34533h() != null) {
            this.f14543i.post(new Runnable() {
                public final void run() {
                    C5762ad.this.mo34538j(qVar);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo34520d(final C6337q qVar) {
        if (!this.f14546l && mo34533h() != null) {
            this.f14543i.post(new Runnable() {
                public final void run() {
                    C5762ad.this.mo34540k(qVar);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo34483a(String str) {
        if (this.f14556v) {
            this.f14534H = str;
        }
    }

    /* renamed from: e */
    public String mo34522e() {
        if (this.f14556v) {
            return this.f14534H;
        }
        return null;
    }

    /* renamed from: a */
    public void mo34464a() {
        if (!this.f14546l && mo34533h() != null) {
            this.f14543i.post(new Runnable() {
                public final void run() {
                    if (6 == C5762ad.this.mo34537j()) {
                        C5762ad.this.f14536b = 3;
                        if (C5762ad.this.mo34546p() != null) {
                            C5762ad adVar = C5762ad.this;
                            adVar.mo34474a(adVar.mo34546p(), (byte) 92);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public void mo34532g(final C6337q qVar) {
        if (!this.f14546l && mo34533h() != null) {
            try {
                this.f14543i.post(new Runnable() {
                    public final void run() {
                        C5762ad.this.mo34444G();
                    }
                });
            } catch (Exception unused) {
                C6238hu.m18605a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
            }
        }
    }

    /* renamed from: b */
    public void mo34503b(HashMap<Object, Object> hashMap) {
        if (!this.f14546l && mo34533h() != null && mo34546p() != null) {
            mo34546p().mo34594b((Map<Object, Object>) hashMap);
        }
    }

    /* renamed from: a */
    public void mo34488a(HashMap<Object, Object> hashMap) {
        if (!this.f14546l && mo34533h() != null && mo34546p() != null) {
            mo34546p().mo34587a((Map<Object, Object>) hashMap);
        }
    }

    /* renamed from: a_ */
    public void mo34495a_() {
        if (!this.f14546l && mo34533h() != null && mo34546p() != null) {
            mo34546p().mo34597d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34505b(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            this.f14536b = 2;
        }
        C5780a p = mo34546p();
        if (p != null) {
            p.mo34585a(this, z, inMobiAdRequestStatus);
        }
    }

    /* renamed from: a */
    public int mo34462a(C6337q qVar) {
        if (this.f14556v) {
            return this.f14538d.indexOf(qVar);
        }
        return -1;
    }

    /* renamed from: b_ */
    public long mo34507b_() {
        if (this.f14556v) {
            return System.currentTimeMillis() - this.f14554t;
        }
        return -1;
    }

    /* renamed from: d */
    public long mo34516d() {
        if (this.f14556v) {
            return this.f14554t;
        }
        return -1;
    }

    /* renamed from: a */
    static /* synthetic */ void m17001a(C5762ad adVar, C5838au auVar, String str) {
        auVar.mo34724a(str);
        C5849bb bbVar = adVar.f14550p;
        if (bbVar != null) {
            bbVar.mo34809a(auVar);
        }
    }
}
