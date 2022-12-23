package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5133e;
import com.fyber.inneractive.sdk.protobuf.C5177j0;
import com.fyber.inneractive.sdk.protobuf.C5212r1;
import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.t0 */
public final class C5226t0<T> implements C5141f1<T> {

    /* renamed from: r */
    public static final int[] f13876r = new int[0];

    /* renamed from: s */
    public static final Unsafe f13877s;

    /* renamed from: a */
    public final int[] f13878a;

    /* renamed from: b */
    public final Object[] f13879b;

    /* renamed from: c */
    public final int f13880c;

    /* renamed from: d */
    public final int f13881d;

    /* renamed from: e */
    public final C5207q0 f13882e;

    /* renamed from: f */
    public final boolean f13883f;

    /* renamed from: g */
    public final boolean f13884g;

    /* renamed from: h */
    public final boolean f13885h;

    /* renamed from: i */
    public final boolean f13886i;

    /* renamed from: j */
    public final int[] f13887j;

    /* renamed from: k */
    public final int f13888k;

    /* renamed from: l */
    public final int f13889l;

    /* renamed from: m */
    public final C5245v0 f13890m;

    /* renamed from: n */
    public final C5143g0 f13891n;

    /* renamed from: o */
    public final C5193m1<?, ?> f13892o;

    /* renamed from: p */
    public final C5210r<?> f13893p;

    /* renamed from: q */
    public final C5189l0 f13894q;

    static {
        Unsafe unsafe;
        Unsafe unsafe2 = C5212r1.f13862a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C5209q1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f13877s = unsafe;
    }

