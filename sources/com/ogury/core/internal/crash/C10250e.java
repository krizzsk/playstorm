package com.ogury.core.internal.crash;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.ogury.core.internal.C10216af;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.C10278h;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.e */
/* compiled from: CrashFormatter.kt */
public final class C10250e {

    /* renamed from: a */
    private final SdkInfo f26035a;

    static {
        new C10251a((byte) 0);
    }

    public C10250e(SdkInfo sdkInfo) {
        C10219ai.m31036b(sdkInfo, "sdkInfo");
        this.f26035a = sdkInfo;
    }

    /* renamed from: com.ogury.core.internal.crash.e$a */
    /* compiled from: CrashFormatter.kt */
    public static final class C10251a {
        private C10251a() {
        }

        public /* synthetic */ C10251a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final JSONObject mo66817a(C10243a aVar, C10267o oVar, Throwable th, String str) {
        String str2;
        C10219ai.m31036b(aVar, "appInfo");
        C10219ai.m31036b(oVar, "phoneInfo");
        C10219ai.m31036b(th, "throwable");
        C10219ai.m31036b(str, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("created_at", System.currentTimeMillis());
        jSONObject.put("sdk_version", this.f26035a.getSdkVersion());
        jSONObject.put(TapjoyConstants.TJC_API_KEY, this.f26035a.getApiKey());
        jSONObject.put("aaid", this.f26035a.getAaid());
        jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, aVar.mo66803b());
        jSONObject.put("package_version", aVar.mo66802a());
        String a = oVar.mo66838a();
        if (a.length() > 16) {
            if (a != null) {
                a = a.substring(0, 16);
                C10219ai.m31034a((Object) a, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        jSONObject.put("phone_model", a);
        jSONObject.put("android_version", oVar.mo66839b());
        jSONObject.put("exception_type", th.getClass().getCanonicalName());
        C10269p c = oVar.mo66840c();
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        sb.append(" : ");
        sb.append(th.getMessage());
        if (c.mo66844d()) {
            str2 = " : Free[" + c.mo66841a() + "] Total[" + c.mo66842b() + "] Max[" + c.mo66843c() + "]";
        } else {
            str2 = "";
        }
        sb.append(str2);
        jSONObject.put("message", sb.toString());
        jSONObject.put("stacktrace", str);
        jSONObject.put("number_of_crashes", 1);
        jSONObject.put("number_of_crashes_on_last_upload", 0);
        return jSONObject;
    }

    /* renamed from: a */
    public static String m31079a(Throwable th) {
        C10219ai.m31036b(th, "throwable");
        StackTraceElement[] stackTrace = th.getStackTrace();
        C10219ai.m31034a((Object) stackTrace, "throwable.stackTrace");
        return C10278h.m31128a((Object[]) stackTrace, (CharSequence) "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C10216af) null, 62);
    }
}
