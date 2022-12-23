package com.mbridge.msdk.interstitial.signalcommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.interstitial.p317b.C8633a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.interstitial.signalcommon.interstitial */
public class C8642interstitial extends AbsFeedBackForH5 {

    /* renamed from: d */
    private static final String f20918d = C8642interstitial.class.getName();

    /* renamed from: e */
    private Object f20919e;

    public void getInfo(Object obj, String str) {
        MBInterstitialActivity mBInterstitialActivity;
        try {
            this.f20919e = obj;
            if (this.f21468a == null) {
                m25055a();
                return;
            }
            int a = m25051a(this.f21468a);
            if (TextUtils.isEmpty(m25056b())) {
                m25055a();
            } else if (a == 1) {
                try {
                    if (this.f21468a != null) {
                        if (m25051a(this.f21468a) == 1) {
                            try {
                                MBInterstitialActivity mBInterstitialActivity2 = (MBInterstitialActivity) this.f21468a;
                                if (mBInterstitialActivity2 != null) {
                                    mBInterstitialActivity2.hideLoading();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e2) {
                    try {
                        e2.printStackTrace();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        m25055a();
                        return;
                    }
                }
                try {
                    if (this.f21468a != null) {
                        if (m25051a(this.f21468a) == 1 && (mBInterstitialActivity = (MBInterstitialActivity) this.f21468a) != null) {
                            mBInterstitialActivity.showWebView();
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (this.f21468a == null) {
                    m25055a();
                } else if (m25051a(this.f21468a) != 1) {
                    m25055a();
                } else {
                    if (this.f21468a instanceof MBInterstitialActivity) {
                        ((MBInterstitialActivity) this.f21468a).mIsMBPage = true;
                    }
                    final String b = m25056b();
                    if (TextUtils.isEmpty(b)) {
                        m25055a();
                        return;
                    }
                    final List<CampaignEx> a2 = m25054a(b);
                    if (a2 != null) {
                        String a3 = m25053a(a2);
                        if (TextUtils.isEmpty(a3)) {
                            m25055a();
                            return;
                        }
                        C8824g.m25670a().mo58311a(obj, a3);
                        try {
                            if (!TextUtils.isEmpty(b)) {
                                if (a2 != null) {
                                    if (a2.size() != 0) {
                                        for (int i = 0; i < a2.size(); i++) {
                                            CampaignEx campaignEx = a2.get(i);
                                            if (campaignEx != null) {
                                                C8417d.m24308a(b, campaignEx, "interstitial");
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        try {
                            if (!TextUtils.isEmpty(b)) {
                                if (a2 != null) {
                                    if (a2.size() != 0) {
                                        new Thread(new Runnable() {
                                            public final void run() {
                                                for (int i = 0; i < a2.size(); i++) {
                                                    CampaignEx campaignEx = (CampaignEx) a2.get(i);
                                                    if (campaignEx != null) {
                                                        C2379j.m5740a((C2374f) C2376g.m5723a(C8642interstitial.this.f21468a)).mo15910b(campaignEx.getId());
                                                    }
                                                }
                                            }
                                        }).start();
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        try {
                            new Thread(new Runnable() {
                                public final void run() {
                                    C8633a a = C8633a.m25004a();
                                    if (a != null) {
                                        a.mo57838a((List<CampaignEx>) a2, b);
                                    }
                                }
                            }).start();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                    } else {
                        m25055a();
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            m25055a();
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f21468a != null && (this.f21468a instanceof MBInterstitialActivity)) {
                ((MBInterstitialActivity) this.f21468a).clickTracking();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openURL(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    C2309b.m5447a(this.f21468a, optString);
                } else if (optInt == 2) {
                    C2309b.m5449b(this.f21468a, optString);
                }
            } catch (JSONException e) {
                C8608u.m24884d(f20918d, e.getMessage());
            } catch (Throwable th) {
                C8608u.m24884d(f20918d, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m25055a() {
        try {
            C8824g.m25670a().mo58311a(this.f20919e, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private List<CampaignEx> m25054a(String str) {
        try {
            if (TextUtils.isEmpty(str) || C8633a.m25004a() == null) {
                return null;
            }
            return C8633a.m25004a().mo57835a(str, 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private String m25053a(List<CampaignEx> list) {
        if (list == null) {
            return "";
        }
        try {
            if (list.size() <= 0) {
                return "";
            }
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", parseCamplistToJson);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public List<String> getExcludeIdList(String str) {
        ArrayList arrayList;
        Exception e;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String optString = new JSONObject(str).optString(C8494d.f20562c);
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(optString);
            if (jSONArray.length() <= 0) {
                return null;
            }
            arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    private int m25051a(Context context) {
        return (context == null || !(context instanceof MBInterstitialActivity)) ? -1 : 1;
    }

    /* renamed from: b */
    private String m25056b() {
        MBInterstitialActivity mBInterstitialActivity;
        try {
            if (this.f21468a != null && m25051a(this.f21468a) == 1) {
                try {
                    if (!(this.f21468a == null || !(this.f21468a instanceof MBInterstitialActivity) || (mBInterstitialActivity = (MBInterstitialActivity) this.f21468a) == null)) {
                        return mBInterstitialActivity.mUnitid;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }
}
