package com.saypromo.base;

import com.saypromo.core.ExecutorService;
import com.saypromo.core.device.Device;
import com.saypromo.core.log.DeviceLog;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SPDebugLog {
    /* access modifiers changed from: private */
    public static final Object _debugWaitObject = new Object();
    /* access modifiers changed from: private */
    public static final Object _eventsLockObject = new Object();
    /* access modifiers changed from: private */
    public static boolean _loggingEnabled = false;
    public static SPDebugLog sharedInstance = new SPDebugLog();
    public Boolean DebugMode = false;
    private final String _debugURL = "https://api.saypromo.net/ad/debug";
    /* access modifiers changed from: private */
    public final ArrayList<String> _events = new ArrayList<>();
    private final Map<String, Long> _loggers = new HashMap();
    private final String _sessionId = generateAttemptId();

    private void trackBlockEvents(String str) {
    }

    public void AddNewEvent(String str) {
        synchronized (_eventsLockObject) {
            this._events.add(str);
        }
    }

    private SPDebugLog() {
    }

    public void StartLogging() {
        if (!_loggingEnabled) {
            _loggingEnabled = true;
            ExecutorService.getInstance().ExecuteTask(new Runnable() {
                /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                    java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
                    	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                    	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                    	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                    	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                    	at java.base/java.util.ArrayList.get(ArrayList.java:458)
                    	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
                    */
                public void run() {
                    /*
                        r5 = this;
                    L_0x0000:
                        boolean r0 = com.saypromo.base.SPDebugLog._loggingEnabled
                        if (r0 == 0) goto L_0x0060
                        java.lang.Object r0 = com.saypromo.base.SPDebugLog._debugWaitObject
                        monitor-enter(r0)
                        com.saypromo.base.SPDebugLog r1 = com.saypromo.base.SPDebugLog.this     // Catch:{ InterruptedException -> 0x0058 }
                        java.util.ArrayList r1 = r1._events     // Catch:{ InterruptedException -> 0x0058 }
                        int r1 = r1.size()     // Catch:{ InterruptedException -> 0x0058 }
                        if (r1 <= 0) goto L_0x004c
                        com.saypromo.base.SPDebugLog r1 = com.saypromo.base.SPDebugLog.this     // Catch:{ InterruptedException -> 0x0058 }
                        java.util.ArrayList r1 = r1._events     // Catch:{ InterruptedException -> 0x0058 }
                        r2 = 0
                        java.lang.Object r1 = r1.get(r2)     // Catch:{ InterruptedException -> 0x0058 }
                        java.lang.String r1 = (java.lang.String) r1     // Catch:{ InterruptedException -> 0x0058 }
                        java.lang.Object r3 = com.saypromo.base.SPDebugLog._eventsLockObject     // Catch:{ InterruptedException -> 0x0058 }
                        monitor-enter(r3)     // Catch:{ InterruptedException -> 0x0058 }
                        com.saypromo.base.SPDebugLog r4 = com.saypromo.base.SPDebugLog.this     // Catch:{ all -> 0x0049 }
                        java.util.ArrayList r4 = r4._events     // Catch:{ all -> 0x0049 }
                        r4.remove(r2)     // Catch:{ all -> 0x0049 }
                        monitor-exit(r3)     // Catch:{ all -> 0x0049 }
                        if (r1 == 0) goto L_0x004c
                        java.lang.String r2 = ""
                        boolean r2 = r1.equals(r2)     // Catch:{ InterruptedException -> 0x0058 }
                        if (r2 != 0) goto L_0x004c
                        int r2 = com.saypromo.base.SPBaseManager.EventConnectionTimeout     // Catch:{ all -> 0x0044 }
                        com.saypromo.core.InternetService.GetData(r1, r2)     // Catch:{ all -> 0x0044 }
                        monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                        goto L_0x0000
                    L_0x0044:
                        r1 = move-exception
                        r1.printStackTrace()     // Catch:{ InterruptedException -> 0x0058 }
                        goto L_0x004c
                    L_0x0049:
                        r1 = move-exception
                        monitor-exit(r3)     // Catch:{ all -> 0x0049 }
                        throw r1     // Catch:{ InterruptedException -> 0x0058 }
                    L_0x004c:
                        java.lang.Object r1 = com.saypromo.base.SPDebugLog._debugWaitObject     // Catch:{ InterruptedException -> 0x0058 }
                        r2 = 1000(0x3e8, double:4.94E-321)
                        r1.wait(r2)     // Catch:{ InterruptedException -> 0x0058 }
                        goto L_0x005c
                    L_0x0056:
                        r1 = move-exception
                        goto L_0x005e
                    L_0x0058:
                        r1 = move-exception
                        r1.printStackTrace()     // Catch:{ all -> 0x0056 }
                    L_0x005c:
                        monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                        goto L_0x0000
                    L_0x005e:
                        monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                        throw r1
                    L_0x0060:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.saypromo.base.SPDebugLog.C109001.run():void");
                }
            });
        }
    }

    public String newDebugLogger(String str) {
        if (str != null) {
            this._loggers.remove(str);
        }
        String generateAttemptId = generateAttemptId();
        this._loggers.put(generateAttemptId, Long.valueOf(Device.getTimestampInMillis()));
        return generateAttemptId;
    }

    public void trackEventWithId(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3) {
        String str6 = str;
        try {
            if (this._loggers.containsKey(str)) {
                Long l = this._loggers.get(str);
                long timestampInMillis = Device.getTimestampInMillis() - l.longValue();
                String str7 = str2;
                String str8 = str3;
                String GetDebugUrl = SPBaseManager.GetDebugUrl("https://api.saypromo.net/ad/debug", str2, str3);
                StringBuilder sb = new StringBuilder();
                sb.append(GetDebugUrl);
                sb.append("&event=");
                String str9 = str4;
                sb.append(str4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((sb.toString() + "&id=" + str) + "&timestamp=" + l) + "&difftime=" + timestampInMillis);
                sb2.append("&str1=");
                String str10 = str5;
                sb2.append(urlEncodeURLString(str5));
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append("&int1=");
                long j4 = j;
                sb4.append(j);
                AddNewEvent((sb4.toString() + "&int2=" + j2) + "&int3=" + j3);
            }
        } catch (Exception e) {
            DeviceLog.error(e.getLocalizedMessage());
        }
    }

    public void trackEvent(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3) {
        try {
            AddNewEvent((((((((SPBaseManager.GetDebugUrl("https://api.saypromo.net/ad/debug", str2, str3) + "&event=" + str4) + "&id=" + str) + "&timestamp=" + Device.getTimestampInMillis()) + "&difftime=0") + "&str1=" + urlEncodeURLString(str5)) + "&int1=" + j) + "&int2=" + j2) + "&int3=" + j3);
        } catch (Exception e) {
            DeviceLog.error(e.getLocalizedMessage());
        }
    }

    public void trackEventWithoutId(String str, String str2, String str3) {
        trackEventWithoutId(str, str2, str3, "", 0, 0, 0);
    }

    public void trackEventWithoutId(String str, String str2, String str3, String str4, long j, long j2, long j3) {
        try {
            AddNewEvent((((((((SPBaseManager.GetDebugUrl("https://api.saypromo.net/ad/debug", str, str2) + "&event=" + str3) + "&id=" + this._sessionId) + "&timestamp=" + Device.getTimestampInMillis()) + "&difftime=0") + "&str1=" + urlEncodeURLString(str4)) + "&int1=" + j) + "&int2=" + j2) + "&int3=" + j3);
        } catch (Exception e) {
            DeviceLog.error(e.getLocalizedMessage());
        }
    }

    private String generateAttemptId() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 20; i++) {
            stringBuffer.append("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890".charAt((int) (Math.random() * ((double) 62))));
        }
        return stringBuffer.toString();
    }

    private String urlEncodeURLString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            DeviceLog.error(e.getMessage());
            return "error in encode url ";
        }
    }
}
