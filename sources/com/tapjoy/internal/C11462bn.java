package com.tapjoy.internal;

import com.facebook.internal.security.CertificateUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bn */
public final class C11462bn implements Closeable {

    /* renamed from: a */
    final Writer f27735a;

    /* renamed from: b */
    private final List<C11459bk> f27736b;

    /* renamed from: c */
    private String f27737c;

    /* renamed from: d */
    private String f27738d = CertificateUtil.DELIMITER;

    /* renamed from: e */
    private boolean f27739e;

    public C11462bn(Writer writer) {
        ArrayList arrayList = new ArrayList();
        this.f27736b = arrayList;
        arrayList.add(C11459bk.EMPTY_DOCUMENT);
        if (writer != null) {
            this.f27735a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    public final C11462bn mo72236a() {
        return m33339a(C11459bk.EMPTY_ARRAY, "[");
    }

    /* renamed from: b */
    public final C11462bn mo72244b() {
        return m33338a(C11459bk.EMPTY_ARRAY, C11459bk.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: c */
    public final C11462bn mo72246c() {
        return m33339a(C11459bk.EMPTY_OBJECT, "{");
    }

    /* renamed from: d */
    public final C11462bn mo72248d() {
        return m33338a(C11459bk.EMPTY_OBJECT, C11459bk.NONEMPTY_OBJECT, "}");
    }

    /* renamed from: a */
    private C11462bn m33339a(C11459bk bkVar, String str) {
        m33345b(true);
        this.f27736b.add(bkVar);
        this.f27735a.write(str);
        return this;
    }

    /* renamed from: a */
    private C11462bn m33338a(C11459bk bkVar, C11459bk bkVar2, String str) {
        C11459bk e = m33347e();
        if (e == bkVar2 || e == bkVar) {
            List<C11459bk> list = this.f27736b;
            list.remove(list.size() - 1);
            if (e == bkVar2) {
                m33349g();
            }
            this.f27735a.write(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem: " + this.f27736b);
    }

    /* renamed from: e */
    private C11459bk m33347e() {
        List<C11459bk> list = this.f27736b;
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    private void m33343a(C11459bk bkVar) {
        List<C11459bk> list = this.f27736b;
        list.set(list.size() - 1, bkVar);
    }

    /* renamed from: a */
    public final C11462bn mo72241a(String str) {
        if (str != null) {
            m33350h();
            m33346c(str);
            return this;
        }
        throw new NullPointerException("name == null");
    }

    /* renamed from: b */
    public final C11462bn mo72245b(String str) {
        if (str == null) {
            return m33348f();
        }
        m33345b(false);
        m33346c(str);
        return this;
    }

    /* renamed from: f */
    private C11462bn m33348f() {
        m33345b(false);
        this.f27735a.write("null");
        return this;
    }

    /* renamed from: a */
    private C11462bn m33341a(boolean z) {
        m33345b(false);
        this.f27735a.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    private C11462bn m33337a(double d) {
        if (this.f27739e || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m33345b(false);
            this.f27735a.append(Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(d)));
    }

    /* renamed from: a */
    public final C11462bn mo72237a(long j) {
        m33345b(false);
        this.f27735a.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public final C11462bn mo72239a(Number number) {
        if (number == null) {
            return m33348f();
        }
        String obj = number.toString();
        if (this.f27739e || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m33345b(false);
            this.f27735a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
    }

    public final void close() {
        this.f27735a.close();
        if (m33347e() != C11459bk.NONEMPTY_DOCUMENT) {
            throw new IOException("Incomplete document");
        }
    }

    /* renamed from: c */
    private void m33346c(String str) {
        this.f27735a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                this.f27735a.write("\\f");
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '\\') {
                    if (charAt != 8232 && charAt != 8233) {
                        switch (charAt) {
                            case 8:
                                this.f27735a.write("\\b");
                                continue;
                            case 9:
                                this.f27735a.write("\\t");
                                continue;
                            case 10:
                                this.f27735a.write("\\n");
                                continue;
                            default:
                                if (charAt <= 31) {
                                    this.f27735a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                    continue;
                                }
                                break;
                        }
                    } else {
                        this.f27735a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    }
                } else {
                    this.f27735a.write(92);
                }
                this.f27735a.write(charAt);
            } else {
                this.f27735a.write("\\r");
            }
        }
        this.f27735a.write("\"");
    }

    /* renamed from: g */
    private void m33349g() {
        if (this.f27737c != null) {
            this.f27735a.write("\n");
            for (int i = 1; i < this.f27736b.size(); i++) {
                this.f27735a.write(this.f27737c);
            }
        }
    }

    /* renamed from: h */
    private void m33350h() {
        C11459bk e = m33347e();
        if (e == C11459bk.NONEMPTY_OBJECT) {
            this.f27735a.write(44);
        } else if (e != C11459bk.EMPTY_OBJECT) {
            throw new IllegalStateException("Nesting problem: " + this.f27736b);
        }
        m33349g();
        m33343a(C11459bk.DANGLING_NAME);
    }

    /* renamed from: com.tapjoy.internal.bn$1 */
    static /* synthetic */ class C114631 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27740a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tapjoy.internal.bk[] r0 = com.tapjoy.internal.C11459bk.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27740a = r0
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.EMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27740a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.EMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27740a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.NONEMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27740a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.DANGLING_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27740a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.NONEMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11462bn.C114631.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m33345b(boolean z) {
        int i = C114631.f27740a[m33347e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                m33343a(C11459bk.NONEMPTY_ARRAY);
                m33349g();
            } else if (i == 3) {
                this.f27735a.append(',');
                m33349g();
            } else if (i == 4) {
                this.f27735a.append(this.f27738d);
                m33343a(C11459bk.NONEMPTY_OBJECT);
            } else if (i != 5) {
                throw new IllegalStateException("Nesting problem: " + this.f27736b);
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (this.f27739e || z) {
            m33343a(C11459bk.NONEMPTY_DOCUMENT);
        } else {
            throw new IllegalStateException("JSON must start with an array or an object.");
        }
    }

    /* renamed from: a */
    public final C11462bn mo72240a(Object obj) {
        if (obj == null) {
            return m33348f();
        }
        if (obj instanceof C11460bl) {
            if (this.f27736b.size() == this.f27736b.size()) {
                return this;
            }
            throw new IllegalStateException(obj.getClass().getName() + ".writeToJson(JsonWriter) wrote incomplete value");
        } else if (obj instanceof Boolean) {
            return m33341a(((Boolean) obj).booleanValue());
        } else {
            if (obj instanceof Number) {
                if (obj instanceof Long) {
                    return mo72237a(((Number) obj).longValue());
                }
                if (obj instanceof Double) {
                    return m33337a(((Number) obj).doubleValue());
                }
                return mo72239a((Number) obj);
            } else if (obj instanceof String) {
                return mo72245b((String) obj);
            } else {
                if (obj instanceof C11450bf) {
                    return mo72238a((C11450bf) obj);
                }
                if (obj instanceof Collection) {
                    return mo72242a((Collection) obj);
                }
                if (obj instanceof Map) {
                    return m33344b((Map) obj);
                }
                if (obj instanceof Date) {
                    return m33340a((Date) obj);
                }
                if (obj instanceof Object[]) {
                    return m33342a((Object[]) obj);
                }
                throw new IllegalArgumentException("Unknown type: " + obj.getClass().getName());
            }
        }
    }

    /* renamed from: a */
    private C11462bn m33342a(Object[] objArr) {
        if (objArr == null) {
            return m33348f();
        }
        mo72236a();
        for (Object a : objArr) {
            mo72240a(a);
        }
        mo72244b();
        return this;
    }

    /* renamed from: a */
    public final C11462bn mo72238a(C11450bf bfVar) {
        m33345b(false);
        bfVar.mo72196a(this.f27735a);
        return this;
    }

    /* renamed from: a */
    public final C11462bn mo72242a(Collection collection) {
        if (collection == null) {
            return m33348f();
        }
        mo72236a();
        for (Object a : collection) {
            mo72240a(a);
        }
        mo72244b();
        return this;
    }

    /* renamed from: b */
    private C11462bn m33344b(Map map) {
        return mo72243a((Map<Object, Object>) map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C11462bn mo72243a(Map<Object, Object> map) {
        if (map == null) {
            return m33348f();
        }
        mo72246c();
        for (Map.Entry next : map.entrySet()) {
            mo72241a(String.valueOf(next.getKey()));
            mo72240a(next.getValue());
        }
        mo72248d();
        return this;
    }

    /* renamed from: a */
    private C11462bn m33340a(Date date) {
        if (date == null) {
            return m33348f();
        }
        return mo72245b(C11842v.m34412a(date));
    }
}
