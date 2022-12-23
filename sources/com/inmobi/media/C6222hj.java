package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.inmobi.media.hj */
/* compiled from: TelemetryEvent */
public class C6222hj {

    /* renamed from: a */
    int f15765a;

    /* renamed from: b */
    String f15766b;

    /* renamed from: c */
    long f15767c;

    /* renamed from: d */
    String f15768d;

    public C6222hj(String str) {
        this.f15766b = str;
        this.f15768d = null;
        this.f15767c = System.currentTimeMillis();
    }

    private C6222hj(String str, String str2) {
        this.f15766b = str;
        this.f15768d = str2;
        this.f15767c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String mo35427a() {
        String str = this.f15768d;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f15766b + " ";
    }

    /* renamed from: a */
    public static C6222hj m18524a(ContentValues contentValues) {
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        long longValue = Long.valueOf(contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS)).longValue();
        C6222hj hjVar = new C6222hj(asString, asString2);
        hjVar.f15767c = longValue;
        hjVar.f15765a = contentValues.getAsInteger("id").intValue();
        return hjVar;
    }
}
