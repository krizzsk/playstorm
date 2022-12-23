package com.apm.insight.p023l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.apm.insight.l.e */
public class C1293e extends PrintWriter {

    /* renamed from: a */
    private MessageDigest f1289a = null;

    /* renamed from: b */
    private Charset f1290b = null;

    /* renamed from: c */
    private C1294a f1291c = null;

    /* renamed from: com.apm.insight.l.e$a */
    public static class C1294a {
        /* renamed from: a */
        public boolean mo12300a(String str) {
            return true;
        }
    }

    public C1293e(OutputStream outputStream, MessageDigest messageDigest, C1294a aVar) {
        super(outputStream);
        this.f1289a = messageDigest;
        this.f1291c = aVar;
        if (messageDigest != null) {
            this.f1290b = Charset.defaultCharset();
        }
    }

    public void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f1289a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    public void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f1289a != null) {
            C1294a aVar = this.f1291c;
            if (aVar == null || aVar.mo12300a(str)) {
                this.f1289a.update(this.f1290b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    public void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f1289a;
        if (messageDigest != null) {
            messageDigest.update(this.f1290b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
