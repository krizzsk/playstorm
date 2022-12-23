package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.mbridge.msdk.foundation.tools.m */
/* compiled from: MIMManager */
public final class C8585m {

    /* renamed from: d */
    private static volatile String f20740d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CopyOnWriteArrayList<CampaignEx> f20741a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile C8592b f20742b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AtomicBoolean f20743c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile Boolean f20744e;

    /* renamed from: f */
    private CampaignEx f20745f;

    /* renamed from: g */
    private int f20746g;

    /* renamed from: h */
    private Context f20747h;

    /* renamed from: com.mbridge.msdk.foundation.tools.m$a */
    /* compiled from: MIMManager */
    private static final class C8591a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8585m f20764a = new C8585m();
    }

    private C8585m() {
        this.f20746g = 0;
        this.f20741a = new CopyOnWriteArrayList<>();
        this.f20743c = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static C8585m m24795a() {
        return C8591a.f20764a;
    }

    /* renamed from: a */
    public final void mo57768a(CampaignEx campaignEx) {
        try {
            if (this.f20744e != null && campaignEx != null && this.f20744e.booleanValue()) {
                this.f20745f = campaignEx;
                this.f20741a.add(campaignEx);
            }
        } catch (Exception e) {
            C8608u.m24884d("MIMManager", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo57770b(CampaignEx campaignEx) {
        try {
            if (this.f20744e != null && campaignEx != null && this.f20744e.booleanValue()) {
                this.f20745f = null;
                try {
                    this.f20741a.remove(campaignEx);
                } catch (Exception e) {
                    C8608u.m24880a("MIMManager", e.getMessage());
                }
            }
        } catch (Exception e2) {
            C8608u.m24884d("MIMManager", e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final CampaignEx mo57769b() {
        return this.f20745f;
    }

    /* renamed from: c */
    public final void mo57771c() {
        this.f20746g++;
    }

    /* renamed from: d */
    public final void mo57772d() {
        int i = this.f20746g - 1;
        this.f20746g = i;
        if (i <= 0) {
            Context context = this.f20747h;
            if (this.f20742b != null && context != null) {
                try {
                    context.unregisterReceiver(this.f20742b);
                } catch (Exception e) {
                    C8608u.m24880a("MIMManager", e.getMessage());
                } catch (Throwable th) {
                    this.f20745f = null;
                    this.f20741a.clear();
                    this.f20741a = null;
                    this.f20742b = null;
                    this.f20747h = null;
                    throw th;
                }
                this.f20745f = null;
                this.f20741a.clear();
                this.f20741a = null;
                this.f20742b = null;
                this.f20747h = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo57767a(final Context context) {
        this.f20747h = context;
        C8442b.m24388a().execute(new Runnable() {
            public final void run() {
                if (C8585m.this.f20743c.compareAndSet(false, true)) {
                    try {
                        Boolean unused = C8585m.this.f20744e = C8585m.this.m24802g();
                    } catch (Exception e) {
                        C8608u.m24880a("MIMManager", e.getMessage());
                    }
                    if (C8585m.this.f20744e != null && C8585m.this.f20744e.booleanValue() && context != null) {
                        try {
                            C8592b unused2 = C8585m.this.f20742b = new C8592b();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction(C8595p.m24815b("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                            intentFilter.addAction(C8595p.m24815b("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                            intentFilter.addAction(C8595p.m24815b("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                            context.registerReceiver(C8585m.this.f20742b, intentFilter);
                        } catch (Exception e2) {
                            C8608u.m24880a("MIMManager", e2.getMessage());
                        }
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public final Boolean mo57773e() {
        return this.f20744e;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public Boolean m24802g() {
        Cursor cursor;
        Context g = C2350a.m5601e().mo15792g();
        Boolean bool = null;
        if (g != null) {
            try {
                if (g.getContentResolver() != null) {
                    try {
                        cursor = g.getContentResolver().query(Uri.parse(C8595p.m24815b("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), (String[]) null, (String) null, (String[]) null, (String) null);
                    } catch (Exception unused) {
                        cursor = null;
                    }
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            try {
                                String string = cursor.getString(cursor.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                                    bool = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e) {
                                C8608u.m24880a("MIMManager", e.getMessage());
                            }
                            try {
                                f20740d = cursor.getString(cursor.getColumnIndex("detailStyle"));
                            } catch (Exception e2) {
                                C8608u.m24880a("MIMManager", e2.getMessage());
                            }
                        }
                        try {
                            cursor.close();
                        } catch (Exception e3) {
                            C8608u.m24880a("MIMManager", e3.getMessage());
                        }
                    }
                }
            } catch (Exception e4) {
                C8608u.m24884d("MIMManager", e4.getMessage());
            }
        }
        return bool;
    }

    /* renamed from: f */
    public final String mo57774f() {
        try {
            if (f20740d == null) {
                return "";
            }
            return String.format("[%s]", new Object[]{f20740d});
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.m$b */
    /* compiled from: MIMManager */
    private static class C8592b extends BroadcastReceiver {
        private C8592b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0083 A[Catch:{ Exception -> 0x00a8 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r0 = r10.getAction()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L_0x0019
                goto L_0x00b2
            L_0x0019:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L_0x0027
                goto L_0x00b2
            L_0x0027:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x00b2
                android.os.Bundle r10 = r10.getExtras()     // Catch:{ Exception -> 0x00a8 }
                if (r10 != 0) goto L_0x003a
                return
            L_0x003a:
                java.lang.String r0 = "statusCode"
                r1 = -1
                int r7 = r10.getInt(r0, r1)     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r0 = "packageName"
                java.lang.String r2 = ""
                java.lang.String r10 = r10.getString(r0, r2)     // Catch:{ Exception -> 0x00a8 }
                if (r7 == r1) goto L_0x00a7
                boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x00a8 }
                if (r0 == 0) goto L_0x0052
                goto L_0x00a7
            L_0x0052:
                com.mbridge.msdk.foundation.tools.m r0 = com.mbridge.msdk.foundation.tools.C8585m.C8591a.f20764a     // Catch:{ Exception -> 0x00a8 }
                com.mbridge.msdk.foundation.entity.CampaignEx r10 = r0.m24793a((java.lang.String) r10)     // Catch:{ Exception -> 0x00a8 }
                if (r10 != 0) goto L_0x005d
                return
            L_0x005d:
                com.mbridge.msdk.foundation.tools.m r0 = com.mbridge.msdk.foundation.tools.C8585m.C8591a.f20764a     // Catch:{ Exception -> 0x00a8 }
                r1 = 3001(0xbb9, float:4.205E-42)
                if (r7 == r1) goto L_0x007b
                r1 = 3002(0xbba, float:4.207E-42)
                if (r7 == r1) goto L_0x0075
                r1 = 3008(0xbc0, float:4.215E-42)
                if (r7 == r1) goto L_0x006f
                r10 = 0
                goto L_0x0081
            L_0x006f:
                com.mbridge.msdk.foundation.tools.m$2 r1 = new com.mbridge.msdk.foundation.tools.m$2     // Catch:{ Exception -> 0x00a8 }
                r1.<init>(r9, r10)     // Catch:{ Exception -> 0x00a8 }
                goto L_0x0080
            L_0x0075:
                com.mbridge.msdk.foundation.tools.m$3 r1 = new com.mbridge.msdk.foundation.tools.m$3     // Catch:{ Exception -> 0x00a8 }
                r1.<init>(r9, r10)     // Catch:{ Exception -> 0x00a8 }
                goto L_0x0080
            L_0x007b:
                com.mbridge.msdk.foundation.tools.m$4 r1 = new com.mbridge.msdk.foundation.tools.m$4     // Catch:{ Exception -> 0x00a8 }
                r1.<init>(r9, r10)     // Catch:{ Exception -> 0x00a8 }
            L_0x0080:
                r10 = r1
            L_0x0081:
                if (r10 == 0) goto L_0x008a
                java.util.concurrent.ThreadPoolExecutor r0 = com.mbridge.msdk.foundation.same.p304f.C8442b.m24388a()     // Catch:{ Exception -> 0x00a8 }
                r0.execute(r10)     // Catch:{ Exception -> 0x00a8 }
            L_0x008a:
                com.mbridge.msdk.foundation.tools.m r3 = com.mbridge.msdk.foundation.tools.C8585m.C8591a.f20764a     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r5 = "dm_page_status"
                com.mbridge.msdk.foundation.tools.m r10 = com.mbridge.msdk.foundation.tools.C8585m.C8591a.f20764a     // Catch:{ Exception -> 0x00a8 }
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r10.mo57769b()     // Catch:{ Exception -> 0x00a8 }
                java.util.concurrent.ThreadPoolExecutor r10 = com.mbridge.msdk.foundation.same.p304f.C8442b.m24388a()     // Catch:{ Exception -> 0x00a8 }
                com.mbridge.msdk.foundation.tools.m$5 r0 = new com.mbridge.msdk.foundation.tools.m$5     // Catch:{ Exception -> 0x00a8 }
                r2 = r0
                r4 = r9
                r2.<init>(r4, r5, r6, r7)     // Catch:{ Exception -> 0x00a8 }
                r10.execute(r0)     // Catch:{ Exception -> 0x00a8 }
                goto L_0x00b2
            L_0x00a7:
                return
            L_0x00a8:
                r9 = move-exception
                java.lang.String r9 = r9.getMessage()
                java.lang.String r10 = "MIMManager"
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r10, r9)
            L_0x00b2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8585m.C8592b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public CampaignEx m24793a(String str) {
        try {
            if (this.f20745f != null && TextUtils.equals(this.f20745f.getPackageName(), str)) {
                return this.f20745f;
            }
            if (this.f20741a == null || this.f20741a.size() <= 0) {
                return null;
            }
            Iterator<CampaignEx> it = this.f20741a.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && TextUtils.equals(next.getPackageName(), str)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            C8608u.m24884d("MIMManager", e.getMessage());
            return null;
        }
    }
}
