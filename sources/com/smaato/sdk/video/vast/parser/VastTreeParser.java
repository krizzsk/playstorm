package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.C11286Ad;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VastTreeParser implements XmlClassParser<VastTree> {
    private static final String[] VAST_TREE_TAGS = {"Ad", "Error"};

    public ParseResult<VastTree> parse(RegistryXmlParser registryXmlParser) {
        VastTree.Builder builder = new VastTree.Builder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        builder.setAds(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        builder.setErrors(arrayList3);
        registryXmlParser.parseStringAttribute("version", new Consumer() {
            public final void accept(Object obj) {
                VastTree.Builder.this.setVersion((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseTags(VAST_TREE_TAGS, new Consumer(arrayList3, arrayList, arrayList2) {
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ List f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                VastTreeParser.lambda$parse$3(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(VastTree.VAST, new Exception("Unable to parse tags in Vast", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    static /* synthetic */ void lambda$parse$3(RegistryXmlParser registryXmlParser, List list, List list2, List list3, String str) {
        if (str.equalsIgnoreCase("Error")) {
            registryXmlParser.parseString(new Consumer(list) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    VastTreeParser.lambda$parse$0(this.f$0, (String) obj);
                }
            }, new Consumer(list2) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom("Error", new Exception("Unable to parse Error in Vast", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase("Ad")) {
            registryXmlParser.parseClass("Ad", new NonNullConsumer(list3, list2) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    VastTreeParser.lambda$parse$2(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$parse$0(List list, String str) {
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull(str, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((String) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parse$2(List list, List list2, ParseResult parseResult) {
        list.add((C11286Ad) parseResult.value);
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
