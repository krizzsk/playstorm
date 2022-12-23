package com.ogury.p375cm.internal;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aaccb */
public final class aaccb extends aacca {

    /* renamed from: com.ogury.cm.internal.aaccb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaccb f25676a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f25677b;

        /* renamed from: c */
        final /* synthetic */ Context f25678c;

        /* renamed from: d */
        final /* synthetic */ acabc f25679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(aaccb aaccb, CountDownLatch countDownLatch, Context context, acabc acabc) {
            super(0);
            this.f25676a = aaccb;
            this.f25677b = countDownLatch;
            this.f25678c = context;
            this.f25679d = acabc;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            this.f25677b.await();
            this.f25676a.mo66536a().mo66491a(this.f25678c, this.f25679d, this.f25677b);
            return babcc.f25908a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaccb(aacbc aacbc) {
        super(aacbc);
        bbabc.m30943b(aacbc, "requestScheduler");
    }

    /* renamed from: a */
    public final void mo66537a(Context context, acabc acabc, CountDownLatch countDownLatch) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(acabc, "requestType");
        bbabc.m30943b(countDownLatch, "countDownLatch");
        mo66536a().mo66493a(context, countDownLatch);
        bacbb.m30926a(false, false, (ClassLoader) null, (String) null, 0, new aaaaa(this, countDownLatch, context, acabc), 31, (Object) null);
    }
}
