package com.smaato.sdk.core.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public final class Intents {
    private Intents() {
    }

    public static Intent createViewIntent(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static boolean tryToStartAsAppLink(Context context, String str) {
        return tryToStartIntent(context, createViewIntent(str).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT").addFlags(268436480));
    }

    public static boolean tryToStartIntent(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e(Intents.class.getSimpleName(), "Activity not found exception", e);
            return false;
        }
    }

    public static void startIntent(Context context, Intent intent) {
        Threads.runOnUi(new Runnable(context, intent) {
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ Intent f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                Intents.lambda$startIntent$0(this.f$0, this.f$1);
            }
        });
    }

    static /* synthetic */ void lambda$startIntent$0(Context context, Intent intent) {
        if (canHandleIntent(context, intent)) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    public static boolean canHandleIntent(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
