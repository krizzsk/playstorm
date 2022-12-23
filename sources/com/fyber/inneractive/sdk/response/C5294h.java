package com.fyber.inneractive.sdk.response;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.C5335g0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.fyber.inneractive.sdk.response.h */
public class C5294h {

    /* renamed from: a */
    public boolean f14099a = false;

    /* renamed from: b */
    public String f14100b;

    public C5294h(String str) throws Exception {
        try {
            mo26394a(str);
            this.f14099a = true;
            IAlog.m16699a("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.m16700b("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo26394a(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        IAlog.m16699a("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, (String) null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                int i = 1;
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, (String) null, "tns:Ad");
                    IAlog.m16699a("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.m16703e("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.m16702d("Ad content: %s", trim);
                    if (trim == null) {
                        str3 = null;
                    } else {
                        str3 = C5335g0.f14190f.mo26450a(trim);
                    }
                    this.f14100b = str3;
                } else if (newPullParser.getEventType() == 2) {
                    while (i != 0) {
                        int next = newPullParser.next();
                        if (next == 2) {
                            i++;
                        } else if (next == 3) {
                            i--;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
