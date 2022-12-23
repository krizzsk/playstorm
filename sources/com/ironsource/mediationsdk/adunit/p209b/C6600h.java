package com.ironsource.mediationsdk.adunit.p209b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.h */
public final class C6600h extends C6598f {
    public C6600h(C6594d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo36523a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo36519a(C6592b.LOAD_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo36524a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo36519a(C6592b.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    /* renamed from: a */
    public final void mo36525a(long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z));
        }
        mo36519a(C6592b.LOAD_AD_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo36526a(boolean z) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z));
        }
        mo36519a(C6592b.LOAD_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo36527a(boolean z, long j, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired");
        }
        mo36519a(z ? C6592b.AD_AVAILABILITY_CHANGED_TRUE : C6592b.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }

    /* renamed from: b */
    public final void mo36528b(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo36519a(C6592b.LOAD_AD_NO_FILL, hashMap);
    }
}
