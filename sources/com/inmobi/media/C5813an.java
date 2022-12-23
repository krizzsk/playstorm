package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.an */
/* compiled from: LoadWithResponseWorker */
final class C5813an extends C5825as<C5849bb> {

    /* renamed from: a */
    private final WeakReference<C5927cj> f14651a;

    /* renamed from: b */
    private byte[] f14652b;

    /* renamed from: c */
    private long f14653c;

    /* renamed from: d */
    private byte f14654d = 0;

    /* renamed from: e */
    private String f14655e = null;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34436a(Object obj) {
        C5849bb bbVar = (C5849bb) obj;
        C5927cj cjVar = (C5927cj) this.f14651a.get();
        if (cjVar == null) {
            return;
        }
        if (bbVar == null) {
            if (this.f14654d != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(this.f14654d));
                hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, this.f14655e);
                cjVar.f15021a.mo34504b((Map<String, Object>) hashMap);
            }
            cjVar.f15021a.mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 0);
            return;
        }
        cjVar.f15021a.mo34512c(bbVar);
    }

    C5813an(C5762ad adVar, C5927cj cjVar, byte[] bArr, long j) {
        super(adVar, (byte) 3);
        this.f14651a = new WeakReference<>(cjVar);
        this.f14652b = bArr;
        this.f14653c = j;
    }

    /* renamed from: b */
    public final void mo34437b() {
        super.mo34437b();
        C5927cj cjVar = (C5927cj) this.f14651a.get();
        if (cjVar != null) {
            cjVar.f15021a.mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (byte) 40);
        }
    }

    /* renamed from: a */
    public final void mo34435a() {
        C5927cj cjVar = (C5927cj) this.f14651a.get();
        if (cjVar == null) {
            mo34703b(null);
            return;
        }
        byte[] bArr = this.f14652b;
        C6207gy gyVar = new C6207gy();
        gyVar.mo35395a(bArr);
        try {
            JSONObject jSONObject = new JSONObject(new C5931cn((C5930cm) null, gyVar).f15035a.mo35397b());
            if (this.f14653c == jSONObject.getLong(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID)) {
                mo34703b(cjVar.f15021a.mo34548r().mo34826a(jSONObject));
                return;
            }
            C6238hu.m18605a((byte) 1, "InMobi", "Placement Id of Request and response doesn't match");
            this.f14654d = 46;
            throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f14654d);
        } catch (C5897bp unused) {
            m17316c();
        } catch (JSONException e) {
            this.f14655e = e.getMessage();
            m17316c();
        }
    }

    /* renamed from: c */
    private void m17316c() {
        String str = C5762ad.f14527a;
        this.f14654d = 1;
        mo34703b(null);
    }
}
