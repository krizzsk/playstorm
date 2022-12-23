package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.d */
public final class C6653d {

    /* renamed from: d */
    private static final C6653d f17282d = new C6653d();

    /* renamed from: e */
    private static final Object f17283e = new Object();

    /* renamed from: a */
    String f17284a;

    /* renamed from: b */
    String f17285b;

    /* renamed from: c */
    final ConcurrentHashMap<String, List<String>> f17286c = new ConcurrentHashMap<>();

    /* renamed from: f */
    private final ConcurrentHashMap<String, AbstractAdapter> f17287f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f17288g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private Boolean f17289h;

    /* renamed from: i */
    private Boolean f17290i;

    /* renamed from: j */
    private final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> f17291j = new ConcurrentHashMap<>();

    /* renamed from: k */
    private final AtomicBoolean f17292k = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.d$1 */
    static /* synthetic */ class C66541 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17293a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17293a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17293a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17293a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6653d.C66541.<clinit>():void");
        }
    }

    private C6653d() {
    }

    /* renamed from: a */
    private AbstractAdapter m20283a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + str2.toLowerCase(Locale.ENGLISH) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            m20289a(str3);
            return null;
        }
    }

    /* renamed from: a */
    private AdapterBaseInterface m20284a(String str, String str2, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + str2;
            try {
                BaseAdapter baseAdapter = (BaseAdapter) Class.forName(str3).newInstance();
                IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
                if (this.f17290i != null && (baseAdapter instanceof AdapterDebugInterface)) {
                    try {
                        baseAdapter.setAdapterDebug(this.f17290i.booleanValue());
                    } catch (Exception e) {
                        String str4 = "error while setting adapterDebug of " + baseAdapter.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                        m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
                        m20292b(str4);
                        e.printStackTrace();
                    }
                }
                this.f17288g.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
                return baseAdapter;
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String str5 = "failed to load " + str3;
                    IronLog.INTERNAL.error(str5);
                    m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str5);
                }
                return null;
            }
        } else {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
    }

    /* renamed from: a */
    public static C6653d m20285a() {
        return f17282d;
    }

    /* renamed from: a */
    private static void m20286a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
            }
            C6553d.m19930d().mo36371b(new C6552c(i, jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m20287a(AbstractAdapter abstractAdapter) {
        try {
            if (this.f17289h != null) {
                abstractAdapter.setConsent(this.f17289h.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
            m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            m20292b(str);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m20288a(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, "APSData is empty");
            m20289a("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.f17287f.isEmpty()) {
                for (AbstractAdapter next : this.f17287f.values()) {
                    if (next.getProviderName().toLowerCase(Locale.ENGLISH).equals("aps") && (next instanceof SetAPSInterface)) {
                        ((SetAPSInterface) next).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper next2 : this.f17288g.values()) {
                AdapterBaseInterface adapterBaseInterface = next2.getAdapterBaseInterface();
                if (!next2.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterAPSDataInterface)) {
                    ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                    return;
                }
            }
            synchronized (f17283e) {
                this.f17291j.put(ad_unit, jSONObject2);
            }
        } catch (Exception e) {
            String str = "error while setting APSData: " + e.getLocalizedMessage();
            m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
            m20289a(str);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m20289a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 3);
    }

    /* renamed from: b */
    private static String m20290b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    /* renamed from: b */
    private void m20291b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f17290i;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                m20292b(str);
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private static void m20292b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 0);
    }

    /* renamed from: c */
    private BaseAdAdapter<?, ?> m20293c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
            try {
                return (BaseAdAdapter) Class.forName(str).getConstructor(new Class[]{NetworkSettings.class}).newInstance(new Object[]{networkSettings});
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String str2 = "failed to load " + str;
                    IronLog.INTERNAL.error(str2);
                    m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                }
                return null;
            }
        } else {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
    }

    /* renamed from: c */
    private void m20294c(AbstractAdapter abstractAdapter) {
        for (String next : this.f17286c.keySet()) {
            try {
                List list = this.f17286c.get(next);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + next + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(next, (List<String>) list);
                }
            } catch (Throwable th) {
                String str = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                m20292b(str);
                th.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private void m20295d(AbstractAdapter abstractAdapter) {
        if (abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH).equals("aps") && this.f17291j.size() != 0) {
            for (IronSource.AD_UNIT next : this.f17291j.keySet()) {
                try {
                    JSONObject jSONObject = this.f17291j.get(next);
                    if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(next, jSONObject);
                    }
                } catch (Exception e) {
                    String str = "error while setting aps data: " + e.getLocalizedMessage();
                    m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
                    m20292b(str);
                    e.printStackTrace();
                }
            }
            this.f17291j.clear();
        }
    }

    /* renamed from: a */
    public final AbstractAdapter mo36661a(NetworkSettings networkSettings) {
        String b = m20290b(networkSettings);
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.f17287f.get(b) : m20283a(b, networkSettings.getProviderTypeForReflection());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0114, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.AbstractAdapter mo36662a(com.ironsource.mediationsdk.model.NetworkSettings r7, org.json.JSONObject r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = m20290b((com.ironsource.mediationsdk.model.NetworkSettings) r7)
            if (r9 == 0) goto L_0x0009
            java.lang.String r7 = "IronSource"
            goto L_0x000d
        L_0x0009:
            java.lang.String r7 = r7.getProviderTypeForReflection()
        L_0x000d:
            java.lang.Object r9 = f17283e
            monitor-enter(r9)
            if (r10 != 0) goto L_0x0024
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r1 = r6.f17287f     // Catch:{ all -> 0x0115 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0115 }
            if (r1 == 0) goto L_0x0024
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r7 = r6.f17287f     // Catch:{ all -> 0x0115 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0115 }
            com.ironsource.mediationsdk.AbstractAdapter r7 = (com.ironsource.mediationsdk.AbstractAdapter) r7     // Catch:{ all -> 0x0115 }
            monitor-exit(r9)     // Catch:{ all -> 0x0115 }
            return r7
        L_0x0024:
            com.ironsource.mediationsdk.AbstractAdapter r1 = r6.m20283a((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ all -> 0x0115 }
            if (r1 != 0) goto L_0x0041
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r7.<init>()     // Catch:{ all -> 0x0115 }
            r7.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = " adapter was not loaded"
            r7.append(r8)     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0115 }
            m20289a((java.lang.String) r7)     // Catch:{ all -> 0x0115 }
            r7 = 0
            monitor-exit(r9)     // Catch:{ all -> 0x0115 }
            return r7
        L_0x0041:
            r2 = 88001(0x157c1, float:1.23316E-40)
            java.lang.String r3 = r1.getCoreSDKVersion()     // Catch:{ Exception -> 0x0049 }
            goto L_0x0072
        L_0x0049:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = "error while retrieving coreSDKVersion "
            r4.<init>(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = r1.getProviderName()     // Catch:{ all -> 0x0115 }
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r3.getLocalizedMessage()     // Catch:{ all -> 0x0115 }
            r4.append(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0115 }
            m20286a((int) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0115 }
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0115 }
            r4.error(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = "Unknown"
        L_0x0072:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r4.<init>()     // Catch:{ all -> 0x0115 }
            r4.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = " was allocated (adapter version: "
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = r1.getVersion()     // Catch:{ all -> 0x0115 }
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = ", sdk version: "
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            r4.append(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = ")"
            r4.append(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0115 }
            m20292b((java.lang.String) r3)     // Catch:{ all -> 0x0115 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0115 }
            r1.setLogListener(r3)     // Catch:{ all -> 0x0115 }
            r6.m20294c(r1)     // Catch:{ all -> 0x0115 }
            r6.m20295d(r1)     // Catch:{ all -> 0x0115 }
            r6.m20287a((com.ironsource.mediationsdk.AbstractAdapter) r1)     // Catch:{ all -> 0x0115 }
            r6.m20291b((com.ironsource.mediationsdk.AbstractAdapter) r1)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = "SupersonicAds"
            boolean r3 = r7.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0115 }
            if (r3 != 0) goto L_0x00bd
            java.lang.String r3 = "IronSource"
            boolean r3 = r7.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0115 }
            if (r3 == 0) goto L_0x010c
        L_0x00bd:
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f17292k     // Catch:{ all -> 0x0115 }
            r4 = 0
            r5 = 1
            boolean r3 = r3.compareAndSet(r4, r5)     // Catch:{ all -> 0x0115 }
            if (r3 == 0) goto L_0x010c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = "SDK5 earlyInit  <"
            r3.<init>(r4)     // Catch:{ all -> 0x0115 }
            r3.append(r7)     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = ">"
            r3.append(r7)     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0115 }
            m20292b((java.lang.String) r7)     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = r6.f17284a     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r3 = r6.f17285b     // Catch:{ Exception -> 0x00e5 }
            r1.earlyInit(r7, r3, r8)     // Catch:{ Exception -> 0x00e5 }
            goto L_0x010c
        L_0x00e5:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = "error while calling early init for "
            r8.<init>(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r1.getProviderName()     // Catch:{ all -> 0x0115 }
            r8.append(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = ": "
            r8.append(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ all -> 0x0115 }
            r8.append(r7)     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0115 }
            m20286a((int) r2, (java.lang.String) r7)     // Catch:{ all -> 0x0115 }
            com.ironsource.mediationsdk.logger.IronLog r8 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0115 }
            r8.error(r7)     // Catch:{ all -> 0x0115 }
        L_0x010c:
            if (r10 != 0) goto L_0x0113
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r7 = r6.f17287f     // Catch:{ all -> 0x0115 }
            r7.put(r0, r1)     // Catch:{ all -> 0x0115 }
        L_0x0113:
            monitor-exit(r9)     // Catch:{ all -> 0x0115 }
            return r1
        L_0x0115:
            r7 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0115 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6653d.mo36662a(com.ironsource.mediationsdk.model.NetworkSettings, org.json.JSONObject, boolean, boolean):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* renamed from: a */
    public final AdapterBaseInterface mo36663a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        String b = m20290b(networkSettings);
        if (this.f17288g.containsKey(b)) {
            AdapterBaseInterface adapterBaseInterface = this.f17288g.get(b).getAdapterBaseInterface();
            if (adapterBaseInterface instanceof C6513P) {
                ((C6513P) adapterBaseInterface).f16681a = ad_unit;
            }
            return adapterBaseInterface;
        }
        AdapterBaseInterface a = m20284a(b, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName((IronSource.AD_UNIT) null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (a != null || networkSettings.isCustomNetwork()) {
            this.f17288g.put(b, new AdapterBaseWrapper(a, networkSettings));
            return a;
        }
        int i = C66541.f17293a[ad_unit.ordinal()];
        AbstractAdapter a2 = mo36662a(networkSettings, i != 1 ? i != 2 ? i != 3 ? null : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false, true);
        if (a2 != null) {
            C6513P p = new C6513P(a2, networkSettings, ad_unit);
            this.f17288g.put(b, new AdapterBaseWrapper(p, networkSettings));
            return p;
        }
        String str = "error creating network adapter " + networkSettings.getProviderName();
        m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    /* renamed from: a */
    public final void mo36664a(String str, List<String> list) {
        synchronized (f17283e) {
            this.f17286c.put(str, list);
            if (!this.f17287f.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter next : this.f17287f.values()) {
                    try {
                        next.setMetaData(str, list);
                    } catch (Throwable th) {
                        String str2 = "error while setting metadata of " + next.getProviderName() + ": " + th.getLocalizedMessage();
                        m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        m20292b(str2);
                        th.printStackTrace();
                    }
                }
            }
            for (AdapterBaseWrapper next2 : this.f17288g.values()) {
                AdapterBaseInterface adapterBaseInterface = next2.getAdapterBaseInterface();
                if (!next2.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                    try {
                        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                    } catch (Exception e) {
                        String str3 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                        m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                        m20292b(str3);
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo36665a(String str, JSONObject jSONObject) {
        String str2;
        IronSource.AD_UNIT ad_unit;
        if (TextUtils.isEmpty(str)) {
            str2 = "Calling setNetworkData on an empty network";
        } else if (jSONObject == null || jSONObject.length() == 0) {
            str2 = "Calling setNetworkData with empty networkData";
        } else if (str.toLowerCase(Locale.ENGLISH).equals("aps")) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.toLowerCase(Locale.ENGLISH).equals(IronSource.AD_UNIT.BANNER.toString())) {
                    ad_unit = IronSource.AD_UNIT.BANNER;
                } else if (next.toLowerCase(Locale.ENGLISH).equals(IronSource.AD_UNIT.INTERSTITIAL.toString())) {
                    ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                }
                m20288a(ad_unit, jSONObject.optJSONObject(next));
            }
            return;
        } else {
            str2 = "Calling setNetworkData on an unsupported network: " + str;
        }
        m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str2);
        m20289a(str2);
    }

    /* renamed from: a */
    public final void mo36666a(boolean z) {
        synchronized (f17283e) {
            this.f17289h = Boolean.valueOf(z);
            for (AbstractAdapter a : this.f17287f.values()) {
                m20287a(a);
            }
            for (AdapterBaseWrapper next : this.f17288g.values()) {
                AdapterBaseInterface adapterBaseInterface = next.getAdapterBaseInterface();
                if (!next.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterConsentInterface)) {
                    try {
                        ((AdapterConsentInterface) adapterBaseInterface).setConsent(z);
                    } catch (Exception e) {
                        String str = "error while setting consent of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                        m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        m20292b(str);
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final BaseAdAdapter<?, ?> mo36667b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> c = m20293c(networkSettings, ad_unit);
        if (c != null || networkSettings.isCustomNetwork()) {
            return c;
        }
        AbstractAdapter a = mo36661a(networkSettings);
        if (a != null) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                return new C6513P(a, networkSettings, ad_unit);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return new C6513P(a, networkSettings, ad_unit);
            }
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        m20286a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    /* renamed from: b */
    public final void mo36668b(boolean z) {
        synchronized (f17283e) {
            this.f17290i = Boolean.valueOf(z);
            for (AbstractAdapter b : this.f17287f.values()) {
                m20291b(b);
            }
        }
    }
}
