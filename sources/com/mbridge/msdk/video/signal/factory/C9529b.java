package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.p346bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.signal.C9413a;
import com.mbridge.msdk.video.signal.C9431b;
import com.mbridge.msdk.video.signal.C9432c;
import com.mbridge.msdk.video.signal.C9526e;
import com.mbridge.msdk.video.signal.C9527f;
import com.mbridge.msdk.video.signal.C9531h;
import com.mbridge.msdk.video.signal.C9532i;
import com.mbridge.msdk.video.signal.p369a.C9423h;
import com.mbridge.msdk.video.signal.p369a.C9424i;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import com.mbridge.msdk.video.signal.p369a.C9427k;
import com.mbridge.msdk.video.signal.p369a.C9428l;
import com.mbridge.msdk.video.signal.p369a.C9429m;
import com.mbridge.msdk.video.signal.p369a.C9430n;

/* renamed from: com.mbridge.msdk.video.signal.factory.b */
/* compiled from: JSFactory */
public final class C9529b extends C9528a {

    /* renamed from: h */
    private Activity f23360h;

    /* renamed from: i */
    private WebView f23361i;

    /* renamed from: j */
    private MBridgeVideoView f23362j;

    /* renamed from: k */
    private MBridgeContainerView f23363k;

    /* renamed from: l */
    private CampaignEx f23364l;

    /* renamed from: m */
    private MBridgeBTContainer f23365m;

    /* renamed from: n */
    private C9432c.C9433a f23366n;

    /* renamed from: o */
    private String f23367o;

    public C9529b(Activity activity) {
        this.f23360h = activity;
    }

    public C9529b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f23360h = activity;
        this.f23365m = mBridgeBTContainer;
        this.f23361i = webView;
    }

    public C9529b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C9432c.C9433a aVar) {
        this.f23360h = activity;
        this.f23361i = webView;
        this.f23362j = mBridgeVideoView;
        this.f23363k = mBridgeContainerView;
        this.f23364l = campaignEx;
        this.f23366n = aVar;
        this.f23367o = mBridgeVideoView.getUnitId();
    }

    public final C9413a getActivityProxy() {
        if (this.f23361i == null) {
            return super.getActivityProxy();
        }
        if (this.f23353a == null) {
            this.f23353a = new C9423h(this.f23361i);
        }
        return this.f23353a;
    }

    public final C9527f getJSNotifyProxy() {
        if (this.f23361i == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f23356d == null) {
            this.f23356d = new C9428l(this.f23361i);
        }
        return this.f23356d;
    }

    public final C9432c getJSCommon() {
        if (this.f23360h == null || this.f23364l == null) {
            return super.getJSCommon();
        }
        if (this.f23354b == null) {
            this.f23354b = new C9425j(this.f23360h, this.f23364l);
        }
        this.f23354b.mo62813a(this.f23360h);
        this.f23354b.mo62816a(this.f23367o);
        this.f23354b.mo62814a(this.f23366n);
        return this.f23354b;
    }

    public final C9532i getJSVideoModule() {
        if (this.f23362j == null) {
            return super.getJSVideoModule();
        }
        if (this.f23355c == null) {
            this.f23355c = new C9430n(this.f23362j);
        }
        return this.f23355c;
    }

    public final C9526e getJSContainerModule() {
        if (this.f23363k == null) {
            return super.getJSContainerModule();
        }
        if (this.f23357e == null) {
            this.f23357e = new C9427k(this.f23363k);
        }
        return this.f23357e;
    }

    public final C9531h getIJSRewardVideoV1() {
        if (this.f23363k == null || this.f23360h == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f23358f == null) {
            this.f23358f = new C9429m(this.f23360h, this.f23363k);
        }
        return this.f23358f;
    }

    public final C9431b getJSBTModule() {
        if (this.f23360h == null || this.f23365m == null) {
            return super.getJSBTModule();
        }
        if (this.f23359g == null) {
            this.f23359g = new C9424i(this.f23360h, this.f23365m);
        }
        return this.f23359g;
    }

    /* renamed from: a */
    public final void mo63067a(C9425j jVar) {
        this.f23354b = jVar;
    }
}
