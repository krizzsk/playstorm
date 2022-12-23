package com.bytedance.sdk.component.p104b.p105a.p106a.p107a;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.bytedance.sdk.component.p104b.p105a.C2794b;
import com.bytedance.sdk.component.p104b.p105a.C2804c;
import com.bytedance.sdk.component.p104b.p105a.C2805d;
import com.bytedance.sdk.component.p104b.p105a.C2810g;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.a */
/* compiled from: NetCall */
public class C2784a implements C2794b {

    /* renamed from: c */
    private static AtomicBoolean f6264c = new AtomicBoolean(false);

    /* renamed from: a */
    C2816k f6265a;

    /* renamed from: b */
    C2805d f6266b;

    C2784a(C2816k kVar, C2805d dVar) {
        this.f6265a = kVar;
        this.f6266b = dVar;
    }

    /* renamed from: a */
    public C2820m mo17467a() throws IOException {
        this.f6266b.mo17481c().remove(this);
        this.f6266b.mo17482d().add(this);
        if (this.f6266b.mo17481c().size() + this.f6266b.mo17482d().size() > this.f6266b.mo17478a() || f6264c.get()) {
            this.f6266b.mo17482d().remove(this);
            return null;
        } else if (this.f6265a.f6352a == null || this.f6265a.f6352a.f6332a == null || this.f6265a.f6352a.f6332a.size() <= 0) {
            return mo17468a(this.f6265a);
        } else {
            ArrayList arrayList = new ArrayList(this.f6265a.f6352a.f6332a);
            arrayList.add(new C2810g() {
                /* renamed from: a */
                public C2820m mo17472a(C2810g.C2811a aVar) throws IOException {
                    return C2784a.this.mo17468a(aVar.mo17474a());
                }
            });
            return ((C2810g) arrayList.get(0)).mo17472a(new C2787b(arrayList, this.f6265a));
        }
    }

    /* renamed from: a */
    public C2820m mo17468a(C2816k kVar) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(kVar.mo17583b().mo17556a().toString()).openConnection();
            if (kVar.mo17585d() != null && kVar.mo17585d().size() > 0) {
                for (Map.Entry next : kVar.mo17585d().entrySet()) {
                    for (String addRequestProperty : (List) next.getValue()) {
                        httpURLConnection.addRequestProperty((String) next.getKey(), addRequestProperty);
                    }
                }
            }
            if (kVar.mo17587f() == null) {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            } else {
                if (!m7591c() && kVar.mo17587f().f6360a != null && !TextUtils.isEmpty(kVar.mo17587f().f6360a.mo17573a())) {
                    httpURLConnection.addRequestProperty("Content-Type", kVar.mo17587f().f6360a.mo17573a());
                }
                httpURLConnection.setRequestMethod(kVar.mo17584c());
                if (ShareTarget.METHOD_POST.equalsIgnoreCase(kVar.mo17584c())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(kVar.mo17587f().f6361b.getBytes());
                    outputStream.flush();
                    outputStream.close();
                }
            }
            if (kVar.f6352a != null) {
                if (kVar.f6352a.f6334c != null) {
                    httpURLConnection.setConnectTimeout((int) kVar.f6352a.f6334c.toMillis(kVar.f6352a.f6333b));
                }
                if (kVar.f6352a.f6334c != null) {
                    httpURLConnection.setReadTimeout((int) kVar.f6352a.f6336e.toMillis(kVar.f6352a.f6335d));
                }
            }
            httpURLConnection.connect();
            if (f6264c.get()) {
                httpURLConnection.disconnect();
                this.f6266b.mo17482d().remove(this);
                return null;
            }
            C2792f fVar = new C2792f(httpURLConnection, kVar);
            this.f6266b.mo17482d().remove(this);
            return fVar;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.f6266b.mo17482d().remove(this);
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m7591c() {
        if (this.f6265a.mo17585d() == null) {
            return false;
        }
        return this.f6265a.mo17585d().containsKey("Content-Type");
    }

    /* renamed from: a */
    public void mo17469a(final C2804c cVar) {
        this.f6266b.mo17480b().submit(new Runnable() {
            public void run() {
                try {
                    C2820m a = C2784a.this.mo17467a();
                    if (a == null) {
                        cVar.mo16081a((C2794b) C2784a.this, new IOException("response is null"));
                    } else {
                        cVar.mo16080a((C2794b) C2784a.this, a);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    cVar.mo16081a((C2794b) C2784a.this, e);
                }
            }
        });
    }

    /* renamed from: b */
    public C2794b clone() {
        return new C2784a(this.f6265a, this.f6266b);
    }
}
