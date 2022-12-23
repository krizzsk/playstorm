package com.bytedance.sdk.openadsdk.p172h.p175c;

import android.text.TextUtils;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;
import com.bytedance.sdk.openadsdk.p130b.C3168k;
import com.bytedance.sdk.openadsdk.p172h.C3812a;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4013t;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.c.c */
/* compiled from: LogUploaderImpl */
public class C3837c implements C3835a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3836b f9940a = C3836b.m12593a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<C3840a> f9941b = Collections.synchronizedList(new LinkedList());

    /* renamed from: c */
    private final ExecutorService f9942c = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public void mo20675a() {
        this.f9942c.execute(new Runnable() {
            public void run() {
                List<C3840a> d = C3837c.this.f9940a.mo20681d();
                if (d != null) {
                    C3837c.this.f9941b.addAll(d);
                }
                C3837c.this.f9940a.mo20680c();
            }
        });
    }

    /* renamed from: a */
    public void mo20676a(C3812a aVar) {
        mo20677a(aVar, false);
    }

    /* renamed from: a */
    public void mo20677a(final C3812a aVar, final boolean z) {
        if (aVar != null && C3536e.m10968a()) {
            C4013t.m13175b(new C2955g("uploadLogEvent") {
                public void run() {
                    try {
                        C3840a aVar = new C3840a(C4002l.m13120a(), aVar.mo18671a().mo20631a());
                        if (z) {
                            C3578m.m11238e().mo18743a(aVar);
                        } else {
                            C3578m.m11237d().mo18743a(aVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo20678b() {
        ExecutorService executorService = this.f9942c;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.h.c.c$a */
    /* compiled from: LogUploaderImpl */
    public static class C3840a implements C3168k {

        /* renamed from: a */
        public final String f9947a;

        /* renamed from: b */
        public final JSONObject f9948b;

        /* renamed from: e */
        public boolean mo18658e() {
            return false;
        }

        public C3840a(String str, JSONObject jSONObject) {
            this.f9947a = str;
            this.f9948b = jSONObject;
        }

        /* renamed from: a */
        public static C3840a m12604a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("localId", (String) null);
                JSONObject optJSONObject = jSONObject.optJSONObject("event");
                if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                    return new C3840a(optString, optJSONObject);
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        /* renamed from: a */
        public String mo20684a() {
            if (TextUtils.isEmpty(this.f9947a) || this.f9948b == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.f9947a);
                jSONObject.put("event", this.f9948b);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }

        /* renamed from: d */
        public String mo18657d() {
            return this.f9947a;
        }
    }

    /* renamed from: c */
    public static C3835a m12599c() {
        return C3844e.m12614c();
    }
}
