package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.p023l.C1308o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.apm.insight.nativecrash.a */
public class C1322a {

    /* renamed from: a */
    private Map<String, String> f1321a;

    public C1322a(File file) {
        String a;
        File c = C1308o.m1840c(file);
        if (c.exists() && c.length() != 0 && (a = NativeImpl.m1946a(c.getAbsolutePath())) != null) {
            String[] split = a.split("\n");
            this.f1321a = new HashMap();
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                if (split3.length == 2) {
                    this.f1321a.put(split3[0], split3[1]);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo12376a() {
        Map<String, String> map = this.f1321a;
        return map != null && !map.isEmpty() && !TextUtils.isEmpty(this.f1321a.get("process_name")) && !TextUtils.isEmpty(this.f1321a.get("crash_thread_name")) && !TextUtils.isEmpty(this.f1321a.get("pid")) && !TextUtils.isEmpty(this.f1321a.get("tid")) && !TextUtils.isEmpty(this.f1321a.get("start_time")) && !TextUtils.isEmpty(this.f1321a.get("crash_time")) && !TextUtils.isEmpty(this.f1321a.get("signal_line"));
    }

    /* renamed from: b */
    public String mo12377b() {
        return this.f1321a.get("signal_line");
    }

    /* renamed from: c */
    public Map<String, String> mo12378c() {
        return this.f1321a;
    }
}