    public C5226t0(int[] iArr, Object[] objArr, int i, int i2, C5207q0 q0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C5245v0 v0Var, C5143g0 g0Var, C5193m1<?, ?> m1Var, C5210r<?> rVar, C5189l0 l0Var) {
        this.f13878a = iArr;
        this.f13879b = objArr;
        this.f13880c = i;
        this.f13881d = i2;
        this.f13884g = q0Var instanceof GeneratedMessageLite;
        this.f13885h = z;
        this.f13883f = rVar != null && rVar.mo26227a(q0Var);
        this.f13886i = z2;
        this.f13887j = iArr2;
        this.f13888k = i3;
        this.f13889l = i4;
        this.f13890m = v0Var;
        this.f13891n = g0Var;
        this.f13892o = m1Var;
        this.f13893p = rVar;
        this.f13882e = q0Var;
        this.f13894q = l0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0392  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.fyber.inneractive.sdk.protobuf.C5226t0 m16324a(com.fyber.inneractive.sdk.protobuf.C5198o0 r34, com.fyber.inneractive.sdk.protobuf.C5245v0 r35, com.fyber.inneractive.sdk.protobuf.C5143g0 r36, com.fyber.inneractive.sdk.protobuf.C5193m1 r37, com.fyber.inneractive.sdk.protobuf.C5210r r38, com.fyber.inneractive.sdk.protobuf.C5189l0 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.fyber.inneractive.sdk.protobuf.C5132d1
            if (r1 == 0) goto L_0x0418
            com.fyber.inneractive.sdk.protobuf.d1 r0 = (com.fyber.inneractive.sdk.protobuf.C5132d1) r0
            int r1 = r0.f13741d
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x0011
            com.fyber.inneractive.sdk.protobuf.a1 r1 = com.fyber.inneractive.sdk.protobuf.C5121a1.PROTO2
            goto L_0x0013
        L_0x0011:
            com.fyber.inneractive.sdk.protobuf.a1 r1 = com.fyber.inneractive.sdk.protobuf.C5121a1.PROTO3
        L_0x0013:
            com.fyber.inneractive.sdk.protobuf.a1 r3 = com.fyber.inneractive.sdk.protobuf.C5121a1.PROTO3
            r4 = 0
            if (r1 != r3) goto L_0x001a
            r11 = r2
            goto L_0x001b
        L_0x001a:
            r11 = r4
        L_0x001b:
            java.lang.String r1 = r0.f13739b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0035
            r5 = r2
        L_0x002b:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0036
            r5 = r7
            goto L_0x002b
        L_0x0035:
            r7 = r2
        L_0x0036:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0055
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0052
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0042
        L_0x0052:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0055:
            if (r7 != 0) goto L_0x0062
            int[] r7 = f13876r
            r9 = r4
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
            r14 = r7
            r7 = r15
            goto L_0x0173
        L_0x0062:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0081
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007e
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006e
        L_0x007e:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0081:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x00a0
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x00a0:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00bc
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00ac
        L_0x00bc:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bf:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00de
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x014f:
            int r17 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0161
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x014f
        L_0x0161:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x0166:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 * 2
            int r14 = r14 + r7
            r7 = r14
            r14 = r4
            r4 = r5
            r5 = r16
        L_0x0173:
            sun.misc.Unsafe r8 = f13877s
            java.lang.Object[] r2 = r0.f13740c
            com.fyber.inneractive.sdk.protobuf.q0 r6 = r0.f13738a
            java.lang.Class r6 = r6.getClass()
            r19 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r20 = r15 + r13
            r13 = r7
            r22 = r15
            r7 = r19
            r23 = r20
            r19 = 0
            r21 = 0
        L_0x0194:
            if (r7 >= r3) goto L_0x03ea
            int r24 = r7 + 1
            char r7 = r1.charAt(r7)
            r25 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01c8
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x01a9:
            int r26 = r3 + 1
            char r3 = r1.charAt(r3)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01c2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r7 = r7 | r3
            int r24 = r24 + 13
            r3 = r26
            r15 = r27
            goto L_0x01a9
        L_0x01c2:
            int r3 = r3 << r24
            r7 = r7 | r3
            r3 = r26
            goto L_0x01cc
        L_0x01c8:
            r27 = r15
            r3 = r24
        L_0x01cc:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r24 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01fe
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r24
            r24 = 13
        L_0x01df:
            int r26 = r15 + 1
            char r15 = r1.charAt(r15)
            r28 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01f8
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r24
            r3 = r3 | r10
            int r24 = r24 + 13
            r15 = r26
            r10 = r28
            goto L_0x01df
        L_0x01f8:
            int r10 = r15 << r24
            r3 = r3 | r10
            r15 = r26
            goto L_0x0202
        L_0x01fe:
            r28 = r10
            r15 = r24
        L_0x0202:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r24 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0210
            int r9 = r19 + 1
            r14[r19] = r21
            r19 = r9
        L_0x0210:
            r9 = 51
            r30 = r0
            if (r10 < r9) goto L_0x02aa
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r0) goto L_0x023f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x0225:
            int r33 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r0) goto L_0x023a
            r0 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r32
            r15 = r15 | r0
            int r32 = r32 + 13
            r9 = r33
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0225
        L_0x023a:
            int r0 = r9 << r32
            r15 = r15 | r0
            r9 = r33
        L_0x023f:
            int r0 = r10 + -51
            r32 = r9
            r9 = 9
            if (r0 == r9) goto L_0x025f
            r9 = 17
            if (r0 != r9) goto L_0x024c
            goto L_0x025f
        L_0x024c:
            r9 = 12
            if (r0 != r9) goto L_0x026c
            if (r11 != 0) goto L_0x026c
            int r0 = r21 / 3
            int r0 = r0 * 2
            r9 = 1
            int r0 = r0 + r9
            int r9 = r13 + 1
            r13 = r2[r13]
            r12[r0] = r13
            goto L_0x026b
        L_0x025f:
            int r0 = r21 / 3
            int r0 = r0 * 2
            r9 = 1
            int r0 = r0 + r9
            int r9 = r13 + 1
            r13 = r2[r13]
            r12[r0] = r13
        L_0x026b:
            r13 = r9
        L_0x026c:
            int r15 = r15 * 2
            r0 = r2[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0277
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x027f
        L_0x0277:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m16325a((java.lang.Class<?>) r6, (java.lang.String) r0)
            r2[r15] = r0
        L_0x027f:
            r9 = r4
            r33 = r5
            long r4 = r8.objectFieldOffset(r0)
            int r0 = (int) r4
            int r15 = r15 + 1
            r4 = r2[r15]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0292
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x029a
        L_0x0292:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m16325a((java.lang.Class<?>) r6, (java.lang.String) r4)
            r2[r15] = r4
        L_0x029a:
            long r4 = r8.objectFieldOffset(r4)
            int r4 = (int) r4
            r5 = r1
            r31 = r13
            r15 = r32
            r17 = 1
            r13 = r6
            r6 = 0
            goto L_0x03ac
        L_0x02aa:
            r9 = r4
            r33 = r5
            int r0 = r13 + 1
            r4 = r2[r13]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m16325a((java.lang.Class<?>) r6, (java.lang.String) r4)
            r5 = 49
            r13 = 9
            if (r10 == r13) goto L_0x0321
            r13 = 17
            if (r10 != r13) goto L_0x02c2
            goto L_0x0321
        L_0x02c2:
            r13 = 27
            if (r10 == r13) goto L_0x030f
            if (r10 != r5) goto L_0x02c9
            goto L_0x030f
        L_0x02c9:
            r13 = 12
            if (r10 == r13) goto L_0x02fe
            r13 = 30
            if (r10 == r13) goto L_0x02fe
            r13 = 44
            if (r10 != r13) goto L_0x02d6
            goto L_0x02fe
        L_0x02d6:
            r13 = 50
            if (r10 != r13) goto L_0x02fb
            int r13 = r22 + 1
            r14[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r26 = r0 + 1
            r0 = r2[r0]
            r12[r22] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02f7
            int r22 = r22 + 1
            int r0 = r26 + 1
            r26 = r2[r26]
            r12[r22] = r26
            r22 = r13
            goto L_0x02fb
        L_0x02f7:
            r22 = r13
            r0 = r26
        L_0x02fb:
            r17 = 1
            goto L_0x032f
        L_0x02fe:
            if (r11 != 0) goto L_0x02fb
            int r13 = r21 / 3
            int r13 = r13 * 2
            r17 = 1
            int r13 = r13 + 1
            int r26 = r0 + 1
            r0 = r2[r0]
            r12[r13] = r0
            goto L_0x031d
        L_0x030f:
            r17 = 1
            int r13 = r21 / 3
            int r13 = r13 * 2
            int r13 = r13 + 1
            int r26 = r0 + 1
            r0 = r2[r0]
            r12[r13] = r0
        L_0x031d:
            r13 = r6
            r0 = r26
            goto L_0x0330
        L_0x0321:
            r17 = 1
            int r13 = r21 / 3
            int r13 = r13 * 2
            int r13 = r13 + 1
            java.lang.Class r26 = r4.getType()
            r12[r13] = r26
        L_0x032f:
            r13 = r6
        L_0x0330:
            long r5 = r8.objectFieldOffset(r4)
            int r4 = (int) r5
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 != r6) goto L_0x033e
            r5 = r17
            goto L_0x033f
        L_0x033e:
            r5 = 0
        L_0x033f:
            if (r5 == 0) goto L_0x0392
            r5 = 17
            if (r10 > r5) goto L_0x0392
            int r5 = r15 + 1
            char r6 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x036a
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x0354:
            int r29 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r15) goto L_0x0366
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r18
            r6 = r6 | r5
            int r18 = r18 + 13
            r5 = r29
            goto L_0x0354
        L_0x0366:
            int r5 = r5 << r18
            r6 = r6 | r5
            goto L_0x036c
        L_0x036a:
            r29 = r5
        L_0x036c:
            int r5 = r9 * 2
            int r18 = r6 / 32
            int r5 = r5 + r18
            r15 = r2[r5]
            r31 = r0
            boolean r0 = r15 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x037d
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            goto L_0x0386
        L_0x037d:
            java.lang.String r15 = (java.lang.String) r15
            r0 = r13
            java.lang.reflect.Field r15 = m16325a((java.lang.Class<?>) r0, (java.lang.String) r15)
            r2[r5] = r15
        L_0x0386:
            r5 = r1
            long r0 = r8.objectFieldOffset(r15)
            int r0 = (int) r0
            int r6 = r6 % 32
            r1 = r0
            r15 = r29
            goto L_0x039c
        L_0x0392:
            r31 = r0
            r5 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x039c:
            r0 = 18
            if (r10 < r0) goto L_0x03aa
            r0 = 49
            if (r10 > r0) goto L_0x03aa
            int r0 = r23 + 1
            r14[r23] = r4
            r23 = r0
        L_0x03aa:
            r0 = r4
            r4 = r1
        L_0x03ac:
            int r1 = r21 + 1
            r33[r21] = r7
            int r7 = r1 + 1
            r21 = r2
            r2 = r3 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x03bb
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03bc
        L_0x03bb:
            r2 = 0
        L_0x03bc:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03c3
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c4
        L_0x03c3:
            r3 = 0
        L_0x03c4:
            r2 = r2 | r3
            int r3 = r10 << 20
            r2 = r2 | r3
            r0 = r0 | r2
            r33[r1] = r0
            int r0 = r7 + 1
            int r1 = r6 << 20
            r1 = r1 | r4
            r33[r7] = r1
            r1 = r5
            r4 = r9
            r6 = r13
            r7 = r15
            r2 = r21
            r9 = r24
            r3 = r25
            r15 = r27
            r10 = r28
            r13 = r31
            r5 = r33
            r21 = r0
            r0 = r30
            goto L_0x0194
        L_0x03ea:
            r30 = r0
            r33 = r5
            r24 = r9
            r28 = r10
            r27 = r15
            com.fyber.inneractive.sdk.protobuf.t0 r0 = new com.fyber.inneractive.sdk.protobuf.t0
            r1 = r30
            com.fyber.inneractive.sdk.protobuf.q0 r10 = r1.f13738a
            r1 = 0
            r2 = r33
            r5 = r0
            r6 = r2
            r7 = r12
            r8 = r24
            r9 = r28
            r12 = r1
            r13 = r14
            r14 = r27
            r15 = r20
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x0418:
            com.fyber.inneractive.sdk.protobuf.j1 r0 = (com.fyber.inneractive.sdk.protobuf.C5179j1) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.m16324a(com.fyber.inneractive.sdk.protobuf.o0, com.fyber.inneractive.sdk.protobuf.v0, com.fyber.inneractive.sdk.protobuf.g0, com.fyber.inneractive.sdk.protobuf.m1, com.fyber.inneractive.sdk.protobuf.r, com.fyber.inneractive.sdk.protobuf.l0):com.fyber.inneractive.sdk.protobuf.t0");
    }

    /* renamed from: d */
    public static long m16330d(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: e */
    public static C5196n1 m16332e(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C5196n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var != C5196n1.f13847f) {
            return n1Var;
        }
        C5196n1 c = C5196n1.m16169c();
        generatedMessageLite.unknownFields = c;
        return c;
    }

    /* renamed from: f */
    public static int m16333f(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d4, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ef, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x020c, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a(com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5), com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)) != false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0229, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x024d, code lost:
        if (java.lang.Float.floatToIntBits(r4.mo26240d(r10, r5)) == java.lang.Float.floatToIntBits(r4.mo26240d(r11, r5))) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0273, code lost:
        if (java.lang.Double.doubleToLongBits(r4.mo26239c(r10, r5)) == java.lang.Double.doubleToLongBits(r4.mo26239c(r11, r5))) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0276, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a(com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5), com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)) != false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0107, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0122, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0141, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a(com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5), com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)) != false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0160, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a(com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5), com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)) != false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017f, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a(com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5), com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)) != false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019c, code lost:
        if (r4.mo26236a(r10, r5) == r4.mo26236a(r11, r5)) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b7, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)) goto L_0x0277;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25950b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f13878a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x027e
            int[] r4 = r9.f13878a
            int r5 = r2 + 1
            r4 = r4[r5]
            long r5 = m16330d((int) r4)
            int r4 = m16333f(r4)
            switch(r4) {
                case 0: goto L_0x0250;
                case 1: goto L_0x022c;
                case 2: goto L_0x0210;
                case 3: goto L_0x01f3;
                case 4: goto L_0x01d8;
                case 5: goto L_0x01bb;
                case 6: goto L_0x01a0;
                case 7: goto L_0x0183;
                case 8: goto L_0x0164;
                case 9: goto L_0x0145;
                case 10: goto L_0x0126;
                case 11: goto L_0x010b;
                case 12: goto L_0x00f0;
                case 13: goto L_0x00d5;
                case 14: goto L_0x00b8;
                case 15: goto L_0x009d;
                case 16: goto L_0x0080;
                case 17: goto L_0x0061;
                case 18: goto L_0x0053;
                case 19: goto L_0x0053;
                case 20: goto L_0x0053;
                case 21: goto L_0x0053;
                case 22: goto L_0x0053;
                case 23: goto L_0x0053;
                case 24: goto L_0x0053;
                case 25: goto L_0x0053;
                case 26: goto L_0x0053;
                case 27: goto L_0x0053;
                case 28: goto L_0x0053;
                case 29: goto L_0x0053;
                case 30: goto L_0x0053;
                case 31: goto L_0x0053;
                case 32: goto L_0x0053;
                case 33: goto L_0x0053;
                case 34: goto L_0x0053;
                case 35: goto L_0x0053;
                case 36: goto L_0x0053;
                case 37: goto L_0x0053;
                case 38: goto L_0x0053;
                case 39: goto L_0x0053;
                case 40: goto L_0x0053;
                case 41: goto L_0x0053;
                case 42: goto L_0x0053;
                case 43: goto L_0x0053;
                case 44: goto L_0x0053;
                case 45: goto L_0x0053;
                case 46: goto L_0x0053;
                case 47: goto L_0x0053;
                case 48: goto L_0x0053;
                case 49: goto L_0x0053;
                case 50: goto L_0x0045;
                case 51: goto L_0x001b;
                case 52: goto L_0x001b;
                case 53: goto L_0x001b;
                case 54: goto L_0x001b;
                case 55: goto L_0x001b;
                case 56: goto L_0x001b;
                case 57: goto L_0x001b;
                case 58: goto L_0x001b;
                case 59: goto L_0x001b;
                case 60: goto L_0x001b;
                case 61: goto L_0x001b;
                case 62: goto L_0x001b;
                case 63: goto L_0x001b;
                case 64: goto L_0x001b;
                case 65: goto L_0x001b;
                case 66: goto L_0x001b;
                case 67: goto L_0x001b;
                case 68: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0277
        L_0x001b:
            int[] r4 = r9.f13878a
            int r7 = r2 + 2
            r4 = r4[r7]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r7)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r7)
            if (r4 != r7) goto L_0x0032
            r4 = r3
            goto L_0x0033
        L_0x0032:
            r4 = r1
        L_0x0033:
            if (r4 == 0) goto L_0x0276
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0276
            goto L_0x0277
        L_0x0045:
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5)
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)
            boolean r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x0277
        L_0x0053:
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5)
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)
            boolean r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x0277
        L_0x0061:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x006d
            r4 = r3
            goto L_0x006e
        L_0x006d:
            r4 = r1
        L_0x006e:
            if (r4 == 0) goto L_0x0276
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0276
            goto L_0x0277
        L_0x0080:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x008c
            r4 = r3
            goto L_0x008d
        L_0x008c:
            r4 = r1
        L_0x008d:
            if (r4 == 0) goto L_0x0276
            long r7 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0276
            goto L_0x0277
        L_0x009d:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x00a9
            r4 = r3
            goto L_0x00aa
        L_0x00a9:
            r4 = r1
        L_0x00aa:
            if (r4 == 0) goto L_0x0276
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)
            if (r4 != r5) goto L_0x0276
            goto L_0x0277
        L_0x00b8:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x00c4
            r4 = r3
            goto L_0x00c5
        L_0x00c4:
            r4 = r1
        L_0x00c5:
            if (r4 == 0) goto L_0x0276
            long r7 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0276
            goto L_0x0277
        L_0x00d5:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x00e1
            r4 = r3
            goto L_0x00e2
        L_0x00e1:
            r4 = r1
        L_0x00e2:
            if (r4 == 0) goto L_0x0276
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)
            if (r4 != r5) goto L_0x0276
            goto L_0x0277
        L_0x00f0:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x00fc
            r4 = r3
            goto L_0x00fd
        L_0x00fc:
            r4 = r1
        L_0x00fd:
            if (r4 == 0) goto L_0x0276
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)
            if (r4 != r5) goto L_0x0276
            goto L_0x0277
        L_0x010b:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x0117
            r4 = r3
            goto L_0x0118
        L_0x0117:
            r4 = r1
        L_0x0118:
            if (r4 == 0) goto L_0x0276
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)
            if (r4 != r5) goto L_0x0276
            goto L_0x0277
        L_0x0126:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x0132
            r4 = r3
            goto L_0x0133
        L_0x0132:
            r4 = r1
        L_0x0133:
            if (r4 == 0) goto L_0x0276
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0276
            goto L_0x0277
        L_0x0145:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x0151
            r4 = r3
            goto L_0x0152
        L_0x0151:
            r4 = r1
        L_0x0152:
            if (r4 == 0) goto L_0x0276
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0276
            goto L_0x0277
        L_0x0164:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x0170
            r4 = r3
            goto L_0x0171
        L_0x0170:
            r4 = r1
        L_0x0171:
            if (r4 == 0) goto L_0x0276
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15731a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0276
            goto L_0x0277
        L_0x0183:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x018f
            r4 = r3
            goto L_0x0190
        L_0x018f:
            r4 = r1
        L_0x0190:
            if (r4 == 0) goto L_0x0276
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            boolean r7 = r4.mo26236a(r10, r5)
            boolean r4 = r4.mo26236a(r11, r5)
            if (r7 != r4) goto L_0x0276
            goto L_0x0277
        L_0x01a0:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x01ac
            r4 = r3
            goto L_0x01ad
        L_0x01ac:
            r4 = r1
        L_0x01ad:
            if (r4 == 0) goto L_0x0276
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)
            if (r4 != r5) goto L_0x0276
            goto L_0x0277
        L_0x01bb:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x01c7
            r4 = r3
            goto L_0x01c8
        L_0x01c7:
            r4 = r1
        L_0x01c8:
            if (r4 == 0) goto L_0x0276
            long r7 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0276
            goto L_0x0277
        L_0x01d8:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x01e4
            r4 = r3
            goto L_0x01e5
        L_0x01e4:
            r4 = r1
        L_0x01e5:
            if (r4 == 0) goto L_0x0276
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r11, r5)
            if (r4 != r5) goto L_0x0276
            goto L_0x0277
        L_0x01f3:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x01ff
            r4 = r3
            goto L_0x0200
        L_0x01ff:
            r4 = r1
        L_0x0200:
            if (r4 == 0) goto L_0x0276
            long r7 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0276
            goto L_0x0277
        L_0x0210:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x021c
            r4 = r3
            goto L_0x021d
        L_0x021c:
            r4 = r1
        L_0x021d:
            if (r4 == 0) goto L_0x0276
            long r7 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0276
            goto L_0x0277
        L_0x022c:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x0238
            r4 = r3
            goto L_0x0239
        L_0x0238:
            r4 = r1
        L_0x0239:
            if (r4 == 0) goto L_0x0276
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            float r7 = r4.mo26240d(r10, r5)
            int r7 = java.lang.Float.floatToIntBits(r7)
            float r4 = r4.mo26240d(r11, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r7 != r4) goto L_0x0276
            goto L_0x0277
        L_0x0250:
            boolean r4 = r9.mo26262a(r10, (int) r2)
            boolean r7 = r9.mo26262a(r11, (int) r2)
            if (r4 != r7) goto L_0x025c
            r4 = r3
            goto L_0x025d
        L_0x025c:
            r4 = r1
        L_0x025d:
            if (r4 == 0) goto L_0x0276
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            double r7 = r4.mo26239c(r10, r5)
            long r7 = java.lang.Double.doubleToLongBits(r7)
            double r4 = r4.mo26239c(r11, r5)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0276
            goto L_0x0277
        L_0x0276:
            r3 = r1
        L_0x0277:
            if (r3 != 0) goto L_0x027a
            return r1
        L_0x027a:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x027e:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r0 = r9.f13892o
            java.lang.Object r0 = r0.mo26174b(r10)
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r2 = r9.f13892o
            java.lang.Object r2 = r2.mo26174b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0291
            return r1
        L_0x0291:
            boolean r0 = r9.f13883f
            if (r0 == 0) goto L_0x02a6
            com.fyber.inneractive.sdk.protobuf.r<?> r0 = r9.f13893p
            com.fyber.inneractive.sdk.protobuf.u r10 = r0.mo26221a((java.lang.Object) r10)
            com.fyber.inneractive.sdk.protobuf.r<?> r0 = r9.f13893p
            com.fyber.inneractive.sdk.protobuf.u r11 = r0.mo26221a((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x02a6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo25950b(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: c */
    public final C5141f1 mo26270c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f13879b;
        C5141f1 f1Var = (C5141f1) objArr[i2];
        if (f1Var != null) {
            return f1Var;
        }
        C5141f1 a = C5124b1.f13725c.mo25837a((Class) objArr[i2 + 1]);
        this.f13879b[i2] = a;
        return a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022b, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022c, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25952d(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f13878a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0230
            int r3 = r8.mo26272g(r1)
            int[] r4 = r8.f13878a
            r4 = r4[r1]
            long r5 = m16330d((int) r3)
            int r3 = m16333f(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x021b;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x022c
        L_0x001e:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x0030:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m16331e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x0042:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m16329d(r9, r5)
            goto L_0x022b
        L_0x0050:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m16331e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x0062:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m16329d(r9, r5)
            goto L_0x022b
        L_0x0070:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m16329d(r9, r5)
            goto L_0x022b
        L_0x007e:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m16329d(r9, r5)
            goto L_0x022b
        L_0x008c:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x009e:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x00b0:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x00c4:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            boolean r3 = m16326a(r9, (long) r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16433a((boolean) r3)
            goto L_0x022b
        L_0x00d6:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m16329d(r9, r5)
            goto L_0x022b
        L_0x00e4:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m16331e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x00f6:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m16329d(r9, r5)
            goto L_0x022b
        L_0x0104:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m16331e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x0116:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m16331e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x0128:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            float r3 = m16328c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x022b
        L_0x013a:
            boolean r3 = r8.mo26263a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            double r3 = m16327b(r9, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x0168:
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r9, r5)
            goto L_0x022b
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r9, r5)
            goto L_0x022b
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r9, r5)
            goto L_0x022b
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r9, r5)
            goto L_0x022b
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x01b7:
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x022c
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x01d2:
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.r1$d r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            boolean r3 = r3.mo26236a(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16433a((boolean) r3)
            goto L_0x022b
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r9, r5)
            goto L_0x022b
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r9, r5)
            goto L_0x022b
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
            goto L_0x022b
        L_0x020e:
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.r1$d r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            float r3 = r3.mo26240d(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x022b
        L_0x021b:
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.r1$d r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            double r3 = r3.mo26239c(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5252z.m16432a((long) r3)
        L_0x022b:
            int r2 = r2 + r3
        L_0x022c:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0230:
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r0 = r8.f13892o
            java.lang.Object r0 = r0.mo26174b(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f13883f
            if (r0 == 0) goto L_0x0250
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.r<?> r0 = r8.f13893p
            com.fyber.inneractive.sdk.protobuf.u r9 = r0.mo26221a((java.lang.Object) r9)
            com.fyber.inneractive.sdk.protobuf.i1<T, java.lang.Object> r9 = r9.f13935a
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0250:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo25952d(java.lang.Object):int");
    }

    /* renamed from: g */
    public final int mo26272g(int i) {
        return this.f13878a[i + 1];
    }

    /* renamed from: e */
    public static <T> long m16331e(T t, long j) {
        return ((Long) C5212r1.m16236g(t, j)).longValue();
    }

    /* renamed from: c */
    public void mo25951c(T t) {
        int i;
        int i2 = this.f13888k;
        while (true) {
            i = this.f13889l;
            if (i2 >= i) {
                break;
            }
            long d = m16330d(mo26272g(this.f13887j[i2]));
            Object g = C5212r1.m16236g(t, d);
            if (g != null) {
                C5212r1.m16223a((Object) t, d, this.f13894q.mo26155e(g));
            }
            i2++;
        }
        int length = this.f13887j.length;
        while (i < length) {
            this.f13891n.mo25964a(t, (long) this.f13887j[i]);
            i++;
        }
        this.f13892o.mo26181e(t);
        if (this.f13883f) {
            this.f13893p.mo26229c(t);
        }
    }

    /* renamed from: e */
    public final int mo26271e(int i) {
        if (i < this.f13880c || i > this.f13881d) {
            return -1;
        }
        return mo26247a(i, 0);
    }

    /* renamed from: c */
    public static <T> float m16328c(T t, long j) {
        return ((Float) C5212r1.m16236g(t, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0324, code lost:
        r4 = r4 + (r5 + r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x050f, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0511, code lost:
        r11 = r11 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0641, code lost:
        r10 = r3;
        r13 = r11;
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06b9, code lost:
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06bc, code lost:
        r11 = r3;
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06e0, code lost:
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0873, code lost:
        r3 = (r3 + r7) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x08f2, code lost:
        r11 = r3;
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0960, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0961, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0a1d, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0a6a, code lost:
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a8a, code lost:
        r5 = r5 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a8e, code lost:
        r4 = r4 + 3;
        r7 = r3;
        r11 = r13;
        r6 = 1048575;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25949b(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f13885h
            r3 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 1
            r8 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0522
            sun.misc.Unsafe r2 = f13877s
            r11 = r10
            r12 = r11
        L_0x0014:
            int[] r13 = r0.f13878a
            int r13 = r13.length
            if (r11 >= r13) goto L_0x0515
            int r13 = r0.mo26272g(r11)
            int r14 = m16333f(r13)
            int[] r15 = r0.f13878a
            r15 = r15[r11]
            long r4 = m16330d((int) r13)
            com.fyber.inneractive.sdk.protobuf.v r13 = com.fyber.inneractive.sdk.protobuf.C5243v.DOUBLE_LIST_PACKED
            int r13 = r13.f13946a
            if (r14 < r13) goto L_0x003d
            com.fyber.inneractive.sdk.protobuf.v r13 = com.fyber.inneractive.sdk.protobuf.C5243v.SINT64_LIST_PACKED
            int r13 = r13.f13946a
            if (r14 > r13) goto L_0x003d
            int[] r13 = r0.f13878a
            int r16 = r11 + 2
            r13 = r13[r16]
            r13 = r13 & r6
            goto L_0x003e
        L_0x003d:
            r13 = r10
        L_0x003e:
            switch(r14) {
                case 0: goto L_0x0503;
                case 1: goto L_0x04f8;
                case 2: goto L_0x04e9;
                case 3: goto L_0x04da;
                case 4: goto L_0x04cb;
                case 5: goto L_0x04c0;
                case 6: goto L_0x04b5;
                case 7: goto L_0x04aa;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x0466;
                case 11: goto L_0x0456;
                case 12: goto L_0x0446;
                case 13: goto L_0x043a;
                case 14: goto L_0x042e;
                case 15: goto L_0x041e;
                case 16: goto L_0x040e;
                case 17: goto L_0x03f8;
                case 18: goto L_0x03ec;
                case 19: goto L_0x03e0;
                case 20: goto L_0x03d4;
                case 21: goto L_0x03c8;
                case 22: goto L_0x03bc;
                case 23: goto L_0x03b0;
                case 24: goto L_0x03a4;
                case 25: goto L_0x0398;
                case 26: goto L_0x038c;
                case 27: goto L_0x037c;
                case 28: goto L_0x0370;
                case 29: goto L_0x0364;
                case 30: goto L_0x0358;
                case 31: goto L_0x034c;
                case 32: goto L_0x0340;
                case 33: goto L_0x0334;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0237;
                case 43: goto L_0x0219;
                case 44: goto L_0x01fb;
                case 45: goto L_0x01dd;
                case 46: goto L_0x01bf;
                case 47: goto L_0x01a1;
                case 48: goto L_0x0183;
                case 49: goto L_0x0173;
                case 50: goto L_0x0163;
                case 51: goto L_0x0155;
                case 52: goto L_0x0149;
                case 53: goto L_0x0139;
                case 54: goto L_0x0129;
                case 55: goto L_0x0119;
                case 56: goto L_0x010d;
                case 57: goto L_0x0101;
                case 58: goto L_0x00f5;
                case 59: goto L_0x00d7;
                case 60: goto L_0x00c3;
                case 61: goto L_0x00b1;
                case 62: goto L_0x00a1;
                case 63: goto L_0x0091;
                case 64: goto L_0x0085;
                case 65: goto L_0x0079;
                case 66: goto L_0x0069;
                case 67: goto L_0x0059;
                case 68: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0511
        L_0x0043:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.q0 r4 = (com.fyber.inneractive.sdk.protobuf.C5207q0) r4
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo26270c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16026a(r15, r4, r5)
            goto L_0x0510
        L_0x0059:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = m16331e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16043d((int) r15, (long) r4)
            goto L_0x0510
        L_0x0069:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = m16329d(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16044e((int) r15, (int) r4)
            goto L_0x0510
        L_0x0079:
            boolean r4 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16040c((int) r15, (long) r8)
            goto L_0x0510
        L_0x0085:
            boolean r4 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16042d((int) r15, (int) r10)
            goto L_0x0510
        L_0x0091:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = m16329d(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16023a((int) r15, (int) r4)
            goto L_0x0510
        L_0x00a1:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = m16329d(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16046f((int) r15, (int) r4)
            goto L_0x0510
        L_0x00b1:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C5151i) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16025a((int) r15, (com.fyber.inneractive.sdk.protobuf.C5151i) r4)
            goto L_0x0510
        L_0x00c3:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo26270c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15719a((int) r15, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C5141f1) r5)
            goto L_0x0510
        L_0x00d7:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            boolean r5 = r4 instanceof com.fyber.inneractive.sdk.protobuf.C5151i
            if (r5 == 0) goto L_0x00ed
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C5151i) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16025a((int) r15, (com.fyber.inneractive.sdk.protobuf.C5151i) r4)
            goto L_0x0510
        L_0x00ed:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16027a((int) r15, (java.lang.String) r4)
            goto L_0x0510
        L_0x00f5:
            boolean r4 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16028a((int) r15, (boolean) r7)
            goto L_0x0510
        L_0x0101:
            boolean r4 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16035b((int) r15, (int) r10)
            goto L_0x0510
        L_0x010d:
            boolean r4 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16024a((int) r15, (long) r8)
            goto L_0x0510
        L_0x0119:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = m16329d(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16039c((int) r15, (int) r4)
            goto L_0x0510
        L_0x0129:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = m16331e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16045e((int) r15, (long) r4)
            goto L_0x0510
        L_0x0139:
            boolean r13 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = m16331e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16036b((int) r15, (long) r4)
            goto L_0x0510
        L_0x0149:
            boolean r4 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16022a((int) r15, (float) r3)
            goto L_0x0510
        L_0x0155:
            boolean r4 = r0.mo26263a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            r4 = 0
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16021a((int) r15, (double) r4)
            goto L_0x050f
        L_0x0163:
            com.fyber.inneractive.sdk.protobuf.l0 r13 = r0.f13894q
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.lang.Object r5 = r0.mo26264b((int) r11)
            int r4 = r13.mo26149a(r15, r4, r5)
            goto L_0x0510
        L_0x0173:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo26270c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15721a((int) r15, (java.util.List<com.fyber.inneractive.sdk.protobuf.C5207q0>) r4, (com.fyber.inneractive.sdk.protobuf.C5141f1) r5)
            goto L_0x0510
        L_0x0183:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15752g(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x0197
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x0197:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x01a1:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15749f(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x01b5
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x01b5:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x01bf:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15740c(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x01d3
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x01d3:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x01dd:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15735b(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x01f1
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x01f1:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x01fb:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15723a((java.util.List<java.lang.Integer>) r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x020f
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x020f:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x0219:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15755h(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x022d
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x022d:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x0237:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = com.fyber.inneractive.sdk.protobuf.C5150h1.f13762a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x024d
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x024d:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15735b(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x026b
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x026b:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15740c(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x0289
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x0289:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15743d(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x02a7
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x02a7:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15758i(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x02c5
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x02c5:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15746e(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x02e2
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x02e2:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15735b(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x02ff
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x02ff:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15740c(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f13886i
            if (r5 == 0) goto L_0x031c
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x031c:
            int r5 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r4)
        L_0x0324:
            int r5 = r5 + r13
            int r4 = r4 + r5
            goto L_0x0510
        L_0x0328:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15754h(r15, r4, r10)
            goto L_0x0510
        L_0x0334:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15751g(r15, r4, r10)
            goto L_0x0510
        L_0x0340:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15742d(r15, r4, r10)
            goto L_0x0510
        L_0x034c:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15739c(r15, r4, r10)
            goto L_0x0510
        L_0x0358:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15734b((int) r15, (java.util.List<java.lang.Integer>) r4, (boolean) r10)
            goto L_0x0510
        L_0x0364:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15757i(r15, r4, r10)
            goto L_0x0510
        L_0x0370:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15720a((int) r15, (java.util.List<com.fyber.inneractive.sdk.protobuf.C5151i>) r4)
            goto L_0x0510
        L_0x037c:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo26270c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15733b((int) r15, (java.util.List<?>) r4, (com.fyber.inneractive.sdk.protobuf.C5141f1) r5)
            goto L_0x0510
        L_0x038c:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15732b(r15, r4)
            goto L_0x0510
        L_0x0398:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15722a((int) r15, (java.util.List<?>) r4, (boolean) r10)
            goto L_0x0510
        L_0x03a4:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15739c(r15, r4, r10)
            goto L_0x0510
        L_0x03b0:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15742d(r15, r4, r10)
            goto L_0x0510
        L_0x03bc:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15745e(r15, r4, r10)
            goto L_0x0510
        L_0x03c8:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15760j(r15, r4, r10)
            goto L_0x0510
        L_0x03d4:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15748f(r15, r4, r10)
            goto L_0x0510
        L_0x03e0:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15739c(r15, r4, r10)
            goto L_0x0510
        L_0x03ec:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15742d(r15, r4, r10)
            goto L_0x0510
        L_0x03f8:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.q0 r4 = (com.fyber.inneractive.sdk.protobuf.C5207q0) r4
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo26270c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16026a(r15, r4, r5)
            goto L_0x0510
        L_0x040e:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16043d((int) r15, (long) r4)
            goto L_0x0510
        L_0x041e:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16044e((int) r15, (int) r4)
            goto L_0x0510
        L_0x042e:
            boolean r4 = r0.mo26262a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16040c((int) r15, (long) r8)
            goto L_0x0510
        L_0x043a:
            boolean r4 = r0.mo26262a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16042d((int) r15, (int) r10)
            goto L_0x0510
        L_0x0446:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16023a((int) r15, (int) r4)
            goto L_0x0510
        L_0x0456:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16046f((int) r15, (int) r4)
            goto L_0x0510
        L_0x0466:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C5151i) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16025a((int) r15, (com.fyber.inneractive.sdk.protobuf.C5151i) r4)
            goto L_0x0510
        L_0x0478:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo26270c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15719a((int) r15, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C5141f1) r5)
            goto L_0x0510
        L_0x048c:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r1, r4)
            boolean r5 = r4 instanceof com.fyber.inneractive.sdk.protobuf.C5151i
            if (r5 == 0) goto L_0x04a2
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C5151i) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16025a((int) r15, (com.fyber.inneractive.sdk.protobuf.C5151i) r4)
            goto L_0x0510
        L_0x04a2:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16027a((int) r15, (java.lang.String) r4)
            goto L_0x0510
        L_0x04aa:
            boolean r4 = r0.mo26262a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16028a((int) r15, (boolean) r7)
            goto L_0x0510
        L_0x04b5:
            boolean r4 = r0.mo26262a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16035b((int) r15, (int) r10)
            goto L_0x0510
        L_0x04c0:
            boolean r4 = r0.mo26262a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16024a((int) r15, (long) r8)
            goto L_0x0510
        L_0x04cb:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16039c((int) r15, (int) r4)
            goto L_0x0510
        L_0x04da:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16045e((int) r15, (long) r4)
            goto L_0x0510
        L_0x04e9:
            boolean r13 = r0.mo26262a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16036b((int) r15, (long) r4)
            goto L_0x0510
        L_0x04f8:
            boolean r4 = r0.mo26262a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C5183l.m16022a((int) r15, (float) r3)
            goto L_0x0510
        L_0x0503:
            boolean r4 = r0.mo26262a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            r4 = 0
            int r13 = com.fyber.inneractive.sdk.protobuf.C5183l.m16021a((int) r15, (double) r4)
        L_0x050f:
            r4 = r13
        L_0x0510:
            int r12 = r12 + r4
        L_0x0511:
            int r11 = r11 + 3
            goto L_0x0014
        L_0x0515:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r2 = r0.f13892o
            java.lang.Object r1 = r2.mo26174b(r1)
            int r1 = r2.mo26178c(r1)
        L_0x051f:
            int r12 = r12 + r1
            goto L_0x0ab4
        L_0x0522:
            sun.misc.Unsafe r2 = f13877s
            r11 = r6
            r4 = r10
            r5 = r4
            r12 = r5
        L_0x0528:
            int[] r13 = r0.f13878a
            int r13 = r13.length
            if (r4 >= r13) goto L_0x0a98
            int r13 = r0.mo26272g(r4)
            int[] r14 = r0.f13878a
            r14 = r14[r4]
            int r15 = m16333f(r13)
            r3 = 17
            if (r15 > r3) goto L_0x0552
            int[] r3 = r0.f13878a
            int r17 = r4 + 2
            r3 = r3[r17]
            r10 = r3 & r6
            int r18 = r3 >>> 20
            int r18 = r7 << r18
            if (r10 == r11) goto L_0x056d
            long r11 = (long) r10
            int r12 = r2.getInt(r1, r11)
            r11 = r10
            goto L_0x056d
        L_0x0552:
            boolean r3 = r0.f13886i
            if (r3 == 0) goto L_0x056a
            com.fyber.inneractive.sdk.protobuf.v r3 = com.fyber.inneractive.sdk.protobuf.C5243v.DOUBLE_LIST_PACKED
            int r3 = r3.f13946a
            if (r15 < r3) goto L_0x056a
            com.fyber.inneractive.sdk.protobuf.v r3 = com.fyber.inneractive.sdk.protobuf.C5243v.SINT64_LIST_PACKED
            int r3 = r3.f13946a
            if (r15 > r3) goto L_0x056a
            int[] r3 = r0.f13878a
            int r10 = r4 + 2
            r3 = r3[r10]
            r3 = r3 & r6
            goto L_0x056b
        L_0x056a:
            r3 = 0
        L_0x056b:
            r18 = 0
        L_0x056d:
            long r6 = m16330d((int) r13)
            switch(r15) {
                case 0: goto L_0x0a7c;
                case 1: goto L_0x0a6d;
                case 2: goto L_0x0a5b;
                case 3: goto L_0x0a4b;
                case 4: goto L_0x0a3b;
                case 5: goto L_0x0a2f;
                case 6: goto L_0x0a23;
                case 7: goto L_0x0a10;
                case 8: goto L_0x09f3;
                case 9: goto L_0x09e0;
                case 10: goto L_0x09cf;
                case 11: goto L_0x09c0;
                case 12: goto L_0x09b1;
                case 13: goto L_0x09a4;
                case 14: goto L_0x0999;
                case 15: goto L_0x098a;
                case 16: goto L_0x097b;
                case 17: goto L_0x0966;
                case 18: goto L_0x0954;
                case 19: goto L_0x0947;
                case 20: goto L_0x093a;
                case 21: goto L_0x092d;
                case 22: goto L_0x0920;
                case 23: goto L_0x0913;
                case 24: goto L_0x0906;
                case 25: goto L_0x08f9;
                case 26: goto L_0x08e7;
                case 27: goto L_0x08d7;
                case 28: goto L_0x08cb;
                case 29: goto L_0x08bd;
                case 30: goto L_0x08af;
                case 31: goto L_0x08a1;
                case 32: goto L_0x0893;
                case 33: goto L_0x0885;
                case 34: goto L_0x0877;
                case 35: goto L_0x0856;
                case 36: goto L_0x0838;
                case 37: goto L_0x081a;
                case 38: goto L_0x07fc;
                case 39: goto L_0x07dd;
                case 40: goto L_0x07be;
                case 41: goto L_0x079f;
                case 42: goto L_0x077e;
                case 43: goto L_0x075f;
                case 44: goto L_0x0740;
                case 45: goto L_0x0721;
                case 46: goto L_0x0702;
                case 47: goto L_0x06e3;
                case 48: goto L_0x06c1;
                case 49: goto L_0x06ab;
                case 50: goto L_0x069c;
                case 51: goto L_0x068e;
                case 52: goto L_0x067e;
                case 53: goto L_0x066f;
                case 54: goto L_0x0660;
                case 55: goto L_0x0651;
                case 56: goto L_0x0646;
                case 57: goto L_0x0636;
                case 58: goto L_0x0629;
                case 59: goto L_0x060b;
                case 60: goto L_0x05f7;
                case 61: goto L_0x05e5;
                case 62: goto L_0x05d5;
                case 63: goto L_0x05c5;
                case 64: goto L_0x05b8;
                case 65: goto L_0x05ac;
                case 66: goto L_0x059c;
                case 67: goto L_0x058c;
                case 68: goto L_0x0576;
                default: goto L_0x0574;
            }
        L_0x0574:
            goto L_0x06e0
        L_0x0576:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.q0 r3 = (com.fyber.inneractive.sdk.protobuf.C5207q0) r3
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo26270c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16026a(r14, r3, r6)
            goto L_0x06b9
        L_0x058c:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            long r6 = m16331e(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16043d((int) r14, (long) r6)
            goto L_0x06b9
        L_0x059c:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            int r3 = m16329d(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16044e((int) r14, (int) r3)
            goto L_0x06b9
        L_0x05ac:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16040c((int) r14, (long) r8)
            goto L_0x06b9
        L_0x05b8:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            r3 = 0
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16042d((int) r14, (int) r3)
            goto L_0x0641
        L_0x05c5:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            int r3 = m16329d(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16023a((int) r14, (int) r3)
            goto L_0x06b9
        L_0x05d5:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            int r3 = m16329d(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16046f((int) r14, (int) r3)
            goto L_0x06b9
        L_0x05e5:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C5151i) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16025a((int) r14, (com.fyber.inneractive.sdk.protobuf.C5151i) r3)
            goto L_0x06b9
        L_0x05f7:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo26270c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15719a((int) r14, (java.lang.Object) r3, (com.fyber.inneractive.sdk.protobuf.C5141f1) r6)
            goto L_0x06b9
        L_0x060b:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            java.lang.Object r3 = r2.getObject(r1, r6)
            boolean r6 = r3 instanceof com.fyber.inneractive.sdk.protobuf.C5151i
            if (r6 == 0) goto L_0x0621
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C5151i) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16025a((int) r14, (com.fyber.inneractive.sdk.protobuf.C5151i) r3)
            goto L_0x06b9
        L_0x0621:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16027a((int) r14, (java.lang.String) r3)
            goto L_0x06b9
        L_0x0629:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            r3 = 1
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16028a((int) r14, (boolean) r3)
            r13 = r11
            goto L_0x068b
        L_0x0636:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            r3 = 0
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16035b((int) r14, (int) r3)
        L_0x0641:
            r10 = r3
            r13 = r11
            r3 = 1
            goto L_0x0a6a
        L_0x0646:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16024a((int) r14, (long) r8)
            goto L_0x06b9
        L_0x0651:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            int r3 = m16329d(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16039c((int) r14, (int) r3)
            goto L_0x06b9
        L_0x0660:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            long r6 = m16331e(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16045e((int) r14, (long) r6)
            goto L_0x06b9
        L_0x066f:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            long r6 = m16331e(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16036b((int) r14, (long) r6)
            goto L_0x06b9
        L_0x067e:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            r3 = 0
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16022a((int) r14, (float) r3)
            r13 = r11
            r3 = 1
        L_0x068b:
            r10 = 0
            goto L_0x0a6a
        L_0x068e:
            boolean r3 = r0.mo26263a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06e0
            r6 = 0
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16021a((int) r14, (double) r6)
            r13 = r11
            goto L_0x06bc
        L_0x069c:
            com.fyber.inneractive.sdk.protobuf.l0 r3 = r0.f13894q
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.lang.Object r7 = r0.mo26264b((int) r4)
            int r3 = r3.mo26149a(r14, r6, r7)
            goto L_0x06b9
        L_0x06ab:
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo26270c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15721a((int) r14, (java.util.List<com.fyber.inneractive.sdk.protobuf.C5207q0>) r3, (com.fyber.inneractive.sdk.protobuf.C5141f1) r6)
        L_0x06b9:
            r13 = r11
            r6 = 0
        L_0x06bc:
            r10 = 0
            r11 = r3
            r3 = 1
            goto L_0x0a8a
        L_0x06c1:
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15752g(r6)
            if (r6 <= 0) goto L_0x06e0
            boolean r7 = r0.f13886i
            r13 = r11
            if (r7 == 0) goto L_0x06d6
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x06d6:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x06e0:
            r13 = r11
            goto L_0x0a1d
        L_0x06e3:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15749f(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x06f8
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x06f8:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x0702:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15740c(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x0717
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0717:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x0721:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15735b(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x0736
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0736:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x0740:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15723a((java.util.List<java.lang.Integer>) r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x0755
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0755:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x075f:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15755h(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x0774
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0774:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x077e:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            java.lang.Class<?> r7 = com.fyber.inneractive.sdk.protobuf.C5150h1.f13762a
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x0795
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0795:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x079f:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15735b(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x07b4
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x07b4:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x07be:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15740c(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x07d3
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x07d3:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x07dd:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15743d(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x07f2
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x07f2:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x07fc:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15758i(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x0811
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0811:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x081a:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15746e(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x082f
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x082f:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x0838:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15735b(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x084d
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x084d:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
            goto L_0x0873
        L_0x0856:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15740c(r6)
            if (r6 <= 0) goto L_0x0a1d
            boolean r7 = r0.f13886i
            if (r7 == 0) goto L_0x086b
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x086b:
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16034b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16038c((int) r6)
        L_0x0873:
            int r3 = r3 + r7
            int r3 = r3 + r6
            goto L_0x08f2
        L_0x0877:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            r10 = 0
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15754h(r14, r3, r10)
            goto L_0x0960
        L_0x0885:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15751g(r14, r3, r10)
            goto L_0x0960
        L_0x0893:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15742d(r14, r3, r10)
            goto L_0x0960
        L_0x08a1:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15739c(r14, r3, r10)
            goto L_0x0960
        L_0x08af:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15734b((int) r14, (java.util.List<java.lang.Integer>) r3, (boolean) r10)
            goto L_0x0960
        L_0x08bd:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15757i(r14, r3, r10)
            goto L_0x0960
        L_0x08cb:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15720a((int) r14, (java.util.List<com.fyber.inneractive.sdk.protobuf.C5151i>) r3)
            goto L_0x08f2
        L_0x08d7:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo26270c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15733b((int) r14, (java.util.List<?>) r3, (com.fyber.inneractive.sdk.protobuf.C5141f1) r6)
            goto L_0x08f2
        L_0x08e7:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15732b(r14, r3)
        L_0x08f2:
            r11 = r3
            r3 = 1
        L_0x08f4:
            r6 = 0
            r10 = 0
            goto L_0x0a8a
        L_0x08f9:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            r10 = 0
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15722a((int) r14, (java.util.List<?>) r3, (boolean) r10)
            goto L_0x0960
        L_0x0906:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15739c(r14, r3, r10)
            goto L_0x0960
        L_0x0913:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15742d(r14, r3, r10)
            goto L_0x0960
        L_0x0920:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15745e(r14, r3, r10)
            goto L_0x0960
        L_0x092d:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15760j(r14, r3, r10)
            goto L_0x0960
        L_0x093a:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15748f(r14, r3, r10)
            goto L_0x0960
        L_0x0947:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15739c(r14, r3, r10)
            goto L_0x0960
        L_0x0954:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15742d(r14, r3, r10)
        L_0x0960:
            r11 = r3
        L_0x0961:
            r3 = 1
        L_0x0962:
            r6 = 0
            goto L_0x0a8a
        L_0x0966:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.q0 r3 = (com.fyber.inneractive.sdk.protobuf.C5207q0) r3
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo26270c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16026a(r14, r3, r6)
            goto L_0x08f2
        L_0x097b:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            long r6 = r2.getLong(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16043d((int) r14, (long) r6)
            goto L_0x08f2
        L_0x098a:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            int r3 = r2.getInt(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16044e((int) r14, (int) r3)
            goto L_0x08f2
        L_0x0999:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16040c((int) r14, (long) r8)
            goto L_0x08f2
        L_0x09a4:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            r3 = 0
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16042d((int) r14, (int) r3)
            r10 = r3
            r11 = r6
            goto L_0x0961
        L_0x09b1:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            int r3 = r2.getInt(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16023a((int) r14, (int) r3)
            goto L_0x08f2
        L_0x09c0:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            int r3 = r2.getInt(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16046f((int) r14, (int) r3)
            goto L_0x08f2
        L_0x09cf:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C5151i) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16025a((int) r14, (com.fyber.inneractive.sdk.protobuf.C5151i) r3)
            goto L_0x08f2
        L_0x09e0:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo26270c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15719a((int) r14, (java.lang.Object) r3, (com.fyber.inneractive.sdk.protobuf.C5141f1) r6)
            goto L_0x08f2
        L_0x09f3:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            java.lang.Object r3 = r2.getObject(r1, r6)
            boolean r6 = r3 instanceof com.fyber.inneractive.sdk.protobuf.C5151i
            if (r6 == 0) goto L_0x0a08
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C5151i) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16025a((int) r14, (com.fyber.inneractive.sdk.protobuf.C5151i) r3)
            goto L_0x08f2
        L_0x0a08:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C5183l.m16027a((int) r14, (java.lang.String) r3)
            goto L_0x08f2
        L_0x0a10:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1d
            r3 = 1
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16028a((int) r14, (boolean) r3)
            r11 = r6
            goto L_0x08f4
        L_0x0a1d:
            r3 = 1
            r6 = 0
            r10 = 0
            goto L_0x0a8e
        L_0x0a23:
            r13 = r11
            r3 = 1
            r6 = r12 & r18
            r10 = 0
            if (r6 == 0) goto L_0x0a8c
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16035b((int) r14, (int) r10)
            goto L_0x0a6a
        L_0x0a2f:
            r13 = r11
            r3 = 1
            r10 = 0
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0a8c
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16024a((int) r14, (long) r8)
            goto L_0x0a6a
        L_0x0a3b:
            r13 = r11
            r3 = 1
            r10 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a8c
            int r6 = r2.getInt(r1, r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16039c((int) r14, (int) r6)
            goto L_0x0a6a
        L_0x0a4b:
            r13 = r11
            r3 = 1
            r10 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a8c
            long r6 = r2.getLong(r1, r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16045e((int) r14, (long) r6)
            goto L_0x0a6a
        L_0x0a5b:
            r13 = r11
            r3 = 1
            r10 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a8c
            long r6 = r2.getLong(r1, r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5183l.m16036b((int) r14, (long) r6)
        L_0x0a6a:
            r11 = r6
            goto L_0x0962
        L_0x0a6d:
            r13 = r11
            r3 = 1
            r10 = 0
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0a8c
            r6 = 0
            int r7 = com.fyber.inneractive.sdk.protobuf.C5183l.m16022a((int) r14, (float) r6)
            r11 = r7
            goto L_0x0962
        L_0x0a7c:
            r13 = r11
            r3 = 1
            r6 = 0
            r10 = 0
            r7 = r12 & r18
            if (r7 == 0) goto L_0x0a8c
            r6 = 0
            int r11 = com.fyber.inneractive.sdk.protobuf.C5183l.m16021a((int) r14, (double) r6)
        L_0x0a8a:
            int r5 = r5 + r11
            goto L_0x0a8e
        L_0x0a8c:
            r6 = 0
        L_0x0a8e:
            int r4 = r4 + 3
            r7 = r3
            r11 = r13
            r3 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0528
        L_0x0a98:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r2 = r0.f13892o
            java.lang.Object r3 = r2.mo26174b(r1)
            int r2 = r2.mo26178c(r3)
            int r12 = r5 + r2
            boolean r2 = r0.f13883f
            if (r2 == 0) goto L_0x0ab4
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r0.f13893p
            com.fyber.inneractive.sdk.protobuf.u r1 = r2.mo26221a((java.lang.Object) r1)
            int r1 = r1.mo26284d()
            goto L_0x051f
        L_0x0ab4:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo25949b(java.lang.Object):int");
    }

    /* renamed from: a */
    public static Field m16325a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: a */
    public T mo25943a() {
        return this.f13890m.mo26292a(this.f13882e);
    }

    /* renamed from: a */
    public void mo25946a(T t, T t2) {
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f13878a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long d = m16330d(i2);
                int i3 = this.f13878a[i];
                switch (m16333f(i2)) {
                    case 0:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.C5216d dVar = C5212r1.f13866e;
                            dVar.mo26233a((Object) t, d, dVar.mo26239c(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 1:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.C5216d dVar2 = C5212r1.f13866e;
                            dVar2.mo26234a((Object) t, d, dVar2.mo26240d(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 2:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16222a((Object) t, d, C5212r1.m16235f(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 3:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16222a((Object) t, d, C5212r1.m16235f(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 4:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16221a((Object) t, d, C5212r1.m16234e(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 5:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16222a((Object) t, d, C5212r1.m16235f(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 6:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16221a((Object) t, d, C5212r1.m16234e(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 7:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.C5216d dVar3 = C5212r1.f13866e;
                            dVar3.mo26235a((Object) t, d, dVar3.mo26236a(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 8:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16223a((Object) t, d, C5212r1.m16236g(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 9:
                        mo26261a(t, t2, i);
                        break;
                    case 10:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16223a((Object) t, d, C5212r1.m16236g(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 11:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16221a((Object) t, d, C5212r1.m16234e(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 12:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16221a((Object) t, d, C5212r1.m16234e(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 13:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16221a((Object) t, d, C5212r1.m16234e(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 14:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16222a((Object) t, d, C5212r1.m16235f(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 15:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16221a((Object) t, d, C5212r1.m16234e(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 16:
                        if (!mo26262a(t2, i)) {
                            break;
                        } else {
                            C5212r1.m16222a((Object) t, d, C5212r1.m16235f(t2, d));
                            mo26265b(t, i);
                            break;
                        }
                    case 17:
                        mo26261a(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f13891n.mo25965a(t, t2, d);
                        break;
                    case 50:
                        C5189l0 l0Var = this.f13894q;
                        Class<?> cls = C5150h1.f13762a;
                        C5212r1.m16223a((Object) t, d, l0Var.mo26150a(C5212r1.m16236g(t, d), C5212r1.m16236g(t2, d)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!mo26263a(t2, i3, i)) {
                            break;
                        } else {
                            C5212r1.m16223a((Object) t, d, C5212r1.m16236g(t2, d));
                            mo26266b(t, i3, i);
                            break;
                        }
                    case 60:
                        mo26269b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!mo26263a(t2, i3, i)) {
                            break;
                        } else {
                            C5212r1.m16223a((Object) t, d, C5212r1.m16236g(t2, d));
                            mo26266b(t, i3, i);
                            break;
                        }
                    case 68:
                        mo26269b(t, t2, i);
                        break;
                }
                i += 3;
            } else {
                C5193m1<?, ?> m1Var = this.f13892o;
                Class<?> cls2 = C5150h1.f13762a;
                m1Var.mo26179c(t, m1Var.mo26166a(m1Var.mo26174b(t), m1Var.mo26174b(t2)));
                if (this.f13883f) {
                    C5210r<?> rVar = this.f13893p;
                    C5239u<?> a = rVar.mo26221a((Object) t2);
                    if (!a.f13935a.isEmpty()) {
                        rVar.mo26228b(t).mo26279a(a);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: d */
    public static <T> int m16329d(T t, long j) {
        return ((Integer) C5212r1.m16236g(t, j)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x053d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25945a(T r18, com.fyber.inneractive.sdk.protobuf.C5242u1 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r19.getClass()
            boolean r3 = r0.f13885h
            if (r3 == 0) goto L_0x0012
            r17.mo26268b(r18, (com.fyber.inneractive.sdk.protobuf.C5242u1) r19)
            goto L_0x055b
        L_0x0012:
            boolean r3 = r0.f13883f
            if (r3 == 0) goto L_0x002f
            com.fyber.inneractive.sdk.protobuf.r<?> r3 = r0.f13893p
            com.fyber.inneractive.sdk.protobuf.u r3 = r3.mo26221a((java.lang.Object) r1)
            com.fyber.inneractive.sdk.protobuf.i1<T, java.lang.Object> r5 = r3.f13935a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x002f
            java.util.Iterator r3 = r3.mo26288f()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0031
        L_0x002f:
            r3 = 0
            r5 = 0
        L_0x0031:
            int[] r6 = r0.f13878a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f13877s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x003c:
            if (r10 >= r6) goto L_0x053b
            int r13 = r0.mo26272g(r10)
            int[] r14 = r0.f13878a
            r14 = r14[r10]
            int r15 = m16333f(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0064
            int[] r4 = r0.f13878a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x005e
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x005e:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            if (r5 == 0) goto L_0x0083
            com.fyber.inneractive.sdk.protobuf.r<?> r9 = r0.f13893p
            int r9 = r9.mo26220a((java.util.Map.Entry<?, ?>) r5)
            if (r9 > r14) goto L_0x0083
            com.fyber.inneractive.sdk.protobuf.r<?> r9 = r0.f13893p
            r9.mo26226a(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0065
        L_0x0081:
            r5 = 0
            goto L_0x0065
        L_0x0083:
            long r8 = m16330d((int) r13)
            switch(r15) {
                case 0: goto L_0x0524;
                case 1: goto L_0x0513;
                case 2: goto L_0x0502;
                case 3: goto L_0x04f1;
                case 4: goto L_0x04e0;
                case 5: goto L_0x04cf;
                case 6: goto L_0x04be;
                case 7: goto L_0x04aa;
                case 8: goto L_0x049d;
                case 9: goto L_0x0489;
                case 10: goto L_0x0475;
                case 11: goto L_0x0463;
                case 12: goto L_0x0451;
                case 13: goto L_0x043f;
                case 14: goto L_0x042d;
                case 15: goto L_0x041d;
                case 16: goto L_0x040d;
                case 17: goto L_0x03f9;
                case 18: goto L_0x03e9;
                case 19: goto L_0x03d9;
                case 20: goto L_0x03c9;
                case 21: goto L_0x03b9;
                case 22: goto L_0x03a9;
                case 23: goto L_0x0399;
                case 24: goto L_0x0389;
                case 25: goto L_0x0379;
                case 26: goto L_0x0369;
                case 27: goto L_0x0357;
                case 28: goto L_0x0349;
                case 29: goto L_0x0339;
                case 30: goto L_0x0329;
                case 31: goto L_0x0319;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f9;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d9;
                case 36: goto L_0x02c9;
                case 37: goto L_0x02b9;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0299;
                case 40: goto L_0x0289;
                case 41: goto L_0x0279;
                case 42: goto L_0x0269;
                case 43: goto L_0x0259;
                case 44: goto L_0x0249;
                case 45: goto L_0x0239;
                case 46: goto L_0x0229;
                case 47: goto L_0x0219;
                case 48: goto L_0x0209;
                case 49: goto L_0x01f6;
                case 50: goto L_0x01ed;
                case 51: goto L_0x01db;
                case 52: goto L_0x01c9;
                case 53: goto L_0x01b5;
                case 54: goto L_0x01a1;
                case 55: goto L_0x018d;
                case 56: goto L_0x0179;
                case 57: goto L_0x0165;
                case 58: goto L_0x0151;
                case 59: goto L_0x0142;
                case 60: goto L_0x012c;
                case 61: goto L_0x0116;
                case 62: goto L_0x0102;
                case 63: goto L_0x00ee;
                case 64: goto L_0x00da;
                case 65: goto L_0x00c6;
                case 66: goto L_0x00b4;
                case 67: goto L_0x00a2;
                case 68: goto L_0x008c;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x0376
        L_0x008c:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r0.mo26270c((int) r10)
            r9 = r2
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C5191m) r9
            r9.mo26162a(r14, r4, r8)
            goto L_0x0376
        L_0x00a2:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            long r8 = m16331e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            r4.mo26160a((int) r14, (long) r8)
            goto L_0x0376
        L_0x00b4:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            int r4 = m16329d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            r8.mo26159a((int) r14, (int) r4)
            goto L_0x0376
        L_0x00c6:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            long r8 = m16331e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f13841a
            r4.mo26129f((int) r14, (long) r8)
            goto L_0x0376
        L_0x00da:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            int r4 = m16329d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26131g((int) r14, (int) r4)
            goto L_0x0376
        L_0x00ee:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            int r4 = m16329d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26133h(r14, r4)
            goto L_0x0376
        L_0x0102:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            int r4 = m16329d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26135j(r14, r4)
            goto L_0x0376
        L_0x0116:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C5151i) r4
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26120b((int) r14, (com.fyber.inneractive.sdk.protobuf.C5151i) r4)
            goto L_0x0376
        L_0x012c:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r0.mo26270c((int) r10)
            r9 = r2
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C5191m) r9
            r9.mo26163b(r14, r4, r8)
            goto L_0x0376
        L_0x0142:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo26254a((int) r14, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2)
            goto L_0x0376
        L_0x0151:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            boolean r4 = m16326a(r1, (long) r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26123b((int) r14, (boolean) r4)
            goto L_0x0376
        L_0x0165:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            int r4 = m16329d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26131g((int) r14, (int) r4)
            goto L_0x0376
        L_0x0179:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            long r8 = m16331e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f13841a
            r4.mo26129f((int) r14, (long) r8)
            goto L_0x0376
        L_0x018d:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            int r4 = m16329d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26133h(r14, r4)
            goto L_0x0376
        L_0x01a1:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            long r8 = m16331e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f13841a
            r4.mo26132g((int) r14, (long) r8)
            goto L_0x0376
        L_0x01b5:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            long r8 = m16331e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f13841a
            r4.mo26132g((int) r14, (long) r8)
            goto L_0x0376
        L_0x01c9:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            float r4 = m16328c(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            r8.mo26158a((int) r14, (float) r4)
            goto L_0x0376
        L_0x01db:
            boolean r4 = r0.mo26263a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0376
            double r8 = m16327b(r1, (long) r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            r4.mo26157a((int) r14, (double) r8)
            goto L_0x0376
        L_0x01ed:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo26256a((com.fyber.inneractive.sdk.protobuf.C5242u1) r2, (int) r14, (java.lang.Object) r4, (int) r10)
            goto L_0x0376
        L_0x01f6:
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.f1 r9 = r0.mo26270c((int) r10)
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15729a((int) r4, (java.util.List<?>) r8, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2, (com.fyber.inneractive.sdk.protobuf.C5141f1) r9)
            goto L_0x0376
        L_0x0209:
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15763l(r4, r8, r2, r13)
            goto L_0x0376
        L_0x0219:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15762k(r4, r8, r2, r13)
            goto L_0x0376
        L_0x0229:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15761j(r4, r8, r2, r13)
            goto L_0x0376
        L_0x0239:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15759i(r4, r8, r2, r13)
            goto L_0x0376
        L_0x0249:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15741c(r4, r8, r2, r13)
            goto L_0x0376
        L_0x0259:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15764m(r4, r8, r2, r13)
            goto L_0x0376
        L_0x0269:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15730a((int) r4, (java.util.List<java.lang.Boolean>) r8, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2, (boolean) r13)
            goto L_0x0376
        L_0x0279:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15744d(r4, r8, r2, r13)
            goto L_0x0376
        L_0x0289:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15747e(r4, r8, r2, r13)
            goto L_0x0376
        L_0x0299:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15753g(r4, r8, r2, r13)
            goto L_0x0376
        L_0x02a9:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15765n(r4, r8, r2, r13)
            goto L_0x0376
        L_0x02b9:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15756h(r4, r8, r2, r13)
            goto L_0x0376
        L_0x02c9:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15750f(r4, r8, r2, r13)
            goto L_0x0376
        L_0x02d9:
            r13 = 1
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15738b((int) r4, (java.util.List<java.lang.Double>) r8, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2, (boolean) r13)
            goto L_0x0376
        L_0x02e9:
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15763l(r4, r8, r2, r13)
            goto L_0x0534
        L_0x02f9:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15762k(r4, r8, r2, r13)
            goto L_0x0534
        L_0x0309:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15761j(r4, r8, r2, r13)
            goto L_0x0534
        L_0x0319:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15759i(r4, r8, r2, r13)
            goto L_0x0534
        L_0x0329:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15741c(r4, r8, r2, r13)
            goto L_0x0534
        L_0x0339:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15764m(r4, r8, r2, r13)
            goto L_0x0534
        L_0x0349:
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15728a((int) r4, (java.util.List<com.fyber.inneractive.sdk.protobuf.C5151i>) r8, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2)
            goto L_0x0376
        L_0x0357:
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.f1 r9 = r0.mo26270c((int) r10)
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15737b((int) r4, (java.util.List<?>) r8, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2, (com.fyber.inneractive.sdk.protobuf.C5141f1) r9)
            goto L_0x0376
        L_0x0369:
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15736b((int) r4, (java.util.List<java.lang.String>) r8, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2)
        L_0x0376:
            r13 = 0
            goto L_0x0534
        L_0x0379:
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15730a((int) r4, (java.util.List<java.lang.Boolean>) r8, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2, (boolean) r13)
            goto L_0x0534
        L_0x0389:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15744d(r4, r8, r2, r13)
            goto L_0x0534
        L_0x0399:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15747e(r4, r8, r2, r13)
            goto L_0x0534
        L_0x03a9:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15753g(r4, r8, r2, r13)
            goto L_0x0534
        L_0x03b9:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15765n(r4, r8, r2, r13)
            goto L_0x0534
        L_0x03c9:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15756h(r4, r8, r2, r13)
            goto L_0x0534
        L_0x03d9:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15750f(r4, r8, r2, r13)
            goto L_0x0534
        L_0x03e9:
            r13 = 0
            int[] r4 = r0.f13878a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15738b((int) r4, (java.util.List<java.lang.Double>) r8, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2, (boolean) r13)
            goto L_0x0534
        L_0x03f9:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r0.mo26270c((int) r10)
            r9 = r2
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C5191m) r9
            r9.mo26162a(r14, r4, r8)
            goto L_0x0534
        L_0x040d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            r4.mo26160a((int) r14, (long) r8)
            goto L_0x0534
        L_0x041d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            r8.mo26159a((int) r14, (int) r4)
            goto L_0x0534
        L_0x042d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f13841a
            r4.mo26129f((int) r14, (long) r8)
            goto L_0x0534
        L_0x043f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26131g((int) r14, (int) r4)
            goto L_0x0534
        L_0x0451:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26133h(r14, r4)
            goto L_0x0534
        L_0x0463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26135j(r14, r4)
            goto L_0x0534
        L_0x0475:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C5151i) r4
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26120b((int) r14, (com.fyber.inneractive.sdk.protobuf.C5151i) r4)
            goto L_0x0534
        L_0x0489:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r0.mo26270c((int) r10)
            r9 = r2
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C5191m) r9
            r9.mo26163b(r14, r4, r8)
            goto L_0x0534
        L_0x049d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo26254a((int) r14, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2)
            goto L_0x0534
        L_0x04aa:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            boolean r4 = r4.mo26236a(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26123b((int) r14, (boolean) r4)
            goto L_0x0534
        L_0x04be:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26131g((int) r14, (int) r4)
            goto L_0x0534
        L_0x04cf:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f13841a
            r4.mo26129f((int) r14, (long) r8)
            goto L_0x0534
        L_0x04e0:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26133h(r14, r4)
            goto L_0x0534
        L_0x04f1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f13841a
            r4.mo26132g((int) r14, (long) r8)
            goto L_0x0534
        L_0x0502:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f13841a
            r4.mo26132g((int) r14, (long) r8)
            goto L_0x0534
        L_0x0513:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            float r4 = r4.mo26240d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            r8.mo26158a((int) r14, (float) r4)
            goto L_0x0534
        L_0x0524:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0534
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            double r8 = r4.mo26239c(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C5191m) r4
            r4.mo26157a((int) r14, (double) r8)
        L_0x0534:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x003c
        L_0x053b:
            if (r5 == 0) goto L_0x0552
            com.fyber.inneractive.sdk.protobuf.r<?> r4 = r0.f13893p
            r4.mo26226a(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0550
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x053b
        L_0x0550:
            r5 = 0
            goto L_0x053b
        L_0x0552:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r3 = r0.f13892o
            java.lang.Object r1 = r3.mo26174b(r1)
            r3.mo26176b(r1, (com.fyber.inneractive.sdk.protobuf.C5242u1) r2)
        L_0x055b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo25945a(java.lang.Object, com.fyber.inneractive.sdk.protobuf.u1):void");
    }

    /* renamed from: a */
    public final <K, V> void mo26256a(C5242u1 u1Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f13894q.mo26156f(this.f13879b[(i2 / 3) * 2]);
            Map<?, ?> a = this.f13894q.mo26151a(obj);
            C5191m mVar = (C5191m) u1Var;
            mVar.f13841a.getClass();
            Iterator<Map.Entry<?, ?>> it = a.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry next = it.next();
                mVar.f13841a.mo26134i(i, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void mo25944a(T t, C5136e1 e1Var, C5205q qVar) throws IOException {
        qVar.getClass();
        mo26255a(this.f13892o, this.f13893p, t, e1Var, qVar);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public final <UT, UB, ET extends com.fyber.inneractive.sdk.protobuf.C5239u.C5240a<ET>> void mo26255a(com.fyber.inneractive.sdk.protobuf.C5193m1<UT, UB> r17, com.fyber.inneractive.sdk.protobuf.C5210r<ET> r18, T r19, com.fyber.inneractive.sdk.protobuf.C5136e1 r20, com.fyber.inneractive.sdk.protobuf.C5205q r21) throws java.io.IOException {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo25922s()     // Catch:{ all -> 0x0610 }
            int r3 = r8.mo26271e((int) r1)     // Catch:{ all -> 0x0610 }
            if (r3 >= 0) goto L_0x008d
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f13888k
        L_0x001e:
            int r1 = r8.f13889l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f13887j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo26253a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo26177b((java.lang.Object) r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f13883f     // Catch:{ all -> 0x0610 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r8.f13882e     // Catch:{ all -> 0x0610 }
            r15 = r18
            java.lang.Object r1 = r15.mo26223a(r11, r2, r1)     // Catch:{ all -> 0x0610 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004c
            com.fyber.inneractive.sdk.protobuf.u r14 = r18.mo26228b(r19)     // Catch:{ all -> 0x0610 }
        L_0x004c:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r1 = r1.mo26222a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0610 }
        L_0x005a:
            r13 = r1
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.mo26172a((com.fyber.inneractive.sdk.protobuf.C5136e1) r0)     // Catch:{ all -> 0x0610 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.mo25904i()     // Catch:{ all -> 0x0610 }
            if (r1 == 0) goto L_0x0076
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x006f
            java.lang.Object r13 = r9.mo26165a((java.lang.Object) r10)     // Catch:{ all -> 0x0610 }
        L_0x006f:
            boolean r1 = r9.mo26173a(r13, (com.fyber.inneractive.sdk.protobuf.C5136e1) r0)     // Catch:{ all -> 0x0610 }
            if (r1 == 0) goto L_0x0076
            goto L_0x000d
        L_0x0076:
            int r0 = r8.f13888k
        L_0x0078:
            int r1 = r8.f13889l
            if (r0 >= r1) goto L_0x0087
            int[] r1 = r8.f13887j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo26253a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0078
        L_0x0087:
            if (r13 == 0) goto L_0x008c
            r9.mo26177b((java.lang.Object) r10, r13)
        L_0x008c:
            return
        L_0x008d:
            r15 = r18
            int r4 = r8.mo26272g(r3)     // Catch:{ all -> 0x0610 }
            int r2 = m16333f(r4)     // Catch:{ a -> 0x05c9 }
            switch(r2) {
                case 0: goto L_0x059c;
                case 1: goto L_0x058c;
                case 2: goto L_0x057c;
                case 3: goto L_0x056c;
                case 4: goto L_0x055c;
                case 5: goto L_0x054c;
                case 6: goto L_0x053c;
                case 7: goto L_0x052c;
                case 8: goto L_0x0524;
                case 9: goto L_0x04ed;
                case 10: goto L_0x04dd;
                case 11: goto L_0x04cd;
                case 12: goto L_0x04aa;
                case 13: goto L_0x049a;
                case 14: goto L_0x048a;
                case 15: goto L_0x047a;
                case 16: goto L_0x046a;
                case 17: goto L_0x0433;
                case 18: goto L_0x0424;
                case 19: goto L_0x0415;
                case 20: goto L_0x0406;
                case 21: goto L_0x03f7;
                case 22: goto L_0x03e8;
                case 23: goto L_0x03d9;
                case 24: goto L_0x03ca;
                case 25: goto L_0x03bb;
                case 26: goto L_0x03b6;
                case 27: goto L_0x03a4;
                case 28: goto L_0x0395;
                case 29: goto L_0x0386;
                case 30: goto L_0x036f;
                case 31: goto L_0x0360;
                case 32: goto L_0x0351;
                case 33: goto L_0x0342;
                case 34: goto L_0x0333;
                case 35: goto L_0x0324;
                case 36: goto L_0x0315;
                case 37: goto L_0x0306;
                case 38: goto L_0x02f7;
                case 39: goto L_0x02e8;
                case 40: goto L_0x02d9;
                case 41: goto L_0x02ca;
                case 42: goto L_0x02bb;
                case 43: goto L_0x02ac;
                case 44: goto L_0x0295;
                case 45: goto L_0x0286;
                case 46: goto L_0x0277;
                case 47: goto L_0x0268;
                case 48: goto L_0x0259;
                case 49: goto L_0x0243;
                case 50: goto L_0x0232;
                case 51: goto L_0x021e;
                case 52: goto L_0x020a;
                case 53: goto L_0x01f6;
                case 54: goto L_0x01e2;
                case 55: goto L_0x01ce;
                case 56: goto L_0x01ba;
                case 57: goto L_0x01a6;
                case 58: goto L_0x0192;
                case 59: goto L_0x018a;
                case 60: goto L_0x0151;
                case 61: goto L_0x0141;
                case 62: goto L_0x012d;
                case 63: goto L_0x0106;
                case 64: goto L_0x00f2;
                case 65: goto L_0x00de;
                case 66: goto L_0x00ca;
                case 67: goto L_0x00b6;
                case 68: goto L_0x00a2;
                default: goto L_0x009a;
            }     // Catch:{ a -> 0x05c9 }
        L_0x009a:
            if (r13 != 0) goto L_0x05ac
            java.lang.Object r13 = r17.mo26164a()     // Catch:{ a -> 0x05c9 }
            goto L_0x05ac
        L_0x00a2:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.f1 r2 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r2 = r0.mo25881a(r2, (com.fyber.inneractive.sdk.protobuf.C5205q) r11)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x00b6:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r6 = r20.mo25909l()     // Catch:{ a -> 0x05c9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x00ca:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r2 = r20.mo25905j()     // Catch:{ a -> 0x05c9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x00de:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r6 = r20.mo25923t()     // Catch:{ a -> 0x05c9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x00f2:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r2 = r20.mo25911m()     // Catch:{ a -> 0x05c9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0106:
            int r2 = r20.mo25886b()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.z$e r5 = r8.mo26252a((int) r3)     // Catch:{ a -> 0x05c9 }
            if (r5 == 0) goto L_0x011d
            boolean r5 = r5.mo26317a(r2)     // Catch:{ a -> 0x05c9 }
            if (r5 == 0) goto L_0x0117
            goto L_0x011d
        L_0x0117:
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15725a((int) r1, (int) r2, r13, r9)     // Catch:{ a -> 0x05c9 }
            goto L_0x005a
        L_0x011d:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x012d:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r2 = r20.mo25891c()     // Catch:{ a -> 0x05c9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0141:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.i r2 = r20.mo25880a()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0151:
            boolean r2 = r8.mo26263a(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            if (r2 == 0) goto L_0x0173
            long r5 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r2 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r5)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r5 = r0.mo25887b(r5, (com.fyber.inneractive.sdk.protobuf.C5205q) r11)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r2 = com.fyber.inneractive.sdk.protobuf.C5252z.m16434a((java.lang.Object) r2, (java.lang.Object) r5)     // Catch:{ a -> 0x05c9 }
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            goto L_0x0185
        L_0x0173:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.f1 r2 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r2 = r0.mo25887b(r2, (com.fyber.inneractive.sdk.protobuf.C5205q) r11)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
        L_0x0185:
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x018a:
            r8.mo26257a((java.lang.Object) r10, (int) r4, (com.fyber.inneractive.sdk.protobuf.C5136e1) r0)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0192:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            boolean r2 = r20.mo25921r()     // Catch:{ a -> 0x05c9 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x01a6:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r2 = r20.mo25919q()     // Catch:{ a -> 0x05c9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x01ba:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r6 = r20.mo25899g()     // Catch:{ a -> 0x05c9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x01ce:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r2 = r20.mo25893d()     // Catch:{ a -> 0x05c9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x01e2:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r6 = r20.mo25897f()     // Catch:{ a -> 0x05c9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x01f6:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r6 = r20.mo25915o()     // Catch:{ a -> 0x05c9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x020a:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            float r2 = r20.mo25907k()     // Catch:{ a -> 0x05c9 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x021e:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            double r6 = r20.mo25901h()     // Catch:{ a -> 0x05c9 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26266b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0232:
            java.lang.Object r4 = r8.mo26264b((int) r3)     // Catch:{ a -> 0x05c9 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo26259a((java.lang.Object) r2, (int) r3, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C5205q) r5, (com.fyber.inneractive.sdk.protobuf.C5136e1) r6)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0243:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo26260a((java.lang.Object) r2, (long) r3, (com.fyber.inneractive.sdk.protobuf.C5136e1) r5, r6, (com.fyber.inneractive.sdk.protobuf.C5205q) r7)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0259:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25900g(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0268:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25892c(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0277:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25912m(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0286:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25898f(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0295:
            com.fyber.inneractive.sdk.protobuf.g0 r2 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r2 = r2.mo25966b(r10, r4)     // Catch:{ a -> 0x05c9 }
            r0.mo25918p(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.z$e r3 = r8.mo26252a((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15727a((int) r1, (java.util.List<java.lang.Integer>) r2, (com.fyber.inneractive.sdk.protobuf.C5252z.C5257e) r3, r13, r9)     // Catch:{ a -> 0x05c9 }
            goto L_0x005a
        L_0x02ac:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25903i(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x02bb:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25910l(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x02ca:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25896e(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x02d9:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25914n(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x02e8:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25916o(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x02f7:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25883a(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0306:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25908k(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0315:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25894d(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0324:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25906j(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0333:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25900g(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0342:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25892c(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0351:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25912m(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0360:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25898f(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x036f:
            com.fyber.inneractive.sdk.protobuf.g0 r2 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r2 = r2.mo25966b(r10, r4)     // Catch:{ a -> 0x05c9 }
            r0.mo25918p(r2)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.z$e r3 = r8.mo26252a((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15727a((int) r1, (java.util.List<java.lang.Integer>) r2, (com.fyber.inneractive.sdk.protobuf.C5252z.C5257e) r3, r13, r9)     // Catch:{ a -> 0x05c9 }
            goto L_0x005a
        L_0x0386:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25903i(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0395:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25902h(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x03a4:
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo26258a((java.lang.Object) r2, (int) r3, (com.fyber.inneractive.sdk.protobuf.C5136e1) r4, r5, (com.fyber.inneractive.sdk.protobuf.C5205q) r6)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x03b6:
            r8.mo26267b((java.lang.Object) r10, (int) r4, (com.fyber.inneractive.sdk.protobuf.C5136e1) r0)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x03bb:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25910l(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x03ca:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25896e(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x03d9:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25914n(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x03e8:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25916o(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x03f7:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25883a(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0406:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25908k(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0415:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25894d(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0424:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f13891n     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.util.List r1 = r1.mo25966b(r10, r2)     // Catch:{ a -> 0x05c9 }
            r0.mo25906j(r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0433:
            boolean r1 = r8.mo26262a(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            if (r1 == 0) goto L_0x0456
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r1)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.f1 r2 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r2 = r0.mo25881a(r2, (com.fyber.inneractive.sdk.protobuf.C5205q) r11)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5252z.m16434a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r2, (java.lang.Object) r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0456:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.f1 r4 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r4 = r0.mo25881a(r4, (com.fyber.inneractive.sdk.protobuf.C5205q) r11)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r1, (java.lang.Object) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x046a:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r4 = r20.mo25909l()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16222a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x047a:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r4 = r20.mo25905j()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16221a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x048a:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r4 = r20.mo25923t()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16222a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x049a:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r4 = r20.mo25911m()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16221a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x04aa:
            int r2 = r20.mo25886b()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.z$e r5 = r8.mo26252a((int) r3)     // Catch:{ a -> 0x05c9 }
            if (r5 == 0) goto L_0x04c1
            boolean r5 = r5.mo26317a(r2)     // Catch:{ a -> 0x05c9 }
            if (r5 == 0) goto L_0x04bb
            goto L_0x04c1
        L_0x04bb:
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15725a((int) r1, (int) r2, r13, r9)     // Catch:{ a -> 0x05c9 }
            goto L_0x005a
        L_0x04c1:
            long r4 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16221a((java.lang.Object) r10, (long) r4, (int) r2)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x04cd:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r4 = r20.mo25891c()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16221a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x04dd:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.i r4 = r20.mo25880a()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r1, (java.lang.Object) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x04ed:
            boolean r1 = r8.mo26262a(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            if (r1 == 0) goto L_0x0510
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r10, r1)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.f1 r2 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r2 = r0.mo25887b(r2, (com.fyber.inneractive.sdk.protobuf.C5205q) r11)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5252z.m16434a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ a -> 0x05c9 }
            long r2 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r2, (java.lang.Object) r1)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0510:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.f1 r4 = r8.mo26270c((int) r3)     // Catch:{ a -> 0x05c9 }
            java.lang.Object r4 = r0.mo25887b(r4, (com.fyber.inneractive.sdk.protobuf.C5205q) r11)     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16223a((java.lang.Object) r10, (long) r1, (java.lang.Object) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x0524:
            r8.mo26257a((java.lang.Object) r10, (int) r4, (com.fyber.inneractive.sdk.protobuf.C5136e1) r0)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x052c:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            boolean r4 = r20.mo25921r()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16224a((java.lang.Object) r10, (long) r1, (boolean) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x053c:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r4 = r20.mo25919q()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16221a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x054c:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r4 = r20.mo25899g()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16222a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x055c:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            int r4 = r20.mo25893d()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16221a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x056c:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r4 = r20.mo25897f()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16222a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x057c:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            long r4 = r20.mo25915o()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16222a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x058c:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            float r4 = r20.mo25907k()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16220a((java.lang.Object) r10, (long) r1, (float) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x059c:
            long r1 = m16330d((int) r4)     // Catch:{ a -> 0x05c9 }
            double r4 = r20.mo25901h()     // Catch:{ a -> 0x05c9 }
            com.fyber.inneractive.sdk.protobuf.C5212r1.m16219a((java.lang.Object) r10, (long) r1, (double) r4)     // Catch:{ a -> 0x05c9 }
            r8.mo26265b(r10, (int) r3)     // Catch:{ a -> 0x05c9 }
            goto L_0x000d
        L_0x05ac:
            boolean r1 = r9.mo26173a(r13, (com.fyber.inneractive.sdk.protobuf.C5136e1) r0)     // Catch:{ a -> 0x05c9 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f13888k
        L_0x05b4:
            int r1 = r8.f13889l
            if (r0 >= r1) goto L_0x05c3
            int[] r1 = r8.f13887j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo26253a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b4
        L_0x05c3:
            if (r13 == 0) goto L_0x05c8
            r9.mo26177b((java.lang.Object) r10, r13)
        L_0x05c8:
            return
        L_0x05c9:
            boolean r1 = r9.mo26172a((com.fyber.inneractive.sdk.protobuf.C5136e1) r0)     // Catch:{ all -> 0x0610 }
            if (r1 == 0) goto L_0x05ec
            boolean r1 = r20.mo25904i()     // Catch:{ all -> 0x0610 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f13888k
        L_0x05d7:
            int r1 = r8.f13889l
            if (r0 >= r1) goto L_0x05e6
            int[] r1 = r8.f13887j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo26253a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d7
        L_0x05e6:
            if (r13 == 0) goto L_0x05eb
            r9.mo26177b((java.lang.Object) r10, r13)
        L_0x05eb:
            return
        L_0x05ec:
            if (r13 != 0) goto L_0x05f3
            java.lang.Object r1 = r9.mo26165a((java.lang.Object) r10)     // Catch:{ all -> 0x0610 }
            r13 = r1
        L_0x05f3:
            boolean r1 = r9.mo26173a(r13, (com.fyber.inneractive.sdk.protobuf.C5136e1) r0)     // Catch:{ all -> 0x0610 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f13888k
        L_0x05fb:
            int r1 = r8.f13889l
            if (r0 >= r1) goto L_0x060a
            int[] r1 = r8.f13887j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo26253a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fb
        L_0x060a:
            if (r13 == 0) goto L_0x060f
            r9.mo26177b((java.lang.Object) r10, r13)
        L_0x060f:
            return
        L_0x0610:
            r0 = move-exception
            int r1 = r8.f13888k
        L_0x0613:
            int r2 = r8.f13889l
            if (r1 >= r2) goto L_0x0622
            int[] r2 = r8.f13887j
            r2 = r2[r1]
            java.lang.Object r13 = r8.mo26253a((java.lang.Object) r10, (int) r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0613
        L_0x0622:
            if (r13 == 0) goto L_0x0627
            r9.mo26177b((java.lang.Object) r10, r13)
        L_0x0627:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo26255a(com.fyber.inneractive.sdk.protobuf.m1, com.fyber.inneractive.sdk.protobuf.r, java.lang.Object, com.fyber.inneractive.sdk.protobuf.e1, com.fyber.inneractive.sdk.protobuf.q):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26268b(T r13, com.fyber.inneractive.sdk.protobuf.C5242u1 r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f13883f
            r1 = 0
            if (r0 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.protobuf.r<?> r0 = r12.f13893p
            com.fyber.inneractive.sdk.protobuf.u r0 = r0.mo26221a((java.lang.Object) r13)
            com.fyber.inneractive.sdk.protobuf.i1<T, java.lang.Object> r2 = r0.f13935a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x001e
            java.util.Iterator r0 = r0.mo26288f()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0020
        L_0x001e:
            r0 = r1
            r2 = r0
        L_0x0020:
            int[] r3 = r12.f13878a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0025:
            if (r5 >= r3) goto L_0x0622
            int r6 = r12.mo26272g(r5)
            int[] r7 = r12.f13878a
            r7 = r7[r5]
        L_0x002f:
            if (r2 == 0) goto L_0x004d
            com.fyber.inneractive.sdk.protobuf.r<?> r8 = r12.f13893p
            int r8 = r8.mo26220a((java.util.Map.Entry<?, ?>) r2)
            if (r8 > r7) goto L_0x004d
            com.fyber.inneractive.sdk.protobuf.r<?> r8 = r12.f13893p
            r8.mo26226a(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002f
        L_0x004b:
            r2 = r1
            goto L_0x002f
        L_0x004d:
            int r8 = m16333f(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0608;
                case 1: goto L_0x05f1;
                case 2: goto L_0x05da;
                case 3: goto L_0x05c3;
                case 4: goto L_0x05ac;
                case 5: goto L_0x0594;
                case 6: goto L_0x057c;
                case 7: goto L_0x0562;
                case 8: goto L_0x054f;
                case 9: goto L_0x0535;
                case 10: goto L_0x051b;
                case 11: goto L_0x0503;
                case 12: goto L_0x04eb;
                case 13: goto L_0x04d3;
                case 14: goto L_0x04bb;
                case 15: goto L_0x04a5;
                case 16: goto L_0x048f;
                case 17: goto L_0x0475;
                case 18: goto L_0x0462;
                case 19: goto L_0x044f;
                case 20: goto L_0x043c;
                case 21: goto L_0x0429;
                case 22: goto L_0x0416;
                case 23: goto L_0x0403;
                case 24: goto L_0x03f0;
                case 25: goto L_0x03dd;
                case 26: goto L_0x03ca;
                case 27: goto L_0x03b3;
                case 28: goto L_0x03a0;
                case 29: goto L_0x038d;
                case 30: goto L_0x037a;
                case 31: goto L_0x0367;
                case 32: goto L_0x0354;
                case 33: goto L_0x0341;
                case 34: goto L_0x032e;
                case 35: goto L_0x031b;
                case 36: goto L_0x0308;
                case 37: goto L_0x02f5;
                case 38: goto L_0x02e2;
                case 39: goto L_0x02cf;
                case 40: goto L_0x02bc;
                case 41: goto L_0x02a9;
                case 42: goto L_0x0296;
                case 43: goto L_0x0283;
                case 44: goto L_0x0270;
                case 45: goto L_0x025d;
                case 46: goto L_0x024a;
                case 47: goto L_0x0237;
                case 48: goto L_0x0224;
                case 49: goto L_0x020d;
                case 50: goto L_0x0200;
                case 51: goto L_0x01ea;
                case 52: goto L_0x01d4;
                case 53: goto L_0x01bc;
                case 54: goto L_0x01a4;
                case 55: goto L_0x018c;
                case 56: goto L_0x0174;
                case 57: goto L_0x015c;
                case 58: goto L_0x0144;
                case 59: goto L_0x0131;
                case 60: goto L_0x0117;
                case 61: goto L_0x00fd;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00cd;
                case 64: goto L_0x00b5;
                case 65: goto L_0x009d;
                case 66: goto L_0x0087;
                case 67: goto L_0x0071;
                case 68: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x061e
        L_0x0057:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo26270c((int) r5)
            r9 = r14
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C5191m) r9
            r9.mo26162a(r7, r6, r8)
            goto L_0x061e
        L_0x0071:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = m16331e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            r6.mo26160a((int) r7, (long) r8)
            goto L_0x061e
        L_0x0087:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = m16329d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            r8.mo26159a((int) r7, (int) r6)
            goto L_0x061e
        L_0x009d:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = m16331e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f13841a
            r6.mo26129f((int) r7, (long) r8)
            goto L_0x061e
        L_0x00b5:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = m16329d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26131g((int) r7, (int) r6)
            goto L_0x061e
        L_0x00cd:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = m16329d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26133h(r7, r6)
            goto L_0x061e
        L_0x00e5:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = m16329d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26135j(r7, r6)
            goto L_0x061e
        L_0x00fd:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.i r6 = (com.fyber.inneractive.sdk.protobuf.C5151i) r6
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26120b((int) r7, (com.fyber.inneractive.sdk.protobuf.C5151i) r6)
            goto L_0x061e
        L_0x0117:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo26270c((int) r5)
            r9 = r14
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C5191m) r9
            r9.mo26163b(r7, r6, r8)
            goto L_0x061e
        L_0x0131:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            r12.mo26254a((int) r7, (java.lang.Object) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14)
            goto L_0x061e
        L_0x0144:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            boolean r6 = m16326a(r13, (long) r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26123b((int) r7, (boolean) r6)
            goto L_0x061e
        L_0x015c:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = m16329d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26131g((int) r7, (int) r6)
            goto L_0x061e
        L_0x0174:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = m16331e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f13841a
            r6.mo26129f((int) r7, (long) r8)
            goto L_0x061e
        L_0x018c:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = m16329d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26133h(r7, r6)
            goto L_0x061e
        L_0x01a4:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = m16331e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f13841a
            r6.mo26132g((int) r7, (long) r8)
            goto L_0x061e
        L_0x01bc:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = m16331e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f13841a
            r6.mo26132g((int) r7, (long) r8)
            goto L_0x061e
        L_0x01d4:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            float r6 = m16328c(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            r8.mo26158a((int) r7, (float) r6)
            goto L_0x061e
        L_0x01ea:
            boolean r8 = r12.mo26263a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            double r8 = m16327b(r13, (long) r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            r6.mo26157a((int) r7, (double) r8)
            goto L_0x061e
        L_0x0200:
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            r12.mo26256a((com.fyber.inneractive.sdk.protobuf.C5242u1) r14, (int) r7, (java.lang.Object) r6, (int) r5)
            goto L_0x061e
        L_0x020d:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo26270c((int) r5)
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15729a((int) r7, (java.util.List<?>) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14, (com.fyber.inneractive.sdk.protobuf.C5141f1) r8)
            goto L_0x061e
        L_0x0224:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15763l(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0237:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15762k(r7, r6, r14, r9)
            goto L_0x061e
        L_0x024a:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15761j(r7, r6, r14, r9)
            goto L_0x061e
        L_0x025d:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15759i(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0270:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15741c(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0283:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15764m(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0296:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15730a((int) r7, (java.util.List<java.lang.Boolean>) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14, (boolean) r9)
            goto L_0x061e
        L_0x02a9:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15744d(r7, r6, r14, r9)
            goto L_0x061e
        L_0x02bc:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15747e(r7, r6, r14, r9)
            goto L_0x061e
        L_0x02cf:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15753g(r7, r6, r14, r9)
            goto L_0x061e
        L_0x02e2:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15765n(r7, r6, r14, r9)
            goto L_0x061e
        L_0x02f5:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15756h(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0308:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15750f(r7, r6, r14, r9)
            goto L_0x061e
        L_0x031b:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r10 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15738b((int) r7, (java.util.List<java.lang.Double>) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14, (boolean) r9)
            goto L_0x061e
        L_0x032e:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15763l(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0341:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15762k(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0354:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15761j(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0367:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15759i(r7, r6, r14, r4)
            goto L_0x061e
        L_0x037a:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15741c(r7, r6, r14, r4)
            goto L_0x061e
        L_0x038d:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15764m(r7, r6, r14, r4)
            goto L_0x061e
        L_0x03a0:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15728a((int) r7, (java.util.List<com.fyber.inneractive.sdk.protobuf.C5151i>) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14)
            goto L_0x061e
        L_0x03b3:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo26270c((int) r5)
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15737b((int) r7, (java.util.List<?>) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14, (com.fyber.inneractive.sdk.protobuf.C5141f1) r8)
            goto L_0x061e
        L_0x03ca:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15736b((int) r7, (java.util.List<java.lang.String>) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14)
            goto L_0x061e
        L_0x03dd:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15730a((int) r7, (java.util.List<java.lang.Boolean>) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14, (boolean) r4)
            goto L_0x061e
        L_0x03f0:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15744d(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0403:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15747e(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0416:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15753g(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0429:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15765n(r7, r6, r14, r4)
            goto L_0x061e
        L_0x043c:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15756h(r7, r6, r14, r4)
            goto L_0x061e
        L_0x044f:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15750f(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0462:
            int[] r7 = r12.f13878a
            r7 = r7[r5]
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C5150h1.m15738b((int) r7, (java.util.List<java.lang.Double>) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14, (boolean) r4)
            goto L_0x061e
        L_0x0475:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo26270c((int) r5)
            r9 = r14
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C5191m) r9
            r9.mo26162a(r7, r6, r8)
            goto L_0x061e
        L_0x048f:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            r6.mo26160a((int) r7, (long) r8)
            goto L_0x061e
        L_0x04a5:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            r8.mo26159a((int) r7, (int) r6)
            goto L_0x061e
        L_0x04bb:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f13841a
            r6.mo26129f((int) r7, (long) r8)
            goto L_0x061e
        L_0x04d3:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26131g((int) r7, (int) r6)
            goto L_0x061e
        L_0x04eb:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26133h(r7, r6)
            goto L_0x061e
        L_0x0503:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26135j(r7, r6)
            goto L_0x061e
        L_0x051b:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.i r6 = (com.fyber.inneractive.sdk.protobuf.C5151i) r6
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26120b((int) r7, (com.fyber.inneractive.sdk.protobuf.C5151i) r6)
            goto L_0x061e
        L_0x0535:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo26270c((int) r5)
            r9 = r14
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C5191m) r9
            r9.mo26163b(r7, r6, r8)
            goto L_0x061e
        L_0x054f:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16236g(r13, r8)
            r12.mo26254a((int) r7, (java.lang.Object) r6, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14)
            goto L_0x061e
        L_0x0562:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            boolean r6 = r6.mo26236a(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26123b((int) r7, (boolean) r6)
            goto L_0x061e
        L_0x057c:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26131g((int) r7, (int) r6)
            goto L_0x061e
        L_0x0594:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f13841a
            r6.mo26129f((int) r7, (long) r8)
            goto L_0x061e
        L_0x05ac:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16234e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f13841a
            r8.mo26133h(r7, r6)
            goto L_0x061e
        L_0x05c3:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f13841a
            r6.mo26132g((int) r7, (long) r8)
            goto L_0x061e
        L_0x05da:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16235f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f13841a
            r6.mo26132g((int) r7, (long) r8)
            goto L_0x061e
        L_0x05f1:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            float r6 = r6.mo26240d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C5191m) r8
            r8.mo26158a((int) r7, (float) r6)
            goto L_0x061e
        L_0x0608:
            boolean r8 = r12.mo26262a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m16330d((int) r6)
            com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            double r8 = r6.mo26239c(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C5191m) r6
            r6.mo26157a((int) r7, (double) r8)
        L_0x061e:
            int r5 = r5 + 3
            goto L_0x0025
        L_0x0622:
            if (r2 == 0) goto L_0x0638
            com.fyber.inneractive.sdk.protobuf.r<?> r3 = r12.f13893p
            r3.mo26226a(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0636
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0622
        L_0x0636:
            r2 = r1
            goto L_0x0622
        L_0x0638:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r0 = r12.f13892o
            java.lang.Object r13 = r0.mo26174b(r13)
            r0.mo26176b(r13, (com.fyber.inneractive.sdk.protobuf.C5242u1) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo26268b(java.lang.Object, com.fyber.inneractive.sdk.protobuf.u1):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0375 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b6  */
    /* renamed from: a */
    public final int mo26249a(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.fyber.inneractive.sdk.protobuf.C5133e.C5134a r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f13877s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.fyber.inneractive.sdk.protobuf.z$j r12 = (com.fyber.inneractive.sdk.protobuf.C5252z.C5263j) r12
            boolean r13 = r12.mo25843d()
            r14 = 2
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 * r14
        L_0x002c:
            com.fyber.inneractive.sdk.protobuf.z$j r12 = r12.mo25861b(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 1
            switch(r26) {
                case 18: goto L_0x0345;
                case 19: goto L_0x0316;
                case 20: goto L_0x02eb;
                case 21: goto L_0x02eb;
                case 22: goto L_0x02d1;
                case 23: goto L_0x02a8;
                case 24: goto L_0x027f;
                case 25: goto L_0x0245;
                case 26: goto L_0x018e;
                case 27: goto L_0x0174;
                case 28: goto L_0x011a;
                case 29: goto L_0x02d1;
                case 30: goto L_0x00e4;
                case 31: goto L_0x027f;
                case 32: goto L_0x02a8;
                case 33: goto L_0x00b1;
                case 34: goto L_0x007e;
                case 35: goto L_0x0345;
                case 36: goto L_0x0316;
                case 37: goto L_0x02eb;
                case 38: goto L_0x02eb;
                case 39: goto L_0x02d1;
                case 40: goto L_0x02a8;
                case 41: goto L_0x027f;
                case 42: goto L_0x0245;
                case 43: goto L_0x02d1;
                case 44: goto L_0x00e4;
                case 45: goto L_0x027f;
                case 46: goto L_0x02a8;
                case 47: goto L_0x00b1;
                case 48: goto L_0x007e;
                case 49: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0374
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.f1 r1 = r15.mo26270c((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15552a((com.fyber.inneractive.sdk.protobuf.C5141f1) r21, (byte[]) r22, (int) r23, (int) r24, (int) r25, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r26)
            java.lang.Object r8 = r7.f13744c
            r12.add(r8)
        L_0x005c:
            if (r4 >= r5) goto L_0x0374
            int r8 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r9 = r7.f13742a
            if (r2 == r9) goto L_0x0068
            goto L_0x0374
        L_0x0068:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15552a((com.fyber.inneractive.sdk.protobuf.C5141f1) r21, (byte[]) r22, (int) r23, (int) r24, (int) r25, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r26)
            java.lang.Object r8 = r7.f13744c
            r12.add(r8)
            goto L_0x005c
        L_0x007e:
            if (r6 != r14) goto L_0x0086
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15567g(r3, r4, r12, r7)
            goto L_0x0375
        L_0x0086:
            if (r6 != 0) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.h0 r12 = (com.fyber.inneractive.sdk.protobuf.C5149h0) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r3, r4, r7)
            long r8 = r7.f13743b
            long r8 = com.fyber.inneractive.sdk.protobuf.C5172j.m15818a((long) r8)
            r12.mo25968a(r8)
        L_0x0097:
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r6 = r7.f13742a
            if (r2 == r6) goto L_0x00a3
            goto L_0x0375
        L_0x00a3:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r3, r4, r7)
            long r8 = r7.f13743b
            long r8 = com.fyber.inneractive.sdk.protobuf.C5172j.m15818a((long) r8)
            r12.mo25968a(r8)
            goto L_0x0097
        L_0x00b1:
            if (r6 != r14) goto L_0x00b9
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15566f(r3, r4, r12, r7)
            goto L_0x0375
        L_0x00b9:
            if (r6 != 0) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.y r12 = (com.fyber.inneractive.sdk.protobuf.C5250y) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r4 = r7.f13742a
            int r4 = com.fyber.inneractive.sdk.protobuf.C5172j.m15822b(r4)
            r12.mo26305c(r4)
        L_0x00ca:
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r6 = r7.f13742a
            if (r2 == r6) goto L_0x00d6
            goto L_0x0375
        L_0x00d6:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r4 = r7.f13742a
            int r4 = com.fyber.inneractive.sdk.protobuf.C5172j.m15822b(r4)
            r12.mo26305c(r4)
            goto L_0x00ca
        L_0x00e4:
            if (r6 != r14) goto L_0x00eb
            int r2 = com.fyber.inneractive.sdk.protobuf.C5133e.m15568h(r3, r4, r12, r7)
            goto L_0x00fc
        L_0x00eb:
            if (r6 != 0) goto L_0x0374
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.fyber.inneractive.sdk.protobuf.C5133e.m15549a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.fyber.inneractive.sdk.protobuf.C5252z.C5263j<?>) r6, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r7)
        L_0x00fc:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r1 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r1
            com.fyber.inneractive.sdk.protobuf.n1 r3 = r1.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r4 = com.fyber.inneractive.sdk.protobuf.C5196n1.f13847f
            if (r3 != r4) goto L_0x0105
            r3 = 0
        L_0x0105:
            com.fyber.inneractive.sdk.protobuf.z$e r4 = r15.mo26252a((int) r8)
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r5 = r0.f13892o
            r6 = r21
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C5150h1.m15727a((int) r6, (java.util.List<java.lang.Integer>) r12, (com.fyber.inneractive.sdk.protobuf.C5252z.C5257e) r4, r3, r5)
            com.fyber.inneractive.sdk.protobuf.n1 r3 = (com.fyber.inneractive.sdk.protobuf.C5196n1) r3
            if (r3 == 0) goto L_0x0117
            r1.unknownFields = r3
        L_0x0117:
            r1 = r2
            goto L_0x0375
        L_0x011a:
            if (r6 != r14) goto L_0x0374
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r4 = r7.f13742a
            if (r4 < 0) goto L_0x016f
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x016a
            if (r4 != 0) goto L_0x0130
            com.fyber.inneractive.sdk.protobuf.i r4 = com.fyber.inneractive.sdk.protobuf.C5151i.f13766b
            r12.add(r4)
            goto L_0x0138
        L_0x0130:
            com.fyber.inneractive.sdk.protobuf.i r6 = com.fyber.inneractive.sdk.protobuf.C5151i.m15768a((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
        L_0x0137:
            int r1 = r1 + r4
        L_0x0138:
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r6 = r7.f13742a
            if (r2 == r6) goto L_0x0144
            goto L_0x0375
        L_0x0144:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r4 = r7.f13742a
            if (r4 < 0) goto L_0x0165
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0160
            if (r4 != 0) goto L_0x0158
            com.fyber.inneractive.sdk.protobuf.i r4 = com.fyber.inneractive.sdk.protobuf.C5151i.f13766b
            r12.add(r4)
            goto L_0x0138
        L_0x0158:
            com.fyber.inneractive.sdk.protobuf.i r6 = com.fyber.inneractive.sdk.protobuf.C5151i.m15768a((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
            goto L_0x0137
        L_0x0160:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15532i()
            throw r1
        L_0x0165:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15529f()
            throw r1
        L_0x016a:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15532i()
            throw r1
        L_0x016f:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15529f()
            throw r1
        L_0x0174:
            if (r6 != r14) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.f1 r1 = r15.mo26270c((int) r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15551a(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0375
        L_0x018e:
            if (r6 != r14) goto L_0x0374
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01e3
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r4 = r7.f13742a
            if (r4 < 0) goto L_0x01de
            if (r4 != 0) goto L_0x01a9
            r12.add(r6)
            goto L_0x01b4
        L_0x01a9:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.fyber.inneractive.sdk.protobuf.C5252z.f13963a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01b3:
            int r1 = r1 + r4
        L_0x01b4:
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r8 = r7.f13742a
            if (r2 == r8) goto L_0x01c0
            goto L_0x0375
        L_0x01c0:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r4 = r7.f13742a
            if (r4 < 0) goto L_0x01d9
            if (r4 != 0) goto L_0x01ce
            r12.add(r6)
            goto L_0x01b4
        L_0x01ce:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.fyber.inneractive.sdk.protobuf.C5252z.f13963a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01b3
        L_0x01d9:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15529f()
            throw r1
        L_0x01de:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15529f()
            throw r1
        L_0x01e3:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r4 = r7.f13742a
            if (r4 < 0) goto L_0x0240
            if (r4 != 0) goto L_0x01f1
            r12.add(r6)
            goto L_0x0204
        L_0x01f1:
            int r8 = r1 + r4
            boolean r9 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16302b(r3, r1, r8)
            if (r9 == 0) goto L_0x023b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.fyber.inneractive.sdk.protobuf.C5252z.f13963a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x0203:
            r1 = r8
        L_0x0204:
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r8 = r7.f13742a
            if (r2 == r8) goto L_0x0210
            goto L_0x0375
        L_0x0210:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r4, r7)
            int r4 = r7.f13742a
            if (r4 < 0) goto L_0x0236
            if (r4 != 0) goto L_0x021e
            r12.add(r6)
            goto L_0x0204
        L_0x021e:
            int r8 = r1 + r4
            boolean r9 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16302b(r3, r1, r8)
            if (r9 == 0) goto L_0x0231
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.fyber.inneractive.sdk.protobuf.C5252z.f13963a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x0203
        L_0x0231:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15526c()
            throw r1
        L_0x0236:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15529f()
            throw r1
        L_0x023b:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15526c()
            throw r1
        L_0x0240:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15529f()
            throw r1
        L_0x0245:
            if (r6 != r14) goto L_0x024d
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15556a((byte[]) r3, (int) r4, (com.fyber.inneractive.sdk.protobuf.C5252z.C5263j<?>) r12, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r7)
            goto L_0x0375
        L_0x024d:
            if (r6 != 0) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.g r12 = (com.fyber.inneractive.sdk.protobuf.C5142g) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r3, r4, r7)
            long r8 = r7.f13743b
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r6 = 0
            if (r4 == 0) goto L_0x025e
            r4 = r13
            goto L_0x025f
        L_0x025e:
            r4 = r6
        L_0x025f:
            r12.mo25953a(r4)
        L_0x0262:
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r8 = r7.f13742a
            if (r2 == r8) goto L_0x026e
            goto L_0x0375
        L_0x026e:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r3, r4, r7)
            long r8 = r7.f13743b
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x027a
            r4 = r13
            goto L_0x027b
        L_0x027a:
            r4 = r6
        L_0x027b:
            r12.mo25953a(r4)
            goto L_0x0262
        L_0x027f:
            if (r6 != r14) goto L_0x0287
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15561c(r3, r4, r12, r7)
            goto L_0x0375
        L_0x0287:
            if (r6 != r9) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.y r12 = (com.fyber.inneractive.sdk.protobuf.C5250y) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15554a(r17, r18)
            r12.mo26305c(r1)
        L_0x0292:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r6 = r7.f13742a
            if (r2 == r6) goto L_0x02a0
            goto L_0x0375
        L_0x02a0:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15554a(r3, r4)
            r12.mo26305c(r1)
            goto L_0x0292
        L_0x02a8:
            if (r6 != r14) goto L_0x02b0
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15563d(r3, r4, r12, r7)
            goto L_0x0375
        L_0x02b0:
            if (r6 != r13) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.h0 r12 = (com.fyber.inneractive.sdk.protobuf.C5149h0) r12
            long r8 = com.fyber.inneractive.sdk.protobuf.C5133e.m15559b(r17, r18)
            r12.mo25968a(r8)
        L_0x02bb:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r6 = r7.f13742a
            if (r2 == r6) goto L_0x02c9
            goto L_0x0375
        L_0x02c9:
            long r8 = com.fyber.inneractive.sdk.protobuf.C5133e.m15559b(r3, r4)
            r12.mo25968a(r8)
            goto L_0x02bb
        L_0x02d1:
            if (r6 != r14) goto L_0x02d9
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15568h(r3, r4, r12, r7)
            goto L_0x0375
        L_0x02d9:
            if (r6 != 0) goto L_0x0374
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15549a((int) r20, (byte[]) r21, (int) r22, (int) r23, (com.fyber.inneractive.sdk.protobuf.C5252z.C5263j<?>) r24, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r25)
            goto L_0x0375
        L_0x02eb:
            if (r6 != r14) goto L_0x02f3
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15569i(r3, r4, r12, r7)
            goto L_0x0375
        L_0x02f3:
            if (r6 != 0) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.h0 r12 = (com.fyber.inneractive.sdk.protobuf.C5149h0) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r3, r4, r7)
            long r8 = r7.f13743b
            r12.mo25968a(r8)
        L_0x0300:
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r6 = r7.f13742a
            if (r2 == r6) goto L_0x030c
            goto L_0x0375
        L_0x030c:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r3, r4, r7)
            long r8 = r7.f13743b
            r12.mo25968a(r8)
            goto L_0x0300
        L_0x0316:
            if (r6 != r14) goto L_0x031d
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15565e(r3, r4, r12, r7)
            goto L_0x0375
        L_0x031d:
            if (r6 != r9) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.w r12 = (com.fyber.inneractive.sdk.protobuf.C5246w) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15554a(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo26293a(r1)
        L_0x032c:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r6 = r7.f13742a
            if (r2 == r6) goto L_0x0339
            goto L_0x0375
        L_0x0339:
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15554a(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo26293a(r1)
            goto L_0x032c
        L_0x0345:
            if (r6 != r14) goto L_0x034c
            int r1 = com.fyber.inneractive.sdk.protobuf.C5133e.m15558b(r3, r4, r12, r7)
            goto L_0x0375
        L_0x034c:
            if (r6 != r13) goto L_0x0374
            com.fyber.inneractive.sdk.protobuf.n r12 = (com.fyber.inneractive.sdk.protobuf.C5194n) r12
            long r8 = com.fyber.inneractive.sdk.protobuf.C5133e.m15559b(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo26183a(r8)
        L_0x035b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0375
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r3, r1, r7)
            int r6 = r7.f13742a
            if (r2 == r6) goto L_0x0368
            goto L_0x0375
        L_0x0368:
            long r8 = com.fyber.inneractive.sdk.protobuf.C5133e.m15559b(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo26183a(r8)
            goto L_0x035b
        L_0x0374:
            r1 = r4
        L_0x0375:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo26249a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* renamed from: b */
    public final Object mo26264b(int i) {
        return this.f13879b[(i / 3) * 2];
    }

    /* renamed from: b */
    public final void mo26267b(Object obj, int i, C5136e1 e1Var) throws IOException {
        if ((536870912 & i) != 0) {
            e1Var.mo25889b(this.f13891n.mo25966b(obj, m16330d(i)));
        } else {
            e1Var.mo25920q(this.f13891n.mo25966b(obj, m16330d(i)));
        }
    }

    /* renamed from: b */
    public final void mo26269b(T t, T t2, int i) {
        int[] iArr = this.f13878a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long d = m16330d(i2);
        if (mo26263a(t2, i3, i)) {
            Object obj = null;
            if (mo26263a(t, i3, i)) {
                obj = C5212r1.m16236g(t, d);
            }
            Object g = C5212r1.m16236g(t2, d);
            if (obj != null && g != null) {
                C5212r1.m16223a((Object) t, d, C5252z.m16434a(obj, g));
                mo26266b(t, i3, i);
            } else if (g != null) {
                C5212r1.m16223a((Object) t, d, g);
                mo26266b(t, i3, i);
            }
        }
    }

    /* renamed from: b */
    public final void mo26265b(T t, int i) {
        int i2 = this.f13878a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C5212r1.m16221a((Object) t, j, (1 << (i2 >>> 20)) | C5212r1.m16234e(t, j));
        }
    }

    /* renamed from: b */
    public final void mo26266b(T t, int i, int i2) {
        C5212r1.m16221a((Object) t, (long) (this.f13878a[i2 + 2] & 1048575), i);
    }

    /* renamed from: b */
    public static <T> double m16327b(T t, long j) {
        return ((Double) C5212r1.m16236g(t, j)).doubleValue();
    }

    /* renamed from: a */
    public final <K, V> int mo26250a(T t, byte[] bArr, int i, int i2, int i3, long j, C5133e.C5134a aVar) throws IOException {
        Unsafe unsafe = f13877s;
        Object obj = this.f13879b[(i3 / 3) * 2];
        Object object = unsafe.getObject(t, j);
        if (this.f13894q.mo26154d(object)) {
            Object b = this.f13894q.mo26152b(obj);
            this.f13894q.mo26150a(b, object);
            unsafe.putObject(t, j, b);
            object = b;
        }
        this.f13894q.mo26156f(obj);
        this.f13894q.mo26153c(object);
        int d = C5133e.m15562d(bArr, i, aVar);
        int i4 = aVar.f13742a;
        if (i4 < 0 || i4 > i2 - d) {
            throw C5119a0.m15532i();
        }
        throw null;
    }

    /* renamed from: a */
    public final int mo26248a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C5133e.C5134a aVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C5133e.C5134a aVar2 = aVar;
        Unsafe unsafe = f13877s;
        long j3 = (long) (this.f13878a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(C5133e.m15559b(bArr, i))));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(C5133e.m15554a(bArr, i))));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int e = C5133e.m15564e(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(aVar2.f13743b));
                    unsafe.putInt(t2, j3, i11);
                    return e;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int d = C5133e.m15562d(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(aVar2.f13742a));
                    unsafe.putInt(t2, j3, i11);
                    return d;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C5133e.m15559b(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C5133e.m15554a(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int e2 = C5133e.m15564e(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(aVar2.f13743b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return e2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int d2 = C5133e.m15562d(bArr2, i9, aVar2);
                    int i18 = aVar2.f13742a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C5219s1.m16302b(bArr2, d2, d2 + i18)) {
                        unsafe.putObject(t2, j2, new String(bArr2, d2, i18, C5252z.f13963a));
                        d2 += i18;
                    } else {
                        throw C5119a0.m15526c();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return d2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int a = C5133e.m15553a(mo26270c(i13), bArr2, i9, i2, aVar2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, aVar2.f13744c);
                    } else {
                        unsafe.putObject(t2, j2, C5252z.m16434a(object, aVar2.f13744c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return a;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a2 = C5133e.m15555a(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, aVar2.f13744c);
                    unsafe.putInt(t2, j3, i11);
                    return a2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int d3 = C5133e.m15562d(bArr2, i9, aVar2);
                    int i19 = aVar2.f13742a;
                    C5252z.C5257e a3 = mo26252a(i13);
                    if (a3 == null || a3.mo26317a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m16332e((Object) t).mo26195a(i10, (Object) Long.valueOf((long) i19));
                    }
                    return d3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int d4 = C5133e.m15562d(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C5172j.m15822b(aVar2.f13742a)));
                    unsafe.putInt(t2, j3, i11);
                    return d4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int e3 = C5133e.m15564e(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C5172j.m15818a(aVar2.f13743b)));
                    unsafe.putInt(t2, j3, i11);
                    return e3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int a4 = C5133e.m15552a(mo26270c(i13), bArr, i, i2, (i10 & -8) | 4, aVar);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, aVar2.f13744c);
                    } else {
                        unsafe.putObject(t2, j2, C5252z.m16434a(object2, aVar2.f13744c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return a4;
                }
                break;
        }
        return i9;
    }

    /* renamed from: a */
    public final C5252z.C5257e mo26252a(int i) {
        return (C5252z.C5257e) this.f13879b[((i / 3) * 2) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02d6, code lost:
        r5 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d8, code lost:
        r12 = r8;
        r27 = r10;
        r2 = r11;
        r10 = r15;
        r6 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e1, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02e2, code lost:
        r20 = r6;
        r2 = r7;
        r33 = r8;
        r27 = r10;
        r21 = r11;
        r9 = r13;
        r22 = r25;
        r8 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x038f, code lost:
        if (r0 != r15) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03db, code lost:
        if (r0 != r15) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03f1, code lost:
        r8 = r35;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0184, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0253, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d4, code lost:
        r0 = r7 + 8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo26251a(T r31, byte[] r32, int r33, int r34, int r35, com.fyber.inneractive.sdk.protobuf.C5133e.C5134a r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f13877s
            r16 = 0
            r0 = r33
            r2 = r16
            r3 = r2
            r5 = r3
            r1 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            r17 = 0
            if (r0 >= r13) goto L_0x0481
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15550a((int) r0, (byte[]) r12, (int) r3, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r9)
            int r3 = r9.f13742a
            r4 = r3
            r3 = r0
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x0045
            int r2 = r2 / r8
            int r1 = r15.f13880c
            if (r0 < r1) goto L_0x0043
            int r1 = r15.f13881d
            if (r0 > r1) goto L_0x0043
            int r1 = r15.mo26247a((int) r0, (int) r2)
            goto L_0x0049
        L_0x0043:
            r1 = -1
            goto L_0x0049
        L_0x0045:
            int r1 = r15.mo26271e((int) r0)
        L_0x0049:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x005e
            r33 = r0
            r18 = r1
            r2 = r3
            r9 = r4
            r20 = r5
            r22 = r6
            r27 = r10
            r8 = r11
            r21 = r16
            goto L_0x03f5
        L_0x005e:
            int[] r1 = r15.f13878a
            int r20 = r2 + 1
            r1 = r1[r20]
            int r8 = m16333f(r1)
            long r11 = m16330d((int) r1)
            r20 = r4
            r4 = 17
            r21 = r1
            if (r8 > r4) goto L_0x02f2
            int[] r4 = r15.f13878a
            int r22 = r2 + 2
            r4 = r4[r22]
            int r22 = r4 >>> 20
            r1 = 1
            int r22 = r1 << r22
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r13
            r18 = r2
            if (r4 == r6) goto L_0x0095
            if (r6 == r13) goto L_0x008d
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x008d:
            long r1 = (long) r4
            int r5 = r10.getInt(r14, r1)
            r25 = r4
            goto L_0x0097
        L_0x0095:
            r25 = r6
        L_0x0097:
            r6 = r5
            r1 = 5
            switch(r8) {
                case 0: goto L_0x02b1;
                case 1: goto L_0x0292;
                case 2: goto L_0x0270;
                case 3: goto L_0x0270;
                case 4: goto L_0x0256;
                case 5: goto L_0x0232;
                case 6: goto L_0x0217;
                case 7: goto L_0x01ec;
                case 8: goto L_0x01c5;
                case 9: goto L_0x018a;
                case 10: goto L_0x0169;
                case 11: goto L_0x0256;
                case 12: goto L_0x0137;
                case 13: goto L_0x0217;
                case 14: goto L_0x0232;
                case 15: goto L_0x011d;
                case 16: goto L_0x00f2;
                case 17: goto L_0x00aa;
                default: goto L_0x009c;
            }
        L_0x009c:
            r12 = r32
            r8 = r0
            r7 = r3
            r19 = r13
            r11 = r18
            r13 = r20
            r18 = -1
            goto L_0x02e2
        L_0x00aa:
            r2 = 3
            if (r7 != r2) goto L_0x00e6
            int r1 = r0 << 3
            r4 = r1 | 4
            r2 = r18
            com.fyber.inneractive.sdk.protobuf.f1 r1 = r15.mo26270c((int) r2)
            r8 = r0
            r0 = r1
            r18 = -1
            r1 = r32
            r7 = r2
            r2 = r3
            r3 = r34
            r5 = r20
            r13 = r5
            r5 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15552a((com.fyber.inneractive.sdk.protobuf.C5141f1) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00d4
            java.lang.Object r1 = r9.f13744c
            r10.putObject(r14, r11, r1)
            goto L_0x00e1
        L_0x00d4:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f13744c
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5252z.m16434a((java.lang.Object) r1, (java.lang.Object) r2)
            r10.putObject(r14, r11, r1)
        L_0x00e1:
            r12 = r32
            r11 = r7
            goto L_0x017f
        L_0x00e6:
            r8 = r0
            r7 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            r11 = r7
            goto L_0x01c0
        L_0x00f2:
            r8 = r0
            r4 = r18
            r13 = r20
            r18 = -1
            if (r7 != 0) goto L_0x0118
            r1 = r11
            r12 = r32
            int r7 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r12, r3, r9)
            r19 = r1
            long r0 = r9.f13743b
            long r23 = com.fyber.inneractive.sdk.protobuf.C5172j.m15818a((long) r0)
            r0 = r10
            r2 = r19
            r1 = r31
            r11 = r4
            r4 = r23
            r0.putLong(r1, r2, r4)
            r0 = r7
            goto L_0x017f
        L_0x0118:
            r12 = r32
            r11 = r4
            goto L_0x0184
        L_0x011d:
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != 0) goto L_0x0184
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r3, r9)
            int r1 = r9.f13742a
            int r1 = com.fyber.inneractive.sdk.protobuf.C5172j.m15822b(r1)
            r10.putInt(r14, r4, r1)
            goto L_0x017f
        L_0x0137:
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != 0) goto L_0x0184
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r3, r9)
            int r1 = r9.f13742a
            com.fyber.inneractive.sdk.protobuf.z$e r2 = r15.mo26252a((int) r11)
            if (r2 == 0) goto L_0x0165
            boolean r2 = r2.mo26317a(r1)
            if (r2 == 0) goto L_0x0156
            goto L_0x0165
        L_0x0156:
            com.fyber.inneractive.sdk.protobuf.n1 r2 = m16332e((java.lang.Object) r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo26195a((int) r13, (java.lang.Object) r1)
            r5 = r6
            goto L_0x02d8
        L_0x0165:
            r10.putInt(r14, r4, r1)
            goto L_0x017f
        L_0x0169:
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r0 = 2
            r18 = -1
            r12 = r32
            if (r7 != r0) goto L_0x0184
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15555a(r12, r3, r9)
            java.lang.Object r1 = r9.f13744c
            r10.putObject(r14, r4, r1)
        L_0x017f:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02d6
        L_0x0184:
            r7 = r3
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02e2
        L_0x018a:
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r0 = 2
            r18 = -1
            r12 = r32
            if (r7 != r0) goto L_0x01be
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r15.mo26270c((int) r11)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15553a((com.fyber.inneractive.sdk.protobuf.C5141f1) r0, (byte[]) r12, (int) r3, (int) r2, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r9)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x01af
            java.lang.Object r1 = r9.f13744c
            r10.putObject(r14, r4, r1)
            goto L_0x02d6
        L_0x01af:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r9.f13744c
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C5252z.m16434a((java.lang.Object) r1, (java.lang.Object) r3)
            r10.putObject(r14, r4, r1)
            goto L_0x02d6
        L_0x01be:
            r2 = r34
        L_0x01c0:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0253
        L_0x01c5:
            r2 = r34
            r8 = r0
            r4 = r11
            r19 = r13
            r11 = r18
            r13 = r20
            r0 = 2
            r18 = -1
            r12 = r32
            if (r7 != r0) goto L_0x0253
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01e1
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15557b(r12, r3, r9)
            goto L_0x01e5
        L_0x01e1:
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15560c(r12, r3, r9)
        L_0x01e5:
            java.lang.Object r1 = r9.f13744c
            r10.putObject(r14, r4, r1)
            goto L_0x02d6
        L_0x01ec:
            r2 = r34
            r8 = r0
            r4 = r11
            r19 = r13
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != 0) goto L_0x0253
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r12, r3, r9)
            r33 = r0
            long r0 = r9.f13743b
            r20 = 0
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x020c
            r1 = 1
            goto L_0x020e
        L_0x020c:
            r1 = r16
        L_0x020e:
            com.fyber.inneractive.sdk.protobuf.r1$d r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            r0.mo26235a((java.lang.Object) r14, (long) r4, (boolean) r1)
            r0 = r33
            goto L_0x02d6
        L_0x0217:
            r2 = r34
            r8 = r0
            r4 = r11
            r19 = r13
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != r1) goto L_0x0253
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15554a(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
            goto L_0x02d6
        L_0x0232:
            r2 = r34
            r8 = r0
            r4 = r11
            r19 = r13
            r11 = r18
            r13 = r20
            r0 = 1
            r18 = -1
            r12 = r32
            if (r7 != r0) goto L_0x0253
            long r20 = com.fyber.inneractive.sdk.protobuf.C5133e.m15559b(r12, r3)
            r0 = r10
            r1 = r31
            r7 = r3
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            goto L_0x02d4
        L_0x0253:
            r7 = r3
            goto L_0x02e2
        L_0x0256:
            r8 = r0
            r2 = r3
            r4 = r11
            r19 = r13
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != 0) goto L_0x02e1
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r2, r9)
            int r1 = r9.f13742a
            r10.putInt(r14, r4, r1)
            goto L_0x02d6
        L_0x0270:
            r8 = r0
            r2 = r3
            r4 = r11
            r19 = r13
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != 0) goto L_0x02e1
            int r7 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r12, r2, r9)
            long r2 = r9.f13743b
            r0 = r10
            r1 = r31
            r20 = r2
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            r0 = r7
            goto L_0x02d6
        L_0x0292:
            r8 = r0
            r2 = r3
            r4 = r11
            r19 = r13
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != r1) goto L_0x02e1
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15554a(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.fyber.inneractive.sdk.protobuf.r1$d r1 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            r1.mo26234a((java.lang.Object) r14, (long) r4, (float) r0)
            int r0 = r2 + 4
            goto L_0x02d6
        L_0x02b1:
            r8 = r0
            r2 = r3
            r4 = r11
            r19 = r13
            r11 = r18
            r13 = r20
            r0 = 1
            r18 = -1
            r12 = r32
            if (r7 != r0) goto L_0x02e1
            long r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15559b(r12, r2)
            double r20 = java.lang.Double.longBitsToDouble(r0)
            com.fyber.inneractive.sdk.protobuf.r1$d r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            r1 = r31
            r7 = r2
            r2 = r4
            r4 = r20
            r0.mo26233a((java.lang.Object) r1, (long) r2, (double) r4)
        L_0x02d4:
            int r0 = r7 + 8
        L_0x02d6:
            r5 = r6 | r22
        L_0x02d8:
            r12 = r8
            r27 = r10
            r2 = r11
            r10 = r15
            r6 = r25
            goto L_0x0347
        L_0x02e1:
            r7 = r2
        L_0x02e2:
            r20 = r6
            r2 = r7
            r33 = r8
            r27 = r10
            r21 = r11
            r9 = r13
            r22 = r25
            r8 = r35
            goto L_0x03f5
        L_0x02f2:
            r4 = r0
            r1 = r3
            r13 = r20
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r28 = r11
            r12 = r32
            r11 = r2
            r2 = r28
            r0 = 27
            if (r8 != r0) goto L_0x035c
            r0 = 2
            if (r7 != r0) goto L_0x034e
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.fyber.inneractive.sdk.protobuf.z$j r0 = (com.fyber.inneractive.sdk.protobuf.C5252z.C5263j) r0
            boolean r7 = r0.mo25843d()
            if (r7 != 0) goto L_0x0327
            int r7 = r0.size()
            if (r7 != 0) goto L_0x031e
            r7 = 10
            goto L_0x0320
        L_0x031e:
            int r7 = r7 * 2
        L_0x0320:
            com.fyber.inneractive.sdk.protobuf.z$j r0 = r0.mo25861b(r7)
            r10.putObject(r14, r2, r0)
        L_0x0327:
            r7 = r0
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r15.mo26270c((int) r11)
            r3 = r1
            r1 = r13
            r2 = r32
            r8 = r4
            r4 = r34
            r20 = r5
            r5 = r7
            r22 = r6
            r6 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15551a(r0, r1, r2, r3, r4, r5, r6)
            r12 = r8
            r27 = r10
            r2 = r11
            r10 = r15
            r5 = r20
            r6 = r22
        L_0x0347:
            r8 = r35
            r11 = r9
            r9 = r13
            r13 = r14
            goto L_0x0473
        L_0x034e:
            r20 = r5
            r22 = r6
            r15 = r1
            r33 = r4
            r27 = r10
            r21 = r11
            r24 = r13
            goto L_0x03aa
        L_0x035c:
            r20 = r5
            r22 = r6
            r5 = r1
            r6 = r4
            r0 = 49
            if (r8 > r0) goto L_0x0392
            r1 = r21
            long r0 = (long) r1
            r23 = r0
            r0 = r30
            r1 = r31
            r25 = r2
            r2 = r32
            r3 = r5
            r4 = r34
            r15 = r5
            r5 = r13
            r33 = r6
            r19 = r8
            r8 = r11
            r27 = r10
            r9 = r23
            r21 = r11
            r11 = r19
            r24 = r13
            r12 = r25
            r14 = r36
            int r0 = r0.mo26249a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r14)
            if (r0 == r15) goto L_0x03f1
            goto L_0x03dd
        L_0x0392:
            r25 = r2
            r15 = r5
            r33 = r6
            r19 = r8
            r27 = r10
            r24 = r13
            r1 = r21
            r21 = r11
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x03c3
            r0 = 2
            if (r7 == r0) goto L_0x03b0
        L_0x03aa:
            r8 = r35
            r2 = r15
        L_0x03ad:
            r9 = r24
            goto L_0x03f5
        L_0x03b0:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r21
            r6 = r25
            r8 = r36
            r0.mo26250a(r1, r2, r3, r4, r5, r6, r8)
            throw r17
        L_0x03c3:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r24
            r6 = r33
            r10 = r25
            r12 = r21
            r13 = r36
            int r0 = r0.mo26248a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r13)
            if (r0 == r15) goto L_0x03f1
        L_0x03dd:
            r10 = r30
            r13 = r31
            r12 = r33
            r8 = r35
            r11 = r36
            r5 = r20
            r2 = r21
            r6 = r22
            r9 = r24
            goto L_0x0473
        L_0x03f1:
            r8 = r35
            r2 = r0
            goto L_0x03ad
        L_0x03f5:
            if (r9 != r8) goto L_0x0405
            if (r8 == 0) goto L_0x0405
            r10 = r30
            r13 = r31
            r0 = r2
            r3 = r9
            r5 = r20
            r6 = r22
            goto L_0x048a
        L_0x0405:
            r10 = r30
            boolean r0 = r10.f13883f
            if (r0 == 0) goto L_0x0458
            r11 = r36
            com.fyber.inneractive.sdk.protobuf.q r0 = r11.f13745d
            com.fyber.inneractive.sdk.protobuf.q r1 = com.fyber.inneractive.sdk.protobuf.C5205q.m16203a()
            if (r0 == r1) goto L_0x0453
            com.fyber.inneractive.sdk.protobuf.q0 r0 = r10.f13882e
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r6 = r10.f13892o
            com.fyber.inneractive.sdk.protobuf.q r1 = r11.f13745d
            java.util.Map<com.fyber.inneractive.sdk.protobuf.q$a, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d<?, ?>> r1 = r1.f13859a
            com.fyber.inneractive.sdk.protobuf.q$a r3 = new com.fyber.inneractive.sdk.protobuf.q$a
            r12 = r33
            r3.<init>(r0, r12)
            java.lang.Object r0 = r1.get(r3)
            r5 = r0
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r5 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5111d) r5
            if (r5 != 0) goto L_0x043f
            com.fyber.inneractive.sdk.protobuf.n1 r4 = m16332e((java.lang.Object) r31)
            r0 = r9
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15548a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.fyber.inneractive.sdk.protobuf.C5196n1) r4, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r5)
            r13 = r31
            goto L_0x046d
        L_0x043f:
            r13 = r31
            r4 = r13
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage r4 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage) r4
            r4.ensureExtensionsAreMutable()
            r0 = r9
            r1 = r32
            r3 = r34
            r7 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15546a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x046d
        L_0x0453:
            r13 = r31
            r12 = r33
            goto L_0x045e
        L_0x0458:
            r13 = r31
            r12 = r33
            r11 = r36
        L_0x045e:
            com.fyber.inneractive.sdk.protobuf.n1 r4 = m16332e((java.lang.Object) r31)
            r0 = r9
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15548a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.fyber.inneractive.sdk.protobuf.C5196n1) r4, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r5)
        L_0x046d:
            r5 = r20
            r2 = r21
            r6 = r22
        L_0x0473:
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r12
            r14 = r13
            r10 = r27
            r12 = r32
            r13 = r34
            r11 = r8
            goto L_0x001a
        L_0x0481:
            r20 = r5
            r22 = r6
            r27 = r10
            r8 = r11
            r13 = r14
            r10 = r15
        L_0x048a:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x0495
            long r1 = (long) r6
            r4 = r27
            r4.putInt(r13, r1, r5)
        L_0x0495:
            int r1 = r10.f13888k
            r2 = r17
        L_0x0499:
            int r4 = r10.f13889l
            if (r1 >= r4) goto L_0x04ac
            int[] r4 = r10.f13887j
            r4 = r4[r1]
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r5 = r10.f13892o
            java.lang.Object r2 = r10.mo26253a((java.lang.Object) r13, (int) r4, r2, r5)
            com.fyber.inneractive.sdk.protobuf.n1 r2 = (com.fyber.inneractive.sdk.protobuf.C5196n1) r2
            int r1 = r1 + 1
            goto L_0x0499
        L_0x04ac:
            if (r2 == 0) goto L_0x04b3
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r1 = r10.f13892o
            r1.mo26177b((java.lang.Object) r13, r2)
        L_0x04b3:
            if (r8 != 0) goto L_0x04bf
            r1 = r34
            if (r0 != r1) goto L_0x04ba
            goto L_0x04c5
        L_0x04ba:
            com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15530g()
            throw r0
        L_0x04bf:
            r1 = r34
            if (r0 > r1) goto L_0x04c6
            if (r3 != r8) goto L_0x04c6
        L_0x04c5:
            return r0
        L_0x04c6:
            com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15530g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo26251a(java.lang.Object, byte[], int, int, int, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02aa, code lost:
        if (r0 != r15) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0300, code lost:
        if (r0 != r15) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0309, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e6, code lost:
        r17 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0204, code lost:
        r17 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0206, code lost:
        r6 = r6 | r21;
        r28 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020e, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020f, code lost:
        r2 = r8;
        r28 = r10;
        r20 = r13;
        r18 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25947a(T r31, byte[] r32, int r33, int r34, com.fyber.inneractive.sdk.protobuf.C5133e.C5134a r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f13885h
            if (r0 == 0) goto L_0x034c
            sun.misc.Unsafe r9 = f13877s
            r10 = -1
            r16 = 0
            r0 = r33
            r1 = r10
            r2 = r16
            r6 = r2
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            if (r0 >= r13) goto L_0x032f
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15550a((int) r0, (byte[]) r12, (int) r3, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r11)
            int r3 = r11.f13742a
            r4 = r0
            r17 = r3
            goto L_0x0031
        L_0x002e:
            r17 = r0
            r4 = r3
        L_0x0031:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0048
            int r2 = r2 / 3
            int r0 = r15.f13880c
            if (r5 < r0) goto L_0x0046
            int r0 = r15.f13881d
            if (r5 > r0) goto L_0x0046
            int r0 = r15.mo26247a((int) r5, (int) r2)
            goto L_0x004c
        L_0x0046:
            r0 = r10
            goto L_0x004c
        L_0x0048:
            int r0 = r15.mo26271e((int) r5)
        L_0x004c:
            r2 = r0
            if (r2 != r10) goto L_0x005a
            r2 = r4
            r19 = r5
            r28 = r9
            r18 = r10
            r20 = r16
            goto L_0x030b
        L_0x005a:
            int[] r0 = r15.f13878a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m16333f(r1)
            r18 = r9
            long r8 = m16330d((int) r1)
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0218
            int[] r10 = r15.f13878a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            r23 = r1
            r19 = r2
            if (r10 == r7) goto L_0x009d
            if (r7 == r13) goto L_0x008e
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0090
        L_0x008e:
            r7 = r18
        L_0x0090:
            if (r10 == r13) goto L_0x0097
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x0097:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x009f
        L_0x009d:
            r10 = r18
        L_0x009f:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01e9;
                case 1: goto L_0x01d1;
                case 2: goto L_0x01bb;
                case 3: goto L_0x01bb;
                case 4: goto L_0x01a9;
                case 5: goto L_0x0190;
                case 6: goto L_0x017e;
                case 7: goto L_0x015e;
                case 8: goto L_0x013b;
                case 9: goto L_0x0108;
                case 10: goto L_0x00ed;
                case 11: goto L_0x01a9;
                case 12: goto L_0x00dd;
                case 13: goto L_0x017e;
                case 14: goto L_0x0190;
                case 15: goto L_0x00c9;
                case 16: goto L_0x00ac;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r8 = r4
            r18 = r13
            r13 = r19
            r19 = r33
            goto L_0x020f
        L_0x00ac:
            if (r3 != 0) goto L_0x00c4
            int r17 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r12, r4, r11)
            long r0 = r11.f13743b
            long r4 = com.fyber.inneractive.sdk.protobuf.C5172j.m15818a((long) r0)
            r0 = r10
            r1 = r31
            r13 = r19
            r2 = r8
            r19 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x00fd
        L_0x00c4:
            r13 = r19
            r19 = r33
            goto L_0x0102
        L_0x00c9:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0102
            int r17 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r4, r11)
            int r0 = r11.f13742a
            int r0 = com.fyber.inneractive.sdk.protobuf.C5172j.m15822b(r0)
            r10.putInt(r14, r8, r0)
            goto L_0x00fd
        L_0x00dd:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0102
            int r17 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r4, r11)
            int r0 = r11.f13742a
            r10.putInt(r14, r8, r0)
            goto L_0x00fd
        L_0x00ed:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x0102
            int r17 = com.fyber.inneractive.sdk.protobuf.C5133e.m15555a(r12, r4, r11)
            java.lang.Object r0 = r11.f13744c
            r10.putObject(r14, r8, r0)
        L_0x00fd:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0206
        L_0x0102:
            r8 = r4
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x020f
        L_0x0108:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x0134
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r15.mo26270c((int) r13)
            r2 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r17 = com.fyber.inneractive.sdk.protobuf.C5133e.m15553a((com.fyber.inneractive.sdk.protobuf.C5141f1) r0, (byte[]) r12, (int) r4, (int) r2, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r11)
            java.lang.Object r0 = r10.getObject(r14, r8)
            if (r0 != 0) goto L_0x0129
            java.lang.Object r0 = r11.f13744c
            r10.putObject(r14, r8, r0)
            goto L_0x0206
        L_0x0129:
            java.lang.Object r1 = r11.f13744c
            java.lang.Object r0 = com.fyber.inneractive.sdk.protobuf.C5252z.m16434a((java.lang.Object) r0, (java.lang.Object) r1)
            r10.putObject(r14, r8, r0)
            goto L_0x0206
        L_0x0134:
            r2 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x020e
        L_0x013b:
            r2 = r34
            r18 = r13
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x020e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0151
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15557b(r12, r4, r11)
            goto L_0x0155
        L_0x0151:
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15560c(r12, r4, r11)
        L_0x0155:
            r17 = r0
            java.lang.Object r0 = r11.f13744c
            r10.putObject(r14, r8, r0)
            goto L_0x0206
        L_0x015e:
            r2 = r34
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x020e
            int r17 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r12, r4, r11)
            long r0 = r11.f13743b
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0175
            goto L_0x0177
        L_0x0175:
            r5 = r16
        L_0x0177:
            com.fyber.inneractive.sdk.protobuf.r1$d r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            r0.mo26235a((java.lang.Object) r14, (long) r8, (boolean) r5)
            goto L_0x0206
        L_0x017e:
            r2 = r34
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != r1) goto L_0x020e
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15554a(r12, r4)
            r10.putInt(r14, r8, r0)
            goto L_0x01e6
        L_0x0190:
            r2 = r34
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != r5) goto L_0x020e
            long r22 = com.fyber.inneractive.sdk.protobuf.C5133e.m15559b(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            goto L_0x0204
        L_0x01a9:
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x020e
            int r17 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r4, r11)
            int r0 = r11.f13742a
            r10.putInt(r14, r8, r0)
            goto L_0x0206
        L_0x01bb:
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x020e
            int r17 = com.fyber.inneractive.sdk.protobuf.C5133e.m15564e(r12, r4, r11)
            long r4 = r11.f13743b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            goto L_0x0206
        L_0x01d1:
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != r1) goto L_0x020e
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15554a(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.fyber.inneractive.sdk.protobuf.r1$d r1 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            r1.mo26234a((java.lang.Object) r14, (long) r8, (float) r0)
        L_0x01e6:
            int r17 = r4 + 4
            goto L_0x0206
        L_0x01e9:
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != r5) goto L_0x020e
            long r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15559b(r12, r4)
            double r22 = java.lang.Double.longBitsToDouble(r0)
            com.fyber.inneractive.sdk.protobuf.r1$d r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.mo26233a((java.lang.Object) r1, (long) r2, (double) r4)
        L_0x0204:
            int r17 = r8 + 8
        L_0x0206:
            r6 = r6 | r21
            r28 = r10
            r2 = r13
            r0 = r17
            goto L_0x0260
        L_0x020e:
            r8 = r4
        L_0x020f:
            r2 = r8
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x030b
        L_0x0218:
            r19 = r33
            r23 = r1
            r13 = r2
            r5 = r4
            r10 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x0271
            r1 = 2
            if (r3 != r1) goto L_0x0264
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.fyber.inneractive.sdk.protobuf.z$j r0 = (com.fyber.inneractive.sdk.protobuf.C5252z.C5263j) r0
            boolean r1 = r0.mo25843d()
            if (r1 != 0) goto L_0x0248
            int r1 = r0.size()
            if (r1 != 0) goto L_0x023f
            r1 = 10
            goto L_0x0241
        L_0x023f:
            int r1 = r1 * 2
        L_0x0241:
            com.fyber.inneractive.sdk.protobuf.z$j r0 = r0.mo25861b(r1)
            r10.putObject(r14, r8, r0)
        L_0x0248:
            r8 = r0
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r15.mo26270c((int) r13)
            r1 = r17
            r2 = r32
            r3 = r5
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15551a(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
            r28 = r10
            r2 = r13
        L_0x0260:
            r18 = -1
            goto L_0x031d
        L_0x0264:
            r15 = r5
            r24 = r6
            r25 = r7
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x02cc
        L_0x0271:
            r1 = 49
            if (r0 > r1) goto L_0x02ae
            r1 = r23
            long r1 = (long) r1
            r4 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r5
            r23 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r24 = r6
            r6 = r19
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = r18
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r20 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.mo26249a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r14)
            if (r0 == r15) goto L_0x0309
            goto L_0x0302
        L_0x02ae:
            r33 = r3
            r15 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r20 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02e6
            r7 = r33
            r0 = 2
            if (r7 == r0) goto L_0x02d2
        L_0x02cc:
            r2 = r15
        L_0x02cd:
            r6 = r24
            r7 = r25
            goto L_0x030b
        L_0x02d2:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r26
            r8 = r35
            r0.mo26250a(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x02e6:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r19
            r10 = r26
            r12 = r20
            r13 = r35
            int r0 = r0.mo26248a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r13)
            if (r0 == r15) goto L_0x0309
        L_0x0302:
            r2 = r20
            r6 = r24
            r7 = r25
            goto L_0x031d
        L_0x0309:
            r2 = r0
            goto L_0x02cd
        L_0x030b:
            com.fyber.inneractive.sdk.protobuf.n1 r4 = m16332e((java.lang.Object) r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.fyber.inneractive.sdk.protobuf.C5133e.m15548a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.fyber.inneractive.sdk.protobuf.C5196n1) r4, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r5)
            r2 = r20
        L_0x031d:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r10 = r18
            r1 = r19
            r9 = r28
            goto L_0x001c
        L_0x032f:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0342
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0342:
            r4 = r34
            if (r0 != r4) goto L_0x0347
            goto L_0x035e
        L_0x0347:
            com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15530g()
            throw r0
        L_0x034c:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo26251a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r6)
        L_0x035e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5226t0.mo25947a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):void");
    }

    /* renamed from: a */
    public final boolean mo25948a(T t) {
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.f13888k) {
                return !this.f13883f || this.f13893p.mo26221a((Object) t).mo26286e();
            }
            int i4 = this.f13887j[i2];
            int i5 = this.f13878a[i4];
            int g = mo26272g(i4);
            int i6 = this.f13878a[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = f13877s.getInt(t, (long) i7);
                }
                i = i7;
            }
            if ((268435456 & g) != 0) {
                if (!(i == 1048575 ? mo26262a(t, i4) : (i3 & i8) != 0)) {
                    return false;
                }
            }
            int f = m16333f(g);
            if (f == 9 || f == 17) {
                if (i == 1048575) {
                    z = mo26262a(t, i4);
                } else if ((i3 & i8) == 0) {
                    z = false;
                }
                if (z && !mo26270c(i4).mo25948a(C5212r1.m16236g(t, m16330d(g)))) {
                    return false;
                }
            } else {
                if (f != 27) {
                    if (f == 60 || f == 68) {
                        if (mo26263a(t, i5, i4) && !mo26270c(i4).mo25948a(C5212r1.m16236g(t, m16330d(g)))) {
                            return false;
                        }
                    } else if (f != 49) {
                        if (f == 50 && !this.f13894q.mo26151a(C5212r1.m16236g(t, m16330d(g))).isEmpty()) {
                            this.f13894q.mo26156f(this.f13879b[(i4 / 3) * 2]);
                            throw null;
                        }
                    }
                }
                List list = (List) C5212r1.m16236g(t, m16330d(g));
                if (!list.isEmpty()) {
                    C5141f1 c = mo26270c(i4);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= list.size()) {
                            break;
                        } else if (!c.mo25948a(list.get(i9))) {
                            z = false;
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo26254a(int i, Object obj, C5242u1 u1Var) throws IOException {
        if (obj instanceof String) {
            ((C5191m) u1Var).f13841a.mo26122b(i, (String) obj);
            return;
        }
        ((C5191m) u1Var).f13841a.mo26120b(i, (C5151i) obj);
    }

    /* renamed from: a */
    public final void mo26257a(Object obj, int i, C5136e1 e1Var) throws IOException {
        if ((536870912 & i) != 0) {
            C5212r1.m16223a(obj, m16330d(i), (Object) e1Var.mo25917p());
        } else if (this.f13884g) {
            C5212r1.m16223a(obj, m16330d(i), (Object) e1Var.mo25913n());
        } else {
            C5212r1.m16223a(obj, m16330d(i), (Object) e1Var.mo25880a());
        }
    }

    /* renamed from: a */
    public final <E> void mo26258a(Object obj, int i, C5136e1 e1Var, C5141f1<E> f1Var, C5205q qVar) throws IOException {
        e1Var.mo25890b(this.f13891n.mo25966b(obj, m16330d(i)), f1Var, qVar);
    }

    /* renamed from: a */
    public final <E> void mo26260a(Object obj, long j, C5136e1 e1Var, C5141f1<E> f1Var, C5205q qVar) throws IOException {
        e1Var.mo25884a(this.f13891n.mo25966b(obj, j), f1Var, qVar);
    }

    /* renamed from: a */
    public final <UT, UB> UB mo26253a(Object obj, int i, UB ub, C5193m1<UT, UB> m1Var) {
        C5252z.C5257e a;
        int[] iArr = this.f13878a;
        int i2 = iArr[i];
        Object g = C5212r1.m16236g(obj, m16330d(iArr[i + 1]));
        if (g == null || (a = mo26252a(i)) == null) {
            return ub;
        }
        Map<?, ?> c = this.f13894q.mo26153c(g);
        this.f13894q.mo26156f(this.f13879b[(i / 3) * 2]);
        for (Map.Entry next : c.entrySet()) {
            if (!a.mo26317a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    m1Var.mo26164a();
                }
                next.getKey();
                next.getValue();
                throw null;
            }
        }
        return ub;
    }

    /* renamed from: a */
    public final <K, V> void mo26259a(Object obj, int i, Object obj2, C5205q qVar, C5136e1 e1Var) throws IOException {
        long d = m16330d(this.f13878a[i + 1]);
        Object g = C5212r1.m16236g(obj, d);
        if (g == null) {
            g = this.f13894q.mo26152b(obj2);
            C5212r1.m16223a(obj, d, g);
        } else if (this.f13894q.mo26154d(g)) {
            Object b = this.f13894q.mo26152b(obj2);
            this.f13894q.mo26150a(b, g);
            C5212r1.m16223a(obj, d, b);
            g = b;
        }
        Map<?, ?> c = this.f13894q.mo26153c(g);
        this.f13894q.mo26156f(obj2);
        e1Var.mo25885a(c, (C5177j0.C5178a) null, qVar);
    }

    /* renamed from: a */
    public final void mo26261a(T t, T t2, int i) {
        long d = m16330d(this.f13878a[i + 1]);
        if (mo26262a(t2, i)) {
            Object g = C5212r1.m16236g(t, d);
            Object g2 = C5212r1.m16236g(t2, d);
            if (g != null && g2 != null) {
                C5212r1.m16223a((Object) t, d, C5252z.m16434a(g, g2));
                mo26265b(t, i);
            } else if (g2 != null) {
                C5212r1.m16223a((Object) t, d, g2);
                mo26265b(t, i);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo26262a(T t, int i) {
        int[] iArr = this.f13878a;
        int i2 = iArr[i + 2];
        long j = (long) (1048575 & i2);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long d = m16330d(i3);
            switch (m16333f(i3)) {
                case 0:
                    if (C5212r1.f13866e.mo26239c(t, d) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C5212r1.f13866e.mo26240d(t, d) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C5212r1.m16235f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C5212r1.m16235f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C5212r1.m16234e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C5212r1.m16235f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C5212r1.m16234e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C5212r1.f13866e.mo26236a(t, d);
                case 8:
                    Object g = C5212r1.m16236g(t, d);
                    if (g instanceof String) {
                        return !((String) g).isEmpty();
                    }
                    if (g instanceof C5151i) {
                        return !C5151i.f13766b.equals(g);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C5212r1.m16236g(t, d) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C5151i.f13766b.equals(C5212r1.m16236g(t, d));
                case 11:
                    if (C5212r1.m16234e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C5212r1.m16234e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C5212r1.m16234e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C5212r1.m16235f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C5212r1.m16234e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C5212r1.m16235f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C5212r1.m16236g(t, d) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C5212r1.m16234e(t, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo26263a(T t, int i, int i2) {
        return C5212r1.m16234e(t, (long) (this.f13878a[i2 + 2] & 1048575)) == i;
    }

    /* renamed from: a */
    public static <T> boolean m16326a(T t, long j) {
        return ((Boolean) C5212r1.m16236g(t, j)).booleanValue();
    }

    /* renamed from: a */
    public final int mo26247a(int i, int i2) {
        int length = (this.f13878a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f13878a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
