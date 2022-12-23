package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p028a.C1578f;
import com.applovin.impl.mediation.p028a.C1581h;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a */
    private String f2000a;

    /* renamed from: b */
    private Map<String, Object> f2001b;

    /* renamed from: c */
    private Bundle f2002c;

    /* renamed from: d */
    private Bundle f2003d;

    /* renamed from: e */
    private Boolean f2004e;

    /* renamed from: f */
    private Boolean f2005f;

    /* renamed from: g */
    private Boolean f2006g;

    /* renamed from: h */
    private String f2007h;

    /* renamed from: i */
    private boolean f2008i;

    /* renamed from: j */
    private String f2009j;

    /* renamed from: k */
    private String f2010k;

    /* renamed from: l */
    private long f2011l;

    /* renamed from: m */
    private MaxAdFormat f2012m;

    private MaxAdapterParametersImpl() {
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m2909a(C1573a aVar) {
        MaxAdapterParametersImpl a = m2910a((C1578f) aVar);
        a.f2009j = aVar.mo13162l();
        a.f2010k = aVar.mo13159i();
        a.f2011l = aVar.mo13160j();
        return a;
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m2910a(C1578f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f2000a = fVar.getAdUnitId();
        maxAdapterParametersImpl.f2004e = fVar.mo13211O();
        maxAdapterParametersImpl.f2005f = fVar.mo13212P();
        maxAdapterParametersImpl.f2006g = fVar.mo13213Q();
        maxAdapterParametersImpl.f2007h = fVar.mo13214R();
        maxAdapterParametersImpl.f2001b = fVar.mo13216T();
        maxAdapterParametersImpl.f2002c = fVar.mo13217U();
        maxAdapterParametersImpl.f2003d = fVar.mo13218V();
        maxAdapterParametersImpl.f2008i = fVar.mo13210N();
        return maxAdapterParametersImpl;
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m2911a(C1581h hVar, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = m2910a((C1578f) hVar);
        a.f2012m = maxAdFormat;
        return a;
    }

    public MaxAdFormat getAdFormat() {
        return this.f2012m;
    }

    public String getAdUnitId() {
        return this.f2000a;
    }

    public long getBidExpirationMillis() {
        return this.f2011l;
    }

    public String getBidResponse() {
        return this.f2010k;
    }

    public String getConsentString() {
        return this.f2007h;
    }

    public Bundle getCustomParameters() {
        return this.f2003d;
    }

    public Map<String, Object> getLocalExtraParameters() {
        return this.f2001b;
    }

    public Bundle getServerParameters() {
        return this.f2002c;
    }

    public String getThirdPartyAdPlacementId() {
        return this.f2009j;
    }

    public Boolean hasUserConsent() {
        return this.f2004e;
    }

    public Boolean isAgeRestrictedUser() {
        return this.f2005f;
    }

    public Boolean isDoNotSell() {
        return this.f2006g;
    }

    public boolean isTesting() {
        return this.f2008i;
    }
}
