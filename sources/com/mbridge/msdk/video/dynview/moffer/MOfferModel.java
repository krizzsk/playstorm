package com.mbridge.msdk.video.dynview.moffer;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8453b;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p310f.C8482b;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.video.dynview.endcard.adapter.C9266a;
import com.mbridge.msdk.video.dynview.endcard.adapter.MBMoreOfferAdapter;
import com.mbridge.msdk.video.dynview.endcard.cloudview.TagCloudView;
import com.mbridge.msdk.video.dynview.endcard.expose.ExposeMonitor;
import com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener;
import com.mbridge.msdk.video.dynview.p353d.C9259c;
import com.mbridge.msdk.video.dynview.p354e.C9261a;
import com.mbridge.msdk.video.dynview.p356f.C9278a;
import com.mbridge.msdk.video.dynview.p356f.C9281b;
import com.mbridge.msdk.video.dynview.p356f.p357a.C9280a;
import com.mbridge.msdk.video.dynview.p359h.C9288b;
import com.mbridge.msdk.video.dynview.widget.MBridgeRecycleView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class MOfferModel implements NoProGuard {
    private static final String TAG = "MOfferModel";
    private final String AD_NUM = "ad_num";
    private final String API_VERSION = "api_version";
    private final String APP_ID = "app_id";
    private final String CATEGORY = "category";
    private final String COUNTRY_CODE = TapjoyConstants.TJC_DEVICE_COUNTRY_CODE;
    private final String CRT_CID = "crt_cid";
    private final String CRT_RID = "crt_rid";
    private final String DEFAULT_PATH_V3 = "/openapi/ad/v3";
    private final int DO_ACTION_IMPRESSION = 0;
    private final int DO_ACTION_ONLY_IMPRESSION = 1;

    /* renamed from: E */
    private final String f22594E = "e";
    private final String EC_ID = "ec_id";
    private final String H5_T = "h5_t";
    private final String H5_TYPE = "h5_type";
    private final String HTTP_REQ = "http_req";
    private final String IMEI = "imei";
    private final String I_FMD5 = "i_fmd5";

    /* renamed from: K */
    private final String f22595K = CampaignEx.JSON_KEY_AD_K;
    private final String MCC = "mcc";
    private final String MNC = "mnc";
    private final String MOF = "mof";
    private final String MOF_DATA = "mof_data";
    private final String MOF_DOMAIN = "mof_domain";
    private final String MOF_PARENT_ID = "mof_parent_id";
    private final String MOF_T = "mof_t";
    private final String MOF_TEST_UID = "mof_testuid";
    private final String MOF_TYPE = "mof_type";
    private final String MOF_UID = "mof_uid";
    private final String MOF_VER = "mof_ver";
    private final String MORE_OFFER_CLICK = "more offer click";
    private final String MORE_OFFER_DEFAULT_APP_ID = "92762";
    private final String MORE_OFFER_DEFAULT_APP_KEY = "936dcbdd57fe235fd7cf61c2e93da3c4";
    private final String MORE_OFFER_DEFAULT_UNIT_ID = "117361";
    private final String MORE_OFFER_LOAD_FAILED = "more offer load failed";
    private final String MORE_OFFER_LOAD_SUCCESS = "more offer load success";
    private final String MORE_OFFER_SHOW = "more offer show";
    private final String MORE_OFFER_SHOW_FAILED = "more offer show fail";
    private final String OFFER_ID = "offer_id";
    private final String OFF_SET = "offset";
    private final String ONLY_IMPRESSION = "only_impression";
    private final String PARENT_AD_TYPE = "parent_ad_type";
    private final String PARENT_EXCHANGE = "parent_exchange";
    private final String PARENT_ID = "parent_id";
    private final String PARENT_TEMPLATE_ID = "parent_template_id";
    private final String PARENT_UNIT = "parent_unit";
    private final String PING_MODE = "ping_mode";
    private final String RV_TID = "rv_tid";
    private final String R_ID = "r_id";
    private final String SIGN = "sign";
    private final String TNUM = "tnum";
    private final String TP_LGP = "tplgp";
    private final String UC_PARENT_UNIT = "uc_parent_unit";
    private final String UNIT_ID = MBridgeConstans.PROPERTIES_UNIT_ID;
    private final String VALUE_AD_NUM = "20";
    private final String VALUE_API_VERSION = "1.3";
    private final String VALUE_CATEGORY = "0";
    private final String VALUE_COUNTRY_CODE = "CN";
    private final String VALUE_DEFAULT_VIDEO_TEMP_ID = "404";
    private final String VALUE_H5_TYPE = "1";
    private final String VALUE_HTTP_REQ = "2";
    private final String VALUE_MOF = "1";
    private final String VALUE_MOF_TYPE = "1";
    private final String VALUE_MOF_VER = "1";
    private final String VALUE_OFF_SET = "0";
    private final String VALUE_ONLY_IMPRESSION = "1";
    private final String VALUE_PING_MODE = "1";
    private final String VALUE_TNUM = "20";
    private final String V_FMD5 = "v_fmd5";
    /* access modifiers changed from: private */
    public List<Integer> cacheImpressionReportList;
    /* access modifiers changed from: private */
    public List<Integer> cacheOnlyImpressionReportList;
    /* access modifiers changed from: private */
    public ExposeMonitor exposeMonitor;
    /* access modifiers changed from: private */
    public volatile boolean hasReportMoreOfferLoad = false;
    /* access modifiers changed from: private */
    public volatile boolean hasReportMoreOfferShow = false;
    private MBridgeRecycleView mBridgeRecycleView;
    /* access modifiers changed from: private */
    public CampaignUnit mCampaignUnit;
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public C9259c mMoreOfferLayoutListener;
    /* access modifiers changed from: private */
    public C9384a mNotifyListener;
    /* access modifiers changed from: private */
    public MBridgeRelativeLayout viewMofferLayout;
    /* access modifiers changed from: private */
    public C9266a viewTagsAdapter;

    public void setMoreOfferListener(C9259c cVar, C9384a aVar) {
        this.mMoreOfferLayoutListener = cVar;
        if (cVar != null) {
            MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
            if (mBridgeRelativeLayout != null) {
                cVar.mo62391a((ViewGroup) mBridgeRelativeLayout, this.mCampaignUnit);
            } else {
                cVar.mo62390a(-1, "more Offer create fail");
            }
        }
        this.mNotifyListener = aVar;
    }

    public void bulidMofferAd(final CampaignEx campaignEx) {
        String str;
        this.mContext = C2350a.m5601e().mo15792g();
        initView();
        final C8494d dVar = new C8494d();
        buildRequestParams(dVar, campaignEx);
        C9281b bVar = new C9281b(this.mContext);
        C93121 r6 = new C9280a() {
            /* renamed from: a */
            public final void mo62462a(List<C8457b> list, CampaignUnit campaignUnit) {
                try {
                    String str = dVar.mo57607b().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                    String str2 = dVar.mo57607b().get("r_id");
                    if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() < 5) {
                        if (!MOfferModel.this.hasReportMoreOfferLoad) {
                            C9278a.m26607a(campaignEx, C2350a.m5601e().mo15792g(), "more offer load failed errorCode: -999 errorMsg: The campaign quantity less than 5.", str, str2);
                            boolean unused = MOfferModel.this.hasReportMoreOfferLoad = true;
                        }
                        C9320a.m26714a().mo62525b();
                        return;
                    }
                    CampaignUnit unused2 = MOfferModel.this.mCampaignUnit = campaignUnit;
                    if (!MOfferModel.this.hasReportMoreOfferLoad) {
                        C9278a.m26607a(campaignEx, C2350a.m5601e().mo15792g(), "more offer load success", str, str2);
                        boolean unused3 = MOfferModel.this.hasReportMoreOfferLoad = true;
                    }
                    MOfferModel.this.createMoreOfferView(campaignUnit, campaignEx, str, str2);
                } catch (Exception e) {
                    C8608u.m24884d(MOfferModel.TAG, e.getMessage());
                    C9320a.m26714a().mo62525b();
                }
            }

            /* renamed from: a */
            public final void mo62461a(int i, String str) {
                try {
                    String str2 = dVar.mo57607b().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                    String str3 = dVar.mo57607b().get("r_id");
                    if (!MOfferModel.this.hasReportMoreOfferLoad) {
                        CampaignEx campaignEx = campaignEx;
                        Context g = C2350a.m5601e().mo15792g();
                        C9278a.m26607a(campaignEx, g, "more offer load failed errorCode:" + i + "errorMsg:" + str, str2, str3);
                        boolean unused = MOfferModel.this.hasReportMoreOfferLoad = true;
                    }
                    C9320a.m26714a().mo62525b();
                } catch (Exception e) {
                    C8608u.m24884d(MOfferModel.TAG, e.getMessage());
                    C9320a.m26714a().mo62525b();
                }
            }
        };
        C8453b bVar2 = new C8453b(8000, 1);
        String str2 = C8487d.m24492a().f20542l;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getReq_ext_data())) {
            try {
                JSONObject jSONObject = new JSONObject(campaignEx.getReq_ext_data());
                String optString = jSONObject.optString("mof_domain");
                if (!TextUtils.isEmpty(optString)) {
                    str2 = optString + "/openapi/ad/v3";
                }
                String optString2 = jSONObject.optString("parent_id");
                if (!TextUtils.isEmpty(optString2)) {
                    C8482b.m24484a(dVar, "mof_parent_id", optString2);
                }
            } catch (Exception e) {
                C8608u.m24884d(TAG, e.getMessage());
                str = C8487d.m24492a().f20542l;
            }
        }
        str = str2;
        bVar.mo57601a(1, str, dVar, bVar2, r6, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void buildRequestParams(com.mbridge.msdk.foundation.same.net.p311g.C8494d r27, com.mbridge.msdk.foundation.entity.CampaignEx r28) {
        /*
            r26 = this;
            r1 = r27
            java.lang.String r0 = "CN"
            java.lang.String r2 = r28.getCampaignUnitId()
            java.lang.String r3 = r28.getId()
            java.lang.String r4 = r28.getNoticeUrl()
            java.lang.String r5 = "k"
            java.lang.String r4 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r4, r5)
            java.lang.String r5 = r28.getendcard_url()
            java.lang.String r6 = "mof_testuid"
            java.lang.String r5 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r5, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x0030
            java.lang.String r5 = r28.getendcard_url()
            java.lang.String r6 = "mof_uid"
            java.lang.String r5 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r5, r6)
        L_0x0030:
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r6 = r6.mo15793h()
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0055 }
            if (r7 != 0) goto L_0x0055
            com.mbridge.msdk.c.b r7 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x0055 }
            com.mbridge.msdk.c.a r7 = r7.mo15563b(r6)     // Catch:{ Exception -> 0x0055 }
            if (r7 == 0) goto L_0x0055
            com.mbridge.msdk.c.b r7 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x0055 }
            com.mbridge.msdk.c.a r7 = r7.mo15563b(r6)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r7 = r7.mo15487az()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r7 = r0
        L_0x0056:
            java.lang.String r8 = r28.getendcard_url()
            java.lang.String r9 = "mcc"
            java.lang.String r8 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r8, r9)
            java.lang.String r10 = r28.getendcard_url()
            java.lang.String r11 = "mnc"
            java.lang.String r10 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r10, r11)
            java.lang.String r12 = r28.getendcard_url()
            java.lang.String r13 = "rv_tid"
            java.lang.String r12 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r12, r13)
            java.lang.String r14 = r28.getendcard_url()
            java.lang.String r15 = "ec_id"
            java.lang.String r14 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r14, r15)
            r16 = r0
            java.lang.String r0 = r28.getendcard_url()
            r17 = r15
            java.lang.String r15 = "tplgp"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r0, r15)
            r18 = r0
            java.lang.String r0 = r28.getendcard_url()
            r19 = r15
            java.lang.String r15 = "v_fmd5"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r0, r15)
            r20 = r0
            java.lang.String r0 = r28.getendcard_url()
            r21 = r15
            java.lang.String r15 = "i_fmd5"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r0, r15)
            com.mbridge.msdk.foundation.controller.a r22 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            r23 = r0
            java.lang.String r0 = r22.mo15793h()
            r22 = r15
            java.lang.String r15 = "app_id"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r15, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r6 = r6.mo15794i()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r0)
            java.lang.String r6 = "sign"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r6, r0)
            java.lang.String r0 = "r_id"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r4)
            r0 = 1
            r24 = r6
            java.lang.String[] r6 = new java.lang.String[r0]
            r25 = 0
            r6[r25] = r3
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.String r0 = "e"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r6)
            java.lang.String r0 = "mof_type"
            java.lang.String r6 = "1"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r6)
            java.lang.String r0 = "h5_type"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r6)
            java.lang.String r0 = "mof"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x010a
            r0 = r16
            goto L_0x010b
        L_0x010a:
            r0 = r7
        L_0x010b:
            java.lang.String r7 = "country_code"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r7, r0)
            java.lang.String r0 = "mof_ver"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r6)
            java.lang.String r0 = "parent_exchange"
            java.lang.String r7 = ""
            r1.mo57606a(r0, r7)
            int r0 = r28.getAdType()
            r16 = r15
            r15 = 94
            if (r0 == r15) goto L_0x012f
            r15 = 287(0x11f, float:4.02E-43)
            if (r0 == r15) goto L_0x012c
            r0 = r7
            goto L_0x0131
        L_0x012c:
            java.lang.String r0 = "interstitial_video"
            goto L_0x0131
        L_0x012f:
            java.lang.String r0 = "rewarded_video"
        L_0x0131:
            java.lang.String r15 = "parent_ad_type"
            r1.mo57606a(r15, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r15 = "parent_template_id"
            if (r0 != 0) goto L_0x0142
            r1.mo57606a(r15, r14)
            goto L_0x0147
        L_0x0142:
            java.lang.String r0 = "404"
            r1.mo57606a(r15, r0)
        L_0x0147:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = "uc_parent_unit"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r2)
            goto L_0x0158
        L_0x0153:
            java.lang.String r0 = "parent_unit"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r2)
        L_0x0158:
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r11, r10)
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r9, r8)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "crt_cid"
            r2.put(r0, r3)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r0 = "crt_rid"
            r2.put(r0, r4)     // Catch:{ Exception -> 0x0196 }
            r2.put(r13, r12)     // Catch:{ Exception -> 0x0196 }
            r0 = r17
            r2.put(r0, r14)     // Catch:{ Exception -> 0x0196 }
            r0 = r18
            r4 = r19
            r2.put(r4, r0)     // Catch:{ Exception -> 0x0196 }
            r0 = r20
            r4 = r21
            r2.put(r4, r0)     // Catch:{ Exception -> 0x0196 }
            r4 = r22
            r0 = r23
            r2.put(r4, r0)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r0 = "h5_t"
            r4 = 1
            r2.put(r0, r4)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r0 = "mof_t"
            r2.put(r0, r4)     // Catch:{ Exception -> 0x0196 }
            goto L_0x019a
        L_0x0196:
            r0 = move-exception
            r0.printStackTrace()
        L_0x019a:
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "mof_data"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r2, r0)
            java.lang.String r0 = "imei"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r7)
            java.lang.String r0 = "offer_id"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r3)
            java.lang.String r0 = "offset"
            java.lang.String r2 = "0"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r2)
            java.lang.String r0 = "category"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r2)
            java.lang.String r0 = "only_impression"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r6)
            java.lang.String r0 = "ping_mode"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r6)
            java.lang.String r0 = "http_req"
            java.lang.String r2 = "2"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r2)
            java.lang.String r0 = "ad_num"
            java.lang.String r2 = "20"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r2)
            java.lang.String r0 = "tnum"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r2)
            java.lang.String r0 = "api_version"
            java.lang.String r2 = "1.3"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = "92762"
            r2 = r16
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r2, r0)
            java.lang.String r0 = "92762936dcbdd57fe235fd7cf61c2e93da3c4"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r0)
            r2 = r24
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r2, r0)
            java.lang.String r5 = "117361"
        L_0x01f7:
            java.lang.String r0 = "unit_id"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r1, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.moffer.MOfferModel.buildRequestParams(com.mbridge.msdk.foundation.same.net.g.d, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    /* access modifiers changed from: private */
    public void createMoreOfferView(CampaignUnit campaignUnit, final CampaignEx campaignEx, final String str, final String str2) {
        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && this.mContext != null) {
            MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
            if (mBridgeRelativeLayout != null) {
                final CampaignEx campaignEx2 = campaignEx;
                final String str3 = str;
                final String str4 = str2;
                final CampaignUnit campaignUnit2 = campaignUnit;
                mBridgeRelativeLayout.setMoreOfferCacheReportCallBack(new C9323b() {
                    /* renamed from: a */
                    public final void mo62515a() {
                        if (MOfferModel.this.cacheImpressionReportList != null) {
                            for (int i = 0; i < MOfferModel.this.cacheImpressionReportList.size(); i++) {
                                if (!MOfferModel.this.hasReportMoreOfferShow) {
                                    C9278a.m26607a(campaignEx2, MOfferModel.this.mContext, "more offer show", str3, str4);
                                    boolean unused = MOfferModel.this.hasReportMoreOfferShow = true;
                                }
                                C9278a.m26608a(campaignUnit2, ((Integer) MOfferModel.this.cacheImpressionReportList.get(i)).intValue(), 0, "117361");
                            }
                        }
                        if (MOfferModel.this.cacheOnlyImpressionReportList != null) {
                            for (int i2 = 0; i2 < MOfferModel.this.cacheOnlyImpressionReportList.size(); i2++) {
                                C9278a.m26608a(campaignUnit2, ((Integer) MOfferModel.this.cacheOnlyImpressionReportList.get(i2)).intValue(), 1, "117361");
                            }
                        }
                        MOfferModel.this.release();
                    }
                });
                this.viewMofferLayout.setMoreOfferShowFailedCallBack(new C9325d() {
                    /* renamed from: a */
                    public final void mo62516a() {
                        if (!(MOfferModel.this.viewMofferLayout == null || MOfferModel.this.viewMofferLayout.getVisibility() == 0)) {
                            C9278a.m26607a(campaignEx, MOfferModel.this.mContext, "more offer show fail", str, str2);
                        }
                        MOfferModel.this.release();
                        if (MOfferModel.this.exposeMonitor != null) {
                            MOfferModel.this.exposeMonitor.release();
                        }
                    }
                });
            }
            MBridgeRecycleView mBridgeRecycleView2 = (MBridgeRecycleView) this.viewMofferLayout.findViewById(findID("mbridge_reward_end_card_list_rlv"));
            this.mBridgeRecycleView = mBridgeRecycleView2;
            if (mBridgeRecycleView2 != null) {
                buildAdapter(this.mContext, mBridgeRecycleView2, this.viewMofferLayout, campaignEx, campaignUnit, str, str2);
                addLikeTextView(this.mBridgeRecycleView);
            }
        }
    }

    private void buildAdapter(Context context, MBridgeRecycleView mBridgeRecycleView2, MBridgeRelativeLayout mBridgeRelativeLayout, CampaignEx campaignEx, CampaignUnit campaignUnit, String str, String str2) {
        Context context2 = context;
        MBridgeRecycleView mBridgeRecycleView3 = mBridgeRecycleView2;
        if (campaignEx == null || !campaignEx.getCanStartMoreOfferAnim()) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(0);
            mBridgeRecycleView2.setLayoutManager(linearLayoutManager);
        } else {
            C9261a aVar = new C9261a(context);
            aVar.setOrientation(0);
            aVar.mo62392a(campaignEx.getCanStartMoreOfferAnim());
            mBridgeRecycleView2.setLayoutManager(aVar);
            mBridgeRecycleView2.mo62546a((LinearLayoutManager) aVar);
        }
        ExposeMonitor exposeMonitor2 = new ExposeMonitor();
        this.exposeMonitor = exposeMonitor2;
        final MBridgeRelativeLayout mBridgeRelativeLayout2 = mBridgeRelativeLayout;
        final CampaignEx campaignEx2 = campaignEx;
        final String str3 = str;
        final String str4 = str2;
        final CampaignUnit campaignUnit2 = campaignUnit;
        exposeMonitor2.setRecyclerItemExposeListener(mBridgeRecycleView2, new OnItemExposeListener() {
            public final void onItemViewVisible(boolean z, int i) {
                if (mBridgeRelativeLayout2.getVisibility() == 0) {
                    if (!MOfferModel.this.hasReportMoreOfferShow) {
                        C9278a.m26607a(campaignEx2, C2350a.m5601e().mo15792g(), "more offer show", str3, str4);
                        boolean unused = MOfferModel.this.hasReportMoreOfferShow = true;
                    }
                    C9278a.m26608a(campaignUnit2, i, 0, "117361");
                    return;
                }
                if (MOfferModel.this.cacheImpressionReportList == null) {
                    List unused2 = MOfferModel.this.cacheImpressionReportList = new ArrayList();
                }
                if (!MOfferModel.this.cacheImpressionReportList.contains(Integer.valueOf(i))) {
                    MOfferModel.this.cacheImpressionReportList.add(Integer.valueOf(i));
                }
            }

            public final void onItemViewFirstVisible() {
                if (mBridgeRelativeLayout2.getVisibility() == 0) {
                    C9278a.m26608a(campaignUnit2, 0, 1, "117361");
                    return;
                }
                if (MOfferModel.this.cacheOnlyImpressionReportList == null) {
                    List unused = MOfferModel.this.cacheOnlyImpressionReportList = new ArrayList();
                }
                MOfferModel.this.cacheOnlyImpressionReportList.add(0);
            }
        });
        MBMoreOfferAdapter mBMoreOfferAdapter = new MBMoreOfferAdapter();
        final CampaignEx campaignEx3 = campaignEx;
        final MBridgeRecycleView mBridgeRecycleView4 = mBridgeRecycleView2;
        final MBridgeRelativeLayout mBridgeRelativeLayout3 = mBridgeRelativeLayout;
        final String str5 = str;
        final String str6 = str2;
        mBMoreOfferAdapter.setMoreOfferShowCallBack(new C9324c() {
            /* renamed from: a */
            public final void mo62518a(List<View> list) {
                CampaignEx campaignEx = campaignEx3;
                if (campaignEx == null || !campaignEx.getCanStartMoreOfferAnim() || Build.VERSION.SDK_INT < 26) {
                    ((TextView) mBridgeRelativeLayout3.findViewById(MOfferModel.this.findID("mbridge_reward_end_card_like_tv"))).setVisibility(0);
                } else if (MOfferModel.this.mContext != null) {
                    try {
                        TagCloudView tagCloudView = new TagCloudView(MOfferModel.this.mContext);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tagCloudView.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new FrameLayout.LayoutParams(C8613y.m24929b(MOfferModel.this.mContext, 80.0f), C8613y.m24929b(MOfferModel.this.mContext, 80.0f));
                        }
                        layoutParams.width = C8613y.m24929b(MOfferModel.this.mContext, 80.0f);
                        layoutParams.height = C8613y.m24929b(MOfferModel.this.mContext, 80.0f);
                        layoutParams.setMargins(0, 0, 0, C8613y.m24929b(MOfferModel.this.mContext, 8.0f));
                        tagCloudView.setAdapter(MOfferModel.this.viewTagsAdapter);
                        tagCloudView.setScrollSpeed(1.5f);
                        tagCloudView.setOnClickListener(new View.OnClickListener() {
                            public final void onClick(View view) {
                                new C9288b().mo62475a((View) mBridgeRecycleView4, 500);
                            }
                        });
                        new C9288b().mo62479c((View) tagCloudView, 500);
                    } catch (Exception e) {
                        C8608u.m24884d(MOfferModel.TAG, e.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo62517a(String str) {
                CampaignEx campaignEx = campaignEx3;
                Context g = C2350a.m5601e().mo15792g();
                C9278a.m26607a(campaignEx, g, "More Offer show fail : " + str, str5, str6);
                if (MOfferModel.this.mMoreOfferLayoutListener != null) {
                    MOfferModel.this.mMoreOfferLayoutListener.mo62390a(-1, "error");
                }
                C9320a.m26714a().mo62525b();
            }
        });
        mBMoreOfferAdapter.setMoreOfferData(campaignUnit.getAds());
        if (campaignEx != null) {
            mBMoreOfferAdapter.setRewardEndCardurl(campaignEx.getendcard_url());
        }
        mBridgeRecycleView2.setAdapter(mBMoreOfferAdapter);
        mBridgeRecycleView2.smoothScrollBy(1, 0);
        final CampaignUnit campaignUnit3 = campaignUnit;
        final CampaignEx campaignEx4 = campaignEx;
        final String str7 = str;
        final String str8 = str2;
        mBMoreOfferAdapter.setOnItemClickListener(new MBMoreOfferAdapter.C9264a() {
            /* renamed from: a */
            public final void mo62399a(int i) {
                CampaignEx campaignEx;
                CampaignUnit campaignUnit = campaignUnit3;
                if (campaignUnit != null && campaignUnit.ads != null && campaignUnit3.ads.size() > 0 && (campaignEx = campaignUnit3.ads.get(i)) != null) {
                    if (MOfferModel.this.mNotifyListener != null) {
                        MOfferModel mOfferModel = MOfferModel.this;
                        mOfferModel.callBackClick(mOfferModel.mNotifyListener);
                    }
                    C9278a.m26607a(campaignEx4, C2350a.m5601e().mo15792g(), "more offer click", str7, str8);
                    C9278a.m26606a(C2350a.m5601e().mo15792g(), campaignEx, str7);
                }
            }
        });
        if (campaignEx == null || !campaignEx.getCanStartMoreOfferAnim()) {
            mBridgeRecycleView2.mo62547a(false);
        } else {
            mBridgeRecycleView2.mo62547a(true);
            mBridgeRecycleView2.mo62545a();
        }
        C9266a aVar2 = new C9266a();
        this.viewTagsAdapter = aVar2;
        aVar2.mo62404a((List<CampaignEx>) campaignUnit.getAds());
    }

    private void initView() {
        Context context = this.mContext;
        if (context != null) {
            this.viewMofferLayout = (MBridgeRelativeLayout) LayoutInflater.from(this.mContext).inflate(C8594o.m24812a(context, "mbridge_reward_more_offer_view", "layout"), (ViewGroup) null, false);
        }
    }

    private void addLikeTextView(final RecyclerView recyclerView) {
        TextView textView = (TextView) this.viewMofferLayout.findViewById(findID("mbridge_reward_end_card_like_tv"));
        if (textView != null) {
            textView.setTextColor(Color.parseColor("#FF000000"));
            textView.setTextSize(10.0f);
            if (C8596q.m24826c(C2350a.m5601e().mo15792g()).contains("zh")) {
                textView.setEms(1);
                textView.getLayoutParams().width = C8613y.m24929b(C2350a.m5601e().mo15792g(), 30.0f);
                textView.setText("猜你喜欢");
            } else {
                textView.setText("Just\nfor\nYou");
            }
            textView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    new C9288b().mo62475a((View) recyclerView, 300);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void callBackClick(C9384a aVar) {
        aVar.mo62252a(128, "");
    }

    /* access modifiers changed from: private */
    public int findID(String str) {
        return C8594o.m24812a(C2350a.m5601e().mo15792g(), str, "id");
    }

    /* access modifiers changed from: private */
    public void release() {
        List<Integer> list = this.cacheImpressionReportList;
        if (list != null) {
            list.clear();
            this.cacheImpressionReportList = null;
        }
        List<Integer> list2 = this.cacheOnlyImpressionReportList;
        if (list2 != null) {
            list2.clear();
            this.cacheOnlyImpressionReportList = null;
        }
    }

    public void mofDestroy() {
        if (this.mMoreOfferLayoutListener != null) {
            this.mMoreOfferLayoutListener = null;
        }
    }
}
