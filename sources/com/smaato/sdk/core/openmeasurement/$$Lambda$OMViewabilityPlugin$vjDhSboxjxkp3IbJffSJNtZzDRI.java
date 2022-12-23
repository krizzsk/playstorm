package com.smaato.sdk.core.openmeasurement;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.util.AssetUtils;

/* renamed from: com.smaato.sdk.core.openmeasurement.-$$Lambda$OMViewabilityPlugin$vjDhSboxjxkp3IbJffSJNtZzDRI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$OMViewabilityPlugin$vjDhSboxjxkp3IbJffSJNtZzDRI implements ClassFactory {
    public static final /* synthetic */ $$Lambda$OMViewabilityPlugin$vjDhSboxjxkp3IbJffSJNtZzDRI INSTANCE = new $$Lambda$OMViewabilityPlugin$vjDhSboxjxkp3IbJffSJNtZzDRI();

    private /* synthetic */ $$Lambda$OMViewabilityPlugin$vjDhSboxjxkp3IbJffSJNtZzDRI() {
    }

    public final Object get(DiConstructor diConstructor) {
        return AssetUtils.getFileFromAssets((Context) diConstructor.get(Application.class), DiLogLayer.getLoggerFrom(diConstructor), "omsdk-v1.js");
    }
}
