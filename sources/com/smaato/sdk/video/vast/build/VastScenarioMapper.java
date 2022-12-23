package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.build.VastScenarioResult;
import com.smaato.sdk.video.vast.build.compare.AverageBitratePicker;
import com.smaato.sdk.video.vast.build.compare.BitrateComparator;
import com.smaato.sdk.video.vast.build.compare.MediaFileComparator;
import com.smaato.sdk.video.vast.build.compare.SizeComparator;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import com.tapjoy.TapjoyConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VastScenarioMapper {
    private final VastCompanionPicker vastCompanionPicker;
    private final VastCompanionScenarioMapper vastCompanionScenarioMapper;
    private final VastMediaFileScenarioMapper vastMediaFileScenarioMapper;
    private final VastLinearMediaFilePicker vastMediaFileScenarioPicker;
    private final VastScenarioCreativeDataMapper vastScenarioCreativeDataMapper;

    public VastScenarioMapper(VastLinearMediaFilePicker vastLinearMediaFilePicker, VastCompanionPicker vastCompanionPicker2, VastCompanionScenarioMapper vastCompanionScenarioMapper2, VastMediaFileScenarioMapper vastMediaFileScenarioMapper2, VastScenarioCreativeDataMapper vastScenarioCreativeDataMapper2) {
        this.vastMediaFileScenarioPicker = (VastLinearMediaFilePicker) Objects.requireNonNull(vastLinearMediaFilePicker, "Parameter vastLinearMediaFilePicker should be null for VastScenarioPicker::new");
        this.vastCompanionPicker = (VastCompanionPicker) Objects.requireNonNull(vastCompanionPicker2, "Parameter vastCompanionPicker should be null for VastScenarioPicker::new");
        this.vastCompanionScenarioMapper = (VastCompanionScenarioMapper) Objects.requireNonNull(vastCompanionScenarioMapper2, "Parameter vastCompanionScenarioMapper should be null for VastScenarioPicker::new");
        this.vastMediaFileScenarioMapper = (VastMediaFileScenarioMapper) Objects.requireNonNull(vastMediaFileScenarioMapper2, "Parameter vastMediaFileScenarioMapper should be null for VastScenarioPicker::new");
        this.vastScenarioCreativeDataMapper = (VastScenarioCreativeDataMapper) Objects.requireNonNull(vastScenarioCreativeDataMapper2, "Parameter vastScenarioCreativeDataMapper should be null for VastScenarioPicker::new");
    }

    /* access modifiers changed from: package-private */
    public VastScenarioResult mapVastScenario(Logger logger, InLine inLine, VastConfigurationSettings vastConfigurationSettings) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(vastConfigurationSettings);
        HashSet hashSet = new HashSet();
        VastScenarioResult.Builder errorUrls = new VastScenarioResult.Builder().setErrors(hashSet).setErrorUrls(new HashSet(inLine.errors));
        TreeMap treeMap = new TreeMap(new MediaFileComparator(new SizeComparator(vastConfigurationSettings), new BitrateComparator(new AverageBitratePicker(vastConfigurationSettings).getAverageBitrate(), TapjoyConstants.TJC_CONNECTION_TYPE_WIFI.equalsIgnoreCase(vastConfigurationSettings.connectionType))));
        Set<Integer> pickMediaFile = pickMediaFile(inLine, vastConfigurationSettings, treeMap);
        if (treeMap.isEmpty()) {
            if (pickMediaFile.isEmpty()) {
                hashSet.add(400);
            } else {
                hashSet.addAll(pickMediaFile);
            }
            return errorUrls.build();
        }
        Map.Entry firstEntry = treeMap.firstEntry();
        Creative creative = ((CreativeLinearContainer) firstEntry.getValue()).creative;
        Linear linear = ((CreativeLinearContainer) firstEntry.getValue()).linear;
        VastScenarioCreativeData mapVastScenarioCreativeData = this.vastScenarioCreativeDataMapper.mapVastScenarioCreativeData(creative);
        VastMediaFileScenario mapMediaFileScenario = this.vastMediaFileScenarioMapper.mapMediaFileScenario(logger, (MediaFile) firstEntry.getKey(), linear, mapVastScenarioCreativeData);
        CompanionAds companionAds = creative.companionAds;
        VastCompanionScenario vastCompanionScenario = null;
        Companion pickCompanion = companionAds != null ? this.vastCompanionPicker.pickCompanion(companionAds, vastConfigurationSettings) : null;
        if (pickCompanion == null) {
            pickCompanion = this.vastCompanionPicker.pickCompanion(inLine.creatives, vastConfigurationSettings);
        }
        if (pickCompanion != null) {
            vastCompanionScenario = this.vastCompanionScenarioMapper.mapVastCompanionScenario(logger, pickCompanion, mapVastScenarioCreativeData);
        } else if (creative.hasCompanions()) {
            hashSet.add(600);
        }
        return errorUrls.setVastScenario(mapVastScenario(inLine, mapMediaFileScenario, vastCompanionScenario)).build();
    }

    private Set<Integer> pickMediaFile(InLine inLine, VastConfigurationSettings vastConfigurationSettings, TreeMap<MediaFile, CreativeLinearContainer> treeMap) {
        HashSet hashSet = new HashSet();
        Iterator<Creative> it = inLine.creatives.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Creative next = it.next();
            Linear linear = next.linear;
            if (linear != null && !linear.mediaFiles.isEmpty()) {
                MediaFileResult pickMediaFile = this.vastMediaFileScenarioPicker.pickMediaFile(linear.mediaFiles, vastConfigurationSettings);
                MediaFile mediaFile = pickMediaFile.mediaFile;
                if (mediaFile != null) {
                    treeMap.put(mediaFile, new CreativeLinearContainer(next, linear));
                    break;
                }
                hashSet.addAll(pickMediaFile.errors);
            }
        }
        return hashSet;
    }

    private VastScenario mapVastScenario(InLine inLine, VastMediaFileScenario vastMediaFileScenario, VastCompanionScenario vastCompanionScenario) {
        return new VastScenario.Builder().setAdSystem(inLine.adSystem).setAdTitle(inLine.adTitle).setAdVerifications(inLine.adVerifications).setAdvertiser(inLine.advertiser).setCategories(inLine.categories).setDescription(inLine.description).setErrors(inLine.errors).setImpressions(inLine.impressions).setViewableImpression(inLine.viewableImpression).setVastMediaFileScenario(vastMediaFileScenario).setVastCompanionScenario(vastCompanionScenario).setAdServingId(inLine.adServingId).build();
    }

    private static final class CreativeLinearContainer {
        public final Creative creative;
        public final Linear linear;

        private CreativeLinearContainer(Creative creative2, Linear linear2) {
            this.creative = (Creative) Objects.requireNonNull(creative2);
            this.linear = (Linear) Objects.requireNonNull(linear2);
        }
    }
}
