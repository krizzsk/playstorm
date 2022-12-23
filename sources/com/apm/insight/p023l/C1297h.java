package com.apm.insight.p023l;

import android.os.Process;
import java.io.File;

/* renamed from: com.apm.insight.l.h */
public final class C1297h {
    /* renamed from: a */
    public static int m1759a() {
        int myPid = Process.myPid();
        try {
            return new File("/proc/" + myPid + "/fd").listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
