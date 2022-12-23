package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.t1 */
public final class C5227t1 {

    /* renamed from: a */
    public static final int f13895a = m16370a(1, 3);

    /* renamed from: b */
    public static final int f13896b = m16370a(1, 4);

    /* renamed from: c */
    public static final int f13897c = m16370a(2, 0);

    /* renamed from: d */
    public static final int f13898d = m16370a(3, 2);

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$b */
    public enum C5229b {
        DOUBLE(C5234c.DOUBLE, 1),
        FLOAT(C5234c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C5234c.BOOLEAN, 0),
        STRING(C5234c.STRING, 2) {
        },
        GROUP(r13, 3) {
            /* renamed from: f */
            public boolean mo26273f() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            /* renamed from: f */
            public boolean mo26273f() {
                return false;
            }
        },
        BYTES(C5234c.BYTE_STRING, 2) {
            /* renamed from: f */
            public boolean mo26273f() {
                return false;
            }
        },
        UINT32(r11, 0),
        ENUM(C5234c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: a */
        public final C5234c f13918a;

        /* renamed from: b */
        public final int f13919b;

        /* renamed from: f */
        public boolean mo26273f() {
            return !(this instanceof C5230a);
        }

        /* access modifiers changed from: public */
        C5229b(C5234c cVar, int i) {
            this.f13918a = cVar;
            this.f13919b = i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$c */
    public enum C5234c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C5151i.f13766b),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: a */
        public final Object f13930a;

        /* access modifiers changed from: public */
        C5234c(Object obj) {
            this.f13930a = obj;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$d */
    public enum C5235d {
        LOOSE {
            /* renamed from: a */
            public Object mo26274a(C5172j jVar) throws IOException {
                return jVar.mo26068r();
            }
        },
        STRICT {
            /* renamed from: a */
            public Object mo26274a(C5172j jVar) throws IOException {
                return jVar.mo26069s();
            }
        };

        /* 'enum' modifier removed */
        /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$d$c */
        public final class C5238c extends C5235d {
            public C5238c(String str, int i) {
                super(str, i);
            }

            /* renamed from: a */
            public Object mo26274a(C5172j jVar) throws IOException {
                return jVar.mo26054e();
            }
        }

        /* renamed from: a */
        public abstract Object mo26274a(C5172j jVar) throws IOException;
    }

    /* renamed from: a */
    public static int m16370a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: a */
    public static Object m16371a(C5172j jVar, C5229b bVar, C5235d dVar) throws IOException {
        switch (bVar.ordinal()) {
            case 0:
                return Double.valueOf(jVar.mo26056f());
            case 1:
                return Float.valueOf(jVar.mo26060j());
            case 2:
                return Long.valueOf(jVar.mo26062l());
            case 3:
                return Long.valueOf(jVar.mo26072v());
            case 4:
                return Integer.valueOf(jVar.mo26061k());
            case 5:
                return Long.valueOf(jVar.mo26059i());
            case 6:
                return Integer.valueOf(jVar.mo26058h());
            case 7:
                return Boolean.valueOf(jVar.mo26053d());
            case 8:
                return dVar.mo26274a(jVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return jVar.mo26054e();
            case 12:
                return Integer.valueOf(jVar.mo26071u());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(jVar.mo26064n());
            case 15:
                return Long.valueOf(jVar.mo26065o());
            case 16:
                return Integer.valueOf(jVar.mo26066p());
            case 17:
                return Long.valueOf(jVar.mo26067q());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
