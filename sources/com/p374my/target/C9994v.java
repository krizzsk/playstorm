package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9670e;
import java.util.Map;

/* renamed from: com.my.target.v */
public class C9994v extends C9670e.C9671a {
    /* renamed from: b */
    public static C9994v m29519b() {
        return new C9994v();
    }

    /* renamed from: b */
    public int mo63917b(C9596a aVar, Context context) {
        return C9993u8.m29506a(context).mo65565a();
    }

    /* renamed from: c */
    public Map<String, String> mo63918c(C9596a aVar, Context context) {
        Map<String, String> c = super.mo63918c(aVar, context);
        Map<String, String> snapshot = C9997v2.m29553d().snapshot();
        if (snapshot != null && snapshot.size() > 0) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (String next : snapshot.keySet()) {
                if (z) {
                    sb.append(",");
                } else {
                    z = true;
                }
                sb.append(next);
            }
            String sb2 = sb.toString();
            c.put("exb", sb2);
            C9672e0.m27882a("Exclude list: " + sb2);
        }
        return c;
    }
}
