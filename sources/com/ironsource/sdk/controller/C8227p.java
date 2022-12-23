package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.p205e.C6421a;
import com.ironsource.sdk.p293g.C8342c;
import com.ironsource.sdk.p293g.C8343d;
import com.ironsource.sdk.p296j.C8368e;
import com.ironsource.sdk.p296j.p297a.C8362b;
import com.ironsource.sdk.p296j.p297a.C8363c;
import com.ironsource.sdk.p296j.p297a.C8364d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.p */
public final class C8227p implements C8224m {

    /* renamed from: a */
    String f19667a = "";

    /* renamed from: b */
    private final C6421a f19668b;

    C8227p(String str, C6421a aVar, final C8191e eVar) {
        this.f19668b = aVar;
        this.f19667a = str;
        m23623a((Runnable) new Runnable() {
            public final void run() {
                eVar.mo56513b();
            }
        });
    }

    /* renamed from: a */
    private void m23623a(Runnable runnable) {
        C6421a aVar = this.f19668b;
        if (aVar != null) {
            aVar.mo35930c(runnable);
        }
    }

    /* renamed from: a */
    public final void mo56522a(Context context) {
    }

    /* renamed from: a */
    public final void mo56523a(C8342c cVar, final Map<String, String> map, final C8362b bVar) {
        if (bVar != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    bVar.mo56810d((String) map.get("demandSourceName"), C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56524a(final C8342c cVar, Map<String, String> map, final C8363c cVar2) {
        if (cVar2 != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo56801b(cVar.f20020b, C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56526a(final String str, final C8363c cVar) {
        if (cVar != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    cVar.mo56801b(str, C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56527a(String str, String str2, C8342c cVar, C8362b bVar) {
        if (bVar != null) {
            bVar.mo56782a(C8343d.C8348e.Banner, cVar.f20020b, this.f19667a);
        }
    }

    /* renamed from: a */
    public final void mo56528a(String str, String str2, final C8342c cVar, final C8363c cVar2) {
        if (cVar2 != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo56782a(C8343d.C8348e.Interstitial, cVar.f20020b, C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56529a(String str, String str2, final C8342c cVar, final C8364d dVar) {
        if (dVar != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    dVar.mo56782a(C8343d.C8348e.RewardedVideo, cVar.f20020b, C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56530a(String str, String str2, final C8368e eVar) {
        if (eVar != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onGetOWCreditsFailed(C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56531a(String str, String str2, Map<String, String> map, final C8368e eVar) {
        if (eVar != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onOfferwallInitFail(C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56532a(Map<String, String> map, final C8368e eVar) {
        if (eVar != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onOWShowFail(C8227p.this.f19667a);
                    eVar.onOfferwallInitFail(C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56533a(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public final void mo56534a(final JSONObject jSONObject, final C8363c cVar) {
        if (cVar != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    cVar.mo56806c(jSONObject.optString("demandSourceName"), C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56535a(final JSONObject jSONObject, final C8364d dVar) {
        if (dVar != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    dVar.mo56787a(jSONObject.optString("demandSourceName"), C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo56536b(Context context) {
    }

    /* renamed from: b */
    public final void mo56537b(final C8342c cVar, Map<String, String> map, final C8363c cVar2) {
        if (cVar2 != null) {
            m23623a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo56806c(cVar.f20020b, C8227p.this.f19667a);
                }
            });
        }
    }

    /* renamed from: c */
    public final C8343d.C8346c mo56538c() {
        return C8343d.C8346c.Native;
    }

    /* renamed from: c */
    public final boolean mo56539c(String str) {
        return false;
    }

    /* renamed from: d */
    public final void mo56540d() {
    }

    public final void destroy() {
    }

    /* renamed from: e */
    public final void mo56542e() {
    }

    /* renamed from: f */
    public final void mo56543f() {
    }

    /* renamed from: g */
    public final void mo56544g() {
    }

    /* renamed from: h */
    public final void mo56545h() {
    }
}
