package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2958a;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.common.e */
/* compiled from: TTPrivacyAdReportDialog */
public class C3234e extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f7647b = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};

    /* renamed from: a */
    private Handler f7648a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f7649c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f7650d;

    public C3234e(Context context) {
        super(context, C2984t.m8434g(context, "tt_privacy_dialog_theme_ad_report"));
    }

    /* renamed from: a */
    public void mo18893a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f7649c = C2958a.m8335a(new JSONObject(str)).toString();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(C2984t.m8433f(getContext(), "tt_ad_report_info"), (ViewGroup) null), new ViewGroup.LayoutParams(C4020v.m13306c(getContext()), (int) (((double) C4020v.m13310d(getContext())) * 0.9d)));
        m9436b();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    /* renamed from: b */
    private void m9436b() {
        this.f7650d = (TextView) findViewById(C2984t.m8432e(getContext(), "tt_ad_report_creative_info"));
        final String d = C4014u.m13214d();
        final String f = C4014u.m13226f();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        ((TextView) findViewById(C2984t.m8432e(getContext(), "tt_ad_report_sdk_version"))).setText(BuildConfig.VERSION_NAME);
        ((TextView) findViewById(C2984t.m8432e(getContext(), "tt_ad_report_app_package_name"))).setText(d);
        ((TextView) findViewById(C2984t.m8432e(getContext(), "tt_ad_report_app_version"))).setText(f);
        ((TextView) findViewById(C2984t.m8432e(getContext(), "tt_ad_report_os"))).setText(str);
        ((TextView) findViewById(C2984t.m8432e(getContext(), "tt_ad_report_device"))).setText(str2);
        this.f7650d.setText("loading ...");
        ((Button) findViewById(C2984t.m8432e(getContext(), "tt_ad_report_copy_button"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) C3234e.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder("");
                    String[] strArr = {BuildConfig.VERSION_NAME, d, f, str, str2, C3234e.this.f7649c};
                    for (int i = 0; i < C3234e.f7647b.length; i++) {
                        sb.append(C3234e.f7647b[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                }
            }
        });
        ((ImageView) findViewById(C2984t.m8432e(getContext(), "tt_ad_report_close_button"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3234e.this.f7650d.setText("loading ...");
                C3234e.this.cancel();
            }
        });
    }

    public void show() {
        super.show();
        this.f7648a.postDelayed(new Runnable() {
            public void run() {
                C3234e.this.f7650d.setText(C3234e.this.f7649c);
            }
        }, 1000);
    }
}
