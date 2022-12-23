package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2022q;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.g */
public class C2006g extends C1877a {

    /* renamed from: a */
    private static final long f3866a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    private final AtomicLong f3867c = new AtomicLong();

    /* renamed from: d */
    private final C2002f f3868d;

    /* renamed from: e */
    private final C2092v f3869e;

    C2006g(C2002f fVar, C1959m mVar) {
        super("PersistentPostbackQueueSaveTask", mVar);
        this.f3869e = mVar.mo14286A();
        this.f3868d = fVar;
    }

    /* renamed from: a */
    private void m4675a(List<C2007h> list) {
        JSONArray jSONArray = new JSONArray();
        for (C2007h n : list) {
            try {
                jSONArray.put(n.mo14566n());
            } catch (Throwable th) {
                if (C2092v.m5047a()) {
                    this.f3869e.mo14790b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pb", jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            C2022q ab = this.f3467b.mo14329ab();
            ab.mo14631a((InputStream) byteArrayInputStream, ab.mo14624a("persistent_postback_cache.json", this.f3467b.mo14297L()));
            if (C2092v.m5047a()) {
                this.f3869e.mo14789b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (C2092v.m5047a()) {
                this.f3869e.mo14790b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<C2007h> mo14548a(int i) {
        ArrayList<C2007h> arrayList = new ArrayList<>();
        try {
            C2022q ab = this.f3467b.mo14329ab();
            if (ab.mo14634b("persistent_postback_cache.json", this.f3467b.mo14297L())) {
                String a = ab.mo14628a(ab.mo14624a("persistent_postback_cache.json", this.f3467b.mo14297L()));
                if (StringUtils.isValidString(a)) {
                    JSONArray jSONArray = new JSONObject(a).getJSONArray("pb");
                    if (C2092v.m5047a()) {
                        C2092v vVar = this.f3869e;
                        vVar.mo14789b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int intValue = ((Integer) this.f3467b.mo14311a(C1857b.f3185cJ)).intValue();
                    for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                        C2007h hVar = new C2007h(jSONArray.getJSONObject(i2), this.f3467b);
                        if (hVar.mo14563k() < intValue) {
                            arrayList.add(hVar);
                        } else if (C2092v.m5047a()) {
                            C2092v vVar2 = this.f3869e;
                            vVar2.mo14789b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                        }
                    }
                    if (C2092v.m5047a()) {
                        C2092v vVar3 = this.f3869e;
                        vVar3.mo14789b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                this.f3869e.mo14790b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14549a() {
        this.f3867c.set(System.currentTimeMillis());
        this.f3467b.mo14303S().mo14207a((C1877a) this, C1908o.C1910a.POSTBACKS, f3866a);
    }

    public void run() {
        if (this.f3868d.mo14540a() > this.f3867c.get()) {
            m4675a(this.f3868d.mo14544b());
        }
        mo14549a();
    }
}
