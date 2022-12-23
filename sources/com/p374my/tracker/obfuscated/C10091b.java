package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.my.tracker.obfuscated.b */
public final class C10091b {

    /* renamed from: a */
    boolean f25121a = false;

    /* renamed from: b */
    final AtomicReference<String> f25122b = new AtomicReference<>();

    /* renamed from: c */
    final AtomicReference<Integer> f25123c = new AtomicReference<>(-1);

    /* renamed from: com.my.tracker.obfuscated.b$a */
    public static final class C10092a {

        /* renamed from: a */
        public static final boolean f25124a = true;
    }

    C10091b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29964a(C10121k0 k0Var, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != this.f25123c.getAndSet(Integer.valueOf(scope)).intValue()) {
            k0Var.mo66179a(scope);
        }
        String id = appSetIdInfo.getId();
        if (!id.equals(this.f25122b.getAndSet(id))) {
            k0Var.mo66196f(id);
            C10175u0.m30440a("AppSetIdProvider: new id value has been received: " + id);
        }
        synchronized (this.f25122b) {
            this.f25122b.notify();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66068a() {
        try {
            String str = this.f25122b.get();
            if (!TextUtils.isEmpty(str)) {
                C10175u0.m30440a("AppSetIdProvider: app set id has been collected, value: " + str);
                return;
            }
            synchronized (this.f25122b) {
                this.f25122b.wait(300);
            }
            C10175u0.m30440a("AppSetIdProvider: timeout for collecting id has exceeded");
        } catch (Throwable th) {
            C10175u0.m30441a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }

    /* renamed from: a */
    public void mo66069a(Context context) {
        if (!this.f25121a) {
            mo66071b(context);
            this.f25121a = true;
        }
    }

    /* renamed from: a */
    public void mo66070a(C10129m0 m0Var, Context context) {
        StringBuilder sb;
        String str;
        if (TextUtils.isEmpty(this.f25122b.get()) || this.f25123c.get().intValue() == -1) {
            sb = new StringBuilder();
            sb.append("AppSetIdProvider: App Set ID ");
            sb.append(this.f25122b.get());
            sb.append(" and Scope ");
            sb.append(this.f25123c.get());
            str = " were not sent due to its values";
        } else {
            m0Var.mo66266a(this.f25122b.get(), this.f25123c.get().intValue());
            sb = new StringBuilder();
            sb.append("AppSetIdProvider: App Set ID ");
            sb.append(this.f25122b.get());
            sb.append(" and Scope ");
            sb.append(this.f25123c.get());
            str = " set to proto builder successfully";
        }
        sb.append(str);
        C10175u0.m30440a(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66071b(Context context) {
        C10121k0 a = C10121k0.m30104a(context);
        this.f25122b.set(a.mo66188c());
        if (!C10092a.f25124a) {
            C10175u0.m30440a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(C10104d.f25158c, new OnSuccessListener(a) {
                public final /* synthetic */ C10121k0 f$1;

                {
                    this.f$1 = r2;
                }

                public final void onSuccess(Object obj) {
                    C10091b.this.m29964a(this.f$1, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th) {
            C10175u0.m30441a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        mo66068a();
    }

    /* renamed from: c */
    public void mo66072c(Context context) {
    }
}
