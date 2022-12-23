package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.environment.p205e.C6421a;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.p286a.C8150a;
import com.ironsource.sdk.p286a.C8154d;
import com.ironsource.sdk.p286a.C8155e;
import com.ironsource.sdk.p286a.C8156f;
import com.ironsource.sdk.p293g.C8342c;
import com.ironsource.sdk.p293g.C8343d;
import com.ironsource.sdk.p293g.C8349e;
import com.ironsource.sdk.p294h.C8351a;
import com.ironsource.sdk.p294h.C8352b;
import com.ironsource.sdk.p294h.C8356d;
import com.ironsource.sdk.p296j.C8367d;
import com.ironsource.sdk.p296j.C8368e;
import com.ironsource.sdk.p296j.p297a.C8362b;
import com.ironsource.sdk.p296j.p297a.C8363c;
import com.ironsource.sdk.p296j.p297a.C8364d;
import com.ironsource.sdk.service.C8385a;
import com.ironsource.sdk.service.C8388d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.g */
public class C8197g implements C8191e, C8224m {

    /* renamed from: a */
    public C8224m f19576a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f19577b = C8197g.class.getSimpleName();

    /* renamed from: c */
    private C8343d.C8345b f19578c = C8343d.C8345b.None;

    /* renamed from: d */
    private CountDownTimer f19579d;

    /* renamed from: e */
    private final C8187b f19580e = new C8187b("NativeCommandExecutor");

    /* renamed from: f */
    private final C8187b f19581f = new C8187b("ControllerCommandsExecutor");

    /* renamed from: g */
    private final C6421a f19582g;

    public C8197g(Context context, C8189c cVar, C8388d dVar, C8219j jVar, C6421a aVar) {
        this.f19582g = aVar;
        IronSourceStorageUtils.getNetworkStorageDir(context);
        final Context context2 = context;
        final C8189c cVar2 = cVar;
        final C8388d dVar2 = dVar;
        final C8219j jVar2 = jVar;
        m23552b((Runnable) new Runnable() {
            public final void run() {
                try {
                    C8224m unused = C8197g.this.f19576a = C8197g.m23549a(C8197g.this, context2, cVar2, dVar2, jVar2);
                    C8197g.this.f19576a.mo56545h();
                } catch (Exception e) {
                    C8197g.this.m23553d(Log.getStackTraceString(e));
                }
            }
        });
        this.f19579d = new CountDownTimer(200000, 1000) {
            public final void onFinish() {
                Logger.m24028i(C8197g.this.f19577b, "Global Controller Timer Finish");
                C8197g.this.m23553d("controller html - download timeout");
            }

            public final void onTick(long j) {
                String b = C8197g.this.f19577b;
                Logger.m24028i(b, "Global Controller Timer Tick " + j);
            }
        }.start();
    }

    /* renamed from: a */
    static /* synthetic */ C8252x m23549a(C8197g gVar, Context context, C8189c cVar, C8388d dVar, C8219j jVar) {
        C8154d.m23441a(C8156f.f19420b);
        C8252x xVar = new C8252x(context, jVar, cVar, gVar, gVar.f19582g);
        C8352b bVar = new C8352b(context, xVar.mo56613a(), new C8351a(C6421a.m19270a()), new C8356d(xVar.mo56613a().f20080b));
        xVar.f19778p = new C8249v(context, dVar);
        xVar.f19776n = new C8240q(context);
        xVar.f19777o = new C8242r(context);
        xVar.f19779q = new C8220k(context);
        xVar.f19780r = new C8185a(cVar);
        C8185a aVar = xVar.f19780r;
        if (xVar.f19782t == null) {
            xVar.f19782t = new C8312y() {
                /* renamed from: a */
                public final void mo56638a(String str, JSONObject jSONObject) {
                    C8252x.this.mo56622b(C8252x.m23704b(str, jSONObject.toString()));
                }
            };
        }
        aVar.f19539a = xVar.f19782t;
        xVar.f19781s = new C8222l(xVar.mo56613a().f20080b, bVar);
        return xVar;
    }

