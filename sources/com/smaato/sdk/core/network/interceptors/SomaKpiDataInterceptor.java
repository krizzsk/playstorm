package com.smaato.sdk.core.network.interceptors;

import com.smaato.sdk.core.kpi.KpiDBHelper;
import com.smaato.sdk.core.network.Request;

public class SomaKpiDataInterceptor extends KpiDataInterceptor {
    public SomaKpiDataInterceptor(KpiDBHelper kpiDBHelper) {
        this.kpiDBHelper = kpiDBHelper;
    }

    /* access modifiers changed from: protected */
    public String getAdSpaceId(Request request) {
        return request.uri().getQueryParameter("adspace");
    }
}
