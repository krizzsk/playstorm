package com.amazon.device.ads;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;

class DtbLog {
    private static final String DEBUG_ERROR = "DTBERROR::";
    private static boolean androidLogAvailable = false;
    private static boolean isCallerInfoEnabled = false;
    private static final Object listenerLock = new Object();
    private static DTBLogLevel logLevel = DTBLogLevel.Warn;
    private static DtbLogListener logListener = null;
    private static final String sdkName = "Amazon DTB Ads API";

    DtbLog() {
    }

    static {
        try {
            Log.isLoggable("1234", 7);
            androidLogAvailable = true;
        } catch (Throwable unused) {
            androidLogAvailable = false;
        }
    }

    protected static void enableCallerInfo(boolean z) {
        isCallerInfoEnabled = z;
    }

    static void setLogLevel(DTBLogLevel dTBLogLevel) {
        logLevel = dTBLogLevel;
    }

    private static String getTag() {
        return isCallerInfoEnabled ? getCallerInfo() : sdkName;
    }

    private static void postMessageToListener(String str, DTBLogLevel dTBLogLevel, String str2) {
        if (logListener != null) {
            synchronized (listenerLock) {
                if (logListener != null && str.equals(logListener.getTag())) {
                    logListener.postMessage(dTBLogLevel, str2);
                }
            }
        }
    }

    public static void info(String str) {
        if (logLevel.intValue() <= DTBLogLevel.Info.intValue() && androidLogAvailable) {
            Log.i(getTag(), str);
        }
    }

    public static void info(String str, String str2) {
        if (logLevel.intValue() <= DTBLogLevel.Info.intValue() && androidLogAvailable) {
            Log.i(str, str2);
            postMessageToListener(str, DTBLogLevel.Info, str2);
        }
    }

    public static void warn(String str) {
        if (logLevel.intValue() <= DTBLogLevel.Warn.intValue() && androidLogAvailable) {
            Log.w(getTag(), str);
        }
    }

    public static void warn(String str, String str2) {
        if (logLevel.intValue() <= DTBLogLevel.Warn.intValue() && androidLogAvailable) {
            Log.w(str, str2);
            postMessageToListener(str, DTBLogLevel.Warn, str2);
        }
    }

    public static void debug(String str) {
        if (logLevel.intValue() <= DTBLogLevel.Debug.intValue() && androidLogAvailable) {
            Log.d(getTag(), str);
        }
    }

    public static void debug(String str, String str2) {
        if (logLevel.intValue() <= DTBLogLevel.Debug.intValue() && androidLogAvailable) {
            Log.d(str, str2);
            postMessageToListener(str, DTBLogLevel.Debug, str2);
        }
    }

    public static void debugError(String str) {
        if (logLevel.intValue() <= DTBLogLevel.Debug.intValue() && androidLogAvailable) {
            String tag = getTag();
            Log.d(tag, DEBUG_ERROR + str);
        }
    }

    public static void debugError(String str, String str2) {
        if (logLevel.intValue() <= DTBLogLevel.Debug.intValue() && androidLogAvailable) {
            Log.d(str, DEBUG_ERROR + str2);
            DTBLogLevel dTBLogLevel = DTBLogLevel.Debug;
            postMessageToListener(str, dTBLogLevel, DEBUG_ERROR + str2);
        }
    }

    public static void error(String str) {
        if (logLevel.intValue() <= DTBLogLevel.Error.intValue() && androidLogAvailable) {
            Log.e(getTag(), str);
        }
    }

    public static void error(String str, String str2) {
        if (logLevel.intValue() <= DTBLogLevel.Error.intValue() && androidLogAvailable) {
            Log.e(str, str2);
            postMessageToListener(str, DTBLogLevel.Error, str2);
        }
    }

    public static void fatal(String str, String str2) {
        if (logLevel.intValue() <= DTBLogLevel.Fatal.intValue() && androidLogAvailable) {
            Log.e(str, str2);
            postMessageToListener(str, DTBLogLevel.Fatal, str2);
        }
    }

    public static void fatal(String str) {
        if (logLevel.intValue() <= DTBLogLevel.Fatal.intValue() && androidLogAvailable) {
            Log.e(getTag(), str);
        }
    }

    public static void fatal(String str, Exception exc) {
        if (logLevel.intValue() <= DTBLogLevel.Fatal.intValue() && androidLogAvailable) {
            Log.e(getTag(), str, exc);
        }
    }

    public static void fatal(String str, String str2, Exception exc) {
        if (logLevel.intValue() <= DTBLogLevel.Fatal.intValue() && androidLogAvailable) {
            Log.e(str, str2, exc);
            postMessageToListener(str, DTBLogLevel.Fatal, str2);
        }
    }

    private static String getCallerInfo() {
        if (!isCallerInfoEnabled) {
            return sdkName;
        }
        StackTraceElement stackTraceElement = null;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            int i = 0;
            while (true) {
                if (i >= stackTrace.length) {
                    break;
                }
                String className = stackTrace[i].getClassName();
                if (className.startsWith("dalvik") || className.startsWith("java")) {
                    i++;
                } else {
                    int i2 = i + 2;
                    if (i2 < stackTrace.length) {
                        i = i2;
                    }
                    stackTraceElement = stackTrace[i];
                }
            }
        }
        if (stackTraceElement == null) {
            return sdkName;
        }
        return stackTraceElement.getClassName() + CertificateUtil.DELIMITER + stackTraceElement.getMethodName() + CertificateUtil.DELIMITER + stackTraceElement.getLineNumber();
    }
}
