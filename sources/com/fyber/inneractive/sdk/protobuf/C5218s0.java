package com.fyber.inneractive.sdk.protobuf;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s0 */
public final class C5218s0 {
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d1, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e2, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f4, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L_0x0228;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m16294a(com.fyber.inneractive.sdk.protobuf.C5207q0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x0247
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00c0
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00c0
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00c0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00c0
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00c0
            java.lang.String r3 = m16293a(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.invokeOrDie(r9, r13, r4)
            m16295a(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00c0:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0123
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0123
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0123
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0123
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0123
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0123
            java.lang.String r4 = m16293a(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.invokeOrDie(r3, r13, r6)
            m16295a(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0123:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "set"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L_0x013e
            goto L_0x004d
        L_0x013e:
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x0167
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            int r4 = r6.length()
            int r4 = r4 + -5
            java.lang.String r4 = r6.substring(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x0167
            goto L_0x004d
        L_0x0167:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.substring(r5, r10)
            java.lang.String r4 = r4.toLowerCase()
            r3.append(r4)
            java.lang.String r4 = r6.substring(r10)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "has"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.invokeOrDie(r4, r13, r8)
            if (r6 != 0) goto L_0x0230
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01c6
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r10
            goto L_0x022b
        L_0x01c6:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01d4
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x022a
            goto L_0x0228
        L_0x01d4:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x01e5
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x022a
            goto L_0x0228
        L_0x01e5:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x01f7
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x022a
            goto L_0x0228
        L_0x01f7:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x0202
            java.lang.String r6 = ""
            boolean r6 = r4.equals(r6)
            goto L_0x022b
        L_0x0202:
            boolean r6 = r4 instanceof com.fyber.inneractive.sdk.protobuf.C5151i
            if (r6 == 0) goto L_0x020d
            com.fyber.inneractive.sdk.protobuf.i r6 = com.fyber.inneractive.sdk.protobuf.C5151i.f13766b
            boolean r6 = r4.equals(r6)
            goto L_0x022b
        L_0x020d:
            boolean r6 = r4 instanceof com.fyber.inneractive.sdk.protobuf.C5207q0
            if (r6 == 0) goto L_0x021b
            r6 = r4
            com.fyber.inneractive.sdk.protobuf.q0 r6 = (com.fyber.inneractive.sdk.protobuf.C5207q0) r6
            com.fyber.inneractive.sdk.protobuf.q0 r6 = r6.getDefaultInstanceForType()
            if (r4 != r6) goto L_0x022a
            goto L_0x0228
        L_0x021b:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x022a
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x022a
        L_0x0228:
            r6 = r10
            goto L_0x022b
        L_0x022a:
            r6 = r5
        L_0x022b:
            if (r6 != 0) goto L_0x022e
            goto L_0x023c
        L_0x022e:
            r10 = r5
            goto L_0x023c
        L_0x0230:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.invokeOrDie(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x023c:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = m16293a(r3)
            m16295a(r14, r15, r3, r4)
            goto L_0x004d
        L_0x0247:
            boolean r0 = r13 instanceof com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage
            if (r0 == 0) goto L_0x0286
            r0 = r13
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage) r0
            com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r0 = r0.extensions
            java.util.Iterator r0 = r0.mo26288f()
        L_0x0254:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0286
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "["
            r2.append(r3)
            java.lang.Object r3 = r1.getKey()
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5110c) r3
            int r3 = r3.f13692b
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r1.getValue()
            m16295a(r14, r15, r2, r1)
            goto L_0x0254
        L_0x0286:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r13 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r13
            com.fyber.inneractive.sdk.protobuf.n1 r13 = r13.unknownFields
            if (r13 == 0) goto L_0x02a5
        L_0x028c:
            int r0 = r13.f13848a
            if (r5 >= r0) goto L_0x02a5
            int[] r0 = r13.f13849b
            r0 = r0[r5]
            int r1 = com.fyber.inneractive.sdk.protobuf.C5227t1.f13895a
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f13850c
            r1 = r1[r5]
            m16295a(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x028c
        L_0x02a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5218s0.m16294a(com.fyber.inneractive.sdk.protobuf.q0, java.lang.StringBuilder, int):void");
    }

    /* renamed from: a */
    public static final void m16295a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m16295a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a2 : ((Map) obj).entrySet()) {
                m16295a(sb, i, str, a2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C5182k1.m16019a(C5151i.m15767a((String) obj)));
                sb.append(Typography.quote);
            } else if (obj instanceof C5151i) {
                sb.append(": \"");
                sb.append(C5182k1.m16019a((C5151i) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof GeneratedMessageLite) {
                sb.append(" {");
                m16294a((GeneratedMessageLite) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m16295a(sb, i4, SDKConstants.PARAM_KEY, entry.getKey());
                m16295a(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: a */
    public static final String m16293a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
