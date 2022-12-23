package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.IconClicks;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IconClicksParser implements XmlClassParser<IconClicks> {
    private static final String[] ICON_CLICKS_TAGS = {IconClicks.ICON_CLICK_THROUGH, IconClicks.ICON_CLICK_TRACKING};

    public ParseResult<IconClicks> parse(RegistryXmlParser registryXmlParser) {
        IconClicks.Builder builder = new IconClicks.Builder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        builder.setIconClickTrackings(arrayList2);
        registryXmlParser.parseTags(ICON_CLICKS_TAGS, new Consumer(builder, arrayList, arrayList2) {
            public final /* synthetic */ IconClicks.Builder f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ List f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                IconClicksParser.lambda$parse$2(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("IconClicks", new Exception("Unable to parse IconClicks value", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    static /* synthetic */ void lambda$parse$2(RegistryXmlParser registryXmlParser, IconClicks.Builder builder, List list, List list2, String str) {
        if (str.equalsIgnoreCase(IconClicks.ICON_CLICK_THROUGH)) {
            Objects.requireNonNull(builder);
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    IconClicks.Builder.this.setIconClickThrough((String) obj);
                }
            }, new Consumer(list) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(IconClicks.ICON_CLICK_THROUGH, new Exception("Unable to parse IconClickThrough value", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase(IconClicks.ICON_CLICK_TRACKING)) {
            registryXmlParser.parseClass(IconClicks.ICON_CLICK_TRACKING, new NonNullConsumer(list2, list) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    IconClicksParser.lambda$parse$1(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        }
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
}
