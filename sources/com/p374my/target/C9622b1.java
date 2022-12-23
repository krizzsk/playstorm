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
import com.p374my.target.mediation.MediationNativeAdAdapter;
import com.p374my.target.mediation.MediationNativeAdConfig;
import com.p374my.target.mediation.MyTargetNativeAdAdapter;
import com.p374my.target.nativeads.NativeAd;
import com.p374my.target.nativeads.banners.NativePromoBanner;
import com.p374my.target.nativeads.views.IconAdView;
import com.p374my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.b1 */
public class C9622b1 extends C10063z0<MediationNativeAdAdapter> implements C9914q0 {

    /* renamed from: k */
    public final NativeAd f23653k;

    /* renamed from: l */
    public NativePromoBanner f23654l;

    /* renamed from: m */
    public WeakReference<MediaAdView> f23655m;

    /* renamed from: n */
    public WeakReference<View> f23656n;

    /* renamed from: o */
    public WeakReference<IconAdView> f23657o;

    /* renamed from: com.my.target.b1$a */
    public class C9623a implements MediationNativeAdAdapter.MediationNativeAdListener {

        /* renamed from: a */
        public final C9858n2 f23658a;

        public C9623a(C9858n2 n2Var) {
            this.f23658a = n2Var;
        }

        /* renamed from: a */
        public final boolean mo63582a() {
            return !"myTarget".equals(this.f23658a.mo64842b()) && !"0".equals(this.f23658a.mo64843c().get("lg"));
        }

