package com.ironsource.sdk.controller;

import com.ironsource.sdk.p286a.C8150a;
import com.ironsource.sdk.p286a.C8154d;
import com.ironsource.sdk.p286a.C8156f;
import com.ironsource.sdk.p294h.C8355c;
import com.ironsource.sdk.p298k.C8372b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.f */
final class C8192f {

    /* renamed from: a */
    long f19555a;

    /* renamed from: b */
    int f19556b;

    /* renamed from: c */
    int f19557c;

    /* renamed from: d */
    C8196b f19558d = C8196b.NONE;

    /* renamed from: e */
    private String f19559e;

    /* renamed from: f */
    private String f19560f;

    /* renamed from: g */
    private C8372b f19561g;

    /* renamed from: com.ironsource.sdk.controller.f$2 */
    static /* synthetic */ class C81942 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19563a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.controller.C8192f.C8195a.m23546a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19563a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.controller.C8192f.C8195a.f19564a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f19563a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.controller.C8192f.C8195a.f19565b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f19563a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.controller.C8192f.C8195a.f19566c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8192f.C81942.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$a */
    public enum C8195a {
        ;
        

        /* renamed from: a */
        public static final int f19564a = 1;

        /* renamed from: b */
        public static final int f19565b = 2;

        /* renamed from: c */
        public static final int f19566c = 3;

        static {
            f19567d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m23546a() {
            return (int[]) f19567d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$b */
    public enum C8196b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: g */
        int f19575g;

        private C8196b(int i) {
            this.f19575g = i;
        }
    }

    C8192f(JSONObject jSONObject, String str, String str2, C8372b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f19556b = optInt;
        this.f19557c = optInt != 1 ? optInt != 2 ? C8195a.f19564a : C8195a.f19566c : C8195a.f19565b;
        this.f19559e = str;
        this.f19560f = str2;
        this.f19561g = bVar;
    }

    /* renamed from: a */
    private void m23535a(C8355c cVar) {
        if (!this.f19561g.mo56882b()) {
            this.f19561g.mo56880a(cVar, this.f19560f);
        }
    }

    /* renamed from: g */
    private C8355c m23536g() {
        return new C8355c(this.f19559e, "next_mobileController.html");
    }

    /* renamed from: h */
    private C8355c m23537h() {
        return new C8355c(this.f19559e, "fallback_mobileController.html");
    }

    /* renamed from: i */
    private void m23538i() {
        try {
            C8355c d = mo56519d();
            if (d.exists()) {
                C8355c h = m23537h();
                if (h.exists()) {
                    h.delete();
                }
                IronSourceStorageUtils.renameFile(d.getPath(), h.getPath());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56515a(C8196b bVar) {
        C8150a a = new C8150a().mo56415a("generalmessage", Integer.valueOf(this.f19556b)).mo56415a("controllersource", Integer.valueOf(bVar.f19575g));
        if (this.f19555a > 0) {
            a.mo56415a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f19555a));
        }
        C8154d.m23442a(C8156f.f19437s, (Map<String, Object>) a.f19410a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56516a() {
        return this.f19558d != C8196b.NONE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo56517b() {
        C8355c cVar;
        int i = C81942.f19563a[this.f19557c - 1];
        if (i == 1) {
            IronSourceStorageUtils.deleteFile(mo56519d());
            cVar = new C8355c(this.f19559e, SDKUtils.getFileName(this.f19560f));
        } else if (i != 2) {
            if (i == 3) {
                try {
                    C8355c d = mo56519d();
                    C8355c g = m23536g();
                    if (!g.exists() && !d.exists()) {
                        m23535a(new C8355c(this.f19559e, SDKUtils.getFileName(this.f19560f)));
                        return false;
                    } else if (g.exists() || !d.exists()) {
                        m23538i();
                        if (IronSourceStorageUtils.renameFile(m23536g().getPath(), mo56519d().getPath())) {
                            C8196b bVar = C8196b.PREPARED_CONTROLLER_LOADED;
                            this.f19558d = bVar;
                            mo56515a(bVar);
                            mo56518c();
                            m23535a(new C8355c(this.f19559e, g.getName()));
                            return true;
                        } else if (mo56520e()) {
                            C8196b bVar2 = C8196b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f19558d = bVar2;
                            mo56515a(bVar2);
                            m23535a(new C8355c(this.f19559e, g.getName()));
                            return true;
                        } else {
                            m23535a(new C8355c(this.f19559e, SDKUtils.getFileName(this.f19560f)));
                        }
                    } else {
                        C8196b bVar3 = C8196b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f19558d = bVar3;
                        mo56515a(bVar3);
                        m23535a(new C8355c(this.f19559e, g.getName()));
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            m23538i();
            cVar = new C8355c(this.f19559e, SDKUtils.getFileName(this.f19560f));
        }
        m23535a(cVar);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo56518c() {
        IronSourceStorageUtils.deleteFile(m23537h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C8355c mo56519d() {
        return new C8355c(this.f19559e, "mobileController.html");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo56520e() {
        try {
            if (!m23537h().exists()) {
                return false;
            }
            return IronSourceStorageUtils.renameFile(m23537h().getPath(), mo56519d().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final JSONObject mo56521f() {
        return new JSONObject() {
            {
                putOpt("controllerSourceStrategy", Integer.valueOf(C8192f.this.f19556b));
                putOpt("controllerSourceCode", Integer.valueOf(C8192f.this.f19558d.f19575g));
            }
        };
    }
}
