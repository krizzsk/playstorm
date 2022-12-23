package com.fyber.inneractive.sdk.player.p191ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C4292j;
import com.fyber.inneractive.sdk.p192ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.player.controller.C4652k;
import com.fyber.inneractive.sdk.util.C5313b;
import com.fyber.inneractive.sdk.util.C5317c;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.C5367q0;
import com.fyber.inneractive.sdk.util.C5384w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.ui.i */
public abstract class C5100i extends C5094c {

    /* renamed from: K */
    public static final C5364p0 f13647K;

    /* renamed from: A */
    public C5367q0 f13648A;

    /* renamed from: B */
    public C5367q0 f13649B;

    /* renamed from: C */
    public int f13650C;

    /* renamed from: D */
    public int f13651D;

    /* renamed from: E */
    public Runnable f13652E;

    /* renamed from: F */
    public C5384w0 f13653F;

    /* renamed from: G */
    public boolean f13654G;

    /* renamed from: H */
    public ObjectAnimator f13655H;

    /* renamed from: I */
    public boolean f13656I;

    /* renamed from: J */
    public C5367q0 f13657J;

    /* renamed from: i */
    public ImageView f13658i;

    /* renamed from: j */
    public ViewGroup f13659j;

    /* renamed from: k */
    public TextView f13660k;

    /* renamed from: l */
    public Button f13661l;

    /* renamed from: m */
    public ImageView f13662m;

    /* renamed from: n */
    public TextView f13663n;

    /* renamed from: o */
    public TextView f13664o;

    /* renamed from: p */
    public View f13665p;

    /* renamed from: q */
    public int f13666q;

    /* renamed from: r */
    public int f13667r;

    /* renamed from: s */
    public boolean f13668s;

    /* renamed from: t */
    public ImageView f13669t;

    /* renamed from: u */
    public ImageView f13670u;

    /* renamed from: v */
    public IAsmoothProgressBar f13671v;

    /* renamed from: w */
    public View f13672w;

    /* renamed from: x */
    public View f13673x;

    /* renamed from: y */
    public ViewGroup f13674y;

    /* renamed from: z */
    public View f13675z;

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$a */
    public class C5101a implements C5384w0.C5386b {

        /* renamed from: a */
        public final /* synthetic */ int f13676a;

        public C5101a(int i) {
            this.f13676a = i;
        }

