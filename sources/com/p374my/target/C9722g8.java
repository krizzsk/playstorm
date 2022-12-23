package com.p374my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.browser.customtabs.CustomTabsIntent;
import com.p374my.target.C10082z8;
import com.p374my.target.C9921q6;
import com.p374my.target.common.MyTargetActivity;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.my.target.g8 */
public class C9722g8 {

    /* renamed from: a */
    public static final WeakHashMap<C10066z1, Boolean> f23971a = new WeakHashMap<>();

    /* renamed from: com.my.target.g8$b */
    public static abstract class C9724b {

        /* renamed from: a */
        public final C10066z1 f23972a;

        public C9724b(C10066z1 z1Var) {
            this.f23972a = z1Var;
        }

        /* renamed from: a */
        public static C9724b m28095a(C10066z1 z1Var) {
            return new C9725c(z1Var);
        }

        /* renamed from: a */
        public static C9724b m28096a(String str, C10066z1 z1Var) {
            return C10082z8.m29924e(str) ? new C9726d(str, z1Var) : new C9727e(str, z1Var);
        }

        /* renamed from: a */
        public abstract boolean mo64123a(Context context);
    }

    /* renamed from: com.my.target.g8$c */
    public static class C9725c extends C9724b {
        public C9725c(C10066z1 z1Var) {
            super(z1Var);
        }

        /* renamed from: a */
        public boolean mo64123a(Context context) {
            Intent intent;
            if (!"store".equals(this.f23972a.getNavigationType())) {
                return false;
            }
            String str = null;
            if (Build.VERSION.SDK_INT < 30 || this.f23972a.isAppInWhiteList()) {
                str = this.f23972a.getBundleId();
                if (str == null || (intent = context.getPackageManager().getLaunchIntentForPackage(str)) == null) {
                    return false;
                }
            } else {
                intent = null;
            }
            if (mo64125a(str, this.f23972a.getDeeplink(), context)) {
                C10039x8.m29720c((List<C9626b3>) this.f23972a.getStatHolder().mo63675a("deeplinkClick"), context);
                return true;
            } else if (!mo64126b(str, this.f23972a.getUrlscheme(), context) && !mo64124a(intent, context)) {
                return false;
            } else {
                C10039x8.m29720c((List<C9626b3>) this.f23972a.getStatHolder().mo63675a("click"), context);
                String trackingLink = this.f23972a.getTrackingLink();
                if (trackingLink != null && !C10082z8.m29924e(trackingLink)) {
                    C10082z8.m29926g(trackingLink).mo65881b(context);
                }
                return true;
            }
        }

