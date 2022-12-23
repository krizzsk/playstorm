package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.cache.C4235a;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.remote.C4332e;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.c */
public class C4268c implements C4235a<IAConfigManager.C4258a> {

    /* renamed from: a */
    public boolean f10590a = false;

    /* renamed from: a */
    public String mo24241a() {
        String str = IAConfigManager.f10525J.f10538c;
        StringBuilder sb = new StringBuilder("https://");
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb.append(property);
        }
        sb.append(str);
        sb.append('/');
        sb.append(str);
        sb.append(".json");
        String sb2 = sb.toString();
        int i2 = IAlog.f14137a;
        IAlog.m16697a(1, (Exception) null, "%s: %s", "APP_CONFIG_REQUEST", sb2);
        return sb2;
    }

    /* renamed from: b */
    public String mo24243b() {
        return "IALastModifiedFromHeader";
    }

    /* renamed from: c */
    public String mo24244c() {
        return "inneractive.config";
    }

    /* renamed from: d */
    public boolean mo24245d() {
        String string = C5350l.f14216a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", (String) null);
        if (string == null || !string.equalsIgnoreCase(IAConfigManager.f10525J.f10538c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo24242a(Object obj) {
        IAConfigManager.C4258a aVar = (IAConfigManager.C4258a) obj;
        if (aVar != null && aVar.f10562a != null) {
            C5350l.f14216a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", aVar.f10562a).apply();
        }
    }

    /* renamed from: a */
    public final void mo24276a(Throwable th, String str) {
        String str2;
        String str3;
        String str4;
        if (!this.f10590a) {
            this.f10590a = true;
            if (!TextUtils.isEmpty(str)) {
                str2 = str.substring(0, str.length() > 501 ? 500 : str.length() - 1);
            } else {
                str2 = "Empty Json Data";
            }
            if (th != null) {
                str4 = th.getClass().getName();
                str3 = th.getLocalizedMessage();
            } else {
                str4 = "Bad remote configuration";
                str3 = "Internal error";
            }
            String str5 = IAConfigManager.f10525J.f10538c;
            C4569q.C4570a aVar = new C4569q.C4570a(C4565o.FATAL_CONFIGURATION_ERROR, (InneractiveAdRequest) null, (C5291e) null, (JSONArray) null);
            Object[] objArr = new Object[8];
            objArr[0] = "exception";
            objArr[1] = str4;
            objArr[2] = "message";
            if (str3 == null) {
                str3 = "No message";
            }
            objArr[3] = str3;
            objArr[4] = "data";
            objArr[5] = str2;
            objArr[6] = "appId";
            if (TextUtils.isEmpty(str5)) {
                str5 = "EMPTY_APP_ID";
            }
            objArr[7] = str5;
            aVar.mo24767a(objArr).mo24768a((String) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0203  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.config.IAConfigManager.C4258a mo24275a(com.fyber.inneractive.sdk.config.remote.C4332e r24) {
        /*
            r23 = this;
            r0 = r24
            com.fyber.inneractive.sdk.config.IAConfigManager$a r1 = new com.fyber.inneractive.sdk.config.IAConfigManager$a
            r1.<init>()
            java.lang.String r2 = r0.f10707c
            r1.f10564c = r2
            com.fyber.inneractive.sdk.config.remote.a r2 = r0.f10705a
            java.lang.String r3 = r2.f10695b
            r1.f10563b = r3
            java.lang.String r3 = r0.f10708d
            r1.f10565d = r3
            java.lang.String r2 = r2.f10694a
            r1.f10562a = r2
            java.util.List<com.fyber.inneractive.sdk.config.remote.h> r2 = r0.f10706b
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04de
            java.lang.Object r3 = r2.next()
            com.fyber.inneractive.sdk.config.remote.h r3 = (com.fyber.inneractive.sdk.config.remote.C4335h) r3
            java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.x> r4 = r1.f10566e
            java.lang.String r5 = r3.f10711a
            com.fyber.inneractive.sdk.config.remote.a r6 = r0.f10705a
            java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.y> r7 = r1.f10567f
            com.fyber.inneractive.sdk.config.IAConfigManager$c r8 = r1.f10568g
            com.fyber.inneractive.sdk.config.x r9 = new com.fyber.inneractive.sdk.config.x
            r9.<init>()
            r10 = 2
            com.fyber.inneractive.sdk.config.remote.c[] r11 = new com.fyber.inneractive.sdk.config.remote.C4330c[r10]
            r12 = 0
            r11[r12] = r6
            r13 = 1
            r11[r13] = r3
            r14 = r12
        L_0x0044:
            if (r14 >= r10) goto L_0x005e
            r15 = r11[r14]
            if (r15 == 0) goto L_0x005a
            java.lang.String r15 = r15.mo24358b()
            if (r15 == 0) goto L_0x005a
            java.lang.String r10 = "false"
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x005a
            r10 = r12
            goto L_0x005f
        L_0x005a:
            int r14 = r14 + 1
            r10 = 2
            goto L_0x0044
        L_0x005e:
            r10 = r13
        L_0x005f:
            r9.f10744b = r10
            java.util.List<com.fyber.inneractive.sdk.config.remote.i> r10 = r3.f10717g
            java.util.Iterator r10 = r10.iterator()
        L_0x0067:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x04d2
            java.lang.Object r11 = r10.next()
            com.fyber.inneractive.sdk.config.remote.i r11 = (com.fyber.inneractive.sdk.config.remote.C4336i) r11
            com.fyber.inneractive.sdk.config.y r14 = new com.fyber.inneractive.sdk.config.y
            r14.<init>()
            java.lang.String r15 = r11.f10718a
            if (r15 == 0) goto L_0x04ca
            java.lang.String r13 = r11.f10719b
            if (r13 != 0) goto L_0x0082
        L_0x0080:
            r13 = 1
            goto L_0x0067
        L_0x0082:
            r14.f10745a = r15
            r14.f10746b = r13
            com.fyber.inneractive.sdk.config.remote.g r13 = r11.f10722e
            if (r13 == 0) goto L_0x009c
            com.fyber.inneractive.sdk.config.w r15 = new com.fyber.inneractive.sdk.config.w
            r15.<init>()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r13 = r13.f10710a
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r12 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.DEFAULT
            if (r13 != r12) goto L_0x009a
            r15.f10742a = r13
            r14.f10749e = r15
            goto L_0x009c
        L_0x009a:
            r12 = 0
            goto L_0x0080
        L_0x009c:
            com.fyber.inneractive.sdk.config.remote.b r12 = r11.f10720c
            if (r12 == 0) goto L_0x0181
            com.fyber.inneractive.sdk.config.remote.b r15 = r3.f10713c
            com.fyber.inneractive.sdk.config.remote.b r13 = r6.f10698e
            com.fyber.inneractive.sdk.config.r r0 = new com.fyber.inneractive.sdk.config.r
            r0.<init>()
            r19 = r2
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = r12.f10701a
            r20 = r10
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER
            if (r2 == r10) goto L_0x00c5
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT
            if (r2 == r10) goto L_0x00c5
            boolean r2 = r2.isFullscreenUnit()
            if (r2 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r0 = r24
            r2 = r19
            r10 = r20
            goto L_0x009a
        L_0x00c5:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = r12.f10701a
            r0.f10691b = r2
            r2 = 3
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Integer r2 = r12.f10703c
            r18 = 0
            r10[r18] = r2
            if (r15 == 0) goto L_0x00d7
            java.lang.Integer r2 = r15.f10703c
            goto L_0x00d8
        L_0x00d7:
            r2 = 0
        L_0x00d8:
            r17 = 1
            r10[r17] = r2
            if (r13 == 0) goto L_0x00e1
            java.lang.Integer r2 = r13.f10703c
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            r16 = 2
            r10[r16] = r2
            r2 = 0
            java.lang.Object r10 = m13445a((java.lang.Object) r2, (java.lang.Object[]) r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r2 = 5
            r22 = r1
            if (r10 == 0) goto L_0x0102
            int r1 = r10.intValue()
            if (r1 < r2) goto L_0x0102
            int r1 = r10.intValue()
            r2 = 60
            if (r1 > r2) goto L_0x0102
            r0.f10690a = r10
        L_0x0102:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2 = 3
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Boolean r2 = r12.f10702b
            r18 = 0
            r10[r18] = r2
            if (r15 == 0) goto L_0x0112
            java.lang.Boolean r2 = r15.f10702b
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            r17 = 1
            r10[r17] = r2
            if (r13 == 0) goto L_0x011c
            java.lang.Boolean r2 = r13.f10702b
            goto L_0x011d
        L_0x011c:
            r2 = 0
        L_0x011d:
            r16 = 2
            r10[r16] = r2
            java.lang.Object r2 = m13445a((java.lang.Object) r1, (java.lang.Object[]) r10)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.f10692c = r2
            r2 = 3
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Integer r2 = r12.f10704d
            r18 = 0
            r10[r18] = r2
            if (r15 == 0) goto L_0x013f
            java.lang.Integer r2 = r15.f10704d
            goto L_0x0140
        L_0x013f:
            r2 = 0
        L_0x0140:
            r15 = 1
            r10[r15] = r2
            if (r13 == 0) goto L_0x0148
            java.lang.Integer r2 = r13.f10704d
            goto L_0x0149
        L_0x0148:
            r2 = 0
        L_0x0149:
            r13 = 2
            r10[r13] = r2
            r2 = 0
            java.lang.Object r10 = m13445a((java.lang.Object) r2, (java.lang.Object[]) r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x0166
            int r2 = r10.intValue()
            r13 = 5
            if (r2 < r13) goto L_0x0166
            int r2 = r10.intValue()
            r13 = 60
            if (r2 > r13) goto L_0x0166
            r0.f10693d = r10
        L_0x0166:
            java.lang.Integer r2 = r0.f10693d
            if (r2 != 0) goto L_0x017e
            java.lang.Boolean r2 = r0.f10692c
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x017e
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = r12.f10701a
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r2 == r10) goto L_0x017c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r2 != r10) goto L_0x017e
        L_0x017c:
            r0.f10692c = r1
        L_0x017e:
            r14.f10747c = r0
            goto L_0x0187
        L_0x0181:
            r22 = r1
            r19 = r2
            r20 = r10
        L_0x0187:
            com.fyber.inneractive.sdk.config.remote.j r0 = r11.f10723f
            if (r0 == 0) goto L_0x039b
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.f10734j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r1) goto L_0x01b1
            com.fyber.inneractive.sdk.config.remote.b r0 = r11.f10720c
            if (r0 != 0) goto L_0x01b1
            com.fyber.inneractive.sdk.config.r r0 = new com.fyber.inneractive.sdk.config.r
            r0.<init>()
            r14.f10747c = r0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f10692c = r2
            r2 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r0.f10693d = r10
            com.fyber.inneractive.sdk.config.r r0 = r14.f10747c
            r0.f10691b = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.f10690a = r2
        L_0x01b1:
            com.fyber.inneractive.sdk.config.a0 r0 = new com.fyber.inneractive.sdk.config.a0
            r0.<init>()
            com.fyber.inneractive.sdk.config.remote.j r2 = r11.f10723f
            com.fyber.inneractive.sdk.config.remote.j r10 = r3.f10715e
            com.fyber.inneractive.sdk.config.remote.j r12 = r6.f10697d
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r13 = r2.f10734j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.LANDSCAPE
            if (r13 == r15) goto L_0x01de
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.SQUARE
            if (r13 == r15) goto L_0x01de
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r13 == r15) goto L_0x01de
            r21 = r4
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r4 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.VERTICAL
            if (r13 == r4) goto L_0x01e0
            if (r13 == r1) goto L_0x01e0
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT
            if (r13 != r1) goto L_0x01d7
            goto L_0x01e0
        L_0x01d7:
            com.fyber.inneractive.sdk.config.w r1 = r14.f10749e
            if (r1 == 0) goto L_0x038f
            r0.f10579j = r15
            goto L_0x01e2
        L_0x01de:
            r21 = r4
        L_0x01e0:
            r0.f10579j = r13
        L_0x01e2:
            r1 = 3
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Boolean r1 = r2.f10725a
            r13 = 0
            r4[r13] = r1
            if (r10 == 0) goto L_0x01ef
            java.lang.Boolean r1 = r10.f10725a
            goto L_0x01f0
        L_0x01ef:
            r1 = 0
        L_0x01f0:
            r13 = 1
            r4[r13] = r1
            if (r12 == 0) goto L_0x01f8
            java.lang.Boolean r1 = r12.f10725a
            goto L_0x01f9
        L_0x01f8:
            r1 = 0
        L_0x01f9:
            r13 = 2
            r4[r13] = r1
            r1 = 0
            java.lang.Object r4 = m13445a((java.lang.Object) r1, (java.lang.Object[]) r4)
            if (r4 == 0) goto L_0x038f
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r0.f10570a = r4
            r4 = 5000(0x1388, float:7.006E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 3
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.Integer r13 = r2.f10726b
            r18 = 0
            r15[r18] = r13
            if (r10 == 0) goto L_0x021b
            java.lang.Integer r13 = r10.f10726b
            goto L_0x021c
        L_0x021b:
            r13 = r1
        L_0x021c:
            r17 = 1
            r15[r17] = r13
            if (r12 == 0) goto L_0x0225
            java.lang.Integer r13 = r12.f10726b
            goto L_0x0226
        L_0x0225:
            r13 = r1
        L_0x0226:
            r16 = 2
            r15[r16] = r13
            java.lang.Object r4 = m13445a((java.lang.Object) r4, (java.lang.Object[]) r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0.f10571b = r4
            r4 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            r15 = 3
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.Integer r15 = r2.f10727c
            r1[r4] = r15
            if (r10 == 0) goto L_0x0243
            java.lang.Integer r4 = r10.f10727c
            goto L_0x0244
        L_0x0243:
            r4 = 0
        L_0x0244:
            r15 = 1
            r1[r15] = r4
            if (r12 == 0) goto L_0x024c
            java.lang.Integer r4 = r12.f10727c
            goto L_0x024d
        L_0x024c:
            r4 = 0
        L_0x024d:
            r15 = 2
            r1[r15] = r4
            java.lang.Object r1 = m13445a((java.lang.Object) r13, (java.lang.Object[]) r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            if (r4 >= 0) goto L_0x025e
            r1 = 0
            goto L_0x0262
        L_0x025e:
            int r1 = r1.intValue()
        L_0x0262:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f10572c = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4 = 3
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.Boolean r4 = r2.f10729e
            r15 = 0
            r13[r15] = r4
            if (r10 == 0) goto L_0x0277
            java.lang.Boolean r4 = r10.f10729e
            goto L_0x0278
        L_0x0277:
            r4 = 0
        L_0x0278:
            r15 = 1
            r13[r15] = r4
            if (r12 == 0) goto L_0x0280
            java.lang.Boolean r4 = r12.f10729e
            goto L_0x0281
        L_0x0280:
            r4 = 0
        L_0x0281:
            r15 = 2
            r13[r15] = r4
            java.lang.Object r1 = m13445a((java.lang.Object) r1, (java.lang.Object[]) r13)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0.f10573d = r1
            com.fyber.inneractive.sdk.config.enums.Orientation r1 = com.fyber.inneractive.sdk.config.enums.Orientation.USER
            r4 = 3
            java.lang.Object[] r13 = new java.lang.Object[r4]
            com.fyber.inneractive.sdk.config.enums.Orientation r4 = r2.f10731g
            r15 = 0
            r13[r15] = r4
            if (r10 == 0) goto L_0x029b
            com.fyber.inneractive.sdk.config.enums.Orientation r4 = r10.f10731g
            goto L_0x029c
        L_0x029b:
            r4 = 0
        L_0x029c:
            r15 = 1
            r13[r15] = r4
            if (r12 == 0) goto L_0x02a4
            com.fyber.inneractive.sdk.config.enums.Orientation r4 = r12.f10731g
            goto L_0x02a5
        L_0x02a4:
            r4 = 0
        L_0x02a5:
            r15 = 2
            r13[r15] = r4
            java.lang.Object r1 = m13445a((java.lang.Object) r1, (java.lang.Object[]) r13)
            com.fyber.inneractive.sdk.config.enums.Orientation r1 = (com.fyber.inneractive.sdk.config.enums.Orientation) r1
            r0.f10574e = r1
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r13 = 3
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.Integer r13 = r2.f10733i
            r15[r1] = r13
            if (r10 == 0) goto L_0x02c1
            java.lang.Integer r1 = r10.f10733i
            goto L_0x02c2
        L_0x02c1:
            r1 = 0
        L_0x02c2:
            r13 = 1
            r15[r13] = r1
            if (r12 == 0) goto L_0x02ca
            java.lang.Integer r1 = r12.f10733i
            goto L_0x02cb
        L_0x02ca:
            r1 = 0
        L_0x02cb:
            r13 = 2
            r15[r13] = r1
            java.lang.Object r1 = m13445a((java.lang.Object) r4, (java.lang.Object[]) r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            if (r4 >= 0) goto L_0x02dc
            r1 = 0
            goto L_0x02e0
        L_0x02dc:
            int r1 = r1.intValue()
        L_0x02e0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f10575f = r1
            r1 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 3
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.Integer r4 = r2.f10732h
            r15 = 0
            r13[r15] = r4
            if (r10 == 0) goto L_0x02f9
            java.lang.Integer r4 = r10.f10732h
            goto L_0x02fa
        L_0x02f9:
            r4 = 0
        L_0x02fa:
            r15 = 1
            r13[r15] = r4
            if (r12 == 0) goto L_0x0302
            java.lang.Integer r4 = r12.f10732h
            goto L_0x0303
        L_0x0302:
            r4 = 0
        L_0x0303:
            r15 = 2
            r13[r15] = r4
            java.lang.Object r1 = m13445a((java.lang.Object) r1, (java.lang.Object[]) r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            java.lang.Integer r13 = r0.f10571b
            int r13 = r13.intValue()
            if (r4 <= r13) goto L_0x031a
            java.lang.Integer r1 = r0.f10571b
        L_0x031a:
            r0.f10576g = r1
            com.fyber.inneractive.sdk.config.enums.Skip r1 = com.fyber.inneractive.sdk.config.enums.Skip._0
            r4 = 3
            java.lang.Object[] r13 = new java.lang.Object[r4]
            com.fyber.inneractive.sdk.config.enums.Skip r4 = r2.f10728d
            r15 = 0
            r13[r15] = r4
            if (r10 == 0) goto L_0x032b
            com.fyber.inneractive.sdk.config.enums.Skip r4 = r10.f10728d
            goto L_0x032c
        L_0x032b:
            r4 = 0
        L_0x032c:
            r15 = 1
            r13[r15] = r4
            if (r12 == 0) goto L_0x0334
            com.fyber.inneractive.sdk.config.enums.Skip r4 = r12.f10728d
            goto L_0x0335
        L_0x0334:
            r4 = 0
        L_0x0335:
            r15 = 2
            r13[r15] = r4
            java.lang.Object r1 = m13445a((java.lang.Object) r1, (java.lang.Object[]) r13)
            com.fyber.inneractive.sdk.config.enums.Skip r1 = (com.fyber.inneractive.sdk.config.enums.Skip) r1
            r0.f10577h = r1
            com.fyber.inneractive.sdk.config.enums.TapAction r1 = com.fyber.inneractive.sdk.config.enums.TapAction.DO_NOTHING
            r4 = 3
            java.lang.Object[] r13 = new java.lang.Object[r4]
            com.fyber.inneractive.sdk.config.enums.TapAction r2 = r2.f10730f
            r4 = 0
            r13[r4] = r2
            if (r10 == 0) goto L_0x034f
            com.fyber.inneractive.sdk.config.enums.TapAction r2 = r10.f10730f
            goto L_0x0350
        L_0x034f:
            r2 = 0
        L_0x0350:
            r4 = 1
            r13[r4] = r2
            if (r12 == 0) goto L_0x0358
            com.fyber.inneractive.sdk.config.enums.TapAction r2 = r12.f10730f
            goto L_0x0359
        L_0x0358:
            r2 = 0
        L_0x0359:
            r10 = 2
            r13[r10] = r2
            java.lang.Object r1 = m13445a((java.lang.Object) r1, (java.lang.Object[]) r13)
            com.fyber.inneractive.sdk.config.enums.TapAction r1 = (com.fyber.inneractive.sdk.config.enums.TapAction) r1
            r0.f10578i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.fyber.inneractive.sdk.config.remote.d[] r2 = new com.fyber.inneractive.sdk.config.remote.C4331d[r4]
            r10 = 0
            r2[r10] = r11
            r10 = 0
        L_0x036f:
            if (r10 >= r4) goto L_0x038a
            r4 = r2[r10]
            com.fyber.inneractive.sdk.config.remote.j r4 = r4.mo24357a()
            if (r4 == 0) goto L_0x0386
            java.util.List<java.lang.Integer> r12 = r4.f10735k
            if (r12 == 0) goto L_0x0386
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x0386
            java.util.List<java.lang.Integer> r1 = r4.f10735k
            goto L_0x038a
        L_0x0386:
            int r10 = r10 + 1
            r4 = 1
            goto L_0x036f
        L_0x038a:
            r0.f10580k = r1
            r14.f10750f = r0
            goto L_0x039d
        L_0x038f:
            r0 = r24
            r2 = r19
            r10 = r20
            r4 = r21
            r1 = r22
            goto L_0x009a
        L_0x039b:
            r21 = r4
        L_0x039d:
            com.fyber.inneractive.sdk.config.v r0 = new com.fyber.inneractive.sdk.config.v
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 3
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.config.remote.f r2 = r11.f10721d
            if (r2 == 0) goto L_0x03b1
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Track> r2 = r2.f10709a
            goto L_0x03b2
        L_0x03b1:
            r2 = 0
        L_0x03b2:
            r10 = 0
            r4[r10] = r2
            com.fyber.inneractive.sdk.config.remote.f r2 = r3.f10714d
            if (r2 == 0) goto L_0x03bc
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Track> r2 = r2.f10709a
            goto L_0x03bd
        L_0x03bc:
            r2 = 0
        L_0x03bd:
            r10 = 1
            r4[r10] = r2
            com.fyber.inneractive.sdk.config.remote.f r2 = r6.f10696c
            if (r2 == 0) goto L_0x03c7
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Track> r2 = r2.f10709a
            goto L_0x03c8
        L_0x03c7:
            r2 = 0
        L_0x03c8:
            r10 = 2
            r4[r10] = r2
            java.lang.Object r1 = m13445a((java.lang.Object) r1, (java.lang.Object[]) r4)
            java.util.Set r1 = (java.util.Set) r1
            r0.f10741a = r1
            r14.f10748d = r0
            com.fyber.inneractive.sdk.config.c0 r0 = new com.fyber.inneractive.sdk.config.c0
            r0.<init>()
            com.fyber.inneractive.sdk.config.remote.k r1 = r11.f10724g
            com.fyber.inneractive.sdk.config.remote.k r2 = r3.f10716f
            com.fyber.inneractive.sdk.config.remote.k r4 = r6.f10699f
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12 = 3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            if (r1 == 0) goto L_0x03ed
            java.lang.Integer r12 = r1.f10736a
            goto L_0x03ee
        L_0x03ed:
            r12 = 0
        L_0x03ee:
            r15 = 0
            r13[r15] = r12
            if (r2 == 0) goto L_0x03f6
            java.lang.Integer r12 = r2.f10736a
            goto L_0x03f7
        L_0x03f6:
            r12 = 0
        L_0x03f7:
            r13[r10] = r12
            if (r4 == 0) goto L_0x03fe
            java.lang.Integer r10 = r4.f10736a
            goto L_0x03ff
        L_0x03fe:
            r10 = 0
        L_0x03ff:
            r12 = 2
            r13[r12] = r10
            java.lang.Object r10 = m13445a((java.lang.Object) r11, (java.lang.Object[]) r13)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r11 = r10.intValue()
            r12 = 100
            if (r11 > 0) goto L_0x041f
            int r11 = r10.intValue()
            if (r11 > r12) goto L_0x0417
            goto L_0x041f
        L_0x0417:
            r11 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r0.f10591a = r10
            goto L_0x0421
        L_0x041f:
            r0.f10591a = r10
        L_0x0421:
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r13 = 3
            java.lang.Object[] r15 = new java.lang.Object[r13]
            if (r1 == 0) goto L_0x042e
            java.lang.Integer r13 = r1.f10737b
            goto L_0x042f
        L_0x042e:
            r13 = 0
        L_0x042f:
            r15[r10] = r13
            if (r2 == 0) goto L_0x0436
            java.lang.Integer r10 = r2.f10737b
            goto L_0x0437
        L_0x0436:
            r10 = 0
        L_0x0437:
            r13 = 1
            r15[r13] = r10
            if (r4 == 0) goto L_0x043f
            java.lang.Integer r10 = r4.f10737b
            goto L_0x0440
        L_0x043f:
            r10 = 0
        L_0x0440:
            r13 = 2
            r15[r13] = r10
            java.lang.Object r10 = m13445a((java.lang.Object) r11, (java.lang.Object[]) r15)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r11 = r10.intValue()
            if (r11 >= 0) goto L_0x045e
            int r11 = r10.intValue()
            if (r11 > r12) goto L_0x0456
            goto L_0x045e
        L_0x0456:
            r11 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r0.f10592b = r10
            goto L_0x0460
        L_0x045e:
            r0.f10592b = r10
        L_0x0460:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            if (r1 == 0) goto L_0x046d
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Vendor> r1 = r1.f10738c
            goto L_0x046e
        L_0x046d:
            r1 = 0
        L_0x046e:
            r12 = 0
            r11[r12] = r1
            if (r2 == 0) goto L_0x0477
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Vendor> r2 = r2.f10738c
            r1 = 1
            goto L_0x0479
        L_0x0477:
            r1 = 1
            r2 = 0
        L_0x0479:
            r11[r1] = r2
            if (r4 == 0) goto L_0x0481
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Vendor> r15 = r4.f10738c
            r2 = 2
            goto L_0x0483
        L_0x0481:
            r2 = 2
            r15 = 0
        L_0x0483:
            r11[r2] = r15
            java.lang.Object r4 = m13445a((java.lang.Object) r10, (java.lang.Object[]) r11)
            java.util.Set r4 = (java.util.Set) r4
            r0.f10593c = r4
            r14.f10751g = r0
            if (r8 == 0) goto L_0x04b3
            if (r4 == 0) goto L_0x04b3
            java.util.Iterator r0 = r4.iterator()
        L_0x0497:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x04b3
            java.lang.Object r4 = r0.next()
            com.fyber.inneractive.sdk.config.enums.Vendor r4 = (com.fyber.inneractive.sdk.config.enums.Vendor) r4
            if (r4 == 0) goto L_0x0497
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Vendor> r10 = r8.f10569a
            boolean r10 = r10.contains(r4)
            if (r10 != 0) goto L_0x0497
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Vendor> r10 = r8.f10569a
            r10.add(r4)
            goto L_0x0497
        L_0x04b3:
            java.util.List<com.fyber.inneractive.sdk.config.y> r0 = r9.f10743a
            r0.add(r14)
            java.lang.String r0 = r14.f10745a
            r7.put(r0, r14)
            r0 = r24
            r13 = r1
            r2 = r19
            r10 = r20
            r4 = r21
            r1 = r22
            goto L_0x0067
        L_0x04ca:
            r22 = r1
            r19 = r2
            r0 = r24
            goto L_0x0067
        L_0x04d2:
            r22 = r1
            r19 = r2
            r0 = r4
            r0.put(r5, r9)
            r0 = r24
            goto L_0x001f
        L_0x04de:
            r22 = r1
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.C4268c.mo24275a(com.fyber.inneractive.sdk.config.remote.e):com.fyber.inneractive.sdk.config.IAConfigManager$a");
    }

    /* renamed from: a */
    public static Object m13445a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public Object mo24240a(String str) throws Exception {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.f10525J;
            iAConfigManager.f10530D.mo24282b();
            C4332e a = C4332e.m13558a(new JSONObject(str));
            String str2 = iAConfigManager.f10538c;
            if (a == null || !str2.equals(a.f10705a.f10694a)) {
                IAlog.m16700b("internal error while parsing local configuration", new Object[0]);
                if (a != null) {
                    if (!str2.equals(a.f10705a.f10694a)) {
                        throw new InvalidAppIdException();
                    }
                }
                mo24276a((Throwable) null, str);
                return null;
            }
            a.f10708d = str;
            return mo24275a(a);
        } catch (Throwable th) {
            mo24276a(th, str);
            IAlog.m16700b("Exception Error while parsing local configuration", new Object[0]);
            throw th;
        }
    }
}
