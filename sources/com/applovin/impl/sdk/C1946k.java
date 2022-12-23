package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.C2082o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.k */
class C1946k implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static AlertDialog f3621b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicBoolean f3622c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1952l f3623a;

    /* renamed from: d */
    private C2082o f3624d;

    /* renamed from: com.applovin.impl.sdk.k$a */
    public interface C1951a {
        /* renamed from: a */
        void mo14274a();

        /* renamed from: b */
        void mo14275b();
    }

    C1946k(C1952l lVar, C1959m mVar) {
        this.f3623a = lVar;
        mVar.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public void mo14269a(long j, final C1959m mVar, final C1951a aVar) {
        if (j > 0) {
            AlertDialog alertDialog = f3621b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                if (f3622c.getAndSet(true)) {
                    if (j < this.f3624d.mo14750a()) {
                        if (C2092v.m5047a()) {
                            C2092v A = mVar.mo14286A();
                            A.mo14789b("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.f3624d.mo14750a() + "ms)");
                        }
                        this.f3624d.mo14753d();
                    } else if (C2092v.m5047a()) {
                        C2092v A2 = mVar.mo14286A();
                        A2.mo14792d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f3624d.mo14750a() + " milliseconds");
                        return;
                    } else {
                        return;
                    }
                }
                if (C2092v.m5047a()) {
                    C2092v A3 = mVar.mo14286A();
                    A3.mo14789b("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
                }
                this.f3624d = C2082o.m5001a(j, mVar, new Runnable() {
                    public void run() {
                        String str;
                        C2092v vVar;
                        if (!C1946k.this.f3623a.mo14279d()) {
                            Activity a = mVar.mo14333af().mo13822a();
                            if (a == null || !C2040h.m4900a(mVar.mo14297L())) {
                                if (C2092v.m5047a()) {
                                    if (a == null) {
                                        vVar = mVar.mo14286A();
                                        str = "No parent Activity found - rescheduling consent alert...";
                                    } else {
                                        vVar = mVar.mo14286A();
                                        str = "No internet available - rescheduling consent alert...";
                                    }
                                    vVar.mo14793e("ConsentAlertManager", str);
                                }
                                C1946k.f3622c.set(false);
                                C1946k.this.mo14269a(((Long) mVar.mo14311a(C1857b.f3076aF)).longValue(), mVar, aVar);
                                return;
                            }
                            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                                public void run() {
                                    AlertDialog unused = C1946k.f3621b = new AlertDialog.Builder(mVar.mo14333af().mo13822a()).setTitle((CharSequence) mVar.mo14311a(C1857b.f3077aG)).setMessage((CharSequence) mVar.mo14311a(C1857b.f3078aH)).setCancelable(false).setPositiveButton((CharSequence) mVar.mo14311a(C1857b.f3079aI), new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            aVar.mo14274a();
                                            dialogInterface.dismiss();
                                            C1946k.f3622c.set(false);
                                        }
                                    }).setNegativeButton((CharSequence) mVar.mo14311a(C1857b.f3080aJ), new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            aVar.mo14275b();
                                            dialogInterface.dismiss();
                                            C1946k.f3622c.set(false);
                                            C1946k.this.mo14269a(((Long) mVar.mo14311a(C1857b.f3075aE)).longValue(), mVar, aVar);
                                        }
                                    }).create();
                                    C1946k.f3621b.show();
                                }
                            });
                        } else if (C2092v.m5047a()) {
                            mVar.mo14286A().mo14793e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                        }
                    }
                });
            }
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (this.f3624d != null) {
            String action = intent.getAction();
            if ("com.applovin.application_paused".equals(action)) {
                this.f3624d.mo14751b();
            } else if ("com.applovin.application_resumed".equals(action)) {
                this.f3624d.mo14752c();
            }
        }
    }
}
