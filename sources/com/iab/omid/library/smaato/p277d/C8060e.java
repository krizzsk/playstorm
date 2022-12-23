package com.iab.omid.library.smaato.p277d;

import android.text.TextUtils;
import com.iab.omid.library.smaato.Omid;
import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.adsession.CreativeType;
import com.iab.omid.library.smaato.adsession.ImpressionType;
import com.iab.omid.library.smaato.adsession.Owner;

/* renamed from: com.iab.omid.library.smaato.d.e */
public class C8060e {
    /* renamed from: a */
    public static void m23071a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m23072a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m23073a(C8039a aVar) {
        if (aVar.mo55959f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m23074a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m23075a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m23076a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m23077b(C8039a aVar) {
        if (aVar.mo55960g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m23078c(C8039a aVar) {
        m23083h(aVar);
        m23077b(aVar);
    }

    /* renamed from: d */
    public static void m23079d(C8039a aVar) {
        if (aVar.getAdSessionStatePublisher().mo56056c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m23080e(C8039a aVar) {
        if (aVar.getAdSessionStatePublisher().mo56057d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m23081f(C8039a aVar) {
        if (!aVar.mo55961h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m23082g(C8039a aVar) {
        if (!aVar.mo55962i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m23083h(C8039a aVar) {
        if (!aVar.mo55959f()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
