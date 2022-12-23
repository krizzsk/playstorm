package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import com.p374my.target.common.views.StarsRatingView;
import com.p374my.target.nativeads.views.MediaAdView;

/* renamed from: com.my.target.m6 */
public class C9844m6 extends ViewGroup {

    /* renamed from: a */
    public static final int f24306a = C10059y8.m29841c();

    /* renamed from: b */
    public static final int f24307b = C10059y8.m29841c();

    /* renamed from: c */
    public static final int f24308c = C10059y8.m29841c();

    /* renamed from: d */
    public static final int f24309d = C10059y8.m29841c();

    /* renamed from: e */
    public static final int f24310e = C10059y8.m29841c();

    /* renamed from: f */
    public static final int f24311f = C10059y8.m29841c();

    /* renamed from: g */
    public static final int f24312g = C10059y8.m29841c();

    /* renamed from: h */
    public static final int f24313h = C10059y8.m29841c();

    /* renamed from: i */
    public static final int f24314i = C10059y8.m29841c();

    /* renamed from: j */
    public static final int f24315j = C10059y8.m29841c();

    /* renamed from: k */
    public static final int f24316k = C10059y8.m29841c();

    /* renamed from: l */
    public static final int f24317l = C10059y8.m29841c();

    /* renamed from: m */
    public static final int f24318m = C10059y8.m29841c();

    /* renamed from: A */
    public final C9679e6 f24319A;

    /* renamed from: B */
    public final C9679e6 f24320B;

    /* renamed from: C */
    public final C9679e6 f24321C;

    /* renamed from: D */
    public final Runnable f24322D = new C9847c();

    /* renamed from: E */
    public final C9848d f24323E = new C9848d();

    /* renamed from: F */
    public final View.OnClickListener f24324F = new C9846b();

    /* renamed from: G */
    public final int f24325G;

    /* renamed from: H */
    public final Bitmap f24326H;

    /* renamed from: I */
    public final Bitmap f24327I;

    /* renamed from: J */
    public int f24328J;

    /* renamed from: K */
    public final int f24329K;

    /* renamed from: L */
    public boolean f24330L;

    /* renamed from: M */
    public C9849e f24331M;

    /* renamed from: n */
    public final TextView f24332n;

    /* renamed from: o */
    public final StarsRatingView f24333o;

    /* renamed from: p */
    public final Button f24334p;

    /* renamed from: q */
    public final Button f24335q;

    /* renamed from: r */
    public final C10059y8 f24336r;

    /* renamed from: s */
    public final LinearLayout f24337s;

    /* renamed from: t */
    public final TextView f24338t;

    /* renamed from: u */
    public final FrameLayout f24339u;

    /* renamed from: v */
    public final MediaAdView f24340v;

    /* renamed from: w */
    public final TextView f24341w;

    /* renamed from: x */
    public final C9886o6 f24342x;

    /* renamed from: y */
    public final C9720g6 f24343y;

    /* renamed from: z */
    public final C10055y5 f24344z;

    /* renamed from: com.my.target.m6$b */
    public class C9846b implements View.OnClickListener {
        public C9846b() {
        }

        public void onClick(View view) {
            if (C9844m6.this.f24331M != null) {
                int id = view.getId();
                if (id == C9844m6.f24307b) {
                    C9844m6.this.f24331M.mo64697a(view);
                } else if (id == C9844m6.f24308c) {
                    C9844m6.this.f24331M.mo64707e();
                } else if (id == C9844m6.f24310e) {
                    C9844m6.this.f24331M.mo64708i();
                } else if (id == C9844m6.f24309d) {
                    C9844m6.this.f24331M.mo64709k();
                } else if (id == C9844m6.f24306a) {
                    C9844m6.this.f24331M.mo64694a();
                } else if (id == C9844m6.f24315j) {
                    C9844m6.this.f24331M.mo64706d();
                }
            }
        }
    }

    /* renamed from: com.my.target.m6$c */
    public class C9847c implements Runnable {
        public C9847c() {
        }

        public void run() {
            if (C9844m6.this.f24328J == 2) {
                C9844m6.this.mo64747a();
            }
        }
    }

    /* renamed from: com.my.target.m6$d */
    public class C9848d implements View.OnClickListener {
        public C9848d() {
        }

