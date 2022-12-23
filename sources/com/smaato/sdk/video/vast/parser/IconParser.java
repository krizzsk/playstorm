package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.Icon;
import com.smaato.sdk.video.vast.model.IconClicks;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IconParser implements XmlClassParser<Icon> {
    private static final String[] ICON_TAGS = {"StaticResource", "IFrameResource", "HTMLResource", "IconClicks", Icon.ICON_VIEW_TRACKING};

    public ParseResult<Icon> parse(RegistryXmlParser registryXmlParser) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Icon.Builder builder = new Icon.Builder();
        builder.setIconViewTrackings(arrayList);
        builder.setStaticResources(arrayList2);
        builder.setIFrameResources(arrayList3);
        builder.setHtmlResources(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        parseAttributes(registryXmlParser, builder, arrayList5);
        registryXmlParser.parseTags(ICON_TAGS, new Consumer(arrayList2, arrayList5, arrayList3, arrayList4, arrayList, builder) {
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ List f$3;
            public final /* synthetic */ List f$4;
            public final /* synthetic */ List f$5;
            public final /* synthetic */ Icon.Builder f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void accept(Object obj) {
                IconParser.lambda$parse$5(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (String) obj);
            }
        }, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(Icon.NAME, new Exception("Unable to parse URL value", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList5).build();
    }

    static /* synthetic */ void lambda$parse$5(RegistryXmlParser registryXmlParser, List list, List list2, List list3, List list4, List list5, Icon.Builder builder, String str) {
        if (str.equalsIgnoreCase("StaticResource")) {
            registryXmlParser.parseClass("StaticResource", new NonNullConsumer(list, list2) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    IconParser.lambda$parse$0(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("IFrameResource")) {
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
                    this.f$0.add(ParseError.buildFrom("IFrameResource", new Exception("Unable to parse IFrameResource value", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase("HTMLResource")) {
            Objects.requireNonNull(list4);
            registryXmlParser.parseString(new Consumer(list4) {
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
                    this.f$0.add(ParseError.buildFrom("HTMLResource", new Exception("Unable to parse HTMLResource value", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase(Icon.ICON_VIEW_TRACKING)) {
            Objects.requireNonNull(list5);
            registryXmlParser.parseString(new Consumer(list5) {
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
                    this.f$0.add(ParseError.buildFrom(Icon.ICON_VIEW_TRACKING, new Exception("Unable to parse IconViewTracking value", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase("IconClicks")) {
            registryXmlParser.parseClass("IconClicks", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    IconParser.lambda$parse$4(Icon.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$parse$0(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        if (result != null) {
            list.add((StaticResource) result);
        }
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

    static /* synthetic */ void lambda$parse$4(Icon.Builder builder, List list, ParseResult parseResult) {
        builder.setIconClicks((IconClicks) parseResult.value);
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

    private void parseAttributes(RegistryXmlParser registryXmlParser, Icon.Builder builder, List<ParseError> list) {
        Objects.requireNonNull(builder);
        $$Lambda$yv3b2fIi6yUZmhhFSIfVnMeNGaA r0 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setProgram((String) obj);
            }
        };
        Objects.requireNonNull(list);
        registryXmlParser.parseStringAttribute(Icon.PROGRAM, r0, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute("width", new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setWidth((Float) obj);
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
                Icon.Builder.this.setHeight((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute(Icon.X_POSITION, new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setXPosition((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute(Icon.Y_POSITION, new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setYPosition((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute("duration", new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setDuration((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute("offset", new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setOffset((String) obj);
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
                Icon.Builder.this.setApiFramework((String) obj);
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
                Icon.Builder.this.setPxRatio((Float) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
    }
}
