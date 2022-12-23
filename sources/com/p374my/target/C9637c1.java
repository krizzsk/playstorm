package com.p374my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.p374my.target.C10063z0;
import com.p374my.target.C9822l3;
import com.p374my.target.common.MyTargetPrivacy;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.mediation.MediationAdapter;
import com.p374my.target.mediation.MediationNativeBannerAdAdapter;
import com.p374my.target.mediation.MediationNativeBannerAdConfig;
import com.p374my.target.mediation.MyTargetNativeBannerAdAdapter;
import com.p374my.target.nativeads.NativeBannerAd;
import com.p374my.target.nativeads.banners.NativeBanner;
import com.p374my.target.nativeads.views.IconAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.c1 */
public class C9637c1 extends C10063z0<MediationNativeBannerAdAdapter> implements C9928r0 {

    /* renamed from: k */
    public final NativeBannerAd f23696k;

    /* renamed from: l */
    public NativeBanner f23697l;

    /* renamed from: m */
    public WeakReference<IconAdView> f23698m;

    /* renamed from: n */
    public WeakReference<View> f23699n;

    /* renamed from: com.my.target.c1$a */
    public class C9638a implements MediationNativeBannerAdAdapter.MediationNativeBannerAdListener {

        /* renamed from: a */
        public final C9858n2 f23700a;

        public C9638a(C9858n2 n2Var) {
            this.f23700a = n2Var;
        }

        /* renamed from: a */
        public final boolean mo63665a() {
            return !"myTarget".equals(this.f23700a.mo64842b()) && !"0".equals(this.f23700a.mo64843c().get("lg"));
        }

