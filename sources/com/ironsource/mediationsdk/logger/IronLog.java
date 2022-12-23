package com.ironsource.mediationsdk.logger;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.smaato.sdk.core.dns.DnsName;

public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);
    

    /* renamed from: a */
    private IronSourceLogger.IronSourceTag f17412a;

    private IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f17412a = ironSourceTag;
    }

    /* renamed from: a */
    private String m20368a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return String.format("%s %s", new Object[]{m20370a(stackTrace, 5), m20371b(stackTrace, 5)});
    }

    /* renamed from: a */
    private String m20369a(String str) {
        if (TextUtils.isEmpty(str)) {
            return m20368a();
        }
        return String.format("%s - %s", new Object[]{m20368a(), str});
    }

    /* renamed from: a */
    private static String m20370a(StackTraceElement[] stackTraceElementArr, int i) {
        String[] split = stackTraceElementArr[5].getClassName().split(DnsName.ESCAPED_DOT);
        String str = split[split.length - 1];
        return str.contains("$") ? str.split("\\$")[0] : str;
    }

    /* renamed from: b */
    private static String m20371b(StackTraceElement[] stackTraceElementArr, int i) {
        StackTraceElement stackTraceElement;
        StringBuilder sb;
        StackTraceElement stackTraceElement2;
        String[] split = stackTraceElementArr[5].getClassName().split(DnsName.ESCAPED_DOT);
        String str = split[split.length - 1];
        if (str.contains("$")) {
            String[] split2 = str.split("\\$");
            sb = new StringBuilder();
            sb.append(split2[1]);
            sb.append(".");
            stackTraceElement2 = stackTraceElementArr[5];
        } else {
            if (stackTraceElementArr[5].getMethodName().contains("$")) {
                String[] split3 = stackTraceElementArr[6].getClassName().split("\\$");
                if (split3.length > 1) {
                    sb = new StringBuilder();
                    sb.append(split3[1]);
                    sb.append(".");
                    stackTraceElement2 = stackTraceElementArr[6];
                } else {
                    stackTraceElement = stackTraceElementArr[6];
                }
            } else {
                stackTraceElement = stackTraceElementArr[5];
            }
            return stackTraceElement.getMethodName();
        }
        sb.append(stackTraceElement2.getMethodName());
        return sb.toString();
    }

    public final void error() {
        IronSourceLoggerManager.getLogger().log(this.f17412a, m20369a(""), 3);
    }

    public final void error(String str) {
        IronSourceLoggerManager.getLogger().log(this.f17412a, m20369a(str), 3);
    }

    public final void info() {
        IronSourceLoggerManager.getLogger().log(this.f17412a, m20369a(""), 1);
    }

    public final void info(String str) {
        IronSourceLoggerManager.getLogger().log(this.f17412a, m20369a(str), 1);
    }

    public final void verbose() {
        IronSourceLoggerManager.getLogger().log(this.f17412a, m20369a(""), 0);
    }

    public final void verbose(String str) {
        IronSourceLoggerManager.getLogger().log(this.f17412a, m20369a(str), 0);
    }

    public final void warning() {
        IronSourceLoggerManager.getLogger().log(this.f17412a, m20369a(""), 2);
    }

    public final void warning(String str) {
        IronSourceLoggerManager.getLogger().log(this.f17412a, m20369a(str), 2);
    }
}
