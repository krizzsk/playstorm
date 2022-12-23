package com.fyber.inneractive.sdk.config;

import android.content.Context;
import java.io.Serializable;

/* renamed from: com.fyber.inneractive.sdk.config.k */
public class C4315k implements C4340t {

    /* renamed from: a */
    public Context f10666a;

    /* renamed from: b */
    public C4318c f10667b = new C4318c();

    /* renamed from: com.fyber.inneractive.sdk.config.k$b */
    public static class C4317b {

        /* renamed from: a */
        public static C4315k f10668a = new C4315k();
    }

    /* renamed from: com.fyber.inneractive.sdk.config.k$c */
    public static class C4318c implements Serializable {
        public static final long serialVersionUID = 2;

        /* renamed from: a */
        public String f10669a;

        /* renamed from: b */
        public boolean f10670b;

        /* renamed from: c */
        public boolean f10671c;

        public C4318c() {
        }
    }

    /* renamed from: a */
    public static String m13546a() {
        C4318c cVar = C4317b.f10668a.f10667b;
        if (cVar != null) {
            return cVar.f10669a;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m13547b() {
        C4318c cVar = C4317b.f10668a.f10667b;
        if (cVar != null) {
            return cVar.f10671c;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m13548c() {
        C4318c cVar = C4317b.f10668a.f10667b;
        if (cVar != null) {
            return cVar.f10670b;
        }
        return false;
    }
}
