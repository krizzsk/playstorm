package com.ironsource.sdk.p298k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.environment.C6399a;
import com.ironsource.sdk.p293g.C8349e;
import com.ironsource.sdk.p294h.C8355c;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.sdk.k.a */
public final class C8371a extends Handler {

    /* renamed from: a */
    public C8376c f20077a;

    public C8371a(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (this.f20077a == null) {
            Logger.m24028i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            if (message.what != 1016) {
                this.f20077a.mo56577a((C8355c) message.obj, new C8349e(message.what, C6399a.C64001.m19211a(message.what)));
                return;
            }
            this.f20077a.mo56576a((C8355c) message.obj);
        } catch (Throwable th) {
            Logger.m24028i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
