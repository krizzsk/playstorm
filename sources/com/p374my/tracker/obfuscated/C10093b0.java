package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* renamed from: com.my.tracker.obfuscated.b0 */
final class C10093b0 {

    /* renamed from: v */
    static long f25125v = -1;

    /* renamed from: a */
    private final String[] f25126a = new String[1];

    /* renamed from: b */
    private final SQLiteDatabase f25127b;

    /* renamed from: c */
    private final C10100g f25128c = new C10100g();

    /* renamed from: d */
    private final SQLiteStatement f25129d;

    /* renamed from: e */
    private final SQLiteStatement f25130e;

    /* renamed from: f */
    private final SQLiteStatement f25131f;

    /* renamed from: g */
    private final SQLiteStatement f25132g;

    /* renamed from: h */
    private final SQLiteStatement f25133h;

    /* renamed from: i */
    private final SQLiteStatement f25134i;

    /* renamed from: j */
    private final SQLiteStatement f25135j;

    /* renamed from: k */
    private final SQLiteStatement f25136k;

    /* renamed from: l */
    private final SQLiteStatement f25137l;

    /* renamed from: m */
    private final SQLiteStatement f25138m;

    /* renamed from: n */
    private final SQLiteStatement f25139n;

    /* renamed from: o */
    private final SQLiteStatement f25140o;

    /* renamed from: p */
    private final SQLiteStatement f25141p;

    /* renamed from: q */
    private final SQLiteStatement f25142q;

    /* renamed from: r */
    private final SQLiteStatement f25143r;

    /* renamed from: s */
    private final SQLiteStatement f25144s;

    /* renamed from: t */
    private final SQLiteStatement f25145t;

    /* renamed from: u */
    private final SQLiteStatement f25146u;

    /* renamed from: com.my.tracker.obfuscated.b0$a */
    static abstract class C10094a implements Closeable {

        /* renamed from: a */
        final Cursor f25147a;

