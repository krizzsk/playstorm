package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public abstract class zzbce extends zzaqw implements zzbcf {
    public zzbce() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.android.gms.internal.ads.zzbcj} */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v7, types: [com.google.android.gms.internal.ads.zzbcm] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzbI(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 0
            switch(r3) {
                case 2: goto L_0x0080;
                case 3: goto L_0x005d;
                case 4: goto L_0x0032;
                case 5: goto L_0x0027;
                case 6: goto L_0x0019;
                case 7: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r3 = 0
            return r3
        L_0x0006:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzde r3 = com.google.android.gms.ads.internal.client.zzdd.zzb(r3)
            com.google.android.gms.internal.ads.zzaqx.zzc(r4)
            r2.zzh(r3)
            r5.writeNoException()
            goto L_0x008a
        L_0x0019:
            boolean r3 = com.google.android.gms.internal.ads.zzaqx.zzh(r4)
            com.google.android.gms.internal.ads.zzaqx.zzc(r4)
            r2.zzg(r3)
            r5.writeNoException()
            goto L_0x008a
        L_0x0027:
            com.google.android.gms.ads.internal.client.zzdh r3 = r2.zzf()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzaqx.zzg(r5, r3)
            goto L_0x008a
        L_0x0032:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            java.lang.String r6 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback"
            android.os.IInterface r6 = r0.queryLocalInterface(r6)
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.zzbcm
            if (r1 == 0) goto L_0x004e
            com.google.android.gms.internal.ads.zzbcm r6 = (com.google.android.gms.internal.ads.zzbcm) r6
            goto L_0x0053
        L_0x004e:
            com.google.android.gms.internal.ads.zzbck r6 = new com.google.android.gms.internal.ads.zzbck
            r6.<init>(r0)
        L_0x0053:
            com.google.android.gms.internal.ads.zzaqx.zzc(r4)
            r2.zzi(r3, r6)
            r5.writeNoException()
            goto L_0x008a
        L_0x005d:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0064
            goto L_0x0076
        L_0x0064:
            java.lang.String r6 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbcj
            if (r0 == 0) goto L_0x0071
            com.google.android.gms.internal.ads.zzbcj r6 = (com.google.android.gms.internal.ads.zzbcj) r6
            goto L_0x0076
        L_0x0071:
            com.google.android.gms.internal.ads.zzbcj r6 = new com.google.android.gms.internal.ads.zzbcj
            r6.<init>(r3)
        L_0x0076:
            com.google.android.gms.internal.ads.zzaqx.zzc(r4)
            r2.zzj(r6)
            r5.writeNoException()
            goto L_0x008a
        L_0x0080:
            com.google.android.gms.ads.internal.client.zzbs r3 = r2.zze()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzaqx.zzg(r5, r3)
        L_0x008a:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbce.zzbI(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
