package com.p374my.target;

import com.p374my.target.C9983u1;
import com.p374my.target.common.models.AudioData;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.ShareButtonData;
import com.p374my.target.common.models.VideoData;
import java.util.ArrayList;

/* renamed from: com.my.target.g2 */
public final class C9711g2<T extends C9983u1> extends C10066z1 {
    public String adText;
    public boolean allowClose = true;
    public float allowCloseDelay = 0.0f;
    public boolean allowPause = true;
    public boolean allowReplay = true;
    public boolean allowSeek = false;
    public boolean allowSkip = false;
    public boolean allowTrackChange = false;
    public boolean autoMute = false;
    public boolean autoPlay = true;
    public String closeActionText = "Close";
    public String closeDelayActionText = "Ad can be skipped after %ds";
    public final ArrayList<C9600a2> companionBanners = new ArrayList<>();
    public boolean hasCtaButton = true;
    public T mediaData;
    public int mediaSectionType = 0;
    public float point = -1.0f;
    public float pointP = -1.0f;
    public ImageData preview;
    public String replayActionText = "Replay";
    public final ArrayList<ShareButtonData> shareButtonDatas = new ArrayList<>();
    public boolean showPlayerControls = true;

    public static C9711g2<AudioData> newAudioBanner() {
        return newBanner();
    }

    public static <T extends C9983u1> C9711g2<T> newBanner() {
        return new C9711g2<>();
    }

    public static C9711g2<VideoData> newVideoBanner() {
        return newBanner();
    }

    public void addCompanion(C9600a2 a2Var) {
        this.companionBanners.add(a2Var);
    }

    public void addShareButtonData(ShareButtonData shareButtonData) {
        this.shareButtonDatas.add(shareButtonData);
    }

    public String getAdText() {
        return this.adText;
    }

    public float getAllowCloseDelay() {
        return this.allowCloseDelay;
    }

    public String getCloseActionText() {
        return this.closeActionText;
    }

    public String getCloseDelayActionText() {
        return this.closeDelayActionText;
    }

    public ArrayList<C9600a2> getCompanionBanners() {
        return new ArrayList<>(this.companionBanners);
    }

    public int getHeight() {
        T t = this.mediaData;
        if (t != null) {
            return t.getHeight();
        }
        return 0;
    }

    public T getMediaData() {
        return this.mediaData;
    }

    public int getMediaSectionType() {
        return this.mediaSectionType;
    }

    public float getPoint() {
        return this.point;
    }

    public float getPointP() {
        return this.pointP;
    }

    public ImageData getPreview() {
        return this.preview;
    }

    public String getReplayActionText() {
        return this.replayActionText;
    }

    public ArrayList<ShareButtonData> getShareButtonDatas() {
        return new ArrayList<>(this.shareButtonDatas);
    }

    public int getWidth() {
        T t = this.mediaData;
        if (t != null) {
            return t.getWidth();
        }
        return 0;
    }

    public boolean isAllowClose() {
        return this.allowClose;
    }

    public boolean isAllowPause() {
        return this.allowPause;
    }

    public boolean isAllowReplay() {
        return this.allowReplay;
    }

    public boolean isAllowSeek() {
        return this.allowSeek;
    }

    public boolean isAllowSkip() {
        return this.allowSkip;
    }

    public boolean isAllowTrackChange() {
        return this.allowTrackChange;
    }

    public boolean isAutoMute() {
        return this.autoMute;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public boolean isHasCtaButton() {
        return this.hasCtaButton;
    }

    public boolean isShowPlayerControls() {
        return this.showPlayerControls;
    }

    public void setAdText(String str) {
        this.adText = str;
    }

    public void setAllowClose(boolean z) {
        this.allowClose = z;
    }

    public void setAllowCloseDelay(float f) {
        this.allowCloseDelay = f;
    }

    public void setAllowPause(boolean z) {
        this.allowPause = z;
    }

    public void setAllowReplay(boolean z) {
        this.allowReplay = z;
    }

    public void setAllowSeek(boolean z) {
        this.allowSeek = z;
    }

    public void setAllowSkip(boolean z) {
        this.allowSkip = z;
    }

    public void setAllowTrackChange(boolean z) {
        this.allowTrackChange = z;
    }

    public void setAutoMute(boolean z) {
        this.autoMute = z;
    }

    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public void setCloseActionText(String str) {
        this.closeActionText = str;
    }

    public void setCloseDelayActionText(String str) {
        this.closeDelayActionText = str;
    }

    public void setHasCtaButton(boolean z) {
        this.hasCtaButton = z;
    }

    public void setMediaData(T t) {
        this.mediaData = t;
    }

    public void setMediaSectionType(int i) {
        this.mediaSectionType = i;
    }

    public void setPoint(float f) {
        this.point = f;
    }

    public void setPointP(float f) {
        this.pointP = f;
    }

    public void setPreview(ImageData imageData) {
        this.preview = imageData;
    }

    public void setReplayActionText(String str) {
        this.replayActionText = str;
    }

    public void setShowPlayerControls(boolean z) {
        this.showPlayerControls = z;
    }
}
