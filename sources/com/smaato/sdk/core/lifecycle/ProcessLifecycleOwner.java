package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;

public final class ProcessLifecycleOwner {
    private static final ProcessLifecycleOwner instance = new ProcessLifecycleOwner();
    private final Runnable delayedPauseRunnable = new Runnable() {
        public final void run() {
            ProcessLifecycleOwner.this.lambda$new$0$ProcessLifecycleOwner();
        }
    };
    private Handler handler;
    private Listener listener;
    private boolean pauseSent = true;
    private int resumedCounter = 0;
    private boolean shouldTriggerFirstActivityStarted;
    private int startedCounter = 0;
    private boolean stopSent = true;

    public interface Listener {
        void onFirstActivityStarted();

        void onLastActivityStopped();
    }

    public /* synthetic */ void lambda$new$0$ProcessLifecycleOwner() {
        dispatchPauseIfNeeded();
        dispatchStopIfNeeded();
    }

    private ProcessLifecycleOwner() {
    }

    public static ProcessLifecycleOwner get() {
        return instance;
    }

    static void init(Context context, Handler handler2) {
        instance.attach(context, handler2);
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
        if (this.shouldTriggerFirstActivityStarted) {
            listener2.onFirstActivityStarted();
        }
    }

    /* access modifiers changed from: private */
    public void activityStarted() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            Objects.onNotNull(this.listener, $$Lambda$HwtApuc3QUgaBQWQZ1ml2AI8KI.INSTANCE);
            this.shouldTriggerFirstActivityStarted = true;
            this.stopSent = false;
        }
    }

    /* access modifiers changed from: private */
    public void activityResumed() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i != 1) {
            return;
        }
        if (this.pauseSent) {
            this.pauseSent = false;
        } else {
            Objects.onNotNull(this.handler, new Consumer() {
                public final void accept(Object obj) {
                    ProcessLifecycleOwner.this.lambda$activityResumed$1$ProcessLifecycleOwner((Handler) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$activityResumed$1$ProcessLifecycleOwner(Handler handler2) {
        handler2.removeCallbacks(this.delayedPauseRunnable);
    }

    /* access modifiers changed from: private */
    public void activityPaused() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Objects.onNotNull(this.handler, new Consumer() {
                public final void accept(Object obj) {
                    ProcessLifecycleOwner.this.lambda$activityPaused$2$ProcessLifecycleOwner((Handler) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$activityPaused$2$ProcessLifecycleOwner(Handler handler2) {
        handler2.postDelayed(this.delayedPauseRunnable, 700);
    }

    /* access modifiers changed from: private */
    public void activityStopped() {
        this.startedCounter--;
        dispatchStopIfNeeded();
    }

    private void dispatchPauseIfNeeded() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
        }
    }

    private void dispatchStopIfNeeded() {
        if (this.startedCounter == 0 && this.pauseSent) {
            Objects.onNotNull(this.listener, $$Lambda$Z7lSATaGlgWdfsCunN3IqpaFE0g.INSTANCE);
            this.stopSent = true;
        }
    }

    private void attach(Context context, Handler handler2) {
        this.handler = handler2;
        if (context.getApplicationContext() instanceof Application) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksAdapter() {
                public void onActivityStarted(Activity activity) {
                    ProcessLifecycleOwner.this.activityStarted();
                }

                public void onActivityResumed(Activity activity) {
                    ProcessLifecycleOwner.this.activityResumed();
                }

                public void onActivityPaused(Activity activity) {
                    ProcessLifecycleOwner.this.activityPaused();
                }

                public void onActivityStopped(Activity activity) {
                    ProcessLifecycleOwner.this.activityStopped();
                }
            });
        }
    }
}
