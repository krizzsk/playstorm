package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgqj extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzgqj(zzbiw zzbiw, byte[] bArr) {
        this.zza = new WeakReference(zzbiw);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbiw zzbiw = (zzbiw) this.zza.get();
        if (zzbiw != null) {
            zzbiw.zzc(customTabsClient);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbiw zzbiw = (zzbiw) this.zza.get();
        if (zzbiw != null) {
            zzbiw.zzd();
        }
    }
}
