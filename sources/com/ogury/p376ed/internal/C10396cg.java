package com.ogury.p376ed.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cg */
public final class C10396cg {

    /* renamed from: a */
    public static final C10397a f26325a = new C10397a((byte) 0);

    /* renamed from: b */
    private final List<String> f26326b;

    /* renamed from: c */
    private final List<String> f26327c;

    public C10396cg(List<String> list, List<String> list2) {
        C10765mq.m32773b(list, "whitelist");
        C10765mq.m32773b(list2, "blacklist");
        this.f26326b = list;
        this.f26327c = list2;
    }

    /* renamed from: a */
    public final List<String> mo67152a() {
        return this.f26326b;
    }

    /* renamed from: b */
    public final List<String> mo67153b() {
        return this.f26327c;
    }

    /* renamed from: com.ogury.ed.internal.cg$a */
    public static final class C10397a {
        public /* synthetic */ C10397a(byte b) {
            this();
        }

        private C10397a() {
        }

        /* renamed from: a */
        public static C10396cg m31466a(Activity activity, C10526fj fjVar, C10403ck ckVar) {
            C10765mq.m32773b(activity, "activity");
            C10765mq.m32773b(fjVar, "fragmentOverlayConfig");
            C10765mq.m32773b(ckVar, "publisherFragmentFilter");
            return new C10396cg(m31468a(fjVar, ckVar, activity), m31467a(fjVar, ckVar));
        }

        /* renamed from: a */
        private static List<String> m31468a(C10526fj fjVar, C10403ck ckVar, Activity activity) {
            List<String> arrayList = new ArrayList<>();
            arrayList.addAll(fjVar.mo67386e());
            if (fjVar.mo67383c()) {
                arrayList.addAll(ckVar.mo67155a());
            }
            if (fjVar.mo67381b()) {
                arrayList.add(C10392cc.m31455a(activity));
            }
            return arrayList;
        }

        /* renamed from: a */
        private static List<String> m31467a(C10526fj fjVar, C10403ck ckVar) {
            List<String> arrayList = new ArrayList<>();
            arrayList.addAll(fjVar.mo67387f());
            if (fjVar.mo67385d()) {
                for (Class cls : ckVar.mo67157b()) {
                    String canonicalName = cls.getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = cls.getName();
                    }
                    C10765mq.m32770a((Object) canonicalName, "fullName");
                    arrayList.add(canonicalName);
                }
            }
            return arrayList;
        }
    }
}
