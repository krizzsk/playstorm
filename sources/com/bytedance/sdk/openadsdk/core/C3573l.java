package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p110d.p119d.C2885g;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p146b.C3427b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.l */
/* compiled from: InteractionManager */
public class C3573l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3498n f8987a;

    /* renamed from: b */
    private C4026c f8988b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f8989c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TTNativeAd f8990d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<View> f8991e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f8992f = C2975l.l1655274989215dc("el`f``bXim");

    /* renamed from: g */
    private TTNativeAd.AdInteractionListener f8993g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f8994h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Double f8995i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3167j f8996j = new C3167j();

    public C3573l(Context context, TTNativeAd tTNativeAd, C3498n nVar, String str) {
        this.f8990d = tTNativeAd;
        this.f8987a = nVar;
        this.f8989c = context;
        this.f8992f = str;
        if (nVar.mo19609L() == 4) {
            this.f8988b = C4027d.m13342a(this.f8989c, this.f8987a, this.f8992f);
        }
    }

    /* renamed from: a */
    private EmptyView m11213a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ long m11215c(C3573l lVar) {
        long j = lVar.f8994h;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return j;
    }

    /* renamed from: a */
    public C3167j mo20065a() {
        return this.f8996j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20066a(android.view.View r3, int r4) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.TTNativeAd$AdInteractionListener r4 = r2.f8993g
            r0 = 95
            if (r4 == 0) goto L_0x000c
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = r2.f8990d
            r4.onAdCreativeClick(r3, r1)
            goto L_0x001d
        L_0x000c:
            r3 = r0
            r4 = r3
        L_0x000e:
            switch(r3) {
                case 94: goto L_0x001a;
                case 95: goto L_0x0012;
                case 96: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x001d
        L_0x0012:
            switch(r4) {
                case 94: goto L_0x000c;
                case 95: goto L_0x0019;
                case 96: goto L_0x000c;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r4) {
                case 55: goto L_0x0019;
                case 56: goto L_0x001d;
                case 57: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000c
        L_0x0019:
            return
        L_0x001a:
            r3 = 39
            goto L_0x000c
        L_0x001d:
            r3 = 94
            r4 = 125(0x7d, float:1.75E-43)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3573l.mo20066a(android.view.View, int):void");
    }

    /* renamed from: a */
    public void mo20067a(final ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final TTNativeAd.AdInteractionListener adInteractionListener) {
        this.f8993g = adInteractionListener;
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C3573l.this.f8996j.mo18770a(System.currentTimeMillis(), C3765x.m12368a(viewGroup));
            }
        });
        this.f8991e = list;
        C3156e.m9179a(this.f8987a);
        EmptyView a = m11213a(viewGroup);
        if (a == null) {
            a = new EmptyView(this.f8989c, viewGroup);
            viewGroup.addView(a);
        }
        a.mo19350a();
        a.setRefClickViews(list2);
        if (list != null) {
            for (View next : this.f8991e) {
                if (next != null) {
                    next.setTag(C2984t.m8432e(C3578m.m11231a(), C2885g.g1655274989219dc("tu]j`ZotWcoibQyrfffp")), true);
                }
            }
            list3.addAll(list);
        }
        a.setRefCreativeViews(list3);
        HashMap hashMap = new HashMap();
        hashMap.put(C2885g.g1655274989219dc("cmk`oZudmgin"), 1);
        Context context = this.f8989c;
        C3498n nVar = this.f8987a;
        String str = this.f8992f;
        C3427b bVar = new C3427b(context, nVar, str, C4014u.m13176a(str));
        bVar.mo19396a((View) viewGroup);
        bVar.mo19408b(view);
        bVar.mo19402a(this.f8988b);
        bVar.mo19398a(this.f8990d);
        bVar.mo19404a((Map<String, Object>) hashMap);
        bVar.mo19400a((C3427b.C3428a) new C3427b.C3428a() {
            /* renamed from: a */
            public void mo18398a(View view, int i) {
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdClicked(view, C3573l.this.f8990d);
                }
            }
        });
        Context context2 = this.f8989c;
        C3498n nVar2 = this.f8987a;
        String str2 = this.f8992f;
        C3426a aVar = new C3426a(context2, nVar2, str2, C4014u.m13176a(str2));
        aVar.mo19396a((View) viewGroup);
        aVar.mo19408b(view);
        aVar.mo19402a(this.f8988b);
        aVar.mo19398a(this.f8990d);
        aVar.mo19404a((Map<String, Object>) hashMap);
        aVar.mo19400a((C3427b.C3428a) new C3427b.C3428a() {
            /* renamed from: a */
            public void mo18398a(View view, int i) {
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdCreativeClick(view, C3573l.this.f8990d);
                }
            }
        });
        a.mo19351a(list2, bVar);
        a.mo19351a(list3, aVar);
        a.setCallback(new EmptyView.C3399a() {
            /* renamed from: a */
            public void mo19362a() {
                C3573l.this.f8996j.mo18770a(System.currentTimeMillis(), C3765x.m12368a(viewGroup));
            }

            @JProtect
            /* renamed from: a */
            public void mo19363a(View view) {
                C3573l.this.f8996j.mo18770a(System.currentTimeMillis(), C3765x.m12368a(viewGroup));
                long unused = C3573l.this.f8994h = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                if (C3573l.this.f8991e != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (View view2 : C3573l.this.f8991e) {
                        if (view2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(C2933b.b1655274989200dc("whfwl"), view2.getWidth());
                                jSONObject.put(C2933b.b1655274989200dc("hdkdlq"), view2.getHeight());
                                jSONObject.put(C2933b.b1655274989200dc("amrke"), (double) view2.getAlpha());
                            } catch (Throwable unused2) {
                            }
                            jSONArray.put(jSONObject);
                        }
                    }
                    hashMap.put(C2933b.b1655274989200dc("ilcdaZpnm~"), jSONArray.toString());
                }
                if (viewGroup != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(C2933b.b1655274989200dc("whfwl"), viewGroup.getWidth());
                        jSONObject2.put(C2933b.b1655274989200dc("hdkdlq"), viewGroup.getHeight());
                        jSONObject2.put(C2933b.b1655274989200dc("amrke"), (double) viewGroup.getAlpha());
                    } catch (Throwable unused3) {
                    }
                    hashMap.put(C2933b.b1655274989200dc("rnmw[sob"), jSONObject2.toString());
                }
                C3156e.m9175a(C3573l.this.f8989c, C3573l.this.f8987a, C3573l.this.f8992f, (Map<String, Object>) hashMap, C3573l.this.f8995i);
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdShow(C3573l.this.f8990d);
                }
                if (C3573l.this.f8987a.mo19665ai()) {
                    C4014u.m13188a(C3573l.this.f8987a, view);
                }
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x007c A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0078 A[LOOP:0: B:6:0x0078->B:8:0x0078, LOOP_END, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0076 A[SYNTHETIC] */
            /* renamed from: a */
            public void mo19364a(boolean r7) {
                /*
                    r6 = this;
                    if (r7 != 0) goto L_0x005a
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    long r0 = com.bytedance.sdk.openadsdk.core.C3573l.m11215c(r7)
                    r2 = 0
                    int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r7 <= 0) goto L_0x005a
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    long r0 = java.lang.System.currentTimeMillis()
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    long r4 = com.bytedance.sdk.openadsdk.core.C3573l.m11215c(r4)
                    long r0 = r0 - r4
                    r7.append(r0)
                    java.lang.String r0 = ""
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    com.bytedance.sdk.openadsdk.b.j r0 = r0.f8996j
                    long r4 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r1 = r9
                    float r1 = com.bytedance.sdk.openadsdk.core.C3765x.m12368a(r1)
                    r0.mo18770a(r4, r1)
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    com.bytedance.sdk.openadsdk.core.e.n r0 = r0.f8987a
                    com.bytedance.sdk.openadsdk.core.l r1 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    java.lang.String r1 = r1.f8992f
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    com.bytedance.sdk.openadsdk.b.j r4 = r4.f8996j
                    com.bytedance.sdk.openadsdk.p130b.C3156e.m9189a((java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r0, (java.lang.String) r1, (com.bytedance.sdk.openadsdk.p130b.C3167j) r4)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    long unused = r7.f8994h = r2
                    r7 = 64
                    goto L_0x0078
                L_0x005a:
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    com.bytedance.sdk.openadsdk.b.j r7 = r7.f8996j
                    long r0 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r2 = r9
                    float r2 = com.bytedance.sdk.openadsdk.core.C3765x.m12368a(r2)
                    r7.mo18770a(r0, r2)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C3573l.this
                    long r0 = java.lang.System.currentTimeMillis()
                    long unused = r7.f8994h = r0
                L_0x0076:
                    r7 = 66
                L_0x0078:
                    switch(r7) {
                        case 64: goto L_0x007c;
                        case 65: goto L_0x0076;
                        case 66: goto L_0x007c;
                        default: goto L_0x007b;
                    }
                L_0x007b:
                    goto L_0x0078
                L_0x007c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3573l.C35774.mo19364a(boolean):void");
            }

            /* renamed from: b */
            public void mo19365b() {
                if (C3573l.m11215c(C3573l.this) > 0) {
                    C3156e.m9189a((System.currentTimeMillis() - C3573l.m11215c(C3573l.this)) + "", C3573l.this.f8987a, C3573l.this.f8992f, C3573l.this.f8996j);
                    long unused = C3573l.this.f8994h = 0;
                }
            }
        });
        a.setNeedCheckingShow(true);
    }

    /* renamed from: a */
    public void mo20068a(Double d) {
        this.f8995i = d;
    }
}
