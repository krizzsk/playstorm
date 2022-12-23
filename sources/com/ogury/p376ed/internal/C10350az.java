package com.ogury.p376ed.internal;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.az */
public final class C10350az {
    /* renamed from: a */
    public final List<View> mo67086a(ViewGroup viewGroup, WebView webView) {
        C10765mq.m32773b(viewGroup, "root");
        C10765mq.m32773b(webView, "webView");
        List arrayList = new ArrayList();
        m31322a(viewGroup, (List<View>) arrayList);
        return arrayList.subList(arrayList.indexOf(webView) + 1, arrayList.size());
    }

    /* renamed from: a */
    private final void m31322a(ViewGroup viewGroup, List<View> list) {
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof C10546g)) {
                    C10765mq.m32770a((Object) childAt, "child");
                    list.add(childAt);
                }
                if (childAt instanceof ViewGroup) {
                    m31322a((ViewGroup) childAt, list);
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
