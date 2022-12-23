package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* renamed from: com.inmobi.media.bp */
/* compiled from: AdFetchFailureException */
public final class C5897bp extends RuntimeException {

    /* renamed from: a */
    public final InMobiAdRequestStatus f14887a;

    /* renamed from: b */
    public final byte f14888b;

    public C5897bp(InMobiAdRequestStatus inMobiAdRequestStatus, byte b) {
        this.f14887a = inMobiAdRequestStatus;
        this.f14888b = b;
    }

    public final String getMessage() {
        return this.f14887a.getMessage();
    }
}
