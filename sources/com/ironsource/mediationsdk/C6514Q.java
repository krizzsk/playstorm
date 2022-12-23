package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6700j;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.sdk.C6724f;
import com.ironsource.mediationsdk.sdk.C6753m;
import com.ironsource.mediationsdk.utils.C6777l;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.Q */
final class C6514Q implements C6724f {

    /* renamed from: a */
    C6753m f16686a;

    /* renamed from: b */
    C6724f f16687b;

    /* renamed from: c */
    private final String f16688c = getClass().getName();

    /* renamed from: d */
    private IronSourceLoggerManager f16689d = IronSourceLoggerManager.getLogger();

    /* renamed from: e */
    private AtomicBoolean f16690e = new AtomicBoolean(true);

    /* renamed from: f */
    private AtomicBoolean f16691f = new AtomicBoolean(false);

    /* renamed from: g */
    private C6777l f16692g;

    /* renamed from: h */
    private NetworkSettings f16693h;

    /* renamed from: i */
    private String f16694i;

    C6514Q() {
    }

    /* renamed from: a */
    private synchronized void m19654a(IronSourceError ironSourceError) {
        if (this.f16691f != null) {
            this.f16691f.set(false);
        }
        if (this.f16690e != null) {
            this.f16690e.set(true);
        }
        if (this.f16687b != null) {
            this.f16687b.mo36255a(false, ironSourceError);
        }
    }

    /* renamed from: b */
    private AbstractAdapter m19655b(String str) {
        try {
            C6490J a = C6490J.m19474a();
            AbstractAdapter b = a.mo36142b(str);
            if (b == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + "." + str + "Adapter");
                b = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
                if (b == null) {
                    return null;
                }
            }
            a.mo36137a(b);
            return b;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16689d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f16689d;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.logException(ironSourceTag2, this.f16688c + ":startOfferwallAdapter", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo36253a(String str) {
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.f16687b.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.f16694i = str;
            C6700j a = this.f16692g.f17849c.f17498c.mo36819a(str);
            if (a == null) {
                this.f16689d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f16692g.f17849c.f17498c.mo36818a();
                if (a == null) {
                    this.f16689d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f16689d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            if (this.f16691f != null && this.f16691f.get() && this.f16686a != null) {
                this.f16686a.showOfferwall(String.valueOf(a.f17515a), this.f16693h.getRewardedVideoSettings());
            }
        } catch (Exception e) {
            this.f16689d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[SYNTHETIC, Splitter:B:18:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36254a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f16689d     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r2.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = r7.f16688c     // Catch:{ all -> 0x00fc }
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ":initOfferwall(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            r2.append(r8)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            r2.append(r9)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00fc }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.J r0 = com.ironsource.mediationsdk.C6490J.m19474a()     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.utils.l r0 = r0.f16543i     // Catch:{ all -> 0x00fc }
            r7.f16692g = r0     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.g r1 = r0.f17849c     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.g r1 = r0.f17849c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.i r1 = r1.f17498c     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.g r1 = r0.f17849c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.i r1 = r1.f17498c     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r1.mo36820b()     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x004b
            goto L_0x0054
        L_0x004b:
            com.ironsource.mediationsdk.model.g r0 = r0.f17849c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.i r0 = r0.f17498c     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = r0.mo36820b()     // Catch:{ all -> 0x00fc }
            goto L_0x0056
        L_0x0054:
            java.lang.String r0 = "SupersonicAds"
        L_0x0056:
            com.ironsource.mediationsdk.utils.l r1 = r7.f16692g     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x0067
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m19654a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0067:
            com.ironsource.mediationsdk.utils.l r1 = r7.f16692g     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.n r1 = r1.f17825b     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.mo36826a((java.lang.String) r0)     // Catch:{ all -> 0x00fc }
            r7.f16693h = r1     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x0080
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m19654a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0080:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r7.m19655b(r0)     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x0093
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m19654a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0093:
            com.ironsource.mediationsdk.J r1 = com.ironsource.mediationsdk.C6490J.m19474a()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r1 = r1.f16546l     // Catch:{ Exception -> 0x00c8 }
            if (r1 == 0) goto L_0x009e
            r0.setMediationSegment(r1)     // Catch:{ Exception -> 0x00c8 }
        L_0x009e:
            com.ironsource.mediationsdk.J r1 = com.ironsource.mediationsdk.C6490J.m19474a()     // Catch:{ Exception -> 0x00c8 }
            java.lang.Boolean r1 = r1.f16559y     // Catch:{ Exception -> 0x00c8 }
            if (r1 == 0) goto L_0x00e3
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f16689d     // Catch:{ Exception -> 0x00c8 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ Exception -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = "Offerwall | setConsent(consent:"
            r5.<init>(r6)     // Catch:{ Exception -> 0x00c8 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c8 }
            r2.log(r4, r5, r3)     // Catch:{ Exception -> 0x00c8 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00c8 }
            r0.setConsent(r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00e3
        L_0x00c8:
            r1 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f16689d     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = ":setCustomParams():"
            r4.<init>(r5)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fc }
            r4.append(r1)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00fc }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ all -> 0x00fc }
        L_0x00e3:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.f16689d     // Catch:{ all -> 0x00fc }
            r0.setLogListener(r1)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.sdk.m r0 = (com.ironsource.mediationsdk.sdk.C6753m) r0     // Catch:{ all -> 0x00fc }
            r7.f16686a = r0     // Catch:{ all -> 0x00fc }
            r0.setInternalOfferwallListener(r7)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.sdk.m r0 = r7.f16686a     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r7.f16693h     // Catch:{ all -> 0x00fc }
            org.json.JSONObject r1 = r1.getRewardedVideoSettings()     // Catch:{ all -> 0x00fc }
            r0.initOfferwall(r8, r9, r1)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x00fc:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6514Q.mo36254a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo36255a(boolean z, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16689d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (z) {
            this.f16691f.set(true);
            C6724f fVar = this.f16687b;
            if (fVar != null) {
                fVar.onOfferwallAvailable(true);
                return;
            }
            return;
        }
        m19654a(ironSourceError);
    }

    /* renamed from: a */
    public final synchronized boolean mo36256a() {
        boolean z;
        z = false;
        if (this.f16691f != null) {
            z = this.f16691f.get();
        }
        return z;
    }

    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16689d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        C6724f fVar = this.f16687b;
        if (fVar != null) {
            fVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        this.f16689d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        C6724f fVar = this.f16687b;
        if (fVar != null) {
            return fVar.onOfferwallAdCredited(i, i2, z);
        }
        return false;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo36255a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        this.f16689d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        C6724f fVar = this.f16687b;
        if (fVar != null) {
            fVar.onOfferwallClosed();
        }
    }

    public final void onOfferwallOpened() {
        this.f16689d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b = C6782o.m20647a().mo36990b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.f16694i)) {
                mediationAdditionalData.put("placement", this.f16694i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6557h.m19950d().mo36371b(new C6552c(IronSourceConstants.OFFERWALL_OPENED, mediationAdditionalData));
        C6782o.m20647a().mo36988a(0);
        C6724f fVar = this.f16687b;
        if (fVar != null) {
            fVar.onOfferwallOpened();
        }
    }

    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16689d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        C6724f fVar = this.f16687b;
        if (fVar != null) {
            fVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}
