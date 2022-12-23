package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bj */
/* compiled from: ClickDao */
public class C5873bj {

    /* renamed from: a */
    static final String[] f14830a = {"id", "pending_attempts", "url", "ping_in_webview", "follow_redirect", CampaignEx.JSON_KEY_ST_TS, "created_ts", "track_extras"};

    /* renamed from: b */
    private static final String f14831b = C5873bj.class.getSimpleName();

    C5873bj() {
        C6215he a = C6215he.m18482a();
        a.mo35409a("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
        a.mo35412b();
    }

    /* renamed from: a */
    public static boolean m17602a() {
        return C6215he.m18482a().mo35404a("click") == 0;
    }

    /* renamed from: a */
    public final synchronized void mo34845a(C5872bi biVar, int i) {
        ContentValues b = m17603b(biVar);
        C6215he a = C6215he.m18482a();
        if (a.mo35404a("click") >= i) {
            m17601a(m17599a(a.mo35407a("click", f14830a, "ts= (SELECT MIN(ts) FROM click LIMIT 1)", (String[]) null, (String) null, (String) null, (String) null, (String) null).get(0)));
        }
        a.mo35406a("click", b);
        a.mo35412b();
    }

    /* renamed from: a */
    public static void m17601a(C5872bi biVar) {
        C6215he a = C6215he.m18482a();
        a.mo35405a("click", "id = ?", new String[]{String.valueOf(biVar.f14821a)});
        a.mo35412b();
    }

    /* renamed from: a */
    static C5872bi m17599a(ContentValues contentValues) {
        int intValue = contentValues.getAsInteger("id").intValue();
        int intValue2 = contentValues.getAsInteger("pending_attempts").intValue();
        String asString = contentValues.getAsString("url");
        long longValue = Long.valueOf(contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS)).longValue();
        long longValue2 = Long.valueOf(contentValues.getAsString("created_ts")).longValue();
        boolean booleanValue = Boolean.valueOf(contentValues.getAsString("follow_redirect")).booleanValue();
        boolean booleanValue2 = Boolean.valueOf(contentValues.getAsString("ping_in_webview")).booleanValue();
        String asString2 = contentValues.getAsString("track_extras");
        HashMap hashMap = new HashMap();
        if (asString2 != null) {
            try {
                hashMap.putAll(m17600a(new JSONObject(asString2)));
            } catch (Exception | JSONException unused) {
            }
        }
        return new C5872bi(intValue, asString, hashMap, booleanValue, booleanValue2, intValue2, longValue, longValue2);
    }

    /* renamed from: b */
    static ContentValues m17603b(C5872bi biVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(biVar.f14821a));
        contentValues.put("url", biVar.f14822b);
        contentValues.put("pending_attempts", Integer.valueOf(biVar.f14826f));
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(biVar.f14824d));
        contentValues.put("created_ts", Long.toString(biVar.f14825e));
        contentValues.put("follow_redirect", Boolean.toString(biVar.f14829i));
        contentValues.put("ping_in_webview", Boolean.toString(biVar.f14828h));
        if (biVar.f14823c != null && biVar.f14823c.size() > 0) {
            contentValues.put("track_extras", new JSONObject(biVar.f14823c).toString());
        }
        return contentValues;
    }

    /* renamed from: a */
    private static Map<String, String> m17600a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, (String) jSONObject.get(next));
        }
        return hashMap;
    }
}
