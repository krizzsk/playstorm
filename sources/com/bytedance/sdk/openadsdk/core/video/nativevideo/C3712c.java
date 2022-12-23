package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bykv.p068vk.openvk.component.video.p069a.p082e.C2510a;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.widget.C3758d;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.c */
/* compiled from: NativeVideoDetailLayout */
public class C3712c extends C3720d {

    /* renamed from: H */
    private TextView f9485H;

    /* renamed from: I */
    private ImageView f9486I;

    /* renamed from: J */
    private View f9487J;

    /* renamed from: K */
    private TextView f9488K;

    /* renamed from: L */
    private TextView f9489L;

    /* renamed from: M */
    private TextView f9490M;

    /* renamed from: N */
    private ImageView f9491N;

    /* renamed from: O */
    private View f9492O;

    /* renamed from: P */
    private ImageView f9493P;

    /* renamed from: Q */
    private TextView f9494Q;

    /* renamed from: R */
    private View f9495R;

    /* renamed from: S */
    private SeekBar f9496S;

    /* renamed from: T */
    private TextView f9497T;

    /* renamed from: U */
    private TextView f9498U;

    /* renamed from: V */
    private ImageView f9499V;

    /* renamed from: W */
    private final C2989x f9500W = new C2989x(this);
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f9501X = false;

    /* renamed from: Y */
    private boolean f9502Y = false;

    /* renamed from: Z */
    private int f9503Z = 0;

    /* renamed from: aa */
    private int f9504aa = 0;

    /* renamed from: ab */
    private int f9505ab = 0;

    /* renamed from: ac */
    private int f9506ac = 0;

    /* renamed from: ad */
    private int f9507ad = 0;

    /* renamed from: ae */
    private final Rect f9508ae = new Rect();

    /* renamed from: af */
    private ColorStateList f9509af;

    /* renamed from: ag */
    private float f9510ag;

    /* renamed from: ah */
    private final Rect f9511ah = new Rect();

    /* renamed from: ai */
    private int f9512ai = 0;

    /* renamed from: aj */
    private boolean f9513aj;

    /* renamed from: ak */
    private int f9514ak = 0;

    /* renamed from: al */
    private int f9515al = 0;

    /* renamed from: am */
    private C3758d f9516am = null;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public boolean f9517an = false;

    /* renamed from: ao */
    private final View.OnTouchListener f9518ao = new View.OnTouchListener() {

        /* renamed from: b */
        private float f9537b;

        public boolean onTouch(View view, MotionEvent motionEvent) {
            float x = motionEvent.getX();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                boolean z = true;
                if (actionMasked == 1) {
                    C3712c cVar = C3712c.this;
                    if (Math.abs(this.f9537b - motionEvent.getX()) >= 10.0f) {
                        z = false;
                    }
                    boolean unused = cVar.f9517an = z;
                } else if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else {
                this.f9537b = x;
            }
            return false;
        }
    };

    /* renamed from: ap */
    private float f9519ap;

    /* renamed from: aq */
    private ColorStateList f9520aq;

    /* renamed from: ar */
    private float f9521ar;

    /* renamed from: as */
    private final Rect f9522as = new Rect();

    /* renamed from: at */
    private float f9523at;

    /* renamed from: au */
    private ColorStateList f9524au;

    /* renamed from: av */
    private float f9525av;

    /* renamed from: aw */
    private final Rect f9526aw = new Rect();

    /* renamed from: ax */
    private final Rect f9527ax = new Rect();

    /* renamed from: ay */
    private boolean f9528ay;

    /* renamed from: az */
    private boolean f9529az;

