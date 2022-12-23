package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p028a.C1573a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.h */
public class C1775h {

    /* renamed from: a */
    private final List<C1776a> f2771a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.mediation.h$a */
    public interface C1776a {
        /* renamed from: a */
        void mo13720a(C1573a aVar);
    }

    /* renamed from: a */
    public void mo13717a(C1573a aVar) {
        Iterator it = new ArrayList(this.f2771a).iterator();
        while (it.hasNext()) {
            ((C1776a) it.next()).mo13720a(aVar);
        }
    }

    /* renamed from: a */
    public void mo13718a(C1776a aVar) {
        this.f2771a.add(aVar);
    }

    /* renamed from: b */
    public void mo13719b(C1776a aVar) {
        this.f2771a.remove(aVar);
    }
}
