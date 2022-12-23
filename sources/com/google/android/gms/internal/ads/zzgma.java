package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgma {
    static String zza(zzgly zzgly, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzgly, sb, 0);
        return sb.toString();
    }

    static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb, i, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb, i, str, zzb2);
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
                sb.append(zzgng.zza(zzgjg.zzx((String) obj)));
                sb.append(Typography.quote);
            } else if (obj instanceof zzgjg) {
                sb.append(": \"");
                sb.append(zzgng.zza((zzgjg) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof zzgko) {
                sb.append(" {");
                zzd((zzgko) obj, sb, i + 2);
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
                zzb(sb, i4, SDKConstants.PARAM_KEY, entry.getKey());
                zzb(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static final String zzc(String str) {
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

    private static void zzd(zzgly zzgly, StringBuilder sb, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : zzgly.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i, zzc(concat), zzgko.zzaL(method2, zzgly, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(concat2), zzgko.zzaL(method3, zzgly, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(String.valueOf(substring)))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(String.valueOf(substring)));
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object zzaL = zzgko.zzaL(method4, zzgly, new Object[0]);
                    if (method5 == null) {
                        if (zzaL instanceof Boolean) {
                            if (!((Boolean) zzaL).booleanValue()) {
                            }
                        } else if (zzaL instanceof Integer) {
                            if (((Integer) zzaL).intValue() == 0) {
                            }
                        } else if (zzaL instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaL).floatValue()) == 0) {
                            }
                        } else if (!(zzaL instanceof Double)) {
                            if (zzaL instanceof String) {
                                z = zzaL.equals("");
                            } else if (zzaL instanceof zzgjg) {
                                z = zzaL.equals(zzgjg.zzb);
                            } else if (zzaL instanceof zzgly) {
                                if (zzaL == ((zzgly) zzaL).zzbh()) {
                                }
                            } else if ((zzaL instanceof Enum) && ((Enum) zzaL).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzaL).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzgko.zzaL(method5, zzgly, new Object[0])).booleanValue()) {
                    }
                    zzb(sb, i, zzc(concat3), zzaL);
                }
            }
        }
        if (!(zzgly instanceof zzgkl)) {
            zzgnj zzgnj = ((zzgko) zzgly).zzc;
            if (zzgnj != null) {
                zzgnj.zzg(sb, i);
                return;
            }
            return;
        }
        zzgkf zzgkf = ((zzgkl) zzgly).zzb;
        throw null;
    }
}
