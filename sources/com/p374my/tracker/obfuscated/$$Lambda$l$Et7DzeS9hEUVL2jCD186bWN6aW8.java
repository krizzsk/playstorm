package com.p374my.tracker.obfuscated;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* renamed from: com.my.tracker.obfuscated.-$$Lambda$l$Et7DzeS9hEUVL2jCD186bWN6aW8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$l$Et7DzeS9hEUVL2jCD186bWN6aW8 implements Comparator {
    public static final /* synthetic */ $$Lambda$l$Et7DzeS9hEUVL2jCD186bWN6aW8 INSTANCE = new $$Lambda$l$Et7DzeS9hEUVL2jCD186bWN6aW8();

    private /* synthetic */ $$Lambda$l$Et7DzeS9hEUVL2jCD186bWN6aW8() {
    }

    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((ScanResult) obj2).level, ((ScanResult) obj).level);
    }
}
