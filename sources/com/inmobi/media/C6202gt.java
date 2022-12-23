package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.gt */
/* compiled from: InMobiNetworkClient */
public class C6202gt<T> implements Runnable {

    /* renamed from: b */
    private static final String f15693b = C6202gt.class.getSimpleName();

    /* renamed from: a */
    Class<T> f15694a;

    /* renamed from: c */
    private C6208gz f15695c;

    /* renamed from: d */
    private C6203gu f15696d;

    public C6202gt(C6203gu<T> guVar, C6208gz gzVar, Class<T> cls) {
        this.f15696d = guVar;
        this.f15695c = gzVar;
        this.f15694a = cls;
    }

    /* renamed from: a */
    public final void mo35379a() {
        new Thread(this).start();
    }

    public void run() {
        int i = 0;
        while (i <= this.f15695c.f15729b) {
            C6207gy a = new C6204gv(this.f15695c).mo35383a();
            if (!this.f15695c.f15728a.get()) {
                if (!a.mo35396a()) {
                    try {
                        if (this.f15696d != null) {
                            JSONObject jSONObject = new JSONObject(a.mo35397b());
                            if (this.f15694a.equals(JSONObject.class)) {
                                this.f15696d.mo35382a(jSONObject);
                                return;
                            }
                            this.f15696d.mo35382a(new C6262ij().mo35467a(jSONObject, this.f15694a));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        if (this.f15696d != null && i == this.f15695c.f15729b) {
                            this.f15696d.mo35381a(new C6205gw(-10, e.getMessage()));
                            return;
                        }
                    }
                } else if (i == this.f15695c.f15729b) {
                    this.f15696d.mo35381a(a.f15722a);
                    return;
                }
                try {
                    Thread.sleep((long) (this.f15695c.f15730c * 1000));
                } catch (InterruptedException unused) {
                }
                if (!this.f15695c.f15728a.get()) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
