package com.mbridge.msdk.mbbid.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Iterator;
import org.json.JSONObject;

public class BidResponsedEx extends BidResponsed {
    public static final String KEY_CID = "cid";
    public static final String KEY_MACORS = "macors";
    public static final String TAG = "BidResponsedEx";
    private String cid;

    public static String decodePrice(String str) {
        return str;
    }

    public void setLn(String str) {
        this.f21168ln = str;
    }

    public void setWn(String str) {
        this.f21169wn = str;
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public static BidResponsedEx parseBidResponsedEx(JSONObject jSONObject, String str) {
        BidResponsedEx bidResponsedEx = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            BidResponsedEx bidResponsedEx2 = new BidResponsedEx();
            try {
                bidResponsedEx2.setBidId(jSONObject.optString(BidResponsed.KEY_BID_ID));
                bidResponsedEx2.setCur(jSONObject.optString(BidResponsed.KEY_CUR));
                bidResponsedEx2.setPrice(jSONObject.optString("price"));
                bidResponsedEx2.setCid(jSONObject.optString(KEY_CID));
                bidResponsedEx2.setBidToken(jSONObject.optString("token"));
                JSONObject optJSONObject = jSONObject.optJSONObject(KEY_MACORS);
                String optString = jSONObject.optString("ln");
                String optString2 = jSONObject.optString(BidResponsed.KEY_WN);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = optJSONObject.getString(next);
                        optString = replaceUrl(optString, next, string);
                        optString2 = replaceUrl(optString2, next, string);
                    }
                }
                bidResponsedEx2.setLn(optString);
                bidResponsedEx2.setWn(optString2);
                return bidResponsedEx2;
            } catch (Throwable th) {
                th = th;
                bidResponsedEx = bidResponsedEx2;
                C8608u.m24884d(TAG, th.getMessage());
                return bidResponsedEx;
            }
        } catch (Throwable th2) {
            th = th2;
            C8608u.m24884d(TAG, th.getMessage());
            return bidResponsedEx;
        }
    }

    private static String replaceUrl(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return str;
            }
            return str.replaceAll("\\{" + str2 + "\\}", str3);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
