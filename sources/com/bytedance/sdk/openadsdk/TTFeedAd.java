package com.bytedance.sdk.openadsdk;

public interface TTFeedAd extends TTNativeAd {

    public interface VideoAdListener {
        void onProgressUpdate(long j, long j2);

        void onVideoAdComplete(TTFeedAd tTFeedAd);

        void onVideoAdContinuePlay(TTFeedAd tTFeedAd);

        void onVideoAdPaused(TTFeedAd tTFeedAd);

        void onVideoAdStartPlay(TTFeedAd tTFeedAd);

        void onVideoError(int i, int i2);

        void onVideoLoad(TTFeedAd tTFeedAd);
    }

    double currentPlayTime();

    double getVideoDuration();

    void pause();

    void play();

    void setVideoAdListener(VideoAdListener videoAdListener);
}
