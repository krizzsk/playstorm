package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.utils.s */
public class C2089s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2092v f4094a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Stack<C2091a> f4095b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public StringBuilder f4096c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f4097d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2091a f4098e;

    /* renamed from: com.applovin.impl.sdk.utils.s$a */
    private static class C2091a extends C2088r {
        C2091a(String str, Map<String, String> map, C2088r rVar) {
            super(str, map, rVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14785a(C2088r rVar) {
            if (rVar != null) {
                this.f4090c.add(rVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo14786d(String str) {
            this.f4089b = str;
        }
    }

    C2089s(C1959m mVar) {
        if (mVar != null) {
            this.f4094a = mVar.mo14286A();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* renamed from: a */
    public static C2088r m5032a(String str, C1959m mVar) throws SAXException {
        return new C2089s(mVar).mo14773a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m5036a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        HashMap hashMap = new HashMap(length);
        for (int i = 0; i < length; i++) {
            hashMap.put(attributes.getQName(i), attributes.getValue(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public C2088r mo14773a(String str) throws SAXException {
        if (str != null) {
            this.f4096c = new StringBuilder();
            this.f4095b = new Stack<>();
            this.f4098e = null;
            Xml.parse(str, new ContentHandler() {
                public void characters(char[] cArr, int i, int i2) {
                    String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                    if (StringUtils.isValidString(trim)) {
                        C2089s.this.f4096c.append(trim);
                    }
                }

                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - C2089s.this.f4097d;
                    if (C2092v.m5047a()) {
                        C2092v a = C2089s.this.f4094a;
                        a.mo14789b("XmlParser", "Finished parsing in " + seconds + " seconds");
                    }
                }

                public void endElement(String str, String str2, String str3) {
                    C2089s sVar = C2089s.this;
                    C2091a unused = sVar.f4098e = (C2091a) sVar.f4095b.pop();
                    C2089s.this.f4098e.mo14786d(C2089s.this.f4096c.toString().trim());
                    C2089s.this.f4096c.setLength(0);
                }

                public void endPrefixMapping(String str) {
                }

                public void ignorableWhitespace(char[] cArr, int i, int i2) {
                }

                public void processingInstruction(String str, String str2) {
                }

                public void setDocumentLocator(Locator locator) {
                }

                public void skippedEntity(String str) {
                }

                public void startDocument() {
                    if (C2092v.m5047a()) {
                        C2089s.this.f4094a.mo14789b("XmlParser", "Begin parsing...");
                    }
                    long unused = C2089s.this.f4097d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
                    C2091a aVar = null;
                    try {
                        if (!C2089s.this.f4095b.isEmpty()) {
                            aVar = (C2091a) C2089s.this.f4095b.peek();
                        }
                        C2091a aVar2 = new C2091a(str2, C2089s.this.m5036a(attributes), aVar);
                        if (aVar != null) {
                            aVar.mo14785a(aVar2);
                        }
                        C2089s.this.f4095b.push(aVar2);
                    } catch (Exception e) {
                        if (C2092v.m5047a()) {
                            C2092v a = C2089s.this.f4094a;
                            a.mo14790b("XmlParser", "Unable to process element <" + str2 + ">", e);
                        }
                        throw new SAXException("Failed to start element", e);
                    }
                }

                public void startPrefixMapping(String str, String str2) {
                }
            });
            C2091a aVar = this.f4098e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