        /* renamed from: a */
        public void mo24274a(C5384w0 w0Var) {
            if (!C5100i.this.f13645h) {
                IAlog.m16699a("Autoclick is triggered", new Object[0]);
                ((C4652k) C5100i.this.f13644g).mo24934a(this.f13676a, C5100i.f13647K);
            } else {
                IAlog.m16699a("Autoclick is aborted - app in background", new Object[0]);
            }
            C5100i.this.mo25751e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$b */
    public class C5102b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f13678a;

        public C5102b(Bitmap bitmap) {
            this.f13678a = bitmap;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C5100i.this.getWidth() > 0 && C5100i.this.getHeight() > 0) {
                C5100i.this.mo25746b(true);
                C5100i.this.removeOnLayoutChangeListener(this);
                C5100i.this.mo25739a(this.f13678a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$c */
    public class C5103c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public final /* synthetic */ View f13680a;

        /* renamed from: b */
        public final /* synthetic */ int[] f13681b;

        /* renamed from: c */
        public final /* synthetic */ int f13682c;

        public C5103c(View view, int[] iArr, int i) {
            this.f13680a = view;
            this.f13681b = iArr;
            this.f13682c = i;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f13680a.getRootView().getLocationOnScreen(this.f13681b);
                float rawX = motionEvent.getRawX() - ((float) this.f13681b[0]);
                float rawY = motionEvent.getRawY() - ((float) this.f13681b[1]);
                C5364p0 p0Var = C5100i.this.f13638a;
                p0Var.f14230a = rawX;
                p0Var.f14231b = rawY;
            }
            C5100i iVar = C5100i.this;
            C5099h hVar = iVar.f13644g;
            if (hVar != null) {
                ((C4652k) hVar).mo24934a(this.f13682c, iVar.f13638a);
            }
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$d */
    public class C5104d implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ GestureDetector f13684a;

        public C5104d(C5100i iVar, GestureDetector gestureDetector) {
            this.f13684a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f13684a.onTouchEvent(motionEvent);
        }
    }

    static {
        C5364p0 a = C5364p0.m16776a();
        a.f14232c = true;
        f13647K = a;
    }

    public C5100i(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo25745a(boolean z, boolean z2, String str) {
        TextView textView = this.f13660k;
        if (textView != null) {
            textView.setAllCaps(z2);
            if (!TextUtils.isEmpty(str)) {
                this.f13660k.setText(str);
            } else {
                this.f13660k.setText(C4167R.string.ia_video_install_now_text);
            }
            this.f13660k.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: b */
    public void mo25746b(boolean z) {
        if (this.f13658i != null) {
            ViewGroup viewGroup = this.f13674y;
            int i = 0;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                ImageView imageView = this.f13658i;
                if (!z) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            IAlog.m16699a("end card is visible and requested to show last frame image with value of %s", Boolean.valueOf(z));
            this.f13658i.setVisibility(8);
        }
    }

    /* renamed from: c */
    public void mo25748c(boolean z) {
        View view = this.f13672w;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: d */
    public void mo25749d(boolean z) {
        TextView textView = this.f13664o;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    public void destroy() {
        super.destroy();
        IAlog.m16699a("%sdestroyed called", IAlog.m16696a((Object) this));
        Runnable runnable = this.f13652E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f13652E = null;
        }
        mo25751e();
        ViewGroup viewGroup = this.f13659j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    /* renamed from: e */
    public final void mo25751e() {
        if (this.f13653F != null) {
            IAlog.m16699a("Autoclick is removed ", new Object[0]);
            this.f13653F.f14266e = null;
            this.f13653F = null;
        }
    }

    /* renamed from: f */
    public void mo25752f() {
        ImageView imageView = this.f13670u;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f13670u.setSelected(true);
        }
    }

    /* renamed from: g */
    public abstract void mo25735g();

    public View getEndCardView() {
        return this.f13665p;
    }

    public ViewGroup getTextureHost() {
        return this.f13659j;
    }

    public View[] getTrackingFriendlyView() {
        return new View[]{this.f13660k, this.f13663n, this.f13664o, this.f13669t, this.f13671v};
    }

    public int getVideoHeight() {
        return this.f13667r;
    }

    public int getVideoWidth() {
        return this.f13666q;
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo25726a(this.f13657J, size, size2);
        C5367q0 q0Var = this.f13657J;
        int i3 = q0Var.f14238a;
        if (i3 <= 0 || q0Var.f14239b <= 0) {
            q0Var.f14238a = size;
            q0Var.f14239b = size2;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f13657J.f14239b, 1073741824);
            i = makeMeasureSpec;
        }
        if (!this.f13648A.equals(this.f13657J)) {
            C5367q0 q0Var2 = this.f13648A;
            C5367q0 q0Var3 = this.f13657J;
            q0Var2.getClass();
            q0Var2.f14238a = q0Var3.f14238a;
            q0Var2.f14239b = q0Var3.f14239b;
            mo25735g();
        }
        super.onMeasure(i, i2);
    }

    public void setLastFrameBitmapBlurred(Bitmap bitmap) {
        if (this.f13658i != null && bitmap != null) {
            C5317c cVar = new C5317c();
            cVar.f14154c = 20;
            cVar.f14155d = 1;
            cVar.f14152a = bitmap.getWidth();
            cVar.f14153b = bitmap.getHeight();
            this.f13658i.setImageBitmap(C5313b.m16709a(getContext(), bitmap, cVar));
        }
    }

    public void setMuteButtonState(boolean z) {
        this.f13669t.setSelected(z);
    }

    public void setRemainingTime(String str) {
        TextView textView = this.f13663n;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSkipText(String str) {
        TextView textView = this.f13664o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public C5100i(Context context, AttributeSet attributeSet) {
        this(context, (AttributeSet) null, 0);
    }

    public void setLastFrameBitmap(Bitmap bitmap) {
        IAlog.m16699a("%ssetLastFrameBitmap - %s", IAlog.m16696a((Object) this), bitmap);
        ImageView imageView = this.f13658i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        C5367q0 q0Var = this.f13648A;
        if (q0Var.f14238a == 0 || q0Var.f14239b == 0) {
            mo25746b(false);
            addOnLayoutChangeListener(new C5102b(bitmap));
            return;
        }
        mo25739a(bitmap);
    }

    public C5100i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13666q = -1;
        this.f13667r = -1;
        this.f13668s = false;
        this.f13648A = new C5367q0(0, 0);
        this.f13654G = false;
        this.f13656I = false;
        this.f13657J = new C5367q0(0, 0);
        IAlog.m16699a("%sctor called", mo25725a());
        LayoutInflater.from(context).inflate(C4167R.layout.ia_video_view, this, true);
        setBackgroundColor(getResources().getColor(C4167R.color.ia_video_background_color));
        mo25747c();
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    public void mo25747c() {
        this.f13658i = (ImageView) findViewById(C4167R.C4169id.ia_iv_last_frame);
        this.f13659j = (ViewGroup) findViewById(C4167R.C4169id.ia_texture_view_host);
        this.f13669t = (ImageView) findViewById(C4167R.C4169id.ia_iv_mute_button);
        this.f13660k = (TextView) findViewById(C4167R.C4169id.ia_tv_call_to_action);
        this.f13670u = (ImageView) findViewById(C4167R.C4169id.ia_iv_expand_collapse_button);
        this.f13663n = (TextView) findViewById(C4167R.C4169id.ia_tv_remaining_time);
        this.f13671v = (IAsmoothProgressBar) findViewById(C4167R.C4169id.ia_video_progressbar);
        this.f13673x = findViewById(C4167R.C4169id.ia_default_endcard_video_overlay);
        this.f13674y = (ViewGroup) findViewById(C4167R.C4169id.ia_endcard_video_overlay);
        this.f13672w = findViewById(C4167R.C4169id.ia_paused_video_overlay);
        this.f13675z = findViewById(C4167R.C4169id.ia_buffering_overlay);
        this.f13664o = (TextView) findViewById(C4167R.C4169id.ia_tv_skip);
        this.f13661l = (Button) findViewById(C4167R.C4169id.ia_b_end_card_call_to_action);
        this.f13662m = (ImageView) findViewById(C4167R.C4169id.hand_animation);
        mo25740a((View) this, 7);
        mo25740a((View) this.f13669t, 1);
        mo25740a((View) this.f13660k, 3);
        mo25740a((View) this.f13661l, 8);
        mo25740a((View) this.f13670u, 5);
        mo25740a((View) this.f13659j, 7);
        mo25740a((View) this.f13664o, 6);
        mo25740a(this.f13672w, 9);
        mo25740a(findViewById(C4167R.C4169id.ia_default_endcard_video_overlay), -1);
    }

    /* renamed from: d */
    public boolean mo25750d() {
        return this.f13673x.getVisibility() == 0 || this.f13674y.getChildCount() > 0;
    }

    /* renamed from: a */
    public void mo25742a(C5092a aVar) {
        View view = this.f13673x;
        if (view != null) {
            boolean z = true;
            if (!aVar.f13618a) {
                view.setVisibility(8);
            } else if (!C4292j.C4295c.NONE.equals(aVar.f13626i)) {
                mo25741a(this.f13673x, aVar.f13626i, aVar.f13627j);
            } else {
                this.f13673x.setVisibility(0);
            }
            this.f13661l.setAllCaps(aVar.f13619b);
            if (!TextUtils.isEmpty(aVar.f13620c)) {
                this.f13661l.setText(aVar.f13620c);
            } else {
                this.f13661l.setText(C4167R.string.ia_video_install_now_text);
            }
            UnitDisplayType unitDisplayType = ((C4345y) this.f13640c).f10750f.f10579j;
            if (aVar.f13624g) {
                this.f13661l.setBackgroundResource(C4167R.C4168drawable.bg_green);
                this.f13662m.setVisibility(0);
                ImageView imageView = this.f13662m;
                float f = aVar.f13625h;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f})});
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.setDuration(700);
                ofPropertyValuesHolder.start();
            } else if (unitDisplayType.equals(UnitDisplayType.LANDSCAPE) || unitDisplayType.equals(UnitDisplayType.MRECT)) {
                this.f13661l.setBackgroundResource(C4167R.C4168drawable.bg_green_medium);
                this.f13661l.setTextSize(0, getResources().getDimension(C4167R.dimen.ia_video_overlay_text_large));
            } else {
                this.f13661l.setBackgroundResource(C4167R.C4168drawable.bg_green);
                this.f13661l.setTextSize(0, getResources().getDimension(C4167R.dimen.ia_video_overlay_text_large_plus));
            }
            this.f13661l.setVisibility(0);
            if (aVar.f13618a) {
                Integer num = aVar.f13621d;
                if (num == null) {
                    z = false;
                }
                if (z) {
                    mo25738a(8, num.intValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25738a(int i, int i2) {
        if (!this.f13654G && this.f13653F == null) {
            IAlog.m16699a("Start Autoclick timer - %d seconds", Integer.valueOf(i2));
            C5384w0 w0Var = new C5384w0(TimeUnit.SECONDS, (long) i2);
            this.f13653F = w0Var;
            w0Var.f14266e = new C5101a(i);
            w0Var.mo26486c();
        }
    }

    /* renamed from: a */
    public final void mo25741a(View view, C4292j.C4295c cVar, int i) {
        if (!this.f13656I && C4292j.C4295c.ZOOM_IN.equals(cVar)) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.0f, 1.0f})});
            this.f13655H = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration((long) i);
        }
    }

    /* renamed from: a */
    public final void mo25739a(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C5367q0 q0Var = this.f13648A;
            int i = q0Var.f14238a;
            int i2 = q0Var.f14239b;
            if (width > 0 && height > 0) {
                float f = (float) width;
                float f2 = (float) height;
                float f3 = f / f2;
                if (this.f13641d == UnitDisplayType.SQUARE) {
                    i = (int) (((float) i2) * f3);
                } else {
                    if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                        Math.abs(f3 - 1.3333334f);
                    }
                    float min = Math.min(((float) i) / f, 10.0f);
                    float f4 = (float) i2;
                    float f5 = min * f2;
                    if (f4 > f5) {
                        i = (int) (min * f);
                        i2 = (int) f5;
                    } else {
                        float min2 = Math.min(f4 / f2, 10.0f);
                        i = (int) (f * min2);
                        i2 = (int) (min2 * f2);
                    }
                }
            }
            ImageView imageView = this.f13658i;
            if (imageView != null) {
                imageView.getLayoutParams().width = i;
                this.f13658i.getLayoutParams().height = i2;
            }
        }
    }

    /* renamed from: a */
    public void mo25744a(boolean z) {
        View view = this.f13675z;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo25740a(View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new C5104d(this, new GestureDetector(view.getContext(), new C5103c(view, new int[2], i))));
        }
    }

    /* renamed from: a */
    public void mo25743a(C5367q0 q0Var, int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = f / f2;
            if (this.f13641d == UnitDisplayType.SQUARE) {
                i3 = (int) (((float) i4) * f3);
            } else {
                if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                    Math.abs(f3 - 1.3333334f);
                }
                float min = Math.min(((float) i3) / f, 10.0f);
                float f4 = (float) i4;
                float f5 = min * f2;
                if (f4 > f5) {
                    i3 = (int) (min * f);
                    i4 = (int) f5;
                } else {
                    float min2 = Math.min(f4 / f2, 10.0f);
                    i4 = (int) (min2 * f2);
                    i3 = (int) (f * min2);
                }
            }
        }
        q0Var.f14238a = i3;
        q0Var.f14239b = i4;
    }
}
