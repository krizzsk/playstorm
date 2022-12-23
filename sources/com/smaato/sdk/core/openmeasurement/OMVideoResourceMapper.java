package com.smaato.sdk.core.openmeasurement;

import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.p382fi.Function;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class OMVideoResourceMapper implements Function<List<ViewabilityVerificationResource>, List<VerificationScriptResource>> {
    private final String frameworkName;

    public OMVideoResourceMapper(String str) {
        this.frameworkName = (String) Objects.requireNonNull(str);
    }

    public List<VerificationScriptResource> apply(List<ViewabilityVerificationResource> list) {
        URL parseUrl;
        ArrayList arrayList = new ArrayList();
        for (ViewabilityVerificationResource next : list) {
            if (next.getApiFramework().equals(this.frameworkName) && next.isNoBrowser() && (parseUrl = parseUrl(next.getJsScriptUrl())) != null) {
                arrayList.add(createOmScriptResource(next.getVendor(), parseUrl, next.getParameters()));
            }
        }
        return arrayList;
    }

    private URL parseUrl(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private VerificationScriptResource createOmScriptResource(String str, URL url, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
        }
        return VerificationScriptResource.createVerificationScriptResourceWithParameters(str, url, str2);
    }
}
