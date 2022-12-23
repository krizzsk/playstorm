package com.ironsource.mediationsdk.logger;

public abstract class IronSourceLogger {

    /* renamed from: a */
    int f17415a;

    /* renamed from: b */
    String f17416b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    IronSourceLogger(String str) {
        this.f17416b = str;
        this.f17415a = 0;
    }

    IronSourceLogger(String str, int i) {
        this.f17416b = str;
        this.f17415a = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f17416b;
            return str != null && str.equals(ironSourceLogger.f17416b);
        }
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i) {
        this.f17415a = i;
    }
}
