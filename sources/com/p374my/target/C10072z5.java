package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p374my.target.C10072z5;

/* renamed from: com.my.target.z5 */
public final class C10072z5 extends C9605a6 {

    /* renamed from: b */
    public C10073a f25060b;

    /* renamed from: c */
    public boolean f25061c;

    /* renamed from: d */
    public boolean f25062d;

    /* renamed from: e */
    public C10076d f25063e;

    /* renamed from: com.my.target.z5$a */
    public interface C10073a {
        /* renamed from: a */
        void mo63609a(WebView webView);

        /* renamed from: a */
        void mo63612a(String str);

        /* renamed from: b */
        void mo63615b(String str);
    }

    /* renamed from: com.my.target.z5$b */
    public static final class C10074b extends WebChromeClient {
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            C9672e0.m27882a("js console message: " + message + " at line: " + lineNumber);
            return false;
        }
    }

    /* renamed from: com.my.target.z5$c */
    public final class C10075c extends WebViewClient {
        public C10075c() {
        }

        public void onPageFinished(WebView webView, String str) {
            if (!C10072z5.this.f25061c) {
                boolean unused = C10072z5.this.f25061c = true;
                C9672e0.m27882a("page loaded");
                super.onPageFinished(webView, str);
                if (C10072z5.this.f25060b != null) {
                    C10072z5.this.f25060b.mo63609a(webView);
                }
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C9672e0.m27882a("load page started");
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C9672e0.m27882a("load failed. error: " + i + " description: " + str + " url: " + str2);
            super.onReceivedError(webView, i, str, str2);
            if (C10072z5.this.f25060b != null) {
                C10073a c = C10072z5.this.f25060b;
                if (str == null) {
                    str = "unknown JS error";
                }
                c.mo63612a(str);
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String charSequence = description != null ? description.toString() : null;
            int errorCode = webResourceError.getErrorCode();
            String uri = webResourceRequest.getUrl().toString();
            C9672e0.m27882a("load failed. error: " + errorCode + " description: " + charSequence + " url: " + uri);
            if (C10072z5.this.f25060b != null) {
                C10073a c = C10072z5.this.f25060b;
                if (charSequence == null) {
                    charSequence = "Unknown JS error";
                }
                c.mo63612a(charSequence);
            }
        }

        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            C9672e0.m27882a("scale new: " + f2 + " old: " + f);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (!C10072z5.this.f25062d || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            C10072z5.this.mo65864b(url.toString());
            C10072z5.this.mo65865h();
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C10072z5.this.f25062d && str != null) {
                C10072z5.this.mo65864b(str);
                C10072z5.this.mo65865h();
            }
            return true;
        }
    }

    /* renamed from: com.my.target.z5$d */
    public interface C10076d {
        /* renamed from: a */
        void mo63332a();
    }

    /* renamed from: com.my.target.z5$e */
    public static final class C10077e extends GestureDetector {

        /* renamed from: a */
        public final View f25065a;

        /* renamed from: b */
        public C10078a f25066b;

        /* renamed from: com.my.target.z5$e$a */
        public interface C10078a {
            /* renamed from: a */
            void mo63370a();
        }

        public C10077e(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public C10077e(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f25065a = view;
            setIsLongpressEnabled(false);
        }

        /* renamed from: a */
        public void mo65877a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2 || !mo65879a(motionEvent, this.f25065a)) {
                        return;
                    }
                } else if (this.f25066b != null) {
                    C9672e0.m27882a("Gestures: user clicked");
                    this.f25066b.mo63370a();
                    return;
                } else {
                    C9672e0.m27882a("View's onUserClick() is not registered.");
                    return;
                }
            }
            onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo65878a(C10078a aVar) {
            this.f25066b = aVar;
        }

        /* renamed from: a */
        public final boolean mo65879a(MotionEvent motionEvent, View view) {
            if (motionEvent == null || view == null) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
        }
    }

    public C10072z5(Context context) {
        super(context);
        C10074b bVar = new C10074b();
        C10075c cVar = new C10075c();
        C10077e eVar = new C10077e(getContext(), this);
        eVar.mo65878a((C10077e.C10078a) new C10077e.C10078a() {
            /* renamed from: a */
            public final void mo63370a() {
                C10072z5.this.m29895g();
            }
        });
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C10072z5.C10077e.this.mo65877a(motionEvent);
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setSupportZoom(false);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
        setWebChromeClient(bVar);
        setWebViewClient(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m29895g() {
        this.f25062d = true;
    }

    /* renamed from: b */
    public void mo65864b(String str) {
        C10073a aVar = this.f25060b;
        if (aVar != null) {
            aVar.mo63615b(str);
        }
    }

    /* renamed from: h */
    public void mo65865h() {
        this.f25062d = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C10076d dVar = this.f25063e;
        if (dVar != null) {
            dVar.mo63332a();
        }
    }

    public void setBannerWebViewListener(C10073a aVar) {
        this.f25060b = aVar;
    }

    public void setData(String str) {
        this.f25061c = false;
        this.f25062d = false;
        mo63461a("https://ad.mail.ru/", str, "text/html", "UTF-8", (String) null);
    }

    public void setOnLayoutListener(C10076d dVar) {
        this.f25063e = dVar;
    }
}
