package com.inmobi.media;

import android.content.ContentValues;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gi */
/* compiled from: CrashEvent */
public class C6185gi {

    /* renamed from: g */
    private static final String f15634g = C6185gi.class.getSimpleName();

    /* renamed from: a */
    int f15635a;

    /* renamed from: b */
    String f15636b;

    /* renamed from: c */
    String f15637c;

    /* renamed from: d */
    String f15638d;

    /* renamed from: e */
    long f15639e;

    /* renamed from: f */
    protected String f15640f;

    public C6185gi(Thread thread, Throwable th) {
        this("crashReporting", "CrashEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(th));
            jSONObject.put("thread", thread.getName());
            this.f15640f = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public C6185gi(String str, String str2) {
        this.f15636b = UUID.randomUUID().toString();
        this.f15638d = str;
        this.f15637c = str2;
        this.f15640f = null;
        this.f15639e = System.currentTimeMillis();
    }

    private C6185gi(String str, String str2, String str3, String str4) {
        this.f15636b = str;
        this.f15638d = str2;
        this.f15637c = str3;
        this.f15640f = str4;
        this.f15639e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String mo35368a() {
        String str = this.f15640f;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f15637c + "@" + this.f15638d + " ";
    }

    /* renamed from: a */
    public static C6185gi m18416a(ContentValues contentValues) {
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        long longValue = Long.valueOf(contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS)).longValue();
        C6185gi giVar = new C6185gi(asString, asString3, asString2, asString4);
        giVar.f15639e = longValue;
        giVar.f15635a = contentValues.getAsInteger("id").intValue();
        return giVar;
    }
}
