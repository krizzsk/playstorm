package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.adcolony.sdk.AdColonyUserMetadata;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: a */
    private String f16481a;

    /* renamed from: b */
    private int f16482b = 999999;

    /* renamed from: c */
    private double f16483c = 999999.99d;

    /* renamed from: d */
    private final String f16484d = "custom";

    /* renamed from: e */
    private final int f16485e = 5;

    /* renamed from: f */
    private int f16486f = -1;

    /* renamed from: g */
    private String f16487g;

    /* renamed from: h */
    private int f16488h = -1;

    /* renamed from: i */
    private AtomicBoolean f16489i = null;

    /* renamed from: j */
    private double f16490j = -1.0d;

    /* renamed from: k */
    private long f16491k = 0;

    /* renamed from: l */
    private Vector<Pair<String, String>> f16492l = new Vector<>();

    /* renamed from: a */
    private static boolean m19460a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: a */
    private static boolean m19461a(String str, int i, int i2) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Vector<Pair<String, String>> mo36116a() {
        Vector<Pair<String, String>> vector = new Vector<>();
        if (this.f16486f != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16486f);
            vector.add(new Pair("age", sb.toString()));
        }
        if (!TextUtils.isEmpty(this.f16487g)) {
            vector.add(new Pair(GENDER, this.f16487g));
        }
        if (this.f16488h != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f16488h);
            vector.add(new Pair(LEVEL, sb2.toString()));
        }
        if (this.f16489i != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f16489i);
            vector.add(new Pair(PAYING, sb3.toString()));
        }
        if (this.f16490j != -1.0d) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f16490j);
            vector.add(new Pair(IAPT, sb4.toString()));
        }
        if (this.f16491k != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f16491k);
            vector.add(new Pair(USER_CREATION_DATE, sb5.toString()));
        }
        if (!TextUtils.isEmpty(this.f16481a)) {
            vector.add(new Pair("segName", this.f16481a));
        }
        vector.addAll(this.f16492l);
        return vector;
    }

    public int getAge() {
        return this.f16486f;
    }

    public String getGender() {
        return this.f16487g;
    }

    public double getIapt() {
        return this.f16490j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f16489i;
    }

    public int getLevel() {
        return this.f16488h;
    }

    public String getSegmentName() {
        return this.f16481a;
    }

    public long getUcd() {
        return this.f16491k;
    }

    public void setAge(int i) {
        if (i <= 0 || i > 199) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setAge( " + i + " ) age must be between 1-199", 2);
            return;
        }
        this.f16486f = i;
    }

    public void setCustom(String str, String str2) {
        try {
            if (!m19460a(str) || !m19460a(str2) || !m19461a(str, 1, 32) || !m19461a(str2, 1, 32)) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
                return;
            }
            String str3 = ContentMetadata.KEY_CUSTOM_PREFIX + str;
            if (this.f16492l.size() >= 5) {
                this.f16492l.remove(0);
            }
            this.f16492l.add(new Pair(str3, str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (TextUtils.isEmpty(str) || (!str.toLowerCase(Locale.ENGLISH).equals(AdColonyUserMetadata.USER_MALE) && !str.toLowerCase(Locale.ENGLISH).equals(AdColonyUserMetadata.USER_FEMALE))) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
            return;
        }
        this.f16487g = str;
    }

    public void setIAPTotal(double d) {
        if (d <= 0.0d || d >= this.f16483c) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f16483c, 2);
            return;
        }
        this.f16490j = Math.floor(d * 100.0d) / 100.0d;
    }

    public void setIsPaying(boolean z) {
        if (this.f16489i == null) {
            this.f16489i = new AtomicBoolean();
        }
        this.f16489i.set(z);
    }

    public void setLevel(int i) {
        if (i <= 0 || i >= this.f16482b) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setLevel( " + i + " ) level must be between 1-" + this.f16482b, 2);
            return;
        }
        this.f16488h = i;
    }

    public void setSegmentName(String str) {
        if (!m19460a(str) || !m19461a(str, 1, 32)) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
            return;
        }
        this.f16481a = str;
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.f16491k = j;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }
}
