package com.p374my.target;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.v2 */
public class C9997v2 extends C9916q2 {

    /* renamed from: b */
    public static final LruCache<String, String> f24815b = new LruCache<>(10);

    /* renamed from: c */
    public final ArrayList<C9733h2> f24816c = new ArrayList<>();

    /* renamed from: d */
    public static LruCache<String, String> m29553d() {
        return f24815b;
    }

    /* renamed from: f */
    public static C9997v2 m29554f() {
        return new C9997v2();
    }

    /* renamed from: a */
    public int mo65292a() {
        return this.f24816c.size();
    }

    /* renamed from: a */
    public void mo65602a(C9733h2 h2Var) {
        this.f24816c.add(h2Var);
        f24815b.put(h2Var.getId(), h2Var.getId());
    }

    /* renamed from: c */
    public List<C9733h2> mo65603c() {
        return new ArrayList(this.f24816c);
    }

    /* renamed from: e */
    public C9733h2 mo65604e() {
        if (this.f24816c.size() > 0) {
            return this.f24816c.get(0);
        }
        return null;
    }
}
