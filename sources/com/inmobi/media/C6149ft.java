package com.inmobi.media;

import android.content.ContentValues;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ft */
/* compiled from: ConfigDao */
public class C6149ft {

    /* renamed from: a */
    private static final String f15588a = C6149ft.class.getSimpleName();

    /* renamed from: b */
    private static final String[] f15589b = {"account_id", "config_value", "config_type", "update_ts"};

    /* renamed from: d */
    private static String[] m18343d(String str, String str2) {
        return new String[]{str2, str};
    }

    /* renamed from: a */
    private static C6144fr m18336a(ContentValues contentValues) throws JSONException {
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        return C6144fr.m18315a(contentValues.getAsString("config_type"), new JSONObject(asString), contentValues.getAsString("account_id"));
    }

    public C6149ft() {
        C6215he a = C6215he.m18482a();
        a.mo35409a("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
        a.mo35412b();
    }

    /* renamed from: a */
    public static void m18339a(C6144fr frVar) {
        try {
            if (frVar.mo35331g() != null) {
                C6215he a = C6215he.m18482a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_id", frVar.mo35331g());
                JSONObject c = frVar.mo35326c();
                if (c == null) {
                    c = new JSONObject();
                }
                contentValues.put("config_value", c.toString());
                contentValues.put("config_type", frVar.mo35325b());
                contentValues.put("update_ts", Long.valueOf(System.currentTimeMillis()));
                a.mo35408a("config_db", contentValues, "account_id=? AND config_type=?", m18343d(frVar.mo35325b(), frVar.mo35331g()));
                a.mo35412b();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C6144fr m18337a(String str, String str2) {
        C6144fr frVar;
        try {
            C6215he a = C6215he.m18482a();
            List<ContentValues> a2 = a.mo35407a("config_db", f15589b, "account_id=? AND config_type=?", m18343d(str, str2), (String) null, (String) null, (String) null, (String) null);
            frVar = !a2.isEmpty() ? m18336a(a2.get(0)) : null;
            try {
                a.mo35412b();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            frVar = null;
        }
        return frVar == null ? C6144fr.m18314a(str, (String) null) : frVar;
    }

    /* renamed from: a */
    public static LinkedList<C6144fr> m18338a() {
        LinkedList<C6144fr> linkedList = new LinkedList<>();
        try {
            C6215he a = C6215he.m18482a();
            List<ContentValues> a2 = a.mo35407a("config_db", f15589b, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
            if (!a2.isEmpty()) {
                for (ContentValues a3 : a2) {
                    linkedList.add(m18336a(a3));
                }
            }
            a.mo35412b();
        } catch (Exception unused) {
        }
        return linkedList;
    }

    /* renamed from: b */
    public static boolean m18341b(String str, String str2) {
        try {
            C6215he a = C6215he.m18482a();
            int b = a.mo35411b("config_db", "account_id=? AND config_type=?", m18343d(str, str2));
            a.mo35412b();
            if (b <= 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static long m18342c(String str, String str2) {
        long j = 0;
        try {
            C6215he a = C6215he.m18482a();
            List<ContentValues> a2 = a.mo35407a("config_db", f15589b, "account_id=? AND config_type=?", m18343d(str, str2), (String) null, (String) null, (String) null, (String) null);
            if (!a2.isEmpty()) {
                j = a2.get(0).getAsLong("update_ts").longValue();
            }
            a.mo35412b();
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static void m18340a(String str, String str2, long j) {
        try {
            C6215he a = C6215he.m18482a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_ts", Long.valueOf(j));
            a.mo35410b("config_db", contentValues, "account_id=? AND config_type=?", m18343d(str, str2));
            a.mo35412b();
        } catch (Exception unused) {
        }
    }
}
