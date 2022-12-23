package com.p374my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.p374my.tracker.obfuscated.C10175u0;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.campaign.MultipleInstallReceiver */
public class MultipleInstallReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f25085a = CampaignReceiver.class.getName();

    /* renamed from: b */
    private static final String f25086b = MultipleInstallReceiver.class.getName();

    /* renamed from: c */
    private static final AtomicBoolean f25087c = new AtomicBoolean();

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            if (!f25087c.compareAndSet(false, true)) {
                C10175u0.m30440a("MultipleInstallReceiver: attempt to call, but it was called before");
                return;
            }
            C10175u0.m30440a("MultipleInstallReceiver called");
            CampaignReceiver.m29930a(context, intent);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    String str = activityInfo.name;
                    if (!f25085a.equals(str) && !f25086b.equals(str)) {
                        C10175u0.m30440a("MultipleInstallReceiver: trigger onReceive class " + str);
                        try {
                            ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                        } catch (Throwable th) {
                            C10175u0.m30440a("MultipleInstallReceiver: error in BroadcastReceiver " + str + " : " + th.getMessage());
                        }
                    }
                }
            }
        }
    }
}
