package com.bytedance.sdk.openadsdk.core.p146b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3610e;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.C4014u;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.a */
/* compiled from: ClickCreativeListener */
public class C3426a extends C3427b {

    /* renamed from: F */
    private boolean f8254F = false;

    /* renamed from: G */
    private boolean f8255G = false;

    /* renamed from: H */
    private int f8256H;

    /* renamed from: a */
    private boolean f8257a = true;

    /* renamed from: b */
    public boolean mo19390b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo19392c() {
        return false;
    }

    public C3426a(Context context, C3498n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo19387a(boolean z) {
        this.f8257a = z;
    }

    /* renamed from: b */
    public void mo19389b(boolean z) {
        this.f8254F = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020a, code lost:
        if ((r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView) == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0222, code lost:
        if (((java.lang.Boolean) r2.getTag(com.bytedance.sdk.component.utils.C2984t.m8432e(com.bytedance.sdk.openadsdk.core.C3578m.m11231a(), "tt_id_is_video_picture"))).booleanValue() != false) goto L_0x0224;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18471a(android.view.View r24, float r25, float r26, float r27, float r28, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.p146b.C3429c.C3430a> r29, boolean r30) {
        /*
            r23 = this;
            r11 = r23
            r10 = r24
            r9 = r30
            r2 = 2
            r0 = r23
            r1 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            boolean r0 = r0.mo19405a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            boolean r0 = r23.m10240i()
            java.lang.String r1 = "ClickCreativeListener"
            if (r0 == 0) goto L_0x0039
            boolean r0 = r23.m10237d(r24)
            if (r0 == 0) goto L_0x0039
            boolean r0 = r11.f8255G
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "Intercept the native video view , Select the normal click event....."
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r1, (java.lang.String) r0)
            super.mo18471a(r24, r25, r26, r27, r28, r29, r30)
            return
        L_0x0039:
            java.lang.String r0 = "Select creative area click event....."
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r1, (java.lang.String) r0)
            android.content.Context r0 = r11.f8261b
            if (r0 != 0) goto L_0x0048
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
            r11.f8261b = r0
        L_0x0048:
            android.content.Context r0 = r11.f8261b
            if (r0 != 0) goto L_0x004d
            return
        L_0x004d:
            boolean r0 = r11.mo19406a(r10, r9)
            if (r0 != 0) goto L_0x0054
            return
        L_0x0054:
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.m11302a((android.view.View) r24)
            com.bytedance.sdk.openadsdk.core.e.j r1 = r11.f8262c
            r18 = -1
            if (r1 == 0) goto L_0x006b
            com.bytedance.sdk.openadsdk.core.e.j r0 = r11.f8262c
            int r0 = r0.f8491l
            com.bytedance.sdk.openadsdk.core.e.j r1 = r11.f8262c
            org.json.JSONObject r1 = r1.f8492m
            r16 = r0
            r17 = r1
            goto L_0x006f
        L_0x006b:
            r17 = r0
            r16 = r18
        L_0x006f:
            long r6 = r11.f8294w
            long r4 = r11.f8295x
            java.lang.ref.WeakReference r0 = r11.f8266g
            if (r0 != 0) goto L_0x007c
            android.view.View r0 = r23.mo19410d()
            goto L_0x0084
        L_0x007c:
            java.lang.ref.WeakReference r0 = r11.f8266g
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x0084:
            r19 = r0
            java.lang.ref.WeakReference r0 = r11.f8267h
            if (r0 != 0) goto L_0x008f
            android.view.View r0 = r23.mo19413e()
            goto L_0x0097
        L_0x008f:
            java.lang.ref.WeakReference r0 = r11.f8267h
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x0097:
            r20 = r0
            java.lang.String r12 = r23.mo19414f()
            android.content.Context r0 = r11.f8261b
            float r13 = com.bytedance.sdk.openadsdk.utils.C4020v.m13314e((android.content.Context) r0)
            android.content.Context r0 = r11.f8261b
            int r14 = com.bytedance.sdk.openadsdk.utils.C4020v.m13319g(r0)
            android.content.Context r0 = r11.f8261b
            float r15 = com.bytedance.sdk.openadsdk.utils.C4020v.m13317f((android.content.Context) r0)
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r27
            r21 = r4
            r4 = r28
            r5 = r29
            r8 = r21
            r10 = r19
            r11 = r20
            com.bytedance.sdk.openadsdk.core.e.g r0 = r0.mo19393a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r23
            r1.f8268i = r0
            com.bytedance.sdk.openadsdk.core.e.n r0 = r1.f8263d
            int r0 = r0.mo19609L()
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            if (r0 == r5) goto L_0x0193
            if (r0 == r3) goto L_0x0193
            if (r0 == r2) goto L_0x0127
            r2 = 5
            if (r0 == r2) goto L_0x00e4
            r2 = r24
            r0 = r18
            goto L_0x0264
        L_0x00e4:
            java.lang.String r2 = r1.f8264e
            java.lang.String r10 = r1.m10236b((java.lang.String) r2)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L_0x0103
            android.content.Context r6 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8263d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8268i
            r11 = 1
            java.util.Map r12 = r1.f8274o
            if (r30 == 0) goto L_0x00fd
            r13 = r4
            goto L_0x00fe
        L_0x00fd:
            r13 = r5
        L_0x00fe:
            java.lang.String r7 = "click_call"
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9177a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r8, (com.bytedance.sdk.openadsdk.core.p151e.C3476g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
        L_0x0103:
            android.content.Context r2 = r24.getContext()
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f8263d
            java.lang.String r3 = r3.mo19614Q()
            boolean r11 = com.bytedance.sdk.openadsdk.utils.C4014u.m13215d(r2, r3)
            android.content.Context r6 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8263d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8268i
            java.lang.String r10 = r1.f8264e
            java.util.Map r12 = r1.f8274o
            if (r30 == 0) goto L_0x011f
            r13 = r4
            goto L_0x0120
        L_0x011f:
            r13 = r5
        L_0x0120:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9177a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r8, (com.bytedance.sdk.openadsdk.core.p151e.C3476g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x018f
        L_0x0127:
            com.bytedance.sdk.openadsdk.core.e.n r2 = r1.f8263d
            boolean r2 = com.bytedance.sdk.openadsdk.core.p151e.C3501p.m10761a((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r2)
            if (r2 == 0) goto L_0x016d
            com.bytedance.sdk.openadsdk.TTNativeAd r2 = r1.f8270k
            if (r2 != 0) goto L_0x0137
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r2 = r1.f8275p
            if (r2 == 0) goto L_0x016d
        L_0x0137:
            android.content.Context r6 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r7 = r1.f8263d
            int r8 = r1.f8265f
            com.bytedance.sdk.openadsdk.TTNativeAd r9 = r1.f8270k
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r10 = r1.f8275p
            java.lang.String r11 = r1.f8264e
            com.com.bytedance.overseas.sdk.a.c r12 = r1.f8273n
            r13 = 1
            boolean r19 = com.bytedance.sdk.openadsdk.core.C3766y.m12378a((android.content.Context) r6, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r7, (int) r8, (com.bytedance.sdk.openadsdk.TTNativeAd) r9, (com.bytedance.sdk.openadsdk.TTNativeExpressAd) r10, (java.lang.String) r11, (com.com.bytedance.overseas.sdk.p186a.C4026c) r12, (boolean) r13)
            boolean r2 = r1.f8257a
            if (r2 == 0) goto L_0x018f
            android.content.Context r14 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r2 = r1.f8263d
            com.bytedance.sdk.openadsdk.core.e.g r3 = r1.f8268i
            java.lang.String r6 = r1.f8264e
            java.util.Map r7 = r1.f8274o
            if (r30 == 0) goto L_0x015d
            r21 = r4
            goto L_0x015f
        L_0x015d:
            r21 = r5
        L_0x015f:
            java.lang.String r15 = "click"
            r16 = r2
            r17 = r3
            r18 = r6
            r20 = r7
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9177a((android.content.Context) r14, (java.lang.String) r15, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r16, (com.bytedance.sdk.openadsdk.core.p151e.C3476g) r17, (java.lang.String) r18, (boolean) r19, (java.util.Map<java.lang.String, java.lang.Object>) r20, (int) r21)
            goto L_0x018f
        L_0x016d:
            com.com.bytedance.overseas.sdk.a.c r2 = r1.f8273n
            if (r2 == 0) goto L_0x018f
            com.com.bytedance.overseas.sdk.a.c r2 = r1.f8273n
            r2.mo20934d()
            boolean r2 = r1.f8257a
            if (r2 == 0) goto L_0x018f
            android.content.Context r6 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8263d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8268i
            java.lang.String r10 = r1.f8264e
            r11 = 1
            java.util.Map r12 = r1.f8274o
            if (r30 == 0) goto L_0x0189
            r13 = r4
            goto L_0x018a
        L_0x0189:
            r13 = r5
        L_0x018a:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9177a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r8, (com.bytedance.sdk.openadsdk.core.p151e.C3476g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
        L_0x018f:
            r2 = r24
            goto L_0x0264
        L_0x0193:
            if (r0 != r3) goto L_0x01d6
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f8263d
            java.lang.String r3 = r3.mo19612O()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x01d6
            java.lang.String r6 = "play.google.com/store/apps/details?id="
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x01d6
            java.lang.String r6 = "?id="
            int r6 = r3.indexOf(r6)
            int r6 = r6 + r2
            java.lang.String r2 = r3.substring(r6)
            android.content.Context r3 = r1.f8261b
            boolean r2 = com.com.bytedance.overseas.sdk.p186a.C4025b.m13330b(r3, r2)
            if (r2 == 0) goto L_0x01d6
            boolean r2 = r1.f8257a
            if (r2 == 0) goto L_0x018f
            android.content.Context r6 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8263d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8268i
            java.lang.String r10 = r1.f8264e
            r11 = 1
            java.util.Map r12 = r1.f8274o
            if (r30 == 0) goto L_0x01cf
            r13 = r4
            goto L_0x01d0
        L_0x01cf:
            r13 = r5
        L_0x01d0:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9177a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r8, (com.bytedance.sdk.openadsdk.core.p151e.C3476g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x018f
        L_0x01d6:
            com.bytedance.sdk.openadsdk.TTNativeAd r2 = r1.f8270k
            if (r2 != 0) goto L_0x01e2
            boolean r2 = r1.f8254F
            if (r2 == 0) goto L_0x01df
            goto L_0x01e2
        L_0x01df:
            r2 = r24
            goto L_0x01f8
        L_0x01e2:
            android.content.Context r6 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8263d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8268i
            java.lang.String r10 = r1.f8264e
            r11 = 1
            java.util.Map r12 = r1.f8274o
            if (r30 == 0) goto L_0x01f1
            r13 = r4
            goto L_0x01f2
        L_0x01f1:
            r13 = r5
        L_0x01f2:
            java.lang.String r7 = "click_button"
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9177a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r8, (com.bytedance.sdk.openadsdk.core.p151e.C3476g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x01df
        L_0x01f8:
            if (r2 == 0) goto L_0x020c
            int r3 = r24.getId()     // Catch:{ Exception -> 0x0227 }
            android.content.Context r6 = r1.f8261b     // Catch:{ Exception -> 0x0227 }
            java.lang.String r7 = "tt_root_view"
            int r6 = com.bytedance.sdk.component.utils.C2984t.m8432e(r6, r7)     // Catch:{ Exception -> 0x0227 }
            if (r3 == r6) goto L_0x0224
            boolean r3 = r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView     // Catch:{ Exception -> 0x0227 }
            if (r3 != 0) goto L_0x0224
        L_0x020c:
            android.content.Context r3 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ Exception -> 0x0227 }
            java.lang.String r6 = "tt_id_is_video_picture"
            int r3 = com.bytedance.sdk.component.utils.C2984t.m8432e(r3, r6)     // Catch:{ Exception -> 0x0227 }
            java.lang.Object r3 = r2.getTag(r3)     // Catch:{ Exception -> 0x0227 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0227 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0227 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0227 }
            if (r3 == 0) goto L_0x0227
        L_0x0224:
            com.bytedance.sdk.openadsdk.core.C3766y.m12377a(r4)     // Catch:{ Exception -> 0x0227 }
        L_0x0227:
            android.content.Context r6 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r7 = r1.f8263d
            int r8 = r1.f8265f
            com.bytedance.sdk.openadsdk.TTNativeAd r9 = r1.f8270k
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r10 = r1.f8275p
            int r3 = r1.f8265f
            java.lang.String r11 = com.bytedance.sdk.openadsdk.utils.C4014u.m13181a((int) r3)
            com.com.bytedance.overseas.sdk.a.c r12 = r1.f8273n
            r13 = 1
            boolean r19 = com.bytedance.sdk.openadsdk.core.C3766y.m12378a((android.content.Context) r6, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r7, (int) r8, (com.bytedance.sdk.openadsdk.TTNativeAd) r9, (com.bytedance.sdk.openadsdk.TTNativeExpressAd) r10, (java.lang.String) r11, (com.com.bytedance.overseas.sdk.p186a.C4026c) r12, (boolean) r13)
            r3 = 0
            com.bytedance.sdk.openadsdk.core.C3766y.m12377a(r3)
            boolean r3 = r1.f8257a
            if (r3 == 0) goto L_0x0264
            android.content.Context r14 = r1.f8261b
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f8263d
            com.bytedance.sdk.openadsdk.core.e.g r6 = r1.f8268i
            java.lang.String r7 = r1.f8264e
            java.util.Map r8 = r1.f8274o
            if (r30 == 0) goto L_0x0255
            r21 = r4
            goto L_0x0257
        L_0x0255:
            r21 = r5
        L_0x0257:
            java.lang.String r15 = "click"
            r16 = r3
            r17 = r6
            r18 = r7
            r20 = r8
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9177a((android.content.Context) r14, (java.lang.String) r15, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r16, (com.bytedance.sdk.openadsdk.core.p151e.C3476g) r17, (java.lang.String) r18, (boolean) r19, (java.util.Map<java.lang.String, java.lang.Object>) r20, (int) r21)
        L_0x0264:
            com.bytedance.sdk.openadsdk.core.b.b$a r3 = r1.f8269j
            if (r3 == 0) goto L_0x026d
            com.bytedance.sdk.openadsdk.core.b.b$a r3 = r1.f8269j
            r3.mo18398a(r2, r0)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p146b.C3426a.mo18471a(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19388a() {
        if (this.f8263d == null) {
            return true;
        }
        int c = C3578m.m11241h().mo19931c(C4014u.m13223f(this.f8263d));
        int c2 = C2979o.m8409c(C3578m.m11231a());
        if (c == 1) {
            return C4014u.m13222e(c2);
        }
        if (c != 2) {
            if (c == 3) {
                return false;
            }
            if (c == 5 && !C4014u.m13222e(c2) && !C4014u.m13232g(c2)) {
                return false;
            }
            return true;
        } else if (C4014u.m13227f(c2) || C4014u.m13222e(c2) || C4014u.m13232g(c2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    private boolean m10238g() {
        return C3498n.m10583c(this.f8263d) && this.f8263d.mo19736p() == 1;
    }

    /* renamed from: d */
    private boolean m10237d(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof NativeVideoTsView) {
            C2975l.m8387c("ClickCreativeListener", "NativeVideoTsView....");
            return true;
        } else if (view.getId() == C2984t.m8432e(this.f8261b, "tt_video_ad_cover_center_layout") || view.getId() == C2984t.m8432e(this.f8261b, "tt_video_ad_logo_image") || view.getId() == C2984t.m8432e(this.f8261b, "tt_video_btn_ad_image_tv") || view.getId() == C2984t.m8432e(this.f8261b, "tt_video_ad_name") || view.getId() == C2984t.m8432e(this.f8261b, "tt_video_ad_button")) {
            C2975l.m8387c("ClickCreativeListener", "tt_video_ad_cover_center_layout....");
            return true;
        } else if (view.getId() == C2984t.m8432e(this.f8261b, "tt_root_view") || view.getId() == C2984t.m8432e(this.f8261b, "tt_video_play")) {
            C2975l.m8387c("ClickCreativeListener", "tt_root_view....");
            return true;
        } else if (!(view instanceof ViewGroup)) {
            return false;
        } else {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return false;
                }
                if (m10237d(viewGroup.getChildAt(i))) {
                    return true;
                }
                i++;
            }
        }
    }

    /* renamed from: h */
    private boolean m10239h() {
        return this instanceof C3610e;
    }

    /* renamed from: i */
    private boolean m10240i() {
        if (this.f8263d == null || m10239h()) {
            return false;
        }
        if (this.f8263d.mo19660ad() != 5 && this.f8263d.mo19660ad() != 15) {
            return false;
        }
        if (this.f8256H == 0) {
            this.f8256H = C4014u.m13219e(this.f8263d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("!isViewVisibility()=");
        sb.append(!mo19390b());
        sb.append(",isAutoPlay()=");
        sb.append(mo19388a());
        sb.append(",!isCoverPageVisibility()=");
        sb.append(!mo19392c());
        C2975l.m8384b("ClickCreativeListener", sb.toString());
        if (this.f8256H == 5 && m10238g() && mo19388a() && !mo19390b() && !mo19392c()) {
            return false;
        }
        int i = this.f8256H;
        if (i == 1 || i == 2 || i == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10236b(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            java.lang.String r1 = "open_ad"
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1695837674: goto L_0x003f;
                case -1263194568: goto L_0x0037;
                case -712491894: goto L_0x002d;
                case 1844104722: goto L_0x0023;
                case 1912999166: goto L_0x0019;
                case 2091589896: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0049
        L_0x000f:
            java.lang.String r0 = "slide_banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = r4
            goto L_0x004a
        L_0x0019:
            java.lang.String r0 = "draw_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = r6
            goto L_0x004a
        L_0x0023:
            java.lang.String r0 = "interaction"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = r3
            goto L_0x004a
        L_0x002d:
            java.lang.String r0 = "embeded_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 0
            goto L_0x004a
        L_0x0037:
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0049
            r8 = r2
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = r5
            goto L_0x004a
        L_0x0049:
            r8 = -1
        L_0x004a:
            if (r8 == 0) goto L_0x0060
            if (r8 == r6) goto L_0x0060
            java.lang.String r0 = "banner_call"
            if (r8 == r5) goto L_0x005f
            if (r8 == r4) goto L_0x005f
            if (r8 == r3) goto L_0x005c
            if (r8 == r2) goto L_0x005b
            java.lang.String r8 = ""
            return r8
        L_0x005b:
            return r1
        L_0x005c:
            java.lang.String r8 = "interaction_call"
            return r8
        L_0x005f:
            return r0
        L_0x0060:
            java.lang.String r8 = "feed_call"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p146b.C3426a.m10236b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public void mo19391c(boolean z) {
        this.f8255G = z;
    }
}
