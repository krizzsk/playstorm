package com.tapjoy.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gj */
class C11679gj extends C11676gi {

    /* renamed from: b */
    private final File f28413b;

    /* renamed from: c */
    private final C11713hi f28414c;

    /* renamed from: d */
    private volatile SQLiteDatabase f28415d;

    /* renamed from: e */
    private long f28416e;

    /* renamed from: f */
    private long f28417f;

    /* renamed from: g */
    private long f28418g;

    public C11679gj(File file, C11713hi hiVar) {
        this.f28413b = file;
        this.f28414c = hiVar;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.f28415d != null) {
            C11687gp.m33922a(this.f28415d);
            this.f28415d = null;
        }
        super.finalize();
    }

    /* access modifiers changed from: protected */
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo72561a(long j) {
        if (this.f28415d == null) {
            this.f28415d = SQLiteDatabase.openOrCreateDatabase(this.f28413b, (SQLiteDatabase.CursorFactory) null);
            int version = this.f28415d.getVersion();
            if (version == 0) {
                this.f28415d.beginTransaction();
                try {
                    this.f28415d.execSQL("CREATE TABLE IF NOT EXISTS UsageStats(name TEXT,dimensions TEXT,count INTEGER,first_time INTEGER,last_time INTEGER,PRIMARY KEY(name, dimensions))");
                    this.f28415d.execSQL("CREATE TABLE IF NOT EXISTS UsageStatValues(stat_id LONG,name TEXT,count INTEGER,avg REAL,max INTEGER,PRIMARY KEY(stat_id, name))");
                    this.f28415d.setVersion(1);
                    this.f28415d.setTransactionSuccessful();
                } finally {
                    this.f28415d.endTransaction();
                }
            } else if (version != 1) {
                throw new SQLException("Unknown database version: ".concat(String.valueOf(version)));
            }
            Cursor rawQuery = this.f28415d.rawQuery("SELECT MIN(first_time), MAX(last_time) FROM UsageStats", (String[]) null);
            try {
                if (rawQuery.moveToNext()) {
                    this.f28417f = rawQuery.getLong(0);
                    this.f28418g = rawQuery.getLong(1);
                }
                rawQuery.close();
                long j2 = this.f28417f;
                if (j2 > 0 && j2 + 86400000 <= j) {
                    m33902b();
                }
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo72560a() {
        if (this.f28415d != null) {
            C11687gp.m33922a(this.f28415d);
            this.f28415d = null;
        }
        this.f28413b.delete();
        this.f28418g = 0;
        this.f28417f = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo72562a(long j, String str, @Nullable String str2, @Nullable Map<String, Long> map) {
        long j2;
        Cursor cursor;
        String str3;
        char c;
        long j3 = j;
        String str4 = str;
        if (this.f28415d != null) {
            long j4 = this.f28416e;
            if (j4 == 0) {
                this.f28418g = j3;
                this.f28416e = j3;
            } else if (j3 < j4 || j3 >= j4 + 86400000) {
                if (j3 >= this.f28416e || this.f28418g - j3 >= 86400000) {
                    m33902b();
                    this.f28418g = j3;
                    this.f28416e = j3;
                } else {
                    this.f28416e = j3;
                }
            } else if (j3 > this.f28418g) {
                this.f28418g = j3;
            }
            String str5 = str2 == null ? "" : str2;
            int i = 0;
            char c2 = 1;
            Cursor rawQuery = this.f28415d.rawQuery("SELECT ROWID,count,first_time,last_time FROM UsageStats WHERE name = ? AND dimensions = ?", new String[]{str4, str5});
            try {
                ContentValues contentValues = new ContentValues();
                String str6 = "ROWID = ";
                if (rawQuery.moveToNext()) {
                    j2 = rawQuery.getLong(0);
                    int i2 = rawQuery.getInt(1);
                    long j5 = rawQuery.getLong(2);
                    long j6 = rawQuery.getLong(3);
                    contentValues.put("count", Integer.valueOf(i2 + 1));
                    if (j3 < j5) {
                        contentValues.put("first_time", Long.valueOf(j));
                    }
                    if (j3 > j6) {
                        contentValues.put("last_time", Long.valueOf(j));
                    }
                    this.f28415d.update("UsageStats", contentValues, str6.concat(String.valueOf(j2)), (String[]) null);
                } else {
                    contentValues.put("name", str4);
                    contentValues.put(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS, str5);
                    contentValues.put("count", 1);
                    contentValues.put("first_time", Long.valueOf(j));
                    contentValues.put("last_time", Long.valueOf(j));
                    j2 = this.f28415d.insert("UsageStats", (String) null, contentValues);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry next : map.entrySet()) {
                        if (next.getValue() != null) {
                            String str7 = (String) next.getKey();
                            long longValue = ((Long) next.getValue()).longValue();
                            String[] strArr = new String[2];
                            strArr[i] = Long.toString(j2);
                            strArr[c2] = str7;
                            Cursor rawQuery2 = this.f28415d.rawQuery("SELECT ROWID, * FROM UsageStatValues WHERE stat_id = ? AND name = ?", strArr);
                            try {
                                if (rawQuery2.moveToNext()) {
                                    long j7 = rawQuery2.getLong(i);
                                    int i3 = rawQuery2.getInt(3);
                                    double d = rawQuery2.getDouble(4);
                                    long j8 = rawQuery2.getLong(5);
                                    contentValues.clear();
                                    int i4 = i3 + 1;
                                    contentValues.put("count", Integer.valueOf(i4));
                                    str3 = str6;
                                    cursor = rawQuery2;
                                    contentValues.put("avg", Double.valueOf(d + ((((double) longValue) - d) / ((double) i4))));
                                    if (longValue > j8) {
                                        contentValues.put("max", Long.valueOf(longValue));
                                    }
                                    this.f28415d.update("UsageStatValues", contentValues, str3.concat(String.valueOf(j7)), (String[]) null);
                                    c = 1;
                                } else {
                                    cursor = rawQuery2;
                                    str3 = str6;
                                    contentValues.clear();
                                    contentValues.put("stat_id", Long.valueOf(j2));
                                    contentValues.put("name", str7);
                                    c = 1;
                                    contentValues.put("count", 1);
                                    contentValues.put("avg", Long.valueOf(longValue));
                                    contentValues.put("max", Long.valueOf(longValue));
                                    this.f28415d.insert("UsageStatValues", (String) null, contentValues);
                                }
                                cursor.close();
                                c2 = c;
                                str6 = str3;
                                i = 0;
                            } catch (Throwable th) {
                                th = th;
                                cursor = rawQuery2;
                                cursor.close();
                                throw th;
                            }
                        }
                    }
                }
                rawQuery.close();
            } catch (Throwable th2) {
                rawQuery.close();
                throw th2;
            }
        }
    }

    /* renamed from: b */
    private void m33902b() {
        HashMap hashMap;
        Set<String> set = C11676gi.f28405a;
        String str = null;
        Cursor rawQuery = this.f28415d.rawQuery("SELECT ROWID, * FROM UsageStats ORDER BY ROWID ASC", (String[]) null);
        try {
            rawQuery = this.f28415d.rawQuery("SELECT * FROM UsageStatValues ORDER BY stat_id ASC", (String[]) null);
            rawQuery.moveToNext();
            while (rawQuery.moveToNext()) {
                int i = 0;
                long j = rawQuery.getLong(0);
                int i2 = 1;
                String string = rawQuery.getString(1);
                String string2 = rawQuery.getString(2);
                String str2 = string2.isEmpty() ? str : string2;
                int i3 = rawQuery.getInt(3);
                long j2 = rawQuery.getLong(4);
                long j3 = rawQuery.getLong(5);
                if (!rawQuery.isAfterLast()) {
                    hashMap = null;
                    while (true) {
                        if (rawQuery.getLong(i) != j) {
                            break;
                        }
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        String string3 = rawQuery.getString(i2);
                        long j4 = rawQuery.getLong(3);
                        long j5 = rawQuery.getLong(4);
                        hashMap.put(string3, Long.valueOf(j4));
                        hashMap.put(string3 + "_max", Long.valueOf(j5));
                        if (!rawQuery.moveToNext()) {
                            break;
                        }
                        i = 0;
                        i2 = 1;
                    }
                } else {
                    hashMap = null;
                }
                if (set != null) {
                    if (set.contains(string)) {
                        str = null;
                    }
                }
                this.f28414c.mo72606a(string, str2, i3, j2, j3, (Map<String, Long>) hashMap);
                str = null;
            }
            rawQuery.close();
            this.f28415d.execSQL("DELETE FROM UsageStats");
            this.f28415d.execSQL("DELETE FROM UsageStatValues");
            this.f28418g = 0;
            this.f28417f = 0;
        } catch (Throwable th) {
            throw th;
        } finally {
            rawQuery.close();
        }
    }
}
