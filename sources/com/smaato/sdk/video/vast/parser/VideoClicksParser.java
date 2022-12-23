package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.VideoClicks;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VideoClicksParser implements XmlClassParser<VideoClicks> {
    private static final String[] VIDEO_CLICKS_PARSER = {VideoClicks.CLICK_THROUGH, VideoClicks.CLICK_TRACKING, VideoClicks.CUSTOM_CLICK};

    public ParseResult<VideoClicks> parse(RegistryXmlParser registryXmlParser) {
        VideoClicks.Builder builder = new VideoClicks.Builder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        builder.setClickTrackings(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        builder.setCustomClicks(arrayList3);
        registryXmlParser.parseTags(VIDEO_CLICKS_PARSER, new Consumer(builder, arrayList, arrayList2, arrayList3) {
            public final /* synthetic */ VideoClicks.Builder f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ List f$3;
            public final /* synthetic */ List f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                VideoClicksParser.lambda$parse$3(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, this.f$4, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("VideoClicks", new Exception("Unable to parse tags in CompanionAds", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    static /* synthetic */ void lambda$parse$3(RegistryXmlParser registryXmlParser, VideoClicks.Builder builder, List list, List list2, List list3, String str) {
        if (str.equalsIgnoreCase(VideoClicks.CLICK_THROUGH)) {
            registryXmlParser.parseClass(VideoClicks.CLICK_THROUGH, new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    VideoClicksParser.lambda$parse$0(VideoClicks.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase(VideoClicks.CLICK_TRACKING)) {
            registryXmlParser.parseClass(VideoClicks.CLICK_TRACKING, new NonNullConsumer(list2, list) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    VideoClicksParser.lambda$parse$1(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase(VideoClicks.CUSTOM_CLICK)) {
            registryXmlParser.parseClass(VideoClicks.CUSTOM_CLICK, new NonNullConsumer(list3, list) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    VideoClicksParser.lambda$parse$2(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$parse$0(VideoClicks.Builder builder, List list, ParseResult parseResult) {
        builder.setClickThrough((VastBeacon) parseResult.value);
        List<ParseError> list2 = parseResult.errors;
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull(list2, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.addAll((List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parse$1(List list, List list2, ParseResult parseResult) {
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull((VastBeacon) parseResult.value, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((VastBeacon) obj);
            }
        });
        List<ParseError> list3 = parseResult.errors;
        Objects.requireNonNull(list2);
        com.smaato.sdk.core.util.Objects.onNotNull(list3, new Consumer(list2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.addAll((List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parse$2(List list, List list2, ParseResult parseResult) {
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull((VastBeacon) parseResult.value, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((VastBeacon) obj);
            }
        });
        List<ParseError> list3 = parseResult.errors;
        Objects.requireNonNull(list2);
        com.smaato.sdk.core.util.Objects.onNotNull(list3, new Consumer(list2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.addAll((List) obj);
            }
        });
    }
}
