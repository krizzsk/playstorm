package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.p247d.C7806c;
import com.iab.omid.library.fyber.p247d.C7808e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18545a;

    /* renamed from: b */
    private final Float f18546b;

    /* renamed from: c */
    private final boolean f18547c;

    /* renamed from: d */
    private final Position f18548d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18545a = z;
        this.f18546b = f;
        this.f18547c = z2;
        this.f18548d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7808e.m21944a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7808e.m21944a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54991a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18545a);
            if (this.f18545a) {
                jSONObject.put("skipOffset", this.f18546b);
            }
            jSONObject.put("autoPlay", this.f18547c);
            jSONObject.put("position", this.f18548d);
        } catch (JSONException e) {
            C7806c.m21939a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18548d;
    }

    public Float getSkipOffset() {
        return this.f18546b;
    }

    public boolean isAutoPlay() {
        return this.f18547c;
    }

    public boolean isSkippable() {
        return this.f18545a;
    }
}
