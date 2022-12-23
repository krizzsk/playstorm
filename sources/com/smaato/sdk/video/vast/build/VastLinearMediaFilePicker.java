package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.build.MediaFileResult;
import com.smaato.sdk.video.vast.build.compare.AverageBitratePicker;
import com.smaato.sdk.video.vast.build.compare.BitrateComparator;
import com.smaato.sdk.video.vast.build.compare.MediaFileComparator;
import com.smaato.sdk.video.vast.build.compare.SizeComparator;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class VastLinearMediaFilePicker {
    /* access modifiers changed from: package-private */
    public MediaFileResult pickMediaFile(List<MediaFile> list, VastConfigurationSettings vastConfigurationSettings) {
        if (list.isEmpty()) {
            return new MediaFileResult.Builder().build();
        }
        HashSet hashSet = new HashSet();
        ArrayList<MediaFile> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList, new MediaFileComparator(new SizeComparator(vastConfigurationSettings), new BitrateComparator(new AverageBitratePicker(vastConfigurationSettings).getAverageBitrate(), TapjoyConstants.TJC_CONNECTION_TYPE_WIFI.equalsIgnoreCase(vastConfigurationSettings.connectionType))));
        for (MediaFile mediaFile : arrayList) {
            if (mediaFile.isVpaid()) {
                hashSet.add(Integer.valueOf(ErrorCode.GENERAL_VPAID_ERROR));
            } else {
                String str = mediaFile.url;
                String substring = str.substring(str.lastIndexOf(".") + 1);
                String str2 = mediaFile.type;
                if ((str2 != null && str2.matches("video/.*(?i)(mp4|3gp|mp2t|webm|mkv)")) || substring.matches("(?i)^(mp4|3gp|mp2t|webm|mkv)$")) {
                    return new MediaFileResult.Builder().setMediaFile(mediaFile).build();
                }
            }
        }
        hashSet.add(403);
        return new MediaFileResult.Builder().setErrors(hashSet).build();
    }
}
