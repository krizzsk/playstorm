package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.AdParameters;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.VideoClicks;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LinearParser implements XmlClassParser<Linear> {
    private static final String[] VAST_LINEAR_TAGS = {Linear.DURATION, "AdParameters", Linear.MEDIA_FILES, "VideoClicks", "TrackingEvents", Linear.ICONS};

    public ParseResult<Linear> parse(RegistryXmlParser registryXmlParser) {
        Linear.Builder builder = new Linear.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute(Linear.SKIPOFFSET, new Consumer() {
            public final void accept(Object obj) {
                Linear.Builder.this.setSkipOffset((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseTags(VAST_LINEAR_TAGS, new Consumer(builder, arrayList) {
            public final /* synthetic */ Linear.Builder f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                LinearParser.lambda$parse$6(RegistryXmlParser.this, this.f$1, this.f$2, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("Linear", new Exception("Unable to parse tags in Linear")));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    static /* synthetic */ void lambda$parse$6(RegistryXmlParser registryXmlParser, Linear.Builder builder, List list, String str) {
        if (Linear.DURATION.equalsIgnoreCase(str)) {
            Objects.requireNonNull(builder);
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    Linear.Builder.this.setDuration((String) obj);
                }
            }, new Consumer(list) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(Linear.DURATION, new Exception("Unable to parse Duration value", (Exception) obj)));
                }
            });
        } else if ("AdParameters".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("AdParameters", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    LinearParser.lambda$parse$1(Linear.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (Linear.MEDIA_FILES.equalsIgnoreCase(str)) {
            registryXmlParser.parseClass(Linear.MEDIA_FILES, new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    LinearParser.lambda$parse$2(Linear.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("VideoClicks".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("VideoClicks", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    LinearParser.lambda$parse$3(Linear.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("TrackingEvents".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("TrackingEvents", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    LinearParser.lambda$parse$4(Linear.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (Linear.ICONS.equalsIgnoreCase(str)) {
            registryXmlParser.parseClass(Linear.ICONS, new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    LinearParser.lambda$parse$5(Linear.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$parse$1(Linear.Builder builder, List list, ParseResult parseResult) {
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

    static /* synthetic */ void lambda$parse$2(Linear.Builder builder, List list, ParseResult parseResult) {
        builder.setMediaFiles((List) parseResult.value);
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

    static /* synthetic */ void lambda$parse$3(Linear.Builder builder, List list, ParseResult parseResult) {
        builder.setVideoClicks((VideoClicks) parseResult.value);
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

    static /* synthetic */ void lambda$parse$4(Linear.Builder builder, List list, ParseResult parseResult) {
        builder.setTrackingEvents((List) parseResult.value);
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

    static /* synthetic */ void lambda$parse$5(Linear.Builder builder, List list, ParseResult parseResult) {
        builder.setIcons((List) parseResult.value);
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
