package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;

public abstract class Lifecycling {
    /* renamed from: of */
    public static Lifecycle m32961of(View view) {
        return new ViewLifecycle(view);
    }

    /* renamed from: of */
    public static Lifecycle m32960of(Activity activity) {
        return new ActivityLifecycle(activity);
    }

    public static Lifecycle wrap(LifecycleOwner lifecycleOwner) {
        return new AndroidXLifecycle(lifecycleOwner);
    }
}
