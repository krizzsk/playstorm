package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.du */
/* compiled from: TrackerAttr */
public final class C6002du {

    /* renamed from: a */
    public byte f15269a;

    /* renamed from: b */
    public Map<String, Object> f15270b = new HashMap();

    public C6002du(byte b) {
        this.f15269a = b;
    }

    /* renamed from: a */
    public final <T> T mo35113a(String str, Class<T> cls) {
        Object obj = this.f15270b.get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }
}
