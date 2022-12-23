package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.amazon.aps.shared.APSAnalytics;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C2041i;
import com.applovin.impl.sdk.utils.C2078k;
import com.applovin.impl.sdk.utils.C2082o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.n */
public class C1965n implements C2041i.C2042a {

    /* renamed from: a */
    private final C1959m f3717a;

    /* renamed from: b */
    private Object f3718b;

    /* renamed from: c */
    private WeakReference<View> f3719c = new WeakReference<>((Object) null);

    /* renamed from: d */
    private C2041i f3720d;

    /* renamed from: e */
    private C2082o f3721e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f3722f;

    public C1965n(C1959m mVar) {
        this.f3717a = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.widget.Button} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.widget.ImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.widget.Button} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.widget.Button} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m4507a(final android.app.Activity r6) {
        /*
            r5 = this;
            r0 = 40
            int r0 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r6, r0)
            int r1 = r0 / 10
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r0, r0, r3)
            r2.setMargins(r1, r1, r1, r1)
            android.widget.ImageButton r0 = new android.widget.ImageButton     // Catch:{ all -> 0x0030 }
            r0.<init>(r6)     // Catch:{ all -> 0x0030 }
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ all -> 0x0030 }
            int r4 = com.applovin.sdk.C2392R.C2393drawable.applovin_ic_white_small     // Catch:{ all -> 0x0030 }
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)     // Catch:{ all -> 0x0030 }
            r0.setImageDrawable(r3)     // Catch:{ all -> 0x0030 }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x0030 }
            r0.setScaleType(r3)     // Catch:{ all -> 0x0030 }
            int r3 = r1 * 2
            r0.setPadding(r1, r1, r1, r3)     // Catch:{ all -> 0x0030 }
            goto L_0x004b
        L_0x0030:
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r6)
            java.lang.String r1 = "ⓘ"
            r0.setText(r1)
            r1 = -1
            r0.setTextColor(r1)
            r1 = 0
            r0.setAllCaps(r1)
            r3 = 1101004800(0x41a00000, float:20.0)
            r4 = 2
            r0.setTextSize(r4, r3)
            r0.setPadding(r1, r1, r1, r1)
        L_0x004b:
            r0.setLayoutParams(r2)
            android.graphics.drawable.Drawable r1 = r5.m4514e()
            r0.setBackground(r1)
            com.applovin.impl.sdk.n$4 r1 = new com.applovin.impl.sdk.n$4
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            boolean r1 = com.applovin.impl.sdk.utils.C2039g.m4885d()
            if (r1 == 0) goto L_0x006c
            r1 = 5
            int r6 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r6, r1)
            float r6 = (float) r6
            r0.setElevation(r6)
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1965n.m4507a(android.app.Activity):android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4508a(Context context) {
        final String f = m4515f();
        final WeakReference weakReference = new WeakReference(context);
        new AlertDialog.Builder(context).setTitle("Ad Info").setMessage(f).setNegativeButton("Close", (DialogInterface.OnClickListener) null).setPositiveButton("Report", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    C1965n.this.m4509a(context, f);
                }
            }
        }).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4509a(Context context, String str) {
        C2078k kVar = new C2078k();
        kVar.mo14722b("Describe your issue below:\n\n\n").mo14718a("Ad Info:").mo14718a(str).mo14718a("\nDebug Info:\n").mo14719a("Platform", "fireos".equals(this.f3717a.mo14306V().mo14604f()) ? "Fire OS" : APSAnalytics.OS_NAME).mo14719a("AppLovin SDK Version", AppLovinSdk.VERSION).mo14719a("Plugin Version", this.f3717a.mo14311a(C1857b.f3279dz)).mo14719a("Ad Review Version", C1873e.m4119a()).mo14719a("App Package Name", context.getPackageName()).mo14719a("Device", Build.DEVICE).mo14719a("OS Version", Build.VERSION.RELEASE).mo14719a("AppLovin Random Token", this.f3717a.mo14362o()).mo14713a(m4516g());
        Intent intent = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", "MAX Ad Report").setPackage("com.google.android.gm");
        if (this.f3718b instanceof C1829e) {
            intent.putExtra("android.intent.extra.SUBJECT", "AppLovin Ad Report");
            JSONObject originalFullResponse = ((C1829e) this.f3718b).getOriginalFullResponse();
            Uri cacheTextWithFileName = AppLovinContentProviderUtils.cacheTextWithFileName(originalFullResponse.toString(), "ad_response.json");
            if (cacheTextWithFileName != null) {
                intent.putExtra("android.intent.extra.STREAM", cacheTextWithFileName);
            } else {
                kVar.mo14718a("\nAd Response:\n");
                kVar.mo14718a(originalFullResponse.toString());
            }
        }
        intent.putExtra("android.intent.extra.TEXT", kVar.toString());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setPackage((String) null);
            context.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m4513d() {
        if (this.f3717a.mo14332ae().mo14647b() && this.f3719c.get() == null) {
            Activity a = this.f3717a.mo14333af().mo13822a();
            if (a == null) {
                C2092v A = this.f3717a.mo14286A();
                A.mo14793e("AppLovinSdk", "Failed to display creative debugger button for ad: " + this.f3718b);
                return;
            }
            View findViewById = a.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                if (C2092v.m5047a()) {
                    C2092v A2 = this.f3717a.mo14286A();
                    A2.mo14789b("AppLovinSdk", "Displaying creative debugger button for ad: " + this.f3718b);
                }
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a2 = m4507a(a);
                frameLayout.addView(a2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                a2.startAnimation(alphaAnimation);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (a2.getParent() == null) {
                            frameLayout.addView(a2);
                        }
                    }
                });
                this.f3719c = new WeakReference<>(a2);
            }
        }
    }

    /* renamed from: e */
    private Drawable m4514e() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* renamed from: f */
    private String m4515f() {
        C2078k kVar = new C2078k();
        Object obj = this.f3718b;
        if (obj instanceof C1829e) {
            C1829e eVar = (C1829e) obj;
            kVar.mo14719a("Network", "APPLOVIN").mo14716a(eVar).mo14721b(eVar);
        } else if (obj instanceof C1573a) {
            kVar.mo14715a((C1573a) obj);
        }
        kVar.mo14717a(this.f3717a);
        kVar.mo14713a(m4516g());
        return kVar.toString();
    }

    /* renamed from: g */
    private Bundle m4516g() {
        Bundle b = this.f3717a.mo14287B().mo14137b(Utils.getCurrentAdServeId(this.f3718b));
        if (b == null) {
            return null;
        }
        for (String str : b.keySet()) {
            Object obj = b.get(str);
            b.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj, b);
        }
        return b;
    }

    /* renamed from: a */
    public void mo14380a() {
        C2041i iVar = this.f3720d;
        if (iVar != null) {
            iVar.mo14675b();
        }
        this.f3718b = null;
        this.f3719c = new WeakReference<>((Object) null);
    }

    /* renamed from: a */
    public void mo14381a(Object obj) {
        if (!C1645c.m3319b(obj)) {
            this.f3718b = obj;
            if (((Boolean) this.f3717a.mo14311a(C1857b.f3131bH)).booleanValue() && this.f3717a.mo14363p().isCreativeDebuggerEnabled()) {
                if (this.f3720d == null) {
                    this.f3720d = new C2041i(this.f3717a, this);
                }
                this.f3720d.mo14674a();
            }
        }
    }

    /* renamed from: b */
    public void mo14382b() {
        if (this.f3722f == 0) {
            this.f3721e = C2082o.m5001a(TimeUnit.SECONDS.toMillis(3), this.f3717a, new Runnable() {
                public void run() {
                    int unused = C1965n.this.f3722f = 0;
                }
            });
        }
        int i = this.f3722f;
        if (i % 2 == 0) {
            this.f3722f = i + 1;
        }
    }

    /* renamed from: c */
    public void mo14383c() {
        int i = this.f3722f;
        if (i % 2 == 1) {
            this.f3722f = i + 1;
        }
        if (this.f3722f / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    C1965n.this.m4513d();
                }
            });
            this.f3722f = 0;
            this.f3721e.mo14753d();
            this.f3720d.mo14675b();
        }
    }
}
