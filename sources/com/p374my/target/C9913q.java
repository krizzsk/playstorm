package com.p374my.target;

import android.content.Context;
import android.graphics.Point;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.q */
public class C9913q extends C9653d<C9963t2> {
    /* renamed from: a */
    public static C9913q m29009a() {
        return new C9913q();
    }

    /* renamed from: a */
    public final ImageData mo65232a(List<ImageData> list, int i, int i2) {
        float f;
        float f2;
        ImageData imageData = null;
        if (list.size() == 0) {
            return null;
        }
        if (i2 == 0 || i == 0) {
            C9672e0.m27882a("[InterstitialAdResultProcessor] display size is zero");
            return null;
        }
        float f3 = (float) i;
        float f4 = (float) i2;
        float f5 = f3 / f4;
        float f6 = 0.0f;
        for (ImageData next : list) {
            if (next.getWidth() > 0 && next.getHeight() > 0) {
                float width = ((float) next.getWidth()) / ((float) next.getHeight());
                if (f5 < width) {
                    f = (float) next.getWidth();
                    if (f > f3) {
                        f = f3;
                    }
                    f2 = f / width;
                } else {
                    float height = (float) next.getHeight();
                    if (height > f4) {
                        height = f4;
                    }
                    float f7 = height;
                    f = width * height;
                    f2 = f7;
                }
                float f8 = f2 * f;
                if (f8 <= f6) {
                    break;
                }
                imageData = next;
                f6 = f8;
            }
        }
        return imageData;
    }

    /* renamed from: a */
    public C9963t2 mo63851a(C9963t2 t2Var, C9596a aVar, Context context) {
        C9625b2 c = t2Var.mo65447c();
        if (c == null) {
            C9839m2 b = t2Var.mo65294b();
            if (b == null || !b.mo64724b()) {
                return null;
            }
            return t2Var;
        } else if (mo65235a(context, c)) {
            return t2Var;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo65234a(C9657d2 d2Var, Context context) {
        ArrayList arrayList = new ArrayList();
        C9894p1 adChoices = d2Var.getAdChoices();
        if (adChoices != null) {
            arrayList.add(adChoices.mo65194c());
        }
        ImageData closeIcon = d2Var.getCloseIcon();
        if (closeIcon != null) {
            arrayList.add(closeIcon);
        }
        C9807k8.m28509a((List<ImageData>) arrayList).mo64623c(context);
    }

    /* renamed from: a */
    public final boolean mo65235a(Context context, C9625b2 b2Var) {
        if (b2Var instanceof C9697f2) {
            return mo65237a((C9697f2) b2Var, context);
        }
        if (b2Var instanceof C9675e2) {
            return mo65236a((C9675e2) b2Var, context);
        }
        if (!(b2Var instanceof C9657d2)) {
            return false;
        }
        mo65234a((C9657d2) b2Var, context);
        return true;
    }

    /* renamed from: a */
    public final boolean mo65236a(C9675e2 e2Var, Context context) {
        ImageData closeIcon;
        ArrayList arrayList = new ArrayList();
        Point b = C10059y8.m29837b(context);
        ImageData a = mo65232a(e2Var.getPortraitImages(), Math.min(b.x, b.y), Math.max(b.x, b.y));
        if (a != null) {
            arrayList.add(a);
            e2Var.setOptimalPortraitImage(a);
        }
        ImageData a2 = mo65232a(e2Var.getLandscapeImages(), Math.max(b.x, b.y), Math.min(b.x, b.y));
        if (a2 != null) {
            arrayList.add(a2);
            e2Var.setOptimalLandscapeImage(a2);
        }
        if (!((a == null && a2 == null) || (closeIcon = e2Var.getCloseIcon()) == null)) {
            arrayList.add(closeIcon);
        }
        C9894p1 adChoices = e2Var.getAdChoices();
        if (adChoices != null) {
            arrayList.add(adChoices.mo65194c());
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        C9807k8.m28509a((List<ImageData>) arrayList).mo64623c(context);
        if (a == null || a.getBitmap() == null) {
            return (a2 == null || a2.getBitmap() == null) ? false : true;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo65237a(C9697f2 f2Var, Context context) {
        ArrayList arrayList = new ArrayList();
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null) {
            if (videoBanner.getPreview() != null) {
                arrayList.add(videoBanner.getPreview());
            }
            VideoData mediaData = videoBanner.getMediaData();
            if (mediaData != null && mediaData.isCacheable()) {
                String str = (String) C9778j3.m28395d().mo64164b(mediaData.getUrl(), (String) null, context);
                if (str != null) {
                    mediaData.setData(str);
                } else if (f2Var.isVideoRequired()) {
                    return false;
                }
            }
        }
        if (f2Var.getImage() != null) {
            arrayList.add(f2Var.getImage());
        }
        if (f2Var.getIcon() != null) {
            arrayList.add(f2Var.getIcon());
        }
        if (f2Var.getCloseIcon() != null) {
            arrayList.add(f2Var.getCloseIcon());
        }
        if (f2Var.getAdIcon() != null) {
            arrayList.add(f2Var.getAdIcon());
        }
        if (f2Var.getAdChoices() != null) {
            arrayList.add(f2Var.getAdChoices().mo65194c());
        }
        ImageData i = f2Var.getPromoStyleSettings().mo65598i();
        if (i != null) {
            arrayList.add(i);
        }
        List<C9640c2> interstitialAdCards = f2Var.getInterstitialAdCards();
        if (!interstitialAdCards.isEmpty()) {
            for (C9640c2 image : interstitialAdCards) {
                ImageData image2 = image.getImage();
                if (image2 != null) {
                    arrayList.add(image2);
                }
            }
        }
        C9625b2 endCard = f2Var.getEndCard();
        if (endCard != null && !mo65235a(context, endCard)) {
            f2Var.setEndCard((C9625b2) null);
        }
        if (arrayList.size() <= 0) {
            return true;
        }
        C9807k8.m28509a((List<ImageData>) arrayList).mo64623c(context);
        return true;
    }
}
