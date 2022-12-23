package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.j */
public class C4337j {

    /* renamed from: a */
    public Boolean f10725a;

    /* renamed from: b */
    public Integer f10726b;

    /* renamed from: c */
    public Integer f10727c;

    /* renamed from: d */
    public Skip f10728d;

    /* renamed from: e */
    public Boolean f10729e;

    /* renamed from: f */
    public TapAction f10730f;

    /* renamed from: g */
    public Orientation f10731g;

    /* renamed from: h */
    public Integer f10732h;

    /* renamed from: i */
    public Integer f10733i;

    /* renamed from: j */
    public UnitDisplayType f10734j;

    /* renamed from: k */
    public List<Integer> f10735k = new ArrayList();

    /* renamed from: a */
    public static C4337j m13564a(JSONObject jSONObject) {
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C4337j jVar = new C4337j();
        Integer valueOf = Integer.valueOf(jSONObject.optInt(MediaFile.MAX_BITRATE, Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt(MediaFile.MIN_BITRATE, Integer.MIN_VALUE));
        Integer valueOf3 = Integer.valueOf(jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE));
        Integer valueOf4 = Integer.valueOf(jSONObject.optInt("padding", Integer.MIN_VALUE));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        jVar.f10726b = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        jVar.f10727c = valueOf2;
        jVar.f10728d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        jVar.f10729e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f10725a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f10731g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f10730f = TapAction.fromValue(jSONObject.optString("tap"));
        if (valueOf3.intValue() == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        jVar.f10732h = valueOf3;
        if (valueOf4.intValue() != Integer.MIN_VALUE) {
            num = valueOf4;
        }
        jVar.f10733i = num;
        jVar.f10734j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt = optJSONArray.optInt(i, Integer.MIN_VALUE);
                if (optInt != Integer.MIN_VALUE) {
                    jVar.f10735k.add(Integer.valueOf(optInt));
                }
            }
        }
        return jVar;
    }
}
