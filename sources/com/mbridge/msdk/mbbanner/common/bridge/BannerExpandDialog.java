package com.mbridge.msdk.mbbanner.common.bridge;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.click.p058b.C2312a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbbanner.common.p323b.C8670a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8808a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8810b;
import com.mbridge.msdk.mbsignalcommon.p338b.C8790b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p054c.p056b.C2284a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class BannerExpandDialog extends Dialog {

    /* renamed from: a */
    private final String f21010a = "BannerExpandDialog";

    /* renamed from: b */
    private String f21011b;

    /* renamed from: c */
    private boolean f21012c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public FrameLayout f21013d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WindVaneWebView f21014e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f21015f;

    /* renamed from: g */
    private String f21016g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<CampaignEx> f21017h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8670a f21018i;

    /* renamed from: j */
    private C8810b f21019j = new C8810b() {
        public final void expand(String str, boolean z) {
        }

        public final CampaignEx getMraidCampaign() {
            return null;
        }

        public final void open(String str) {
            try {
                if (BannerExpandDialog.this.f21014e == null || System.currentTimeMillis() - BannerExpandDialog.this.f21014e.lastTouchTime <= ((long) C2312a.f4769c) || !C2312a.m5453a((CampaignEx) BannerExpandDialog.this.f21017h.get(0), BannerExpandDialog.this.f21014e.getUrl(), C2312a.f4767a)) {
                    C8608u.m24884d("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f21017h.size() > 1) {
                        C2350a.m5601e().mo15792g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f21018i != null) {
                        BannerExpandDialog.this.f21018i.mo57992a(true, str);
                    }
                }
            } catch (Throwable th) {
                C8608u.m24881a("BannerExpandDialog", "open", th);
            }
        }

        public final void close() {
            BannerExpandDialog.this.dismiss();
        }

        public final void unload() {
            close();
        }

        public final void useCustomClose(boolean z) {
            try {
                BannerExpandDialog.this.f21015f.setVisibility(z ? 4 : 0);
            } catch (Throwable th) {
                C8608u.m24881a("BannerExpandDialog", "useCustomClose", th);
            }
        }
    };

    public BannerExpandDialog(Context context, Bundle bundle, C8670a aVar) {
        super(context);
        if (bundle != null) {
            this.f21011b = bundle.getString("url");
            this.f21012c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f21018i = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21013d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f21014e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f21013d.addView(this.f21014e);
        TextView textView = new TextView(getContext());
        this.f21015f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f21015f.setLayoutParams(layoutParams);
        this.f21015f.setVisibility(this.f21012c ? 4 : 0);
        this.f21015f.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                BannerExpandDialog.this.dismiss();
            }
        });
        this.f21013d.addView(this.f21015f);
        setContentView(this.f21013d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            if (Build.VERSION.SDK_INT >= 16) {
                int i = 519;
                if (Build.VERSION.SDK_INT >= 19) {
                    i = 4615;
                }
                getWindow().getDecorView().setSystemUiVisibility(i);
            }
        }
        this.f21014e.setWebViewListener(new C8790b() {
            /* renamed from: a */
            public final void mo57902a(WebView webView, String str) {
                super.mo57902a(webView, str);
                StringBuilder sb = new StringBuilder("javascript:");
                sb.append(C2284a.m5293a().mo15574b());
                if (Build.VERSION.SDK_INT <= 19) {
                    webView.loadUrl(sb.toString());
                } else {
                    webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                        public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                            String str = (String) obj;
                        }
                    });
                }
                BannerExpandDialog.m25190a(BannerExpandDialog.this);
            }
        });
        this.f21014e.setObject(this.f21019j);
        this.f21014e.loadUrl(this.f21011b);
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                if (BannerExpandDialog.this.f21018i != null) {
                    BannerExpandDialog.this.f21018i.mo57991a(false);
                }
                BannerExpandDialog.this.f21014e.loadDataWithBaseURL((String) null, "", "text/html", "utf-8", (String) null);
                BannerExpandDialog.this.f21013d.removeView(BannerExpandDialog.this.f21014e);
                BannerExpandDialog.this.f21014e.release();
                WindVaneWebView unused = BannerExpandDialog.this.f21014e = null;
                C8670a unused2 = BannerExpandDialog.this.f21018i = null;
            }
        });
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f21016g = str;
        this.f21017h = list;
    }

    /* renamed from: a */
    static /* synthetic */ void m25190a(BannerExpandDialog bannerExpandDialog) {
        BannerExpandDialog bannerExpandDialog2 = bannerExpandDialog;
        try {
            int i = C2350a.m5601e().mo15792g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            HashMap j = C8596q.m24841j(C2350a.m5601e().mo15792g());
            int intValue = ((Integer) j.get("width")).intValue();
            int intValue2 = ((Integer) j.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            int[] iArr = new int[2];
            bannerExpandDialog2.f21014e.getLocationInWindow(iArr);
            C8808a.m25622a().mo58254a(bannerExpandDialog2.f21014e, (float) iArr[0], (float) iArr[1], (float) bannerExpandDialog2.f21014e.getWidth(), (float) bannerExpandDialog2.f21014e.getHeight());
            C8808a.m25622a().mo58259b(bannerExpandDialog2.f21014e, (float) iArr[0], (float) iArr[1], (float) bannerExpandDialog2.f21014e.getWidth(), (float) bannerExpandDialog2.f21014e.getHeight());
            C8808a.m25622a().mo58258b(bannerExpandDialog2.f21014e, (float) C8596q.m24837h(C2350a.m5601e().mo15792g()), (float) C8596q.m24838i(C2350a.m5601e().mo15792g()));
            C8808a.m25622a().mo58261c(bannerExpandDialog2.f21014e, (float) intValue, (float) intValue2);
            C8808a.m25622a().mo58257a((WebView) bannerExpandDialog2.f21014e, (Map<String, Object>) hashMap);
            C8808a.m25622a().mo58251a(bannerExpandDialog2.f21014e);
        } catch (Throwable th) {
            C8608u.m24881a("BannerExpandDialog", "notifyMraid", th);
        }
    }
}
