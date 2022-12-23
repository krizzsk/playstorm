package com.p374my.target;

import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.f2 */
public class C9697f2 extends C9625b2 {
    public ImageData adIcon;
    public String adIconClickLink;
    public boolean closeOnClick = true;
    public C9625b2 endCard;
    public final List<C9640c2> interstitialAdCards = new ArrayList();
    public final C9996v1 promoStyleSettings = C9996v1.m29530l();
    public int style;
    public C9711g2<VideoData> videoBanner;
    public boolean videoRequired = false;

    public static C9697f2 newBanner() {
        return new C9697f2();
    }

    public void addInterstitialAdCard(C9640c2 c2Var) {
        this.interstitialAdCards.add(c2Var);
    }

    public ImageData getAdIcon() {
        return this.adIcon;
    }

    public String getAdIconClickLink() {
        return this.adIconClickLink;
    }

    public C9625b2 getEndCard() {
        return this.endCard;
    }

    public List<C9640c2> getInterstitialAdCards() {
        return this.interstitialAdCards;
    }

    public C9996v1 getPromoStyleSettings() {
        return this.promoStyleSettings;
    }

    public int getStyle() {
        return this.style;
    }

    public C9711g2<VideoData> getVideoBanner() {
        return this.videoBanner;
    }

    public boolean isCloseOnClick() {
        if (this.videoBanner != null) {
            return false;
        }
        return this.closeOnClick;
    }

    public boolean isVideoRequired() {
        return this.videoRequired;
    }

    public void setAdIcon(ImageData imageData) {
        this.adIcon = imageData;
    }

    public void setAdIconClickLink(String str) {
        this.adIconClickLink = str;
    }

    public void setCloseOnClick(boolean z) {
        this.closeOnClick = z;
    }

    public void setEndCard(C9625b2 b2Var) {
        this.endCard = b2Var;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setVideoBanner(C9711g2<VideoData> g2Var) {
        this.videoBanner = g2Var;
    }

    public void setVideoRequired(boolean z) {
        this.videoRequired = z;
    }
}
