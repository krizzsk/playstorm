package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzwx extends zzqj {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private float zzF;
    private zzcv zzG;
    private int zzH;
    private zzwy zzI;
    private final Context zze;
    private final zzxf zzf = new zzxf(this.zze);
    private final zzxq zzg;
    private final boolean zzh;
    private zzww zzi;
    private boolean zzj;
    private boolean zzk;
    private Surface zzl;
    private zzws zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzwx(Context context, zzqd zzqd, zzql zzql, long j, boolean z, Handler handler, zzxr zzxr, int i, float f) {
        super(2, zzqd, zzql, false, 30.0f);
        this.zze = context.getApplicationContext();
        Handler handler2 = handler;
        zzxr zzxr2 = zzxr;
        this.zzg = new zzxq(handler, zzxr);
        this.zzh = "NVIDIA".equals(zzeg.zzc);
        this.zzt = -9223372036854775807L;
        this.zzC = -1;
        this.zzD = -1;
        this.zzF = -1.0f;
        this.zzo = 1;
        this.zzH = 0;
        this.zzG = null;
    }

    protected static int zzT(zzqg zzqg, zzad zzad) {
        if (zzad.zzn == -1) {
            return zzaB(zzqg, zzad);
        }
        int size = zzad.zzo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) zzad.zzo.get(i2)).length;
        }
        return zzad.zzn + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x05f7, code lost:
        if (r1.equals("A10-70F") != false) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0759, code lost:
        if (r8 != 2) goto L_0x075b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean zzaA(java.lang.String r14) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r14 = r14.startsWith(r0)
            r0 = 0
            if (r14 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.android.gms.internal.ads.zzwx> r14 = com.google.android.gms.internal.ads.zzwx.class
            monitor-enter(r14)
            boolean r1 = zzc     // Catch:{ all -> 0x0763 }
            if (r1 != 0) goto L_0x075f
            int r1 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ all -> 0x0763 }
            r2 = 5
            r3 = 6
            r4 = 4
            r5 = 7
            r6 = 3
            r7 = 28
            r8 = -1
            r9 = 2
            r10 = 1
            if (r1 > r7) goto L_0x0081
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ all -> 0x0763 }
            int r11 = r1.hashCode()     // Catch:{ all -> 0x0763 }
            switch(r11) {
                case -1339091551: goto L_0x006f;
                case -1220081023: goto L_0x0065;
                case -1220066608: goto L_0x005b;
                case -1012436106: goto L_0x0051;
                case -760312546: goto L_0x0047;
                case -64886864: goto L_0x003d;
                case 3415681: goto L_0x0033;
                case 825323514: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0079
        L_0x0029:
            java.lang.String r11 = "machuca"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r2
            goto L_0x007a
        L_0x0033:
            java.lang.String r11 = "once"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r3
            goto L_0x007a
        L_0x003d:
            java.lang.String r11 = "magnolia"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r4
            goto L_0x007a
        L_0x0047:
            java.lang.String r11 = "aquaman"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r0
            goto L_0x007a
        L_0x0051:
            java.lang.String r11 = "oneday"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r5
            goto L_0x007a
        L_0x005b:
            java.lang.String r11 = "dangalUHD"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r9
            goto L_0x007a
        L_0x0065:
            java.lang.String r11 = "dangalFHD"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r6
            goto L_0x007a
        L_0x006f:
            java.lang.String r11 = "dangal"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r10
            goto L_0x007a
        L_0x0079:
            r1 = r8
        L_0x007a:
            switch(r1) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0081
        L_0x007e:
            r0 = r10
            goto L_0x075b
        L_0x0081:
            int r1 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ all -> 0x0763 }
            r11 = 27
            if (r1 > r11) goto L_0x0092
            java.lang.String r1 = "HWEML"
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ all -> 0x0763 }
            boolean r1 = r1.equals(r12)     // Catch:{ all -> 0x0763 }
            if (r1 == 0) goto L_0x0092
            goto L_0x007e
        L_0x0092:
            int r1 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ all -> 0x0763 }
            r12 = 26
            if (r1 > r12) goto L_0x075b
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ all -> 0x0763 }
            int r13 = r1.hashCode()     // Catch:{ all -> 0x0763 }
            switch(r13) {
                case -2144781245: goto L_0x0713;
                case -2144781185: goto L_0x0708;
                case -2144781160: goto L_0x06fd;
                case -2097309513: goto L_0x06f2;
                case -2022874474: goto L_0x06e7;
                case -1978993182: goto L_0x06dc;
                case -1978990237: goto L_0x06d1;
                case -1936688988: goto L_0x06c6;
                case -1936688066: goto L_0x06bb;
                case -1936688065: goto L_0x06af;
                case -1931988508: goto L_0x06a3;
                case -1885099851: goto L_0x0697;
                case -1696512866: goto L_0x068b;
                case -1680025915: goto L_0x067f;
                case -1615810839: goto L_0x0673;
                case -1600724499: goto L_0x0667;
                case -1554255044: goto L_0x065b;
                case -1481772737: goto L_0x064f;
                case -1481772730: goto L_0x0643;
                case -1481772729: goto L_0x0637;
                case -1320080169: goto L_0x062b;
                case -1217592143: goto L_0x061f;
                case -1180384755: goto L_0x0613;
                case -1139198265: goto L_0x0607;
                case -1052835013: goto L_0x05fb;
                case -993250464: goto L_0x05f1;
                case -993250458: goto L_0x05e6;
                case -965403638: goto L_0x05da;
                case -958336948: goto L_0x05ce;
                case -879245230: goto L_0x05c2;
                case -842500323: goto L_0x05b6;
                case -821392978: goto L_0x05aa;
                case -797483286: goto L_0x059e;
                case -794946968: goto L_0x0592;
                case -788334647: goto L_0x0586;
                case -782144577: goto L_0x057a;
                case -575125681: goto L_0x056e;
                case -521118391: goto L_0x0562;
                case -430914369: goto L_0x0556;
                case -290434366: goto L_0x054a;
                case -282781963: goto L_0x053e;
                case -277133239: goto L_0x0532;
                case -173639913: goto L_0x0526;
                case -56598463: goto L_0x051a;
                case 2126: goto L_0x050e;
                case 2564: goto L_0x0502;
                case 2715: goto L_0x04f6;
                case 2719: goto L_0x04ea;
                case 3091: goto L_0x04de;
                case 3483: goto L_0x04d2;
                case 73405: goto L_0x04c6;
                case 75537: goto L_0x04ba;
                case 75739: goto L_0x04ae;
                case 76779: goto L_0x04a2;
                case 78669: goto L_0x0496;
                case 79305: goto L_0x048a;
                case 80618: goto L_0x047e;
                case 88274: goto L_0x0472;
                case 98846: goto L_0x0467;
                case 98848: goto L_0x045c;
                case 99329: goto L_0x0451;
                case 101481: goto L_0x0445;
                case 1513190: goto L_0x043a;
                case 1514184: goto L_0x042f;
                case 1514185: goto L_0x0424;
                case 2133089: goto L_0x0418;
                case 2133091: goto L_0x040c;
                case 2133120: goto L_0x0400;
                case 2133151: goto L_0x03f4;
                case 2133182: goto L_0x03e8;
                case 2133184: goto L_0x03dc;
                case 2436959: goto L_0x03d0;
                case 2463773: goto L_0x03c4;
                case 2464648: goto L_0x03b8;
                case 2689555: goto L_0x03ac;
                case 3154429: goto L_0x03a0;
                case 3284551: goto L_0x0394;
                case 3351335: goto L_0x0388;
                case 3386211: goto L_0x037c;
                case 41325051: goto L_0x0370;
                case 51349633: goto L_0x0365;
                case 51350594: goto L_0x035a;
                case 55178625: goto L_0x034e;
                case 61542055: goto L_0x0343;
                case 65355429: goto L_0x0337;
                case 66214468: goto L_0x032b;
                case 66214470: goto L_0x031f;
                case 66214473: goto L_0x0313;
                case 66215429: goto L_0x0307;
                case 66215431: goto L_0x02fb;
                case 66215433: goto L_0x02ef;
                case 66216390: goto L_0x02e3;
                case 76402249: goto L_0x02d7;
                case 76404105: goto L_0x02cb;
                case 76404911: goto L_0x02bf;
                case 80963634: goto L_0x02b3;
                case 82882791: goto L_0x02a7;
                case 98715550: goto L_0x029b;
                case 101370885: goto L_0x028f;
                case 102844228: goto L_0x0283;
                case 165221241: goto L_0x0277;
                case 182191441: goto L_0x026b;
                case 245388979: goto L_0x025f;
                case 287431619: goto L_0x0253;
                case 307593612: goto L_0x0247;
                case 308517133: goto L_0x023b;
                case 316215098: goto L_0x022f;
                case 316215116: goto L_0x0223;
                case 316246811: goto L_0x0217;
                case 316246818: goto L_0x020b;
                case 407160593: goto L_0x01ff;
                case 507412548: goto L_0x01f3;
                case 793982701: goto L_0x01e7;
                case 794038622: goto L_0x01db;
                case 794040393: goto L_0x01cf;
                case 835649806: goto L_0x01c3;
                case 917340916: goto L_0x01b7;
                case 958008161: goto L_0x01ab;
                case 1060579533: goto L_0x019f;
                case 1150207623: goto L_0x0193;
                case 1176899427: goto L_0x0187;
                case 1280332038: goto L_0x017b;
                case 1306947716: goto L_0x016f;
                case 1349174697: goto L_0x0163;
                case 1522194893: goto L_0x0157;
                case 1691543273: goto L_0x014b;
                case 1691544261: goto L_0x013f;
                case 1709443163: goto L_0x0133;
                case 1865889110: goto L_0x0127;
                case 1906253259: goto L_0x011b;
                case 1977196784: goto L_0x010f;
                case 2006372676: goto L_0x0103;
                case 2019281702: goto L_0x00f7;
                case 2029784656: goto L_0x00eb;
                case 2030379515: goto L_0x00df;
                case 2033393791: goto L_0x00d3;
                case 2047190025: goto L_0x00c7;
                case 2047252157: goto L_0x00bb;
                case 2048319463: goto L_0x00af;
                case 2048855701: goto L_0x00a3;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            goto L_0x071e
        L_0x00a3:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 66
            goto L_0x071f
        L_0x00af:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 65
            goto L_0x071f
        L_0x00bb:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 33
            goto L_0x071f
        L_0x00c7:
            java.lang.String r2 = "ELUGA_Note"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 32
            goto L_0x071f
        L_0x00d3:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 14
            goto L_0x071f
        L_0x00df:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 64
            goto L_0x071f
        L_0x00eb:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 63
            goto L_0x071f
        L_0x00f7:
            java.lang.String r2 = "DM-01K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 29
            goto L_0x071f
        L_0x0103:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 19
            goto L_0x071f
        L_0x010f:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 69
            goto L_0x071f
        L_0x011b:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 100
            goto L_0x071f
        L_0x0127:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x071f
        L_0x0133:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 68
            goto L_0x071f
        L_0x013f:
            java.lang.String r2 = "CPH1715"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 24
            goto L_0x071f
        L_0x014b:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 23
            goto L_0x071f
        L_0x0157:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 133(0x85, float:1.86E-43)
            goto L_0x071f
        L_0x0163:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 61
            goto L_0x071f
        L_0x016f:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 35
            goto L_0x071f
        L_0x017b:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 62
            goto L_0x071f
        L_0x0187:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 71
            goto L_0x071f
        L_0x0193:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 78
            goto L_0x071f
        L_0x019f:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 96
            goto L_0x071f
        L_0x01ab:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 72
            goto L_0x071f
        L_0x01b7:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 10
            goto L_0x071f
        L_0x01c3:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 81
            goto L_0x071f
        L_0x01cf:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 59
            goto L_0x071f
        L_0x01db:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 58
            goto L_0x071f
        L_0x01e7:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 57
            goto L_0x071f
        L_0x01f3:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x071f
        L_0x01ff:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x071f
        L_0x020b:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 125(0x7d, float:1.75E-43)
            goto L_0x071f
        L_0x0217:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x071f
        L_0x0223:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x071f
        L_0x022f:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x071f
        L_0x023b:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 12
            goto L_0x071f
        L_0x0247:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 11
            goto L_0x071f
        L_0x0253:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 60
            goto L_0x071f
        L_0x025f:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 82
            goto L_0x071f
        L_0x026b:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 25
            goto L_0x071f
        L_0x0277:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 8
            goto L_0x071f
        L_0x0283:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 77
            goto L_0x071f
        L_0x028f:
            java.lang.String r2 = "l5460"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 76
            goto L_0x071f
        L_0x029b:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 67
            goto L_0x071f
        L_0x02a7:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 135(0x87, float:1.89E-43)
            goto L_0x071f
        L_0x02b3:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x071f
        L_0x02bf:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x071f
        L_0x02cb:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x071f
        L_0x02d7:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x071f
        L_0x02e3:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 48
            goto L_0x071f
        L_0x02ef:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 47
            goto L_0x071f
        L_0x02fb:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 46
            goto L_0x071f
        L_0x0307:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 45
            goto L_0x071f
        L_0x0313:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 44
            goto L_0x071f
        L_0x031f:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 43
            goto L_0x071f
        L_0x032b:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 42
            goto L_0x071f
        L_0x0337:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 30
            goto L_0x071f
        L_0x0343:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r5
            goto L_0x071f
        L_0x034e:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 15
            goto L_0x071f
        L_0x035a:
            java.lang.String r2 = "602LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r4
            goto L_0x071f
        L_0x0365:
            java.lang.String r2 = "601LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r6
            goto L_0x071f
        L_0x0370:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 83
            goto L_0x071f
        L_0x037c:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 92
            goto L_0x071f
        L_0x0388:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 85
            goto L_0x071f
        L_0x0394:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 75
            goto L_0x071f
        L_0x03a0:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 50
            goto L_0x071f
        L_0x03ac:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 136(0x88, float:1.9E-43)
            goto L_0x071f
        L_0x03b8:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x071f
        L_0x03c4:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x071f
        L_0x03d0:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 93
            goto L_0x071f
        L_0x03dc:
            java.lang.String r2 = "F04J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 41
            goto L_0x071f
        L_0x03e8:
            java.lang.String r2 = "F04H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 40
            goto L_0x071f
        L_0x03f4:
            java.lang.String r2 = "F03H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 39
            goto L_0x071f
        L_0x0400:
            java.lang.String r2 = "F02H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 38
            goto L_0x071f
        L_0x040c:
            java.lang.String r2 = "F01J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 37
            goto L_0x071f
        L_0x0418:
            java.lang.String r2 = "F01H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 36
            goto L_0x071f
        L_0x0424:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r9
            goto L_0x071f
        L_0x042f:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r10
            goto L_0x071f
        L_0x043a:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r0
            goto L_0x071f
        L_0x0445:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 49
            goto L_0x071f
        L_0x0451:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r7
            goto L_0x071f
        L_0x045c:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r11
            goto L_0x071f
        L_0x0467:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r12
            goto L_0x071f
        L_0x0472:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 139(0x8b, float:1.95E-43)
            goto L_0x071f
        L_0x047e:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x071f
        L_0x048a:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x071f
        L_0x0496:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 94
            goto L_0x071f
        L_0x04a2:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 86
            goto L_0x071f
        L_0x04ae:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 80
            goto L_0x071f
        L_0x04ba:
            java.lang.String r2 = "M04"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 79
            goto L_0x071f
        L_0x04c6:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 73
            goto L_0x071f
        L_0x04d2:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 84
            goto L_0x071f
        L_0x04de:
            java.lang.String r2 = "b5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 16
            goto L_0x071f
        L_0x04ea:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 129(0x81, float:1.81E-43)
            goto L_0x071f
        L_0x04f6:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x071f
        L_0x0502:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x071f
        L_0x050e:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 20
            goto L_0x071f
        L_0x051a:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 134(0x86, float:1.88E-43)
            goto L_0x071f
        L_0x0526:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 31
            goto L_0x071f
        L_0x0532:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x071f
        L_0x053e:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 17
            goto L_0x071f
        L_0x054a:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x071f
        L_0x0556:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x071f
        L_0x0562:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 53
            goto L_0x071f
        L_0x056e:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 51
            goto L_0x071f
        L_0x057a:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 91
            goto L_0x071f
        L_0x0586:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 132(0x84, float:1.85E-43)
            goto L_0x071f
        L_0x0592:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 131(0x83, float:1.84E-43)
            goto L_0x071f
        L_0x059e:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x071f
        L_0x05aa:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 9
            goto L_0x071f
        L_0x05b6:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 88
            goto L_0x071f
        L_0x05c2:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 126(0x7e, float:1.77E-43)
            goto L_0x071f
        L_0x05ce:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 34
            goto L_0x071f
        L_0x05da:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x071f
        L_0x05e6:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = r3
            goto L_0x071f
        L_0x05f1:
            java.lang.String r3 = "A10-70F"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x071e
            goto L_0x071f
        L_0x05fb:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 87
            goto L_0x071f
        L_0x0607:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x071f
        L_0x0613:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 70
            goto L_0x071f
        L_0x061f:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 18
            goto L_0x071f
        L_0x062b:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 52
            goto L_0x071f
        L_0x0637:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 99
            goto L_0x071f
        L_0x0643:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 98
            goto L_0x071f
        L_0x064f:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 97
            goto L_0x071f
        L_0x065b:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x071f
        L_0x0667:
            java.lang.String r2 = "pacificrim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 95
            goto L_0x071f
        L_0x0673:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x071f
        L_0x067f:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 21
            goto L_0x071f
        L_0x068b:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 137(0x89, float:1.92E-43)
            goto L_0x071f
        L_0x0697:
            java.lang.String r2 = "RAIJIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x071f
        L_0x06a3:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 13
            goto L_0x071f
        L_0x06af:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x071f
        L_0x06bb:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x071f
        L_0x06c6:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x071f
        L_0x06d1:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 90
            goto L_0x071f
        L_0x06dc:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 89
            goto L_0x071f
        L_0x06e7:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 22
            goto L_0x071f
        L_0x06f2:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 74
            goto L_0x071f
        L_0x06fd:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 56
            goto L_0x071f
        L_0x0708:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 55
            goto L_0x071f
        L_0x0713:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071e
            r2 = 54
            goto L_0x071f
        L_0x071e:
            r2 = r8
        L_0x071f:
            switch(r2) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                case 8: goto L_0x007e;
                case 9: goto L_0x007e;
                case 10: goto L_0x007e;
                case 11: goto L_0x007e;
                case 12: goto L_0x007e;
                case 13: goto L_0x007e;
                case 14: goto L_0x007e;
                case 15: goto L_0x007e;
                case 16: goto L_0x007e;
                case 17: goto L_0x007e;
                case 18: goto L_0x007e;
                case 19: goto L_0x007e;
                case 20: goto L_0x007e;
                case 21: goto L_0x007e;
                case 22: goto L_0x007e;
                case 23: goto L_0x007e;
                case 24: goto L_0x007e;
                case 25: goto L_0x007e;
                case 26: goto L_0x007e;
                case 27: goto L_0x007e;
                case 28: goto L_0x007e;
                case 29: goto L_0x007e;
                case 30: goto L_0x007e;
                case 31: goto L_0x007e;
                case 32: goto L_0x007e;
                case 33: goto L_0x007e;
                case 34: goto L_0x007e;
                case 35: goto L_0x007e;
                case 36: goto L_0x007e;
                case 37: goto L_0x007e;
                case 38: goto L_0x007e;
                case 39: goto L_0x007e;
                case 40: goto L_0x007e;
                case 41: goto L_0x007e;
                case 42: goto L_0x007e;
                case 43: goto L_0x007e;
                case 44: goto L_0x007e;
                case 45: goto L_0x007e;
                case 46: goto L_0x007e;
                case 47: goto L_0x007e;
                case 48: goto L_0x007e;
                case 49: goto L_0x007e;
                case 50: goto L_0x007e;
                case 51: goto L_0x007e;
                case 52: goto L_0x007e;
                case 53: goto L_0x007e;
                case 54: goto L_0x007e;
                case 55: goto L_0x007e;
                case 56: goto L_0x007e;
                case 57: goto L_0x007e;
                case 58: goto L_0x007e;
                case 59: goto L_0x007e;
                case 60: goto L_0x007e;
                case 61: goto L_0x007e;
                case 62: goto L_0x007e;
                case 63: goto L_0x007e;
                case 64: goto L_0x007e;
                case 65: goto L_0x007e;
                case 66: goto L_0x007e;
                case 67: goto L_0x007e;
                case 68: goto L_0x007e;
                case 69: goto L_0x007e;
                case 70: goto L_0x007e;
                case 71: goto L_0x007e;
                case 72: goto L_0x007e;
                case 73: goto L_0x007e;
                case 74: goto L_0x007e;
                case 75: goto L_0x007e;
                case 76: goto L_0x007e;
                case 77: goto L_0x007e;
                case 78: goto L_0x007e;
                case 79: goto L_0x007e;
                case 80: goto L_0x007e;
                case 81: goto L_0x007e;
                case 82: goto L_0x007e;
                case 83: goto L_0x007e;
                case 84: goto L_0x007e;
                case 85: goto L_0x007e;
                case 86: goto L_0x007e;
                case 87: goto L_0x007e;
                case 88: goto L_0x007e;
                case 89: goto L_0x007e;
                case 90: goto L_0x007e;
                case 91: goto L_0x007e;
                case 92: goto L_0x007e;
                case 93: goto L_0x007e;
                case 94: goto L_0x007e;
                case 95: goto L_0x007e;
                case 96: goto L_0x007e;
                case 97: goto L_0x007e;
                case 98: goto L_0x007e;
                case 99: goto L_0x007e;
                case 100: goto L_0x007e;
                case 101: goto L_0x007e;
                case 102: goto L_0x007e;
                case 103: goto L_0x007e;
                case 104: goto L_0x007e;
                case 105: goto L_0x007e;
                case 106: goto L_0x007e;
                case 107: goto L_0x007e;
                case 108: goto L_0x007e;
                case 109: goto L_0x007e;
                case 110: goto L_0x007e;
                case 111: goto L_0x007e;
                case 112: goto L_0x007e;
                case 113: goto L_0x007e;
                case 114: goto L_0x007e;
                case 115: goto L_0x007e;
                case 116: goto L_0x007e;
                case 117: goto L_0x007e;
                case 118: goto L_0x007e;
                case 119: goto L_0x007e;
                case 120: goto L_0x007e;
                case 121: goto L_0x007e;
                case 122: goto L_0x007e;
                case 123: goto L_0x007e;
                case 124: goto L_0x007e;
                case 125: goto L_0x007e;
                case 126: goto L_0x007e;
                case 127: goto L_0x007e;
                case 128: goto L_0x007e;
                case 129: goto L_0x007e;
                case 130: goto L_0x007e;
                case 131: goto L_0x007e;
                case 132: goto L_0x007e;
                case 133: goto L_0x007e;
                case 134: goto L_0x007e;
                case 135: goto L_0x007e;
                case 136: goto L_0x007e;
                case 137: goto L_0x007e;
                case 138: goto L_0x007e;
                case 139: goto L_0x007e;
                default: goto L_0x0722;
            }
        L_0x0722:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeg.zzd     // Catch:{ all -> 0x0763 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0763 }
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r2 == r3) goto L_0x074c
            r3 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r3) goto L_0x0742
            r3 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r3) goto L_0x0738
            goto L_0x0755
        L_0x0738:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0755
            r8 = r10
            goto L_0x0755
        L_0x0742:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0755
            r8 = r0
            goto L_0x0755
        L_0x074c:
            java.lang.String r2 = "JSN-L21"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0755
            r8 = r9
        L_0x0755:
            if (r8 == 0) goto L_0x007e
            if (r8 == r10) goto L_0x007e
            if (r8 == r9) goto L_0x007e
        L_0x075b:
            zzd = r0     // Catch:{ all -> 0x0763 }
            zzc = r10     // Catch:{ all -> 0x0763 }
        L_0x075f:
            monitor-exit(r14)     // Catch:{ all -> 0x0763 }
            boolean r14 = zzd
            return r14
        L_0x0763:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0763 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzaA(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r12 = ((java.lang.Integer) r12.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzaB(com.google.android.gms.internal.ads.zzqg r11, com.google.android.gms.internal.ads.zzad r12) {
        /*
            int r0 = r12.zzr
            int r1 = r12.zzs
            r2 = -1
            if (r0 == r2) goto L_0x00c8
            if (r1 != r2) goto L_0x000b
            goto L_0x00c8
        L_0x000b:
            java.lang.String r3 = r12.zzm
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r12 = com.google.android.gms.internal.ads.zzqy.zzb(r12)
            if (r12 == 0) goto L_0x0033
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r12 == r3) goto L_0x0031
            if (r12 == r7) goto L_0x0031
            if (r12 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            int r12 = r3.hashCode()
            r4 = 5
            r9 = 4
            r10 = 3
            switch(r12) {
                case -1664118616: goto L_0x006d;
                case -1662541442: goto L_0x0065;
                case 1187890754: goto L_0x005b;
                case 1331836730: goto L_0x0053;
                case 1599127256: goto L_0x0049;
                case 1599127257: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0077
        L_0x003f:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = r4
            goto L_0x0078
        L_0x0049:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = r10
            goto L_0x0078
        L_0x0053:
            boolean r12 = r3.equals(r5)
            if (r12 == 0) goto L_0x0077
            r12 = r8
            goto L_0x0078
        L_0x005b:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = r7
            goto L_0x0078
        L_0x0065:
            boolean r12 = r3.equals(r6)
            if (r12 == 0) goto L_0x0077
            r12 = r9
            goto L_0x0078
        L_0x006d:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 0
            goto L_0x0078
        L_0x0077:
            r12 = r2
        L_0x0078:
            if (r12 == 0) goto L_0x00c3
            if (r12 == r7) goto L_0x00c3
            if (r12 == r8) goto L_0x0088
            if (r12 == r10) goto L_0x00c3
            if (r12 == r9) goto L_0x0085
            if (r12 == r4) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = r0 * r1
            r8 = r9
            goto L_0x00c4
        L_0x0088:
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x00c2
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeg.zzc
            java.lang.String r3 = "Amazon"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b4
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r3 = "KFSOWI"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x00c2
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r3 = "AFTS"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b4
            boolean r11 = r11.zzf
            if (r11 != 0) goto L_0x00c2
        L_0x00b4:
            r11 = 16
            int r12 = com.google.android.gms.internal.ads.zzeg.zze(r0, r11)
            int r11 = com.google.android.gms.internal.ads.zzeg.zze(r1, r11)
            int r12 = r12 * r11
            int r0 = r12 * 256
            goto L_0x00c4
        L_0x00c2:
            return r2
        L_0x00c3:
            int r0 = r0 * r1
        L_0x00c4:
            int r0 = r0 * r10
            int r8 = r8 + r8
            int r0 = r0 / r8
            return r0
        L_0x00c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzaB(com.google.android.gms.internal.ads.zzqg, com.google.android.gms.internal.ads.zzad):int");
    }

    private static List zzaC(zzql zzql, zzad zzad, boolean z, boolean z2) throws zzqs {
        String str = zzad.zzm;
        if (str == null) {
            return zzfrh.zzo();
        }
        List zzf2 = zzqy.zzf(str, z, z2);
        String zze2 = zzqy.zze(zzad);
        if (zze2 == null) {
            return zzfrh.zzm(zzf2);
        }
        List zzf3 = zzqy.zzf(zze2, z, z2);
        zzfre zzi2 = zzfrh.zzi();
        zzi2.zzf(zzf2);
        zzi2.zzf(zzf3);
        return zzi2.zzg();
    }

    private final void zzaD() {
        int i = this.zzC;
        if (i == -1) {
            if (this.zzD != -1) {
                i = -1;
            } else {
                return;
            }
        }
        zzcv zzcv = this.zzG;
        if (zzcv == null || zzcv.zzc != i || zzcv.zzd != this.zzD || zzcv.zze != this.zzE || zzcv.zzf != this.zzF) {
            zzcv zzcv2 = new zzcv(i, this.zzD, this.zzE, this.zzF);
            this.zzG = zzcv2;
            this.zzg.zzt(zzcv2);
        }
    }

    private final void zzaE() {
        zzcv zzcv = this.zzG;
        if (zzcv != null) {
            this.zzg.zzt(zzcv);
        }
    }

    private final void zzaF() {
        Surface surface = this.zzl;
        zzws zzws = this.zzm;
        if (surface == zzws) {
            this.zzl = null;
        }
        zzws.release();
        this.zzm = null;
    }

    private static boolean zzaG(long j) {
        return j < -30000;
    }

    private final boolean zzaH(zzqg zzqg) {
        if (zzeg.zza < 23 || zzaA(zzqg.zza) || (zzqg.zzf && !zzws.zzb(this.zze))) {
            return false;
        }
        return true;
    }

    public final void zzD(float f, float f2) throws zzgu {
        super.zzD(f, f2);
        this.zzf.zze(f);
    }

    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    public final boolean zzN() {
        zzws zzws;
        if (super.zzN() && (this.zzp || (((zzws = this.zzm) != null && this.zzl == zzws) || zzaj() == null))) {
            this.zzt = -9223372036854775807L;
            return true;
        } else if (this.zzt == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzt) {
                return true;
            }
            this.zzt = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final float zzP(float f, zzad zzad, zzad[] zzadArr) {
        float f2 = -1.0f;
        for (zzad zzad2 : zzadArr) {
            float f3 = zzad2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    public final int zzQ(zzql zzql, zzad zzad) throws zzqs {
        boolean z;
        int i = 128;
        if (!zzbo.zzh(zzad.zzm)) {
            return 128;
        }
        int i2 = 0;
        boolean z2 = zzad.zzp != null;
        List zzaC = zzaC(zzql, zzad, z2, false);
        if (z2 && zzaC.isEmpty()) {
            zzaC = zzaC(zzql, zzad, false, false);
        }
        if (zzaC.isEmpty()) {
            return 129;
        }
        if (!zzav(zzad)) {
            return 130;
        }
        zzqg zzqg = (zzqg) zzaC.get(0);
        boolean zzd2 = zzqg.zzd(zzad);
        if (!zzd2) {
            int i3 = 1;
            while (true) {
                if (i3 >= zzaC.size()) {
                    break;
                }
                zzqg zzqg2 = (zzqg) zzaC.get(i3);
                if (zzqg2.zzd(zzad)) {
                    zzd2 = true;
                    z = false;
                    zzqg = zzqg2;
                    break;
                }
                i3++;
            }
        }
        z = true;
        int i4 = true != zzd2 ? 3 : 4;
        int i5 = true != zzqg.zze(zzad) ? 8 : 16;
        int i6 = true != zzqg.zzg ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        if (zzd2) {
            List zzaC2 = zzaC(zzql, zzad, z2, true);
            if (!zzaC2.isEmpty()) {
                zzqg zzqg3 = (zzqg) zzqy.zzg(zzaC2, zzad).get(0);
                if (zzqg3.zzd(zzad) && zzqg3.zze(zzad)) {
                    i2 = 32;
                }
            }
        }
        return i4 | i5 | i2 | i6 | i;
    }

    /* access modifiers changed from: protected */
    public final zzgn zzR(zzqg zzqg, zzad zzad, zzad zzad2) {
        int i;
        int i2;
        zzgn zzb2 = zzqg.zzb(zzad, zzad2);
        int i3 = zzb2.zze;
        int i4 = zzad2.zzr;
        zzww zzww = this.zzi;
        if (i4 > zzww.zza || zzad2.zzs > zzww.zzb) {
            i3 |= 256;
        }
        if (zzT(zzqg, zzad2) > this.zzi.zzc) {
            i3 |= 64;
        }
        String str = zzqg.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzb2.zzd;
        }
        return new zzgn(str, zzad, zzad2, i2, i);
    }

    /* access modifiers changed from: protected */
    public final zzgn zzS(zzja zzja) throws zzgu {
        zzgn zzS = super.zzS(zzja);
        this.zzg.zzf(zzja.zza, zzS);
        return zzS;
    }

    /* access modifiers changed from: package-private */
    public final void zzU() {
        this.zzr = true;
        if (!this.zzp) {
            this.zzp = true;
            this.zzg.zzq(this.zzl);
            this.zzn = true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012b, code lost:
        r20 = r9;
        r21 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0232  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzqc zzV(com.google.android.gms.internal.ads.zzqg r23, com.google.android.gms.internal.ads.zzad r24, android.media.MediaCrypto r25, float r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            com.google.android.gms.internal.ads.zzws r4 = r0.zzm
            if (r4 == 0) goto L_0x0015
            boolean r4 = r4.zza
            boolean r5 = r1.zzf
            if (r4 == r5) goto L_0x0015
            r22.zzaF()
        L_0x0015:
            java.lang.String r4 = r1.zzc
            com.google.android.gms.internal.ads.zzad[] r5 = r22.zzJ()
            int r6 = r2.zzr
            int r7 = r2.zzs
            int r8 = zzT(r23, r24)
            int r9 = r5.length
            r10 = -1
            r13 = 1
            if (r9 != r13) goto L_0x0042
            if (r8 == r10) goto L_0x0039
            int r5 = zzaB(r23, r24)
            if (r5 == r10) goto L_0x0039
            float r8 = (float) r8
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r5)
        L_0x0039:
            com.google.android.gms.internal.ads.zzww r5 = new com.google.android.gms.internal.ads.zzww
            r5.<init>(r6, r7, r8)
            r16 = r4
            goto L_0x017a
        L_0x0042:
            r14 = 0
            r15 = 0
        L_0x0044:
            if (r14 >= r9) goto L_0x0088
            r11 = r5[r14]
            com.google.android.gms.internal.ads.zzo r13 = r2.zzy
            if (r13 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.zzo r13 = r11.zzy
            if (r13 != 0) goto L_0x005d
            com.google.android.gms.internal.ads.zzab r11 = r11.zzb()
            com.google.android.gms.internal.ads.zzo r13 = r2.zzy
            r11.zzy(r13)
            com.google.android.gms.internal.ads.zzad r11 = r11.zzY()
        L_0x005d:
            com.google.android.gms.internal.ads.zzgn r13 = r1.zzb(r2, r11)
            int r13 = r13.zzd
            if (r13 == 0) goto L_0x0084
            int r13 = r11.zzr
            if (r13 == r10) goto L_0x0070
            int r12 = r11.zzs
            if (r12 != r10) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r12 = 0
            goto L_0x0071
        L_0x0070:
            r12 = 1
        L_0x0071:
            r15 = r15 | r12
            int r6 = java.lang.Math.max(r6, r13)
            int r12 = r11.zzs
            int r7 = java.lang.Math.max(r7, r12)
            int r11 = zzT(r1, r11)
            int r8 = java.lang.Math.max(r8, r11)
        L_0x0084:
            int r14 = r14 + 1
            r13 = 1
            goto L_0x0044
        L_0x0088:
            if (r15 == 0) goto L_0x0173
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            r5.append(r9)
            r5.append(r6)
            java.lang.String r9 = "x"
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "MediaCodecVideoRenderer"
            android.util.Log.w(r10, r5)
            int r5 = r2.zzs
            int r11 = r2.zzr
            if (r5 <= r11) goto L_0x00b0
            r12 = r5
            goto L_0x00b1
        L_0x00b0:
            r12 = r11
        L_0x00b1:
            if (r5 > r11) goto L_0x00b5
            r13 = r5
            goto L_0x00b6
        L_0x00b5:
            r13 = r11
        L_0x00b6:
            float r14 = (float) r13
            float r15 = (float) r12
            float r14 = r14 / r15
            int[] r15 = zzb
            r16 = r4
            r3 = 0
        L_0x00be:
            r4 = 9
            if (r3 >= r4) goto L_0x012b
            r4 = r15[r3]
            r17 = r15
            float r15 = (float) r4
            float r15 = r15 * r14
            int r15 = (int) r15
            if (r4 <= r12) goto L_0x012b
            if (r15 > r13) goto L_0x00cf
            goto L_0x012b
        L_0x00cf:
            r18 = r12
            int r12 = com.google.android.gms.internal.ads.zzeg.zza
            r19 = r13
            r13 = 21
            if (r12 < r13) goto L_0x00f7
            if (r5 > r11) goto L_0x00dd
            r12 = r4
            goto L_0x00de
        L_0x00dd:
            r12 = r15
        L_0x00de:
            if (r5 > r11) goto L_0x00e1
            r4 = r15
        L_0x00e1:
            android.graphics.Point r4 = r1.zza(r12, r4)
            float r12 = r2.zzt
            int r13 = r4.x
            int r15 = r4.y
            r20 = r9
            r21 = r10
            double r9 = (double) r12
            boolean r9 = r1.zzf(r13, r15, r9)
            if (r9 == 0) goto L_0x011e
            goto L_0x0130
        L_0x00f7:
            r20 = r9
            r21 = r10
            r9 = 16
            int r4 = com.google.android.gms.internal.ads.zzeg.zze(r4, r9)     // Catch:{ zzqs -> 0x012f }
            int r4 = r4 * r9
            int r10 = com.google.android.gms.internal.ads.zzeg.zze(r15, r9)     // Catch:{ zzqs -> 0x012f }
            int r10 = r10 * r9
            int r9 = r4 * r10
            int r12 = com.google.android.gms.internal.ads.zzqy.zza()     // Catch:{ zzqs -> 0x012f }
            if (r9 > r12) goto L_0x011e
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ zzqs -> 0x012f }
            if (r5 > r11) goto L_0x0115
            r9 = r4
            goto L_0x0116
        L_0x0115:
            r9 = r10
        L_0x0116:
            if (r5 > r11) goto L_0x0119
            r4 = r10
        L_0x0119:
            r3.<init>(r9, r4)     // Catch:{ zzqs -> 0x012f }
            r4 = r3
            goto L_0x0130
        L_0x011e:
            int r3 = r3 + 1
            r15 = r17
            r12 = r18
            r13 = r19
            r9 = r20
            r10 = r21
            goto L_0x00be
        L_0x012b:
            r20 = r9
            r21 = r10
        L_0x012f:
            r4 = 0
        L_0x0130:
            if (r4 == 0) goto L_0x0175
            int r3 = r4.x
            int r6 = java.lang.Math.max(r6, r3)
            int r3 = r4.y
            int r7 = java.lang.Math.max(r7, r3)
            com.google.android.gms.internal.ads.zzab r3 = r24.zzb()
            r3.zzX(r6)
            r3.zzF(r7)
            com.google.android.gms.internal.ads.zzad r3 = r3.zzY()
            int r3 = zzaB(r1, r3)
            int r8 = java.lang.Math.max(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r3.append(r4)
            r3.append(r6)
            r4 = r20
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r4 = r21
            android.util.Log.w(r4, r3)
            goto L_0x0175
        L_0x0173:
            r16 = r4
        L_0x0175:
            com.google.android.gms.internal.ads.zzww r5 = new com.google.android.gms.internal.ads.zzww
            r5.<init>(r6, r7, r8)
        L_0x017a:
            r0.zzi = r5
            boolean r3 = r0.zzh
            android.media.MediaFormat r4 = new android.media.MediaFormat
            r4.<init>()
            java.lang.String r6 = "mime"
            r7 = r16
            r4.setString(r6, r7)
            int r6 = r2.zzr
            java.lang.String r7 = "width"
            r4.setInteger(r7, r6)
            int r6 = r2.zzs
            java.lang.String r7 = "height"
            r4.setInteger(r7, r6)
            java.util.List r6 = r2.zzo
            com.google.android.gms.internal.ads.zzdp.zzb(r4, r6)
            float r6 = r2.zzt
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x01aa
            java.lang.String r8 = "frame-rate"
            r4.setFloat(r8, r6)
        L_0x01aa:
            int r6 = r2.zzu
            java.lang.String r8 = "rotation-degrees"
            com.google.android.gms.internal.ads.zzdp.zza(r4, r8, r6)
            com.google.android.gms.internal.ads.zzo r6 = r2.zzy
            if (r6 == 0) goto L_0x01d7
            int r8 = r6.zzd
            java.lang.String r9 = "color-transfer"
            com.google.android.gms.internal.ads.zzdp.zza(r4, r9, r8)
            int r8 = r6.zzb
            java.lang.String r9 = "color-standard"
            com.google.android.gms.internal.ads.zzdp.zza(r4, r9, r8)
            int r8 = r6.zzc
            java.lang.String r9 = "color-range"
            com.google.android.gms.internal.ads.zzdp.zza(r4, r9, r8)
            byte[] r6 = r6.zze
            if (r6 == 0) goto L_0x01d7
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r8 = "hdr-static-info"
            r4.setByteBuffer(r8, r6)
        L_0x01d7:
            java.lang.String r6 = r2.zzm
            java.lang.String r8 = "video/dolby-vision"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01f4
            android.util.Pair r6 = com.google.android.gms.internal.ads.zzqy.zzb(r24)
            if (r6 == 0) goto L_0x01f4
            java.lang.Object r6 = r6.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r8 = "profile"
            com.google.android.gms.internal.ads.zzdp.zza(r4, r8, r6)
        L_0x01f4:
            int r6 = r5.zza
            java.lang.String r8 = "max-width"
            r4.setInteger(r8, r6)
            int r6 = r5.zzb
            java.lang.String r8 = "max-height"
            r4.setInteger(r8, r6)
            int r5 = r5.zzc
            java.lang.String r6 = "max-input-size"
            com.google.android.gms.internal.ads.zzdp.zza(r4, r6, r5)
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            r6 = 23
            if (r5 < r6) goto L_0x0220
            java.lang.String r5 = "priority"
            r6 = 0
            r4.setInteger(r5, r6)
            r5 = r26
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0220
            java.lang.String r6 = "operating-rate"
            r4.setFloat(r6, r5)
        L_0x0220:
            if (r3 == 0) goto L_0x022e
            java.lang.String r3 = "no-post-process"
            r5 = 1
            r4.setInteger(r3, r5)
            java.lang.String r3 = "auto-frc"
            r5 = 0
            r4.setInteger(r3, r5)
        L_0x022e:
            android.view.Surface r3 = r0.zzl
            if (r3 != 0) goto L_0x0251
            boolean r3 = r22.zzaH(r23)
            if (r3 == 0) goto L_0x024b
            com.google.android.gms.internal.ads.zzws r3 = r0.zzm
            if (r3 != 0) goto L_0x0246
            android.content.Context r3 = r0.zze
            boolean r5 = r1.zzf
            com.google.android.gms.internal.ads.zzws r3 = com.google.android.gms.internal.ads.zzws.zza(r3, r5)
            r0.zzm = r3
        L_0x0246:
            com.google.android.gms.internal.ads.zzws r3 = r0.zzm
            r0.zzl = r3
            goto L_0x0251
        L_0x024b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0251:
            android.view.Surface r3 = r0.zzl
            r5 = 0
            com.google.android.gms.internal.ads.zzqc r1 = com.google.android.gms.internal.ads.zzqc.zzb(r1, r4, r2, r3, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzV(com.google.android.gms.internal.ads.zzqg, com.google.android.gms.internal.ads.zzad, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqc");
    }

    /* access modifiers changed from: protected */
    public final List zzW(zzql zzql, zzad zzad, boolean z) throws zzqs {
        return zzqy.zzg(zzaC(zzql, zzad, false, false), zzad);
    }

    /* access modifiers changed from: protected */
    public final void zzX(Exception exc) {
        zzdn.zza("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzY(String str, zzqc zzqc, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzj = zzaA(str);
        zzqg zzal = zzal();
        if (zzal != null) {
            boolean z = false;
            if (zzeg.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzal.zzb)) {
                MediaCodecInfo.CodecProfileLevel[] zzg2 = zzal.zzg();
                int length = zzg2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (zzg2[i].profile == 16384) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.zzk = z;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    /* access modifiers changed from: protected */
    public final void zzaa(zzad zzad, MediaFormat mediaFormat) {
        int i;
        int i2;
        zzqe zzaj = zzaj();
        if (zzaj != null) {
            zzaj.zzq(this.zzo);
        }
        if (mediaFormat != null) {
            boolean z = false;
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            }
            if (z) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.zzC = i;
            if (z) {
                i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.zzD = i2;
            this.zzF = zzad.zzv;
            if (zzeg.zza >= 21) {
                int i3 = zzad.zzu;
                if (i3 == 90 || i3 == 270) {
                    int i4 = this.zzC;
                    this.zzC = this.zzD;
                    this.zzD = i4;
                    this.zzF = 1.0f / this.zzF;
                }
            } else {
                this.zzE = zzad.zzu;
            }
            this.zzf.zzc(zzad.zzt);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzab(zzqe zzqe, int i, long j) {
        zzaD();
        int i2 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqe.zzn(i, true);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzU();
    }

    /* access modifiers changed from: protected */
    public final void zzac() {
        this.zzp = false;
        int i = zzeg.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzad(zzgc zzgc) throws zzgu {
        this.zzx++;
        int i = zzeg.zza;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009f, code lost:
        if (r16 > 100000) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzaf(long r23, long r25, com.google.android.gms.internal.ads.zzqe r27, java.nio.ByteBuffer r28, int r29, int r30, int r31, long r32, boolean r34, boolean r35, com.google.android.gms.internal.ads.zzad r36) throws com.google.android.gms.internal.ads.zzgu {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r27
            r4 = r29
            r5 = r32
            if (r3 == 0) goto L_0x018c
            long r7 = r0.zzs
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0019
            r0.zzs = r1
        L_0x0019:
            long r7 = r0.zzy
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzxf r7 = r0.zzf
            r7.zzd(r5)
            r0.zzy = r5
        L_0x0026:
            long r7 = r22.zzai()
            long r11 = r5 - r7
            r13 = 1
            if (r34 == 0) goto L_0x0036
            if (r35 == 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            r0.zzax(r3, r4, r11)
            return r13
        L_0x0036:
            float r14 = r22.zzah()
            int r15 = r22.zzbe()
            long r16 = android.os.SystemClock.elapsedRealtime()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r18
            long r5 = r5 - r1
            double r5 = (double) r5
            double r9 = (double) r14
            double r5 = r5 / r9
            long r5 = (long) r5
            r9 = 2
            if (r15 != r9) goto L_0x0052
            long r20 = r16 - r25
            long r5 = r5 - r20
        L_0x0052:
            android.view.Surface r10 = r0.zzl
            com.google.android.gms.internal.ads.zzws r14 = r0.zzm
            r9 = 0
            if (r10 != r14) goto L_0x0067
            boolean r1 = zzaG(r5)
            if (r1 == 0) goto L_0x0066
            r0.zzax(r3, r4, r11)
            r0.zzaz(r5)
            return r13
        L_0x0066:
            return r9
        L_0x0067:
            long r9 = r0.zzz
            long r16 = r16 - r9
            boolean r9 = r0.zzr
            if (r9 != 0) goto L_0x0077
            r9 = 2
            if (r15 == r9) goto L_0x007b
            boolean r9 = r0.zzq
            if (r9 == 0) goto L_0x007d
            goto L_0x007b
        L_0x0077:
            boolean r9 = r0.zzp
            if (r9 != 0) goto L_0x007d
        L_0x007b:
            r9 = r13
            goto L_0x007e
        L_0x007d:
            r9 = 0
        L_0x007e:
            long r13 = r0.zzt
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            r14 = 21
            if (r13 != 0) goto L_0x00bf
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x00bf
            if (r9 != 0) goto L_0x00a1
            r7 = 2
            if (r15 != r7) goto L_0x00c0
            boolean r7 = zzaG(r5)
            if (r7 == 0) goto L_0x00bf
            r7 = 100000(0x186a0, double:4.94066E-319)
            int r7 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00bf
        L_0x00a1:
            long r1 = java.lang.System.nanoTime()
            int r7 = com.google.android.gms.internal.ads.zzeg.zza
            if (r7 < r14) goto L_0x00b7
            r30 = r22
            r31 = r27
            r32 = r29
            r33 = r11
            r35 = r1
            r30.zzaw(r31, r32, r33, r35)
            goto L_0x00ba
        L_0x00b7:
            r0.zzab(r3, r4, r11)
        L_0x00ba:
            r0.zzaz(r5)
            r1 = 1
            return r1
        L_0x00bf:
            r7 = 2
        L_0x00c0:
            if (r15 != r7) goto L_0x018a
            long r7 = r0.zzs
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x00ca
            goto L_0x018a
        L_0x00ca:
            long r7 = java.lang.System.nanoTime()
            com.google.android.gms.internal.ads.zzxf r9 = r0.zzf
            long r5 = r5 * r18
            long r5 = r5 + r7
            long r5 = r9.zza(r5)
            long r7 = r5 - r7
            long r7 = r7 / r18
            long r14 = r0.zzt
            r16 = -500000(0xfffffffffff85ee0, double:NaN)
            int r9 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r9 >= 0) goto L_0x0117
            if (r35 != 0) goto L_0x0117
            int r1 = r22.zzd(r23)
            if (r1 != 0) goto L_0x00ed
            goto L_0x0117
        L_0x00ed:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0105
            com.google.android.gms.internal.ads.zzgm r2 = r0.zza
            int r3 = r2.zzd
            int r3 = r3 + r1
            r2.zzd = r3
            int r1 = r2.zzf
            int r3 = r0.zzx
            int r1 = r1 + r3
            r2.zzf = r1
            goto L_0x0112
        L_0x0105:
            com.google.android.gms.internal.ads.zzgm r2 = r0.zza
            int r3 = r2.zzj
            r4 = 1
            int r3 = r3 + r4
            r2.zzj = r3
            int r2 = r0.zzx
            r0.zzay(r1, r2)
        L_0x0112:
            r22.zzas()
            r1 = 0
            return r1
        L_0x0117:
            boolean r1 = zzaG(r7)
            if (r1 == 0) goto L_0x0143
            if (r35 != 0) goto L_0x0143
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x012d
            r0.zzax(r3, r4, r11)
            r2 = 1
            goto L_0x013f
        L_0x012d:
            int r1 = com.google.android.gms.internal.ads.zzeg.zza
            java.lang.String r1 = "dropVideoBuffer"
            android.os.Trace.beginSection(r1)
            r1 = 0
            r3.zzn(r4, r1)
            android.os.Trace.endSection()
            r2 = 1
            r0.zzay(r1, r2)
        L_0x013f:
            r0.zzaz(r7)
            return r2
        L_0x0143:
            int r1 = com.google.android.gms.internal.ads.zzeg.zza
            r2 = 21
            if (r1 < r2) goto L_0x0162
            r1 = 50000(0xc350, double:2.47033E-319)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0188
            r30 = r22
            r31 = r27
            r32 = r29
            r33 = r11
            r35 = r5
            r30.zzaw(r31, r32, r33, r35)
            r0.zzaz(r7)
            r1 = 1
            return r1
        L_0x0162:
            r1 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0188
            r1 = 11000(0x2af8, double:5.4347E-320)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0180
            r1 = -10000(0xffffffffffffd8f0, double:NaN)
            long r1 = r1 + r7
            long r1 = r1 / r18
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0177 }
            goto L_0x0180
        L_0x0177:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = 0
            return r1
        L_0x0180:
            r0.zzab(r3, r4, r11)
            r0.zzaz(r7)
            r1 = 1
            return r1
        L_0x0188:
            r1 = 0
            return r1
        L_0x018a:
            r1 = 0
            return r1
        L_0x018c:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzaf(long, long, com.google.android.gms.internal.ads.zzqe, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.zzad):boolean");
    }

    /* access modifiers changed from: protected */
    public final zzqf zzak(Throwable th, zzqg zzqg) {
        return new zzwv(th, zzqg, this.zzl);
    }

    /* access modifiers changed from: protected */
    public final void zzam(zzgc zzgc) throws zzgu {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzgc.zze;
            if (byteBuffer == null) {
                throw null;
            } else if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzqe zzaj = zzaj();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaj.zzp(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzao(long j) {
        super.zzao(j);
        this.zzx--;
    }

    /* access modifiers changed from: protected */
    public final void zzaq() {
        super.zzaq();
        this.zzx = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean zzau(zzqg zzqg) {
        return this.zzl != null || zzaH(zzqg);
    }

    /* access modifiers changed from: protected */
    public final void zzaw(zzqe zzqe, int i, long j, long j2) {
        zzaD();
        int i2 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqe.zzm(i, j2);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzU();
    }

    /* access modifiers changed from: protected */
    public final void zzax(zzqe zzqe, int i, long j) {
        int i2 = zzeg.zza;
        Trace.beginSection("skipVideoBuffer");
        zzqe.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    /* access modifiers changed from: protected */
    public final void zzay(int i, int i2) {
        zzgm zzgm = this.zza;
        zzgm.zzh += i;
        int i3 = i + i2;
        zzgm.zzg += i3;
        this.zzv += i3;
        int i4 = this.zzw + i3;
        this.zzw = i4;
        zzgm.zzi = Math.max(i4, zzgm.zzi);
    }

    /* access modifiers changed from: protected */
    public final void zzaz(long j) {
        zzgm zzgm = this.zza;
        zzgm.zzk += j;
        zzgm.zzl++;
        this.zzA += j;
        this.zzB++;
    }

    /* access modifiers changed from: protected */
    public final void zzs() {
        this.zzG = null;
        this.zzp = false;
        int i = zzeg.zza;
        this.zzn = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzt(boolean z, boolean z2) throws zzgu {
        super.zzt(z, z2);
        zzk();
        this.zzg.zze(this.zza);
        this.zzq = z2;
        this.zzr = false;
    }

    /* access modifiers changed from: protected */
    public final void zzu(long j, boolean z) throws zzgu {
        super.zzu(j, z);
        this.zzp = false;
        int i = zzeg.zza;
        this.zzf.zzf();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzm != null) {
                zzaF();
            }
        } catch (Throwable th) {
            if (this.zzm != null) {
                zzaF();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzw() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0;
        this.zzB = 0;
        this.zzf.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzx() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, elapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = elapsedRealtime;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zzr(this.zzA, i);
            this.zzA = 0;
            this.zzB = 0;
        }
        this.zzf.zzh();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzp(int r6, java.lang.Object r7) throws com.google.android.gms.internal.ads.zzgu {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r0) goto L_0x0042
            r0 = 7
            if (r6 == r0) goto L_0x003d
            r0 = 10
            if (r6 == r0) goto L_0x0030
            r0 = 4
            if (r6 == r0) goto L_0x001e
            r0 = 5
            if (r6 == r0) goto L_0x0012
            goto L_0x00ca
        L_0x0012:
            com.google.android.gms.internal.ads.zzxf r6 = r5.zzf
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.zzj(r7)
            return
        L_0x001e:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.zzo = r6
            com.google.android.gms.internal.ads.zzqe r7 = r5.zzaj()
            if (r7 == 0) goto L_0x00ca
            r7.zzq(r6)
            return
        L_0x0030:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r7 = r5.zzH
            if (r7 == r6) goto L_0x00ca
            r5.zzH = r6
            return
        L_0x003d:
            com.google.android.gms.internal.ads.zzwy r7 = (com.google.android.gms.internal.ads.zzwy) r7
            r5.zzI = r7
            return
        L_0x0042:
            boolean r6 = r7 instanceof android.view.Surface
            r0 = 0
            if (r6 == 0) goto L_0x004a
            android.view.Surface r7 = (android.view.Surface) r7
            goto L_0x004b
        L_0x004a:
            r7 = r0
        L_0x004b:
            if (r7 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzws r6 = r5.zzm
            if (r6 == 0) goto L_0x0053
            r7 = r6
            goto L_0x0069
        L_0x0053:
            com.google.android.gms.internal.ads.zzqg r6 = r5.zzal()
            if (r6 == 0) goto L_0x0069
            boolean r1 = r5.zzaH(r6)
            if (r1 == 0) goto L_0x0069
            android.content.Context r7 = r5.zze
            boolean r6 = r6.zzf
            com.google.android.gms.internal.ads.zzws r7 = com.google.android.gms.internal.ads.zzws.zza(r7, r6)
            r5.zzm = r7
        L_0x0069:
            android.view.Surface r6 = r5.zzl
            if (r6 == r7) goto L_0x00b6
            r5.zzl = r7
            com.google.android.gms.internal.ads.zzxf r6 = r5.zzf
            r6.zzi(r7)
            r6 = 0
            r5.zzn = r6
            int r1 = r5.zzbe()
            com.google.android.gms.internal.ads.zzqe r2 = r5.zzaj()
            if (r2 == 0) goto L_0x0097
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            r4 = 23
            if (r3 < r4) goto L_0x0091
            if (r7 == 0) goto L_0x0091
            boolean r3 = r5.zzj
            if (r3 != 0) goto L_0x0091
            r2.zzo(r7)
            goto L_0x0097
        L_0x0091:
            r5.zzap()
            r5.zzan()
        L_0x0097:
            if (r7 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzws r2 = r5.zzm
            if (r7 == r2) goto L_0x00af
            r5.zzaE()
            r5.zzp = r6
            int r6 = com.google.android.gms.internal.ads.zzeg.zza
            r6 = 2
            if (r1 != r6) goto L_0x00ca
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.zzt = r6
            return
        L_0x00af:
            r5.zzG = r0
            r5.zzp = r6
            int r6 = com.google.android.gms.internal.ads.zzeg.zza
            return
        L_0x00b6:
            if (r7 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzws r6 = r5.zzm
            if (r7 == r6) goto L_0x00ca
            r5.zzaE()
            boolean r6 = r5.zzn
            if (r6 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzxq r6 = r5.zzg
            android.view.Surface r7 = r5.zzl
            r6.zzq(r7)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzp(int, java.lang.Object):void");
    }
}
