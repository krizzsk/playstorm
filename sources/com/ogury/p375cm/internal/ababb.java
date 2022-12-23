package com.ogury.p375cm.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.aaid.OguryAaid;

/* renamed from: com.ogury.cm.internal.ababb */
public final class ababb {

    /* renamed from: a */
    public static final ababb f25701a = new ababb();

    /* renamed from: com.ogury.cm.internal.ababb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<String> {

        /* renamed from: a */
        final /* synthetic */ Context f25702a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(Context context) {
            super(0);
            this.f25702a = context;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            OguryAaid aaid = InternalCore.getAaid(this.f25702a);
            bbabc.m30940a((Object) aaid, "InternalCore.getAaid(context)");
            return aaid.getId();
        }
    }

    /* renamed from: com.ogury.cm.internal.ababb$aaaab */
    static final class aaaab extends bbaca implements bbaab<String, babcc> {

        /* renamed from: a */
        final /* synthetic */ ababa f25703a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(ababa ababa) {
            super(1);
            this.f25703a = ababa;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66506a(Object obj) {
            String str = (String) obj;
            ababa ababa = this.f25703a;
            bbabc.m30940a((Object) str, "aaid");
            ababa.mo66487a(str);
            return babcc.f25908a;
        }
    }

    private ababb() {
    }

    /* renamed from: a */
    public static void m30698a(Context context, ababa ababa) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(ababa, "aaidCallback");
        new abacb(new aaaaa(context)).mo66552a(new aaaab(ababa));
    }
}
