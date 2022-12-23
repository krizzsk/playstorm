package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1870e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.r */
public class C2023r {

    /* renamed from: a */
    private final String f3926a = "FileManagerOld";

    /* renamed from: b */
    private final C1959m f3927b;

    /* renamed from: c */
    private final C2092v f3928c;

    /* renamed from: d */
    private final Object f3929d = new Object();

    C2023r(C1959m mVar) {
        this.f3927b = mVar;
        this.f3928c = mVar.mo14286A();
    }

    /* renamed from: a */
    private File m4825a(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    /* renamed from: a */
    private boolean m4826a(File file, String str, List<String> list, boolean z, C1870e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            ByteArrayOutputStream a = mo14636a(str, list, z, eVar);
            if (!(eVar == null || a == null)) {
                eVar.mo14115a((long) a.size());
            }
            return mo14640a(a, file);
        }
        if (C2092v.m5048a(this.f3927b)) {
            C2092v vVar = this.f3928c;
            vVar.mo14789b("FileManagerOld", "File exists for " + str);
        }
        if (eVar == null) {
            return true;
        }
        eVar.mo14117b(file.length());
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[Catch:{ all -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[Catch:{ all -> 0x006f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0041=Splitter:B:18:0x0041, B:22:0x0052=Splitter:B:22:0x0052, B:30:0x006a=Splitter:B:30:0x006a} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0041=Splitter:B:18:0x0041, B:26:0x0059=Splitter:B:26:0x0059} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4827b(java.io.ByteArrayOutputStream r6, java.io.File r7) {
        /*
            r5 = this;
            com.applovin.impl.sdk.m r0 = r5.f3927b
            boolean r0 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r0)
            if (r0 == 0) goto L_0x0024
            com.applovin.impl.sdk.v r0 = r5.f3928c
            java.lang.String r1 = "FileManagerOld"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing resource to filesystem: "
            r2.append(r3)
            java.lang.String r3 = r7.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo14789b(r1, r2)
        L_0x0024:
            r0 = 0
            r1 = 0
            java.lang.Object r2 = r5.f3929d
            monitor-enter(r2)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0058, all -> 0x0040 }
            r3.<init>(r7)     // Catch:{ IOException -> 0x0058, all -> 0x0040 }
            r6.writeTo(r3)     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r1 = 1
            com.applovin.impl.sdk.m r6 = r5.f3927b     // Catch:{ all -> 0x0038 }
            com.applovin.impl.sdk.utils.Utils.close(r3, r6)     // Catch:{ all -> 0x0038 }
            goto L_0x006d
        L_0x0038:
            r6 = move-exception
            goto L_0x0076
        L_0x003a:
            r6 = move-exception
            r0 = r3
            goto L_0x0041
        L_0x003d:
            r6 = move-exception
            r0 = r3
            goto L_0x0059
        L_0x0040:
            r6 = move-exception
        L_0x0041:
            com.applovin.impl.sdk.m r7 = r5.f3927b     // Catch:{ all -> 0x006f }
            boolean r7 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r7)     // Catch:{ all -> 0x006f }
            if (r7 == 0) goto L_0x0052
            com.applovin.impl.sdk.v r7 = r5.f3928c     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "FileManagerOld"
            java.lang.String r4 = "Unknown failure to write file."
            r7.mo14790b(r3, r4, r6)     // Catch:{ all -> 0x006f }
        L_0x0052:
            com.applovin.impl.sdk.m r6 = r5.f3927b     // Catch:{ all -> 0x0038 }
        L_0x0054:
            com.applovin.impl.sdk.utils.Utils.close(r0, r6)     // Catch:{ all -> 0x0038 }
            goto L_0x006d
        L_0x0058:
            r6 = move-exception
        L_0x0059:
            com.applovin.impl.sdk.m r7 = r5.f3927b     // Catch:{ all -> 0x006f }
            boolean r7 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r7)     // Catch:{ all -> 0x006f }
            if (r7 == 0) goto L_0x006a
            com.applovin.impl.sdk.v r7 = r5.f3928c     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "FileManagerOld"
            java.lang.String r4 = "Unable to write data to file."
            r7.mo14790b(r3, r4, r6)     // Catch:{ all -> 0x006f }
        L_0x006a:
            com.applovin.impl.sdk.m r6 = r5.f3927b     // Catch:{ all -> 0x0038 }
            goto L_0x0054
        L_0x006d:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            return r1
        L_0x006f:
            r6 = move-exception
            com.applovin.impl.sdk.m r7 = r5.f3927b     // Catch:{ all -> 0x0038 }
            com.applovin.impl.sdk.utils.Utils.close(r0, r7)     // Catch:{ all -> 0x0038 }
            throw r6     // Catch:{ all -> 0x0038 }
        L_0x0076:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C2023r.m4827b(java.io.ByteArrayOutputStream, java.io.File):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r3, r8.f3927b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r2, r8.f3927b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b1 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0070=Splitter:B:34:0x0070, B:44:0x00a0=Splitter:B:44:0x00a0, B:54:0x00c9=Splitter:B:54:0x00c9, B:30:0x005f=Splitter:B:30:0x005f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x0079=Splitter:B:40:0x0079, B:50:0x00a9=Splitter:B:50:0x00a9, B:30:0x005f=Splitter:B:30:0x005f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.ByteArrayOutputStream mo14635a(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.applovin.impl.sdk.m r1 = r8.f3927b
            boolean r1 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r1)
            if (r1 == 0) goto L_0x0028
            com.applovin.impl.sdk.v r1 = r8.f3928c
            java.lang.String r2 = "FileManagerOld"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading resource from filesystem: "
            r3.append(r4)
            java.lang.String r4 = r9.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.mo14789b(r2, r3)
        L_0x0028:
            java.lang.Object r1 = r8.f3929d
            monitor-enter(r1)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00a7, IOException -> 0x0077, all -> 0x005d }
            r2.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00a7, IOException -> 0x0077, all -> 0x005d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
        L_0x0039:
            r6 = 0
            int r7 = r2.read(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            if (r7 < 0) goto L_0x0050
            r3.write(r5, r6, r7)     // Catch:{ Exception -> 0x0044 }
            goto L_0x0039
        L_0x0044:
            com.applovin.impl.sdk.m r4 = r8.f3927b     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            com.applovin.impl.sdk.utils.Utils.close(r3, r4)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            com.applovin.impl.sdk.m r9 = r8.f3927b     // Catch:{ all -> 0x00d7 }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            return r0
        L_0x0050:
            com.applovin.impl.sdk.m r9 = r8.f3927b     // Catch:{ all -> 0x00d7 }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            return r3
        L_0x0057:
            r9 = move-exception
            goto L_0x005f
        L_0x0059:
            r3 = move-exception
            goto L_0x0079
        L_0x005b:
            r9 = move-exception
            goto L_0x00a9
        L_0x005d:
            r9 = move-exception
            r2 = r0
        L_0x005f:
            com.applovin.impl.sdk.m r3 = r8.f3927b     // Catch:{ all -> 0x00d0 }
            boolean r3 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r3)     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x0070
            com.applovin.impl.sdk.v r3 = r8.f3928c     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "FileManagerOld"
            java.lang.String r5 = "Unknown failure to read file."
            r3.mo14790b(r4, r5, r9)     // Catch:{ all -> 0x00d0 }
        L_0x0070:
            com.applovin.impl.sdk.m r9 = r8.f3927b     // Catch:{ all -> 0x00d7 }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            return r0
        L_0x0077:
            r3 = move-exception
            r2 = r0
        L_0x0079:
            com.applovin.impl.sdk.m r4 = r8.f3927b     // Catch:{ all -> 0x00d0 }
            boolean r4 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r4)     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x00a0
            com.applovin.impl.sdk.v r4 = r8.f3928c     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = "FileManagerOld"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r6.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r7 = "Failed to read file: "
            r6.append(r7)     // Catch:{ all -> 0x00d0 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x00d0 }
            r6.append(r9)     // Catch:{ all -> 0x00d0 }
            r6.append(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x00d0 }
            r4.mo14789b(r5, r9)     // Catch:{ all -> 0x00d0 }
        L_0x00a0:
            com.applovin.impl.sdk.m r9 = r8.f3927b     // Catch:{ all -> 0x00d7 }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            return r0
        L_0x00a7:
            r9 = move-exception
            r2 = r0
        L_0x00a9:
            com.applovin.impl.sdk.m r3 = r8.f3927b     // Catch:{ all -> 0x00d0 }
            boolean r3 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r3)     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x00c9
            com.applovin.impl.sdk.v r3 = r8.f3928c     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "FileManagerOld"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r5.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = "File not found. "
            r5.append(r6)     // Catch:{ all -> 0x00d0 }
            r5.append(r9)     // Catch:{ all -> 0x00d0 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x00d0 }
            r3.mo14791c(r4, r9)     // Catch:{ all -> 0x00d0 }
        L_0x00c9:
            com.applovin.impl.sdk.m r9 = r8.f3927b     // Catch:{ all -> 0x00d7 }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            return r0
        L_0x00d0:
            r9 = move-exception
            com.applovin.impl.sdk.m r0 = r8.f3927b     // Catch:{ all -> 0x00d7 }
            com.applovin.impl.sdk.utils.Utils.close(r2, r0)     // Catch:{ all -> 0x00d7 }
            throw r9     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C2023r.mo14635a(java.io.File):java.io.ByteArrayOutputStream");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.io.InputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r9, r7.f3927b);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        if (com.applovin.impl.sdk.C2092v.m5048a(r7.f3927b) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f9, code lost:
        r7.f3928c.mo14789b("FileManagerOld", "Loaded resource at " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010f, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r2, r7.f3927b);
        com.applovin.impl.sdk.utils.Utils.close(r9, r7.f3927b);
        com.applovin.impl.sdk.utils.Utils.disconnect(r10, r7.f3927b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        return r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00dc */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0142 A[Catch:{ all -> 0x015c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.ByteArrayOutputStream mo14636a(java.lang.String r8, java.util.List<java.lang.String> r9, boolean r10, com.applovin.impl.sdk.p049d.C1870e r11) {
        /*
            r7 = this;
            java.lang.String r0 = "FileManagerOld"
            r1 = 0
            if (r10 == 0) goto L_0x002a
            boolean r9 = com.applovin.impl.sdk.utils.Utils.isDomainWhitelisted(r8, r9)
            if (r9 != 0) goto L_0x002a
            com.applovin.impl.sdk.m r9 = r7.f3927b
            boolean r9 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r9)
            if (r9 == 0) goto L_0x0029
            com.applovin.impl.sdk.v r9 = r7.f3928c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Domain is not whitelisted, skipping precache for url: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.mo14789b(r0, r8)
        L_0x0029:
            return r1
        L_0x002a:
            com.applovin.impl.sdk.m r9 = r7.f3927b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r10 = com.applovin.impl.sdk.p048c.C1857b.f3192cQ
            java.lang.Object r9 = r9.mo14311a(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0057
            java.lang.String r9 = "https://"
            boolean r10 = r8.contains(r9)
            if (r10 != 0) goto L_0x0057
            com.applovin.impl.sdk.m r10 = r7.f3927b
            boolean r10 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r10)
            if (r10 == 0) goto L_0x0051
            com.applovin.impl.sdk.v r10 = r7.f3928c
            java.lang.String r2 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r10.mo14792d(r0, r2)
        L_0x0051:
            java.lang.String r10 = "http://"
            java.lang.String r8 = r8.replace(r10, r9)
        L_0x0057:
            com.applovin.impl.sdk.m r9 = r7.f3927b
            boolean r9 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r9)
            if (r9 == 0) goto L_0x007a
            com.applovin.impl.sdk.v r9 = r7.f3928c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "Loading "
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = "..."
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.mo14789b(r0, r10)
        L_0x007a:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0136, all -> 0x0132 }
            r9.<init>()     // Catch:{ IOException -> 0x0136, all -> 0x0132 }
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r10.<init>(r8)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.net.URLConnection r10 = r10.openConnection()     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            com.applovin.impl.sdk.m r2 = r7.f3927b     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r3 = com.applovin.impl.sdk.p048c.C1857b.f3190cO     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            java.lang.Object r2 = r2.mo14311a(r3)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r10.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            com.applovin.impl.sdk.m r2 = r7.f3927b     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r3 = com.applovin.impl.sdk.p048c.C1857b.f3191cP     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            java.lang.Object r2 = r2.mo14311a(r3)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r10.setReadTimeout(r2)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r2 = 1
            r10.setDefaultUseCaches(r2)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r10.setUseCaches(r2)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r3 = 0
            r10.setAllowUserInteraction(r3)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r10.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            int r2 = r10.getResponseCode()     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r11.mo14114a((int) r2)     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 < r4) goto L_0x0121
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r4) goto L_0x00ca
            goto L_0x0121
        L_0x00ca:
            java.io.InputStream r2 = r10.getInputStream()     // Catch:{ IOException -> 0x0129, all -> 0x0127 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch:{ IOException -> 0x011f }
        L_0x00d2:
            int r6 = r2.read(r5, r3, r4)     // Catch:{ IOException -> 0x011f }
            if (r6 < 0) goto L_0x00f1
            r9.write(r5, r3, r6)     // Catch:{ Exception -> 0x00dc }
            goto L_0x00d2
        L_0x00dc:
            com.applovin.impl.sdk.m r3 = r7.f3927b     // Catch:{ IOException -> 0x011f }
            com.applovin.impl.sdk.utils.Utils.close(r9, r3)     // Catch:{ IOException -> 0x011f }
        L_0x00e1:
            com.applovin.impl.sdk.m r8 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.close(r2, r8)
        L_0x00e6:
            com.applovin.impl.sdk.m r8 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.close(r9, r8)
            com.applovin.impl.sdk.m r8 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.disconnect(r10, r8)
            return r1
        L_0x00f1:
            com.applovin.impl.sdk.m r3 = r7.f3927b     // Catch:{ IOException -> 0x011f }
            boolean r3 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r3)     // Catch:{ IOException -> 0x011f }
            if (r3 == 0) goto L_0x010f
            com.applovin.impl.sdk.v r3 = r7.f3928c     // Catch:{ IOException -> 0x011f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011f }
            r4.<init>()     // Catch:{ IOException -> 0x011f }
            java.lang.String r5 = "Loaded resource at "
            r4.append(r5)     // Catch:{ IOException -> 0x011f }
            r4.append(r8)     // Catch:{ IOException -> 0x011f }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x011f }
            r3.mo14789b(r0, r4)     // Catch:{ IOException -> 0x011f }
        L_0x010f:
            com.applovin.impl.sdk.m r8 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.close(r2, r8)
            com.applovin.impl.sdk.m r8 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.close(r9, r8)
            com.applovin.impl.sdk.m r8 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.disconnect(r10, r8)
            return r9
        L_0x011f:
            r3 = move-exception
            goto L_0x013a
        L_0x0121:
            com.applovin.impl.sdk.m r8 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.close(r1, r8)
            goto L_0x00e6
        L_0x0127:
            r8 = move-exception
            goto L_0x015e
        L_0x0129:
            r3 = move-exception
            r2 = r1
            goto L_0x013a
        L_0x012c:
            r8 = move-exception
            r10 = r1
            goto L_0x015e
        L_0x012f:
            r3 = move-exception
            r10 = r1
            goto L_0x0139
        L_0x0132:
            r8 = move-exception
            r9 = r1
            r10 = r9
            goto L_0x015e
        L_0x0136:
            r3 = move-exception
            r9 = r1
            r10 = r9
        L_0x0139:
            r2 = r10
        L_0x013a:
            com.applovin.impl.sdk.m r4 = r7.f3927b     // Catch:{ all -> 0x015c }
            boolean r4 = com.applovin.impl.sdk.C2092v.m5048a((com.applovin.impl.sdk.C1959m) r4)     // Catch:{ all -> 0x015c }
            if (r4 == 0) goto L_0x0158
            com.applovin.impl.sdk.v r4 = r7.f3928c     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            r5.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r6 = "Error loading "
            r5.append(r6)     // Catch:{ all -> 0x015c }
            r5.append(r8)     // Catch:{ all -> 0x015c }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x015c }
            r4.mo14790b(r0, r8, r3)     // Catch:{ all -> 0x015c }
        L_0x0158:
            r11.mo14116a((java.lang.Exception) r3)     // Catch:{ all -> 0x015c }
            goto L_0x00e1
        L_0x015c:
            r8 = move-exception
            r1 = r2
        L_0x015e:
            com.applovin.impl.sdk.m r11 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.close(r1, r11)
            com.applovin.impl.sdk.m r11 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.close(r9, r11)
            com.applovin.impl.sdk.m r9 = r7.f3927b
            com.applovin.impl.sdk.utils.Utils.disconnect(r10, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C2023r.mo14636a(java.lang.String, java.util.List, boolean, com.applovin.impl.sdk.d.e):java.io.ByteArrayOutputStream");
    }

    /* renamed from: a */
    public File mo14637a(String str, Context context) {
        File file;
        if (!StringUtils.isValidString(str)) {
            if (C2092v.m5048a(this.f3927b)) {
                this.f3928c.mo14789b("FileManagerOld", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (C2092v.m5048a(this.f3927b)) {
            C2092v vVar = this.f3928c;
            vVar.mo14789b("FileManagerOld", "Looking up cached resource: " + str);
        }
        if (str.contains(RewardPlus.ICON)) {
            str = str.replace("/", "_").replace(".", "_");
        }
        synchronized (this.f3929d) {
            File a = m4825a(context);
            file = new File(a, str);
            try {
                a.mkdirs();
            } catch (Throwable th) {
                if (C2092v.m5048a(this.f3927b)) {
                    C2092v vVar2 = this.f3928c;
                    vVar2.mo14790b("FileManagerOld", "Unable to make cache directory at " + a, th);
                }
                return null;
            }
        }
        return file;
    }

    /* renamed from: a */
    public String mo14638a(Context context, String str, String str2, List<String> list, boolean z, C1870e eVar) {
        return mo14639a(context, str, str2, list, z, false, eVar);
    }

    /* renamed from: a */
    public String mo14639a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, C1870e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (C2092v.m5048a(this.f3927b)) {
                this.f3928c.mo14789b("FileManagerOld", "Nothing to cache, skipping...");
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        String fileName = ((Boolean) this.f3927b.mo14311a(C1857b.f3299eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            StringBuilder sb = new StringBuilder();
            String str3 = str2;
            sb.append(str2);
            sb.append(fileName);
            fileName = sb.toString();
        }
        String str4 = fileName;
        Context context2 = context;
        File a = mo14637a(str4, context);
        if (!m4826a(a, str, list, z, eVar)) {
            return null;
        }
        if (C2092v.m5048a(this.f3927b)) {
            C2092v vVar = this.f3928c;
            vVar.mo14789b("FileManagerOld", "Caching succeeded for file " + str4);
        }
        return z2 ? Uri.fromFile(a).toString() : str4;
    }

    /* renamed from: a */
    public boolean mo14640a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        if (file == null) {
            return false;
        }
        if (C2092v.m5048a(this.f3927b)) {
            C2092v vVar = this.f3928c;
            vVar.mo14789b("FileManagerOld", "Caching " + file.getAbsolutePath() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        if (byteArrayOutputStream == null || byteArrayOutputStream.size() <= 0) {
            if (C2092v.m5048a(this.f3927b)) {
                C2092v vVar2 = this.f3928c;
                vVar2.mo14792d("FileManagerOld", "No data for " + file.getAbsolutePath());
            }
            return false;
        } else if (!m4827b(byteArrayOutputStream, file)) {
            if (C2092v.m5048a(this.f3927b)) {
                C2092v vVar3 = this.f3928c;
                vVar3.mo14793e("FileManagerOld", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (!C2092v.m5048a(this.f3927b)) {
            return true;
        } else {
            C2092v vVar4 = this.f3928c;
            vVar4.mo14789b("FileManagerOld", "Caching completed for " + file);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo14641a(File file, String str, List<String> list, C1870e eVar) {
        return m4826a(file, str, list, true, eVar);
    }

    /* renamed from: b */
    public boolean mo14642b(String str, Context context) {
        boolean z;
        synchronized (this.f3929d) {
            File a = mo14637a(str, context);
            z = a != null && a.exists() && !a.isDirectory();
        }
        return z;
    }
}
