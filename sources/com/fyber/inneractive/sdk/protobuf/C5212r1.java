package com.fyber.inneractive.sdk.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.r1 */
public final class C5212r1 {

    /* renamed from: a */
    public static final Unsafe f13862a;

    /* renamed from: b */
    public static final Class<?> f13863b = C5130d.f13734a;

    /* renamed from: c */
    public static final boolean f13864c;

    /* renamed from: d */
    public static final boolean f13865d;

    /* renamed from: e */
    public static final C5216d f13866e;

    /* renamed from: f */
    public static final boolean f13867f;

    /* renamed from: g */
    public static final boolean f13868g;

    /* renamed from: h */
    public static final long f13869h = ((long) m16215a((Class<?>) byte[].class));

    /* renamed from: i */
    public static final long f13870i;

    /* renamed from: j */
    public static final boolean f13871j;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$d */
    public static abstract class C5216d {

        /* renamed from: a */
        public Unsafe f13872a;

        public C5216d(Unsafe unsafe) {
            this.f13872a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo26230a(long j);

        /* renamed from: a */
        public abstract void mo26231a(long j, byte[] bArr, long j2, long j3);

        /* renamed from: a */
        public abstract void mo26232a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo26233a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo26234a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo26235a(Object obj, long j, boolean z);

        /* renamed from: a */
        public boolean mo26241a() {
            Unsafe unsafe = this.f13872a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", new Class[]{Object.class, cls2});
                cls.getMethod("putInt", new Class[]{Object.class, cls2, Integer.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, cls2});
                cls.getMethod("putLong", new Class[]{Object.class, cls2, cls2});
                cls.getMethod("getObject", new Class[]{Object.class, cls2});
                cls.getMethod("putObject", new Class[]{Object.class, cls2, Object.class});
                return true;
            } catch (Throwable th) {
                C5212r1.m16225a(th);
                return false;
            }
        }

        /* renamed from: a */
        public abstract boolean mo26236a(Object obj, long j);

        /* renamed from: b */
        public abstract byte mo26237b(Object obj, long j);

        /* renamed from: b */
        public abstract boolean mo26238b();

        /* renamed from: c */
        public abstract double mo26239c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo26240d(Object obj, long j);
    }

