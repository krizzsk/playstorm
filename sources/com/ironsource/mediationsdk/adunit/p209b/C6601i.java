package com.ironsource.mediationsdk.adunit.p209b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.i */
public final class C6601i extends C6598f {
    public C6601i(C6594d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo36529a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo36530a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        mo36519a(C6592b.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    /* renamed from: a */
    public final void mo36531a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: b */
    public final void mo36532b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    /* renamed from: b */
    public final void mo36533b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: c */
    public final void mo36534c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    /* renamed from: d */
    public final void mo36535d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_BIDDING_DATA_MISSING, hashMap);
    }

    /* renamed from: e */
    public final void mo36536e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    /* renamed from: f */
    public final void mo36537f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    /* renamed from: g */
    public final void mo36538g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: h */
    public final void mo36539h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    /* renamed from: i */
    public final void mo36540i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    /* renamed from: j */
    public final void mo36541j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    /* renamed from: k */
    public final void mo36542k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, hashMap);
    }

    /* renamed from: l */
    public final void mo36543l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_CLOSED, hashMap);
    }

    /* renamed from: m */
    public final void mo36544m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    /* renamed from: n */
    public final void mo36545n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: o */
    public final void mo36546o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: p */
    public final void mo36547p(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOTING_WATERFALL_OVERHEAD, hashMap);
    }

    /* renamed from: q */
    public final void mo36548q(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36519a(C6592b.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }
}
