package com.ironsource.p197a;

import android.net.Uri;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.p200d.C6393b;
import com.ironsource.p200d.C6396c;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.a.b */
public final class C6377b {

    /* renamed from: a */
    C6375a f16222a;

    /* renamed from: b */
    private C6379c f16223b;

    /* renamed from: c */
    private C6380d f16224c;

    /* renamed from: d */
    private ExecutorService f16225d;

    public C6377b(C6375a aVar, C6379c cVar) {
        if (aVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        } else if (aVar.f16213d != null) {
            this.f16222a = aVar;
            this.f16223b = cVar;
            this.f16224c = aVar.f16213d;
            this.f16225d = Executors.newSingleThreadExecutor();
        } else {
            throw new InvalidParameterException("Null formatter not supported ");
        }
    }

    /* renamed from: a */
    private static void m19163a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo35769a(String str) {
        if (this.f16222a.f16214e) {
            Log.d("EventsTracker", str);
        }
    }

    /* renamed from: a */
    public final void mo35770a(String str, Map<String, Object> map) {
        mo35769a(String.format(Locale.ENGLISH, "%s %s", new Object[]{str, map.toString()}));
        if (this.f16222a.f16211b && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            m19163a((Map<String, Object>) hashMap, this.f16223b.mo35772a());
            m19163a((Map<String, Object>) hashMap, map);
            final String a = this.f16224c.mo35773a(hashMap);
            this.f16225d.submit(new Runnable() {
                public final void run() {
                    try {
                        C6396c cVar = new C6396c();
                        ArrayList arrayList = new ArrayList(C6377b.this.f16222a.f16215f);
                        if (ShareTarget.METHOD_POST.equals(C6377b.this.f16222a.f16212c)) {
                            cVar = C6393b.m19186a(C6377b.this.f16222a.f16210a, a, arrayList);
                        } else if (ShareTarget.METHOD_GET.equals(C6377b.this.f16222a.f16212c)) {
                            String str = C6377b.this.f16222a.f16210a;
                            String str2 = a;
                            Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                            C6393b.C6394a.C6395a aVar = new C6393b.C6394a.C6395a();
                            aVar.f16249b = build.toString();
                            aVar.f16251d = str2;
                            aVar.f16250c = ShareTarget.METHOD_GET;
                            aVar.mo35892a(arrayList);
                            cVar = C6393b.m19185a(aVar.mo35893a());
                        }
                        C6377b bVar = C6377b.this;
                        bVar.mo35769a("response status code: " + cVar.f16255a);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
