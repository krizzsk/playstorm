package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.C2975l;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private WeakReference<C2746a> f6090a;

    public void onReceive(Context context, Intent intent) {
        C2975l.m8384b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent != null) {
            int intExtra = intent.getIntExtra("theme_status_change", 0);
            WeakReference<C2746a> weakReference = this.f6090a;
            if (weakReference != null && weakReference.get() != null) {
                ((C2746a) this.f6090a.get()).mo17262b(intExtra);
            }
        }
    }

    /* renamed from: a */
    public void mo17315a(C2746a aVar) {
        this.f6090a = new WeakReference<>(aVar);
    }
}
