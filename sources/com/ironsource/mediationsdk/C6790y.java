package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.y */
public class C6790y {

    /* renamed from: a */
    protected AbstractAdapter f17902a;

    /* renamed from: b */
    protected C6691a f17903b;

    /* renamed from: c */
    protected JSONObject f17904c;

    /* renamed from: d */
    int f17905d;

    /* renamed from: e */
    protected String f17906e;

    /* renamed from: f */
    protected JSONObject f17907f;

    /* renamed from: g */
    protected List<String> f17908g;

    /* renamed from: h */
    protected String f17909h;

    /* renamed from: i */
    private C6791a f17910i;

    /* renamed from: j */
    private Timer f17911j;

    /* renamed from: k */
    private final Object f17912k = new Object();

    /* renamed from: l */
    private final Object f17913l = new Object();

    /* renamed from: com.ironsource.mediationsdk.y$a */
    public enum C6791a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C6790y(C6691a aVar, AbstractAdapter abstractAdapter) {
        this.f17903b = aVar;
        this.f17902a = abstractAdapter;
        this.f17904c = aVar.f17478b;
        this.f17910i = C6791a.NOT_LOADED;
        this.f17911j = null;
        this.f17906e = "";
        this.f17907f = null;
        this.f17908g = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6791a mo37002a(C6791a[] aVarArr, C6791a aVar) {
        C6791a aVar2;
        synchronized (this.f17912k) {
            aVar2 = this.f17910i;
            if (Arrays.asList(aVarArr).contains(this.f17910i)) {
                mo37003a(aVar);
            }
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37003a(C6791a aVar) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlySmash " + this.f17903b.f17477a.getProviderName() + ": current state=" + this.f17910i + ", new state=" + aVar, 0);
        synchronized (this.f17912k) {
            this.f17910i = aVar;
        }
    }

    /* renamed from: a */
    public final void mo37004a(String str) {
        C6656f.m20309a();
        this.f17909h = C6656f.m20320d(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37005a(TimerTask timerTask) {
        synchronized (this.f17913l) {
            mo37013h();
            Timer timer = new Timer();
            this.f17911j = timer;
            timer.schedule(timerTask, (long) (this.f17905d * 1000));
        }
    }

    /* renamed from: a */
    public final void mo37006a(JSONObject jSONObject) {
        this.f17907f = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo37007a(C6791a aVar, C6791a aVar2) {
        synchronized (this.f17912k) {
            if (this.f17910i != aVar) {
                return false;
            }
            mo37003a(aVar2);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo37008b(String str) {
        this.f17906e = str;
    }

    /* renamed from: c */
    public Map<String, Object> mo36950c() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f17902a != null ? this.f17902a.getVersion() : str);
            if (this.f17902a != null) {
                str = this.f17902a.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f17903b.f17477a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f17903b.f17477a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f17903b.f17479c) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.f17906e)) {
                    hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f17906e);
                }
                if (this.f17907f != null && this.f17907f.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f17907f);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.f17909h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f17909h);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo37009d() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: d */
    public final String mo37009d() {
        return this.f17903b.f17477a.getProviderName();
    }

    /* renamed from: e */
    public final int mo37010e() {
        return this.f17903b.f17480d;
    }

    /* renamed from: f */
    public final String mo37011f() {
        return this.f17903b.f17477a.getSubProviderId();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo37012g() {
        C6791a aVar = this.f17910i;
        return aVar == null ? "null" : aVar.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo37013h() {
        synchronized (this.f17913l) {
            if (this.f17911j != null) {
                this.f17911j.cancel();
                this.f17911j = null;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo37014i() {
        return this.f17903b.f17479c;
    }
}
