package com.tapjoy;

import com.tapjoy.internal.C11434at;
import com.tapjoy.internal.C11693gv;
import com.tapjoy.internal.C11694gw;
import com.tapjoy.internal.C11696gy;
import com.tapjoy.internal.C11714hj;
import com.tapjoy.internal.C11716hk;

public class FiveRocksIntegration {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C11434at<String, TJPlacement> f27189a = new C11434at<>();

    public static void addPlacementCallback(String str, TJPlacement tJPlacement) {
        synchronized (f27189a) {
            f27189a.put(str, tJPlacement);
        }
    }

    /* renamed from: a */
    public static void m32992a() {
        C11714hj a = C11714hj.m33999a();
        if (!a.f28482c) {
            a.f28482c = true;
        }
        C113381 r0 = new C11696gy() {
            /* renamed from: a */
            public final void mo71656a(String str) {
            }

            /* renamed from: d */
            public final void mo71661d(String str) {
            }

            /* renamed from: b */
            public final void mo71659b(String str) {
                TJPlacement tJPlacement;
                synchronized (FiveRocksIntegration.f27189a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f27189a.get(str);
                }
                if (tJPlacement != null && tJPlacement.f27410a != null) {
                    tJPlacement.f27410a.onContentReady(tJPlacement);
                }
            }

            /* renamed from: c */
            public final void mo71660c(String str) {
                TJPlacement tJPlacement;
                synchronized (FiveRocksIntegration.f27189a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f27189a.get(str);
                }
                if (tJPlacement != null && tJPlacement.f27410a != null) {
                    tJPlacement.f27410a.onContentShow(tJPlacement);
                }
            }

            /* renamed from: a */
            public final void mo71657a(String str, C11693gv gvVar) {
                if (gvVar != null) {
                    gvVar.mo72583a(m32994e(str));
                }
            }

            /* renamed from: a */
            public final void mo71658a(String str, String str2, C11693gv gvVar) {
                TJPlacement tJPlacement;
                if (gvVar != null) {
                    gvVar.mo72583a(m32994e(str));
                }
                synchronized (FiveRocksIntegration.f27189a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f27189a.get(str);
                }
                if (tJPlacement != null) {
                    TapjoyConnectCore.viewDidClose(str2);
                    if (tJPlacement.f27410a != null) {
                        tJPlacement.f27410a.onContentDismiss(tJPlacement);
                    }
                }
            }

            /* renamed from: e */
            private C11694gw m32994e(final String str) {
                return new C11694gw() {
                    /* renamed from: a */
                    public final void mo71662a(final String str, String str2) {
                        TJPlacement tJPlacement;
                        synchronized (FiveRocksIntegration.f27189a) {
                            tJPlacement = (TJPlacement) FiveRocksIntegration.f27189a.get(str);
                        }
                        if (tJPlacement != null && tJPlacement.f27410a != null) {
                            tJPlacement.f27410a.onPurchaseRequest(tJPlacement, new TJActionRequest() {
                                public final void cancelled() {
                                }

                                public final void completed() {
                                }

                                public final String getToken() {
                                    return null;
                                }

                                public final String getRequestId() {
                                    return str;
                                }
                            }, str2);
                        }
                    }

                    /* renamed from: a */
                    public final void mo71663a(final String str, String str2, int i, final String str3) {
                        TJPlacement tJPlacement;
                        synchronized (FiveRocksIntegration.f27189a) {
                            tJPlacement = (TJPlacement) FiveRocksIntegration.f27189a.get(str);
                        }
                        if (tJPlacement != null && tJPlacement.f27410a != null) {
                            tJPlacement.f27410a.onRewardRequest(tJPlacement, new TJActionRequest() {
                                public final void cancelled() {
                                }

                                public final void completed() {
                                }

                                public final String getRequestId() {
                                    return str;
                                }

                                public final String getToken() {
                                    return str3;
                                }
                            }, str2, i);
                        }
                    }
                };
            }
        };
        C11714hj.m33999a().f28494o = C11716hk.m34031a((C11696gy) r0);
    }
}
