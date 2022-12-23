package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzqg {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzqg zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzqg r11 = new com.google.android.gms.internal.ads.zzqg
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L_0x003f
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x003f
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            r5 = 22
            if (r3 > r5) goto L_0x003d
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x002c
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x003d
        L_0x002c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x003f
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r8 = r0
            goto L_0x0040
        L_0x003f:
            r8 = r2
        L_0x0040:
            r3 = 21
            if (r4 == 0) goto L_0x0052
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            if (r5 < r3) goto L_0x0052
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0052
            r9 = r0
            goto L_0x0053
        L_0x0052:
            r9 = r2
        L_0x0053:
            if (r20 != 0) goto L_0x0066
            if (r4 == 0) goto L_0x0064
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            if (r5 < r3) goto L_0x0064
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r10 = r2
            goto L_0x0067
        L_0x0066:
            r10 = r0
        L_0x0067:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqg.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzqg");
    }

    private static Point zzh(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzeg.zze(i, widthAlignment) * widthAlignment, zzeg.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzi(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzeg.zze;
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    private static boolean zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzh2 = zzh(videoCapabilities, i, i2);
        int i3 = zzh2.x;
        int i4 = zzh2.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzh(videoCapabilities, i, i2);
    }

    public final zzgn zzb(zzad zzad, zzad zzad2) {
        int i = true != zzeg.zzS(zzad.zzm, zzad2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzad.zzu != zzad2.zzu) {
                i |= 1024;
            }
            if (!this.zze && !(zzad.zzr == zzad2.zzr && zzad.zzs == zzad2.zzs)) {
                i |= 512;
            }
            if (!zzeg.zzS(zzad.zzy, zzad2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzeg.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzad.zzd(zzad2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgn(this.zza, zzad, zzad2, true != zzad.zzd(zzad2) ? 2 : 3, 0);
            }
        } else {
            if (zzad.zzz != zzad2.zzz) {
                i |= 4096;
            }
            if (zzad.zzA != zzad2.zzA) {
                i |= 8192;
            }
            if (zzad.zzB != zzad2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb2 = zzqy.zzb(zzad);
                Pair zzb3 = zzqy.zzb(zzad2);
                if (!(zzb2 == null || zzb3 == null)) {
                    int intValue = ((Integer) zzb2.first).intValue();
                    int intValue2 = ((Integer) zzb3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzgn(this.zza, zzad, zzad2, 3, 0);
                    }
                }
            }
            if (!zzad.zzd(zzad2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgn(this.zza, zzad, zzad2, 1, 0);
            }
        }
        return new zzgn(this.zza, zzad, zzad2, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r5 = r5.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzd(com.google.android.gms.internal.ads.zzad r11) throws com.google.android.gms.internal.ads.zzqs {
        /*
            r10 = this;
            java.lang.String r0 = r10.zzb
            java.lang.String r1 = r11.zzm
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r10.zzb
            java.lang.String r2 = com.google.android.gms.internal.ads.zzqy.zze(r11)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return r1
        L_0x0019:
            java.lang.String r0 = r11.zzj
            r2 = 16
            r3 = 1
            if (r0 != 0) goto L_0x0022
            goto L_0x0124
        L_0x0022:
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzqy.zzb(r11)
            if (r0 == 0) goto L_0x0124
            java.lang.Object r4 = r0.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r5 = r11.zzm
            java.lang.String r6 = "video/dolby-vision"
            boolean r5 = r6.equals(r5)
            r6 = 2
            r7 = 8
            if (r5 == 0) goto L_0x005e
            java.lang.String r5 = r10.zzb
            java.lang.String r8 = "video/avc"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0052
            r0 = r1
            r4 = r7
            goto L_0x005e
        L_0x0052:
            java.lang.String r5 = r10.zzb
            java.lang.String r8 = "video/hevc"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x005e
            r0 = r1
            r4 = r6
        L_0x005e:
            boolean r5 = r10.zzh
            r8 = 42
            if (r5 != 0) goto L_0x0067
            if (r4 != r8) goto L_0x0124
            r4 = r8
        L_0x0067:
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = r10.zzg()
            int r8 = com.google.android.gms.internal.ads.zzeg.zza
            r9 = 23
            if (r8 > r9) goto L_0x00f2
            java.lang.String r8 = r10.zzb
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00f2
            int r8 = r5.length
            if (r8 != 0) goto L_0x00f2
            android.media.MediaCodecInfo$CodecCapabilities r5 = r10.zzd
            if (r5 == 0) goto L_0x0097
            android.media.MediaCodecInfo$VideoCapabilities r5 = r5.getVideoCapabilities()
            if (r5 == 0) goto L_0x0097
            android.util.Range r5 = r5.getBitrateRange()
            java.lang.Comparable r5 = r5.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x0098
        L_0x0097:
            r5 = r1
        L_0x0098:
            r8 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r5 < r8) goto L_0x00a0
            r6 = 1024(0x400, float:1.435E-42)
            goto L_0x00e4
        L_0x00a0:
            r8 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r5 < r8) goto L_0x00a8
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x00e4
        L_0x00a8:
            r8 = 60000000(0x3938700, float:8.670878E-37)
            if (r5 < r8) goto L_0x00b0
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x00e4
        L_0x00b0:
            r8 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r5 < r8) goto L_0x00b8
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x00e4
        L_0x00b8:
            r8 = 18000000(0x112a880, float:2.6936858E-38)
            if (r5 < r8) goto L_0x00c0
            r6 = 64
            goto L_0x00e4
        L_0x00c0:
            r8 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r5 < r8) goto L_0x00c8
            r6 = 32
            goto L_0x00e4
        L_0x00c8:
            r8 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r5 < r8) goto L_0x00cf
            r6 = r2
            goto L_0x00e4
        L_0x00cf:
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            if (r5 < r8) goto L_0x00d6
            r6 = r7
            goto L_0x00e4
        L_0x00d6:
            r7 = 1800000(0x1b7740, float:2.522337E-39)
            if (r5 < r7) goto L_0x00dd
            r6 = 4
            goto L_0x00e4
        L_0x00dd:
            r7 = 800000(0xc3500, float:1.121039E-39)
            if (r5 < r7) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r6 = r3
        L_0x00e4:
            android.media.MediaCodecInfo$CodecProfileLevel r5 = new android.media.MediaCodecInfo$CodecProfileLevel
            r5.<init>()
            r5.profile = r3
            r5.level = r6
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r6[r1] = r5
            r5 = r6
        L_0x00f2:
            int r6 = r5.length
            r7 = r1
        L_0x00f4:
            if (r7 >= r6) goto L_0x0103
            r8 = r5[r7]
            int r9 = r8.profile
            if (r9 != r4) goto L_0x0100
            int r8 = r8.level
            if (r8 >= r0) goto L_0x0124
        L_0x0100:
            int r7 = r7 + 1
            goto L_0x00f4
        L_0x0103:
            java.lang.String r11 = r11.zzj
            java.lang.String r0 = r10.zzc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "codec.profileLevel, "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = ", "
            r2.append(r11)
            r2.append(r0)
            java.lang.String r11 = r2.toString()
            r10.zzi(r11)
            return r1
        L_0x0124:
            boolean r0 = r10.zzh
            r4 = 21
            if (r0 == 0) goto L_0x0173
            int r0 = r11.zzr
            if (r0 <= 0) goto L_0x0172
            int r0 = r11.zzs
            if (r0 > 0) goto L_0x0133
            goto L_0x0172
        L_0x0133:
            int r0 = com.google.android.gms.internal.ads.zzeg.zza
            if (r0 < r4) goto L_0x0143
            int r0 = r11.zzr
            int r1 = r11.zzs
            float r11 = r11.zzt
            double r2 = (double) r11
            boolean r11 = r10.zzf(r0, r1, r2)
            return r11
        L_0x0143:
            int r0 = r11.zzr
            int r2 = r11.zzs
            int r0 = r0 * r2
            int r2 = com.google.android.gms.internal.ads.zzqy.zza()
            if (r0 > r2) goto L_0x014f
            r1 = r3
        L_0x014f:
            if (r1 != 0) goto L_0x0171
            int r0 = r11.zzr
            int r11 = r11.zzs
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "legacyFrameSize, "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r10.zzi(r11)
        L_0x0171:
            return r1
        L_0x0172:
            return r3
        L_0x0173:
            int r0 = com.google.android.gms.internal.ads.zzeg.zza
            if (r0 < r4) goto L_0x0291
            int r0 = r11.zzA
            r4 = -1
            if (r0 == r4) goto L_0x01b0
            android.media.MediaCodecInfo$CodecCapabilities r5 = r10.zzd
            if (r5 != 0) goto L_0x0187
            java.lang.String r11 = "sampleRate.caps"
            r10.zzi(r11)
            goto L_0x0292
        L_0x0187:
            android.media.MediaCodecInfo$AudioCapabilities r5 = r5.getAudioCapabilities()
            if (r5 != 0) goto L_0x0194
            java.lang.String r11 = "sampleRate.aCaps"
            r10.zzi(r11)
            goto L_0x0292
        L_0x0194:
            boolean r5 = r5.isSampleRateSupported(r0)
            if (r5 != 0) goto L_0x01b0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "sampleRate.support, "
            r11.append(r2)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.zzi(r11)
            goto L_0x0292
        L_0x01b0:
            int r11 = r11.zzz
            if (r11 == r4) goto L_0x0291
            android.media.MediaCodecInfo$CodecCapabilities r0 = r10.zzd
            if (r0 != 0) goto L_0x01bf
            java.lang.String r11 = "channelCount.caps"
            r10.zzi(r11)
            goto L_0x0290
        L_0x01bf:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L_0x01cc
            java.lang.String r11 = "channelCount.aCaps"
            r10.zzi(r11)
            goto L_0x0290
        L_0x01cc:
            java.lang.String r4 = r10.zza
            java.lang.String r5 = r10.zzb
            int r0 = r0.getMaxInputChannelCount()
            if (r0 > r3) goto L_0x027a
            int r6 = com.google.android.gms.internal.ads.zzeg.zza
            r7 = 26
            if (r6 < r7) goto L_0x01e0
            if (r0 <= 0) goto L_0x01e0
            goto L_0x027a
        L_0x01e0:
            java.lang.String r6 = "audio/mpeg"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/3gpp"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/amr-wb"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/vorbis"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/opus"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/raw"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/flac"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/g711-alaw"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = "audio/gsm"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0239
            goto L_0x027a
        L_0x0239:
            java.lang.String r6 = "audio/ac3"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0243
            r2 = 6
            goto L_0x024e
        L_0x0243:
            java.lang.String r6 = "audio/eac3"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x024c
            goto L_0x024e
        L_0x024c:
            r2 = 30
        L_0x024e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AssumedMaxChannelAdjustment: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ", ["
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = " to "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = "]"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r4 = "MediaCodecInfo"
            android.util.Log.w(r4, r0)
            r0 = r2
        L_0x027a:
            if (r0 >= r11) goto L_0x0291
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "channelCount.support, "
            r0.append(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.zzi(r11)
        L_0x0290:
            return r1
        L_0x0291:
            r1 = r3
        L_0x0292:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqg.zzd(com.google.android.gms.internal.ads.zzad):boolean");
    }

    public final boolean zze(zzad zzad) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb2 = zzqy.zzb(zzad);
        return zzb2 != null && ((Integer) zzb2.first).intValue() == 42;
    }

    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzi("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzi("sizeAndRate.vCaps");
            return false;
        } else if (zzj(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzeg.zzb)) || !zzj(videoCapabilities, i2, i, d))) {
                zzi("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            String str3 = zzeg.zze;
            StringBuilder sb = new StringBuilder();
            sb.append("AssumedSupport [");
            sb.append("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            sb.append("] [");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("] [");
            sb.append(str3);
            sb.append("]");
            Log.d("MediaCodecInfo", sb.toString());
            return true;
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zzqg(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (str != null) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = codecCapabilities;
            this.zzg = z;
            this.zze = z4;
            this.zzf = z6;
            this.zzh = zzbo.zzh(str2);
            return;
        }
        throw null;
    }
}
