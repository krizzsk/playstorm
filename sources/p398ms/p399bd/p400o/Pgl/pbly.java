package p398ms.p399bd.p400o.Pgl;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ms.bd.o.Pgl.pbly */
public final class pbly {

    /* renamed from: ms.bd.o.Pgl.pbly$pblb */
    public static class pblb extends Exception {
        public pblb(String str) {
            super(str);
        }
    }

    /* renamed from: ms.bd.o.Pgl.pbly$pgla */
    static final class pgla<A, B> {

        /* renamed from: a */
        private final A f29421a;

        /* renamed from: b */
        private final B f29422b;

        private pgla(A a, B b) {
            this.f29421a = a;
            this.f29422b = b;
        }

        /* renamed from: a */
        public static <A, B> pgla<A, B> m34766a(A a, B b) {
            return new pgla<>(a, b);
        }

        /* renamed from: a */
        public A mo76478a() {
            return this.f29421a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || pgla.class != obj.getClass()) {
                return false;
            }
            pgla pgla = (pgla) obj;
            A a = this.f29421a;
            if (a == null) {
                if (pgla.f29421a != null) {
                    return false;
                }
            } else if (!a.equals(pgla.f29421a)) {
                return false;
            }
            B b = this.f29422b;
            B b2 = pgla.f29422b;
            return b == null ? b2 == null : b.equals(b2);
        }

