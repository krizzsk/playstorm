package com.mbridge.msdk.foundation.p066db;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.C8406g;
import com.vungle.warren.model.AdvertisementDBAdapter;

/* renamed from: com.mbridge.msdk.foundation.db.n */
/* compiled from: UnitIDDao */
public final class C2383n extends C2365a<C8406g> {

    /* renamed from: a */
    private static C2383n f5002a;

    private C2383n(C2374f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public static synchronized C2383n m5764a(C2374f fVar) {
        C2383n nVar;
        synchronized (C2383n.class) {
            if (f5002a == null) {
                f5002a = new C2383n(fVar);
            }
            nVar = f5002a;
        }
        return nVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.database.Cursor} */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<com.mbridge.msdk.foundation.entity.h>] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:25|(2:39|40)|41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0074 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[SYNTHETIC, Splitter:B:31:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071 A[SYNTHETIC, Splitter:B:39:0x0071] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.C8407h> mo15923a(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "select * from unit_id WHERE ad_type = "
            r0.append(r1)     // Catch:{ all -> 0x0075 }
            r0.append(r6)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0075 }
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.getReadableDatabase()     // Catch:{ Exception -> 0x0062 }
            android.database.Cursor r0 = r2.rawQuery(r0, r1)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x005a
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            if (r2 <= 0) goto L_0x005a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            int r3 = r0.getCount()     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
        L_0x002c:
            boolean r1 = r0.moveToNext()     // Catch:{ Exception -> 0x0051, all -> 0x0053 }
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = "placement_id"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0051, all -> 0x0053 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0051, all -> 0x0053 }
            java.lang.String r3 = "unitId"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ Exception -> 0x0051, all -> 0x0053 }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x0051, all -> 0x0053 }
            com.mbridge.msdk.foundation.entity.h r4 = new com.mbridge.msdk.foundation.entity.h     // Catch:{ Exception -> 0x0051, all -> 0x0053 }
            r4.<init>(r1, r3, r6)     // Catch:{ Exception -> 0x0051, all -> 0x0053 }
            r2.add(r4)     // Catch:{ Exception -> 0x0051, all -> 0x0053 }
            goto L_0x002c
        L_0x004f:
            r1 = r2
            goto L_0x005a
        L_0x0051:
            r6 = move-exception
            goto L_0x0058
        L_0x0053:
            r6 = move-exception
            r1 = r0
            goto L_0x006f
        L_0x0056:
            r6 = move-exception
            r2 = r1
        L_0x0058:
            r1 = r0
            goto L_0x0064
        L_0x005a:
            if (r0 == 0) goto L_0x006d
            r0.close()     // Catch:{ Exception -> 0x006d }
            goto L_0x006d
        L_0x0060:
            r6 = move-exception
            goto L_0x006f
        L_0x0062:
            r6 = move-exception
            r2 = r1
        L_0x0064:
            r6.printStackTrace()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            r1 = r2
        L_0x006d:
            monitor-exit(r5)
            return r1
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            throw r6     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2383n.mo15923a(int):java.util.List");
    }

    /* renamed from: a */
    public final synchronized void mo15924a(String str) {
        if (getWritableDatabase() != null) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    /* renamed from: a */
    public final synchronized void mo15925a(String str, String str2, int i) {
        if (getWritableDatabase() != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, str);
            contentValues.put("unitId", str2);
            contentValues.put("ad_type", Integer.valueOf(i));
            getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, (String) null, contentValues);
        }
    }
}
