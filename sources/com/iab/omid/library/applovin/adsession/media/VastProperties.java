package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.p235d.C7705c;
import com.iab.omid.library.applovin.p235d.C7707e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18315a;

    /* renamed from: b */
    private final Float f18316b;

    /* renamed from: c */
    private final boolean f18317c;

    /* renamed from: d */
    private final Position f18318d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18315a = z;
        this.f18316b = f;
        this.f18317c = z2;
        this.f18318d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7707e.m21490a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7707e.m21490a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54598a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18315a);
            if (this.f18315a) {
                jSONObject.put("skipOffset", this.f18316b);
            }
            jSONObject.put("autoPlay", this.f18317c);
            jSONObject.put("position", this.f18318d);
        } catch (JSONException e) {
            C7705c.m21485a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18318d;
    }

    public Float getSkipOffset() {
        return this.f18316b;
    }

    public boolean isAutoPlay() {
        return this.f18317c;
    }

    public boolean isSkippable() {
        return this.f18315a;
    }
}
