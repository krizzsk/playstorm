package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.common.models.AudioData;
import com.p374my.target.common.models.ShareButtonData;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.smaato.sdk.video.vast.model.MediaFile;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.r3 */
public class C9931r3 {

    /* renamed from: a */
    public final C9915q1 f24598a;

    /* renamed from: b */
    public final C9596a f24599b;

    /* renamed from: c */
    public final Context f24600c;

    /* renamed from: d */
    public final C9946s3 f24601d;

    /* renamed from: e */
    public boolean f24602e = true;

    public C9931r3(C9915q1 q1Var, C9596a aVar, Context context) {
        this.f24598a = q1Var;
        this.f24599b = aVar;
        this.f24600c = context;
        this.f24601d = C9946s3.m29202a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C9931r3 m29128a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C9931r3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final C9600a2 mo65324a(JSONObject jSONObject, String str) {
        C9600a2 newBanner = C9600a2.newBanner();
        this.f24601d.mo65361a(jSONObject, (C10066z1) newBanner);
        if (newBanner.getWidth() == 0 || newBanner.getHeight() == 0) {
            mo65325a("Required field", "Unable to add companion banner with width " + newBanner.getWidth() + " and height " + newBanner.getHeight(), str);
            return null;
        }
        newBanner.setAssetWidth(jSONObject.optInt(Companion.ASSET_WIDTH));
        newBanner.setAssetHeight(jSONObject.optInt(Companion.ASSET_HEIGHT));
        newBanner.setExpandedWidth(jSONObject.optInt(Companion.EXPANDED_WIDTH));
        newBanner.setExpandedHeight(jSONObject.optInt(Companion.EXPANDED_HEIGHT));
        newBanner.setStaticResource(jSONObject.optString("staticResource"));
        newBanner.setIframeResource(jSONObject.optString("iframeResource"));
        newBanner.setHtmlResource(jSONObject.optString("htmlResource"));
        newBanner.setApiFramework(jSONObject.optString("apiFramework"));
        newBanner.setAdSlotID(jSONObject.optString(Companion.AD_SLOT_ID));
        String optString = jSONObject.optString(CompanionAds.REQUIRED);
        if (!TextUtils.isEmpty(optString)) {
            if (TtmlNode.COMBINE_ALL.equals(optString) || "any".equals(optString) || "none".equals(optString)) {
                newBanner.setRequired(optString);
            } else {
                mo65325a("Bad value", "Wrong companion required attribute:" + optString, str);
            }
        }
        return newBanner;
    }

    /* renamed from: a */
    public final void mo65325a(String str, String str2, String str3) {
        if (this.f24602e) {
            String str4 = this.f24598a.f24531a;
            C9796k3 c = C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f24599b.getSlotId()).mo64579c(str3);
            if (str4 == null) {
                str4 = this.f24598a.f24532b;
            }
            c.mo64577b(str4).mo64578b(this.f24600c);
        }
    }

    /* renamed from: a */
    public final void mo65326a(JSONObject jSONObject, C9711g2<AudioData> g2Var) {
        mo65327b(jSONObject, g2Var);
        Boolean a = this.f24598a.mo65238a();
        g2Var.setAllowClose(a != null ? a.booleanValue() : jSONObject.optBoolean("allowClose", g2Var.isAllowClose()));
        Boolean e = this.f24598a.mo65266e();
        g2Var.setAllowSeek(e != null ? e.booleanValue() : jSONObject.optBoolean("allowSeek", g2Var.isAllowSeek()));
        Boolean f = this.f24598a.mo65268f();
        g2Var.setAllowSkip(f != null ? f.booleanValue() : jSONObject.optBoolean("allowSkip", g2Var.isAllowSkip()));
        Boolean g = this.f24598a.mo65270g();
        g2Var.setAllowTrackChange(g != null ? g.booleanValue() : jSONObject.optBoolean("allowTrackChange", g2Var.isAllowTrackChange()));
        Boolean c = this.f24598a.mo65255c();
        g2Var.setAllowPause(c != null ? c.booleanValue() : jSONObject.optBoolean("hasPause", g2Var.isAllowPause()));
        Boolean d = this.f24598a.mo65262d();
        g2Var.setAllowReplay(d != null ? d.booleanValue() : jSONObject.optBoolean("allowReplay", g2Var.isAllowReplay()));
        float b = this.f24598a.mo65248b();
        if (b < 0.0f) {
            b = (float) jSONObject.optDouble("allowCloseDelay", (double) g2Var.getAllowCloseDelay());
        }
        g2Var.setAllowCloseDelay(b);
    }

