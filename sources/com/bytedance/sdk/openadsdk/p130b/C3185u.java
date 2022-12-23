package com.bytedance.sdk.openadsdk.p130b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p097d.C2650e;
import com.bytedance.sdk.component.utils.C2968h;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.u */
/* compiled from: WebviewTimeTrack */
public class C3185u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f7546a = "embeded_ad";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3498n f7547b;

    /* renamed from: c */
    private Boolean f7548c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Boolean f7549d = false;

    /* renamed from: e */
    private Boolean f7550e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public JSONObject f7551f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public JSONArray f7552g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public JSONArray f7553h;

    protected C3185u() {
    }

    public C3185u(int i, String str, C3498n nVar) {
        this.f7546a = str;
        this.f7547b = nVar;
        this.f7551f = new JSONObject();
        this.f7552g = new JSONArray();
        this.f7553h = new JSONArray();
        m9345a(this.f7551f, "webview_source", (Object) Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9344a(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && jSONArray.length() < 10) {
            try {
                jSONArray.put(obj);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9345a(JSONObject jSONObject, String str, Object obj) {
        m9346a(jSONObject, str, obj, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9346a(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            if (!z) {
                try {
                    if (jSONObject.has(str)) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put(str, obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public boolean m9352q() {
        return this.f7550e.booleanValue() || (this.f7549d.booleanValue() && this.f7548c.booleanValue());
    }

    /* renamed from: a */
    public void mo18807a() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(jSONObject, "render_sequence", (Object) Integer.valueOf(uVar.f7547b.mo19739q()));
                C3185u.this.m9345a(jSONObject, "webview_count", (Object) Integer.valueOf(C2650e.m6932a().mo16867e()));
                C3185u.this.m9345a(jSONObject, "available_cache_count", (Object) Integer.valueOf(C2650e.m6932a().mo16865d()));
                C3185u uVar2 = C3185u.this;
                uVar2.m9345a(uVar2.f7551f, "render_start", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo18808a(final int i) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                C3185u.this.mo18809a(i, (String) null);
            }
        });
    }

    /* renamed from: a */
    public void mo18809a(final int i, final String str) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u.this.m9345a(jSONObject, "code", (Object) Integer.valueOf(i));
                String str = str;
                if (str != null) {
                    C3185u.this.m9345a(jSONObject, "msg", (Object) str);
                }
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "render_error", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo18810a(final String str) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                    C3185u.this.m9345a(jSONObject, "jsb", (Object) str);
                    C3185u uVar = C3185u.this;
                    uVar.m9345a(uVar.f7551f, "webview_jsb_start", (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18811a(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j2;
        final long j4 = j;
        final int i2 = i;
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str2) && j3 >= j4) {
                    JSONObject jSONObject = new JSONObject();
                    C3185u.this.m9345a(jSONObject, "start_ts", (Object) Long.valueOf(j4));
                    C3185u.this.m9345a(jSONObject, "end_ts", (Object) Long.valueOf(j3));
                    C3185u.this.m9345a(jSONObject, "intercept_type", (Object) Integer.valueOf(i2));
                    C3185u.this.m9345a(jSONObject, "type", (Object) "intercept_html");
                    C3185u.this.m9345a(jSONObject, "url", (Object) str2);
                    C3185u.this.m9345a(jSONObject, "duration", (Object) Long.valueOf(j3 - j4));
                    C3185u uVar = C3185u.this;
                    uVar.m9344a(uVar.f7553h, (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18812a(final JSONObject jSONObject) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                JSONObject jSONObject = jSONObject;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(System.currentTimeMillis()));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "webview_load_error", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo18813a(boolean z) {
        this.f7550e = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public void mo18814b() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "render_success", (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo18815b(final int i) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u.this.m9345a(jSONObject, "isWebViewCache", (Object) Integer.valueOf(i));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "before_webview_request", (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo18816b(final int i, final String str) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u.this.m9345a(jSONObject, "code", (Object) Integer.valueOf(i));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo18817b(final String str) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                    C3185u.this.m9345a(jSONObject, "jsb", (Object) str);
                    C3185u uVar = C3185u.this;
                    uVar.m9345a(uVar.f7551f, "webview_jsb_end", (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo18818b(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j2;
        final long j4 = j;
        final int i2 = i;
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str2) && j3 >= j4) {
                    JSONObject jSONObject = new JSONObject();
                    C3185u.this.m9345a(jSONObject, "start_ts", (Object) Long.valueOf(j4));
                    C3185u.this.m9345a(jSONObject, "end_ts", (Object) Long.valueOf(j3));
                    C3185u.this.m9345a(jSONObject, "intercept_type", (Object) Integer.valueOf(i2));
                    C3185u.this.m9345a(jSONObject, "type", (Object) "intercept_js");
                    C3185u.this.m9345a(jSONObject, "url", (Object) str2);
                    C3185u.this.m9345a(jSONObject, "duration", (Object) Long.valueOf(j3 - j4));
                    C3185u uVar = C3185u.this;
                    uVar.m9344a(uVar.f7553h, (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo18819b(final JSONObject jSONObject) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                JSONObject jSONObject;
                if (C3185u.this.f7551f != null && (jSONObject = jSONObject) != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C3185u uVar = C3185u.this;
                        uVar.m9345a(uVar.f7551f, next, jSONObject.opt(next));
                    }
                    Boolean unused = C3185u.this.f7549d = true;
                    C3185u.this.mo18833m();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo18820c() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "native_render_start", (Object) jSONObject);
            }
        });
    }

    /* renamed from: c */
    public void mo18821c(final String str) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: d */
    public void mo18822d() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "native_render_end", (Object) jSONObject);
            }
        });
    }

    /* renamed from: d */
    public void mo18823d(final String str) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: e */
    public void mo18824e() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9346a(uVar.f7551f, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    /* renamed from: e */
    public void mo18825e(final String str) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: f */
    public void mo18826f() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "webview_load_success", (Object) jSONObject);
            }
        });
    }

    /* renamed from: g */
    public void mo18827g() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                C3185u.this.mo18812a((JSONObject) null);
            }
        });
    }

    /* renamed from: h */
    public void mo18828h() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "native_endcard_show", (Object) jSONObject);
            }
        });
    }

    /* renamed from: i */
    public void mo18829i() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "native_endcard_close", (Object) jSONObject);
            }
        });
    }

    /* renamed from: j */
    public void mo18830j() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u.this.m9345a(jSONObject, "type", (Object) "native_enterBackground");
                C3185u uVar = C3185u.this;
                uVar.m9344a(uVar.f7552g, (Object) jSONObject);
            }
        });
    }

    /* renamed from: k */
    public void mo18831k() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u.this.m9345a(jSONObject, "type", (Object) "native_enterForeground");
                C3185u uVar = C3185u.this;
                uVar.m9344a(uVar.f7552g, (Object) jSONObject);
            }
        });
    }

    /* renamed from: l */
    public void mo18832l() {
        this.f7548c = true;
    }

    /* renamed from: m */
    public void mo18833m() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                if (C3185u.this.m9352q()) {
                    if (!(C3185u.this.f7552g == null || C3185u.this.f7552g.length() == 0)) {
                        try {
                            C3185u.this.f7551f.put("native_switchBackgroundAndForeground", C3185u.this.f7552g);
                        } catch (Exception unused) {
                        }
                    }
                    if (!(C3185u.this.f7553h == null || C3185u.this.f7553h.length() == 0)) {
                        try {
                            C3185u.this.f7551f.put("intercept_source", C3185u.this.f7553h);
                        } catch (Exception unused2) {
                        }
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("webview_time_track", C3185u.this.f7551f);
                    if (C3524h.m10852d().mo19869s() && C3185u.this.f7551f != null) {
                        C2975l.m8384b("WebviewTimeTrack", C3185u.this.f7551f.toString());
                    }
                    C3156e.m9198c(C3578m.m11231a(), C3185u.this.f7547b, C3185u.this.f7546a, "webview_time_track", (Map<String, Object>) hashMap);
                }
            }
        });
    }

    /* renamed from: n */
    public void mo18834n() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "native_render_end", (Object) jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                C3185u.this.m9345a(jSONObject2, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis2));
                C3185u uVar2 = C3185u.this;
                uVar2.m9345a(uVar2.f7551f, "render_success", (Object) jSONObject2);
            }
        });
    }

    /* renamed from: o */
    public void mo18835o() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "no_native_render", (Object) jSONObject);
            }
        });
    }

    /* renamed from: p */
    public void mo18836p() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3185u.this.m9345a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3185u uVar = C3185u.this;
                uVar.m9345a(uVar.f7551f, "render_failed", (Object) jSONObject);
            }
        });
    }
}
