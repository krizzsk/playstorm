package com.mbridge.msdk.mbbid.common.p330c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;

/* renamed from: com.mbridge.msdk.mbbid.common.c.a */
/* compiled from: BidReport */
public class C8727a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f21159a = C8727a.class.getName();

    /* renamed from: a */
    public static void m25333a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("key=");
                sb.append("2000064");
                sb.append("&");
                sb.append("result=");
                sb.append("1");
                sb.append("&");
                sb.append("network_type=");
                sb.append(C8596q.m24849n(context));
                sb.append("&");
                sb.append("bidid=");
                sb.append(str2);
                if (C8518b.m24607a().mo57681c()) {
                    C8518b.m24607a().mo57679a(sb.toString());
                    return;
                }
                new C8540a(context).mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(sb.toString(), context, str), new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C8727a.f21159a, str);
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C8608u.m24884d(C8727a.f21159a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f21159a, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m25334b(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C8540a(context).mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a("key=" + "2000064" + "&" + "result=" + "2" + "&" + "network_type=" + C8596q.m24849n(context) + "&" + "reason=" + str2, context, str), new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C8727a.f21159a, str);
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C8608u.m24884d(C8727a.f21159a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f21159a, e.getMessage());
            }
        }
    }
}
