package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1295f;
import com.apm.insight.p023l.C1300k;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.k */
public class C1374k {

    /* renamed from: a */
    private static C1373j f1436a;

    /* renamed from: a */
    public static JSONArray m2202a(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                File file = new File(str);
                if (file.length() > 512000) {
                    bufferedReader.skip(file.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        jSONArray.put(readLine);
                    } else {
                        C1300k.m1795a((Closeable) bufferedReader);
                        return jSONArray;
                    }
                }
            } catch (IOException e) {
                e = e;
                try {
                    e.printStackTrace();
                    C1300k.m1795a((Closeable) bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    C1300k.m1795a((Closeable) bufferedReader2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
            e.printStackTrace();
            C1300k.m1795a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C1300k.m1795a((Closeable) bufferedReader2);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m2203a(C1373j jVar) {
        f1436a = jVar;
    }

    /* renamed from: b */
    public static JSONArray m2204b(String str) {
        if (f1436a != null && C1240h.m1557f().equals(str)) {
            try {
                return m2202a(f1436a.mo12505a());
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
        try {
            return m2202a(C1295f.m1751a(str, C1240h.m1560i().getLogcatDumpCount(), C1240h.m1560i().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th2) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th2);
            return null;
        }
    }
}
