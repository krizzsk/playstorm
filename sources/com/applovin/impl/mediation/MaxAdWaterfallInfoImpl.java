package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a */
    private final C1573a f1995a;

    /* renamed from: b */
    private final String f1996b;

    /* renamed from: c */
    private final String f1997c;

    /* renamed from: d */
    private final List<MaxNetworkResponseInfo> f1998d;

    /* renamed from: e */
    private final long f1999e;

    public MaxAdWaterfallInfoImpl(C1573a aVar, long j, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.mo13163m(), aVar.mo13164n(), j, list);
    }

    public MaxAdWaterfallInfoImpl(C1573a aVar, String str, String str2, long j, List<MaxNetworkResponseInfo> list) {
        this.f1995a = aVar;
        this.f1996b = str;
        this.f1997c = str2;
        this.f1998d = list;
        this.f1999e = j;
    }

    public long getLatencyMillis() {
        return this.f1999e;
    }

    public MaxAd getLoadedAd() {
        return this.f1995a;
    }

    public String getName() {
        return this.f1996b;
    }

    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f1998d;
    }

    public String getTestName() {
        return this.f1997c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f1996b + ", testName=" + this.f1997c + ", networkResponses=" + this.f1998d + ", latencyMillis=" + this.f1999e + '}';
    }
}