    /* renamed from: b */
    public final void mo65327b(JSONObject jSONObject, C9711g2<AudioData> g2Var) {
        float s = this.f24598a.mo65284s();
        if (s < 0.0f && jSONObject.has("point")) {
            s = (float) jSONObject.optDouble("point");
            if (s < 0.0f) {
                mo65325a("Bad value", "Wrong value " + s + " for point", g2Var.getId());
            }
        }
        float t = this.f24598a.mo65285t();
        if (t < 0.0f && jSONObject.has("pointP")) {
            t = (float) jSONObject.optDouble("pointP");
            if (t < 0.0f) {
                mo65325a("Bad value", "Wrong value " + t + " for pointP", g2Var.getId());
            }
        }
        if (s < 0.0f && t < 0.0f) {
            s = -1.0f;
            t = -1.0f;
        }
        g2Var.setPoint(s);
        g2Var.setPointP(t);
    }

    /* renamed from: c */
    public boolean mo65328c(JSONObject jSONObject, C9711g2<AudioData> g2Var) {
        C9600a2 a;
        this.f24601d.mo65361a(jSONObject, (C10066z1) g2Var);
        this.f24602e = g2Var.isLogErrors();
        if (g2Var.getType().equals("statistics")) {
            mo65327b(jSONObject, g2Var);
            return true;
        }
        float optDouble = (float) jSONObject.optDouble("duration", 0.0d);
        if (optDouble <= 0.0f) {
            mo65325a("Required field", "unable to set duration " + optDouble, g2Var.getId());
            return false;
        }
        g2Var.setAutoPlay(jSONObject.optBoolean("autoplay", g2Var.isAutoPlay()));
        g2Var.setHasCtaButton(jSONObject.optBoolean("hasCtaButton", g2Var.isHasCtaButton()));
        g2Var.setAdText(jSONObject.optString("adText", g2Var.getAdText()));
        mo65326a(jSONObject, g2Var);
        JSONArray optJSONArray = jSONObject.optJSONArray("companionAds");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (a = mo65324a(optJSONObject, g2Var.getId())) == null)) {
                    g2Var.addCompanion(a);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("shareButtons");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    ShareButtonData newData = ShareButtonData.newData();
                    newData.setName(optJSONObject2.optString("name"));
                    newData.setUrl(optJSONObject2.optString("url"));
                    newData.setImageUrl(optJSONObject2.optString("imageUrl"));
                    g2Var.addShareButtonData(newData);
                }
            }
        }
        return mo65329d(jSONObject, g2Var);
    }

    /* renamed from: d */
    public final boolean mo65329d(JSONObject jSONObject, C9711g2<AudioData> g2Var) {
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            C9672e0.m27882a("mediafiles array is empty");
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("src");
                if (!TextUtils.isEmpty(optString)) {
                    AudioData newAudioData = AudioData.newAudioData(optString);
                    newAudioData.setBitrate(optJSONObject.optInt(MediaFile.BITRATE));
                    g2Var.setMediaData(newAudioData);
                    return true;
                }
                mo65325a("Bad value", "bad mediafile object, src = " + optString, g2Var.getId());
            }
        }
        return false;
    }
}
