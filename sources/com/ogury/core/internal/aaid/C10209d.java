package com.ogury.core.internal.aaid;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ogury.core.internal.C10219ai;

/* renamed from: com.ogury.core.internal.aaid.d */
/* compiled from: AdvertisingInterface.kt */
public final class C10209d implements IInterface {

    /* renamed from: a */
    private final IBinder f25989a;

    /* renamed from: b */
    private final String f25990b;

    public C10209d(IBinder iBinder, String str) {
        C10219ai.m31036b(iBinder, "binder");
        C10219ai.m31036b(str, "descriptor");
        this.f25989a = iBinder;
        this.f25990b = str;
    }

    /* renamed from: a */
    public final String mo66773a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C10219ai.m31034a((Object) obtain, "Parcel.obtain()");
        Parcel obtain2 = Parcel.obtain();
        C10219ai.m31034a((Object) obtain2, "Parcel.obtain()");
        try {
            obtain.writeInterfaceToken(this.f25990b);
            this.f25989a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            if (readString == null) {
                readString = "";
            }
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f25989a;
    }

    /* renamed from: a */
    public final boolean mo66774a(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C10219ai.m31034a((Object) obtain, "Parcel.obtain()");
        Parcel obtain2 = Parcel.obtain();
        C10219ai.m31034a((Object) obtain2, "Parcel.obtain()");
        try {
            obtain.writeInterfaceToken(this.f25990b);
            boolean z2 = true;
            obtain.writeInt(1);
            this.f25989a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
