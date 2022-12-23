package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.p223d.C7605c;
import com.iab.omid.library.adcolony.p223d.C7607e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18081a;

    /* renamed from: b */
    private final Float f18082b;

    /* renamed from: c */
    private final boolean f18083c;

    /* renamed from: d */
    private final Position f18084d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18081a = z;
        this.f18082b = f;
        this.f18083c = z2;
        this.f18084d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7607e.m21030a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7607e.m21030a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54200a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18081a);
            if (this.f18081a) {
                jSONObject.put("skipOffset", this.f18082b);
            }
            jSONObject.put("autoPlay", this.f18083c);
            jSONObject.put("position", this.f18084d);
        } catch (JSONException e) {
            C7605c.m21025a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18084d;
    }

    public Float getSkipOffset() {
        return this.f18082b;
    }

    public boolean isAutoPlay() {
        return this.f18083c;
    }

    public boolean isSkippable() {
        return this.f18081a;
    }
}
