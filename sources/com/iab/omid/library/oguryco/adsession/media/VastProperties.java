package com.iab.omid.library.oguryco.adsession.media;

import com.iab.omid.library.oguryco.p271d.C8008c;
import com.iab.omid.library.oguryco.p271d.C8010e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19005a;

    /* renamed from: b */
    private final Float f19006b;

    /* renamed from: c */
    private final boolean f19007c;

    /* renamed from: d */
    private final Position f19008d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f19005a = z;
        this.f19006b = f;
        this.f19007c = z2;
        this.f19008d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C8010e.m22850a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C8010e.m22850a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject mo55768a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f19005a);
            if (this.f19005a) {
                jSONObject.put("skipOffset", this.f19006b);
            }
            jSONObject.put("autoPlay", this.f19007c);
            jSONObject.put("position", this.f19008d);
        } catch (JSONException e) {
            C8008c.m22845a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f19008d;
    }

    public final Float getSkipOffset() {
        return this.f19006b;
    }

    public final boolean isAutoPlay() {
        return this.f19007c;
    }

    public final boolean isSkippable() {
        return this.f19005a;
    }
}