        public void onClick(View view) {
            C9844m6 m6Var = C9844m6.this;
            m6Var.removeCallbacks(m6Var.f24322D);
            if (C9844m6.this.f24328J == 2) {
                C9844m6.this.mo64747a();
                return;
            }
            if (C9844m6.this.f24328J == 0) {
                C9844m6.this.mo64752c();
            }
            C9844m6 m6Var2 = C9844m6.this;
            m6Var2.postDelayed(m6Var2.f24322D, 4000);
        }
    }

    /* renamed from: com.my.target.m6$e */
    public interface C9849e {
        /* renamed from: a */
        void mo64694a();

        /* renamed from: a */
        void mo64697a(View view);

        /* renamed from: d */
        void mo64706d();

        /* renamed from: e */
        void mo64707e();

        /* renamed from: i */
        void mo64708i();

        /* renamed from: k */
        void mo64709k();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9844m6(Context context) {
        super(context);
        Context context2 = context;
        Button button = new Button(context2);
        this.f24335q = button;
        TextView textView = new TextView(context2);
        this.f24332n = textView;
        StarsRatingView starsRatingView = new StarsRatingView(context2);
        this.f24333o = starsRatingView;
        Button button2 = new Button(context2);
        this.f24334p = button2;
        TextView textView2 = new TextView(context2);
        this.f24338t = textView2;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f24339u = frameLayout;
        C9679e6 e6Var = new C9679e6(context2);
        this.f24319A = e6Var;
        C9679e6 e6Var2 = new C9679e6(context2);
        this.f24320B = e6Var2;
        C9679e6 e6Var3 = new C9679e6(context2);
        this.f24321C = e6Var3;
        TextView textView3 = new TextView(context2);
        this.f24341w = textView3;
        MediaAdView mediaAdView = new MediaAdView(context2);
        this.f24340v = mediaAdView;
        C9886o6 o6Var = new C9886o6(context2);
        this.f24342x = o6Var;
        C9720g6 g6Var = new C9720g6(context2);
        this.f24343y = g6Var;
        this.f24337s = new LinearLayout(context2);
        C10059y8 c = C10059y8.m29843c(context);
        this.f24336r = c;
        this.f24344z = new C10055y5(context2);
        this.f24326H = C9933r5.m29145c(c.mo65778b(28));
        this.f24327I = C9933r5.m29143b(c.mo65778b(28));
        C10059y8.m29840b(button, "dismiss_button");
        C10059y8.m29840b(textView, "title_text");
        C10059y8.m29840b(starsRatingView, "stars_view");
        C10059y8.m29840b(button2, "cta_button");
        C10059y8.m29840b(textView2, "replay_text");
        C10059y8.m29840b(frameLayout, "shadow");
        C10059y8.m29840b(e6Var, "pause_button");
        C10059y8.m29840b(e6Var2, "play_button");
        C10059y8.m29840b(e6Var3, "replay_button");
        C10059y8.m29840b(textView3, "domain_text");
        C10059y8.m29840b(mediaAdView, "media_view");
        C10059y8.m29840b(o6Var, "video_progress_wheel");
        C10059y8.m29840b(g6Var, "sound_button");
        this.f24329K = c.mo65778b(28);
        this.f24325G = c.mo65778b(16);
        mo64751b();
    }

