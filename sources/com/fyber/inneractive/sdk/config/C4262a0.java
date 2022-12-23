package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5355m0;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a0 */
public class C4262a0 implements C4267b0, C5355m0.C5356a {

    /* renamed from: a */
    public Boolean f10570a;

    /* renamed from: b */
    public Integer f10571b = 5000;

    /* renamed from: c */
    public Integer f10572c = 0;

    /* renamed from: d */
    public Boolean f10573d;

    /* renamed from: e */
    public Orientation f10574e;

    /* renamed from: f */
    public Integer f10575f;

    /* renamed from: g */
    public Integer f10576g;

    /* renamed from: h */
    public Skip f10577h;

    /* renamed from: i */
    public TapAction f10578i;

    /* renamed from: j */
    public UnitDisplayType f10579j;

    /* renamed from: k */
    public List<Integer> f10580k;

    public C4262a0() {
        Boolean bool = Boolean.TRUE;
        this.f10570a = bool;
        this.f10573d = bool;
        this.f10575f = 0;
        this.f10576g = 2048;
        this.f10577h = Skip.fromValue(0);
        this.f10580k = new ArrayList();
    }

    /* renamed from: a */
    public JSONObject mo24263a() {
        JSONObject jSONObject = new JSONObject();
        C5355m0.m16771a(jSONObject, "autoPlay", this.f10570a);
        C5355m0.m16771a(jSONObject, MediaFile.MAX_BITRATE, this.f10571b);
        C5355m0.m16771a(jSONObject, MediaFile.MIN_BITRATE, this.f10572c);
        C5355m0.m16771a(jSONObject, "muted", this.f10573d);
        C5355m0.m16771a(jSONObject, "orientation", this.f10574e);
        C5355m0.m16771a(jSONObject, "padding", this.f10575f);
        C5355m0.m16771a(jSONObject, "pivotBitrate", this.f10576g);
        C5355m0.m16771a(jSONObject, "skip", this.f10577h);
        C5355m0.m16771a(jSONObject, "tapAction", this.f10578i);
        C5355m0.m16771a(jSONObject, "unitDisplayType", this.f10579j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f10580k;
        if (list != null) {
            for (Integer next : list) {
                if (next != null) {
                    jSONArray.put(next);
                }
            }
        }
        C5355m0.m16771a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }

    /* renamed from: b */
    public Boolean mo24264b() {
        return this.f10570a;
    }
}
