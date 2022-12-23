package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfmu {
    final zzfmx zza;
    final boolean zzb;

    private zzfmu(zzfmx zzfmx) {
        this.zza = zzfmx;
        this.zzb = zzfmx != null;
    }

    public static zzfmu zzb(Context context, String str, String str2) {
        zzfmx zzfmx;
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (instantiate == null) {
                zzfmx = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfmx = queryLocalInterface instanceof zzfmx ? (zzfmx) queryLocalInterface : new zzfmv(instantiate);
            }
            try {
                zzfmx.zze(ObjectWrapper.wrap(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new zzfmu(zzfmx);
            } catch (RemoteException | zzflw | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfmu(new zzfmy());
            }
        } catch (Exception e) {
            throw new zzflw(e);
        } catch (Exception e2) {
            throw new zzflw(e2);
        }
    }

    public static zzfmu zzc() {
        zzfmy zzfmy = new zzfmy();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfmu(zzfmy);
    }

    public final zzfmt zza(byte[] bArr) {
        return new zzfmt(this, bArr, (zzfms) null);
    }
}
