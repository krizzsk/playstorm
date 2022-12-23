package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.entity.Header;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.runtime.p024a.C1343b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.s */
public class C1389s {

    /* renamed from: a */
    private static C1389s f1468a;

    /* renamed from: b */
    private File f1469b;

    /* renamed from: c */
    private File f1470c;

    /* renamed from: d */
    private File f1471d;

    /* renamed from: e */
    private Context f1472e;

    /* renamed from: f */
    private C1391a f1473f = null;

    /* renamed from: com.apm.insight.runtime.s$a */
    private static class C1391a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public long f1476a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f1477b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public File f1478c;

        /* renamed from: d */
        private JSONObject f1479d;

        private C1391a(File file) {
            this.f1479d = null;
            this.f1478c = file;
            String[] split = file.getName().split("-|\\.");
            this.f1476a = Long.parseLong(split[0]);
            this.f1477b = Long.parseLong(split[1]);
        }

        /* renamed from: a */
        private String m2292a() {
            return this.f1476a + "-" + this.f1477b + ".ctx";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2294a(long j) {
            this.f1477b = j;
            this.f1478c.renameTo(new File(this.f1478c.getParent(), m2292a()));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public JSONObject m2297b() {
            if (this.f1479d == null) {
                try {
                    this.f1479d = new JSONObject(C1298i.m1785c(this.f1478c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f1479d == null) {
                    this.f1479d = new JSONObject();
                }
            }
            return this.f1479d;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public boolean m2298b(long j) {
            long j2 = this.f1476a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = this.f1477b;
            if (j3 >= j || j - j3 <= 604800000) {
                return this.f1478c.lastModified() < j && j - this.f1478c.lastModified() > 604800000;
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m2301c() {
            this.f1478c.delete();
        }
    }

    private C1389s(Context context) {
        File c = C1308o.m1839c(context);
        if (!c.exists() || (!c.isDirectory() && c.delete())) {
            c.mkdirs();
            C1343b.m2064a();
        }
        this.f1469b = c;
        this.f1470c = new File(c, "did");
        this.f1471d = new File(c, "device_uuid");
        this.f1472e = context;
    }

    /* renamed from: a */
    public static int m2275a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (Header.m1391c(jSONObject)) {
            return 2;
        }
        if (Header.m1391c(jSONObject2)) {
            return 0;
        }
        return (!String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) || !Header.m1392d(jSONObject)) ? 2 : 1;
    }

    /* renamed from: a */
    public static C1389s m2276a() {
        if (f1468a == null) {
            f1468a = new C1389s(C1240h.m1558g());
        }
        return f1468a;
    }

    /* renamed from: a */
    private void m2277a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = this.f1469b;
        File file2 = new File(file, "" + j + "-" + j2 + ".ctx");
        File file3 = this.f1469b;
        File file4 = new File(file3, "" + j + "-" + j2 + ".allData");
        try {
            C1298i.m1772a(file2, jSONObject, false);
            C1298i.m1771a(file4, jSONArray, false);
            this.f1473f = new C1391a(file2);
        } catch (IOException e) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) e);
        }
    }

    /* renamed from: c */
    private C1391a m2278c() {
        if (this.f1473f == null) {
            m2281d(".ctx");
        }
        return this.f1473f;
    }

    /* renamed from: c */
    private void m2279c(long j) {
        try {
            ArrayList<C1391a> d = m2281d("");
            if (d.size() > 6) {
                Iterator<C1391a> it = d.iterator();
                while (it.hasNext()) {
                    C1391a next = it.next();
                    if (next.m2298b(j)) {
                        next.m2301c();
                    }
                }
            }
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
        }
    }

    /* renamed from: d */
    private File m2280d(long j) {
        Iterator<C1391a> it = m2281d(".ctx").iterator();
        while (it.hasNext()) {
            C1391a next = it.next();
            if (j >= next.f1476a && j <= next.f1477b) {
                return next.f1478c;
            }
        }
        return null;
    }

    /* renamed from: d */
    private ArrayList<C1391a> m2281d(final String str) {
        File[] listFiles = this.f1469b.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches();
            }
        });
        C1311q.m1870a((Object) "foundRuntimeContextFiles " + listFiles.length);
        ArrayList<C1391a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        C1391a aVar = null;
        for (File aVar2 : listFiles) {
            try {
                C1391a aVar3 = new C1391a(aVar2);
                arrayList.add(aVar3);
                if (this.f1473f == null && ".ctx".equals(str)) {
                    if (aVar != null) {
                        if (aVar3.f1477b < aVar.f1477b) {
                        }
                    }
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
        if (this.f1473f == null && aVar != null) {
            this.f1473f = aVar;
        }
        return arrayList;
    }

    /* renamed from: e */
    private File m2282e(long j) {
        Iterator<C1391a> it = m2281d(".allData").iterator();
        while (it.hasNext()) {
            C1391a next = it.next();
            if (j >= next.f1476a && j <= next.f1477b) {
                return next.f1478c;
            }
        }
        return null;
    }

    /* renamed from: f */
    private File m2283f(long j) {
        Iterator<C1391a> it = m2281d(".ctx").iterator();
        C1391a aVar = null;
        while (it.hasNext()) {
            C1391a next = it.next();
            if (aVar == null || Math.abs(aVar.f1477b - j) > Math.abs(next.f1477b - j)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f1478c;
    }

    /* renamed from: g */
    private File m2284g(long j) {
        Iterator<C1391a> it = m2281d(".allData").iterator();
        C1391a aVar = null;
        while (it.hasNext()) {
            C1391a next = it.next();
            if (aVar == null || Math.abs(aVar.f1477b - j) > Math.abs(next.f1477b - j)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f1478c;
    }

    /* renamed from: a */
    public String mo12513a(String str) {
        try {
            return C1298i.m1785c(this.f1471d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public JSONObject mo12514a(long j) {
        boolean z;
        String str;
        File d = m2280d(j);
        if (d == null) {
            d = m2283f(j);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (d != null) {
            try {
                str = C1298i.m1785c(d.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    th = th;
                    C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e) {
                        C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) e);
                    }
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                jSONObject.put("unauthentic_version", 1);
                return jSONObject;
            }
        }
        if (jSONObject != null && z) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo12515a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject a = Header.m1383a(this.f1472e).mo12236a(map);
        if (!Header.m1391c(a)) {
            long currentTimeMillis = System.currentTimeMillis();
            C1391a c = m2278c();
            if (c == null) {
                m2277a(currentTimeMillis, currentTimeMillis, a, jSONArray);
                return;
            }
            int a2 = m2275a(c.m2297b(), a);
            if (a2 == 1) {
                m2277a(c.f1476a, currentTimeMillis, a, jSONArray);
                C1298i.m1777a(c.f1478c);
            } else if (a2 == 2) {
                m2277a(currentTimeMillis, currentTimeMillis, a, jSONArray);
            } else if (a2 == 3) {
                c.m2294a(currentTimeMillis);
            }
            m2279c(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo12516b() {
        try {
            return C1298i.m1785c(this.f1470c.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: b */
    public JSONArray mo12517b(long j) {
        String str;
        File e = m2282e(j);
        if (e == null) {
            e = m2284g(j);
        }
        if (e == null) {
            return null;
        }
        try {
            str = C1298i.m1785c(e.getAbsolutePath());
            try {
                return new JSONArray(str);
            } catch (Throwable th) {
                th = th;
                C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
            C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12518b(String str) {
        try {
            C1298i.m1769a(this.f1470c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo12519c(String str) {
        try {
            C1298i.m1769a(this.f1471d, str, false);
        } catch (Throwable unused) {
        }
    }
}
