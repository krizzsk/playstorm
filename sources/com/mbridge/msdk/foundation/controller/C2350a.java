package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.tools.C8554aa;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.controller.a */
/* compiled from: MBSDKContext */
public class C2350a {

    /* renamed from: a */
    public static final String f4903a = C2350a.class.getSimpleName();

    /* renamed from: b */
    public static List<String> f4904b = new ArrayList();

    /* renamed from: c */
    public static HashMap<String, String> f4905c = new HashMap<>();

    /* renamed from: d */
    private static C2350a f4906d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f4907e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f4908f;

    /* renamed from: g */
    private String f4909g;

    /* renamed from: h */
    private int f4910h = 0;

    /* renamed from: i */
    private JSONObject f4911i;

    /* renamed from: j */
    private int f4912j;

    /* renamed from: k */
    private boolean f4913k = false;

    /* renamed from: l */
    private int f4914l;

    /* renamed from: m */
    private WeakReference<Context> f4915m;

    /* renamed from: n */
    private WeakReference<Activity> f4916n;

    /* renamed from: o */
    private String f4917o;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$b */
    /* compiled from: MBSDKContext */
    public interface C2356b {
    }

    /* renamed from: a */
    public final WeakReference<Activity> mo15776a() {
        return this.f4916n;
    }

    /* renamed from: a */
    public final void mo15781a(WeakReference<Activity> weakReference) {
        this.f4916n = weakReference;
    }

    /* renamed from: a */
    public final void mo15777a(int i) {
        this.f4912j = i;
    }

