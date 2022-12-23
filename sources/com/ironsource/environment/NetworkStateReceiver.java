package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.ironsource.environment.p205e.C6423c;

public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private ConnectivityManager f16272a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6433j f16273b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f16274c = false;

    public NetworkStateReceiver(Context context, C6433j jVar) {
        this.f16273b = jVar;
        this.f16272a = (ConnectivityManager) context.getSystemService("connectivity");
        m19207a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19207a() {
        /*
            r4 = this;
            boolean r0 = r4.f16274c
            android.net.ConnectivityManager r1 = r4.f16272a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r1 = r1.isConnectedOrConnecting()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            r4.f16274c = r1     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r4.f16274c = r3
        L_0x001c:
            boolean r1 = r4.f16274c
            if (r0 == r1) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.m19207a():boolean");
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getExtras() != null && m19207a()) {
            C6423c.m19280b(new Runnable() {
                public final void run() {
                    if (NetworkStateReceiver.this.f16273b != null) {
                        NetworkStateReceiver.this.f16273b.mo35940a(NetworkStateReceiver.this.f16274c);
                    }
                }
            }, 0);
        }
    }
}
