package com.bytedance.sdk.openadsdk.core.p156j.p160c;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p156j.p157a.C3540a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c.c */
/* compiled from: VastMacroHelper */
public class C3565c {

    /* renamed from: a */
    private final List<String> f8958a;

    /* renamed from: b */
    private final Map<C3564b, String> f8959b;

    public C3565c(List<String> list) {
        this.f8958a = list;
        HashMap hashMap = new HashMap();
        this.f8959b = hashMap;
        hashMap.put(C3564b.CACHEBUSTING, m11142b());
    }

    /* renamed from: a */
    public List<String> mo20033a() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f8958a) {
            if (!TextUtils.isEmpty(next)) {
                for (C3564b bVar : C3564b.values()) {
                    String str = this.f8959b.get(bVar);
                    if (str == null) {
                        str = "";
                    }
                    next = next.replaceAll("\\[" + bVar.name() + "\\]", str);
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C3565c mo20031a(C3540a aVar) {
        if (aVar != null) {
            this.f8959b.put(C3564b.ERRORCODE, aVar.mo19998a());
        }
        return this;
    }

    /* renamed from: a */
    public C3565c mo20030a(long j) {
        if (j >= 0) {
            String b = m11143b(j);
            if (!TextUtils.isEmpty(b)) {
                this.f8959b.put(C3564b.CONTENTPLAYHEAD, b);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C3565c mo20032a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.f8959b.put(C3564b.ASSETURI, str);
        }
        return this;
    }

    /* renamed from: b */
    private String m11142b() {
        return String.format(Locale.US, "%08d", new Object[]{Long.valueOf(Math.round(Math.random() * 1.0E8d))});
    }

    /* renamed from: b */
    private String m11143b(long j) {
        return String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(j % 1000)});
    }
}
