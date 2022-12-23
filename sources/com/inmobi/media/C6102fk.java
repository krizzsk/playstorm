package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.inmobi.media.fk */
/* compiled from: NativeVideoWrapper */
public class C6102fk extends RelativeLayout {

    /* renamed from: a */
    private static final String f15529a = C6102fk.class.getSimpleName();

    /* renamed from: b */
    private C6089fj f15530b = new C6089fj(getContext());

    /* renamed from: c */
    private ImageView f15531c;

    /* renamed from: d */
    private ProgressBar f15532d;

    public C6102fk(Context context) {
        super(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f15530b, layoutParams);
        ImageView imageView = new ImageView(getContext());
        this.f15531c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f15531c.setVisibility(8);
        addView(this.f15531c, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f15532d = progressBar;
        progressBar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(this.f15532d, layoutParams2);
        C6086fi fiVar = new C6086fi(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        this.f15530b.setMediaController(fiVar);
        addView(fiVar, layoutParams3);
    }

    /* renamed from: a */
    public final void mo35301a() {
        RelativeLayout.LayoutParams layoutParams;
        double d;
        double d2;
        C5923cg cgVar = (C5923cg) this.f15530b.getTag();
        if (cgVar != null) {
            try {
                String b = cgVar.mo34920b().mo35108b();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b);
                int intValue = Integer.valueOf(mediaMetadataRetriever.extractMetadata(18)).intValue();
                int intValue2 = Integer.valueOf(mediaMetadataRetriever.extractMetadata(19)).intValue();
                mediaMetadataRetriever.release();
                Point point = cgVar.f14894c.f14917a;
                double d3 = (double) intValue;
                double d4 = (double) intValue2;
                if (((double) C6103fl.m18254c(point.x)) / ((double) C6103fl.m18254c(point.y)) > d3 / d4) {
                    d2 = d3 * ((((double) C6103fl.m18254c(point.y)) * 1.0d) / d4);
                    d = (double) C6103fl.m18254c(point.y);
                } else {
                    double c = (double) C6103fl.m18254c(point.x);
                    d = d4 * ((((double) C6103fl.m18254c(point.x)) * 1.0d) / d3);
                    d2 = c;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) d2, (int) d);
            } catch (Exception e) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                C6181gg.m18398a().mo35357a(new C6217hg(e));
                layoutParams = layoutParams2;
            }
            layoutParams.addRule(13);
            this.f15530b.setLayoutParams(layoutParams);
        }
    }

    public void setPosterImage(Bitmap bitmap) {
        this.f15531c.setImageBitmap(bitmap);
    }

    public C6089fj getVideoView() {
        return this.f15530b;
    }

    public ImageView getPoster() {
        return this.f15531c;
    }

    public ProgressBar getProgressBar() {
        return this.f15532d;
    }
}
