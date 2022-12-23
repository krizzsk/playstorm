package com.p374my.target;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* renamed from: com.my.target.f5 */
public final class C9700f5 extends C9736h5 {

    /* renamed from: a */
    public volatile String f23882a;

    /* renamed from: b */
    public C9701a f23883b;

    /* renamed from: c */
    public boolean f23884c = false;

    /* renamed from: com.my.target.f5$a */
    public static final class C9701a {

        /* renamed from: a */
        public final String f23885a;

        /* renamed from: b */
        public final String f23886b;

        /* renamed from: c */
        public final String f23887c;

        /* renamed from: d */
        public final String f23888d;

        /* renamed from: e */
        public final String f23889e;

        /* renamed from: f */
        public final String f23890f;

        public C9701a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f23885a = str;
            this.f23886b = str2;
            this.f23887c = str3;
            this.f23888d = str4;
            this.f23889e = str5;
            this.f23890f = str6;
        }

        /* renamed from: a */
        public static C9701a m28033a(String str, String str2, String str3, String str4, String str5, String str6) {
            return new C9701a(str, str2, str3, str4, str5, str6);
        }
    }

    /* renamed from: a */
    public static boolean m28024a(File file) {
        if (file == null) {
            return false;
        }
        return Environment.isExternalStorageRemovable(file) || !Environment.isExternalStorageEmulated(file);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m28025c() {
        addParam("rooted", String.valueOf(mo64023b() ? 1 : 0));
    }

    /* renamed from: d */
    public static File m28026d(Context context) {
        File[] externalFilesDirs = context.getExternalFilesDirs((String) null);
        if (!(externalFilesDirs == null || externalFilesDirs.length == 0)) {
            if (Build.VERSION.SDK_INT < 21) {
                return externalFilesDirs[externalFilesDirs.length - 1];
            }
            for (File file : externalFilesDirs) {
                if (m28024a(file)) {
                    return file;
                }
            }
            File externalFilesDir = context.getExternalFilesDir((String) null);
            if (m28024a(externalFilesDir)) {
                return externalFilesDir;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C9701a mo64020a() {
        return this.f23883b;
    }

    /* renamed from: a */
    public final void mo64021a(Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null && (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) != null) {
            HashSet hashSet = null;
            for (InputMethodInfo enabledInputMethodSubtypeList : enabledInputMethodList) {
                List<InputMethodSubtype> enabledInputMethodSubtypeList2 = inputMethodManager.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true);
                if (enabledInputMethodSubtypeList2 != null) {
                    for (InputMethodSubtype next : enabledInputMethodSubtypeList2) {
                        if ("keyboard".equals(next.getMode())) {
                            String locale = next.getLocale();
                            if (!TextUtils.isEmpty(locale)) {
                                if (hashSet == null) {
                                    hashSet = new HashSet();
                                }
                                hashSet.add(locale.split("_", 2)[0]);
                            }
                        }
                    }
                }
            }
            if (hashSet != null && !hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet);
                if (!TextUtils.isEmpty(join)) {
                    addParam("kb_lang", join);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64022b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            long totalSpace = filesDir.getTotalSpace();
            long freeSpace = filesDir.getFreeSpace();
            addParam("mm_tt", String.valueOf(totalSpace));
            addParam("mm_av", String.valueOf(freeSpace));
            File d = Build.VERSION.SDK_INT >= 19 ? m28026d(context) : context.getExternalFilesDir((String) null);
            if (d != null) {
                long totalSpace2 = d.getTotalSpace();
                long freeSpace2 = d.getFreeSpace();
                if (freeSpace != freeSpace2 || totalSpace != totalSpace2) {
                    addParam("emm_tt", String.valueOf(totalSpace2));
                    addParam("emm_av", String.valueOf(freeSpace2));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (r9 != null) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00a0 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo64023b() {
        /*
            r14 = this;
            java.lang.String r0 = android.os.Build.TAGS
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            java.lang.String r3 = "test-keys"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0010
            r0 = r2
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 != 0) goto L_0x0042
            r3 = 10
            java.lang.String r4 = "/system/app/Superuser.apk"
            java.lang.String r5 = "/sbin/su"
            java.lang.String r6 = "/system/bin/su"
            java.lang.String r7 = "/system/xbin/su"
            java.lang.String r8 = "/data/local/xbin/su"
            java.lang.String r9 = "/data/local/bin/su"
            java.lang.String r10 = "/system/sd/xbin/su"
            java.lang.String r11 = "/system/bin/failsafe/su"
            java.lang.String r12 = "/data/local/su"
            java.lang.String r13 = "/su/bin/su"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            r5 = r1
        L_0x002e:
            if (r5 >= r3) goto L_0x0042
            r6 = r4[r5]
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r6 = r7.exists()
            if (r6 == 0) goto L_0x003f
            r0 = r2
            goto L_0x0042
        L_0x003f:
            int r5 = r5 + 1
            goto L_0x002e
        L_0x0042:
            r3 = 0
            if (r0 != 0) goto L_0x00a3
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            r5 = 3
            java.lang.String r6 = "/system/xbin/which su"
            java.lang.String r7 = "/system/bin/which su"
            java.lang.String r8 = "which su"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8}
            r7 = r1
        L_0x0055:
            if (r7 >= r5) goto L_0x00a3
            r8 = r6[r7]
            java.lang.Process r8 = r4.exec(r8)     // Catch:{ all -> 0x009a }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x0091 }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ all -> 0x0091 }
            java.io.InputStream r11 = r8.getInputStream()     // Catch:{ all -> 0x0091 }
            r10.<init>(r11)     // Catch:{ all -> 0x0091 }
            r9.<init>(r10)     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r10.<init>()     // Catch:{ all -> 0x0092 }
        L_0x0070:
            java.lang.String r11 = r9.readLine()     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x007a
            r10.append(r11)     // Catch:{ all -> 0x0092 }
            goto L_0x0070
        L_0x007a:
            r8.destroy()     // Catch:{ all -> 0x0092 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0092 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0092 }
            if (r10 != 0) goto L_0x0094
            r9.close()     // Catch:{ all -> 0x008f }
            r8.destroy()     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = r2
            goto L_0x00a3
        L_0x008f:
            r0 = r2
            goto L_0x009b
        L_0x0091:
            r9 = r3
        L_0x0092:
            if (r9 == 0) goto L_0x0097
        L_0x0094:
            r9.close()     // Catch:{ all -> 0x009b }
        L_0x0097:
            if (r8 == 0) goto L_0x00a0
            goto L_0x009d
        L_0x009a:
            r8 = r3
        L_0x009b:
            if (r8 == 0) goto L_0x00a0
        L_0x009d:
            r8.destroy()     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            int r7 = r7 + 1
            goto L_0x0055
        L_0x00a3:
            if (r0 != 0) goto L_0x00f3
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r2]
            int r6 = android.os.Process.myPid()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r1] = r6
            java.lang.String r6 = "/proc/%d/mounts"
            java.lang.String r4 = java.lang.String.format(r4, r6, r5)
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x00ed }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ed }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x00ed }
            r7.<init>(r4)     // Catch:{ all -> 0x00ed }
            r6.<init>(r7)     // Catch:{ all -> 0x00ed }
            r5.<init>(r6)     // Catch:{ all -> 0x00ed }
            r3 = 4
            java.lang.String r4 = "/sbin/.magisk/"
            java.lang.String r6 = "/sbin/.core/mirror"
            java.lang.String r7 = "/sbin/.core/img"
            java.lang.String r8 = "/sbin/.core/db-0/magisk.db"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6, r7, r8}     // Catch:{ all -> 0x00ec }
        L_0x00d5:
            java.lang.String r6 = r5.readLine()     // Catch:{ all -> 0x00ec }
            if (r6 != 0) goto L_0x00dc
            goto L_0x00f0
        L_0x00dc:
            r7 = r1
        L_0x00dd:
            if (r7 >= r3) goto L_0x00d5
            r8 = r4[r7]     // Catch:{ all -> 0x00ec }
            boolean r8 = r6.contains(r8)     // Catch:{ all -> 0x00ec }
            if (r8 == 0) goto L_0x00e9
            r0 = r2
            goto L_0x00d5
        L_0x00e9:
            int r7 = r7 + 1
            goto L_0x00dd
        L_0x00ec:
            r3 = r5
        L_0x00ed:
            if (r3 == 0) goto L_0x00f3
            r5 = r3
        L_0x00f0:
            r5.close()     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9700f5.mo64023b():boolean");
    }

    /* renamed from: c */
    public final void mo64024c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            addParam("rs", audioManager.getRingerMode() == 2 ? "1" : "0");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(56:7|8|9|10|11|12|13|14|15|21|22|23|24|25|26|27|28|29|30|31|(2:33|34)(1:36)|35|37|46|47|48|(5:50|(1:52)(1:53)|54|(2:56|(29:58|63|(1:68)(1:67)|69|(1:71)(1:72)|73|(1:75)(1:76)|77|(11:79|80|81|82|(1:84)(1:85)|86|87|88|90|91|(3:93|94|95))|96|98|99|100|101|102|103|104|105|106|107|108|109|111|112|(2:115|113)|122|116|117|118))(1:59)|60)(1:61)|62|63|(0)(0)|69|(0)(0)|73|(0)(0)|77|(0)|96|98|99|100|101|102|103|104|105|106|107|108|109|111|112|(1:113)|122|116|117|118) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01a8 */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x023f A[LOOP:0: B:113:0x0239->B:115:0x023f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af A[SYNTHETIC, Splitter:B:33:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9 A[Catch:{ all -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void collectData(android.content.Context r26) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            monitor-enter(r25)
            boolean r0 = r1.f23884c     // Catch:{ all -> 0x027e }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r25)
            return
        L_0x000b:
            java.lang.String r0 = "collect application info..."
            com.p374my.target.C9672e0.m27882a(r0)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = android.os.Build.DEVICE     // Catch:{ all -> 0x027e }
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x027e }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x027e }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x027e }
            java.lang.String r9 = r26.getPackageName()     // Catch:{ all -> 0x027e }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x027e }
            java.lang.String r6 = r0.getLanguage()     // Catch:{ all -> 0x027e }
            java.lang.String r7 = ""
            java.lang.String r10 = ""
            android.content.res.Resources r0 = r26.getResources()     // Catch:{ all -> 0x027e }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x027e }
            java.util.Locale r0 = r0.locale     // Catch:{ all -> 0x027e }
            java.lang.String r11 = r0.getLanguage()     // Catch:{ all -> 0x027e }
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            int r16 = com.p374my.target.C10059y8.m29836b()     // Catch:{ all -> 0x027e }
            float r17 = com.p374my.target.C10059y8.m29821a()     // Catch:{ all -> 0x027e }
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x027e }
            java.lang.String r18 = ""
            r19 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r7.<init>()     // Catch:{ all -> 0x0072 }
            r20 = r10
            r21 = r12
            r10 = 0
            java.lang.String r12 = r0.getDisplayName(r10, r10)     // Catch:{ all -> 0x0070 }
            r7.append(r12)     // Catch:{ all -> 0x0070 }
            java.lang.String r10 = " "
            r7.append(r10)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r0.getID()     // Catch:{ all -> 0x0070 }
            r7.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r18 = r7.toString()     // Catch:{ all -> 0x0070 }
            goto L_0x008f
        L_0x0070:
            r0 = move-exception
            goto L_0x0077
        L_0x0072:
            r0 = move-exception
            r20 = r10
            r21 = r12
        L_0x0077:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x027e }
            r7.<init>()     // Catch:{ all -> 0x027e }
            java.lang.String r10 = "Timezone name error "
            r7.append(r10)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x027e }
            r7.append(r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x027e }
            com.p374my.target.C9672e0.m27883b(r0)     // Catch:{ all -> 0x027e }
        L_0x008f:
            r0 = r18
            com.my.target.-$$Lambda$f5$Fo0VEJ0chDaj38ce1LqTZhp6luo r7 = new com.my.target.-$$Lambda$f5$Fo0VEJ0chDaj38ce1LqTZhp6luo     // Catch:{ all -> 0x027e }
            r7.<init>()     // Catch:{ all -> 0x027e }
            com.p374my.target.C9693f0.m27981b(r7)     // Catch:{ all -> 0x027e }
            r7 = 0
            android.content.pm.PackageManager r7 = r26.getPackageManager()     // Catch:{ all -> 0x00cf }
            r10 = 0
            android.content.pm.PackageInfo r12 = r7.getPackageInfo(r9, r10)     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = r12.versionName     // Catch:{ all -> 0x00cb }
            r18 = r7
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c8 }
            r19 = r10
            r10 = 28
            if (r7 < r10) goto L_0x00b9
            long r22 = r12.getLongVersionCode()     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = java.lang.Long.toString(r22)     // Catch:{ all -> 0x00cd }
        L_0x00b7:
            r10 = r7
            goto L_0x00c0
        L_0x00b9:
            int r7 = r12.versionCode     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00cd }
            goto L_0x00b7
        L_0x00c0:
            r12 = r10
            r7 = r18
            r10 = r19
            r18 = r13
            goto L_0x00d5
        L_0x00c8:
            r19 = r10
            goto L_0x00cd
        L_0x00cb:
            r18 = r7
        L_0x00cd:
            r7 = r18
        L_0x00cf:
            r18 = r13
            r10 = r19
            r12 = r20
        L_0x00d5:
            java.lang.String r13 = "phone"
            java.lang.Object r13 = r2.getSystemService(r13)     // Catch:{ all -> 0x027e }
            android.telephony.TelephonyManager r13 = (android.telephony.TelephonyManager) r13     // Catch:{ all -> 0x027e }
            if (r13 == 0) goto L_0x0127
            java.lang.String r14 = r13.getNetworkOperatorName()     // Catch:{ all -> 0x027e }
            r19 = r14
            int r14 = r13.getSimState()     // Catch:{ all -> 0x027e }
            r20 = r15
            r15 = 5
            if (r14 != r15) goto L_0x00f3
            java.lang.String r14 = r13.getSimOperator()     // Catch:{ all -> 0x027e }
            goto L_0x00f5
        L_0x00f3:
            r14 = r18
        L_0x00f5:
            java.lang.String r13 = r13.getNetworkOperator()     // Catch:{ all -> 0x027e }
            boolean r15 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x027e }
            if (r15 != 0) goto L_0x011f
            int r15 = r13.length()     // Catch:{ all -> 0x027e }
            r18 = r14
            r14 = 3
            if (r15 <= r14) goto L_0x0121
            java.lang.String r15 = r13.substring(r14)     // Catch:{ all -> 0x027e }
            r20 = r15
            r15 = 0
            java.lang.String r13 = r13.substring(r15, r14)     // Catch:{ all -> 0x027e }
            r15 = r20
            r24 = r18
            r18 = r0
            r0 = r13
            r13 = r19
            r19 = r24
            goto L_0x0132
        L_0x011f:
            r18 = r14
        L_0x0121:
            r15 = r13
            r13 = r19
            r19 = r18
            goto L_0x012e
        L_0x0127:
            r20 = r15
            r15 = r14
            r19 = r18
            r13 = r21
        L_0x012e:
            r18 = r0
            r0 = r20
        L_0x0132:
            android.util.DisplayMetrics r14 = com.p374my.target.C10059y8.m29827a((android.content.Context) r26)     // Catch:{ all -> 0x027e }
            r20 = r13
            int r13 = r14.widthPixels     // Catch:{ all -> 0x027e }
            if (r13 <= 0) goto L_0x0141
            int r14 = r14.heightPixels     // Catch:{ all -> 0x027e }
            if (r14 <= 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r13 = 0
            r14 = 0
        L_0x0143:
            android.content.res.Resources r21 = r26.getResources()     // Catch:{ all -> 0x027e }
            r22 = r15
            android.content.res.Configuration r15 = r21.getConfiguration()     // Catch:{ all -> 0x027e }
            int r15 = r15.uiMode     // Catch:{ all -> 0x027e }
            r15 = r15 & 48
            r21 = r14
            r14 = 32
            r23 = r13
            r13 = 1
            if (r15 != r14) goto L_0x015c
            r14 = r13
            goto L_0x015d
        L_0x015c:
            r14 = 0
        L_0x015d:
            java.lang.String r15 = "dkm"
            if (r14 == 0) goto L_0x0164
            java.lang.String r14 = "1"
            goto L_0x0166
        L_0x0164:
            java.lang.String r14 = "0"
        L_0x0166:
            r1.addParam(r15, r14)     // Catch:{ all -> 0x027e }
            if (r7 == 0) goto L_0x018d
            java.lang.String r14 = "android.hardware.touchscreen"
            boolean r14 = r7.hasSystemFeature(r14)     // Catch:{ all -> 0x017d }
            java.lang.String r15 = "tscr"
            if (r14 == 0) goto L_0x0178
            java.lang.String r14 = "1"
            goto L_0x017a
        L_0x0178:
            java.lang.String r14 = "0"
        L_0x017a:
            r1.addParam(r15, r14)     // Catch:{ all -> 0x017d }
        L_0x017d:
            java.lang.String r14 = "com.google.android.webview"
            r15 = 0
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r14, r15)     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x018d
            java.lang.String r14 = "swvv"
            java.lang.String r7 = r7.versionName     // Catch:{ all -> 0x018d }
            r1.addParam(r14, r7)     // Catch:{ all -> 0x018d }
        L_0x018d:
            java.lang.String r7 = "uimode"
            java.lang.Object r7 = r2.getSystemService(r7)     // Catch:{ all -> 0x01a2 }
            android.app.UiModeManager r7 = (android.app.UiModeManager) r7     // Catch:{ all -> 0x01a2 }
            java.lang.String r14 = "uimd"
            int r7 = r7.getCurrentModeType()     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x01a2 }
            r1.addParam(r14, r7)     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r25.mo64022b(r26)     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r25.mo64024c(r26)     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r25.mo64021a((android.content.Context) r26)     // Catch:{ all -> 0x01ab }
        L_0x01ab:
            java.lang.String r7 = "device"
            r1.addParam(r7, r3)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "os"
            java.lang.String r7 = "Android"
            r1.addParam(r3, r7)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "manufacture"
            r1.addParam(r3, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "osver"
            r1.addParam(r3, r8)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "app"
            r1.addParam(r3, r9)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "appver"
            r1.addParam(r3, r10)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "appbuild"
            r1.addParam(r3, r12)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "lang"
            r1.addParam(r3, r6)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "app_lang"
            r1.addParam(r3, r11)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "sim_loc"
            r1.addParam(r3, r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "euname"
            r1.addParam(r0, r5)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = java.lang.String.valueOf(r23)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "w"
            r1.addParam(r3, r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "h"
            r1.addParam(r3, r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "dpi"
            r1.addParam(r3, r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "density"
            r1.addParam(r3, r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "operator_id"
            r14 = r22
            r1.addParam(r0, r14)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "operator_name"
            r3 = r20
            r1.addParam(r0, r3)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "sim_operator_id"
            r3 = r19
            r1.addParam(r0, r3)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "timezone"
            r3 = r18
            r1.addParam(r0, r3)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r25.mo64025e(r26)     // Catch:{ all -> 0x027e }
            java.lang.String r2 = "instance_id"
            r1.addParam(r2, r0)     // Catch:{ all -> 0x027e }
            java.util.Map r0 = r25.getMap()     // Catch:{ all -> 0x027e }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x027e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x027e }
        L_0x0239:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x027e }
            if (r2 == 0) goto L_0x0269
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x027e }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x027e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x027e }
            r3.<init>()     // Catch:{ all -> 0x027e }
            java.lang.Object r4 = r2.getKey()     // Catch:{ all -> 0x027e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x027e }
            r3.append(r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = " = "
            r3.append(r4)     // Catch:{ all -> 0x027e }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x027e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x027e }
            r3.append(r2)     // Catch:{ all -> 0x027e }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x027e }
            com.p374my.target.C9672e0.m27882a(r2)     // Catch:{ all -> 0x027e }
            goto L_0x0239
        L_0x0269:
            java.lang.String r6 = r1.f23882a     // Catch:{ all -> 0x027e }
            java.lang.String r7 = "Android"
            java.lang.String r11 = "5.15.0"
            com.my.target.f5$a r0 = com.p374my.target.C9700f5.C9701a.m28033a(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x027e }
            r1.f23883b = r0     // Catch:{ all -> 0x027e }
            r1.f23884c = r13     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "collected"
            com.p374my.target.C9672e0.m27882a(r0)     // Catch:{ all -> 0x027e }
            monitor-exit(r25)
            return
        L_0x027e:
            r0 = move-exception
            monitor-exit(r25)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9700f5.collectData(android.content.Context):void");
    }

    /* renamed from: e */
    public String mo64025e(Context context) {
        if (C9693f0.m27982b()) {
            C9672e0.m27882a("DeviceParamsDataProvider: You must not call getInstanceId method from main thread");
            return "";
        }
        if (this.f23882a == null) {
            synchronized (this) {
                if (this.f23882a == null) {
                    String d = C9993u8.m29506a(context).mo65574d();
                    if (TextUtils.isEmpty(d)) {
                        d = UUID.randomUUID().toString();
                        C9993u8.m29506a(context).mo65576e(d);
                    }
                    this.f23882a = d;
                }
            }
        }
        String str = this.f23882a;
        return str == null ? "" : str;
    }
}
