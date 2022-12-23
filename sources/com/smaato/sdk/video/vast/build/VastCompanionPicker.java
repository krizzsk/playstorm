package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.build.compare.SizeComparator;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.smaato.sdk.video.vast.model.Creative;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VastCompanionPicker {
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.smaato.sdk.video.vast.model.Companion pickCompanion(com.smaato.sdk.video.vast.model.CompanionAds r2, com.smaato.sdk.video.vast.build.VastConfigurationSettings r3) {
        /*
            r1 = this;
            java.lang.String r0 = "Parameter companionAds should not be null for VastCompanionPicker::pickCompanion"
            com.smaato.sdk.core.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "Parameter vastConfigurationSettings should not be null for VastCompanionPicker::pickCompanion"
            com.smaato.sdk.core.util.Objects.requireNonNull(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.smaato.sdk.video.vast.model.Companion> r2 = r2.companions
            r0.<init>(r2)
            com.smaato.sdk.video.vast.build.compare.SizeComparator r2 = new com.smaato.sdk.video.vast.build.compare.SizeComparator
            r2.<init>(r3)
            java.util.Collections.sort(r0, r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r2.next()
            com.smaato.sdk.video.vast.model.Companion r3 = (com.smaato.sdk.video.vast.model.Companion) r3
            java.util.List<com.smaato.sdk.video.vast.model.StaticResource> r0 = r3.staticResources
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0043
            java.util.List<java.lang.String> r0 = r3.iFrameResources
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0043
            java.util.List<java.lang.String> r0 = r3.htmlResources
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001d
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.build.VastCompanionPicker.pickCompanion(com.smaato.sdk.video.vast.model.CompanionAds, com.smaato.sdk.video.vast.build.VastConfigurationSettings):com.smaato.sdk.video.vast.model.Companion");
    }

    public Companion pickCompanion(List<Creative> list, VastConfigurationSettings vastConfigurationSettings) {
        Companion pickCompanion;
        Objects.requireNonNull(list, "Parameter creatives should not be null for VastCompanionPicker::pickCompanion");
        Objects.requireNonNull(vastConfigurationSettings, "Parameter vastConfigurationSettings should not be null for VastCompanionPicker::pickCompanion");
        ArrayList arrayList = new ArrayList();
        for (Creative creative : list) {
            CompanionAds companionAds = creative.companionAds;
            if (!(companionAds == null || (pickCompanion = pickCompanion(companionAds, vastConfigurationSettings)) == null)) {
                arrayList.add(pickCompanion);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new SizeComparator(vastConfigurationSettings));
        return (Companion) arrayList.get(0);
    }
}
