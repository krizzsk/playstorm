package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.d */
public class C5319d {

    /* renamed from: b */
    public static C5319d f14156b = new C5319d();

    /* renamed from: a */
    public Queue<ByteBuffer> f14157a = new ConcurrentLinkedQueue();

    public C5319d() {
        for (int i = 0; i < 2; i++) {
            this.f14157a.offer(mo26441a());
        }
    }

    /* renamed from: a */
    public final ByteBuffer mo26441a() {
        return ByteBuffer.allocateDirect(16384);
    }

    /* renamed from: b */
    public ByteBuffer mo26442b() {
        ByteBuffer poll = this.f14157a.poll();
        return poll == null ? ByteBuffer.allocateDirect(16384) : poll;
    }
}
