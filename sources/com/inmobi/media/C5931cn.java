package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p398ms.p399bd.p400o.Pgl.C12379c;

/* renamed from: com.inmobi.media.cn */
/* compiled from: AdNetworkResponse */
public final class C5931cn {

    /* renamed from: a */
    public C6207gy f15035a;

    /* renamed from: b */
    public InMobiAdRequestStatus f15036b;

    /* renamed from: c */
    private C5930cm f15037c;

    public C5931cn(C5930cm cmVar, C6207gy gyVar) {
        this.f15037c = cmVar;
        this.f15035a = gyVar;
        if (gyVar.f15722a != null) {
            int i = this.f15035a.f15722a.f15700a;
            if (i == -8) {
                this.f15036b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
            } else if (i == -7) {
                this.f15036b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                if (this.f15035a.f15722a.f15701b != null) {
                    this.f15036b.setCustomMessage(this.f15035a.f15722a.f15701b);
                }
            } else if (i != 0) {
                switch (i) {
                    case 500:
                    case IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE /*501*/:
                    case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /*502*/:
                    case 503:
                    case IronSourceError.ERROR_CODE_KEY_NOT_SET /*505*/:
                        this.f15036b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                        return;
                    case C12379c.COLLECT_MODE_TIKTOK_GUEST /*504*/:
                        this.f15036b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                        return;
                    default:
                        this.f15036b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                        return;
                }
            } else {
                this.f15036b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
            }
        }
    }
}
