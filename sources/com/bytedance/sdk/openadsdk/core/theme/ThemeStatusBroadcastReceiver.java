package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.C2975l;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private WeakReference<C3646a> f9261a;

    public void onReceive(Context context, Intent intent) {
        C2975l.m8384b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent != null) {
            int intExtra = intent.getIntExtra("theme_status_change", 0);
            WeakReference<C3646a> weakReference = this.f9261a;
            if (weakReference != null && weakReference.get() != null) {
                ((C3646a) this.f9261a.get()).mo20232a(intExtra);
            }
        }
    }
}
