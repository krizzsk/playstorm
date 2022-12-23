package com.bykv.p068vk.openvk.component.video.p069a.p070a;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.p071a.C2401b;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.p071a.C2402c;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.a */
/* compiled from: SdkMediaDataSource */
public class C2398a extends MediaDataSource {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C2398a> f5048a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private C2401b f5049b = null;

    /* renamed from: c */
    private long f5050c = -2147483648L;

    /* renamed from: d */
    private Context f5051d;

    /* renamed from: e */
    private final C2522c f5052e;

    public C2398a(Context context, C2522c cVar) {
        this.f5051d = context;
        this.f5052e = cVar;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        m5786b();
        int a = this.f5049b.mo16076a(j, bArr, i, i2);
        C2536c.m6436b("SdkMediaDataSource", "readAt: position = " + j + "  buffer.length =" + bArr.length + "  offset = " + i + " size =" + a + "  current = " + Thread.currentThread());
        return a;
    }

    /* renamed from: b */
    private void m5786b() {
        if (this.f5049b == null) {
            this.f5049b = new C2402c(this.f5051d, this.f5052e);
        }
    }

    public long getSize() throws IOException {
        m5786b();
        if (this.f5050c == -2147483648L) {
            if (this.f5051d == null || TextUtils.isEmpty(this.f5052e.mo16398j())) {
                return -1;
            }
            this.f5050c = this.f5049b.mo16078b();
            C2536c.m6436b("SdkMediaDataSource", "getSize: " + this.f5050c);
        }
        return this.f5050c;
    }

    public void close() throws IOException {
        C2536c.m6438b("SdkMediaDataSource", "close: ", this.f5052e.mo16398j());
        C2401b bVar = this.f5049b;
        if (bVar != null) {
            bVar.mo16077a();
        }
        f5048a.remove(this.f5052e.mo16399k());
    }

    /* renamed from: a */
    public C2522c mo16064a() {
        return this.f5052e;
    }

    /* renamed from: a */
    public static C2398a m5785a(Context context, C2522c cVar) {
        C2398a aVar = new C2398a(context, cVar);
        f5048a.put(cVar.mo16399k(), aVar);
        return aVar;
    }
}
