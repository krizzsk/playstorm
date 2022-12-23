package com.tapjoy.internal;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tapjoy.internal.el */
public abstract class C11556el<E> {

    /* renamed from: c */
    public static final C11556el<Boolean> f27954c = new C11556el<Boolean>(C11551ei.VARINT, Boolean.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo72342a(Object obj) {
            return 1;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72368c(((Boolean) obj).booleanValue() ? 1 : 0);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            int c = emVar.mo72362c();
            if (c == 0) {
                return Boolean.FALSE;
            }
            if (c == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(c)}));
        }
    };

    /* renamed from: d */
    public static final C11556el<Integer> f27955d = new C11556el<Integer>(C11551ei.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                return C11573en.m33570a(intValue);
            }
            return 10;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                enVar.mo72368c(intValue);
            } else {
                enVar.mo72369c((long) intValue);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return Integer.valueOf(emVar.mo72362c());
        }
    };

    /* renamed from: e */
    public static final C11556el<Integer> f27956e = new C11556el<Integer>(C11551ei.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            return C11573en.m33570a(((Integer) obj).intValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72368c(((Integer) obj).intValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return Integer.valueOf(emVar.mo72362c());
        }
    };

    /* renamed from: f */
    public static final C11556el<Integer> f27957f = new C11556el<Integer>(C11551ei.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            return C11573en.m33570a(C11573en.m33573b(((Integer) obj).intValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72368c(C11573en.m33573b(((Integer) obj).intValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            int c = emVar.mo72362c();
            return Integer.valueOf((-(c & 1)) ^ (c >>> 1));
        }
    };

    /* renamed from: g */
    public static final C11556el<Integer> f27958g;

    /* renamed from: h */
    public static final C11556el<Integer> f27959h;

    /* renamed from: i */
    public static final C11556el<Long> f27960i = new C11556el<Long>(C11551ei.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            return C11573en.m33572a(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72369c(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return Long.valueOf(emVar.mo72363d());
        }
    };

    /* renamed from: j */
    public static final C11556el<Long> f27961j = new C11556el<Long>(C11551ei.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            return C11573en.m33572a(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72369c(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return Long.valueOf(emVar.mo72363d());
        }
    };

    /* renamed from: k */
    public static final C11556el<Long> f27962k = new C11556el<Long>(C11551ei.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            return C11573en.m33572a(C11573en.m33574b(((Long) obj).longValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72369c(C11573en.m33574b(((Long) obj).longValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            long d = emVar.mo72363d();
            return Long.valueOf((-(d & 1)) ^ (d >>> 1));
        }
    };

    /* renamed from: l */
    public static final C11556el<Long> f27963l;

    /* renamed from: m */
    public static final C11556el<Long> f27964m;

    /* renamed from: n */
    public static final C11556el<Float> f27965n = new C11556el<Float>(C11551ei.FIXED32, Float.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo72342a(Object obj) {
            return 4;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72370d(Float.floatToIntBits(((Float) obj).floatValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return Float.valueOf(Float.intBitsToFloat(emVar.mo72364e()));
        }
    };

    /* renamed from: o */
    public static final C11556el<Double> f27966o = new C11556el<Double>(C11551ei.FIXED64, Double.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo72342a(Object obj) {
            return 8;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72371d(Double.doubleToLongBits(((Double) obj).doubleValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return Double.valueOf(Double.longBitsToDouble(emVar.mo72365f()));
        }
    };

    /* renamed from: p */
    public static final C11556el<String> f27967p = new C11556el<String>(C11551ei.LENGTH_DELIMITED, String.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            int i;
            String str = (String) obj;
            int length = str.length();
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt >= 128) {
                    if (charAt < 2048) {
                        i3 += 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i3 += 3;
                    } else if (charAt <= 56319 && (i = i2 + 1) < length && str.charAt(i) >= 56320 && str.charAt(i) <= 57343) {
                        i3 += 4;
                        i2 = i;
                    }
                    i2++;
                }
                i3++;
                i2++;
            }
            return i3;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.f27982a.mo72754b((String) obj);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return emVar.f27974a.mo72759c(emVar.mo72366g());
        }
    };

    /* renamed from: q */
    public static final C11556el<C11804je> f27968q = new C11556el<C11804je>(C11551ei.LENGTH_DELIMITED, C11804je.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            return ((C11804je) obj).mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            enVar.mo72367a((C11804je) obj);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return emVar.f27974a.mo72755b(emVar.mo72366g());
        }
    };

    /* renamed from: a */
    final Class<?> f27969a;

    /* renamed from: b */
    C11556el<List<E>> f27970b;

    /* renamed from: r */
    private final C11551ei f27971r;

    /* renamed from: a */
    public abstract int mo72342a(E e);

    /* renamed from: a */
    public abstract E mo72344a(C11572em emVar);

    /* renamed from: a */
    public abstract void mo72345a(C11573en enVar, E e);

    public C11556el(C11551ei eiVar, Class<?> cls) {
        this.f27971r = eiVar;
        this.f27969a = cls;
    }

    /* renamed from: a */
    public int mo72352a(int i, E e) {
        int a = mo72342a(e);
        if (this.f27971r == C11551ei.LENGTH_DELIMITED) {
            a += C11573en.m33570a(a);
        }
        return a + C11573en.m33570a(C11573en.m33571a(i, C11551ei.VARINT));
    }

    /* renamed from: a */
    public void mo72356a(C11573en enVar, int i, E e) {
        enVar.mo72368c(C11573en.m33571a(i, this.f27971r));
        if (this.f27971r == C11551ei.LENGTH_DELIMITED) {
            enVar.mo72368c(mo72342a(e));
        }
        mo72345a(enVar, e);
    }

    /* renamed from: a */
    public final void mo72357a(C11802jc jcVar, E e) {
        C11555ek.m33503a(e, "value == null");
        C11555ek.m33503a(jcVar, "sink == null");
        mo72345a(new C11573en(jcVar), e);
    }

    /* renamed from: b */
    public final byte[] mo72358b(E e) {
        C11555ek.m33503a(e, "value == null");
        C11801jb jbVar = new C11801jb();
        try {
            mo72357a((C11802jc) jbVar, e);
            return jbVar.mo72773h();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    public final E mo72355a(byte[] bArr) {
        C11555ek.m33503a(bArr, "bytes == null");
        C11801jb jbVar = new C11801jb();
        if (bArr != null) {
            return mo72354a((C11803jd) jbVar.mo72747a(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final E mo72354a(C11803jd jdVar) {
        C11555ek.m33503a(jdVar, "source == null");
        return mo72344a(new C11572em(jdVar));
    }

    /* renamed from: c */
    public static String m33504c(E e) {
        return e.toString();
    }

    static {
        C1155810 r0 = new C11556el<Integer>(C11551ei.FIXED32, Integer.class) {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo72342a(Object obj) {
                return 4;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
                enVar.mo72370d(((Integer) obj).intValue());
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo72344a(C11572em emVar) {
                return Integer.valueOf(emVar.mo72364e());
            }
        };
        f27958g = r0;
        f27959h = r0;
        C1156214 r02 = new C11556el<Long>(C11551ei.FIXED64, Long.class) {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo72342a(Object obj) {
                return 8;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
                enVar.mo72371d(((Long) obj).longValue());
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo72344a(C11572em emVar) {
                return Long.valueOf(emVar.mo72365f());
            }
        };
        f27963l = r02;
        f27964m = r02;
    }

    /* renamed from: a */
    public final C11556el<List<E>> mo72353a() {
        C11556el<List<E>> elVar = this.f27970b;
        if (elVar != null) {
            return elVar;
        }
        C115676 r0 = new C11556el<List<E>>(this.f27971r, List.class) {
            /* renamed from: a */
            public final /* synthetic */ int mo72352a(int i, Object obj) {
                List list = (List) obj;
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += C11556el.this.mo72352a(i, list.get(i3));
                }
                return i2;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo72356a(C11573en enVar, int i, Object obj) {
                List list = (List) obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C11556el.this.mo72356a(enVar, i, list.get(i2));
                }
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo72344a(C11572em emVar) {
                return Collections.singletonList(C11556el.this.mo72344a(emVar));
            }

            /* renamed from: a */
            public final /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            /* renamed from: a */
            public final /* synthetic */ int mo72342a(Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }
        };
        this.f27970b = r0;
        return r0;
    }

    /* renamed from: com.tapjoy.internal.el$a */
    public static final class C11571a extends IllegalArgumentException {

        /* renamed from: a */
        public final int f27973a;

        C11571a(int i, Class<?> cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.f27973a = i;
        }
    }
}
