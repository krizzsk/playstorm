package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class TrackingParser implements XmlClassParser<Tracking> {
    private static final CheckedFunction<String, VastEvent> eventParsingFunction = $$Lambda$TrackingParser$XPwJqWoyk8Z_shTQPxzCqgdyC60.INSTANCE;

    static /* synthetic */ VastEvent lambda$static$0(String str) throws Exception {
        return (VastEvent) Objects.requireNonNull(VastEvent.parse(str));
    }

    public ParseResult<Tracking> parse(RegistryXmlParser registryXmlParser) {
        Tracking tracking;
        Tracking.Builder builder = new Tracking.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseTypedAttribute("event", eventParsingFunction, new Consumer() {
            public final void accept(Object obj) {
                Tracking.Builder.this.setVastEvent((VastEvent) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute("offset", new Consumer() {
            public final void accept(Object obj) {
                Tracking.Builder.this.setOffset((String) obj);
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
                Tracking.Builder.this.setUrl((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("url", new Exception("Unable to parse URL value", (Exception) obj)));
            }
        });
        try {
            tracking = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom(Tracking.NAME, e));
            tracking = null;
        }
        return new ParseResult.Builder().setResult(tracking).setErrors(arrayList).build();
    }
}
