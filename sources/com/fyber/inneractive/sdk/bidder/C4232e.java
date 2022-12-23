package com.fyber.inneractive.sdk.bidder;

import android.content.BroadcastReceiver;

/* renamed from: com.fyber.inneractive.sdk.bidder.e */
public class C4232e extends BroadcastReceiver {

    /* renamed from: a */
    public final C4231d f10477a;

    public C4232e(C4231d dVar) {
        this.f10477a = dVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x015f
            java.lang.String r7 = r8.getAction()
            if (r7 == 0) goto L_0x015f
            java.lang.String r7 = r8.getAction()
            r7.getClass()
            int r0 = r7.hashCode()
            r1 = 4
            r2 = -1
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case -1538406691: goto L_0x005e;
                case -1530327060: goto L_0x0053;
                case -1076576821: goto L_0x0048;
                case 1123270207: goto L_0x003d;
                case 1779291251: goto L_0x0032;
                case 2070024785: goto L_0x0027;
                case 2106958107: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0069
        L_0x001c:
            java.lang.String r0 = "android.app.action.INTERRUPTION_FILTER_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0025
            goto L_0x0069
        L_0x0025:
            r7 = 6
            goto L_0x006a
        L_0x0027:
            java.lang.String r0 = "android.media.RINGER_MODE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0030
            goto L_0x0069
        L_0x0030:
            r7 = 5
            goto L_0x006a
        L_0x0032:
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003b
            goto L_0x0069
        L_0x003b:
            r7 = r1
            goto L_0x006a
        L_0x003d:
            java.lang.String r0 = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0046
            goto L_0x0069
        L_0x0046:
            r7 = 3
            goto L_0x006a
        L_0x0048:
            java.lang.String r0 = "android.intent.action.AIRPLANE_MODE"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0051
            goto L_0x0069
        L_0x0051:
            r7 = r3
            goto L_0x006a
        L_0x0053:
            java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005c
            goto L_0x0069
        L_0x005c:
            r7 = r5
            goto L_0x006a
        L_0x005e:
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r7 = r4
            goto L_0x006a
        L_0x0069:
            r7 = r2
        L_0x006a:
            switch(r7) {
                case 0: goto L_0x0115;
                case 1: goto L_0x00f4;
                case 2: goto L_0x00de;
                case 3: goto L_0x00f4;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00a2;
                case 6: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x015f
        L_0x006f:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f10477a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C4209a) r7
            r7.getClass()
            android.app.Application r8 = com.fyber.inneractive.sdk.util.C5350l.f14216a
            java.lang.String r0 = "notification"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            int r8 = r8.getCurrentInterruptionFilter()
            if (r8 < r3) goto L_0x0089
            if (r8 > r1) goto L_0x0089
            r4 = r5
        L_0x0089:
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f10392c
            java.lang.Boolean r8 = r8.f10474y
            if (r8 == 0) goto L_0x0095
            boolean r8 = r8.booleanValue()
            if (r8 == r4) goto L_0x015f
        L_0x0095:
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f10392c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r8.f10474y = r0
            r7.mo24091b()
            goto L_0x015f
        L_0x00a2:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f10477a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C4209a) r7
            r7.getClass()
            java.lang.String r0 = "android.media.EXTRA_RINGER_MODE"
            int r8 = r8.getIntExtra(r0, r2)
            if (r8 == 0) goto L_0x00b3
            if (r8 != r5) goto L_0x00b4
        L_0x00b3:
            r4 = r5
        L_0x00b4:
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f10392c
            java.lang.Boolean r8 = r8.f10475z
            if (r8 == 0) goto L_0x00c0
            boolean r8 = r8.booleanValue()
            if (r8 == r4) goto L_0x015f
        L_0x00c0:
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f10392c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r8.f10475z = r0
            r7.mo24091b()
            goto L_0x015f
        L_0x00cd:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f10477a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C4209a) r7
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f10392c
            java.lang.Boolean r0 = com.fyber.inneractive.sdk.serverapi.C5298a.m16665n()
            r8.f10471v = r0
            r7.mo24091b()
            goto L_0x015f
        L_0x00de:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f10477a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C4209a) r7
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f10392c
            java.lang.String r1 = "state"
            boolean r8 = r8.getBooleanExtra(r1, r4)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0.f10473x = r8
            r7.mo24091b()
            goto L_0x015f
        L_0x00f4:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f10477a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C4209a) r7
            r7.getClass()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r1 = "android.bluetooth.adapter.extra.CONNECTION_STATE"
            int r8 = r8.getIntExtra(r1, r0)
            if (r8 != r3) goto L_0x0108
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            goto L_0x0109
        L_0x0108:
            r8 = 0
        L_0x0109:
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f10392c
            java.lang.Boolean r1 = r0.f10470u
            if (r1 == r8) goto L_0x015f
            r0.f10470u = r8
            r7.mo24091b()
            goto L_0x015f
        L_0x0115:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f10477a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C4209a) r7
            com.fyber.inneractive.sdk.serverapi.b r0 = r7.f10391b
            r0.getClass()
            java.lang.String r0 = "plugged"
            int r0 = r8.getIntExtra(r0, r2)
            if (r0 == r5) goto L_0x012a
            if (r0 == r3) goto L_0x012a
            if (r0 != r1) goto L_0x012b
        L_0x012a:
            r4 = r5
        L_0x012b:
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f10392c
            java.lang.Boolean r0 = r0.f10442E
            if (r0 == 0) goto L_0x0137
            boolean r0 = r0.booleanValue()
            if (r0 == r4) goto L_0x0142
        L_0x0137:
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f10392c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.f10442E = r1
            r7.mo24091b()
        L_0x0142:
            com.fyber.inneractive.sdk.serverapi.b r0 = r7.f10391b
            java.lang.String r0 = r0.mo26397a((android.content.Intent) r8)
            com.fyber.inneractive.sdk.bidder.c r1 = r7.f10392c
            java.lang.String r1 = r1.f10443F
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x015f
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f10392c
            com.fyber.inneractive.sdk.serverapi.b r1 = r7.f10391b
            java.lang.String r8 = r1.mo26397a((android.content.Intent) r8)
            r0.f10443F = r8
            r7.mo24091b()
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.C4232e.onReceive(android.content.Context, android.content.Intent):void");
    }
}
