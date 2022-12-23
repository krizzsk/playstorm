package com.apm.insight.entity;

import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1285a;

/* renamed from: com.apm.insight.entity.c */
public class C1220c extends C1217a {

    /* renamed from: c */
    private String f1089c;

    public C1220c(String str) {
        this.f1089c = str;
    }

    /* renamed from: a */
    public static C1220c m1456a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C1220c cVar = new C1220c(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        cVar.mo12251a("event_type", (Object) "exception");
        cVar.mo12251a("log_type", (Object) str5);
        cVar.mo12251a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        cVar.mo12251a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        cVar.mo12251a("class_ref", (Object) className);
        cVar.mo12251a("method", (Object) methodName);
        cVar.mo12251a("line_num", (Object) Integer.valueOf(lineNumber));
        cVar.mo12251a("stack", (Object) str);
        cVar.mo12251a("exception_type", (Object) 1);
        cVar.mo12251a("ensure_type", (Object) str4);
        cVar.mo12251a("is_core", (Object) Integer.valueOf(z ? 1 : 0));
        cVar.mo12251a("message", (Object) str2);
        cVar.mo12251a("process_name", (Object) C1285a.m1725c(C1240h.m1558g()));
        cVar.mo12251a("crash_thread_name", (Object) str3);
        C1221d.m1459b(cVar.mo12265h());
        return cVar;
    }
}
