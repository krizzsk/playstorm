package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class StaticResourceParser implements XmlClassParser<StaticResource> {
    private static final CheckedFunction<String, StaticResource.CreativeType> creativeTypeParsingFunction = $$Lambda$StaticResourceParser$nCENvFf_FUdNzzjUt5yfgvSy7NQ.INSTANCE;

    static /* synthetic */ StaticResource.CreativeType lambda$static$0(String str) throws Exception {
        return (StaticResource.CreativeType) Objects.requireNonNull(StaticResource.CreativeType.parse(str));
    }

    public ParseResult<StaticResource> parse(RegistryXmlParser registryXmlParser) {
        StaticResource staticResource;
        StaticResource.Builder builder = new StaticResource.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseTypedAttribute(StaticResource.CREATIVE_TYPE, creativeTypeParsingFunction, new Consumer() {
            public final void accept(Object obj) {
                StaticResource.Builder.this.setCreativeType((StaticResource.CreativeType) obj);
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
                StaticResource.Builder.this.setUri((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("StaticResource", new Exception("Unable to parse StaticResource uri", (Exception) obj)));
            }
        });
        try {
            staticResource = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("StaticResource", e));
            staticResource = null;
        }
        return new ParseResult.Builder().setResult(staticResource).setErrors(arrayList).build();
    }
}
