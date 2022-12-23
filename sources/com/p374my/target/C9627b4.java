package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p374my.target.common.models.ImageData;
import org.json.JSONObject;

/* renamed from: com.my.target.b4 */
public class C9627b4 {

    /* renamed from: a */
    public final C10016w2 f23665a;

    /* renamed from: b */
    public final C9946s3 f23666b;

    public C9627b4(C10016w2 w2Var, C9915q1 q1Var, C9596a aVar, Context context) {
        this.f23665a = w2Var;
        this.f23666b = C9946s3.m29202a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C9627b4 m27673a(C10016w2 w2Var, C9915q1 q1Var, C9596a aVar, Context context) {
        return new C9627b4(w2Var, q1Var, aVar, context);
    }

    /* renamed from: a */
    public void mo63606a(JSONObject jSONObject, C9795k2 k2Var) {
        this.f23666b.mo65361a(jSONObject, (C10066z1) k2Var);
        k2Var.setHasNotification(jSONObject.optBoolean("hasNotification", k2Var.isHasNotification()));
        k2Var.setBanner(jSONObject.optBoolean(IronSourceConstants.BANNER_AD_UNIT, k2Var.isBanner()));
        k2Var.setRequireCategoryHighlight(jSONObject.optBoolean("RequireCategoryHighlight", k2Var.isRequireCategoryHighlight()));
        k2Var.setItemHighlight(jSONObject.optBoolean("ItemHighlight", k2Var.isItemHighlight()));
        k2Var.setMain(jSONObject.optBoolean("Main", k2Var.isMain()));
        k2Var.setRequireWifi(jSONObject.optBoolean("RequireWifi", k2Var.isRequireWifi()));
        k2Var.setSubItem(jSONObject.optBoolean("subitem", k2Var.isSubItem()));
        k2Var.setBubbleId(jSONObject.optString("bubble_id", k2Var.getBubbleId()));
        k2Var.setLabelType(jSONObject.optString("labelType", k2Var.getLabelType()));
        k2Var.setStatus(jSONObject.optString("status", k2Var.getStatus()));
        k2Var.setMrgsId(jSONObject.optInt("mrgs_id"));
        k2Var.setCoins(jSONObject.optInt("coins"));
        k2Var.setCoinsIconBgColor(C10046y3.m29764a(jSONObject, "coins_icon_bgcolor", k2Var.getCoinsIconBgColor()));
        k2Var.setCoinsIconTextColor(C10046y3.m29764a(jSONObject, "coins_icon_textcolor", k2Var.getCoinsIconTextColor()));
        String optString = jSONObject.optString("icon_hd");
        if (!TextUtils.isEmpty(optString)) {
            k2Var.setIcon(ImageData.newImageData(optString));
        }
        String optString2 = jSONObject.optString("coins_icon_hd");
        if (!TextUtils.isEmpty(optString2)) {
            k2Var.setCoinsIcon(ImageData.newImageData(optString2));
        }
        String optString3 = jSONObject.optString("cross_notif_icon_hd");
        if (!TextUtils.isEmpty(optString3)) {
            k2Var.setCrossNotifIcon(ImageData.newImageData(optString3));
        }
        String d = this.f23665a.mo65652d();
        if (!TextUtils.isEmpty(d)) {
            k2Var.setBubbleIcon(ImageData.newImageData(d));
        }
        String e = this.f23665a.mo65654e();
        if (!TextUtils.isEmpty(e)) {
            k2Var.setGotoAppIcon(ImageData.newImageData(e));
        }
        String h = this.f23665a.mo65660h();
        if (!TextUtils.isEmpty(h)) {
            k2Var.setLabelIcon(ImageData.newImageData(h));
        }
        String status = k2Var.getStatus();
        if (status != null) {
            String a = this.f23665a.mo65646a(status);
            if (!TextUtils.isEmpty(a)) {
                k2Var.setStatusIcon(ImageData.newImageData(a));
            }
        }
        String g = this.f23665a.mo65658g();
        if (k2Var.isItemHighlight() && !TextUtils.isEmpty(g)) {
            k2Var.setItemHighlightIcon(ImageData.newImageData(g));
        }
    }
}
