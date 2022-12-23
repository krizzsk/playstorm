package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.controller.c */
/* compiled from: NativeVideoTrackingReport */
public class C8769c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f21355a = C8769c.class.getName();

    /* renamed from: a */
    public static void m25500a(Context context, String str) {
        if (context != null) {
            try {
                C2385p a = C2385p.m5777a((C2374f) C2376g.m5723a(context));
                if (!TextUtils.isEmpty(str) && a != null && a.mo15933a() > 0) {
                    List<C8412m> a2 = a.mo15935a("2000022");
                    List<C8412m> a3 = a.mo15935a("2000021");
                    List<C8412m> a4 = a.mo15935a("2000043");
                    String a5 = C8412m.m24224a(a3);
                    String b = C8412m.m24226b(a2);
                    String c = C8412m.m24228c(a4);
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(a5)) {
                        sb.append(a5);
                    }
                    if (!TextUtils.isEmpty(b)) {
                        sb.append(b);
                    }
                    if (!TextUtils.isEmpty(c)) {
                        sb.append(c);
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        String sb2 = sb.toString();
                        if (context != null && !TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(str)) {
                            try {
                                new C8540a(context).mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(sb2, context, str), new C8541b() {
                                    /* renamed from: a */
                                    public final void mo15651a(String str) {
                                        C8608u.m24884d(C8769c.f21355a, str);
                                    }

                                    /* renamed from: b */
                                    public final void mo15652b(String str) {
                                        C8608u.m24884d(C8769c.f21355a, str);
                                    }
                                });
                            } catch (Exception e) {
                                e.printStackTrace();
                                C8608u.m24884d(f21355a, e.getMessage());
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
