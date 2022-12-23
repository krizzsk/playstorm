package com.bytedance.sdk.component.p120e.p122b;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.p104b.p105a.C2794b;
import com.bytedance.sdk.component.p104b.p105a.C2804c;
import com.bytedance.sdk.component.p104b.p105a.C2806e;
import com.bytedance.sdk.component.p104b.p105a.C2812h;
import com.bytedance.sdk.component.p104b.p105a.C2813i;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import com.bytedance.sdk.component.p104b.p105a.C2819l;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p124d.C2939d;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.e.b.d */
/* compiled from: PostExecutor */
public class C2919d extends C2918c {

    /* renamed from: a */
    C2819l f6603a = null;

    public C2919d(C2813i iVar) {
        super(iVar);
    }

    /* renamed from: c */
    public void mo17799c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.f6603a = C2819l.m7762a(C2812h.m7728a("application/json; charset=utf-8"), str);
    }

    /* renamed from: a */
    public void mo17798a(JSONObject jSONObject) {
        this.f6603a = C2819l.m7762a(C2812h.m7728a("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    /* renamed from: a */
    public void mo17797a(final C2912a aVar) {
        try {
            C2816k.C2817a aVar2 = new C2816k.C2817a();
            if (TextUtils.isEmpty(this.f6602f)) {
                aVar.mo17772a((C2918c) this, new IOException("Url is Empty"));
                return;
            }
            aVar2.mo17594a(this.f6602f);
            if (this.f6603a != null) {
                mo17788a(aVar2);
                aVar2.mo17593a((Object) mo17790b());
                this.f6599c.mo17476a(aVar2.mo17592a(this.f6603a).mo17597b()).mo17469a(new C2804c() {
                    /* renamed from: a */
                    public void mo16081a(C2794b bVar, IOException iOException) {
                        C2912a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo17772a((C2918c) C2919d.this, iOException);
                        }
                    }

                    /* renamed from: a */
                    public void mo16080a(C2794b bVar, C2820m mVar) throws IOException {
                        if (aVar != null) {
                            HashMap hashMap = new HashMap();
                            if (mVar != null) {
                                C2806e g = mVar.mo17502g();
                                if (g != null) {
                                    for (int i = 0; i < g.mo17553a(); i++) {
                                        hashMap.put(g.mo17554a(i), g.mo17555b(i));
                                    }
                                }
                                aVar.mo17771a((C2918c) C2919d.this, new C2913b(mVar.mo17499d(), mVar.mo17497c(), mVar.mo17500e(), hashMap, mVar.mo17501f().mo17506b(), mVar.mo17496b(), mVar.mo17493a()));
                            }
                        }
                    }
                });
            } else if (aVar != null) {
                aVar.mo17772a((C2918c) this, new IOException("RequestBody is null, content type is not support!!"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            aVar.mo17772a((C2918c) this, new IOException(th.getMessage()));
        }
    }

    /* renamed from: a */
    public C2913b mo17796a() {
        try {
            C2816k.C2817a aVar = new C2816k.C2817a();
            if (TextUtils.isEmpty(this.f6602f)) {
                C2939d.m8275b("PostExecutor", "execute: Url is Empty");
                return null;
            }
            aVar.mo17594a(this.f6602f);
            if (this.f6603a == null) {
                C2939d.m8275b("PostExecutor", "RequestBody is null, content type is not support!!");
                return null;
            }
            mo17788a(aVar);
            aVar.mo17593a((Object) mo17790b());
            C2820m a = this.f6599c.mo17476a(aVar.mo17592a(this.f6603a).mo17597b()).mo17467a();
            if (a != null) {
                HashMap hashMap = new HashMap();
                C2806e g = a.mo17502g();
                if (g != null) {
                    for (int i = 0; i < g.mo17553a(); i++) {
                        hashMap.put(g.mo17554a(i), g.mo17555b(i));
                    }
                    return new C2913b(a.mo17499d(), a.mo17497c(), a.mo17500e(), hashMap, a.mo17501f().mo17506b(), a.mo17496b(), a.mo17493a());
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
