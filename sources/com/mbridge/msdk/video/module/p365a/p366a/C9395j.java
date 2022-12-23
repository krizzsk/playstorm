package com.mbridge.msdk.video.module.p365a.p366a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C8607t;

/* renamed from: com.mbridge.msdk.video.module.a.a.j */
/* compiled from: RoundedImageLoaderListener */
public final class C9395j extends C9389e {

    /* renamed from: a */
    private int f22972a;

    public C9395j(ImageView imageView, int i) {
        super(imageView);
        this.f22972a = i;
    }

    public final void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap a;
        if (bitmap != null) {
            try {
                if (this.f22966b != null && !bitmap.isRecycled() && (a = C8607t.m24878a(bitmap, 1, this.f22972a)) != null) {
                    this.f22966b.setImageBitmap(a);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }
}
