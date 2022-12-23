package com.fyber.inneractive.sdk.network;

import android.os.Build;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.g0 */
public class C4545g0 extends C4540e0<String> {

    /* renamed from: g */
    public String f11236g;

    /* renamed from: h */
    public final String f11237h;

    /* renamed from: i */
    public final AtomicInteger f11238i = new AtomicInteger();

    public C4545g0(C4579u<String> uVar, String str, String str2, C4544g gVar) {
        super(uVar, gVar);
        this.f11237h = str;
        this.f11236g = str2;
        this.f11225c = gVar;
    }

    /* renamed from: a */
    public String mo24715a() {
        return this.f11237h;
    }

    /* renamed from: f */
    public C4557l0 mo24722f() {
        return C4557l0.LOW;
    }

    /* renamed from: j */
    public boolean mo24726j() {
        return this.f11238i.getAndIncrement() < 4;
    }

    /* renamed from: n */
    public C4586y mo24730n() {
        return C4586y.f11396b;
    }

    /* renamed from: p */
    public int mo24731p() {
        return ((int) Math.pow(2.0d, (double) this.f11238i.get())) * 1000;
    }

    /* renamed from: a */
    public C4530a0 mo24713a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            C4530a0 a0Var = new C4530a0();
            a0Var.f11197a = String.valueOf(i);
            return a0Var;
        } catch (Exception e) {
            IAlog.m16698a("failed parse event network request", e, new Object[0]);
            throw new C4587z(e);
        }
    }

    /* renamed from: k */
    public byte[] mo24727k() {
        byte[] bArr;
        try {
            IAlog.m16699a("NetworkRequestEvent: network request body %s", this.f11236g);
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = this.f11236g.getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = this.f11236g.getBytes("UTF-8");
            }
            return bArr;
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
