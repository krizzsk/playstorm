package com.bytedance.sdk.openadsdk.core.p146b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3766y;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3593a;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p151e.C3476g;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.p130b.C3132b;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.b */
/* compiled from: ClickListener */
public class C3427b extends C3429c {

    /* renamed from: F */
    private WeakReference<Activity> f8258F;

    /* renamed from: G */
    private boolean f8259G;

    /* renamed from: a */
    private String f8260a;

    /* renamed from: b */
    protected Context f8261b;

    /* renamed from: c */
    public C3481j f8262c;

    /* renamed from: d */
    protected final C3498n f8263d;

    /* renamed from: e */
    protected final String f8264e;

    /* renamed from: f */
    protected final int f8265f;

    /* renamed from: g */
    protected WeakReference<View> f8266g;

    /* renamed from: h */
    protected WeakReference<View> f8267h;

    /* renamed from: i */
    protected C3476g f8268i;

    /* renamed from: j */
    protected C3428a f8269j;

    /* renamed from: k */
    protected TTNativeAd f8270k;

    /* renamed from: l */
    protected C2526c f8271l;

    /* renamed from: m */
    protected boolean f8272m;

    /* renamed from: n */
    protected C4026c f8273n;

    /* renamed from: o */
    protected Map<String, Object> f8274o;

    /* renamed from: p */
    protected TTNativeExpressAd f8275p;

    /* renamed from: q */
    protected C3593a f8276q;

    /* renamed from: r */
    protected int f8277r;

    /* renamed from: com.bytedance.sdk.openadsdk.core.b.b$a */
    /* compiled from: ClickListener */
    public interface C3428a {
        /* renamed from: a */
        void mo18398a(View view, int i);
    }

    /* renamed from: a */
    public void mo19402a(C4026c cVar) {
        this.f8273n = cVar;
    }

    /* renamed from: a */
    public void mo19401a(C3593a aVar) {
        this.f8276q = aVar;
    }

    /* renamed from: a */
    public void mo19398a(TTNativeAd tTNativeAd) {
        this.f8270k = tTNativeAd;
    }

    /* renamed from: a */
    public void mo19399a(TTNativeExpressAd tTNativeExpressAd) {
        this.f8275p = tTNativeExpressAd;
    }

    /* renamed from: d */
    public void mo19412d(boolean z) {
        this.f8272m = z;
    }

    /* renamed from: a */
    public void mo19397a(C2526c cVar) {
        this.f8271l = cVar;
    }

    public C3427b(Context context, C3498n nVar, String str, int i) {
        this.f8272m = false;
        this.f8277r = 0;
        this.f8259G = false;
        this.f8261b = context;
        this.f8263d = nVar;
        this.f8264e = str;
        this.f8265f = i;
    }

    public C3427b(Context context, C3498n nVar, String str, int i, boolean z) {
        this(context, nVar, str, i);
        this.f8259G = z;
    }

    /* renamed from: a */
    public void mo19400a(C3428a aVar) {
        this.f8269j = aVar;
    }

