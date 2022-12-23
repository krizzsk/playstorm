package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzxx {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] zzd = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return zzb[i] * 256;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return zzf((b & 192) >> 6, b & 63);
    }

    public static zzad zzc(zzdy zzdy, String str, String str2, zzv zzv) {
        int i = zzc[(zzdy.zzk() & 192) >> 6];
        int zzk = zzdy.zzk();
        int i2 = zze[(zzk & 56) >> 3];
        if ((zzk & 4) != 0) {
            i2++;
        }
        zzab zzab = new zzab();
        zzab.zzH(str);
        zzab.zzS("audio/ac3");
        zzab.zzw(i2);
        zzab.zzT(i);
        zzab.zzB(zzv);
        zzab.zzK(str2);
        return zzab.zzY();
    }

    public static zzad zzd(zzdy zzdy, String str, String str2, zzv zzv) {
        zzdy.zzG(2);
        int i = zzc[(zzdy.zzk() & 192) >> 6];
        int zzk = zzdy.zzk();
        int i2 = zze[(zzk & 14) >> 1];
        if ((zzk & 1) != 0) {
            i2++;
        }
        if (((zzdy.zzk() & 30) >> 1) > 0 && (2 & zzdy.zzk()) != 0) {
            i2 += 2;
        }
        String str3 = (zzdy.zza() <= 0 || (zzdy.zzk() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzab zzab = new zzab();
        zzab.zzH(str);
        zzab.zzS(str3);
        zzab.zzw(i2);
        zzab.zzT(i);
        zzab.zzB(zzv);
        zzab.zzK(str2);
        return zzab.zzY();
    }

    public static zzxw zze(zzdx zzdx) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zzdx zzdx2 = zzdx;
        int zzb2 = zzdx.zzb();
        zzdx2.zzj(40);
        int zzc2 = zzdx2.zzc(5);
        zzdx2.zzh(zzb2);
        int i11 = -1;
        if (zzc2 > 10) {
            zzdx2.zzj(16);
            int zzc3 = zzdx2.zzc(2);
            if (zzc3 == 0) {
                i11 = 0;
            } else if (zzc3 == 1) {
                i11 = 1;
            } else if (zzc3 == 2) {
                i11 = 2;
            }
            zzdx2.zzj(3);
            int zzc4 = zzdx2.zzc(11) + 1;
            i4 = zzc4 + zzc4;
            int zzc5 = zzdx2.zzc(2);
            if (zzc5 == 3) {
                i5 = 6;
                i2 = zzd[zzdx2.zzc(2)];
                i6 = 3;
            } else {
                i6 = zzdx2.zzc(2);
                i5 = zzb[i6];
                i2 = zzc[zzc5];
            }
            i3 = i5 * 256;
            int zzc6 = zzdx2.zzc(3);
            boolean zzl = zzdx.zzl();
            i = zze[zzc6] + (zzl ? 1 : 0);
            zzdx2.zzj(10);
            if (zzdx.zzl()) {
                zzdx2.zzj(8);
            }
            if (zzc6 == 0) {
                zzdx2.zzj(5);
                if (zzdx.zzl()) {
                    zzdx2.zzj(8);
                }
                i7 = 0;
                zzc6 = 0;
            } else {
                i7 = zzc6;
            }
            if (i11 == 1) {
                if (zzdx.zzl()) {
                    zzdx2.zzj(16);
                }
                i8 = 1;
            } else {
                i8 = i11;
            }
            if (zzdx.zzl()) {
                if (i7 > 2) {
                    zzdx2.zzj(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    zzdx2.zzj(6);
                }
                if ((i7 & 4) != 0) {
                    zzdx2.zzj(6);
                }
                if (zzl && zzdx.zzl()) {
                    zzdx2.zzj(5);
                }
                if (i8 == 0) {
                    if (zzdx.zzl()) {
                        zzdx2.zzj(6);
                    }
                    if (i7 == 0 && zzdx.zzl()) {
                        zzdx2.zzj(6);
                    }
                    if (zzdx.zzl()) {
                        zzdx2.zzj(6);
                    }
                    int zzc7 = zzdx2.zzc(2);
                    if (zzc7 == 1) {
                        zzdx2.zzj(5);
                    } else if (zzc7 == 2) {
                        zzdx2.zzj(12);
                    } else if (zzc7 == 3) {
                        int zzc8 = zzdx2.zzc(5);
                        if (zzdx.zzl()) {
                            zzdx2.zzj(5);
                            if (zzdx.zzl()) {
                                zzdx2.zzj(4);
                            }
                            if (zzdx.zzl()) {
                                zzdx2.zzj(4);
                            }
                            if (zzdx.zzl()) {
                                zzdx2.zzj(4);
                            }
                            if (zzdx.zzl()) {
                                zzdx2.zzj(4);
                            }
                            if (zzdx.zzl()) {
                                zzdx2.zzj(4);
                            }
                            if (zzdx.zzl()) {
                                zzdx2.zzj(4);
                            }
                            if (zzdx.zzl()) {
                                zzdx2.zzj(4);
                            }
                            if (zzdx.zzl()) {
                                if (zzdx.zzl()) {
                                    zzdx2.zzj(4);
                                }
                                if (zzdx.zzl()) {
                                    zzdx2.zzj(4);
                                }
                            }
                        }
                        if (zzdx.zzl()) {
                            zzdx2.zzj(5);
                            if (zzdx.zzl()) {
                                zzdx2.zzj(7);
                                if (zzdx.zzl()) {
                                    i10 = 8;
                                    zzdx2.zzj(8);
                                    zzdx2.zzj((zzc8 + 2) * i10);
                                    zzdx.zzd();
                                }
                            }
                        }
                        i10 = 8;
                        zzdx2.zzj((zzc8 + 2) * i10);
                        zzdx.zzd();
                    }
                    if (i7 < 2) {
                        if (zzdx.zzl()) {
                            zzdx2.zzj(14);
                        }
                        if (zzc6 == 0 && zzdx.zzl()) {
                            zzdx2.zzj(14);
                        }
                    }
                    if (zzdx.zzl()) {
                        if (i6 == 0) {
                            zzdx2.zzj(5);
                            i8 = 0;
                            i6 = 0;
                        } else {
                            for (int i12 = 0; i12 < i5; i12++) {
                                if (zzdx.zzl()) {
                                    zzdx2.zzj(5);
                                }
                            }
                        }
                    }
                    i8 = 0;
                }
            }
            if (zzdx.zzl()) {
                zzdx2.zzj(5);
                if (i7 == 2) {
                    zzdx2.zzj(4);
                    i7 = 2;
                }
                if (i7 >= 6) {
                    zzdx2.zzj(2);
                }
                if (zzdx.zzl()) {
                    i9 = 8;
                    zzdx2.zzj(8);
                } else {
                    i9 = 8;
                }
                if (i7 == 0 && zzdx.zzl()) {
                    zzdx2.zzj(i9);
                }
                if (zzc5 < 3) {
                    zzdx.zzi();
                }
            }
            if (i8 == 0 && i6 != 3) {
                zzdx.zzi();
            }
            if (i8 == 2 && (i6 == 3 || zzdx.zzl())) {
                zzdx2.zzj(6);
            }
            str = (zzdx.zzl() && zzdx2.zzc(6) == 1 && zzdx2.zzc(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
        } else {
            zzdx2.zzj(32);
            int zzc9 = zzdx2.zzc(2);
            String str2 = zzc9 == 3 ? null : "audio/ac3";
            i4 = zzf(zzc9, zzdx2.zzc(6));
            zzdx2.zzj(8);
            int zzc10 = zzdx2.zzc(3);
            if (!((zzc10 & 1) == 0 || zzc10 == 1)) {
                zzdx2.zzj(2);
            }
            if ((zzc10 & 4) != 0) {
                zzdx2.zzj(2);
            }
            if (zzc10 == 2) {
                zzdx2.zzj(2);
            }
            i2 = zzc9 < 3 ? zzc[zzc9] : -1;
            i = zze[zzc10] + (zzdx.zzl() ? 1 : 0);
            i3 = 1536;
            str = str2;
        }
        return new zzxw(str, i11, i, i2, i4, i3, (zzxv) null);
    }

    private static int zzf(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
