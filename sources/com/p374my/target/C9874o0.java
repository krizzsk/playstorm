package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p374my.target.C9609a9;
import com.p374my.target.C9707g0;
import com.p374my.target.C9807k8;
import com.p374my.target.C9906p6;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.nativeads.views.IconAdView;
import java.util.List;

/* renamed from: com.my.target.o0 */
public class C9874o0 {

    /* renamed from: a */
    public final C9877c f24409a;

    /* renamed from: b */
    public final C9733h2 f24410b;

    /* renamed from: c */
    public final C9789k0 f24411c;

    /* renamed from: d */
    public final C9609a9 f24412d;

    /* renamed from: e */
    public final C9609a9.C9612c f24413e = new C9875a();

    /* renamed from: f */
    public final C9906p6.C9907a f24414f = new C9906p6.C9907a() {
        /* renamed from: a */
        public final void mo63317a(boolean z) {
            C9874o0.this.mo65144b(z);
        }
    };

    /* renamed from: g */
    public boolean f24415g;

    /* renamed from: h */
    public C9937r8 f24416h;

    /* renamed from: i */
    public boolean f24417i;

    /* renamed from: com.my.target.o0$a */
    public class C9875a extends C9609a9.C9612c {
        public C9875a() {
        }

        /* renamed from: a */
        public void mo63500a() {
            C9874o0.this.mo65139a();
        }
    }

    /* renamed from: com.my.target.o0$b */
    public class C9876b implements C9707g0.C9709b {
        public C9876b() {
        }

        /* renamed from: a */
        public void mo63363a(Context context) {
            C10039x8.m29720c((List<C9626b3>) C9874o0.this.f24410b.getStatHolder().mo63675a("closedByUser"), context);
            ViewGroup h = C9874o0.this.f24416h != null ? C9874o0.this.f24416h.mo65348h() : null;
            C9874o0.this.f24412d.mo63497b();
            C9874o0.this.f24412d.mo63495a((C9609a9.C9612c) null);
            boolean unused = C9874o0.this.f24417i = true;
            if (h != null) {
                h.setVisibility(4);
            }
        }
    }

    /* renamed from: com.my.target.o0$c */
    public interface C9877c extends View.OnClickListener {
        /* renamed from: a */
        void mo64149a(View view);

        /* renamed from: b */
        void mo64150b();
    }

    public C9874o0(C9733h2 h2Var, C9877c cVar) {
        this.f24409a = cVar;
        this.f24410b = h2Var;
        this.f24411c = C9789k0.m28419b(h2Var.getAdChoices());
        this.f24412d = C9609a9.m27616a(h2Var.getViewability(), h2Var.getStatHolder(), true);
    }

    /* renamed from: a */
    public static C9874o0 m28863a(C9733h2 h2Var, C9877c cVar) {
        return new C9874o0(h2Var, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28864a(boolean z) {
        if (z) {
            this.f24409a.mo64150b();
        }
    }

    /* renamed from: a */
    public void mo65139a() {
        C9937r8 r8Var = this.f24416h;
        ViewGroup h = r8Var != null ? r8Var.mo65348h() : null;
        if (h != null) {
            this.f24409a.mo64149a(h);
        }
        C9937r8 r8Var2 = this.f24416h;
        if (r8Var2 != null) {
            r8Var2.mo65332a();
        }
    }

    /* renamed from: a */
    public void mo65140a(View view, List<View> list, int i) {
        if (this.f24417i) {
            C9672e0.m27883b("Registering ad was disabled by user");
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            C9672e0.m27883b("unable to register view for displaying NativeBannerAd " + view + ", should be instance of ViewGroup");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C9937r8 a = C9937r8.m29150a(viewGroup, list, this.f24409a);
        this.f24416h = a;
        IconAdView e = a.mo65344e();
        if (e == null) {
            C9672e0.m27883b("IconAdView component not found in ad view  " + viewGroup + ". It's required");
            return;
        }
        C10023w8.m29661c();
        mo65142a(e);
        this.f24412d.mo63495a(this.f24413e);
        mo65141a(viewGroup);
        this.f24411c.mo64486a(viewGroup, this.f24416h.mo65342c(), new C9876b(), i);
        if (mo65145b() || this.f24415g) {
            this.f24412d.mo63498b(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo65141a(ViewGroup viewGroup) {
        C9937r8 r8Var = this.f24416h;
        if (r8Var != null) {
            C9906p6 i = r8Var.mo65349i();
            if (i == null) {
                i = new C9906p6(viewGroup.getContext());
                C10059y8.m29840b(i, "viewability_view");
                try {
                    viewGroup.addView(i);
                    this.f24416h.mo65335a(i);
                } catch (Throwable th) {
                    C9672e0.m27882a("Unable to add Viewability View: " + th.getMessage());
                    this.f24415g = true;
                    return;
                }
            }
            i.setViewabilityListener(this.f24414f);
        }
    }

    /* renamed from: a */
    public final void mo65142a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof C9804k6) {
            ImageData icon = this.f24410b.getIcon();
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
                            C9874o0.this.m28864a(z);
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

    /* renamed from: b */
    public final void mo65143b(IconAdView iconAdView) {
        iconAdView.setOnClickListener((View.OnClickListener) null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap((Bitmap) null);
        if (imageView instanceof C9804k6) {
            ((C9804k6) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData icon = this.f24410b.getIcon();
        if (icon != null) {
            C9807k8.m28512a(icon, imageView);
        }
    }

    /* renamed from: b */
    public void mo65144b(boolean z) {
        ViewGroup h;
        if (z) {
            C9937r8 r8Var = this.f24416h;
            if (r8Var != null && (h = r8Var.mo65348h()) != null) {
                this.f24412d.mo63498b(h);
                return;
            }
            return;
        }
        this.f24412d.mo63497b();
    }

    /* renamed from: b */
    public final boolean mo65145b() {
        C9906p6 i;
        C9937r8 r8Var = this.f24416h;
        if (r8Var == null || (i = r8Var.mo65349i()) == null) {
            return false;
        }
        return i.mo65213a();
    }

    /* renamed from: c */
    public void mo65146c() {
        this.f24412d.mo63497b();
        this.f24412d.mo63495a((C9609a9.C9612c) null);
        C9937r8 r8Var = this.f24416h;
        if (r8Var != null) {
            IconAdView e = r8Var.mo65344e();
            if (e != null) {
                mo65143b(e);
            }
            ViewGroup h = this.f24416h.mo65348h();
            if (h != null) {
                this.f24411c.mo64485a(h);
                h.setVisibility(0);
            }
            this.f24416h.mo65338b();
            this.f24416h = null;
        }
    }
}
