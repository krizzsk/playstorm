package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.a4 */
public class C9602a4 {

    /* renamed from: a */
    public final C9915q1 f23614a;

    /* renamed from: b */
    public final C9596a f23615b;

    /* renamed from: c */
    public final Context f23616c;

    /* renamed from: d */
    public final C9946s3 f23617d;

    /* renamed from: e */
    public String f23618e;

    /* renamed from: f */
    public boolean f23619f = true;

    public C9602a4(C9915q1 q1Var, C9596a aVar, Context context) {
        this.f23614a = q1Var;
        this.f23615b = aVar;
        this.f23616c = context;
        this.f23617d = C9946s3.m29202a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C9602a4 m27591a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C9602a4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final void mo63452a(String str, String str2) {
        if (this.f23619f) {
            String str3 = this.f23614a.f24531a;
            C9796k3 c = C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f23615b.getSlotId()).mo64579c(this.f23618e);
            if (str3 == null) {
                str3 = this.f23614a.f24532b;
            }
            c.mo64577b(str3).mo64578b(this.f23616c);
        }
    }

    /* renamed from: a */
    public void mo63453a(JSONObject jSONObject, C9733h2 h2Var) {
        C9751i2 b;
        this.f23617d.mo65361a(jSONObject, (C10066z1) h2Var);
        this.f23619f = h2Var.isLogErrors();
        this.f23618e = h2Var.getId();
        JSONArray optJSONArray = jSONObject.optJSONArray("cards");
        if (optJSONArray == null || !C10059y8.m29846d()) {
            if (jSONObject.has("content")) {
                h2Var.setCtcText(jSONObject.optString("ctcText", h2Var.getCtcText()));
                String optString = jSONObject.optString("ctcIconLink");
                if (!TextUtils.isEmpty(optString)) {
                    h2Var.setCtcIcon(ImageData.newImageData(optString));
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("content");
                if (optJSONObject != null) {
                    h2Var.setContent(mo63455c(optJSONObject, h2Var));
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("video");
            if (optJSONObject2 != null) {
                C9711g2<VideoData> newVideoBanner = C9711g2.newVideoBanner();
                newVideoBanner.setId(h2Var.getId());
                newVideoBanner.setLogErrors(h2Var.isLogErrors());
                if (C9964t3.m29329a(this.f23614a, this.f23615b, this.f23616c).mo65452c(optJSONObject2, newVideoBanner)) {
                    h2Var.setVideoBanner(newVideoBanner);
                    return;
                }
                return;
            }
            return;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
            if (!(optJSONObject3 == null || (b = mo63454b(optJSONObject3, h2Var)) == null)) {
                h2Var.addNativeAdCard(b);
            }
        }
    }

    /* renamed from: b */
    public C9751i2 mo63454b(JSONObject jSONObject, C9733h2 h2Var) {
        String str;
        C9751i2 newCard = C9751i2.newCard(h2Var);
        this.f23617d.mo65361a(jSONObject, (C10066z1) newCard);
        if (TextUtils.isEmpty(newCard.getTrackingLink())) {
            str = "no tracking link in nativeAdCard";
        } else if (newCard.getImage() == null) {
            str = "no image in nativeAdCard";
        } else {
            newCard.setId(jSONObject.optString("cardID", newCard.getId()));
            return newCard;
        }
        mo63452a("Required field", str);
        return null;
    }

    /* renamed from: c */
    public C9777j2 mo63455c(JSONObject jSONObject, C9733h2 h2Var) {
        String optString = jSONObject.optString("type");
        if (!TJAdUnitConstants.String.HTML.equals(optString)) {
            C9672e0.m27882a("NativeAdContent banner has type " + optString);
            return null;
        }
        String c = C9946s3.m29204c(jSONObject);
        if (TextUtils.isEmpty(c)) {
            mo63452a("Required field", "NativeAdContent has no source field");
            return null;
        }
        C9777j2 newContent = C9777j2.newContent(h2Var, c);
        this.f23617d.mo65361a(jSONObject, (C10066z1) newContent);
        return newContent;
    }
}
