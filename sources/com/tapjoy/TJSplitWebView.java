package com.tapjoy;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11690gs;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public class TJSplitWebView extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TJWebView f27438a;

    /* renamed from: b */
    private C11394a f27439b;

    /* renamed from: c */
    private C11394a f27440c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f27441d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f27442e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f27443f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Uri f27444g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public HashSet<String> f27445h;

    /* renamed from: i */
    private JSONObject f27446i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public TJAdUnitJSBridge f27447j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Context f27448k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Boolean f27449l;

    /* renamed from: m */
    private RelativeLayout f27450m;

    /* renamed from: n */
    private FrameLayout f27451n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ProgressBar f27452o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public TextView f27453p;

    /* renamed from: q */
    private TJImageButton f27454q;

    /* renamed from: r */
    private TJImageButton f27455r;

    /* renamed from: s */
    private String f27456s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f27457t;

    /* renamed from: u */
    private String f27458u;

    /* renamed from: v */
    private String f27459v;

    /* renamed from: w */
    private String f27460w;

    public TJSplitWebView(Context context, JSONObject jSONObject, TJAdUnitJSBridge tJAdUnitJSBridge) {
        super(context);
        this.f27447j = tJAdUnitJSBridge;
        this.f27448k = context;
        JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
        JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
        JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_ERROR_DIALOG_STRINGS);
        this.f27456s = jSONObject.optString(TJAdUnitConstants.String.SPLIT_VIEW_URL_FOR_EXTERNAL_OPEN);
        this.f27446i = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
        setLayoutOption(optJSONObject);
        setExitHosts(optJSONArray);
        setErrorDialog(optJSONObject2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        TJWebView tJWebView = new TJWebView(this.f27448k);
        this.f27438a = tJWebView;
        tJWebView.setId(TapjoyUtil.generateViewId());
        this.f27438a.setBackgroundColor(-1);
        WebSettings settings = this.f27438a.getSettings();
        if (settings != null) {
            settings.setUseWideViewPort(true);
        }
        this.f27438a.setWebViewClient(new C11395b(this, (byte) 0));
        Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean(TJAdUnitConstants.String.SPLIT_VIEW_SHOW_TOOLBAR));
        this.f27449l = valueOf;
        if (valueOf.booleanValue()) {
            addToolbar();
            addLineBreak();
            addProgressBar();
            this.f27438a.setWebChromeClient(new WebChromeClient() {
                public final void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    TJSplitWebView.this.f27452o.setProgress(i);
                    TJSplitWebView.this.isFirstOrLastPage();
                }
            });
        }
        addView(this.f27438a, layoutParams);
    }

    public void addToolbar() {
        RelativeLayout relativeLayout = new RelativeLayout(this.f27448k);
        this.f27450m = relativeLayout;
        relativeLayout.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale() * 40.0f));
        layoutParams.addRule(6);
        this.f27450m.setBackgroundColor(-1);
        this.f27450m.setVisibility(0);
        setupToolbarUI();
        addView(this.f27450m, layoutParams);
    }

    public void addProgressBar() {
        ProgressBar progressBar = new ProgressBar(this.f27448k, (AttributeSet) null, 16842872);
        this.f27452o = progressBar;
        progressBar.setMax(100);
        this.f27452o.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#5d95ff")));
        this.f27452o.setProgressBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#dddddd")));
        addView(this.f27452o);
    }

    public void addLineBreak() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f27451n = frameLayout;
        frameLayout.setBackgroundColor(Color.parseColor("#dddddd"));
        addView(this.f27451n);
    }

    public void setupToolbarUI() {
        float screenDensityScale = new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        TJImageButton tJImageButton = new TJImageButton(this.f27448k);
        this.f27454q = tJImageButton;
        tJImageButton.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        int i = (int) (10.0f * screenDensityScale);
        layoutParams.setMargins(i, i, i, i);
        int i2 = (int) (5.0f * screenDensityScale);
        this.f27454q.setPadding(i2, i, i, i);
        this.f27454q.setEnabledImageBitmap(TapjoyIcons.getBackEnabledImage(screenDensityScale));
        this.f27454q.setDisableImageBitmap(TapjoyIcons.getBackDisabledImage(screenDensityScale));
        this.f27454q.setBackgroundColor(0);
        this.f27454q.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (TJSplitWebView.this.f27438a.canGoBack()) {
                    TJSplitWebView.this.f27438a.goBack();
                }
            }
        });
        relativeLayout.addView(this.f27454q, layoutParams);
        this.f27455r = new TJImageButton(this.f27448k);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, this.f27454q.getId());
        layoutParams2.setMargins(i, i, i, i);
        this.f27455r.setPadding(i, i, i2, i);
        this.f27455r.setEnabledImageBitmap(TapjoyIcons.getForwardEnabledImage(screenDensityScale));
        this.f27455r.setDisableImageBitmap(TapjoyIcons.getForwardDisabledImage(screenDensityScale));
        this.f27455r.setBackgroundColor(0);
        this.f27455r.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.f27438a.goForward();
            }
        });
        relativeLayout.addView(this.f27455r, layoutParams2);
        ImageButton imageButton = new ImageButton(this.f27448k);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(i, i, i, i);
        imageButton.setPadding(i2, i2, i2, i2);
        imageButton.setImageBitmap(TapjoyIcons.getCloseImage(screenDensityScale));
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.mo71974a();
            }
        });
        relativeLayout.addView(imageButton, layoutParams3);
        TextView textView = new TextView(this.f27448k);
        this.f27453p = textView;
        textView.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(13);
        this.f27453p.setMaxLines(1);
        this.f27453p.setMaxEms(200);
        this.f27453p.setTextAlignment(4);
        this.f27453p.setTextColor(Color.parseColor("#5d95ff"));
        this.f27453p.setBackgroundColor(0);
        this.f27453p.setEnabled(false);
        this.f27453p.setTypeface(Typeface.create("sans-serif-medium", 0));
        relativeLayout.addView(this.f27453p, layoutParams4);
        ImageButton imageButton2 = new ImageButton(this.f27448k);
        imageButton2.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(1, this.f27453p.getId());
        layoutParams5.addRule(15);
        imageButton2.setPadding(i2, i2, i2, i2);
        imageButton2.setImageBitmap(TapjoyIcons.getOpenBrowserImage(screenDensityScale));
        imageButton2.setBackgroundColor(0);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.openInExternalBrowser();
            }
        });
        relativeLayout.addView(imageButton2, layoutParams5);
        this.f27450m.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -2));
    }

    public void openInExternalBrowser() {
        Uri uri;
        if (TextUtils.isEmpty(this.f27456s)) {
            uri = Uri.parse(this.f27438a.getUrl());
            if (uri == null) {
                uri = Uri.parse(getLastUrl());
            }
        } else {
            uri = Uri.parse(this.f27456s);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        if (this.f27438a.getContext() != null) {
            try {
                this.f27438a.getContext().startActivity(intent);
            } catch (Exception e) {
                TapjoyLog.m33194d("TJSplitWebView", e.getMessage());
            }
        }
    }

    public boolean goBack() {
        if (!this.f27438a.canGoBack()) {
            return false;
        }
        this.f27438a.goBack();
        return true;
    }

    public void isFirstOrLastPage() {
        this.f27454q.setEnabled(this.f27438a.canGoBack());
        this.f27455r.setEnabled(this.f27438a.canGoForward());
    }

    public void showErrorDialog() {
        new AlertDialog.Builder(this.f27448k, 16974394).setMessage(this.f27458u).setPositiveButton(this.f27459v, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setNegativeButton(this.f27460w, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(TJSplitWebView.this.getLastUrl())) {
                    TJSplitWebView tJSplitWebView = TJSplitWebView.this;
                    tJSplitWebView.loadUrl(tJSplitWebView.f27441d);
                } else {
                    TJSplitWebView tJSplitWebView2 = TJSplitWebView.this;
                    tJSplitWebView2.loadUrl(tJSplitWebView2.getLastUrl());
                }
                dialogInterface.cancel();
            }
        }).create().show();
    }

    public void applyLayoutOption(JSONObject jSONObject) {
        setLayoutOption(jSONObject);
        m33117a(getWidth(), getHeight());
    }

    public void setExitHosts(JSONArray jSONArray) {
        if (jSONArray == null) {
            this.f27445h = null;
            return;
        }
        this.f27445h = new HashSet<>();
        for (int i = 0; i <= jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (optString != null) {
                this.f27445h.add(optString);
            }
        }
    }

    public void setErrorDialog(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f27457t = true;
            this.f27458u = jSONObject.optString("description");
            this.f27459v = jSONObject.optString("close");
            this.f27460w = jSONObject.optString("reload");
        }
    }

    public void setUserAgent(String str) {
        this.f27438a.getSettings().setUserAgentString(str);
    }

    public void setTrigger(String str, String str2) {
        this.f27443f = C11690gs.m33927b(str);
        this.f27444g = str2 != null ? Uri.parse(str2) : null;
    }

    public void loadUrl(String str) {
        TJWebView tJWebView = this.f27438a;
        if (tJWebView != null) {
            this.f27441d = str;
            this.f27442e = str;
            tJWebView.loadUrl(str);
        }
    }

    public String getLastUrl() {
        return this.f27442e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71974a() {
        this.f27447j.dismissSplitView((JSONObject) null, (String) null);
    }

    /* access modifiers changed from: protected */
    public void setLayoutOption(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("landscape");
            C11394a aVar = null;
            this.f27440c = optJSONObject != null ? new C11394a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("portrait");
            if (optJSONObject2 != null) {
                aVar = new C11394a(optJSONObject2);
            }
            this.f27439b = aVar;
        }
    }

    /* renamed from: a */
    private void m33117a(int i, int i2) {
        C11394a aVar = i <= i2 ? this.f27439b : this.f27440c;
        if (aVar == null) {
            this.f27438a.setVisibility(4);
            return;
        }
        double d = (double) i;
        int i3 = (int) (aVar.f27470a * d);
        double d2 = (double) i2;
        int i4 = (int) (aVar.f27471b * d2);
        if (i3 == 0 || i4 == 0) {
            this.f27438a.setVisibility(4);
            return;
        }
        int i5 = (int) (d * aVar.f27472c);
        int i6 = (int) (d2 * aVar.f27473d);
        int i7 = (i - i3) - i5;
        int i8 = (i2 - i4) - i6;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f27438a.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        Boolean bool = this.f27449l;
        if (bool == null || !bool.booleanValue()) {
            layoutParams.setMargins(i5, i6, i7, i8);
        } else {
            float screenDensityScale = new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale();
            int height = ((int) (40.0f * screenDensityScale)) + this.f27451n.getHeight();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f27450m.getLayoutParams();
            layoutParams2.setMargins(i5, i6, i7, i8);
            this.f27450m.setLayoutParams(layoutParams2);
            layoutParams.setMargins(i5, i6 + height, i7, i8);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i3, (int) screenDensityScale);
            layoutParams3.setMargins(i5, layoutParams.topMargin - this.f27452o.getHeight(), i7, i8);
            this.f27452o.setLayoutParams(layoutParams3);
            this.f27451n.setLayoutParams(layoutParams3);
        }
        this.f27438a.setLayoutParams(layoutParams);
        this.f27438a.setVisibility(0);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (aVar.f27474e > 0.0f) {
            float[] fArr = new float[8];
            final float f = aVar.f27474e * getResources().getDisplayMetrics().density;
            Boolean bool2 = this.f27449l;
            if (bool2 == null || !bool2.booleanValue()) {
                Arrays.fill(fArr, f);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(-1);
                this.f27438a.setBackground(shapeDrawable);
                this.f27438a.setClipToOutline(true);
                return;
            }
            this.f27450m.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    int width = view.getWidth();
                    float f = f;
                    outline.setRoundRect(0, 0, width, (int) (((float) view.getHeight()) + f), f);
                }
            });
            this.f27450m.setClipToOutline(true);
            return;
        }
        this.f27438a.setBackground((Drawable) null);
        this.f27438a.setClipToOutline(false);
        Boolean bool3 = this.f27449l;
        if (bool3 != null && bool3.booleanValue()) {
            this.f27450m.setClipToOutline(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f27438a != null) {
            m33117a(size, size2);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: com.tapjoy.TJSplitWebView$a */
    static class C11394a {

        /* renamed from: a */
        final double f27470a;

        /* renamed from: b */
        final double f27471b;

        /* renamed from: c */
        final double f27472c;

        /* renamed from: d */
        final double f27473d;

        /* renamed from: e */
        final float f27474e;

        C11394a(JSONObject jSONObject) {
            this.f27470a = jSONObject.optDouble("width", 0.0d);
            this.f27471b = jSONObject.optDouble("height", 0.0d);
            this.f27472c = jSONObject.optDouble("left", 0.0d);
            this.f27473d = jSONObject.optDouble("top", 0.0d);
            this.f27474e = (float) jSONObject.optDouble("cornerRadius", 0.0d);
        }
    }

    public void animateOpen(ViewGroup viewGroup) {
        JSONObject jSONObject = this.f27446i;
        if (jSONObject != null && jSONObject.has(TJAdUnitConstants.String.ANIMATION_EVENT_ON_OPEN) && this.f27446i.optString(TJAdUnitConstants.String.ANIMATION_EVENT_ON_OPEN).equalsIgnoreCase(TJAdUnitConstants.String.ANIMATION_TYPE_SLIDE_UP)) {
            setY((float) viewGroup.getHeight());
            animate().translationY(0.0f);
        }
    }

    /* renamed from: com.tapjoy.TJSplitWebView$b */
    class C11395b extends WebViewClient {
        private C11395b() {
        }

        /* synthetic */ C11395b(TJSplitWebView tJSplitWebView, byte b) {
            this();
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TJSplitWebView.this.f27449l.booleanValue()) {
                TJSplitWebView.this.f27453p.setText(TapjoyUrlFormatter.getDomain(str));
                TJSplitWebView.this.f27452o.setVisibility(0);
            }
            TapjoyLog.m33194d("TJSplitWebView", "onPageStarted: ".concat(String.valueOf(str)));
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            TapjoyLog.m33194d("TJSplitWebView", "shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String scheme = parse.getScheme();
                if (!(scheme == null || host == null || ((!scheme.equals("http") && !scheme.equals("https")) || (TJSplitWebView.this.f27445h != null && TJSplitWebView.this.f27445h.contains(host))))) {
                    String unused = TJSplitWebView.this.f27442e = str;
                    return false;
                }
            }
            try {
                TJSplitWebView.this.f27448k.startActivity(new Intent("android.intent.action.VIEW", parse));
                if (TJSplitWebView.this.f27449l.booleanValue()) {
                    return true;
                }
                TJSplitWebView.this.mo71974a();
                return true;
            } catch (Exception e) {
                TapjoyLog.m33196e("TJSplitWebView", e.getMessage());
                return true;
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            String h = TJSplitWebView.this.f27443f;
            Uri i = TJSplitWebView.this.f27444g;
            if (!(h == null || i == null || str == null || !str.startsWith(h))) {
                TJSplitWebView.this.f27448k.startActivity(new Intent("android.intent.action.VIEW", i));
                TJSplitWebView.this.mo71974a();
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.m33194d("TJSplitWebView", "onReceivedError: " + str2 + " firstUrl:" + TJSplitWebView.this.f27441d);
            if (TJSplitWebView.this.f27457t) {
                TJSplitWebView.this.showErrorDialog();
            } else if (str2.equals(TJSplitWebView.this.f27441d)) {
                TJSplitWebView.this.mo71974a();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (TJSplitWebView.this.f27449l.booleanValue()) {
                if (TJSplitWebView.this.f27452o != null) {
                    TJSplitWebView.this.f27452o.setProgress(0);
                    TJSplitWebView.this.f27452o.setVisibility(8);
                }
                TJSplitWebView.this.isFirstOrLastPage();
            }
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (TJSplitWebView.this.f27438a != null) {
                ViewGroup viewGroup = (ViewGroup) TJSplitWebView.this.f27438a.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJSplitWebView.this.f27438a);
                    viewGroup.removeAllViews();
                }
                TJSplitWebView.this.f27438a.destroy();
                TJWebView unused = TJSplitWebView.this.f27438a = null;
            }
            if (TJSplitWebView.this.f27447j != null) {
                TJSplitWebView.this.f27447j.cleanUpJSBridge();
                TJAdUnitJSBridge unused2 = TJSplitWebView.this.f27447j = null;
            }
            TapjoyLog.m33195e("TJSplitWebView", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            return true;
        }
    }
}
