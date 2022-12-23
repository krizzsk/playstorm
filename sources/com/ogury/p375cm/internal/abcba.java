package com.ogury.p375cm.internal;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;

/* renamed from: com.ogury.cm.internal.abcba */
public final class abcba {

    /* renamed from: a */
    private final abccb f25760a = new abccb();

    /* renamed from: a */
    private static acaba m30795a(acabc acabc, acabb acabb) {
        acaba a = new acaba().mo66615a(ShareTarget.METHOD_POST);
        acaca acaca = acaca.f25841a;
        return a.mo66620c(acaca.m30828a(acabc)).mo66614a(acabb);
    }

    /* renamed from: a */
    public static void m30796a(Context context, String str, acabc acabc, acabb acabb) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        bbabc.m30943b(acabc, "requestType");
        bbabc.m30943b(acabb, "requestCallback");
        acaba a = m30795a(acabc, acabb);
        new acaac();
        abccb.m30804a(a.mo66618b(acaac.m30813a(context, str)).mo66624f());
    }

    /* renamed from: a */
    public static void m30797a(String str, acabb acabb) {
        bbabc.m30943b(str, "errorMessage");
        bbabc.m30943b(acabb, "requestCallback");
        acaba a = m30795a(acabc.EVENT, acabb);
        new acaac();
        acaba b = a.mo66618b(acaac.m30814a(str));
        abbba abbba = abbba.f25716a;
        abccb.m30804a(b.mo66616a("X-CM-SECURE-TOKEN", abbba.m30734k()).mo66624f());
    }
}
