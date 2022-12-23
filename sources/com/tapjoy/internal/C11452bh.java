package com.tapjoy.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.bh */
public abstract class C11452bh implements C11449be, C11458bj {

    /* renamed from: a */
    private HashMap<String, Object> f27695a;

    /* renamed from: a */
    public static C11452bh m33264a(InputStream inputStream) {
        return C11454a.m33281a().mo72217a(inputStream);
    }

    /* renamed from: b */
    public static C11452bh m33266b(String str) {
        return C11454a.m33281a().mo72219a(str);
    }

    /* renamed from: com.tapjoy.internal.bh$a */
    public static abstract class C11454a {

        /* renamed from: a */
        private static C11454a f27697a;

        /* renamed from: a */
        public static C11454a m33281a() {
            C11454a aVar = f27697a;
            if (aVar != null) {
                return aVar;
            }
            C11454a aVar2 = C11455bi.f27698a;
            f27697a = aVar2;
            return aVar2;
        }

        /* renamed from: a */
        public final C11452bh mo72217a(InputStream inputStream) {
            return mo72218a((Reader) new InputStreamReader(inputStream, Charset.forName("UTF-8")));
        }

        /* renamed from: a */
        public C11452bh mo72219a(String str) {
            return mo72217a((InputStream) new ByteArrayInputStream(str.getBytes("UTF-8")));
        }

        /* renamed from: a */
        public C11452bh mo72218a(Reader reader) {
            return mo72219a(C11686go.m33921a(reader).toString());
        }
    }

    /* renamed from: a */
    public final Object mo72203a(String str) {
        HashMap<String, Object> hashMap = this.f27695a;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo72204a(String str, Object obj) {
        if (this.f27695a == null) {
            this.f27695a = new HashMap<>();
        }
        this.f27695a.put(str, obj);
    }

    /* renamed from: a */
    public final boolean mo72211a() {
        return mo72226k() == C11461bm.BEGIN_OBJECT;
    }

    /* renamed from: t */
    private boolean m33268t() {
        if (mo72226k() != C11461bm.NULL) {
            return false;
        }
        mo72230o();
        return true;
    }

    /* renamed from: b */
    public final String mo72212b() {
        if (m33268t()) {
            return null;
        }
        return mo72228m();
    }

    /* renamed from: c */
    public final String mo72213c(String str) {
        if (m33268t()) {
            return str;
        }
        return mo72228m();
    }

    /* renamed from: com.tapjoy.internal.bh$1 */
    static /* synthetic */ class C114531 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27696a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tapjoy.internal.bm[] r0 = com.tapjoy.internal.C11461bm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27696a = r0
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11461bm.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27696a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11461bm.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27696a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11461bm.NULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27696a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11461bm.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27696a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11461bm.NUMBER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27696a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11461bm.STRING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11452bh.C114531.<clinit>():void");
        }
    }

    /* renamed from: u */
    private Object m33269u() {
        C11461bm k = mo72226k();
        switch (C114531.f27696a[k.ordinal()]) {
            case 1:
                return mo72214c();
            case 2:
                return mo72215d();
            case 3:
                mo72230o();
                return null;
            case 4:
                return Boolean.valueOf(mo72229n());
            case 5:
                return new C11479cc(mo72228m());
            case 6:
                return mo72228m();
            default:
                throw new IllegalStateException("Expected a value but was ".concat(String.valueOf(k)));
        }
    }

    /* renamed from: c */
    public final <E> List<E> mo72214c() {
        LinkedList linkedList = new LinkedList();
        m33265a((List) linkedList);
        return linkedList;
    }

    /* renamed from: a */
    private void m33265a(List list) {
        mo72221f();
        while (mo72225j()) {
            list.add(m33269u());
        }
        mo72222g();
    }

    /* renamed from: d */
    public final Map<String, Object> mo72215d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mo72210a((Map) linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo72210a(Map map) {
        mo72223h();
        while (mo72225j()) {
            map.put(mo72227l(), m33269u());
        }
        mo72224i();
    }

    @Nullable
    /* renamed from: a */
    public final <T> T mo72208a(C11444bc<T> bcVar) {
        if (m33268t()) {
            return null;
        }
        return bcVar.mo72202a(this);
    }

    /* renamed from: a */
    public final <T> void mo72209a(List<T> list, C11444bc<T> bcVar) {
        mo72221f();
        while (mo72225j()) {
            list.add(bcVar.mo72202a(this));
        }
        mo72222g();
    }

    /* renamed from: d */
    private static URI m33267d(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new C11465bp(e);
        }
    }

    /* renamed from: e */
    public final URL mo72216e() {
        URI uri = (URI) mo72203a("BASE_URI");
        if (uri != null) {
            return uri.resolve(m33267d(mo72228m())).toURL();
        }
        return new URL(mo72228m());
    }
}
