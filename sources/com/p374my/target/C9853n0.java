package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p374my.target.C10005v6;
import com.p374my.target.C9609a9;
import com.p374my.target.C9707g0;
import com.p374my.target.C9807k8;
import com.p374my.target.C9812l0;
import com.p374my.target.C9834m0;
import com.p374my.target.C9906p6;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import com.p374my.target.nativeads.views.IconAdView;
import com.p374my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.n0 */
public final class C9853n0 {

    /* renamed from: a */
    public final boolean f24357a;

    /* renamed from: b */
    public final C9750i1 f24358b;

    /* renamed from: c */
    public final C9856c f24359c;

    /* renamed from: d */
    public final C9733h2 f24360d;

    /* renamed from: e */
    public final C9789k0 f24361e;

    /* renamed from: f */
    public final C9609a9 f24362f;

    /* renamed from: g */
    public final C9609a9.C9612c f24363g;

    /* renamed from: h */
    public final C9906p6.C9907a f24364h;

    /* renamed from: i */
    public boolean f24365i;

    /* renamed from: j */
    public boolean f24366j;

    /* renamed from: k */
    public boolean f24367k;

    /* renamed from: l */
    public boolean f24368l = true;

    /* renamed from: m */
    public boolean f24369m;

    /* renamed from: n */
    public int f24370n = 0;

    /* renamed from: o */
    public C9834m0 f24371o;

    /* renamed from: p */
    public Parcelable f24372p;

    /* renamed from: q */
    public C9937r8 f24373q;

    /* renamed from: r */
    public View.OnClickListener f24374r;

    /* renamed from: com.my.target.n0$a */
    public class C9854a extends C9609a9.C9612c {
        public C9854a() {
        }

        /* renamed from: a */
        public void mo63500a() {
            C9853n0.this.mo64824c();
        }

        /* renamed from: a */
        public void mo63501a(boolean z) {
            C9853n0.this.mo64832e(z);
        }
    }

    /* renamed from: com.my.target.n0$b */
    public class C9855b implements C9707g0.C9709b {
        public C9855b() {
        }

        /* renamed from: a */
        public void mo63363a(Context context) {
            C10039x8.m29720c((List<C9626b3>) C9853n0.this.f24360d.getStatHolder().mo63675a("closedByUser"), context);
            ViewGroup h = C9853n0.this.f24373q != null ? C9853n0.this.f24373q.mo65348h() : null;
            C9853n0.this.f24362f.mo63497b();
            C9853n0.this.f24362f.mo63495a((C9609a9.C9612c) null);
            C9853n0.this.mo64819a(false);
            boolean unused = C9853n0.this.f24369m = true;
            if (h != null) {
                h.setVisibility(4);
            }
        }
    }

    /* renamed from: com.my.target.n0$c */
    public interface C9856c extends C9834m0.C9837c, C10005v6.C10006a, View.OnClickListener, C9812l0.C9813a {
        /* renamed from: a */
        void mo63986a(View view);

        /* renamed from: b */
        void mo63990b();

        /* renamed from: g */
        void mo63995g();
    }

    public C9853n0(C9733h2 h2Var, C9856c cVar, C9750i1 i1Var) {
        boolean z = true;
        this.f24359c = cVar;
        this.f24360d = h2Var;
        this.f24357a = h2Var.getNativeAdCards().size() > 0;
        this.f24358b = i1Var;
        C9711g2<VideoData> videoBanner = h2Var.getVideoBanner();
        this.f24365i = (videoBanner == null || videoBanner.getMediaData() == null) ? false : true;
        this.f24361e = C9789k0.m28419b(h2Var.getAdChoices());
        this.f24362f = C9609a9.m27616a(h2Var.getViewability(), h2Var.getStatHolder(), videoBanner != null ? false : z);
        this.f24363g = new C9854a();
        this.f24364h = new C9906p6.C9907a() {
            /* renamed from: a */
            public final void mo63317a(boolean z) {
                C9853n0.this.mo64829d(z);
            }
        };
    }

