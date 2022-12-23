package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bt */
/* compiled from: NativeAsset */
public class C5901bt {

    /* renamed from: z */
    private static final String f14891z = C5901bt.class.getSimpleName();

    /* renamed from: a */
    String f14892a;

    /* renamed from: b */
    public String f14893b;

    /* renamed from: c */
    public C5902bu f14894c;

    /* renamed from: d */
    public String f14895d;

    /* renamed from: e */
    public Object f14896e;

    /* renamed from: f */
    JSONObject f14897f;

    /* renamed from: g */
    String f14898g;

    /* renamed from: h */
    public boolean f14899h;

    /* renamed from: i */
    public byte f14900i;

    /* renamed from: j */
    public String f14901j;

    /* renamed from: k */
    public byte f14902k;

    /* renamed from: l */
    public byte f14903l;

    /* renamed from: m */
    public byte f14904m;

    /* renamed from: n */
    byte f14905n;

    /* renamed from: o */
    public int f14906o;

    /* renamed from: p */
    public int f14907p;

    /* renamed from: q */
    String f14908q;

    /* renamed from: r */
    public String f14909r;

    /* renamed from: s */
    public String f14910s;

    /* renamed from: t */
    public C5901bt f14911t;

    /* renamed from: u */
    public List<C5922cf> f14912u;

    /* renamed from: v */
    public Map<String, Object> f14913v;

    /* renamed from: w */
    public Object f14914w;

    /* renamed from: x */
    public int f14915x;

    /* renamed from: y */
    public C5901bt f14916y;

    public C5901bt() {
        this("", "root", "CONTAINER", new C5902bu());
    }

    public C5901bt(String str, String str2, String str3, C5902bu buVar) {
        this(str, str2, str3, buVar, new LinkedList());
    }

    public C5901bt(String str, String str2, String str3, C5902bu buVar, List<C5922cf> list) {
        this.f14892a = str;
        this.f14895d = str2;
        this.f14893b = str3;
        this.f14894c = buVar;
        this.f14896e = null;
        this.f14898g = "";
        this.f14899h = false;
        this.f14900i = 0;
        this.f14901j = "";
        this.f14903l = 0;
        this.f14902k = 0;
        this.f14904m = 0;
        this.f14905n = 2;
        this.f14915x = 0;
        this.f14906o = -1;
        this.f14908q = "";
        this.f14909r = "";
        this.f14897f = new JSONObject();
        LinkedList linkedList = new LinkedList();
        this.f14912u = linkedList;
        linkedList.addAll(list);
        this.f14913v = new HashMap();
    }

    /* renamed from: a */
    public final void mo34877a(String str, Map<String, String> map) {
        if (this.f14912u.size() != 0) {
            for (C5922cf next : this.f14912u) {
                if (str.equals(next.f15004d)) {
                    m17642a(next, map);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34878a(List<C5922cf> list) {
        this.f14912u.addAll(list);
    }

    /* renamed from: a */
    public final void mo34876a(String str) {
        this.f14909r = str.trim();
    }

    /* renamed from: b */
    public final void mo34879b(String str) {
        this.f14910s = str.trim();
    }

    /* renamed from: a */
    public static void m17642a(C5922cf cfVar, Map<String, String> map) {
        C5874bk.m17607a().mo34846a(C6239hv.m18610a(cfVar.f15002b, map), cfVar.f15005e, true);
    }
}
