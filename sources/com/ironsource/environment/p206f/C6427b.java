package com.ironsource.environment.p206f;

import com.ironsource.environment.p203c.C6412b;
import com.ironsource.environment.p206f.C6425a;
import com.ironsource.mediationsdk.C6711o;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo75040bv = {1, 0, 3}, mo75041d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0007J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000f"}, mo75042d2 = {"Lcom/ironsource/environment/token/TokenProvider;", "", "()V", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "mTokenKeyList", "", "", "[Ljava/lang/String;", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getToken", "context", "Landroid/content/Context;", "environment_release"}, mo75043k = 1, mo75044mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.f.b */
public final class C6427b {

    /* renamed from: a */
    public final String[] f16335a = C6425a.f16334b;

    /* renamed from: b */
    private final C6711o f16336b = new C6711o();

    public C6427b() {
        C6425a.C6426a aVar = C6425a.f16333a;
    }

    /* renamed from: a */
    public static JSONObject m19289a(JSONObject jSONObject) {
        JSONObject a = C6412b.m19258a(jSONObject.optJSONObject("md"));
        if (a != null) {
            jSONObject.put("md", a);
        }
        return jSONObject;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use the new method getToken(context: Context)")
    /* renamed from: a */
    public final JSONObject mo35937a() {
        JSONObject a = C6711o.m20430a(this.f16335a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return m19289a(a);
    }
}
