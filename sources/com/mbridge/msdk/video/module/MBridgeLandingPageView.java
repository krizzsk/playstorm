package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8611x;
import com.mbridge.msdk.mbsignalcommon.base.C8793a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.factory.C9529b;

public class MBridgeLandingPageView extends MBridgeH5EndCardView {
    public MBridgeLandingPageView(Context context) {
        super(context);
    }

    public MBridgeLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        super.init(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62558a() {
        if (this.f22694b != null) {
            return C2309b.m5444a(this.f22694b.getClickURL(), "-999", "-999");
        }
        return null;
    }

    public void preLoadData(C9529b bVar) {
        if (this.f22698f) {
            this.f22779p.setFilter(new C9351a());
        }
        super.preLoadData(bVar);
        setVisibility(0);
        setCloseVisible(0);
    }

    public void webviewshow() {
        try {
            C8608u.m24880a(MBridgeBaseView.TAG, "webviewshow");
            C8824g.m25670a().mo58310a((WebView) this.f22779p, "webviewshow", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeLandingPageView$a */
    private static final class C9351a implements C8793a {
        private C9351a() {
        }

        /* renamed from: a */
        public final boolean mo58206a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            C8611x.m24903b(C2350a.m5601e().mo15792g(), str, (NativeListener.NativeTrackingListener) null);
            return true;
        }
    }
}
