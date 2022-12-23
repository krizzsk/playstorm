package com.ironsource.mediationsdk.p207a;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.c */
public class C6552c {

    /* renamed from: a */
    private int f16953a = -1;

    /* renamed from: b */
    private long f16954b = -1;

    /* renamed from: c */
    private JSONObject f16955c;

    public C6552c(int i, long j, JSONObject jSONObject) {
        this.f16953a = i;
        this.f16954b = j;
        this.f16955c = jSONObject;
    }

    public C6552c(int i, JSONObject jSONObject) {
        this.f16953a = i;
        this.f16954b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f16955c = new JSONObject();
        } else {
            this.f16955c = jSONObject;
        }
    }

    /* renamed from: a */
    static C6543a m19923a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new C6554e(i);
        }
        if ("outcome".equals(str)) {
            return new C6555f(i);
        }
        if (i == 2) {
            return new C6554e(i);
        }
        if (i == 3) {
            return new C6555f(i);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }

    /* renamed from: a */
    public int mo36390a() {
        return this.f16953a;
    }

    /* renamed from: a */
    public void mo36391a(int i) {
        this.f16953a = i;
    }

    /* renamed from: a */
    public void mo36392a(String str, Object obj) {
        try {
            this.f16955c.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public long mo36393b() {
        return this.f16954b;
    }

    /* renamed from: c */
    public String mo36394c() {
        return this.f16955c.toString();
    }

    /* renamed from: d */
    public JSONObject mo36395d() {
        return this.f16955c;
    }
}
