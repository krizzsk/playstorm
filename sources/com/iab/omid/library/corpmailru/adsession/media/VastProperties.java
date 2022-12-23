package com.iab.omid.library.corpmailru.adsession.media;

import com.iab.omid.library.corpmailru.p241d.C7755c;
import com.iab.omid.library.corpmailru.p241d.C7757e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18431a;

    /* renamed from: b */
    private final Float f18432b;

    /* renamed from: c */
    private final boolean f18433c;

    /* renamed from: d */
    private final Position f18434d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18431a = z;
        this.f18432b = f;
        this.f18433c = z2;
        this.f18434d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7757e.m21716a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7757e.m21716a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54793a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18431a);
            if (this.f18431a) {
                jSONObject.put("skipOffset", this.f18432b);
            }
            jSONObject.put("autoPlay", this.f18433c);
            jSONObject.put("position", this.f18434d);
        } catch (JSONException e) {
            C7755c.m21711a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18434d;
    }

    public Float getSkipOffset() {
        return this.f18432b;
    }

    public boolean isAutoPlay() {
        return this.f18433c;
    }

    public boolean isSkippable() {
        return this.f18431a;
    }
}
