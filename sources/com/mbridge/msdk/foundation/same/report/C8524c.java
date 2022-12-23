package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p304f.C8440a;
import com.mbridge.msdk.foundation.tools.C8596q;

/* renamed from: com.mbridge.msdk.foundation.same.report.c */
/* compiled from: PlayableReportUtils */
public final class C8524c {

    /* renamed from: a */
    private static Handler f20662a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m24634a(CampaignEx campaignEx, String str, String str2, String str3) {
        if (campaignEx != null && campaignEx.isMraid()) {
            int i = 1;
            if (!(!TextUtils.isEmpty(campaignEx.getMraid()))) {
                i = 3;
            }
            C8412m mVar = new C8412m("2000043", i, "0", "", campaignEx.getId(), str2, str, String.valueOf(campaignEx.getKeyIaRst()));
            mVar.mo57469n(campaignEx.getId());
            mVar.mo57463k(campaignEx.getRequestId());
            mVar.mo57465l(campaignEx.getRequestIdNotice());
            mVar.mo57442b(campaignEx.getAdSpaceT());
            mVar.mo57457h(str3);
            mVar.mo57445c(C8596q.m24849n(C2350a.m5601e().mo15792g()));
            mVar.mo57439a(campaignEx.isMraid() ? C8412m.f20281a : C8412m.f20282b);
            m24636a(mVar, str2);
        }
    }

    /* renamed from: a */
    public static void m24636a(C8412m mVar, String str) {
        if (mVar != null) {
            mVar.mo57443b(C8596q.m24839i());
            String d = C8412m.m24229d(mVar);
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(d);
            } else {
                m24638a(d, C2350a.m5601e().mo15792g(), str);
            }
        }
    }

    /* renamed from: a */
    public static void m24635a(C8412m mVar, Context context, String str) {
        if (mVar != null) {
            mVar.mo57471o("2000060");
            mVar.mo57467m(str);
            mVar.mo57445c(C8596q.m24849n(context));
            String b = C8412m.m24225b(mVar);
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(b);
            } else {
                m24638a(b, context, str);
            }
        }
    }

    /* renamed from: b */
    public static void m24640b(C8412m mVar, String str) {
        if (mVar != null) {
            mVar.mo57471o("2000059");
            mVar.mo57467m(str);
            mVar.mo57445c(C8596q.m24849n(C2350a.m5601e().mo15792g()));
            mVar.mo57443b(C8596q.m24839i());
            String c = C8412m.m24227c(mVar);
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(c);
            } else {
                m24638a(c, C2350a.m5601e().mo15792g(), str);
            }
        }
    }

    /* renamed from: a */
    public static void m24638a(String str, Context context, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            m24637a(new C8440a(str, str2));
        }
    }

    /* renamed from: b */
    public static void m24639b(C8412m mVar, Context context, String str) {
        String g = C8412m.m24235g(mVar);
        if (C8518b.m24607a().mo57681c()) {
            C8518b.m24607a().mo57679a(g);
        } else {
            m24638a(g, context, str);
        }
    }

    /* renamed from: c */
    public static void m24641c(C8412m mVar, Context context, String str) {
        String h = C8412m.m24236h(mVar);
        if (C8518b.m24607a().mo57681c()) {
            C8518b.m24607a().mo57679a(h);
        } else {
            m24638a(h, context, str);
        }
    }

    /* renamed from: d */
    public static void m24642d(C8412m mVar, Context context, String str) {
        if (mVar != null) {
            mVar.mo57471o("2000063");
            mVar.mo57467m(str);
            mVar.mo57445c(C8596q.m24849n(context));
            String a = C8412m.m24223a(mVar);
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(a);
            } else {
                m24638a(a, context, str);
            }
        }
    }

    /* renamed from: a */
    private static void m24637a(Runnable runnable) {
        Handler handler = f20662a;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
