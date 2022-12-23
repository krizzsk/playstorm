package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.utils.q */
/* compiled from: TTClientBiddingUtil */
public class C4010q {
    /* renamed from: a */
    public static void m13163a(C3498n nVar, Double d) {
        if (nVar != null && nVar.mo19666aj() != null) {
            Map<String, Object> aj = nVar.mo19666aj();
            try {
                Object obj = nVar.mo19666aj().get("sdk_bidding_type");
                if (obj == null) {
                    return;
                }
                if (Integer.parseInt(obj.toString()) == 2) {
                    String str = (String) aj.get("nurl");
                    if (!TextUtils.isEmpty(str)) {
                        if (d != null) {
                            str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                        }
                        C3578m.m11239f().mo20075a(str);
                    }
                }
            } catch (Throwable unused) {
                C2975l.m8383b("report Win error");
            }
        }
    }

    /* renamed from: a */
    public static void m13164a(C3498n nVar, Double d, String str, String str2) {
        if (nVar != null && nVar.mo19666aj() != null) {
            Map<String, Object> aj = nVar.mo19666aj();
            try {
                Object obj = nVar.mo19666aj().get("sdk_bidding_type");
                if (obj == null) {
                    return;
                }
                if (Integer.parseInt(obj.toString()) == 2) {
                    String str3 = (String) aj.get("lurl");
                    if (!TextUtils.isEmpty(str3)) {
                        if (d != null) {
                            str3 = str3.replace("${AUCTION_PRICE}", String.valueOf(d));
                        }
                        if (str != null) {
                            str3 = str3.replace("${AUCTION_LOSS}", str);
                        }
                        if (str2 != null) {
                            str3 = str3.replace("${AUCTION_WINNER}", str2);
                        }
                        C3578m.m11239f().mo20075a(str3);
                    }
                }
            } catch (Throwable unused) {
                C2975l.m8383b("report Loss error");
            }
        }
    }
}
