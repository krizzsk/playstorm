package com.p374my.target;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.p374my.target.C9822l3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.x */
public class C10024x extends C9635c<C10016w2> {
    /* renamed from: a */
    public static C9635c<C10016w2> m29666a() {
        return new C10024x();
    }

    /* renamed from: a */
    public C10016w2 mo63651a(String str, C9915q1 q1Var, C10016w2 w2Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context) {
        JSONArray names;
        JSONObject a = C9635c.m27712a(str, aVar2, l3Var);
        if (a == null || (names = a.names()) == null) {
            return null;
        }
        C9642c4 a2 = C9642c4.m27750a(q1Var, aVar, context);
        boolean z = false;
        C10016w2 w2Var2 = w2Var;
        int i = 0;
        while (true) {
            if (i >= names.length()) {
                break;
            }
            String optString = names.optString(i);
            if (("appwall".equals(optString) || "showcaseApps".equals(optString) || "showcaseGames".equals(optString) || "showcase".equals(optString)) && (w2Var2 = mo65687a(optString, a, a2, q1Var, aVar, context)) != null && !w2Var2.mo65650c().isEmpty()) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return null;
        }
        w2Var2.mo65649a(q1Var.mo65289x());
        w2Var2.mo65648a(a);
        return w2Var2;
    }

    /* renamed from: a */
    public final C10016w2 mo65687a(String str, JSONObject jSONObject, C9642c4 c4Var, C9915q1 q1Var, C9596a aVar, Context context) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("banners")) == null || optJSONArray.length() <= 0) {
            return null;
        }
        C10016w2 b = C10016w2.m29614b(str);
        c4Var.mo63685a(optJSONObject, b);
        C9627b4 a = C9627b4.m27673a(b, q1Var, aVar, context);
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (optJSONObject2 != null) {
                C9795k2 newBanner = C9795k2.newBanner();
                a.mo63606a(optJSONObject2, newBanner);
                String bundleId = newBanner.getBundleId();
                if (!TextUtils.isEmpty(bundleId)) {
                    newBanner.setAppInstalled(mo65688a(context, bundleId));
                }
                b.mo65647a(newBanner);
            }
        }
        return b;
    }

    /* renamed from: a */
    public final boolean mo65688a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        List<ResolveInfo> list = null;
        try {
            list = packageManager.queryIntentActivities(launchIntentForPackage, 65536);
        } catch (Throwable unused) {
        }
        return list != null && !list.isEmpty();
    }
}
