package com.p374my.target;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p374my.target.C10033x5;
import com.p374my.target.common.MyTargetActivity;
import com.p374my.target.nativeads.NativeAppwallAd;
import com.p374my.target.nativeads.factories.NativeAppwallViewsFactory;
import com.p374my.target.nativeads.views.AppwallAdView;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.g1 */
public class C9710g1 implements MyTargetActivity.ActivityEngine {

    /* renamed from: a */
    public final NativeAppwallAd f23913a;

    /* renamed from: b */
    public WeakReference<MyTargetActivity> f23914b;

    /* renamed from: c */
    public boolean f23915c;

    public C9710g1(NativeAppwallAd nativeAppwallAd) {
        this.f23913a = nativeAppwallAd;
    }

    /* renamed from: a */
    public static C9710g1 m28057a(NativeAppwallAd nativeAppwallAd) {
        return new C9710g1(nativeAppwallAd);
    }

    /* renamed from: a */
    public void mo64040a() {
        mo64045b();
    }

    /* renamed from: a */
    public final void mo64041a(ActionBar actionBar, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(actionBar.getTitle());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, actionBar.getTitle().length(), 18);
        actionBar.setTitle(spannableStringBuilder);
    }

    /* renamed from: a */
    public void mo64042a(Context context) {
        if (this.f23915c) {
            C9672e0.m27882a("Unable to open Appwall Ad twice, please dismiss currently showing ad first");
            return;
        }
        this.f23915c = true;
        MyTargetActivity.activityEngine = this;
        Intent intent = new Intent(context, MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo64043a(ViewGroup viewGroup) {
        C10033x5 x5Var = new C10033x5(viewGroup.getContext());
        x5Var.setTitle(this.f23913a.getTitle());
        x5Var.setStripeColor(this.f23913a.getTitleSupplementaryColor());
        x5Var.setMainColor(this.f23913a.getTitleBackgroundColor());
        x5Var.setTitleColor(this.f23913a.getTitleTextColor());
        x5Var.setLayoutParams(new ViewGroup.LayoutParams(-1, C10059y8.m29843c(viewGroup.getContext()).mo65778b(52)));
        viewGroup.addView(x5Var);
        x5Var.setOnCloseClickListener(new C10033x5.C10034a() {
            /* renamed from: a */
            public final void mo63322a() {
                C9710g1.this.mo64045b();
            }
        });
    }

    /* renamed from: a */
    public final void mo64044a(MyTargetActivity myTargetActivity) {
        Window window = myTargetActivity.getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            myTargetActivity.setTheme(16974392);
            ActionBar actionBar = myTargetActivity.getActionBar();
            if (actionBar != null) {
                actionBar.setTitle(this.f23913a.getTitle());
                actionBar.setIcon(17170445);
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setBackgroundDrawable(new ColorDrawable(this.f23913a.getTitleBackgroundColor()));
                mo64041a(actionBar, this.f23913a.getTitleTextColor());
                actionBar.setElevation((float) C10059y8.m29843c((Context) myTargetActivity).mo65778b(4));
            }
            window.setStatusBarColor(this.f23913a.getTitleSupplementaryColor());
        } else if (i >= 14) {
            myTargetActivity.setTheme(16974105);
            ActionBar actionBar2 = myTargetActivity.getActionBar();
            if (actionBar2 != null) {
                actionBar2.setTitle(this.f23913a.getTitle());
                actionBar2.setBackgroundDrawable(new ColorDrawable(this.f23913a.getTitleBackgroundColor()));
                mo64041a(actionBar2, this.f23913a.getTitleTextColor());
                actionBar2.setIcon(17170445);
                actionBar2.setDisplayShowTitleEnabled(true);
                actionBar2.setDisplayHomeAsUpEnabled(true);
            }
        }
    }

    /* renamed from: b */
    public void mo64045b() {
        this.f23915c = false;
        WeakReference<MyTargetActivity> weakReference = this.f23914b;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    /* renamed from: b */
    public final void mo64046b(ViewGroup viewGroup) {
        AppwallAdView appwallView = NativeAppwallViewsFactory.getAppwallView(this.f23913a, viewGroup.getContext());
        this.f23913a.registerAppwallAdView(appwallView);
        appwallView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(appwallView);
    }

    public boolean onActivityBackPressed() {
        return true;
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        this.f23914b = new WeakReference<>(myTargetActivity);
        mo64044a(myTargetActivity);
        if (myTargetActivity.getActionBar() == null) {
            LinearLayout linearLayout = new LinearLayout(myTargetActivity);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(linearLayout);
            mo64043a((ViewGroup) linearLayout);
            mo64046b(linearLayout);
        } else {
            mo64046b(frameLayout);
        }
        NativeAppwallAd.AppwallAdListener listener = this.f23913a.getListener();
        if (listener != null) {
            listener.onDisplay(this.f23913a);
        }
    }

    public void onActivityDestroy() {
        this.f23915c = false;
        this.f23914b = null;
        NativeAppwallAd.AppwallAdListener listener = this.f23913a.getListener();
        if (listener != null) {
            listener.onDismiss(this.f23913a);
        }
    }

    public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
        WeakReference<MyTargetActivity> weakReference;
        MyTargetActivity myTargetActivity;
        if (menuItem.getItemId() != 16908332 || (weakReference = this.f23914b) == null || (myTargetActivity = (MyTargetActivity) weakReference.get()) == null) {
            return false;
        }
        myTargetActivity.finish();
        return true;
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
