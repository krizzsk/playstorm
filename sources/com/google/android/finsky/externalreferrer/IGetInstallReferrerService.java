package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p193a.C5459a;
import com.google.android.p193a.C5460b;
import com.google.android.p193a.C5461c;

public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends C5460b implements IGetInstallReferrerService {

        public static class Proxy extends C5459a implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: c */
            public final Bundle mo31695c(Bundle bundle) throws RemoteException {
                Parcel a = mo26721a();
                C5461c.m16908b(a, bundle);
                Parcel b = mo26723b(a);
                Bundle bundle2 = (Bundle) C5461c.m16907a(b, Bundle.CREATOR);
                b.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m16960b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                return (IGetInstallReferrerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo26724a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle c = mo31695c((Bundle) C5461c.m16907a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C5461c.m16909c(parcel2, c);
            return true;
        }
    }

    /* renamed from: c */
    Bundle mo31695c(Bundle bundle) throws RemoteException;
}
