package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ViewableImpressionParser implements XmlClassParser<ViewableImpression> {
    private static final String[] VAST_VIEWABLE_IMPRESSION_TAGS = {ViewableImpression.VIEWABLE, ViewableImpression.NOT_VIEWABLE, ViewableImpression.VIEW_UNDETERMINED};

    public ParseResult<ViewableImpression> parse(RegistryXmlParser registryXmlParser) {
        ViewableImpression.Builder builder = new ViewableImpression.Builder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        builder.setViewable(arrayList);
        builder.setNotViewable(arrayList2);
        builder.setViewUndetermined(arrayList3);
        registryXmlParser.parseStringAttribute("id", new Consumer() {
            public final void accept(Object obj) {
                ViewableImpression.Builder.this.setId((String) obj);
            }
        }, new Consumer(arrayList4) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseTags(VAST_VIEWABLE_IMPRESSION_TAGS, new Consumer(arrayList, arrayList4, arrayList2, arrayList3) {
            public final /* synthetic */ List f$1;
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
                ViewableImpressionParser.lambda$parse$3(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, this.f$4, (String) obj);
            }
        }, new Consumer(arrayList4) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("ViewableImpression", new Exception("Unable to parse tags in ViewableImpression")));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList4).build();
    }

    static /* synthetic */ void lambda$parse$3(RegistryXmlParser registryXmlParser, List list, List list2, List list3, List list4, String str) {
        if (ViewableImpression.VIEWABLE.equalsIgnoreCase(str)) {
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
                    this.f$0.add(ParseError.buildFrom(ViewableImpression.VIEWABLE, new Exception("Unable to parse ViewableImpression value", (Exception) obj)));
                }
            });
        } else if (ViewableImpression.NOT_VIEWABLE.equalsIgnoreCase(str)) {
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
                    this.f$0.add(ParseError.buildFrom(ViewableImpression.NOT_VIEWABLE, new Exception("Unable to parse NotViewableImpression value", (Exception) obj)));
                }
            });
        } else if (ViewableImpression.VIEW_UNDETERMINED.equalsIgnoreCase(str)) {
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
                    this.f$0.add(ParseError.buildFrom(ViewableImpression.VIEW_UNDETERMINED, new Exception("Unable to parse ViewUndetermined value", (Exception) obj)));
                }
            });
        }
    }
}
