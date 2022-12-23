package com.apm.insight.p023l;

import com.facebook.internal.security.CertificateUtil;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.m */
public class C1302m {

    /* renamed from: a */
    final Writer f1293a;

    /* renamed from: b */
    private final List<C1303a> f1294b = new ArrayList();

    /* renamed from: com.apm.insight.l.m$a */
    enum C1303a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public C1302m(Writer writer) {
        this.f1293a = writer;
    }

    /* renamed from: a */
    private void m1809a(C1303a aVar) {
        List<C1303a> list = this.f1294b;
        list.set(list.size() - 1, aVar);
    }

    /* renamed from: a */
    private void m1810a(JSONArray jSONArray) {
        mo12364a();
        for (int i = 0; i < jSONArray.length(); i++) {
            mo12367a(jSONArray.get(i));
        }
        mo12369b();
    }

    /* renamed from: a */
    public static void m1811a(JSONArray jSONArray, Writer writer) {
        new C1302m(writer).m1810a(jSONArray);
        writer.flush();
    }

    /* renamed from: a */
    private void m1812a(JSONObject jSONObject) {
        mo12370c();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            mo12368a(next).mo12367a(jSONObject.get(next));
        }
        mo12371d();
    }

    /* renamed from: a */
    public static void m1813a(JSONObject jSONObject, Writer writer) {
        new C1302m(writer).m1812a(jSONObject);
        writer.flush();
    }

    /* renamed from: b */
    private void m1814b(String str) {
        Writer writer;
        String str2;
        this.f1293a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                writer = this.f1293a;
                str2 = "\\f";
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            writer = this.f1293a;
                            str2 = "\\b";
                            break;
                        case 9:
                            writer = this.f1293a;
                            str2 = "\\t";
                            break;
                        case 10:
                            writer = this.f1293a;
                            str2 = "\\n";
                            break;
                        default:
                            if (charAt <= 31) {
                                this.f1293a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f1293a.write(92);
                }
                this.f1293a.write(charAt);
            } else {
                writer = this.f1293a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.f1293a.write("\"");
    }

    /* renamed from: e */
    private C1303a m1815e() {
        List<C1303a> list = this.f1294b;
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    private void m1816f() {
        C1303a e = m1815e();
        if (e == C1303a.NONEMPTY_OBJECT) {
            this.f1293a.write(44);
        } else if (e != C1303a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        m1809a(C1303a.DANGLING_KEY);
    }

    /* renamed from: g */
    private void m1817g() {
        C1303a aVar;
        if (!this.f1294b.isEmpty()) {
            C1303a e = m1815e();
            if (e == C1303a.EMPTY_ARRAY) {
                aVar = C1303a.NONEMPTY_ARRAY;
            } else if (e == C1303a.NONEMPTY_ARRAY) {
                this.f1293a.write(44);
                return;
            } else if (e == C1303a.DANGLING_KEY) {
                this.f1293a.write(CertificateUtil.DELIMITER);
                aVar = C1303a.NONEMPTY_OBJECT;
            } else if (e != C1303a.NULL) {
                throw new JSONException("Nesting problem");
            } else {
                return;
            }
            m1809a(aVar);
        }
    }

    /* renamed from: a */
    public C1302m mo12364a() {
        return mo12366a(C1303a.EMPTY_ARRAY, "[");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1302m mo12365a(C1303a aVar, C1303a aVar2, String str) {
        m1815e();
        List<C1303a> list = this.f1294b;
        list.remove(list.size() - 1);
        this.f1293a.write(str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1302m mo12366a(C1303a aVar, String str) {
        m1817g();
        this.f1294b.add(aVar);
        this.f1293a.write(str);
        return this;
    }

    /* renamed from: a */
    public C1302m mo12367a(Object obj) {
        Writer writer;
        String numberToString;
        if (obj instanceof JSONArray) {
            m1810a((JSONArray) obj);
            return this;
        } else if (obj instanceof JSONObject) {
            m1812a((JSONObject) obj);
            return this;
        } else {
            m1817g();
            if (obj == null || obj == JSONObject.NULL) {
                this.f1293a.write("null");
            } else {
                if (obj instanceof Boolean) {
                    writer = this.f1293a;
                    numberToString = String.valueOf(obj);
                } else if (obj instanceof Number) {
                    writer = this.f1293a;
                    numberToString = JSONObject.numberToString((Number) obj);
                } else {
                    m1814b(obj.toString());
                }
                writer.write(numberToString);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C1302m mo12368a(String str) {
        m1816f();
        m1814b(str);
        return this;
    }

    /* renamed from: b */
    public C1302m mo12369b() {
        return mo12365a(C1303a.EMPTY_ARRAY, C1303a.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: c */
    public C1302m mo12370c() {
        return mo12366a(C1303a.EMPTY_OBJECT, "{");
    }

    /* renamed from: d */
    public C1302m mo12371d() {
        return mo12365a(C1303a.EMPTY_OBJECT, C1303a.NONEMPTY_OBJECT, "}");
    }

    public String toString() {
        return "";
    }
}
