package com.smaato.sdk.core.datacollector;

import android.content.Context;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Pair;
import com.smaato.sdk.core.util.reflection.MethodAccessor;

public final class GoogleAdvertisingClientInfo {
    private final Context context;
    private final Logger logger;
    private MethodAccessor methodAccessor;

    public GoogleAdvertisingClientInfo(Logger logger2, Context context2) {
        this.logger = logger2;
        this.context = context2;
    }

    public String getAdvertisingId() {
        try {
            Object googleAdvertisingIdInfo = getGoogleAdvertisingIdInfo();
            if (googleAdvertisingIdInfo != null) {
                return (String) new MethodAccessor.Builder().fromObjectInstance(googleAdvertisingIdInfo).setMethodName("getId").build().execute();
            }
            throw new MethodAccessor.MethodAccessingException(new Throwable("Cannot fetch AdvertisingIdClient.Info: null received"));
        } catch (MethodAccessor.MethodAccessingException | ClassNotFoundException e) {
            this.logger.error(LogDomain.DATA_COLLECTOR, e, "Cannot fetch AdvertisingIdClient.Info: Advertising ID is null", new Object[0]);
            return null;
        }
    }

    public boolean isLimitAdTrackingEnabled() {
        try {
            Object googleAdvertisingIdInfo = getGoogleAdvertisingIdInfo();
            if (googleAdvertisingIdInfo != null) {
                return ((Boolean) new MethodAccessor.Builder().fromObjectInstance(googleAdvertisingIdInfo).setMethodName("isLimitAdTrackingEnabled").build().execute()).booleanValue();
            }
            throw new MethodAccessor.MethodAccessingException(new Throwable("Cannot fetch AdvertisingIdClient.Info: null received"));
        } catch (MethodAccessor.MethodAccessingException | ClassNotFoundException e) {
            this.logger.error(LogDomain.DATA_COLLECTOR, e, "Cannot fetch AdvertisingIdClient.Info: isLimitAdTrackingEnabled is null", new Object[0]);
            return true;
        }
    }

    private Object getGoogleAdvertisingIdInfo() throws ClassNotFoundException, MethodAccessor.MethodAccessingException {
        MethodAccessor build = new MethodAccessor.Builder().fromClassInstance("com.google.android.gms.ads.identifier.AdvertisingIdClient").setMethodName("getAdvertisingIdInfo").withParametersOfResolvedTypes(Pair.m32964of(Context.class, this.context)).build();
        this.methodAccessor = build;
        return build.execute();
    }
}
