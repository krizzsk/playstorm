package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class UniversalAdIdParser implements XmlClassParser<UniversalAdId> {
    public ParseResult<UniversalAdId> parse(RegistryXmlParser registryXmlParser) {
        UniversalAdId.Builder builder = new UniversalAdId.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute(UniversalAdId.ID_REGISTRY, new Consumer() {
            public final void accept(Object obj) {
                UniversalAdId.Builder.this.setIdRegistry((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute(UniversalAdId.ID_VALUE, new Consumer() {
            public final void accept(Object obj) {
                UniversalAdId.Builder.this.setIdValue((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseString(new Consumer() {
            public final void accept(Object obj) {
                UniversalAdId.Builder.this.setValue((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("UniversalAdId", new Exception("Unable to parse UniversalAdId value", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
