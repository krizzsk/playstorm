package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p */
public class C5041p {

    /* renamed from: h */
    public static final Comparator<C5044c> f13452h = new C5042a();

    /* renamed from: i */
    public static final Comparator<C5044c> f13453i = new C5043b();

    /* renamed from: a */
    public final int f13454a;

    /* renamed from: b */
    public final ArrayList<C5044c> f13455b = new ArrayList<>();

    /* renamed from: c */
    public final C5044c[] f13456c = new C5044c[5];

    /* renamed from: d */
    public int f13457d = -1;

    /* renamed from: e */
    public int f13458e;

    /* renamed from: f */
    public int f13459f;

    /* renamed from: g */
    public int f13460g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$a */
    public class C5042a implements Comparator<C5044c> {
        public int compare(Object obj, Object obj2) {
            return ((C5044c) obj).f13461a - ((C5044c) obj2).f13461a;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$b */
    public class C5043b implements Comparator<C5044c> {
        public int compare(Object obj, Object obj2) {
            float f = ((C5044c) obj).f13463c;
            float f2 = ((C5044c) obj2).f13463c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$c */
    public static class C5044c {

        /* renamed from: a */
        public int f13461a;

        /* renamed from: b */
        public int f13462b;

        /* renamed from: c */
        public float f13463c;
    }

    public C5041p(int i) {
        this.f13454a = i;
    }
}
