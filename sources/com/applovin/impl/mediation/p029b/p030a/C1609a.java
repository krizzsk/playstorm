package com.applovin.impl.mediation.p029b.p030a;

import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2079l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.applovin.impl.mediation.b.a.a */
public class C1609a {

    /* renamed from: a */
    private final C2079l<Integer> f2185a = new C2079l<>();

    /* renamed from: b */
    private final TreeSet<Integer> f2186b = new TreeSet<>();

    /* renamed from: c */
    private final Map<Integer, MaxAd> f2187c = new HashMap();

    /* renamed from: d */
    private int f2188d;

    /* renamed from: e */
    private int f2189e;

    public C1609a(MaxAdPlacerSettings maxAdPlacerSettings) {
        m3158a(maxAdPlacerSettings);
    }

    /* renamed from: a */
    private int m3157a(int i, boolean z) {
        int d = this.f2185a.mo14736d(Integer.valueOf(i));
        if (!z) {
            int i2 = i + d;
            while (d < this.f2185a.size() && i2 >= this.f2185a.mo14725a(d).intValue()) {
                i2++;
                d++;
            }
        }
        return d;
    }

    /* renamed from: a */
    private void m3158a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            C2092v.m5053i("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f2185a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (maxAdPlacerSettings.isRepeatingEnabled()) {
            int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
            if (this.f2185a.isEmpty()) {
                this.f2185a.add(Integer.valueOf(repeatingInterval - 1));
            }
            int intValue = this.f2185a.mo14724a().intValue();
            while (true) {
                intValue += repeatingInterval;
                if (this.f2185a.size() < maxAdPlacerSettings.getMaxAdCount()) {
                    this.f2185a.add(Integer.valueOf(intValue));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private void m3159c(int i, int i2) {
        if (this.f2187c.containsKey(Integer.valueOf(i))) {
            this.f2187c.put(Integer.valueOf(i2), this.f2187c.get(Integer.valueOf(i)));
            this.f2186b.add(Integer.valueOf(i2));
            this.f2187c.remove(Integer.valueOf(i));
            this.f2186b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public int mo13313a() {
        int i = this.f2188d;
        if (!(i == -1 || this.f2189e == -1)) {
            while (i <= this.f2189e) {
                if (mo13317a(i) && !mo13320b(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo13314a(int i, int i2) {
        this.f2188d = i;
        this.f2189e = i2;
    }

    /* renamed from: a */
    public void mo13315a(MaxAd maxAd, int i) {
        this.f2187c.put(Integer.valueOf(i), maxAd);
        this.f2186b.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo13316a(Collection<Integer> collection) {
        for (Integer next : collection) {
            this.f2187c.remove(next);
            this.f2186b.remove(next);
        }
    }

    /* renamed from: a */
    public boolean mo13317a(int i) {
        return this.f2185a.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public Collection<Integer> mo13318b() {
        return new TreeSet(this.f2186b);
    }

    /* renamed from: b */
    public void mo13319b(int i, int i2) {
        mo13328i(i);
        mo13327h(i2);
    }

    /* renamed from: b */
    public boolean mo13320b(int i) {
        return this.f2186b.contains(Integer.valueOf(i));
    }

    /* renamed from: c */
    public MaxAd mo13321c(int i) {
        return this.f2187c.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo13322c() {
        this.f2187c.clear();
        this.f2186b.clear();
    }

    /* renamed from: d */
    public Collection<Integer> mo13323d(int i) {
        return new TreeSet(this.f2186b.tailSet(Integer.valueOf(i), false));
    }

    /* renamed from: e */
    public int mo13324e(int i) {
        if (i == 0) {
            return 0;
        }
        return i + m3157a(i - 1, false);
    }

    /* renamed from: f */
    public int mo13325f(int i) {
        return i + m3157a(i, false);
    }

    /* renamed from: g */
    public int mo13326g(int i) {
        if (mo13317a(i)) {
            return -1;
        }
        return i - m3157a(i, true);
    }

    /* renamed from: h */
    public void mo13327h(int i) {
        int c = this.f2185a.mo14732c(Integer.valueOf(i));
        for (int size = this.f2185a.size() - 1; size >= c; size--) {
            Integer a = this.f2185a.mo14725a(size);
            int intValue = a.intValue() + 1;
            m3159c(a.intValue(), intValue);
            this.f2185a.mo14726a(size, Integer.valueOf(intValue));
        }
    }

    /* renamed from: i */
    public void mo13328i(int i) {
        int c = this.f2185a.mo14732c(Integer.valueOf(i));
        if (mo13317a(i)) {
            this.f2187c.remove(Integer.valueOf(i));
            this.f2186b.remove(Integer.valueOf(i));
            this.f2185a.mo14731b(c);
        }
        while (c < this.f2185a.size()) {
            Integer a = this.f2185a.mo14725a(c);
            int intValue = a.intValue() - 1;
            m3159c(a.intValue(), intValue);
            this.f2185a.mo14726a(c, Integer.valueOf(intValue));
            c++;
        }
    }
}
