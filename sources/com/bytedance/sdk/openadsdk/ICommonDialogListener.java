package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICommonDialogListener extends IInterface {

    public static class Default implements ICommonDialogListener {
        public IBinder asBinder() {
            return null;
        }

        public void onDialogBtnNo() throws RemoteException {
        }

        public void onDialogBtnYes() throws RemoteException {
        }

        public void onDialogCancel() throws RemoteException {
        }
    }

    void onDialogBtnNo() throws RemoteException;

    void onDialogBtnYes() throws RemoteException;

    void onDialogCancel() throws RemoteException;

    public static abstract class Stub extends Binder implements ICommonDialogListener {
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonDialogListener");
        }

        public static ICommonDialogListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICommonDialogListener)) {
                return new C3001a(iBinder);
            }
            return (ICommonDialogListener) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnYes();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnNo();
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogCancel();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                return true;
            }
        }

        /* renamed from: com.bytedance.sdk.openadsdk.ICommonDialogListener$Stub$a */
        private static class C3001a implements ICommonDialogListener {

            /* renamed from: a */
            public static ICommonDialogListener f6846a;

            /* renamed from: b */
            private IBinder f6847b;

            C3001a(IBinder iBinder) {
                this.f6847b = iBinder;
            }

            public IBinder asBinder() {
                return this.f6847b;
            }

            public void onDialogBtnYes() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (this.f6847b.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onDialogBtnYes();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDialogBtnNo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (this.f6847b.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onDialogBtnNo();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDialogCancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (this.f6847b.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onDialogCancel();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ICommonDialogListener iCommonDialogListener) {
            if (C3001a.f6846a != null || iCommonDialogListener == null) {
                return false;
            }
            C3001a.f6846a = iCommonDialogListener;
            return true;
        }

        public static ICommonDialogListener getDefaultImpl() {
            return C3001a.f6846a;
        }
    }
}
