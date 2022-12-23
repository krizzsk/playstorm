package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.p259d.C7907c;
import com.iab.omid.library.ironsrc.p259d.C7909e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18774a;

    /* renamed from: b */
    private final Float f18775b;

    /* renamed from: c */
    private final boolean f18776c;

    /* renamed from: d */
    private final Position f18777d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18774a = z;
        this.f18775b = f;
        this.f18776c = z2;
        this.f18777d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7909e.m22391a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7909e.m22391a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject mo55380a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18774a);
            if (this.f18774a) {
                jSONObject.put("skipOffset", this.f18775b);
            }
            jSONObject.put("autoPlay", this.f18776c);
            jSONObject.put("position", this.f18777d);
        } catch (JSONException e) {
            C7907c.m22386a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f18777d;
    }

    public final Float getSkipOffset() {
        return this.f18775b;
    }

    public final boolean isAutoPlay() {
        return this.f18776c;
    }

    public final boolean isSkippable() {
        return this.f18774a;
    }
}