    /* renamed from: a */
    public final void mo64747a() {
        if (this.f24328J != 0) {
            this.f24328J = 0;
            this.f24340v.getImageView().setVisibility(8);
            this.f24340v.getProgressBarView().setVisibility(8);
            this.f24337s.setVisibility(8);
            this.f24320B.setVisibility(8);
            this.f24319A.setVisibility(8);
            this.f24339u.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo64748a(float f, float f2) {
        if (this.f24342x.getVisibility() != 0) {
            this.f24342x.setVisibility(0);
        }
        this.f24342x.setProgress(f / f2);
        this.f24342x.setDigit((int) Math.ceil((double) (f2 - f)));
    }

    /* renamed from: a */
    public void mo64749a(C9733h2 h2Var, VideoData videoData) {
        C9711g2<VideoData> videoBanner = h2Var.getVideoBanner();
        if (videoBanner != null) {
            this.f24342x.setMax(h2Var.getDuration());
            this.f24330L = videoBanner.isAllowReplay();
            this.f24334p.setText(h2Var.getCtaText());
            this.f24332n.setText(h2Var.getTitle());
            if ("store".equals(h2Var.getNavigationType())) {
                this.f24341w.setVisibility(8);
                if (h2Var.getVotes() == 0 || h2Var.getRating() <= 0.0f) {
                    this.f24333o.setVisibility(8);
                } else {
                    this.f24333o.setVisibility(0);
                    this.f24333o.setRating(h2Var.getRating());
                }
            } else {
                this.f24333o.setVisibility(8);
                this.f24341w.setVisibility(0);
                this.f24341w.setText(h2Var.getDomain());
            }
            this.f24335q.setText(videoBanner.getCloseActionText());
            this.f24338t.setText(videoBanner.getReplayActionText());
            Bitmap c = C9933r5.m29144c();
            if (c != null) {
                this.f24321C.setImageBitmap(c);
            }
            this.f24340v.setPlaceHolderDimension(videoData.getWidth(), videoData.getHeight());
            ImageData image = h2Var.getImage();
            if (image != null) {
                this.f24340v.getImageView().setImageBitmap(image.getBitmap());
            }
        }
    }

    /* renamed from: a */
    public void mo64750a(boolean z) {
        C9720g6 g6Var;
        String str;
        if (z) {
            this.f24343y.mo64102a(this.f24327I, false);
            g6Var = this.f24343y;
            str = "sound off";
        } else {
            this.f24343y.mo64102a(this.f24326H, false);
            g6Var = this.f24343y;
            str = "sound on";
        }
        g6Var.setContentDescription(str);
    }

    /* renamed from: b */
    public final void mo64751b() {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i = this.f24325G;
        this.f24343y.setId(f24315j);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f24340v.setId(f24318m);
        this.f24340v.setLayoutParams(layoutParams);
        this.f24340v.setId(f24314i);
        this.f24340v.setOnClickListener(this.f24323E);
        this.f24340v.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f24339u.setBackgroundColor(-1728053248);
        this.f24339u.setVisibility(8);
        this.f24335q.setId(f24306a);
        this.f24335q.setTextSize(2, 16.0f);
        this.f24335q.setTransformationMethod((TransformationMethod) null);
        this.f24335q.setEllipsize(TextUtils.TruncateAt.END);
        this.f24335q.setMaxLines(2);
        this.f24335q.setPadding(i, i, i, i);
        this.f24335q.setTextColor(-1);
        C10059y8.m29832a(this.f24335q, -2013265920, -1, -1, this.f24336r.mo65778b(1), this.f24336r.mo65778b(4));
        this.f24332n.setId(f24312g);
        this.f24332n.setMaxLines(2);
        this.f24332n.setEllipsize(TextUtils.TruncateAt.END);
        this.f24332n.setTextSize(2, 18.0f);
        this.f24332n.setTextColor(-1);
        C10059y8.m29832a(this.f24334p, -2013265920, -1, -1, this.f24336r.mo65778b(1), this.f24336r.mo65778b(4));
        this.f24334p.setId(f24307b);
        this.f24334p.setTextColor(-1);
        this.f24334p.setTransformationMethod((TransformationMethod) null);
        this.f24334p.setGravity(1);
        this.f24334p.setTextSize(2, 16.0f);
        this.f24334p.setLines(1);
        this.f24334p.setEllipsize(TextUtils.TruncateAt.END);
        this.f24334p.setMinimumWidth(this.f24336r.mo65778b(100));
        this.f24334p.setPadding(i, i, i, i);
        this.f24332n.setShadowLayer((float) this.f24336r.mo65778b(1), (float) this.f24336r.mo65778b(1), (float) this.f24336r.mo65778b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f24341w.setId(f24313h);
        this.f24341w.setTextColor(-3355444);
        this.f24341w.setMaxEms(10);
        this.f24341w.setShadowLayer((float) this.f24336r.mo65778b(1), (float) this.f24336r.mo65778b(1), (float) this.f24336r.mo65778b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f24337s.setId(f24308c);
        this.f24337s.setOnClickListener(this.f24324F);
        this.f24337s.setGravity(17);
        this.f24337s.setVisibility(8);
        this.f24337s.setPadding(this.f24336r.mo65778b(8), 0, this.f24336r.mo65778b(8), 0);
        this.f24338t.setSingleLine();
        this.f24338t.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.f24338t;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f24338t.setTextColor(-1);
        this.f24338t.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = this.f24336r.mo65778b(4);
        this.f24321C.setPadding(this.f24336r.mo65778b(16), this.f24336r.mo65778b(16), this.f24336r.mo65778b(16), this.f24336r.mo65778b(16));
        this.f24319A.setId(f24310e);
        this.f24319A.setOnClickListener(this.f24324F);
        this.f24319A.setVisibility(8);
        this.f24319A.setPadding(this.f24336r.mo65778b(16), this.f24336r.mo65778b(16), this.f24336r.mo65778b(16), this.f24336r.mo65778b(16));
        this.f24320B.setId(f24309d);
        this.f24320B.setOnClickListener(this.f24324F);
        this.f24320B.setVisibility(8);
        this.f24320B.setPadding(this.f24336r.mo65778b(16), this.f24336r.mo65778b(16), this.f24336r.mo65778b(16), this.f24336r.mo65778b(16));
        this.f24339u.setId(f24316k);
        Bitmap b = C9933r5.m29142b();
        if (b != null) {
            this.f24320B.setImageBitmap(b);
        }
        Bitmap a = C9933r5.m29139a();
        if (a != null) {
            this.f24319A.setImageBitmap(a);
        }
        C10059y8.m29832a(this.f24319A, -2013265920, -1, -1, this.f24336r.mo65778b(1), this.f24336r.mo65778b(4));
        C10059y8.m29832a(this.f24320B, -2013265920, -1, -1, this.f24336r.mo65778b(1), this.f24336r.mo65778b(4));
        C10059y8.m29832a(this.f24321C, -2013265920, -1, -1, this.f24336r.mo65778b(1), this.f24336r.mo65778b(4));
        this.f24333o.setId(f24317l);
        this.f24333o.setStarSize(this.f24336r.mo65778b(12));
        this.f24342x.setId(f24311f);
        this.f24342x.setVisibility(8);
        this.f24340v.addView(this.f24344z, new ViewGroup.LayoutParams(-1, -1));
        addView(this.f24340v);
        addView(this.f24339u);
        addView(this.f24343y);
        addView(this.f24335q);
        addView(this.f24342x);
        addView(this.f24337s);
        addView(this.f24319A);
        addView(this.f24320B);
        addView(this.f24333o);
        addView(this.f24341w);
        addView(this.f24334p);
        addView(this.f24332n);
        this.f24337s.addView(this.f24321C);
        this.f24337s.addView(this.f24338t, layoutParams2);
        this.f24334p.setOnClickListener(this.f24324F);
        this.f24335q.setOnClickListener(this.f24324F);
        this.f24343y.setOnClickListener(this.f24324F);
    }

    /* renamed from: c */
    public final void mo64752c() {
        if (this.f24328J != 2) {
            this.f24328J = 2;
            this.f24340v.getImageView().setVisibility(8);
            this.f24340v.getProgressBarView().setVisibility(8);
            this.f24337s.setVisibility(8);
            this.f24320B.setVisibility(8);
            this.f24319A.setVisibility(0);
            this.f24339u.setVisibility(8);
        }
    }

    /* renamed from: d */
    public void mo64753d() {
        if (this.f24328J != 3) {
            this.f24328J = 3;
            this.f24340v.getProgressBarView().setVisibility(0);
            this.f24337s.setVisibility(8);
            this.f24320B.setVisibility(8);
            this.f24319A.setVisibility(8);
            this.f24339u.setVisibility(8);
        }
    }

    /* renamed from: e */
    public void mo64754e() {
        if (this.f24328J != 1) {
            this.f24328J = 1;
            this.f24340v.getImageView().setVisibility(0);
            this.f24340v.getProgressBarView().setVisibility(8);
            this.f24337s.setVisibility(8);
            this.f24320B.setVisibility(0);
            this.f24319A.setVisibility(8);
            this.f24339u.setVisibility(0);
        }
    }

    /* renamed from: f */
    public void mo64755f() {
        int i = this.f24328J;
        if (i != 0 && i != 2) {
            this.f24328J = 0;
            this.f24340v.getImageView().setVisibility(8);
            this.f24340v.getProgressBarView().setVisibility(8);
            this.f24337s.setVisibility(8);
            this.f24320B.setVisibility(8);
            if (this.f24328J != 2) {
                this.f24319A.setVisibility(8);
            }
        }
    }

    /* renamed from: g */
    public void mo64756g() {
        this.f24340v.getImageView().setVisibility(0);
    }

    public C10055y5 getAdVideoView() {
        return this.f24344z;
    }

    public MediaAdView getMediaAdView() {
        return this.f24340v;
    }

    /* renamed from: h */
    public void mo64759h() {
        if (this.f24328J != 4) {
            this.f24328J = 4;
            this.f24340v.getImageView().setVisibility(0);
            this.f24340v.getProgressBarView().setVisibility(8);
            if (this.f24330L) {
                this.f24337s.setVisibility(0);
                this.f24339u.setVisibility(0);
            }
            this.f24320B.setVisibility(8);
            this.f24319A.setVisibility(8);
            this.f24342x.setVisibility(8);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = this.f24340v.getMeasuredWidth();
        int measuredHeight = this.f24340v.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        this.f24340v.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.f24339u.layout(this.f24340v.getLeft(), this.f24340v.getTop(), this.f24340v.getRight(), this.f24340v.getBottom());
        int measuredWidth2 = this.f24320B.getMeasuredWidth();
        int i9 = i3 >> 1;
        int i10 = measuredWidth2 >> 1;
        int i11 = i4 >> 1;
        int measuredHeight2 = this.f24320B.getMeasuredHeight() >> 1;
        this.f24320B.layout(i9 - i10, i11 - measuredHeight2, i10 + i9, measuredHeight2 + i11);
        int measuredWidth3 = this.f24319A.getMeasuredWidth();
        int i12 = measuredWidth3 >> 1;
        int measuredHeight3 = this.f24319A.getMeasuredHeight() >> 1;
        this.f24319A.layout(i9 - i12, i11 - measuredHeight3, i12 + i9, measuredHeight3 + i11);
        int measuredWidth4 = this.f24337s.getMeasuredWidth();
        int i13 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f24337s.getMeasuredHeight() >> 1;
        this.f24337s.layout(i9 - i13, i11 - measuredHeight4, i9 + i13, i11 + measuredHeight4);
        Button button = this.f24335q;
        int i14 = this.f24325G;
        button.layout(i14, i14, button.getMeasuredWidth() + i14, this.f24325G + this.f24335q.getMeasuredHeight());
        if (i5 > i6) {
            int max = Math.max(this.f24334p.getMeasuredHeight(), Math.max(this.f24332n.getMeasuredHeight(), this.f24333o.getMeasuredHeight()));
            Button button2 = this.f24334p;
            int measuredWidth5 = (i5 - this.f24325G) - button2.getMeasuredWidth();
            int measuredHeight5 = ((i6 - this.f24325G) - this.f24334p.getMeasuredHeight()) - ((max - this.f24334p.getMeasuredHeight()) >> 1);
            int i15 = this.f24325G;
            button2.layout(measuredWidth5, measuredHeight5, i5 - i15, (i6 - i15) - ((max - this.f24334p.getMeasuredHeight()) >> 1));
            this.f24343y.layout((this.f24334p.getRight() - this.f24343y.getMeasuredWidth()) + this.f24343y.getPadding(), (((this.f24340v.getBottom() - (this.f24325G << 1)) - this.f24343y.getMeasuredHeight()) - max) + this.f24343y.getPadding(), this.f24334p.getRight() + this.f24343y.getPadding(), ((this.f24340v.getBottom() - (this.f24325G << 1)) - max) + this.f24343y.getPadding());
            StarsRatingView starsRatingView = this.f24333o;
            int left = (this.f24334p.getLeft() - this.f24325G) - this.f24333o.getMeasuredWidth();
            int measuredHeight6 = ((i6 - this.f24325G) - this.f24333o.getMeasuredHeight()) - ((max - this.f24333o.getMeasuredHeight()) >> 1);
            int left2 = this.f24334p.getLeft();
            int i16 = this.f24325G;
            starsRatingView.layout(left, measuredHeight6, left2 - i16, (i6 - i16) - ((max - this.f24333o.getMeasuredHeight()) >> 1));
            TextView textView = this.f24341w;
            int left3 = (this.f24334p.getLeft() - this.f24325G) - this.f24341w.getMeasuredWidth();
            int measuredHeight7 = ((i6 - this.f24325G) - this.f24341w.getMeasuredHeight()) - ((max - this.f24341w.getMeasuredHeight()) >> 1);
            int left4 = this.f24334p.getLeft();
            int i17 = this.f24325G;
            textView.layout(left3, measuredHeight7, left4 - i17, (i6 - i17) - ((max - this.f24341w.getMeasuredHeight()) >> 1));
            int min = Math.min(this.f24333o.getLeft(), this.f24341w.getLeft());
            TextView textView2 = this.f24332n;
            int measuredWidth6 = (min - this.f24325G) - textView2.getMeasuredWidth();
            int measuredHeight8 = ((i6 - this.f24325G) - this.f24332n.getMeasuredHeight()) - ((max - this.f24332n.getMeasuredHeight()) >> 1);
            int i18 = this.f24325G;
            textView2.layout(measuredWidth6, measuredHeight8, min - i18, (i6 - i18) - ((max - this.f24332n.getMeasuredHeight()) >> 1));
            C9886o6 o6Var = this.f24342x;
            int i19 = this.f24325G;
            o6Var.layout(i19, ((i6 - i19) - o6Var.getMeasuredHeight()) - ((max - this.f24342x.getMeasuredHeight()) >> 1), this.f24325G + this.f24342x.getMeasuredWidth(), (i6 - this.f24325G) - ((max - this.f24342x.getMeasuredHeight()) >> 1));
            return;
        }
        this.f24343y.layout(((this.f24340v.getRight() - this.f24325G) - this.f24343y.getMeasuredWidth()) + this.f24343y.getPadding(), ((this.f24340v.getBottom() - this.f24325G) - this.f24343y.getMeasuredHeight()) + this.f24343y.getPadding(), (this.f24340v.getRight() - this.f24325G) + this.f24343y.getPadding(), (this.f24340v.getBottom() - this.f24325G) + this.f24343y.getPadding());
        TextView textView3 = this.f24332n;
        int i20 = i5 >> 1;
        textView3.layout(i20 - (textView3.getMeasuredWidth() >> 1), this.f24340v.getBottom() + this.f24325G, (this.f24332n.getMeasuredWidth() >> 1) + i20, this.f24340v.getBottom() + this.f24325G + this.f24332n.getMeasuredHeight());
        StarsRatingView starsRatingView2 = this.f24333o;
        starsRatingView2.layout(i20 - (starsRatingView2.getMeasuredWidth() >> 1), this.f24332n.getBottom() + this.f24325G, (this.f24333o.getMeasuredWidth() >> 1) + i20, this.f24332n.getBottom() + this.f24325G + this.f24333o.getMeasuredHeight());
        TextView textView4 = this.f24341w;
        textView4.layout(i20 - (textView4.getMeasuredWidth() >> 1), this.f24332n.getBottom() + this.f24325G, (this.f24341w.getMeasuredWidth() >> 1) + i20, this.f24332n.getBottom() + this.f24325G + this.f24341w.getMeasuredHeight());
        Button button3 = this.f24334p;
        button3.layout(i20 - (button3.getMeasuredWidth() >> 1), this.f24333o.getBottom() + this.f24325G, i20 + (this.f24334p.getMeasuredWidth() >> 1), this.f24333o.getBottom() + this.f24325G + this.f24334p.getMeasuredHeight());
        this.f24342x.layout(this.f24325G, (this.f24340v.getBottom() - this.f24325G) - this.f24342x.getMeasuredHeight(), this.f24325G + this.f24342x.getMeasuredWidth(), this.f24340v.getBottom() - this.f24325G);
    }

    public void onMeasure(int i, int i2) {
        this.f24343y.measure(View.MeasureSpec.makeMeasureSpec(this.f24329K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24329K, 1073741824));
        this.f24342x.measure(View.MeasureSpec.makeMeasureSpec(this.f24329K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24329K, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f24340v.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i3 = this.f24325G << 1;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.f24335q.measure(View.MeasureSpec.makeMeasureSpec(i4 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f24319A.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f24320B.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f24337s.measure(View.MeasureSpec.makeMeasureSpec(i4 - (this.f24325G * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f24333o.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f24339u.measure(View.MeasureSpec.makeMeasureSpec(this.f24340v.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24340v.getMeasuredHeight(), 1073741824));
        this.f24334p.measure(View.MeasureSpec.makeMeasureSpec(i4 - (this.f24325G * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f24332n.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f24341w.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.f24334p.getMeasuredWidth();
            int measuredWidth2 = this.f24332n.getMeasuredWidth();
            if (this.f24342x.getMeasuredWidth() + measuredWidth2 + Math.max(this.f24333o.getMeasuredWidth(), this.f24341w.getMeasuredWidth()) + measuredWidth + (this.f24325G * 3) > i4) {
                int measuredWidth3 = (i4 - this.f24342x.getMeasuredWidth()) - (this.f24325G * 3);
                int i6 = measuredWidth3 / 3;
                this.f24334p.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f24333o.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f24341w.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f24332n.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.f24334p.getMeasuredWidth()) - this.f24341w.getMeasuredWidth()) - this.f24333o.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setVideoDialogViewListener(C9849e eVar) {
        this.f24331M = eVar;
    }
}
