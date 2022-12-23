package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzfnp extends zzfnd {
    private zzfph<Integer> zza;
    private zzfph<Integer> zzb;
    private zzfno zzc;
    private HttpURLConnection zzd;

    zzfnp() {
        this(zzfnm.zza, zzfnn.zza, (zzfno) null);
    }

    zzfnp(zzfph<Integer> zzfph, zzfph<Integer> zzfph2, zzfno zzfno) {
        this.zza = zzfph;
        this.zzb = zzfph2;
        this.zzc = zzfno;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfne.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfne.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfno zzfno = this.zzc;
        if (zzfno != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) zzfno.zza();
            this.zzd = httpURLConnection;
            return httpURLConnection;
        }
        throw null;
    }

    public HttpURLConnection zzn(zzfno zzfno, int i, int i2) throws IOException {
        this.zza = new zzfnf(i);
        this.zzb = new zzfng(i2);
        this.zzc = zzfno;
        return zzm();
    }

    public HttpURLConnection zzo(Network network, URL url, int i, int i2) throws IOException {
        this.zza = new zzfnh(i);
        this.zzb = new zzfni(i2);
        this.zzc = new zzfnj(network, url);
        return zzm();
    }

    public URLConnection zzr(URL url, int i) throws IOException {
        this.zza = new zzfnk(i);
        this.zzc = new zzfnl(url);
        return zzm();
    }
}
