package com.inmobi.media;

import android.view.View;
import com.inmobi.media.C6028ei;
import com.inmobi.media.C6125fq;

/* renamed from: com.inmobi.media.eb */
/* compiled from: HtmlPollingVisibilityTracker */
public final class C6012eb extends C6027eh {

    /* renamed from: com.inmobi.media.eb$a */
    /* compiled from: HtmlPollingVisibilityTracker */
    public interface C6013a extends C6028ei.C6029a {
        /* renamed from: a */
        boolean mo35134a(View view);
    }

    public C6012eb(C6028ei.C6029a aVar, C6125fq.C6142m mVar, byte b) {
        super(aVar, mVar, b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo35128a() {
        if (this.f15328a == null) {
            return 1000;
        }
        return this.f15328a.web.impressionPollIntervalMillis;
    }
}
