package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2278a;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.same.report.a */
/* compiled from: DomainReport */
public class C8516a {

    /* renamed from: a */
    private static String f20635a = "DomainReport";

    /* renamed from: a */
    public static boolean m24599a(C2278a aVar, String str) {
        boolean z = false;
        if (aVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int aj = aVar.mo15471aj();
                    JSONArray p = aVar.mo15527p();
                    JSONArray q = aVar.mo15529q();
                    if (q != null) {
                        for (int i = 0; i < q.length(); i++) {
                            if (str.contains(q.getString(i))) {
                                return false;
                            }
                        }
                    }
                    if (aj == 2) {
                        if (p != null) {
                            for (int i2 = 0; i2 < p.length(); i2++) {
                                if (str.contains(p.getString(i2))) {
                                    return true;
                                }
                            }
                        }
                        return z;
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d(f20635a, e.getMessage());
                return true;
            }
        }
        z = true;
        return z;
    }
}
