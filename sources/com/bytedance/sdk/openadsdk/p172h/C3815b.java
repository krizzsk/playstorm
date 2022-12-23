package com.bytedance.sdk.openadsdk.p172h;

import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3455c;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3813a;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.b */
/* compiled from: StatsLogManager */
public class C3815b {

    /* renamed from: a */
    private static volatile C3815b f9899a;

    /* renamed from: b */
    private ExecutorService f9900b = Executors.newFixedThreadPool(5);

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m12557g(C3814b bVar) {
        return bVar == null;
    }

    private C3815b() {
    }

    /* renamed from: a */
    public static C3815b m12552a() {
        if (f9899a == null) {
            synchronized (C3815b.class) {
                if (f9899a == null) {
                    f9899a = new C3815b();
                }
            }
        }
        return f9899a;
    }

    /* renamed from: a */
    public void mo20658a(final C3814b bVar) {
        if (!m12557g(bVar)) {
            bVar.mo20633a(System.currentTimeMillis() / 1000);
            C3578m.m11242i().mo20676a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: b */
    public void mo20665b(final C3814b bVar) {
        if (!m12557g(bVar)) {
            bVar.mo20634a("express_ad_render");
            bVar.mo20633a(System.currentTimeMillis() / 1000);
            C3578m.m11242i().mo20676a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12555a(String str, int i) {
        C3455c a = C3455c.m10351a(C3578m.m11231a());
        boolean z = false;
        int b = a.mo19459b(str, 0);
        if ((b & 2) == 0 || (b & 1) != i) {
            z = true;
        }
        if (z) {
            a.mo19455a(str, i + 2);
        }
        return z;
    }

    /* renamed from: c */
    public void mo20668c(final C3814b bVar) {
        if (!m12557g(bVar)) {
            this.f9900b.execute(new Runnable() {
                public void run() {
                    if (!C3815b.this.m12557g(bVar) && C3815b.this.m12555a(bVar.mo20642e(), 1)) {
                        bVar.mo20634a("reg_creative");
                        C3578m.m11242i().mo20676a(new C3812a() {
                            /* renamed from: a */
                            public C3813a mo18671a() throws Exception {
                                return bVar;
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void mo20669d(final C3814b bVar) {
        if (!m12557g(bVar)) {
            this.f9900b.execute(new Runnable() {
                public void run() {
                    if (!C3815b.this.m12557g(bVar) && C3815b.this.m12555a(bVar.mo20642e(), 0)) {
                        bVar.mo20634a("no_reg_creative");
                        C3578m.m11242i().mo20676a(new C3812a() {
                            /* renamed from: a */
                            public C3813a mo18671a() throws Exception {
                                return bVar;
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public void mo20670e(final C3814b bVar) {
        if (!m12557g(bVar)) {
            bVar.mo20634a("load_icon_error");
            C3578m.m11242i().mo20676a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: f */
    public void mo20671f(final C3814b bVar) {
        if (!m12557g(bVar)) {
            bVar.mo20634a("show_backup_endcard");
            bVar.mo20633a(System.currentTimeMillis() / 1000);
            C3578m.m11242i().mo20676a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20664a(JSONObject jSONObject) {
        if (jSONObject != null) {
            final C3814b b = C3814b.m12522b().mo20634a("app_env").mo20633a(System.currentTimeMillis() / 1000).mo20636b(jSONObject.toString());
            C3578m.m11242i().mo20676a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    return b;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20660a(final String str) {
        C3578m.m11242i().mo20677a(new C3812a() {
            /* renamed from: a */
            public C3813a mo18671a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return C3814b.m12522b().mo20634a("click_playable_test_tool").mo20636b(jSONObject.toString());
            }
        }, false);
    }

    /* renamed from: b */
    public void mo20666b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
        } catch (Throwable unused) {
        }
        final C3814b b = C3814b.m12522b().mo20634a("close_playable_test_tool").mo20636b(jSONObject.toString());
        C3578m.m11242i().mo20677a(new C3812a() {
            /* renamed from: a */
            public C3813a mo18671a() throws Exception {
                return b;
            }
        }, false);
    }

    /* renamed from: a */
    public void mo20661a(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
            jSONObject.put("error_code", i);
            jSONObject.put("error_message", str2);
        } catch (Throwable unused) {
        }
        final C3814b b = C3814b.m12522b().mo20634a("use_playable_test_tool_error").mo20636b(jSONObject.toString());
        C3578m.m11242i().mo20677a(new C3812a() {
            /* renamed from: a */
            public C3813a mo18671a() throws Exception {
                return b;
            }
        }, false);
    }

    /* renamed from: a */
    public void mo20657a(long j, long j2, int i) {
        final long j3 = j2 - j;
        final long j4 = j;
        final long j5 = j2;
        final int i2 = i;
        C3578m.m11242i().mo20677a(new C3812a() {
            /* renamed from: a */
            public C3813a mo18671a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j4);
                    jSONObject.put("endtime", j5);
                    jSONObject.put("start_type", i2);
                } catch (Throwable unused) {
                }
                C3814b a = C3814b.m12522b().mo20634a("general_label");
                return a.mo20647h(j3 + "").mo20636b(jSONObject.toString());
            }
        }, false);
    }

    /* renamed from: a */
    public void mo20662a(final String str, long j) {
        if (!C2482a.m6066b()) {
            final long currentTimeMillis = System.currentTimeMillis() - j;
            C3578m.m11242i().mo20677a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", currentTimeMillis);
                        jSONObject.put("method_name", str);
                    } catch (Throwable unused) {
                    }
                    return C3814b.m12522b().mo20634a("log_mssdk_method_time_report").mo20636b(jSONObject.toString());
                }
            }, false);
        }
    }

    /* renamed from: a */
    public void mo20663a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            final C3814b b = C3814b.m12522b().mo20634a(str).mo20636b(jSONObject.toString());
            C3578m.m11242i().mo20677a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    return b;
                }
            }, false);
        }
    }

    /* renamed from: b */
    public static void m12556b() {
        try {
            JSONObject jSONObject = new JSONObject();
            long j = 0;
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    long a = m12551a(file2);
                    j += a;
                    jSONObject.put(file2.getName(), a);
                }
            }
            if (j >= 524288000) {
                final C3814b b = C3814b.m12522b().mo20634a("disk_log").mo20636b(jSONObject.toString());
                C3578m.m11242i().mo20677a(new C3812a() {
                    /* renamed from: a */
                    public C3813a mo18671a() throws Exception {
                        return b;
                    }
                }, false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo20667c() {
        try {
            C3578m.m11242i().mo20677a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    return C3814b.m12522b().mo20634a("bidding_get_creative");
                }
            }, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static long m12551a(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File a : file.listFiles()) {
            j += m12551a(a);
        }
        return j;
    }

    /* renamed from: a */
    public void mo20659a(C3812a aVar) {
        C3578m.m11242i().mo20677a(aVar, false);
    }
}
