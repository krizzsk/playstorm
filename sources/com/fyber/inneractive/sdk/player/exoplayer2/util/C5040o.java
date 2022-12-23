package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.o */
public final class C5040o extends BufferedOutputStream {

    /* renamed from: a */
    public boolean f13451a;

    public C5040o(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public void mo25627a(OutputStream outputStream) {
        C5023a.m15304b(this.f13451a);
        this.out = outputStream;
        this.count = 0;
        this.f13451a = false;
    }

    public void close() throws IOException {
        this.f13451a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            int i = C5049u.f13471a;
            throw th;
        }
    }

    public C5040o(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
