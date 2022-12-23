package com.adjust.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadFutureScheduler;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.tapjoy.TapjoyConstants;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public class Util {
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT, Locale.US);
    private static final String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";
    private static volatile SingleThreadFutureScheduler playAdIdScheduler = null;

    public static String getSdkVersion() {
        return Constants.CLIENT_SDK;
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    protected static String createUuid() {
        return UUID.randomUUID().toString();
    }

    private static DecimalFormat newLocalDecimalFormat() {
        return new DecimalFormat(IdManager.DEFAULT_VERSION_NAME, new DecimalFormatSymbols(Locale.US));
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        if (!Pattern.compile("\\s").matcher(str).find()) {
            return str;
        }
        return formatString("'%s'", str);
    }

    public static Object getAdvertisingInfoObject(final Context context, long j) {
        return runSyncInPlayAdIdSchedulerWithTimeout(context, new Callable<Object>() {
            public Object call() {
                try {
                    return Reflection.getAdvertisingInfoObject(context);
                } catch (Exception unused) {
                    return null;
                }
            }
        }, j);
    }

    public static String getPlayAdId(final Context context, final Object obj, long j) {
        return (String) runSyncInPlayAdIdSchedulerWithTimeout(context, new Callable<String>() {
            public String call() {
                return Reflection.getPlayAdId(context, obj);
            }
        }, j);
    }

    public static Boolean isPlayTrackingEnabled(final Context context, final Object obj, long j) {
        return (Boolean) runSyncInPlayAdIdSchedulerWithTimeout(context, new Callable<Boolean>() {
            public Boolean call() {
                return Reflection.isPlayTrackingEnabled(context, obj);
            }
        }, j);
    }

    private static <R> R runSyncInPlayAdIdSchedulerWithTimeout(Context context, Callable<R> callable, long j) {
        if (playAdIdScheduler == null) {
            synchronized (Util.class) {
                if (playAdIdScheduler == null) {
                    playAdIdScheduler = new SingleThreadFutureScheduler("PlayAdIdLibrary", true);
                }
            }
        }
        try {
            return playAdIdScheduler.scheduleFutureWithReturn(callable, 0).get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    public static void runInBackground(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        new AsyncTaskExecutor<Object, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Object... objArr) {
                objArr[0].run();
                return null;
            }
        }.execute(runnable);
    }

    public static void getGoogleAdId(Context context, final OnDeviceIdsRead onDeviceIdsRead) {
        new AsyncTaskExecutor<Context, String>() {
            /* access modifiers changed from: protected */
            public String doInBackground(Context... contextArr) {
                ILogger logger = AdjustFactory.getLogger();
                String access$000 = Util.getGoogleAdId(contextArr[0]);
                logger.debug("GoogleAdId read " + access$000, new Object[0]);
                return access$000;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                OnDeviceIdsRead.this.onGoogleAdIdRead(str);
            }
        }.execute(context);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r0 = getAdvertisingInfoObject(r4, 11000);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getGoogleAdId(android.content.Context r4) {
        /*
            r0 = 11000(0x2af8, double:5.4347E-320)
            r2 = 0
            com.adjust.sdk.GooglePlayServicesClient$GooglePlayServicesInfo r3 = com.adjust.sdk.GooglePlayServicesClient.getGooglePlayServicesInfo(r4, r0)     // Catch:{ Exception -> 0x000d }
            if (r3 == 0) goto L_0x000d
            java.lang.String r2 = r3.getGpsAdid()     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            if (r2 != 0) goto L_0x001b
            java.lang.Object r0 = getAdvertisingInfoObject(r4, r0)
            if (r0 == 0) goto L_0x001b
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r2 = getPlayAdId(r4, r0, r1)
        L_0x001b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.getGoogleAdId(android.content.Context):java.lang.String");
    }

    public static String getAndroidId(Context context) {
        return AndroidIdUtil.getAndroidId(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        getLogger().error("Failed to read %s object (%s)", r9, r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        getLogger().error("Failed to cast %s object (%s)", r9, r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        getLogger().error("Failed to find %s class (%s)", r9, r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        r6 = r0;
        r0 = r7;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), PHI: r0 r7 
      PHI: (r0v6 T) = (r0v0 T), (r0v0 T), (r0v0 T), (r0v14 T), (r0v15 T) binds: [B:3:0x0008, B:4:?, B:7:0x0012, B:10:0x002c, B:8:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v11 T) = (r7v10 T), (r7v10 T), (r7v18 T), (r7v18 T), (r7v18 T) binds: [B:3:0x0008, B:4:?, B:7:0x0012, B:10:0x002c, B:8:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:3:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2 A[SYNTHETIC, Splitter:B:32:0x00a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T readObject(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.Class<T> r10) {
        /*
            r0 = 0
            r1 = 2
            r2 = 0
            r3 = 1
            java.io.FileInputStream r7 = r7.openFileInput(r8)     // Catch:{ FileNotFoundException -> 0x008f, Exception -> 0x007d }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006b }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006b }
            java.lang.Object r8 = r7.readObject()     // Catch:{ ClassNotFoundException -> 0x0056, ClassCastException -> 0x0041, Exception -> 0x002b, FileNotFoundException -> 0x0079 }
            java.lang.Object r0 = r10.cast(r8)     // Catch:{ ClassNotFoundException -> 0x0056, ClassCastException -> 0x0041, Exception -> 0x002b, FileNotFoundException -> 0x0079 }
            com.adjust.sdk.ILogger r8 = getLogger()     // Catch:{ ClassNotFoundException -> 0x0056, ClassCastException -> 0x0041, Exception -> 0x002b, FileNotFoundException -> 0x0079 }
            java.lang.String r10 = "Read %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0056, ClassCastException -> 0x0041, Exception -> 0x002b, FileNotFoundException -> 0x0079 }
            r4[r2] = r9     // Catch:{ ClassNotFoundException -> 0x0056, ClassCastException -> 0x0041, Exception -> 0x002b, FileNotFoundException -> 0x0079 }
            r4[r3] = r0     // Catch:{ ClassNotFoundException -> 0x0056, ClassCastException -> 0x0041, Exception -> 0x002b, FileNotFoundException -> 0x0079 }
            r8.debug(r10, r4)     // Catch:{ ClassNotFoundException -> 0x0056, ClassCastException -> 0x0041, Exception -> 0x002b, FileNotFoundException -> 0x0079 }
            goto L_0x00a0
        L_0x002b:
            r8 = move-exception
            com.adjust.sdk.ILogger r10 = getLogger()     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            java.lang.String r4 = "Failed to read %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r5[r2] = r9     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r5[r3] = r8     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r10.error(r4, r5)     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            goto L_0x00a0
        L_0x0041:
            r8 = move-exception
            com.adjust.sdk.ILogger r10 = getLogger()     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            java.lang.String r4 = "Failed to cast %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r5[r2] = r9     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r5[r3] = r8     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r10.error(r4, r5)     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            goto L_0x00a0
        L_0x0056:
            r8 = move-exception
            com.adjust.sdk.ILogger r10 = getLogger()     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            java.lang.String r4 = "Failed to find %s class (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r5[r2] = r9     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r5[r3] = r8     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            r10.error(r4, r5)     // Catch:{ FileNotFoundException -> 0x0079, Exception -> 0x0074 }
            goto L_0x00a0
        L_0x006b:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r0
            r0 = r6
            goto L_0x007f
        L_0x0071:
            r7 = r0
            r0 = r8
            goto L_0x0090
        L_0x0074:
            r8 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x007f
        L_0x0079:
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x0090
        L_0x007d:
            r8 = move-exception
            r7 = r0
        L_0x007f:
            com.adjust.sdk.ILogger r10 = getLogger()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r9
            r4[r3] = r8
            java.lang.String r8 = "Failed to open %s file for reading (%s)"
            r10.error(r8, r4)
            goto L_0x009d
        L_0x008f:
            r7 = r0
        L_0x0090:
            com.adjust.sdk.ILogger r8 = getLogger()
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r2] = r9
            java.lang.String r4 = "%s file not found"
            r8.debug(r4, r10)
        L_0x009d:
            r6 = r0
            r0 = r7
            r7 = r6
        L_0x00a0:
            if (r7 == 0) goto L_0x00b6
            r7.close()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00b6
        L_0x00a6:
            r7 = move-exception
            com.adjust.sdk.ILogger r8 = getLogger()
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r2] = r9
            r10[r3] = r7
            java.lang.String r7 = "Failed to close %s file for reading (%s)"
            r8.error(r7, r10)
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.readObject(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void writeObject(T r5, android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r7, r2)     // Catch:{ Exception -> 0x0037 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0035 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0035 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0032 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0032 }
            r6.writeObject(r5)     // Catch:{ NotSerializableException -> 0x0024 }
            com.adjust.sdk.ILogger r7 = getLogger()     // Catch:{ NotSerializableException -> 0x0024 }
            java.lang.String r3 = "Wrote %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ NotSerializableException -> 0x0024 }
            r4[r2] = r8     // Catch:{ NotSerializableException -> 0x0024 }
            r4[r1] = r5     // Catch:{ NotSerializableException -> 0x0024 }
            r7.debug(r3, r4)     // Catch:{ NotSerializableException -> 0x0024 }
            goto L_0x0048
        L_0x0024:
            com.adjust.sdk.ILogger r5 = getLogger()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r7 = "Failed to serialize %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0035 }
            r3[r2] = r8     // Catch:{ Exception -> 0x0035 }
            r5.error(r7, r3)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0048
        L_0x0032:
            r5 = move-exception
            r6 = r7
            goto L_0x0039
        L_0x0035:
            r5 = move-exception
            goto L_0x0039
        L_0x0037:
            r5 = move-exception
            r6 = 0
        L_0x0039:
            com.adjust.sdk.ILogger r7 = getLogger()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r8
            r3[r1] = r5
            java.lang.String r5 = "Failed to open %s for writing (%s)"
            r7.error(r5, r3)
        L_0x0048:
            if (r6 == 0) goto L_0x005e
            r6.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x005e
        L_0x004e:
            r5 = move-exception
            com.adjust.sdk.ILogger r6 = getLogger()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r2] = r8
            r7[r1] = r5
            java.lang.String r5 = "Failed to close %s file for writing (%s)"
            r6.error(r5, r7)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.writeObject(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static boolean checkPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e.getMessage());
            return false;
        }
    }

    public static String readStringField(ObjectInputStream.GetField getField, String str, String str2) {
        return (String) readObjectField(getField, str, str2);
    }

    public static <T> T readObjectField(ObjectInputStream.GetField getField, String str, T t) {
        try {
            return getField.get(str, t);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return t;
        }
    }

    public static boolean readBooleanField(ObjectInputStream.GetField getField, String str, boolean z) {
        try {
            return getField.get(str, z);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return z;
        }
    }

    public static int readIntField(ObjectInputStream.GetField getField, String str, int i) {
        try {
            return getField.get(str, i);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return i;
        }
    }

    public static long readLongField(ObjectInputStream.GetField getField, String str, long j) {
        try {
            return getField.get(str, j);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return j;
        }
    }

    public static boolean equalObject(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean equalsDouble(Double d, Double d2) {
        return (d == null || d2 == null) ? d == null && d2 == null : Double.doubleToLongBits(d.doubleValue()) == Double.doubleToLongBits(d2.doubleValue());
    }

    public static boolean equalString(String str, String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalEnum(Enum enumR, Enum enumR2) {
        return equalObject(enumR, enumR2);
    }

    public static boolean equalLong(Long l, Long l2) {
        return equalObject(l, l2);
    }

    public static boolean equalInt(Integer num, Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalBoolean(Boolean bool, Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static int hashBoolean(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public static int hashLong(Long l) {
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public static int hashDouble(Double d) {
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public static int hashString(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static int hashEnum(Enum enumR) {
        if (enumR == null) {
            return 0;
        }
        return enumR.hashCode();
    }

    public static int hashObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String sha256(String str) {
        return hash(str, Constants.SHA256);
    }

    public static String hash(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes, 0, bytes.length);
            return convertToHex(instance.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String convertToHex(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return formatString("%0" + (bArr.length << 1) + "x", bigInteger);
    }

    public static String[] getSupportedAbis() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return null;
    }

    public static String getCpuAbi() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return null;
    }

    public static String getReasonString(String str, Throwable th) {
        if (th != null) {
            return formatString("%s: %s", str, th);
        }
        return formatString("%s", str);
    }

    public static long getWaitingTime(int i, BackoffStrategy backoffStrategy) {
        if (i < backoffStrategy.minRetries) {
            return 0;
        }
        return (long) (((double) Math.min(((long) Math.pow(2.0d, (double) (i - backoffStrategy.minRetries))) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait)) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    private static double randomInRange(double d, double d2) {
        return (new Random().nextDouble() * (d2 - d)) + d;
    }

    public static boolean isValidParameter(String str, String str2, String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        } else if (!str.equals("")) {
            return true;
        } else {
            getLogger().error("%s parameter %s is empty", str3, str2);
            return false;
        }
    }

    public static Map<String, String> mergeParameters(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        ILogger logger = getLogger();
        for (Map.Entry next : map2.entrySet()) {
            String str2 = (String) hashMap.put((String) next.getKey(), (String) next.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", next.getKey(), str2, str, next.getValue());
            }
        }
        return hashMap;
    }

    public static Locale getLocale(Configuration configuration) {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24 && (locales = configuration.getLocales()) != null && !locales.isEmpty()) {
            return locales.get(0);
        }
        if (Build.VERSION.SDK_INT < 24) {
            return configuration.locale;
        }
        return null;
    }

    public static String getFireAdvertisingId(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean getFireTrackingEnabled(ContentResolver contentResolver) {
        try {
            return Boolean.valueOf(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getConnectivityType(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            if (Build.VERSION.SDK_INT < 23) {
                return connectivityManager.getActiveNetworkInfo().getType();
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return -1;
            }
            if (networkCapabilities.hasTransport(1)) {
                return 1;
            }
            if (networkCapabilities.hasTransport(0)) {
                return 0;
            }
            if (networkCapabilities.hasTransport(3)) {
                return 3;
            }
            if (networkCapabilities.hasTransport(4)) {
                return 4;
            }
            if (networkCapabilities.hasTransport(2)) {
                return 2;
            }
            if (Build.VERSION.SDK_INT < 26) {
                return -1;
            }
            if (networkCapabilities.hasTransport(5)) {
                return 5;
            }
            if (Build.VERSION.SDK_INT >= 27 && networkCapabilities.hasTransport(6)) {
                return 6;
            }
            return -1;
        } catch (Exception e) {
            getLogger().warn("Couldn't read connectivity type (%s)", e.getMessage());
        }
    }

    public static String getMcc(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(0, 3);
            }
            AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MCC", new Object[0]);
            return null;
        } catch (Exception unused) {
            AdjustFactory.getLogger().warn("Couldn't return mcc", new Object[0]);
            return null;
        }
    }

    public static String getMnc(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(3);
            }
            AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MNC", new Object[0]);
            return null;
        } catch (Exception unused) {
            AdjustFactory.getLogger().warn("Couldn't return mnc", new Object[0]);
            return null;
        }
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean hasRootCause(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String getRootCause(Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int indexOf = stringWriter2.indexOf("Caused by:");
        return stringWriter2.substring(indexOf, stringWriter2.indexOf("\n", indexOf));
    }

    private static String getSdkPrefix(String str) {
        String[] split;
        if (str != null && str.contains("@") && (split = str.split("@")) != null && split.length == 2) {
            return split[0];
        }
        return null;
    }

    public static String getSdkPrefixPlatform(String str) {
        String[] split;
        String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null || (split = sdkPrefix.split("\\d+", 2)) == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    public static boolean isUrlFilteredOut(Uri uri) {
        String uri2;
        if (uri == null || (uri2 = uri.toString()) == null || uri2.length() == 0 || uri2.matches(Constants.FB_AUTH_REGEX)) {
            return true;
        }
        return false;
    }

    public static boolean resolveContentProvider(Context context, String str) {
        try {
            if (context.getPackageManager().resolveContentProvider(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isEqualReferrerDetails(ReferrerDetails referrerDetails, String str, ActivityState activityState) {
        if (str.equals(Constants.REFERRER_API_GOOGLE)) {
            return isEqualGoogleReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_ADS)) {
            return isEqualHuaweiReferrerAdsDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
            return isEqualHuaweiReferrerAppGalleryDetails(referrerDetails, activityState);
        }
        return false;
    }

    public static boolean canReadPlayIds(AdjustConfig adjustConfig) {
        if (!adjustConfig.playStoreKidsAppEnabled && !adjustConfig.coppaCompliantEnabled) {
            return true;
        }
        return false;
    }

    public static boolean canReadNonPlayIds(AdjustConfig adjustConfig) {
        if (!adjustConfig.playStoreKidsAppEnabled && !adjustConfig.coppaCompliantEnabled) {
            return true;
        }
        return false;
    }

    public static Map<String, String> getImeiParameters(AdjustConfig adjustConfig, ILogger iLogger) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return Reflection.getImeiParameters(adjustConfig.context, iLogger);
    }

    public static Map<String, String> getOaidParameters(AdjustConfig adjustConfig, ILogger iLogger) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return Reflection.getOaidParameters(adjustConfig.context, iLogger);
    }

    public static String getFireAdvertisingId(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return getFireAdvertisingId(adjustConfig.context.getContentResolver());
    }

    public static Boolean getFireTrackingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return getFireTrackingEnabled(adjustConfig.context.getContentResolver());
    }

    private static boolean isEqualGoogleReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTime && referrerDetails.installBeginTimestampSeconds == activityState.installBegin && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServer && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServer && equalString(referrerDetails.installReferrer, activityState.installReferrer) && equalString(referrerDetails.installVersion, activityState.installVersion) && equalBoolean(referrerDetails.googlePlayInstant, activityState.googlePlayInstant);
    }

    private static boolean isEqualHuaweiReferrerAdsDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuawei);
    }

    private static boolean isEqualHuaweiReferrerAppGalleryDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuaweiAppGallery);
    }
}
