package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class CrashProvider extends ContentProvider {

    /* renamed from: a */
    private Context f16262a;

    /* renamed from: b */
    private C6424f f16263b;

    /* renamed from: c */
    private String f16264c;

    /* renamed from: d */
    private UriMatcher f16265d = new UriMatcher(-1);

    /* renamed from: e */
    private Uri f16266e;

    /* renamed from: f */
    private int f16267f = 1;

    /* renamed from: g */
    private int f16268g = 2;

    /* renamed from: h */
    private String f16269h;

    /* renamed from: i */
    private String f16270i;

    /* renamed from: j */
    private String f16271j = "REPORTS";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        int match = this.f16265d.match(uri);
        if (match == 1) {
            return this.f16269h;
        }
        if (match == 2) {
            return this.f16270i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f16262a = getContext();
        this.f16263b = new C6424f(this.f16262a);
        this.f16264c = this.f16262a.getPackageName();
        this.f16266e = Uri.parse("content://" + this.f16264c + "/REPORTS");
        this.f16269h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f16270i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f16265d.match(uri);
        if (match == 1) {
            return C6424f.m19286b();
        }
        if (match == 2) {
            return C6424f.m19283a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
