package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.gz */
/* compiled from: RetryNetworkRequest */
public class C6208gz extends C6206gx {

    /* renamed from: d */
    private static final String f15727d = C6154fx.class.getSimpleName();

    /* renamed from: a */
    public AtomicBoolean f15728a = new AtomicBoolean(false);

    /* renamed from: b */
    int f15729b = 1;

    /* renamed from: c */
    int f15730c = 30;

    /* renamed from: e */
    private Map<String, String> f15731e;

    protected C6208gz(String str, String str2, C6271ir irVar, String str3, int i, int i2, String str4) {
        super(str, str2, irVar, C6256ie.m18676f(), str4);
        this.f15729b = i;
        this.f15730c = i2;
        this.f15719s = str3;
        this.f15731e = null;
    }

    /* renamed from: a */
    public void mo34922a() {
        super.mo34922a();
        Map<String, String> map = this.f15731e;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (!this.f15706f.containsKey(next.getKey())) {
                    this.f15706f.put((String) next.getKey(), (String) next.getValue());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo35339b() {
        this.f15728a.compareAndSet(false, true);
    }
}
