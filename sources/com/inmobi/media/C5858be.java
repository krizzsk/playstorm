package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.be */
/* compiled from: AssetDao */
public class C5858be {

    /* renamed from: a */
    public static final String[] f14785a = {"id", "pending_attempts", "url", "disk_uri", CampaignEx.JSON_KEY_ST_TS, "created_ts", "ttl", "soft_ttl"};

    /* renamed from: b */
    private static final String f14786b = C5858be.class.getSimpleName();

    /* renamed from: com.inmobi.media.be$a */
    /* compiled from: AssetDao */
    static class C5859a {

        /* renamed from: a */
        static final C5858be f14787a = new C5858be((byte) 0);
    }

    /* synthetic */ C5858be(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5858be m17531a() {
        return C5859a.f14787a;
    }

    private C5858be() {
        C6215he a = C6215he.m18482a();
        a.mo35409a("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
        a.mo35412b();
    }

    /* renamed from: a */
    public final synchronized void mo34832a(C5839av avVar) {
        if (m17532b(avVar) <= 0) {
            ContentValues d = m17537d(avVar);
            C6215he a = C6215he.m18482a();
            a.mo35406a("asset", d);
            a.mo35412b();
        }
    }

    /* renamed from: b */
    static C5839av m17533b() {
        List<ContentValues> a = C6215he.m18482a().mo35407a("asset", f14785a, (String) null, (String[]) null, (String) null, (String) null, "ts ASC ", (String) null);
        if (a.size() == 0) {
            return null;
        }
        return m17529a(a.get(0));
    }

    /* renamed from: c */
    static List<C5839av> m17535c() {
        ArrayList<C5839av> arrayList = new ArrayList<>();
        C6215he a = C6215he.m18482a();
        for (ContentValues a2 : a.mo35407a("asset", f14785a, (String) null, (String[]) null, (String) null, (String) null, "ts ASC ", (String) null)) {
            arrayList.add(m17529a(a2));
        }
        a.mo35412b();
        ArrayList arrayList2 = new ArrayList();
        for (C5839av avVar : arrayList) {
            if (!avVar.mo34750a()) {
                arrayList2.add(avVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: d */
    static List<C5839av> m17538d() {
        ArrayList arrayList = new ArrayList();
        C6215he a = C6215he.m18482a();
        if (a.mo35404a("asset") == 0) {
            return arrayList;
        }
        List<ContentValues> a2 = a.mo35407a("asset", f14785a, "disk_uri IS NOT NULL", (String[]) null, (String) null, (String) null, "created_ts DESC ", (String) null);
        a.mo35412b();
        for (ContentValues a3 : a2) {
            arrayList.add(m17529a(a3));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static String m17539e() {
        List<C5839av> d = m17538d();
        if (d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C5839av avVar : d) {
            try {
                jSONArray.put(URLEncoder.encode(avVar.f14715d, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    static C5839av m17530a(String str) {
        C6215he a = C6215he.m18482a();
        List<ContentValues> a2 = a.mo35407a("asset", f14785a, "url=? ", new String[]{str}, (String) null, (String) null, "created_ts DESC ", "1");
        a.mo35412b();
        if (a2.isEmpty()) {
            return null;
        }
        return m17529a(a2.get(0));
    }

    /* renamed from: f */
    public static List<String> m17540f() {
        ArrayList arrayList = new ArrayList();
        C6215he a = C6215he.m18482a();
        if (a.mo35404a("asset") == 0) {
            return arrayList;
        }
        List<ContentValues> a2 = a.mo35407a("asset", new String[]{"url"}, (String) null, (String[]) null, (String) null, (String) null, "created_ts DESC ", (String) null);
        a.mo35412b();
        for (ContentValues asString : a2) {
            arrayList.add(asString.getAsString("url"));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static C5839av m17534b(String str) {
        C6215he a = C6215he.m18482a();
        List<ContentValues> a2 = a.mo35407a("asset", f14785a, "url=? ", new String[]{str}, (String) null, (String) null, "created_ts DESC ", "1");
        a.mo35412b();
        if (a2.isEmpty()) {
            return null;
        }
        return m17529a(a2.get(0));
    }

    /* renamed from: b */
    public static int m17532b(C5839av avVar) {
        C6215he a = C6215he.m18482a();
        int b = a.mo35410b("asset", m17537d(avVar), "url = ?", new String[]{String.valueOf(avVar.f14715d)});
        a.mo35412b();
        return b;
    }

    /* renamed from: c */
    public static void m17536c(C5839av avVar) {
        C6215he a = C6215he.m18482a();
        a.mo35405a("asset", "id = ?", new String[]{String.valueOf(avVar.f14713b)});
        a.mo35412b();
    }

    /* renamed from: a */
    public static C5839av m17529a(ContentValues contentValues) {
        return new C5839av(contentValues.getAsInteger("id").intValue(), contentValues.getAsString("url"), contentValues.getAsString("disk_uri"), contentValues.getAsInteger("pending_attempts").intValue(), Long.valueOf(contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS)).longValue(), Long.valueOf(contentValues.getAsString("created_ts")).longValue(), Long.valueOf(contentValues.getAsString("ttl")).longValue(), Long.valueOf(contentValues.getAsString("soft_ttl")).longValue());
    }

    /* renamed from: d */
    private static ContentValues m17537d(C5839av avVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(avVar.f14713b));
        contentValues.put("url", avVar.f14715d);
        contentValues.put("disk_uri", avVar.f14716e);
        contentValues.put("pending_attempts", Integer.valueOf(avVar.f14714c));
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(avVar.f14717f));
        contentValues.put("created_ts", Long.toString(avVar.f14718g));
        contentValues.put("ttl", Long.toString(avVar.f14719h));
        contentValues.put("soft_ttl", Long.toString(avVar.f14720i));
        return contentValues;
    }
}
