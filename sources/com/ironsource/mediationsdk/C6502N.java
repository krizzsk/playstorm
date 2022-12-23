package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.N */
public final class C6502N {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<C6498L>> f16623a = new ConcurrentHashMap<>();

    /* renamed from: b */
    String f16624b = "";

    /* renamed from: c */
    C6498L f16625c;

    /* renamed from: d */
    ConcurrentHashMap<String, AdInfo> f16626d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private String f16627e = "";

    /* renamed from: f */
    private final List<String> f16628f;

    /* renamed from: g */
    private final int f16629g;

    /* renamed from: h */
    private final Timer f16630h = new Timer();

    public C6502N(List<String> list, int i) {
        this.f16628f = list;
        this.f16629g = i;
    }

    /* renamed from: c */
    private synchronized boolean m19632c() {
        return this.f16625c != null && this.f16625c.f16599b.equals(this.f16627e);
    }

    /* renamed from: d */
    private void m19633d() {
        Iterator<C6498L> it = mo36220a().iterator();
        while (it.hasNext()) {
            C6560aa next = it.next();
            if (!next.equals(this.f16625c)) {
                next.mo36288d();
            }
        }
    }

    /* renamed from: a */
    public final AdInfo mo36219a(String str) {
        if (this.f16626d.containsKey(str)) {
            return this.f16626d.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<C6498L> mo36220a() {
        CopyOnWriteArrayList<C6498L> copyOnWriteArrayList = this.f16623a.get(this.f16624b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final synchronized void mo36221a(C6498L l) {
        IronLog.INTERNAL.verbose("");
        if (this.f16625c != null && !this.f16625c.equals(l)) {
            this.f16625c.mo36288d();
        }
        this.f16625c = l;
    }

    /* renamed from: a */
    public final void mo36222a(String str, ImpressionData impressionData) {
        if (!TextUtils.isEmpty(str) && impressionData != null) {
            this.f16626d.put(str, new AdInfo(impressionData));
        }
    }

    /* renamed from: a */
    public final void mo36223a(CopyOnWriteArrayList<C6498L> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m19633d();
        this.f16623a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f16627e)) {
            if (m19632c()) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("ad from previous waterfall " + this.f16627e + " is still showing - the current waterfall " + this.f16624b + " will be deleted instead");
                String str2 = this.f16624b;
                this.f16624b = this.f16627e;
                this.f16627e = str2;
            }
            final String str3 = this.f16627e;
            this.f16630h.schedule(new TimerTask() {
                public final void run() {
                    try {
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                        C6502N.this.f16623a.remove(str3);
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.verbose("waterfall size is currently " + C6502N.this.f16623a.size());
                        IronLog ironLog3 = IronLog.INTERNAL;
                        ironLog3.verbose("removing adInfo with id " + str3 + " from memory");
                        C6502N.this.f16626d.remove(str3);
                        IronLog ironLog4 = IronLog.INTERNAL;
                        ironLog4.verbose("adInfo size is currently " + C6502N.this.f16626d.size());
                    } finally {
                        cancel();
                    }
                }
            }, (long) this.f16629g);
        }
        this.f16627e = this.f16624b;
        this.f16624b = str;
    }

    /* renamed from: b */
    public final boolean mo36224b() {
        return this.f16623a.size() > 5;
    }

    /* renamed from: b */
    public final synchronized boolean mo36225b(C6498L l) {
        boolean z;
        IronLog.INTERNAL.verbose("");
        if (l != null) {
            if (this.f16625c != null) {
                if (l.mo36203c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.f16625c.mo36401k().equals(l.mo36401k())) {
                    if ((l.mo36203c() == LoadWhileShowSupportState.NONE || this.f16628f.contains(l.mo36402l())) && this.f16625c.mo36402l().equals(l.mo36402l())) {
                    }
                }
            }
            z = false;
            if (z && l != null) {
                IronLog.INTERNAL.verbose(l.mo36401k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        IronLog.INTERNAL.verbose(l.mo36401k() + " does not support load while show and will not be added to the auction request");
        return !z;
    }
}
