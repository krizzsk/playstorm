package com.mbridge.msdk.videocommon.p372c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8493c;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.videocommon.p373d.C9548a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.c.a */
/* compiled from: RewardSettingController */
public class C9542a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f23391a = C9542a.class.getName();

    /* renamed from: a */
    public final void mo63102a(final Context context, final String str, String str2) {
        C8494d dVar = new C8494d();
        dVar.mo57606a("app_id", str);
        dVar.mo57606a("sign", SameMD5.getMD5(str + str2));
        new C9546b(context).mo57600a(1, C8487d.m24492a().f20548r, dVar, (C8476e) new C8493c() {
            /* renamed from: a */
            public final void mo15582a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    try {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        C9549b.m27299a();
                        String str = str;
                        String jSONObject2 = jSONObject.toString();
                        C2338a.m5535a().mo15733a("reward_" + str, jSONObject2);
                        C9549b.f23411a = C9548a.m27280a(jSONObject2);
                    } catch (JSONException e) {
                        C9549b.m27299a().mo63128a(false);
                        C8608u.m24884d(C9542a.f23391a, e.getMessage());
                    }
                    try {
                        new C8526d(context).mo57688a(1, C8487d.m24492a().f20539i, "", C8487d.m24492a().f20538h ? C8487d.m24492a().f20553w : C8487d.m24492a().f20548r);
                    } catch (Throwable th) {
                        C8608u.m24884d(C9542a.f23391a, th.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo15581a(String str) {
                C9549b.m27299a().mo63128a(false);
                C8608u.m24884d(C9542a.f23391a, str);
                try {
                    new C8526d(context).mo57688a(2, C8487d.m24492a().f20539i, str, C8487d.m24492a().f20538h ? C8487d.m24492a().f20553w : C8487d.m24492a().f20548r);
                } catch (Throwable th) {
                    C8608u.m24884d(C9542a.f23391a, th.getMessage());
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo63103a(final Context context, final String str, String str2, String str3, final C9547c cVar) {
        C8494d dVar = new C8494d();
        dVar.mo57606a("app_id", str);
        dVar.mo57606a("sign", SameMD5.getMD5(str + str2));
        dVar.mo57606a("unit_ids", "[" + str3 + "]");
        C95442 r5 = new C8493c() {
            /* renamed from: a */
            public final void mo15582a(final JSONObject jSONObject) {
                if (jSONObject != null) {
                    try {
                        if (C9549b.m27303b(jSONObject.toString())) {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            C95451 r0 = new Runnable() {
                                public final void run() {
                                    C9549b.m27299a().mo63126a(str, C95442.this.f20497d, jSONObject.toString());
                                }
                            };
                            if (C2358b.m5644a().mo15829d()) {
                                C8442b.m24388a().execute(r0);
                            } else {
                                r0.run();
                            }
                            if (cVar != null) {
                                cVar.mo60915a("request success");
                            }
                        } else if (cVar != null) {
                            cVar.mo60916b("data error");
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    try {
                        new C8526d(context).mo57688a(1, C8487d.m24492a().f20539i, "", C8487d.m24492a().f20538h ? C8487d.m24492a().f20553w : C8487d.m24492a().f20548r);
                    } catch (Throwable th) {
                        C8608u.m24884d(C9542a.f23391a, th.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo15581a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    C9547c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo60916b(str);
                    }
                } else {
                    C9547c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.mo60916b("request error");
                    }
                }
                try {
                    new C8526d(context).mo57688a(2, C8487d.m24492a().f20539i, str, C8487d.m24492a().f20538h ? C8487d.m24492a().f20553w : C8487d.m24492a().f20548r);
                } catch (Throwable th) {
                    C8608u.m24884d(C9542a.f23391a, th.getMessage());
                }
            }
        };
        r5.f20497d = str3;
        new C9546b(context).mo57600a(1, C8487d.m24492a().f20548r, dVar, (C8476e) r5);
    }
}
