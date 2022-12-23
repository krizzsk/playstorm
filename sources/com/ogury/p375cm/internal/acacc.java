package com.ogury.p375cm.internal;

import android.content.Context;
import com.ogury.p375cm.internal.acbac;

/* renamed from: com.ogury.cm.internal.acacc */
public final class acacc {

    /* renamed from: a */
    private acbaa[] f25843a;

    public acacc() {
        this((acbac) null, (acbab) null, 3, (bbabb) null);
    }

    private acacc(acbac acbac, acbab acbab) {
        bbabc.m30943b(acbac, "outsideShareTcf");
        bbabc.m30943b(acbab, "outsideShareCcpaf");
        this.f25843a = new acbaa[]{acbac, acbab};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acacc(acbac acbac, acbab acbab, int i, bbabb bbabb) {
        this(abbba.m30710a() != 2 ? new acbba() : new acbba(), new acbab());
        acbac.aaaaa aaaaa = acbac.f25845a;
        abbba abbba = abbba.f25716a;
    }

    /* renamed from: a */
    public final void mo66625a(Context context) {
        bbabc.m30943b(context, "context");
        for (acbaa a : this.f25843a) {
            a.mo66626a(context);
        }
    }
}
