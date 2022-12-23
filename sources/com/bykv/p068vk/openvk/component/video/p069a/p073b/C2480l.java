package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.l */
/* compiled from: Urls */
public class C2480l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<String> f5276a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Set<String> f5277b = new HashSet();

    /* renamed from: c */
    private final ArrayList<C2481a> f5278c;

    /* renamed from: d */
    private final int f5279d;

    /* renamed from: e */
    private int f5280e = -1;

    /* renamed from: f */
    private int f5281f;

    /* renamed from: g */
    private final int f5282g;

    C2480l(List<String> list) {
        int i;
        if (!list.isEmpty()) {
            this.f5279d = list.size();
            this.f5278c = new ArrayList<>(this.f5279d);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (String next : list) {
                C2481a aVar = new C2481a(next);
                if (f5276a.contains(next)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(aVar);
                } else if (f5277b.contains(next)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(aVar);
                } else {
                    this.f5278c.add(aVar);
                }
            }
            if (arrayList != null) {
                this.f5278c.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.f5278c.addAll(arrayList2);
            }
            Integer num = C2446e.f5193i;
            if (num == null || num.intValue() <= 0) {
                i = this.f5279d >= 2 ? 1 : 2;
            } else {
                i = num.intValue();
            }
            this.f5282g = i;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    C2480l(String str) {
        ArrayList<C2481a> arrayList = new ArrayList<>(1);
        this.f5278c = arrayList;
        arrayList.add(new C2481a(str));
        this.f5279d = 1;
        this.f5282g = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16216a() {
        return this.f5281f < this.f5282g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2481a mo16217b() {
        if (mo16216a()) {
            int i = this.f5280e + 1;
            if (i >= this.f5279d - 1) {
                this.f5280e = -1;
                this.f5281f++;
            } else {
                this.f5280e = i;
            }
            C2481a aVar = this.f5278c.get(i);
            aVar.f5284b = (this.f5281f * this.f5279d) + this.f5280e;
            return aVar;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.l$a */
    /* compiled from: Urls */
    public class C2481a {

        /* renamed from: a */
        final String f5283a;

        /* renamed from: b */
        int f5284b;

        C2481a(String str) {
            this.f5283a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16218a() {
            C2480l.f5276a.add(this.f5283a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16219b() {
            C2480l.f5277b.add(this.f5283a);
        }

        public String toString() {
            return this.f5283a;
        }
    }
}
