package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.p390fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Delivery;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class MediaFileParser implements XmlClassParser<MediaFile> {
    private static final CheckedFunction<String, Delivery> deliveryParsingFunction = $$Lambda$MediaFileParser$wcor_tnvWD343fJpUAvMfatYI.INSTANCE;

    static /* synthetic */ void lambda$parse$1(ParseError parseError) {
    }

    static /* synthetic */ void lambda$parse$2(ParseError parseError) {
    }

    static /* synthetic */ Delivery lambda$static$0(String str) throws Exception {
        return (Delivery) Objects.requireNonNull(Delivery.parse(str));
    }

    public ParseResult<MediaFile> parse(RegistryXmlParser registryXmlParser) {
        MediaFile mediaFile;
        MediaFile.Builder builder = new MediaFile.Builder();
        ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("id", new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setId((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute("type", new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setType((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute("width", new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setWidth((Float) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseFloatAttribute("height", new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setHeight((Float) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute(MediaFile.CODEC, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setCodec((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseIntegerAttribute(MediaFile.BITRATE, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setBitrate((Integer) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseIntegerAttribute(MediaFile.MIN_BITRATE, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setMinBitrate((Integer) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseIntegerAttribute(MediaFile.MAX_BITRATE, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setMaxBitrate((Integer) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseBooleanAttribute(MediaFile.SCALABLE, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setScalable((Boolean) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseBooleanAttribute(MediaFile.MAINTAIN_ASPECT_RATIO, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setMaintainAspectRatio((Boolean) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseStringAttribute("apiFramework", new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setApiFramework((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseIntegerAttribute(MediaFile.FILE_SIZE, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setFileSize((Integer) obj);
            }
        }, $$Lambda$MediaFileParser$0wHhvUFZ2TG4Q6EWfBe6qEKpiU.INSTANCE).parseStringAttribute(MediaFile.MEDIA_TYPE, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setMediaType((String) obj);
            }
        }, $$Lambda$MediaFileParser$Eq4VVilki8ZQn7r7brqvRZVAlIE.INSTANCE).parseTypedAttribute(MediaFile.DELIVERY, deliveryParsingFunction, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setDelivery((Delivery) obj);
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
                MediaFile.Builder.this.setUrl((String) obj);
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
            mediaFile = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom(MediaFile.NAME, e));
            mediaFile = null;
        }
        return new ParseResult.Builder().setResult(mediaFile).setErrors(arrayList).build();
    }
}
