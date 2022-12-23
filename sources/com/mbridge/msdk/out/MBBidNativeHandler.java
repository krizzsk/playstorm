package com.mbridge.msdk.out;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8611x;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbnative.p333c.C8738a;
import com.mbridge.msdk.mbnative.p335e.C8777a;
import com.mbridge.msdk.out.NativeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MBBidNativeHandler extends MBBidCommonHandler {
    private static final String TAG = MBBidNativeHandler.class.getName();
    public static final String TEMPLATE_ID = "id";
    public static final String TEMPLATE_NUM = "ad_num";
    private static String mUnitID;
    private C8738a adListener = new C8738a();
    private C2295a clickControler;
    private Context context;
    private Map<String, Object> map;
    private C8777a nativeProvider;
    private List<NativeListener.Template> templateList;
    private NativeListener.NativeTrackingListener trackingListener;

    public void setMustBrowser(boolean z) {
        C8611x.f20814a = z;
    }

    public MBBidNativeHandler(Context context2) {
        this.context = context2;
        if (C2350a.m5601e().mo15792g() == null && context2 != null) {
            C2350a.m5601e().mo15785b(context2);
        }
        Map<String, Object> map2 = this.map;
        if (map2 != null && map2.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) this.map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (!TextUtils.isEmpty(str)) {
                C8738a aVar = this.adListener;
                if (aVar != null) {
                    aVar.mo58109a(str);
                }
                String d = C8613y.m24943d(str);
                if (!TextUtils.isEmpty(d)) {
                    C8613y.m24924a(str, d);
                }
            }
        }
    }

    public MBBidNativeHandler(Map<String, Object> map2, Context context2) {
        super(map2, context2);
        this.context = context2;
        this.map = map2;
        if (C2350a.m5601e().mo15792g() == null && context2 != null) {
            C2350a.m5601e().mo15785b(context2);
        }
        if (map2 != null) {
            try {
                if (map2.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && map2.get(MBridgeConstans.PROPERTIES_UNIT_ID) != null && (map2.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String) && map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && map2.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) != null && (map2.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer) && map2.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && map2.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) != null) {
                    boolean z = map2.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (map2 != null && map2.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) map2.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (!TextUtils.isEmpty(str)) {
                C8738a aVar = this.adListener;
                if (aVar != null) {
                    aVar.mo58109a(str);
                }
                String d = C8613y.m24943d(str);
                if (!TextUtils.isEmpty(d)) {
                    C8613y.m24924a(str, d);
                }
            }
        }
    }

    public void bidLoad(String str) {
        if (this.properties == null || !this.properties.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            C8608u.m24883c(TAG, "no unit id.");
        } else {
            loadMB(str);
        }
    }

    public void bidRelease() {
        C8777a aVar = this.nativeProvider;
        if (aVar != null) {
            aVar.mo58174d();
        }
    }

    public static Map<String, Object> getNativeProperties(String str, String str2) {
        HashMap hashMap = new HashMap();
        mUnitID = str2;
        hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        String str3 = MBridgeConstans.PLACEMENT_ID;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put(str3, str);
        hashMap.put(MBridgeConstans.PLUGIN_NAME, new String[]{MBridgeConstans.PLUGIN_NATIVE});
        hashMap.put(MBridgeConstans.PROPERTIES_LAYOUT_TYPE, 0);
        return hashMap;
    }

    public void addTemplate(NativeListener.Template template) {
        if (template != null) {
            if (this.templateList == null) {
                this.templateList = new ArrayList();
            }
            this.templateList.add(template);
        }
    }

    public void handleResult(Campaign campaign, String str) {
        if (this.clickControler == null) {
            String str2 = null;
            Map<String, Object> map2 = this.map;
            if (map2 != null) {
                str2 = (String) map2.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            }
            this.clickControler = new C2295a(this.context, str2);
        }
        this.clickControler.mo15641a(campaign, str);
    }

    public String buildTemplateString() {
        try {
            if (this.templateList == null || this.templateList.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (NativeListener.Template next : this.templateList) {
                stringBuffer.append("{\"id\":");
                stringBuffer.append(next.getId() + ",");
                stringBuffer.append("\"ad_num\":");
                stringBuffer.append(next.getAdNum() + "},");
            }
            return "[{$native_info}]".replace("{$native_info}", stringBuffer.subSequence(0, stringBuffer.lastIndexOf(",")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getTemplateString(List<NativeListener.Template> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (NativeListener.Template next : list) {
                stringBuffer.append("{\"id\":");
                stringBuffer.append(next.getId() + ",");
                stringBuffer.append("\"ad_num\":");
                stringBuffer.append(next.getAdNum() + "},");
            }
            return "[{$native_info}]".replace("{$native_info}", stringBuffer.subSequence(0, stringBuffer.lastIndexOf(",")));
        } catch (Exception unused) {
            return null;
        }
    }

    private void loadMB(String str) {
        C8738a aVar;
        if (TextUtils.isEmpty(str) && (aVar = this.adListener) != null) {
            aVar.onAdLoadError("bidToken can not be null, bid first");
        } else if (this.properties == null || !this.properties.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            C8608u.m24883c(TAG, "no unit id.");
        } else {
            List<NativeListener.Template> list = this.templateList;
            if (list != null && list.size() > 0) {
                try {
                    this.properties.put(MBridgeConstans.NATIVE_INFO, buildTemplateString());
                } catch (Exception unused) {
                    C8608u.m24883c("com.mbridge.msdk", "MBSDK set template error");
                }
            }
            try {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
                if (this.nativeProvider == null) {
                    C8777a aVar2 = new C8777a(this.adListener, this.trackingListener);
                    this.nativeProvider = aVar2;
                    aVar2.mo58164a(this.context, (Resources) null, (Map<String, Object>) this.properties);
                }
                this.nativeProvider.mo58169a(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void registerView(View view, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C8777a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.mo58164a(this.context, (Resources) null, (Map<String, Object>) this.properties);
        }
        this.nativeProvider.mo58165a(view, campaign);
    }

    public void registerView(View view, List<View> list, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C8777a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.mo58164a(this.context, (Resources) null, (Map<String, Object>) this.properties);
        }
        this.nativeProvider.mo58166a(view, list, campaign);
    }

    public void unregisterView(View view, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C8777a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.mo58164a(this.context, (Resources) null, (Map<String, Object>) this.properties);
        }
        this.nativeProvider.mo58171b(view, campaign);
    }

    public void unregisterView(View view, List<View> list, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C8777a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.mo58164a(this.context, (Resources) null, (Map<String, Object>) this.properties);
        }
        this.nativeProvider.mo58172b(view, list, campaign);
    }

    public C8738a getAdListener() {
        return this.adListener;
    }

    public void setAdListener(NativeListener.NativeAdListener nativeAdListener) {
        C8738a aVar = new C8738a(nativeAdListener);
        this.adListener = aVar;
        if (aVar != null) {
            aVar.mo58109a(mUnitID);
        }
        C8777a aVar2 = this.nativeProvider;
        if (aVar2 != null) {
            aVar2.mo58167a(this.adListener);
        }
    }

    public NativeListener.NativeTrackingListener getTrackingListener() {
        return this.trackingListener;
    }

    public void setTrackingListener(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.trackingListener = nativeTrackingListener;
        C8777a aVar = this.nativeProvider;
        if (aVar != null) {
            aVar.mo58168a(nativeTrackingListener);
        }
    }

    public static class KeyWordInfo {
        String keyWordPN;
        String keyWorkVN;

        public String getKeyWordPN() {
            return this.keyWordPN;
        }

        public void setKeyWordPN(String str) {
            this.keyWordPN = str;
        }

        public String getKeyWorkVN() {
            return this.keyWorkVN;
        }

        public void setKeyWorkVN(String str) {
            this.keyWorkVN = str;
        }

        public KeyWordInfo(String str, String str2) {
            this.keyWordPN = str;
            this.keyWorkVN = str2;
        }
    }

    public void clearVideoCache() {
        try {
            if (this.nativeProvider != null) {
                this.nativeProvider.mo58173c();
            }
        } catch (Exception e) {
            C8608u.m24880a(TAG, e.getMessage());
        }
    }

    public void clearCacheByUnitid(String str) {
        try {
            if (!C8556ac.m24737a(str)) {
                C2372e.m5679a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g())).mo15886c(str);
            }
        } catch (Exception e) {
            C8608u.m24880a(TAG, e.getMessage());
        }
    }
}
