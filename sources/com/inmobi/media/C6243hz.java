package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.inmobi.media.hz */
/* compiled from: SystemBroadcastObserver */
public class C6243hz {

    /* renamed from: a */
    private static final String f15805a = C6243hz.class.getSimpleName();

    /* renamed from: b */
    private static HashMap<String, CopyOnWriteArrayList<C6247c>> f15806b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, C6246b> f15807c = new HashMap<>();

    /* renamed from: d */
    private static HashMap<String, ConnectivityManager.NetworkCallback> f15808d = new HashMap<>();

    /* renamed from: com.inmobi.media.hz$a */
    /* compiled from: SystemBroadcastObserver */
    static class C6245a {

        /* renamed from: a */
        static final C6243hz f15810a = new C6243hz();
    }

    /* renamed from: com.inmobi.media.hz$c */
    /* compiled from: SystemBroadcastObserver */
    public interface C6247c {
        /* renamed from: a */
        void mo34838a(boolean z);
    }

    /* renamed from: a */
    public static C6243hz m18635a() {
        return C6245a.f15810a;
    }

    /* renamed from: a */
    public final void mo35460a(String str, C6247c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = f15806b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(cVar);
        }
        f15806b.put(str, copyOnWriteArrayList);
        if (copyOnWriteArrayList.size() == 1) {
            m18637a(str);
        }
    }

    /* renamed from: a */
    public final void mo35459a(C6247c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            mo35460a("android.net.conn.CONNECTIVITY_CHANGE", cVar);
        } else {
            mo35460a("SYSTEM_CONNECTIVITY_CHANGE", cVar);
        }
    }

    /* renamed from: a */
    private void m18637a(String str) {
        Context c = C6227ho.m18551c();
        if (c == null) {
            return;
        }
        if ("SYSTEM_CONNECTIVITY_CHANGE".equals(str)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
            if (connectivityManager != null) {
                C62441 r1 = new ConnectivityManager.NetworkCallback() {
                    public final void onAvailable(Network network) {
                        super.onAvailable(network);
                        C6243hz.m18641b(true, "SYSTEM_CONNECTIVITY_CHANGE");
                    }

                    public final void onLost(Network network) {
                        super.onLost(network);
                        C6243hz.m18641b(false, "SYSTEM_CONNECTIVITY_CHANGE");
                    }
                };
                f15808d.put(str, r1);
                connectivityManager.registerDefaultNetworkCallback(r1);
                return;
            }
            return;
        }
        C6246b bVar = new C6246b();
        f15807c.put(str, bVar);
        c.registerReceiver(bVar, new IntentFilter(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m18641b(boolean z, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = f15806b.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((C6247c) it.next()).mo34838a(z);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18636a(C6247c cVar, String str) {
        Context c;
        CopyOnWriteArrayList copyOnWriteArrayList = f15806b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(cVar);
            if (copyOnWriteArrayList.size() == 0 && (c = C6227ho.m18551c()) != null) {
                if ("SYSTEM_CONNECTIVITY_CHANGE".equals(str) && f15808d.get(str) != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
                    if (connectivityManager != null) {
                        connectivityManager.unregisterNetworkCallback(f15808d.get(str));
                        f15808d.remove(str);
                    }
                } else if (f15807c.get(str) != null) {
                    c.unregisterReceiver(f15807c.get(str));
                    f15807c.remove(str);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m18640b(C6247c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            m18636a(cVar, "android.net.conn.CONNECTIVITY_CHANGE");
        } else {
            m18636a(cVar, "SYSTEM_CONNECTIVITY_CHANGE");
        }
    }

    /* renamed from: com.inmobi.media.hz$b */
    /* compiled from: SystemBroadcastObserver */
    static final class C6246b extends BroadcastReceiver {

        /* renamed from: a */
        private static final String f15811a = C6246b.class.getSimpleName();

        C6246b() {
        }

        public final void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (intent != null) {
                try {
                    if (intent.getAction() != null) {
                        boolean z = true;
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
                                C6243hz.m18641b(z, intent.getAction());
                                intent.getAction();
                            }
                        } else if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equalsIgnoreCase(intent.getAction())) {
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                                z = powerManager.isDeviceIdleMode();
                                C6243hz.m18641b(z, intent.getAction());
                                intent.getAction();
                            }
                        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                            C6243hz.m18641b(z, intent.getAction());
                            intent.getAction();
                        }
                        z = false;
                        C6243hz.m18641b(z, intent.getAction());
                        intent.getAction();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
