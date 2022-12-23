package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.ogury.p376ed.internal.C10318aj;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cf */
public final class C10395cf {

    /* renamed from: a */
    public static final C10395cf f26322a = new C10395cf();

    /* renamed from: b */
    private static final C10367bn f26323b = new C10367bn();

    /* renamed from: c */
    private static C10531fn f26324c = C10531fn.f26635a;

    private C10395cf() {
    }

    /* renamed from: a */
    public static void m31462a(Activity activity, C10393cd cdVar, C10403ck ckVar) {
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(cdVar, "publisherActivityFilter");
        C10765mq.m32773b(ckVar, "publisherFragmentFilter");
        Application application = activity.getApplication();
        C10765mq.m32770a((Object) application, "application");
        C10546g gVar = new C10546g(application);
        C10384bw a = new C10385bx(cdVar, ckVar, C10404cl.f26341a, f26324c).mo67136a(activity, gVar, new C10318aj.C10319a(application, gVar, C10340as.f26212a, false).mo67073p());
        if (!(a instanceof C10372br)) {
            C10548ga gaVar = C10548ga.f26676a;
            C10548ga.m32073b("Cannot log whitelisted activities when using fragment filter");
            return;
        }
        m31463a(activity, ((C10372br) a).mo67111a());
    }

    /* renamed from: a */
    private static void m31463a(Context context, C10371bq bqVar) {
        List<Activity> a = C10367bn.m31376a(context);
        C10548ga gaVar = C10548ga.f26676a;
        C10548ga.m32073b("Displaying whitelisted activities");
        boolean z = true;
        for (Activity next : a) {
            if (bqVar.mo67110b(next)) {
                z = false;
                C10548ga gaVar2 = C10548ga.f26676a;
                C10548ga.m32073b(C10765mq.m32765a("Whitelisted: ", (Object) next.getClass().getName()));
            }
        }
        if (z) {
            C10548ga gaVar3 = C10548ga.f26676a;
            C10548ga.m32073b("No activity is whitelisted");
        }
    }
}
