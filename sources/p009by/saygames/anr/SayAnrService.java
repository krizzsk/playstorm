package p009by.saygames.anr;

import android.os.Build;
import android.util.Log;
import com.adcolony.sdk.AdColonyAppOptions;
import com.github.anrwatchdog.ANRError;
import com.github.anrwatchdog.ANRWatchDog;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.unity3d.player.UnityPlayer;
import p009by.saygames.SayActivityLifecycle;
import p009by.saygames.SayKit;
import p009by.saygames.SayKitEvents;

/* renamed from: by.saygames.anr.SayAnrService */
public class SayAnrService {
    public static SayAnrService instance = new SayAnrService();
    private EANRBehaviorType _anrBehaviorType = EANRBehaviorType.None;
    private int _anrTimeout = 10000;
    private final int _minAnrTimeout = 5000;

    public void initialize(int i, int i2, int i3) {
        if (i == 1) {
            int i4 = i2 * 1000;
            if (i4 >= 5000) {
                this._anrTimeout = i4;
            }
            this._anrBehaviorType = EANRBehaviorType.ConvertIntToEANRBehaviorType(i3);
            StartANRWatchDog();
        }
    }

    private void StartANRWatchDog() {
        new ANRWatchDog(this._anrTimeout).setANRListener(new ANRWatchDog.ANRListener() {
            public final void onAppNotResponding(ANRError aNRError) {
                SayAnrService.this.lambda$StartANRWatchDog$0$SayAnrService(aNRError);
            }
        }).start();
    }

    public /* synthetic */ void lambda$StartANRWatchDog$0$SayAnrService(ANRError aNRError) {
        String stackTraceString = Log.getStackTraceString(aNRError);
        if (stackTraceString.length() > 3000) {
            stackTraceString = stackTraceString.substring(0, 3000);
        }
        boolean z = !SayActivityLifecycle.instance.IsApplicationPaused();
        SayKitEvents.track("anr", SayKit.CurrentAdType, z ? 1 : 0, stackTraceString, SayKit.CurrentViewName);
        FirebaseCrashlytics.getInstance().recordException(aNRError);
        switch (this._anrBehaviorType) {
            case UnityBackgroundOnly:
                if (SayKit.CurrentViewName.equals(AdColonyAppOptions.UNITY) && SayActivityLifecycle.instance.IsApplicationPaused()) {
                    Finish(z, stackTraceString);
                    return;
                }
                return;
            case NetworksBackgroundOnly:
                if (!SayKit.CurrentViewName.equals(AdColonyAppOptions.UNITY) && SayActivityLifecycle.instance.IsApplicationPaused()) {
                    Finish(z, stackTraceString);
                    return;
                }
                return;
            case UnityAndNetworksBackground:
                if (SayActivityLifecycle.instance.IsApplicationPaused()) {
                    Finish(z, stackTraceString);
                    return;
                }
                return;
            case NetworksBackgroundAndForeground:
                if (!SayKit.CurrentViewName.equals(AdColonyAppOptions.UNITY)) {
                    Finish(z, stackTraceString);
                    return;
                }
                return;
            case UnityBackgroundAndNetworksBackgroundAndForeground:
                if (!SayKit.CurrentViewName.equals(AdColonyAppOptions.UNITY)) {
                    Finish(z, stackTraceString);
                    return;
                } else if (SayActivityLifecycle.instance.IsApplicationPaused()) {
                    Finish(z, stackTraceString);
                    return;
                } else {
                    return;
                }
            case All:
                Finish(z, stackTraceString);
                return;
            default:
                return;
        }
    }

    private void Finish(int i, String str) {
        SayKitEvents.track("anr_exit", SayKit.CurrentAdType, i, str, SayKit.CurrentViewName);
        if (Build.VERSION.SDK_INT >= 21) {
            UnityPlayer.currentActivity.finishAndRemoveTask();
        } else {
            UnityPlayer.currentActivity.finishAffinity();
        }
    }
}
