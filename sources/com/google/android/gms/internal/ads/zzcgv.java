package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcgv extends zzcgx implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzchr zzd;
    private final zzchs zze;
    private final boolean zzf;
    private int zzg = 0;
    private int zzh = 0;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzchp zzn;
    private final boolean zzo;
    private int zzp;
    /* access modifiers changed from: private */
    public zzcgw zzq;
    /* access modifiers changed from: private */
    public boolean zzr = false;
    private Integer zzs = null;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        zzc.put(-1007, "MEDIA_ERROR_MALFORMED");
        zzc.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        zzc.put(-110, "MEDIA_ERROR_TIMED_OUT");
        zzc.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        zzc.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzc.put(1, "MEDIA_ERROR_UNKNOWN");
        zzc.put(1, "MEDIA_INFO_UNKNOWN");
        zzc.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzc.put(701, "MEDIA_INFO_BUFFERING_START");
        zzc.put(702, "MEDIA_INFO_BUFFERING_END");
        zzc.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzc.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzc.put(802, "MEDIA_INFO_METADATA_UPDATE");
        zzc.put(Integer.valueOf(ErrorCode.GENERAL_VPAID_ERROR), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        zzc.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcgv(Context context, zzchr zzchr, boolean z, boolean z2, zzchq zzchq, zzchs zzchs) {
        super(context);
        setSurfaceTextureListener(this);
        this.zzd = zzchr;
        this.zze = zzchs;
        this.zzo = z;
        this.zzf = z2;
        zzchs.zza(this);
    }

    private final void zzC() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj != null && surfaceTexture != null) {
            zzD(false);
            try {
                zzt.zzk();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.zzi = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.zzi.setOnCompletionListener(this);
                this.zzi.setOnErrorListener(this);
                this.zzi.setOnInfoListener(this);
                this.zzi.setOnPreparedListener(this);
                this.zzi.setOnVideoSizeChangedListener(this);
                this.zzm = 0;
                if (this.zzo) {
                    zzchp zzchp = new zzchp(getContext());
                    this.zzn = zzchp;
                    zzchp.zzd(surfaceTexture, getWidth(), getHeight());
                    this.zzn.start();
                    SurfaceTexture zzb = this.zzn.zzb();
                    if (zzb != null) {
                        surfaceTexture = zzb;
                    } else {
                        this.zzn.zze();
                        this.zzn = null;
                    }
                }
                this.zzi.setDataSource(getContext(), this.zzj);
                zzt.zzl();
                this.zzi.setSurface(new Surface(surfaceTexture));
                this.zzi.setAudioStreamType(3);
                this.zzi.setScreenOnWhilePlaying(true);
                this.zzi.prepareAsync();
                zzE(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                zze.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(String.valueOf(this.zzj))), e);
                onError(this.zzi, 1, 0);
            }
        }
    }

    private final void zzD(boolean z) {
        zze.zza("AdMediaPlayerView release");
        zzchp zzchp = this.zzn;
        if (zzchp != null) {
            zzchp.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzE(0);
            if (z) {
                this.zzh = 0;
            }
        }
    }

    private final void zzE(int i) {
        if (i == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i;
    }

    private final void zzF(float f) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            zze.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.zzg;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzG() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.zzi
            if (r0 == 0) goto L_0x000f
            int r0 = r2.zzg
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgv.zzG():boolean");
    }

    static /* bridge */ /* synthetic */ void zzl(zzcgv zzcgv, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzcgv.zzd != null && mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap hashMap = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType == 1) {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey(MediaFile.BITRATE)) {
                                Integer valueOf = Integer.valueOf(format2.getInteger(MediaFile.BITRATE));
                                zzcgv.zzs = valueOf;
                                hashMap.put("bitRate", String.valueOf(valueOf));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                            }
                            if (format2.containsKey("mime")) {
                                hashMap.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                            }
                        }
                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                        if (format.containsKey("mime")) {
                            hashMap.put("audioMime", format.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                            hashMap.put("audioCodec", format.getString("codecs-string"));
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                zzcgv.zzd.zzd("onMetadataEvent", hashMap);
            }
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzm = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        zzE(5);
        this.zzh = 5;
        zzs.zza.post(new zzcgo(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) zzc.get(Integer.valueOf(i));
        String str2 = (String) zzc.get(Integer.valueOf(i2));
        zze.zzj("AdMediaPlayerView MediaPlayer error: " + str + CertificateUtil.DELIMITER + str2);
        zzE(-1);
        this.zzh = -1;
        zzs.zza.post(new zzcgp(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) zzc.get(Integer.valueOf(i))) + CertificateUtil.DELIMITER + ((String) zzc.get(Integer.valueOf(i2))));
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r1 > r6) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzk
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.zzl
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.zzk
            if (r2 <= 0) goto L_0x007a
            int r2 = r5.zzl
            if (r2 <= 0) goto L_0x007a
            com.google.android.gms.internal.ads.zzchp r2 = r5.zzn
            if (r2 != 0) goto L_0x007a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0042
            if (r1 != r2) goto L_0x0041
            int r0 = r5.zzk
            int r1 = r0 * r7
            int r2 = r5.zzl
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r1 / r2
        L_0x003a:
            r1 = r7
            goto L_0x007a
        L_0x003c:
            if (r1 <= r3) goto L_0x0060
            int r1 = r3 / r0
            goto L_0x0052
        L_0x0041:
            r0 = r2
        L_0x0042:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0054
            int r0 = r5.zzl
            int r0 = r0 * r6
            int r2 = r5.zzk
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0051
            if (r0 <= r7) goto L_0x0051
            goto L_0x0060
        L_0x0051:
            r1 = r0
        L_0x0052:
            r0 = r6
            goto L_0x007a
        L_0x0054:
            if (r1 != r2) goto L_0x0064
            int r1 = r5.zzk
            int r1 = r1 * r7
            int r2 = r5.zzl
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0062
            if (r1 <= r6) goto L_0x0062
        L_0x0060:
            r0 = r6
            goto L_0x003a
        L_0x0062:
            r0 = r1
            goto L_0x003a
        L_0x0064:
            int r2 = r5.zzk
            int r4 = r5.zzl
            if (r1 != r3) goto L_0x0070
            if (r4 <= r7) goto L_0x0070
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x0072
        L_0x0070:
            r1 = r2
            r7 = r4
        L_0x0072:
            if (r0 != r3) goto L_0x0062
            if (r1 <= r6) goto L_0x0062
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0052
        L_0x007a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzchp r6 = r5.zzn
            if (r6 == 0) goto L_0x0084
            r6.zzc(r0, r1)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgv.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:12:0x005f->B:17:0x007a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPrepared(android.media.MediaPlayer r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AdMediaPlayerView prepared"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            r0 = 2
            r7.zzE(r0)
            com.google.android.gms.internal.ads.zzchs r0 = r7.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzfnu r0 = com.google.android.gms.ads.internal.util.zzs.zza
            com.google.android.gms.internal.ads.zzcgn r1 = new com.google.android.gms.internal.ads.zzcgn
            r1.<init>(r7, r8)
            r0.post(r1)
            int r0 = r8.getVideoWidth()
            r7.zzk = r0
            int r8 = r8.getVideoHeight()
            r7.zzl = r8
            int r8 = r7.zzp
            if (r8 == 0) goto L_0x002b
            r7.zzq(r8)
        L_0x002b:
            boolean r8 = r7.zzf
            r0 = 3
            if (r8 != 0) goto L_0x0031
            goto L_0x0084
        L_0x0031:
            boolean r8 = r7.zzG()
            if (r8 == 0) goto L_0x0084
            android.media.MediaPlayer r8 = r7.zzi
            int r8 = r8.getCurrentPosition()
            if (r8 <= 0) goto L_0x0084
            int r8 = r7.zzh
            if (r8 == r0) goto L_0x0084
            java.lang.String r8 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.ads.internal.util.zze.zza(r8)
            r8 = 0
            r7.zzF(r8)
            android.media.MediaPlayer r8 = r7.zzi
            r8.start()
            android.media.MediaPlayer r8 = r7.zzi
            int r8 = r8.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.zzA()
            long r1 = r1.currentTimeMillis()
        L_0x005f:
            boolean r3 = r7.zzG()
            if (r3 == 0) goto L_0x007c
            android.media.MediaPlayer r3 = r7.zzi
            int r3 = r3.getCurrentPosition()
            if (r3 != r8) goto L_0x007c
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzA()
            long r3 = r3.currentTimeMillis()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x005f
        L_0x007c:
            android.media.MediaPlayer r8 = r7.zzi
            r8.pause()
            r7.zzn()
        L_0x0084:
            int r8 = r7.zzk
            int r1 = r7.zzl
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdMediaPlayerView stream dimensions: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " x "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zzi(r8)
            int r8 = r7.zzh
            if (r8 != r0) goto L_0x00ab
            r7.zzp()
        L_0x00ab:
            r7.zzn()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgv.onPrepared(android.media.MediaPlayer):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface created");
        zzC();
        zzs.zza.post(new zzcgq(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        zzchp zzchp = this.zzn;
        if (zzchp != null) {
            zzchp.zze();
        }
        zzs.zza.post(new zzcgs(this));
        zzD(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzh;
        boolean z = false;
        if (this.zzk == i && this.zzl == i2) {
            z = true;
        }
        if (this.zzi != null && i3 == 3 && z) {
            int i4 = this.zzp;
            if (i4 != 0) {
                zzq(i4);
            }
            zzp();
        }
        zzchp zzchp = this.zzn;
        if (zzchp != null) {
            zzchp.zzc(i, i2);
        }
        zzs.zza.post(new zzcgr(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i);
        zzs.zza.post(new zzcgm(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    public final int zza() {
        if (zzG()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !zzG()) {
            return -1;
        }
        return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    public final int zzc() {
        if (zzG()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final long zzf() {
        return 0;
    }

    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * ((long) this.zzm)) / 100;
        }
        return -1;
    }

    public final long zzh() {
        if (this.zzs != null) {
            return ((long) zzc()) * ((long) this.zzs.intValue());
        }
        return -1;
    }

    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(int i) {
        zzcgw zzcgw = this.zzq;
        if (zzcgw != null) {
            zzcgw.onWindowVisibilityChanged(i);
        }
    }

    public final void zzn() {
        zzF(this.zzb.zza());
    }

    public final void zzo() {
        zze.zza("AdMediaPlayerView pause");
        if (zzG() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzE(4);
            zzs.zza.post(new zzcgu(this));
        }
        this.zzh = 4;
    }

    public final void zzp() {
        zze.zza("AdMediaPlayerView play");
        if (zzG()) {
            this.zzi.start();
            zzE(3);
            this.zza.zzb();
            zzs.zza.post(new zzcgt(this));
        }
        this.zzh = 3;
    }

    public final void zzq(int i) {
        zze.zza("AdMediaPlayerView seek " + i);
        if (zzG()) {
            this.zzi.seekTo(i);
            this.zzp = 0;
            return;
        }
        this.zzp = i;
    }

    public final void zzr(zzcgw zzcgw) {
        this.zzq = zzcgw;
    }

    public final void zzs(String str) {
        Uri parse = Uri.parse(str);
        zzbcx zza = zzbcx.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzj = parse;
            this.zzp = 0;
            zzC();
            requestLayout();
            invalidate();
        }
    }

    public final void zzt() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzE(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    public final void zzu(float f, float f2) {
        zzchp zzchp = this.zzn;
        if (zzchp != null) {
            zzchp.zzf(f, f2);
        }
    }
}
