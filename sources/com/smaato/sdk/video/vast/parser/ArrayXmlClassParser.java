package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayXmlClassParser<Result> implements XmlClassParser<List<Result>> {
    private final String arrayName;
    private final String elementName;

    public ArrayXmlClassParser(String str, String str2) {
        this.arrayName = str;
        this.elementName = str2;
    }

    public ParseResult<List<Result>> parse(RegistryXmlParser registryXmlParser) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        registryXmlParser.parseTags(new String[]{this.elementName}, new Consumer(registryXmlParser, arrayList, arrayList2) {
            public final /* synthetic */ RegistryXmlParser f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ List f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                ArrayXmlClassParser.this.lambda$parse$1$ArrayXmlClassParser(this.f$1, this.f$2, this.f$3, (String) obj);
            }
        }, new Consumer(arrayList2) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ArrayXmlClassParser.this.lambda$parse$2$ArrayXmlClassParser(this.f$1, (Exception) obj);
            }
        });
        return new ParseResult.Builder().setResult(arrayList).setErrors(arrayList2).build();
    }

    public /* synthetic */ void lambda$parse$1$ArrayXmlClassParser(RegistryXmlParser registryXmlParser, List list, List list2, String str) {
        registryXmlParser.parseClass(this.elementName, new NonNullConsumer(list, list2) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ArrayXmlClassParser.lambda$parse$0(this.f$0, this.f$1, (ParseResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parse$0(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull(result, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(obj);
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

    public /* synthetic */ void lambda$parse$2$ArrayXmlClassParser(List list, Exception exc) {
        String str = this.arrayName;
        list.add(ParseError.buildFrom(str, new Exception("Unable to parse " + this.elementName + " elements in " + this.arrayName, exc)));
    }
}
