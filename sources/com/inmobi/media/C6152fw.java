package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.C6155fy;
import java.util.Map;

/* renamed from: com.inmobi.media.fw */
/* compiled from: ConfigNetworkClient */
class C6152fw implements Runnable {

    /* renamed from: a */
    private static final String f15594a = C6152fw.class.getSimpleName();

    /* renamed from: b */
    private C6154fx f15595b;

    /* renamed from: c */
    private C6153a f15596c;

    /* renamed from: d */
    private final C6154fx f15597d;

    /* renamed from: com.inmobi.media.fw$a */
    /* compiled from: ConfigNetworkClient */
    public interface C6153a {
        /* renamed from: a */
        void mo35333a(C6155fy.C6156a aVar);

        /* renamed from: a */
        void mo35334a(String str);
    }

    C6152fw(C6153a aVar, C6154fx fxVar, C6154fx fxVar2) {
        this.f15596c = aVar;
        this.f15595b = fxVar;
        this.f15597d = fxVar2;
    }

    /* renamed from: a */
    private void m18345a(C6154fx fxVar, Map<String, C6155fy.C6156a> map) {
        for (Map.Entry next : map.entrySet()) {
            C6155fy.C6156a aVar = (C6155fy.C6156a) next.getValue();
            String str = (String) next.getKey();
            if (!aVar.mo35341a()) {
                this.f15596c.mo35333a(aVar);
                fxVar.f15603c.remove(str);
            }
        }
    }

    /* renamed from: a */
    private static C6155fy m18344a(C6154fx fxVar) {
        return new C6155fy(fxVar, new C6210ha(fxVar).mo35400a(), SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    private boolean m18346a(C6154fx fxVar, int i, Map<String, C6155fy.C6156a> map) throws InterruptedException {
        if (i > fxVar.f15601a) {
            for (Map.Entry<String, C6144fr> key : fxVar.f15603c.entrySet()) {
                String str = (String) key.getKey();
                if (map.containsKey(str)) {
                    this.f15596c.mo35333a(map.get(str));
                }
            }
            return true;
        }
        Thread.sleep((long) (fxVar.f15602b * 1000));
        return false;
    }

    public void run() {
        Map<String, C6155fy.C6156a> map;
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (i2 > this.f15595b.f15601a) {
                    break;
                }
                C6155fy a = m18344a(this.f15595b);
                map = a.f15605a;
                if (!(a.mo35340a() && this.f15597d != null)) {
                    m18345a(this.f15595b, map);
                    if (this.f15595b.f15603c.isEmpty()) {
                        break;
                    }
                    i2++;
                } else {
                    while (i <= this.f15597d.f15601a) {
                        C6155fy a2 = m18344a(this.f15597d);
                        Map<String, C6155fy.C6156a> map2 = a2.f15605a;
                        if (a2.mo35340a()) {
                            break;
                        }
                        m18345a(this.f15597d, map2);
                        if (this.f15597d.f15603c.isEmpty()) {
                            break;
                        }
                        i++;
                        if (m18346a(this.f15597d, i, map2)) {
                            break;
                        }
                    }
                    this.f15596c.mo35334a(this.f15597d.mo35339b());
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            }
        } while (!m18346a(this.f15595b, i2, map));
        this.f15596c.mo35334a(this.f15595b.mo35339b());
    }
}
