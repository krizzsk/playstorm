package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICommonPermissionListener extends IInterface {

    public static class Default implements ICommonPermissionListener {
        public IBinder asBinder() {
            return null;
        }

        public void onDenied(String str) throws RemoteException {
        }

        public void onGranted() throws RemoteException {
        }
    }

    void onDenied(String str) throws RemoteException;

    void onGranted() throws RemoteException;

    public static abstract class Stub extends Binder implements ICommonPermissionListener {
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonPermissionListener");
        }

        public static ICommonPermissionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICommonPermissionListener)) {
                return new C3002a(iBinder);
            }
            return (ICommonPermissionListener) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                onGranted();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                onDenied(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                return true;
            }
        }

        /* renamed from: com.bytedance.sdk.openadsdk.ICommonPermissionListener$Stub$a */
        private static class C3002a implements ICommonPermissionListener {

            /* renamed from: a */
            public static ICommonPermissionListener f6848a;

            /* renamed from: b */
            private IBinder f6849b;

            C3002a(IBinder iBinder) {
                this.f6849b = iBinder;
            }

            public IBinder asBinder() {
                return this.f6849b;
            }

            public void onGranted() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    if (this.f6849b.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onGranted();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDenied(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    obtain.writeString(str);
                    if (this.f6849b.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onDenied(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ICommonPermissionListener iCommonPermissionListener) {
            if (C3002a.f6848a != null || iCommonPermissionListener == null) {
                return false;
            }
            C3002a.f6848a = iCommonPermissionListener;
            return true;
        }

        public static ICommonPermissionListener getDefaultImpl() {
            return C3002a.f6848a;
        }
    }
}
