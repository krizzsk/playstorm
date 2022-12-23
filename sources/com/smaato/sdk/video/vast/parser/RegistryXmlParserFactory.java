package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.framework.VideoDiNames;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.Icon;
import com.smaato.sdk.video.vast.model.IconClicks;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public final class RegistryXmlParserFactory implements ClassFactory<RegistryXmlParser> {
    public RegistryXmlParser get(DiConstructor diConstructor) {
        XmlPullParser xmlPullParser = (XmlPullParser) diConstructor.get(VideoDiNames.MODULE_DI_NAME, XmlPullParser.class);
        Objects.requireNonNull(xmlPullParser, "XML pull parser shouldn't be null");
        RegistryXmlParser registryXmlParser = new RegistryXmlParser(xmlPullParser, new HashMap());
        registryXmlParser.registerParser(VastTree.VAST, new VastTreeParser());
        registryXmlParser.registerParser("AdParameters", new AdParametersParser());
        registryXmlParser.registerParser("Ad", new AdParser());
        registryXmlParser.registerParser("AdSystem", new AdSystemParser());
        registryXmlParser.registerParser("Category", new CategoryParser());
        registryXmlParser.registerParser("Advertiser", new AdvertiserParser());
        registryXmlParser.registerParser("CompanionAds", new CompanionAdsParser());
        registryXmlParser.registerParser("Companion", new CompanionParser());
        registryXmlParser.registerParser(Creative.NAME, new CreativeParser());
        registryXmlParser.registerParser("IconClicks", new IconClicksParser());
        registryXmlParser.registerParser(Icon.NAME, new IconParser());
        registryXmlParser.registerParser("InLine", new InLineParser());
        registryXmlParser.registerParser("JavaScriptResource", new JavaScriptResourceParser());
        registryXmlParser.registerParser("Linear", new LinearParser());
        registryXmlParser.registerParser(MediaFile.NAME, new MediaFileParser());
        registryXmlParser.registerParser("StaticResource", new StaticResourceParser());
        registryXmlParser.registerParser(Tracking.NAME, new TrackingParser());
        registryXmlParser.registerParser("UniversalAdId", new UniversalAdIdParser());
        registryXmlParser.registerParser(Verification.NAME, new VerificationParser());
        registryXmlParser.registerParser(Extension.NAME, new ExtensionParser());
        registryXmlParser.registerParser("VideoClicks", new VideoClicksParser());
        registryXmlParser.registerParser("ViewableImpression", new ViewableImpressionParser());
        registryXmlParser.registerParser("Wrapper", new WrapperParser());
        registryXmlParser.registerParser("Impression", new VastBeaconParser("Impression"));
        registryXmlParser.registerParser(VideoClicks.CLICK_THROUGH, new VastBeaconParser(VideoClicks.CLICK_THROUGH));
        registryXmlParser.registerParser(VideoClicks.CLICK_TRACKING, new VastBeaconParser(VideoClicks.CLICK_TRACKING));
        registryXmlParser.registerParser(VideoClicks.CUSTOM_CLICK, new VastBeaconParser(VideoClicks.CUSTOM_CLICK));
        registryXmlParser.registerParser(IconClicks.ICON_CLICK_TRACKING, new VastBeaconParser(IconClicks.ICON_CLICK_TRACKING));
        registryXmlParser.registerParser(Companion.COMPANION_CLICK_TRACKING, new VastBeaconParser(Companion.COMPANION_CLICK_TRACKING));
        registryXmlParser.registerParser("AdVerifications", new ArrayXmlClassParser("AdVerifications", Verification.NAME));
        registryXmlParser.registerParser("Extensions", new ArrayXmlClassParser("Extensions", Extension.NAME));
        registryXmlParser.registerParser("Creatives", new ArrayXmlClassParser("Creatives", Creative.NAME));
        registryXmlParser.registerParser(Linear.MEDIA_FILES, new ArrayXmlClassParser(Linear.MEDIA_FILES, MediaFile.NAME));
        registryXmlParser.registerParser(Linear.ICONS, new ArrayXmlClassParser(Linear.ICONS, Icon.NAME));
        registryXmlParser.registerParser("TrackingEvents", new ArrayXmlClassParser("TrackingEvents", Tracking.NAME));
        return registryXmlParser;
    }
}
