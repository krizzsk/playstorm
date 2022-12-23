package com.bytedance.sdk.openadsdk.p130b.p132b.p133a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p084b.C2519a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2521b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p130b.p131a.C3129a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3136a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3137b;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3139d;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3140e;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3141f;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3142g;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3143h;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3144i;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3145j;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3146k;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3147l;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3148m;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3149n;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3150o;
import com.bytedance.sdk.openadsdk.p172h.C3812a;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3813a;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.a.a */
/* compiled from: VideoEventManager */
public class C3133a {

    /* renamed from: a */
    private static final Map<C2519a, C3150o> f7383a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public static JSONObject m9040a(C3498n nVar, String str, int i, int i2) {
        C2521b J;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i > 0) {
                jSONObject.put("play_type", String.valueOf(i));
            }
            if (!(nVar == null || (J = nVar.mo19607J()) == null)) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, J.mo16356g());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(J.mo16350e()));
                jSONObject.put("video_url", J.mo16360i());
                jSONObject.put("player_type", i2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m9044a(C3136a<C3146k> aVar) {
        m9045a((C3136a) aVar, "load_video_start");
    }

    /* renamed from: b */
    public static void m9054b(C3136a<C3147l> aVar) {
        m9045a((C3136a) aVar, "load_video_success");
    }

    /* renamed from: c */
    public static void m9057c(C3136a<C3145j> aVar) {
        m9045a((C3136a) aVar, "load_video_error");
    }

    /* renamed from: d */
    public static void m9060d(C3136a<C3144i> aVar) {
        m9045a((C3136a) aVar, "load_video_cancel");
    }

    /* renamed from: a */
    public static void m9049a(C3498n nVar, C2519a aVar, C2522c cVar) {
        if (nVar != null && aVar != null && cVar != null) {
            String a = C4002l.m13120a();
            boolean z = true;
            int i = CacheDirFactory.getICacheDir(nVar.mo19650aD()).mo16070a(cVar) ? 1 : 2;
            f7383a.put(aVar, new C3150o(SystemClock.elapsedRealtime(), a, i, cVar, nVar));
            C3136a aVar2 = new C3136a(nVar, C4014u.m13183a(nVar), m9040a(nVar, a, i, cVar.mo16400l()), null);
            if (cVar.mo16400l() != -1) {
                z = false;
            }
            aVar2.mo18673a(z);
            m9045a(aVar2, "play_start");
        }
    }

    /* renamed from: a */
    public static void m9041a(Context context, C2519a aVar, C3150o.C3151a aVar2, C3167j jVar) {
        C3150o oVar;
        if (context != null && aVar != null && aVar2 != null && (oVar = f7383a.get(aVar)) != null) {
            C2522c d = oVar.mo18717d();
            C3498n e = oVar.mo18718e();
            if (d != null && e != null) {
                if (!aVar2.mo18740l()) {
                    m9050a(e, d, aVar2);
                }
                C3143h hVar = new C3143h();
                hVar.mo18694a(aVar2.mo18741m() ? 1 : 0);
                hVar.mo18696b(CacheDirFactory.getICacheDir(e.mo19650aD()).mo16071b(d));
                hVar.mo18695a(SystemClock.elapsedRealtime() - oVar.mo18714a());
                C3136a aVar3 = new C3136a(e, C4014u.m13183a(e), m9040a(e, oVar.mo18715b(), oVar.mo18716c(), d.mo16400l()), hVar);
                aVar3.mo18673a(aVar2.mo18740l());
                m9046a(aVar3, "feed_play", jVar);
            }
        }
    }

    /* renamed from: a */
    public static void m9042a(C2519a aVar, C3150o.C3151a aVar2) {
        C3150o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7383a.get(aVar)) != null) {
            C2522c d = oVar.mo18717d();
            C3498n e = oVar.mo18718e();
            if (d != null && e != null) {
                long a = aVar2.mo18719a();
                long c = aVar2.mo18726c();
                if (c > 0 && a > 0) {
                    C3142g gVar = new C3142g();
                    gVar.mo18692a(aVar2.mo18723b());
                    gVar.mo18693b(c);
                    C3136a aVar3 = new C3136a(e, C4014u.m13183a(e), m9040a(e, oVar.mo18715b(), oVar.mo18716c(), d.mo16400l()), gVar);
                    aVar3.mo18673a(aVar2.mo18740l());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", a);
                        jSONObject.put("percent", aVar2.mo18736h());
                        m9047a(aVar3, "feed_pause", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m9052b(C2519a aVar, C3150o.C3151a aVar2) {
        C3150o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7383a.get(aVar)) != null) {
            C2522c d = oVar.mo18717d();
            C3498n e = oVar.mo18718e();
            if (d != null && e != null) {
                long a = aVar2.mo18719a();
                long c = aVar2.mo18726c();
                if (c > 0 && a > 0) {
                    C3140e eVar = new C3140e();
                    eVar.mo18687a(aVar2.mo18723b());
                    eVar.mo18688b(c);
                    C3136a aVar3 = new C3136a(e, C4014u.m13183a(e), m9040a(e, oVar.mo18715b(), oVar.mo18716c(), d.mo16400l()), eVar);
                    aVar3.mo18673a(aVar2.mo18740l());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", a);
                        jSONObject.put("percent", aVar2.mo18736h());
                        m9047a(aVar3, "feed_continue", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static void m9056c(C2519a aVar, C3150o.C3151a aVar2) {
        C3150o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7383a.get(aVar)) != null) {
            C2522c d = oVar.mo18717d();
            C3498n e = oVar.mo18718e();
            if (d != null && e != null) {
                long a = aVar2.mo18719a();
                long c = aVar2.mo18726c();
                C3149n nVar = new C3149n();
                nVar.mo18711a(aVar2.mo18723b());
                nVar.mo18713b(c);
                nVar.mo18710a(aVar2.mo18729d());
                nVar.mo18712b(aVar2.mo18731e());
                C3136a aVar3 = new C3136a(e, C4014u.m13183a(e), m9040a(e, oVar.mo18715b(), oVar.mo18716c(), d.mo16400l()), nVar);
                aVar3.mo18673a(aVar2.mo18740l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", a);
                    jSONObject.put("percent", aVar2.mo18736h());
                    m9047a(aVar3, "play_error", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: d */
    public static void m9059d(C2519a aVar, C3150o.C3151a aVar2) {
        C3150o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7383a.get(aVar)) != null) {
            C2522c d = oVar.mo18717d();
            C3498n e = oVar.mo18718e();
            if (d != null && e != null) {
                long a = aVar2.mo18719a();
                long c = aVar2.mo18726c();
                C3137b bVar = new C3137b();
                bVar.mo18679a(aVar2.mo18723b());
                bVar.mo18682b(c);
                bVar.mo18678a(aVar2.mo18733f());
                bVar.mo18681b(aVar2.mo18735g());
                C3136a aVar3 = new C3136a(e, C4014u.m13183a(e), m9040a(e, oVar.mo18715b(), oVar.mo18716c(), d.mo16400l()), bVar);
                aVar3.mo18673a(aVar2.mo18740l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", a);
                    jSONObject.put("percent", aVar2.mo18736h());
                    m9047a(aVar3, "endcard_skip", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                f7383a.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m9043a(C2519a aVar, C3150o.C3151a aVar2, C3167j jVar) {
        C3150o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7383a.get(aVar)) != null) {
            C2522c d = oVar.mo18717d();
            C3498n e = oVar.mo18718e();
            if (d != null && e != null) {
                long a = aVar2.mo18719a();
                long c = aVar2.mo18726c();
                C3139d dVar = new C3139d();
                dVar.mo18686b(aVar2.mo18723b());
                dVar.mo18684a(c);
                dVar.mo18683a(aVar2.mo18737i());
                dVar.mo18685b(aVar2.mo18738j());
                C3136a aVar3 = new C3136a(e, C4014u.m13183a(e), m9040a(e, oVar.mo18715b(), oVar.mo18716c(), d.mo16400l()), dVar);
                aVar3.mo18673a(aVar2.mo18740l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", a);
                    jSONObject.put("percent", aVar2.mo18736h());
                    m9048a(aVar3, "feed_break", jSONObject, jVar);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                f7383a.remove(aVar);
            }
        }
    }

    /* renamed from: b */
    public static void m9053b(C2519a aVar, C3150o.C3151a aVar2, C3167j jVar) {
        if (aVar != null && aVar2 != null) {
            m9061e(aVar, aVar2);
            C3150o oVar = f7383a.get(aVar);
            if (oVar != null) {
                C2522c d = oVar.mo18717d();
                C3498n e = oVar.mo18718e();
                if (d != null && e != null) {
                    long a = aVar2.mo18719a();
                    long c = aVar2.mo18726c();
                    if (c > 0) {
                        C3141f fVar = new C3141f();
                        fVar.mo18691b(aVar2.mo18723b());
                        fVar.mo18690a(c);
                        fVar.mo18689a(aVar2.mo18738j());
                        C3136a aVar3 = new C3136a(e, C4014u.m13183a(e), m9040a(e, oVar.mo18715b(), oVar.mo18716c(), d.mo16400l()), fVar);
                        aVar3.mo18673a(aVar2.mo18740l());
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", a);
                            jSONObject.put("percent", aVar2.mo18736h());
                            m9048a(aVar3, "feed_over", jSONObject, jVar);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        f7383a.remove(aVar);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m9061e(C2519a aVar, C3150o.C3151a aVar2) {
        if (aVar != null && aVar2 != null) {
            if (aVar2.mo18739k() <= 0) {
                C2975l.m8387c("VideoEventManager", "Cancel log report when buffer count is 0");
                return;
            }
            C3150o oVar = f7383a.get(aVar);
            if (oVar != null) {
                C2522c d = oVar.mo18717d();
                C3498n e = oVar.mo18718e();
                if (d != null && e != null) {
                    long c = aVar2.mo18726c();
                    if (c > 0) {
                        C3148m mVar = new C3148m();
                        mVar.mo18708a(aVar2.mo18723b());
                        mVar.mo18709b(c);
                        mVar.mo18707a(aVar2.mo18739k());
                        C3136a aVar3 = new C3136a(e, C4014u.m13183a(e), m9040a(e, oVar.mo18715b(), oVar.mo18716c(), d.mo16400l()), mVar);
                        aVar3.mo18673a(aVar2.mo18740l());
                        m9045a(aVar3, "play_buffer");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9045a(C3136a aVar, String str) {
        m9048a(aVar, str, (JSONObject) null, (C3167j) null);
    }

    /* renamed from: a */
    private static void m9047a(C3136a aVar, String str, JSONObject jSONObject) {
        m9048a(aVar, str, jSONObject, (C3167j) null);
    }

    /* renamed from: a */
    private static void m9046a(C3136a aVar, String str, C3167j jVar) {
        m9048a(aVar, str, (JSONObject) null, jVar);
    }

    /* renamed from: a */
    private static void m9048a(final C3136a aVar, String str, JSONObject jSONObject, final C3167j jVar) {
        if (aVar != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            if (aVar.mo18677e() && !TextUtils.isEmpty(aVar.mo18674b())) {
                String b = aVar.mo18674b();
                char c = 65535;
                int hashCode = b.hashCode();
                if (hashCode != -891990144) {
                    if (hashCode != -712491894) {
                        if (hashCode == 1912999166 && b.equals("draw_ad")) {
                            c = 2;
                        }
                    } else if (b.equals("embeded_ad")) {
                        c = 0;
                    }
                } else if (b.equals("stream")) {
                    c = 1;
                }
                if (c == 0 || c == 1 || c == 2) {
                    str = "customer_" + str;
                }
            }
            final String str2 = str;
            C3156e.m9185a(aVar.mo18672a(), aVar.mo18674b(), str2, jSONObject2, jVar, (C3129a) new C3129a() {
                /* renamed from: a */
                public void mo18669a(JSONObject jSONObject) throws JSONException {
                    C3167j jVar;
                    JSONObject c = aVar.mo18675c();
                    if (aVar.mo18676d() != null) {
                        aVar.mo18676d().mo18680a(c);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (jVar = jVar) != null) {
                        jVar.mo18768a(c);
                    }
                    jSONObject.put("ad_extra_data", c.toString());
                }
            });
        }
    }

    /* renamed from: a */
    private static void m9050a(final C3498n nVar, final C2522c cVar, final C3150o.C3151a aVar) {
        C3815b.m12552a().mo20659a((C3812a) new C3812a() {
            /* renamed from: a */
            public C3813a mo18671a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", C3133a.m9055c(cVar));
                jSONObject.put("player_duration", aVar.mo18726c());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", cVar.mo16398j());
                jSONObject.put("path", C3133a.m9058d(cVar));
                jSONObject.put("player_type", cVar.mo16400l());
                return C3814b.m12522b().mo20634a("pangle_video_play_state").mo20632a(C4014u.m13219e(nVar)).mo20636b(jSONObject.toString());
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static long m9055c(C2522c cVar) {
        if (cVar == null) {
            return 0;
        }
        C2521b r = cVar.mo16397i() ? cVar.mo16406r() : cVar.mo16405q();
        if (r != null) {
            return Double.valueOf(r.mo16353f() * 1000.0d).longValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m9058d(C2522c cVar) {
        return new File(cVar.mo16373a(), cVar.mo16399k()).getAbsolutePath();
    }
}
