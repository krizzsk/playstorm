package com.p374my.target;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.my.target.f8 */
public class C9704f8 {
    /* renamed from: a */
    public static String m28038a(List<String> list) {
        return TextUtils.join(",", list);
    }

    /* renamed from: a */
    public static String m28039a(String[] strArr) {
        return strArr == null ? "" : TextUtils.join(",", strArr);
    }

    /* renamed from: a */
    public static boolean m28040a(String[] strArr, String str) {
        for (String equals : strArr) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int[] m28041a(int... iArr) {
        Arrays.sort(iArr);
        return iArr;
    }
}
