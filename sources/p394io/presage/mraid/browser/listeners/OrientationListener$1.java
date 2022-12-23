package p394io.presage.mraid.browser.listeners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p376ed.internal.C10615ia;
import com.ogury.p376ed.internal.C10765mq;

/* renamed from: io.presage.mraid.browser.listeners.OrientationListener$1 */
public final class OrientationListener$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C10615ia f29360a;

    public OrientationListener$1(C10615ia iaVar) {
        this.f29360a = iaVar;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(intent, SDKConstants.PARAM_INTENT);
        if (C10765mq.m32772a((Object) "android.intent.action.CONFIGURATION_CHANGED", (Object) intent.getAction()) && this.f29360a.f26800c != (i = context.getResources().getConfiguration().orientation)) {
            this.f29360a.f26800c = i;
            this.f29360a.m32357c();
        }
    }
}
