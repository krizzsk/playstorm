package com.p374my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.net.URI;

/* renamed from: com.my.target.q6 */
public class C9921q6 extends LinearLayout {

    /* renamed from: a */
    public static final int f24562a = C10059y8.m29841c();

    /* renamed from: b */
    public static final int f24563b = C10059y8.m29841c();

    /* renamed from: c */
    public final C10059y8 f24564c;

    /* renamed from: d */
    public final ImageButton f24565d;

    /* renamed from: e */
    public final LinearLayout f24566e;

    /* renamed from: f */
    public final TextView f24567f;

    /* renamed from: g */
    public final TextView f24568g;

    /* renamed from: h */
    public final FrameLayout f24569h;

    /* renamed from: i */
    public final View f24570i;

    /* renamed from: j */
    public final FrameLayout f24571j;

    /* renamed from: k */
    public final ImageButton f24572k;

    /* renamed from: l */
    public final RelativeLayout f24573l;

    /* renamed from: m */
    public final C9605a6 f24574m;

    /* renamed from: n */
    public final ProgressBar f24575n;

    /* renamed from: o */
    public C9925d f24576o;

    /* renamed from: com.my.target.q6$a */
    public class C9922a extends WebViewClient {
        public C9922a() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            C9921q6.this.f24567f.setText(C9921q6.this.mo65302a(str));
            return true;
        }
    }

    /* renamed from: com.my.target.q6$b */
    public class C9923b extends WebChromeClient {
        public C9923b() {
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && C9921q6.this.f24575n.getVisibility() == 8) {
                C9921q6.this.f24575n.setVisibility(0);
                C9921q6.this.f24570i.setVisibility(8);
            }
            C9921q6.this.f24575n.setProgress(i);
            if (i >= 100) {
                C9921q6.this.f24575n.setVisibility(8);
                C9921q6.this.f24570i.setVisibility(0);
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            C9921q6.this.f24568g.setText(webView.getTitle());
            C9921q6.this.f24568g.setVisibility(0);
        }
    }

    /* renamed from: com.my.target.q6$c */
    public class C9924c implements View.OnClickListener {
        public C9924c() {
        }

        public /* synthetic */ C9924c(C9921q6 q6Var, C9922a aVar) {
            this();
        }

        public void onClick(View view) {
            if (view == C9921q6.this.f24565d) {
                if (C9921q6.this.f24576o != null) {
                    C9921q6.this.f24576o.mo63343a();
                }
            } else if (view == C9921q6.this.f24572k) {
                C9921q6.this.mo65307e();
            }
        }
    }

    /* renamed from: com.my.target.q6$d */
    public interface C9925d {
        /* renamed from: a */
        void mo63343a();
    }

    public C9921q6(Context context) {
        super(context);
        this.f24573l = new RelativeLayout(context);
        this.f24574m = new C9605a6(context);
        this.f24565d = new ImageButton(context);
        this.f24566e = new LinearLayout(context);
        this.f24567f = new TextView(context);
        this.f24568g = new TextView(context);
        this.f24569h = new FrameLayout(context);
        this.f24571j = new FrameLayout(context);
        this.f24572k = new ImageButton(context);
        this.f24575n = new ProgressBar(context, (AttributeSet) null, 16842872);
        this.f24570i = new View(context);
        this.f24564c = C10059y8.m29843c(context);
    }

    /* renamed from: a */
    public final String mo65302a(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public boolean mo65303a() {
        return this.f24574m.mo63462a();
    }

    /* renamed from: b */
    public void mo65304b() {
        this.f24574m.setWebChromeClient((WebChromeClient) null);
        this.f24574m.mo63459a(0);
    }

    /* renamed from: c */
    public void mo65305c() {
        this.f24574m.mo63463b();
    }

    /* renamed from: d */
    public void mo65306d() {
        WebSettings settings = this.f24574m.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
        }
        this.f24574m.setWebViewClient(new C9922a());
        this.f24574m.setWebChromeClient(new C9923b());
        mo65308f();
    }

    /* renamed from: e */
    public final void mo65307e() {
        String url = this.f24574m.getUrl();
        if (!TextUtils.isEmpty(url)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                if (!(getContext() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                getContext().startActivity(intent);
            } catch (Throwable unused) {
                C9672e0.m27882a("unable to open url " + url);
            }
        }
    }

    /* renamed from: f */
    public final void mo65308f() {
        setOrientation(1);
        setGravity(16);
        C9924c cVar = new C9924c(this, (C9922a) null);
        this.f24574m.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedValue typedValue = new TypedValue();
        int b = this.f24564c.mo65778b(50);
        if (getContext().getTheme().resolveAttribute(16843499, typedValue, true)) {
            b = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.f24573l.setLayoutParams(new LinearLayout.LayoutParams(-1, b));
        this.f24569h.setLayoutParams(new LinearLayout.LayoutParams(b, b));
        FrameLayout frameLayout = this.f24569h;
        int i = f24562a;
        frameLayout.setId(i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f24565d.setLayoutParams(layoutParams);
        this.f24565d.setImageBitmap(C9905p5.m28986a(b / 4, this.f24564c.mo65778b(2)));
        this.f24565d.setContentDescription("Close");
        this.f24565d.setOnClickListener(cVar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b, b);
        layoutParams2.addRule(Build.VERSION.SDK_INT >= 18 ? 21 : 11);
        this.f24571j.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.f24571j;
        int i2 = f24563b;
        frameLayout2.setId(i2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f24572k.setLayoutParams(layoutParams3);
        this.f24572k.setImageBitmap(C9905p5.m28988b(getContext()));
        this.f24572k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f24572k.setContentDescription("Open outside");
        this.f24572k.setOnClickListener(cVar);
        C10059y8.m29829a((View) this.f24565d, 0, -3355444);
        C10059y8.m29829a((View) this.f24572k, 0, -3355444);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(1, i);
        layoutParams4.addRule(0, i2);
        this.f24566e.setLayoutParams(layoutParams4);
        this.f24566e.setOrientation(1);
        this.f24566e.setPadding(this.f24564c.mo65778b(4), this.f24564c.mo65778b(4), this.f24564c.mo65778b(4), this.f24564c.mo65778b(4));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        this.f24568g.setVisibility(8);
        this.f24568g.setLayoutParams(layoutParams5);
        this.f24568g.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f24568g.setTextSize(2, 18.0f);
        this.f24568g.setSingleLine();
        this.f24568g.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.f24567f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f24567f.setSingleLine();
        this.f24567f.setTextSize(2, 12.0f);
        this.f24567f.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16537100), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(-1968642);
        LayerDrawable layerDrawable = (LayerDrawable) this.f24575n.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(16908288, colorDrawable);
        layerDrawable.setDrawableByLayerId(16908301, clipDrawable);
        this.f24575n.setProgressDrawable(layerDrawable);
        this.f24575n.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f24564c.mo65778b(2)));
        this.f24575n.setProgress(0);
        this.f24566e.addView(this.f24568g);
        this.f24566e.addView(this.f24567f);
        this.f24569h.addView(this.f24565d);
        this.f24571j.addView(this.f24572k);
        this.f24573l.addView(this.f24569h);
        this.f24573l.addView(this.f24566e);
        this.f24573l.addView(this.f24571j);
        addView(this.f24573l);
        this.f24570i.setBackgroundColor(-5592406);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, 1);
        this.f24570i.setVisibility(8);
        this.f24570i.setLayoutParams(layoutParams6);
        addView(this.f24575n);
        addView(this.f24570i);
        addView(this.f24574m);
    }

    public void setListener(C9925d dVar) {
        this.f24576o = dVar;
    }

    public void setUrl(String str) {
        this.f24574m.mo63460a(str);
        this.f24567f.setText(mo65302a(str));
    }
}
