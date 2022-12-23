package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.environment.C6429h;
import com.ironsource.environment.p205e.C6421a;
import com.ironsource.sdk.controller.C8252x;
import com.ironsource.sdk.p286a.C8150a;
import com.ironsource.sdk.p286a.C8154d;
import com.ironsource.sdk.p286a.C8156f;
import com.ironsource.sdk.p288c.C8173d;
import com.ironsource.sdk.p289d.C8315b;
import com.ironsource.sdk.p293g.C8340b;
import com.ironsource.sdk.p293g.C8343d;
import com.ironsource.sdk.p295i.C8358a;
import com.ironsource.sdk.p296j.C8370g;
import com.ironsource.sdk.utils.C8395d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

public class ControllerActivity extends Activity implements C8251w, C8370g {

    /* renamed from: a */
    private static final String f19501a = ControllerActivity.class.getSimpleName();

    /* renamed from: b */
    private static String f19502b = "removeWebViewContainerView | mContainer is null";

    /* renamed from: c */
    private static String f19503c = "removeWebViewContainerView | view is null";
    public int currentRequestedRotation = -1;

    /* renamed from: d */
    private String f19504d;

    /* renamed from: e */
    private C8252x f19505e;

    /* renamed from: f */
    private RelativeLayout f19506f;

    /* renamed from: g */
    private FrameLayout f19507g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f19508h = false;

