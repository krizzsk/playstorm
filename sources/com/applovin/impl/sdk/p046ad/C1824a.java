package com.applovin.impl.sdk.p046ad;

import android.net.Uri;
import com.applovin.impl.adview.C1525i;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p045a.C1798c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.a */
public final class C1824a extends C1829e {

    /* renamed from: a */
    private final String f2917a = mo12621b();

    /* renamed from: b */
    private final String f2918b = mo13918i();

    /* renamed from: c */
    private final String f2919c = m3819aM();

    /* renamed from: d */
    private final C1798c f2920d = new C1798c(this);

    public C1824a(JSONObject jSONObject, JSONObject jSONObject2, C1825b bVar, C1959m mVar) {
        super(jSONObject, jSONObject2, bVar, mVar);
    }

    /* renamed from: aM */
    private String m3819aM() {
        return getStringFromAdObject("stream_url", "");
    }

    /* renamed from: a */
    public void mo12611a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, TJAdUnitConstants.String.HTML, this.f2917a);
            JsonUtils.putString(this.adObject, "stream_url", this.f2919c);
        }
    }

    /* renamed from: a */
    public void mo13914a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    /* renamed from: a */
    public void mo13915a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, TJAdUnitConstants.String.HTML, str);
        }
    }

    /* renamed from: b */
    public String mo12621b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, TJAdUnitConstants.String.HTML, "");
        }
        return string;
    }

    /* renamed from: c */
    public C1798c mo12640o() {
        return this.f2920d;
    }

    /* renamed from: d */
    public String mo12623d() {
        return this.f2918b;
    }

    /* renamed from: e */
    public String mo13916e() {
        return this.f2919c;
    }

    /* renamed from: f */
    public boolean mo12626f() {
        return this.adObject.has("stream_url");
    }

    /* renamed from: g */
    public void mo13917g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, CampaignUnit.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, TJAdUnitConstants.String.HTML, this.f2917a);
            JsonUtils.putString(jSONObject, "video", this.f2918b);
            JsonUtils.putString(jSONObject, "stream_url", this.f2919c);
        }
        return deepCopy;
    }

    /* renamed from: h */
    public Uri mo12630h() {
        String aM = m3819aM();
        if (StringUtils.isValidString(aM)) {
            return Uri.parse(aM);
        }
        String i = mo13918i();
        if (StringUtils.isValidString(i)) {
            return Uri.parse(i);
        }
        return null;
    }

    public boolean hasVideoUrl() {
        return mo12630h() != null;
    }

    /* renamed from: i */
    public String mo13918i() {
        return getStringFromAdObject("video", "");
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", false);
    }

    /* renamed from: j */
    public Uri mo12635j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: k */
    public Uri mo12636k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : mo12635j();
    }

    /* renamed from: l */
    public float mo13919l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    /* renamed from: m */
    public boolean mo13920m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", false);
        }
        return true;
    }

    /* renamed from: n */
    public C1525i.C1526a mo13921n() {
        return mo13964a(getIntFromAdObject("expandable_style", C1525i.C1526a.INVISIBLE.mo12963a()));
    }
}
