package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.utils.C6780n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.aa */
public abstract class C6560aa implements C6780n.C6781a {

    /* renamed from: c */
    protected AbstractAdapter f16970c;

    /* renamed from: d */
    protected C6691a f16971d;

    /* renamed from: e */
    boolean f16972e;

    /* renamed from: f */
    protected JSONObject f16973f;

    /* renamed from: g */
    protected String f16974g;

    /* renamed from: h */
    protected int f16975h;

    /* renamed from: i */
    protected Long f16976i = null;

    C6560aa(C6691a aVar, AbstractAdapter abstractAdapter) {
        this.f16971d = aVar;
        this.f16970c = abstractAdapter;
        this.f16973f = aVar.f17478b;
    }

    /* renamed from: a */
    private String mo36195a() {
        return this.f16971d.f17477a.isMultipleInstances() ? this.f16971d.f17477a.getProviderTypeForReflection() : this.f16971d.f17477a.getProviderName();
    }

    /* renamed from: b */
    public final void mo36397b(String str) {
        C6656f.m20309a();
        this.f16974g = C6656f.m20320d(str);
    }

    /* renamed from: d */
    public void mo36288d() {
        try {
            if (this.f16970c != null) {
                this.f16970c.releaseMemory(this.f16971d.f17482f, this.f16973f);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e.getMessage());
        }
        this.f16970c = null;
    }

    /* renamed from: e */
    public int mo36204e() {
        return 1;
    }

    /* renamed from: h */
    public final boolean mo36398h() {
        return this.f16971d.f17479c;
    }

    /* renamed from: i */
    public final int mo36399i() {
        return this.f16971d.f17480d;
    }

    /* renamed from: j */
    public final int mo36400j() {
        return this.f16971d.f17481e;
    }

    /* renamed from: k */
    public final String mo36401k() {
        return this.f16971d.f17477a.getProviderName();
    }

    /* renamed from: l */
    public final String mo36402l() {
        return this.f16971d.f17477a.getProviderTypeForReflection();
    }

    /* renamed from: m */
    public final int mo36403m() {
        return this.f16975h;
    }

    /* renamed from: n */
    public final Map<String, Object> mo36404n() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f16970c != null ? this.f16970c.getVersion() : str);
            if (this.f16970c != null) {
                str = this.f16970c.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f16971d.f17477a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f16971d.f17477a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(mo36398h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(mo36204e()));
            if (!TextUtils.isEmpty(this.f16974g)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f16974g);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo36401k() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: o */
    public final Long mo36405o() {
        return this.f16976i;
    }

    /* renamed from: p */
    public final String mo36406p() {
        return String.format("%s %s", new Object[]{mo36195a(), Integer.valueOf(hashCode())});
    }
}