        C10094a(Cursor cursor) {
            this.f25147a = cursor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo66102a() {
            return this.f25147a.moveToNext();
        }

        public final void close() {
            try {
                this.f25147a.close();
            } catch (Throwable th) {
                C10175u0.m30445b("AbstractReader error: error while closing cursor", th);
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            super.finalize();
            close();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$b */
    static final class C10095b extends C10094a {
        C10095b(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte[] mo66105b() {
            return this.f25147a.getBlob(3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo66106c() {
            return this.f25147a.getLong(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public long mo66107d() {
            return this.f25147a.getLong(4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public long mo66108e() {
            return this.f25147a.getLong(1);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$c */
    static final class C10096c extends C10094a {
        C10096c(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo66109b() {
            return this.f25147a.getLong(1);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$d */
    static final class C10097d extends C10094a {
        C10097d(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo66110b() {
            return this.f25147a.getString(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo66111c() {
            return this.f25147a.getLong(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo66112d() {
            return this.f25147a.getString(2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public long mo66113e() {
            return this.f25147a.getLong(3);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$e */
    static final class C10098e extends C10094a {
        C10098e(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo66114b() {
            return this.f25147a.getLong(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo66115c() {
            return this.f25147a.getString(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public long mo66116d() {
            return this.f25147a.isNull(2) ? C10093b0.f25125v : this.f25147a.getLong(2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public long mo66117e() {
            return this.f25147a.getLong(3);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$f */
    static final class C10099f extends C10094a {
        C10099f(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo66118b() {
            return this.f25147a.getLong(2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo66119c() {
            return this.f25147a.getLong(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo66120d() {
            return this.f25147a.isNull(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$g */
    static final class C10100g implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        long f25148a;

        /* renamed from: b */
        byte[] f25149b;

        C10100g() {
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.f25148a);
            sQLiteQuery.bindBlob(2, this.f25149b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private C10093b0(SQLiteDatabase sQLiteDatabase) {
        this.f25127b = sQLiteDatabase;
        this.f25129d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.f25130e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.f25131f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f25132g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.f25133h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.f25134i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.f25135j = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.f25136k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.f25137l = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.f25138m = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.f25139n = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.f25143r = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.f25140o = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.f25141p = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.f25144s = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.f25142q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.f25145t = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.f25146u = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
    }

    /* renamed from: a */
    static C10093b0 m29970a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);
            if (openOrCreateDatabase == null) {
                C10175u0.m30444b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (openOrCreateDatabase.getVersion() != 8) {
                openOrCreateDatabase.close();
                context.deleteDatabase(str2);
                openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);
                openOrCreateDatabase.setVersion(8);
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
            }
            return new C10093b0(openOrCreateDatabase);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo66073a(int i, byte[] bArr, boolean z) {
        this.f25129d.bindLong(1, (long) i);
        this.f25129d.bindLong(2, z ? 1 : 0);
        this.f25129d.bindBlob(3, bArr);
        return this.f25129d.executeInsert();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo66074a(long j, long j2) {
        this.f25143r.bindLong(1, j);
        this.f25143r.bindLong(2, j2);
        return (long) this.f25143r.executeUpdateDelete();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo66075a(long j, byte[] bArr) {
        C10100g gVar = this.f25128c;
        gVar.f25148a = j;
        gVar.f25149b = bArr;
        Cursor rawQueryWithFactory = this.f25127b.rawQueryWithFactory(gVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", (String[]) null, (String) null);
        try {
            if (rawQueryWithFactory.moveToNext()) {
                long j2 = rawQueryWithFactory.getLong(0);
                rawQueryWithFactory.close();
                return j2;
            }
            rawQueryWithFactory.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo66076a(String str, long j) {
        this.f25131f.bindString(1, str);
        this.f25131f.bindLong(2, j);
        return this.f25131f.executeInsert();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo66077a(String str, String str2, long j) {
        this.f25134i.bindString(1, str);
        this.f25134i.bindString(2, str2);
        this.f25134i.bindLong(3, j);
        return this.f25134i.executeInsert();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10098e mo66078a(String str) {
        String[] strArr = this.f25126a;
        strArr[0] = str;
        return new C10098e(this.f25127b.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66079a() {
        this.f25138m.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66080a(long j) {
        this.f25146u.bindLong(1, j);
        this.f25146u.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66081a(long j, long j2, long j3) {
        if (j2 != f25125v) {
            this.f25136k.bindLong(1, j2);
        } else {
            this.f25136k.bindNull(1);
        }
        this.f25136k.bindLong(2, j3);
        this.f25136k.bindLong(3, j);
        this.f25136k.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66082a(long j, long j2, boolean z, long j3) {
        this.f25132g.bindLong(1, j);
        this.f25132g.bindLong(2, j2);
        SQLiteStatement sQLiteStatement = this.f25132g;
        if (z) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j3);
        }
        this.f25132g.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66083a(String str, Long l) {
        SQLiteStatement sQLiteStatement;
        if (l == null) {
            this.f25145t.bindString(1, str);
            sQLiteStatement = this.f25145t;
        } else {
            long longValue = l.longValue();
            this.f25133h.bindString(1, str);
            this.f25133h.bindLong(2, longValue);
            if (this.f25133h.executeInsert() == f25125v) {
                this.f25137l.bindLong(1, longValue);
                this.f25137l.bindString(2, str);
                sQLiteStatement = this.f25137l;
            } else {
                return;
            }
        }
        sQLiteStatement.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo66084b(long j) {
        this.f25126a[0] = String.valueOf(j);
        Cursor rawQuery = this.f25127b.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.f25126a);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo66085b(long j, long j2) {
        this.f25144s.bindLong(1, j);
        this.f25144s.bindLong(2, j2);
        return (long) this.f25144s.executeUpdateDelete();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10095b mo66086b(long j, byte[] bArr) {
        C10100g gVar = this.f25128c;
        gVar.f25148a = j;
        gVar.f25149b = bArr;
        return new C10095b(this.f25127b.rawQueryWithFactory(gVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", (String[]) null, (String) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Long mo66087b(String str) {
        String[] strArr = this.f25126a;
        strArr[0] = str;
        Cursor rawQuery = this.f25127b.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (rawQuery.moveToNext()) {
                Long valueOf = Long.valueOf(rawQuery.getLong(0));
                rawQuery.close();
                return valueOf;
            }
            rawQuery.close();
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66088b() {
        this.f25139n.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10096c mo66089c(long j) {
        this.f25126a[0] = String.valueOf(j);
        return new C10096c(this.f25127b.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.f25126a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo66090c() {
        this.f25140o.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo66091c(long j, long j2) {
        this.f25130e.bindLong(1, j);
        this.f25130e.bindLong(2, j2);
        this.f25130e.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo66092d(long j) {
        this.f25126a[0] = String.valueOf(j);
        Cursor rawQuery = this.f25127b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.f25126a);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo66093d() {
        this.f25141p.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo66094d(long j, long j2) {
        this.f25135j.bindLong(1, j2);
        this.f25135j.bindLong(2, j);
        this.f25135j.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo66095e(long j) {
        this.f25126a[0] = String.valueOf(j);
        Cursor rawQuery = this.f25127b.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.f25126a);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo66096e() {
        this.f25142q.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10095b mo66097f() {
        return new C10095b(this.f25127b.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", (String[]) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10099f mo66098f(long j) {
        this.f25126a[0] = String.valueOf(j);
        return new C10099f(this.f25127b.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.f25126a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo66099g() {
        Cursor rawQuery = this.f25127b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo66100h() {
        Cursor rawQuery = this.f25127b.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C10097d mo66101i() {
        return new C10097d(this.f25127b.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", (String[]) null));
    }
}
