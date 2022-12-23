package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6642b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.utils.e */
public final class C6767e {

    /* renamed from: a */
    public Map<String, Integer> f17688a;

    /* renamed from: b */
    C6766d f17689b;

    /* renamed from: c */
    public IronSourceLoggerManager f17690c;

    /* renamed from: d */
    private Map<String, Integer> f17691d;

    /* renamed from: e */
    private Map<String, String> f17692e;

    /* renamed from: f */
    private String f17693f;

    /* renamed from: g */
    private Timer f17694g = null;

    public C6767e(String str, C6766d dVar) {
        this.f17693f = str;
        this.f17689b = dVar;
        this.f17688a = new HashMap();
        this.f17691d = new HashMap();
        this.f17692e = new HashMap();
        this.f17690c = IronSourceLoggerManager.getLogger();
        mo36959a();
    }

    /* renamed from: a */
    private void m20562a(String str, int i) {
        this.f17691d.put(str, Integer.valueOf(i));
        this.f17692e.put(str, m20565c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20568e(str), i);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20569f(str), m20565c());
    }

    /* renamed from: b */
    private int m20563b(String str) {
        if (!m20565c().equalsIgnoreCase(m20566c(str))) {
            mo36961a(str);
        }
        return m20567d(str);
    }

    /* renamed from: b */
    private static Date m20564b() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    /* renamed from: c */
    private static String m20565c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: c */
    private String m20566c(String str) {
        if (this.f17692e.containsKey(str)) {
            return this.f17692e.get(str);
        }
        String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20569f(str), m20565c());
        this.f17692e.put(str, stringFromSharedPrefs);
        return stringFromSharedPrefs;
    }

    /* renamed from: d */
    private int m20567d(String str) {
        if (this.f17691d.containsKey(str)) {
            return this.f17691d.get(str).intValue();
        }
        int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20568e(str), 0);
        this.f17691d.put(str, Integer.valueOf(intFromSharedPrefs));
        return intFromSharedPrefs;
    }

    /* renamed from: e */
    private static String m20568e(String str) {
        return str + "_counter";
    }

    /* renamed from: f */
    private static String m20569f(String str) {
        return str + "_day";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36959a() {
        Timer timer = this.f17694g;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f17694g = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                C6767e eVar = C6767e.this;
                synchronized (eVar) {
                    try {
                        for (String a : eVar.f17688a.keySet()) {
                            eVar.mo36961a(a);
                        }
                        eVar.f17689b.mo36058g();
                        eVar.mo36959a();
                    } catch (Exception e) {
                        eVar.f17690c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e);
                    }
                }
            }
        }, m20564b());
    }

    /* renamed from: a */
    public final void mo36960a(C6642b bVar) {
        synchronized (this) {
            try {
                String d = mo36964d(bVar);
                if (this.f17688a.containsKey(d)) {
                    m20562a(d, m20563b(d) + 1);
                }
            } catch (Exception e) {
                this.f17690c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36961a(String str) {
        this.f17691d.put(str, 0);
        this.f17692e.put(str, m20565c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20568e(str), 0);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20569f(str), m20565c());
    }

    /* renamed from: b */
    public final boolean mo36962b(C6642b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo36964d(bVar);
                if (!this.f17688a.containsKey(d)) {
                    return false;
                }
                if (m20565c().equalsIgnoreCase(m20566c(d))) {
                    return false;
                }
                if (this.f17688a.get(d).intValue() <= m20567d(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f17690c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo36963c(C6642b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo36964d(bVar);
                if (!this.f17688a.containsKey(d)) {
                    return false;
                }
                if (this.f17688a.get(d).intValue() <= m20563b(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f17690c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public String mo36964d(C6642b bVar) {
        return this.f17693f + "_" + bVar.f17245f + "_" + bVar.mo36637j();
    }
}
