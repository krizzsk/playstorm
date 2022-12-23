package com.mbridge.msdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.tools.C8608u;

public abstract class MBBaseActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public OrientationEventListener f4512a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Display f4513b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f4514c = -1;

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            m5135b();
            m5131a();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            C8608u.m24884d("MBBaseActivity", e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!C2347b.f4898c) {
            getNotchParams();
            m5135b();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m5135b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f4512a;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f4512a = null;
        }
    }

    public void getNotchParams() {
        getWindow().getDecorView().postDelayed(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd A[Catch:{ Exception -> 0x00e3 }] */
            /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r13 = this;
                    java.lang.String r0 = "MBBaseActivity"
                    int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e3 }
                    r2 = 23
                    if (r1 < r2) goto L_0x00eb
                    com.mbridge.msdk.activity.MBBaseActivity r1 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    android.view.Window r1 = r1.getWindow()     // Catch:{ Exception -> 0x00e3 }
                    android.view.View r1 = r1.getDecorView()     // Catch:{ Exception -> 0x00e3 }
                    android.view.WindowInsets r1 = r1.getRootWindowInsets()     // Catch:{ Exception -> 0x00e3 }
                    r2 = -1
                    r3 = 0
                    if (r1 == 0) goto L_0x00cb
                    int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e3 }
                    r5 = 28
                    if (r4 < r5) goto L_0x00cb
                    android.view.DisplayCutout r1 = r1.getDisplayCutout()     // Catch:{ Exception -> 0x00e3 }
                    if (r1 == 0) goto L_0x00cb
                    int r4 = r1.getSafeInsetLeft()     // Catch:{ Exception -> 0x00e3 }
                    int r5 = r1.getSafeInsetRight()     // Catch:{ Exception -> 0x00e3 }
                    int r6 = r1.getSafeInsetTop()     // Catch:{ Exception -> 0x00e3 }
                    int r1 = r1.getSafeInsetBottom()     // Catch:{ Exception -> 0x00e3 }
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e3 }
                    r7.<init>()     // Catch:{ Exception -> 0x00e3 }
                    java.lang.String r8 = "NOTCH Left:"
                    r7.append(r8)     // Catch:{ Exception -> 0x00e3 }
                    r7.append(r4)     // Catch:{ Exception -> 0x00e3 }
                    java.lang.String r8 = " Right:"
                    r7.append(r8)     // Catch:{ Exception -> 0x00e3 }
                    r7.append(r5)     // Catch:{ Exception -> 0x00e3 }
                    java.lang.String r8 = " Top:"
                    r7.append(r8)     // Catch:{ Exception -> 0x00e3 }
                    r7.append(r6)     // Catch:{ Exception -> 0x00e3 }
                    java.lang.String r8 = " Bottom:"
                    r7.append(r8)     // Catch:{ Exception -> 0x00e3 }
                    r7.append(r1)     // Catch:{ Exception -> 0x00e3 }
                    java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00e3 }
                    com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r7)     // Catch:{ Exception -> 0x00e3 }
                    com.mbridge.msdk.activity.MBBaseActivity r7 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    android.view.Display r7 = r7.f4513b     // Catch:{ Exception -> 0x00e3 }
                    if (r7 == 0) goto L_0x0075
                    com.mbridge.msdk.activity.MBBaseActivity r7 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    android.view.Display r7 = r7.f4513b     // Catch:{ Exception -> 0x00e3 }
                    int r7 = r7.getRotation()     // Catch:{ Exception -> 0x00e3 }
                    goto L_0x007b
                L_0x0075:
                    com.mbridge.msdk.activity.MBBaseActivity r7 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    int r7 = r7.m5131a()     // Catch:{ Exception -> 0x00e3 }
                L_0x007b:
                    com.mbridge.msdk.activity.MBBaseActivity r8 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    int r8 = r8.f4514c     // Catch:{ Exception -> 0x00e3 }
                    r9 = 3
                    r10 = 2
                    r11 = 1
                    if (r8 != r2) goto L_0x00b6
                    com.mbridge.msdk.activity.MBBaseActivity r8 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    if (r7 != 0) goto L_0x008c
                    r12 = r9
                    goto L_0x0099
                L_0x008c:
                    if (r7 != r11) goto L_0x0090
                    r12 = r11
                    goto L_0x0099
                L_0x0090:
                    if (r7 != r10) goto L_0x0094
                    r12 = 4
                    goto L_0x0099
                L_0x0094:
                    if (r7 != r9) goto L_0x0098
                    r12 = r10
                    goto L_0x0099
                L_0x0098:
                    r12 = r2
                L_0x0099:
                    int unused = r8.f4514c = r12     // Catch:{ Exception -> 0x00e3 }
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e3 }
                    r8.<init>()     // Catch:{ Exception -> 0x00e3 }
                    com.mbridge.msdk.activity.MBBaseActivity r12 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    int r12 = r12.f4514c     // Catch:{ Exception -> 0x00e3 }
                    r8.append(r12)     // Catch:{ Exception -> 0x00e3 }
                    java.lang.String r12 = ""
                    r8.append(r12)     // Catch:{ Exception -> 0x00e3 }
                    java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00e3 }
                    com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r8)     // Catch:{ Exception -> 0x00e3 }
                L_0x00b6:
                    if (r7 == 0) goto L_0x00c9
                    if (r7 == r11) goto L_0x00c6
                    if (r7 == r10) goto L_0x00c3
                    if (r7 == r9) goto L_0x00c0
                L_0x00be:
                    r7 = r1
                    goto L_0x00cf
                L_0x00c0:
                    r2 = 270(0x10e, float:3.78E-43)
                    goto L_0x00be
                L_0x00c3:
                    r2 = 180(0xb4, float:2.52E-43)
                    goto L_0x00be
                L_0x00c6:
                    r2 = 90
                    goto L_0x00be
                L_0x00c9:
                    r7 = r1
                    goto L_0x00d0
                L_0x00cb:
                    r4 = r3
                    r5 = r4
                    r6 = r5
                    r7 = r6
                L_0x00cf:
                    r3 = r2
                L_0x00d0:
                    com.mbridge.msdk.activity.MBBaseActivity r2 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    r2.setTopControllerPadding(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00e3 }
                    com.mbridge.msdk.activity.MBBaseActivity r1 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    android.view.OrientationEventListener r1 = r1.f4512a     // Catch:{ Exception -> 0x00e3 }
                    if (r1 != 0) goto L_0x00eb
                    com.mbridge.msdk.activity.MBBaseActivity r1 = com.mbridge.msdk.activity.MBBaseActivity.this     // Catch:{ Exception -> 0x00e3 }
                    com.mbridge.msdk.activity.MBBaseActivity.m5138e(r1)     // Catch:{ Exception -> 0x00e3 }
                    goto L_0x00eb
                L_0x00e3:
                    r1 = move-exception
                    java.lang.String r1 = r1.getMessage()
                    com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r1)
                L_0x00eb:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.MBBaseActivity.C22711.run():void");
            }
        }, 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m5131a() {
        if (this.f4513b == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f4513b = getDisplay();
            } else {
                this.f4513b = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f4513b;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    /* renamed from: b */
    private void m5135b() {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                getWindow().addFlags(67108864);
                getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(2);
        } catch (Throwable th) {
            C8608u.m24884d("MBBaseActivity", th.getMessage());
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m5138e(MBBaseActivity mBBaseActivity) {
        C22722 r0 = new OrientationEventListener(mBBaseActivity, 1) {
            public final void onOrientationChanged(int i) {
                int rotation = MBBaseActivity.this.f4513b != null ? MBBaseActivity.this.f4513b.getRotation() : 0;
                if (rotation == 1 && MBBaseActivity.this.f4514c != 1) {
                    int unused = MBBaseActivity.this.f4514c = 1;
                    MBBaseActivity.this.getNotchParams();
                    C8608u.m24884d("MBBaseActivity", "Orientation Left");
                } else if (rotation == 3 && MBBaseActivity.this.f4514c != 2) {
                    int unused2 = MBBaseActivity.this.f4514c = 2;
                    MBBaseActivity.this.getNotchParams();
                    C8608u.m24884d("MBBaseActivity", "Orientation Right");
                } else if (rotation == 0 && MBBaseActivity.this.f4514c != 3) {
                    int unused3 = MBBaseActivity.this.f4514c = 3;
                    MBBaseActivity.this.getNotchParams();
                    C8608u.m24884d("MBBaseActivity", "Orientation Top");
                } else if (rotation == 2 && MBBaseActivity.this.f4514c != 4) {
                    int unused4 = MBBaseActivity.this.f4514c = 4;
                    MBBaseActivity.this.getNotchParams();
                    C8608u.m24884d("MBBaseActivity", "Orientation Bottom");
                }
            }
        };
        mBBaseActivity.f4512a = r0;
        if (r0.canDetectOrientation()) {
            mBBaseActivity.f4512a.enable();
            return;
        }
        mBBaseActivity.f4512a.disable();
        mBBaseActivity.f4512a = null;
    }
}
