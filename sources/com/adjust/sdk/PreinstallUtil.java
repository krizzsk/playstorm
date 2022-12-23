package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class PreinstallUtil {
    private static final long ALL_LOCATION_BITMASK = 255;
    private static final long CONTENT_PROVIDER_BITMASK = 16;
    private static final long CONTENT_PROVIDER_INTENT_ACTION_BITMASK = 32;
    private static final long CONTENT_PROVIDER_NO_PERMISSION_BITMASK = 128;
    private static final long FILE_SYSTEM_BITMASK = 64;
    private static final long SYSTEM_PROPERTY_BITMASK = 1;
    private static final long SYSTEM_PROPERTY_PATH_BITMASK = 4;
    private static final long SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK = 8;
    private static final long SYSTEM_PROPERTY_REFLECTION_BITMASK = 2;

    public static boolean hasAllLocationsBeenRead(long j) {
        return (j & ALL_LOCATION_BITMASK) == ALL_LOCATION_BITMASK;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean hasNotBeenRead(java.lang.String r5, long r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1771852303: goto L_0x0050;
                case -1590804087: goto L_0x0046;
                case -782042377: goto L_0x003c;
                case -480091743: goto L_0x0032;
                case -468656985: goto L_0x0028;
                case -95318717: goto L_0x001e;
                case 2055247442: goto L_0x0014;
                case 2080271301: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x005a
        L_0x000a:
            java.lang.String r0 = "content_provider_no_permission"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005a
            r5 = 7
            goto L_0x005b
        L_0x0014:
            java.lang.String r0 = "file_system"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005a
            r5 = 6
            goto L_0x005b
        L_0x001e:
            java.lang.String r0 = "system_properties"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005a
            r5 = r2
            goto L_0x005b
        L_0x0028:
            java.lang.String r0 = "system_properties_reflection"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005a
            r5 = r1
            goto L_0x005b
        L_0x0032:
            java.lang.String r0 = "system_properties_path"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005a
            r5 = 2
            goto L_0x005b
        L_0x003c:
            java.lang.String r0 = "content_provider"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005a
            r5 = 4
            goto L_0x005b
        L_0x0046:
            java.lang.String r0 = "system_properties_path_reflection"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005a
            r5 = 3
            goto L_0x005b
        L_0x0050:
            java.lang.String r0 = "content_provider_intent_action"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005a
            r5 = 5
            goto L_0x005b
        L_0x005a:
            r5 = -1
        L_0x005b:
            switch(r5) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0096;
                case 3: goto L_0x008b;
                case 4: goto L_0x0080;
                case 5: goto L_0x0075;
                case 6: goto L_0x006a;
                case 7: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            return r2
        L_0x005f:
            r3 = 128(0x80, double:6.32E-322)
            long r5 = r6 & r3
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r2
        L_0x0069:
            return r1
        L_0x006a:
            r3 = 64
            long r5 = r6 & r3
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = r2
        L_0x0074:
            return r1
        L_0x0075:
            r3 = 32
            long r5 = r6 & r3
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r1 = r2
        L_0x007f:
            return r1
        L_0x0080:
            r3 = 16
            long r5 = r6 & r3
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r1 = r2
        L_0x008a:
            return r1
        L_0x008b:
            r3 = 8
            long r5 = r6 & r3
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r1 = r2
        L_0x0095:
            return r1
        L_0x0096:
            r3 = 4
            long r5 = r6 & r3
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r1 = r2
        L_0x00a0:
            return r1
        L_0x00a1:
            r3 = 2
            long r5 = r6 & r3
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r1 = r2
        L_0x00ab:
            return r1
        L_0x00ac:
            r3 = 1
            long r5 = r6 & r3
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r1 = r2
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.PreinstallUtil.hasNotBeenRead(java.lang.String, long):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long markAsRead(java.lang.String r2, long r3) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -1771852303: goto L_0x004e;
                case -1590804087: goto L_0x0044;
                case -782042377: goto L_0x003a;
                case -480091743: goto L_0x0030;
                case -468656985: goto L_0x0026;
                case -95318717: goto L_0x001c;
                case 2055247442: goto L_0x0012;
                case 2080271301: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0058
        L_0x0008:
            java.lang.String r0 = "content_provider_no_permission"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0058
            r2 = 7
            goto L_0x0059
        L_0x0012:
            java.lang.String r0 = "file_system"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0058
            r2 = 6
            goto L_0x0059
        L_0x001c:
            java.lang.String r0 = "system_properties"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0058
            r2 = 0
            goto L_0x0059
        L_0x0026:
            java.lang.String r0 = "system_properties_reflection"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0058
            r2 = 1
            goto L_0x0059
        L_0x0030:
            java.lang.String r0 = "system_properties_path"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0058
            r2 = 2
            goto L_0x0059
        L_0x003a:
            java.lang.String r0 = "content_provider"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0058
            r2 = 4
            goto L_0x0059
        L_0x0044:
            java.lang.String r0 = "system_properties_path_reflection"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0058
            r2 = 3
            goto L_0x0059
        L_0x004e:
            java.lang.String r0 = "content_provider_intent_action"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0058
            r2 = 5
            goto L_0x0059
        L_0x0058:
            r2 = -1
        L_0x0059:
            switch(r2) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0071;
                case 2: goto L_0x006e;
                case 3: goto L_0x006b;
                case 4: goto L_0x0068;
                case 5: goto L_0x0065;
                case 6: goto L_0x0062;
                case 7: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            return r3
        L_0x005d:
            r0 = 128(0x80, double:6.32E-322)
        L_0x005f:
            long r2 = r3 | r0
            return r2
        L_0x0062:
            r0 = 64
            goto L_0x005f
        L_0x0065:
            r0 = 32
            goto L_0x005f
        L_0x0068:
            r0 = 16
            goto L_0x005f
        L_0x006b:
            r0 = 8
            goto L_0x005f
        L_0x006e:
            r0 = 4
            goto L_0x005f
        L_0x0071:
            r0 = 2
            goto L_0x005f
        L_0x0074:
            r0 = 1
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.PreinstallUtil.markAsRead(java.lang.String, long):long");
    }

    public static String getPayloadFromSystemProperty(String str, ILogger iLogger) {
        return readSystemProperty(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX + str, iLogger);
    }

    public static String getPayloadFromSystemPropertyReflection(String str, ILogger iLogger) {
        return readSystemPropertyReflection(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX + str, iLogger);
    }

    public static String getPayloadFromSystemPropertyFilePath(String str, ILogger iLogger) {
        String readFileContent;
        String readSystemProperty = readSystemProperty(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (readSystemProperty == null || readSystemProperty.isEmpty() || (readFileContent = readFileContent(readSystemProperty, iLogger)) == null || readFileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(readFileContent, str, iLogger);
    }

    public static String getPayloadFromSystemPropertyFilePathReflection(String str, ILogger iLogger) {
        String readFileContent;
        String readSystemPropertyReflection = readSystemPropertyReflection(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (readSystemPropertyReflection == null || readSystemPropertyReflection.isEmpty() || (readFileContent = readFileContent(readSystemPropertyReflection, iLogger)) == null || readFileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(readFileContent, str, iLogger);
    }

    public static String getPayloadFromContentProviderDefault(Context context, String str, ILogger iLogger) {
        if (!Util.resolveContentProvider(context, Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY)) {
            return null;
        }
        return readContentProvider(context, Util.formatString("content://%s/%s", Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger);
    }

    public static List<String> getPayloadsFromContentProviderIntentAction(Context context, String str, ILogger iLogger) {
        return readContentProviderIntentAction(context, str, "android.permission.INSTALL_PACKAGES", iLogger);
    }

    public static List<String> getPayloadsFromContentProviderNoPermission(Context context, String str, ILogger iLogger) {
        return readContentProviderIntentAction(context, str, (String) null, iLogger);
    }

    public static String getPayloadFromFileSystem(String str, String str2, ILogger iLogger) {
        String readFileContent = readFileContent(Constants.ADJUST_PREINSTALL_FILE_SYSTEM_PATH, iLogger);
        if (readFileContent == null || readFileContent.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                readFileContent = readFileContent(str2, iLogger);
            }
            if (readFileContent == null || readFileContent.isEmpty()) {
                return null;
            }
        }
        return readPayloadFromJsonString(readFileContent, str, iLogger);
    }

    private static String readSystemProperty(String str, ILogger iLogger) {
        try {
            return System.getProperty(str);
        } catch (Exception e) {
            iLogger.error("Exception read system property key [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    private static String readSystemPropertyReflection(String str, ILogger iLogger) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            iLogger.error("Exception read system property using reflection key [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    private static String readContentProvider(Context context, String str, String str2, ILogger iLogger) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(str), new String[]{"encrypted_data"}, "package_name=?", new String[]{str2}, (String) null);
            if (query == null) {
                iLogger.debug("Read content provider cursor null content uri [%s]", str);
                return null;
            } else if (!query.moveToFirst()) {
                iLogger.debug("Read content provider cursor empty content uri [%s]", str);
                query.close();
                return null;
            } else {
                String string = query.getString(0);
                query.close();
                return string;
            }
        } catch (Exception e) {
            iLogger.error("Exception read content provider uri [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    private static List<String> readContentProviderIntentAction(Context context, String str, String str2, ILogger iLogger) {
        String str3;
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent(Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentContentProviders) {
            if ((str2 == null || context.getPackageManager().checkPermission(str2, next.providerInfo.packageName) == 0) && (str3 = next.providerInfo.authority) != null && !str3.isEmpty()) {
                String readContentProvider = readContentProvider(context, Util.formatString("content://%s/%s", str3, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger);
                if (readContentProvider != null && !readContentProvider.isEmpty()) {
                    arrayList.add(readContentProvider);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    private static String readFileContent(String str, ILogger iLogger) {
        FileInputStream fileInputStream;
        File file = new File(str);
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                int length = (int) file.length();
                if (length <= 0) {
                    iLogger.debug("Read file content empty file", new Object[0]);
                    return null;
                }
                byte[] bArr = new byte[length];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    return new String(bArr);
                } catch (Exception e) {
                    iLogger.error("Exception read file input stream error [%s]", e.getMessage());
                    fileInputStream.close();
                    return null;
                }
            } catch (Exception e2) {
                iLogger.error("Exception read file content error [%s]", e2.getMessage());
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        }
        return null;
    }

    private static String readPayloadFromJsonString(String str, String str2, ILogger iLogger) {
        try {
            return new JSONObject(str.trim()).optString(str2);
        } catch (Exception e) {
            iLogger.error("Exception read payload from json string error [%s]", e.getMessage());
            return null;
        }
    }
}
