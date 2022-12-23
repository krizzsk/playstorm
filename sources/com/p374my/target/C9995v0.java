package com.p374my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.p374my.target.C9891p0;
import com.p374my.target.common.MyTargetActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.v0 */
public abstract class C9995v0 implements C9891p0, MyTargetActivity.ActivityEngine {

    /* renamed from: a */
    public final C9891p0.C9892a f24798a;

    /* renamed from: b */
    public boolean f24799b;

    /* renamed from: c */
    public boolean f24800c;

    /* renamed from: d */
    public WeakReference<MyTargetActivity> f24801d;

    /* renamed from: e */
    public boolean f24802e;

    /* renamed from: f */
    public C9891p0.C9893b f24803f;

    public C9995v0(C9891p0.C9892a aVar) {
        this.f24798a = aVar;
    }

    /* renamed from: a */
    public static C9995v0 m29522a(C9625b2 b2Var, C9963t2 t2Var, boolean z, C9891p0.C9892a aVar) {
        if (b2Var instanceof C9697f2) {
            return C10041y0.m29730a((C9697f2) b2Var, t2Var, z, aVar);
        }
        if (b2Var instanceof C9657d2) {
            return C10013w0.m29590a((C9657d2) b2Var, t2Var, aVar);
        }
        if (b2Var instanceof C9675e2) {
            return C10025x0.m29672a((C9675e2) b2Var, aVar);
        }
        return null;
    }

    /* renamed from: a */
    public C9891p0.C9893b mo65577a() {
        return this.f24803f;
    }

    /* renamed from: a */
    public void mo63410a(Context context) {
        if (this.f24802e) {
            C9672e0.m27882a("Unable to open Interstitial Ad twice, please dismiss currently showing ad first");
            return;
        }
        this.f24798a.onStartDisplaying();
        this.f24802e = true;
        MyTargetActivity.activityEngine = this;
        Intent intent = new Intent(context, MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo63413a(C9891p0.C9893b bVar) {
        this.f24803f = bVar;
    }

    /* renamed from: a */
    public void mo65578a(C10066z1 z1Var, Context context) {
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a("closedByUser"), context);
        dismiss();
    }

    /* renamed from: b */
    public abstract boolean mo65579b();

    /* renamed from: c */
    public String mo65189c() {
        return "myTarget";
    }

    /* renamed from: d */
    public float mo65190d() {
        return 0.0f;
    }

    public void destroy() {
        dismiss();
    }

    public void dismiss() {
        this.f24802e = false;
        WeakReference<MyTargetActivity> weakReference = this.f24801d;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    public final boolean onActivityBackPressed() {
        return mo65579b();
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        this.f24801d = new WeakReference<>(myTargetActivity);
        myTargetActivity.setTheme(16973830);
        myTargetActivity.getWindow().setFlags(1024, 1024);
        this.f24798a.onDisplay();
    }

    public void onActivityDestroy() {
        this.f24802e = false;
        this.f24801d = null;
        this.f24798a.onDismiss();
    }

    public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onActivityPause() {
        this.f24799b = false;
    }

    public void onActivityResume() {
        this.f24799b = true;
    }

    public void onActivityStart() {
    }

    public void onActivityStop() {
    }
}
