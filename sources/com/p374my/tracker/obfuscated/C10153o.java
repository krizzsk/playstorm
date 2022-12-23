package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.my.tracker.obfuscated.o */
public final class C10153o {

    /* renamed from: a */
    boolean f25427a = false;

    /* renamed from: b */
    String f25428b;

    /* renamed from: com.my.tracker.obfuscated.o$a */
    class C10154a implements C10157c {

        /* renamed from: a */
        final /* synthetic */ C10121k0 f25429a;

        C10154a(C10121k0 k0Var) {
            this.f25429a = k0Var;
        }

        /* renamed from: a */
        public void mo66351a() {
            C10175u0.m30440a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }

        /* renamed from: a */
        public void mo66352a(String str) {
            C10153o.this.f25428b = str;
            this.f25429a.mo66204j(str);
            C10175u0.m30440a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + C10153o.this.f25428b);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.o$b */
    public static final class C10155b {

        /* renamed from: a */
        public static final boolean f25431a = true;

        /* renamed from: com.my.tracker.obfuscated.o$b$a */
        class C10156a implements OnCompleteListener<String> {

            /* renamed from: a */
            final /* synthetic */ C10157c f25432a;

            C10156a(C10157c cVar) {
                this.f25432a = cVar;
            }

            public void onComplete(Task<String> task) {
                if (!task.isComplete() || !task.isSuccessful()) {
                    this.f25432a.mo66351a();
                } else {
                    this.f25432a.mo66352a(task.getResult());
                }
            }
        }

        /* renamed from: a */
        static void m30354a(Context context, C10157c cVar) {
            try {
                C10175u0.m30440a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).getAppInstanceId().addOnCompleteListener(C10104d.f25157b, new C10156a(cVar));
            } catch (Throwable th) {
                C10175u0.m30441a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.mo66351a();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.o$c */
    public interface C10157c {
        /* renamed from: a */
        void mo66351a();

        /* renamed from: a */
        void mo66352a(String str);
    }

    C10153o() {
    }

    /* renamed from: a */
    public void mo66348a(Context context) {
        if (!this.f25427a) {
            C10121k0 a = C10121k0.m30104a(context);
            String g = a.mo66197g();
            this.f25428b = g;
            if (!TextUtils.isEmpty(g)) {
                C10175u0.m30440a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + this.f25428b);
            }
            if (!C10155b.f25431a) {
                C10175u0.m30440a("FirebaseAppInstanceIdProvider: firebase analytics is not available");
                return;
            }
            C10155b.m30354a(context, new C10154a(a));
            this.f25427a = true;
        }
    }

    /* renamed from: a */
    public void mo66349a(C10129m0 m0Var, Context context) {
        if (!TextUtils.isEmpty(this.f25428b)) {
            m0Var.mo66316i(this.f25428b);
        }
    }

    /* renamed from: b */
    public void mo66350b(Context context) {
    }
}
