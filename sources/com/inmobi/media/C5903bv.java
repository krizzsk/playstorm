package com.inmobi.media;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bv */
/* compiled from: NativeContainerAsset */
public final class C5903bv extends C5901bt implements Iterable<C5901bt> {

    /* renamed from: A */
    public byte f14928A;
    /* access modifiers changed from: package-private */

    /* renamed from: B */
    public C5901bt[] f14929B;
    /* access modifiers changed from: package-private */

    /* renamed from: C */
    public int f14930C;

    /* renamed from: z */
    public long f14931z;

    public final Iterator<C5901bt> iterator() {
        return new C5904a();
    }

    public C5903bv(String str, String str2, C5902bu buVar, byte b, JSONObject jSONObject, byte b2) {
        this(str, str2, buVar, new LinkedList(), b, jSONObject, b2);
    }

    public C5903bv(String str, String str2, C5902bu buVar, List<C5922cf> list, byte b, JSONObject jSONObject, byte b2) {
        super(str, str2, "CONTAINER", buVar, list);
        this.f14931z = 0;
        this.f14897f = jSONObject;
        this.f14929B = new C5901bt[1];
        this.f14900i = b;
        this.f14930C = 0;
        this.f14928A = b2;
    }

    /* renamed from: a */
    public final boolean mo34888a() {
        return "root".equalsIgnoreCase(this.f14895d);
    }

    /* renamed from: b */
    public final boolean mo34889b() {
        return "card_scrollable".equalsIgnoreCase(this.f14895d);
    }

    /* renamed from: com.inmobi.media.bv$a */
    /* compiled from: NativeContainerAsset */
    class C5904a implements Iterator<C5901bt> {

        /* renamed from: b */
        private int f14933b = 0;

        public C5904a() {
        }

        public final boolean hasNext() {
            return this.f14933b < C5903bv.this.f14930C;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object next() {
            C5901bt[] b = C5903bv.this.f14929B;
            int i = this.f14933b;
            this.f14933b = i + 1;
            return b[i];
        }
    }

    /* renamed from: a */
    public final C5901bt mo34887a(int i) {
        if (i < 0 || i >= this.f14930C) {
            return null;
        }
        return this.f14929B[i];
    }
}
