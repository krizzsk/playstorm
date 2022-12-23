package com.iab.omid.library.oguryco.p269b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.oguryco.adsession.C7988a;

/* renamed from: com.iab.omid.library.oguryco.b.b */
public class C7991b {

    /* renamed from: a */
    private static C7991b f19018a = new C7991b();

    /* renamed from: b */
    private Context f19019b;

    /* renamed from: c */
    private BroadcastReceiver f19020c;

    /* renamed from: d */
    private boolean f19021d;

    /* renamed from: e */
    private boolean f19022e;

    /* renamed from: f */
    private C7993a f19023f;

    /* renamed from: com.iab.omid.library.oguryco.b.b$a */
    public interface C7993a {
        /* renamed from: a */
        void mo55812a(boolean z);
    }

    private C7991b() {
    }

    /* renamed from: a */
    public static C7991b m22762a() {
        return f19018a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22764a(boolean z) {
        if (this.f19022e != z) {
            this.f19022e = z;
            if (this.f19021d) {
                m22767g();
                C7993a aVar = this.f19023f;
                if (aVar != null) {
                    aVar.mo55812a(mo55810d());
                }
            }
        }
    }

    /* renamed from: e */
    private void m22765e() {
        this.f19020c = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        C7991b.this.m22764a(true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        C7991b.this.m22764a(false);
                    } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        C7991b.this.m22764a(false);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f19019b.registerReceiver(this.f19020c, intentFilter);
    }

    /* renamed from: f */
    private void m22766f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f19019b;
        if (context != null && (broadcastReceiver = this.f19020c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f19020c = null;
        }
    }

    /* renamed from: g */
    private void m22767g() {
        boolean z = !this.f19022e;
        for (C7988a adSessionStatePublisher : C7990a.m22755a().mo55801b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55859a(z);
        }
    }

    /* renamed from: a */
    public void mo55806a(Context context) {
        this.f19019b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo55807a(C7993a aVar) {
        this.f19023f = aVar;
    }

    /* renamed from: b */
    public void mo55808b() {
        m22765e();
        this.f19021d = true;
        m22767g();
    }

    /* renamed from: c */
    public void mo55809c() {
        m22766f();
        this.f19021d = false;
        this.f19022e = false;
        this.f19023f = null;
    }

    /* renamed from: d */
    public boolean mo55810d() {
        return !this.f19022e;
    }
}
