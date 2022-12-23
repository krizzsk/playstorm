package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

public class VastResponseParser {
    private final RegistryXmlParser xmlPullParser;

    public VastResponseParser(RegistryXmlParser registryXmlParser) {
        this.xmlPullParser = (RegistryXmlParser) Objects.requireNonNull(registryXmlParser, "Parameter xmlPullParser cannot be null for VastResponseParser::new");
    }

    public void parseVastResponse(Logger logger, InputStream inputStream, String str, NonNullConsumer<ParseResult<VastTree>> nonNullConsumer) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(nonNullConsumer);
        try {
            this.xmlPullParser.prepare(inputStream, str).parseClass(VastTree.VAST, nonNullConsumer);
        } catch (IOException | XmlPullParserException e) {
            nonNullConsumer.accept(ParseResult.error(VastTree.VAST, e));
        }
    }
}
