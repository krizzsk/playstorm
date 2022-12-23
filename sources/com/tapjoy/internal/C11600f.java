package com.tapjoy.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: com.tapjoy.internal.f */
public final class C11600f<E> extends C11427an<E> implements C11432ar<E>, Closeable {

    /* renamed from: a */
    private SQLiteDatabase f28100a;

    /* renamed from: b */
    private final C11438ax<E> f28101b;

    /* renamed from: c */
    private int f28102c;

    public C11600f(File file, C11438ax<E> axVar) {
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        this.f28100a = openOrCreateDatabase;
        this.f28101b = axVar;
        if (openOrCreateDatabase.getVersion() != 1) {
            this.f28100a.beginTransaction();
            try {
                this.f28100a.execSQL("CREATE TABLE IF NOT EXISTS List(value BLOB)");
                this.f28100a.setVersion(1);
                this.f28100a.setTransactionSuccessful();
            } finally {
                this.f28100a.endTransaction();
            }
        }
        this.f28102c = m33744a();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
        super.finalize();
    }

    public final void close() {
        SQLiteDatabase sQLiteDatabase = this.f28100a;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f28100a = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: a */
    private int m33744a() {
        Cursor cursor = 0;
        try {
            cursor = this.f28100a.rawQuery("SELECT COUNT(1) FROM List", cursor);
            if (cursor.moveToNext()) {
                return cursor.getInt(0);
            }
            m33745a(cursor);
            return 0;
        } finally {
            m33745a((Cursor) cursor);
        }
    }

    public final int size() {
        return this.f28102c;
    }

    public final void clear() {
        this.f28100a.delete("List", "1", (String[]) null);
        this.f28102c = 0;
    }

    public final boolean offer(E e) {
        C11689gr.m33925a(e);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f28101b.mo72188a(byteArrayOutputStream, e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C11687gp.m33922a(byteArrayOutputStream);
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", byteArray);
            if (this.f28100a.insert("List", (String) null, contentValues) == -1) {
                return false;
            }
            this.f28102c++;
            return true;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2);
        } catch (Throwable th) {
            C11687gp.m33922a(byteArrayOutputStream);
            throw th;
        }
    }

    public final E poll() {
        if (this.f28102c <= 0) {
            return null;
        }
        E peek = peek();
        mo72133b(1);
        return peek;
    }

    public final E peek() {
        if (this.f28102c > 0) {
            return mo72132a(0);
        }
        return null;
    }

    /* renamed from: a */
    public final E mo72132a(int i) {
        ByteArrayInputStream byteArrayInputStream;
        if (i < 0 || i >= this.f28102c) {
            throw new IndexOutOfBoundsException();
        }
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f28100a;
            cursor = sQLiteDatabase.rawQuery("SELECT value FROM List ORDER BY rowid LIMIT " + i + ",1", (String[]) null);
            if (cursor.moveToNext()) {
                byteArrayInputStream = new ByteArrayInputStream(cursor.getBlob(0));
                E b = this.f28101b.mo72187b(byteArrayInputStream);
                C11687gp.m33922a(byteArrayInputStream);
                m33745a(cursor);
                return b;
            }
            throw new NoSuchElementException();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        } catch (Throwable th) {
            m33745a(cursor);
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo72133b(int i) {
        int i2;
        if (i <= 0 || i > (i2 = this.f28102c)) {
            throw new IndexOutOfBoundsException();
        } else if (i == i2) {
            clear();
        } else {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase = this.f28100a;
                StringBuilder sb = new StringBuilder("SELECT rowid FROM List ORDER BY rowid LIMIT ");
                sb.append(i - 1);
                sb.append(",1");
                Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
                try {
                    if (rawQuery.moveToNext()) {
                        long j = rawQuery.getLong(0);
                        rawQuery.close();
                        int delete = this.f28100a.delete("List", "rowid <= ".concat(String.valueOf(j)), (String[]) null);
                        this.f28102c -= delete;
                        if (delete == i) {
                            m33745a((Cursor) null);
                            return;
                        }
                        throw new IllegalStateException("Try to delete " + i + ", but deleted " + delete);
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    m33745a(cursor);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m33745a(cursor);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static Cursor m33745a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        cursor.close();
        return null;
    }
}
