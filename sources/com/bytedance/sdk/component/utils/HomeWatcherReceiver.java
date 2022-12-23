package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class HomeWatcherReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C2957a f6726a;

    /* renamed from: com.bytedance.sdk.component.utils.HomeWatcherReceiver$a */
    public interface C2957a {
        /* renamed from: a */
        void mo17885a();

        /* renamed from: b */
        void mo17886b();
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: " + action);
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra(IronSourceConstants.EVENTS_ERROR_REASON);
                Log.i("HomeReceiver", "reason: " + stringExtra);
                if ("homekey".equals(stringExtra)) {
                    Log.i("HomeReceiver", "homekey");
                    C2957a aVar = this.f6726a;
                    if (aVar != null) {
                        aVar.mo17885a();
                    }
                } else if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    C2957a aVar2 = this.f6726a;
                    if (aVar2 != null) {
                        aVar2.mo17886b();
                    }
                } else if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17883a(C2957a aVar) {
        this.f6726a = aVar;
    }
}
