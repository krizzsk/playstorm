package com.mbridge.msdk.foundation.entity;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class CampaignUnit implements NoProGuard, Serializable {
    public static final String JSON_KEY_ADS = "ads";
    public static final String JSON_KEY_AD_HTML = "cam_html";
    public static final String JSON_KEY_AD_TYPE = "ad_type";
    public static final String JSON_KEY_AD_ZIP = "cam_tpl_url";
    public static final String JSON_KEY_BANNER_HTML = "cam_html";
    public static final String JSON_KEY_BANNER_URL = "cam_tpl_url";
    public static final String JSON_KEY_CSP = "csp";
    public static final String JSON_KEY_DO = "do";
    public static final String JSON_KEY_ENCRYPT_PRICE = "encrypt_p";
    public static final String JSON_KEY_END_SCREEN_URL = "end_screen_url";
    public static final String JSON_KEY_FRAME_ADS = "frames";
    public static final String JSON_KEY_HTML_URL = "html_url";
    public static final String JSON_KEY_IA_EXT1 = "ia_all_ext1";
    public static final String JSON_KEY_IA_EXT2 = "ia_all_ext2";
    public static final String JSON_KEY_IA_ICON = "ia_icon";
    public static final String JSON_KEY_IA_ORI = "ia_ori";
    public static final String JSON_KEY_IA_RST = "ia_rst";
    public static final String JSON_KEY_IA_URL = "ia_url";
    public static final String JSON_KEY_JM_DO = "jm_do";
    public static final String JSON_KEY_MOF_TEMPLATE_URL = "mof_template_url";
    public static final String JSON_KEY_MOF_TPLID = "mof_tplid";
    public static final String JSON_KEY_NSCPT = "nscpt";
    public static final String JSON_KEY_ONLY_IMPRESSION_URL = "only_impression_url";
    public static final String JSON_KEY_PARENT_SESSION_ID = "parent_session_id";
    public static final String JSON_KEY_PV_URLS = "pv_urls";
    public static final String JSON_KEY_REPLACE_TMP = "replace_tmp";
    public static final String JSON_KEY_REQ_EXT_DATA = "req_ext_data";
    public static final String JSON_KEY_RKS = "rks";
    public static final String JSON_KEY_SESSION_ID = "a";
    public static final String JSON_KEY_SH = "sh";
    public static final String JSON_KEY_TEMPLATE = "template";
    public static final String JSON_KEY_TOKEN_RULE = "token_r";
    public static final String JSON_KEY_UNIT_SIZE = "unit_size";
    public static final String JSON_KEY_VCN = "vcn";
    public static final String KEY_IRLFA = "irlfa";
    private static final String TAG = CampaignUnit.class.getSimpleName();
    private static final long serialVersionUID = 1;
    private String adHtml;
    private int adType;
    private String adZip;
    public ArrayList<CampaignEx> ads;
    private String bannerHtml;
    private String bannerUrl;
    private StringBuffer cParams = new StringBuffer();
    private String csp;
    private String domain;
    private String encryptPrice = "";
    private HashMap<String, String> epMap;
    private String htmlUrl;
    private String ia_all_ext1;
    private String ia_all_ext2;
    private String ia_icon;
    private int ia_ori;
    private int ia_rst;
    private String ia_url;
    private int jmDo;
    private List<Frame> listFrames;
    private String msg = "";
    private String onlyImpressionUrl;
    private String parentSessionId;
    private String requestId;
    private HashMap<String, String> rks;
    private String sessionId;

    /* renamed from: sh */
    private String f20184sh;
    private int template;
    private int tokenRule;
    private String unitSize;
    private int vcn;

    private Object nullToEmpty(Object obj) {
        return obj == null ? "" : obj;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public String getAdZip() {
        return this.adZip;
    }

    public void setAdZip(String str) {
        this.adZip = str;
    }

    public String getAdHtml() {
        return this.adHtml;
    }

    public void setAdHtml(String str) {
        this.adHtml = str;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public String getBannerHtml() {
        return this.bannerHtml;
    }

    public void setBannerHtml(String str) {
        this.bannerHtml = str;
    }

    public String getIa_icon() {
        return this.ia_icon;
    }

    public void setIa_icon(String str) {
        this.ia_icon = str;
    }

    public int getIa_rst() {
        return this.ia_rst;
    }

    public void setIa_rst(int i) {
        this.ia_rst = i;
    }

    public String getIa_url() {
        return this.ia_url;
    }

    public void setIa_url(String str) {
        this.ia_url = str;
    }

    public int getIa_ori() {
        return this.ia_ori;
    }

    public void setIa_ori(int i) {
        this.ia_ori = i;
    }

    public String getIa_all_ext1() {
        return this.ia_all_ext1;
    }

    public void setIa_all_ext1(String str) {
        this.ia_all_ext1 = str;
    }

    public String getIa_all_ext2() {
        return this.ia_all_ext2;
    }

    public void setIa_all_ext2(String str) {
        this.ia_all_ext2 = str;
    }

    public HashMap<String, String> getRks() {
        return this.rks;
    }

    public void setRks(HashMap<String, String> hashMap) {
        this.rks = hashMap;
    }

    public HashMap<String, String> getEpMap() {
        return this.epMap;
    }

    public void setEpMap(HashMap<String, String> hashMap) {
        this.epMap = hashMap;
    }

    public String getCsp() {
        return this.csp;
    }

    public void setCsp(String str) {
        this.csp = str;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public String getEncryptPrice() {
        return this.encryptPrice;
    }

    public void setEncryptPrice(String str) {
        this.encryptPrice = str;
    }

    public int getTokenRule() {
        int i = this.tokenRule;
        if (i == 1) {
            return i;
        }
        return 0;
    }

    public void setTokenRule(int i) {
        this.tokenRule = i;
    }

    public int getVcn() {
        int i = this.vcn;
        if (i > 1) {
            return i;
        }
        return 1;
    }

    public void setVcn(int i) {
        this.vcn = i;
    }

    public String getSh() {
        return this.f20184sh;
    }

    public void setSh(String str) {
        this.f20184sh = str;
    }

    public int getJmDo() {
        return this.jmDo;
    }

    public void setJmDo(int i) {
        this.jmDo = i;
    }

    public List<Frame> getListFrames() {
        return this.listFrames;
    }

    public void setListFrames(List<Frame> list) {
        this.listFrames = list;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public int getAdType() {
        return this.adType;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public String getUnitSize() {
        return this.unitSize;
    }

    public void setUnitSize(String str) {
        this.unitSize = str;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public String getOnlyImpressionUrl() {
        return this.onlyImpressionUrl;
    }

    public void setOnlyImpressionUrl(String str) {
        this.onlyImpressionUrl = str;
    }

    public ArrayList<CampaignEx> getAds() {
        return this.ads;
    }

    public void setAds(ArrayList<CampaignEx> arrayList) {
        this.ads = arrayList;
    }

    public int getTemplate() {
        return this.template;
    }

    public void setTemplate(int i) {
        this.template = i;
    }

    public String assembCParams() {
        String str;
        String str2;
        StringBuffer stringBuffer = this.cParams;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String i = C8596q.m24839i();
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                str2 = String.valueOf(C8596q.m24849n(C2350a.m5601e().mo15792g()));
                str = C8596q.m24837h(C2350a.m5601e().mo15792g()) + "x" + C8596q.m24838i(C2350a.m5601e().mo15792g());
            } else {
                str2 = "";
                str = str2;
            }
            StringBuffer stringBuffer2 = this.cParams;
            stringBuffer2.append(getAdType());
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty("1"));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(Build.VERSION.RELEASE));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(MBConfiguration.SDK_VERSION));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(C8596q.m24817a()));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(str));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(Integer.valueOf(C8596q.m24828d(C2350a.m5601e().mo15792g()))));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(C8596q.m24826c(C2350a.m5601e().mo15792g())));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(str2));
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(i));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(C8596q.m24825c()));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append("");
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(C8413a.f20329k + "," + C8413a.f20330l));
            stringBuffer2.append("|");
            this.cParams = stringBuffer2;
        } catch (Throwable th) {
            C8608u.m24881a(TAG, th.getMessage(), th);
        }
        return this.cParams.toString();
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject) {
        return parseV5CampaignUnit(jSONObject, "");
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject, String str) {
        return parseCampaignUnit(jSONObject, str);
    }

    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject) {
        return parseCampaignUnit(jSONObject, "");
    }

    public String getRequestId() {
        try {
            if (!TextUtils.isEmpty(this.requestId)) {
                return this.requestId;
            }
            if (TextUtils.isEmpty(this.onlyImpressionUrl)) {
                return "";
            }
            Uri parse = Uri.parse(this.onlyImpressionUrl);
            if (parse != null) {
                this.requestId = parse.getQueryParameter(CampaignEx.JSON_KEY_AD_K);
            }
            return this.requestId;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|(3:15|16|17)|18|19|(1:54)(4:23|24|25|61)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[Catch:{ Exception -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void getSysIDAndBKUPID(org.json.JSONObject r9) {
        /*
            com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C2358b.m5644a()
            boolean r0 = r0.mo15829d()
            r1 = 0
            java.lang.String r2 = "H+tU+FeXHM=="
            if (r0 == 0) goto L_0x0020
            com.mbridge.msdk.foundation.tools.FastKV$Builder r0 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x0020 }
            com.mbridge.msdk.foundation.same.b.c r3 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x0020 }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r3)     // Catch:{ Exception -> 0x0020 }
            java.lang.String r4 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r2)     // Catch:{ Exception -> 0x0020 }
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x0020 }
            com.mbridge.msdk.foundation.tools.FastKV r1 = r0.build()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            java.lang.String r0 = "H+tU+Fz8"
            java.lang.String r3 = "H+tU+bfPhM=="
            java.lang.String r4 = "c"
            java.lang.String r5 = "b"
            if (r1 == 0) goto L_0x008a
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0084 }
            android.content.Context r2 = r2.mo15792g()     // Catch:{ Exception -> 0x0084 }
            if (r9 == 0) goto L_0x010a
            if (r2 == 0) goto L_0x010a
            java.lang.String r2 = r9.optString(r5)     // Catch:{ Exception -> 0x0084 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0084 }
            if (r6 != 0) goto L_0x005c
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ Exception -> 0x0084 }
            boolean r6 = android.text.TextUtils.equals(r6, r2)     // Catch:{ Exception -> 0x0084 }
            if (r6 != 0) goto L_0x005c
            com.mbridge.msdk.foundation.same.C8413a.f20329k = r2     // Catch:{ Exception -> 0x0084 }
            com.mbridge.msdk.foundation.a.a.a r2 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ Exception -> 0x0084 }
            r2.mo15733a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r3)     // Catch:{ Exception -> 0x005c }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ Exception -> 0x005c }
            r1.putString(r2, r3)     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            java.lang.String r9 = r9.optString(r4)     // Catch:{ Exception -> 0x0084 }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0084 }
            if (r2 != 0) goto L_0x010a
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ Exception -> 0x0084 }
            boolean r2 = android.text.TextUtils.equals(r2, r9)     // Catch:{ Exception -> 0x0084 }
            if (r2 != 0) goto L_0x010a
            com.mbridge.msdk.foundation.same.C8413a.f20330l = r9     // Catch:{ Exception -> 0x0084 }
            com.mbridge.msdk.foundation.a.a.a r9 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ Exception -> 0x0084 }
            r9.mo15733a((java.lang.String) r4, (java.lang.String) r2)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r0)     // Catch:{ Exception -> 0x010a }
            java.lang.String r0 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ Exception -> 0x010a }
            r1.putString(r9, r0)     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x0084:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x010a
        L_0x008a:
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0106 }
            android.content.Context r1 = r1.mo15792g()     // Catch:{ Exception -> 0x0106 }
            if (r9 == 0) goto L_0x010a
            if (r1 == 0) goto L_0x010a
            java.lang.String r6 = r9.optString(r5)     // Catch:{ Exception -> 0x0106 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0106 }
            r8 = 0
            if (r7 != 0) goto L_0x00ce
            java.lang.String r7 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ Exception -> 0x0106 }
            boolean r7 = android.text.TextUtils.equals(r7, r6)     // Catch:{ Exception -> 0x0106 }
            if (r7 != 0) goto L_0x00ce
            com.mbridge.msdk.foundation.same.C8413a.f20329k = r6     // Catch:{ Exception -> 0x0106 }
            com.mbridge.msdk.foundation.a.a.a r6 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r7 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ Exception -> 0x0106 }
            r6.mo15733a((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r5 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r2)     // Catch:{ Exception -> 0x0106 }
            android.content.SharedPreferences r5 = r1.getSharedPreferences(r5, r8)     // Catch:{ Exception -> 0x0106 }
            if (r5 == 0) goto L_0x00ce
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r3)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ Exception -> 0x0106 }
            r5.putString(r3, r6)     // Catch:{ Exception -> 0x0106 }
            r5.apply()     // Catch:{ Exception -> 0x0106 }
        L_0x00ce:
            java.lang.String r9 = r9.optString(r4)     // Catch:{ Exception -> 0x0106 }
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0106 }
            if (r3 != 0) goto L_0x010a
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ Exception -> 0x0106 }
            boolean r3 = android.text.TextUtils.equals(r3, r9)     // Catch:{ Exception -> 0x0106 }
            if (r3 != 0) goto L_0x010a
            com.mbridge.msdk.foundation.same.C8413a.f20330l = r9     // Catch:{ Exception -> 0x0106 }
            com.mbridge.msdk.foundation.a.a.a r9 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ Exception -> 0x0106 }
            r9.mo15733a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r2)     // Catch:{ Exception -> 0x0106 }
            android.content.SharedPreferences r9 = r1.getSharedPreferences(r9, r8)     // Catch:{ Exception -> 0x0106 }
            if (r9 == 0) goto L_0x010a
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8595p.m24815b(r0)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ Exception -> 0x0106 }
            r9.putString(r0, r1)     // Catch:{ Exception -> 0x0106 }
            r9.apply()     // Catch:{ Exception -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r9 = move-exception
            r9.printStackTrace()
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.entity.CampaignUnit.getSysIDAndBKUPID(org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x016a A[SYNTHETIC, Splitter:B:46:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02f5 A[SYNTHETIC, Splitter:B:79:0x02f5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.mbridge.msdk.foundation.entity.CampaignUnit parseCampaignUnit(org.json.JSONObject r37, java.lang.String r38) {
        /*
            r0 = r37
            java.lang.String r1 = "ads"
            java.lang.String r2 = "template"
            java.lang.String r3 = "ad_type"
            java.lang.String r4 = "parent_session_id"
            java.lang.String r5 = "a"
            java.lang.String r6 = "only_impression_url"
            java.lang.String r7 = "html_url"
            if (r0 == 0) goto L_0x0396
            com.mbridge.msdk.foundation.entity.CampaignUnit r15 = new com.mbridge.msdk.foundation.entity.CampaignUnit     // Catch:{ Exception -> 0x0396 }
            r15.<init>()     // Catch:{ Exception -> 0x0396 }
            java.lang.String r9 = "rks"
            java.lang.String r9 = r0.optString(r9)     // Catch:{ Exception -> 0x0393 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0393 }
            if (r10 != 0) goto L_0x004e
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x004b }
            r10.<init>(r9)     // Catch:{ Exception -> 0x004b }
            java.util.Iterator r9 = r10.keys()     // Catch:{ Exception -> 0x004b }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Exception -> 0x004b }
            r11.<init>()     // Catch:{ Exception -> 0x004b }
        L_0x0031:
            if (r9 == 0) goto L_0x0047
            boolean r12 = r9.hasNext()     // Catch:{ Exception -> 0x004b }
            if (r12 == 0) goto L_0x0047
            java.lang.Object r12 = r9.next()     // Catch:{ Exception -> 0x004b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x004b }
            java.lang.String r13 = r10.optString(r12)     // Catch:{ Exception -> 0x004b }
            r11.put(r12, r13)     // Catch:{ Exception -> 0x004b }
            goto L_0x0031
        L_0x0047:
            r15.setRks(r11)     // Catch:{ Exception -> 0x004b }
            goto L_0x004e
        L_0x004b:
            r8 = r15
            goto L_0x0397
        L_0x004e:
            boolean r9 = android.text.TextUtils.isEmpty(r38)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r10 = "encrypt_p"
            java.lang.String r11 = ""
            if (r9 != 0) goto L_0x0068
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x004b }
            r9.<init>()     // Catch:{ Exception -> 0x004b }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x004b }
            java.lang.String r12 = "irlfa"
            r9.put(r12, r11)     // Catch:{ Exception -> 0x004b }
            r15.setEpMap(r9)     // Catch:{ Exception -> 0x004b }
        L_0x0068:
            java.lang.String r9 = "req_ext_data"
            org.json.JSONObject r9 = r0.optJSONObject(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r12 = "nscpt"
            r13 = 1
            int r14 = r0.optInt(r12, r13)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r12 = "mof_template_url"
            java.lang.String r12 = r0.optString(r12, r11)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r8 = "mof_tplid"
            r13 = 0
            int r8 = r0.optInt(r8, r13)     // Catch:{ Exception -> 0x0393 }
            if (r9 == 0) goto L_0x0088
            java.lang.String r11 = r9.toString()     // Catch:{ Exception -> 0x004b }
        L_0x0088:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Exception -> 0x0393 }
            r9.<init>()     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "pv_urls"
            org.json.JSONArray r9 = r0.optJSONArray(r9)     // Catch:{ Exception -> 0x0393 }
            if (r9 == 0) goto L_0x00b9
            int r18 = r9.length()     // Catch:{ Exception -> 0x004b }
            if (r18 <= 0) goto L_0x00b9
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x004b }
            r19 = r11
            int r11 = r9.length()     // Catch:{ Exception -> 0x004b }
            r13.<init>(r11)     // Catch:{ Exception -> 0x004b }
            r20 = r12
            r11 = 0
        L_0x00a9:
            int r12 = r9.length()     // Catch:{ Exception -> 0x004b }
            if (r11 >= r12) goto L_0x00be
            java.lang.String r12 = r9.getString(r11)     // Catch:{ Exception -> 0x004b }
            r13.add(r12)     // Catch:{ Exception -> 0x004b }
            int r11 = r11 + 1
            goto L_0x00a9
        L_0x00b9:
            r19 = r11
            r20 = r12
            r13 = 0
        L_0x00be:
            java.lang.String r9 = "replace_tmp"
            org.json.JSONObject r9 = r0.optJSONObject(r9)     // Catch:{ Exception -> 0x0393 }
            com.mbridge.msdk.foundation.db.a.a r11 = com.mbridge.msdk.foundation.p066db.p067a.C2366a.m5655a()     // Catch:{ Exception -> 0x0393 }
            r12 = 1
            r11.mo15842a(r9, r12)     // Catch:{ Exception -> 0x0393 }
            getSysIDAndBKUPID(r37)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = r0.optString(r5)     // Catch:{ Exception -> 0x0393 }
            r15.setSessionId(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = r0.optString(r4)     // Catch:{ Exception -> 0x0393 }
            r15.setParentSessionId(r9)     // Catch:{ Exception -> 0x0393 }
            int r9 = r0.optInt(r3)     // Catch:{ Exception -> 0x0393 }
            r15.setAdType(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "unit_size"
            java.lang.String r9 = r0.optString(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setUnitSize(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = r0.optString(r7)     // Catch:{ Exception -> 0x0393 }
            r15.setHtmlUrl(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = r0.optString(r6)     // Catch:{ Exception -> 0x0393 }
            r15.setOnlyImpressionUrl(r9)     // Catch:{ Exception -> 0x0393 }
            int r9 = r0.optInt(r2)     // Catch:{ Exception -> 0x0393 }
            r15.setTemplate(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "jm_do"
            int r9 = r0.optInt(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setJmDo(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "ia_icon"
            java.lang.String r9 = r0.optString(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setIa_icon(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "ia_rst"
            int r9 = r0.optInt(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setIa_rst(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "ia_url"
            java.lang.String r9 = r0.optString(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setIa_url(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "ia_ori"
            int r9 = r0.optInt(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setIa_ori(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "ia_all_ext1"
            java.lang.String r9 = r0.optString(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setIa_all_ext1(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "ia_all_ext2"
            java.lang.String r9 = r0.optString(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setIa_all_ext2(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "vcn"
            int r9 = r0.optInt(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setVcn(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "token_r"
            int r9 = r0.optInt(r9)     // Catch:{ Exception -> 0x0393 }
            r15.setTokenRule(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = r0.optString(r10)     // Catch:{ Exception -> 0x0393 }
            r15.setEncryptPrice(r9)     // Catch:{ Exception -> 0x0393 }
            org.json.JSONArray r12 = r0.optJSONArray(r1)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r9 = "frames"
            org.json.JSONArray r11 = r0.optJSONArray(r9)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r10 = "web env is not support"
            java.lang.String r9 = "end_screen_url"
            if (r11 == 0) goto L_0x02e1
            int r16 = r11.length()     // Catch:{ Exception -> 0x02dd }
            if (r16 <= 0) goto L_0x02e1
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x02dd }
            r12.<init>()     // Catch:{ Exception -> 0x02dd }
            r17 = r10
            r16 = r13
            r13 = 0
        L_0x017a:
            int r10 = r11.length()     // Catch:{ Exception -> 0x02dd }
            if (r13 >= r10) goto L_0x02d6
            org.json.JSONObject r10 = r11.optJSONObject(r13)     // Catch:{ Exception -> 0x02dd }
            r21 = r13
            org.json.JSONArray r13 = r10.getJSONArray(r1)     // Catch:{ Exception -> 0x02dd }
            r22 = r1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x02dd }
            r1.<init>()     // Catch:{ Exception -> 0x02dd }
            r23 = r2
            r24 = r10
            r2 = 0
        L_0x0196:
            int r10 = r13.length()     // Catch:{ Exception -> 0x02dd }
            if (r2 >= r10) goto L_0x0277
            org.json.JSONObject r10 = r13.optJSONObject(r2)     // Catch:{ Exception -> 0x02dd }
            java.lang.String r25 = r0.optString(r6)     // Catch:{ Exception -> 0x02dd }
            java.lang.String r26 = r0.optString(r7)     // Catch:{ Exception -> 0x02dd }
            java.lang.String r27 = r0.optString(r9)     // Catch:{ Exception -> 0x02dd }
            r28 = 0
            r29 = r9
            r9 = r10
            r31 = r17
            r30 = r24
            r10 = r25
            r17 = r11
            r32 = r19
            r11 = r26
            r19 = r7
            r7 = r20
            r20 = r6
            r6 = r12
            r12 = r27
            r24 = r6
            r6 = r16
            r18 = r21
            r16 = 0
            r21 = r13
            r13 = r28
            r33 = r14
            r14 = r15
            r25 = r15
            r15 = r38
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaign(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0273 }
            if (r9 == 0) goto L_0x0248
            java.lang.String r10 = r25.getIa_url()     // Catch:{ Exception -> 0x0244 }
            r9.setKeyIaUrl(r10)     // Catch:{ Exception -> 0x0244 }
            int r10 = r25.getIa_ori()     // Catch:{ Exception -> 0x0244 }
            r9.setKeyIaOri(r10)     // Catch:{ Exception -> 0x0244 }
            int r10 = r25.getIa_rst()     // Catch:{ Exception -> 0x0244 }
            r9.setKeyIaRst(r10)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r10 = r25.getIa_icon()     // Catch:{ Exception -> 0x0244 }
            r9.setKeyIaIcon(r10)     // Catch:{ Exception -> 0x0244 }
            int r10 = r0.optInt(r3)     // Catch:{ Exception -> 0x0244 }
            r9.setAdType(r10)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r10 = "ia_ext1"
            java.lang.String r10 = r0.optString(r10)     // Catch:{ Exception -> 0x0244 }
            r9.setIa_ext1(r10)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r10 = "ia_ext2"
            java.lang.String r10 = r0.optString(r10)     // Catch:{ Exception -> 0x0244 }
            r9.setIa_ext2(r10)     // Catch:{ Exception -> 0x0244 }
            int r10 = r25.getVcn()     // Catch:{ Exception -> 0x0244 }
            r9.setVcn(r10)     // Catch:{ Exception -> 0x0244 }
            int r10 = r25.getTokenRule()     // Catch:{ Exception -> 0x0244 }
            r9.setTokenRule(r10)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r10 = r25.getEncryptPrice()     // Catch:{ Exception -> 0x0244 }
            r9.setEncryptPrice(r10)     // Catch:{ Exception -> 0x0244 }
            r9.setMof_tplid(r8)     // Catch:{ Exception -> 0x0244 }
            r9.setMof_template_url(r7)     // Catch:{ Exception -> 0x0244 }
            r15 = r33
            r9.setNscpt(r15)     // Catch:{ Exception -> 0x0244 }
            r9.setPv_urls(r6)     // Catch:{ Exception -> 0x0244 }
            r14 = r32
            r9.setReq_ext_data(r14)     // Catch:{ Exception -> 0x0244 }
            r1.add(r9)     // Catch:{ Exception -> 0x0244 }
            r13 = r25
            r11 = r31
            goto L_0x0253
        L_0x0244:
            r8 = r25
            goto L_0x0397
        L_0x0248:
            r14 = r32
            r15 = r33
            r13 = r25
            r11 = r31
            r13.setMsg(r11)     // Catch:{ Exception -> 0x02de }
        L_0x0253:
            int r2 = r2 + 1
            r16 = r6
            r6 = r20
            r12 = r24
            r9 = r29
            r24 = r30
            r20 = r7
            r7 = r19
            r19 = r14
            r14 = r15
            r15 = r13
            r13 = r21
            r21 = r18
            r36 = r17
            r17 = r11
            r11 = r36
            goto L_0x0196
        L_0x0273:
            r13 = r25
            goto L_0x02de
        L_0x0277:
            r29 = r9
            r13 = r15
            r18 = r21
            r30 = r24
            r24 = r12
            r15 = r14
            r14 = r19
            r19 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 0
            r36 = r17
            r17 = r11
            r11 = r36
            com.mbridge.msdk.out.Frame r2 = new com.mbridge.msdk.out.Frame     // Catch:{ Exception -> 0x02de }
            r2.<init>()     // Catch:{ Exception -> 0x02de }
            java.lang.String r9 = r0.optString(r4)     // Catch:{ Exception -> 0x02de }
            r2.setParentSessionId(r9)     // Catch:{ Exception -> 0x02de }
            java.lang.String r9 = r0.optString(r5)     // Catch:{ Exception -> 0x02de }
            r2.setSessionId(r9)     // Catch:{ Exception -> 0x02de }
            r2.setCampaigns(r1)     // Catch:{ Exception -> 0x02de }
            r9 = r23
            r1 = r30
            int r1 = r1.optInt(r9)     // Catch:{ Exception -> 0x02de }
            r2.setTemplate(r1)     // Catch:{ Exception -> 0x02de }
            r1 = r24
            r1.add(r2)     // Catch:{ Exception -> 0x02de }
            int r2 = r18 + 1
            r12 = r1
            r16 = r6
            r6 = r20
            r1 = r22
            r20 = r7
            r7 = r19
            r19 = r14
            r14 = r15
            r15 = r13
            r13 = r2
            r2 = r9
            r9 = r29
            r36 = r17
            r17 = r11
            r11 = r36
            goto L_0x017a
        L_0x02d6:
            r1 = r12
            r13 = r15
            r13.setListFrames(r1)     // Catch:{ Exception -> 0x02de }
            goto L_0x0391
        L_0x02dd:
            r13 = r15
        L_0x02de:
            r8 = r13
            goto L_0x0397
        L_0x02e1:
            r29 = r9
            r11 = r10
            r16 = 0
            r36 = r20
            r20 = r6
            r6 = r13
            r13 = r15
            r15 = r14
            r14 = r19
            r19 = r7
            r7 = r36
            if (r12 == 0) goto L_0x0391
            int r1 = r12.length()     // Catch:{ Exception -> 0x0391 }
            if (r1 <= 0) goto L_0x0391
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0391 }
            r1.<init>()     // Catch:{ Exception -> 0x0391 }
            r2 = r16
        L_0x0302:
            int r3 = r12.length()     // Catch:{ Exception -> 0x0391 }
            if (r2 >= r3) goto L_0x038c
            org.json.JSONObject r9 = r12.optJSONObject(r2)     // Catch:{ Exception -> 0x0391 }
            r3 = r20
            java.lang.String r10 = r0.optString(r3)     // Catch:{ Exception -> 0x0391 }
            r4 = r19
            java.lang.String r5 = r0.optString(r4)     // Catch:{ Exception -> 0x0391 }
            r25 = r13
            r13 = r29
            java.lang.String r16 = r0.optString(r13)     // Catch:{ Exception -> 0x0389 }
            r17 = 0
            r34 = r11
            r11 = r5
            r5 = r12
            r12 = r16
            r18 = r13
            r16 = r25
            r13 = r17
            r35 = r14
            r14 = r16
            r0 = r15
            r15 = r38
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaign(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0386 }
            if (r9 == 0) goto L_0x036c
            r9.setMof_tplid(r8)     // Catch:{ Exception -> 0x0369 }
            r9.setMof_template_url(r7)     // Catch:{ Exception -> 0x0369 }
            r9.setNscpt(r0)     // Catch:{ Exception -> 0x0369 }
            r9.setPv_urls(r6)     // Catch:{ Exception -> 0x0369 }
            r11 = r35
            r9.setReq_ext_data(r11)     // Catch:{ Exception -> 0x0369 }
            int r10 = r16.getVcn()     // Catch:{ Exception -> 0x0369 }
            r9.setVcn(r10)     // Catch:{ Exception -> 0x0369 }
            int r10 = r16.getTokenRule()     // Catch:{ Exception -> 0x0369 }
            r9.setTokenRule(r10)     // Catch:{ Exception -> 0x0369 }
            java.lang.String r10 = r16.getEncryptPrice()     // Catch:{ Exception -> 0x0369 }
            r9.setEncryptPrice(r10)     // Catch:{ Exception -> 0x0369 }
            r1.add(r9)     // Catch:{ Exception -> 0x0369 }
            r9 = r16
            r10 = r34
            goto L_0x0375
        L_0x0369:
            r8 = r16
            goto L_0x0397
        L_0x036c:
            r11 = r35
            r9 = r16
            r10 = r34
            r9.setMsg(r10)     // Catch:{ Exception -> 0x0394 }
        L_0x0375:
            int r2 = r2 + 1
            r15 = r0
            r20 = r3
            r19 = r4
            r12 = r5
            r13 = r9
            r14 = r11
            r29 = r18
            r0 = r37
            r11 = r10
            goto L_0x0302
        L_0x0386:
            r9 = r16
            goto L_0x0394
        L_0x0389:
            r9 = r25
            goto L_0x0394
        L_0x038c:
            r9 = r13
            r9.setAds(r1)     // Catch:{ Exception -> 0x0394 }
            goto L_0x0394
        L_0x0391:
            r9 = r13
            goto L_0x0394
        L_0x0393:
            r9 = r15
        L_0x0394:
            r8 = r9
            goto L_0x0397
        L_0x0396:
            r8 = 0
        L_0x0397:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.entity.CampaignUnit.parseCampaignUnit(org.json.JSONObject, java.lang.String):com.mbridge.msdk.foundation.entity.CampaignUnit");
    }
}
