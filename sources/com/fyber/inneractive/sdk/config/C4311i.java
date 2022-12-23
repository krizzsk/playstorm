package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C4236b;
import com.fyber.inneractive.sdk.network.C4543f0;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.fyber.inneractive.sdk.network.C4579u;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.config.i */
public class C4311i {

    /* renamed from: a */
    public final Context f10659a;

    /* renamed from: b */
    public C4310h f10660b = new C4310h();

    /* renamed from: c */
    public List<C4313b> f10661c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public boolean f10662d = false;

    /* renamed from: e */
    public final C4236b f10663e = new C4236b();

    /* renamed from: com.fyber.inneractive.sdk.config.i$a */
    public class C4312a implements C4579u<C4310h> {
        public C4312a() {
        }

        /* renamed from: a */
        public void mo24228a(Object obj, Exception exc, boolean z) {
            C4310h hVar = (C4310h) obj;
            if (hVar != null) {
                C4311i iVar = C4311i.this;
                iVar.getClass();
                if (!hVar.equals(iVar.f10660b)) {
                    iVar.f10662d = true;
                    iVar.f10660b = hVar;
                    for (C4313b onGlobalConfigChanged : iVar.f10661c) {
                        onGlobalConfigChanged.onGlobalConfigChanged(iVar, iVar.f10660b);
                    }
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.i$b */
    public interface C4313b {
        void onGlobalConfigChanged(C4311i iVar, C4310h hVar);
    }

    public C4311i(Context context) {
        this.f10659a = context;
    }

    /* renamed from: a */
    public C4310h mo24350a() {
        return this.f10660b;
    }

    /* renamed from: b */
    public void mo24351b() {
        C4543f0 f0Var = new C4543f0(new C4312a(), this.f10659a, this.f10663e);
        IAConfigManager.f10525J.f10555t.f11387a.offer(f0Var);
        f0Var.mo24717a(C4559m0.QUEUED);
    }
}
