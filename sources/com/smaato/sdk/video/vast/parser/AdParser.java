package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.C11286Ad;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdParser implements XmlClassParser<C11286Ad> {
    private static final String[] VAST_AD_TAGS = {"InLine", "Wrapper"};

    static /* synthetic */ void lambda$parse$0(ParseError parseError) {
    }

    public ParseResult<C11286Ad> parse(RegistryXmlParser registryXmlParser) {
        C11286Ad.Builder builder = new C11286Ad.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("id", new Consumer() {
            public final void accept(Object obj) {
                C11286Ad.Builder.this.setId((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseIntegerAttribute("sequence", new Consumer() {
            public final void accept(Object obj) {
                C11286Ad.Builder.this.setSequence((Integer) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseBooleanAttribute(C11286Ad.CONDITIONAL_AD, new Consumer() {
            public final void accept(Object obj) {
                C11286Ad.Builder.this.setConditionalAd((Boolean) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute(C11286Ad.AD_TYPE, new Consumer() {
            public final void accept(Object obj) {
                C11286Ad.Builder.this.setAdType((String) obj);
            }
        }, $$Lambda$AdParser$D6r03UCxgDOzWq7Qv08B3ILlGcc.INSTANCE).parseTags(VAST_AD_TAGS, new Consumer(builder, arrayList) {
            public final /* synthetic */ C11286Ad.Builder f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                AdParser.lambda$parse$3(RegistryXmlParser.this, this.f$1, this.f$2, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("Ad", new Exception("Unable to parse tags in Ad", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    static /* synthetic */ void lambda$parse$3(RegistryXmlParser registryXmlParser, C11286Ad.Builder builder, List list, String str) {
        if (str.equalsIgnoreCase("InLine")) {
            registryXmlParser.parseClass("InLine", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdParser.lambda$parse$1(C11286Ad.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("Wrapper")) {
            registryXmlParser.parseClass("Wrapper", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdParser.lambda$parse$2(C11286Ad.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$parse$1(C11286Ad.Builder builder, List list, ParseResult parseResult) {
        builder.setInLine((InLine) parseResult.value);
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

    static /* synthetic */ void lambda$parse$2(C11286Ad.Builder builder, List list, ParseResult parseResult) {
        builder.setWrapper((Wrapper) parseResult.value);
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
