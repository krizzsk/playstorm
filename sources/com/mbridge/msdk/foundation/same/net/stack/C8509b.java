package com.mbridge.msdk.foundation.same.net.stack;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.thrid.okhttp.ConnectionPool;
import com.mbridge.msdk.thrid.okhttp.Dispatcher;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.net.stack.b */
/* compiled from: OKHTTPClientManager */
public final class C8509b {

    /* renamed from: a */
    private OkHttpClient f20613a;

    /* renamed from: b */
    private C2278a f20614b;

    /* renamed from: c */
    private String f20615c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.stack.b$a */
    /* compiled from: OKHTTPClientManager */
    private static final class C8513a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8509b f20620a = new C8509b();
    }

    private C8509b() {
        this.f20613a = null;
        this.f20615c = "";
    }

    /* renamed from: a */
    public static C8509b m24590a() {
        return C8513a.f20620a;
    }

    /* renamed from: b */
    public final synchronized OkHttpClient mo57660b() {
        if (this.f20613a == null) {
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.setMaxRequestsPerHost(10);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.readTimeout(100, TimeUnit.SECONDS);
            builder.connectTimeout(60, TimeUnit.SECONDS);
            builder.writeTimeout(60, TimeUnit.SECONDS);
            builder.connectionPool(new ConnectionPool(32, 5, TimeUnit.MINUTES));
            builder.dispatcher(dispatcher);
            builder.eventListener(new EventListener() {
            });
            this.f20613a = builder.build();
        }
        return this.f20613a;
    }

    /* renamed from: c */
    public final C8514b mo57661c() {
        C8514b bVar = new C8514b();
        bVar.f20626f = this.f20615c;
        return bVar;
    }

    /* renamed from: a */
    public final boolean mo57659a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.f20614b == null) {
                this.f20614b = C2283b.m5275a().mo15571f(C2350a.m5601e().mo15793h());
            }
            if (this.f20614b == null) {
                return false;
            }
            String r = this.f20614b.mo15531r();
            String str2 = C8487d.m24492a().f20531a;
            if (TextUtils.isEmpty(r) || !str.startsWith(r) || TextUtils.equals(r, str2)) {
                return false;
            }
            this.f20615c = r;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo57658a(C8514b bVar) {
        if (bVar != null) {
            final C8514b a = C8514b.m24598a(bVar);
            C8442b.m24388a().execute(new Runnable() {
                public final void run() {
                    try {
                        StringBuilder sb = new StringBuilder("key=2000102&");
                        sb.append("app_id=");
                        sb.append(C2350a.m5601e().mo15793h());
                        sb.append("&");
                        sb.append("status=");
                        sb.append(a.f20621a);
                        sb.append("&");
                        sb.append("domain=");
                        sb.append(a.f20626f);
                        sb.append("&");
                        sb.append("method=");
                        sb.append(a.f20624d);
                        sb.append("&");
                        if (!TextUtils.isEmpty(a.f20628h)) {
                            sb.append("dns_r=");
                            sb.append(a.f20628h);
                            sb.append("&");
                            sb.append("dns_d=");
                            sb.append(a.f20627g);
                            sb.append("&");
                            sb.append("host=");
                            sb.append(a.f20625e);
                            sb.append("&");
                            if (!TextUtils.isEmpty(a.f20630j)) {
                                sb.append("connect_e=");
                                sb.append(a.f20630j);
                            } else if (TextUtils.isEmpty(a.f20623c)) {
                                sb.append("call_d=");
                                sb.append(a.f20622b);
                                sb.append("&");
                                sb.append("connect_d=");
                                sb.append(a.f20629i);
                                sb.append("&");
                                sb.append("connection_d=");
                                sb.append(a.f20631k);
                            } else {
                                sb.append("connect_d=");
                                sb.append(a.f20629i);
                                sb.append("&");
                                sb.append("connection_e=");
                                sb.append(a.f20623c);
                            }
                        } else if (!TextUtils.isEmpty(a.f20623c)) {
                            sb.append("connect_e=");
                            sb.append(a.f20623c);
                        } else if (!TextUtils.isEmpty(a.f20630j)) {
                            sb.append("connect_e=");
                            sb.append(a.f20630j);
                        }
                        if (C8518b.m24607a().mo57681c()) {
                            C8518b.m24607a().mo57679a(sb.toString());
                            return;
                        }
                        C8509b bVar = C8509b.this;
                        String sb2 = sb.toString();
                        Context g = C2350a.m5601e().mo15792g();
                        C8540a aVar = new C8540a(g);
                        C8494d a = C8542e.m24688a(g);
                        a.mo57606a("data", URLEncoder.encode(sb2, "utf-8"));
                        a.mo57606a("m_sdk", "msdk");
                        aVar.mo57603c(0, C8487d.m24492a().f20531a, a, new C8541b() {
                            /* renamed from: a */
                            public final void mo15651a(String str) {
                                C8608u.m24880a("OKHTTPClientManager", "report success");
                            }

                            /* renamed from: b */
                            public final void mo15652b(String str) {
                                C8608u.m24880a("OKHTTPClientManager", "report failed");
                            }
                        });
                    } catch (Exception e) {
                        C8608u.m24884d("OKHTTPClientManager", e.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.stack.b$b */
    /* compiled from: OKHTTPClientManager */
    public static class C8514b implements Serializable {

        /* renamed from: a */
        public int f20621a;

        /* renamed from: b */
        public long f20622b = 0;

        /* renamed from: c */
        public String f20623c = "";

        /* renamed from: d */
        public String f20624d = "";

        /* renamed from: e */
        public String f20625e = "";

        /* renamed from: f */
        public String f20626f = "";

        /* renamed from: g */
        public long f20627g = 0;

        /* renamed from: h */
        public String f20628h = "";

        /* renamed from: i */
        public long f20629i = 0;

        /* renamed from: j */
        public String f20630j = "";

        /* renamed from: k */
        public long f20631k = 0;

        /* renamed from: a */
        public static C8514b m24598a(C8514b bVar) {
            C8514b bVar2 = new C8514b();
            bVar2.f20621a = bVar.f20621a;
            bVar2.f20624d = bVar.f20624d;
            bVar2.f20626f = bVar.f20626f;
            bVar2.f20622b = bVar.f20622b;
            bVar2.f20629i = bVar.f20629i;
            bVar2.f20623c = bVar.f20623c;
            bVar2.f20628h = bVar.f20628h;
            bVar2.f20627g = bVar.f20627g;
            bVar2.f20625e = bVar.f20625e;
            bVar2.f20630j = bVar.f20630j;
            bVar2.f20631k = bVar.f20631k;
            return bVar2;
        }
    }
}
