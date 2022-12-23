package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cf */
/* compiled from: NativeTracker */
public class C5922cf {

    /* renamed from: g */
    private static final String f15000g = C5922cf.class.getSimpleName();

    /* renamed from: a */
    protected String f15001a;

    /* renamed from: b */
    public String f15002b;

    /* renamed from: c */
    protected int f15003c;

    /* renamed from: d */
    public String f15004d;

    /* renamed from: e */
    public Map<String, String> f15005e;

    /* renamed from: f */
    public Map<String, Object> f15006f;

    public C5922cf(String str, int i, String str2, Map<String, String> map) {
        this("url_ping", str, i, str2, map);
    }

    private C5922cf(String str, String str2, int i, String str3, Map<String, String> map) {
        this.f15005e = new HashMap();
        this.f15001a = str;
        this.f15002b = str2.trim();
        this.f15003c = i;
        this.f15004d = str3;
        this.f15005e = map;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b1, code lost:
        return "fullscreen";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b2, code lost:
        return "creativeView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b3, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b4, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b5, code lost:
        return "midpoint";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b6, code lost:
        return com.tapjoy.TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b7, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b8, code lost:
        return r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b9, code lost:
        return r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ba, code lost:
        return r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        r22 = "start";
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bb, code lost:
        return "Impression";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01be, code lost:
        return r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01bf, code lost:
        return r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0112, code lost:
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        r19 = "VideoImpression";
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004f, code lost:
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0136, code lost:
        r20 = "page_view";
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014d, code lost:
        r21 = "click";
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0051, code lost:
        r19 = "VideoImpression";
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0168, code lost:
        r22 = "start";
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a3, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a4, code lost:
        switch(r0) {
            case 2: goto L_0x01bf;
            case 3: goto L_0x01be;
            case 4: goto L_0x01bb;
            case 5: goto L_0x01ba;
            case 6: goto L_0x01b9;
            case 7: goto L_0x01b8;
            case 8: goto L_0x01b7;
            case 9: goto L_0x01b6;
            case 10: goto L_0x01b5;
            case 11: goto L_0x01b4;
            case 12: goto L_0x01b3;
            case 13: goto L_0x01b2;
            case 14: goto L_0x01b1;
            case 15: goto L_0x01b0;
            case 16: goto L_0x01af;
            case 17: goto L_0x01ae;
            case 18: goto L_0x01ad;
            case 19: goto L_0x01ac;
            case 20: goto L_0x01ab;
            case 21: goto L_0x01aa;
            case 22: goto L_0x01a9;
            case 23: goto L_0x01a8;
            default: goto L_0x01a7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0055, code lost:
        r20 = "page_view";
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a7, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a8, code lost:
        return "closeEndCard";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a9, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01aa, code lost:
        return "OMID_VIEWABILITY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ab, code lost:
        return "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ac, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ad, code lost:
        return com.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_PAUSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ae, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01af, code lost:
        return "mute";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b0, code lost:
        return "exitFullscreen";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        r21 = "click";
        r15 = r22;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m17725a(java.lang.String r24) {
        /*
            r0 = r24
            java.lang.String r1 = "unknown"
            if (r0 == 0) goto L_0x01c0
            int r2 = r24.length()
            if (r2 != 0) goto L_0x000e
            goto L_0x01c0
        L_0x000e:
            int r3 = r24.hashCode()
            java.lang.String r4 = "creativeView"
            java.lang.String r5 = "closeEndCard"
            java.lang.String r6 = "page_view"
            java.lang.String r7 = "firstQuartile"
            java.lang.String r8 = "OMID_VIEWABILITY"
            java.lang.String r9 = "VideoImpression"
            java.lang.String r10 = "exitFullscreen"
            java.lang.String r11 = "fullscreen"
            java.lang.String r12 = "start"
            java.lang.String r13 = "pause"
            java.lang.String r14 = "error"
            java.lang.String r15 = "click"
            java.lang.String r2 = "mute"
            r16 = r1
            java.lang.String r1 = "load"
            r17 = r1
            java.lang.String r1 = "client_fill"
            r18 = r1
            java.lang.String r1 = "complete"
            r19 = r1
            java.lang.String r1 = "zMoatVASTIDs"
            r20 = r1
            java.lang.String r1 = "unmute"
            r21 = r1
            java.lang.String r1 = "resume"
            r22 = r1
            java.lang.String r1 = "thirdQuartile"
            r23 = r1
            java.lang.String r1 = "midpoint"
            switch(r3) {
                case -1638835128: goto L_0x0188;
                case -1337830390: goto L_0x016d;
                case -934426579: goto L_0x0152;
                case -840405966: goto L_0x013b;
                case -667101923: goto L_0x0128;
                case -599445191: goto L_0x0119;
                case -284840886: goto L_0x0107;
                case -174104201: goto L_0x00f7;
                case 3327206: goto L_0x00e7;
                case 3363353: goto L_0x00de;
                case 94750088: goto L_0x00d6;
                case 96784904: goto L_0x00cd;
                case 106440182: goto L_0x00c4;
                case 109757538: goto L_0x00bb;
                case 110066619: goto L_0x00b2;
                case 113951609: goto L_0x00a8;
                case 354294980: goto L_0x009f;
                case 368426751: goto L_0x0095;
                case 560220243: goto L_0x008b;
                case 883937877: goto L_0x0082;
                case 1342121331: goto L_0x0078;
                case 1778167540: goto L_0x006e;
                case 2114088489: goto L_0x0063;
                default: goto L_0x004f;
            }
        L_0x004f:
            r3 = r19
        L_0x0051:
            r19 = r9
            r9 = r20
        L_0x0055:
            r20 = r6
            r6 = r21
        L_0x0059:
            r21 = r15
            r15 = r22
        L_0x005d:
            r22 = r12
            r12 = r23
            goto L_0x01a3
        L_0x0063:
            java.lang.String r3 = "Impression"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x004f
            r0 = 4
            goto L_0x0112
        L_0x006e:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x004f
            r0 = 13
            goto L_0x0112
        L_0x0078:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x004f
            r0 = 23
            goto L_0x0112
        L_0x0082:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x004f
            r0 = 6
            goto L_0x0112
        L_0x008b:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x004f
            r0 = 9
            goto L_0x0112
        L_0x0095:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x004f
            r0 = 21
            goto L_0x0112
        L_0x009f:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x004f
            r0 = 5
            goto L_0x0112
        L_0x00a8:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x004f
            r0 = 15
            goto L_0x0112
        L_0x00b2:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x004f
            r0 = 14
            goto L_0x0112
        L_0x00bb:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x004f
            r0 = 8
            goto L_0x0112
        L_0x00c4:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x004f
            r0 = 18
            goto L_0x0112
        L_0x00cd:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x004f
            r0 = 20
            goto L_0x0112
        L_0x00d6:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x004f
            r0 = 7
            goto L_0x0112
        L_0x00de:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x004f
            r0 = 16
            goto L_0x0112
        L_0x00e7:
            r3 = r17
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00f3
            r0 = 2
            r17 = r3
            goto L_0x0112
        L_0x00f3:
            r17 = r3
            goto L_0x004f
        L_0x00f7:
            r3 = r18
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0103
            r0 = 3
            r18 = r3
            goto L_0x0112
        L_0x0103:
            r18 = r3
            goto L_0x004f
        L_0x0107:
            r3 = r16
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0115
            r0 = 1
            r16 = r3
        L_0x0112:
            r3 = r19
            goto L_0x0123
        L_0x0115:
            r16 = r3
            goto L_0x004f
        L_0x0119:
            r3 = r19
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 12
        L_0x0123:
            r19 = r9
            r9 = r20
            goto L_0x0136
        L_0x0128:
            r3 = r19
            r19 = r9
            r9 = r20
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0055
            r0 = 22
        L_0x0136:
            r20 = r6
            r6 = r21
            goto L_0x014d
        L_0x013b:
            r3 = r19
            r19 = r9
            r9 = r20
            r20 = r6
            r6 = r21
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0059
            r0 = 17
        L_0x014d:
            r21 = r15
            r15 = r22
            goto L_0x0168
        L_0x0152:
            r3 = r19
            r19 = r9
            r9 = r20
            r20 = r6
            r6 = r21
            r21 = r15
            r15 = r22
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x005d
            r0 = 19
        L_0x0168:
            r22 = r12
            r12 = r23
            goto L_0x01a4
        L_0x016d:
            r3 = r19
            r19 = r9
            r9 = r20
            r20 = r6
            r6 = r21
            r21 = r15
            r15 = r22
            r22 = r12
            r12 = r23
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01a3
            r0 = 11
            goto L_0x01a4
        L_0x0188:
            r3 = r19
            r19 = r9
            r9 = r20
            r20 = r6
            r6 = r21
            r21 = r15
            r15 = r22
            r22 = r12
            r12 = r23
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01a3
            r0 = 10
            goto L_0x01a4
        L_0x01a3:
            r0 = -1
        L_0x01a4:
            switch(r0) {
                case 2: goto L_0x01bf;
                case 3: goto L_0x01be;
                case 4: goto L_0x01bb;
                case 5: goto L_0x01ba;
                case 6: goto L_0x01b9;
                case 7: goto L_0x01b8;
                case 8: goto L_0x01b7;
                case 9: goto L_0x01b6;
                case 10: goto L_0x01b5;
                case 11: goto L_0x01b4;
                case 12: goto L_0x01b3;
                case 13: goto L_0x01b2;
                case 14: goto L_0x01b1;
                case 15: goto L_0x01b0;
                case 16: goto L_0x01af;
                case 17: goto L_0x01ae;
                case 18: goto L_0x01ad;
                case 19: goto L_0x01ac;
                case 20: goto L_0x01ab;
                case 21: goto L_0x01aa;
                case 22: goto L_0x01a9;
                case 23: goto L_0x01a8;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            return r16
        L_0x01a8:
            return r5
        L_0x01a9:
            return r9
        L_0x01aa:
            return r8
        L_0x01ab:
            return r14
        L_0x01ac:
            return r15
        L_0x01ad:
            return r13
        L_0x01ae:
            return r6
        L_0x01af:
            return r2
        L_0x01b0:
            return r10
        L_0x01b1:
            return r11
        L_0x01b2:
            return r4
        L_0x01b3:
            return r3
        L_0x01b4:
            return r12
        L_0x01b5:
            return r1
        L_0x01b6:
            return r7
        L_0x01b7:
            return r22
        L_0x01b8:
            return r21
        L_0x01b9:
            return r20
        L_0x01ba:
            return r19
        L_0x01bb:
            java.lang.String r0 = "Impression"
            return r0
        L_0x01be:
            return r18
        L_0x01bf:
            return r17
        L_0x01c0:
            r16 = r1
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5922cf.m17725a(java.lang.String):java.lang.String");
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f15001a);
            jSONObject.put("url", this.f15002b);
            jSONObject.put("eventType", this.f15004d);
            jSONObject.put("eventId", this.f15003c);
            jSONObject.put("extras", C6239hv.m18611a((Map<String, String>) this.f15005e == null ? new HashMap() : this.f15005e, ","));
            return jSONObject.toString();
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }
}
