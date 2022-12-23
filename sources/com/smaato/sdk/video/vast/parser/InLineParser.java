package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.AdSystem;
import com.smaato.sdk.video.vast.model.Advertiser;
import com.smaato.sdk.video.vast.model.Category;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class InLineParser implements XmlClassParser<InLine> {
    private static final String[] VAST_INLINE_TAGS = {"AdSystem", InLine.AD_TITLE, InLine.AD_SERVING_ID, "Impression", "Category", InLine.DESCRIPTION, "Advertiser", "Error", "ViewableImpression", "AdVerifications", "Creatives", "Extensions"};

    public ParseResult<InLine> parse(RegistryXmlParser registryXmlParser) {
        InLine.Builder builder = new InLine.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseTags(VAST_INLINE_TAGS, getParsingTagsConsumer(registryXmlParser, builder, arrayList), new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("InLine", new Exception("Unable to parse tags in InLine")));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    private Consumer<String> getParsingTagsConsumer(RegistryXmlParser registryXmlParser, InLine.Builder builder, List<ParseError> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        builder.setImpressions(arrayList);
        builder.setCategories(arrayList2);
        builder.setAdVerifications(arrayList4);
        builder.setExtensions(arrayList5);
        builder.setErrors(arrayList3);
        return new Consumer(registryXmlParser, builder, list, arrayList, arrayList2, arrayList3, arrayList4, arrayList5) {
            public final /* synthetic */ RegistryXmlParser f$1;
            public final /* synthetic */ InLine.Builder f$2;
            public final /* synthetic */ List f$3;
            public final /* synthetic */ List f$4;
            public final /* synthetic */ List f$5;
            public final /* synthetic */ List f$6;
            public final /* synthetic */ List f$7;
            public final /* synthetic */ List f$8;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
            }

            public final void accept(Object obj) {
                InLineParser.this.lambda$getParsingTagsConsumer$1$InLineParser(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (String) obj);
            }
        };
    }

    public /* synthetic */ void lambda$getParsingTagsConsumer$1$InLineParser(RegistryXmlParser registryXmlParser, InLine.Builder builder, List list, List list2, List list3, List list4, List list5, List list6, String str) {
        if ("AdSystem".equalsIgnoreCase(str)) {
            parseAdSystem(registryXmlParser, builder, list);
        } else if (InLine.AD_TITLE.equalsIgnoreCase(str)) {
            parseAdTitle(registryXmlParser, builder, list);
        } else if (InLine.AD_SERVING_ID.equalsIgnoreCase(str)) {
            parseAdServingId(registryXmlParser, builder, list);
        } else if ("Impression".equalsIgnoreCase(str)) {
            parseImpression(registryXmlParser, list2, list);
        } else if ("Category".equalsIgnoreCase(str)) {
            parseCategory(registryXmlParser, list3, list);
        } else if (InLine.DESCRIPTION.equalsIgnoreCase(str)) {
            parseDescription(registryXmlParser, builder, list);
        } else if ("Advertiser".equalsIgnoreCase(str)) {
            parseAdvertiser(registryXmlParser, builder, list);
        } else if ("Error".equalsIgnoreCase(str)) {
            parseError(registryXmlParser, list4, list);
        } else if ("ViewableImpression".equalsIgnoreCase(str)) {
            parseViewableImpression(registryXmlParser, builder, list);
        } else if ("Creatives".equalsIgnoreCase(str)) {
            parseCreatives(registryXmlParser, builder, list);
        } else if ("AdVerifications".equalsIgnoreCase(str)) {
            parseAdVerification(registryXmlParser, list5, list);
        } else if ("Extensions".equalsIgnoreCase(str)) {
            parseExtention(registryXmlParser, list6, list);
        }
    }

    private void parseExtention(RegistryXmlParser registryXmlParser, List<Extension> list, List<ParseError> list2) {
        registryXmlParser.parseClass("Extensions", new NonNullConsumer(list, list2) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InLineParser.lambda$parseExtention$2(this.f$0, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseExtention$2(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        if (result != null) {
            list.addAll((Collection) result);
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

    private void parseAdVerification(RegistryXmlParser registryXmlParser, List<Verification> list, List<ParseError> list2) {
        registryXmlParser.parseClass("AdVerifications", new NonNullConsumer(list, list2) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InLineParser.lambda$parseAdVerification$3(this.f$0, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseAdVerification$3(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        if (result != null) {
            list.addAll((Collection) result);
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

    private void parseCreatives(RegistryXmlParser registryXmlParser, InLine.Builder builder, List<ParseError> list) {
        registryXmlParser.parseClass("Creatives", new NonNullConsumer(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InLineParser.lambda$parseCreatives$4(InLine.Builder.this, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseCreatives$4(InLine.Builder builder, List list, ParseResult parseResult) {
        builder.setCreatives((List) parseResult.value);
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

    private void parseViewableImpression(RegistryXmlParser registryXmlParser, InLine.Builder builder, List<ParseError> list) {
        registryXmlParser.parseClass("ViewableImpression", new NonNullConsumer(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InLineParser.lambda$parseViewableImpression$5(InLine.Builder.this, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseViewableImpression$5(InLine.Builder builder, List list, ParseResult parseResult) {
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

    private void parseError(RegistryXmlParser registryXmlParser, List<String> list, List<ParseError> list2) {
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
                this.f$0.add(ParseError.buildFrom("Error", new Exception("Unable to parse Error value", (Exception) obj)));
            }
        });
    }

    private void parseAdvertiser(RegistryXmlParser registryXmlParser, InLine.Builder builder, List<ParseError> list) {
        registryXmlParser.parseClass("Advertiser", new NonNullConsumer(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InLineParser.lambda$parseAdvertiser$7(InLine.Builder.this, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseAdvertiser$7(InLine.Builder builder, List list, ParseResult parseResult) {
        Result result = parseResult.value;
        if (result != null) {
            builder.setAdvertiser((Advertiser) result);
        }
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

    private void parseDescription(RegistryXmlParser registryXmlParser, InLine.Builder builder, List<ParseError> list) {
        Objects.requireNonNull(builder);
        registryXmlParser.parseString(new Consumer() {
            public final void accept(Object obj) {
                InLine.Builder.this.setDescription((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(InLine.DESCRIPTION, new Exception("Unable to parse Description value", (Exception) obj)));
            }
        });
    }

    private void parseCategory(RegistryXmlParser registryXmlParser, List<Category> list, List<ParseError> list2) {
        registryXmlParser.parseClass("Category", new NonNullConsumer(list, list2) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InLineParser.lambda$parseCategory$9(this.f$0, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseCategory$9(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        if (result != null) {
            list.add((Category) result);
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

    private void parseImpression(RegistryXmlParser registryXmlParser, List<VastBeacon> list, List<ParseError> list2) {
        registryXmlParser.parseClass("Impression", new NonNullConsumer(list, list2) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InLineParser.lambda$parseImpression$10(this.f$0, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseImpression$10(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        if (result != null) {
            list.add((VastBeacon) result);
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

    private void parseAdServingId(RegistryXmlParser registryXmlParser, InLine.Builder builder, List<ParseError> list) {
        Objects.requireNonNull(builder);
        registryXmlParser.parseString(new Consumer() {
            public final void accept(Object obj) {
                InLine.Builder.this.setAdServingId((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(InLine.AD_SERVING_ID, new Exception("Unable to parse AdServingId value", (Exception) obj)));
            }
        });
    }

    private void parseAdTitle(RegistryXmlParser registryXmlParser, InLine.Builder builder, List<ParseError> list) {
        Objects.requireNonNull(builder);
        registryXmlParser.parseString(new Consumer() {
            public final void accept(Object obj) {
                InLine.Builder.this.setAdTitle((String) obj);
            }
        }, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(InLine.AD_TITLE, new Exception("Unable to parse AdTitle value", (Exception) obj)));
            }
        });
    }

    private void parseAdSystem(RegistryXmlParser registryXmlParser, InLine.Builder builder, List<ParseError> list) {
        registryXmlParser.parseClass("AdSystem", new NonNullConsumer(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InLineParser.lambda$parseAdSystem$13(InLine.Builder.this, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseAdSystem$13(InLine.Builder builder, List list, ParseResult parseResult) {
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
}