        public int hashCode() {
            A a = this.f29421a;
            int i = 0;
            int hashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
            B b = this.f29422b;
            if (b != null) {
                i = b.hashCode();
            }
            return hashCode + i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.Integer, java.lang.String> m34760a(java.lang.String r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0094 }
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "08e350"
            r8 = 1
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x0094 }
            r9 = 0
            r10 = 51
            r8[r9] = r10     // Catch:{ all -> 0x0094 }
            java.lang.Object r3 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0094 }
            r2.<init>(r11, r3)     // Catch:{ all -> 0x0094 }
            java.nio.channels.FileChannel r11 = r2.getChannel()     // Catch:{ all -> 0x0093 }
            ms.bd.o.Pgl.pbly$pgla r11 = m34762a((java.nio.channels.FileChannel) r11)     // Catch:{ all -> 0x0093 }
            java.lang.Object r11 = r11.mo76478a()     // Catch:{ all -> 0x0093 }
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11     // Catch:{ all -> 0x0093 }
            java.util.Map r11 = m34761a((java.nio.ByteBuffer) r11)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x0093 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0093 }
        L_0x0044:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x0093 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x0053
            goto L_0x0044
        L_0x0053:
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x0093 }
            if (r3 != 0) goto L_0x005a
            goto L_0x0044
        L_0x005a:
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x0093 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0093 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0093 }
            r4 = 1896449818(0x7109871a, float:6.810044E29)
            if (r3 != r4) goto L_0x006a
            goto L_0x0044
        L_0x006a:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r1.getValue()     // Catch:{ all -> 0x0044 }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ all -> 0x0044 }
            byte[] r5 = r4.array()     // Catch:{ all -> 0x0044 }
            int r6 = r4.arrayOffset()     // Catch:{ all -> 0x0044 }
            int r7 = r4.position()     // Catch:{ all -> 0x0044 }
            int r7 = r7 + r6
            int r4 = r4.limit()     // Catch:{ all -> 0x0044 }
            int r6 = r6 + r4
            byte[] r4 = java.util.Arrays.copyOfRange(r5, r7, r6)     // Catch:{ all -> 0x0044 }
            r3.<init>(r4)     // Catch:{ all -> 0x0044 }
            java.lang.Object r1 = r1.getKey()     // Catch:{ all -> 0x0044 }
            r0.put(r1, r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0044
        L_0x0093:
            r1 = r2
        L_0x0094:
            if (r1 == 0) goto L_0x009a
            r2 = r1
        L_0x0097:
            r2.close()     // Catch:{ all -> 0x009a }
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p398ms.p399bd.p400o.Pgl.pbly.m34760a(java.lang.String):java.util.Map");
    }

    /* renamed from: a */
    public static boolean m34763a() {
        return m34764a((String) pblk.m34714a(16777217, 0, 0, "c726d2", new byte[]{113, 58, 76, Ascii.f17937FF, 89, 60, 116, 19, 103, 103, 124, 54, 68, Ascii.f17937FF, 93, 55, 97, Ascii.ESC, 116, 105, 96, 62, Ascii.f17944SI, 65, 84, 55, 101, 88, 112, 98, 121, 56, 78, 76, 82, 49, 111, 4, 45, 86, 117, 57, 114, 102, 112, 8, 111, Ascii.CAN, 106, 114, 125, 39, 116, 86, 82, 41, 115}));
    }

    /* renamed from: a */
    private static boolean m34764a(String... strArr) {
        boolean z;
        boolean z2 = true;
        for (String cls : strArr) {
            try {
                Class.forName(cls);
                z = true;
            } catch (Throwable unused) {
                z = false;
            }
            z2 &= z;
            if (!z2) {
                break;
            }
        }
        return z2;
    }

    /* renamed from: b */
    public static boolean m34765b() {
        return m34764a((String) pblk.m34714a(16777217, 0, 0, "849b5b", new byte[]{42, 57, 71, 88, 8, 108, 47, Ascii.DLE, 108, 51, 39, 53, 79, 88, Ascii.f17943RS, 97, 53, Ascii.DLE, 124, 124, Ascii.f17936EM, 49, 70, 34, 62, 91, 62, 1, 65, 60, 32, 34}));
    }

    /* renamed from: a */
    public static pgla<ByteBuffer, Long> m34762a(FileChannel fileChannel) throws IOException, pblb {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, 65535);
            int i = 0;
            while (true) {
                long j2 = (long) i;
                if (j2 <= min) {
                    long j3 = j - j2;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(allocate);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        short s = allocate2.getShort(0);
                        if (s == i) {
                            ByteBuffer allocate3 = ByteBuffer.allocate(4);
                            allocate3.order(ByteOrder.LITTLE_ENDIAN);
                            fileChannel.position((fileChannel.size() - ((long) s)) - 6);
                            fileChannel.read(allocate3);
                            long j4 = (long) allocate3.getInt(0);
                            if (j4 >= 32) {
                                fileChannel.position(j4 - 24);
                                ByteBuffer allocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(allocate4);
                                allocate4.order(ByteOrder.LITTLE_ENDIAN);
                                if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                                    long j5 = allocate4.getLong(0);
                                    if (j5 >= ((long) allocate4.capacity()) && j5 <= 2147483639) {
                                        int i2 = (int) (8 + j5);
                                        long j6 = j4 - ((long) i2);
                                        if (j6 >= 0) {
                                            fileChannel.position(j6);
                                            ByteBuffer allocate5 = ByteBuffer.allocate(i2);
                                            fileChannel.read(allocate5);
                                            allocate5.order(ByteOrder.LITTLE_ENDIAN);
                                            if (allocate5.getLong(0) == j5) {
                                                return pgla.m34766a(allocate5, Long.valueOf(j6));
                                            }
                                        }
                                    }
                                }
                                return null;
                            }
                            throw new pblb((String) pblk.m34714a(16777217, 0, 0, "e293c7", new byte[]{45}));
                        }
                    }
                    i++;
                } else {
                    throw new IOException((String) pblk.m34714a(16777217, 0, 0, "459084", new byte[]{116, 103}));
                }
            }
        } else {
            throw new IOException((String) pblk.m34714a(16777217, 0, 0, "e8ff44", new byte[]{37, 107}));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Map<Integer, ByteBuffer> m34761a(ByteBuffer byteBuffer) throws pblb {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            int capacity = byteBuffer.capacity() - 24;
            if (capacity >= 8) {
                byteBuffer.capacity();
                if (capacity <= byteBuffer.capacity()) {
                    int limit = byteBuffer.limit();
                    int position = byteBuffer.position();
                    try {
                        byteBuffer.position(0);
                        byteBuffer.limit(capacity);
                        byteBuffer.position(8);
                        ByteBuffer slice = byteBuffer.slice();
                        slice.order(byteBuffer.order());
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (slice.hasRemaining()) {
                            if (slice.remaining() >= 8) {
                                long j = slice.getLong();
                                if (j < 4 || j > 2147483647L) {
                                    throw new pblb((String) pblk.m34714a(16777217, 0, 0, "2077c1", new byte[]{116}));
                                }
                                int i = (int) j;
                                int position2 = slice.position() + i;
                                if (i <= slice.remaining()) {
                                    Integer valueOf = Integer.valueOf(slice.getInt());
                                    int i2 = i - 4;
                                    if (i2 >= 0) {
                                        int limit2 = slice.limit();
                                        int position3 = slice.position();
                                        int i3 = i2 + position3;
                                        if (i3 < position3 || i3 > limit2) {
                                            throw new BufferUnderflowException();
                                        }
                                        slice.limit(i3);
                                        try {
                                            ByteBuffer slice2 = slice.slice();
                                            slice2.order(slice.order());
                                            slice.position(i3);
                                            slice.limit(limit2);
                                            linkedHashMap.put(valueOf, slice2);
                                            slice.position(position2);
                                        } catch (Throwable th) {
                                            slice.limit(limit2);
                                            throw th;
                                        }
                                    } else {
                                        throw new IllegalArgumentException((String) pblk.m34714a(16777217, 0, 0, "6cd68d", new byte[]{117}));
                                    }
                                } else {
                                    throw new pblb((String) pblk.m34714a(16777217, 0, 0, "92323c", new byte[]{112}));
                                }
                            } else {
                                throw new pblb((String) pblk.m34714a(16777217, 0, 0, "f010cb", new byte[]{33}));
                            }
                        }
                        return linkedHashMap;
                    } catch (Throwable th2) {
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        throw th2;
                    }
                } else {
                    throw new IllegalArgumentException((String) pblk.m34714a(16777217, 0, 0, "b22f95", new byte[]{38}));
                }
            } else {
                throw new IllegalArgumentException((String) pblk.m34714a(16777217, 0, 0, "4c1075", new byte[]{113}));
            }
        } else {
            throw new IllegalArgumentException((String) pblk.m34714a(16777217, 0, 0, "bdd237", new byte[]{34}));
        }
    }
}
