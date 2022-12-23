package com.p374my.target.common;

import android.content.Context;
import com.p374my.target.C10039x8;
import com.p374my.target.C9754i5;
import java.util.Map;

/* renamed from: com.my.target.common.MyTargetUtils */
public class MyTargetUtils {
    public static Map<String, String> collectInfo(Context context) {
        C9754i5.m28266c().collectData(context);
        return C9754i5.m28266c().getData();
    }

    public static void sendStat(String str, Context context) {
        C10039x8.m29719c(str, context);
    }
}
