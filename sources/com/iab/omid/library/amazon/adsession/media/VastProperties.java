package com.iab.omid.library.amazon.adsession.media;

import com.iab.omid.library.amazon.p229d.C7655c;
import com.iab.omid.library.amazon.p229d.C7657e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18198a;

    /* renamed from: b */
    private final Float f18199b;

    /* renamed from: c */
    private final boolean f18200c;

    /* renamed from: d */
    private final Position f18201d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18198a = z;
        this.f18199b = f;
        this.f18200c = z2;
        this.f18201d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7657e.m21260a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7657e.m21260a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54399a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18198a);
            if (this.f18198a) {
                jSONObject.put("skipOffset", this.f18199b);
            }
            jSONObject.put("autoPlay", this.f18200c);
            jSONObject.put("position", this.f18201d);
        } catch (JSONException e) {
            C7655c.m21255a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18201d;
    }

    public Float getSkipOffset() {
        return this.f18199b;
    }

    public boolean isAutoPlay() {
        return this.f18200c;
    }

    public boolean isSkippable() {
        return this.f18198a;
    }
}
