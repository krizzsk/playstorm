package com.bytedance.sdk.openadsdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

public interface TTNativeAd extends TTClientBidding {

    public interface AdInteractionListener {
        void onAdClicked(View view, TTNativeAd tTNativeAd);

        void onAdCreativeClick(View view, TTNativeAd tTNativeAd);

        void onAdShow(TTNativeAd tTNativeAd);
    }

    String getAdCreativeToken();

    Bitmap getAdLogo();

    View getAdLogoView();

    View getAdView();

    @Deprecated
    int getAppCommentNum();

    @Deprecated
    int getAppScore();

    @Deprecated
    int getAppSize();

    String getButtonText();

    String getDescription();

    TTAdDislike getDislikeDialog(Activity activity);

    TTAdDislike getDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract);

    @Deprecated
    List<FilterWord> getFilterWords();

    TTImage getIcon();

    List<TTImage> getImageList();

    int getImageMode();

    @Deprecated
    int getInteractionType();

    @Deprecated
    Map<String, Object> getMediaExtraInfo();

    @Deprecated
    String getSource();

    String getTitle();

    TTImage getVideoCoverImage();

    void registerViewForInteraction(ViewGroup viewGroup, View view, AdInteractionListener adInteractionListener);

    void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, AdInteractionListener adInteractionListener);

    void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, AdInteractionListener adInteractionListener);

    void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, AdInteractionListener adInteractionListener);

    void showPrivacyActivity();
}
