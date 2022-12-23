package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.JavaScriptResource;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class JavaScriptResourceParser implements XmlClassParser<JavaScriptResource> {
    public ParseResult<JavaScriptResource> parse(RegistryXmlParser registryXmlParser) {
        JavaScriptResource javaScriptResource;
        JavaScriptResource.Builder builder = new JavaScriptResource.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("apiFramework", new Consumer() {
            public final void accept(Object obj) {
                JavaScriptResource.Builder.this.setApiFramework((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute(JavaScriptResource.BROWSER_OPTIONAL, new Consumer() {
            public final void accept(Object obj) {
                JavaScriptResource.Builder.this.setBrowserOptional((String) obj);
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
                JavaScriptResource.Builder.this.setUri((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("uri", new Exception("Unable to parse URI value", (Exception) obj)));
            }
        });
        try {
            javaScriptResource = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("JavaScriptResource", e));
            javaScriptResource = null;
        }
        return new ParseResult.Builder().setResult(javaScriptResource).setErrors(arrayList).build();
    }
}
