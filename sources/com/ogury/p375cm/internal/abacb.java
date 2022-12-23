package com.ogury.p375cm.internal;

import com.ogury.p375cm.internal.bbacb;

/* renamed from: com.ogury.cm.internal.abacb */
public final class abacb<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public bbaaa<? extends T> f25706a;

    /* renamed from: com.ogury.cm.internal.abacb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ abacb f25707a;

        /* renamed from: b */
        final /* synthetic */ bbaab f25708b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(abacb abacb, bbaab bbaab) {
            super(0);
            this.f25707a = abacb;
            this.f25708b = bbaab;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            final bbacb.aaaab aaaab = new bbacb.aaaab();
            aaaab.f25924a = this.f25707a.f25706a.mo66502a();
            abbac abbac = abbac.f25713a;
            abbac.m30709b().mo66550a(new bbaaa<babcc>(this) {

                /* renamed from: a */
                final /* synthetic */ aaaaa f25709a;

                {
                    this.f25709a = r1;
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Object mo66502a() {
                    this.f25709a.f25708b.mo66506a(aaaab.f25924a);
                    return babcc.f25908a;
                }
            });
            return babcc.f25908a;
        }
    }

    public abacb(bbaaa<? extends T> bbaaa) {
        bbabc.m30943b(bbaaa, "action");
        this.f25706a = bbaaa;
    }

    /* renamed from: a */
    public final void mo66552a(bbaab<? super T, babcc> bbaab) {
        bbabc.m30943b(bbaab, "callback");
        abbac abbac = abbac.f25713a;
        abbac.m30708a().mo66550a(new aaaaa(this, bbaab));
    }
}