        public void onClick(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            C9637c1 c1Var = C9637c1.this;
            if (c1Var.f25036d == mediationNativeBannerAdAdapter) {
                Context l = c1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23700a.mo64848h().mo63675a("click"), l);
                }
                NativeBannerAd.NativeBannerAdListener listener = C9637c1.this.f23696k.getListener();
                if (listener != null) {
                    listener.onClick(C9637c1.this.f23696k);
                }
            }
        }

        public void onLoad(NativeBanner nativeBanner, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (C9637c1.this.f25036d == mediationNativeBannerAdAdapter) {
                String b = this.f23700a.mo64842b();
                C9672e0.m27882a("MediationNativeBannerAdEngine: data from " + b + " ad network loaded successfully");
                Context l = C9637c1.this.mo65790l();
                if (mo63665a() && l != null) {
                    C9912p8.m29007b(b, nativeBanner, l);
                }
                C9637c1.this.mo65786a(this.f23700a, true);
                C9637c1 c1Var = C9637c1.this;
                c1Var.f23697l = nativeBanner;
                NativeBannerAd.NativeBannerAdListener listener = c1Var.f23696k.getListener();
                if (listener != null) {
                    listener.onLoad(nativeBanner, C9637c1.this.f23696k);
                }
            }
        }

        public void onNoAd(String str, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (C9637c1.this.f25036d == mediationNativeBannerAdAdapter) {
                C9672e0.m27882a("MediationNativeBannerAdEngine: no data from " + this.f23700a.mo64842b() + " ad network");
                C9637c1.this.mo65786a(this.f23700a, false);
            }
        }

        public void onShow(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            C9637c1 c1Var = C9637c1.this;
            if (c1Var.f25036d == mediationNativeBannerAdAdapter) {
                Context l = c1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23700a.mo64848h().mo63675a("playbackStarted"), l);
                }
                NativeBannerAd.NativeBannerAdListener listener = C9637c1.this.f23696k.getListener();
                if (listener != null) {
                    listener.onShow(C9637c1.this.f23696k);
                }
            }
        }
    }

    /* renamed from: com.my.target.c1$b */
    public static class C9639b extends C10063z0.C10064a implements MediationNativeBannerAdConfig {

        /* renamed from: g */
        public final int f23702g;

        /* renamed from: h */
        public final int f23703h;

        public C9639b(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4) {
            super(str, str2, map, i, i2, myTargetPrivacy);
            this.f23702g = i3;
            this.f23703h = i4;
        }

        /* renamed from: a */
        public static C9639b m27735a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4) {
            return new C9639b(str, str2, map, i, i2, myTargetPrivacy, i3, i4);
        }

        public int getAdChoicesPlacement() {
            return this.f23703h;
        }

        public int getCachePolicy() {
            return this.f23702g;
        }
    }

    public C9637c1(NativeBannerAd nativeBannerAd, C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        super(m2Var, aVar, aVar2);
        this.f23696k = nativeBannerAd;
    }

    /* renamed from: a */
    public static C9637c1 m27722a(NativeBannerAd nativeBannerAd, C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9637c1(nativeBannerAd, m2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public final void mo63656a(ImageData imageData, C9804k6 k6Var) {
        if (imageData != null) {
            C9807k8.m28512a(imageData, (ImageView) k6Var);
        }
        k6Var.setImageData((ImageData) null);
    }

    /* renamed from: a */
    public void mo63411a(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter, C9858n2 n2Var, Context context) {
        C9639b a = C9639b.m27735a(n2Var.mo64845e(), n2Var.mo64844d(), n2Var.mo64843c(), this.f25033a.getCustomParams().getAge(), this.f25033a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), this.f25033a.getCachePolicy(), this.f23696k.getAdChoicesPlacement());
        if (mediationNativeBannerAdAdapter instanceof MyTargetNativeBannerAdAdapter) {
            C9916q2 g = n2Var.mo64847g();
            if (g instanceof C9997v2) {
                ((MyTargetNativeBannerAdAdapter) mediationNativeBannerAdAdapter).setSection((C9997v2) g);
            }
        }
        try {
            mediationNativeBannerAdAdapter.load(a, new C9638a(n2Var), context);
        } catch (Throwable th) {
            C9672e0.m27883b("MediationNativeBannerAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo63658a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        C9672e0.m27882a("NativeBannerAdMediaListener is not currently supported for mediation");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63659a(com.p374my.target.nativeads.views.IconAdView r3, android.view.View r4, com.p374my.target.common.models.ImageData r5, java.util.List<android.view.View> r6) {
        /*
            r2 = this;
            if (r5 != 0) goto L_0x0007
            r0 = 0
        L_0x0003:
            r3.setPlaceHolderDimension(r0, r0)
            goto L_0x0021
        L_0x0007:
            int r0 = r5.getWidth()
            if (r0 <= 0) goto L_0x001f
            int r0 = r5.getHeight()
            if (r0 <= 0) goto L_0x001f
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            r3.setPlaceHolderDimension(r0, r1)
            goto L_0x0021
        L_0x001f:
            r0 = 1
            goto L_0x0003
        L_0x0021:
            if (r4 == 0) goto L_0x0038
            java.lang.String r5 = "MediationNativeBannerAdEngine: got IconView from adapter"
            com.p374my.target.C9672e0.m27882a(r5)
            r3.addView(r4)
            int r3 = r6.indexOf(r3)
            if (r3 < 0) goto L_0x0041
            r6.remove(r3)
            r6.add(r4)
            goto L_0x0041
        L_0x0038:
            android.widget.ImageView r3 = r3.getImageView()
            com.my.target.k6 r3 = (com.p374my.target.C9804k6) r3
            r2.mo63660b(r5, r3)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9637c1.mo63659a(com.my.target.nativeads.views.IconAdView, android.view.View, com.my.target.common.models.ImageData, java.util.List):void");
    }

    /* renamed from: a */
    public boolean mo63414a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeBannerAdAdapter;
    }

    /* renamed from: b */
    public final void mo63660b(ImageData imageData, C9804k6 k6Var) {
        k6Var.setImageData(imageData);
        if (imageData != null && imageData.getBitmap() == null) {
            C9807k8.m28516b(imageData, k6Var);
        }
    }

    /* renamed from: h */
    public NativeBanner mo63661h() {
        return this.f23697l;
    }

    /* renamed from: j */
    public void mo63417j() {
        NativeBannerAd.NativeBannerAdListener listener = this.f23696k.getListener();
        if (listener != null) {
            listener.onNoAd("No data for available ad networks", this.f23696k);
        }
    }

    /* renamed from: n */
    public MediationNativeBannerAdAdapter mo63418k() {
        return new MyTargetNativeBannerAdAdapter();
    }

    public void registerView(View view, List<View> list, int i) {
        String str;
        if (this.f25036d == null) {
            str = "MediationNativeBannerAdEngine error: can't register view, adapter is not set";
        } else if (this.f23697l == null) {
            str = "MediationNativeBannerAdEngine error: can't register view, banner is null or not loaded yet";
        } else {
            unregisterView();
            List arrayList = list != null ? new ArrayList(list) : Collections.EMPTY_LIST;
            if (!(this.f25036d instanceof MyTargetNativeBannerAdAdapter) && (view instanceof ViewGroup)) {
                IconAdView e = C9937r8.m29152c((ViewGroup) view).mo65344e();
                if (e != null) {
                    this.f23698m = new WeakReference<>(e);
                    View view2 = null;
                    try {
                        view2 = ((MediationNativeBannerAdAdapter) this.f25036d).getIconView(view.getContext());
                    } catch (Throwable th) {
                        C9672e0.m27883b("MediationNativeBannerAdEngine error: " + th.toString());
                    }
                    if (view2 != null) {
                        this.f23699n = new WeakReference<>(view2);
                    }
                    mo63659a(e, view2, this.f23697l.getIcon(), (List<View>) arrayList);
                } else {
                    str = "IconView component not found in ad view  " + view + ". It's required";
                }
            }
            try {
                ((MediationNativeBannerAdAdapter) this.f25036d).registerView(view, arrayList, i);
                return;
            } catch (Throwable th2) {
                C9672e0.m27883b("MediationNativeBannerAdEngine error: " + th2.toString());
                return;
            }
        }
        C9672e0.m27883b(str);
    }

    public void unregisterView() {
        if (this.f25036d == null) {
            C9672e0.m27883b("MediationNativeBannerAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference<View> weakReference = this.f23699n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.f23699n.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference<IconAdView> weakReference2 = this.f23698m;
        IconAdView iconAdView = weakReference2 != null ? (IconAdView) weakReference2.get() : null;
        if (iconAdView != null) {
            this.f23698m.clear();
            NativeBanner nativeBanner = this.f23697l;
            mo63656a(nativeBanner != null ? nativeBanner.getIcon() : null, (C9804k6) iconAdView.getImageView());
        }
        this.f23699n = null;
        this.f23698m = null;
        try {
            ((MediationNativeBannerAdAdapter) this.f25036d).unregisterView();
        } catch (Throwable th) {
            C9672e0.m27883b("MediationNativeBannerAdEngine error: " + th.toString());
        }
    }
}
