package com.google.android.p193a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
/* compiled from: BaseProxy */
public class C5459a implements IInterface {

    /* renamed from: a */
    private final IBinder f14453a;

    /* renamed from: b */
    private final String f14454b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected C5459a(IBinder iBinder) {
        this.f14453a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo26721a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14454b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f14453a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel mo26723b(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f14453a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
