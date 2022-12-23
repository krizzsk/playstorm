package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.p265d.C7957c;
import com.iab.omid.library.mmadbridge.p265d.C7959e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18889a;

    /* renamed from: b */
    private final Float f18890b;

    /* renamed from: c */
    private final boolean f18891c;

    /* renamed from: d */
    private final Position f18892d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18889a = z;
        this.f18890b = f;
        this.f18891c = z2;
        this.f18892d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7959e.m22619a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7959e.m22619a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo55570a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18889a);
            if (this.f18889a) {
                jSONObject.put("skipOffset", this.f18890b);
            }
            jSONObject.put("autoPlay", this.f18891c);
            jSONObject.put("position", this.f18892d);
        } catch (JSONException e) {
            C7957c.m22614a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18892d;
    }

    public Float getSkipOffset() {
        return this.f18890b;
    }

    public boolean isAutoPlay() {
        return this.f18891c;
    }

    public boolean isSkippable() {
        return this.f18889a;
    }
}
