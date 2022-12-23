package com.smaato.sdk.video.vast.utils;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;

public class VastScenarioResourceDataConverter {
    public String getUriFromResources(VastScenarioResourceData vastScenarioResourceData, int i, int i2) {
        String str;
        String str2 = "100%";
        if (i == 0) {
            str = str2;
        } else {
            str = i + "px";
        }
        if (i2 != 0) {
            str2 = i2 + "px";
        }
        StaticResource staticResource = vastScenarioResourceData.staticResources;
        if (staticResource != null) {
            return VastScenarioResourceHtmlHelper.wrapStaticResourceWithSizeIntoHtml(staticResource, str, str2);
        }
        if (!TextUtils.isEmpty(vastScenarioResourceData.htmlResources)) {
            return VastScenarioResourceHtmlHelper.wrapHtmlResourceWithSizeIntoHtml(vastScenarioResourceData.htmlResources, str, str2);
        }
        if (!TextUtils.isEmpty(vastScenarioResourceData.iFrameResources)) {
            return VastScenarioResourceHtmlHelper.wrapIFrameResourceWithSizeIntoHtml(vastScenarioResourceData.iFrameResources, str, str2);
        }
        return null;
    }
}
