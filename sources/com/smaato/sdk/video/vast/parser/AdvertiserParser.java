package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.model.Advertiser;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

class AdvertiserParser implements XmlClassParser<Advertiser> {
    static /* synthetic */ void lambda$parse$0(ParseError parseError) {
    }

    AdvertiserParser() {
    }

    public ParseResult<Advertiser> parse(RegistryXmlParser registryXmlParser) {
        Advertiser.Builder builder = new Advertiser.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("id", new Consumer() {
            public final void accept(Object obj) {
                Advertiser.Builder.this.setId((String) obj);
            }
        }, $$Lambda$AdvertiserParser$42E5NusppAvttCA_A3L4cl2Zrbk.INSTANCE).parseString(new Consumer() {
            public final void accept(Object obj) {
                Advertiser.Builder.this.setName((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("Advertiser", new Exception("Unable to parse Advertiser name value", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
