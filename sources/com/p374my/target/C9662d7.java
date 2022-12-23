package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p374my.target.C10055y5;
import com.p374my.target.C9651c9;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;

/* renamed from: com.my.target.d7 */
public class C9662d7 extends ViewGroup implements C10055y5.C10056a {

    /* renamed from: a */
    public final C9804k6 f23760a;

    /* renamed from: b */
    public final C10059y8 f23761b;

    /* renamed from: c */
    public final boolean f23762c;

    /* renamed from: d */
    public final C9720g6 f23763d;

    /* renamed from: e */
    public final C9665c f23764e;

    /* renamed from: f */
    public final C10055y5 f23765f;

    /* renamed from: g */
    public final FrameLayout f23766g;

    /* renamed from: h */
    public final ProgressBar f23767h;

    /* renamed from: i */
    public final boolean f23768i;

    /* renamed from: j */
    public C9651c9 f23769j;

    /* renamed from: k */
    public VideoData f23770k;

    /* renamed from: l */
    public C9664b f23771l;

    /* renamed from: m */
    public int f23772m;

    /* renamed from: n */
    public int f23773n;

    /* renamed from: o */
    public Bitmap f23774o;

    /* renamed from: p */
    public boolean f23775p = true;

    /* renamed from: com.my.target.d7$b */
    public interface C9664b extends AudioManager.OnAudioFocusChangeListener, C9651c9.C9652a {
        /* renamed from: b */
        void mo63893b();

        /* renamed from: c */
        void mo63894c();

        /* renamed from: m */
        void mo63895m();

        /* renamed from: n */
        void mo63896n();
    }

    /* renamed from: com.my.target.d7$c */
    public class C9665c implements View.OnClickListener {
        public C9665c() {
        }

        public void onClick(View view) {
            if (C9662d7.this.f23771l != null) {
                if (!C9662d7.this.mo63882d() && !C9662d7.this.mo63881c()) {
                    C9662d7.this.f23771l.mo63895m();
                } else if (!C9662d7.this.mo63881c()) {
                    C9662d7.this.f23771l.mo63894c();
                } else {
                    C9662d7.this.f23771l.mo63896n();
                }
            }
        }
    }

    public C9662d7(Context context, C10059y8 y8Var, boolean z, boolean z2) {
        super(context);
        this.f23761b = y8Var;
        this.f23762c = z;
        this.f23768i = z2;
        this.f23760a = new C9804k6(context);
        this.f23763d = new C9720g6(context);
        this.f23767h = new ProgressBar(context, (AttributeSet) null, 16842874);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23766g = frameLayout;
        C10059y8.m29829a((View) frameLayout, 0, 868608760);
        C10055y5 y5Var = new C10055y5(context);
        this.f23765f = y5Var;
        y5Var.setAdVideoViewListener(this);
        this.f23764e = new C9665c();
    }

    /* renamed from: a */
    public void mo63872a() {
        C9651c9 c9Var = this.f23769j;
        if (c9Var != null) {
            c9Var.destroy();
        }
        this.f23769j = null;
    }

    /* renamed from: a */
    public void mo63873a(int i) {
        C9651c9 c9Var = this.f23769j;
        if (c9Var == null) {
            return;
        }
        if (i == 0) {
            c9Var.mo63743o();
        } else if (i != 1) {
            c9Var.mo63738j();
        } else {
            c9Var.mo63740l();
        }
    }

    /* renamed from: a */
    public final void mo63874a(C9697f2 f2Var) {
        this.f23766g.setVisibility(0);
        setOnClickListener((View.OnClickListener) null);
        this.f23763d.setVisibility(8);
        this.f23767h.setVisibility(8);
        this.f23765f.setVisibility(8);
        this.f23760a.setVisibility(0);
        ImageData image = f2Var.getImage();
        if (image != null && image.getData() != null) {
            this.f23773n = image.getWidth();
            int height = image.getHeight();
            this.f23772m = height;
            if (this.f23773n == 0 || height == 0) {
                this.f23773n = image.getData().getWidth();
                this.f23772m = image.getData().getHeight();
            }
            this.f23760a.setImageBitmap(image.getData());
            this.f23760a.setClickable(false);
        }
    }

