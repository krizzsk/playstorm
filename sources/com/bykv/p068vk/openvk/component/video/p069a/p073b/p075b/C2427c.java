package com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.p125f.C2956h;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.b.c */
/* compiled from: VideoProxyDB */
public class C2427c {

    /* renamed from: b */
    private static volatile C2427c f5144b;

    /* renamed from: a */
    private final SparseArray<Map<String, C2425a>> f5145a = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2430d f5146c;

    /* renamed from: d */
    private final Executor f5147d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C2956h(5, "video_proxy_db"));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile SQLiteStatement f5148e;

    private C2427c(Context context) {
        this.f5146c = new C2430d(context.getApplicationContext());
        this.f5145a.put(0, new ConcurrentHashMap());
        this.f5145a.put(1, new ConcurrentHashMap());
    }

    /* renamed from: a */
    public static C2427c m5902a(Context context) {
        if (f5144b == null) {
            synchronized (C2427c.class) {
                if (f5144b == null) {
                    f5144b = new C2427c(context);
                }
            }
        }
        return f5144b;
    }

    /* renamed from: a */
    public C2425a mo16135a(String str, int i) {
        C2425a aVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map map = this.f5145a.get(i);
        if (map == null) {
            aVar = null;
        } else {
            aVar = (C2425a) map.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        try {
            Cursor query = this.f5146c.getReadableDatabase().query("video_http_header_t", (String[]) null, "key=? AND flag=?", new String[]{str, String.valueOf(i)}, (String) null, (String) null, (String) null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    aVar = new C2425a(query.getString(query.getColumnIndex(SDKConstants.PARAM_KEY)), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (!(aVar == null || map == null)) {
                map.put(str, aVar);
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo16137a(final C2425a aVar) {
        if (aVar != null) {
            Map map = this.f5145a.get(aVar.f5142d);
            if (map != null) {
                map.put(aVar.f5139a, aVar);
            }
            this.f5147d.execute(new Runnable() {
                public void run() {
                    try {
                        if (C2427c.this.f5148e == null) {
                            SQLiteStatement unused = C2427c.this.f5148e = C2427c.this.f5146c.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        } else {
                            C2427c.this.f5148e.clearBindings();
                        }
                        C2427c.this.f5148e.bindString(1, aVar.f5139a);
                        C2427c.this.f5148e.bindString(2, aVar.f5140b);
                        C2427c.this.f5148e.bindLong(3, (long) aVar.f5141c);
                        C2427c.this.f5148e.bindLong(4, (long) aVar.f5142d);
                        C2427c.this.f5148e.bindString(5, aVar.f5143e);
                        C2427c.this.f5148e.executeInsert();
                    } catch (Throwable unused2) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo16138a(Collection<String> collection, int i) {
        if (collection != null && !collection.isEmpty()) {
            int size = collection.size() + 1;
            String[] strArr = new String[size];
            int i2 = -1;
            Map map = this.f5145a.get(i);
            for (String next : collection) {
                if (map != null) {
                    map.remove(next);
                }
                i2++;
                strArr[i2] = next;
            }
            strArr[i2 + 1] = String.valueOf(i);
            try {
                SQLiteDatabase writableDatabase = this.f5146c.getWritableDatabase();
                writableDatabase.delete("video_http_header_t", "key IN(" + m5904b(size) + ") AND " + "flag" + "=?", strArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private String m5904b(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo16136a(final int i) {
        Map map = this.f5145a.get(i);
        if (map != null) {
            map.clear();
        }
        this.f5147d.execute(new Runnable() {
            public void run() {
                try {
                    C2427c.this.f5146c.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
