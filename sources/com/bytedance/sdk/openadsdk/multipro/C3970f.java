package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3915b;
import com.bytedance.sdk.openadsdk.multipro.p184c.C3957a;
import com.bytedance.sdk.openadsdk.multipro.p184c.C3964b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3968c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.f */
/* compiled from: TTProviderManager */
public class C3970f implements C3913a {

    /* renamed from: a */
    private static volatile C3970f f10188a;

    /* renamed from: b */
    private static WeakReference<Context> f10189b;

    /* renamed from: c */
    private static List<C3913a> f10190c;

    /* renamed from: c */
    private boolean m13009c(Uri uri) {
        return true;
    }

    /* renamed from: a */
    public String mo20805a() {
        return "";
    }

    /* renamed from: b */
    public void mo20807b() {
    }

    static {
        List<C3913a> synchronizedList = Collections.synchronizedList(new ArrayList());
        f10190c = synchronizedList;
        synchronizedList.add(new C3968c());
        f10190c.add(new C3915b());
        f10190c.add(new C3964b());
        f10190c.add(new C3957a());
        for (C3913a b : f10190c) {
            b.mo20807b();
        }
    }

    /* renamed from: a */
    public static C3970f m13007a(Context context) {
        if (context != null) {
            f10189b = new WeakReference<>(context.getApplicationContext());
        }
        if (f10188a == null) {
            synchronized (C3970f.class) {
                if (f10188a == null) {
                    f10188a = new C3970f();
                }
            }
        }
        return f10188a;
    }

    private C3970f() {
    }

    /* renamed from: b */
    private C3913a m13008b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!m13009c(uri)) {
            C2975l.m8384b("TTProviderManager", "uri is error1");
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            C2975l.m8384b("TTProviderManager", "uri is error2");
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            C2975l.m8384b("TTProviderManager", "uri is error3");
            return null;
        }
        for (C3913a next : f10190c) {
            if (str.equals(next.mo20805a())) {
                return next;
            }
        }
        C2975l.m8384b("TTProviderManager", "uri is error4");
        return null;
    }

    /* renamed from: a */
    public Cursor mo20803a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            C3913a b = m13008b(uri);
            if (b != null) {
                return b.mo20803a(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable th) {
            C2975l.m8379a("TTProviderManager", "==provider query error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public String mo20806a(Uri uri) {
        try {
            C3913a b = m13008b(uri);
            if (b != null) {
                return b.mo20806a(uri);
            }
            return null;
        } catch (Throwable th) {
            C2975l.m8379a("TTProviderManager", "==provider getType error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public Uri mo20804a(Uri uri, ContentValues contentValues) {
        try {
            C3913a b = m13008b(uri);
            if (b != null) {
                return b.mo20804a(uri, contentValues);
            }
            return null;
        } catch (Throwable th) {
            C2975l.m8379a("TTProviderManager", "==provider insert error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public int mo20802a(Uri uri, String str, String[] strArr) {
        try {
            C3913a b = m13008b(uri);
            if (b != null) {
                return b.mo20802a(uri, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            C2975l.m8379a("TTProviderManager", "==provider delete error==", th);
            return 0;
        }
    }

    /* renamed from: a */
    public int mo20801a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            C3913a b = m13008b(uri);
            if (b != null) {
                return b.mo20801a(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            C2975l.m8379a("TTProviderManager", "==provider update error==", th);
            return 0;
        }
    }
}
