package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.C9413a;
import com.mbridge.msdk.video.signal.C9431b;
import com.mbridge.msdk.video.signal.C9432c;
import com.mbridge.msdk.video.signal.C9526e;
import com.mbridge.msdk.video.signal.C9527f;
import com.mbridge.msdk.video.signal.C9531h;
import com.mbridge.msdk.video.signal.C9532i;
import com.mbridge.msdk.video.signal.p369a.C9414a;
import com.mbridge.msdk.video.signal.p369a.C9415b;
import com.mbridge.msdk.video.signal.p369a.C9416c;
import com.mbridge.msdk.video.signal.p369a.C9419d;
import com.mbridge.msdk.video.signal.p369a.C9420e;
import com.mbridge.msdk.video.signal.p369a.C9421f;
import com.mbridge.msdk.video.signal.p369a.C9422g;

/* renamed from: com.mbridge.msdk.video.signal.factory.a */
/* compiled from: DefaultJSFactory */
public class C9528a implements IJSFactory {

    /* renamed from: a */
    protected C9413a f23353a;

    /* renamed from: b */
    protected C9432c f23354b;

    /* renamed from: c */
    protected C9532i f23355c;

    /* renamed from: d */
    protected C9527f f23356d;

    /* renamed from: e */
    protected C9526e f23357e;

    /* renamed from: f */
    protected C9531h f23358f;

    /* renamed from: g */
    protected C9431b f23359g;

    public C9413a getActivityProxy() {
        if (this.f23353a == null) {
            this.f23353a = new C9414a();
        }
        return this.f23353a;
    }

    public C9432c getJSCommon() {
        if (this.f23354b == null) {
            this.f23354b = new C9416c();
        }
        return this.f23354b;
    }

    public C9532i getJSVideoModule() {
        if (this.f23355c == null) {
            this.f23355c = new C9422g();
        }
        return this.f23355c;
    }

    public C9527f getJSNotifyProxy() {
        if (this.f23356d == null) {
            this.f23356d = new C9420e();
        }
        return this.f23356d;
    }

    public C9526e getJSContainerModule() {
        if (this.f23357e == null) {
            this.f23357e = new C9419d();
        }
        return this.f23357e;
    }

    public C9531h getIJSRewardVideoV1() {
        if (this.f23358f == null) {
            this.f23358f = new C9421f();
        }
        return this.f23358f;
    }

    public C9431b getJSBTModule() {
        if (this.f23359g == null) {
            this.f23359g = new C9415b();
        }
        return this.f23359g;
    }
}
