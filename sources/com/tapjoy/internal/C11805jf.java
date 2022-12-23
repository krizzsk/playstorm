package com.tapjoy.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* renamed from: com.tapjoy.internal.jf */
public final class C11805jf {

    /* renamed from: a */
    static final Logger f28821a = Logger.getLogger(C11805jf.class.getName());

    private C11805jf() {
    }

    /* renamed from: a */
    public static C11803jd m34304a(C11814jm jmVar) {
        if (jmVar != null) {
            return new C11809jh(jmVar);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public static C11802jc m34303a(C11813jl jlVar) {
        if (jlVar != null) {
            return new C11808jg(jlVar);
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: a */
    public static C11813jl m34305a(final OutputStream outputStream) {
        final C11815jn jnVar = new C11815jn();
        if (outputStream != null) {
            return new C11813jl() {
                /* renamed from: a */
                public final void mo72750a(C11801jb jbVar, long j) {
                    C11817jo.m34348a(jbVar.f28815b, 0, j);
                    while (j > 0) {
                        jnVar.mo72796a();
                        C11810ji jiVar = jbVar.f28814a;
                        int min = (int) Math.min(j, (long) (jiVar.f28834c - jiVar.f28833b));
                        outputStream.write(jiVar.f28832a, jiVar.f28833b, min);
                        jiVar.f28833b += min;
                        long j2 = (long) min;
                        j -= j2;
                        jbVar.f28815b -= j2;
                        if (jiVar.f28833b == jiVar.f28834c) {
                            jbVar.f28814a = jiVar.mo72793a();
                            C11811jj.m34331a(jiVar);
                        }
                    }
                }

                public final void flush() {
                    outputStream.flush();
                }

                public final void close() {
                    outputStream.close();
                }

                public final String toString() {
                    return "sink(" + outputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: a */
    public static C11814jm m34306a(final InputStream inputStream) {
        final C11815jn jnVar = new C11815jn();
        if (inputStream != null) {
            return new C11814jm() {
                /* renamed from: b */
                public final long mo72751b(C11801jb jbVar, long j) {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                    } else if (i == 0) {
                        return 0;
                    } else {
                        try {
                            jnVar.mo72796a();
                            C11810ji c = jbVar.mo72758c(1);
                            int read = inputStream.read(c.f28832a, c.f28834c, (int) Math.min(j, (long) (8192 - c.f28834c)));
                            if (read == -1) {
                                return -1;
                            }
                            c.f28834c += read;
                            long j2 = (long) read;
                            jbVar.f28815b += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (C11805jf.m34307a(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final void close() {
                    inputStream.close();
                }

                public final String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: a */
    static boolean m34307a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
