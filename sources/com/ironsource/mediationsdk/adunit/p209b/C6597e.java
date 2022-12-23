package com.ironsource.mediationsdk.adunit.p209b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.e */
public final class C6597e extends C6598f {
    public C6597e(C6594d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo36512a() {
        mo36518a(C6592b.AUCTION_REQUEST);
    }

    /* renamed from: a */
    public final void mo36513a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        mo36519a(C6592b.AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo36514a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo36519a(C6592b.AUCTION_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo36515a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo36519a(C6592b.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    /* renamed from: b */
    public final void mo36516b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo36519a(C6592b.AUCTION_RESULT_WATERFALL, hashMap);
    }

    /* renamed from: c */
    public final void mo36517c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, str);
        mo36519a(C6592b.AD_UNIT_CAPPED, hashMap);
    }
}
