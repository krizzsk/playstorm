package p009by.saygames;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: by.saygames.SayKitNotifications */
public class SayKitNotifications {
    private static final String TAG = "SayKitNotifications";
    static String extraAppLaunchedFromNotification = null;
    static boolean isAppLaunchedFromNotification = false;
    static String token = "";

    public static String getToken() {
        return token;
    }

    public static void init() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            public void onComplete(Task<String> task) {
                if (!task.isSuccessful()) {
                    SayKitLog.Log("w", SayKitNotifications.TAG, "getInstanceId failed", task.getException());
                    return;
                }
                String result = task.getResult();
                SayKitLog.Log("d", SayKitNotifications.TAG, result);
                SayKitNotifications.token = result;
            }
        });
    }
}