    /* renamed from: a */
    public void mo19395a(Activity activity) {
        if (activity != null) {
            this.f8258F = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    public void mo19396a(View view) {
        if (view != null) {
            this.f8266g = new WeakReference<>(view);
        }
    }

    /* renamed from: b */
    public void mo19408b(View view) {
        if (view != null) {
            this.f8267h = new WeakReference<>(view);
        }
    }

    /* renamed from: d */
    public View mo19410d() {
        WeakReference<Activity> weakReference = this.f8258F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((Activity) this.f8258F.get()).findViewById(16908290);
    }

    /* renamed from: e */
    public View mo19413e() {
        WeakReference<Activity> weakReference = this.f8258F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((Activity) this.f8258F.get()).findViewById(C2984t.m8432e(C3578m.m11231a(), "tt_top_dislike"));
    }

    /* renamed from: a */
    public void mo19404a(Map<String, Object> map) {
        this.f8274o = map;
    }

    /* renamed from: a */
    public void mo19394a(int i) {
        this.f8284A = i;
    }

    /* renamed from: b */
    public void mo19407b(int i) {
        this.f8297z = i;
    }

    /* renamed from: c */
    public void mo19409c(int i) {
        this.f8296y = i;
    }

    /* renamed from: d */
    public void mo19411d(int i) {
        this.f8277r = i;
    }

    /* renamed from: a */
    public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
        JSONObject jSONObject;
        int i;
        View view2;
        View view3;
        C3498n nVar;
        View view4 = view;
        boolean z2 = z;
        if (this.f8261b == null) {
            this.f8261b = C3578m.m11231a();
        }
        if ((this.f8259G || !mo19405a(view, 1, f, f2, f3, f4, sparseArray, z)) && this.f8261b != null) {
            C3481j jVar = this.f8262c;
            if (jVar != null) {
                i = jVar.f8491l;
                jSONObject = this.f8262c.f8492m;
            } else {
                jSONObject = null;
                i = -1;
            }
            long j = this.f8294w;
            long j2 = this.f8295x;
            WeakReference<View> weakReference = this.f8266g;
            if (weakReference == null) {
                view2 = null;
            } else {
                view2 = (View) weakReference.get();
            }
            WeakReference<View> weakReference2 = this.f8267h;
            if (weakReference2 == null) {
                view3 = null;
            } else {
                view3 = (View) weakReference2.get();
            }
            C3476g a = mo19393a(f, f2, f3, f4, sparseArray, j, j2, view2, view3, mo19414f(), C4020v.m13314e(this.f8261b), C4020v.m13319g(this.f8261b), C4020v.m13317f(this.f8261b), i, jSONObject);
            this.f8268i = a;
            if (this.f8259G) {
                C3156e.m9177a(this.f8261b, "click", this.f8263d, a, this.f8264e, true, this.f8274o, z ? 1 : 2);
                return;
            }
            boolean z3 = z;
            C3428a aVar = this.f8269j;
            View view5 = view;
            if (aVar != null) {
                aVar.mo18398a(view5, -1);
            }
            if (mo19406a(view5, z3)) {
                boolean a2 = C3501p.m10761a(this.f8263d);
                String a3 = a2 ? this.f8264e : C4014u.m13181a(this.f8265f);
                if (view5 != null) {
                    try {
                        if (((Boolean) view5.getTag(C2984t.m8432e(C3578m.m11231a(), "tt_id_is_video_picture"))).booleanValue()) {
                            C3766y.m12377a(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                boolean a4 = C3766y.m12378a(this.f8261b, this.f8263d, this.f8265f, this.f8270k, this.f8275p, a3, this.f8273n, a2);
                C3766y.m12377a(false);
                if (a4 || (nVar = this.f8263d) == null || nVar.mo19658ab() == null || this.f8263d.mo19658ab().mo19539c() != 2) {
                    C3498n nVar2 = this.f8263d;
                    if (nVar2 != null && !a4 && TextUtils.isEmpty(nVar2.mo19612O()) && C3132b.m9038a(this.f8264e)) {
                        C4027d.m13342a(this.f8261b, this.f8263d, this.f8264e).mo20934d();
                    }
                    C3156e.m9177a(this.f8261b, "click", this.f8263d, this.f8268i, this.f8264e, a4, this.f8274o, z3 ? 1 : 2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo19406a(View view, boolean z) {
        return m10248a(view, this.f8263d, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10248a(android.view.View r4, com.bytedance.sdk.openadsdk.core.p151e.C3498n r5, boolean r6) {
        /*
            r0 = 1
            if (r4 == 0) goto L_0x004f
            if (r5 != 0) goto L_0x0006
            goto L_0x004f
        L_0x0006:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
            java.lang.String r2 = "tt_id_click_tag"
            int r1 = com.bytedance.sdk.component.utils.C2984t.m8432e(r1, r2)
            java.lang.Object r1 = r4.getTag(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.content.Context r3 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
            int r2 = com.bytedance.sdk.component.utils.C2984t.m8432e(r3, r2)
            java.lang.Object r2 = r4.getTag(r2)
            if (r2 == 0) goto L_0x0036
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0036
            java.lang.String r4 = "click"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0035
            return r6
        L_0x0035:
            return r0
        L_0x0036:
            boolean r4 = m10249c((android.view.View) r4)
            r1 = 0
            if (r4 == 0) goto L_0x0046
            int r4 = r5.mo19715i()
            if (r4 != r0) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            return r1
        L_0x0046:
            int r4 = r5.mo19711h()
            if (r4 != r0) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            return r1
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p146b.C3427b.m10248a(android.view.View, com.bytedance.sdk.openadsdk.core.e.n, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3476g mo19393a(float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject) {
        float f7 = f;
        float f8 = f2;
        float f9 = f3;
        float f10 = f4;
        long j3 = j;
        long j4 = j2;
        SparseArray<C3429c.C3430a> sparseArray2 = sparseArray;
        return new C3476g.C3478a().mo19532f(f).mo19530e(f2).mo19527d(f3).mo19524c(f4).mo19522b(j).mo19514a(j2).mo19523b(C4020v.m13296a(view)).mo19518a(C4020v.m13296a(view2)).mo19526c(C4020v.m13309c(view)).mo19529d(C4020v.m13309c(view2)).mo19528d(this.f8296y).mo19531e(this.f8297z).mo19533f(this.f8284A).mo19515a(sparseArray).mo19521b(C3524h.m10852d().mo19842b() ? 1 : 2).mo19516a(str).mo19512a(f5).mo19525c(i).mo19520b(f6).mo19513a(i2).mo19517a(jSONObject).mo19519a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19405a(View view, int i, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
        if (this.f8276q == null) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.f8267h;
        if (weakReference != null) {
            iArr = C4020v.m13296a((View) weakReference.get());
            iArr2 = C4020v.m13309c((View) this.f8267h.get());
        }
        this.f8276q.mo20092a(view, i, new C3481j.C3483a().mo19555d(f).mo19553c(f2).mo19550b(f3).mo19542a(f4).mo19552b(this.f8294w).mo19544a(this.f8295x).mo19554c(iArr[0]).mo19556d(iArr[1]).mo19557e(iArr2[0]).mo19558f(iArr2[1]).mo19545a(sparseArray).mo19548a(z).mo19549a());
        return true;
    }

    /* renamed from: c */
    public static boolean m10249c(View view) {
        return C2984t.m8432e(view.getContext(), "tt_reward_ad_download") == view.getId() || C2984t.m8432e(view.getContext(), "tt_reward_ad_download_backup") == view.getId() || C2984t.m8432e(view.getContext(), "tt_bu_download") == view.getId() || C2984t.m8432e(view.getContext(), "btn_native_creative") == view.getId() || C2984t.m8432e(view.getContext(), "tt_full_ad_download") == view.getId() || C2984t.m8432e(view.getContext(), "tt_playable_play") == view.getId();
    }

    /* renamed from: f */
    public String mo19414f() {
        return this.f8260a;
    }

    /* renamed from: a */
    public void mo19403a(String str) {
        this.f8260a = str;
    }
}
