package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDislikeClosedListener extends IInterface {

    public static class Default implements IDislikeClosedListener {
        public IBinder asBinder() {
            return null;
        }

        public void onItemClickClosed() throws RemoteException {
        }
    }

    void onItemClickClosed() throws RemoteException;

    public static abstract class Stub extends Binder implements IDislikeClosedListener {
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IDislikeClosedListener");
        }

        public static IDislikeClosedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDislikeClosedListener)) {
                return new C3003a(iBinder);
            }
            return (IDislikeClosedListener) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                onItemClickClosed();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                return true;
            }
        }

        /* renamed from: com.bytedance.sdk.openadsdk.IDislikeClosedListener$Stub$a */
        private static class C3003a implements IDislikeClosedListener {

            /* renamed from: a */
            public static IDislikeClosedListener f6850a;

            /* renamed from: b */
            private IBinder f6851b;

            C3003a(IBinder iBinder) {
                this.f6851b = iBinder;
            }

            public IBinder asBinder() {
                return this.f6851b;
            }

            public void onItemClickClosed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    if (this.f6851b.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onItemClickClosed();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IDislikeClosedListener iDislikeClosedListener) {
            if (C3003a.f6850a != null || iDislikeClosedListener == null) {
                return false;
            }
            C3003a.f6850a = iDislikeClosedListener;
            return true;
        }

        public static IDislikeClosedListener getDefaultImpl() {
            return C3003a.f6850a;
        }
    }
}
