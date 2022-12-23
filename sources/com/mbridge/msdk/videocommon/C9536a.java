package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.videocommon.a */
/* compiled from: TemplateWebviewCache */
public final class C9536a {

    /* renamed from: a */
    private static ConcurrentHashMap<String, C9537a> f23369a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, C9537a> f23370b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, C9537a> f23371c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static ConcurrentHashMap<String, C9537a> f23372d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static ConcurrentHashMap<String, C9537a> f23373e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static ConcurrentHashMap<String, C9537a> f23374f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static ConcurrentHashMap<String, C9537a> f23375g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static ConcurrentHashMap<String, C9537a> f23376h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static ConcurrentHashMap<String, C9537a> f23377i = new ConcurrentHashMap<>();

    /* renamed from: j */
    private static ConcurrentHashMap<String, C9537a> f23378j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a */
    /* compiled from: TemplateWebviewCache */
    public static class C9537a {

        /* renamed from: a */
        private WindVaneWebView f23379a;

        /* renamed from: b */
        private boolean f23380b;

        /* renamed from: a */
        public final WindVaneWebView mo63070a() {
            return this.f23379a;
        }

        /* renamed from: a */
        public final void mo63071a(WindVaneWebView windVaneWebView) {
            this.f23379a = windVaneWebView;
        }

        /* renamed from: a */
        public final void mo63072a(String str) {
            WindVaneWebView windVaneWebView = this.f23379a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        /* renamed from: b */
        public final String mo63074b() {
            WindVaneWebView windVaneWebView = this.f23379a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        /* renamed from: c */
        public final boolean mo63075c() {
            return this.f23380b;
        }

        /* renamed from: a */
        public final void mo63073a(boolean z) {
            this.f23380b = z;
        }
    }

    /* renamed from: a */
    public static C9537a m27222a(String str) {
        if (f23375g.containsKey(str)) {
            return f23375g.get(str);
        }
        if (f23376h.containsKey(str)) {
            return f23376h.get(str);
        }
        if (f23377i.containsKey(str)) {
            return f23377i.get(str);
        }
        if (f23378j.containsKey(str)) {
            return f23378j.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m27225a(String str, C9537a aVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                f23376h.put(str, aVar);
            } else {
                f23375g.put(str, aVar);
            }
        } else if (z2) {
            f23378j.put(str, aVar);
        } else {
            f23377i.put(str, aVar);
        }
    }

    /* renamed from: b */
    public static void m27228b(String str) {
        if (f23375g.containsKey(str)) {
            f23375g.remove(str);
        }
        if (f23377i.containsKey(str)) {
            f23377i.remove(str);
        }
        if (f23376h.containsKey(str)) {
            f23376h.remove(str);
        }
        if (f23378j.containsKey(str)) {
            f23378j.remove(str);
        }
    }

    /* renamed from: c */
    public static void m27229c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String next : f23375g.keySet()) {
                if (!TextUtils.isEmpty(next) && next.startsWith(str)) {
                    f23375g.remove(next);
                }
            }
        } else {
            f23375g.clear();
        }
        f23376h.clear();
    }

    /* renamed from: a */
    public static void m27223a() {
        f23377i.clear();
        f23378j.clear();
    }

    /* renamed from: d */
    public static void m27230d(String str) {
        for (Map.Entry next : f23375g.entrySet()) {
            if (((String) next.getKey()).contains(str)) {
                f23375g.remove(next.getKey());
            }
        }
    }

    /* renamed from: e */
    public static void m27231e(String str) {
        for (Map.Entry next : f23376h.entrySet()) {
            if (((String) next.getKey()).contains(str)) {
                f23376h.remove(next.getKey());
            }
        }
    }

    /* renamed from: a */
    public static C9537a m27221a(int i, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i != 94) {
                if (i != 287) {
                    if (i != 288) {
                        if (f23369a != null && f23369a.size() > 0) {
                            return f23369a.get(requestIdNotice);
                        }
                    } else if (f23372d != null && f23372d.size() > 0) {
                        return f23372d.get(requestIdNotice);
                    }
                } else if (campaignEx.isBidCampaign()) {
                    if (f23371c != null && f23371c.size() > 0) {
                        return f23371c.get(requestIdNotice);
                    }
                } else if (f23374f != null && f23374f.size() > 0) {
                    return f23374f.get(requestIdNotice);
                }
            } else if (campaignEx.isBidCampaign()) {
                if (f23370b != null && f23370b.size() > 0) {
                    return f23370b.get(requestIdNotice);
                }
            } else if (f23373e != null && f23373e.size() > 0) {
                return f23373e.get(requestIdNotice);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m27226b(int i, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                String requestIdNotice = campaignEx.getRequestIdNotice();
                if (i == 288) {
                    requestIdNotice = campaignEx.getKeyIaUrl();
                }
                if (i != 94) {
                    if (i != 287) {
                        if (i != 288) {
                            if (f23369a != null) {
                                f23369a.remove(requestIdNotice);
                            }
                        } else if (f23372d != null) {
                            f23372d.remove(requestIdNotice);
                        }
                    } else if (campaignEx.isBidCampaign()) {
                        if (f23371c != null) {
                            f23371c.remove(requestIdNotice);
                        }
                    } else if (f23374f != null) {
                        f23374f.remove(requestIdNotice);
                    }
                } else if (campaignEx.isBidCampaign()) {
                    if (f23370b != null) {
                        f23370b.remove(requestIdNotice);
                    }
                } else if (f23373e != null) {
                    f23373e.remove(requestIdNotice);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m27224a(int i, String str, C9537a aVar) {
        if (i == 94) {
            if (f23370b == null) {
                f23370b = new ConcurrentHashMap<>();
            }
            f23370b.put(str, aVar);
        } else if (i == 287) {
            try {
                if (f23371c == null) {
                    f23371c = new ConcurrentHashMap<>();
                }
                f23371c.put(str, aVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m27227b(int i, String str, C9537a aVar) {
        if (i == 94) {
            if (f23373e == null) {
                f23373e = new ConcurrentHashMap<>();
            }
            f23373e.put(str, aVar);
        } else if (i == 287) {
            if (f23374f == null) {
                f23374f = new ConcurrentHashMap<>();
            }
            f23374f.put(str, aVar);
        } else if (i != 288) {
            try {
                if (f23369a == null) {
                    f23369a = new ConcurrentHashMap<>();
                }
                f23369a.put(str, aVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        } else {
            if (f23372d == null) {
                f23372d = new ConcurrentHashMap<>();
            }
            f23372d.put(str, aVar);
        }
    }
}