        public void onClick(MediationNativeAdAdapter mediationNativeAdAdapter) {
            C9622b1 b1Var = C9622b1.this;
            if (b1Var.f25036d == mediationNativeAdAdapter) {
                Context l = b1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23658a.mo64848h().mo63675a("click"), l);
                }
                NativeAd.NativeAdListener listener = C9622b1.this.f23653k.getListener();
                if (listener != null) {
                    listener.onClick(C9622b1.this.f23653k);
                }
            }
        }

        public void onLoad(NativePromoBanner nativePromoBanner, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (C9622b1.this.f25036d == mediationNativeAdAdapter) {
                String b = this.f23658a.mo64842b();
                C9672e0.m27882a("MediationNativeAdEngine: data from " + b + " ad network loaded successfully");
                Context l = C9622b1.this.mo65790l();
                if (mo63582a() && l != null) {
                    C9912p8.m29008b(b, nativePromoBanner, l);
                }
                C9622b1.this.mo65786a(this.f23658a, true);
                C9622b1 b1Var = C9622b1.this;
                b1Var.f23654l = nativePromoBanner;
                NativeAd.NativeAdListener listener = b1Var.f23653k.getListener();
                if (listener != null) {
                    listener.onLoad(nativePromoBanner, C9622b1.this.f23653k);
                }
            }
        }

        public void onNoAd(String str, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (C9622b1.this.f25036d == mediationNativeAdAdapter) {
                C9672e0.m27882a("MediationNativeAdEngine: no data from " + this.f23658a.mo64842b() + " ad network");
                C9622b1.this.mo65786a(this.f23658a, false);
            }
        }

        public void onShow(MediationNativeAdAdapter mediationNativeAdAdapter) {
            C9622b1 b1Var = C9622b1.this;
            if (b1Var.f25036d == mediationNativeAdAdapter) {
                Context l = b1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23658a.mo64848h().mo63675a("playbackStarted"), l);
                }
                NativeAd.NativeAdListener listener = C9622b1.this.f23653k.getListener();
                if (listener != null) {
                    listener.onShow(C9622b1.this.f23653k);
                }
            }
        }

        public void onVideoComplete(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            C9622b1 b1Var = C9622b1.this;
            if (b1Var.f25036d == mediationNativeAdAdapter && (listener = b1Var.f23653k.getListener()) != null) {
                listener.onVideoComplete(C9622b1.this.f23653k);
            }
        }

        public void onVideoPause(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            C9622b1 b1Var = C9622b1.this;
            if (b1Var.f25036d == mediationNativeAdAdapter && (listener = b1Var.f23653k.getListener()) != null) {
                listener.onVideoPause(C9622b1.this.f23653k);
            }
        }

        public void onVideoPlay(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            C9622b1 b1Var = C9622b1.this;
            if (b1Var.f25036d == mediationNativeAdAdapter && (listener = b1Var.f23653k.getListener()) != null) {
                listener.onVideoPlay(C9622b1.this.f23653k);
            }
        }
    }

    /* renamed from: com.my.target.b1$b */
    public static class C9624b extends C10063z0.C10064a implements MediationNativeAdConfig {

        /* renamed from: g */
        public final int f23660g;

        /* renamed from: h */
        public final int f23661h;

        public C9624b(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4) {
            super(str, str2, map, i, i2, myTargetPrivacy);
            this.f23660g = i3;
            this.f23661h = i4;
        }

        /* renamed from: a */
        public static C9624b m27667a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4) {
            return new C9624b(str, str2, map, i, i2, myTargetPrivacy, i3, i4);
        }

        public int getAdChoicesPlacement() {
            return this.f23661h;
        }

        public int getCachePolicy() {
            return this.f23660g;
        }

        @Deprecated
        public boolean isAutoLoadImages() {
            int i = this.f23660g;
            return i == 0 || i == 1;
        }

        @Deprecated
        public boolean isAutoLoadVideo() {
            int i = this.f23660g;
            return i == 0 || i == 2;
        }
    }

    public C9622b1(NativeAd nativeAd, C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        super(m2Var, aVar, aVar2);
        this.f23653k = nativeAd;
    }

    /* renamed from: a */
    public static final C9622b1 m27653a(NativeAd nativeAd, C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9622b1(nativeAd, m2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public void mo63573a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        ArrayList arrayList;
        String str;
        if (this.f25036d == null) {
            str = "MediationNativeAdEngine error: can't register view, adapter is not set";
        } else if (this.f23654l == null) {
            str = "MediationNativeAdEngine error: can't register view, banner is null or not loaded yet";
        } else {
            unregisterView();
            View view2 = null;
            if (list != null) {
                arrayList = new ArrayList();
                for (View next : list) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = null;
            }
            if (!(this.f25036d instanceof MyTargetNativeAdAdapter) && (view instanceof ViewGroup)) {
                C9937r8 a = C9937r8.m29149a((ViewGroup) view, mediaAdView);
                MediaAdView f = a.mo65345f();
                if (f != null) {
                    this.f23655m = new WeakReference<>(f);
                    try {
                        view2 = ((MediationNativeAdAdapter) this.f25036d).getMediaView(view.getContext());
                    } catch (Throwable th) {
                        C9672e0.m27883b("MediationNativeAdEngine error: " + th.toString());
                    }
                    View view3 = view2;
                    if (view3 != null) {
                        this.f23656n = new WeakReference<>(view3);
                    }
                    mo63577a(f, view3, this.f23654l.getImage(), this.f23654l.hasVideo(), arrayList);
                }
                IconAdView e = a.mo65344e();
                ImageData icon = this.f23654l.getIcon();
                if (!(e == null || icon == null)) {
                    this.f23657o = new WeakReference<>(e);
                    mo63578b(icon, (C9804k6) e.getImageView());
                }
            }
            try {
                ((MediationNativeAdAdapter) this.f25036d).registerView(view, arrayList, i);
                return;
            } catch (Throwable th2) {
                C9672e0.m27883b("MediationNativeAdEngine error: " + th2.toString());
                return;
            }
        }
        C9672e0.m27883b(str);
    }

    /* renamed from: a */
    public final void mo63574a(ImageData imageData, C9804k6 k6Var) {
        if (imageData != null) {
            C9807k8.m28512a(imageData, (ImageView) k6Var);
        }
        k6Var.setImageData((ImageData) null);
    }

    /* renamed from: a */
    public void mo63411a(MediationNativeAdAdapter mediationNativeAdAdapter, C9858n2 n2Var, Context context) {
        C9624b a = C9624b.m27667a(n2Var.mo64845e(), n2Var.mo64844d(), n2Var.mo64843c(), this.f25033a.getCustomParams().getAge(), this.f25033a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), this.f25033a.getCachePolicy(), this.f23653k.getAdChoicesPlacement());
        if (mediationNativeAdAdapter instanceof MyTargetNativeAdAdapter) {
            C9916q2 g = n2Var.mo64847g();
            if (g instanceof C9997v2) {
                ((MyTargetNativeAdAdapter) mediationNativeAdAdapter).setSection((C9997v2) g);
            }
        }
        try {
            mediationNativeAdAdapter.load(a, new C9623a(n2Var), context);
        } catch (Throwable th) {
            C9672e0.m27883b("MediationNativeAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo63576a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        C9672e0.m27882a("NativeAdMediaListener is not currently supported for mediation");
    }

    /* renamed from: a */
    public final void mo63577a(MediaAdView mediaAdView, View view, ImageData imageData, boolean z, List<View> list) {
        int indexOf;
        int i;
        int i2;
        if (imageData != null || z) {
            if (imageData == null || imageData.getWidth() <= 0 || imageData.getHeight() <= 0) {
                i = 16;
                i2 = 10;
            } else {
                i = imageData.getWidth();
                i2 = imageData.getHeight();
            }
            mediaAdView.setPlaceHolderDimension(i, i2);
        } else {
            mediaAdView.setPlaceHolderDimension(0, 0);
        }
        if (view != null) {
            C9672e0.m27882a("MediationNativeAdEngine: got MediaView from adapter");
            mediaAdView.addView(view);
            if (list != null && (indexOf = list.indexOf(mediaAdView)) >= 0) {
                list.remove(indexOf);
                list.add(view);
                return;
            }
            return;
        }
        mo63578b(imageData, (C9804k6) mediaAdView.getImageView());
    }

    /* renamed from: a */
    public boolean mo63414a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeAdAdapter;
    }

    /* renamed from: b */
    public final void mo63578b(ImageData imageData, C9804k6 k6Var) {
        k6Var.setImageData(imageData);
        if (imageData != null && imageData.getBitmap() == null) {
            C9807k8.m28516b(imageData, k6Var);
        }
    }

    /* renamed from: g */
    public NativePromoBanner mo63579g() {
        return this.f23654l;
    }

    /* renamed from: j */
    public void mo63417j() {
        NativeAd.NativeAdListener listener = this.f23653k.getListener();
        if (listener != null) {
            listener.onNoAd("No data for available ad networks", this.f23653k);
        }
    }

    /* renamed from: n */
    public MediationNativeAdAdapter mo63418k() {
        return new MyTargetNativeAdAdapter();
    }

    public void unregisterView() {
        if (this.f25036d == null) {
            C9672e0.m27883b("MediationNativeAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference<View> weakReference = this.f23656n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.f23656n.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference<MediaAdView> weakReference2 = this.f23655m;
        MediaAdView mediaAdView = weakReference2 != null ? (MediaAdView) weakReference2.get() : null;
        if (mediaAdView != null) {
            this.f23655m.clear();
            NativePromoBanner nativePromoBanner = this.f23654l;
            mo63574a(nativePromoBanner != null ? nativePromoBanner.getImage() : null, (C9804k6) mediaAdView.getImageView());
            mediaAdView.setPlaceHolderDimension(0, 0);
        }
        WeakReference<IconAdView> weakReference3 = this.f23657o;
        IconAdView iconAdView = weakReference3 != null ? (IconAdView) weakReference3.get() : null;
        if (iconAdView != null) {
            this.f23657o.clear();
            NativePromoBanner nativePromoBanner2 = this.f23654l;
            mo63574a(nativePromoBanner2 != null ? nativePromoBanner2.getIcon() : null, (C9804k6) iconAdView.getImageView());
        }
        this.f23656n = null;
        this.f23655m = null;
        try {
            ((MediationNativeAdAdapter) this.f25036d).unregisterView();
        } catch (Throwable th) {
            C9672e0.m27883b("MediationNativeAdEngine error: " + th.toString());
        }
    }
}
