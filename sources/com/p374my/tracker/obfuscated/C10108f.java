package com.p374my.tracker.obfuscated;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.my.tracker.obfuscated.f */
final class C10108f {

    /* renamed from: a */
    int f25180a = 1;

    /* renamed from: b */
    int f25181b = -1;

    C10108f() {
    }

    /* renamed from: a */
    public void mo66164a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            this.f25180a = 1;
            this.f25181b = -1;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        this.f25180a = registerReceiver.getIntExtra("status", 1);
        if (intExtra < 0 || intExtra2 <= 0) {
            this.f25181b = -1;
        } else {
            this.f25181b = (intExtra * 100) / intExtra2;
        }
    }

    /* renamed from: a */
    public void mo66165a(C10129m0 m0Var, Context context) {
        m0Var.mo66303f(this.f25180a);
        int i = this.f25181b;
        if (i >= 0) {
            m0Var.mo66298e(i);
        }
    }

    /* renamed from: b */
    public void mo66166b(Context context) {
    }
}
