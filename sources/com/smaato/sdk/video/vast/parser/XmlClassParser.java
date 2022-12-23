package com.smaato.sdk.video.vast.parser;

public interface XmlClassParser<Result> {
    ParseResult<Result> parse(RegistryXmlParser registryXmlParser);
}
