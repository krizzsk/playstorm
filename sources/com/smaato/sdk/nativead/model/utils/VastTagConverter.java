package com.smaato.sdk.nativead.model.utils;

import com.smaato.sdk.richmedia.util.HtmlPlayerUtils;

public class VastTagConverter {
    private final HtmlPlayerUtils htmlPlayerUtils;

    public VastTagConverter(HtmlPlayerUtils htmlPlayerUtils2) {
        this.htmlPlayerUtils = htmlPlayerUtils2;
    }

    public String convertVastRichmedia(String str) {
        return this.htmlPlayerUtils.vastToRichMediaForNativeVideo(str);
    }
}
