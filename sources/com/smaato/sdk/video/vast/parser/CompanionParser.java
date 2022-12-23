package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.AdParameters;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompanionParser implements XmlClassParser<Companion> {
    private static final String[] COMPANION_TAGS = {"StaticResource", "IFrameResource", "HTMLResource", Companion.ALT_TEXT, Companion.COMPANION_CLICK_THROUGH, Companion.COMPANION_CLICK_TRACKING, "TrackingEvents", "AdParameters"};

    static /* synthetic */ void lambda$parseAttributes$10(ParseError parseError) {
    }

    private static Consumer<String> getParsingTagsConsumer(RegistryXmlParser registryXmlParser, Companion.Builder builder, List<ParseError> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        builder.setCompanionClickTrackings(arrayList);
        builder.setStaticResources(arrayList2);
        builder.setIFrameResources(arrayList3);
        builder.setHtmlResources(arrayList4);
        return new Consumer(arrayList2, list, arrayList3, arrayList4, builder, arrayList) {
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ List f$3;
            public final /* synthetic */ List f$4;
            public final /* synthetic */ Companion.Builder f$5;
            public final /* synthetic */ List f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void accept(Object obj) {
                CompanionParser.lambda$getParsingTagsConsumer$0(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (String) obj);
            }
        };
    }

    static /* synthetic */ void lambda$getParsingTagsConsumer$0(RegistryXmlParser registryXmlParser, List list, List list2, List list3, List list4, Companion.Builder builder, List list5, String str) {
        if ("StaticResource".equalsIgnoreCase(str)) {
            parseStaticResource(registryXmlParser, list, list2);
        } else if ("IFrameResource".equalsIgnoreCase(str)) {
            parseIFrameResource(registryXmlParser, list3, list2);
        } else if ("HTMLResource".equalsIgnoreCase(str)) {
            parseHtmlResource(registryXmlParser, list4, list2);
        } else if (Companion.ALT_TEXT.equalsIgnoreCase(str)) {
            parseAltText(registryXmlParser, builder, list2);
        } else if ("AdParameters".equalsIgnoreCase(str)) {
            parseAdParameters(registryXmlParser, builder, list2);
        } else if (Companion.COMPANION_CLICK_THROUGH.equalsIgnoreCase(str)) {
            parseCompanionClickThrough(registryXmlParser, builder, list2);
        } else if (Companion.COMPANION_CLICK_TRACKING.equalsIgnoreCase(str)) {
            parseCompanionClickTracking(registryXmlParser, list5, list2);
        } else if ("TrackingEvents".equalsIgnoreCase(str)) {
            parseTrackingEvents(registryXmlParser, builder, list2);
        }
    }

    private static void parseStaticResource(RegistryXmlParser registryXmlParser, List<StaticResource> list, List<ParseError> list2) {
        registryXmlParser.parseClass("StaticResource", new NonNullConsumer(list, list2) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                CompanionParser.lambda$parseStaticResource$1(this.f$0, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseStaticResource$1(List list, List list2, ParseResult parseResult) {
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull((StaticResource) parseResult.value, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((StaticResource) obj);
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

    private static void parseTrackingEvents(RegistryXmlParser registryXmlParser, Companion.Builder builder, List<ParseError> list) {
        registryXmlParser.parseClass("TrackingEvents", new NonNullConsumer(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                CompanionParser.lambda$parseTrackingEvents$2(Companion.Builder.this, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseTrackingEvents$2(Companion.Builder builder, List list, ParseResult parseResult) {
        Objects.requireNonNull(builder);
        com.smaato.sdk.core.util.Objects.onNotNull((List) parseResult.value, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setTrackingEvents((List) obj);
            }
        });
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

    private static void parseCompanionClickTracking(RegistryXmlParser registryXmlParser, List<VastBeacon> list, List<ParseError> list2) {
        registryXmlParser.parseClass(Companion.COMPANION_CLICK_TRACKING, new NonNullConsumer(list, list2) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                CompanionParser.lambda$parseCompanionClickTracking$3(this.f$0, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseCompanionClickTracking$3(List list, List list2, ParseResult parseResult) {
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

    private static void parseCompanionClickThrough(RegistryXmlParser registryXmlParser, Companion.Builder builder, List<ParseError> list) {
        Objects.requireNonNull(builder);
        registryXmlParser.parseString(new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setCompanionClickThrough((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(Companion.COMPANION_CLICK_THROUGH, new Exception("Unable to parse CompanionClickThrough", (Exception) obj)));
            }
        });
    }

    private static void parseAdParameters(RegistryXmlParser registryXmlParser, Companion.Builder builder, List<ParseError> list) {
        registryXmlParser.parseClass("AdParameters", new NonNullConsumer(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                CompanionParser.lambda$parseAdParameters$5(Companion.Builder.this, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseAdParameters$5(Companion.Builder builder, List list, ParseResult parseResult) {
        builder.setAdParameters((AdParameters) parseResult.value);
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

    private static void parseAltText(RegistryXmlParser registryXmlParser, Companion.Builder builder, List<ParseError> list) {
        Objects.requireNonNull(builder);
        registryXmlParser.parseString(new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setAltText((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(Companion.ALT_TEXT, new Exception("Unable to parse AltText", (Exception) obj)));
            }
        });
    }

    private static void parseHtmlResource(RegistryXmlParser registryXmlParser, List<String> list, List<ParseError> list2) {
        Objects.requireNonNull(list);
        registryXmlParser.parseString(new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((String) obj);
            }
        }, new Consumer(list2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("HTMLResource", new Exception("Unable to parse HtmlResource", (Exception) obj)));
            }
        });
    }

    private static void parseIFrameResource(RegistryXmlParser registryXmlParser, List<String> list, List<ParseError> list2) {
        Objects.requireNonNull(list);
        registryXmlParser.parseString(new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((String) obj);
            }
        }, new Consumer(list2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("IFrameResource", new Exception("Unable to parse IFrameResource", (Exception) obj)));
            }
        });
    }

    public ParseResult<Companion> parse(RegistryXmlParser registryXmlParser) {
        Companion.Builder builder = new Companion.Builder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        builder.setTrackingEvents(arrayList2);
        builder.setCompanionClickTrackings(arrayList3);
        parseAttributes(registryXmlParser, builder, arrayList);
        registryXmlParser.parseTags(COMPANION_TAGS, getParsingTagsConsumer(registryXmlParser, builder, arrayList), new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("Companion", new Exception("Unable to parse tags in Companion", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    private void parseAttributes(RegistryXmlParser registryXmlParser, Companion.Builder builder, List<ParseError> list) {
        Objects.requireNonNull(builder);
        $$Lambda$0bqD4vE97fmlyD9aGLPSVjMZkc r0 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setId((String) obj);
            }
        };
        Objects.requireNonNull(list);
        registryXmlParser.parseStringAttribute("id", r0, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute("width", new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setWidth((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute("height", new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setHeight((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute(Companion.ASSET_WIDTH, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setAssetWidth((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute(Companion.ASSET_HEIGHT, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setAssetHeight((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute(Companion.EXPANDED_WIDTH, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setExpandedWidth((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute(Companion.EXPANDED_HEIGHT, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setExpandedHeight((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute("apiFramework", new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setApiFramework((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute(Companion.AD_SLOT_ID, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setAdSlotID((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute("pxratio", new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setPxRatio((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute(Companion.RENDERING_MODE, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setRenderingMode((String) obj);
            }
        }, $$Lambda$CompanionParser$PJXb_HEHOFkoORxFDcEJM1Gf28.INSTANCE);
    }
}
