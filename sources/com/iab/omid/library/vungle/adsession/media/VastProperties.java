package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.p283d.C8108c;
import com.iab.omid.library.vungle.p283d.C8110e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19239a;

    /* renamed from: b */
    private final Float f19240b;

    /* renamed from: c */
    private final boolean f19241c;

    /* renamed from: d */
    private final Position f19242d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f19239a = z;
        this.f19240b = f;
        this.f19241c = z2;
        this.f19242d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C8110e.m23298a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C8110e.m23298a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo56173a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f19239a);
            if (this.f19239a) {
                jSONObject.put("skipOffset", this.f19240b);
            }
            jSONObject.put("autoPlay", this.f19241c);
            jSONObject.put("position", this.f19242d);
        } catch (JSONException e) {
            C8108c.m23293a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f19242d;
    }

    public Float getSkipOffset() {
        return this.f19240b;
    }

    public boolean isAutoPlay() {
        return this.f19241c;
    }

    public boolean isSkippable() {
        return this.f19239a;
    }
}
