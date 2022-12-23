package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzfk extends zzes {
    public final zzew zzb;
    public final int zzc;

    public zzfk(zzew zzew, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzew;
        this.zzc = 1;
    }

    public static zzfk zza(IOException iOException, zzew zzew, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfoa.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new zzfj(iOException, zzew);
        }
        return new zzfk(iOException, zzew, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzfk(IOException iOException, zzew zzew, int i, int i2) {
        super((Throwable) iOException, zzb(i, i2));
        this.zzb = zzew;
        this.zzc = i2;
    }

    public zzfk(String str, zzew zzew, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzew;
        this.zzc = i2;
    }

    public zzfk(String str, IOException iOException, zzew zzew, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzew;
        this.zzc = i2;
    }
}