    public C3712c(Context context, View view, boolean z, EnumSet<C2524b.C2525a> enumSet, C3498n nVar, C2526c cVar, boolean z2) {
        super(context, view, z, enumSet, nVar, cVar, z2);
        this.f9574y = C3578m.m11231a().getApplicationContext();
        mo20404d(z2);
        this.f9550a = view;
        this.f9569t = z;
        C3758d dVar = new C3758d(this);
        this.f9516am = dVar;
        dVar.mo20565a(this.f9569t);
        DisplayMetrics displayMetrics = this.f9574y.getResources().getDisplayMetrics();
        this.f9514ak = displayMetrics.widthPixels;
        this.f9515al = displayMetrics.heightPixels;
        this.f9572w = enumSet == null ? EnumSet.noneOf(C2524b.C2525a.class) : enumSet;
        this.f9541D = cVar;
        this.f9573x = nVar;
        mo20370c(8);
        mo20360a(context, this.f9550a);
        mo20372d();
        mo20405p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20360a(Context context, View view) {
        super.mo20360a(context, view);
        this.f9485H = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_back"));
        this.f9486I = (ImageView) view.findViewById(C2984t.m8432e(context, "tt_video_close"));
        this.f9487J = view.findViewById(C2984t.m8432e(context, "tt_video_top_layout"));
        this.f9491N = (ImageView) view.findViewById(C2984t.m8432e(context, "tt_video_fullscreen_back"));
        this.f9488K = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_title"));
        this.f9489L = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_top_title"));
        this.f9490M = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_current_time"));
        this.f9492O = view.findViewById(C2984t.m8432e(context, "tt_video_loading_retry"));
        this.f9493P = (ImageView) view.findViewById(C2984t.m8432e(context, "tt_video_retry"));
        TextView textView = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_retry_des"));
        this.f9494Q = textView;
        textView.setText(C2984t.m8425a(context, "tt_video_retry_des_txt"));
        this.f9496S = (SeekBar) view.findViewById(C2984t.m8432e(context, "tt_video_seekbar"));
        this.f9497T = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_time_left_time"));
        this.f9498U = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_time_play"));
        this.f9495R = view.findViewById(C2984t.m8432e(context, "tt_video_ad_bottom_layout"));
        this.f9499V = (ImageView) view.findViewById(C2984t.m8432e(context, "tt_video_ad_full_screen"));
        this.f9556g = (ViewStub) view.findViewById(C2984t.m8432e(context, "tt_video_ad_cover"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo20372d() {
        super.mo20372d();
        this.f9516am.mo20564a(this.f9550a);
        int i = 8;
        C4020v.m13282a((View) this.f9486I, (this.f9569t || this.f9572w.contains(C2524b.C2525a.hideCloseBtn)) ? 8 : 0);
        this.f9486I.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3712c.this.mo20409t()) {
                    C3712c.this.f9538A.mo16419c(C3712c.this, view);
                }
            }
        });
        TextView textView = this.f9485H;
        if (!this.f9569t || this.f9572w.contains(C2524b.C2525a.alwayShowBackBtn)) {
            i = 0;
        }
        C4020v.m13282a((View) textView, i);
        this.f9485H.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3712c.this.mo20409t()) {
                    C3712c.this.f9538A.mo16420d(C3712c.this, view);
                }
            }
        });
        this.f9491N.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3712c.this.mo20409t()) {
                    C3712c.this.f9538A.mo16421e(C3712c.this, view);
                }
            }
        });
        this.f9493P.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3712c.this.mo20400b(false, true);
                C3712c.this.mo20376h();
                C3712c.this.mo20375g();
                if (C3712c.this.mo20409t()) {
                    C3712c.this.f9538A.mo16422f(C3712c.this, view);
                }
            }
        });
        this.f9499V.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3712c.this.mo20409t()) {
                    C3712c.this.f9538A.mo16418b((C2524b) C3712c.this, view);
                }
            }
        });
        this.f9496S.setThumbOffset(0);
        this.f9496S.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!C3712c.this.f9501X && C3712c.this.f9574y != null) {
                    seekBar.setThumb(C2984t.m8430c(C3578m.m11231a(), "tt_seek_thumb_normal"));
                }
                if (C3712c.this.mo20409t()) {
                    seekBar.setThumbOffset(0);
                    C3712c.this.f9538A.mo16408a((C2524b) C3712c.this, seekBar.getProgress());
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!C3712c.this.f9501X && C3712c.this.f9574y != null) {
                    seekBar.setThumb(C2984t.m8430c(C3578m.m11231a(), "tt_seek_thumb_press"));
                }
                if (C3712c.this.mo20409t()) {
                    seekBar.setThumbOffset(0);
                    C3712c.this.f9538A.mo16415b((C2524b) C3712c.this, seekBar.getProgress());
                }
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (C3712c.this.mo20409t()) {
                    C3712c.this.f9538A.mo16409a(C3712c.this, i, z);
                }
            }
        });
        this.f9496S.setOnTouchListener(this.f9518ao);
    }

    /* renamed from: e */
    public void mo20373e() {
        this.f9500W.removeMessages(1);
        this.f9500W.sendMessageDelayed(this.f9500W.obtainMessage(1), 2000);
    }

    /* renamed from: f */
    public void mo20374f() {
        this.f9500W.removeMessages(1);
    }

    /* renamed from: b */
    public void mo20368b(boolean z) {
        int i = mo20378j() ? this.f9515al : this.f9565p;
        int i2 = mo20378j() ? this.f9514ak : this.f9566q;
        if (this.f9568s > 0 && this.f9567r > 0 && i > 0) {
            if (!mo20379k() && !mo20378j() && !this.f9572w.contains(C2524b.C2525a.fixedSize)) {
                i2 = this.f9574y.getResources().getDimensionPixelSize(C2984t.m8436i(this.f9574y, "tt_video_container_maxheight"));
            }
            int i3 = (int) (((float) this.f9568s) * ((((float) i) * 1.0f) / ((float) this.f9567r)));
            if (i3 > i2) {
                i = (int) (((float) this.f9567r) * ((((float) i2) * 1.0f) / ((float) this.f9568s)));
            } else {
                i2 = i3;
            }
            if (!z && !mo20378j()) {
                i = this.f9565p;
                i2 = this.f9566q;
            }
            this.f9551b.mo16478a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo20364a(String str) {
        TextView textView = this.f9488K;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f9489L;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    /* renamed from: a */
    public void mo20357a(int i) {
        View view = this.f9495R;
        if (view == null || view.getVisibility() != 0) {
            this.f9496S.setProgress(i);
        }
    }

    /* renamed from: a */
    public void mo20359a(long j, long j2) {
        this.f9497T.setText(C2510a.m6216a(j2));
        this.f9498U.setText(C2510a.m6216a(j));
        this.f9496S.setProgress(C2510a.m6215a(j, j2));
    }

    /* renamed from: g */
    public void mo20375g() {
        C4020v.m13318f(this.f9553d);
        C4020v.m13318f(this.f9554e);
        C4020v.m13316e(this.f9492O);
        if (!(this.f9555f == null || this.f9573x == null || this.f9573x.mo19607J() == null || this.f9573x.mo19607J().mo16358h() == null)) {
            C4020v.m13318f((View) this.f9555f);
            C3854d.m12660a().mo20704a(this.f9573x.mo19607J().mo16358h(), this.f9555f);
        }
        if (this.f9552c.getVisibility() == 0) {
            C4020v.m13282a((View) this.f9552c, 8);
        }
    }

    /* renamed from: a */
    public void mo16423a() {
        mo20365a(false, this.f9569t);
        mo20412w();
    }

    /* renamed from: a */
    public void mo20358a(long j) {
        this.f9498U.setText(C2510a.m6216a(j));
    }

    /* renamed from: a */
    public void mo16425a(C3498n nVar, WeakReference<Context> weakReference, boolean z) {
        String str;
        String str2;
        if (nVar != null) {
            mo20394a(this.f9550a, C3578m.m11231a());
            mo20365a(false, this.f9569t);
            C4020v.m13282a(this.f9557h, 0);
            C4020v.m13282a((View) this.f9558i, 0);
            C4020v.m13282a(this.f9559j, 0);
            if (!(this.f9558i == null || this.f9573x == null || this.f9573x.mo19607J() == null || this.f9573x.mo19607J().mo16358h() == null)) {
                C3854d.m12660a().mo20704a(this.f9573x.mo19607J().mo16358h(), this.f9558i);
            }
            if (!TextUtils.isEmpty(nVar.mo19608K())) {
                str = nVar.mo19608K();
            } else if (!TextUtils.isEmpty(nVar.mo19618U())) {
                str = nVar.mo19618U();
            } else {
                str = !TextUtils.isEmpty(nVar.mo19619V()) ? nVar.mo19619V() : "";
            }
            if (this.f9573x != null && this.f9573x.mo19610M() != null && this.f9573x.mo19610M().mo19559a() != null) {
                C4020v.m13282a((View) this.f9560k, 0);
                C4020v.m13282a((View) this.f9561l, 4);
                if (this.f9560k != null) {
                    C3854d.m12660a().mo20703a(this.f9573x.mo19610M(), (ImageView) this.f9560k);
                    this.f9560k.setOnClickListener(this.f9542E);
                    this.f9560k.setOnTouchListener(this.f9542E);
                }
            } else if (!TextUtils.isEmpty(str)) {
                C4020v.m13282a((View) this.f9560k, 4);
                C4020v.m13282a((View) this.f9561l, 0);
                if (this.f9561l != null) {
                    this.f9561l.setText(str.substring(0, 1));
                    this.f9561l.setOnClickListener(this.f9542E);
                    this.f9561l.setOnTouchListener(this.f9542E);
                }
            }
            if (this.f9562m != null && !TextUtils.isEmpty(str)) {
                this.f9562m.setText(str);
            }
            C4020v.m13282a((View) this.f9562m, 0);
            C4020v.m13282a((View) this.f9563n, 0);
            int L = nVar.mo19609L();
            if (L == 2 || L == 3) {
                str2 = C2984t.m8425a(this.f9574y, "tt_video_mobile_go_detail");
            } else if (L != 4) {
                str2 = L != 5 ? C2984t.m8425a(this.f9574y, "tt_video_mobile_go_detail") : C2984t.m8425a(this.f9574y, "tt_video_dial_phone");
            } else {
                str2 = C2984t.m8425a(this.f9574y, "tt_video_download_apk");
            }
            if (this.f9563n != null) {
                this.f9563n.setText(str2);
                this.f9563n.setOnClickListener(this.f9542E);
                this.f9563n.setOnTouchListener(this.f9542E);
            }
        }
    }

    /* renamed from: h */
    public void mo20376h() {
        C4020v.m13316e(this.f9553d);
        C4020v.m13316e(this.f9492O);
    }

    /* renamed from: i */
    public void mo20377i() {
        this.f9496S.setProgress(0);
        this.f9496S.setSecondaryProgress(0);
        this.f9497T.setText(C2984t.m8428b(this.f9574y, "tt_00_00"));
        this.f9498U.setText(C2984t.m8428b(this.f9574y, "tt_00_00"));
        mo20370c(8);
        if (mo20413x()) {
            this.f9551b.setVisibility(8);
        }
        if (this.f9555f != null) {
            this.f9555f.setImageDrawable((Drawable) null);
        }
        mo20370c(8);
        C4020v.m13282a(this.f9495R, 8);
        C4020v.m13282a(this.f9557h, 8);
        C4020v.m13282a((View) this.f9558i, 8);
        C4020v.m13282a(this.f9559j, 8);
        C4020v.m13282a((View) this.f9560k, 8);
        C4020v.m13282a((View) this.f9561l, 8);
        C4020v.m13282a((View) this.f9562m, 8);
        if (this.f9575z != null) {
            this.f9575z.mo20569a(true);
        }
    }

    /* renamed from: j */
    public boolean mo20378j() {
        return this.f9501X;
    }

    /* renamed from: k */
    public boolean mo20379k() {
        return this.f9569t;
    }

    /* renamed from: a */
    public void mo20362a(ViewGroup viewGroup) {
        if (viewGroup != null && (this.f9550a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.f9501X = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9550a.getLayoutParams();
            this.f9504aa = marginLayoutParams.leftMargin;
            this.f9503Z = marginLayoutParams.topMargin;
            this.f9505ab = marginLayoutParams.width;
            this.f9506ac = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.f9550a.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.f9507ad = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f9508ae.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                C4020v.m13301b(viewGroup, 0, 0, 0, 0);
            }
            mo20368b(true);
            this.f9499V.setImageDrawable(C2984t.m8430c(this.f9574y, "tt_shrink_video"));
            this.f9496S.setThumb(C2984t.m8430c(this.f9574y, "tt_seek_thumb_fullscreen_selector"));
            this.f9496S.setThumbOffset(0);
            C2510a.m6217a(this.f9550a, false);
            m12058e(this.f9501X);
            C4020v.m13282a(this.f9487J, 8);
            if (!this.f9569t) {
                C4020v.m13282a((View) this.f9486I, 8);
                C4020v.m13282a((View) this.f9485H, 8);
            } else if (this.f9572w.contains(C2524b.C2525a.hideCloseBtn)) {
                C4020v.m13282a((View) this.f9486I, 8);
            }
        }
    }

    /* renamed from: b */
    public void mo20367b(ViewGroup viewGroup) {
        C2975l.m8391e("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup != null && this.f9550a != null && (this.f9550a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.f9501X = false;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9550a.getLayoutParams();
            marginLayoutParams.width = this.f9505ab;
            marginLayoutParams.height = this.f9506ac;
            marginLayoutParams.leftMargin = this.f9504aa;
            marginLayoutParams.topMargin = this.f9503Z;
            this.f9550a.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(3, this.f9507ad);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                C4020v.m13301b(viewGroup, this.f9508ae.left, this.f9508ae.top, this.f9508ae.right, this.f9508ae.bottom);
            }
            mo20368b(true);
            this.f9499V.setImageDrawable(C2984t.m8430c(this.f9574y, "tt_enlarge_video"));
            this.f9496S.setThumb(C2984t.m8430c(this.f9574y, "tt_seek_thumb_normal"));
            this.f9496S.setThumbOffset(0);
            C2510a.m6217a(this.f9550a, true);
            m12058e(this.f9501X);
            C4020v.m13282a(this.f9487J, 8);
            if (this.f9572w.contains(C2524b.C2525a.alwayShowBackBtn)) {
                C4020v.m13282a((View) this.f9485H, 0);
            }
        }
    }

    /* renamed from: e */
    private void m12058e(boolean z) {
        if (z) {
            m12059y();
        } else {
            m12060z();
        }
    }

    /* renamed from: y */
    private void m12059y() {
        DisplayMetrics displayMetrics = this.f9574y.getResources().getDisplayMetrics();
        TextView textView = this.f9498U;
        if (textView != null) {
            this.f9519ap = textView.getTextSize();
            this.f9498U.setTextSize(2, 14.0f);
            ColorStateList textColors = this.f9498U.getTextColors();
            this.f9520aq = textColors;
            if (textColors != null) {
                this.f9498U.setTextColor(C2984t.m8437j(this.f9574y, "tt_ssxinzi15"));
            }
            this.f9521ar = this.f9498U.getAlpha();
            this.f9498U.setAlpha(0.85f);
            this.f9498U.setShadowLayer(0.0f, C4020v.m13297b(this.f9574y, 0.5f), C4020v.m13297b(this.f9574y, 0.5f), C2984t.m8437j(this.f9574y, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams = this.f9498U.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f9522as.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                C4020v.m13301b(this.f9498U, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f9522as.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f9522as.bottom);
            }
        }
        TextView textView2 = this.f9497T;
        if (textView2 != null) {
            this.f9523at = textView2.getTextSize();
            this.f9497T.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.f9497T.getTextColors();
            this.f9524au = textColors2;
            if (textColors2 != null) {
                this.f9497T.setTextColor(C2984t.m8437j(this.f9574y, "tt_ssxinzi15"));
            }
            this.f9525av = this.f9497T.getAlpha();
            this.f9497T.setAlpha(0.85f);
            this.f9497T.setShadowLayer(0.0f, C4020v.m13297b(this.f9574y, 0.5f), C4020v.m13297b(this.f9574y, 0.5f), C2984t.m8437j(this.f9574y, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams2 = this.f9497T.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.f9526aw.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                C4020v.m13301b(this.f9497T, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f9526aw.top, this.f9526aw.right, this.f9526aw.bottom);
            }
        }
        ImageView imageView = this.f9499V;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.f9527ax.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                C4020v.m13301b(this.f9499V, this.f9527ax.left, this.f9527ax.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f9527ax.bottom);
            }
        }
        ImageView imageView2 = this.f9499V;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C2984t.m8430c(this.f9574y, "tt_shrink_fullscreen"));
        }
        TextView textView3 = this.f9489L;
        if (textView3 != null) {
            ColorStateList textColors3 = textView3.getTextColors();
            this.f9509af = textColors3;
            if (textColors3 != null) {
                this.f9489L.setTextColor(C2984t.m8437j(this.f9574y, "tt_ssxinzi15"));
            }
            this.f9510ag = this.f9489L.getAlpha();
            this.f9489L.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.f9489L.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.f9511ah.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                C4020v.m13301b(this.f9489L, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), this.f9526aw.top, this.f9526aw.right, this.f9526aw.bottom);
            }
        }
        View view = this.f9487J;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.f9512ai = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.f9487J.setLayoutParams(layoutParams5);
            this.f9487J.setBackgroundResource(C2984t.m8431d(this.f9574y, "tt_shadow_fullscreen_top"));
        }
        mo20400b(this.f9513aj, true);
    }

    /* renamed from: z */
    private void m12060z() {
        TextView textView = this.f9498U;
        if (textView != null) {
            textView.setTextSize(0, this.f9519ap);
            ColorStateList colorStateList = this.f9520aq;
            if (colorStateList != null) {
                this.f9498U.setTextColor(colorStateList);
            }
            this.f9498U.setAlpha(this.f9521ar);
            this.f9498U.setShadowLayer(C4020v.m13297b(this.f9574y, 1.0f), 0.0f, 0.0f, C2984t.m8437j(this.f9574y, "tt_video_shadow_color"));
            C4020v.m13301b(this.f9498U, this.f9522as.left, this.f9522as.top, this.f9522as.right, this.f9522as.bottom);
        }
        TextView textView2 = this.f9497T;
        if (textView2 != null) {
            textView2.setTextSize(0, this.f9523at);
            ColorStateList colorStateList2 = this.f9524au;
            if (colorStateList2 != null) {
                this.f9497T.setTextColor(colorStateList2);
            }
            this.f9497T.setAlpha(this.f9525av);
            this.f9497T.setShadowLayer(C4020v.m13297b(this.f9574y, 1.0f), 0.0f, 0.0f, C2984t.m8437j(this.f9574y, "tt_video_shadow_color"));
            C4020v.m13301b(this.f9497T, this.f9526aw.left, this.f9526aw.top, this.f9526aw.right, this.f9526aw.bottom);
        }
        ImageView imageView = this.f9499V;
        if (imageView != null) {
            C4020v.m13301b(imageView, this.f9527ax.left, this.f9527ax.top, this.f9527ax.right, this.f9527ax.bottom);
        }
        ImageView imageView2 = this.f9499V;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C2984t.m8430c(this.f9574y, "tt_enlarge_video"));
        }
        TextView textView3 = this.f9489L;
        if (textView3 != null) {
            ColorStateList colorStateList3 = this.f9509af;
            if (colorStateList3 != null) {
                textView3.setTextColor(colorStateList3);
            }
            this.f9489L.setAlpha(this.f9510ag);
            C4020v.m13301b(this.f9489L, this.f9526aw.left, this.f9526aw.top, this.f9526aw.right, this.f9526aw.bottom);
        }
        View view = this.f9487J;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f9512ai;
            this.f9487J.setLayoutParams(layoutParams);
            this.f9487J.setBackgroundResource(C2984t.m8431d(this.f9574y, "tt_video_black_desc_gradient"));
        }
        mo20400b(this.f9513aj, true);
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        if (message.what == 1) {
            mo20380l();
        }
    }

    /* renamed from: a */
    public void mo20366a(boolean z, boolean z2, boolean z3) {
        C4020v.m13282a(this.f9495R, 0);
        int i = 8;
        if (this.f9501X) {
            C4020v.m13282a(this.f9487J, 0);
            C4020v.m13282a((View) this.f9489L, 0);
        } else if (z3) {
            C4020v.m13282a(this.f9487J, 8);
        }
        C4020v.m13282a((View) this.f9552c, (!z || this.f9553d.getVisibility() == 0) ? 8 : 0);
        if (!this.f9569t && !this.f9501X) {
            if (!this.f9572w.contains(C2524b.C2525a.hideCloseBtn) && !z3) {
                C4020v.m13282a((View) this.f9486I, 0);
            }
            TextView textView = this.f9485H;
            if (!z3) {
                i = 0;
            }
            C4020v.m13282a((View) textView, i);
        }
        C4020v.m13282a((View) this.f9497T, 0);
        C4020v.m13282a((View) this.f9498U, 0);
        C4020v.m13282a((View) this.f9496S, 0);
    }

    /* renamed from: a */
    public void mo20365a(boolean z, boolean z2) {
        C4020v.m13282a(this.f9495R, 8);
        C4020v.m13282a(this.f9487J, 8);
        C4020v.m13282a((View) this.f9552c, 8);
        if (!this.f9569t && !this.f9501X) {
            C4020v.m13282a((View) this.f9486I, 8);
            if (!this.f9572w.contains(C2524b.C2525a.alwayShowBackBtn)) {
                C4020v.m13282a((View) this.f9485H, 8);
            }
        } else if (this.f9572w.contains(C2524b.C2525a.hideCloseBtn)) {
            C4020v.m13282a((View) this.f9486I, 8);
        }
        if (z2) {
            C4020v.m13282a((View) this.f9486I, 8);
            C4020v.m13282a((View) this.f9485H, 8);
        }
        mo20371c(false);
    }

    /* renamed from: l */
    public void mo20380l() {
        mo20365a(true, false);
    }

    /* renamed from: b */
    public boolean mo20369b(int i) {
        SeekBar seekBar = this.f9496S;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    /* renamed from: c */
    public void mo20371c(boolean z) {
        if (this.f9488K != null) {
            int i = 8;
            if (this.f9569t) {
                C4020v.m13282a((View) this.f9488K, 8);
                return;
            }
            TextView textView = this.f9488K;
            if (z) {
                i = 0;
            }
            C4020v.m13282a((View) textView, i);
        }
    }

    /* renamed from: m */
    public boolean mo20381m() {
        return this.f9570u;
    }

    /* renamed from: c */
    public void mo20370c(int i) {
        this.f9571v = i;
        C4020v.m13282a(this.f9550a, i);
        if (i != 0) {
            this.f9529az = false;
        } else if (this.f9528ay) {
            this.f9529az = true;
        }
    }

    /* renamed from: a */
    public void mo20361a(View view, boolean z) {
        if (mo20378j()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            if (this.f9573x != null && !TextUtils.isEmpty(this.f9573x.mo19618U())) {
                mo20364a(this.f9573x.mo19618U());
            }
            this.f9490M.setText(format);
        } else {
            mo20364a("");
            this.f9490M.setText("");
        }
        if (!this.f9539B) {
            boolean z2 = false;
            mo20371c(this.f9569t && !this.f9501X);
            if (mo20409t()) {
                C3694a aVar = this.f9538A;
                if (this.f9553d.getVisibility() != 0) {
                    z2 = true;
                }
                aVar.mo16414a(this, view, true, z2);
            }
        }
    }

    /* renamed from: n */
    public void mo20382n() {
        mo20380l();
        mo20371c(false);
    }

    /* renamed from: o */
    public boolean mo20383o() {
        return this.f9575z != null && this.f9575z.mo20570a();
    }
}
