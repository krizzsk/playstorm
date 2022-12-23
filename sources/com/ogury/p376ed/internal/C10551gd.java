package com.ogury.p376ed.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ogury.ed.internal.gd */
public final class C10551gd {
    /* renamed from: a */
    public static final List<String> m32076a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C10692km.m32648a();
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
