package com.inmobi.media;

import com.inmobi.media.C6028ei;
import com.inmobi.media.C6125fq;

/* renamed from: com.inmobi.media.eh */
/* compiled from: PollingVisibilityTracker */
class C6027eh extends C6028ei {

    /* renamed from: a */
    C6125fq.C6142m f15328a;

    C6027eh(C6028ei.C6029a aVar, C6125fq.C6142m mVar, byte b) {
        super(aVar, b);
        this.f15328a = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35128a() {
        C6125fq.C6142m mVar = this.f15328a;
        if (mVar == null) {
            return 100;
        }
        return mVar.visibilityThrottleMillis;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35129b() {
        mo35158h();
    }
}
