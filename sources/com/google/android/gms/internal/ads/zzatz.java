package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzatz {
    public static final zzawi zza = new zzaty();
    private static final Pattern zzd = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zzb = -1;
    public int zzc = -1;

    public final boolean zza() {
        return (this.zzb == -1 || this.zzc == -1) ? false : true;
    }

    public final boolean zzb(zzawd zzawd) {
        for (int i = 0; i < zzawd.zza(); i++) {
            zzawc zzb2 = zzawd.zzb(i);
            if (zzb2 instanceof zzawh) {
                zzawh zzawh = (zzawh) zzb2;
                String str = zzawh.zzb;
                String str2 = zzawh.zzc;
                if (!"iTunSMPB".equals(str)) {
                    continue;
                } else {
                    Matcher matcher = zzd.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.zzb = parseInt;
                                this.zzc = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
