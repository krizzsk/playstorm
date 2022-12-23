package com.ogury.p376ed.internal;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.mk */
public final class C10758mk implements C10757mj, C10790nm<Object> {

    /* renamed from: a */
    public static final C10759a f26991a = new C10759a((byte) 0);

    /* renamed from: c */
    private static final Map<Class<? extends Object<?>>, Integer> f26992c;

    /* renamed from: d */
    private static final HashMap<String, String> f26993d;

    /* renamed from: e */
    private static final HashMap<String, String> f26994e;

    /* renamed from: f */
    private static final HashMap<String, String> f26995f;

    /* renamed from: g */
    private static final Map<String, String> f26996g;

    /* renamed from: b */
    private final Class<?> f26997b;

    public C10758mk(Class<?> cls) {
        C10765mq.m32773b(cls, "jClass");
        this.f26997b = cls;
    }

    /* renamed from: a */
    public final Class<?> mo67855a() {
        return this.f26997b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10758mk) && C10765mq.m32772a((Object) C10728li.m32745a(this), (Object) C10728li.m32745a((C10790nm) obj));
    }

    public final int hashCode() {
        return C10728li.m32745a(this).hashCode();
    }

    public final String toString() {
        return mo67855a().toString() + " (Kotlin reflection is not available)";
    }

    /* renamed from: com.ogury.ed.internal.mk$a */
    public static final class C10759a {
        private C10759a() {
        }

        public /* synthetic */ C10759a(byte b) {
            this();
        }
    }

    static {
        int i = 0;
        Iterable b = C10692km.m32649b(C10729lj.class, C10730lk.class, C10741lv.class, C10745lz.class, C10747ma.class, C10748mb.class, C10749mc.class, C10750md.class, C10751me.class, C10752mf.class, C10731ll.class, C10732lm.class, C10733ln.class, C10734lo.class, C10735lp.class, C10736lq.class, C10737lr.class, C10738ls.class, C10739lt.class, C10740lu.class, C10742lw.class, C10743lx.class, C10744ly.class);
        Collection arrayList = new ArrayList(C10692km.m32651a(b));
        for (Object next : b) {
            int i2 = i + 1;
            if (i < 0) {
                C10692km.m32650b();
            }
            arrayList.add(C10681kb.m32635a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f26992c = C10722lc.m32739a((List) arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(Constants.LONG, "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f26993d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f26994e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f26993d);
        hashMap3.putAll(f26994e);
        Collection<String> values = f26993d.values();
        C10765mq.m32770a((Object) values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C10765mq.m32770a((Object) str, "kotlinName");
            sb.append(C10814oc.m32852a(str));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C10678jz a = C10681kb.m32635a(sb2, str + ".Companion");
            hashMap3.put(a.mo67737a(), a.mo67738b());
        }
        for (Map.Entry next2 : f26992c.entrySet()) {
            hashMap3.put(((Class) next2.getKey()).getName(), "kotlin.Function".concat(String.valueOf(((Number) next2.getValue()).intValue())));
        }
        f26995f = hashMap3;
        Map map = hashMap3;
        Map<String, String> linkedHashMap = new LinkedHashMap<>(C10722lc.m32736a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C10814oc.m32852a((String) entry.getValue()));
        }
        f26996g = linkedHashMap;
    }
}
