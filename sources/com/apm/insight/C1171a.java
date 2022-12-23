package com.apm.insight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.apm.insight.a */
public class C1171a {

    /* renamed from: a */
    private Map<CrashType, List<AttachUserData>> f919a = new HashMap();

    /* renamed from: b */
    private Map<CrashType, List<AttachUserData>> f920b = new HashMap();

    /* renamed from: c */
    private Map<String, String> f921c = new HashMap();

    /* renamed from: d */
    private ICrashFilter f922d = null;

    /* renamed from: c */
    private void m1230c(CrashType crashType, AttachUserData attachUserData) {
        List list;
        if (this.f919a.get(crashType) == null) {
            list = new ArrayList();
            this.f919a.put(crashType, list);
        } else {
            list = this.f919a.get(crashType);
        }
        list.add(attachUserData);
    }

    /* renamed from: d */
    private void m1231d(CrashType crashType, AttachUserData attachUserData) {
        List list;
        if (this.f920b.get(crashType) == null) {
            list = new ArrayList();
            this.f920b.put(crashType, list);
        } else {
            list = this.f920b.get(crashType);
        }
        list.add(attachUserData);
    }

    /* renamed from: e */
    private void m1232e(CrashType crashType, AttachUserData attachUserData) {
        List list = this.f919a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* renamed from: f */
    private void m1233f(CrashType crashType, AttachUserData attachUserData) {
        List list = this.f920b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* renamed from: a */
    public List<AttachUserData> mo12165a(CrashType crashType) {
        return this.f919a.get(crashType);
    }

    /* renamed from: a */
    public Map<String, String> mo12166a() {
        return this.f921c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12167a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m1230c(CrashType.LAUNCH, attachUserData);
            m1230c(CrashType.JAVA, attachUserData);
            m1230c(CrashType.CUSTOM_JAVA, attachUserData);
            m1230c(CrashType.NATIVE, attachUserData);
            m1230c(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m1230c(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12168a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            m1232e(CrashType.LAUNCH, attachUserData);
            m1232e(CrashType.JAVA, attachUserData);
            m1232e(CrashType.CUSTOM_JAVA, attachUserData);
            m1232e(CrashType.NATIVE, attachUserData);
            m1232e(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m1232e(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12169a(ICrashFilter iCrashFilter) {
        this.f922d = iCrashFilter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12170a(Map<? extends String, ? extends String> map) {
        this.f921c.putAll(map);
    }

    /* renamed from: b */
    public ICrashFilter mo12171b() {
        return this.f922d;
    }

    /* renamed from: b */
    public List<AttachUserData> mo12172b(CrashType crashType) {
        return this.f920b.get(crashType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12173b(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m1231d(CrashType.LAUNCH, attachUserData);
            m1231d(CrashType.JAVA, attachUserData);
            m1231d(CrashType.CUSTOM_JAVA, attachUserData);
            m1231d(CrashType.NATIVE, attachUserData);
            m1231d(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m1231d(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12174b(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            m1233f(CrashType.LAUNCH, attachUserData);
            m1233f(CrashType.JAVA, attachUserData);
            m1233f(CrashType.CUSTOM_JAVA, attachUserData);
            m1233f(CrashType.NATIVE, attachUserData);
            m1233f(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m1233f(crashType, attachUserData);
    }
}
