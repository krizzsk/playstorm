package p009by.saygames;

import com.adjust.sdk.Adjust;
import com.amazon.device.ads.AdRegistration;
import com.applovin.sdk.AppLovinSdk;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.out.MBConfiguration;
import com.ogury.sdk.Ogury;
import com.p374my.target.common.MyTargetVersion;
import com.saypromo.SPAdManager;
import com.smaato.sdk.core.SmaatoSdk;
import com.tapjoy.Tapjoy;
import com.unity3d.ads.UnityAds;

/* renamed from: by.saygames.SayKitVersionManager */
public class SayKitVersionManager {
    public static void trackSDKVersions() {
        try {
            SayKitEvents.track("sdk_adcolony", 0, 0, "4.8.0");
            SayKitEvents.track("sdk_applovin", 0, 0, AppLovinSdk.VERSION);
            SayKitEvents.track("sdk_admob", 0, 0, "21.0.0");
            SayKitEvents.track("sdk_facebook", 0, 0, "6.11.0");
            SayKitEvents.track("sdk_ironsource", 0, 0, IronSourceUtils.getSDKVersion());
            SayKitEvents.track("sdk_bytedance", 0, 0, TTAdSdk.getAdManager().getSDKVersion());
            SayKitEvents.track("sdk_unity", 0, 0, UnityAds.getVersion());
            SayKitEvents.track("sdk_vungle", 0, 0, "6.11.0");
            SayKitEvents.track("sdk_saypromo", 0, 0, SPAdManager.getSDKVersion());
            SayKitEvents.track("sdk_fyber", 0, 0, InneractiveAdManager.getVersion());
            SayKitEvents.track("sdk_inmobi", 0, 0, InMobiSdk.getVersion());
            SayKitEvents.track("sdk_mytarget", 0, 0, MyTargetVersion.VERSION);
            SayKitEvents.track("sdk_ogury", 0, 0, Ogury.getSdkVersion());
            SayKitEvents.track("sdk_smaato", 0, 0, SmaatoSdk.getVersion());
            SayKitEvents.track("sdk_tapjoy", 0, 0, Tapjoy.getVersion());
            SayKitEvents.track("sdk_adjust", 0, 0, Adjust.getSdkVersion().replace("android", ""));
            String[] split = AdRegistration.getVersion().split("-");
            SayKitEvents.track("sdk_amazon", 0, 0, split[split.length - 2]);
            String[] split2 = MBConfiguration.SDK_VERSION.split("_");
            SayKitEvents.track("sdk_mintegral", 0, 0, split2[split2.length - 1]);
        } catch (Exception e) {
            SayKitLog.Log("i", "[SayKitVersionManager]", "Error getting versions ", e);
        }
    }
}
