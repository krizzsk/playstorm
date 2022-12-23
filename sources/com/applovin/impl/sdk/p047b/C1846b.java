package com.applovin.impl.sdk.p047b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.b.b */
public class C1846b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f2999a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Activity f3000b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AlertDialog f3001c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1853a f3002d;

    /* renamed from: com.applovin.impl.sdk.b.b$a */
    public interface C1853a {
        /* renamed from: a */
        void mo12802a();

        /* renamed from: b */
        void mo12803b();
    }

    public C1846b(Activity activity, C1959m mVar) {
        this.f2999a = mVar;
        this.f3000b = activity;
    }

    /* renamed from: a */
    public void mo14038a() {
        this.f3000b.runOnUiThread(new Runnable() {
            public void run() {
                if (C1846b.this.f3001c != null) {
                    C1846b.this.f3001c.dismiss();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo14039a(final C1829e eVar, final Runnable runnable) {
        this.f3000b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(C1846b.this.f3000b);
                builder.setTitle(eVar.mo13994an());
                String ao = eVar.mo13995ao();
                if (AppLovinSdkUtils.isValidString(ao)) {
                    builder.setMessage(ao);
                }
                builder.setPositiveButton(eVar.mo13996ap(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setCancelable(false);
                AlertDialog unused = C1846b.this.f3001c = builder.show();
            }
        });
    }

    /* renamed from: a */
    public void mo14040a(C1853a aVar) {
        this.f3002d = aVar;
    }

    /* renamed from: b */
    public void mo14041b() {
        this.f3000b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog unused = C1846b.this.f3001c = new AlertDialog.Builder(C1846b.this.f3000b).setTitle((CharSequence) C1846b.this.f2999a.mo14311a(C1857b.f3171bv)).setMessage((CharSequence) C1846b.this.f2999a.mo14311a(C1857b.f3172bw)).setCancelable(false).setPositiveButton((CharSequence) C1846b.this.f2999a.mo14311a(C1857b.f3174by), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1846b.this.f3002d.mo12802a();
                    }
                }).setNegativeButton((CharSequence) C1846b.this.f2999a.mo14311a(C1857b.f3173bx), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1846b.this.f3002d.mo12803b();
                    }
                }).show();
            }
        });
    }

    /* renamed from: c */
    public boolean mo14042c() {
        AlertDialog alertDialog = this.f3001c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
