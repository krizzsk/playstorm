package com.iab.omid.library.smaato.adsession.media;

import com.iab.omid.library.smaato.p277d.C8058c;
import com.iab.omid.library.smaato.p277d.C8060e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19126a;

    /* renamed from: b */
    private final Float f19127b;

    /* renamed from: c */
    private final boolean f19128c;

    /* renamed from: d */
    private final Position f19129d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f19126a = z;
        this.f19127b = f;
        this.f19128c = z2;
        this.f19129d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C8060e.m23074a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C8060e.m23074a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo55979a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f19126a);
            if (this.f19126a) {
                jSONObject.put("skipOffset", this.f19127b);
            }
            jSONObject.put("autoPlay", this.f19128c);
            jSONObject.put("position", this.f19129d);
        } catch (JSONException e) {
            C8058c.m23069a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f19129d;
    }

    public Float getSkipOffset() {
        return this.f19127b;
    }

    public boolean isAutoPlay() {
        return this.f19128c;
    }

    public boolean isSkippable() {
        return this.f19126a;
    }
}
