package com.applovin.impl.p025a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C2007h;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.smaato.sdk.video.vast.model.Tracking;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.l */
public class C1417l {

    /* renamed from: a */
    private static final DateFormat f1602a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b */
    private static final Random f1603b = new Random(System.currentTimeMillis());

    /* renamed from: a */
    public static Uri m2426a(String str, long j, Uri uri, C1410f fVar, C1959m mVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(fVar.mo12682a());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", m2429a(j));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", m2428a()).replace("[TIMESTAMP]", m2441b()));
            } catch (Throwable th) {
                if (C2092v.m5047a()) {
                    C2092v A = mVar.mo14286A();
                    A.mo14790b("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                return null;
            }
        } else {
            if (C2092v.m5047a()) {
                mVar.mo14286A().mo14793e("VastUtils", "Unable to replace macros in invalid URL string.");
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C1410f m2427a(C1401a aVar) {
        if (m2442b(aVar) || m2444c(aVar)) {
            return null;
        }
        return C1410f.GENERAL_WRAPPER_ERROR;
    }

    /* renamed from: a */
    private static String m2428a() {
        return Integer.toString(f1603b.nextInt(89999999) + 10000000);
    }

    /* renamed from: a */
    private static String m2429a(long j) {
        if (j <= 0) {
            return "00:00:00.000";
        }
        long hours = TimeUnit.SECONDS.toHours(j);
        long seconds = j % TimeUnit.MINUTES.toSeconds(1);
        return String.format(Locale.US, "%02d:%02d:%02d.000", new Object[]{Long.valueOf(hours), Long.valueOf(TimeUnit.SECONDS.toMinutes(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(seconds)});
    }

    /* renamed from: a */
    public static String m2430a(C1409e eVar) {
        C2088r c;
        if (eVar != null) {
            List<C2088r> b = eVar.mo12675b();
            int size = eVar.mo12675b().size();
            if (size <= 0 || (c = b.get(size - 1).mo14769c("VASTAdTagURI")) == null) {
                return null;
            }
            return c.mo14770c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    /* renamed from: a */
    public static String m2431a(C2088r rVar, String str, String str2) {
        C2088r b = rVar.mo14767b(str);
        if (b != null) {
            String c = b.mo14770c();
            if (StringUtils.isValidString(c)) {
                return c;
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static Set<C1415j> m2432a(C1409e eVar, C1959m mVar) {
        if (eVar == null) {
            return null;
        }
        List<C2088r> b = eVar.mo12675b();
        Set<C1415j> hashSet = new HashSet<>(b.size());
        for (C2088r next : b) {
            C2088r c = next.mo14769c("Wrapper");
            if (c == null) {
                c = next.mo14769c("InLine");
            }
            hashSet = m2433a(hashSet, c != null ? c.mo14766a("Error") : next.mo14766a("Error"), eVar, mVar);
        }
        if (C2092v.m5047a()) {
            C2092v A = mVar.mo14286A();
            A.mo14789b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    /* renamed from: a */
    private static Set<C1415j> m2433a(Set<C1415j> set, List<C2088r> list, C1409e eVar, C1959m mVar) {
        if (list != null) {
            for (C2088r a : list) {
                C1415j a2 = C1415j.m2422a(a, eVar, mVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    public static void m2434a(C1409e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1410f fVar, int i, C1959m mVar) {
        if (mVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
            }
            m2438a(m2432a(eVar, mVar), fVar, mVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    /* renamed from: a */
    public static void m2435a(C2088r rVar, Map<String, Set<C1415j>> map, C1409e eVar, C1959m mVar) {
        List<C2088r> a;
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        } else if (rVar == null) {
            if (C2092v.m5047a()) {
                mVar.mo14286A().mo14793e("VastUtils", "Unable to render event trackers; null node provided");
            }
        } else if (map != null) {
            C2088r b = rVar.mo14767b("TrackingEvents");
            if (b != null && (a = b.mo14766a(Tracking.NAME)) != null) {
                for (C2088r next : a) {
                    String str = next.mo14768b().get("event");
                    if (StringUtils.isValidString(str)) {
                        C1415j a2 = C1415j.m2422a(next, eVar, mVar);
                        if (a2 != null) {
                            Set set = map.get(str);
                            if (set != null) {
                                set.add(a2);
                            } else {
                                HashSet hashSet = new HashSet();
                                hashSet.add(a2);
                                map.put(str, hashSet);
                            }
                        }
                    } else if (C2092v.m5047a()) {
                        C2092v A = mVar.mo14286A();
                        A.mo14793e("VastUtils", "Could not find event for tracking node = " + next);
                    }
                }
            }
        } else if (C2092v.m5047a()) {
            mVar.mo14286A().mo14793e("VastUtils", "Unable to render event trackers; null event trackers provided");
        }
    }

    /* renamed from: a */
    public static void m2436a(List<C2088r> list, Set<C1415j> set, C1409e eVar, C1959m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        } else if (list == null) {
            if (C2092v.m5047a()) {
                mVar.mo14286A().mo14793e("VastUtils", "Unable to render trackers; null nodes provided");
            }
        } else if (set != null) {
            for (C2088r a : list) {
                C1415j a2 = C1415j.m2422a(a, eVar, mVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        } else if (C2092v.m5047a()) {
            mVar.mo14286A().mo14793e("VastUtils", "Unable to render trackers; null trackers provided");
        }
    }

    /* renamed from: a */
    public static void m2437a(Set<C1415j> set, long j, Uri uri, C1410f fVar, C1959m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        } else if (set != null && !set.isEmpty()) {
            for (C1415j b : set) {
                Uri a = m2426a(b.mo12701b(), j, uri, fVar, mVar);
                if (a != null) {
                    mVar.mo14305U().mo14542a(C2007h.m4678o().mo14575c(a.toString()).mo14570a(false).mo14571a(), false);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2438a(Set<C1415j> set, C1410f fVar, C1959m mVar) {
        m2437a(set, -1, (Uri) null, fVar, mVar);
    }

    /* renamed from: a */
    public static void m2439a(Set<C1415j> set, C1959m mVar) {
        m2437a(set, -1, (Uri) null, C1410f.UNSPECIFIED, mVar);
    }

    /* renamed from: a */
    public static boolean m2440a(C2088r rVar) {
        if (rVar != null) {
            return rVar.mo14769c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    /* renamed from: b */
    private static String m2441b() {
        f1602a.setTimeZone(TimeZone.getDefault());
        return f1602a.format(new Date());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = (r1 = r1.mo12638m()).mo12706a();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2442b(com.applovin.impl.p025a.C1401a r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.applovin.impl.a.m r1 = r1.mo12638m()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = r1.mo12706a()
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0017
            r0 = 1
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p025a.C1417l.m2442b(com.applovin.impl.a.a):boolean");
    }

    /* renamed from: b */
    public static boolean m2443b(C2088r rVar) {
        if (rVar != null) {
            return rVar.mo14769c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    /* renamed from: c */
    public static boolean m2444c(C1401a aVar) {
        C1408d aM;
        C1412h b;
        if (aVar == null || (aM = aVar.mo12613aM()) == null || (b = aM.mo12668b()) == null) {
            return false;
        }
        return b.mo12691b() != null || StringUtils.isValidString(b.mo12692c());
    }
}
