package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C0765c1;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.Typography;

/* renamed from: com.adcolony.sdk.l0 */
public final class C0898l0 extends C0765c1 {

    /* renamed from: F */
    private final int f597F;

    /* renamed from: G */
    private ImageView f598G;

    /* renamed from: H */
    private String f599H = "";
    /* access modifiers changed from: private */

    /* renamed from: I */
    public String f600I = "";

    /* renamed from: J */
    private int f601J;

    /* renamed from: K */
    private int f602K;

    /* renamed from: L */
    private boolean f603L;

    /* renamed from: M */
    private boolean f604M;

    /* renamed from: com.adcolony.sdk.l0$a */
    private final class C0899a extends C0765c1.C0768c {
        public C0899a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0904f().mo10880a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$b */
    private final class C0900b extends C0765c1.C0769d {
        public C0900b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0904f().mo10880a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$c */
    private final class C0901c extends C0765c1.C0770e {
        public C0901c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0904f().mo10880a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$d */
    private final class C0902d extends C0765c1.C0771f {
        public C0902d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0904f().mo10880a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$e */
    private final class C0903e extends C0765c1.C0772g {
        public C0903e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0904f().mo10880a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$f */
    private final class C0904f {
        public C0904f() {
        }

        /* renamed from: a */
        public final void mo10880a() {
            if (!C0898l0.this.getModuleInitialized()) {
                float s = C0714a.m136b().mo10843n().mo10996s();
                C0823f1 info = C0898l0.this.getInfo();
                C0898l0 l0Var = C0898l0.this;
                C0764c0.m326b(info, "app_orientation", C1038z0.m1209d(C1038z0.m1216f()));
                C0764c0.m326b(info, "x", C1038z0.m1173a((View) l0Var));
                C0764c0.m326b(info, "y", C1038z0.m1192b((View) l0Var));
                C0764c0.m326b(info, "width", (int) (((float) l0Var.getCurrentWidth()) / s));
                C0764c0.m326b(info, "height", (int) (((float) l0Var.getCurrentHeight()) / s));
                C0764c0.m319a(info, "ad_session_id", l0Var.getAdSessionId());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.l0$g */
    static final class C0905g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0898l0 f611a;

        C0905g(C0898l0 l0Var) {
            this.f611a = l0Var;
        }

        public final void onClick(View view) {
            C1038z0.m1183a(new Intent("android.intent.action.VIEW", Uri.parse(this.f611a.f600I)));
            C0714a.m136b().mo10801A().mo11122c(this.f611a.getAdSessionId());
        }
    }

    public C0898l0(Context context, int i, C0841h0 h0Var, int i2) {
        super(context, i, h0Var);
        this.f597F = i2;
    }

    /* renamed from: q */
    private final void m749q() {
        Context a = C0714a.m129a();
        if (a != null && getParentContainer() != null && !this.f604M) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            ImageView imageView = new ImageView(a);
            imageView.setImageURI(Uri.fromFile(new File(this.f599H)));
            imageView.setBackground(gradientDrawable);
            imageView.setOnClickListener(new C0905g(this));
            Unit unit = Unit.INSTANCE;
            this.f598G = imageView;
            m750r();
            addView(this.f598G);
        }
    }

    /* renamed from: r */
    private final void m750r() {
        ImageView imageView = this.f598G;
        if (imageView != null) {
            Rect w = C0714a.m136b().mo10843n().mo11000w();
            int currentX = this.f603L ? getCurrentX() + getCurrentWidth() : w.width();
            int currentY = this.f603L ? getCurrentY() + getCurrentHeight() : w.height();
            float s = C0714a.m136b().mo10843n().mo10996s();
            int i = (int) (((float) this.f601J) * s);
            int i2 = (int) (((float) this.f602K) * s);
            imageView.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, currentX - i, currentY - i2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public /* synthetic */ void mo10506e() {
        super.mo10506e();
        boolean z = true;
        if (this.f599H.length() > 0) {
            if (this.f600I.length() <= 0) {
                z = false;
            }
            if (z) {
                m749q();
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ int getAdc3ModuleId() {
        return this.f597F;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0900b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0901c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0902d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0903e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0899a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public /* synthetic */ void mo10535k() {
        if (getMraidFilepath().length() > 0) {
            Regex regex = new Regex("script\\s*src\\s*=\\s*\"mraid.js\"");
            setMUrl(mo10603a(regex.replaceFirst(getMUrl(), "script src=\"file://" + getMraidFilepath() + Typography.quote), C0764c0.m336h(C0764c0.m334f(getInfo(), DeviceRequestsHelper.DEVICE_INFO_PARAM), "iab_filepath")));
        }
    }

    /* renamed from: p */
    public final void mo10879p() {
        C0752c parentContainer;
        ImageView imageView = this.f598G;
        if (imageView != null && (parentContainer = getParentContainer()) != null) {
            parentContainer.mo10566a((View) imageView, FriendlyObstructionPurpose.OTHER);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C0841h0 h0Var) {
        super.setBounds(h0Var);
        m750r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo10502a(C0841h0 h0Var, int i, C0752c cVar) {
        C0823f1 a = h0Var.mo10772a();
        this.f599H = C0764c0.m336h(a, "ad_choices_filepath");
        this.f600I = C0764c0.m336h(a, "ad_choices_url");
        this.f601J = C0764c0.m332d(a, "ad_choices_width");
        this.f602K = C0764c0.m332d(a, "ad_choices_height");
        this.f603L = C0764c0.m325b(a, "ad_choices_snap_to_webview");
        this.f604M = C0764c0.m325b(a, "disable_ad_choices");
        super.mo10502a(h0Var, i, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo10504a(C0823f1 f1Var, String str) {
        if (super.mo10504a(f1Var, str)) {
            return true;
        }
        setEnableMessages(false);
        return true;
    }
}
