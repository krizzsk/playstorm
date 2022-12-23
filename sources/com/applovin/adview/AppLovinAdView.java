package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1497b;
import com.applovin.impl.sdk.C2092v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* renamed from: a */
    private C1497b f1495a;

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2323a((AppLovinAdSize) null, (String) null, (AppLovinSdk) null, context, attributeSet);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        m2323a(appLovinAdSize, str, (AppLovinSdk) null, context, (AttributeSet) null);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        m2323a(appLovinAdSize, str, appLovinSdk, context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m2322a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, displayMetrics.widthPixels, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
    }

    /* renamed from: a */
    private void m2323a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            C1497b bVar = new C1497b();
            this.f1495a = bVar;
            bVar.mo12877a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
            return;
        }
        m2322a(attributeSet, context);
    }

    public void destroy() {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12893f();
        }
    }

    public C1497b getController() {
        return this.f1495a;
    }

    public AppLovinAdSize getSize() {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            return bVar.mo12888b();
        }
        return null;
    }

    public String getZoneId() {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            return bVar.mo12890c();
        }
        return null;
    }

    public void loadNextAd() {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12873a();
        } else {
            C2092v.m5051g("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12896i();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12897j();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12891d();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12882a(appLovinAd);
        }
    }

    public void resume() {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12892e();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12884a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12885a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12886a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        C1497b bVar = this.f1495a;
        if (bVar != null) {
            bVar.mo12878a(appLovinAdViewEventListener);
        }
    }

    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }
}
