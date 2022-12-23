package com.inmobi.media;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ij */
/* compiled from: JSONConverter */
public class C6262ij<T> {

    /* renamed from: a */
    private static final String f15867a = C6262ij.class.getSimpleName();

    /* renamed from: b */
    private static boolean f15868b;

    /* renamed from: c */
    private Map<C6267io, C6266in> f15869c = new HashMap();

    /* renamed from: a */
    public static void m18716a(boolean z) {
        f15868b = z;
    }

    /* renamed from: a */
    public static void m18715a(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        if (cls.isAssignableFrom(obj2.getClass())) {
            Object cast = cls.cast(obj2);
            for (Field field : cls.getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    field.set(cast, field.get(obj));
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m18720b(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            if (obj.getClass() == Integer.TYPE) {
                return ((Integer) obj).intValue() == ((Integer) obj2).intValue();
            }
            if (obj.getClass() == Long.TYPE) {
                return ((Long) obj).longValue() == ((Long) obj2).longValue();
            }
            if (obj.getClass() == Boolean.TYPE) {
                return ((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue();
            }
            if (obj.getClass() == Double.TYPE) {
                return ((Double) obj).doubleValue() == ((Double) obj2).doubleValue();
            }
            if (obj.getClass() == Byte.TYPE) {
                return ((Byte) obj).byteValue() == ((Byte) obj2).byteValue();
            }
            if (obj.getClass() == Short.TYPE) {
                return ((Short) obj).shortValue() == ((Short) obj2).shortValue();
            }
            return obj.equals(obj2);
        } else if (obj.getClass() == Integer.class && obj2.getClass() == Long.class) {
            return ((Integer) obj).intValue() == ((Long) obj2).intValue();
        } else {
            if (obj.getClass() == Long.class && obj2.getClass() == Integer.class) {
                return ((Long) obj).intValue() == ((Integer) obj2).intValue();
            }
            return obj.equals(obj2);
        }
    }

    /* renamed from: a */
    private static boolean m18718a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                Object obj = jSONArray.get(i);
                Object obj2 = jSONArray2.get(i);
                if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
                    if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                        if (!m18720b(obj, obj2)) {
                            return false;
                        }
                    } else if (!m18718a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else if (!m18719a((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
                i++;
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m18719a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                Object obj2 = jSONObject2.get(next);
                if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
                    if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                        if (!m18720b(obj, obj2)) {
                            return false;
                        }
                    } else if (!m18718a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else if (!m18719a((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
            } catch (JSONException unused) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public C6262ij<T> mo35466a(C6267io ioVar, C6266in inVar) {
        this.f15869c.put(ioVar, inVar);
        return this;
    }

    /* renamed from: a */
    private static boolean m18717a(Class<?> cls) {
        return Integer.TYPE == cls || Integer.class == cls || Boolean.TYPE == cls || Boolean.class == cls || Double.TYPE == cls || Double.class == cls || Float.TYPE == cls || Float.class == cls || Long.TYPE == cls || Long.class == cls || String.class == cls || Byte.TYPE == cls || Byte.class == cls;
    }

    /* renamed from: a */
    private JSONObject m18714a(Object obj, Class<?> cls) {
        JSONObject jSONObject;
        Object obj2;
        try {
            cls.getSimpleName();
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null || Object.class == superclass) {
                jSONObject = null;
            } else {
                Class<? super Object> superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                jSONObject = m18714a(obj, (Class<?>) superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            for (Field field : cls.getDeclaredFields()) {
                boolean z = true;
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(C6261ii.class)) {
                        if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() != type) {
                            z = false;
                        }
                        if (!z) {
                            String name = field.getName();
                            if (Integer.TYPE != type) {
                                if (Integer.class != type) {
                                    if (Boolean.TYPE != type) {
                                        if (Boolean.class != type) {
                                            if (Double.TYPE != type) {
                                                if (Double.class != type) {
                                                    if (Float.TYPE != type) {
                                                        if (Float.class != type) {
                                                            if (Long.TYPE != type) {
                                                                if (Long.class != type) {
                                                                    if (Byte.TYPE != type) {
                                                                        if (Byte.class != type) {
                                                                            if (!(String.class == type || JSONObject.class == type)) {
                                                                                if (JSONArray.class != type) {
                                                                                    if (Map.class.isAssignableFrom(type)) {
                                                                                        if (this.f15869c.get(new C6267io(name, cls)) instanceof C6265im) {
                                                                                            JSONObject jSONObject2 = new JSONObject();
                                                                                            Object obj3 = field.get(obj);
                                                                                            if (obj3 != null) {
                                                                                                Map map = (Map) obj3;
                                                                                                for (Object next : map.keySet()) {
                                                                                                    Object obj4 = map.get(next);
                                                                                                    if (obj4 != null) {
                                                                                                        if (!m18717a(obj4.getClass())) {
                                                                                                            obj4 = m18714a(obj4, obj4.getClass());
                                                                                                        }
                                                                                                        jSONObject2.put(next.toString(), obj4);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            jSONObject.put(name, jSONObject2);
                                                                                        } else {
                                                                                            type.getSimpleName();
                                                                                        }
                                                                                    } else if (!List.class.isAssignableFrom(type)) {
                                                                                        Object obj5 = field.get(obj);
                                                                                        if (obj5 != null) {
                                                                                            jSONObject.put(name, m18714a(obj5, obj5.getClass()));
                                                                                        } else {
                                                                                            type.getSimpleName();
                                                                                        }
                                                                                    } else if (this.f15869c.get(new C6267io(name, cls)) instanceof C6264il) {
                                                                                        JSONArray jSONArray = new JSONArray();
                                                                                        Object obj6 = field.get(obj);
                                                                                        if (obj6 != null) {
                                                                                            for (Object next2 : (List) obj6) {
                                                                                                if (next2 != null) {
                                                                                                    if (m18717a(next2.getClass())) {
                                                                                                        obj2 = next2;
                                                                                                    } else {
                                                                                                        obj2 = m18714a(next2, next2.getClass());
                                                                                                    }
                                                                                                    if (obj2 == null) {
                                                                                                        next2.getClass();
                                                                                                    } else {
                                                                                                        jSONArray.put(obj2);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        jSONObject.put(name, jSONArray);
                                                                                    } else {
                                                                                        type.getSimpleName();
                                                                                    }
                                                                                }
                                                                            }
                                                                            jSONObject.put(name, field.get(obj));
                                                                        }
                                                                    }
                                                                    jSONObject.put(name, ((Byte) field.get(obj)).byteValue());
                                                                }
                                                            }
                                                            jSONObject.put(name, ((Long) field.get(obj)).longValue());
                                                        }
                                                    }
                                                    jSONObject.put(name, (double) ((Float) field.get(obj)).floatValue());
                                                }
                                            }
                                            jSONObject.put(name, ((Double) field.get(obj)).doubleValue());
                                        }
                                    }
                                    jSONObject.put(name, ((Boolean) field.get(obj)).booleanValue());
                                }
                            }
                            jSONObject.put(name, ((Integer) field.get(obj)).intValue());
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public JSONObject mo35468a(T t) {
        return m18714a((Object) t, t.getClass());
    }

    /* renamed from: a */
    public T mo35467a(JSONObject jSONObject, Class<T> cls) {
        return cls.cast(m18713a(jSONObject, cls, (Object) null, (Object) null));
    }

    /* JADX WARNING: type inference failed for: r22v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m18713a(org.json.JSONObject r19, java.lang.Class<?> r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r20.getSimpleName()     // Catch:{ Exception -> 0x0328 }
            r4 = 1
            r5 = 0
            if (r22 != 0) goto L_0x006e
            java.lang.reflect.Constructor[] r6 = r20.getDeclaredConstructors()     // Catch:{ Exception -> 0x006d }
            int r7 = r6.length     // Catch:{ Exception -> 0x006d }
            if (r7 != 0) goto L_0x001a
            java.lang.Object r6 = r20.newInstance()     // Catch:{ Exception -> 0x006d }
            goto L_0x0070
        L_0x001a:
            r6 = r6[r5]     // Catch:{ Exception -> 0x006d }
            r6.setAccessible(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch:{ Exception -> 0x006d }
            int r7 = r7.length     // Catch:{ Exception -> 0x006d }
            if (r7 != 0) goto L_0x002d
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x006d }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ Exception -> 0x006d }
            goto L_0x0070
        L_0x002d:
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x006d }
            java.lang.Class[] r8 = r6.getParameterTypes()     // Catch:{ Exception -> 0x006d }
            int r9 = r8.length     // Catch:{ Exception -> 0x006d }
            r10 = r5
            r11 = r10
        L_0x0036:
            if (r10 >= r9) goto L_0x0068
            r12 = r8[r10]     // Catch:{ Exception -> 0x006d }
            int r13 = r11 + 1
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 == r12) goto L_0x005e
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 != r12) goto L_0x0045
            goto L_0x005e
        L_0x0045:
            java.lang.Class r14 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 != r12) goto L_0x004c
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x006d }
            goto L_0x0062
        L_0x004c:
            java.lang.Class r14 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 == r12) goto L_0x0057
            java.lang.Class r14 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 != r12) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r12 = r3
            goto L_0x0062
        L_0x0057:
            r14 = 0
            java.lang.Double r12 = java.lang.Double.valueOf(r14)     // Catch:{ Exception -> 0x006d }
            goto L_0x0062
        L_0x005e:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x006d }
        L_0x0062:
            r7[r11] = r12     // Catch:{ Exception -> 0x006d }
            int r10 = r10 + 1
            r11 = r13
            goto L_0x0036
        L_0x0068:
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ Exception -> 0x006d }
            goto L_0x0070
        L_0x006d:
            return r3
        L_0x006e:
            r6 = r22
        L_0x0070:
            java.lang.Class r7 = r20.getSuperclass()     // Catch:{ Exception -> 0x0328 }
            if (r7 == 0) goto L_0x0083
            java.lang.Class r7 = r20.getSuperclass()     // Catch:{ Exception -> 0x0328 }
            r7.getSimpleName()     // Catch:{ Exception -> 0x0328 }
            r8 = r21
            java.lang.Object r6 = r0.m18713a(r1, r7, r8, r6)     // Catch:{ Exception -> 0x0328 }
        L_0x0083:
            java.lang.reflect.Field[] r7 = r20.getDeclaredFields()     // Catch:{ Exception -> 0x0328 }
            int r8 = r7.length     // Catch:{ Exception -> 0x0328 }
            r9 = r5
        L_0x0089:
            if (r9 >= r8) goto L_0x0327
            r10 = r7[r9]     // Catch:{ Exception -> 0x0328 }
            r10.setAccessible(r4)     // Catch:{ Exception -> 0x0328 }
            java.lang.String r11 = r10.getName()     // Catch:{ Exception -> 0x0328 }
            boolean r12 = r1.has(r11)     // Catch:{ Exception -> 0x0328 }
            if (r12 == 0) goto L_0x031a
            java.lang.Object r12 = r1.opt(r11)     // Catch:{ Exception -> 0x0328 }
            boolean r12 = r12.equals(r3)     // Catch:{ Exception -> 0x0328 }
            if (r12 == 0) goto L_0x00a6
            goto L_0x031a
        L_0x00a6:
            java.lang.Class<com.inmobi.media.ii> r12 = com.inmobi.media.C6261ii.class
            boolean r12 = r10.isAnnotationPresent(r12)     // Catch:{ Exception -> 0x0328 }
            if (r12 != 0) goto L_0x031a
            java.lang.Class r12 = r10.getType()     // Catch:{ Exception -> 0x0328 }
            int r13 = r10.getModifiers()     // Catch:{ Exception -> 0x0328 }
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)     // Catch:{ Exception -> 0x0328 }
            if (r13 != 0) goto L_0x031a
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0328 }
            if (r13 != r12) goto L_0x00c9
            int r11 = r1.getInt(r11)     // Catch:{ Exception -> 0x0328 }
            r10.setInt(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x00c9:
            java.lang.Class<java.lang.Integer> r13 = java.lang.Integer.class
            if (r13 != r12) goto L_0x00d6
            java.lang.Object r11 = r1.get(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x00d6:
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0328 }
            if (r13 != r12) goto L_0x00e3
            boolean r11 = r1.getBoolean(r11)     // Catch:{ Exception -> 0x0328 }
            r10.setBoolean(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x00e3:
            java.lang.Class<java.lang.Boolean> r13 = java.lang.Boolean.class
            if (r13 != r12) goto L_0x00f4
            boolean r11 = r1.getBoolean(r11)     // Catch:{ Exception -> 0x0328 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x00f4:
            java.lang.Class r13 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0328 }
            if (r13 != r12) goto L_0x0101
            double r11 = r1.getDouble(r11)     // Catch:{ Exception -> 0x0328 }
            r10.setDouble(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x0101:
            java.lang.Class<java.lang.Double> r13 = java.lang.Double.class
            if (r13 != r12) goto L_0x0112
            double r11 = r1.getDouble(r11)     // Catch:{ Exception -> 0x0328 }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x0112:
            java.lang.Class r13 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0328 }
            if (r13 != r12) goto L_0x0120
            double r11 = r1.getDouble(r11)     // Catch:{ Exception -> 0x0328 }
            float r11 = (float) r11     // Catch:{ Exception -> 0x0328 }
            r10.setFloat(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x0120:
            java.lang.Class<java.lang.Float> r13 = java.lang.Float.class
            if (r13 != r12) goto L_0x0132
            double r11 = r1.getDouble(r11)     // Catch:{ Exception -> 0x0328 }
            float r11 = (float) r11     // Catch:{ Exception -> 0x0328 }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x0132:
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0328 }
            if (r13 != r12) goto L_0x013f
            long r11 = r1.getLong(r11)     // Catch:{ Exception -> 0x0328 }
            r10.setLong(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x013f:
            java.lang.Class<java.lang.Long> r13 = java.lang.Long.class
            if (r13 != r12) goto L_0x0150
            long r11 = r1.getLong(r11)     // Catch:{ Exception -> 0x0328 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x0150:
            java.lang.Class r13 = java.lang.Byte.TYPE     // Catch:{ Exception -> 0x0328 }
            if (r13 != r12) goto L_0x015e
            int r11 = r1.getInt(r11)     // Catch:{ Exception -> 0x0328 }
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x0328 }
            r10.setByte(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x015e:
            java.lang.Class<java.lang.Byte> r13 = java.lang.Byte.class
            if (r13 != r12) goto L_0x0170
            int r11 = r1.getInt(r11)     // Catch:{ Exception -> 0x0328 }
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x0328 }
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x0170:
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r13 != r12) goto L_0x017d
            java.lang.String r11 = r1.optString(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x017d:
            java.lang.Class<org.json.JSONObject> r13 = org.json.JSONObject.class
            if (r13 != r12) goto L_0x018a
            org.json.JSONObject r11 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x018a:
            java.lang.Class<org.json.JSONArray> r13 = org.json.JSONArray.class
            if (r13 != r12) goto L_0x0197
            org.json.JSONArray r11 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x0328 }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x0328 }
            goto L_0x031a
        L_0x0197:
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            boolean r13 = r13.isAssignableFrom(r12)     // Catch:{ Exception -> 0x0328 }
            if (r13 == 0) goto L_0x025a
            java.util.Map<com.inmobi.media.io, com.inmobi.media.in> r13 = r0.f15869c     // Catch:{ Exception -> 0x0328 }
            com.inmobi.media.io r14 = new com.inmobi.media.io     // Catch:{ Exception -> 0x0328 }
            r14.<init>(r11, r2)     // Catch:{ Exception -> 0x0328 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ Exception -> 0x0328 }
            com.inmobi.media.in r13 = (com.inmobi.media.C6266in) r13     // Catch:{ Exception -> 0x0328 }
            boolean r14 = r13 instanceof com.inmobi.media.C6265im     // Catch:{ Exception -> 0x0328 }
            if (r14 == 0) goto L_0x0252
            org.json.JSONObject r11 = r1.optJSONObject(r11)     // Catch:{ Exception -> 0x0328 }
            if (r11 == 0) goto L_0x031a
            com.inmobi.media.im r13 = (com.inmobi.media.C6265im) r13     // Catch:{ Exception -> 0x0328 }
            com.inmobi.commons.utils.json.Constructor r12 = r13.f15872b     // Catch:{ Exception -> 0x0328 }
            java.lang.Object r12 = r12.construct()     // Catch:{ Exception -> 0x0328 }
            java.util.Map r12 = (java.util.Map) r12     // Catch:{ Exception -> 0x0328 }
            java.util.Iterator r14 = r11.keys()     // Catch:{ Exception -> 0x0328 }
        L_0x01c4:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x0328 }
            if (r15 == 0) goto L_0x024a
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x0328 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0328 }
            java.lang.Class<V> r4 = r13.f15871a     // Catch:{ Exception -> 0x0328 }
            boolean r4 = m18717a((java.lang.Class<?>) r4)     // Catch:{ Exception -> 0x0328 }
            if (r4 == 0) goto L_0x0232
            java.lang.Class<V> r4 = r13.f15871a     // Catch:{ Exception -> 0x0328 }
            java.lang.Class<V> r5 = r13.f15871a     // Catch:{ Exception -> 0x0328 }
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r3 != r5) goto L_0x01ed
            int r3 = r11.getInt(r15)     // Catch:{ Exception -> 0x0318 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0318 }
        L_0x01e8:
            r5 = r3
            r21 = r7
            r3 = r8
            goto L_0x022d
        L_0x01ed:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r3 != r5) goto L_0x01fa
            double r16 = r11.getDouble(r15)     // Catch:{ Exception -> 0x0318 }
            java.lang.Double r3 = java.lang.Double.valueOf(r16)     // Catch:{ Exception -> 0x0318 }
            goto L_0x01e8
        L_0x01fa:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r3 != r5) goto L_0x020b
            r21 = r7
            r3 = r8
            double r7 = r11.getDouble(r15)     // Catch:{ Exception -> 0x0318 }
            float r5 = (float) r7     // Catch:{ Exception -> 0x0318 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0318 }
            goto L_0x022d
        L_0x020b:
            r21 = r7
            r3 = r8
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            if (r7 != r5) goto L_0x021b
            long r7 = r11.getLong(r15)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0318 }
            goto L_0x022d
        L_0x021b:
            java.lang.Class<java.lang.Byte> r7 = java.lang.Byte.class
            if (r7 != r5) goto L_0x0229
            int r5 = r11.getInt(r15)     // Catch:{ Exception -> 0x0318 }
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x0318 }
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ Exception -> 0x0318 }
            goto L_0x022d
        L_0x0229:
            java.lang.Object r5 = r11.get(r15)     // Catch:{ Exception -> 0x0318 }
        L_0x022d:
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ Exception -> 0x0318 }
            goto L_0x023f
        L_0x0232:
            r21 = r7
            r3 = r8
            org.json.JSONObject r4 = r11.getJSONObject(r15)     // Catch:{ Exception -> 0x0318 }
            java.lang.Class<V> r5 = r13.f15871a     // Catch:{ Exception -> 0x0318 }
            java.lang.Object r4 = r0.mo35467a((org.json.JSONObject) r4, r5)     // Catch:{ Exception -> 0x0318 }
        L_0x023f:
            r12.put(r15, r4)     // Catch:{ Exception -> 0x0318 }
            r7 = r21
            r8 = r3
            r3 = 0
            r4 = 1
            r5 = 0
            goto L_0x01c4
        L_0x024a:
            r21 = r7
            r3 = r8
            r10.set(r6, r12)     // Catch:{ Exception -> 0x0318 }
            goto L_0x031d
        L_0x0252:
            r21 = r7
            r3 = r8
            r12.getSimpleName()     // Catch:{ Exception -> 0x0318 }
            goto L_0x031d
        L_0x025a:
            r21 = r7
            r3 = r8
            java.lang.Class<java.util.List> r4 = java.util.List.class
            boolean r4 = r4.isAssignableFrom(r12)     // Catch:{ Exception -> 0x0318 }
            if (r4 == 0) goto L_0x0303
            java.util.Map<com.inmobi.media.io, com.inmobi.media.in> r4 = r0.f15869c     // Catch:{ Exception -> 0x0318 }
            com.inmobi.media.io r5 = new com.inmobi.media.io     // Catch:{ Exception -> 0x0318 }
            r5.<init>(r11, r2)     // Catch:{ Exception -> 0x0318 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0318 }
            com.inmobi.media.in r4 = (com.inmobi.media.C6266in) r4     // Catch:{ Exception -> 0x0318 }
            boolean r5 = r4 instanceof com.inmobi.media.C6264il     // Catch:{ Exception -> 0x0318 }
            if (r5 == 0) goto L_0x02ff
            org.json.JSONArray r5 = r1.optJSONArray(r11)     // Catch:{ Exception -> 0x0318 }
            if (r5 == 0) goto L_0x031d
            com.inmobi.media.il r4 = (com.inmobi.media.C6264il) r4     // Catch:{ Exception -> 0x0318 }
            java.util.List r7 = r4.mo35469a()     // Catch:{ Exception -> 0x0318 }
            r8 = 0
        L_0x0283:
            int r11 = r5.length()     // Catch:{ Exception -> 0x0318 }
            if (r8 >= r11) goto L_0x02fb
            java.lang.Class r11 = r4.mo35470b()     // Catch:{ Exception -> 0x0318 }
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            if (r12 != r11) goto L_0x029a
            int r11 = r5.getInt(r8)     // Catch:{ Exception -> 0x0318 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0318 }
            goto L_0x02d4
        L_0x029a:
            java.lang.Class<java.lang.Double> r12 = java.lang.Double.class
            if (r12 != r11) goto L_0x02a7
            double r11 = r5.getDouble(r8)     // Catch:{ Exception -> 0x0318 }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ Exception -> 0x0318 }
            goto L_0x02d4
        L_0x02a7:
            java.lang.Class<java.lang.Float> r12 = java.lang.Float.class
            if (r12 != r11) goto L_0x02b5
            double r11 = r5.getDouble(r8)     // Catch:{ Exception -> 0x0318 }
            float r11 = (float) r11     // Catch:{ Exception -> 0x0318 }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x0318 }
            goto L_0x02d4
        L_0x02b5:
            java.lang.Class<java.lang.Long> r12 = java.lang.Long.class
            if (r12 != r11) goto L_0x02c2
            long r11 = r5.getLong(r8)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0318 }
            goto L_0x02d4
        L_0x02c2:
            java.lang.Class<java.lang.Byte> r12 = java.lang.Byte.class
            if (r12 != r11) goto L_0x02d0
            int r11 = r5.getInt(r8)     // Catch:{ Exception -> 0x0318 }
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x0318 }
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)     // Catch:{ Exception -> 0x0318 }
            goto L_0x02d4
        L_0x02d0:
            java.lang.Object r11 = r5.get(r8)     // Catch:{ Exception -> 0x0318 }
        L_0x02d4:
            java.lang.Class r12 = r11.getClass()     // Catch:{ Exception -> 0x0318 }
            boolean r12 = m18717a((java.lang.Class<?>) r12)     // Catch:{ Exception -> 0x0318 }
            if (r12 == 0) goto L_0x02e7
            java.lang.Class r12 = r4.mo35470b()     // Catch:{ Exception -> 0x0318 }
            java.lang.Object r11 = r12.cast(r11)     // Catch:{ Exception -> 0x0318 }
            goto L_0x02f3
        L_0x02e7:
            org.json.JSONObject r11 = r5.getJSONObject(r8)     // Catch:{ Exception -> 0x0318 }
            java.lang.Class r12 = r4.mo35470b()     // Catch:{ Exception -> 0x0318 }
            java.lang.Object r11 = r0.mo35467a((org.json.JSONObject) r11, r12)     // Catch:{ Exception -> 0x0318 }
        L_0x02f3:
            if (r11 == 0) goto L_0x02f8
            r7.add(r11)     // Catch:{ Exception -> 0x0318 }
        L_0x02f8:
            int r8 = r8 + 1
            goto L_0x0283
        L_0x02fb:
            r10.set(r6, r7)     // Catch:{ Exception -> 0x0318 }
            goto L_0x031d
        L_0x02ff:
            r20.getSimpleName()     // Catch:{ Exception -> 0x0318 }
            goto L_0x031d
        L_0x0303:
            org.json.JSONObject r4 = r1.optJSONObject(r11)     // Catch:{ Exception -> 0x0318 }
            if (r4 == 0) goto L_0x0314
            r5 = 0
            java.lang.Object r4 = r0.m18713a(r4, r12, r6, r5)     // Catch:{ Exception -> 0x0312 }
            r10.set(r6, r4)     // Catch:{ Exception -> 0x0318 }
            goto L_0x031d
        L_0x0312:
            r1 = r5
            goto L_0x0329
        L_0x0314:
            r20.getSimpleName()     // Catch:{ Exception -> 0x0318 }
            goto L_0x031d
        L_0x0318:
            r1 = 0
            goto L_0x0329
        L_0x031a:
            r21 = r7
            r3 = r8
        L_0x031d:
            int r9 = r9 + 1
            r7 = r21
            r8 = r3
            r3 = 0
            r4 = 1
            r5 = 0
            goto L_0x0089
        L_0x0327:
            return r6
        L_0x0328:
            r1 = r3
        L_0x0329:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6262ij.m18713a(org.json.JSONObject, java.lang.Class, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
