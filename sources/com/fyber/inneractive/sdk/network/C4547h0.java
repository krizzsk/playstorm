package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.h0 */
public class C4547h0 extends C4540e0<String> {

    /* renamed from: g */
    public final String f11239g;

    /* renamed from: h */
    public final AtomicInteger f11240h;

    public C4547h0(C4579u<String> uVar, String str) {
        this(uVar, str, C4580v.m14056b().mo24773a());
    }

    /* renamed from: a */
    public String mo24715a() {
        return this.f11239g;
    }

    /* renamed from: f */
    public C4557l0 mo24722f() {
        return C4557l0.LOW;
    }

    /* renamed from: j */
    public boolean mo24726j() {
        return this.f11240h.getAndIncrement() < 4;
    }

    /* renamed from: n */
    public C4586y mo24730n() {
        return C4586y.f11398d;
    }

    /* renamed from: p */
    public int mo24731p() {
        return ((int) Math.pow(2.0d, (double) this.f11240h.get())) * 1000;
    }

    public C4547h0(C4579u<String> uVar, String str, C4544g gVar) {
        super(uVar, gVar);
        this.f11240h = new AtomicInteger();
        this.f11239g = str;
    }

    /* renamed from: a */
    public C4530a0 mo24713a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            C4530a0 a0Var = new C4530a0();
            a0Var.f11197a = String.valueOf(i);
            if (inputStream != null) {
                a0Var.f11198b = C5370s.m16788a(inputStream, false).toString();
            }
            return a0Var;
        } catch (Exception e) {
            IAlog.m16698a("failed parse hit network request", e, new Object[0]);
            throw new C4587z(e);
        }
    }
}