    /* renamed from: b */
    private void m23552b(Runnable runnable) {
        C6421a aVar = this.f19582g;
        if (aVar != null) {
            aVar.mo35928a(runnable);
        } else {
            Logger.m24026e(this.f19577b, "mThreadManager = null");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m23553d(String str) {
        C8154d.m23442a(C8156f.f19421c, (Map<String, Object>) new C8150a().mo56415a("callfailreason", str).f19410a);
        this.f19576a = new C8227p(str, this.f19582g, this);
        this.f19580e.mo56504a();
        this.f19580e.mo56506b();
    }

    /* renamed from: i */
    private boolean m23554i() {
        return C8343d.C8345b.Ready.equals(this.f19578c);
    }

    /* renamed from: a */
    public final void mo56511a() {
        this.f19578c = C8343d.C8345b.Loaded;
        this.f19580e.mo56504a();
        this.f19580e.mo56506b();
    }

    /* renamed from: a */
    public final void mo56522a(Context context) {
        if (m23554i()) {
            this.f19576a.mo56522a(context);
        }
    }

    /* renamed from: a */
    public final void mo56523a(final C8342c cVar, final Map<String, String> map, final C8362b bVar) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56523a(cVar, (Map<String, String>) map, bVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56524a(final C8342c cVar, final Map<String, String> map, final C8363c cVar2) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8150a a = new C8150a().mo56415a("demandsourcename", cVar.f20019a).mo56415a("producttype", C8155e.m23443a(cVar, C8343d.C8348e.Interstitial)).mo56415a("isbiddinginstance", Boolean.valueOf(C8155e.m23444a(cVar)));
                C8385a aVar = C8385a.f20107a;
                C8154d.m23442a(C8156f.f19427i, (Map<String, Object>) a.mo56415a("custom_c", Long.valueOf(C8385a.m23995c(cVar.f20020b))).f19410a);
                C8197g.this.f19576a.mo56524a(cVar, (Map<String, String>) map, cVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo56525a(Runnable runnable) {
        this.f19580e.mo56505a(runnable);
    }

    /* renamed from: a */
    public final void mo56512a(String str) {
        C8154d.m23442a(C8156f.f19430l, (Map<String, Object>) new C8150a().mo56415a("callfailreason", str).f19410a);
        C8367d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new C8349e(1001, str));
            IronSourceNetwork.setInitListener((C8367d) null);
        }
        CountDownTimer countDownTimer = this.f19579d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m23553d(str);
    }

    /* renamed from: a */
    public final void mo56526a(final String str, final C8363c cVar) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56526a(str, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56527a(String str, String str2, C8342c cVar, C8362b bVar) {
        final String str3 = str;
        final String str4 = str2;
        final C8342c cVar2 = cVar;
        final C8362b bVar2 = bVar;
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56527a(str3, str4, cVar2, bVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo56528a(String str, String str2, C8342c cVar, C8363c cVar2) {
        final String str3 = str;
        final String str4 = str2;
        final C8342c cVar3 = cVar;
        final C8363c cVar4 = cVar2;
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56528a(str3, str4, cVar3, cVar4);
            }
        });
    }

    /* renamed from: a */
    public final void mo56529a(String str, String str2, C8342c cVar, C8364d dVar) {
        final String str3 = str;
        final String str4 = str2;
        final C8342c cVar2 = cVar;
        final C8364d dVar2 = dVar;
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56529a(str3, str4, cVar2, dVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo56530a(final String str, final String str2, final C8368e eVar) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56530a(str, str2, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56531a(String str, String str2, Map<String, String> map, C8368e eVar) {
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final C8368e eVar2 = eVar;
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56531a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo56532a(final Map<String, String> map, final C8368e eVar) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56532a((Map<String, String>) map, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56533a(final JSONObject jSONObject) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56533a(jSONObject);
            }
        });
    }

    /* renamed from: a */
    public final void mo56534a(final JSONObject jSONObject, final C8363c cVar) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56534a(jSONObject, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56535a(final JSONObject jSONObject, final C8364d dVar) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56535a(jSONObject, dVar);
            }
        });
    }

    /* renamed from: b */
    public final void mo56513b() {
        if (C8343d.C8346c.Web.equals(mo56538c())) {
            C8154d.m23441a(C8156f.f19422d);
            C8367d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener((C8367d) null);
            }
        }
        this.f19578c = C8343d.C8345b.Ready;
        CountDownTimer countDownTimer = this.f19579d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f19581f.mo56504a();
        this.f19581f.mo56506b();
        this.f19576a.mo56544g();
    }

    /* renamed from: b */
    public final void mo56536b(Context context) {
        if (m23554i()) {
            this.f19576a.mo56536b(context);
        }
    }

    /* renamed from: b */
    public final void mo56537b(final C8342c cVar, final Map<String, String> map, final C8363c cVar2) {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56537b(cVar, map, cVar2);
            }
        });
    }

    /* renamed from: b */
    public final void mo56514b(String str) {
        C8154d.m23442a(C8156f.f19439u, (Map<String, Object>) new C8150a().mo56415a("generalmessage", str).f19410a);
        CountDownTimer countDownTimer = this.f19579d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m23553d(str);
    }

    /* renamed from: c */
    public final C8343d.C8346c mo56538c() {
        return this.f19576a.mo56538c();
    }

    /* renamed from: c */
    public final boolean mo56539c(String str) {
        if (!m23554i()) {
            return false;
        }
        return this.f19576a.mo56539c(str);
    }

    /* renamed from: d */
    public final void mo56540d() {
        this.f19581f.mo56505a(new Runnable() {
            public final void run() {
                C8197g.this.f19576a.mo56540d();
            }
        });
    }

    public void destroy() {
        CountDownTimer countDownTimer = this.f19579d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f19579d = null;
        m23552b((Runnable) new Runnable() {
            public final void run() {
                if (C8197g.this.f19576a != null) {
                    C8197g.this.f19576a.destroy();
                    C8224m unused = C8197g.this.f19576a = null;
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo56542e() {
        if (m23554i()) {
            this.f19576a.mo56542e();
        }
    }

    /* renamed from: f */
    public final void mo56543f() {
        if (m23554i()) {
            this.f19576a.mo56543f();
        }
    }

    @Deprecated
    /* renamed from: g */
    public final void mo56544g() {
    }

    /* renamed from: h */
    public final void mo56545h() {
    }
}
