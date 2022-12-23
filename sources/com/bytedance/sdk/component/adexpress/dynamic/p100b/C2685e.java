package com.bytedance.sdk.component.adexpress.dynamic.p100b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.e */
/* compiled from: DynamicLayoutBrick */
public class C2685e {

    /* renamed from: a */
    public static final Map<String, Integer> f5810a;

    /* renamed from: b */
    private String f5811b;

    /* renamed from: c */
    private String f5812c;

    /* renamed from: d */
    private C2686f f5813d;

    /* renamed from: e */
    private C2686f f5814e;

    /* renamed from: f */
    private String f5815f;

    static {
        HashMap hashMap = new HashMap();
        f5810a = hashMap;
        hashMap.put("root", 8);
        f5810a.put("footer", 6);
        f5810a.put("empty", 6);
        f5810a.put("title", 0);
        f5810a.put("subtitle", 0);
        f5810a.put("source", 0);
        f5810a.put("score-count", 0);
        f5810a.put("text_star", 0);
        f5810a.put("text", 0);
        f5810a.put("tag-group", 17);
        f5810a.put("app-version", 0);
        f5810a.put("development-name", 0);
        f5810a.put("privacy-detail", 23);
        f5810a.put("image", 1);
        f5810a.put("image-wide", 1);
        f5810a.put("image-square", 1);
        f5810a.put("image-long", 1);
        f5810a.put("image-splash", 1);
        f5810a.put("image-cover", 1);
        f5810a.put("app-icon", 1);
        f5810a.put("icon-download", 1);
        f5810a.put("logoad", 4);
        f5810a.put("logounion", 5);
        f5810a.put("logo-union", 9);
        f5810a.put("dislike", 3);
        f5810a.put("close", 3);
        f5810a.put("close-fill", 3);
        f5810a.put("webview-close", 22);
        f5810a.put("feedback-dislike", 12);
        f5810a.put("button", 2);
        f5810a.put("downloadWithIcon", 2);
        f5810a.put("downloadButton", 2);
        f5810a.put("fillButton", 2);
        f5810a.put("laceButton", 2);
        f5810a.put("cardButton", 2);
        f5810a.put("colourMixtureButton", 2);
        f5810a.put("arrowButton", 1);
        f5810a.put("download-progress-button", 2);
        f5810a.put("vessel", 6);
        f5810a.put("image-group", 6);
        f5810a.put("custom-component-vessel", 6);
        f5810a.put("carousel", 24);
        f5810a.put("video-hd", 7);
        f5810a.put("video", 7);
        f5810a.put("video-vd", 7);
        f5810a.put("muted", 10);
        f5810a.put("star", 11);
        f5810a.put("skip-countdowns", 19);
        f5810a.put("skip-with-countdowns-skip-btn", 21);
        f5810a.put("skip-with-countdowns-video-countdown", 13);
        f5810a.put("skip-with-countdowns-skip-countdown", 20);
        f5810a.put("skip-with-time", 14);
        f5810a.put("skip-with-time-countdown", 13);
        f5810a.put("skip-with-time-skip-btn", 15);
        f5810a.put("skip", 15);
        f5810a.put("timedown", 13);
        f5810a.put(RewardPlus.ICON, 16);
        f5810a.put("scoreCountWithIcon", 6);
        f5810a.put("split-line", 18);
        f5810a.put("creative-playable-bait", 0);
        f5810a.put("score-count-type-2", 0);
    }

    /* renamed from: a */
    public int mo16951a() {
        if (TextUtils.isEmpty(this.f5811b)) {
            return 0;
        }
        if (this.f5811b.equals("logo")) {
            String str = this.f5811b + this.f5812c;
            this.f5811b = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f5811b.contains("logounion")) {
                return 5;
            }
        }
        if (f5810a.get(this.f5811b) != null) {
            return f5810a.get(this.f5811b).intValue();
        }
        return -1;
    }

    /* renamed from: b */
    public String mo16954b() {
        return this.f5811b;
    }

    /* renamed from: a */
    public void mo16953a(String str) {
        this.f5811b = str;
    }

    /* renamed from: c */
    public String mo16957c() {
        return this.f5812c;
    }

    /* renamed from: b */
    public void mo16956b(String str) {
        this.f5812c = str;
    }

    /* renamed from: c */
    public void mo16958c(String str) {
        this.f5815f = str;
    }

    /* renamed from: d */
    public String mo16959d() {
        return this.f5815f;
    }

    /* renamed from: e */
    public C2686f mo16960e() {
        return this.f5813d;
    }

    /* renamed from: a */
    public void mo16952a(C2686f fVar) {
        this.f5813d = fVar;
    }

    /* renamed from: b */
    public void mo16955b(C2686f fVar) {
        this.f5814e = fVar;
    }

    /* renamed from: f */
    public C2686f mo16961f() {
        return this.f5814e;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.f5811b + '\'' + ", data='" + this.f5812c + '\'' + ", value=" + this.f5813d + ", themeValue=" + this.f5814e + ", dataExtraInfo='" + this.f5815f + '\'' + '}';
    }

    /* renamed from: a */
    public static void m7037a(JSONObject jSONObject, C2685e eVar) {
        if (jSONObject != null && eVar != null) {
            eVar.mo16953a(jSONObject.optString("type", "root"));
            eVar.mo16956b(jSONObject.optString("data"));
            eVar.mo16958c(jSONObject.optString("dataExtraInfo"));
            C2686f c = C2686f.m7050c(jSONObject.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES));
            C2686f c2 = C2686f.m7050c(jSONObject.optJSONObject("nightThemeValues"));
            eVar.mo16952a(c);
            eVar.mo16955b(c2);
        }
    }
}
