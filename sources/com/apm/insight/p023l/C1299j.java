package com.apm.insight.p023l;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.apm.insight.l.j */
public final class C1299j {

    /* renamed from: a */
    private static final Set<String> f1292a;

    static {
        HashSet hashSet = new HashSet();
        f1292a = hashSet;
        hashSet.add("HeapTaskDaemon");
        f1292a.add("ThreadPlus");
        f1292a.add("ApiDispatcher");
        f1292a.add("ApiLocalDispatcher");
        f1292a.add("AsyncLoader");
        f1292a.add("AsyncTask");
        f1292a.add("Binder");
        f1292a.add("PackageProcessor");
        f1292a.add("SettingsObserver");
        f1292a.add("WifiManager");
        f1292a.add("JavaBridge");
        f1292a.add("Compiler");
        f1292a.add("Signal Catcher");
        f1292a.add("GC");
        f1292a.add("ReferenceQueueDaemon");
        f1292a.add("FinalizerDaemon");
        f1292a.add("FinalizerWatchdogDaemon");
        f1292a.add("CookieSyncManager");
        f1292a.add("RefQueueWorker");
        f1292a.add("CleanupReference");
        f1292a.add("VideoManager");
        f1292a.add("DBHelper-AsyncOp");
        f1292a.add("InstalledAppTracker2");
        f1292a.add("AppData-AsyncOp");
        f1292a.add("IdleConnectionMonitor");
        f1292a.add("LogReaper");
        f1292a.add("ActionReaper");
        f1292a.add("Okio Watchdog");
        f1292a.add("CheckWaitingQueue");
        f1292a.add("NPTH-CrashTimer");
        f1292a.add("NPTH-JavaCallback");
        f1292a.add("NPTH-LocalParser");
        f1292a.add("ANR_FILE_MODIFY");
    }

    /* renamed from: a */
    public static Set<String> m1793a() {
        return f1292a;
    }

    /* renamed from: a */
    public static boolean m1794a(Throwable th) {
        if (th == null) {
            return true;
        }
        try {
            return (th instanceof ConnectTimeoutException) || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof PortUnreachableException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException) || (th instanceof SSLException);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }
}
