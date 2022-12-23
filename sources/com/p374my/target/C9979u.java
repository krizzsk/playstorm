package com.p374my.target;

import android.content.Context;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.u */
public class C9979u extends C9653d<C9997v2> {
    /* renamed from: a */
    public static C9979u m29398a() {
        return new C9979u();
    }

    /* renamed from: a */
    public C9997v2 mo63851a(C9997v2 v2Var, C9596a aVar, Context context) {
        List<C9733h2> c = v2Var.mo65603c();
        if (c.isEmpty()) {
            C9839m2 b = v2Var.mo65294b();
            if (b == null || !b.mo64724b()) {
                return null;
            }
            return v2Var;
        }
        ArrayList arrayList = new ArrayList();
        int cachePolicy = aVar.getCachePolicy();
        boolean z = cachePolicy == 0 || cachePolicy == 1;
        for (C9733h2 next : c) {
            C9711g2<VideoData> videoBanner = next.getVideoBanner();
            if (videoBanner != null) {
                VideoData mediaData = videoBanner.getMediaData();
                boolean z2 = cachePolicy == 0 || cachePolicy == 2;
                if (mediaData != null && z2 && mediaData.isCacheable()) {
                    mediaData.setData((String) C9778j3.m28395d().mo64164b(mediaData.getUrl(), (String) null, context));
                }
            }
            ImageData image = next.getImage();
            if (image != null) {
                image.useCache(true);
                if (z) {
                    arrayList.add(image);
                }
            }
            ImageData icon = next.getIcon();
            if (icon != null) {
                icon.useCache(true);
                if (z) {
                    arrayList.add(icon);
                }
            }
            for (C9751i2 image2 : next.getNativeAdCards()) {
                ImageData image3 = image2.getImage();
                if (image3 != null) {
                    image3.useCache(true);
                    if (z) {
                        arrayList.add(image3);
                    }
                }
            }
            C9894p1 adChoices = next.getAdChoices();
            if (adChoices != null) {
                ImageData c2 = adChoices.mo65194c();
                c2.useCache(true);
                if (z) {
                    arrayList.add(c2);
                }
            }
            ImageData ctcIcon = next.getCtcIcon();
            if (ctcIcon != null) {
                arrayList.add(ctcIcon);
            }
        }
        if (arrayList.size() > 0) {
            C9807k8.m28509a((List<ImageData>) arrayList).mo64623c(context);
        }
        return v2Var;
    }
}
