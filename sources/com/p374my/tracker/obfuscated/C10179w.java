package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.p374my.tracker.obfuscated.C10118j0;

/* renamed from: com.my.tracker.obfuscated.w */
public final class C10179w {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m30491a(Context context, C10178v0 v0Var, C10126m mVar, C10166r0 r0Var) {
        String str;
        boolean z;
        String str2;
        PackageInfo a = C10112h.m30078a(context);
        String str3 = "";
        if (a != null) {
            str3 = Build.VERSION.SDK_INT >= 28 ? Long.toString(a.getLongVersionCode()) : Integer.toString(a.versionCode);
            str = a.versionName;
        } else {
            str = str3;
        }
        C10121k0 a2 = C10121k0.m30104a(context);
        String a3 = a2.mo66178a();
        String f = v0Var.mo66418f();
        if (!f.equals(a2.mo66186b())) {
            C10175u0.m30440a("InstallHandler: tracking install");
            long b = a != null ? C10173t0.m30435b(a.firstInstallTime) : 0;
            C10118j0 a4 = C10118j0.m30096a(mVar, v0Var, context);
            C10118j0.C10119a a5 = a4.mo66173a();
            mVar.mo66233a(b, C10112h.m30079b(context), a5);
            if (a5 == null) {
                a4.mo66177c();
            }
            a2.mo66194e(f);
            z = true;
        } else if (!str3.equals(a3)) {
            if (a3.isEmpty()) {
                str2 = "InstallHandler: tracking update";
            } else {
                str2 = "InstallHandler: tracking update from" + a3 + " to " + str3;
            }
            C10175u0.m30440a(str2);
            mVar.mo66240a(a2.mo66191d(), a3, str, str3, C10112h.m30079b(context));
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C10175u0.m30440a("InstallHandler: no install/update");
            r0Var.mo66378a(a2.mo66199h());
            return;
        }
        long a6 = C10173t0.m30433a();
        if (z) {
            a2.mo66180a(a6);
            r0Var.mo66378a(a6);
        } else if (z) {
            r0Var.mo66378a(a2.mo66199h());
        }
        a2.mo66192d(str3);
        a2.mo66198g(str);
        a2.mo66187b(a6);
    }

    /* renamed from: a */
    public static void m30492a(C10178v0 v0Var, C10126m mVar, C10166r0 r0Var, Context context) {
        C10104d.m30023a(new Runnable(context, v0Var, mVar, r0Var) {
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ C10178v0 f$1;
            public final /* synthetic */ C10126m f$2;
            public final /* synthetic */ C10166r0 f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C10179w.m30491a(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }
}
