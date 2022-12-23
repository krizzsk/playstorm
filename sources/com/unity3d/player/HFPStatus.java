package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

public class HFPStatus {

    /* renamed from: a */
    private Context f29003a;

    /* renamed from: b */
    private BroadcastReceiver f29004b = null;

    /* renamed from: c */
    private Intent f29005c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f29006d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AudioManager f29007e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f29008f = C11862a.f29010a;

    /* renamed from: com.unity3d.player.HFPStatus$a */
    enum C11862a {
        ;

        static {
            f29013d = new int[]{1, 2, 3};
        }
    }

    public HFPStatus(Context context) {
        this.f29003a = context;
        this.f29007e = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    /* renamed from: a */
    public final void mo72886a() {
        deinitHFPStatusJni();
    }

    /* access modifiers changed from: protected */
    public boolean getHFPStat() {
        return this.f29008f == C11862a.f29011b;
    }

    /* access modifiers changed from: protected */
    public void requestHFPStat() {
        C118611 r0 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                if (intExtra == 0) {
                    if (HFPStatus.this.f29006d) {
                        HFPStatus.this.f29007e.setMode(0);
                    }
                    boolean unused = HFPStatus.this.f29006d = false;
                } else if (intExtra == 1) {
                    int unused2 = HFPStatus.this.f29008f = C11862a.f29011b;
                    if (!HFPStatus.this.f29006d) {
                        HFPStatus.this.f29007e.stopBluetoothSco();
                    } else {
                        HFPStatus.this.f29007e.setMode(3);
                    }
                } else if (intExtra == 2) {
                    if (HFPStatus.this.f29008f == C11862a.f29011b) {
                        boolean unused3 = HFPStatus.this.f29006d = true;
                    } else {
                        int unused4 = HFPStatus.this.f29008f = C11862a.f29012c;
                    }
                }
            }
        };
        this.f29004b = r0;
        this.f29005c = this.f29003a.registerReceiver(r0, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f29007e.startBluetoothSco();
        } catch (NullPointerException unused) {
            C11922g.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }
}
