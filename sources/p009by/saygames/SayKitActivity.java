package p009by.saygames;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.firebase.messaging.Constants;
import com.unity3d.player.UnityPlayerActivity;

/* renamed from: by.saygames.SayKitActivity */
public class SayKitActivity extends UnityPlayerActivity {
    private boolean isApplicationStarted = false;
    /* access modifiers changed from: private */
    public InstallReferrerClient referrerClient;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String string;
        SayActivityLifecycle.instance.registerActivityLifecycle(getApplication());
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey(Constants.MessagePayloadKeys.MSGID)) {
            String string2 = extras.getString(Constants.MessagePayloadKeys.MSGID);
            if (string2 != null && !string2.isEmpty()) {
                SayKitNotifications.isAppLaunchedFromNotification = true;
            }
            if (extras.containsKey("extra") && (string = extras.getString("extra")) != null && !string.isEmpty()) {
                SayKitNotifications.extraAppLaunchedFromNotification = string;
            }
        }
        if (!this.isApplicationStarted) {
            this.isApplicationStarted = true;
            SayKitEvents.ApplicationStartTimestamp = (int) (System.currentTimeMillis() / 1000);
            SayKitExternalEventManager.InitExternalEventManagers();
            InstallReferrerClient build = InstallReferrerClient.newBuilder(this).build();
            this.referrerClient = build;
            build.startConnection(new InstallReferrerStateListener() {
                public void onInstallReferrerServiceDisconnected() {
                }

                public void onInstallReferrerSetupFinished(int i) {
                    int i2 = 1;
                    if (i == 0) {
                        try {
                            ReferrerDetails installReferrer = SayKitActivity.this.referrerClient.getInstallReferrer();
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            int referrerClickTimestampSeconds = (int) installReferrer.getReferrerClickTimestampSeconds();
                            int installBeginTimestampSeconds = (int) installReferrer.getInstallBeginTimestampSeconds();
                            if (!installReferrer.getGooglePlayInstantParam()) {
                                i2 = 0;
                            }
                            SayKit.SetReferenceData(installReferrer2, referrerClickTimestampSeconds, installBeginTimestampSeconds, i2, "", false);
                            SayKitActivity.this.referrerClient.endConnection();
                        } catch (Error | Exception e) {
                            SayKitActivity.this.referrerClient.endConnection();
                            SayKit.SetReferenceData("", 0, 0, 0, e.getMessage(), true);
                        }
                    } else if (i == 1) {
                        SayKit.SetReferenceData("", 0, 0, 0, "SERVICE_UNAVAILABLE", true);
                    } else if (i == 2) {
                        SayKit.SetReferenceData("", 0, 0, 0, "FEATURE_NOT_SUPPORTED", true);
                    }
                }
            });
        }
    }
}
