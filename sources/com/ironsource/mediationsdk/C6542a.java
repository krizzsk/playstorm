package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.C6767e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.a */
abstract class C6542a {

    /* renamed from: a */
    C6767e f16871a = null;

    /* renamed from: b */
    int f16872b;

    /* renamed from: c */
    final CopyOnWriteArrayList<C6642b> f16873c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    C6642b f16874d;

    /* renamed from: e */
    C6642b f16875e;

    /* renamed from: f */
    String f16876f;

    /* renamed from: g */
    String f16877g;

    /* renamed from: h */
    IronSourceLoggerManager f16878h = IronSourceLoggerManager.getLogger();

    /* renamed from: i */
    boolean f16879i = false;

    /* renamed from: j */
    Boolean f16880j;

    /* renamed from: k */
    boolean f16881k;

    /* renamed from: l */
    boolean f16882l = true;

    /* renamed from: m */
    private String f16883m = IronSourceConstants.EVENTS_ERROR_REASON;

    /* renamed from: n */
    private String f16884n = "status";

    /* renamed from: o */
    private String f16885o = "placement";

    /* renamed from: p */
    private String f16886p = IronSourceConstants.EVENTS_REWARD_NAME;

    /* renamed from: q */
    private String f16887q = IronSourceConstants.EVENTS_REWARD_AMOUNT;

    /* renamed from: r */
    private String f16888r = "providerPriority";

    C6542a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo36039a(Context context, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36349a(C6642b bVar) {
        this.f16873c.add(bVar);
        C6767e eVar = this.f16871a;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (bVar.f17252m != 99) {
                        eVar.f17688a.put(eVar.mo36964d(bVar), Integer.valueOf(bVar.f17252m));
                    }
                } catch (Exception e) {
                    eVar.f17690c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo36350a() {
        return this.f16882l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo36351b() {
        this.f16882l = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo36352b(C6642b bVar) {
        try {
            String str = C6490J.m19474a().f16546l;
            if (!TextUtils.isEmpty(str) && bVar.f17241b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = bVar.f17256q;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, bVar.mo36637j() + ":setMediationSegment(segment:" + str + ")", 1);
                bVar.f17241b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
                if (bVar.f17241b != null) {
                    bVar.f17241b.setPluginData(pluginType, pluginFrameworkVersion);
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f16878h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e.toString(), 3);
        }
    }
}
