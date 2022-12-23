package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.C1176b;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1301l;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1312r;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.h */
public class C1370h {

    /* renamed from: a */
    private Context f1432a;

    /* renamed from: b */
    private HashMap<String, Long> f1433b = null;

    /* renamed from: c */
    private int f1434c = 50;

    /* renamed from: d */
    private int f1435d = 100;

    public C1370h(Context context) {
        this.f1432a = context;
        this.f1433b = m2197c();
        m2196b();
    }

    /* renamed from: a */
    private void m2195a(File file) {
        File g = C1308o.m1852g(this.f1432a);
        file.renameTo(new File(g, String.valueOf(System.currentTimeMillis())));
        String[] list = g.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g, list[0]).delete();
        }
    }

    /* renamed from: b */
    private void m2196b() {
        this.f1434c = C1341a.m2034a(this.f1434c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f1435d = C1341a.m2034a(this.f1435d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    /* renamed from: c */
    private HashMap<String, Long> m2197c() {
        File h = C1308o.m1855h(this.f1432a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray b = C1298i.m1780b(h.getAbsolutePath());
            if (C1301l.m1803a(b)) {
                return hashMap;
            }
            Long decode = Long.decode(b.optString(0, (String) null));
            if (System.currentTimeMillis() - decode.longValue() > 86400000) {
                m2195a(h);
                return hashMap;
            }
            hashMap.put("time", decode);
            for (int i = 1; i < b.length(); i++) {
                String[] split = b.optString(i, "").split(" ");
                if (split.length == 2) {
                    hashMap.put(split[0], Long.decode(split[1]));
                }
            }
            return hashMap;
        } catch (IOException unused) {
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public void mo12503a() {
        HashMap<String, Long> hashMap = this.f1433b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(remove);
        sb.append(10);
        for (Map.Entry next : hashMap.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(' ');
            sb.append(next.getValue());
            sb.append(10);
        }
        try {
            C1298i.m1769a(C1308o.m1855h(this.f1432a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public boolean mo12504a(String str) {
        if (str == null) {
            str = "default";
        }
        return C1312r.m1880a(this.f1433b, str, 1L).longValue() < ((long) this.f1434c) && C1312r.m1880a(this.f1433b, TtmlNode.COMBINE_ALL, 1L).longValue() < ((long) this.f1435d);
    }
}
