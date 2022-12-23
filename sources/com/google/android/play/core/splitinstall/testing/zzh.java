package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzh implements zzp {
    public final /* synthetic */ SplitInstallRequest zza;

    public /* synthetic */ zzh(SplitInstallRequest splitInstallRequest) {
        this.zza = splitInstallRequest;
    }

    public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
        SplitInstallRequest splitInstallRequest = this.zza;
        int i = FakeSplitInstallManager.zza;
        if (splitInstallSessionState == null || splitInstallSessionState.hasTerminalStatus()) {
            int i2 = 1;
            if (splitInstallSessionState != null) {
                i2 = 1 + splitInstallSessionState.sessionId();
            }
            return SplitInstallSessionState.create(i2, 1, 0, 0, 0, splitInstallRequest.getModuleNames(), new ArrayList());
        }
        throw new SplitInstallException(-1);
    }
}
