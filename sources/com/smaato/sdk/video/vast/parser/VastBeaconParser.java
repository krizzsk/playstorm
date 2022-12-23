package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class VastBeaconParser implements XmlClassParser<VastBeacon> {
    private final String elementName;

    public VastBeaconParser(String str) {
        this.elementName = str;
    }

    public ParseResult<VastBeacon> parse(RegistryXmlParser registryXmlParser) {
        VastBeacon vastBeacon;
        VastBeacon.Builder builder = new VastBeacon.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("id", new Consumer() {
            public final void accept(Object obj) {
                VastBeacon.Builder.this.setId((String) obj);
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
                VastBeacon.Builder.this.setUri((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                VastBeaconParser.this.lambda$parse$0$VastBeaconParser(this.f$1, (Exception) obj);
            }
        });
        try {
            vastBeacon = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom(this.elementName, e));
            vastBeacon = null;
        }
        return new ParseResult.Builder().setResult(vastBeacon).setErrors(arrayList).build();
    }

    public /* synthetic */ void lambda$parse$0$VastBeaconParser(List list, Exception exc) {
        list.add(ParseError.buildFrom(this.elementName, new Exception("Unable to parse UniversalAdId value", exc)));
    }
}
