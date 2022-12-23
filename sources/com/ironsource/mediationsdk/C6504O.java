package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.environment.C6433j;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.C6490J;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C6772i;
import com.ironsource.mediationsdk.utils.C6777l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p200d.C6393b;
import com.ironsource.sdk.p292f.C8336a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.mediationsdk.O */
final class C6504O implements C6433j {

    /* renamed from: u */
    private static C6504O f16633u;

    /* renamed from: A */
    private NetworkStateReceiver f16634A;

    /* renamed from: B */
    private C6509a f16635B = C6509a.NOT_INIT;

    /* renamed from: C */
    private C6511c f16636C = new C6511c() {
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02e1 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0115 A[Catch:{ Exception -> 0x0390 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ironsource.mediationsdk.J r0 = com.ironsource.mediationsdk.C6490J.m19474a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.aj r1 = com.ironsource.mediationsdk.C6639aj.m20232a()     // Catch:{ Exception -> 0x0390 }
                java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0016 }
                com.ironsource.mediationsdk.aj$1 r3 = new com.ironsource.mediationsdk.aj$1     // Catch:{ Exception -> 0x0016 }
                r3.<init>()     // Catch:{ Exception -> 0x0016 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0016 }
                r2.start()     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x0390 }
            L_0x001a:
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f16648l     // Catch:{ Exception -> 0x0390 }
                com.ironsource.d.a r2 = new com.ironsource.d.a     // Catch:{ Exception -> 0x0390 }
                r2.<init>()     // Catch:{ Exception -> 0x0390 }
                r3 = 0
                r4 = 0
                java.lang.String r5 = "userId"
                r6 = 1
                if (r1 == 0) goto L_0x0047
                if (r1 == 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x0390 }
                if (r7 <= 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x0390 }
                r8 = 64
                if (r7 > r8) goto L_0x003c
                r7 = r6
                goto L_0x003d
            L_0x003c:
                r7 = r4
            L_0x003d:
                if (r7 != 0) goto L_0x004e
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r3)     // Catch:{ Exception -> 0x0390 }
            L_0x0043:
                r2.mo35874a((com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ Exception -> 0x0390 }
                goto L_0x004e
            L_0x0047:
                java.lang.String r7 = "it's missing"
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r7)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0043
            L_0x004e:
                boolean r1 = r2.mo35875a()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x005b
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "userGenerated"
                r1.f16651o = r2     // Catch:{ Exception -> 0x0390 }
                goto L_0x00a8
            L_0x005b:
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = com.ironsource.mediationsdk.C6490J.m19476a((android.content.Context) r2)     // Catch:{ Exception -> 0x0390 }
                r1.f16648l = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f16648l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x007c
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "GAID"
            L_0x0079:
                r1.f16651o = r2     // Catch:{ Exception -> 0x0390 }
                goto L_0x00a1
            L_0x007c:
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = com.ironsource.environment.C6429h.m19349x(r2)     // Catch:{ Exception -> 0x0390 }
                r1.f16648l = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f16648l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x009b
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "UUID"
                goto L_0x0079
            L_0x009b:
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = ""
                r1.f16648l = r2     // Catch:{ Exception -> 0x0390 }
            L_0x00a1:
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f16648l     // Catch:{ Exception -> 0x0390 }
                r0.mo36141a((java.lang.String) r1, (boolean) r4)     // Catch:{ Exception -> 0x0390 }
            L_0x00a8:
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C6723e.m20496a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "userIdType"
                com.ironsource.mediationsdk.O r4 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.f16651o     // Catch:{ Exception -> 0x0390 }
                r1.mo36910a(r2, r4)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f16648l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x00ca
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C6723e.m20496a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r2 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r2.f16648l     // Catch:{ Exception -> 0x0390 }
                r1.mo36910a(r5, r2)     // Catch:{ Exception -> 0x0390 }
            L_0x00ca:
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f16649m     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x00e1
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C6723e.m20496a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "appKey"
                com.ironsource.mediationsdk.O r4 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.f16649m     // Catch:{ Exception -> 0x0390 }
                r1.mo36910a(r2, r4)     // Catch:{ Exception -> 0x0390 }
            L_0x00e1:
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.d.b r1 = r1.f16655s     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r2 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r2.f16648l     // Catch:{ Exception -> 0x0390 }
                r1.mo35890e(r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0390 }
                r2.<init>()     // Catch:{ Exception -> 0x0390 }
                long r4 = r2.getTime()     // Catch:{ Exception -> 0x0390 }
                r1.f16654r = r4     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r4 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.f16648l     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.J$a r5 = r11.f16678c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r2 = r0.mo36132a((android.content.Context) r2, (java.lang.String) r4, (com.ironsource.mediationsdk.C6490J.C6492a) r5)     // Catch:{ Exception -> 0x0390 }
                r1.f16650n = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f16650n     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x02e1
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                android.os.Handler r1 = r1.f16645i     // Catch:{ Exception -> 0x0390 }
                r1.removeCallbacks(r11)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f16650n     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r1.mo36981b()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x02b6
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O$a r2 = com.ironsource.mediationsdk.C6504O.C6509a.INITIATED     // Catch:{ Exception -> 0x0390 }
                r1.mo36229a((com.ironsource.mediationsdk.C6504O.C6509a) r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r2 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r2 = r2.f16650n     // Catch:{ Exception -> 0x0390 }
                r1.mo36231a((com.ironsource.mediationsdk.utils.C6777l) r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                boolean r2 = r0.mo36173o()     // Catch:{ Exception -> 0x0390 }
                r1.mo36233b(r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.g r1 = com.ironsource.environment.C6428g.f16337a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f16650n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r1 = r1.f17849c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r1 = r1.f17500e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.b r1 = r1.mo56835f()     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r1.f17668c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.C6428g.m19291a(r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r4 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r4 = r4.f16650n     // Catch:{ Exception -> 0x0390 }
                r1.mo36227a(r2, r4)     // Catch:{ Exception -> 0x0390 }
                java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                long r1 = r1.getTime()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r4 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                long r4 = r4.f16654r     // Catch:{ Exception -> 0x0390 }
                long r1 = r1 - r4
                boolean r4 = r0.mo36173o()     // Catch:{ Exception -> 0x0390 }
                org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x0390 }
                java.lang.String r5 = "duration"
                r4.put(r5, r1)     // Catch:{ Exception -> 0x0186 }
                java.lang.String r1 = "sessionDepth"
                int r0 = r0.f16554t     // Catch:{ Exception -> 0x0186 }
                r4.put(r1, r0)     // Catch:{ Exception -> 0x0186 }
                goto L_0x018a
            L_0x0186:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x0390 }
            L_0x018a:
                com.ironsource.mediationsdk.a.c r0 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0390 }
                r1 = 514(0x202, float:7.2E-43)
                r0.<init>(r1, r4)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.a.h r1 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ Exception -> 0x0390 }
                r1.mo36371b((com.ironsource.mediationsdk.p207a.C6552c) r0)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.ah r1 = new com.ironsource.mediationsdk.ah     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                r0.f16637a = r1     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.ah r0 = r0.f16637a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.ah$a r1 = new com.ironsource.mediationsdk.ah$a     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.lifecycle.a r2 = new com.ironsource.lifecycle.a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.lifecycle.g r1 = (com.ironsource.lifecycle.C6453g) r1     // Catch:{ Exception -> 0x0390 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0390 }
                r0.f17235a = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f16650n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f17849c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f17500e     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.mo56833d()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x01d6
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x01d6
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x01d6:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f16650n     // Catch:{ Exception -> 0x0390 }
                org.json.JSONObject r1 = r0.f17850d     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0230
                com.ironsource.mediationsdk.model.g r1 = r0.f17849c     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x01e3
                goto L_0x0230
            L_0x01e3:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0390 }
                r3.<init>()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r1 = r0.f17849c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.o r1 = r1.f17496a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0201
                com.ironsource.mediationsdk.model.m r1 = r0.f17772a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0201
                com.ironsource.mediationsdk.model.m r1 = r0.f17772a     // Catch:{ Exception -> 0x0390 }
                java.util.ArrayList<java.lang.String> r1 = r1.f17534a     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0390 }
                if (r1 <= 0) goto L_0x0201
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x0201:
                com.ironsource.mediationsdk.model.g r1 = r0.f17849c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.h r1 = r1.f17497b     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x021a
                com.ironsource.mediationsdk.model.m r1 = r0.f17772a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x021a
                com.ironsource.mediationsdk.model.m r1 = r0.f17772a     // Catch:{ Exception -> 0x0390 }
                java.util.ArrayList<java.lang.String> r1 = r1.f17537d     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0390 }
                if (r1 <= 0) goto L_0x021a
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x021a:
                com.ironsource.mediationsdk.model.g r1 = r0.f17849c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.i r1 = r1.f17498c     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0225
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x0225:
                com.ironsource.mediationsdk.model.g r0 = r0.f17849c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.e r0 = r0.f17499d     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0230
                com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x0390 }
                r3.add(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x0230:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f16647k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x0238:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0252
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C6772i) r1     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r2 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                boolean r2 = r2.f16643g     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r4 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r4 = r4.f16650n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r4 = r4.f17849c     // Catch:{ Exception -> 0x0390 }
                r1.mo36047a(r3, r2, r4)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0238
            L_0x0252:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.sdk.SegmentListener r0 = r0.f16652p     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0277
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f16650n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f17849c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f17500e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.p r0 = r0.mo56831b()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0277
                java.lang.String r1 = r0.f17555a     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x0277
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.sdk.SegmentListener r1 = r1.f16652p     // Catch:{ Exception -> 0x0390 }
                java.lang.String r0 = r0.f17555a     // Catch:{ Exception -> 0x0390 }
                r1.onSegmentReceived(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x0277:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f16650n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f17849c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f17500e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.controller.u r0 = r0.mo56834e()     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r0.mo56602b()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0394
                java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.e r2 = com.ironsource.environment.C6416e.m19260a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r3 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.util.HashSet r4 = r0.mo56596a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r5 = r0.mo56603c()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r6 = r0.mo56606d()     // Catch:{ Exception -> 0x0390 }
                boolean r7 = r0.mo56607e()     // Catch:{ Exception -> 0x0390 }
                int r9 = r0.mo56608f()     // Catch:{ Exception -> 0x0390 }
                boolean r10 = r0.mo56609g()     // Catch:{ Exception -> 0x0390 }
                r2.mo35925a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0394
            L_0x02b6:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.f16644h     // Catch:{ Exception -> 0x0390 }
                if (r0 != 0) goto L_0x038f
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_FAILED     // Catch:{ Exception -> 0x0390 }
                r0.mo36229a((com.ironsource.mediationsdk.C6504O.C6509a) r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                r0.f16644h = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f16647k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x02cf:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0394
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C6772i) r1     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "serverResponseIsNotValid"
                r1.mo36045a(r2)     // Catch:{ Exception -> 0x0390 }
                goto L_0x02cf
            L_0x02e1:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f16639c     // Catch:{ Exception -> 0x0390 }
                r1 = 3
                if (r0 != r1) goto L_0x0304
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                r0.f16653q = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f16647k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x02f4:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0304
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C6772i) r1     // Catch:{ Exception -> 0x0390 }
                r1.mo36056f()     // Catch:{ Exception -> 0x0390 }
                goto L_0x02f4
            L_0x0304:
                boolean r0 = r11.f16676a     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0338
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f16639c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f16640d     // Catch:{ Exception -> 0x0390 }
                if (r0 >= r1) goto L_0x0338
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                r0.f16643g = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                android.os.Handler r0 = r0.f16645i     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f16638b     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 * 1000
                long r1 = (long) r1     // Catch:{ Exception -> 0x0390 }
                r0.postDelayed(r11, r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f16639c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f16641e     // Catch:{ Exception -> 0x0390 }
                if (r0 >= r1) goto L_0x0338
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f16638b     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 * 2
                r0.f16638b = r1     // Catch:{ Exception -> 0x0390 }
            L_0x0338:
                boolean r0 = r11.f16676a     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0346
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f16639c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O r1 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f16642f     // Catch:{ Exception -> 0x0390 }
                if (r0 != r1) goto L_0x0388
            L_0x0346:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.f16644h     // Catch:{ Exception -> 0x0390 }
                if (r0 != 0) goto L_0x0388
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                r0.f16644h = r6     // Catch:{ Exception -> 0x0390 }
                java.lang.String r0 = r11.f16677b     // Catch:{ Exception -> 0x0390 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x035c
                java.lang.String r0 = "noServerResponse"
                r11.f16677b = r0     // Catch:{ Exception -> 0x0390 }
            L_0x035c:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f16647k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x0364:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0376
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C6772i) r1     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r11.f16677b     // Catch:{ Exception -> 0x0390 }
                r1.mo36045a(r2)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0364
            L_0x0376:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_FAILED     // Catch:{ Exception -> 0x0390 }
                r0.mo36229a((com.ironsource.mediationsdk.C6504O.C6509a) r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "Mediation availability false reason: No server response"
                r0.log(r1, r2, r6)     // Catch:{ Exception -> 0x0390 }
            L_0x0388:
                com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r0.f16639c     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 + r6
                r0.f16639c = r1     // Catch:{ Exception -> 0x0390 }
            L_0x038f:
                return
            L_0x0390:
                r0 = move-exception
                r0.printStackTrace()
            L_0x0394:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6504O.C65051.run():void");
        }
    };

    /* renamed from: a */
    C6636ah f16637a;

    /* renamed from: b */
    int f16638b;

    /* renamed from: c */
    int f16639c;

    /* renamed from: d */
    int f16640d;

    /* renamed from: e */
    int f16641e;

    /* renamed from: f */
    int f16642f;

    /* renamed from: g */
    boolean f16643g;

    /* renamed from: h */
    boolean f16644h = false;

    /* renamed from: i */
    Handler f16645i;

    /* renamed from: j */
    CountDownTimer f16646j;

    /* renamed from: k */
    List<C6772i> f16647k = new ArrayList();

    /* renamed from: l */
    String f16648l;

    /* renamed from: m */
    String f16649m;

    /* renamed from: n */
    C6777l f16650n;

    /* renamed from: o */
    String f16651o;

    /* renamed from: p */
    SegmentListener f16652p;

    /* renamed from: q */
    boolean f16653q;

    /* renamed from: r */
    long f16654r;

    /* renamed from: s */
    C6393b f16655s;

    /* renamed from: t */
    private int f16656t = C6510b.f16675e;

    /* renamed from: v */
    private final String f16657v = "appKey";

    /* renamed from: w */
    private final String f16658w = getClass().getSimpleName();

    /* renamed from: x */
    private HandlerThread f16659x = null;

    /* renamed from: y */
    private boolean f16660y = false;

    /* renamed from: z */
    private AtomicBoolean f16661z;

    /* renamed from: com.ironsource.mediationsdk.O$3 */
    static /* synthetic */ class C65083 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16665a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.O$a[] r0 = com.ironsource.mediationsdk.C6504O.C6509a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16665a = r0
                com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16665a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C6504O.C6509a.NOT_INIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16665a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C6504O.C6509a.INITIATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6504O.C65083.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.O$a */
    enum C6509a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* renamed from: com.ironsource.mediationsdk.O$b */
    public static class C6510b {

        /* renamed from: a */
        public static int f16671a = 0;

        /* renamed from: b */
        public static int f16672b = 1;

        /* renamed from: c */
        public static int f16673c = 2;

        /* renamed from: d */
        public static int f16674d = 3;

        /* renamed from: e */
        public static int f16675e = 4;
    }

    /* renamed from: com.ironsource.mediationsdk.O$c */
    abstract class C6511c implements Runnable {

        /* renamed from: a */
        boolean f16676a = true;

        /* renamed from: b */
        String f16677b;

        /* renamed from: c */
        protected C6490J.C6492a f16678c = new C6490J.C6492a() {
            /* renamed from: a */
            public final void mo36174a(String str) {
                C6511c.this.f16676a = false;
                C6511c.this.f16677b = str;
            }
        };

        C6511c() {
        }
    }

    private C6504O() {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.f16659x = handlerThread;
        handlerThread.start();
        this.f16645i = new Handler(this.f16659x.getLooper());
        this.f16638b = 1;
        this.f16639c = 0;
        this.f16640d = 62;
        this.f16641e = 12;
        this.f16642f = 5;
        this.f16661z = new AtomicBoolean(true);
        this.f16643g = false;
        this.f16653q = false;
        this.f16655s = new C6393b();
    }

    /* renamed from: a */
    public static synchronized C6504O m19641a() {
        C6504O o;
        synchronized (C6504O.class) {
            if (f16633u == null) {
                f16633u = new C6504O();
            }
            o = f16633u;
        }
        return o;
    }

    /* renamed from: a */
    public final void mo36227a(Context context, C6777l lVar) {
        this.f16655s.mo35890e(lVar.mo36979a().f16429b);
        this.f16655s.mo35882a(lVar.mo36979a().f16428a);
        C8336a aVar = lVar.f17849c.f17500e;
        this.f16655s.mo35891f(aVar.mo56838i().f17483a);
        this.f16655s.mo35886b(aVar.mo56832c().f17890c);
        this.f16655s.mo35881a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
    }

    /* renamed from: a */
    public final synchronized void mo36228a(Context context, String str, String str2) {
        try {
            if (this.f16661z == null || !this.f16661z.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.f16658w + ": Multiple calls to init are not allowed", 2);
                return;
            }
            mo36229a(C6509a.INIT_IN_PROGRESS);
            this.f16648l = str2;
            this.f16649m = str;
            if (IronSourceUtils.isNetworkConnected(context)) {
                this.f16645i.post(this.f16636C);
            } else {
                this.f16660y = true;
                if (this.f16634A == null) {
                    this.f16634A = new NetworkStateReceiver(context, this);
                }
                context.registerReceiver(this.f16634A, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                C6423c.f16330a.mo35934c(new Runnable() {
                    public final void run() {
                        C6504O.this.f16646j = new CountDownTimer(60000, 15000) {
                            public final void onFinish() {
                                if (!C6504O.this.f16644h) {
                                    C6504O.this.f16644h = true;
                                    for (C6772i a : C6504O.this.f16647k) {
                                        a.mo36045a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                                    }
                                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                                }
                            }

                            public final void onTick(long j) {
                                if (j <= 45000) {
                                    C6504O.this.f16653q = true;
                                    for (C6772i f : C6504O.this.f16647k) {
                                        f.mo36056f();
                                    }
                                }
                            }
                        }.start();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo36229a(C6509a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("old status: " + this.f16635B + ", new status: " + aVar + ")");
        this.f16635B = aVar;
    }

    /* renamed from: a */
    public final void mo36230a(C6772i iVar) {
        if (iVar != null) {
            this.f16647k.add(iVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36231a(C6777l lVar) {
        int i;
        int i2 = lVar != null ? lVar.f17851e : C6777l.C6778a.f17873a;
        C6509a aVar = this.f16635B;
        if (i2 == C6777l.C6778a.f17874b) {
            i = C6510b.f16673c;
        } else {
            int i3 = C65083.f16665a[aVar.ordinal()];
            i = i3 != 1 ? i3 != 2 ? i3 != 3 ? C6510b.f16671a : C6510b.f16672b : C6510b.f16675e : C6510b.f16674d;
        }
        this.f16656t = i;
        this.f16655s.mo35878a(i);
    }

    /* renamed from: a */
    public final void mo35940a(boolean z) {
        if (this.f16660y && z) {
            CountDownTimer countDownTimer = this.f16646j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f16660y = false;
            this.f16643g = true;
            this.f16645i.post(this.f16636C);
        }
    }

    /* renamed from: b */
    public final synchronized C6509a mo36232b() {
        return this.f16635B;
    }

    /* renamed from: b */
    public final void mo36233b(boolean z) {
        Map<String, String> map;
        if (z && TextUtils.isEmpty(C6490J.m19474a().f16549o) && (map = this.f16650n.f17849c.f17500e.mo56836g().f17484a) != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (IronSourceUtils.doesClassExist(next)) {
                    String str = map.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        next = str;
                    }
                    C6490J.m19474a().mo36151d(next);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo36234c() {
        return this.f16653q;
    }
}
