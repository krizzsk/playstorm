package com.p374my.target;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p374my.target.C10031x4;
import com.p374my.target.C9644c6;
import com.p374my.target.C9707g0;
import com.p374my.target.C9814l1;
import com.p374my.target.C9894p1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.o4 */
public class C9881o4 implements C10031x4, C9814l1.C9816b {

    /* renamed from: a */
    public final C9644c6 f24431a;

    /* renamed from: b */
    public final C9878o1 f24432b;

    /* renamed from: c */
    public final C9814l1 f24433c;

    /* renamed from: d */
    public final WeakReference<Activity> f24434d;

    /* renamed from: e */
    public final Context f24435e;

    /* renamed from: f */
    public String f24436f;

    /* renamed from: g */
    public Integer f24437g;

    /* renamed from: h */
    public boolean f24438h;

    /* renamed from: i */
    public C9857n1 f24439i;

    /* renamed from: j */
    public C9755i6 f24440j;

    /* renamed from: k */
    public boolean f24441k;

    /* renamed from: l */
    public C10031x4.C10032a f24442l;

    /* renamed from: m */
    public boolean f24443m;

    /* renamed from: n */
    public C9657d2 f24444n;

    /* renamed from: o */
    public long f24445o;

    /* renamed from: p */
    public long f24446p;

    /* renamed from: q */
    public final Handler f24447q;

    /* renamed from: r */
    public final C9884c f24448r;

    /* renamed from: s */
    public final C10020w5 f24449s;

    /* renamed from: t */
    public C9730h0 f24450t;

    /* renamed from: com.my.target.o4$a */
    public class C9882a implements View.OnClickListener {
        public C9882a() {
        }

        public void onClick(View view) {
            C9881o4.this.mo65165i();
        }
    }

    /* renamed from: com.my.target.o4$b */
    public class C9883b implements C9707g0.C9709b {

        /* renamed from: a */
        public final /* synthetic */ C10066z1 f24452a;

        public C9883b(C10066z1 z1Var) {
            this.f24452a = z1Var;
        }

        /* renamed from: a */
        public void mo63363a(Context context) {
            if (C9881o4.this.f24442l != null) {
                C9881o4.this.f24442l.mo65209a(this.f24452a, context);
            }
        }
    }

    /* renamed from: com.my.target.o4$c */
    public static class C9884c implements Runnable {

        /* renamed from: a */
        public final C9644c6 f24454a;

        public C9884c(C9644c6 c6Var) {
            this.f24454a = c6Var;
        }

        public void run() {
            C9672e0.m27882a("banner became just closeable");
            this.f24454a.setCloseVisible(true);
        }
    }

    public C9881o4(Context context) {
        this(C9814l1.m28543b("interstitial"), new Handler(Looper.getMainLooper()), new C9644c6(context), context);
    }

    public C9881o4(C9814l1 l1Var, Handler handler, C9644c6 c6Var, Context context) {
        this.f24438h = true;
        this.f24439i = C9857n1.m28797b();
        this.f24433c = l1Var;
        this.f24435e = context.getApplicationContext();
        this.f24447q = handler;
        this.f24431a = c6Var;
        this.f24434d = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>((Object) null);
        this.f24436f = "loading";
        this.f24432b = C9878o1.m28881e();
        c6Var.setOnCloseListener(new C9644c6.C9645a() {
            /* renamed from: d */
            public final void mo63312d() {
                C9881o4.this.mo65166k();
            }
        });
        this.f24448r = new C9884c(c6Var);
        this.f24449s = new C10020w5(context);
        l1Var.mo64632a((C9814l1.C9816b) this);
    }

    /* renamed from: a */
    public static C9881o4 m28893a(Context context) {
        return new C9881o4(context);
    }

