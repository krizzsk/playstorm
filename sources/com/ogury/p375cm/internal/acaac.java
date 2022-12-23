package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import com.ogury.core.internal.InternalCore;
import com.ogury.p375cm.ConsentActivity;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acaac */
public final class acaac {

    /* renamed from: a */
    public static final aaaaa f25829a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acaac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public static String m30813a(Context context, String str) {
        Context context2 = context;
        bbabc.m30943b(context2, "context");
        bbabc.m30943b(str, "appKey");
        Context applicationContext = context.getApplicationContext();
        bbabc.m30940a((Object) applicationContext, "context.applicationContext");
        Resources resources = applicationContext.getResources();
        bbabc.m30940a((Object) resources, "context.applicationContext.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        bbabc.m30940a((Object) displayMetrics, "context.applicationConte….resources.displayMetrics");
        NetworkInfo a = ConsentActivity.aaaaa.m30517a(context);
        String typeName = a != null ? a.getTypeName() : null;
        Resources resources2 = context.getResources();
        bbabc.m30940a((Object) resources2, "context.resources");
        Context applicationContext2 = context.getApplicationContext();
        bbabc.m30940a((Object) applicationContext2, "context.applicationContext");
        String packageName = applicationContext2.getPackageName();
        bbabc.m30940a((Object) packageName, "context.applicationContext.packageName");
        String c = ConsentActivity.aaaaa.m30523c(context);
        String token = InternalCore.getToken(context2, "consent_token");
        bbabc.m30940a((Object) token, "InternalCore.getToken(context, \"consent_token\")");
        boolean z = !baaba.f25874a.isBillingDisabled();
        baabc baabc = baabc.f25899a;
        String a2 = baabc.m30898a();
        aacac aacac = aacac.f25671a;
        Boolean a3 = aacac.m30669a("IS_CHILD_UNDER_COPPA");
        aacac aacac2 = aacac.f25671a;
        String jSONObject = new acaab(displayMetrics, resources2, typeName, str, "android", packageName, "3.3.0", c, token, z, a2, a3, aacac.m30669a("IS_UNDER_AGE_OF_GDPR_CONSENT")).mo66613a().mo66609a().toString();
        bbabc.m30940a((Object) jSONObject, "requestBodyBuilder.build…serializedJson.toString()");
        return jSONObject;
    }

    /* renamed from: a */
    public static String m30814a(String str) {
        bbabc.m30943b(str, "errorMessage");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "CONSENT_ERROR");
        jSONObject.put("errorMessage", str);
        String jSONObject2 = jSONObject.toString();
        bbabc.m30940a((Object) jSONObject2, "json.toString()");
        return jSONObject2;
    }
}
