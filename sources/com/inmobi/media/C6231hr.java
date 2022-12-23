package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.inmobi.media.hr */
/* compiled from: ApplicationFocusChangeObserver */
public class C6231hr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15789a = C6231hr.class.getSimpleName();

    /* renamed from: b */
    private static HashSet<C6235c> f15790b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f15791c = false;

    /* renamed from: com.inmobi.media.hr$b */
    /* compiled from: ApplicationFocusChangeObserver */
    static class C6234b {

        /* renamed from: a */
        static final C6231hr f15796a = new C6231hr((byte) 0);
    }

    /* renamed from: com.inmobi.media.hr$c */
    /* compiled from: ApplicationFocusChangeObserver */
    public interface C6235c {
        /* renamed from: a */
        void mo35445a(boolean z);
    }

    /* synthetic */ C6231hr(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6231hr m18586a() {
        return C6234b.f15796a;
    }

    private C6231hr() {
    }

    /* renamed from: a */
    public void mo35436a(Context context, C6235c cVar) {
        if (f15790b == null) {
            f15790b = new LinkedHashSet();
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {

                        /* renamed from: b */
                        private final Handler f15793b = new C6233a(Looper.getMainLooper());

                        /* renamed from: c */
                        private WeakReference<Activity> f15794c;

                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityDestroyed(Activity activity) {
                        }

                        public final void onActivityPaused(Activity activity) {
                        }

                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        /* renamed from: a */
                        private void m18593a(Activity activity) {
                            WeakReference<Activity> weakReference = this.f15794c;
                            if (weakReference == null || weakReference.get() != activity) {
                                this.f15794c = new WeakReference<>(activity);
                            }
                            this.f15793b.removeMessages(1001);
                            this.f15793b.sendEmptyMessage(1002);
                        }

                        public final void onActivityStarted(Activity activity) {
                            m18593a(activity);
                        }

                        public final void onActivityResumed(Activity activity) {
                            m18593a(activity);
                        }

                        public final void onActivityStopped(Activity activity) {
                            WeakReference<Activity> weakReference = this.f15794c;
                            if (weakReference == null || weakReference.get() == activity) {
                                this.f15793b.sendEmptyMessageDelayed(1001, 3000);
                            }
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }
        f15790b.add(cVar);
    }

    /* renamed from: b */
    public static void m18588b() {
        f15791c = true;
    }

    /* renamed from: c */
    public static void m18589c() {
        f15791c = false;
    }

    /* renamed from: com.inmobi.media.hr$a */
    /* compiled from: ApplicationFocusChangeObserver */
    static class C6233a extends Handler {

        /* renamed from: a */
        boolean f15795a = true;

        C6233a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (!C6231hr.f15791c) {
                if (message.what == 1001 && this.f15795a) {
                    this.f15795a = false;
                    C6231hr.m18587a(false);
                    String unused = C6231hr.f15789a;
                } else if (message.what == 1002 && !this.f15795a) {
                    this.f15795a = true;
                    C6231hr.m18587a(true);
                    String unused2 = C6231hr.f15789a;
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18587a(boolean z) {
        if (C6227ho.m18551c() != null) {
            Iterator<C6235c> it = f15790b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo35445a(z);
                } catch (Exception unused) {
                }
            }
        }
    }
}
