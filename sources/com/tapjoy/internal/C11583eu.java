package com.tapjoy.internal;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.TextUtils;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJEarnedCurrencyListener;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJInstallReferrer;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TJPrivacyPolicy;
import com.tapjoy.TJSetUserIDListener;
import com.tapjoy.TJSpendCurrencyListener;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TapjoyCache;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyIntegrationException;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11591ex;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.eu */
class C11583eu extends C11582et {

    /* renamed from: c */
    private boolean f28004c = false;

    /* renamed from: d */
    private String f28005d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TJCurrency f28006e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TapjoyCache f28007f = null;

    /* renamed from: b */
    public final String mo72417b() {
        return "12.10.0";
    }

    C11583eu() {
    }

    /* renamed from: a */
    public final void mo72412a(boolean z) {
        TapjoyLog.setDebugEnabled(z);
    }

    /* renamed from: a */
    public final void mo72394a(Context context, boolean z) {
        TapjoyConnectCore.optOutAdvertisingID(context, z);
    }

    /* renamed from: a */
    public final boolean mo72413a(Context context, String str) {
        return mo72415a(context, str, (Hashtable<String, ?>) null, (TJConnectListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo72415a(final android.content.Context r3, java.lang.String r4, java.util.Hashtable<java.lang.String, ?> r5, final com.tapjoy.TJConnectListener r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r5 == 0) goto L_0x0018
            java.lang.String r0 = "TJC_OPTION_ENABLE_LOGGING"
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "true"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c5 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.setDebugEnabled(r0)     // Catch:{ all -> 0x00c5 }
        L_0x0018:
            java.lang.String r0 = "event"
            com.tapjoy.TapjoyConnectCore.setSDKType(r0)     // Catch:{ all -> 0x00c5 }
            r0 = 0
            if (r3 != 0) goto L_0x0035
            java.lang.String r3 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "The application context is NULL"
            r4.<init>(r5, r1)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r3, (com.tapjoy.TapjoyErrorMessage) r4)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0033
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x0033:
            monitor-exit(r2)
            return r0
        L_0x0035:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r3 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "The SDK key is NULL. A valid SDK key is required to connect successfully to Tapjoy"
            r4.<init>(r5, r1)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r3, (com.tapjoy.TapjoyErrorMessage) r4)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x004e
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x004e:
            monitor-exit(r2)
            return r0
        L_0x0050:
            com.tapjoy.FiveRocksIntegration.m32992a()     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyAppSettings.init(r3)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            com.tapjoy.internal.eu$1 r1 = new com.tapjoy.internal.eu$1     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            r1.<init>(r3, r6)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            com.tapjoy.TapjoyConnectCore.requestTapjoyConnect(r3, r4, r5, r1)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            r4 = 1
            r2.f28004c = r4     // Catch:{ all -> 0x00c5 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c5 }
            r1 = 14
            if (r6 >= r1) goto L_0x006f
            java.lang.String r3 = "TapjoyAPI"
            java.lang.String r5 = "Automatic session tracking is not available on this device."
            com.tapjoy.TapjoyLog.m33197i(r3, r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x0093
        L_0x006f:
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "TJC_OPTION_DISABLE_AUTOMATIC_SESSION_TRACKING"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "true"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0086
            r0 = r4
        L_0x0086:
            if (r0 != 0) goto L_0x008c
            com.tapjoy.internal.C11633fn.m33795a((android.content.Context) r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x0093
        L_0x008c:
            java.lang.String r3 = "TapjoyAPI"
            java.lang.String r5 = "Automatic session tracking is disabled."
            com.tapjoy.TapjoyLog.m33197i(r3, r5)     // Catch:{ all -> 0x00c5 }
        L_0x0093:
            monitor-exit(r2)
            return r4
        L_0x0095:
            r3 = move-exception
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c5 }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x00ab
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x00ab:
            monitor-exit(r2)
            return r0
        L_0x00ad:
            r3 = move-exception
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c5 }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x00c3
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x00c3:
            monitor-exit(r2)
            return r0
        L_0x00c5:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11583eu.mo72415a(android.content.Context, java.lang.String, java.util.Hashtable, com.tapjoy.TJConnectListener):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo72414a(final android.content.Context r4, java.lang.String r5, final com.tapjoy.TJConnectListener r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "event"
            com.tapjoy.TapjoyConnectCore.setSDKType(r0)     // Catch:{ all -> 0x0074 }
            r0 = 0
            if (r4 != 0) goto L_0x001e
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "The application context is NULL"
            r5.<init>(r1, r2)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x001c
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x001c:
            monitor-exit(r3)
            return r0
        L_0x001e:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0039
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "The limited SDK key is NULL. A valid limited SDK key is required to connect successfully to Tapjoy"
            r5.<init>(r1, r2)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0037
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x0037:
            monitor-exit(r3)
            return r0
        L_0x0039:
            com.tapjoy.internal.eu$2 r1 = new com.tapjoy.internal.eu$2     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            r1.<init>(r4, r6)     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            com.tapjoy.TapjoyConnectCore.requestLimitedTapjoyConnect(r4, r5, r1)     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0044:
            r4 = move-exception
            java.lang.String r5 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r1 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r2 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0074 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r5, (com.tapjoy.TapjoyErrorMessage) r1)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x005a
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x005a:
            monitor-exit(r3)
            return r0
        L_0x005c:
            r4 = move-exception
            java.lang.String r5 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r1 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r2 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0074 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r5, (com.tapjoy.TapjoyErrorMessage) r1)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0072
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r3)
            return r0
        L_0x0074:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11583eu.mo72414a(android.content.Context, java.lang.String, com.tapjoy.TJConnectListener):boolean");
    }

    /* renamed from: a */
    public final TJPlacement mo72385a(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.m33113a(str, "", "", tJPlacementListener);
    }

    /* renamed from: b */
    public final TJPlacement mo72416b(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.m33114b(str, "", "", tJPlacementListener);
    }

    /* renamed from: a */
    public final void mo72391a(Activity activity) {
        if (activity != null) {
            C11441b.m33235a(activity);
        } else {
            TapjoyLog.m33195e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Cannot set activity to NULL"));
        }
    }

    /* renamed from: a */
    public final void mo72386a(float f) {
        if (m33662k("setCurrencyMultiplier")) {
            TapjoyConnectCore.getInstance().setCurrencyMultiplier(f);
        }
    }

    /* renamed from: c */
    public final float mo72424c() {
        if (m33662k("getCurrencyMultiplier")) {
            return TapjoyConnectCore.getInstance().getCurrencyMultiplier();
        }
        return 1.0f;
    }

    /* renamed from: e */
    public final void mo72432e(String str) {
        if (m33661j("actionComplete")) {
            TapjoyConnectCore.getInstance().actionComplete(str);
        }
    }

    /* renamed from: a */
    public final void mo72397a(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        if (this.f28006e != null && m33661j("getCurrencyBalance")) {
            this.f28006e.getCurrencyBalance(tJGetCurrencyBalanceListener);
        }
    }

    /* renamed from: a */
    public final void mo72389a(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        if (this.f28006e != null && m33661j("spendCurrency")) {
            this.f28006e.spendCurrency(i, tJSpendCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo72388a(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        if (this.f28006e != null && m33661j("awardCurrency")) {
            this.f28006e.awardCurrency(i, tJAwardCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo72396a(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        if (this.f28006e != null && m33661j("setEarnedCurrencyListener")) {
            this.f28006e.setEarnedCurrencyListener(tJEarnedCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo72398a(TJVideoListener tJVideoListener) {
        if (m33662k("setVideoListener")) {
            TJAdUnit.f27199a = tJVideoListener;
        }
    }

    /* renamed from: a */
    public final void mo72405a(String str, String str2, String str3, String str4) {
        C11695gx.m33938a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo72402a(String str, String str2) {
        C11695gx.m33938a(str, (String) null, (String) null, str2);
    }

    /* renamed from: a */
    public final void mo72399a(String str) {
        C11695gx.m33939a((String) null, str, (String) null, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo72400a(String str, long j) {
        C11695gx.m33939a((String) null, str, (String) null, (String) null, j);
    }

    /* renamed from: a */
    public final void mo72404a(String str, String str2, long j) {
        C11695gx.m33939a(str, str2, (String) null, (String) null, j);
    }

    /* renamed from: b */
    public final void mo72422b(String str, String str2, String str3, String str4) {
        C11695gx.m33939a(str, str2, str3, str4, 0);
    }

    /* renamed from: a */
    public final void mo72406a(String str, String str2, String str3, String str4, long j) {
        C11695gx.m33939a(str, str2, str3, str4, j);
    }

    /* renamed from: a */
    public final void mo72407a(String str, String str2, String str3, String str4, String str5, long j) {
        C11695gx.m33940a(str, str2, str3, str4, str5, j, (String) null, 0, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo72408a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        C11695gx.m33940a(str, str2, str3, str4, str5, j, str6, j2, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo72409a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        C11695gx.m33940a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    /* renamed from: d */
    public final void mo72428d() {
        if (m33662k("startSession")) {
            if (Build.VERSION.SDK_INT >= 14) {
                C11633fn.m33794a();
            }
            TapjoyConnectCore.getInstance().appResume();
            C11714hj.m33999a().mo72630e();
        }
    }

    /* renamed from: e */
    public final void mo72431e() {
        if (m33662k("endSession")) {
            if (Build.VERSION.SDK_INT >= 14) {
                C11633fn.m33794a();
            }
            C11714hj.m33999a().f28492m = false;
            TapjoyConnectCore.getInstance().appPause();
            C11714hj.m33999a().mo72631f();
        }
    }

    /* renamed from: b */
    public final void mo72419b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 14) {
            C11633fn.m33794a();
        }
        C11714hj.m33999a().f28492m = true;
        C11714hj.m33999a().mo72612a(activity);
    }

    /* renamed from: c */
    public final void mo72425c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 14) {
            C11633fn.m33794a();
        }
        C11714hj.m33999a().mo72623b(activity);
    }

    /* renamed from: a */
    public final void mo72401a(String str, TJSetUserIDListener tJSetUserIDListener) {
        if (m33662k("setUserID")) {
            TapjoyConnectCore.setUserID(str, tJSetUserIDListener);
            C11714hj a = C11714hj.m33999a();
            if (a.mo72628c("setUserId")) {
                a.f28485f.mo72653b(C11705he.m33963a(str));
            }
        } else if (tJSetUserIDListener != null) {
            tJSetUserIDListener.onSetUserIDFailure(this.f28005d);
        }
    }

    /* renamed from: i */
    public final void mo72439i(String str) {
        TapjoyConnectCore.setCustomParameter(str);
    }

    /* renamed from: l */
    public final String mo72443l() {
        return TapjoyConnectCore.getCustomParameter();
    }

    /* renamed from: f */
    public final Set<String> mo72434f() {
        return C11714hj.m33999a().mo72627c();
    }

    /* renamed from: a */
    public final void mo72411a(Set<String> set) {
        C11714hj.m33999a().mo72622a(set);
    }

    /* renamed from: g */
    public final void mo72435g() {
        C11714hj.m33999a().mo72622a((Set<String>) null);
    }

    /* renamed from: c */
    public final void mo72426c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C11714hj a = C11714hj.m33999a();
            Set<String> c = a.mo72627c();
            if (c.add(str)) {
                a.mo72622a(c);
            }
        }
    }

    /* renamed from: d */
    public final void mo72429d(String str) {
        if (!TextUtils.isEmpty(str)) {
            C11714hj a = C11714hj.m33999a();
            Set<String> c = a.mo72627c();
            if (c.remove(str)) {
                a.mo72622a(c);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo72438h() {
        C11714hj a = C11714hj.m33999a();
        if (!a.mo72628c("isPushNotificationDisabled")) {
            return false;
        }
        boolean f = a.f28485f.mo72657f();
        C11710hg.m33977a("isPushNotificationDisabled = {}", Boolean.valueOf(f));
        return f;
    }

    /* renamed from: b */
    public final void mo72423b(boolean z) {
        String str;
        Object[] objArr;
        String str2;
        C11714hj a = C11714hj.m33999a();
        if (a.mo72628c("setPushNotificationDisabled")) {
            boolean a2 = a.f28485f.mo72650a(z);
            char c = 0;
            String str3 = "setPushNotificationDisabled({}) called, but it is already {}";
            if (a2) {
                objArr = new Object[1];
                str = Boolean.valueOf(z);
                str3 = "setPushNotificationDisabled({}) called";
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(z);
                str = z ? "disabled" : TJAdUnitConstants.String.ENABLED;
                c = 1;
                objArr = objArr2;
            }
            objArr[c] = str;
            C11710hg.m33977a(str3, objArr);
            if (a2 && a.f28489j && !TextUtils.isEmpty(a.f28483d)) {
                if (a.f28493n != null) {
                    str2 = null;
                } else {
                    C11724hl a3 = C11724hl.m34046a(a.f28484e);
                    str2 = C11690gs.m33927b(a3.f28926b.mo72638a(a3.f28925a));
                }
                a.mo72614a(str2);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo72440i() {
        return this.f28002a;
    }

    /* renamed from: j */
    public final boolean mo72441j() {
        return this.f28003b;
    }

    /* renamed from: f */
    public final String mo72433f(String str) {
        if (m33661j("getSupportURL")) {
            return TapjoyConnectCore.getSupportURL(str);
        }
        return null;
    }

    /* renamed from: k */
    public final String mo72442k() {
        return TapjoyConnectCore.getUserToken();
    }

    /* renamed from: h */
    public final void mo72437h(String str) {
        C11714hj.m33999a().mo72614a(str);
    }

    /* renamed from: a */
    public final void mo72393a(Context context, Map<String, String> map) {
        boolean z;
        Map<String, String> map2 = map;
        C11714hj a = C11714hj.m33999a();
        if (a.f28484e == null) {
            a.mo72624b(context);
        }
        C11724hl.m34046a(a.f28484e);
        Context context2 = a.f28484e;
        Object[] objArr = new Object[1];
        String str = map2.get("fiverocks");
        if (str == null) {
            return;
        }
        if (C11726hm.m34053a(context2).mo72657f()) {
            C11713hi hiVar = C11714hj.m34000a(context2).f28486g;
            C11591ex.C11592a a2 = hiVar.mo72602a(C11601fa.APP, "push_ignore");
            a2.f28081s = new C11612fe((String) null, (String) null, str);
            hiVar.mo72604a(a2);
            return;
        }
        String str2 = map2.get("title");
        String str3 = map2.get("message");
        if (str3 != null) {
            String str4 = map2.get("rich");
            String str5 = map2.get("sound");
            String str6 = map2.get("payload");
            String str7 = map2.get("always");
            boolean z2 = "true".equals(str7) || Boolean.TRUE.equals(str7);
            String str8 = map2.get("repeatable");
            boolean z3 = "true".equals(str8) || Boolean.TRUE.equals(str8);
            String str9 = map2.get("placement");
            int b = C11724hl.m34048b(map2.get("nid"));
            String str10 = map2.get("channel_id");
            if (z2 || !C11714hj.m34000a(context2).mo72629d()) {
                int i = b;
                boolean z4 = z3;
                Notification a3 = C11724hl.m34045a(context2, str, C11690gs.m33926a(str2), str3, C11724hl.m34047a((Object) str4), C11724hl.m34047a((Object) str5), str6, str9, b, str10);
                C11714hj a4 = C11714hj.m34000a(context2);
                long currentTimeMillis = System.currentTimeMillis();
                a4.mo72624b(context2);
                if (a4.f28485f.mo72649a(str, currentTimeMillis, z4)) {
                    C11713hi hiVar2 = a4.f28486g;
                    C11591ex.C11592a a5 = hiVar2.mo72602a(C11601fa.APP, "push_show");
                    a5.f28081s = new C11612fe((String) null, (String) null, str);
                    hiVar2.mo72604a(a5);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((NotificationManager) context2.getSystemService("notification")).notify(i, a3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72392a(Context context) {
        C11714hj a = C11714hj.m33999a();
        if (a.f28484e == null) {
            a.mo72624b(context);
        }
        if (a.mo72625b()) {
            new TJInstallReferrer().init(context);
            return;
        }
        throw new TapjoyIntegrationException("InstallReferrerClient APIs aren't available in your project. To use activateInstallReferrerClient() API,`com.android.installreferrer:installreferrer` dependency is required to your project level build.gradle file");
    }

    /* renamed from: b */
    public final void mo72420b(Context context, String str) {
        C11714hj a = C11714hj.m33999a();
        if (a.f28484e == null) {
            a.mo72624b(context);
        }
        C11714hj.m34001a(a.f28484e, str);
    }

    /* renamed from: j */
    private boolean m33661j(String str) {
        if (this.f28002a) {
            return true;
        }
        TapjoyLog.m33199w("TapjoyAPI", "Can not call " + str + " because Tapjoy SDK has not successfully connected.");
        return false;
    }

    /* renamed from: k */
    private boolean m33662k(String str) {
        if (this.f28004c) {
            return true;
        }
        this.f28005d = "Can not call " + str + " because Tapjoy SDK is not initialized.";
        TapjoyLog.m33195e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, this.f28005d));
        return false;
    }

    /* renamed from: c */
    public final void mo72427c(boolean z) {
        C11675gh.m33868a().mo72556a(z);
    }

    /* renamed from: g */
    public final void mo72436g(String str) {
        C11675gh.m33868a().mo72555a(str);
    }

    /* renamed from: d */
    public final void mo72430d(boolean z) {
        C11675gh.m33868a().mo72558b(z);
    }

    /* renamed from: m */
    public final TJPrivacyPolicy mo72444m() {
        return TJPrivacyPolicy.getInstance();
    }

    /* renamed from: a */
    public final void mo72403a(String str, String str2, double d, String str3) {
        C11714hj a = C11714hj.m33999a();
        if (a.mo72626b("trackPurchase")) {
            String str4 = str;
            String a2 = C11705he.m33964a(str, "trackPurchase", InAppPurchaseMetaData.KEY_PRODUCT_ID);
            if (a2 != null) {
                String str5 = str2;
                String a3 = C11705he.m33964a(str2, "trackPurchase", "currencyCode");
                if (a3 == null) {
                    return;
                }
                if (a3.length() != 3) {
                    C11710hg.m33976a("trackPurchase", "currencyCode", "invalid currency code");
                    return;
                }
                a.f28486g.mo72605a(a2, a3.toUpperCase(Locale.US), d, (String) null, (String) null, C11705he.m33965b(str3));
                C11710hg.m33975a("trackPurchase called");
            }
        }
    }

    /* renamed from: a */
    public final void mo72410a(String str, String str2, String str3, String str4, Map<String, Long> map) {
        C11714hj a = C11714hj.m33999a();
        if (a.mo72626b("trackEvent") && !TextUtils.isEmpty(str2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null && map.size() > 0) {
                for (Map.Entry next : map.entrySet()) {
                    Object key = next.getKey();
                    if (key == null) {
                        if (C11710hg.f28464a) {
                            C11845w.m34416a("Tapjoy", "{}: {} must not be null", "trackEvent", "key in values map");
                            return;
                        }
                        return;
                    } else if (key instanceof String) {
                        String a2 = C11705he.m33964a((String) key, "trackEvent", "key in values map");
                        if (a2 != null) {
                            Object value = next.getValue();
                            if (value instanceof Number) {
                                linkedHashMap.put(a2, Long.valueOf(((Number) value).longValue()));
                            } else {
                                C11710hg.m33976a("trackEvent", "value in values map", "must be a long");
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            a.f28486g.mo72607a(str, str2, str3, str4, linkedHashMap);
            C11710hg.m33977a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, linkedHashMap);
        }
    }

    /* renamed from: a */
    public final void mo72387a(int i) {
        C11714hj a = C11714hj.m33999a();
        if (a.mo72628c("setUserLevel")) {
            C11710hg.m33977a("setUserLevel({}) called", Integer.valueOf(i));
            a.f28485f.mo72647a(i >= 0 ? Integer.valueOf(i) : null);
        }
    }

    /* renamed from: b */
    public final void mo72418b(int i) {
        C11714hj a = C11714hj.m33999a();
        if (a.mo72628c("setUserFriendCount")) {
            C11710hg.m33977a("setUserFriendCount({}) called", Integer.valueOf(i));
            a.f28485f.mo72652b(i >= 0 ? Integer.valueOf(i) : null);
        }
    }

    /* renamed from: b */
    public final void mo72421b(String str) {
        C11714hj a = C11714hj.m33999a();
        if (a.mo72628c("setAppDataVersion")) {
            a.f28485f.mo72648a(C11705he.m33963a(str));
        }
    }

    /* renamed from: a */
    public final void mo72390a(int i, String str) {
        C11714hj a = C11714hj.m33999a();
        if (a.mo72628c("setUserCohortVariable")) {
            boolean z = i > 0 && i <= 5;
            if (C11710hg.f28464a && !z) {
                C11710hg.m33980b("setCohortVariable: variableIndex is out of range");
            }
            if (z) {
                C11710hg.m33977a("setUserCohortVariable({}, {}) called", Integer.valueOf(i), str);
                a.f28485f.mo72646a(i, C11705he.m33963a(str));
            }
        }
    }

    /* renamed from: a */
    public final void mo72395a(GLSurfaceView gLSurfaceView) {
        C11714hj.m33999a();
        C11714hj.m34002a(gLSurfaceView);
    }
}