        /* renamed from: a */
        public final boolean mo64124a(Intent intent, Context context) {
            if (intent == null) {
                return false;
            }
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo64125a(String str, String str2, Context context) {
            if (str2 == null) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                if (str != null) {
                    intent.setPackage(str);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo64126b(String str, String str2, Context context) {
            if (str2 == null) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                if (str != null) {
                    intent.setPackage(str);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: com.my.target.g8$d */
    public static class C9726d extends C9727e {
        public C9726d(String str, C10066z1 z1Var) {
            super(str, z1Var);
        }

        /* renamed from: a */
        public boolean mo64123a(Context context) {
            if (C10082z8.m29922c(this.f23973b)) {
                if (mo64128e(this.f23973b, context)) {
                    return true;
                }
            } else if (mo64127d(this.f23973b, context)) {
                return true;
            }
            return super.mo64123a(context);
        }

        /* renamed from: d */
        public final boolean mo64127d(String str, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: e */
        public final boolean mo64128e(String str, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: com.my.target.g8$e */
    public static class C9727e extends C9724b {

        /* renamed from: b */
        public final String f23973b;

        public C9727e(String str, C10066z1 z1Var) {
            super(z1Var);
            this.f23973b = str;
        }

        /* renamed from: a */
        public boolean mo64123a(Context context) {
            if (mo64130b(context)) {
                return true;
            }
            if (this.f23972a.isOpenInBrowser()) {
                return mo64131b(this.f23973b, context);
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 18 || !mo64129a(this.f23973b, context)) {
                return ("store".equals(this.f23972a.getNavigationType()) || (i >= 28 && !C10082z8.m29923d(this.f23973b))) ? mo64131b(this.f23973b, context) : mo64132c(this.f23973b, context);
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo64129a(String str, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                Bundle bundle = new Bundle();
                bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setPackage("com.android.chrome");
                intent.putExtras(bundle);
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo64130b(Context context) {
            if (!context.getPackageName().equals("ru.mail.browser")) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f23973b));
                intent.putExtra("com.android.browser.application_id", "ru.mail.browser");
                intent.setPackage("ru.mail.browser");
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                C9672e0.m27882a("Unable to start atom: " + th.getMessage());
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo64131b(String str, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: c */
        public final boolean mo64132c(String str, Context context) {
            C9728f.m28110a(str).mo64133a(context);
            return true;
        }
    }

    /* renamed from: com.my.target.g8$f */
    public static class C9728f implements MyTargetActivity.ActivityEngine {

        /* renamed from: a */
        public final String f23974a;

        /* renamed from: b */
        public C9921q6 f23975b;

        public C9728f(String str) {
            this.f23974a = str;
        }

        /* renamed from: a */
        public static C9728f m28110a(String str) {
            return new C9728f(str);
        }

        /* renamed from: a */
        public void mo64133a(Context context) {
            MyTargetActivity.activityEngine = this;
            Intent intent = new Intent(context, MyTargetActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }

        public boolean onActivityBackPressed() {
            C9921q6 q6Var = this.f23975b;
            if (q6Var == null || !q6Var.mo65303a()) {
                return true;
            }
            this.f23975b.mo65305c();
            return false;
        }

        public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
            myTargetActivity.setTheme(16973837);
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = myTargetActivity.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(-12232092);
            }
            try {
                C9921q6 q6Var = new C9921q6(myTargetActivity);
                this.f23975b = q6Var;
                frameLayout.addView(q6Var);
                this.f23975b.mo65306d();
                this.f23975b.setUrl(this.f23974a);
                this.f23975b.setListener(new C9921q6.C9925d() {
                    /* renamed from: a */
                    public final void mo63343a() {
                        MyTargetActivity.this.finish();
                    }
                });
            } catch (Throwable th) {
                C9672e0.m27883b(th.getMessage());
                myTargetActivity.finish();
            }
        }

        public void onActivityDestroy() {
            C9921q6 q6Var = this.f23975b;
            if (q6Var != null) {
                q6Var.mo65304b();
                this.f23975b = null;
            }
        }

        public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
            return false;
        }

        public void onActivityPause() {
        }

        public void onActivityResume() {
        }

        public void onActivityStart() {
        }

        public void onActivityStop() {
        }
    }

    /* renamed from: a */
    public static C9722g8 m28089a() {
        return new C9722g8();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28090a(C10066z1 z1Var, Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            mo64121a(str, z1Var, context);
        }
        f23971a.remove(z1Var);
    }

    /* renamed from: a */
    public void mo64119a(C10066z1 z1Var, Context context) {
        mo64120a(z1Var, z1Var.getTrackingLink(), context);
    }

    /* renamed from: a */
    public void mo64120a(C10066z1 z1Var, String str, Context context) {
        if (!f23971a.containsKey(z1Var) && !C9724b.m28095a(z1Var).mo64123a(context)) {
            if (str != null) {
                mo64122b(str, z1Var, context);
            }
            C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a("click"), context);
        }
    }

    /* renamed from: a */
    public final void mo64121a(String str, C10066z1 z1Var, Context context) {
        C9724b.m28096a(str, z1Var).mo64123a(context);
    }

    /* renamed from: b */
    public final void mo64122b(String str, C10066z1 z1Var, Context context) {
        if (z1Var.isDirectLink() || C10082z8.m29924e(str)) {
            mo64121a(str, z1Var, context);
            return;
        }
        f23971a.put(z1Var, Boolean.TRUE);
        C10082z8.m29926g(str).mo65880a((C10082z8.C10083a) new C10082z8.C10083a(z1Var, context) {
            public final /* synthetic */ C10066z1 f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            /* renamed from: a */
            public final void mo63342a(String str) {
                C9722g8.this.m28090a(this.f$1, this.f$2, str);
            }
        }).mo65881b(context);
    }
}
