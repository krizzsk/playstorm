package com.bytedance.sdk.component.p110d.p113c;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.p110d.C2829b;
import com.bytedance.sdk.component.p110d.C2835c;
import com.bytedance.sdk.component.p110d.C2877d;
import com.bytedance.sdk.component.p110d.C2899k;
import com.bytedance.sdk.component.p110d.C2900l;
import com.bytedance.sdk.component.p110d.C2903o;
import com.bytedance.sdk.component.p110d.C2904p;
import com.bytedance.sdk.component.p110d.C2905q;
import com.bytedance.sdk.component.p110d.p111a.C2826b;
import com.bytedance.sdk.component.p110d.p111a.C2828c;
import com.bytedance.sdk.component.p110d.p112b.C2831b;
import com.bytedance.sdk.component.p110d.p113c.p114a.C2837a;
import com.bytedance.sdk.component.p110d.p113c.p114a.p115a.C2845b;
import com.bytedance.sdk.component.p110d.p113c.p114a.p116b.C2850a;
import com.bytedance.sdk.component.p110d.p113c.p114a.p116b.C2856e;
import com.bytedance.sdk.component.p110d.p113c.p117b.C2859a;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.d.c.f */
/* compiled from: LoadFactory */
public class C2874f {

    /* renamed from: a */
    private Map<String, List<C2860c>> f6538a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C2900l f6539b;

    /* renamed from: c */
    private Map<String, C2904p> f6540c = new HashMap();

    /* renamed from: d */
    private Map<String, C2905q> f6541d = new HashMap();

    /* renamed from: e */
    private Map<String, C2835c> f6542e = new HashMap();

    /* renamed from: f */
    private C2877d f6543f;

    /* renamed from: g */
    private C2899k f6544g;

    /* renamed from: h */
    private ExecutorService f6545h;

    /* renamed from: i */
    private C2903o f6546i;

    public C2874f(Context context, C2900l lVar) {
        this.f6539b = (C2900l) C2876h.m8052a(lVar);
        C2837a.m7816a(context, lVar.mo17737h());
    }

    /* renamed from: a */
    public Collection<C2905q> mo17745a() {
        return this.f6541d.values();
    }

    /* renamed from: b */
    public Collection<C2835c> mo17747b() {
        return this.f6542e.values();
    }

    /* renamed from: a */
    public C2904p mo17744a(C2829b bVar) {
        if (bVar == null) {
            bVar = C2837a.m7817f();
        }
        String file = bVar.mo17609e().toString();
        C2904p pVar = this.f6540c.get(file);
        if (pVar != null) {
            return pVar;
        }
        C2904p d = m8032d(bVar);
        this.f6540c.put(file, d);
        return d;
    }

    /* renamed from: d */
    private C2904p m8032d(C2829b bVar) {
        C2904p d = this.f6539b.mo17733d();
        if (d != null) {
            return C2850a.m7887a(d);
        }
        return C2850a.m7886a(bVar.mo17606b());
    }

    /* renamed from: b */
    public C2905q mo17746b(C2829b bVar) {
        if (bVar == null) {
            bVar = C2837a.m7817f();
        }
        String file = bVar.mo17609e().toString();
        C2905q qVar = this.f6541d.get(file);
        if (qVar != null) {
            return qVar;
        }
        C2905q e = m8033e(bVar);
        this.f6541d.put(file, e);
        return e;
    }

    /* renamed from: e */
    private C2905q m8033e(C2829b bVar) {
        C2905q e = this.f6539b.mo17734e();
        if (e != null) {
            return e;
        }
        return C2856e.m7911a(bVar.mo17606b());
    }

    /* renamed from: c */
    public C2835c mo17748c(C2829b bVar) {
        if (bVar == null) {
            bVar = C2837a.m7817f();
        }
        String file = bVar.mo17609e().toString();
        C2835c cVar = this.f6542e.get(file);
        if (cVar != null) {
            return cVar;
        }
        C2835c f = m8034f(bVar);
        this.f6542e.put(file, f);
        return f;
    }

    /* renamed from: a */
    public C2835c mo17743a(String str) {
        return mo17748c(C2837a.m7815a(new File(str)));
    }

    /* renamed from: f */
    private C2835c m8034f(C2829b bVar) {
        C2835c f = this.f6539b.mo17735f();
        if (f != null) {
            return f;
        }
        return new C2845b(bVar.mo17609e(), bVar.mo17605a(), mo17751e());
    }

    /* renamed from: c */
    public C2877d mo17749c() {
        if (this.f6543f == null) {
            this.f6543f = m8035h();
        }
        return this.f6543f;
    }

    /* renamed from: h */
    private C2877d m8035h() {
        C2877d c = this.f6539b.mo17732c();
        return c == null ? C2831b.m7797a() : c;
    }

    /* renamed from: d */
    public C2899k mo17750d() {
        if (this.f6544g == null) {
            this.f6544g = m8036i();
        }
        return this.f6544g;
    }

    /* renamed from: i */
    private C2899k m8036i() {
        C2899k a = this.f6539b.mo17730a();
        if (a != null) {
            return a;
        }
        return C2826b.m7784a();
    }

    /* renamed from: e */
    public ExecutorService mo17751e() {
        if (this.f6545h == null) {
            this.f6545h = m8037j();
        }
        return this.f6545h;
    }

    /* renamed from: j */
    private ExecutorService m8037j() {
        ExecutorService b = this.f6539b.mo17731b();
        if (b != null) {
            return b;
        }
        return C2828c.m7788a();
    }

    /* renamed from: f */
    public Map<String, List<C2860c>> mo17752f() {
        return this.f6538a;
    }

    /* renamed from: a */
    public C2859a mo17742a(C2860c cVar) {
        ImageView.ScaleType d = cVar.mo17691d();
        if (d == null) {
            d = C2859a.f6453a;
        }
        Bitmap.Config h = cVar.mo17695h();
        if (h == null) {
            h = C2859a.f6454b;
        }
        return new C2859a(cVar.mo17688b(), cVar.mo17690c(), d, h);
    }

    /* renamed from: g */
    public C2903o mo17753g() {
        if (this.f6546i == null) {
            this.f6546i = m8038k();
        }
        return this.f6546i;
    }

    /* renamed from: k */
    private C2903o m8038k() {
        C2903o g = this.f6539b.mo17736g();
        return g == null ? new C2875g() : g;
    }
}
