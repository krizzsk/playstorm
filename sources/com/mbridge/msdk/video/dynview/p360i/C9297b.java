package com.mbridge.msdk.video.dynview.p360i;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8596q;

/* renamed from: com.mbridge.msdk.video.dynview.i.b */
/* compiled from: UIControlUtil */
public final class C9297b {
    /* renamed from: a */
    public static boolean m26663a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: a */
    public static String m26662a(Context context, int i) {
        String str = i == 1 ? "_por" : "_land";
        String c = C8596q.m24826c(context);
        if (c.startsWith("zh")) {
            return (c.contains("TW") || c.contains("HK")) ? "mbridge_reward_two_title_zh_trad" : "mbridge_reward_two_title_zh";
        }
        if (c.startsWith("ja")) {
            return "mbridge_reward_two_title_japan" + str;
        } else if (c.startsWith("de")) {
            return "mbridge_reward_two_title_germany" + str;
        } else if (c.startsWith("ko")) {
            return "mbridge_reward_two_title_korea" + str;
        } else if (c.startsWith("fr")) {
            return "mbridge_reward_two_title_france" + str;
        } else if (c.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia" + str;
        } else if (c.startsWith("ru")) {
            return "mbridge_reward_two_title_russian" + str;
        } else {
            return "mbridge_reward_two_title_en" + str;
        }
    }

    /* renamed from: a */
    public static boolean m26664a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter("alecfc");
            if (TextUtils.isEmpty(queryParameter) || !queryParameter.equals("1")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m26661a(CampaignEx campaignEx) {
        if (!(campaignEx == null || campaignEx.getRewardTemplateMode() == null)) {
            int b = campaignEx.getRewardTemplateMode().mo57202b();
            if (b == 202 || b == 302 || b == 802) {
                return -3;
            }
            if (b == 904) {
                if (!m26664a(campaignEx.getRewardTemplateMode().mo57205e())) {
                    return -1;
                }
                return -3;
            }
        }
        return 100;
    }
}
