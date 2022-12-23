package com.smaato.sdk.core.network.interceptors;

import android.net.Uri;
import com.smaato.sdk.core.kpi.KpiDBHelper;
import com.smaato.sdk.core.kpi.KpiData;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.IOException;

public abstract class KpiDataInterceptor implements Interceptor {
    protected KpiDBHelper kpiDBHelper;

    /* access modifiers changed from: protected */
    public abstract String getAdSpaceId(Request request);

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Uri.Builder buildUpon = request.uri().buildUpon();
        String adSpaceId = getAdSpaceId(request);
        if (adSpaceId != null) {
            fillKpiData(buildUpon, adSpaceId);
            this.kpiDBHelper.incrementAdRequestCount(adSpaceId);
            try {
                Response proceed = chain.proceed(request.buildUpon().uri(buildUpon.build()).build());
                this.kpiDBHelper.updateFillAndFillRate(adSpaceId, proceed.responseCode() == 200);
                return proceed;
            } catch (Exception e) {
                this.kpiDBHelper.updateFillAndFillRate(adSpaceId, false);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("adspace id is null");
        }
    }

    private void fillKpiData(Uri.Builder builder, String str) {
        KpiData kpiValuesForAdSpace = this.kpiDBHelper.getKpiValuesForAdSpace(str);
        if (kpiValuesForAdSpace != null) {
            builder.appendQueryParameter("asfr", kpiValuesForAdSpace.getRollingFillRatePerAdSpace());
            builder.appendQueryParameter("appfr", kpiValuesForAdSpace.getTotalFillRate());
            builder.appendQueryParameter("totalreq", kpiValuesForAdSpace.getTotalAdRequests());
            builder.appendQueryParameter("session_depth", kpiValuesForAdSpace.getSessionDepthPerAdSpace());
        }
    }
}
