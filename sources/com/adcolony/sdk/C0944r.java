package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.adcolony.sdk.C0817e0;

/* renamed from: com.adcolony.sdk.r */
class C0944r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0841h0 f709a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AlertDialog f710b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f711c;

    /* renamed from: com.adcolony.sdk.r$a */
    class C0945a implements C0856j0 {
        C0945a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (!C0714a.m138c() || !(C0714a.m129a() instanceof Activity)) {
                new C0817e0.C0818a().mo10684a("Missing Activity reference, can't build AlertDialog.").mo10685a(C0817e0.f434i);
            } else if (C0764c0.m325b(h0Var.mo10772a(), "on_resume")) {
                C0841h0 unused = C0944r.this.f709a = h0Var;
            } else {
                C0944r.this.m939a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$b */
    class C0946b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0841h0 f713a;

        C0946b(C0841h0 h0Var) {
            this.f713a = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C0944r.this.f710b = null;
            dialogInterface.dismiss();
            C0823f1 b = C0764c0.m322b();
            C0764c0.m328b(b, "positive", true);
            boolean unused2 = C0944r.this.f711c = false;
            this.f713a.mo10773a(b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$c */
    class C0947c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0841h0 f715a;

        C0947c(C0841h0 h0Var) {
            this.f715a = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C0944r.this.f710b = null;
            dialogInterface.dismiss();
            C0823f1 b = C0764c0.m322b();
            C0764c0.m328b(b, "positive", false);
            boolean unused2 = C0944r.this.f711c = false;
            this.f715a.mo10773a(b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$d */
    class C0948d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C0841h0 f717a;

        C0948d(C0841h0 h0Var) {
            this.f717a = h0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            AlertDialog unused = C0944r.this.f710b = null;
            boolean unused2 = C0944r.this.f711c = false;
            C0823f1 b = C0764c0.m322b();
            C0764c0.m328b(b, "positive", false);
            this.f717a.mo10773a(b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$e */
    class C0949e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AlertDialog.Builder f719a;

        C0949e(AlertDialog.Builder builder) {
            this.f719a = builder;
        }

        public void run() {
            boolean unused = C0944r.this.f711c = true;
            AlertDialog unused2 = C0944r.this.f710b = this.f719a.show();
        }
    }

    C0944r() {
        C0714a.m135a("Alert.show", (C0856j0) new C0945a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11019c() {
        C0841h0 h0Var = this.f709a;
        if (h0Var != null) {
            m939a(h0Var);
            this.f709a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11018b() {
        return this.f711c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m939a(C0841h0 h0Var) {
        AlertDialog.Builder builder;
        Context a = C0714a.m129a();
        if (a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                builder = new AlertDialog.Builder(a, 16974374);
            } else {
                builder = new AlertDialog.Builder(a, 16974126);
            }
            C0823f1 a2 = h0Var.mo10772a();
            String h = C0764c0.m336h(a2, "message");
            String h2 = C0764c0.m336h(a2, "title");
            String h3 = C0764c0.m336h(a2, "positive");
            String h4 = C0764c0.m336h(a2, "negative");
            builder.setMessage(h);
            builder.setTitle(h2);
            builder.setPositiveButton(h3, new C0946b(h0Var));
            if (!h4.equals("")) {
                builder.setNegativeButton(h4, new C0947c(h0Var));
            }
            builder.setOnCancelListener(new C0948d(h0Var));
            C1038z0.m1202b((Runnable) new C0949e(builder));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AlertDialog mo11016a() {
        return this.f710b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11017a(AlertDialog alertDialog) {
        this.f710b = alertDialog;
    }
}
