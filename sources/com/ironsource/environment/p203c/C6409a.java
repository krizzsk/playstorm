package com.ironsource.environment.p203c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.C6429h;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.p200d.C6392a;
import com.vungle.warren.VungleApiClient;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.c.a */
public final class C6409a {

    /* renamed from: a */
    public ConcurrentHashMap<String, Object> f16300a;

    /* renamed from: b */
    AtomicBoolean f16301b;

    /* renamed from: c */
    public AtomicBoolean f16302c;

    /* renamed from: com.ironsource.environment.c.a$a */
    public static class C6411a {

        /* renamed from: a */
        public static volatile C6409a f16305a = new C6409a((byte) 0);
    }

    private C6409a() {
        this.f16301b = new AtomicBoolean(false);
        this.f16302c = new AtomicBoolean(false);
        this.f16300a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C6409a(byte b) {
        this();
    }

    /* renamed from: a */
    private void m19249a(String str) {
        try {
            this.f16300a.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private boolean m19250b(String str) {
        try {
            return this.f16300a.containsKey(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private void m19251c(final Context context) {
        if (!this.f16301b.get()) {
            try {
                this.f16301b.set(true);
                C6423c.m19280b(new Runnable() {
                    public final void run() {
                        String[] C;
                        try {
                            C6409a aVar = C6409a.this;
                            Context context = context;
                            if (!(context == null || (C = C6429h.m19297C(context)) == null || C.length != 2)) {
                                String str = C[0];
                                Boolean valueOf = Boolean.valueOf(C[1]);
                                if (!TextUtils.isEmpty(str)) {
                                    aVar.mo35921a(VungleApiClient.GAID, str);
                                    aVar.mo35921a("lat", valueOf);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        C6409a.this.f16301b.set(false);
                    }
                }, 0);
            } catch (Exception unused) {
                this.f16301b.set(false);
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo35920a(Context context) {
        mo35922b(context);
        return new JSONObject(C6412b.m19255a(this.f16300a));
    }

    /* renamed from: a */
    public void mo35921a(String str, Object obj) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                this.f16300a.put(str, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo35922b(Context context) {
        if (context != null) {
            m19251c(context);
            String B = C6429h.m19296B(context);
            if (!TextUtils.isEmpty(B)) {
                mo35921a("asid", B);
            } else if (m19250b("asid")) {
                m19249a("asid");
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                mo35921a("lang", language.toUpperCase());
            }
            String c = C6429h.m19309c();
            if (!TextUtils.isEmpty(c)) {
                mo35921a("tz", c);
            }
            String a = C6392a.m19175a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                mo35921a("connt", a);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                mo35921a("vpn", Boolean.valueOf(C6392a.m19180c(context)));
            }
            String j = C6429h.m19325j(context);
            if (!TextUtils.isEmpty(j)) {
                mo35921a("icc", j);
            }
            mo35921a("vol", Float.valueOf(C6429h.m19329l(context)));
            mo35921a("dfs", String.valueOf(C6429h.m19337p()));
            mo35921a("scrnw", Integer.valueOf(C6429h.m19327k()));
            mo35921a("scrnh", Integer.valueOf(C6429h.m19330l()));
            mo35921a("ltime", String.valueOf(C6429h.m19300a()));
            mo35921a("tzoff", String.valueOf(C6429h.m19306b()));
            mo35921a("mcc", Integer.valueOf(C6399a.C64001.m19223c(context)));
            mo35921a("mnc", Integer.valueOf(C6399a.C64001.m19226d(context)));
            mo35921a("sdcrd", Boolean.valueOf(C6429h.m19313d()));
            mo35921a("chrg", Boolean.valueOf(C6429h.m19316e(context)));
            mo35921a("chrgt", Integer.valueOf(C6429h.m19318f(context)));
            mo35921a("apm", Boolean.valueOf(C6429h.m19320g(context)));
            mo35921a("owp", Boolean.valueOf(C6429h.m19322h(context)));
            mo35921a("rt", Boolean.valueOf(C6429h.m19326j()));
            mo35921a("sscl", String.valueOf(C6429h.m19335o()));
            mo35921a("bat", Integer.valueOf(C6429h.m19347v(context)));
            mo35921a("lpm", Boolean.valueOf(C6429h.m19348w(context)));
            mo35921a("apor", C6429h.m19334n(context));
            mo35921a("ua", C6429h.m19342r());
            int D = C6429h.m19298D(context);
            if (D >= 0) {
                mo35921a("tca", Integer.valueOf(D));
            }
            String E = C6429h.m19299E(context);
            if (E != null) {
                mo35921a("tcs", E);
            }
        }
    }
}
