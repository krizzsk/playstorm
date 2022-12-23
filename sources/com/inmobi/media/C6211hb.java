package com.inmobi.media;

import java.io.IOException;
import java.net.SocketTimeoutException;
import p398ms.p399bd.p400o.Pgl.C12379c;

/* renamed from: com.inmobi.media.hb */
/* compiled from: VastBitRateNetworkConnection */
public final class C6211hb extends C6204gv {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6207gy mo35383a() {
        return super.mo35383a();
    }

    public C6211hb(C6206gx gxVar) {
        super(gxVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C6207gy mo35384b() {
        C6207gy gyVar = new C6207gy();
        try {
            this.f15699c.getResponseCode();
            gyVar.f15723b = this.f15699c.getContentLength();
            this.f15699c.disconnect();
        } catch (SocketTimeoutException unused) {
            gyVar.f15722a = new C6205gw(C12379c.COLLECT_MODE_TIKTOK_GUEST, "HTTP_GATEWAY_TIMEOUT");
        } catch (IOException unused2) {
            gyVar.f15722a = new C6205gw(-2, "NETWORK_IO_ERROR");
        } catch (OutOfMemoryError unused3) {
            gyVar.f15722a = new C6205gw(-3, "OUT_OF_MEMORY_ERROR");
        } catch (Exception unused4) {
            gyVar.f15722a = new C6205gw(-1, "UNKNOWN_ERROR");
        } catch (Throwable th) {
            this.f15699c.disconnect();
            throw th;
        }
        return gyVar;
    }
}