    /* renamed from: a */
    public static C9853n0 m28755a(C9733h2 h2Var, C9856c cVar, C9750i1 i1Var) {
        return new C9853n0(h2Var, cVar, i1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28756a(View view) {
        mo64811a(view, this.f24371o);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28760b(boolean z) {
        if (z) {
            this.f24359c.mo63995g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m28762c(boolean z) {
        if (z) {
            this.f24359c.mo63990b();
        }
    }

    /* renamed from: a */
    public final C9990u5 mo64807a(C9777j2 j2Var, MediaAdView mediaAdView) {
        C9990u5 a = mo64808a(mediaAdView);
        if (a == null) {
            a = new C9990u5(mediaAdView.getContext());
            mediaAdView.addView(a, new ViewGroup.LayoutParams(-2, -2));
        }
        a.mo65556a(this.f24360d.getCtcText(), this.f24360d.getCtcIcon());
        $$Lambda$n0$ORVoNLa0pO74sR6TJHwTVVOMWs r5 = new View.OnClickListener(j2Var) {
            public final /* synthetic */ C9777j2 f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C9853n0.this.m28757a(this.f$1, view);
            }
        };
        this.f24374r = r5;
        a.setOnClickListener(r5);
        return a;
    }

    /* renamed from: a */
    public final C9990u5 mo64808a(MediaAdView mediaAdView) {
        int childCount = mediaAdView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof C9990u5) {
                return (C9990u5) childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo64809a() {
        MediaAdView f;
        this.f24365i = false;
        this.f24370n = 0;
        C9834m0 m0Var = this.f24371o;
        if (m0Var != null) {
            m0Var.mo64693A();
        }
        C9937r8 r8Var = this.f24373q;
        if (r8Var != null && (f = r8Var.mo65345f()) != null) {
            ImageData image = this.f24360d.getImage();
            f.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
            C9991u6 b = mo64820b(f);
            if (b != null) {
                this.f24372p = b.getState();
                b.dispose();
                ((View) b).setVisibility(8);
            }
            mo64815a(f, image);
            f.getImageView().setVisibility(0);
            f.getProgressBarView().setVisibility(8);
            f.getPlayButtonView().setVisibility(8);
            if (this.f24368l) {
                f.setOnClickListener(this.f24359c);
            }
        }
    }

    /* renamed from: a */
    public void m28757a(View view, C9777j2 j2Var) {
        C9812l0 a = C9812l0.m28527a(j2Var);
        a.mo64625a((C9812l0.C9813a) this.f24359c);
        a.mo64624a(view.getContext());
    }

    /* renamed from: a */
    public void mo64811a(View view, C9834m0 m0Var) {
        C9777j2 content = this.f24360d.getContent();
        if (content != null) {
            m28757a(view, content);
        } else {
            m0Var.mo64704b(view);
        }
    }

    /* renamed from: a */
    public void mo64812a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        if (!(view instanceof ViewGroup)) {
            C9672e0.m27883b("unable to register view for displaying NativeAd " + view + ", should be instance of ViewGroup");
        } else if (this.f24369m) {
            C9672e0.m27883b("Registering ad was disabled by user");
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
            ViewGroup viewGroup = (ViewGroup) view;
            C9937r8 a = C9937r8.m29151a(viewGroup, list, mediaAdView, this.f24359c);
            this.f24373q = a;
            MediaAdView f = a.mo65345f();
            C10005v6 g = this.f24373q.mo65347g();
            IconAdView e = this.f24373q.mo65344e();
            this.f24368l = this.f24373q.mo65350j();
            if (e == null) {
                C9672e0.m27883b("IconAdView component not found in ad view " + viewGroup.getClass().getName() + ". It will be required in future versions of sdk.");
            } else {
                C10023w8.m29661c();
            }
            if (f == null) {
                C9672e0.m27883b("MediaAdView component not found in ad view " + viewGroup.getClass().getName() + ". It will be required in future versions of sdk.");
            } else {
                C10023w8.m29662d();
            }
            this.f24362f.mo63495a(this.f24363g);
            mo64813a(viewGroup);
            this.f24361e.mo64486a(viewGroup, this.f24373q.mo65342c(), new C9855b(), i);
            if (this.f24357a && g != null) {
                mo64818a(g);
            } else if (f != null) {
                mo64825c(f);
            }
            if (e != null) {
                mo64814a(e);
            }
            C10023w8.m29658b(viewGroup.getContext());
            if (mo64830d() || this.f24366j) {
                this.f24362f.mo63498b(viewGroup);
            }
        }
    }

    /* renamed from: a */
    public final void mo64813a(ViewGroup viewGroup) {
        C9937r8 r8Var = this.f24373q;
        if (r8Var != null) {
            C9906p6 i = r8Var.mo65349i();
            if (i == null) {
                i = new C9906p6(viewGroup.getContext());
                C10059y8.m29840b(i, "viewability_view");
                try {
                    viewGroup.addView(i);
                    this.f24373q.mo65335a(i);
                } catch (Throwable th) {
                    C9672e0.m27882a("Unable to add Viewability View: " + th.getMessage());
                    this.f24366j = true;
                    return;
                }
            }
            i.setViewabilityListener(this.f24364h);
        }
    }

    /* renamed from: a */
    public final void mo64814a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof C9804k6) {
            ImageData icon = this.f24360d.getIcon();
            if (icon != null) {
                Bitmap bitmap = icon.getBitmap();
                int width = icon.getWidth();
                int height = icon.getHeight();
                if (width <= 0 || height <= 0) {
                    width = 100;
                    height = 100;
                }
                ((C9804k6) imageView).setPlaceholderDimensions(width, height);
                if (bitmap == null) {
                    C9807k8.m28513a(icon, imageView, new C9807k8.C9808a() {
                        /* renamed from: a */
                        public final void mo63328a(boolean z) {
                            C9853n0.this.m28762c(z);
                        }
                    });
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            } else {
                imageView.setImageBitmap((Bitmap) null);
                ((C9804k6) imageView).setPlaceholderDimensions(0, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo64815a(MediaAdView mediaAdView, ImageData imageData) {
        if (imageData != null) {
            int width = imageData.getWidth();
            int height = imageData.getHeight();
            if (this.f24367k || width <= 0 || height <= 0) {
                mediaAdView.setPlaceHolderDimension(16, 9);
                this.f24367k = true;
                return;
            }
            mediaAdView.setPlaceHolderDimension(width, height);
            return;
        }
        mediaAdView.setPlaceHolderDimension(0, 0);
    }

    /* renamed from: a */
    public final void mo64816a(MediaAdView mediaAdView, C9834m0 m0Var) {
        m0Var.mo64696a((View.OnClickListener) this.f24359c);
        C9937r8 r8Var = this.f24373q;
        if (r8Var != null) {
            m0Var.mo64699a(mediaAdView, r8Var.mo65343d());
        }
    }

    /* renamed from: a */
    public final void mo64817a(MediaAdView mediaAdView, boolean z, C9834m0.C9837c cVar) {
        VideoData videoData;
        this.f24370n = 1;
        C9711g2<VideoData> videoBanner = this.f24360d.getVideoBanner();
        if (videoBanner != null) {
            mediaAdView.setPlaceHolderDimension(videoBanner.getWidth(), videoBanner.getHeight());
            videoData = videoBanner.getMediaData();
        } else {
            videoData = null;
        }
        if (this.f24371o == null && videoData != null) {
            this.f24370n = 1;
            this.f24371o = new C9834m0(this.f24360d, videoBanner, videoData, this.f24358b);
        }
        if (this.f24371o != null) {
            mediaAdView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C9853n0.this.m28756a(view);
                }
            });
            this.f24371o.mo64698a(cVar);
            this.f24371o.mo64705c(z);
            this.f24371o.mo64702a(z);
            mo64816a(mediaAdView, this.f24371o);
        }
    }

    /* renamed from: a */
    public final void mo64818a(C10005v6 v6Var) {
        this.f24370n = 2;
        v6Var.setPromoCardSliderListener(this.f24359c);
        Parcelable parcelable = this.f24372p;
        if (parcelable != null) {
            v6Var.restoreState(parcelable);
        }
    }

    /* renamed from: a */
    public void mo64819a(boolean z) {
        C9834m0 m0Var = this.f24371o;
        if (m0Var != null) {
            if (z) {
                m0Var.mo64714v();
            } else {
                m0Var.mo64713u();
            }
        }
    }

    /* renamed from: b */
    public final C9991u6 mo64820b(MediaAdView mediaAdView) {
        if (!this.f24357a) {
            return null;
        }
        for (int i = 0; i < mediaAdView.getChildCount(); i++) {
            View childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof C10005v6) {
                return (C9991u6) childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo64821b(IconAdView iconAdView) {
        iconAdView.setOnClickListener((View.OnClickListener) null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap((Bitmap) null);
        if (imageView instanceof C9804k6) {
            ((C9804k6) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData icon = this.f24360d.getIcon();
        if (icon != null) {
            C9807k8.m28512a(icon, imageView);
        }
    }

    /* renamed from: b */
    public final void mo64822b(MediaAdView mediaAdView, ImageData imageData) {
        C9804k6 k6Var = (C9804k6) mediaAdView.getImageView();
        if (imageData != null) {
            Bitmap bitmap = imageData.getBitmap();
            if (bitmap != null) {
                k6Var.setImageBitmap(bitmap);
                return;
            }
            k6Var.setImageBitmap((Bitmap) null);
            C9807k8.m28513a(imageData, k6Var, new C9807k8.C9808a() {
                /* renamed from: a */
                public final void mo63328a(boolean z) {
                    C9853n0.this.m28760b(z);
                }
            });
            return;
        }
        k6Var.setImageBitmap((Bitmap) null);
    }

    /* renamed from: b */
    public int[] mo64823b() {
        MediaAdView f;
        C9991u6 b;
        C9937r8 r8Var = this.f24373q;
        if (r8Var == null) {
            return null;
        }
        int i = this.f24370n;
        if (i == 2) {
            C10005v6 g = r8Var.mo65347g();
            if (g == null) {
                return null;
            }
            return g.getVisibleCardNumbers();
        } else if (i != 3 || (f = r8Var.mo65345f()) == null || (b = mo64820b(f)) == null) {
            return null;
        } else {
            return b.getVisibleCardNumbers();
        }
    }

    /* renamed from: c */
    public void mo64824c() {
        C9937r8 r8Var;
        C9937r8 r8Var2 = this.f24373q;
        ViewGroup h = r8Var2 != null ? r8Var2.mo65348h() : null;
        if (h != null) {
            this.f24359c.mo63986a(h);
        }
        if (this.f24370n != 1 && (r8Var = this.f24373q) != null) {
            r8Var.mo65332a();
        }
    }

    /* renamed from: c */
    public final void mo64825c(MediaAdView mediaAdView) {
        ImageData image = this.f24360d.getImage();
        if (this.f24357a) {
            mo64826c(mediaAdView, image);
            return;
        }
        mo64822b(mediaAdView, image);
        C9990u5 u5Var = null;
        C9777j2 content = this.f24360d.getContent();
        if (content != null) {
            u5Var = mo64807a(content, mediaAdView);
        }
        if (this.f24365i) {
            mo64817a(mediaAdView, u5Var != null, (C9834m0.C9837c) this.f24359c);
        } else {
            mo64828d(mediaAdView, image);
        }
    }

    /* renamed from: c */
    public final void mo64826c(MediaAdView mediaAdView, ImageData imageData) {
        mo64815a(mediaAdView, imageData);
        if (this.f24370n != 2) {
            this.f24370n = 3;
            Context context = mediaAdView.getContext();
            C9991u6 b = mo64820b(mediaAdView);
            if (b == null) {
                b = new C9972t6(context);
                mediaAdView.addView(b.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
            Parcelable parcelable = this.f24372p;
            if (parcelable != null) {
                b.restoreState(parcelable);
            }
            b.getView().setClickable(this.f24368l);
            b.setupCards(this.f24360d.getNativeAdCards());
            b.setPromoCardSliderListener(this.f24359c);
            mediaAdView.setBackgroundColor(0);
            b.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo64827d(MediaAdView mediaAdView) {
        ImageData image = this.f24360d.getImage();
        C9804k6 k6Var = (C9804k6) mediaAdView.getImageView();
        if (image != null) {
            C9807k8.m28512a(image, (ImageView) k6Var);
        }
        mediaAdView.getProgressBarView().setVisibility(8);
        mediaAdView.getPlayButtonView().setVisibility(8);
        k6Var.setImageData((ImageData) null);
        mediaAdView.setPlaceHolderDimension(0, 0);
        mediaAdView.setOnClickListener((View.OnClickListener) null);
        mediaAdView.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        C9991u6 b = mo64820b(mediaAdView);
        if (b != null) {
            this.f24372p = b.getState();
            b.dispose();
            ((View) b).setVisibility(8);
        }
        C9990u5 a = mo64808a(mediaAdView);
        if (a != null) {
            mediaAdView.removeView(a);
        }
    }

    /* renamed from: d */
    public final void mo64828d(MediaAdView mediaAdView, ImageData imageData) {
        mo64815a(mediaAdView, imageData);
        this.f24370n = 0;
        mediaAdView.getImageView().setVisibility(0);
        mediaAdView.getPlayButtonView().setVisibility(8);
        mediaAdView.getProgressBarView().setVisibility(8);
        if (this.f24368l) {
            mediaAdView.setOnClickListener(this.f24359c);
        }
    }

    /* renamed from: d */
    public void mo64829d(boolean z) {
        ViewGroup h;
        if (z) {
            C9937r8 r8Var = this.f24373q;
            if (r8Var != null && (h = r8Var.mo65348h()) != null) {
                this.f24362f.mo63498b(h);
                return;
            }
            return;
        }
        mo64819a(false);
        this.f24362f.mo63497b();
    }

    /* renamed from: d */
    public final boolean mo64830d() {
        C9906p6 i;
        C9937r8 r8Var = this.f24373q;
        if (r8Var == null || (i = r8Var.mo65349i()) == null) {
            return false;
        }
        return i.mo65213a();
    }

    /* renamed from: e */
    public final void mo64831e() {
        C9834m0 m0Var = this.f24371o;
        if (m0Var != null) {
            m0Var.mo64693A();
        }
    }

    /* renamed from: e */
    public void mo64832e(boolean z) {
        C9937r8 r8Var = this.f24373q;
        if (r8Var == null || r8Var.mo65348h() == null) {
            mo64833f();
        } else if (this.f24370n == 1) {
            mo64819a(z);
        }
    }

    /* renamed from: f */
    public void mo64833f() {
        this.f24362f.mo63497b();
        this.f24362f.mo63495a((C9609a9.C9612c) null);
        mo64831e();
        C9937r8 r8Var = this.f24373q;
        if (r8Var != null) {
            IconAdView e = r8Var.mo65344e();
            if (e != null) {
                mo64821b(e);
            }
            MediaAdView f = this.f24373q.mo65345f();
            if (f != null) {
                mo64827d(f);
            }
            C10005v6 g = this.f24373q.mo65347g();
            if (g != null) {
                g.setPromoCardSliderListener((C10005v6.C10006a) null);
                this.f24372p = g.getState();
                g.dispose();
            }
            ViewGroup h = this.f24373q.mo65348h();
            if (h != null) {
                this.f24361e.mo64485a(h);
                h.setVisibility(0);
            }
            this.f24373q.mo65338b();
            this.f24373q = null;
        }
    }
}
