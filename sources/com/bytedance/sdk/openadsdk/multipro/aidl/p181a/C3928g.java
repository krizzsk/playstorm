package com.bytedance.sdk.openadsdk.multipro.aidl.p181a;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;
import com.bytedance.sdk.openadsdk.multipro.C3970f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.g */
/* compiled from: ProviderListenerManagerImpl */
public class C3928g extends C3922a {

    /* renamed from: a */
    private static volatile C3928g f10129a;

    /* renamed from: a */
    public static C3928g m12883a() {
        if (f10129a == null) {
            synchronized (C3928g.class) {
                if (f10129a == null) {
                    f10129a = new C3928g();
                }
            }
        }
        return f10129a;
    }

    public Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!C3536e.m10968a()) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Cursor a = C3970f.m13007a(C3578m.m11231a()).mo20803a(uri, strArr, str, strArr2, str2);
            if (a != null) {
                String[] columnNames = a.getColumnNames();
                while (a.getCount() > 0 && a.moveToNext()) {
                    for (String str3 : columnNames) {
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new LinkedList());
                        }
                        ((List) hashMap.get(str3)).add(a.getString(a.getColumnIndex(str3)));
                    }
                }
                a.close();
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getType(Uri uri) {
        if (!C3536e.m10968a()) {
            return null;
        }
        return C3970f.m13007a(C3578m.m11231a()).mo20806a(uri);
    }

    public String insert(Uri uri, ContentValues contentValues) {
        Uri a;
        if (C3536e.m10968a() && (a = C3970f.m13007a(C3578m.m11231a()).mo20804a(uri, contentValues)) != null) {
            return a.toString();
        }
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (!C3536e.m10968a()) {
            return 0;
        }
        return C3970f.m13007a(C3578m.m11231a()).mo20802a(uri, str, strArr);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!C3536e.m10968a()) {
            return 0;
        }
        return C3970f.m13007a(C3578m.m11231a()).mo20801a(uri, contentValues, str, strArr);
    }
}
