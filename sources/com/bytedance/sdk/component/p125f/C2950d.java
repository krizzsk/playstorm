package com.bytedance.sdk.component.p125f;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p125f.p126a.C2947a;
import com.bytedance.sdk.component.utils.C2975l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.f.d */
/* compiled from: PoolTaskStatistics */
public class C2950d {

    /* renamed from: a */
    public static final String[] f6700a = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* renamed from: b */
    public static final String[] f6701b = {"tt_pangle", "bd_tracker"};

    /* renamed from: c */
    private static AtomicInteger f6702c = new AtomicInteger(0);

    /* renamed from: d */
    private static int f6703d = 0;

    /* renamed from: e */
    private static int f6704e = 0;

    /* renamed from: a */
    public static void m8300a() {
        int i;
        String str;
        C2949c g = C2952e.m8321g();
        if (g != null) {
            int i2 = 1;
            int addAndGet = f6702c.addAndGet(1);
            if (C2952e.f6711c >= 0 && addAndGet % C2952e.f6711c == 0 && Looper.getMainLooper() != Looper.myLooper()) {
                Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                HashMap hashMap = new HashMap();
                if (allStackTraces != null) {
                    boolean a = C2975l.m8381a();
                    int size = allStackTraces.size();
                    if (size > f6704e) {
                        f6704e = size;
                    }
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
                    int i3 = 0;
                    int i4 = 0;
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        i4 += i2;
                        Thread thread = (Thread) next.getKey();
                        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                        StringBuilder sb = new StringBuilder("\n");
                        if (a) {
                            sb.append("Thread Name is : " + thread.getName());
                            sb.append("\n");
                        }
                        String str2 = null;
                        int length = stackTraceElementArr.length;
                        int i5 = 0;
                        while (i5 < length) {
                            String stackTraceElement = stackTraceElementArr[i5].toString();
                            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                            if (a) {
                                sb.append(stackTraceElement + "\n");
                            }
                            if (TextUtils.isEmpty(str2)) {
                                if (!m8301a(stackTraceElement, f6700a)) {
                                    str = stackTraceElement;
                                    if (!m8301a(thread.getName(), f6701b)) {
                                    }
                                } else {
                                    str = stackTraceElement;
                                }
                                i3++;
                                str2 = str;
                            }
                            i5++;
                            it = it2;
                        }
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
                        if (a) {
                            if (!TextUtils.isEmpty(str2)) {
                                String str3 = str2 + "&" + thread.getName();
                                C2951a aVar = (C2951a) hashMap.get(str3);
                                if (aVar != null) {
                                    i = 1;
                                    aVar.mo17871a(aVar.mo17870a() + 1);
                                } else {
                                    i = 1;
                                    aVar = new C2951a(str3, 1, sb.toString(), thread.getName());
                                }
                                hashMap.put(str3, aVar);
                            } else {
                                i = 1;
                            }
                            if (!TextUtils.isEmpty(sb.toString())) {
                                Log.e("PoolTaskStatistics", "Thread index = " + i4 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                                Log.w("PoolTaskStatistics", sb.toString());
                            }
                        } else {
                            i = 1;
                        }
                        i2 = i;
                        it = it3;
                    }
                    if (i3 > f6703d) {
                        f6703d = i3;
                    }
                    if (a) {
                        Log.e("PoolTaskStatistics", "SDK current threads=" + i3 + ", SDK Max threads=" + f6703d + ", Application threads = " + size + ", Application max threads = " + f6704e);
                        for (Map.Entry value : hashMap.entrySet()) {
                            Log.i("PoolTaskStatistics", ((C2951a) value.getValue()).toString());
                        }
                    }
                    g.mo17869a(new C2947a(i3, f6703d, size, f6704e));
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m8301a(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String contains : strArr) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: com.bytedance.sdk.component.f.d$a */
    /* compiled from: PoolTaskStatistics */
    public static class C2951a {

        /* renamed from: a */
        public int f6705a = 0;

        /* renamed from: b */
        public String f6706b = null;

        /* renamed from: c */
        public String f6707c = null;

        /* renamed from: d */
        public String f6708d = null;

        public C2951a(String str, int i, String str2, String str3) {
            this.f6707c = str;
            this.f6705a = i;
            this.f6708d = str2;
            this.f6706b = str3;
        }

        /* renamed from: a */
        public void mo17871a(int i) {
            this.f6705a = i;
        }

        /* renamed from: a */
        public int mo17870a() {
            return this.f6705a;
        }

        public String toString() {
            return "ThreadModel{times=" + this.f6705a + ", name='" + this.f6706b + '\'' + ", lastStackStack='" + this.f6707c + '\'' + '}';
        }
    }
}
