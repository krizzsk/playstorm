package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.JavaScriptResource;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class VerificationParser implements XmlClassParser<Verification> {
    private static final String[] VERIFICATION_TAGS = {"JavaScriptResource", Verification.VERIFICATION_PARAMETERS, "ViewableImpression"};

    public ParseResult<Verification> parse(RegistryXmlParser registryXmlParser) {
        Verification verification;
        Verification.Builder builder = new Verification.Builder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        builder.setJavaScriptResources(arrayList);
        registryXmlParser.parseStringAttribute(Verification.VENDOR, new Consumer() {
            public final void accept(Object obj) {
                Verification.Builder.this.setVendor((String) obj);
            }
        }, new Consumer(arrayList2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseTags(VERIFICATION_TAGS, new Consumer(arrayList, arrayList2, builder) {
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ Verification.Builder f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                VerificationParser.lambda$parse$5(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, (String) obj);
            }
        }, new Consumer(arrayList2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(Verification.NAME, new Exception("Unable to parse tags in Verification", (Exception) obj)));
            }
        });
        try {
            verification = builder.build();
        } catch (VastElementMissingException e) {
            arrayList2.add(ParseError.buildFrom(Verification.NAME, e));
            verification = null;
        }
        return new ParseResult.Builder().setResult(verification).setErrors(arrayList2).build();
    }

    static /* synthetic */ void lambda$parse$5(RegistryXmlParser registryXmlParser, List list, List list2, Verification.Builder builder, String str) {
        if ("JavaScriptResource".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("JavaScriptResource", new NonNullConsumer(list, list2) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    Objects.onNotNull((ParseResult) obj, new Consumer(this.f$0, this.f$1) {
                        public final /* synthetic */ List f$0;
                        public final /* synthetic */ List f$1;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                        }

                        public final void accept(Object obj) {
                            VerificationParser.lambda$parse$0(this.f$0, this.f$1, (ParseResult) obj);
                        }
                    });
                }
            });
        } else if (Verification.VERIFICATION_PARAMETERS.equalsIgnoreCase(str)) {
            java.util.Objects.requireNonNull(builder);
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    Verification.Builder.this.setVerificationParameters((String) obj);
                }
            }, new Consumer(list2) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(Verification.VERIFICATION_PARAMETERS, new Exception("Unable to parse verification parameters", (Exception) obj)));
                }
            });
        } else if ("ViewableImpression".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("ViewableImpression", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    Objects.onNotNull((ParseResult) obj, new Consumer(this.f$1) {
                        public final /* synthetic */ List f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void accept(Object obj) {
                            VerificationParser.lambda$parse$3(Verification.Builder.this, this.f$1, (ParseResult) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void lambda$parse$0(List list, List list2, ParseResult parseResult) {
        list.add((JavaScriptResource) parseResult.value);
        List<ParseError> list3 = parseResult.errors;
        java.util.Objects.requireNonNull(list2);
        Objects.onNotNull(list3, new Consumer(list2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.addAll((List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parse$3(Verification.Builder builder, List list, ParseResult parseResult) {
        builder.setViewableImpression((ViewableImpression) parseResult.value);
        List<ParseError> list2 = parseResult.errors;
        java.util.Objects.requireNonNull(list);
        Objects.onNotNull(list2, new Consumer(list) {
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
