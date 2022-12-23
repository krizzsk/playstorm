package com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p156j.C3539a;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.InLine;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.b */
/* compiled from: InLineParser */
public class C3542b {
    /* renamed from: a */
    public static C3539a m11076a(Context context, XmlPullParser xmlPullParser, List<C3553c> list, int i, double d) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, C3544d.f8898f, "InLine");
        C3539a aVar = new C3539a();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                aVar.mo19977a().mo20062j(list);
                if (!TextUtils.isEmpty(aVar.mo19993g())) {
                    return aVar;
                }
                return null;
            } else if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                switch (name.hashCode()) {
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -56677412:
                        if (name.equals(InLine.DESCRIPTION)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 501930965:
                        if (name.equals(InLine.AD_TITLE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    aVar.mo19982a(C3544d.m11092b(xmlPullParser, name));
                } else if (c == 1) {
                    aVar.mo19984b(C3544d.m11092b(xmlPullParser, name));
                } else if (c == 2) {
                    list.addAll(C3544d.m11087a(xmlPullParser, name));
                } else if (c == 3) {
                    aVar.mo19977a().mo20044a(C3544d.m11087a(xmlPullParser, name));
                } else if (c != 4) {
                    C3544d.m11088a(xmlPullParser);
                } else if (TextUtils.isEmpty(aVar.mo19993g()) || aVar.mo19985c() == null) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (Creative.NAME.equals(xmlPullParser.getName())) {
                                m11077a(context, xmlPullParser, aVar, i, d);
                            } else {
                                C3544d.m11088a(xmlPullParser);
                            }
                        }
                    }
                } else {
                    C3544d.m11088a(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11077a(Context context, XmlPullParser xmlPullParser, C3539a aVar, int i, double d) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(aVar.mo19993g())) {
                    C3543c.m11081a(xmlPullParser, aVar, i, d);
                } else if (!"CompanionAds".equals(xmlPullParser.getName()) || aVar.mo19985c() != null) {
                    C3544d.m11088a(xmlPullParser);
                } else {
                    aVar.mo19981a(C3541a.m11075a(context, xmlPullParser));
                }
            }
        }
    }
}
