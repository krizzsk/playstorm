package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.video.vast.tracking.macro.RegulationInfoMacros;

/* renamed from: com.smaato.sdk.video.vast.tracking.macro.-$$Lambda$DiMacros$xheW8tq3xjPPNyy_G1jprmzd1Qo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiMacros$xheW8tq3xjPPNyy_G1jprmzd1Qo implements RegulationInfoMacros.CoppaProvider {
    public static final /* synthetic */ $$Lambda$DiMacros$xheW8tq3xjPPNyy_G1jprmzd1Qo INSTANCE = new $$Lambda$DiMacros$xheW8tq3xjPPNyy_G1jprmzd1Qo();

    private /* synthetic */ $$Lambda$DiMacros$xheW8tq3xjPPNyy_G1jprmzd1Qo() {
    }

    public final Object get() {
        return Boolean.valueOf(SmaatoSdk.getCoppa());
    }
}
