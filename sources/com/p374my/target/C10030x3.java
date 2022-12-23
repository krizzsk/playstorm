package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.common.models.ImageData;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.x3 */
public class C10030x3 {

    /* renamed from: a */
    public final C9915q1 f24889a;

    /* renamed from: b */
    public final C9596a f24890b;

    /* renamed from: c */
    public final Context f24891c;

    /* renamed from: d */
    public boolean f24892d = true;

    public C10030x3(C9915q1 q1Var, C9596a aVar, Context context) {
        this.f24889a = q1Var;
        this.f24890b = aVar;
        this.f24891c = context;
    }

    /* renamed from: a */
    public static C10030x3 m29695a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C10030x3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final ImageData mo65701a(JSONObject jSONObject, String str) {
        String str2;
        String optString = jSONObject.optString("imageLink");
        if (TextUtils.isEmpty(optString)) {
            str2 = "InterstitialAdImageBanner no imageLink for image";
        } else {
            int optInt = jSONObject.optInt("width");
            int optInt2 = jSONObject.optInt("height");
            if (optInt > 0 && optInt2 > 0) {
                return ImageData.newImageData(optString, optInt, optInt2);
            }
            str2 = "InterstitialAdImageBanner  image has wrong dimensions, w = " + optInt + ", h = " + optInt2;
        }
        mo65702a(str2, "Required field", str);
        return null;
    }

    /* renamed from: a */
    public final void mo65702a(String str, String str2, String str3) {
        if (this.f24892d) {
            String str4 = this.f24889a.f24531a;
            C9796k3 c = C9796k3.m28465a(str2).mo64580d(str).mo64575a(this.f24890b.getSlotId()).mo64579c(str3);
            if (str4 == null) {
                str4 = this.f24889a.f24532b;
            }
            c.mo64577b(str4).mo64578b(this.f24891c);
        }
    }

    /* renamed from: a */
    public boolean mo65703a(JSONObject jSONObject, C9675e2 e2Var) {
        ImageData a;
        ImageData a2;
        this.f24892d = e2Var.isLogErrors();
        JSONArray optJSONArray = jSONObject.optJSONArray("portrait");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("landscape");
        if ((optJSONArray == null || optJSONArray.length() <= 0) && (optJSONArray2 == null || optJSONArray2.length() <= 0)) {
            mo65702a("No images in InterstitialAdImageBanner", "Required field", e2Var.getId());
            return false;
        }
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (a2 = mo65701a(optJSONObject, e2Var.getId())) == null)) {
                    e2Var.addPortraitImage(a2);
                }
            }
        }
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (!(optJSONObject2 == null || (a = mo65701a(optJSONObject2, e2Var.getId())) == null)) {
                    e2Var.addLandscapeImage(a);
                }
            }
        }
        return !e2Var.getLandscapeImages().isEmpty() || !e2Var.getPortraitImages().isEmpty();
    }
}