    /* renamed from: a */
    public void mo64581a() {
        this.f24441k = false;
        C9755i6 i6Var = this.f24440j;
        if (i6Var != null) {
            i6Var.mo63465e();
        }
        long j = this.f24445o;
        if (j > 0) {
            mo65157a(j);
        }
    }

    /* renamed from: a */
    public void mo64582a(int i) {
        C9755i6 i6Var;
        this.f24447q.removeCallbacks(this.f24448r);
        if (!this.f24441k) {
            this.f24441k = true;
            if (i <= 0 && (i6Var = this.f24440j) != null) {
                i6Var.mo64279a(true);
            }
        }
        ViewParent parent = this.f24431a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f24431a);
        }
        this.f24433c.mo64629a();
        C9755i6 i6Var2 = this.f24440j;
        if (i6Var2 != null) {
            i6Var2.mo63459a(i);
            this.f24440j = null;
        }
        this.f24431a.removeAllViews();
    }

    /* renamed from: a */
    public final void mo65157a(long j) {
        this.f24447q.removeCallbacks(this.f24448r);
        this.f24446p = System.currentTimeMillis();
        this.f24447q.postDelayed(this.f24448r, j);
    }

    /* renamed from: a */
    public void mo64647a(C9814l1 l1Var, WebView webView) {
        C9657d2 d2Var;
        this.f24436f = "default";
        mo65169n();
        ArrayList arrayList = new ArrayList();
        if (mo65167l()) {
            arrayList.add("'inlineVideo'");
        }
        arrayList.add("'vpaid'");
        l1Var.mo64636a((ArrayList<String>) arrayList);
        l1Var.mo64644d("interstitial");
        l1Var.mo64637a(l1Var.mo64642c());
        mo65163c("default");
        l1Var.mo64643d();
        l1Var.mo64633a(this.f24432b);
        C10031x4.C10032a aVar = this.f24442l;
        if (aVar != null && (d2Var = this.f24444n) != null) {
            aVar.mo65210a((C10066z1) d2Var, (View) this.f24431a);
            this.f24442l.mo65635a(webView);
        }
    }

    /* renamed from: a */
    public void mo64584a(C9963t2 t2Var, C9657d2 d2Var) {
        this.f24444n = d2Var;
        long allowCloseDelay = (long) (d2Var.getAllowCloseDelay() * 1000.0f);
        this.f24445o = allowCloseDelay;
        if (allowCloseDelay > 0) {
            this.f24431a.setCloseVisible(false);
            C9672e0.m27882a("banner will be allowed to close in " + this.f24445o + " millis");
            mo65157a(this.f24445o);
        } else {
            C9672e0.m27882a("banner is allowed to close");
            this.f24431a.setCloseVisible(true);
        }
        String source = d2Var.getSource();
        if (source != null) {
            mo65161b(source);
        }
        mo65158a((C10066z1) d2Var);
    }

    /* renamed from: a */
    public void mo64585a(C10031x4.C10032a aVar) {
        this.f24442l = aVar;
    }

    /* renamed from: a */
    public final void mo65158a(C10066z1 z1Var) {
        C9894p1 adChoices = z1Var.getAdChoices();
        if (adChoices == null) {
            this.f24449s.setVisibility(8);
        } else if (this.f24449s.getParent() == null) {
            int a = C10059y8.m29824a(10, this.f24435e);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(a, a, a, a);
            this.f24431a.addView(this.f24449s, layoutParams);
            this.f24449s.setImageBitmap(adChoices.mo65194c().getBitmap());
            this.f24449s.setOnClickListener(new C9882a());
            List<C9894p1.C9895a> a2 = adChoices.mo65191a();
            if (a2 != null) {
                C9730h0 a3 = C9730h0.m28115a(a2);
                this.f24450t = a3;
                a3.mo64137a((C9707g0.C9709b) new C9883b(z1Var));
            }
        }
    }

    /* renamed from: a */
    public void mo64648a(boolean z) {
        this.f24433c.mo64637a(z);
    }

    /* renamed from: a */
    public boolean mo64649a(float f, float f2) {
        C10031x4.C10032a aVar;
        C9657d2 d2Var;
        if (!this.f24443m) {
            this.f24433c.mo64635a("playheadEvent", "Calling VPAID command before VPAID init");
            return false;
        } else if (f < 0.0f || f2 < 0.0f || (aVar = this.f24442l) == null || (d2Var = this.f24444n) == null) {
            return true;
        } else {
            aVar.mo65636a(d2Var, f, f2, this.f24435e);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo65159a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public boolean mo64650a(int i, int i2, int i3, int i4, boolean z, int i5) {
        C9672e0.m27882a("setResizeProperties method not used with interstitials");
        return false;
    }

    /* renamed from: a */
    public boolean mo64651a(Uri uri) {
        C9672e0.m27882a("Expand method not used with interstitials");
        return false;
    }

    /* renamed from: a */
    public boolean mo64652a(ConsoleMessage consoleMessage, C9814l1 l1Var) {
        C9672e0.m27882a("Console message: " + consoleMessage.message());
        return true;
    }

    /* renamed from: a */
    public boolean mo65160a(C9857n1 n1Var) {
        if ("none".equals(n1Var.toString())) {
            return true;
        }
        Activity activity = (Activity) this.f24434d.get();
        if (activity == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            int i = activityInfo.screenOrientation;
            return i != -1 ? i == n1Var.mo64834a() : mo65159a(activityInfo.configChanges, 128) && mo65159a(activityInfo.configChanges, 1024);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo64653a(String str) {
        boolean z = false;
        if (!this.f24443m) {
            this.f24433c.mo64635a("vpaidEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        C10031x4.C10032a aVar = this.f24442l;
        boolean z2 = aVar != null;
        C9657d2 d2Var = this.f24444n;
        if (d2Var != null) {
            z = true;
        }
        if (z && z2) {
            aVar.mo65638b(d2Var, str, this.f24435e);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo64654a(String str, JsResult jsResult) {
        C9672e0.m27882a("JS Alert: " + str);
        jsResult.confirm();
        return true;
    }

    /* renamed from: a */
    public boolean mo64655a(boolean z, C9857n1 n1Var) {
        if (!mo65160a(n1Var)) {
            C9814l1 l1Var = this.f24433c;
            l1Var.mo64635a("setOrientationProperties", "Unable to force orientation to " + n1Var);
            return false;
        }
        this.f24438h = z;
        this.f24439i = n1Var;
        return mo65164h();
    }

    /* renamed from: b */
    public void mo64587b() {
        this.f24441k = true;
        C9755i6 i6Var = this.f24440j;
        if (i6Var != null) {
            i6Var.mo64279a(false);
        }
        this.f24447q.removeCallbacks(this.f24448r);
        if (this.f24446p > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f24446p;
            if (currentTimeMillis > 0) {
                long j = this.f24445o;
                if (currentTimeMillis < j) {
                    this.f24445o = j - currentTimeMillis;
                    return;
                }
            }
            this.f24445o = 0;
        }
    }

    /* renamed from: b */
    public void mo64656b(Uri uri) {
        C10031x4.C10032a aVar = this.f24442l;
        if (aVar != null) {
            aVar.mo65211a(this.f24444n, uri.toString(), this.f24431a.getContext());
        }
    }

    /* renamed from: b */
    public void mo65161b(String str) {
        C9755i6 i6Var = new C9755i6(this.f24435e);
        this.f24440j = i6Var;
        this.f24433c.mo64631a(i6Var);
        this.f24431a.addView(this.f24440j, new FrameLayout.LayoutParams(-1, -1));
        this.f24433c.mo64646f(str);
    }

    /* renamed from: b */
    public boolean mo65162b(int i) {
        Activity activity = (Activity) this.f24434d.get();
        if (activity == null || !mo65160a(this.f24439i)) {
            C9814l1 l1Var = this.f24433c;
            l1Var.mo64635a("setOrientationProperties", "Attempted to lock orientation to unsupported value: " + this.f24439i.toString());
            return false;
        }
        if (this.f24437g == null) {
            this.f24437g = Integer.valueOf(activity.getRequestedOrientation());
        }
        activity.setRequestedOrientation(i);
        return true;
    }

    /* renamed from: c */
    public void mo64657c() {
        mo65169n();
    }

    /* renamed from: c */
    public final void mo65163c(String str) {
        C9672e0.m27882a("MRAID state set to " + str);
        this.f24436f = str;
        this.f24433c.mo64645e(str);
        if ("hidden".equals(str)) {
            C9672e0.m27882a("InterstitialMraidPresenter: Mraid on close");
            C10031x4.C10032a aVar = this.f24442l;
            if (aVar != null) {
                aVar.mo65208a();
            }
        }
    }

    /* renamed from: d */
    public void mo64658d() {
        mo65166k();
    }

    public void destroy() {
        mo64582a(0);
    }

    /* renamed from: e */
    public void mo64593e() {
        this.f24441k = true;
        C9755i6 i6Var = this.f24440j;
        if (i6Var != null) {
            i6Var.mo64279a(false);
        }
    }

    /* renamed from: f */
    public boolean mo64659f() {
        C9672e0.m27882a("resize method not used with interstitials");
        return false;
    }

    /* renamed from: g */
    public void mo64660g() {
        this.f24443m = true;
    }

    public View getCloseButton() {
        return null;
    }

    /* renamed from: h */
    public boolean mo65164h() {
        if (!"none".equals(this.f24439i.toString())) {
            return mo65162b(this.f24439i.mo64834a());
        }
        if (this.f24438h) {
            mo65168m();
            return true;
        }
        Activity activity = (Activity) this.f24434d.get();
        if (activity != null) {
            return mo65162b(C10059y8.m29825a(activity));
        }
        this.f24433c.mo64635a("setOrientationProperties", "Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
        return false;
    }

    /* renamed from: i */
    public void mo65165i() {
        C9894p1 adChoices;
        C9657d2 d2Var = this.f24444n;
        if (d2Var != null && (adChoices = d2Var.getAdChoices()) != null) {
            C9730h0 h0Var = this.f24450t;
            if (h0Var == null || !h0Var.mo64142c()) {
                Activity activity = (Activity) this.f24434d.get();
                if (h0Var == null || activity == null) {
                    C9832l8.m28605a(adChoices.mo65193b(), this.f24435e);
                } else {
                    h0Var.mo64136a((Context) activity);
                }
            }
        }
    }

    /* renamed from: j */
    public View mo64595j() {
        return this.f24431a;
    }

    /* renamed from: k */
    public void mo65166k() {
        if (this.f24440j != null && !"loading".equals(this.f24436f) && !"hidden".equals(this.f24436f)) {
            mo65168m();
            if ("default".equals(this.f24436f)) {
                this.f24431a.setVisibility(4);
                mo65163c("hidden");
            }
        }
    }

    /* renamed from: l */
    public final boolean mo65167l() {
        C9755i6 i6Var;
        Activity activity = (Activity) this.f24434d.get();
        if (activity == null || (i6Var = this.f24440j) == null) {
            return false;
        }
        return C10059y8.m29834a(activity, (View) i6Var);
    }

    /* renamed from: m */
    public void mo65168m() {
        Integer num;
        Activity activity = (Activity) this.f24434d.get();
        if (!(activity == null || (num = this.f24437g) == null)) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.f24437g = null;
    }

    /* renamed from: n */
    public final void mo65169n() {
        DisplayMetrics displayMetrics = this.f24435e.getResources().getDisplayMetrics();
        this.f24432b.mo65148a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f24432b.mo65151b(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f24432b.mo65149a(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f24432b.mo65153c(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
