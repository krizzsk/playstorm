package com.bytedance.sdk.openadsdk.multipro.p185d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3913a;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.c */
/* compiled from: SPMultiProviderImpl */
public class C3968c implements C3913a {

    /* renamed from: a */
    private Context f10185a;

    /* renamed from: a */
    public String mo20805a() {
        return "t_sp";
    }

    /* renamed from: b */
    public void mo20807b() {
    }

    /* renamed from: c */
    private Context m12998c() {
        Context context = this.f10185a;
        return context == null ? C3578m.m11231a() : context;
    }

    /* renamed from: a */
    public Cursor mo20803a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> b;
        if (!uri.getPath().split("/")[2].equals("get_all") || (b = C3967b.m12993b(m12998c(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String next : b.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = next;
            objArr[2] = b.get(next);
            if (objArr[2] instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (objArr[2] instanceof String) {
                objArr[1] = "string";
            } else if (objArr[2] instanceof Integer) {
                objArr[1] = "int";
            } else if (objArr[2] instanceof Long) {
                objArr[1] = Constants.LONG;
            } else if (objArr[2] instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    /* renamed from: a */
    public String mo20806a(Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return C3967b.m12990a(C3578m.m11231a(), uri.getQueryParameter("sp_file_name"), str2) + "";
        }
        return "" + C3967b.m12985a(m12998c(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    /* renamed from: a */
    public Uri mo20804a(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            C3967b.m12988a(m12998c(), uri.getQueryParameter("sp_file_name"), str2, obj);
        }
        return null;
    }

    /* renamed from: a */
    public int mo20802a(Uri uri, String str, String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[2].equals("clean")) {
            C3967b.m12987a(m12998c(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (C3967b.m12990a(m12998c(), uri.getQueryParameter("sp_file_name"), str2)) {
            C3967b.m12994b(m12998c(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    /* renamed from: a */
    public int mo20801a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        mo20804a(uri, contentValues);
        return 0;
    }
}