    /* renamed from: a */
    public final void mo63875a(C9697f2 f2Var, int i) {
        int i2;
        C10059y8 y8Var;
        this.f23766g.setVisibility(8);
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null) {
            VideoData mediaData = videoBanner.getMediaData();
            this.f23770k = mediaData;
            if (mediaData != null) {
                this.f23769j = (!this.f23768i || !C9864n8.m28843a()) ? C9668d9.m27851p() : C9687e9.m27944a(getContext());
                this.f23769j.mo63727a((C9651c9.C9652a) this.f23771l);
                if (videoBanner.isAutoMute()) {
                    this.f23769j.setVolume(0.0f);
                }
                this.f23773n = this.f23770k.getWidth();
                this.f23772m = this.f23770k.getHeight();
                ImageData preview = videoBanner.getPreview();
                if (preview != null) {
                    this.f23774o = preview.getData();
                    if (this.f23773n <= 0 || this.f23772m <= 0) {
                        this.f23773n = preview.getWidth();
                        this.f23772m = preview.getHeight();
                    }
                    this.f23760a.setImageBitmap(this.f23774o);
                } else {
                    ImageData image = f2Var.getImage();
                    if (image != null) {
                        if (this.f23773n <= 0 || this.f23772m <= 0) {
                            this.f23773n = image.getWidth();
                            this.f23772m = image.getHeight();
                        }
                        Bitmap data = image.getData();
                        this.f23774o = data;
                        this.f23760a.setImageBitmap(data);
                    }
                }
                if (i != 1) {
                    if (this.f23762c) {
                        y8Var = this.f23761b;
                        i2 = IronSourceConstants.USING_CACHE_FOR_INIT_EVENT;
                    } else {
                        y8Var = this.f23761b;
                        i2 = 96;
                    }
                    this.f23763d.mo64102a(C9920q5.m29089a(y8Var.mo65778b(i2)), false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo63876a(boolean z) {
        C9651c9 c9Var;
        C9651c9 c9Var2;
        this.f23763d.setVisibility(8);
        this.f23767h.setVisibility(0);
        if (this.f23770k != null && (c9Var = this.f23769j) != null) {
            c9Var.mo63727a((C9651c9.C9652a) this.f23771l);
            this.f23769j.mo63728a(this.f23765f);
            this.f23765f.mo65764a(this.f23770k.getWidth(), this.f23770k.getHeight());
            String str = (String) this.f23770k.getData();
            if (!z || str == null) {
                c9Var2 = this.f23769j;
                str = this.f23770k.getUrl();
            } else {
                c9Var2 = this.f23769j;
            }
            c9Var2.mo63725a(Uri.parse(str), this.f23765f.getContext());
        }
    }

    /* renamed from: b */
    public void mo63877b() {
        C10059y8.m29840b(this.f23763d, "play_button");
        C10059y8.m29840b(this.f23760a, "media_image");
        C10059y8.m29840b(this.f23765f, "video_texture");
        this.f23760a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f23760a.setAdjustViewBounds(true);
        addView(this.f23765f);
        this.f23767h.setVisibility(8);
        addView(this.f23760a);
        addView(this.f23767h);
        addView(this.f23763d);
        addView(this.f23766g);
    }

    /* renamed from: b */
    public void mo63878b(C9697f2 f2Var) {
        mo63872a();
        mo63874a(f2Var);
    }

    /* renamed from: b */
    public void mo63879b(C9697f2 f2Var, int i) {
        if (f2Var.getVideoBanner() != null) {
            mo63875a(f2Var, i);
        } else {
            mo63874a(f2Var);
        }
    }

    /* renamed from: b */
    public void mo63880b(boolean z) {
        C9651c9 c9Var = this.f23769j;
        if (c9Var != null) {
            c9Var.mo63733e();
        }
        this.f23767h.setVisibility(8);
        this.f23760a.setVisibility(0);
        this.f23760a.setImageBitmap(this.f23774o);
        this.f23775p = z;
        if (z) {
            this.f23763d.setVisibility(0);
            return;
        }
        this.f23760a.setOnClickListener((View.OnClickListener) null);
        this.f23763d.setOnClickListener((View.OnClickListener) null);
        setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: c */
    public boolean mo63881c() {
        C9651c9 c9Var = this.f23769j;
        return c9Var != null && c9Var.mo63734f();
    }

    /* renamed from: d */
    public boolean mo63882d() {
        C9651c9 c9Var = this.f23769j;
        return c9Var != null && c9Var.mo63730c();
    }

    /* renamed from: e */
    public void mo63883e() {
        C9651c9 c9Var = this.f23769j;
        if (c9Var != null) {
            c9Var.mo63729b();
            this.f23760a.setVisibility(0);
            Bitmap screenShot = this.f23765f.getScreenShot();
            if (screenShot != null && this.f23769j.mo63735g()) {
                this.f23760a.setImageBitmap(screenShot);
            }
            if (this.f23775p) {
                this.f23763d.setVisibility(0);
            }
        }
    }

    /* renamed from: f */
    public void mo63884f() {
        C9651c9 c9Var = this.f23769j;
        if (c9Var != null) {
            if (this.f23770k != null) {
                c9Var.mo63723a();
                this.f23760a.setVisibility(8);
            }
            this.f23763d.setVisibility(8);
        }
    }

    /* renamed from: g */
    public void mo63885g() {
        this.f23760a.setOnClickListener(this.f23764e);
        this.f23763d.setOnClickListener(this.f23764e);
        setOnClickListener(this.f23764e);
    }

    public FrameLayout getClickableLayout() {
        return this.f23766g;
    }

    public C9651c9 getVideoPlayer() {
        return this.f23769j;
    }

    /* renamed from: h */
    public void mo63888h() {
        this.f23760a.setVisibility(8);
        this.f23767h.setVisibility(8);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((i3 - i) - measuredWidth) / 2;
                int i7 = ((i4 - i2) - measuredHeight) / 2;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f23772m;
        if (i4 == 0 || (i3 = this.f23773n) == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        if (mode2 == 0 && size2 == 0) {
            size2 = i4;
            size = i3;
            mode = Integer.MIN_VALUE;
            mode2 = Integer.MIN_VALUE;
        }
        if (size2 == 0 || mode2 == 0) {
            size2 = (int) ((((float) size) / ((float) i3)) * ((float) i4));
        }
        if (size == 0 || mode == 0) {
            size = (int) ((((float) size2) / ((float) i4)) * ((float) i3));
        }
        float f = ((float) i3) / ((float) i4);
        float f2 = ((float) size) / f;
        float f3 = (float) size2;
        if (f2 > f3) {
            size = (int) (f * f3);
        } else {
            size2 = (int) f2;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6 = (childAt == this.f23760a || childAt == this.f23766g || childAt == this.f23765f) ? 1073741824 : Integer.MIN_VALUE;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i6), View.MeasureSpec.makeMeasureSpec(size2, i6));
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: p */
    public void mo63891p() {
        C9664b bVar;
        if (this.f23769j instanceof C9687e9) {
            this.f23765f.setViewMode(1);
            VideoData videoData = this.f23770k;
            if (videoData != null) {
                this.f23765f.mo65764a(videoData.getWidth(), this.f23770k.getHeight());
            }
            this.f23769j.mo63728a(this.f23765f);
            if (this.f23769j.mo63730c() && (bVar = this.f23771l) != null) {
                bVar.mo63893b();
                return;
            }
            return;
        }
        C9664b bVar2 = this.f23771l;
        if (bVar2 != null) {
            bVar2.mo63747a("Playback within no hardware accelerated view is available only with ExoPlayer");
        }
    }

    public void setInterstitialPromoViewListener(C9664b bVar) {
        this.f23771l = bVar;
        C9651c9 c9Var = this.f23769j;
        if (c9Var != null) {
            c9Var.mo63727a((C9651c9.C9652a) bVar);
        }
    }
}
