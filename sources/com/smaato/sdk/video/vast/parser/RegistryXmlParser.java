package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Predicate;
import com.smaato.sdk.video.p390fi.CheckedFunction;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class RegistryXmlParser {
    private static final CheckedFunction<String, Boolean> booleanAttributeConvertion = $$Lambda$RegistryXmlParser$zohLPw0ZkxUd2pR7SJOIU8Uz0Tk.INSTANCE;
    private final Map<String, XmlClassParser> parsers;
    private final XmlPullParser xmlPullParser;

    static /* synthetic */ String lambda$parseStringAttribute$1(String str) throws Exception {
        return str;
    }

    static /* synthetic */ Boolean lambda$static$0(String str) throws Exception {
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        throw new ParsingCoverterException("Cannot convert: \"" + str + "\" to boolean");
    }

    public RegistryXmlParser(XmlPullParser xmlPullParser2, Map<String, XmlClassParser> map) {
        this.xmlPullParser = (XmlPullParser) Objects.requireNonNull(xmlPullParser2);
        this.parsers = (Map) Objects.requireNonNull(map);
    }

    private static boolean containsIn(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str)) {
            List asList = Arrays.asList(strArr);
            java.util.Objects.requireNonNull(str);
            if (Lists.any(asList, new Predicate(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final boolean test(Object obj) {
                    return this.f$0.equalsIgnoreCase((String) obj);
                }
            })) {
                return true;
            }
        }
        return false;
    }

    public <T> void registerParser(String str, XmlClassParser<T> xmlClassParser) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(xmlClassParser);
        this.parsers.put(str, xmlClassParser);
    }

    public RegistryXmlParser prepare(InputStream inputStream, String str) throws XmlPullParserException, IOException {
        Objects.requireNonNull(inputStream);
        if (TextUtils.isEmpty(str) || !XmlEncodingUtils.isSupported(str)) {
            str = null;
        }
        this.xmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        this.xmlPullParser.setInput(inputStream, str);
        this.xmlPullParser.nextTag();
        return this;
    }

    public <Result> RegistryXmlParser parseClass(String str, NonNullConsumer<ParseResult<Result>> nonNullConsumer) {
        Objects.requireNonNull(str);
        XmlClassParser xmlClassParser = this.parsers.get(str);
        if (xmlClassParser == null) {
            try {
                nonNullConsumer.accept(ParseResult.error(str, new NullPointerException("XmlClassParser for " + str + " is not found")));
                skip();
            } catch (Exception e) {
                nonNullConsumer.accept(ParseResult.error(str, new Exception("Exception while parsing " + str, e)));
            }
        } else {
            acceptOrSkip(nonNullConsumer, xmlClassParser.parse(this));
        }
        return this;
    }

    public RegistryXmlParser parseString(Consumer<String> consumer, Consumer<Exception> consumer2) {
        try {
            String str = null;
            if (this.xmlPullParser.next() == 4) {
                String text = this.xmlPullParser.getText();
                if (text != null) {
                    str = text.trim();
                }
                this.xmlPullParser.nextTag();
            }
            consumer.accept(str);
        } catch (IOException | XmlPullParserException e) {
            consumer2.accept(e);
        }
        return this;
    }

    public RegistryXmlParser parseTags(String[] strArr, Consumer<String> consumer, Consumer<Exception> consumer2) {
        while (this.xmlPullParser.next() != 3) {
            try {
                if (this.xmlPullParser.getEventType() == 1) {
                    throw new XmlPullParserException("XML END tag is missing");
                } else if (this.xmlPullParser.getEventType() == 2) {
                    String name = this.xmlPullParser.getName();
                    if (containsIn(name, strArr)) {
                        consumer.accept(name);
                    } else {
                        skip();
                    }
                }
            } catch (IOException | XmlPullParserException e) {
                consumer2.accept(e);
            }
        }
        return this;
    }

    public RegistryXmlParser parseStringAttribute(String str, Consumer<String> consumer, Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, $$Lambda$RegistryXmlParser$4HYpxCXvQiUD_ePXqNNisF_8_8.INSTANCE, consumer, consumer2);
    }

    public RegistryXmlParser parseIntegerAttribute(String str, Consumer<Integer> consumer, Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, $$Lambda$RegistryXmlParser$w51Zp_69959r4X7gW8sqVJrQeyw.INSTANCE, consumer, consumer2);
    }

    public RegistryXmlParser parseFloatAttribute(String str, Consumer<Float> consumer, Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, $$Lambda$RegistryXmlParser$VA7eYkcpUA3vg8kEUKJ1BhdK_b0.INSTANCE, consumer, consumer2);
    }

    public RegistryXmlParser parseBooleanAttribute(String str, Consumer<Boolean> consumer, Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, booleanAttributeConvertion, consumer, consumer2);
    }

    public <Result> RegistryXmlParser parseTypedAttribute(String str, CheckedFunction<String, Result> checkedFunction, Consumer<Result> consumer, Consumer<ParseError> consumer2) {
        int attributeCount = this.xmlPullParser.getAttributeCount();
        String str2 = null;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = this.xmlPullParser.getAttributeName(i);
            if (str.equalsIgnoreCase(attributeName)) {
                str2 = this.xmlPullParser.getAttributeValue((String) null, attributeName);
            }
        }
        if (str2 != null) {
            try {
                consumer.accept(checkedFunction.apply(str2));
            } catch (Exception e) {
                Objects.onNotNull(consumer2, new Consumer(str, e) {
                    public final /* synthetic */ String f$0;
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void accept(Object obj) {
                        ((Consumer) obj).accept(ParseError.buildFrom(this.f$0, this.f$1));
                    }
                });
            }
        } else {
            Objects.onNotNull(consumer2, new Consumer(str, "No attribute found for name: " + str) {
                public final /* synthetic */ String f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((Consumer) obj).accept(ParseError.buildFrom(this.f$0, new VastElementMissingException(this.f$1)));
                }
            });
        }
        return this;
    }

    public void skip() throws XmlPullParserException, IOException {
        if (this.xmlPullParser.getEventType() == 2) {
            skipToEndTag();
            return;
        }
        throw new IllegalStateException();
    }

    public void skipToEndTag() throws XmlPullParserException, IOException {
        int i = 1;
        while (i != 0) {
            int next = this.xmlPullParser.next();
            if (next != 1) {
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            } else if (i > 0) {
                throw new XmlPullParserException("XML END tag is missing");
            }
        }
    }

    private <Type> void acceptOrSkip(NonNullConsumer<Type> nonNullConsumer, Type type) throws Exception {
        try {
            nonNullConsumer.accept(type);
        } catch (Exception e) {
            skipToEndTag();
            throw e;
        }
    }
}
