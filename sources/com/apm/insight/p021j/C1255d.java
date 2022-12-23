package com.apm.insight.p021j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1311q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.j.d */
public final class C1255d {

    /* renamed from: a */
    private List<C1251a> f1189a = new ArrayList(3);

    private C1255d(Handler handler, Context context) {
        if (C1285a.m1724b(context)) {
            this.f1189a.add(new C1254c(handler, 0, 15000));
        }
    }

    /* renamed from: a */
    public static C1255d m1605a(Handler handler, Context context) {
        return new C1255d(handler, context);
    }

    /* renamed from: a */
    public void mo12319a() {
        C1311q.m1870a((Object) "[ScheduleTaskManager] execute, task size=" + this.f1189a.size());
        for (C1251a a : this.f1189a) {
            try {
                a.mo12312a();
            } catch (Throwable unused) {
            }
        }
    }
}
