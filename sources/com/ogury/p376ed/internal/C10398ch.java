package com.ogury.p376ed.internal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ch */
public final class C10398ch {
    /* renamed from: a */
    public static final List<Fragment> m31469a(FragmentManager fragmentManager) {
        C10765mq.m32773b(fragmentManager, "<this>");
        List<Fragment> arrayList = new ArrayList<>();
        m31470a(arrayList, fragmentManager);
        return arrayList;
    }

    /* renamed from: a */
    private static final void m31470a(List<Fragment> list, FragmentManager fragmentManager) {
        List<Fragment> fragments = fragmentManager.getFragments();
        C10765mq.m32770a((Object) fragments, "fm.fragments");
        for (Fragment fragment : fragments) {
            if (fragment.getUserVisibleHint() && fragment.isResumed() && !fragment.isHidden()) {
                C10765mq.m32770a((Object) fragment, "it");
                list.add(fragment);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                C10765mq.m32770a((Object) childFragmentManager, "it.childFragmentManager");
                m31470a(list, childFragmentManager);
            }
        }
    }
}
