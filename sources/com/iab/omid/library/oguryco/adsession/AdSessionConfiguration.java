package com.iab.omid.library.oguryco.adsession;

import com.iab.omid.library.oguryco.p271d.C8006b;
import com.iab.omid.library.oguryco.p271d.C8010e;
import com.smaato.sdk.video.vast.model.StaticResource;
import org.json.JSONObject;

public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType2;
        this.impressionType = impressionType2;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        C8010e.m22850a((Object) creativeType2, "CreativeType is null");
        C8010e.m22850a((Object) impressionType2, "ImpressionType is null");
        C8010e.m22850a((Object) owner, "Impression owner is null");
        C8010e.m22848a(owner, creativeType2, impressionType2);
        return new AdSessionConfiguration(creativeType2, impressionType2, owner, owner2, z);
    }

    @Deprecated
    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2) {
        return createAdSessionConfiguration(owner, owner2, true);
    }

    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2, boolean z) {
        C8010e.m22850a((Object) owner, "Impression owner is null");
        C8010e.m22848a(owner, (CreativeType) null, (ImpressionType) null);
        return new AdSessionConfiguration((CreativeType) null, (ImpressionType) null, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public boolean isNativeVideoEventsOwner() {
        return isNativeMediaEventsOwner();
    }

    public JSONObject toJsonObject() {
        String str;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        C8006b.m22834a(jSONObject, "impressionOwner", this.impressionOwner);
        if (this.creativeType == null || this.impressionType == null) {
            obj = this.mediaEventsOwner;
            str = "videoEventsOwner";
        } else {
            C8006b.m22834a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
            C8006b.m22834a(jSONObject, StaticResource.CREATIVE_TYPE, this.creativeType);
            obj = this.impressionType;
            str = "impressionType";
        }
        C8006b.m22834a(jSONObject, str, obj);
        C8006b.m22834a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
