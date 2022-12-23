package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C4235a;
import com.fyber.inneractive.sdk.cache.C4242h;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C4577t;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.f0 */
public class C4543f0<T> extends C4540e0<T> {

    /* renamed from: g */
    public final Context f11233g;

    /* renamed from: h */
    public final C4235a<T> f11234h;

    /* renamed from: i */
    public C4577t<T> f11235i;

    public C4543f0(C4579u<T> uVar, Context context, C4235a<T> aVar) {
        super(uVar, C4580v.m14056b().mo24773a());
        this.f11233g = context;
        this.f11234h = aVar;
    }

    /* renamed from: a */
    public C4530a0 mo24713a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        C4530a0 a0Var = new C4530a0();
        try {
            String stringBuffer = C5370s.m16788a(inputStream, false).toString();
            a0Var.f11197a = this.f11234h.mo24240a(stringBuffer);
            a0Var.f11198b = stringBuffer;
            return a0Var;
        } catch (Exception e) {
            IAlog.m16698a("failed parse cacheable network request", e, new Object[0]);
            if (e instanceof InvalidAppIdException) {
                throw e;
            }
            throw new C4587z(e);
        }
    }

    /* renamed from: c */
    public String mo24720c() {
        return this.f11234h.mo24244c();
    }

    /* renamed from: f */
    public C4557l0 mo24722f() {
        return C4557l0.LOW;
    }

    /* renamed from: g */
    public C4529a<T> mo24723g() {
        C4242h hVar;
        Context context = this.f11233g;
        C4235a<T> aVar = this.f11234h;
        C4577t<T> tVar = new C4577t<>(context, aVar);
        this.f11235i = tVar;
        try {
            if (!aVar.mo24245d()) {
                hVar = new C4242h(new C4577t.C4578a());
            } else {
                ResultData a = tVar.f11382b.mo24240a(tVar.mo24771a(tVar.f11382b.mo24244c()));
                if (tVar.f11383c == null) {
                    tVar.f11383c = context.getSharedPreferences("IAConfigurationPreferences", 0);
                }
                hVar = new C4242h(a, tVar.f11383c.getString(tVar.f11382b.mo24243b(), (String) null));
            }
        } catch (Exception e) {
            if (tVar.f11383c == null) {
                tVar.f11383c = tVar.f11381a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.f11383c.edit().remove(tVar.f11382b.mo24243b()).apply();
            hVar = new C4242h(e);
        }
        return new C4529a<>(hVar.f10490b, hVar.f10489a, this.f11234h.mo24244c());
    }

    /* renamed from: j */
    public boolean mo24726j() {
        return false;
    }

    /* renamed from: n */
    public C4586y mo24730n() {
        return C4586y.f11398d;
    }

    /* renamed from: p */
    public int mo24731p() {
        return 0;
    }

    /* renamed from: a */
    public String mo24715a() {
        return this.f11234h.mo24241a();
    }

    /* renamed from: a */
    public void mo24716a(C4530a0 a0Var, String str, String str2) {
        C4577t<T> tVar = this.f11235i;
        if (tVar != null) {
            if (tVar.f11383c == null) {
                tVar.f11383c = tVar.f11381a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.f11383c.edit().putString(tVar.f11382b.mo24243b(), str2).apply();
            if (!a0Var.f11198b.isEmpty() && !str.isEmpty()) {
                if (!this.f11235i.mo24772a(str, a0Var.f11198b)) {
                    IAlog.m16700b("Failed to cache file", new Object[0]);
                } else {
                    this.f11234h.mo24242a(a0Var.f11197a);
                }
            }
        }
    }
}
