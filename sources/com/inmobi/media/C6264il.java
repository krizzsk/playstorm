package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;

/* renamed from: com.inmobi.media.il */
/* compiled from: ListRule */
public final class C6264il<E> extends C6266in<List<E>> {

    /* renamed from: a */
    private Class<E> f15870a;

    public C6264il(Constructor<List<E>> constructor, Class<E> cls) {
        super(constructor);
        this.f15870a = cls;
    }

    /* renamed from: a */
    public final List<E> mo35469a() {
        return (List) this.f15872b.construct();
    }

    /* renamed from: b */
    public final Class<E> mo35470b() {
        return this.f15870a;
    }
}
