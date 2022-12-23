package com.bytedance.sdk.component.p120e.p122b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.p104b.p105a.C2781a;
import com.bytedance.sdk.component.p104b.p105a.C2794b;
import com.bytedance.sdk.component.p104b.p105a.C2804c;
import com.bytedance.sdk.component.p104b.p105a.C2806e;
import com.bytedance.sdk.component.p104b.p105a.C2807f;
import com.bytedance.sdk.component.p104b.p105a.C2813i;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p124d.C2939d;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.e.b.b */
/* compiled from: GetExecutor */
public class C2916b extends C2918c {

    /* renamed from: a */
    public static final C2781a f6592a = new C2781a.C2782a().mo17465a().mo17466b();

    /* renamed from: b */
    public static final C2781a f6593b = new C2781a.C2782a().mo17466b();

    /* renamed from: g */
    private C2781a f6594g = f6592a;

    /* renamed from: h */
    private Map<String, String> f6595h = new HashMap();

    public C2916b(C2813i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public void mo17787a(String str, String str2) {
        if (str == null) {
            C2939d.m8275b("GetExecutor", "name cannot be null !!!");
        } else {
            this.f6595h.put(str, str2);
        }
    }

    /* renamed from: a */
    public void mo17786a(final C2912a aVar) {
        try {
            C2816k.C2817a aVar2 = new C2816k.C2817a();
            C2807f.C2808a aVar3 = new C2807f.C2808a();
            Uri parse = Uri.parse(this.f6602f);
            aVar3.mo17566a(parse.getScheme());
            aVar3.mo17568b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar3.mo17570c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    this.f6595h.put(next, parse.getQueryParameter(next));
                }
            }
            for (Map.Entry next2 : this.f6595h.entrySet()) {
                aVar3.mo17567a(URLEncoder.encode((String) next2.getKey(), "UTF-8"), URLEncoder.encode((String) next2.getValue(), "UTF-8"));
            }
            mo17788a(aVar2);
            aVar2.mo17590a(this.f6594g);
            aVar2.mo17593a((Object) mo17790b());
            this.f6599c.mo17476a(aVar2.mo17591a(aVar3.mo17569b()).mo17589a().mo17597b()).mo17469a(new C2804c() {
                /* renamed from: a */
                public void mo16081a(C2794b bVar, IOException iOException) {
                    C2912a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo17772a((C2918c) C2916b.this, iOException);
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
                            aVar.mo17771a((C2918c) C2916b.this, new C2913b(mVar.mo17499d(), mVar.mo17497c(), mVar.mo17500e(), hashMap, mVar.mo17501f().mo17506b(), mVar.mo17496b(), mVar.mo17493a()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            if (aVar != null) {
                aVar.mo17772a((C2918c) this, new IOException(th.getMessage()));
            }
        }
    }

    /* renamed from: a */
    public C2913b mo17785a() {
        try {
            C2816k.C2817a aVar = new C2816k.C2817a();
            C2807f.C2808a aVar2 = new C2807f.C2808a();
            Uri parse = Uri.parse(this.f6602f);
            aVar2.mo17566a(parse.getScheme());
            aVar2.mo17568b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar2.mo17570c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    this.f6595h.put(next, parse.getQueryParameter(next));
                }
            }
            for (Map.Entry next2 : this.f6595h.entrySet()) {
                aVar2.mo17567a(URLEncoder.encode((String) next2.getKey(), "UTF-8"), URLEncoder.encode((String) next2.getValue(), "UTF-8"));
            }
            mo17788a(aVar);
            aVar.mo17590a(this.f6594g);
            aVar.mo17593a((Object) mo17790b());
            C2820m a = this.f6599c.mo17476a(aVar.mo17591a(aVar2.mo17569b()).mo17589a().mo17597b()).mo17467a();
            if (a == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            C2806e g = a.mo17502g();
            if (g != null) {
                for (int i = 0; i < g.mo17553a(); i++) {
                    hashMap.put(g.mo17554a(i), g.mo17555b(i));
                }
            }
            return new C2913b(a.mo17499d(), a.mo17497c(), a.mo17500e(), hashMap, a.mo17501f().mo17506b(), a.mo17496b(), a.mo17493a());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