    /* renamed from: b */
    public final String mo15783b() {
        try {
            if (this.f4907e != null) {
                return this.f4907e.getPackageName();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final Context mo15787c() {
        WeakReference<Context> weakReference = this.f4915m;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    /* renamed from: a */
    public final void mo15778a(Context context) {
        this.f4915m = new WeakReference<>(context);
    }

    /* renamed from: d */
    public final void mo15790d() {
        try {
            if (this.f4915m != null) {
                this.f4915m.clear();
            }
        } catch (Throwable th) {
            C8608u.m24884d(f4903a, th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo15780a(String str) {
        try {
            this.f4917o = str;
            if (!TextUtils.isEmpty(str) && this.f4907e != null) {
                C8554aa.m24732a(this.f4907e, "applicationIds", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private C2350a() {
    }

    /* renamed from: e */
    public static synchronized C2350a m5601e() {
        C2350a aVar;
        synchronized (C2350a.class) {
            if (f4906d == null) {
                f4906d = new C2350a();
            }
            aVar = f4906d;
        }
        return aVar;
    }

    /* renamed from: f */
    public final int mo15791f() {
        return this.f4914l;
    }

    /* renamed from: b */
    public final void mo15784b(int i) {
        this.f4914l = i;
    }

    /* renamed from: a */
    public final void mo15779a(C2356b bVar, final Handler handler) {
        if (!this.f4913k) {
            try {
                JSONObject jSONObject = new JSONObject();
                this.f4911i = jSONObject;
                jSONObject.put("webgl", 0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Object b = C8554aa.m24733b(this.f4907e, "ga_id", "-1");
                if (b != null && (b instanceof String)) {
                    String str = (String) b;
                    if (C8556ac.m24738b(str) && !"-1".equals(str) && C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                        C8596q.m24820a(str);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            new Thread(new Runnable() {
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0031 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0052 */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0064 A[Catch:{ Exception -> 0x007c }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r2 = this;
                        com.mbridge.msdk.foundation.controller.authoritycontroller.a r0 = com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a.m5633a()
                        java.lang.String r1 = "authority_device_id"
                        boolean r0 = r0.mo15819a((java.lang.String) r1)
                        if (r0 == 0) goto L_0x0052
                        java.lang.String r0 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
                        java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.this     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        android.content.Context r0 = r0.f4907e     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        java.lang.String r1 = r0.getId()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.tools.C8596q.m24820a((java.lang.String) r1)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.this     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.C2350a.m5599a((com.mbridge.msdk.foundation.controller.C2350a) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        goto L_0x0052
                    L_0x002c:
                        r0 = move-exception
                        r0.printStackTrace()
                        goto L_0x0052
                    L_0x0031:
                        com.mbridge.msdk.foundation.controller.a$a r0 = new com.mbridge.msdk.foundation.controller.a$a     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.this     // Catch:{ Exception -> 0x0052 }
                        r0.<init>()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.this     // Catch:{ Exception -> 0x0052 }
                        android.content.Context r1 = r1.f4907e     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a$a$a r0 = r0.mo15798a(r1)     // Catch:{ Exception -> 0x0052 }
                        java.lang.String r1 = r0.mo15799a()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.tools.C8596q.m24820a((java.lang.String) r1)     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.this     // Catch:{ Exception -> 0x0052 }
                        java.lang.String r0 = r0.mo15799a()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.C2350a.m5599a((com.mbridge.msdk.foundation.controller.C2350a) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0052 }
                    L_0x0052:
                        com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x007c }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x007c }
                        java.lang.String r1 = r1.mo15793h()     // Catch:{ Exception -> 0x007c }
                        com.mbridge.msdk.c.a r0 = r0.mo15563b(r1)     // Catch:{ Exception -> 0x007c }
                        if (r0 != 0) goto L_0x006c
                        com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x007c }
                        com.mbridge.msdk.c.a r0 = r0.mo15562b()     // Catch:{ Exception -> 0x007c }
                    L_0x006c:
                        android.os.Message r1 = android.os.Message.obtain()     // Catch:{ Exception -> 0x007c }
                        r1.obj = r0     // Catch:{ Exception -> 0x007c }
                        r0 = 9
                        r1.what = r0     // Catch:{ Exception -> 0x007c }
                        android.os.Handler r0 = r4     // Catch:{ Exception -> 0x007c }
                        r0.sendMessage(r1)     // Catch:{ Exception -> 0x007c }
                        goto L_0x0080
                    L_0x007c:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x0080:
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.this     // Catch:{ Exception -> 0x0099 }
                        android.content.Context r0 = r0.f4907e     // Catch:{ Exception -> 0x0099 }
                        com.mbridge.msdk.foundation.tools.C8596q.m24824b((android.content.Context) r0)     // Catch:{ Exception -> 0x0099 }
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.this     // Catch:{ Exception -> 0x0099 }
                        android.content.Context r0 = r0.f4907e     // Catch:{ Exception -> 0x0099 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.this     // Catch:{ Exception -> 0x0099 }
                        java.lang.String r1 = r1.f4908f     // Catch:{ Exception -> 0x0099 }
                        com.mbridge.msdk.p054c.C2283b.m5276a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0099 }
                        goto L_0x009d
                    L_0x0099:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x009d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C2350a.C23511.run():void");
                }
            }).start();
        }
    }

    /* renamed from: g */
    public final Context mo15792g() {
        return this.f4907e;
    }

    /* renamed from: b */
    public final void mo15785b(Context context) {
        this.f4907e = context;
    }

    /* renamed from: h */
    public final String mo15793h() {
        try {
            if (!TextUtils.isEmpty(this.f4908f)) {
                return this.f4908f;
            }
            if (this.f4907e != null) {
                return (String) C8554aa.m24733b(this.f4907e, "sp_appId", "");
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo15786b(String str) {
        try {
            this.f4908f = str;
            if (!TextUtils.isEmpty(str) && this.f4907e != null) {
                C8554aa.m24732a(this.f4907e, "sp_appId", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public final String mo15794i() {
        if (!TextUtils.isEmpty(this.f4909g)) {
            return this.f4909g;
        }
        Context context = this.f4907e;
        if (context != null) {
            return (String) C8554aa.m24733b(context, "sp_appKey", "");
        }
        return null;
    }

    /* renamed from: c */
    public final void mo15789c(String str) {
        try {
            this.f4909g = str;
            if (!TextUtils.isEmpty(str) && this.f4907e != null) {
                C8554aa.m24732a(this.f4907e, "sp_appKey", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a */
    /* compiled from: MBSDKContext */
    public class C2352a {
        public C2352a() {
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$a */
        /* compiled from: MBSDKContext */
        public final class C2353a {

            /* renamed from: b */
            private final String f4922b;

            /* renamed from: c */
            private final boolean f4923c;

            C2353a(String str, boolean z) {
                this.f4922b = str;
                this.f4923c = z;
            }

            /* renamed from: a */
            public final String mo15799a() {
                return this.f4922b;
            }
        }

        /* renamed from: a */
        public final C2353a mo15798a(Context context) throws Exception {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    C2354b bVar = new C2354b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, bVar, 1)) {
                        try {
                            C2355c cVar = new C2355c(bVar.mo15800a());
                            C2353a aVar = new C2353a(cVar.mo15803a(), cVar.mo15804a(true));
                            context.unbindService(bVar);
                            return aVar;
                        } catch (Exception e) {
                            throw e;
                        } catch (Throwable th) {
                            context.unbindService(bVar);
                            throw th;
                        }
                    } else {
                        throw new IOException("Google Play connection failed");
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$b */
        /* compiled from: MBSDKContext */
        private final class C2354b implements ServiceConnection {

            /* renamed from: a */
            boolean f4924a;

            /* renamed from: c */
            private final LinkedBlockingQueue<IBinder> f4926c;

            public final void onServiceDisconnected(ComponentName componentName) {
            }

            private C2354b() {
                this.f4924a = false;
                this.f4926c = new LinkedBlockingQueue<>(1);
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                try {
                    this.f4926c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }

            /* renamed from: a */
            public final IBinder mo15800a() throws InterruptedException {
                if (!this.f4924a) {
                    this.f4924a = true;
                    return this.f4926c.take();
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$c */
        /* compiled from: MBSDKContext */
        private final class C2355c implements IInterface {

            /* renamed from: b */
            private IBinder f4928b;

            public C2355c(IBinder iBinder) {
                this.f4928b = iBinder;
            }

            public final IBinder asBinder() {
                return this.f4928b;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public final String mo15803a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f4928b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            /* renamed from: a */
            public final boolean mo15804a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z2 = false;
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4928b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
                return z2;
            }
        }
    }

    /* renamed from: j */
    public final int mo15795j() {
        return this.f4910h;
    }

    /* renamed from: c */
    public final void mo15788c(int i) {
        this.f4910h = i;
    }

    /* renamed from: k */
    public final JSONObject mo15796k() {
        return this.f4911i;
    }

    /* renamed from: a */
    public final void mo15782a(JSONObject jSONObject) {
        this.f4911i = jSONObject;
    }

    /* renamed from: a */
    static /* synthetic */ void m5599a(C2350a aVar, String str) {
        try {
            if (C8556ac.m24738b(str)) {
                C8554aa.m24732a(aVar.f4907e, "ga_id", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
