package com.smaato.sdk.video.p389ad;

import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.video.vast.model.JavaScriptResource;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.video.ad.VerificationResourceMapper */
public final class VerificationResourceMapper implements Function<List<Verification>, Map<String, List<ViewabilityVerificationResource>>> {
    public Map<String, List<ViewabilityVerificationResource>> apply(List<Verification> list) {
        return (Map) Iterables.reduce(list, new HashMap(), $$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI.INSTANCE);
    }

    static /* synthetic */ void lambda$apply$0(HashMap hashMap, Verification verification, JavaScriptResource javaScriptResource) {
        String str = javaScriptResource.apiFramework;
        List list = (List) hashMap.get(str);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(str, list);
        }
        list.add(new ViewabilityVerificationResource(verification.vendor, javaScriptResource.uri, javaScriptResource.apiFramework, verification.verificationParameters, javaScriptResource.browserOptional));
    }
}
