package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.p253d.C7857c;
import com.iab.omid.library.inmobi.p253d.C7859e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18661a;

    /* renamed from: b */
    private final Float f18662b;

    /* renamed from: c */
    private final boolean f18663c;

    /* renamed from: d */
    private final Position f18664d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18661a = z;
        this.f18662b = f;
        this.f18663c = z2;
        this.f18664d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7859e.m22170a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7859e.m22170a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo55186a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18661a);
            if (this.f18661a) {
                jSONObject.put("skipOffset", this.f18662b);
            }
            jSONObject.put("autoPlay", this.f18663c);
            jSONObject.put("position", this.f18664d);
        } catch (JSONException e) {
            C7857c.m22165a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18664d;
    }

    public Float getSkipOffset() {
        return this.f18662b;
    }

    public boolean isAutoPlay() {
        return this.f18663c;
    }

    public boolean isSkippable() {
        return this.f18661a;
    }
}
