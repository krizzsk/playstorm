package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
import java.util.HashMap;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzmr implements zzkl, zzms {
    private final Context zza;
    private final zzmt zzb;
    private final PlaybackSession zzc;
    private final long zzd = SystemClock.elapsedRealtime();
    private final zzch zze = new zzch();
    private final zzcf zzf = new zzcf();
    private final HashMap zzg = new HashMap();
    private final HashMap zzh = new HashMap();
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl = 0;
    private int zzm = 0;
    private zzbr zzn;
    private zzmq zzo;
    private zzmq zzp;
    private zzmq zzq;
    private zzad zzr;
    private zzad zzs;
    private zzad zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzmr(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzmp zzmp = new zzmp(zzmp.zza);
        this.zzb = zzmp;
        zzmp.zzg(this);
    }

    public static zzmr zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmr(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzeg.zzl(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long j;
        long j2;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j);
            Long l2 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(j2);
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzad zzad, int i) {
        if (!zzeg.zzS(this.zzs, zzad)) {
            int i2 = this.zzs == null ? 1 : 0;
            this.zzs = zzad;
            zzx(0, j, zzad, i2);
        }
    }

    private final void zzu(long j, zzad zzad, int i) {
        if (!zzeg.zzS(this.zzt, zzad)) {
            int i2 = this.zzt == null ? 1 : 0;
            this.zzt = zzad;
            zzx(2, j, zzad, i2);
        }
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzci zzci, zzsb zzsb) {
        int zza2;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzsb != null && (zza2 = zzci.zza(zzsb.zza)) != -1) {
            int i = 0;
            zzci.zzd(zza2, this.zzf, false);
            zzci.zze(this.zzf.zzd, this.zze, 0);
            zzaw zzaw = this.zze.zzd.zzd;
            int i2 = 2;
            if (zzaw != null) {
                int zzp2 = zzeg.zzp(zzaw.zza);
                i = zzp2 != 0 ? zzp2 != 1 ? zzp2 != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            zzch zzch = this.zze;
            if (zzch.zzn != -9223372036854775807L && !zzch.zzl && !zzch.zzi && !zzch.zzb()) {
                builder.setMediaDurationMillis(zzeg.zzz(this.zze.zzn));
            }
            if (true != this.zze.zzb()) {
                i2 = 1;
            }
            builder.setPlaybackType(i2);
            this.zzz = true;
        }
    }

    private final void zzw(long j, zzad zzad, int i) {
        if (!zzeg.zzS(this.zzr, zzad)) {
            int i2 = this.zzr == null ? 1 : 0;
            this.zzr = zzad;
            zzx(1, j, zzad, i2);
        }
    }

    private final void zzx(int i, long j, zzad zzad, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzad != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzad.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzad.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzad.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzad.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzad.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzad.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzad.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzad.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzad.zzd;
            if (str4 != null) {
                String[] zzaf = zzeg.zzaf(str4, "-");
                Pair create = Pair.create(zzaf[0], zzaf.length >= 2 ? zzaf[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzad.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zzmq zzmq) {
        return zzmq != null && zzmq.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    public final void zzc(zzkj zzkj, String str) {
        zzsb zzsb = zzkj.zzd;
        if (zzsb == null || !zzsb.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-alpha03");
            zzv(zzkj.zzb, zzkj.zzd);
        }
    }

    public final void zzd(zzkj zzkj, String str, boolean z) {
        zzsb zzsb = zzkj.zzd;
        if ((zzsb == null || !zzsb.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    public final /* synthetic */ void zze(zzkj zzkj, zzad zzad, zzgn zzgn) {
    }

    public final void zzf(zzkj zzkj, int i, long j, long j2) {
        long j3;
        zzsb zzsb = zzkj.zzd;
        if (zzsb != null) {
            String zze2 = this.zzb.zze(zzkj.zzb, zzsb);
            Long l = (Long) this.zzh.get(zze2);
            Long l2 = (Long) this.zzg.get(zze2);
            HashMap hashMap = this.zzh;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(zze2, Long.valueOf(j3 + j));
            HashMap hashMap2 = this.zzg;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(zze2, Long.valueOf(j4 + ((long) i)));
        }
    }

    public final void zzg(zzkj zzkj, zzrx zzrx) {
        zzsb zzsb = zzkj.zzd;
        if (zzsb != null) {
            zzad zzad = zzrx.zzb;
            if (zzad != null) {
                zzmq zzmq = new zzmq(zzad, 0, this.zzb.zze(zzkj.zzb, zzsb));
                int i = zzrx.zza;
                if (i != 0) {
                    if (i == 1) {
                        this.zzp = zzmq;
                        return;
                    } else if (i != 2) {
                        if (i == 3) {
                            this.zzq = zzmq;
                            return;
                        }
                        return;
                    }
                }
                this.zzo = zzmq;
                return;
            }
            throw null;
        }
    }

    public final /* synthetic */ void zzh(zzkj zzkj, int i, long j) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:186:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.gms.internal.ads.zzcb r21, com.google.android.gms.internal.ads.zzkk r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.zzb()
            if (r2 == 0) goto L_0x03cc
            r2 = 0
            r3 = r2
        L_0x000c:
            int r4 = r22.zzb()
            r5 = 11
            if (r3 >= r4) goto L_0x0036
            int r4 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzkj r6 = r1.zzc(r4)
            if (r4 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzmt r4 = r0.zzb
            r4.zzj(r6)
            goto L_0x0033
        L_0x0024:
            if (r4 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.zzmt r4 = r0.zzb
            int r5 = r0.zzk
            r4.zzi(r6, r5)
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.zzmt r4 = r0.zzb
            r4.zzh(r6)
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0036:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.zzd(r2)
            if (r6 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzkj r6 = r1.zzc(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzci r7 = r6.zzb
            com.google.android.gms.internal.ads.zzsb r6 = r6.zzd
            r0.zzv(r7, r6)
        L_0x004f:
            r6 = 2
            boolean r7 = r1.zzd(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x00c6
            com.google.android.gms.internal.ads.zzct r7 = r21.zzo()
            com.google.android.gms.internal.ads.zzfrh r7 = r7.zza()
            int r12 = r7.size()
            r13 = r2
        L_0x006a:
            if (r13 >= r12) goto L_0x008f
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzcs r14 = (com.google.android.gms.internal.ads.zzcs) r14
            r15 = r2
        L_0x0073:
            int r5 = r14.zzb
            int r5 = r13 + 1
            if (r15 > 0) goto L_0x008b
            boolean r5 = r14.zzd(r15)
            if (r5 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzad r5 = r14.zzb(r15)
            com.google.android.gms.internal.ads.zzv r5 = r5.zzp
            if (r5 == 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008b:
            r13 = r5
            r5 = 11
            goto L_0x006a
        L_0x008f:
            r5 = r10
        L_0x0090:
            if (r5 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            int r12 = com.google.android.gms.internal.ads.zzeg.zza
            r12 = r2
        L_0x0097:
            int r13 = r5.zzb
            if (r12 >= r13) goto L_0x00c2
            com.google.android.gms.internal.ads.zzu r13 = r5.zza(r12)
            java.util.UUID r13 = r13.zza
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzm.zzd
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00ab
            r5 = r9
            goto L_0x00c3
        L_0x00ab:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzm.zze
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b5
            r5 = r6
            goto L_0x00c3
        L_0x00b5:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzm.zzc
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00bf
            r5 = 6
            goto L_0x00c3
        L_0x00bf:
            int r12 = r12 + 1
            goto L_0x0097
        L_0x00c2:
            r5 = r11
        L_0x00c3:
            r7.setDrmType(r5)
        L_0x00c6:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.zzd(r5)
            if (r5 == 0) goto L_0x00d3
            int r5 = r0.zzy
            int r5 = r5 + r11
            r0.zzy = r5
        L_0x00d3:
            com.google.android.gms.internal.ads.zzbr r5 = r0.zzn
            r16 = 9
            if (r5 != 0) goto L_0x00db
            goto L_0x026f
        L_0x00db:
            android.content.Context r7 = r0.zza
            int r8 = r5.zzb
            r12 = 1001(0x3e9, float:1.403E-42)
            r17 = 14
            r18 = 35
            r19 = 31
            r13 = 21
            r14 = 23
            if (r8 != r12) goto L_0x00f3
            r17 = 20
        L_0x00ef:
            r14 = r17
            goto L_0x0249
        L_0x00f3:
            r8 = r5
            com.google.android.gms.internal.ads.zzgu r8 = (com.google.android.gms.internal.ads.zzgu) r8
            int r12 = r8.zze
            int r8 = r8.zzi
            java.lang.Throwable r15 = r5.getCause()
            if (r15 == 0) goto L_0x03cb
            boolean r2 = r15 instanceof java.io.IOException
            if (r2 == 0) goto L_0x01e2
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfm
            if (r2 == 0) goto L_0x010f
            com.google.android.gms.internal.ads.zzfm r15 = (com.google.android.gms.internal.ads.zzfm) r15
            int r2 = r15.zzd
            r14 = 5
            goto L_0x0249
        L_0x010f:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfl
            if (r2 != 0) goto L_0x01dd
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzbp
            if (r2 == 0) goto L_0x0119
            goto L_0x01dd
        L_0x0119:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfk
            if (r2 != 0) goto L_0x01ac
            boolean r8 = r15 instanceof com.google.android.gms.internal.ads.zzfu
            if (r8 == 0) goto L_0x0123
            goto L_0x01ac
        L_0x0123:
            int r2 = r5.zzb
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r7) goto L_0x012c
            r14 = r13
            goto L_0x01ea
        L_0x012c:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzpb
            if (r2 == 0) goto L_0x017c
            java.lang.Throwable r2 = r15.getCause()
            if (r2 == 0) goto L_0x017b
            int r7 = com.google.android.gms.internal.ads.zzeg.zza
            if (r7 < r13) goto L_0x014d
            boolean r7 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r7 == 0) goto L_0x014d
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = com.google.android.gms.internal.ads.zzeg.zzm(r2)
            int r17 = zzr(r2)
            goto L_0x00ef
        L_0x014d:
            int r7 = com.google.android.gms.internal.ads.zzeg.zza
            if (r7 < r14) goto L_0x0159
            boolean r7 = r2 instanceof android.media.MediaDrmResetException
            if (r7 == 0) goto L_0x0159
            r17 = 27
            goto L_0x01f2
        L_0x0159:
            boolean r7 = r2 instanceof android.media.NotProvisionedException
            if (r7 == 0) goto L_0x0161
            r17 = 24
            goto L_0x01f2
        L_0x0161:
            boolean r7 = r2 instanceof android.media.DeniedByServerException
            if (r7 == 0) goto L_0x0169
            r17 = 29
            goto L_0x01f2
        L_0x0169:
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzpm
            if (r7 == 0) goto L_0x016f
            goto L_0x01f9
        L_0x016f:
            boolean r2 = r2 instanceof com.google.android.gms.internal.ads.zzoz
            if (r2 == 0) goto L_0x0177
            r17 = 28
            goto L_0x01f2
        L_0x0177:
            r17 = 30
            goto L_0x01f2
        L_0x017b:
            throw r10
        L_0x017c:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfg
            if (r2 == 0) goto L_0x01a9
            java.lang.Throwable r2 = r15.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x01a9
            java.lang.Throwable r2 = r15.getCause()
            if (r2 == 0) goto L_0x01a8
            java.lang.Throwable r2 = r2.getCause()
            int r7 = com.google.android.gms.internal.ads.zzeg.zza
            if (r7 < r13) goto L_0x01a5
            boolean r7 = r2 instanceof android.system.ErrnoException
            if (r7 == 0) goto L_0x01a5
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r7 = android.system.OsConstants.EACCES
            if (r2 != r7) goto L_0x01a5
            r17 = 32
            goto L_0x01f2
        L_0x01a5:
            r14 = r19
            goto L_0x01ea
        L_0x01a8:
            throw r10
        L_0x01a9:
            r14 = r16
            goto L_0x01ea
        L_0x01ac:
            com.google.android.gms.internal.ads.zzdw r7 = com.google.android.gms.internal.ads.zzdw.zzb(r7)
            int r7 = r7.zza()
            if (r7 != r11) goto L_0x01b8
            r14 = r9
            goto L_0x01ea
        L_0x01b8:
            java.lang.Throwable r7 = r15.getCause()
            boolean r8 = r7 instanceof java.net.UnknownHostException
            if (r8 == 0) goto L_0x01c4
            r2 = 0
            r14 = 6
            goto L_0x0249
        L_0x01c4:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01cc
            r2 = 0
            r14 = 7
            goto L_0x0249
        L_0x01cc:
            if (r2 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.zzfk r15 = (com.google.android.gms.internal.ads.zzfk) r15
            int r2 = r15.zzc
            if (r2 != r11) goto L_0x01d8
            r2 = 0
            r14 = 4
            goto L_0x0249
        L_0x01d8:
            r2 = 0
            r14 = 8
            goto L_0x0249
        L_0x01dd:
            r2 = 0
            r14 = 11
            goto L_0x0249
        L_0x01e2:
            if (r12 != r11) goto L_0x01ec
            if (r8 == 0) goto L_0x01e8
            if (r8 != r11) goto L_0x01ec
        L_0x01e8:
            r14 = r18
        L_0x01ea:
            r2 = 0
            goto L_0x0249
        L_0x01ec:
            if (r12 != r11) goto L_0x01f5
            if (r8 != r9) goto L_0x01f5
            r17 = 15
        L_0x01f2:
            r14 = r17
            goto L_0x01ea
        L_0x01f5:
            if (r12 != r11) goto L_0x01fa
            if (r8 != r6) goto L_0x01fa
        L_0x01f9:
            goto L_0x01ea
        L_0x01fa:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqi
            if (r2 == 0) goto L_0x0209
            com.google.android.gms.internal.ads.zzqi r15 = (com.google.android.gms.internal.ads.zzqi) r15
            java.lang.String r2 = r15.zzd
            int r2 = com.google.android.gms.internal.ads.zzeg.zzm(r2)
            r14 = 13
            goto L_0x0249
        L_0x0209:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqf
            if (r2 == 0) goto L_0x0217
            com.google.android.gms.internal.ads.zzqf r15 = (com.google.android.gms.internal.ads.zzqf) r15
            java.lang.String r2 = r15.zzb
            int r2 = com.google.android.gms.internal.ads.zzeg.zzm(r2)
            goto L_0x00ef
        L_0x0217:
            boolean r2 = r15 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x021c
            goto L_0x01f2
        L_0x021c:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zznn
            if (r2 == 0) goto L_0x0228
            com.google.android.gms.internal.ads.zznn r15 = (com.google.android.gms.internal.ads.zznn) r15
            int r2 = r15.zza
            r17 = 17
            goto L_0x00ef
        L_0x0228:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zznq
            if (r2 == 0) goto L_0x0234
            com.google.android.gms.internal.ads.zznq r15 = (com.google.android.gms.internal.ads.zznq) r15
            int r2 = r15.zza
            r17 = 18
            goto L_0x00ef
        L_0x0234:
            int r2 = com.google.android.gms.internal.ads.zzeg.zza
            boolean r2 = r15 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x0246
            android.media.MediaCodec$CryptoException r15 = (android.media.MediaCodec.CryptoException) r15
            int r2 = r15.getErrorCode()
            int r17 = zzr(r2)
            goto L_0x00ef
        L_0x0246:
            r17 = 22
            goto L_0x01f2
        L_0x0249:
            android.media.metrics.PlaybackSession r7 = r0.zzc
            android.media.metrics.PlaybackErrorEvent$Builder r8 = new android.media.metrics.PlaybackErrorEvent$Builder
            r8.<init>()
            long r12 = r0.zzd
            long r12 = r3 - r12
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setErrorCode(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r8.setSubErrorCode(r2)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r2.setException(r5)
            android.media.metrics.PlaybackErrorEvent r2 = r2.build()
            r7.reportPlaybackErrorEvent(r2)
            r0.zzz = r11
            r0.zzn = r10
        L_0x026f:
            boolean r2 = r1.zzd(r6)
            if (r2 == 0) goto L_0x029e
            com.google.android.gms.internal.ads.zzct r2 = r21.zzo()
            boolean r5 = r2.zzb(r6)
            boolean r7 = r2.zzb(r11)
            boolean r2 = r2.zzb(r9)
            if (r5 != 0) goto L_0x028c
            if (r7 != 0) goto L_0x028c
            if (r2 == 0) goto L_0x029e
            r2 = r11
        L_0x028c:
            if (r5 != 0) goto L_0x0293
            r5 = 0
            r0.zzw(r3, r10, r5)
            goto L_0x0294
        L_0x0293:
            r5 = 0
        L_0x0294:
            if (r7 != 0) goto L_0x0299
            r0.zzt(r3, r10, r5)
        L_0x0299:
            if (r2 != 0) goto L_0x029e
            r0.zzu(r3, r10, r5)
        L_0x029e:
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzo
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02b8
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzo
            com.google.android.gms.internal.ads.zzad r5 = r2.zza
            int r7 = r5.zzs
            r8 = -1
            if (r7 == r8) goto L_0x02b8
            int r2 = r2.zzb
            r7 = 0
            r0.zzw(r3, r5, r7)
            r0.zzo = r10
            goto L_0x02b9
        L_0x02b8:
            r7 = 0
        L_0x02b9:
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzp
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02cc
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzp
            com.google.android.gms.internal.ads.zzad r5 = r2.zza
            int r2 = r2.zzb
            r0.zzt(r3, r5, r7)
            r0.zzp = r10
        L_0x02cc:
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzq
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02df
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzq
            com.google.android.gms.internal.ads.zzad r5 = r2.zza
            int r2 = r2.zzb
            r0.zzu(r3, r5, r7)
            r0.zzq = r10
        L_0x02df:
            android.content.Context r2 = r0.zza
            com.google.android.gms.internal.ads.zzdw r2 = com.google.android.gms.internal.ads.zzdw.zzb(r2)
            int r2 = r2.zza()
            switch(r2) {
                case 0: goto L_0x0300;
                case 1: goto L_0x02fd;
                case 2: goto L_0x02fb;
                case 3: goto L_0x02f9;
                case 4: goto L_0x02f7;
                case 5: goto L_0x02f5;
                case 6: goto L_0x02ec;
                case 7: goto L_0x02f3;
                case 8: goto L_0x02ec;
                case 9: goto L_0x02f0;
                case 10: goto L_0x02ee;
                default: goto L_0x02ec;
            }
        L_0x02ec:
            r13 = r11
            goto L_0x0301
        L_0x02ee:
            r13 = 7
            goto L_0x0301
        L_0x02f0:
            r13 = 8
            goto L_0x0301
        L_0x02f3:
            r13 = r9
            goto L_0x0301
        L_0x02f5:
            r13 = 6
            goto L_0x0301
        L_0x02f7:
            r13 = 5
            goto L_0x0301
        L_0x02f9:
            r13 = 4
            goto L_0x0301
        L_0x02fb:
            r13 = r6
            goto L_0x0301
        L_0x02fd:
            r13 = r16
            goto L_0x0301
        L_0x0300:
            r13 = 0
        L_0x0301:
            int r2 = r0.zzm
            if (r13 == r2) goto L_0x0321
            r0.zzm = r13
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r13)
            long r7 = r0.zzd
            long r7 = r3 - r7
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r7)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r2.reportNetworkEvent(r5)
        L_0x0321:
            int r2 = r21.zzh()
            if (r2 == r6) goto L_0x032b
            r2 = 0
            r0.zzu = r2
            goto L_0x032c
        L_0x032b:
            r2 = 0
        L_0x032c:
            r5 = r21
            com.google.android.gms.internal.ads.zzjz r5 = (com.google.android.gms.internal.ads.zzjz) r5
            com.google.android.gms.internal.ads.zzgu r5 = r5.zzw()
            r7 = 10
            if (r5 != 0) goto L_0x033b
            r0.zzv = r2
            goto L_0x0343
        L_0x033b:
            boolean r2 = r1.zzd(r7)
            if (r2 == 0) goto L_0x0343
            r0.zzv = r11
        L_0x0343:
            int r2 = r21.zzh()
            boolean r5 = r0.zzu
            if (r5 == 0) goto L_0x034d
            r5 = 5
            goto L_0x0396
        L_0x034d:
            boolean r5 = r0.zzv
            if (r5 == 0) goto L_0x0354
            r5 = 13
            goto L_0x0396
        L_0x0354:
            r5 = 4
            if (r2 != r5) goto L_0x035a
            r5 = 11
            goto L_0x0396
        L_0x035a:
            if (r2 != r6) goto L_0x0377
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x0375
            if (r2 != r6) goto L_0x0363
            goto L_0x0375
        L_0x0363:
            boolean r2 = r21.zzq()
            if (r2 != 0) goto L_0x036b
            r5 = 7
            goto L_0x0396
        L_0x036b:
            int r2 = r21.zzi()
            if (r2 == 0) goto L_0x0373
            r5 = r7
            goto L_0x0396
        L_0x0373:
            r5 = 6
            goto L_0x0396
        L_0x0375:
            r5 = r6
            goto L_0x0396
        L_0x0377:
            if (r2 != r9) goto L_0x038b
            boolean r2 = r21.zzq()
            if (r2 != 0) goto L_0x0380
            goto L_0x0396
        L_0x0380:
            int r2 = r21.zzi()
            if (r2 == 0) goto L_0x0389
            r5 = r16
            goto L_0x0396
        L_0x0389:
            r5 = r9
            goto L_0x0396
        L_0x038b:
            if (r2 != r11) goto L_0x0394
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x0394
            r5 = 12
            goto L_0x0396
        L_0x0394:
            int r5 = r0.zzl
        L_0x0396:
            int r2 = r0.zzl
            if (r2 == r5) goto L_0x03b9
            r0.zzl = r5
            r0.zzz = r11
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.zzl
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.zzd
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03b9:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.zzd(r2)
            if (r3 == 0) goto L_0x03ca
            com.google.android.gms.internal.ads.zzmt r3 = r0.zzb
            com.google.android.gms.internal.ads.zzkj r1 = r1.zzc(r2)
            r3.zzf(r1)
        L_0x03ca:
            return
        L_0x03cb:
            throw r10
        L_0x03cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmr.zzi(com.google.android.gms.internal.ads.zzcb, com.google.android.gms.internal.ads.zzkk):void");
    }

    public final void zzj(zzkj zzkj, zzrs zzrs, zzrx zzrx, IOException iOException, boolean z) {
    }

    public final /* synthetic */ void zzk(zzkj zzkj, int i) {
    }

    public final void zzl(zzkj zzkj, zzbr zzbr) {
        this.zzn = zzbr;
    }

    public final void zzm(zzkj zzkj, zzca zzca, zzca zzca2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    public final /* synthetic */ void zzn(zzkj zzkj, Object obj, long j) {
    }

    public final void zzo(zzkj zzkj, zzgm zzgm) {
        this.zzw += zzgm.zzg;
        this.zzx += zzgm.zze;
    }

    public final /* synthetic */ void zzp(zzkj zzkj, zzad zzad, zzgn zzgn) {
    }

    public final void zzq(zzkj zzkj, zzcv zzcv) {
        zzmq zzmq = this.zzo;
        if (zzmq != null) {
            zzad zzad = zzmq.zza;
            if (zzad.zzs == -1) {
                zzab zzb2 = zzad.zzb();
                zzb2.zzX(zzcv.zzc);
                zzb2.zzF(zzcv.zzd);
                this.zzo = new zzmq(zzb2.zzY(), 0, zzmq.zzc);
            }
        }
    }
}
