package com.p374my.target;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.my.target.-$$Lambda$d7v3j7XBshhqSN5SzMHtC3zqH3Q  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$d7v3j7XBshhqSN5SzMHtC3zqH3Q implements Comparator {
    public static final /* synthetic */ $$Lambda$d7v3j7XBshhqSN5SzMHtC3zqH3Q INSTANCE = new $$Lambda$d7v3j7XBshhqSN5SzMHtC3zqH3Q();

    private /* synthetic */ $$Lambda$d7v3j7XBshhqSN5SzMHtC3zqH3Q() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
