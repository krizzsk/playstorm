package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzaa extends zzkz {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzll zzll) {
        super(zzll);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzu = new zzu(this, this.zza, (zzt) null);
        this.zzc.put(num, zzu);
        return zzu;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzu = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzu == null) {
            return false;
        }
        return zzu.zze.get(i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d0, code lost:
        if (r5 != null) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d2, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02da, code lost:
        if (r5 != null) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ff, code lost:
        if (r5 != null) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0302, code lost:
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r13);
        r1 = new androidx.collection.ArrayMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0311, code lost:
        if (r13.isEmpty() == false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0313, code lost:
        r21 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0317, code lost:
        r3 = r13.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0323, code lost:
        if (r3.hasNext() == false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0325, code lost:
        r4 = ((java.lang.Integer) r3.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (com.google.android.gms.internal.measurement.zzgh) r13.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x033f, code lost:
        if (r7 == null) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0345, code lost:
        if (r7.isEmpty() == false) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0349, code lost:
        r17 = r0;
        r0 = r10.zzf.zzu().zzq(r6.zzk(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x035d, code lost:
        if (r0.isEmpty() != false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035f, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzgg) r6.zzbB();
        r5.zzf();
        r5.zzb(r0);
        r20 = r3;
        r0 = r10.zzf.zzu().zzq(r6.zzn(), r7);
        r5.zzh();
        r5.zzd(r0);
        com.google.android.gms.internal.measurement.zzol.zzc();
        r21 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0393, code lost:
        if (r10.zzs.zzf().zzs((java.lang.String) null, com.google.android.gms.measurement.internal.zzen.zzaO) == false) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0395, code lost:
        r0 = new java.util.ArrayList();
        r3 = r6.zzj().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03a6, code lost:
        if (r3.hasNext() == false) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03a8, code lost:
        r8 = (com.google.android.gms.internal.measurement.zzfq) r3.next();
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03be, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r8.zza())) != false) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03c0, code lost:
        r0.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c3, code lost:
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03c7, code lost:
        r5.zze();
        r5.zza(r0);
        r0 = new java.util.ArrayList();
        r3 = r6.zzm().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03de, code lost:
        if (r3.hasNext() == false) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03e0, code lost:
        r6 = (com.google.android.gms.internal.measurement.zzgj) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03f2, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.zzb())) != false) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03f4, code lost:
        r0.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f8, code lost:
        r5.zzg();
        r5.zzc(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ff, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0404, code lost:
        if (r0 >= r6.zza()) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0416, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.zze(r0).zza())) == false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0418, code lost:
        r5.zzi(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x041b, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x041e, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0423, code lost:
        if (r0 >= r6.zzc()) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0435, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.zzi(r0).zzb())) == false) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0437, code lost:
        r5.zzj(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x043a, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x043d, code lost:
        r1.put(java.lang.Integer.valueOf(r4), (com.google.android.gms.internal.measurement.zzgh) r5.zzaE());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x044b, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x044f, code lost:
        r17 = r0;
        r20 = r3;
        r21 = r8;
        r1.put(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0458, code lost:
        r0 = r17;
        r3 = r20;
        r8 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0460, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0798, code lost:
        if (r5 != null) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x079a, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x07aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x07ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x07ad, code lost:
        r29 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x07b4, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07cc, code lost:
        if (r5 == null) goto L_0x07cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x094b, code lost:
        if (r13 != null) goto L_0x094d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x094d, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0975, code lost:
        if (r13 == null) goto L_0x0978;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0a89, code lost:
        if (r7.zzj() == false) goto L_0x0a94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0a8b, code lost:
        r7 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0a94, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0a95, code lost:
        r0.zzc("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0151, code lost:
        if (r5 != null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0153, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0177, code lost:
        if (r5 != null) goto L_0x0153;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x061b  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x07aa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:267:0x0706] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x07d5  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0882  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0980  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0ad2  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0b66  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b6 A[Catch:{ SQLiteException -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c6 A[SYNTHETIC, Splitter:B:70:0x01c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zza(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            r64 = this;
            r10 = r64
            java.lang.String r11 = "current_results"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r65)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r66)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r67)
            r0 = r65
            r10.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.zzb = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r10.zzc = r0
            r0 = r68
            r10.zzd = r0
            r0 = r69
            r10.zze = r0
            java.util.Iterator r0 = r66.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzfs r1 = (com.google.android.gms.internal.measurement.zzfs) r1
            java.lang.String r1 = r1.zzh()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = r13
            goto L_0x0048
        L_0x0047:
            r1 = r12
        L_0x0048:
            com.google.android.gms.internal.measurement.zzoi.zzc()
            com.google.android.gms.measurement.internal.zzgk r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzem r3 = com.google.android.gms.measurement.internal.zzen.zzX
            boolean r14 = r0.zzs(r2, r3)
            com.google.android.gms.internal.measurement.zzoi.zzc()
            com.google.android.gms.measurement.internal.zzgk r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzem r3 = com.google.android.gms.measurement.internal.zzen.zzW
            boolean r15 = r0.zzs(r2, r3)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.measurement.internal.zzll r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            r2.zzW()
            r2.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.zzh()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009b }
            r5[r12] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.zzc(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r15 == 0) goto L_0x0180
            if (r14 == 0) goto L_0x0180
            com.google.android.gms.measurement.internal.zzll r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.zzh()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x015d, all -> 0x015b }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x015d, all -> 0x015b }
            r0[r12] = r3     // Catch:{ SQLiteException -> 0x015d, all -> 0x015b }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x015d, all -> 0x015b }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0159 }
            if (r0 == 0) goto L_0x014d
        L_0x00f1:
            byte[] r0 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0159 }
            com.google.android.gms.internal.measurement.zzei r13 = com.google.android.gms.internal.measurement.zzej.zzc()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzln.zzl(r13, r0)     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzei r0 = (com.google.android.gms.internal.measurement.zzei) r0     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzej r0 = (com.google.android.gms.internal.measurement.zzej) r0     // Catch:{ IOException -> 0x012b }
            boolean r13 = r0.zzo()     // Catch:{ SQLiteException -> 0x0159 }
            if (r13 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r13 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x0159 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0159 }
            java.lang.Object r16 = r4.get(r13)     // Catch:{ SQLiteException -> 0x0159 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0159 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0159 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0159 }
            r4.put(r13, r12)     // Catch:{ SQLiteException -> 0x0159 }
            goto L_0x0127
        L_0x0125:
            r12 = r16
        L_0x0127:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0159 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r12 = r2.zzs     // Catch:{ SQLiteException -> 0x0159 }
            com.google.android.gms.measurement.internal.zzfa r12 = r12.zzay()     // Catch:{ SQLiteException -> 0x0159 }
            com.google.android.gms.measurement.internal.zzey r12 = r12.zzd()     // Catch:{ SQLiteException -> 0x0159 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ SQLiteException -> 0x0159 }
            r12.zzc(r9, r13, r0)     // Catch:{ SQLiteException -> 0x0159 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0159 }
            if (r0 != 0) goto L_0x014a
            if (r5 == 0) goto L_0x0148
            r5.close()
        L_0x0148:
            r12 = r4
            goto L_0x0181
        L_0x014a:
            r12 = 0
            r13 = 1
            goto L_0x00f1
        L_0x014d:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0159 }
            if (r5 == 0) goto L_0x0180
        L_0x0153:
            r5.close()
            goto L_0x0180
        L_0x0157:
            r0 = move-exception
            goto L_0x017a
        L_0x0159:
            r0 = move-exception
            goto L_0x0162
        L_0x015b:
            r0 = move-exception
            goto L_0x015f
        L_0x015d:
            r0 = move-exception
            goto L_0x0161
        L_0x015f:
            r5 = 0
            goto L_0x017a
        L_0x0161:
            r5 = 0
        L_0x0162:
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs     // Catch:{ all -> 0x0157 }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x0157 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0157 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ all -> 0x0157 }
            r2.zzc(r8, r3, r0)     // Catch:{ all -> 0x0157 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0157 }
            if (r5 == 0) goto L_0x0180
            goto L_0x0153
        L_0x017a:
            if (r5 == 0) goto L_0x017f
            r5.close()
        L_0x017f:
            throw r0
        L_0x0180:
            r12 = r0
        L_0x0181:
            com.google.android.gms.measurement.internal.zzll r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            r2.zzW()
            r2.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.zzh()
            java.lang.String[] r18 = new java.lang.String[]{r6, r11}     // Catch:{ SQLiteException -> 0x0232, all -> 0x0230 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0232, all -> 0x0230 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x0232, all -> 0x0230 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0232, all -> 0x0230 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x022a }
            if (r0 != 0) goto L_0x01c6
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x022a }
            if (r4 == 0) goto L_0x01bf
            r4.close()
        L_0x01bf:
            r13 = r0
            r18 = r6
            r19 = r7
            goto L_0x0259
        L_0x01c6:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap     // Catch:{ SQLiteException -> 0x022a }
            r5.<init>()     // Catch:{ SQLiteException -> 0x022a }
        L_0x01cb:
            r13 = 0
            int r16 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x022a }
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x022a }
            com.google.android.gms.internal.measurement.zzgg r13 = com.google.android.gms.internal.measurement.zzgh.zzf()     // Catch:{ IOException -> 0x01f3 }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzln.zzl(r13, r0)     // Catch:{ IOException -> 0x01f3 }
            com.google.android.gms.internal.measurement.zzgg r0 = (com.google.android.gms.internal.measurement.zzgg) r0     // Catch:{ IOException -> 0x01f3 }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ IOException -> 0x01f3 }
            com.google.android.gms.internal.measurement.zzgh r0 = (com.google.android.gms.internal.measurement.zzgh) r0     // Catch:{ IOException -> 0x01f3 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x022a }
            r5.put(r13, r0)     // Catch:{ SQLiteException -> 0x022a }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0211
        L_0x01f3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r13 = r2.zzs     // Catch:{ SQLiteException -> 0x022a }
            com.google.android.gms.measurement.internal.zzfa r13 = r13.zzay()     // Catch:{ SQLiteException -> 0x022a }
            com.google.android.gms.measurement.internal.zzey r13 = r13.zzd()     // Catch:{ SQLiteException -> 0x022a }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ SQLiteException -> 0x0228 }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0226 }
            r13.zzd(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x0226 }
        L_0x0211:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0226 }
            if (r0 != 0) goto L_0x021f
            if (r4 == 0) goto L_0x021c
            r4.close()
        L_0x021c:
            r13 = r17
            goto L_0x0259
        L_0x021f:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01cb
        L_0x0226:
            r0 = move-exception
            goto L_0x023c
        L_0x0228:
            r0 = move-exception
            goto L_0x022d
        L_0x022a:
            r0 = move-exception
            r18 = r6
        L_0x022d:
            r19 = r7
            goto L_0x023c
        L_0x0230:
            r0 = move-exception
            goto L_0x0238
        L_0x0232:
            r0 = move-exception
            r18 = r6
            r19 = r7
            goto L_0x023b
        L_0x0238:
            r5 = 0
            goto L_0x0b64
        L_0x023b:
            r4 = 0
        L_0x023c:
            com.google.android.gms.measurement.internal.zzgk r2 = r2.zzs     // Catch:{ all -> 0x0b62 }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x0b62 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x0b62 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ all -> 0x0b62 }
            r2.zzc(r5, r3, r0)     // Catch:{ all -> 0x0b62 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0b62 }
            if (r4 == 0) goto L_0x0258
            r4.close()
        L_0x0258:
            r13 = r0
        L_0x0259:
            boolean r0 = r13.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x0268
            r12 = r8
            r13 = r9
            r28 = r18
            r29 = r19
            goto L_0x060f
        L_0x0268:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x0468
            java.lang.String r1 = r10.zza
            com.google.android.gms.measurement.internal.zzll r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r3 = r0.zzi()
            java.lang.String r4 = r10.zza
            r3.zzW()
            r3.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r3.zzh()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02e6, all -> 0x02e2 }
            r16 = 0
            r6[r16] = r4     // Catch:{ SQLiteException -> 0x02e6, all -> 0x02e2 }
            r16 = 1
            r6[r16] = r4     // Catch:{ SQLiteException -> 0x02e6, all -> 0x02e2 }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02e6, all -> 0x02e2 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02e0 }
            if (r6 == 0) goto L_0x02d6
        L_0x02a5:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02e0 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02e0 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02e0 }
            if (r7 != 0) goto L_0x02be
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02e0 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02e0 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02e0 }
        L_0x02be:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02e0 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02e0 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02e0 }
            if (r6 != 0) goto L_0x02a5
            if (r5 == 0) goto L_0x0302
        L_0x02d2:
            r5.close()
            goto L_0x0302
        L_0x02d6:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02e0 }
            if (r5 == 0) goto L_0x0302
            goto L_0x02d2
        L_0x02dd:
            r0 = move-exception
            goto L_0x0462
        L_0x02e0:
            r0 = move-exception
            goto L_0x02e8
        L_0x02e2:
            r0 = move-exception
            r5 = 0
            goto L_0x0462
        L_0x02e6:
            r0 = move-exception
            r5 = 0
        L_0x02e8:
            com.google.android.gms.measurement.internal.zzgk r3 = r3.zzs     // Catch:{ all -> 0x02dd }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x02dd }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x02dd }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfa.zzn(r4)     // Catch:{ all -> 0x02dd }
            r3.zzc(r6, r4, r0)     // Catch:{ all -> 0x02dd }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x02dd }
            if (r5 == 0) goto L_0x0302
            goto L_0x02d2
        L_0x0302:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L_0x0317
        L_0x0313:
            r21 = r8
            goto L_0x0460
        L_0x0317:
            java.util.Set r3 = r13.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x031f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0313
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzgh r6 = (com.google.android.gms.internal.measurement.zzgh) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x044f
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0349
            goto L_0x044f
        L_0x0349:
            com.google.android.gms.measurement.internal.zzll r5 = r10.zzf
            com.google.android.gms.measurement.internal.zzln r5 = r5.zzu()
            r17 = r0
            java.util.List r0 = r6.zzk()
            java.util.List r0 = r5.zzq(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x044b
            com.google.android.gms.internal.measurement.zzjy r5 = r6.zzbB()
            com.google.android.gms.internal.measurement.zzgg r5 = (com.google.android.gms.internal.measurement.zzgg) r5
            r5.zzf()
            r5.zzb(r0)
            com.google.android.gms.measurement.internal.zzll r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzln r0 = r0.zzu()
            r20 = r3
            java.util.List r3 = r6.zzn()
            java.util.List r0 = r0.zzq(r3, r7)
            r5.zzh()
            r5.zzd(r0)
            com.google.android.gms.internal.measurement.zzol.zzc()
            com.google.android.gms.measurement.internal.zzgk r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzem r3 = com.google.android.gms.measurement.internal.zzen.zzaO
            r21 = r8
            r8 = 0
            boolean r0 = r0.zzs(r8, r3)
            if (r0 == 0) goto L_0x03ff
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r3 = r6.zzj()
            java.util.Iterator r3 = r3.iterator()
        L_0x03a2:
            boolean r22 = r3.hasNext()
            if (r22 == 0) goto L_0x03c7
            java.lang.Object r22 = r3.next()
            r8 = r22
            com.google.android.gms.internal.measurement.zzfq r8 = (com.google.android.gms.internal.measurement.zzfq) r8
            int r22 = r8.zza()
            r23 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x03c3
            r0.add(r8)
        L_0x03c3:
            r3 = r23
            r8 = 0
            goto L_0x03a2
        L_0x03c7:
            r5.zze()
            r5.zza(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r3 = r6.zzm()
            java.util.Iterator r3 = r3.iterator()
        L_0x03da:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x03f8
            java.lang.Object r6 = r3.next()
            com.google.android.gms.internal.measurement.zzgj r6 = (com.google.android.gms.internal.measurement.zzgj) r6
            int r8 = r6.zzb()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L_0x03da
            r0.add(r6)
            goto L_0x03da
        L_0x03f8:
            r5.zzg()
            r5.zzc(r0)
            goto L_0x043d
        L_0x03ff:
            r0 = 0
        L_0x0400:
            int r3 = r6.zza()
            if (r0 >= r3) goto L_0x041e
            com.google.android.gms.internal.measurement.zzfq r3 = r6.zze(r0)
            int r3 = r3.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x041b
            r5.zzi(r0)
        L_0x041b:
            int r0 = r0 + 1
            goto L_0x0400
        L_0x041e:
            r0 = 0
        L_0x041f:
            int r3 = r6.zzc()
            if (r0 >= r3) goto L_0x043d
            com.google.android.gms.internal.measurement.zzgj r3 = r6.zzi(r0)
            int r3 = r3.zzb()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x043a
            r5.zzj(r0)
        L_0x043a:
            int r0 = r0 + 1
            goto L_0x041f
        L_0x043d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.measurement.zzkc r3 = r5.zzaE()
            com.google.android.gms.internal.measurement.zzgh r3 = (com.google.android.gms.internal.measurement.zzgh) r3
            r1.put(r0, r3)
            goto L_0x0458
        L_0x044b:
            r0 = r17
            goto L_0x031f
        L_0x044f:
            r17 = r0
            r20 = r3
            r21 = r8
            r1.put(r5, r6)
        L_0x0458:
            r0 = r17
            r3 = r20
            r8 = r21
            goto L_0x031f
        L_0x0460:
            r0 = r1
            goto L_0x046b
        L_0x0462:
            if (r5 == 0) goto L_0x0467
            r5.close()
        L_0x0467:
            throw r0
        L_0x0468:
            r21 = r8
            r0 = r13
        L_0x046b:
            java.util.Iterator r17 = r2.iterator()
        L_0x046f:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0608
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzgh r1 = (com.google.android.gms.internal.measurement.zzgh) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            if (r1 == 0) goto L_0x04d7
            int r2 = r1.zza()
            if (r2 != 0) goto L_0x04a1
            goto L_0x04d7
        L_0x04a1:
            java.util.List r2 = r1.zzj()
            java.util.Iterator r2 = r2.iterator()
        L_0x04a9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d7
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfq r3 = (com.google.android.gms.internal.measurement.zzfq) r3
            boolean r4 = r3.zzh()
            if (r4 == 0) goto L_0x04a9
            int r4 = r3.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.zzg()
            if (r8 == 0) goto L_0x04d2
            long r22 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r22)
            goto L_0x04d3
        L_0x04d2:
            r3 = 0
        L_0x04d3:
            r7.put(r4, r3)
            goto L_0x04a9
        L_0x04d7:
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            if (r1 == 0) goto L_0x0523
            int r2 = r1.zzc()
            if (r2 != 0) goto L_0x04e5
            goto L_0x0523
        L_0x04e5:
            java.util.List r2 = r1.zzm()
            java.util.Iterator r2 = r2.iterator()
        L_0x04ed:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0523
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzgj r3 = (com.google.android.gms.internal.measurement.zzgj) r3
            boolean r4 = r3.zzi()
            if (r4 == 0) goto L_0x04ed
            int r4 = r3.zza()
            if (r4 <= 0) goto L_0x04ed
            int r4 = r3.zzb()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r22 = r3.zza()
            r23 = r0
            int r0 = r22 + -1
            long r24 = r3.zzc(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            r8.put(r4, r0)
            r0 = r23
            goto L_0x04ed
        L_0x0523:
            r23 = r0
            if (r1 == 0) goto L_0x0572
            r0 = 0
        L_0x0528:
            int r2 = r1.zzd()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x0572
            java.util.List r2 = r1.zzn()
            boolean r2 = com.google.android.gms.measurement.internal.zzln.zzv(r2, r0)
            if (r2 == 0) goto L_0x0564
            com.google.android.gms.measurement.internal.zzgk r2 = r10.zzs
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzj()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r22 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.zzc(r9, r3, r4)
            r6.set(r0)
            java.util.List r2 = r1.zzk()
            boolean r2 = com.google.android.gms.measurement.internal.zzln.zzv(r2, r0)
            if (r2 == 0) goto L_0x0566
            r5.set(r0)
            goto L_0x056d
        L_0x0564:
            r22 = r9
        L_0x0566:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x056d:
            int r0 = r0 + 1
            r9 = r22
            goto L_0x0528
        L_0x0572:
            r22 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r13.get(r0)
            r4 = r1
            com.google.android.gms.internal.measurement.zzgh r4 = (com.google.android.gms.internal.measurement.zzgh) r4
            if (r15 == 0) goto L_0x05df
            if (r14 == 0) goto L_0x05df
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x05df
            java.lang.Long r1 = r10.zze
            if (r1 == 0) goto L_0x05df
            java.lang.Long r1 = r10.zzd
            if (r1 != 0) goto L_0x0594
            goto L_0x05df
        L_0x0594:
            java.util.Iterator r0 = r0.iterator()
        L_0x0598:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05df
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzej r1 = (com.google.android.gms.internal.measurement.zzej) r1
            int r2 = r1.zzb()
            java.lang.Long r3 = r10.zze
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.zzm()
            if (r1 == 0) goto L_0x05c0
            java.lang.Long r1 = r10.zzd
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x05c0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x05d1
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x05d1:
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L_0x0598
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r8.put(r1, r2)
            goto L_0x0598
        L_0x05df:
            com.google.android.gms.measurement.internal.zzu r0 = new com.google.android.gms.measurement.internal.zzu
            java.lang.String r3 = r10.zza
            r9 = 0
            r1 = r0
            r2 = r64
            r28 = r18
            r29 = r19
            r16 = r12
            r12 = r21
            r65 = r13
            r13 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r10.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r9 = r13
            r12 = r16
            r0 = r23
            r13 = r65
            goto L_0x046f
        L_0x0608:
            r13 = r9
            r28 = r18
            r29 = r19
            r12 = r21
        L_0x060f:
            boolean r0 = r66.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x061b
        L_0x0617:
            r24 = r11
            goto L_0x0878
        L_0x061b:
            com.google.android.gms.measurement.internal.zzw r2 = new com.google.android.gms.measurement.internal.zzw
            r3 = 0
            r2.<init>(r10, r3)
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            java.util.Iterator r5 = r66.iterator()
        L_0x062a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r5.next()
            com.google.android.gms.internal.measurement.zzfs r0 = (com.google.android.gms.internal.measurement.zzfs) r0
            java.lang.String r6 = r10.zza
            com.google.android.gms.internal.measurement.zzfs r6 = r2.zza(r6, r0)
            if (r6 == 0) goto L_0x062a
            com.google.android.gms.measurement.internal.zzll r7 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r7 = r7.zzi()
            java.lang.String r8 = r10.zza
            java.lang.String r9 = r6.zzh()
            java.lang.String r14 = r0.zzh()
            com.google.android.gms.measurement.internal.zzas r14 = r7.zzn(r8, r14)
            if (r14 != 0) goto L_0x0693
            com.google.android.gms.measurement.internal.zzgk r14 = r7.zzs
            com.google.android.gms.measurement.internal.zzfa r14 = r14.zzay()
            com.google.android.gms.measurement.internal.zzey r14 = r14.zzk()
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzfa.zzn(r8)
            com.google.android.gms.measurement.internal.zzgk r7 = r7.zzs
            com.google.android.gms.measurement.internal.zzev r7 = r7.zzj()
            java.lang.String r7 = r7.zzd(r9)
            java.lang.String r9 = "Event aggregate wasn't created during raw event logging. appId, event"
            r14.zzc(r9, r15, r7)
            com.google.android.gms.measurement.internal.zzas r7 = new com.google.android.gms.measurement.internal.zzas
            r30 = r7
            java.lang.String r32 = r0.zzh()
            r33 = 1
            r35 = 1
            r37 = 1
            long r39 = r0.zzd()
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r31 = r8
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)
            goto L_0x06c8
        L_0x0693:
            com.google.android.gms.measurement.internal.zzas r7 = new com.google.android.gms.measurement.internal.zzas
            r47 = r7
            java.lang.String r0 = r14.zza
            r48 = r0
            java.lang.String r0 = r14.zzb
            r49 = r0
            long r8 = r14.zzc
            r15 = 1
            long r50 = r8 + r15
            long r8 = r14.zzd
            long r52 = r8 + r15
            long r8 = r14.zze
            long r54 = r8 + r15
            long r8 = r14.zzf
            r56 = r8
            long r8 = r14.zzg
            r58 = r8
            java.lang.Long r0 = r14.zzh
            r60 = r0
            java.lang.Long r0 = r14.zzi
            r61 = r0
            java.lang.Long r0 = r14.zzj
            r62 = r0
            java.lang.Boolean r0 = r14.zzk
            r63 = r0
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r60, r61, r62, r63)
        L_0x06c8:
            com.google.android.gms.measurement.internal.zzll r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzi()
            r0.zzE(r7)
            long r8 = r7.zzc
            java.lang.String r14 = r6.zzh()
            java.lang.Object r0 = r4.get(r14)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x07d9
            com.google.android.gms.measurement.internal.zzll r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r15 = r0.zzi()
            java.lang.String r3 = r10.zza
            r15.zzW()
            r15.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            r65 = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r15.zzh()
            r66 = r5
            r24 = r11
            r11 = r28
            r5 = r29
            java.lang.String[] r18 = new java.lang.String[]{r11, r5}     // Catch:{ SQLiteException -> 0x07ac, all -> 0x07aa }
            r29 = r5
            r5 = 2
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x07a8, all -> 0x07aa }
            r17 = 0
            r0[r17] = r3     // Catch:{ SQLiteException -> 0x07a8, all -> 0x07aa }
            r17 = 1
            r0[r17] = r14     // Catch:{ SQLiteException -> 0x07a8, all -> 0x07aa }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=? AND event_name=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x07a8, all -> 0x07aa }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x07a2 }
            if (r0 == 0) goto L_0x0790
            r28 = r11
        L_0x072f:
            r11 = 1
            byte[] r0 = r5.getBlob(r11)     // Catch:{ SQLiteException -> 0x078c }
            com.google.android.gms.internal.measurement.zzei r11 = com.google.android.gms.internal.measurement.zzej.zzc()     // Catch:{ IOException -> 0x0768 }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzln.zzl(r11, r0)     // Catch:{ IOException -> 0x0768 }
            com.google.android.gms.internal.measurement.zzei r0 = (com.google.android.gms.internal.measurement.zzei) r0     // Catch:{ IOException -> 0x0768 }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ IOException -> 0x0768 }
            com.google.android.gms.internal.measurement.zzej r0 = (com.google.android.gms.internal.measurement.zzej) r0     // Catch:{ IOException -> 0x0768 }
            r11 = 0
            int r16 = r5.getInt(r11)     // Catch:{ SQLiteException -> 0x078c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x078c }
            java.lang.Object r16 = r2.get(r11)     // Catch:{ SQLiteException -> 0x078c }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x078c }
            if (r16 != 0) goto L_0x0760
            r22 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x079e }
            r7.<init>()     // Catch:{ SQLiteException -> 0x079e }
            r2.put(r11, r7)     // Catch:{ SQLiteException -> 0x079e }
            goto L_0x0764
        L_0x0760:
            r22 = r7
            r7 = r16
        L_0x0764:
            r7.add(r0)     // Catch:{ SQLiteException -> 0x079e }
            goto L_0x077c
        L_0x0768:
            r0 = move-exception
            r22 = r7
            com.google.android.gms.measurement.internal.zzgk r7 = r15.zzs     // Catch:{ SQLiteException -> 0x079e }
            com.google.android.gms.measurement.internal.zzfa r7 = r7.zzay()     // Catch:{ SQLiteException -> 0x079e }
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzd()     // Catch:{ SQLiteException -> 0x079e }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ SQLiteException -> 0x079e }
            r7.zzc(r13, r11, r0)     // Catch:{ SQLiteException -> 0x079e }
        L_0x077c:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x079e }
            if (r0 != 0) goto L_0x0789
            if (r5 == 0) goto L_0x0787
            r5.close()
        L_0x0787:
            r0 = r2
            goto L_0x07cf
        L_0x0789:
            r7 = r22
            goto L_0x072f
        L_0x078c:
            r0 = move-exception
            r22 = r7
            goto L_0x07b7
        L_0x0790:
            r22 = r7
            r28 = r11
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x079e }
            if (r5 == 0) goto L_0x07cf
        L_0x079a:
            r5.close()
            goto L_0x07cf
        L_0x079e:
            r0 = move-exception
            goto L_0x07b7
        L_0x07a0:
            r0 = move-exception
            goto L_0x07d3
        L_0x07a2:
            r0 = move-exception
            r22 = r7
            r28 = r11
            goto L_0x07b7
        L_0x07a8:
            r0 = move-exception
            goto L_0x07af
        L_0x07aa:
            r0 = move-exception
            goto L_0x07b4
        L_0x07ac:
            r0 = move-exception
            r29 = r5
        L_0x07af:
            r22 = r7
            r28 = r11
            goto L_0x07b6
        L_0x07b4:
            r5 = 0
            goto L_0x07d3
        L_0x07b6:
            r5 = 0
        L_0x07b7:
            com.google.android.gms.measurement.internal.zzgk r2 = r15.zzs     // Catch:{ all -> 0x07a0 }
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzay()     // Catch:{ all -> 0x07a0 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzd()     // Catch:{ all -> 0x07a0 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfa.zzn(r3)     // Catch:{ all -> 0x07a0 }
            r2.zzc(r12, r3, r0)     // Catch:{ all -> 0x07a0 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x07a0 }
            if (r5 == 0) goto L_0x07cf
            goto L_0x079a
        L_0x07cf:
            r4.put(r14, r0)
            goto L_0x07e1
        L_0x07d3:
            if (r5 == 0) goto L_0x07d8
            r5.close()
        L_0x07d8:
            throw r0
        L_0x07d9:
            r65 = r2
            r66 = r5
            r22 = r7
            r24 = r11
        L_0x07e1:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x07e9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x086f
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Set r5 = r10.zzb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L_0x0813
            com.google.android.gms.measurement.internal.zzgk r3 = r10.zzs
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzj()
            r3.zzb(r1, r7)
            goto L_0x07e9
        L_0x0813:
            java.lang.Object r5 = r0.get(r7)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
            r7 = 1
        L_0x081e:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0862
            java.lang.Object r7 = r5.next()
            com.google.android.gms.internal.measurement.zzej r7 = (com.google.android.gms.internal.measurement.zzej) r7
            com.google.android.gms.measurement.internal.zzx r11 = new com.google.android.gms.measurement.internal.zzx
            java.lang.String r14 = r10.zza
            r11.<init>(r10, r14, r3, r7)
            java.lang.Long r15 = r10.zzd
            java.lang.Long r14 = r10.zze
            int r7 = r7.zzb()
            boolean r21 = r10.zzf(r3, r7)
            r7 = r14
            r14 = r11
            r16 = r7
            r17 = r6
            r18 = r8
            r20 = r22
            boolean r7 = r14.zzd(r15, r16, r17, r18, r20, r21)
            if (r7 == 0) goto L_0x0859
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.measurement.internal.zzu r14 = r10.zzd(r14)
            r14.zzc(r11)
            goto L_0x081e
        L_0x0859:
            java.util.Set r5 = r10.zzb
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r5.add(r11)
        L_0x0862:
            if (r7 != 0) goto L_0x07e9
            java.util.Set r5 = r10.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.add(r3)
            goto L_0x07e9
        L_0x086f:
            r2 = r65
            r5 = r66
            r11 = r24
            r3 = 0
            goto L_0x062a
        L_0x0878:
            boolean r0 = r67.isEmpty()
            if (r0 == 0) goto L_0x0882
        L_0x087e:
            r11 = r28
            goto L_0x0ab8
        L_0x0882:
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.util.Iterator r3 = r67.iterator()
        L_0x088b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x087e
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.google.android.gms.internal.measurement.zzgl r4 = (com.google.android.gms.internal.measurement.zzgl) r4
            java.lang.String r5 = r4.zzf()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0984
            com.google.android.gms.measurement.internal.zzll r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r6 = r0.zzi()
            java.lang.String r7 = r10.zza
            r6.zzW()
            r6.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r13 = r6.zzh()
            r11 = r28
            r9 = r29
            java.lang.String[] r15 = new java.lang.String[]{r11, r9}     // Catch:{ SQLiteException -> 0x0959, all -> 0x0957 }
            r14 = 2
            java.lang.String[] r0 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0959, all -> 0x0957 }
            r14 = 0
            r0[r14] = r7     // Catch:{ SQLiteException -> 0x0959, all -> 0x0957 }
            r14 = 1
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x0959, all -> 0x0957 }
            java.lang.String r14 = "property_filters"
            java.lang.String r16 = "app_id=? AND property_name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x0959, all -> 0x0957 }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0953 }
            if (r0 == 0) goto L_0x0945
        L_0x08e8:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x0953 }
            com.google.android.gms.internal.measurement.zzer r15 = com.google.android.gms.internal.measurement.zzes.zzc()     // Catch:{ IOException -> 0x091f }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzln.zzl(r15, r0)     // Catch:{ IOException -> 0x091f }
            com.google.android.gms.internal.measurement.zzer r0 = (com.google.android.gms.internal.measurement.zzer) r0     // Catch:{ IOException -> 0x091f }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ IOException -> 0x091f }
            com.google.android.gms.internal.measurement.zzes r0 = (com.google.android.gms.internal.measurement.zzes) r0     // Catch:{ IOException -> 0x091f }
            r15 = 0
            int r16 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x0953 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0953 }
            java.lang.Object r16 = r8.get(r14)     // Catch:{ SQLiteException -> 0x0953 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0953 }
            if (r16 != 0) goto L_0x0917
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0953 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x0953 }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x0953 }
            goto L_0x0919
        L_0x0917:
            r15 = r16
        L_0x0919:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x0953 }
            r65 = r3
            goto L_0x0935
        L_0x091f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgk r14 = r6.zzs     // Catch:{ SQLiteException -> 0x0953 }
            com.google.android.gms.measurement.internal.zzfa r14 = r14.zzay()     // Catch:{ SQLiteException -> 0x0953 }
            com.google.android.gms.measurement.internal.zzey r14 = r14.zzd()     // Catch:{ SQLiteException -> 0x0953 }
            java.lang.String r15 = "Failed to merge filter"
            r65 = r3
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfa.zzn(r7)     // Catch:{ SQLiteException -> 0x0951 }
            r14.zzc(r15, r3, r0)     // Catch:{ SQLiteException -> 0x0951 }
        L_0x0935:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0951 }
            if (r0 != 0) goto L_0x0942
            if (r13 == 0) goto L_0x0940
            r13.close()
        L_0x0940:
            r0 = r8
            goto L_0x0978
        L_0x0942:
            r3 = r65
            goto L_0x08e8
        L_0x0945:
            r65 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0951 }
            if (r13 == 0) goto L_0x0978
        L_0x094d:
            r13.close()
            goto L_0x0978
        L_0x0951:
            r0 = move-exception
            goto L_0x0960
        L_0x0953:
            r0 = move-exception
            r65 = r3
            goto L_0x0960
        L_0x0957:
            r0 = move-exception
            goto L_0x095d
        L_0x0959:
            r0 = move-exception
            r65 = r3
            goto L_0x095f
        L_0x095d:
            r5 = 0
            goto L_0x097e
        L_0x095f:
            r13 = 0
        L_0x0960:
            com.google.android.gms.measurement.internal.zzgk r3 = r6.zzs     // Catch:{ all -> 0x097c }
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()     // Catch:{ all -> 0x097c }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()     // Catch:{ all -> 0x097c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfa.zzn(r7)     // Catch:{ all -> 0x097c }
            r3.zzc(r12, r6, r0)     // Catch:{ all -> 0x097c }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x097c }
            if (r13 == 0) goto L_0x0978
            goto L_0x094d
        L_0x0978:
            r2.put(r5, r0)
            goto L_0x098a
        L_0x097c:
            r0 = move-exception
            r5 = r13
        L_0x097e:
            if (r5 == 0) goto L_0x0983
            r5.close()
        L_0x0983:
            throw r0
        L_0x0984:
            r65 = r3
            r11 = r28
            r9 = r29
        L_0x098a:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0992:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0ab0
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set r6 = r10.zzb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x09bd
            com.google.android.gms.measurement.internal.zzgk r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzj()
            r0.zzb(r1, r7)
            goto L_0x0ab0
        L_0x09bd:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x09c8:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a9f
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.zzes r7 = (com.google.android.gms.internal.measurement.zzes) r7
            com.google.android.gms.measurement.internal.zzgk r8 = r10.zzs
            com.google.android.gms.measurement.internal.zzfa r8 = r8.zzay()
            java.lang.String r8 = r8.zzq()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x0a32
            com.google.android.gms.measurement.internal.zzgk r8 = r10.zzs
            com.google.android.gms.measurement.internal.zzfa r8 = r8.zzay()
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzj()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.zzj()
            if (r15 == 0) goto L_0x0a02
            int r15 = r7.zza()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0a03
        L_0x0a02:
            r15 = 0
        L_0x0a03:
            com.google.android.gms.measurement.internal.zzgk r13 = r10.zzs
            com.google.android.gms.measurement.internal.zzev r13 = r13.zzj()
            r66 = r0
            java.lang.String r0 = r7.zze()
            java.lang.String r0 = r13.zzf(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.zzd(r13, r14, r15, r0)
            com.google.android.gms.measurement.internal.zzgk r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzll r8 = r10.zzf
            com.google.android.gms.measurement.internal.zzln r8 = r8.zzu()
            java.lang.String r8 = r8.zzp(r7)
            java.lang.String r13 = "Filter definition"
            r0.zzb(r13, r8)
            goto L_0x0a34
        L_0x0a32:
            r66 = r0
        L_0x0a34:
            boolean r0 = r7.zzj()
            if (r0 == 0) goto L_0x0a75
            int r0 = r7.zza()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x0a43
            goto L_0x0a75
        L_0x0a43:
            com.google.android.gms.measurement.internal.zzz r0 = new com.google.android.gms.measurement.internal.zzz
            java.lang.String r8 = r10.zza
            r0.<init>(r10, r8, r5, r7)
            java.lang.Long r8 = r10.zzd
            java.lang.Long r13 = r10.zze
            int r7 = r7.zza()
            boolean r7 = r10.zzf(r5, r7)
            boolean r7 = r0.zzd(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x0a6b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.measurement.internal.zzu r8 = r10.zzd(r8)
            r8.zzc(r0)
            r0 = r66
            goto L_0x09c8
        L_0x0a6b:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0aa1
        L_0x0a75:
            com.google.android.gms.measurement.internal.zzgk r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzk()
            java.lang.String r6 = r10.zza
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfa.zzn(r6)
            boolean r8 = r7.zzj()
            if (r8 == 0) goto L_0x0a94
            int r7 = r7.zza()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a95
        L_0x0a94:
            r7 = 0
        L_0x0a95:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.zzc(r8, r6, r7)
            goto L_0x0aa3
        L_0x0a9f:
            r66 = r0
        L_0x0aa1:
            if (r7 != 0) goto L_0x0aac
        L_0x0aa3:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0aac:
            r0 = r66
            goto L_0x0992
        L_0x0ab0:
            r3 = r65
            r29 = r9
            r28 = r11
            goto L_0x088b
        L_0x0ab8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r10.zzc
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r10.zzb
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0acc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b61
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r10.zzc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.zzu r3 = (com.google.android.gms.measurement.internal.zzu) r3
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.measurement.zzfo r0 = r3.zza(r0)
            r1.add(r0)
            com.google.android.gms.measurement.internal.zzll r3 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r3 = r3.zzi()
            java.lang.String r5 = r10.zza
            com.google.android.gms.internal.measurement.zzgh r0 = r0.zzd()
            r3.zzW()
            r3.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            byte[] r0 = r0.zzby()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r24
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.zzh()     // Catch:{ SQLiteException -> 0x0b48 }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r6 = r0.insertWithOnConflict(r7, r9, r6, r8)     // Catch:{ SQLiteException -> 0x0b46 }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0b5d
            com.google.android.gms.measurement.internal.zzgk r0 = r3.zzs     // Catch:{ SQLiteException -> 0x0b46 }
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x0b46 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzd()     // Catch:{ SQLiteException -> 0x0b46 }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfa.zzn(r5)     // Catch:{ SQLiteException -> 0x0b46 }
            r0.zzb(r6, r7)     // Catch:{ SQLiteException -> 0x0b46 }
            goto L_0x0b5d
        L_0x0b46:
            r0 = move-exception
            goto L_0x0b4a
        L_0x0b48:
            r0 = move-exception
            r9 = 0
        L_0x0b4a:
            com.google.android.gms.measurement.internal.zzgk r3 = r3.zzs
            com.google.android.gms.measurement.internal.zzfa r3 = r3.zzay()
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzd()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfa.zzn(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.zzc(r6, r5, r0)
        L_0x0b5d:
            r24 = r4
            goto L_0x0acc
        L_0x0b61:
            return r1
        L_0x0b62:
            r0 = move-exception
            r5 = r4
        L_0x0b64:
            if (r5 == 0) goto L_0x0b69
            r5.close()
        L_0x0b69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    /* access modifiers changed from: protected */
    public final boolean zzb() {
        return false;
    }
}
