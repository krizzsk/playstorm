package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.controller.C2350a;

/* renamed from: com.mbridge.msdk.mbsignalcommon.base.c */
/* compiled from: IntentFilter */
public final class C8795c implements C8793a {
    /* renamed from: a */
    public final boolean mo58206a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equals(SDKConstants.PARAM_INTENT)) {
            return false;
        }
        return C2309b.m5451d(C2350a.m5601e().mo15792g(), str);
    }
}
