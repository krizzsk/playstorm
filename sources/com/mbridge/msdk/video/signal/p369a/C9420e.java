package com.mbridge.msdk.video.signal.p369a;

import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.C9527f;

/* renamed from: com.mbridge.msdk.video.signal.a.e */
/* compiled from: DefaultJSNotifyProxy */
public class C9420e implements C9527f {
    /* renamed from: a */
    public void mo62839a(int i) {
        C8608u.m24880a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i);
    }

    /* renamed from: a */
    public void mo62841a(int i, String str) {
        C8608u.m24880a("DefaultJSNotifyProxy", "onClick:" + i + ",pt:" + str);
    }

    /* renamed from: a */
    public void mo62842a(MBridgeVideoView.C9382a aVar) {
        C8608u.m24880a("DefaultJSNotifyProxy", "onProgressNotify:" + aVar.toString());
    }

    /* renamed from: a */
    public void mo62843a(Object obj) {
        C8608u.m24880a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    /* renamed from: a */
    public void mo62840a(int i, int i2, int i3, int i4) {
        C8608u.m24880a("DefaultJSNotifyProxy", "showDataInfo");
    }
}