    static {
        Unsafe unsafe;
        boolean z;
        boolean z2;
        Class<double[]> cls = double[].class;
        Class<float[]> cls2 = float[].class;
        Class<long[]> cls3 = long[].class;
        Class<int[]> cls4 = int[].class;
        Class<boolean[]> cls5 = boolean[].class;
        C5216d dVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C5209q1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f13862a = unsafe;
        boolean c = m16232c(Long.TYPE);
        f13864c = c;
        boolean c2 = m16232c(Integer.TYPE);
        f13865d = c2;
        if (unsafe != null) {
            if (!C5130d.m15540a()) {
                dVar = new C5215c(unsafe);
            } else if (c) {
                dVar = new C5214b(unsafe);
            } else if (c2) {
                dVar = new C5213a(unsafe);
            }
        }
        f13866e = dVar;
        boolean z3 = false;
        if (dVar == null) {
            z = false;
        } else {
            z = dVar.mo26238b();
        }
        f13867f = z;
        if (dVar == null) {
            z2 = false;
        } else {
            z2 = dVar.mo26241a();
        }
        f13868g = z2;
        m16215a((Class<?>) cls5);
        m16228b(cls5);
        m16215a((Class<?>) cls4);
        m16228b(cls4);
        m16215a((Class<?>) cls3);
        m16228b(cls3);
        m16215a((Class<?>) cls2);
        m16228b(cls2);
        m16215a((Class<?>) cls);
        m16228b(cls);
        m16215a((Class<?>) Object[].class);
        m16228b(Object[].class);
        Field a = m16217a();
        f13870i = (a == null || dVar == null) ? -1 : dVar.f13872a.objectFieldOffset(a);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z3 = true;
        }
        f13871j = z3;
    }

    /* renamed from: a */
    public static int m16215a(Class<?> cls) {
        if (f13868g) {
            return f13866e.f13872a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static int m16228b(Class<?> cls) {
        if (f13868g) {
            return f13866e.f13872a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m16232c(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C5130d.m15540a()) {
            return false;
        }
        try {
            Class<?> cls3 = f13863b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static byte m16233d(Object obj, long j) {
        return (byte) ((m16234e(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: e */
    public static int m16234e(Object obj, long j) {
        return f13866e.f13872a.getInt(obj, j);
    }

    /* renamed from: f */
    public static long m16235f(Object obj, long j) {
        return f13866e.f13872a.getLong(obj, j);
    }

    /* renamed from: g */
    public static Object m16236g(Object obj, long j) {
        return f13866e.f13872a.getObject(obj, j);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$a */
    public static final class C5213a extends C5216d {
        public C5213a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public void mo26232a(Object obj, long j, byte b) {
            if (C5212r1.f13871j) {
                C5212r1.m16218a(obj, j, b);
            } else {
                C5212r1.m16229b(obj, j, b);
            }
        }

        /* renamed from: b */
        public byte mo26237b(Object obj, long j) {
            if (C5212r1.f13871j) {
                return C5212r1.m16231c(obj, j);
            }
            return C5212r1.m16233d(obj, j);
        }

        /* renamed from: b */
        public boolean mo26238b() {
            return false;
        }

        /* renamed from: c */
        public double mo26239c(Object obj, long j) {
            return Double.longBitsToDouble(this.f13872a.getLong(obj, j));
        }

        /* renamed from: d */
        public float mo26240d(Object obj, long j) {
            return Float.intBitsToFloat(this.f13872a.getInt(obj, j));
        }

        /* renamed from: a */
        public boolean mo26236a(Object obj, long j) {
            if (C5212r1.f13871j) {
                return C5212r1.m16227a(obj, j);
            }
            return C5212r1.m16230b(obj, j);
        }

        /* renamed from: a */
        public void mo26235a(Object obj, long j, boolean z) {
            if (C5212r1.f13871j) {
                C5212r1.m16218a(obj, j, z ? (byte) 1 : 0);
            } else {
                C5212r1.m16229b(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo26234a(Object obj, long j, float f) {
            this.f13872a.putInt(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public void mo26233a(Object obj, long j, double d) {
            this.f13872a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public byte mo26230a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo26231a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$b */
    public static final class C5214b extends C5216d {
        public C5214b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public void mo26232a(Object obj, long j, byte b) {
            if (C5212r1.f13871j) {
                C5212r1.m16218a(obj, j, b);
            } else {
                C5212r1.m16229b(obj, j, b);
            }
        }

        /* renamed from: b */
        public byte mo26237b(Object obj, long j) {
            if (C5212r1.f13871j) {
                return C5212r1.m16231c(obj, j);
            }
            return C5212r1.m16233d(obj, j);
        }

        /* renamed from: b */
        public boolean mo26238b() {
            return false;
        }

        /* renamed from: c */
        public double mo26239c(Object obj, long j) {
            return Double.longBitsToDouble(this.f13872a.getLong(obj, j));
        }

        /* renamed from: d */
        public float mo26240d(Object obj, long j) {
            return Float.intBitsToFloat(this.f13872a.getInt(obj, j));
        }

        /* renamed from: a */
        public boolean mo26236a(Object obj, long j) {
            if (C5212r1.f13871j) {
                return C5212r1.m16227a(obj, j);
            }
            return C5212r1.m16230b(obj, j);
        }

        /* renamed from: a */
        public void mo26235a(Object obj, long j, boolean z) {
            if (C5212r1.f13871j) {
                C5212r1.m16218a(obj, j, z ? (byte) 1 : 0);
            } else {
                C5212r1.m16229b(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo26234a(Object obj, long j, float f) {
            this.f13872a.putInt(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public void mo26233a(Object obj, long j, double d) {
            this.f13872a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public byte mo26230a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo26231a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static void m16221a(Object obj, long j, int i) {
        f13866e.f13872a.putInt(obj, j, i);
    }

    /* renamed from: b */
    public static void m16229b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m16221a(obj, j2, ((255 & b) << i) | (m16234e(obj, j2) & (~(255 << i))));
    }

    /* renamed from: a */
    public static void m16222a(Object obj, long j, long j2) {
        f13866e.f13872a.putLong(obj, j, j2);
    }

    /* renamed from: a */
    public static void m16224a(Object obj, long j, boolean z) {
        f13866e.mo26235a(obj, j, z);
    }

    /* renamed from: b */
    public static boolean m16230b(Object obj, long j) {
        return m16233d(obj, j) != 0;
    }

    /* renamed from: a */
    public static void m16220a(Object obj, long j, float f) {
        f13866e.mo26234a(obj, j, f);
    }

    /* renamed from: a */
    public static void m16219a(Object obj, long j, double d) {
        f13866e.mo26233a(obj, j, d);
    }

    /* renamed from: a */
    public static void m16223a(Object obj, long j, Object obj2) {
        f13866e.f13872a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    public static byte m16214a(byte[] bArr, long j) {
        return f13866e.mo26237b(bArr, f13869h + j);
    }

    /* renamed from: a */
    public static void m16226a(byte[] bArr, long j, byte b) {
        f13866e.mo26232a((Object) bArr, f13869h + j, b);
    }

    /* renamed from: a */
    public static long m16216a(ByteBuffer byteBuffer) {
        C5216d dVar = f13866e;
        return dVar.f13872a.getLong(byteBuffer, f13870i);
    }

    /* renamed from: c */
    public static byte m16231c(Object obj, long j) {
        return (byte) ((m16234e(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: a */
    public static Field m16217a() {
        Field field;
        Field field2;
        if (C5130d.m15540a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$c */
    public static final class C5215c extends C5216d {
        public C5215c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public boolean mo26241a() {
            if (!super.mo26241a()) {
                return false;
            }
            try {
                Class<?> cls = this.f13872a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", new Class[]{Object.class, cls2});
                cls.getMethod("putByte", new Class[]{Object.class, cls2, Byte.TYPE});
                cls.getMethod("getBoolean", new Class[]{Object.class, cls2});
                cls.getMethod("putBoolean", new Class[]{Object.class, cls2, Boolean.TYPE});
                cls.getMethod("getFloat", new Class[]{Object.class, cls2});
                cls.getMethod("putFloat", new Class[]{Object.class, cls2, Float.TYPE});
                cls.getMethod("getDouble", new Class[]{Object.class, cls2});
                cls.getMethod("putDouble", new Class[]{Object.class, cls2, Double.TYPE});
                return true;
            } catch (Throwable th) {
                C5212r1.m16225a(th);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[SYNTHETIC, Splitter:B:11:0x003a] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26238b() {
            /*
                r10 = this;
                java.lang.String r0 = "copyMemory"
                sun.misc.Unsafe r1 = r10.f13872a
                java.lang.String r2 = "getLong"
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 != 0) goto L_0x000c
                goto L_0x002e
            L_0x000c:
                java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0032 }
                java.lang.String r6 = "objectFieldOffset"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x0032 }
                java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
                r7[r5] = r8     // Catch:{ all -> 0x0032 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x0032 }
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x0032 }
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r5] = r7     // Catch:{ all -> 0x0032 }
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x0032 }
                r6[r4] = r7     // Catch:{ all -> 0x0032 }
                r1.getMethod(r2, r6)     // Catch:{ all -> 0x0032 }
                java.lang.reflect.Field r1 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16217a()     // Catch:{ all -> 0x0032 }
                if (r1 != 0) goto L_0x0030
            L_0x002e:
                r1 = r5
                goto L_0x0037
            L_0x0030:
                r1 = r4
                goto L_0x0037
            L_0x0032:
                r1 = move-exception
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16225a((java.lang.Throwable) r1)
                goto L_0x002e
            L_0x0037:
                if (r1 != 0) goto L_0x003a
                return r5
            L_0x003a:
                sun.misc.Unsafe r1 = r10.f13872a     // Catch:{ all -> 0x00a2 }
                java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x00a2 }
                java.lang.String r6 = "getByte"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x00a2 }
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ all -> 0x00a2 }
                r7[r5] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x00a2 }
                java.lang.String r6 = "putByte"
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a2 }
                r7[r5] = r8     // Catch:{ all -> 0x00a2 }
                java.lang.Class r9 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00a2 }
                r7[r4] = r9     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x00a2 }
                java.lang.String r6 = "getInt"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x00a2 }
                r7[r5] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x00a2 }
                java.lang.String r6 = "putInt"
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a2 }
                r7[r5] = r8     // Catch:{ all -> 0x00a2 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00a2 }
                r7[r4] = r9     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x00a2 }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x00a2 }
                r6[r5] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r2, r6)     // Catch:{ all -> 0x00a2 }
                java.lang.String r2 = "putLong"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a2 }
                r6[r5] = r8     // Catch:{ all -> 0x00a2 }
                r6[r4] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r2, r6)     // Catch:{ all -> 0x00a2 }
                r2 = 3
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x00a2 }
                r6[r5] = r8     // Catch:{ all -> 0x00a2 }
                r6[r4] = r8     // Catch:{ all -> 0x00a2 }
                r6[r3] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r0, r6)     // Catch:{ all -> 0x00a2 }
                r6 = 5
                java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ all -> 0x00a2 }
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r5] = r7     // Catch:{ all -> 0x00a2 }
                r6[r4] = r8     // Catch:{ all -> 0x00a2 }
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r3] = r7     // Catch:{ all -> 0x00a2 }
                r6[r2] = r8     // Catch:{ all -> 0x00a2 }
                r2 = 4
                r6[r2] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r0, r6)     // Catch:{ all -> 0x00a2 }
                return r4
            L_0x00a2:
                r0 = move-exception
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16225a((java.lang.Throwable) r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5212r1.C5215c.mo26238b():boolean");
        }

        /* renamed from: c */
        public double mo26239c(Object obj, long j) {
            return this.f13872a.getDouble(obj, j);
        }

        /* renamed from: d */
        public float mo26240d(Object obj, long j) {
            return this.f13872a.getFloat(obj, j);
        }

        /* renamed from: a */
        public void mo26232a(Object obj, long j, byte b) {
            this.f13872a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public boolean mo26236a(Object obj, long j) {
            return this.f13872a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public void mo26235a(Object obj, long j, boolean z) {
            this.f13872a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public void mo26234a(Object obj, long j, float f) {
            this.f13872a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public void mo26233a(Object obj, long j, double d) {
            this.f13872a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public byte mo26230a(long j) {
            return this.f13872a.getByte(j);
        }

        /* renamed from: b */
        public byte mo26237b(Object obj, long j) {
            return this.f13872a.getByte(obj, j);
        }

        /* renamed from: a */
        public void mo26231a(long j, byte[] bArr, long j2, long j3) {
            this.f13872a.copyMemory((Object) null, j, bArr, C5212r1.f13869h + j2, j3);
        }
    }

    /* renamed from: a */
    public static void m16218a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int e = m16234e(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m16221a(obj, j2, ((255 & b) << i) | (e & (~(255 << i))));
    }

    /* renamed from: a */
    public static boolean m16227a(Object obj, long j) {
        return m16231c(obj, j) != 0;
    }

    /* renamed from: a */
    public static void m16225a(Throwable th) {
        Logger logger = Logger.getLogger(C5212r1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
