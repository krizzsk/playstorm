package com.p374my.target;

import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.h2 */
public class C9733h2 extends C10066z1 {
    public C9777j2 content;
    public ImageData ctcIcon;
    public String ctcText = "Try to play";
    public final List<C9751i2> nativeAdCards = new ArrayList();
    public C9711g2<VideoData> videoBanner;

    public static C9733h2 newBanner() {
        return new C9733h2();
    }

    public void addNativeAdCard(C9751i2 i2Var) {
        this.nativeAdCards.add(i2Var);
    }

    public C9777j2 getContent() {
        return this.content;
    }

    public ImageData getCtcIcon() {
        return this.ctcIcon;
    }

    public String getCtcText() {
        return this.ctcText;
    }

    public List<C9751i2> getNativeAdCards() {
        return new ArrayList(this.nativeAdCards);
    }

    public C9711g2<VideoData> getVideoBanner() {
        return this.videoBanner;
    }

    public void setContent(C9777j2 j2Var) {
        this.content = j2Var;
    }

    public void setCtcIcon(ImageData imageData) {
        this.ctcIcon = imageData;
    }

    public void setCtcText(String str) {
        this.ctcText = str;
    }

    public void setVideoBanner(C9711g2<VideoData> g2Var) {
        this.videoBanner = g2Var;
    }
}
