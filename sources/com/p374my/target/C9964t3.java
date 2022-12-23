package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.t3 */
public class C9964t3 {

    /* renamed from: a */
    public final C9915q1 f24661a;

    /* renamed from: b */
    public final C9596a f24662b;

    /* renamed from: c */
    public final Context f24663c;

    /* renamed from: d */
    public final C9946s3 f24664d;

    /* renamed from: e */
    public String f24665e;

    /* renamed from: f */
    public boolean f24666f = true;

    public C9964t3(C9915q1 q1Var, C9596a aVar, Context context) {
        this.f24661a = q1Var;
        this.f24662b = aVar;
        this.f24663c = context;
        this.f24664d = C9946s3.m29202a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C9964t3 m29329a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C9964t3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final VideoData mo65448a(JSONObject jSONObject) {
        String optString = jSONObject.optString("src");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        if (TextUtils.isEmpty(optString) || optInt <= 0 || optInt2 <= 0) {
            mo65449a("Bad value", "bad mediafile object, src = " + optString + ", width = " + optInt + ", height = " + optInt2);
            return null;
        }
        VideoData newVideoData = VideoData.newVideoData(optString, optInt, optInt2);
        newVideoData.setBitrate(jSONObject.optInt(MediaFile.BITRATE));
        if (!newVideoData.getUrl().endsWith(VideoData.M3U8) || C9864n8.m28847b()) {
            return newVideoData;
        }
        C9672e0.m27882a("HLS Video does not supported, add com.google.android.exoplayer:exoplayer-hls dependency to play HLS video ");
        return null;
    }

    /* renamed from: a */
    public final void mo65449a(String str, String str2) {
        if (this.f24666f) {
            String str3 = this.f24661a.f24531a;
            C9796k3 c = C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f24662b.getSlotId()).mo64579c(this.f24665e);
            if (str3 == null) {
                str3 = this.f24661a.f24532b;
            }
            c.mo64577b(str3).mo64578b(this.f24663c);
        }
    }

    /* renamed from: a */
    public final void mo65450a(JSONObject jSONObject, C9711g2<VideoData> g2Var) {
        mo65451b(jSONObject, g2Var);
        Boolean a = this.f24661a.mo65238a();
        g2Var.setAllowClose(a != null ? a.booleanValue() : jSONObject.optBoolean("allowClose", g2Var.isAllowClose()));
        Boolean c = this.f24661a.mo65255c();
        g2Var.setAllowPause(c != null ? c.booleanValue() : jSONObject.optBoolean("hasPause", g2Var.isAllowPause()));
        Boolean d = this.f24661a.mo65262d();
        g2Var.setAllowReplay(d != null ? d.booleanValue() : jSONObject.optBoolean("allowReplay", g2Var.isAllowReplay()));
        float b = this.f24661a.mo65248b();
        if (b < 0.0f) {
            b = (float) jSONObject.optDouble("allowCloseDelay", (double) g2Var.getAllowCloseDelay());
        }
        g2Var.setAllowCloseDelay(b);
    }

    /* renamed from: b */
    public final void mo65451b(JSONObject jSONObject, C9711g2<VideoData> g2Var) {
        float s = this.f24661a.mo65284s();
        if (s < 0.0f && jSONObject.has("point")) {
            s = (float) jSONObject.optDouble("point");
            if (s < 0.0f) {
                mo65449a("Bad value", "Wrong value " + s + " for point");
            }
        }
        float t = this.f24661a.mo65285t();
        if (t < 0.0f && jSONObject.has("pointP")) {
            t = (float) jSONObject.optDouble("pointP");
            if (t < 0.0f) {
                mo65449a("Bad value", "Wrong value " + t + " for pointP");
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
    public boolean mo65452c(JSONObject jSONObject, C9711g2<VideoData> g2Var) {
        VideoData chooseBest;
        VideoData a;
        this.f24664d.mo65361a(jSONObject, (C10066z1) g2Var);
        this.f24666f = g2Var.isLogErrors();
        if ("statistics".equals(g2Var.getType())) {
            mo65451b(jSONObject, g2Var);
            return true;
        }
        this.f24665e = g2Var.getId();
        float duration = g2Var.getDuration();
        if (duration <= 0.0f) {
            mo65449a("Bad value", "wrong videoBanner duration " + duration);
            return false;
        }
        g2Var.setCloseActionText(jSONObject.optString("closeActionText", "Close"));
        g2Var.setReplayActionText(jSONObject.optString("replayActionText", g2Var.getReplayActionText()));
        g2Var.setCloseDelayActionText(jSONObject.optString("closeDelayActionText", g2Var.getCloseDelayActionText()));
        g2Var.setAutoMute(jSONObject.optBoolean("automute", g2Var.isAutoMute()));
        g2Var.setShowPlayerControls(jSONObject.optBoolean("showPlayerControls", g2Var.isShowPlayerControls()));
        g2Var.setAutoPlay(jSONObject.optBoolean("autoplay", g2Var.isAutoPlay()));
        g2Var.setHasCtaButton(jSONObject.optBoolean("hasCtaButton", g2Var.isHasCtaButton()));
        mo65450a(jSONObject, g2Var);
        String optString = jSONObject.optString("previewLink");
        if (!TextUtils.isEmpty(optString)) {
            g2Var.setPreview(ImageData.newImageData(optString, jSONObject.optInt("previewWidth"), jSONObject.optInt("previewHeight")));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            C9672e0.m27882a("mediafiles array is empty");
            mo65449a("Required field", "unable to find mediaFiles in MediaBanner");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (a = mo65448a(optJSONObject)) == null)) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() <= 0 || (chooseBest = VideoData.chooseBest(arrayList, this.f24662b.getVideoQuality())) == null) {
            return false;
        }
        g2Var.setMediaData(chooseBest);
        return true;
    }
}
