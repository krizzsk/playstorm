package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C5487C;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzakg extends zzajb {
    private final Object zza = new Object();
    private final zzajg zzb;

    public zzakg(int i, String str, zzajg zzajg, zzajf zzajf) {
        super(i, str, zzajf);
        this.zzb = zzajg;
    }

    /* access modifiers changed from: protected */
    public final zzajh zzh(zzaix zzaix) {
        String str;
        try {
            byte[] bArr = zzaix.zzb;
            Map map = zzaix.zzc;
            String str2 = C5487C.ISO88591_NAME;
            if (map != null) {
                String str3 = (String) map.get("Content-Type");
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaix.zzb);
        }
        return zzajh.zzb(str, zzajy.zzb(zzaix));
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzz */
    public void zzo(String str) {
        zzajg zzajg;
        synchronized (this.zza) {
            zzajg = this.zzb;
        }
        zzajg.zza(str);
    }
}
