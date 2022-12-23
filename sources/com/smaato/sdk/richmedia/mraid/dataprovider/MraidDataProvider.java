package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.content.Context;
import android.graphics.Rect;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.p378ad.RequestInfoMapper;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import com.smaato.sdk.core.util.notifier.ChangeSenderUtils;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import java.util.List;

public final class MraidDataProvider {
    private final ChangeSender<MraidAudioVolumeLevel> audioVolumeChangeSender;
    private final ChangeSender<Rect> currentPositionInDpChangeSender;
    private final ChangeSender<Rect> defaultPositionInDpChangeSender;
    private final ChangeSender<MraidExposureProperties> exposureChangeSender = ChangeSenderUtils.createUniqueValueChangeSender(MraidExposureProperties.empty());
    private final ChangeSender<MraidLocationProperties> locationPropertiesSender;
    private final ChangeSender<Rect> maxSizeInDpChangeSender;
    private final ChangeSender<MraidAppOrientation> orientationChangeSender;
    private final PlacementType placementType;
    private final ChangeSender<Rect> screenSizeInDpSender;
    private final ChangeSender<MraidStateMachineFactory.State> stateChangeSender;
    private final ChangeSender<List<String>> supportedFeaturesChangeSender;
    private final ChangeSender<Boolean> viewableChange;

    public MraidDataProvider(Context context, PlacementType placementType2, MraidStateMachineFactory.State state, RequestInfoProvider requestInfoProvider, SdkConfiguration sdkConfiguration, List<String> list, RequestInfoMapper requestInfoMapper, MusicPlaybackVolume musicPlaybackVolume) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(requestInfoProvider);
        Objects.requireNonNull(sdkConfiguration);
        Objects.requireNonNull(list);
        this.placementType = (PlacementType) Objects.requireNonNull(placementType2);
        this.supportedFeaturesChangeSender = ChangeSenderUtils.createUniqueValueChangeSender(Lists.toImmutableList(list));
        this.orientationChangeSender = ChangeSenderUtils.createUniqueValueChangeSender(MraidAppOrientation.from(context));
        this.defaultPositionInDpChangeSender = ChangeSenderUtils.createUniqueValueChangeSender(new Rect());
        this.currentPositionInDpChangeSender = ChangeSenderUtils.createUniqueValueChangeSender(new Rect());
        this.maxSizeInDpChangeSender = ChangeSenderUtils.createUniqueValueChangeSender(new Rect());
        Size displaySizeInDp = UIUtils.getDisplaySizeInDp(context);
        this.screenSizeInDpSender = ChangeSenderUtils.createUniqueValueChangeSender(new Rect(0, 0, displaySizeInDp.width, displaySizeInDp.height));
        this.audioVolumeChangeSender = ChangeSenderUtils.createUniqueValueChangeSender(MraidAudioVolumeLevel.create(musicPlaybackVolume.getCurrentVolume(), musicPlaybackVolume.getMaxVolume()));
        this.stateChangeSender = ChangeSenderUtils.createUniqueValueChangeSender(state);
        this.locationPropertiesSender = ChangeSenderUtils.createUniqueValueChangeSender(MraidLocationProperties.create(requestInfoProvider, sdkConfiguration, requestInfoMapper));
        this.viewableChange = ChangeSenderUtils.createUniqueValueChangeSender(Boolean.FALSE);
    }

    public ChangeSender<MraidAppOrientation> getOrientationChangeSender() {
        return this.orientationChangeSender;
    }

    public ChangeSender<MraidExposureProperties> getExposureChangeSender() {
        return this.exposureChangeSender;
    }

    public ChangeSender<Rect> getDefaultPositionInDpChangeSender() {
        return this.defaultPositionInDpChangeSender;
    }

    public ChangeSender<Rect> getCurrentPositionInDpChangeSender() {
        return this.currentPositionInDpChangeSender;
    }

    public ChangeSender<Rect> getMaxSizeInDpChangeSender() {
        return this.maxSizeInDpChangeSender;
    }

    public ChangeSender<Rect> getScreenSizeInDpSender() {
        return this.screenSizeInDpSender;
    }

    public ChangeSender<MraidAudioVolumeLevel> getAudioVolumeChangeSender() {
        return this.audioVolumeChangeSender;
    }

    public ChangeSender<MraidStateMachineFactory.State> getStateChangeSender() {
        return this.stateChangeSender;
    }

    public ChangeSender<MraidLocationProperties> getLocationPropertiesSender() {
        return this.locationPropertiesSender;
    }

    public PlacementType getPlacementType() {
        return this.placementType;
    }

    public ChangeSender<List<String>> getSupportedFeatures() {
        return this.supportedFeaturesChangeSender;
    }

    public ChangeSender<Boolean> getViewableChangeSender() {
        return this.viewableChange;
    }
}
