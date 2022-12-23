package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.AdSystem;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WrapperParser implements XmlClassParser<Wrapper> {
    private static final String[] WRAPPER_TAGS = {"Impression", Wrapper.VAST_AD_TAG_URI, "AdSystem", "Error", "ViewableImpression", "AdVerifications", "Creatives", Wrapper.BLOCKED_AD_CATEGORIES};

    public ParseResult<Wrapper> parse(RegistryXmlParser registryXmlParser) {
        Wrapper.Builder builder = new Wrapper.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseBooleanAttribute(Wrapper.FOLLOW_ADDITIONAL_WRAPPERS, new Consumer() {
            public final void accept(Object obj) {
                Wrapper.Builder.this.setFollowAdditionalWrappers((Boolean) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseBooleanAttribute(Wrapper.ALLOW_MULTIPLE_ADS, new Consumer() {
            public final void accept(Object obj) {
                Wrapper.Builder.this.setAllowMultipleAds((Boolean) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseBooleanAttribute(Wrapper.FALLBACK_ON_NO_AD, new Consumer() {
            public final void accept(Object obj) {
                Wrapper.Builder.this.setFallbackOnNoAd((Boolean) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseTags(WRAPPER_TAGS, getParsingTagsConsumer(registryXmlParser, builder, arrayList), new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("Wrapper", new Exception("Unable to parse tags in Wrapper", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    private Consumer<String> getParsingTagsConsumer(RegistryXmlParser registryXmlParser, Wrapper.Builder builder, List<ParseError> list) {
        ArrayList arrayList = new ArrayList();
        builder.setImpressions(arrayList);
        ArrayList arrayList2 = new ArrayList();
        builder.setErrors(arrayList2);
        return new Consumer(arrayList, list, builder, arrayList2) {
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ Wrapper.Builder f$3;
            public final /* synthetic */ List f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                WrapperParser.lambda$getParsingTagsConsumer$9(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, this.f$4, (String) obj);
            }
        };
    }

    static /* synthetic */ void lambda$getParsingTagsConsumer$9(RegistryXmlParser registryXmlParser, List list, List list2, Wrapper.Builder builder, List list3, String str) {
        if (str.equalsIgnoreCase("Impression")) {
            registryXmlParser.parseClass("Impression", new NonNullConsumer(list, list2) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    WrapperParser.lambda$getParsingTagsConsumer$1(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase(Wrapper.VAST_AD_TAG_URI)) {
            Objects.requireNonNull(builder);
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    Wrapper.Builder.this.setVastAdTagUri((String) obj);
                }
            }, new Consumer(list2) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(Wrapper.VAST_AD_TAG_URI, new Exception("Unable to parse VastAdTagUri in Wrapper", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase(Wrapper.BLOCKED_AD_CATEGORIES)) {
            Objects.requireNonNull(builder);
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    Wrapper.Builder.this.setBlockedAdCategories((String) obj);
                }
            }, new Consumer(list2) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(Wrapper.BLOCKED_AD_CATEGORIES, new Exception("Unable to parse BlockedAdCategories in Wrapper", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase("AdSystem")) {
            registryXmlParser.parseClass("AdSystem", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    WrapperParser.lambda$getParsingTagsConsumer$4(Wrapper.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("Error")) {
            Objects.requireNonNull(list3);
            registryXmlParser.parseString(new Consumer(list3) {
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
                    this.f$0.add(ParseError.buildFrom("Error", new Exception("Unable to parse Error in Wrapper", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase("ViewableImpression")) {
            registryXmlParser.parseClass("ViewableImpression", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    WrapperParser.lambda$getParsingTagsConsumer$6(Wrapper.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("AdVerifications")) {
            registryXmlParser.parseClass("AdVerifications", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    WrapperParser.lambda$getParsingTagsConsumer$7(Wrapper.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("Creatives")) {
            registryXmlParser.parseClass("Creatives", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    WrapperParser.lambda$getParsingTagsConsumer$8(Wrapper.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$getParsingTagsConsumer$1(List list, List list2, ParseResult parseResult) {
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

    static /* synthetic */ void lambda$getParsingTagsConsumer$4(Wrapper.Builder builder, List list, ParseResult parseResult) {
        builder.setAdSystem((AdSystem) parseResult.value);
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

    static /* synthetic */ void lambda$getParsingTagsConsumer$6(Wrapper.Builder builder, List list, ParseResult parseResult) {
        builder.setViewableImpression((ViewableImpression) parseResult.value);
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

    static /* synthetic */ void lambda$getParsingTagsConsumer$7(Wrapper.Builder builder, List list, ParseResult parseResult) {
        Objects.requireNonNull(builder);
        com.smaato.sdk.core.util.Objects.onNotNull((List) parseResult.value, new Consumer() {
            public final void accept(Object obj) {
                Wrapper.Builder.this.setAdVerifications((List) obj);
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

    static /* synthetic */ void lambda$getParsingTagsConsumer$8(Wrapper.Builder builder, List list, ParseResult parseResult) {
        Objects.requireNonNull(builder);
        com.smaato.sdk.core.util.Objects.onNotNull((List) parseResult.value, new Consumer() {
            public final void accept(Object obj) {
                Wrapper.Builder.this.setCreatives((List) obj);
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
}
