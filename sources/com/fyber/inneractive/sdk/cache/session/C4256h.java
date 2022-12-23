package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.cache.session.h */
public class C4256h extends PriorityQueue<C4249e> {

    /* renamed from: a */
    public int f10524a;

    public C4256h(int i) {
        super(1, new C4257i());
        this.f10524a = i;
    }

    /* renamed from: a */
    public boolean add(C4249e eVar) {
        boolean add = super.add(eVar);
        if (super.size() > this.f10524a) {
            poll();
        }
        return add;
    }

    public int size() {
        return super.size();
    }
}