    /* renamed from: i */
    private String f19509i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f19510j = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f19511k = new Runnable() {
        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f19508h));
        }
    };

    /* renamed from: l */
    private RelativeLayout.LayoutParams f19512l = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: m */
    private C8340b f19513m;

    /* renamed from: n */
    private boolean f19514n;

    /* renamed from: o */
    private boolean f19515o;

    /* renamed from: a */
    private void m23508a() {
        Logger.m24028i(f19501a, "clearWebviewController");
        C8252x xVar = this.f19505e;
        if (xVar == null) {
            Logger.m24028i(f19501a, "clearWebviewController, null");
            return;
        }
        xVar.f19772j = C8252x.C8308g.Gone;
        this.f19505e.f19774l = null;
        this.f19505e.f19784v = null;
        this.f19505e.mo56618a(this.f19509i, "onDestroy");
    }

    /* renamed from: a */
    private void m23509a(String str) {
        if (str == null) {
            return;
        }
        if ("landscape".equalsIgnoreCase(str)) {
            m23512b();
        } else if ("portrait".equalsIgnoreCase(str)) {
            m23514c();
        } else if ("device".equalsIgnoreCase(str)) {
            if (C6429h.m19340q(this)) {
                setRequestedOrientation(1);
            }
        } else if (getRequestedOrientation() == -1) {
            setRequestedOrientation(4);
        }
    }

    /* renamed from: b */
    private void m23512b() {
        int k = C6429h.m19328k(this);
        Logger.m24028i(f19501a, "setInitiateLandscapeOrientation");
        if (k == 0) {
            Logger.m24028i(f19501a, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (k == 2) {
            Logger.m24028i(f19501a, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (k == 3) {
            Logger.m24028i(f19501a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (k == 1) {
            Logger.m24028i(f19501a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        } else {
            Logger.m24028i(f19501a, "No Rotation");
        }
    }

    /* renamed from: c */
    private void m23514c() {
        int k = C6429h.m19328k(this);
        Logger.m24028i(f19501a, "setInitiatePortraitOrientation");
        if (k == 0) {
            Logger.m24028i(f19501a, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (k == 2) {
            Logger.m24028i(f19501a, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (k == 1) {
            Logger.m24028i(f19501a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (k == 3) {
            Logger.m24028i(f19501a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        } else {
            Logger.m24028i(f19501a, "No Rotation");
        }
    }

    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Logger.m24028i(f19501a, "onBackPressed");
        new C8358a();
        if (!C8358a.m23945a(this)) {
            super.onBackPressed();
        }
    }

    public void onCloseRequested() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.m24028i(f19501a, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            C8252x xVar = (C8252x) C8315b.m23813a((Context) this).f19914a.f19576a;
            this.f19505e = xVar;
            xVar.f19771i.setId(1);
            this.f19505e.f19784v = this;
            this.f19505e.f19774l = this;
            Intent intent = getIntent();
            this.f19509i = intent.getStringExtra("productType");
            this.f19508h = intent.getBooleanExtra("immersive", false);
            this.f19504d = intent.getStringExtra("adViewId");
            this.f19514n = false;
            this.f19515o = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f19508h) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                            ControllerActivity.this.f19510j.removeCallbacks(ControllerActivity.this.f19511k);
                            ControllerActivity.this.f19510j.postDelayed(ControllerActivity.this.f19511k, 500);
                        }
                    }
                });
                runOnUiThread(this.f19511k);
            }
            if (!TextUtils.isEmpty(this.f19509i) && C8343d.C8348e.OfferWall.toString().equalsIgnoreCase(this.f19509i)) {
                if (bundle != null) {
                    C8340b bVar = (C8340b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.f19513m = bVar;
                        this.f19505e.mo56615a(bVar);
                    }
                    finish();
                } else {
                    this.f19513m = this.f19505e.f19775m;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f19506f = relativeLayout;
            setContentView(relativeLayout, this.f19512l);
            String str = this.f19504d;
            this.f19507g = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.f19505e.f19771i : C8395d.m24054a(getApplicationContext(), C8173d.m23494a().mo56456a(str).mo56442b());
            if (this.f19506f.findViewById(1) == null && this.f19507g.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            m23509a(stringExtra);
            this.f19506f.addView(this.f19507g, this.f19512l);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.m24028i(f19501a, "onDestroy");
        try {
            if (this.f19506f != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f19507g.getParent();
                View findViewById = this.f19504d == null ? viewGroup2.findViewById(1) : C8173d.m23494a().mo56456a(this.f19504d).mo56442b();
                if (findViewById != null) {
                    if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
                        viewGroup.removeView(findViewById);
                    }
                    viewGroup2.removeView(this.f19507g);
                    if (!this.f19514n) {
                        Logger.m24028i(f19501a, "onDestroy | destroyedFromBackground");
                        m23508a();
                        return;
                    }
                    return;
                }
                throw new Exception(f19503c);
            }
            throw new Exception(f19502b);
        } catch (Exception e) {
            C8154d.m23442a(C8156f.f19434p, (Map<String, Object>) new C8150a().mo56415a("callfailreason", e.getMessage()).f19410a);
            String str = f19501a;
            Logger.m24028i(str, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f19505e.f19770h != null) {
                this.f19505e.f19769g.onHideCustomView();
                return true;
            }
        }
        if (this.f19508h && (i == 25 || i == 24)) {
            this.f19510j.removeCallbacks(this.f19511k);
            this.f19510j.postDelayed(this.f19511k, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onOrientationChanged(String str, int i) {
        m23509a(str);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        String str = f19501a;
        Logger.m24028i(str, "onPause, isFinishing=" + isFinishing());
        C6421a.f16325a.mo35929b(new Runnable((AudioManager) getSystemService("audio")) {

            /* renamed from: a */
            private /* synthetic */ AudioManager f19724a;

            {
                this.f19724a = r1;
            }

            public final void run() {
                try {
                    this.f19724a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        C8252x xVar = this.f19505e;
        if (xVar != null) {
            xVar.mo56536b((Context) this);
            if (!this.f19515o) {
                this.f19505e.mo56629k();
            }
            this.f19505e.mo56619a(false, "main");
            this.f19505e.mo56618a(this.f19509i, "onPause");
        }
        if (isFinishing()) {
            this.f19514n = true;
            m23508a();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Logger.m24028i(f19501a, "onResume");
        C8252x xVar = this.f19505e;
        if (xVar != null) {
            xVar.mo56522a((Context) this);
            if (!this.f19515o) {
                this.f19505e.mo56630l();
            }
            this.f19505e.mo56619a(true, "main");
            this.f19505e.mo56618a(this.f19509i, "onResume");
        }
        C6421a.f16325a.mo35929b(new Runnable((AudioManager) getSystemService("audio")) {

            /* renamed from: a */
            private /* synthetic */ AudioManager f19725a;

            {
                this.f19725a = r1;
            }

            public final void run() {
                try {
                    this.f19725a.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f19509i) && C8343d.C8348e.OfferWall.toString().equalsIgnoreCase(this.f19509i)) {
            this.f19513m.f20007d = true;
            bundle.putParcelable("state", this.f19513m);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Logger.m24028i(f19501a, "onStart");
        C8252x xVar = this.f19505e;
        if (xVar != null) {
            xVar.mo56618a(this.f19509i, "onStart");
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Logger.m24028i(f19501a, "onStop");
        C8252x xVar = this.f19505e;
        if (xVar != null) {
            xVar.mo56618a(this.f19509i, "onStop");
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.m24028i(f19501a, "onUserLeaveHint");
        C8252x xVar = this.f19505e;
        if (xVar != null) {
            xVar.mo56618a(this.f19509i, "onUserLeaveHint");
        }
    }

    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f19508h && z) {
            runOnUiThread(this.f19511k);
        }
    }

    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = f19501a;
            Logger.m24028i(str, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        runOnUiThread(z ? new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().addFlags(128);
            }
        } : new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().clearFlags(128);
            }
        });
    }
}
