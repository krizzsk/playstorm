package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.w3 */
public class C10017w3 {

    /* renamed from: a */
    public final C9915q1 f24859a;

    /* renamed from: b */
    public final C9596a f24860b;

    /* renamed from: c */
    public final Context f24861c;

    /* renamed from: d */
    public final C9946s3 f24862d;

    /* renamed from: e */
    public boolean f24863e = true;

    public C10017w3(C9915q1 q1Var, C9596a aVar, Context context) {
        this.f24859a = q1Var;
        this.f24860b = aVar;
        this.f24861c = context;
        this.f24862d = C9946s3.m29202a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C10017w3 m29637a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C10017w3(q1Var, aVar, context);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p374my.target.C9625b2 mo65667a(org.json.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.optString(r0, r1)
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1396342996: goto L_0x0037;
                case 3213227: goto L_0x002c;
                case 106940687: goto L_0x0021;
                case 110066619: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0042
        L_0x0016:
            java.lang.String r1 = "fullscreen"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001f
            goto L_0x0042
        L_0x001f:
            r0 = r2
            goto L_0x0043
        L_0x0021:
            java.lang.String r1 = "promo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            goto L_0x0042
        L_0x002a:
            r0 = r3
            goto L_0x0043
        L_0x002c:
            java.lang.String r1 = "html"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0035
            goto L_0x0042
        L_0x0035:
            r0 = r4
            goto L_0x0043
        L_0x0037:
            java.lang.String r1 = "banner"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0062
            if (r0 == r4) goto L_0x0057
            if (r0 == r3) goto L_0x004c
            if (r0 == r2) goto L_0x0062
            goto L_0x006d
        L_0x004c:
            com.my.target.f2 r0 = com.p374my.target.C9697f2.newBanner()
            boolean r6 = r5.mo65673a((org.json.JSONObject) r6, (com.p374my.target.C9697f2) r0, (java.lang.String) r7)
            if (r6 == 0) goto L_0x006d
            return r0
        L_0x0057:
            com.my.target.d2 r0 = com.p374my.target.C9657d2.newBanner()
            boolean r6 = r5.mo65671a((org.json.JSONObject) r6, (com.p374my.target.C9657d2) r0, (java.lang.String) r7)
            if (r6 == 0) goto L_0x006d
            return r0
        L_0x0062:
            com.my.target.e2 r7 = com.p374my.target.C9675e2.newBanner()
            boolean r6 = r5.mo65672a((org.json.JSONObject) r6, (com.p374my.target.C9675e2) r7)
            if (r6 == 0) goto L_0x006d
            return r7
        L_0x006d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10017w3.mo65667a(org.json.JSONObject, java.lang.String):com.my.target.b2");
    }

    /* renamed from: a */
    public final void mo65668a(String str, String str2, String str3) {
        if (this.f24863e) {
            String str4 = this.f24859a.f24531a;
            C9796k3 c = C9796k3.m28465a(str).mo64580d(str2).mo64575a(this.f24860b.getSlotId()).mo64579c(str3);
            if (str4 == null) {
                str4 = this.f24859a.f24532b;
            }
            c.mo64577b(str4).mo64578b(this.f24861c);
        }
    }

    /* renamed from: a */
    public final void mo65669a(JSONObject jSONObject, C9625b2 b2Var) {
        this.f24862d.mo65361a(jSONObject, (C10066z1) b2Var);
        this.f24863e = b2Var.isLogErrors();
        b2Var.setAllowBackButton(jSONObject.optBoolean("allowBackButton", b2Var.isAllowBackButton()));
        b2Var.setAllowCloseDelay((float) jSONObject.optDouble("allowCloseDelay", (double) b2Var.getAllowCloseDelay()));
        String optString = jSONObject.optString("close_icon_hd");
        if (!TextUtils.isEmpty(optString)) {
            b2Var.setCloseIcon(ImageData.newImageData(optString));
        }
    }

    /* renamed from: a */
    public final void mo65670a(JSONObject jSONObject, C9996v1 v1Var) {
        v1Var.mo65587c(C10046y3.m29764a(jSONObject, "ctaButtonColor", v1Var.mo65588d()));
        v1Var.mo65591e(C10046y3.m29764a(jSONObject, "ctaButtonTouchColor", v1Var.mo65592f()));
        v1Var.mo65589d(C10046y3.m29764a(jSONObject, "ctaButtonTextColor", v1Var.mo65590e()));
        v1Var.mo65582a(C10046y3.m29764a(jSONObject, "backgroundColor", v1Var.mo65580a()));
        v1Var.mo65597h(C10046y3.m29764a(jSONObject, "textColor", v1Var.mo65600j()));
        v1Var.mo65599i(C10046y3.m29764a(jSONObject, "titleTextColor", v1Var.mo65600j()));
        v1Var.mo65593f(C10046y3.m29764a(jSONObject, "domainTextColor", v1Var.mo65594g()));
        v1Var.mo65595g(C10046y3.m29764a(jSONObject, "progressBarColor", v1Var.mo65596h()));
        v1Var.mo65585b(C10046y3.m29764a(jSONObject, "barColor", v1Var.mo65584b()));
        float optDouble = (float) jSONObject.optDouble("barOverlayAlpha", (double) v1Var.mo65586c());
        if (0.0f <= optDouble && optDouble <= 1.0f) {
            v1Var.mo65581a(optDouble);
        }
        String optString = jSONObject.optString("storeIcon");
        if (!TextUtils.isEmpty(optString)) {
            v1Var.mo65583a(ImageData.newImageData(optString));
        }
    }

    /* renamed from: a */
    public boolean mo65671a(JSONObject jSONObject, C9657d2 d2Var, String str) {
        String a;
        mo65669a(jSONObject, (C9625b2) d2Var);
        String c = C9946s3.m29204c(jSONObject);
        if (TextUtils.isEmpty(c)) {
            mo65668a("Required field", "Banner with type 'html' has no source field", d2Var.getId());
            return false;
        }
        if (!TextUtils.isEmpty(str) && (a = C9946s3.m29203a(str, c)) != null) {
            d2Var.setType(CampaignEx.JSON_KEY_MRAID);
            c = a;
        }
        if (d2Var.getOmData() != null) {
            c = C9897p3.m28963a(c);
        }
        d2Var.setSource(c);
        d2Var.setTimeToReward((float) jSONObject.optDouble("timeToReward", (double) d2Var.getTimeToReward()));
        return true;
    }

    /* renamed from: a */
    public boolean mo65672a(JSONObject jSONObject, C9675e2 e2Var) {
        mo65669a(jSONObject, (C9625b2) e2Var);
        return C10030x3.m29695a(this.f24859a, this.f24860b, this.f24861c).mo65703a(jSONObject, e2Var);
    }

    /* renamed from: a */
    public boolean mo65673a(JSONObject jSONObject, C9697f2 f2Var, String str) {
        JSONObject optJSONObject;
        C9640c2 b;
        mo65669a(jSONObject, (C9625b2) f2Var);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("styleSettings");
        if (optJSONObject2 != null) {
            mo65670a(optJSONObject2, f2Var.getPromoStyleSettings());
        }
        f2Var.setStyle(jSONObject.optInt("style", f2Var.getStyle()));
        f2Var.setCloseOnClick(jSONObject.optBoolean("closeOnClick", f2Var.isCloseOnClick()));
        f2Var.setVideoRequired(jSONObject.optBoolean("videoRequired", f2Var.isVideoRequired()));
        JSONArray optJSONArray = jSONObject.optJSONArray("cards");
        if (optJSONArray != null && C10059y8.m29846d()) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (!(optJSONObject3 == null || (b = mo65674b(optJSONObject3, f2Var)) == null)) {
                    f2Var.addInterstitialAdCard(b);
                }
            }
        }
        if (f2Var.getInterstitialAdCards().isEmpty() && (optJSONObject = jSONObject.optJSONObject("video")) != null) {
            C9711g2<VideoData> newVideoBanner = C9711g2.newVideoBanner();
            newVideoBanner.setId(f2Var.getId());
            newVideoBanner.setLogErrors(f2Var.isLogErrors());
            if (C9964t3.m29329a(this.f24859a, this.f24860b, this.f24861c).mo65452c(optJSONObject, newVideoBanner)) {
                f2Var.setVideoBanner(newVideoBanner);
                if (newVideoBanner.isAutoPlay()) {
                    f2Var.setAllowClose(newVideoBanner.isAllowClose());
                    f2Var.setAllowCloseDelay(newVideoBanner.getAllowCloseDelay());
                }
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
            if (optJSONObject4 != null) {
                C9625b2 a = mo65667a(optJSONObject4, str);
                if (a != null && a.getId().length() == 0) {
                    a.setId(f2Var.getId());
                }
                f2Var.setEndCard(a);
            }
        }
        String optString = jSONObject.optString("adIconLink");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        f2Var.setAdIcon(ImageData.newImageData(optString));
        f2Var.setAdIconClickLink(jSONObject.optString("adIconClickLink"));
        return true;
    }

    /* renamed from: b */
    public C9640c2 mo65674b(JSONObject jSONObject, C9625b2 b2Var) {
        String id;
        String str;
        C9640c2 newCard = C9640c2.newCard(b2Var);
        newCard.setClickArea(b2Var.getClickArea());
        this.f24862d.mo65361a(jSONObject, (C10066z1) newCard);
        if (!jSONObject.has("title")) {
            newCard.setImageOnly(true);
        }
        if (TextUtils.isEmpty(newCard.getTrackingLink())) {
            id = b2Var.getId();
            str = "no tracking link in interstitialAdCard";
        } else if (newCard.getImage() == null) {
            id = b2Var.getId();
            str = "no image in interstitialAdCard";
        } else {
            newCard.setId(jSONObject.optString("cardID", newCard.getId()));
            return newCard;
        }
        mo65668a("Required field", str, id);
        return null;
    }
}
