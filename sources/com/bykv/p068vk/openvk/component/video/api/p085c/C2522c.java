package com.bykv.p068vk.openvk.component.video.api.p085c;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.api.c.c */
/* compiled from: VideoUrlModel */
public class C2522c implements Serializable {

    /* renamed from: a */
    public String f5393a;

    /* renamed from: b */
    public int f5394b;

    /* renamed from: c */
    public final HashMap<String, Object> f5395c = new HashMap<>();

    /* renamed from: d */
    private C2521b f5396d;

    /* renamed from: e */
    private C2521b f5397e;

    /* renamed from: f */
    private String f5398f;

    /* renamed from: g */
    private int f5399g = 204800;

    /* renamed from: h */
    private String f5400h;

    /* renamed from: i */
    private int f5401i;

    /* renamed from: j */
    private int f5402j;

    /* renamed from: k */
    private List<String> f5403k;

    /* renamed from: l */
    private String f5404l;

    /* renamed from: m */
    private long f5405m;

    /* renamed from: n */
    private boolean f5406n;

    /* renamed from: o */
    private int f5407o = 0;

    /* renamed from: p */
    private int f5408p = 0;

    /* renamed from: q */
    private int f5409q = 10000;

    /* renamed from: r */
    private int f5410r = 10000;

    /* renamed from: s */
    private int f5411s = 10000;

    /* renamed from: t */
    private int f5412t = 0;

    public C2522c(String str, C2521b bVar, C2521b bVar2, int i, int i2) {
        this.f5398f = str;
        this.f5396d = bVar;
        this.f5397e = bVar2;
        this.f5407o = i;
        this.f5408p = i2;
    }

    /* renamed from: a */
    public String mo16373a() {
        return this.f5398f;
    }

    /* renamed from: a */
    public void mo16376a(String str) {
        this.f5398f = str;
    }

    /* renamed from: b */
    public int mo16380b() {
        if (mo16397i()) {
            return this.f5397e.mo16365m();
        }
        C2521b bVar = this.f5396d;
        if (bVar != null) {
            return bVar.mo16365m();
        }
        return 0;
    }

    /* renamed from: b */
    public void mo16382b(String str) {
        this.f5400h = str;
    }

    /* renamed from: c */
    public int mo16383c() {
        return this.f5401i;
    }

    /* renamed from: a */
    public void mo16374a(int i) {
        this.f5401i = i;
    }

    /* renamed from: d */
    public int mo16386d() {
        return this.f5402j;
    }

    /* renamed from: b */
    public void mo16381b(int i) {
        this.f5402j = i;
    }

    /* renamed from: a */
    public void mo16378a(List<String> list) {
        this.f5403k = list;
    }

    /* renamed from: c */
    public void mo16385c(String str) {
        this.f5404l = str;
    }

    /* renamed from: e */
    public long mo16389e() {
        return this.f5405m;
    }

    /* renamed from: a */
    public void mo16375a(long j) {
        this.f5405m = j;
    }

    /* renamed from: f */
    public boolean mo16393f() {
        return this.f5406n;
    }

    /* renamed from: a */
    public void mo16379a(boolean z) {
        this.f5406n = z;
    }

    /* renamed from: g */
    public long mo16394g() {
        if (mo16397i()) {
            return this.f5397e.mo16350e();
        }
        C2521b bVar = this.f5396d;
        if (bVar != null) {
            return bVar.mo16350e();
        }
        return 0;
    }

    /* renamed from: h */
    public boolean mo16396h() {
        if (mo16397i()) {
            return this.f5397e.mo16372t();
        }
        C2521b bVar = this.f5396d;
        if (bVar != null) {
            return bVar.mo16372t();
        }
        return true;
    }

    /* renamed from: d */
    public void mo16388d(String str) {
        this.f5393a = str;
    }

    /* renamed from: c */
    public void mo16384c(int i) {
        this.f5394b = i;
    }

    /* renamed from: i */
    public boolean mo16397i() {
        return this.f5407o == 1 && this.f5408p == 1 && this.f5397e != null;
    }

    /* renamed from: j */
    public String mo16398j() {
        if (mo16397i()) {
            return this.f5397e.mo16360i();
        }
        C2521b bVar = this.f5396d;
        if (bVar != null) {
            return bVar.mo16360i();
        }
        return null;
    }

    /* renamed from: k */
    public String mo16399k() {
        if (mo16397i()) {
            return this.f5397e.mo16364l();
        }
        C2521b bVar = this.f5396d;
        if (bVar != null) {
            return bVar.mo16364l();
        }
        return null;
    }

    /* renamed from: l */
    public int mo16400l() {
        return this.f5407o;
    }

    /* renamed from: a */
    public synchronized void mo16377a(String str, Object obj) {
        this.f5395c.put(str, obj);
    }

    /* renamed from: e */
    public synchronized Object mo16390e(String str) {
        return this.f5395c.get(str);
    }

    /* renamed from: m */
    public int mo16401m() {
        return this.f5409q;
    }

    /* renamed from: d */
    public void mo16387d(int i) {
        this.f5409q = i;
    }

    /* renamed from: n */
    public int mo16402n() {
        return this.f5410r;
    }

    /* renamed from: e */
    public void mo16391e(int i) {
        this.f5410r = i;
    }

    /* renamed from: o */
    public int mo16403o() {
        return this.f5411s;
    }

    /* renamed from: f */
    public void mo16392f(int i) {
        this.f5411s = i;
    }

    /* renamed from: p */
    public int mo16404p() {
        return this.f5412t;
    }

    /* renamed from: g */
    public void mo16395g(int i) {
        this.f5412t = i;
    }

    /* renamed from: q */
    public C2521b mo16405q() {
        return this.f5396d;
    }

    /* renamed from: r */
    public C2521b mo16406r() {
        return this.f5397e;
    }
}
