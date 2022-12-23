package com.ironsource.mediationsdk.adunit.p209b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.adunit.b.a */
public final class C6591a extends C6598f {
    public C6591a(C6594d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo36494a() {
        mo36518a(C6592b.SESSION_CAPPED);
    }

    /* renamed from: a */
    public final void mo36495a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36519a(C6592b.SHOW_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo36496a(String str, int i, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        mo36519a(C6592b.SHOW_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo36497a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        mo36519a(C6592b.AD_CLOSED, hashMap);
    }

    /* renamed from: a */
    public final void mo36498a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put("duration", Long.valueOf(j2));
        }
        hashMap.putAll(map);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        mo36520a(C6592b.AD_REWARDED, hashMap, j);
    }

    /* renamed from: a */
    public final void mo36499a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "true" : "false");
        mo36519a(C6592b.SHOW_AD_CHANCE, hashMap);
    }

    /* renamed from: b */
    public final void mo36500b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36519a(C6592b.SHOW_AD_SUCCESS, hashMap);
    }

    /* renamed from: c */
    public final void mo36501c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36519a(C6592b.AD_OPENED, hashMap);
    }

    /* renamed from: d */
    public final void mo36502d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36519a(C6592b.AD_CLICKED, hashMap);
    }

    /* renamed from: e */
    public final void mo36503e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36519a(C6592b.AD_STARTED, hashMap);
    }

    /* renamed from: f */
    public final void mo36504f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36519a(C6592b.AD_ENDED, hashMap);
    }

    /* renamed from: g */
    public final void mo36505g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36519a(C6592b.AD_VISIBLE, hashMap);
    }

    /* renamed from: h */
    public final void mo36506h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36519a(C6592b.PLACEMENT_CAPPED, hashMap);
    }
}
