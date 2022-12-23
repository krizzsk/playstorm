package com.tapjoy;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11481ce;
import com.tapjoy.internal.C11578es;
import com.tapjoy.internal.C11656ga;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TJAdUnitJSBridge implements TJWebViewJSInterfaceListener {

    /* renamed from: a */
    public TJAdUnit f27276a;
    public boolean allowRedirect;

    /* renamed from: b */
    public WebView f27277b;

    /* renamed from: c */
    final ConcurrentLinkedQueue<Pair<String, JSONObject>> f27278c;
    public boolean closeRequested;
    public boolean customClose;

    /* renamed from: d */
    private TJWebViewJSInterface f27279d;
    public boolean didLaunchOtherActivity;

    /* renamed from: e */
    private TJAdUnitJSBridge f27280e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f27281f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TJAdUnitActivity f27282g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TJSplitWebView f27283h;

    /* renamed from: i */
    private ProgressDialog f27284i;

    /* renamed from: j */
    private View f27285j;

    /* renamed from: k */
    private boolean f27286k;

    /* renamed from: l */
    private C11578es f27287l;
    public String otherActivityCallbackID;
    public String splitWebViewCallbackID;

    public interface AdUnitAsyncTaskListner {
        void onComplete(boolean z);
    }

    public void destroy() {
    }

    public TJAdUnitJSBridge(Context context, TJAdUnit tJAdUnit) {
        this(context, (WebView) tJAdUnit.getWebView());
        this.f27276a = tJAdUnit;
    }

    public TJAdUnitJSBridge(Context context, WebView webView) {
        this.f27285j = null;
        this.didLaunchOtherActivity = false;
        this.allowRedirect = true;
        this.otherActivityCallbackID = null;
        this.customClose = false;
        this.closeRequested = false;
        this.splitWebViewCallbackID = null;
        this.f27287l = new C11578es(this);
        this.f27278c = new ConcurrentLinkedQueue<>();
        TapjoyLog.m33197i("TJAdUnitJSBridge", "creating AdUnit/JS Bridge");
        this.f27281f = context;
        this.f27277b = webView;
        this.f27280e = this;
        if (webView == null) {
            TapjoyLog.m33195e("TJAdUnitJSBridge", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Cannot create AdUnitJSBridge -- webview is NULL"));
            return;
        }
        TJWebViewJSInterface tJWebViewJSInterface = new TJWebViewJSInterface(this.f27277b, this);
        this.f27279d = tJWebViewJSInterface;
        this.f27277b.addJavascriptInterface(tJWebViewJSInterface, TJAdUnitConstants.JAVASCRIPT_INTERFACE_ID);
        setEnabled(true);
    }

    public void onDispatchMethod(String str, JSONObject jSONObject) {
        if (this.f27286k) {
            try {
                String optString = jSONObject.optString(TJAdUnitConstants.String.CALLBACK_ID, (String) null);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Method method = TJAdUnitJSBridge.class.getMethod(str, new Class[]{JSONObject.class, String.class});
                TapjoyLog.m33194d("TJAdUnitJSBridge", "Dispatching method: " + method + " with data=" + jSONObject2 + "; callbackID=" + optString);
                if (this.f27279d != null) {
                    method.invoke(this.f27280e, new Object[]{jSONObject2, optString});
                }
            } catch (Exception e) {
                e.printStackTrace();
                invokeJSCallback((String) null, Boolean.FALSE);
            }
        } else {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "Bridge currently disabled. Adding " + str + " to message queue");
            this.f27278c.add(new Pair(str, jSONObject));
        }
    }

    public void setupSdkBeacons(JSONObject jSONObject, String str) {
        TapjoyLog.m33194d("TJAdUnitJSBridge", "setupSdkBeacons_method: ".concat(String.valueOf(jSONObject)));
        try {
            String string = jSONObject.getString("url");
            JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.BEACON_PATH_MAP);
            this.f27276a.setSdkBeacon(new C11656ga(string, jSONObject.getJSONObject("params"), jSONObject2));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void alert(org.json.JSONObject r10, final java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r2 = "alert_method: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "TJAdUnitJSBridge"
            com.tapjoy.TapjoyLog.m33194d(r2, r1)
            r1 = 1
            r3 = 0
            java.lang.String r4 = "title"
            java.lang.String r4 = r10.getString(r4)     // Catch:{ Exception -> 0x002b }
            java.lang.String r5 = "message"
            java.lang.String r0 = r10.getString(r5)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r5 = "buttons"
            org.json.JSONArray r10 = r10.getJSONArray(r5)     // Catch:{ Exception -> 0x0026 }
            goto L_0x003d
        L_0x0026:
            r10 = move-exception
            r8 = r4
            r4 = r0
            r0 = r8
            goto L_0x002d
        L_0x002b:
            r10 = move-exception
            r4 = r0
        L_0x002d:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5[r3] = r6
            r9.invokeJSCallback((java.lang.String) r11, (java.lang.Object[]) r5)
            r10.printStackTrace()
            r10 = 0
            r8 = r4
            r4 = r0
            r0 = r8
        L_0x003d:
            com.tapjoy.TJAdUnitActivity r5 = r9.f27282g
            if (r5 == 0) goto L_0x00bc
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r2 < r6) goto L_0x005c
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r6 = 16974394(0x103023a, float:2.4062497E-38)
            r2.<init>(r5, r6)
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            android.app.AlertDialog r0 = r0.create()
            goto L_0x006d
        L_0x005c:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r5)
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            android.app.AlertDialog r0 = r0.create()
        L_0x006d:
            if (r10 == 0) goto L_0x00b2
            int r2 = r10.length()
            if (r2 != 0) goto L_0x0076
            goto L_0x00b2
        L_0x0076:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = r3
        L_0x007c:
            int r5 = r10.length()
            if (r4 >= r5) goto L_0x00a8
            if (r4 == 0) goto L_0x008a
            if (r4 == r1) goto L_0x0088
            r5 = -1
            goto L_0x008b
        L_0x0088:
            r5 = -3
            goto L_0x008b
        L_0x008a:
            r5 = -2
        L_0x008b:
            java.lang.String r6 = r10.getString(r4)     // Catch:{ Exception -> 0x0093 }
            r2.add(r6)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0097:
            java.lang.Object r6 = r2.get(r4)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            com.tapjoy.TJAdUnitJSBridge$1 r7 = new com.tapjoy.TJAdUnitJSBridge$1
            r7.<init>(r11)
            r0.setButton(r5, r6, r7)
            int r4 = r4 + 1
            goto L_0x007c
        L_0x00a8:
            r0.setCancelable(r3)
            r0.setCanceledOnTouchOutside(r3)
            r0.show()
            return
        L_0x00b2:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10[r3] = r0
            r9.invokeJSCallback((java.lang.String) r11, (java.lang.Object[]) r10)
            return
        L_0x00bc:
            java.lang.String r10 = "Cannot alert -- TJAdUnitActivity is null"
            com.tapjoy.TapjoyLog.m33194d(r2, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJAdUnitJSBridge.alert(org.json.JSONObject, java.lang.String):void");
    }

    public void closeRequested(Boolean bool) {
        TJSplitWebView tJSplitWebView = this.f27283h;
        if (tJSplitWebView == null) {
            this.closeRequested = true;
            HashMap hashMap = new HashMap();
            hashMap.put(TJAdUnitConstants.String.FORCE_CLOSE, bool);
            invokeJSAdunitMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, (Map<String, Object>) hashMap);
        } else if (!tJSplitWebView.goBack()) {
            this.f27283h.mo71974a();
        }
    }

    public void getVolume(JSONObject jSONObject, String str) {
        HashMap<String, Object> volumeArgs = getVolumeArgs();
        if (volumeArgs != null) {
            invokeJSCallback(str, (Map<String, Object>) volumeArgs);
            return;
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void onVolumeChanged() {
        invokeJSAdunitMethod(TJAdUnitConstants.String.VOLUME_CHANGED, (Map<String, Object>) getVolumeArgs());
    }

    public HashMap<String, Object> getVolumeArgs() {
        TJAdUnit tJAdUnit = this.f27276a;
        if (tJAdUnit == null) {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "No ad unit provided");
            return null;
        }
        String format = String.format("%.2f", new Object[]{Float.valueOf(tJAdUnit.getVolume())});
        boolean isMuted = this.f27276a.isMuted();
        TapjoyLog.m33194d("TJAdUnitJSBridge", "getVolumeArgs: volume=" + format + "; isMuted=" + isMuted);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(TJAdUnitConstants.String.CURRENT_VOLUME, format);
        hashMap.put(TJAdUnitConstants.String.IS_MUTED, Boolean.valueOf(isMuted));
        return hashMap;
    }

    public void dismiss(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.f27282g;
        if (tJAdUnitActivity != null) {
            invokeJSCallback(str, Boolean.TRUE);
            tJAdUnitActivity.finish();
            return;
        }
        TapjoyLog.m33194d("TJAdUnitJSBridge", "Cannot dismiss -- TJAdUnitActivity is null");
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void display() {
        invokeJSAdunitMethod("display", new Object[0]);
    }

    public void displayStoreURL(JSONObject jSONObject, String str) {
        displayURL(jSONObject, str);
    }

    public void dismissStoreView(JSONObject jSONObject, String str) {
        dismissSplitView(jSONObject, str);
    }

    public void displayURL(JSONObject jSONObject, String str) {
        final String str2;
        final String str3;
        try {
            String optString = jSONObject.optString("style");
            final String string = jSONObject.getString("url");
            final JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
            final JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
            final String optString2 = jSONObject.optString("userAgent", (String) null);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER);
            if (optJSONObject2 != null) {
                String optString3 = optJSONObject2.optString(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON, (String) null);
                str2 = optJSONObject2.optString("to", (String) null);
                str3 = optString3;
            } else {
                str3 = null;
                str2 = null;
            }
            if (TJAdUnitConstants.String.STYLE_SPLIT.equals(optString)) {
                final JSONObject jSONObject2 = jSONObject;
                final String str4 = str;
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        if (TJAdUnitJSBridge.this.f27277b != null) {
                            if (TJAdUnitJSBridge.this.f27283h == null) {
                                ViewParent parent = TJAdUnitJSBridge.this.f27277b.getParent();
                                if (parent instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) parent;
                                    TJSplitWebView unused = TJAdUnitJSBridge.this.f27283h = new TJSplitWebView(TJAdUnitJSBridge.this.f27282g, jSONObject2, TJAdUnitJSBridge.this);
                                    viewGroup.addView(TJAdUnitJSBridge.this.f27283h, new RelativeLayout.LayoutParams(-1, -1));
                                    TJAdUnitJSBridge.this.f27283h.animateOpen(viewGroup);
                                }
                            } else if (TJAdUnitJSBridge.this.f27283h != null) {
                                TJAdUnitJSBridge.this.f27283h.setExitHosts(optJSONArray);
                                TJAdUnitJSBridge.this.f27283h.applyLayoutOption(optJSONObject);
                            }
                            if (TJAdUnitJSBridge.this.f27283h != null) {
                                if (optString2 != null) {
                                    TJAdUnitJSBridge.this.f27283h.setUserAgent(optString2);
                                }
                                TJAdUnitJSBridge.this.f27283h.setTrigger(str3, str2);
                                TJAdUnitJSBridge.this.splitWebViewCallbackID = str4;
                                try {
                                    TJAdUnitJSBridge.this.f27283h.loadUrl(string);
                                    return;
                                } catch (Exception e) {
                                    TapjoyLog.m33199w("TJAdUnitJSBridge", e.getMessage());
                                    return;
                                }
                            }
                        }
                        TJSplitWebView unused2 = TJAdUnitJSBridge.this.f27283h = null;
                        TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
                        TJAdUnitJSBridge.this.invokeJSCallback(str4, Boolean.FALSE);
                    }
                });
                return;
            }
            this.didLaunchOtherActivity = true;
            this.otherActivityCallbackID = str;
            this.f27281f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.TRUE);
            e.printStackTrace();
        }
    }

    public void clearCache(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            TapjoyCache.getInstance().clearTapjoyCache();
            invokeJSCallback(str, Boolean.TRUE);
            return;
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void setPrerenderLimit(JSONObject jSONObject, String str) {
        try {
            TJPlacementManager.setPreRenderedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_PRE_RENDERED_LIMIT));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to set Tapjoy placement pre-render limit. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setEventPreloadLimit(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            try {
                TJPlacementManager.setCachedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_CACHE_LIMIT));
                invokeJSCallback(str, Boolean.TRUE);
            } catch (Exception unused) {
                TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to set Tapjoy cache's event preload limit. Invalid parameters.");
                invokeJSCallback(str, Boolean.FALSE);
            }
        } else {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void removeAssetFromCache(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, Boolean.valueOf(TapjoyCache.getInstance().removeAssetFromCache(string)));
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused) {
            TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cacheAsset(JSONObject jSONObject, String str) {
        String str2;
        Long l = 0L;
        try {
            String string = jSONObject.getString("url");
            try {
                str2 = jSONObject.getString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID);
            } catch (Exception unused) {
                str2 = "";
            }
            try {
                l = Long.valueOf(jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE));
            } catch (Exception unused2) {
            }
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().cacheAssetFromURL(string, str2, l.longValue()));
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused3) {
            TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cachePathForURL(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().getPathOfCachedURL(string));
                return;
            }
            invokeJSCallback(str, "");
        } catch (Exception unused) {
            invokeJSCallback(str, "");
        }
    }

    public void getCachedAssets(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            invokeJSCallback(str, TapjoyCache.getInstance().cachedAssetsToJSON());
            return;
        }
        invokeJSCallback(str, "");
    }

    public void contentReady(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f27276a;
        if (tJAdUnit != null) {
            tJAdUnit.fireContentReady();
            invokeJSCallback(str, Boolean.TRUE);
            return;
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void getOrientation(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f27276a;
        if (tJAdUnit == null) {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, JSONObject.NULL);
            return;
        }
        String screenOrientationString = tJAdUnit.getScreenOrientationString();
        HashMap hashMap = new HashMap();
        hashMap.put("orientation", screenOrientationString);
        hashMap.put("width", Integer.valueOf(this.f27276a.getScreenWidth()));
        hashMap.put("height", Integer.valueOf(this.f27276a.getScreenHeight()));
        invokeJSCallback(str, (Map<String, Object>) hashMap);
    }

    public void setOrientation(JSONObject jSONObject, String str) {
        int i;
        if (this.f27276a == null) {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        try {
            String string = jSONObject.getString("orientation");
            if (!string.equals("landscape")) {
                if (!string.equals(TJAdUnitConstants.String.LANDSCAPE_LEFT)) {
                    i = string.equals(TJAdUnitConstants.String.LANDSCAPE_RIGHT) ? 8 : 1;
                    this.f27276a.setOrientation(i);
                    invokeJSCallback(str, Boolean.TRUE);
                }
            }
            i = 0;
            this.f27276a.setOrientation(i);
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void unsetOrientation(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f27276a;
        if (tJAdUnit == null) {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        try {
            tJAdUnit.unsetOrientation();
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setBackgroundColor(JSONObject jSONObject, final String str) {
        try {
            String string = jSONObject.getString("backgroundColor");
            TJAdUnit tJAdUnit = this.f27276a;
            if (tJAdUnit != null) {
                tJAdUnit.setBackgroundColor(string, new AdUnitAsyncTaskListner() {
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused) {
            TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to set background color. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setBackgroundWebViewContent(JSONObject jSONObject, final String str) {
        TapjoyLog.m33194d("TJAdUnitJSBridge", "setBackgroundWebViewContent");
        try {
            String string = jSONObject.getString(TJAdUnitConstants.String.BACKGROUND_CONTENT);
            TJAdUnit tJAdUnit = this.f27276a;
            if (tJAdUnit != null) {
                tJAdUnit.setBackgroundContent(string, new AdUnitAsyncTaskListner() {
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused) {
            TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to set background content. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void displayVideo(JSONObject jSONObject, final String str) {
        try {
            String string = jSONObject.getString("url");
            if (string.length() <= 0 || string == "") {
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            this.f27276a.loadVideoUrl(string, new AdUnitAsyncTaskListner() {
                public final void onComplete(boolean z) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                }
            });
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void playVideo(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f27276a;
        if (tJAdUnit != null) {
            invokeJSCallback(str, Boolean.valueOf(tJAdUnit.playVideo()));
        }
    }

    public void pauseVideo(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f27276a;
        if (tJAdUnit != null) {
            invokeJSCallback(str, Boolean.valueOf(tJAdUnit.pauseVideo()));
        }
    }

    public void clearVideo(JSONObject jSONObject, final String str) {
        if (this.f27276a != null) {
            this.f27276a.clearVideo(new AdUnitAsyncTaskListner() {
                public final void onComplete(boolean z) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                }
            }, jSONObject.optBoolean(TJAdUnitConstants.String.VISIBLE, false));
        }
    }

    public void setVideoMute(JSONObject jSONObject, String str) {
        try {
            this.f27276a.mo71670a(jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (JSONException unused) {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "Failed to parse 'enabled' from json params.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setVideoMargins(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        try {
            final float optDouble = (float) jSONObject.optDouble("top", 0.0d);
            final float optDouble2 = (float) jSONObject.optDouble("right", 0.0d);
            final float optDouble3 = (float) jSONObject.optDouble(TJAdUnitConstants.String.BOTTOM, 0.0d);
            final float optDouble4 = (float) jSONObject.optDouble("left", 0.0d);
            final TJAdUnitActivity tJAdUnitActivity = this.f27282g;
            if (tJAdUnitActivity != null) {
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        TJAdUnitActivity tJAdUnitActivity = tJAdUnitActivity;
                        float f = optDouble4;
                        float f2 = optDouble;
                        float f3 = optDouble2;
                        float f4 = optDouble3;
                        DisplayMetrics displayMetrics = tJAdUnitActivity.getResources().getDisplayMetrics();
                        ViewGroup viewGroup = (ViewGroup) tJAdUnitActivity.f27263a.getVideoView().getParent();
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).setMargins((int) TypedValue.applyDimension(1, f, displayMetrics), (int) TypedValue.applyDimension(1, f2, displayMetrics), (int) TypedValue.applyDimension(1, f3, displayMetrics), (int) TypedValue.applyDimension(1, f4, displayMetrics));
                        viewGroup.requestLayout();
                    }
                });
                invokeJSCallback(str2, Boolean.TRUE);
                return;
            }
            TapjoyLog.m33194d("TJAdUnitJSBridge", "Cannot setVideoMargins -- TJAdUnitActivity is null");
            invokeJSCallback(str2, Boolean.FALSE);
        } catch (Exception e) {
            invokeJSCallback(str2, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void log(JSONObject jSONObject, String str) {
        try {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "Logging message=" + jSONObject.getString("message"));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void openApp(JSONObject jSONObject, String str) {
        try {
            this.f27281f.startActivity(this.f27281f.getPackageManager().getLaunchIntentForPackage(jSONObject.getString(TJAdUnitConstants.String.BUNDLE)));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void nativeEval(final JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        TJAdUnitJSBridge.this.f27277b.evaluateJavascript(jSONObject.getString("command"), (ValueCallback) null);
                    } else {
                        WebView webView = TJAdUnitJSBridge.this.f27277b;
                        webView.loadUrl("javascript:" + jSONObject.getString("command"));
                    }
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                } catch (Exception unused) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
                }
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:4|5)|6|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void present(org.json.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0045 }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = "visible"
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = "transparent"
            java.lang.String r4 = r6.getString(r4)     // Catch:{ Exception -> 0x001a }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            java.lang.String r4 = "customClose"
            java.lang.String r6 = r6.getString(r4)     // Catch:{ Exception -> 0x002a }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x002a }
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x002a }
            r5.customClose = r6     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            com.tapjoy.TJAdUnitJSBridge$a r6 = new com.tapjoy.TJAdUnitJSBridge$a     // Catch:{ Exception -> 0x0045 }
            android.webkit.WebView r4 = r5.f27277b     // Catch:{ Exception -> 0x0045 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0045 }
            r4 = 2
            java.lang.Boolean[] r4 = new java.lang.Boolean[r4]     // Catch:{ Exception -> 0x0045 }
            r4[r0] = r3     // Catch:{ Exception -> 0x0045 }
            r4[r1] = r2     // Catch:{ Exception -> 0x0045 }
            r6.execute(r4)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0045 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0045 }
            r6[r0] = r2     // Catch:{ Exception -> 0x0045 }
            r5.invokeJSCallback((java.lang.String) r7, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x0045 }
            return
        L_0x0045:
            r6 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1[r0] = r2
            r5.invokeJSCallback((java.lang.String) r7, (java.lang.Object[]) r1)
            r6.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJAdUnitJSBridge.present(org.json.JSONObject, java.lang.String):void");
    }

    public void triggerEvent(JSONObject jSONObject, String str) {
        if (this.f27276a != null) {
            try {
                String string = jSONObject.getString("eventName");
                if (string.equals("start")) {
                    this.f27276a.fireOnVideoStart();
                } else if (string.equals("complete")) {
                    this.f27276a.fireOnVideoComplete();
                } else if (string.equals("error")) {
                    this.f27276a.fireOnVideoError("Error while trying to play video.");
                } else if (string.equals("click")) {
                    this.f27276a.fireOnClick();
                }
            } catch (Exception unused) {
                TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to triggerEvent. No event name.");
            }
        }
    }

    public void invokeJSAdunitMethod(String str, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        TJWebViewJSInterface tJWebViewJSInterface = this.f27279d;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback((ArrayList<?>) arrayList, str, (String) null);
        }
    }

    public void invokeJSAdunitMethod(String str, Map<String, Object> map) {
        TJWebViewJSInterface tJWebViewJSInterface = this.f27279d;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback((Map<?, ?>) map, str, (String) null);
        }
    }

    public void invokeJSCallback(String str, Object... objArr) {
        if (TextUtils.isEmpty(str)) {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "invokeJSCallback -- no callbackID provided");
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        TJWebViewJSInterface tJWebViewJSInterface = this.f27279d;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback((ArrayList<?>) arrayList, "", str);
        }
    }

    public void invokeJSCallback(String str, Map<String, Object> map) {
        this.f27279d.callback((Map<?, ?>) map, "", str);
    }

    public void flushBacklogMessageQueue() {
        while (true) {
            Pair poll = this.f27278c.poll();
            if (poll != null) {
                onDispatchMethod((String) poll.first, (JSONObject) poll.second);
            } else {
                return;
            }
        }
    }

    public void flushMessageQueue() {
        TJWebViewJSInterface tJWebViewJSInterface = this.f27279d;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.flushMessageQueue();
        }
    }

    public void setAllowRedirect(JSONObject jSONObject, String str) {
        boolean z;
        try {
            z = jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED);
        } catch (Exception unused) {
            z = true;
        }
        this.allowRedirect = z;
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.f27282g = tJAdUnitActivity;
    }

    public void setSpinnerVisible(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("message");
            TJAdUnitActivity tJAdUnitActivity = this.f27282g;
            if (tJAdUnitActivity != null) {
                if (z) {
                    this.f27284i = ProgressDialog.show(tJAdUnitActivity, optString, optString2);
                } else if (this.f27284i != null) {
                    this.f27284i.dismiss();
                }
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            TapjoyLog.m33194d("TJAdUnitJSBridge", "Cannot setSpinnerVisible -- TJAdUnitActivity is null");
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void setCloseButtonVisible(JSONObject jSONObject, String str) {
        try {
            final boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnitActivity b = TJAdUnitJSBridge.this.f27282g;
                    if (b != null) {
                        b.setCloseButtonVisibility(z);
                    } else {
                        TapjoyLog.m33194d("TJAdUnitJSBridge", "Cannot setCloseButtonVisible -- TJAdUnitActivity is null");
                    }
                }
            });
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void setCloseButtonClickable(JSONObject jSONObject, String str) {
        try {
            final boolean optBoolean = jSONObject.optBoolean(TJAdUnitConstants.String.CLICKABLE);
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnitActivity b = TJAdUnitJSBridge.this.f27282g;
                    if (b != null) {
                        b.setCloseButtonClickable(optBoolean);
                    } else {
                        TapjoyLog.m33194d("TJAdUnitJSBridge", "Cannot setCloseButtonClickable -- TJAdUnitActivity is null");
                    }
                }
            });
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void shouldClose(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.f27282g;
        try {
            Boolean bool = Boolean.FALSE;
            if (Boolean.valueOf(jSONObject.getString("close")).booleanValue() && tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            e.printStackTrace();
        }
        this.closeRequested = false;
    }

    public void setLoggingLevel(JSONObject jSONObject, String str) {
        try {
            TapjoyAppSettings.getInstance().saveLoggingLevel(String.valueOf(jSONObject.getString(TJAdUnitConstants.String.LOGGING_LEVEL)));
        } catch (Exception e) {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "setLoggingLevel exception " + e.getLocalizedMessage());
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void clearLoggingLevel(JSONObject jSONObject, String str) {
        TapjoyAppSettings.getInstance().clearLoggingLevel();
    }

    public void attachVolumeListener(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean("attach");
            int optInt = jSONObject.optInt(TJAdUnitConstants.String.INTERVAL, 500);
            if (optInt > 0) {
                this.f27276a.attachVolumeListener(z, optInt);
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            TapjoyLog.m33194d("TJAdUnitJSBridge", "Invalid `interval` value passed to attachVolumeListener(): interval=".concat(String.valueOf(optInt)));
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception e) {
            TapjoyLog.m33194d("TJAdUnitJSBridge", "attachVolumeListener exception " + e.toString());
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void initMoatVideoTracker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void startMoatVideoTracker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void triggerMoatVideoEvent(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void initViewabilityTracker(JSONObject jSONObject, String str) {
        C11578es esVar = this.f27287l;
        if (!esVar.mo72381a(jSONObject)) {
            esVar.f27987a.invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        C11578es.m33593b(jSONObject);
        if (TextUtils.isEmpty(C11578es.f27986b)) {
            esVar.f27987a.invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        TapjoyUtil.runOnMainThread(new Runnable(jSONObject, str) {

            /* renamed from: a */
            final /* synthetic */ JSONObject f27992a;

            /* renamed from: b */
            final /* synthetic */ String f27993b;

            {
                this.f27992a = r2;
                this.f27993b = r3;
            }

            public final void run() {
                try {
                    if (!C11481ce.m33387b()) {
                        C11481ce.m33386a(C11578es.this.f27987a.f27277b.getContext());
                    }
                    if (C11481ce.m33387b()) {
                        TapjoyLog.m33194d("TJOMViewabilityAgent", "initialized");
                        List a = C11578es.m33592b(this.f27992a.optJSONArray(TJAdUnitConstants.String.VENDORS));
                        C11498cv b = C11578es.this.f27990e;
                        String a2 = C11578es.f27986b;
                        C11524dq.m33446a((Object) b, "Partner is null");
                        C11524dq.m33446a((Object) a2, "OM SDK JS script content is null");
                        C11524dq.m33446a((Object) a, "VerificationScriptResources is null");
                        C11491co coVar = new C11491co(b, a2, a, "", "", C11492cp.f27776b);
                        C11493cq cqVar = C11493cq.f27783d;
                        C11496ct ctVar = C11496ct.f27799d;
                        C11497cu cuVar = C11497cu.f27806a;
                        C11524dq.m33446a((Object) cqVar, "CreativeType is null");
                        C11524dq.m33446a((Object) ctVar, "ImpressionType is null");
                        C11524dq.m33446a((Object) cuVar, "Impression owner is null");
                        if (cuVar != C11497cu.f27808c) {
                            if (cqVar == C11493cq.f27780a) {
                                if (cuVar == C11497cu.f27806a) {
                                    throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                                }
                            }
                            if (ctVar == C11496ct.f27796a) {
                                if (cuVar == C11497cu.f27806a) {
                                    throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                                }
                            }
                            C11490cn cnVar = new C11490cn(cqVar, ctVar, cuVar, cuVar);
                            C11578es esVar = C11578es.this;
                            if (C11481ce.m33387b()) {
                                C11524dq.m33446a((Object) cnVar, "AdSessionConfiguration is null");
                                C11524dq.m33446a((Object) coVar, "AdSessionContext is null");
                                C11489cm unused = esVar.f27989d = new C11500cx(cnVar, coVar);
                                C11578es.this.f27989d.mo72281a(C11578es.this.f27987a.f27276a.getWebView());
                                C11578es esVar2 = C11578es.this;
                                C11489cm c = C11578es.this.f27989d;
                                C11500cx cxVar = (C11500cx) c;
                                C11524dq.m33446a((Object) c, "AdSession is null");
                                if (!(C11497cu.f27806a == cxVar.f27817a.f27763b)) {
                                    throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
                                } else if (!cxVar.f27820d) {
                                    C11524dq.m33445a(cxVar);
                                    if (cxVar.f27819c.f27883b == null) {
                                        C11502cz czVar = new C11502cz(cxVar);
                                        cxVar.f27819c.f27883b = czVar;
                                        C11502cz unused2 = esVar2.f27991f = czVar;
                                        C11578es esVar3 = C11578es.this;
                                        C11489cm c2 = C11578es.this.f27989d;
                                        C11500cx cxVar2 = (C11500cx) c2;
                                        C11524dq.m33446a((Object) c2, "AdSession is null");
                                        if (cxVar2.f27819c.f27882a == null) {
                                            C11524dq.m33445a(cxVar2);
                                            C11488cl clVar = new C11488cl(cxVar2);
                                            cxVar2.f27819c.f27882a = clVar;
                                            C11488cl unused3 = esVar3.f27988c = clVar;
                                            C11578es.this.f27987a.invokeJSCallback(this.f27993b, Boolean.TRUE);
                                            return;
                                        }
                                        throw new IllegalStateException("AdEvents already exists for AdSession");
                                    }
                                    throw new IllegalStateException("MediaEvents already exists for AdSession");
                                } else {
                                    throw new IllegalStateException("AdSession is started");
                                }
                            } else {
                                throw new IllegalStateException("Method called before OM SDK activation");
                            }
                        } else {
                            throw new IllegalArgumentException("Impression owner is none");
                        }
                    } else {
                        TapjoyLog.m33194d("TJOMViewabilityAgent", "Failed to initialize");
                        C11578es.this.f27987a.invokeJSCallback(this.f27993b, Boolean.FALSE);
                    }
                } catch (Exception e) {
                    TapjoyLog.m33194d("TJOMViewabilityAgent", "Failed to init with exception: " + e.getMessage());
                    C11578es.this.f27987a.invokeJSCallback(this.f27993b, Boolean.FALSE);
                }
            }
        });
    }

    public void startViewabilityTracker(JSONObject jSONObject, String str) {
        C11578es esVar = this.f27287l;
        if (!C11481ce.m33387b()) {
            TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not start -- TJOMViewabilityAgent is not initialized");
            esVar.f27987a.invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        esVar.f27987a.invokeJSCallback(str, Boolean.TRUE);
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    C11578es.this.f27989d.mo72280a();
                } catch (Exception e) {
                    TapjoyLog.m33194d("TJOMViewabilityAgent", "Failed to start with exception: " + e.getMessage());
                }
            }
        });
    }

    public void triggerViewabilityEvent(JSONObject jSONObject, String str) {
        C11578es esVar = this.f27287l;
        if (!C11481ce.m33387b()) {
            TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not triggerEvent -- TJOMViewabilityAgent is not initialized");
            esVar.f27987a.invokeJSCallback(str, Boolean.FALSE);
        } else if (jSONObject == null) {
            TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not triggerEvent -- json parameter is null");
            esVar.f27987a.invokeJSCallback(str, Boolean.FALSE);
        } else {
            String optString = jSONObject.optString("eventName", (String) null);
            if (optString == null) {
                TapjoyLog.m33194d("TJOMViewabilityAgent", "triggerEvent: params json did not contain 'eventName'");
                esVar.f27987a.invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            TapjoyUtil.runOnMainThread(new Runnable(optString, jSONObject, str) {

                /* renamed from: a */
                final /* synthetic */ String f27996a;

                /* renamed from: b */
                final /* synthetic */ JSONObject f27997b;

                /* renamed from: c */
                final /* synthetic */ String f27998c;

                {
                    this.f27996a = r2;
                    this.f27997b = r3;
                    this.f27998c = r4;
                }

                /* JADX WARNING: Can't wrap try/catch for region: R(5:13|(2:15|16)|17|18|(2:20|(1:22)(2:23|24))) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0095 */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x009d A[Catch:{ Exception -> 0x039a }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r18 = this;
                        r1 = r18
                        java.lang.String r0 = "errorType"
                        java.lang.String r2 = "complete"
                        java.lang.String r3 = "adUserInteraction"
                        java.lang.String r4 = "skipped"
                        java.lang.String r5 = "thirdQuartile"
                        java.lang.String r6 = "midpoint"
                        java.lang.String r7 = "firstQuartile"
                        java.lang.String r8 = "start"
                        java.lang.String r9 = "bufferStart"
                        java.lang.String r10 = "TJOMViewabilityAgent"
                        r11 = 0
                        r12 = 1
                        java.lang.String r13 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r14 = "loaded"
                        boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r14 = "triggerEvent: event name '"
                        if (r13 == 0) goto L_0x006e
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cl r0 = r0.f27988c     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.da r2 = com.tapjoy.internal.C11504da.f27842d     // Catch:{ Exception -> 0x039a }
                        java.lang.String r3 = "Position is null"
                        com.tapjoy.internal.C11524dq.m33446a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.db r3 = new com.tapjoy.internal.db     // Catch:{ Exception -> 0x039a }
                        r3.<init>(r2)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "VastProperties is null"
                        com.tapjoy.internal.C11524dq.m33446a((java.lang.Object) r3, (java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27761a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27761a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33449c(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27761a     // Catch:{ Exception -> 0x039a }
                        org.json.JSONObject r2 = r3.mo72293a()     // Catch:{ Exception -> 0x039a }
                        boolean r3 = r0.f27824h     // Catch:{ Exception -> 0x039a }
                        if (r3 != 0) goto L_0x0066
                        com.tapjoy.internal.du r3 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.dh r4 = com.tapjoy.internal.C11512dh.m33412a()     // Catch:{ Exception -> 0x039a }
                        android.webkit.WebView r3 = r3.mo72323c()     // Catch:{ Exception -> 0x039a }
                        java.lang.String r5 = "publishLoadedEvent"
                        java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x039a }
                        r6[r11] = r2     // Catch:{ Exception -> 0x039a }
                        r4.mo72307a((android.webkit.WebView) r3, (java.lang.String) r5, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x039a }
                        r0.f27824h = r12     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x0066:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "Loaded event can only be sent once"
                        r0.<init>(r2)     // Catch:{ Exception -> 0x039a }
                        throw r0     // Catch:{ Exception -> 0x039a }
                    L_0x006e:
                        java.lang.String r13 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r15 = "impression"
                        boolean r13 = r13.equals(r15)     // Catch:{ Exception -> 0x039a }
                        if (r13 == 0) goto L_0x00c0
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cl r0 = r0.f27988c     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27761a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33445a(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27761a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33449c(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27761a     // Catch:{ Exception -> 0x039a }
                        boolean r2 = r2.mo72290d()     // Catch:{ Exception -> 0x039a }
                        if (r2 != 0) goto L_0x0095
                        com.tapjoy.internal.cx r2 = r0.f27761a     // Catch:{ Exception -> 0x0095 }
                        r2.mo72280a()     // Catch:{ Exception -> 0x0095 }
                    L_0x0095:
                        com.tapjoy.internal.cx r2 = r0.f27761a     // Catch:{ Exception -> 0x039a }
                        boolean r2 = r2.mo72290d()     // Catch:{ Exception -> 0x039a }
                        if (r2 == 0) goto L_0x034a
                        com.tapjoy.internal.cx r0 = r0.f27761a     // Catch:{ Exception -> 0x039a }
                        boolean r2 = r0.f27823g     // Catch:{ Exception -> 0x039a }
                        if (r2 != 0) goto L_0x00b8
                        com.tapjoy.internal.du r2 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.dh r3 = com.tapjoy.internal.C11512dh.m33412a()     // Catch:{ Exception -> 0x039a }
                        android.webkit.WebView r2 = r2.mo72323c()     // Catch:{ Exception -> 0x039a }
                        java.lang.String r4 = "publishImpressionEvent"
                        java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x039a }
                        r3.mo72307a((android.webkit.WebView) r2, (java.lang.String) r4, (java.lang.Object[]) r5)     // Catch:{ Exception -> 0x039a }
                        r0.f27823g = r12     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x00b8:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "Impression event can only be sent once"
                        r0.<init>(r2)     // Catch:{ Exception -> 0x039a }
                        throw r0     // Catch:{ Exception -> 0x039a }
                    L_0x00c0:
                        java.lang.String r13 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        boolean r13 = r13.equals(r9)     // Catch:{ Exception -> 0x039a }
                        if (r13 == 0) goto L_0x00dc
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        r0.mo72319a((java.lang.String) r9)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x00dc:
                        java.lang.String r9 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r13 = "bufferEnd"
                        boolean r9 = r9.equals(r13)     // Catch:{ Exception -> 0x039a }
                        if (r9 == 0) goto L_0x00fc
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "bufferFinish"
                        r0.mo72319a((java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x00fc:
                        java.lang.String r9 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r13 = "deviceVolume"
                        java.lang.String r15 = "mediaPlayerVolume"
                        r16 = 1065353216(0x3f800000, float:1.0)
                        r17 = 0
                        if (r9 == 0) goto L_0x0172
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27987a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnit r0 = r0.f27276a     // Catch:{ Exception -> 0x039a }
                        boolean r0 = r0.isMuted()     // Catch:{ Exception -> 0x039a }
                        if (r0 == 0) goto L_0x011c
                        r16 = r17
                    L_0x011c:
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.es r2 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnitJSBridge r2 = r2.f27987a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnit r2 = r2.f27276a     // Catch:{ Exception -> 0x039a }
                        android.widget.VideoView r2 = r2.getVideoView()     // Catch:{ Exception -> 0x039a }
                        int r2 = r2.getDuration()     // Catch:{ Exception -> 0x039a }
                        float r2 = (float) r2     // Catch:{ Exception -> 0x039a }
                        int r3 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
                        if (r3 <= 0) goto L_0x016a
                        com.tapjoy.internal.C11502cz.m33403a(r16)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r3 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r3)     // Catch:{ Exception -> 0x039a }
                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x039a }
                        r3.<init>()     // Catch:{ Exception -> 0x039a }
                        java.lang.String r4 = "duration"
                        java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11521do.m33438a(r3, r4, r2)     // Catch:{ Exception -> 0x039a }
                        java.lang.Float r2 = java.lang.Float.valueOf(r16)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11521do.m33438a(r3, r15, r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.di r2 = com.tapjoy.internal.C11514di.m33422a()     // Catch:{ Exception -> 0x039a }
                        float r2 = r2.f27868a     // Catch:{ Exception -> 0x039a }
                        java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11521do.m33438a(r3, r13, r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        r0.mo72320a((java.lang.String) r8, (org.json.JSONObject) r3)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x016a:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "Invalid Media duration"
                        r0.<init>(r2)     // Catch:{ Exception -> 0x039a }
                        throw r0     // Catch:{ Exception -> 0x039a }
                    L_0x0172:
                        java.lang.String r8 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        boolean r8 = r8.equals(r7)     // Catch:{ Exception -> 0x039a }
                        if (r8 == 0) goto L_0x018e
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        r0.mo72319a((java.lang.String) r7)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x018e:
                        java.lang.String r7 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        boolean r7 = r7.equals(r6)     // Catch:{ Exception -> 0x039a }
                        if (r7 == 0) goto L_0x01aa
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        r0.mo72319a((java.lang.String) r6)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x01aa:
                        java.lang.String r6 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x039a }
                        if (r6 == 0) goto L_0x01c6
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        r0.mo72319a((java.lang.String) r5)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x01c6:
                        java.lang.String r5 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r6 = "paused"
                        boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x039a }
                        if (r5 == 0) goto L_0x01e6
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "pause"
                        r0.mo72319a((java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x01e6:
                        java.lang.String r5 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r6 = "playing"
                        boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x039a }
                        if (r5 == 0) goto L_0x0206
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "resume"
                        r0.mo72319a((java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x0206:
                        java.lang.String r5 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x039a }
                        if (r5 == 0) goto L_0x0222
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        r0.mo72319a((java.lang.String) r4)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x0222:
                        java.lang.String r4 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r5 = "volumeChanged"
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x039a }
                        if (r4 == 0) goto L_0x026e
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27987a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnit r0 = r0.f27276a     // Catch:{ Exception -> 0x039a }
                        boolean r0 = r0.isMuted()     // Catch:{ Exception -> 0x039a }
                        if (r0 == 0) goto L_0x023c
                        r16 = r17
                    L_0x023c:
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11502cz.m33403a(r16)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r2)     // Catch:{ Exception -> 0x039a }
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x039a }
                        r2.<init>()     // Catch:{ Exception -> 0x039a }
                        java.lang.Float r3 = java.lang.Float.valueOf(r16)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11521do.m33438a(r2, r15, r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.di r3 = com.tapjoy.internal.C11514di.m33422a()     // Catch:{ Exception -> 0x039a }
                        float r3 = r3.f27868a     // Catch:{ Exception -> 0x039a }
                        java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11521do.m33438a(r2, r13, r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        java.lang.String r3 = "volumeChange"
                        r0.mo72320a((java.lang.String) r3, (org.json.JSONObject) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x026e:
                        java.lang.String r4 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x039a }
                        if (r4 == 0) goto L_0x029b
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cy r2 = com.tapjoy.internal.C11501cy.f27827a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r4 = "InteractionType is null"
                        com.tapjoy.internal.C11524dq.m33446a((java.lang.Object) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r4 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r4)     // Catch:{ Exception -> 0x039a }
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x039a }
                        r4.<init>()     // Catch:{ Exception -> 0x039a }
                        java.lang.String r5 = "interactionType"
                        com.tapjoy.internal.C11521do.m33438a(r4, r5, r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        r0.mo72320a((java.lang.String) r3, (org.json.JSONObject) r4)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x029b:
                        java.lang.String r3 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x039a }
                        if (r3 == 0) goto L_0x02b7
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27991f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r3 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11524dq.m33448b(r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27831a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27819c     // Catch:{ Exception -> 0x039a }
                        r0.mo72319a((java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x02b7:
                        java.lang.String r2 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r3 = "sessionError"
                        boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x039a }
                        if (r2 == 0) goto L_0x0331
                        org.json.JSONObject r2 = r1.f27997b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r2 = r2.getString(r0)     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r3 = "video"
                        boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r3 = "message"
                        if (r2 == 0) goto L_0x02e3
                        com.tapjoy.internal.es r2 = com.tapjoy.internal.C11578es.this     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.internal.cm r2 = r2.f27989d     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.internal.cr r4 = com.tapjoy.internal.C11494cr.f27788b     // Catch:{ JSONException -> 0x031a }
                        org.json.JSONObject r5 = r1.f27997b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r5 = r5.getString(r3)     // Catch:{ JSONException -> 0x031a }
                        r2.mo72282a(r4, r5)     // Catch:{ JSONException -> 0x031a }
                        goto L_0x02f4
                    L_0x02e3:
                        com.tapjoy.internal.es r2 = com.tapjoy.internal.C11578es.this     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.internal.cm r2 = r2.f27989d     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.internal.cr r4 = com.tapjoy.internal.C11494cr.f27787a     // Catch:{ JSONException -> 0x031a }
                        org.json.JSONObject r5 = r1.f27997b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r5 = r5.getString(r3)     // Catch:{ JSONException -> 0x031a }
                        r2.mo72282a(r4, r5)     // Catch:{ JSONException -> 0x031a }
                    L_0x02f4:
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r4 = "Session Error: "
                        r2.<init>(r4)     // Catch:{ JSONException -> 0x031a }
                        org.json.JSONObject r4 = r1.f27997b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r0 = r4.getString(r0)     // Catch:{ JSONException -> 0x031a }
                        r2.append(r0)     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r0 = ", "
                        r2.append(r0)     // Catch:{ JSONException -> 0x031a }
                        org.json.JSONObject r0 = r1.f27997b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x031a }
                        r2.append(r0)     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.TapjoyLog.m33194d(r10, r0)     // Catch:{ JSONException -> 0x031a }
                        goto L_0x034a
                    L_0x031a:
                        r0 = move-exception
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039a }
                        java.lang.String r3 = "Failed to getting session error information: "
                        r2.<init>(r3)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x039a }
                        r2.append(r0)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TapjoyLog.m33194d(r10, r0)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x0331:
                        java.lang.String r0 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "sessionFinish"
                        boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x039a }
                        if (r0 == 0) goto L_0x0372
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cm r0 = r0.f27989d     // Catch:{ Exception -> 0x039a }
                        r0.mo72283b()     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        r2 = 0
                        com.tapjoy.internal.C11489cm unused = r0.f27989d = r2     // Catch:{ Exception -> 0x039a }
                    L_0x034a:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>(r14)
                        java.lang.String r2 = r1.f27996a
                        r0.append(r2)
                        java.lang.String r2 = "'"
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        com.tapjoy.TapjoyLog.m33194d(r10, r0)
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27987a
                        java.lang.String r2 = r1.f27998c
                        java.lang.Object[] r3 = new java.lang.Object[r12]
                        java.lang.Boolean r4 = java.lang.Boolean.TRUE
                        r3[r11] = r4
                        r0.invokeJSCallback((java.lang.String) r2, (java.lang.Object[]) r3)
                        return
                    L_0x0372:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039a }
                        r0.<init>(r14)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = r1.f27996a     // Catch:{ Exception -> 0x039a }
                        r0.append(r2)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "' not found"
                        r0.append(r2)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TapjoyLog.m33194d(r10, r0)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27987a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = r1.f27998c     // Catch:{ Exception -> 0x039a }
                        java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x039a }
                        java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x039a }
                        r3[r11] = r4     // Catch:{ Exception -> 0x039a }
                        r0.invokeJSCallback((java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ Exception -> 0x039a }
                        return
                    L_0x039a:
                        r0 = move-exception
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "triggerEvent exception:"
                        r2.<init>(r3)
                        java.lang.String r0 = r0.getMessage()
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        com.tapjoy.TapjoyLog.m33194d(r10, r0)
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11578es.this
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27987a
                        java.lang.String r2 = r1.f27998c
                        java.lang.Object[] r3 = new java.lang.Object[r12]
                        java.lang.Boolean r4 = java.lang.Boolean.FALSE
                        r3[r11] = r4
                        r0.invokeJSCallback((java.lang.String) r2, (java.lang.Object[]) r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11578es.C115813.run():void");
                }
            });
        }
    }

    public void startUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m33194d("TJAdUnitJSBridge", "Empty name for startUsageTrackingEvent");
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            if (this.f27276a != null) {
                this.f27276a.startAdContentTracking(string, jSONObject);
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (JSONException e) {
            TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to startUsageTrackingEvent. Invalid parameters: ".concat(String.valueOf(e)));
        }
    }

    public void endUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m33194d("TJAdUnitJSBridge", "Empty name for endUsageTrackingEvent");
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            if (this.f27276a != null) {
                this.f27276a.endAdContentTracking(string, jSONObject);
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (JSONException e) {
            TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to endUsageTrackingEvent. Invalid parameters: ".concat(String.valueOf(e)));
        }
    }

    public void sendUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m33194d("TJAdUnitJSBridge", "Empty name for sendUsageTrackingEvent");
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            if (this.f27276a != null) {
                this.f27276a.sendAdContentTracking(string, jSONObject);
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (JSONException e) {
            TapjoyLog.m33199w("TJAdUnitJSBridge", "Unable to sendUsageTrackingEvent. Invalid parameters: ".concat(String.valueOf(e)));
        }
    }

    public void hasSplitView(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f27283h != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                    return;
                }
                TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
            }
        });
    }

    public void dismissSplitView(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f27283h != null) {
                    String str = str;
                    if (str != null) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                    }
                    if (TJAdUnitJSBridge.this.splitWebViewCallbackID != null) {
                        TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
                        tJAdUnitJSBridge.invokeJSCallback(tJAdUnitJSBridge.splitWebViewCallbackID, Boolean.TRUE);
                        TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
                    }
                    ((ViewGroup) TJAdUnitJSBridge.this.f27283h.getParent()).removeView(TJAdUnitJSBridge.this.f27283h);
                    TJSplitWebView unused = TJAdUnitJSBridge.this.f27283h = null;
                    return;
                }
                String str2 = str;
                if (str2 != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str2, Boolean.FALSE);
                }
            }
        });
    }

    public void getSplitViewURL(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f27283h != null) {
                    TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
                    tJAdUnitJSBridge.invokeJSCallback(str, tJAdUnitJSBridge.f27283h.getLastUrl());
                    return;
                }
                TJAdUnitJSBridge.this.invokeJSCallback(str, JSONObject.NULL);
            }
        });
    }

    public void isNetworkAvailable(JSONObject jSONObject, String str) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f27281f.getSystemService("connectivity")).getActiveNetworkInfo();
            invokeJSCallback(str, Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()));
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setEnabled(boolean z) {
        this.f27286k = z;
        if (z) {
            flushBacklogMessageQueue();
        }
    }

    public void cleanUpJSBridge() {
        TJWebViewJSInterface tJWebViewJSInterface = this.f27279d;
        if (tJWebViewJSInterface != null) {
            if (tJWebViewJSInterface.f27477a != null) {
                this.f27279d.f27477a.removeAllViews();
                this.f27279d.f27477a.destroy();
                this.f27279d.f27477a = null;
            }
            this.f27279d = null;
        }
    }

    /* renamed from: com.tapjoy.TJAdUnitJSBridge$a */
    class C11369a extends AsyncTask<Boolean, Void, Boolean[]> {

        /* renamed from: a */
        WebView f27326a;

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return (Boolean[]) objArr;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Boolean[] boolArr = (Boolean[]) obj;
            final boolean booleanValue = boolArr[0].booleanValue();
            final boolean booleanValue2 = boolArr[1].booleanValue();
            if (TJAdUnitJSBridge.this.f27281f instanceof Activity) {
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        if (booleanValue) {
                            C11369a.this.f27326a.setVisibility(0);
                            if (booleanValue2) {
                                if (C11369a.this.f27326a.getParent() instanceof RelativeLayout) {
                                    ((RelativeLayout) C11369a.this.f27326a.getParent()).getBackground().setAlpha(0);
                                    ((RelativeLayout) C11369a.this.f27326a.getParent()).setBackgroundColor(0);
                                }
                                if (Build.VERSION.SDK_INT >= 11) {
                                    C11369a.this.f27326a.setLayerType(1, (Paint) null);
                                    return;
                                }
                                return;
                            }
                            if (C11369a.this.f27326a.getParent() instanceof RelativeLayout) {
                                ((RelativeLayout) C11369a.this.f27326a.getParent()).getBackground().setAlpha(255);
                                ((RelativeLayout) C11369a.this.f27326a.getParent()).setBackgroundColor(-1);
                            }
                            if (Build.VERSION.SDK_INT >= 11) {
                                C11369a.this.f27326a.setLayerType(0, (Paint) null);
                                return;
                            }
                            return;
                        }
                        C11369a.this.f27326a.setVisibility(4);
                        if (C11369a.this.f27326a.getParent() instanceof RelativeLayout) {
                            ((RelativeLayout) C11369a.this.f27326a.getParent()).getBackground().setAlpha(0);
                            ((RelativeLayout) C11369a.this.f27326a.getParent()).setBackgroundColor(0);
                        }
                    }
                });
            } else {
                TapjoyLog.m33196e("TJAdUnitJSBridge", "Unable to present offerwall. No Activity context provided.");
            }
        }

        public C11369a(WebView webView) {
            this.f27326a = webView;
        }
    }

    public void onVideoReady(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_READY_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_DURATION, Integer.valueOf(i));
        hashMap.put(TJAdUnitConstants.String.VIDEO_WIDTH, Integer.valueOf(i2));
        hashMap.put(TJAdUnitConstants.String.VIDEO_HEIGHT, Integer.valueOf(i3));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoStarted(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_START_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoProgress(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PROGRESS_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoPaused(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PAUSE_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoCompletion() {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_COMPLETE_EVENT);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoInfo(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_INFO_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_INFO, str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoError(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_ERROR_EVENT);
        hashMap.put("error", str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void notifyOrientationChanged(String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("orientation", str);
        hashMap.put("width", Integer.valueOf(i));
        hashMap.put("height", Integer.valueOf(i2));
        invokeJSAdunitMethod(TJAdUnitConstants.String.ORIENTATION_CHANGED_EVENT, (Map<String, Object>) hashMap);
    }
}
