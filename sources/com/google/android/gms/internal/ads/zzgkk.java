package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgko;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzgkk<MessageType extends zzgko<MessageType, BuilderType>, BuilderType extends zzgkk<MessageType, BuilderType>> extends zzgio<MessageType, BuilderType> {
    protected zzgko zza;
    protected boolean zzb = false;
    private final zzgko zzc;

    protected zzgkk(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzgko) messagetype.zzb(4, (Object) null, (Object) null);
    }

    private static final void zza(zzgko zzgko, zzgko zzgko2) {
        zzgmg.zza().zzb(zzgko.getClass()).zzg(zzgko, zzgko2);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ zzgio zzae(zzgip zzgip) {
        zzah((zzgko) zzgip);
        return this;
    }

    /* renamed from: zzag */
    public final zzgkk zzad() {
        zzgkk zzgkk = (zzgkk) this.zzc.zzb(5, (Object) null, (Object) null);
        zzgkk.zzah(zzal());
        return zzgkk;
    }

    public final zzgkk zzah(zzgko zzgko) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zza(this.zza, zzgko);
        return this;
    }

    public final zzgkk zzai(byte[] bArr, int i, int i2, zzgka zzgka) throws zzgla {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        try {
            zzgmg.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgis(zzgka));
            return this;
        } catch (zzgla e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzgla.zzj();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    public final MessageType zzaj() {
        MessageType zzak = zzal();
        if (zzak.zzaP()) {
            return zzak;
        }
        throw new zzgnh(zzak);
    }

    /* renamed from: zzak */
    public MessageType zzal() {
        if (this.zzb) {
            return this.zza;
        }
        zzgko zzgko = this.zza;
        zzgmg.zza().zzb(zzgko.getClass()).zzf(zzgko);
        this.zzb = true;
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public void zzan() {
        zzgko zzgko = (zzgko) this.zza.zzb(4, (Object) null, (Object) null);
        zza(zzgko, this.zza);
        this.zza = zzgko;
    }

    public final /* synthetic */ zzgly zzbh() {
        return this.zzc;
    }
}
