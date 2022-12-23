package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8595p;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8610w;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;

/* renamed from: com.mbridge.msdk.mbbid.common.a */
/* compiled from: AreaBidCommon */
public final class C8720a {
    /* renamed from: a */
    public static String m25310a(Context context, String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (C2350a.m5601e().mo15792g() == null) {
                    C2350a.m5601e().mo15785b(context);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b == null) {
            b = C2283b.m5275a().mo15562b();
        }
        stringBuffer.append(C8596q.m24839i());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C8596q.m24825c());
        stringBuffer.append("|");
        stringBuffer.append(C8596q.m24822b());
        stringBuffer.append("|");
        stringBuffer.append(C8596q.m24849n(context));
        stringBuffer.append("|");
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append("|");
        stringBuffer.append(C8596q.m24837h(context));
        stringBuffer.append("x");
        stringBuffer.append(C8596q.m24838i(context));
        stringBuffer.append("|");
        stringBuffer.append(C8596q.m24829d());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C8613y.m24915a(20));
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(C8413a.f20319a);
        stringBuffer.append("|");
        stringBuffer.append(C8596q.m24850o());
        stringBuffer.append("|");
        stringBuffer.append(C8596q.m24848n());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C8610w.m24893b());
        stringBuffer.append("|");
        stringBuffer.append(C8610w.m24890a());
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C2338a.m5535a().mo15735b("b"));
        stringBuffer.append("|");
        stringBuffer.append(C2338a.m5535a().mo15735b("c"));
        stringBuffer.append("|");
        stringBuffer.append("");
        if (b != null) {
            str2 = b.mo15493c();
        } else {
            str2 = "";
        }
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(C8613y.m24937c());
        stringBuffer.append("|");
        String d = C8613y.m24942d();
        if (TextUtils.isEmpty(d)) {
            d = "";
        }
        stringBuffer.append(d);
        stringBuffer.append("|");
        stringBuffer.append(C8613y.m24955j(str));
        stringBuffer.append("|");
        stringBuffer.append("");
        return C8595p.m24814a(stringBuffer.toString());
    }
}
