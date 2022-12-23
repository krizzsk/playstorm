package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.C6758b;
import com.ironsource.mediationsdk.utils.C6763a;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p */
public abstract class C6714p {

    /* renamed from: a */
    protected C6763a f17575a;

    /* renamed from: b */
    protected IronSourceSegment f17576b;

    /* renamed from: c */
    protected AdInfo f17577c;

    /* renamed from: d */
    private HashSet<ImpressionDataListener> f17578d = new HashSet<>();

    public C6714p(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this.f17578d = hashSet;
        this.f17575a = new C6763a();
        this.f17576b = ironSourceSegment;
    }

    /* renamed from: d */
    protected static String m20437d() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36838a(IronSource.AD_UNIT ad_unit) {
        this.f17575a.mo36954a(ad_unit, false);
    }

    /* renamed from: a */
    public final void mo36839a(IronSourceSegment ironSourceSegment) {
        this.f17576b = ironSourceSegment;
    }

    /* renamed from: a */
    public final void mo36840a(ImpressionData impressionData) {
        if (impressionData != null) {
            this.f17577c = new AdInfo(impressionData);
        }
    }

    /* renamed from: a */
    public final void mo36841a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f17578d.add(impressionDataListener);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36842a(C6758b bVar, String str) {
        if (bVar != null) {
            ImpressionData a = bVar.mo36938a(str);
            if (a != null) {
                Iterator<ImpressionDataListener> it = this.f17578d.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener next = it.next();
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a);
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36843a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("isAdUnitCapped", false);
        }
        this.f17575a.mo36954a(ad_unit, z);
    }

    /* renamed from: a_ */
    public final void mo36844a_() {
        this.f17577c = null;
    }

    /* renamed from: b */
    public final void mo36845b() {
        synchronized (this) {
            this.f17578d.clear();
        }
    }

    /* renamed from: b */
    public final void mo36846b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f17578d.remove(impressionDataListener);
        }
    }
}
