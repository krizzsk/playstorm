package com.bytedance.sdk.openadsdk.p179k;

import android.content.ContentValues;
import android.content.Context;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3952c;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3914a;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.k.h */
/* compiled from: TrackRetryRepertoryImpl */
public class C3912h implements C3911g {

    /* renamed from: a */
    private Context f10102a;

    public C3912h(Context context) {
        this.f10102a = context;
    }

    /* renamed from: a */
    public synchronized List<C3910f> mo20797a() {
        LinkedList linkedList;
        linkedList = new LinkedList();
        C3952c cVar = new C3952c(C3914a.m12852a(this.f10102a, "trackurl", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null));
        while (cVar.moveToNext()) {
            try {
                linkedList.add(new C3910f(cVar.getString(cVar.getColumnIndex("id")), cVar.getString(cVar.getColumnIndex("url")), cVar.getInt(cVar.getColumnIndex(TapjoyConstants.TJC_RETRY))));
            } finally {
                cVar.close();
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public synchronized void mo20798a(C3910f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.mo20793a());
        contentValues.put("url", fVar.mo20795b());
        contentValues.put("replaceholder", 1);
        contentValues.put(TapjoyConstants.TJC_RETRY, Integer.valueOf(fVar.mo20796c()));
        C3914a.m12854a(this.f10102a, "trackurl", contentValues);
    }

    /* renamed from: b */
    public synchronized void mo20799b(C3910f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.mo20793a());
        contentValues.put("url", fVar.mo20795b());
        contentValues.put("replaceholder", 1);
        contentValues.put(TapjoyConstants.TJC_RETRY, Integer.valueOf(fVar.mo20796c()));
        C3914a.m12848a(this.f10102a, "trackurl", contentValues, "id=?", new String[]{fVar.mo20793a()});
    }

    /* renamed from: c */
    public synchronized void mo20800c(C3910f fVar) {
        C3914a.m12849a(this.f10102a, "trackurl", "id=?", new String[]{fVar.mo20793a()});
    }

    /* renamed from: b */
    public static String m12836b() {
        return "CREATE TABLE IF NOT EXISTS " + "trackurl" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "url" + " TEXT ," + "replaceholder" + " INTEGER default 0, " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }
}
