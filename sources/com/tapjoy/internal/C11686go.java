package com.tapjoy.internal;

import java.nio.CharBuffer;

/* renamed from: com.tapjoy.internal.go */
public final class C11686go {
    /* renamed from: a */
    private static long m33920a(Readable readable, Appendable appendable) {
        CharBuffer allocate = CharBuffer.allocate(2048);
        long j = 0;
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return j;
            }
            allocate.flip();
            appendable.append(allocate, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static StringBuilder m33921a(Readable readable) {
        StringBuilder sb = new StringBuilder();
        m33920a(readable, sb);
        return sb;
    }
}
