package com.p374my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p374my.tracker.obfuscated.C10175u0;

/* renamed from: com.my.tracker.campaign.CampaignReceiver */
public class CampaignReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static void m29930a(Context context, Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("referrer");
            if (TextUtils.isEmpty(string)) {
                C10175u0.m30440a("CampaignReceiver: referrer is null or empty");
                return;
            }
            C10175u0.m30440a("CampaignReceiver: got referrer " + string);
            try {
                context.startService(new Intent(context, CampaignService.class).putExtra("referrer", string));
            } catch (Throwable th) {
                C10175u0.m30444b("CampaignReceiver error: " + th.toString());
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        m29930a(context, intent);
    }
}
