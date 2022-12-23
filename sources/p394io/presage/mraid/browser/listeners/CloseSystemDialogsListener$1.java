package p394io.presage.mraid.browser.listeners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p376ed.internal.C10612hy;
import com.ogury.p376ed.internal.C10765mq;

/* renamed from: io.presage.mraid.browser.listeners.CloseSystemDialogsListener$1 */
public final class CloseSystemDialogsListener$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C10612hy f29359a;

    public CloseSystemDialogsListener$1(C10612hy hyVar) {
        this.f29359a = hyVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(intent, SDKConstants.PARAM_INTENT);
        if (this.f29359a.f26787b.mo67567d()) {
            this.f29359a.m32336c();
        }
    }
}
