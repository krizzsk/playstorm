package com.amazon.device.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.SDKUtilities;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class DTBAdUtil {
    private static final String CUSTOM_EVENT = "amazon_custom_event";
    public static final DTBAdUtil INSTANCE = new DTBAdUtil();
    static final String LOG_TAG = DTBAdUtil.class.getSimpleName();

    private DTBAdUtil() {
    }

    public AdManagerAdRequest loadDTBParams(AdManagerAdRequest adManagerAdRequest, DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getAdCount() == 0) {
            return adManagerAdRequest;
        }
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        builder.setContentUrl(adManagerAdRequest.getContentUrl());
        builder.setLocation(adManagerAdRequest.getLocation());
        builder.setPublisherProvidedId(adManagerAdRequest.getPublisherProvidedId());
        loadDTBParameters(dTBAdResponse, builder);
        return builder.build();
    }

    public void loadDTBParams(AdManagerAdRequest.Builder builder, DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getAdCount() > 0) {
            loadDTBParameters(dTBAdResponse, builder);
        }
    }

    public AdManagerAdRequest.Builder createAdManagerAdRequestBuilder(DTBAdResponse dTBAdResponse) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        if (dTBAdResponse.getAdCount() > 0) {
            loadDTBParameters(dTBAdResponse, builder);
        }
        return builder;
    }

    private void loadDTBParameters(DTBAdResponse dTBAdResponse, AdManagerAdRequest.Builder builder) {
        for (Map.Entry next : dTBAdResponse.getDefaultDisplayAdsRequestCustomParams().entrySet()) {
            builder.addCustomTargeting((String) next.getKey(), (List<String>) (List) next.getValue());
        }
    }

    public static List<View> findViewsOfType(ViewGroup viewGroup, Class cls) {
        ArrayList arrayList = new ArrayList();
        findViewsOfType(viewGroup, cls, arrayList);
        return arrayList;
    }

    public static View findAncestorOfType(View view, Class cls) {
        while (!cls.isInstance(view)) {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return view;
    }

    static void findViewsOfType(ViewGroup viewGroup, Class cls, List<View> list) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isInstance(childAt)) {
                list.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                findViewsOfType((ViewGroup) childAt, cls, list);
            }
        }
    }

    public static String buildMopubTargeting(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                sb.append(",");
                sb.append((String) next.getKey());
                sb.append(':');
                sb.append((String) next.getValue());
            }
        }
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "Targeting String:" + sb.toString());
        return sb.toString();
    }

    static boolean isInstalledFromAppStore(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null && installerPackageName.length() > 0;
    }

    static Activity getActivity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static int sizeToDevicePixels(int i) {
        return (int) ((((float) i) * AdRegistration.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    static int sizeToDevicePixels(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int pixelsToDeviceIndependenPixels(int i) {
        return (int) ((((float) i) / AdRegistration.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static ViewGroup getRootView(View view) {
        Activity activity = getActivity(view);
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(16908290);
    }

    static SDKUtilities.SimpleSize getMaxSize(View view) {
        ViewGroup rootView = getRootView(view);
        if (rootView == null) {
            return getScreenSize();
        }
        return new SDKUtilities.SimpleSize(pixelsToDeviceIndependenPixels(rootView.getWidth()), pixelsToDeviceIndependenPixels(rootView.getHeight()));
    }

    public static SDKUtilities.SimpleSize getScreenSize() {
        return getScreenSize((View) null);
    }

    public static SDKUtilities.SimpleSize getScreenSize(View view) {
        int i;
        int i2;
        int i3 = AdRegistration.getContext().getResources().getConfiguration().orientation;
        Activity activity = view != null ? getActivity(view) : null;
        if (activity != null) {
            Point point = new Point();
            activity.getWindowManager().getDefaultDisplay().getRealSize(point);
            i = point.x;
            i2 = point.y;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) AdRegistration.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            i = i4;
        }
        int pixelsToDeviceIndependenPixels = pixelsToDeviceIndependenPixels(i);
        int pixelsToDeviceIndependenPixels2 = pixelsToDeviceIndependenPixels(i2);
        if (i3 == 1) {
            return new SDKUtilities.SimpleSize(pixelsToDeviceIndependenPixels, pixelsToDeviceIndependenPixels2);
        }
        return new SDKUtilities.SimpleSize(pixelsToDeviceIndependenPixels2, pixelsToDeviceIndependenPixels);
    }

    public static void setRectShape(View view) {
        setRectShape(view, -16711936, 3.0f);
    }

    public static void setRectShape(View view, int i, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStrokeWidth(f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        view.setBackground(shapeDrawable);
    }

    public static Bundle getBidFromFetchManager(Bundle bundle) {
        DTBFetchManager fetchManager;
        if (bundle == null) {
            return null;
        }
        boolean z = bundle.getBoolean(DTBAdView.SMARTBANNER_STATE, false);
        String string = bundle.getString(DTBAdView.REQUEST_QUEUE, (String) null);
        if (!DtbCommonUtils.isNullOrEmpty(string) && (fetchManager = DTBFetchFactory.getInstance().getFetchManager(string)) != null) {
            DtbLog.debug("RELOAD CUSTOM EVENT", "QUEUE:" + string);
            DTBAdResponse peek = fetchManager.peek();
            if (peek != null) {
                DtbLog.debug("RELOAD CUSTOM EVENT: " + peek.getRenderingBundle().getString(DTBAdView.AMAZON_AD_INFO));
                return peek.getRenderingBundle(z);
            }
        }
        DtbLog.debug("RELOAD CUSTOM EVENT", "NO QUEUE");
        return bundle;
    }

    public static boolean validateAdMobCustomEvent(String str, Bundle bundle) {
        DtbLog.debug(CUSTOM_EVENT, "AdMob Server Price Point is checked in:" + str + "in AdMob Single Price Custom Event Class");
        return validateAdMobCustomEvent(str, bundle, false);
    }

    public static boolean validateSinglePriceAdMobCustomEvent(String str, Bundle bundle) {
        DtbLog.debug(CUSTOM_EVENT, "AdMob Server Price Point is checked in:" + str + "in AdMob Custom Event Class");
        return validateAdMobCustomEvent(str, bundle, true);
    }

    private static boolean validateAdMobCustomEvent(String str, Bundle bundle, boolean z) {
        boolean z2;
        String str2 = z ? "Amazon Single Price Custom Event" : "Amazon Custom Event";
        if (bundle != null) {
            String string = bundle.getString(DTBAdView.EVENT_SERVER_PARAMETER, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
            String string2 = bundle.getString(DTBAdView.BID_HTML, (String) null);
            if (!(string == null || str == null || string2 == null)) {
                if (z) {
                    z2 = compareEncodedPrice(string, str);
                } else {
                    z2 = str.equals(string);
                }
                if (z2) {
                    String string3 = bundle.getString(DTBAdView.BID_IDENTIFIER, (String) null);
                    String string4 = bundle.getString(DTBAdView.HOSTNAME_IDENTIFIER, (String) null);
                    if (string3 == null || !DTBBidInspector.getInstance().wasUsed(string3)) {
                        long j = bundle.getLong(DTBAdView.START_LOAD_TIME);
                        if (j > 0) {
                            DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(string3, string4), DTBMetricsProcessor.REPORT_MEDIATION_LATENCY, (int) (new Date().getTime() - j));
                        }
                        DtbLog.debug(CUSTOM_EVENT, str2 + " Completed/Accepted");
                        return true;
                    }
                    DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (attempt to reuse bidId)");
                } else {
                    DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (server " + str + " is not matched with expected parameter " + string + ")");
                }
            }
            if (string == null) {
                DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (expected server parameter is null");
            }
            if (str == null) {
                DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (server parameter is null");
            }
            if (string2 == null) {
                DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (payload is not defined)");
            }
        }
        DtbLog.debug(CUSTOM_EVENT, str2 + " Completed/Ignored ");
        return false;
    }

    public static boolean validateMopubCustomEvent(Map<String, Object> map, Map<String, String> map2) {
        DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom Event was hit");
        String str = (String) map.get(DTBAdView.EVENT_SERVER_PARAMETER);
        if (str == null) {
            DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom ignored ( localExtras does not have expected key event_server_parameter)");
        } else if (map2.get(str) != null) {
            String str2 = (String) map.get(DTBAdView.BID_IDENTIFIER);
            String str3 = (String) map.get(DTBAdView.BID_HTML);
            String str4 = (String) map.get(DTBAdView.HOSTNAME_IDENTIFIER);
            if (str3 == null) {
                DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom ignored ( payload is not defined ");
            } else if (str2 == null || !DTBBidInspector.getInstance().wasUsed(str2)) {
                Object obj = map.get(DTBAdView.START_LOAD_TIME);
                if (obj instanceof Long) {
                    Long l = (Long) obj;
                    if (l.longValue() > 0) {
                        DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(str2, str4), DTBMetricsProcessor.REPORT_MEDIATION_LATENCY, (int) (new Date().getTime() - l.longValue()));
                    }
                }
                DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom Completed/Accepted");
                return true;
            } else {
                DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom ignored (attempt to reuse bidId)");
                return false;
            }
        } else {
            DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom ignored ( serverExtras does not have expected key event_server_parameter)");
        }
        DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom Completed/Ignored");
        return false;
    }

    static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static ViewGroup getAdViewWrapper(View view, int i, int i2, int i3, int i4) {
        AdContainer adContainer = new AdContainer(view.getContext());
        if (i4 == 0 || i3 == 0) {
            adContainer.addView(view, sizeToDevicePixels(i), sizeToDevicePixels(i2));
        } else {
            adContainer.addView(view, sizeToDevicePixels(i3), sizeToDevicePixels(i4));
        }
        adContainer.setAdView(view);
        return adContainer;
    }

    static void directAppStoreLinkToBrowser(DTBAdMRAIDController dTBAdMRAIDController, Uri uri) throws ActivityNotFoundException, NullPointerException {
        String str;
        if ("amzn".equals(uri.getScheme())) {
            DtbLog.debug(LOG_TAG, "Amazon app store unavailable in the device");
            str = "https://www.amazon.com/gp/mas/dl/android?" + uri.getQuery();
        } else {
            DtbLog.debug(LOG_TAG, "App store unavailable in the device");
            str = "https://play.google.com/store/apps/" + uri.getHost() + "?" + uri.getQuery();
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        AdRegistration.getCurrentActivity().startActivity(intent);
        dTBAdMRAIDController.onAdLeftApplication();
    }

    static synchronized String loadFile(String str, String str2) throws IOException {
        synchronized (DTBAdUtil.class) {
            Context context = AdRegistration.getContext();
            if (context == null) {
                return null;
            }
            File filesDir = context.getFilesDir();
            File file = new File(filesDir.getAbsolutePath() + "/" + str2 + "/" + str);
            if (!file.exists()) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    String sb2 = sb.toString();
                    return sb2;
                }
                sb.append(readLine.trim());
                sb.append("\n");
            }
        }
    }

    static void createDirIfDoesNotExist(String str) {
        Context context = AdRegistration.getContext();
        if (context != null) {
            File filesDir = context.getFilesDir();
            File file = new File(filesDir.getAbsolutePath() + "/" + str);
            if (!file.isDirectory() && !file.exists()) {
                file.mkdir();
            }
        }
    }

    static String loadFromAssets(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (!(AdRegistration.getContext() == null || AdRegistration.getContext().getAssets() == null)) {
            InputStream open = AdRegistration.getContext().getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine.trim());
                sb.append("\n");
            }
            bufferedReader.close();
            open.close();
        }
        return sb.toString();
    }

    static JSONObject loadJsonFromAsset(String str) {
        try {
            return new JSONObject(loadFromAssets(str));
        } catch (IOException unused) {
            DtbLog.debug("Fail to load " + str + "from asset folder");
            return null;
        } catch (JSONException unused2) {
            DtbLog.debug("Fail to parse " + str + " to JSON from asset folder");
            return null;
        }
    }

    public static String generateRequestId() {
        String str = UUID.randomUUID().toString() + "-" + new Date().getTime();
        if (AdRegistration.getAdMobCache(str) != null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Generate a conflict request id which already in request id map");
            AdRegistration.removeAdMobCache(str);
        }
        return str;
    }

    static boolean compareEncodedPrice(String str, String str2) {
        if (DtbCommonUtils.isNullOrEmpty(str) || DtbCommonUtils.isNullOrEmpty(str2)) {
            return false;
        }
        if (str.length() >= 8 && str2.length() >= 8 && str.contains("_spp") && str2.contains("_spp")) {
            String replace = str.replace("_spp", "");
            String replace2 = str2.replace("_spp", "");
            String sb = new StringBuilder(replace).reverse().toString();
            String sb2 = new StringBuilder(replace2).reverse().toString();
            String clientConfigVal = DTBMetricsConfiguration.getClientConfigVal("leq", "spp_flag");
            if (!DtbCommonUtils.isNullOrEmpty(clientConfigVal)) {
                if ("eq".equals(clientConfigVal)) {
                    if (sb2.compareTo(sb) == 0) {
                        return true;
                    }
                    return false;
                } else if ("geq".equals(clientConfigVal)) {
                    if (sb2.compareTo(sb) >= 0) {
                        return true;
                    }
                    return false;
                }
            }
            if (sb2.compareTo(sb) <= 0) {
                return true;
            }
            return false;
        } else if (str.compareTo(str2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Bundle createAdMobBannerRequestBundle(String str, int i, int i2) {
        Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
        try {
            initializeEmptyBundle.putString(DtbConstants.ADMOB_SLOTUUID_KEY, str);
            initializeEmptyBundle.putInt(DtbConstants.ADMOB_WIDTH_KEY, i);
            initializeEmptyBundle.putInt(DtbConstants.ADMOB_HEIGHT_KEY, i2);
            initializeEmptyBundle.putString(DtbConstants.ADMOB_REQUEST_ID_KEY, generateRequestId());
            initializeEmptyBundle.putString(DtbConstants.APS_ADAPTER_VERSION, "2.0");
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute createAdMobBannerRequestBundle method to create bundle for non smart banner ads");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute createAdMobBannerRequestBundle method to create bundle for non smart banner ads", e);
        }
        return initializeEmptyBundle;
    }

    public static Bundle createAdMobBannerRequestBundle(String str) {
        Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
        try {
            initializeEmptyBundle.putString(DtbConstants.ADMOB_SLOTGROUP_KEY, str);
            initializeEmptyBundle.putString(DtbConstants.ADMOB_REQUEST_ID_KEY, generateRequestId());
            initializeEmptyBundle.putString(DtbConstants.APS_ADAPTER_VERSION, "2.0");
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute createAdMobBannerRequestBundle method to create bundle for smart banner ads");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute createAdMobBannerRequestBundle method to create bundle for smart banner ads", e);
        }
        return initializeEmptyBundle;
    }

    public static Bundle createAdMobInterstitialRequestBundle(String str) {
        return createAdMobInterstitialRequestBundle(str, false);
    }

    public static Bundle createAdMobInterstitialVideoRequestBundle(String str) {
        return createAdMobInterstitialRequestBundle(str, true);
    }

    private static Bundle createAdMobInterstitialRequestBundle(String str, boolean z) {
        Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
        try {
            initializeEmptyBundle.putString(DtbConstants.ADMOB_SLOTUUID_KEY, str);
            initializeEmptyBundle.putString(DtbConstants.ADMOB_REQUEST_ID_KEY, generateRequestId());
            initializeEmptyBundle.putString(DtbConstants.APS_ADAPTER_VERSION, "2.0");
            initializeEmptyBundle.putBoolean(DtbConstants.ADMOB_iSVIDEO_KEY, z);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute createAdMobInterstitialRequestBundle method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute createAdMobInterstitialRequestBundle method", e);
        }
        return initializeEmptyBundle;
    }
}
