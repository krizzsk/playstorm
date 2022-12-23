package com.p374my.tracker.campaign;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.p374my.tracker.obfuscated.C10104d;
import com.p374my.tracker.obfuscated.C10162q;
import com.p374my.tracker.obfuscated.C10175u0;

/* renamed from: com.my.tracker.campaign.CampaignService */
public final class CampaignService extends Service {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29931a(String str, Runnable runnable) {
        C10162q.m30391a(str, (Context) this, runnable);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C10175u0.m30440a("CampaignService: onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        C10175u0.m30440a("CampaignService: onDestroy");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        $$Lambda$CampaignService$4_DtPAJa8CckUOPIUKD3E8lEU6s r0 = new Runnable() {
            public final void run() {
                CampaignService.this.stopSelf();
            }
        };
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                C10104d.m30023a(new Runnable(stringExtra, r0) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ Runnable f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        CampaignService.this.m29931a(this.f$1, this.f$2);
                    }
                });
                return super.onStartCommand((Intent) null, i, i2);
            }
        }
        C10104d.m30023a(r0);
        return 2;
    }
}
