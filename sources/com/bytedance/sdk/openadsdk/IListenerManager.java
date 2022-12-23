package com.bytedance.sdk.openadsdk;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

public interface IListenerManager extends IInterface {

    public static class Default implements IListenerManager {
        public IBinder asBinder() {
            return null;
        }

        public void broadcastDialogListener(String str, int i) throws RemoteException {
        }

        public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        }

        public int delete(Uri uri, String str, String[] strArr) throws RemoteException {
            return 0;
        }

        public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        }

        public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        }

        public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        }

        public void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException {
        }

        public String getType(Uri uri) throws RemoteException {
            return null;
        }

        public String insert(Uri uri, ContentValues contentValues) throws RemoteException {
            return null;
        }

        public Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
            return null;
        }

        public void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        }

        public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
        }

        public void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        }

        public void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        }

        public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        }

        public void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        }

        public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        }

        public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
            return 0;
        }
    }

    void broadcastDialogListener(String str, int i) throws RemoteException;

    void broadcastPermissionListener(String str, String str2) throws RemoteException;

    int delete(Uri uri, String str, String[] strArr) throws RemoteException;

    void executeAppOpenAdCallback(String str, String str2) throws RemoteException;

    void executeDisLikeClosedCallback(String str, String str2) throws RemoteException;

    void executeFullVideoCallback(String str, String str2) throws RemoteException;

    void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException;

    String getType(Uri uri) throws RemoteException;

    String insert(Uri uri, ContentValues contentValues) throws RemoteException;

    Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException;

    void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException;

    void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException;

    void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException;

    void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException;

    void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException;

    void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException;

    void unregisterDisLikeClosedListener(String str) throws RemoteException;

    int update(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException;

    public static abstract class Stub extends Binder implements IListenerManager {
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IListenerManager");
        }

        public static IListenerManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IListenerManager");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IListenerManager)) {
                return new C3005a(iBinder);
            }
            return (IListenerManager) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.content.ContentValues} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: android.content.ContentValues} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v17 */
        /* JADX WARNING: type inference failed for: r0v18 */
        /* JADX WARNING: type inference failed for: r0v19 */
        /* JADX WARNING: type inference failed for: r0v20 */
        /* JADX WARNING: type inference failed for: r0v21 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
            /*
                r10 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.bytedance.sdk.openadsdk.IListenerManager"
                if (r11 == r0) goto L_0x01fd
                r0 = 0
                switch(r11) {
                    case 1: goto L_0x01e7;
                    case 2: goto L_0x01ba;
                    case 3: goto L_0x01a4;
                    case 4: goto L_0x0192;
                    case 5: goto L_0x017c;
                    case 6: goto L_0x016a;
                    case 7: goto L_0x0154;
                    case 8: goto L_0x0142;
                    case 9: goto L_0x012c;
                    case 10: goto L_0x011e;
                    case 11: goto L_0x010c;
                    case 12: goto L_0x00f6;
                    case 13: goto L_0x00e4;
                    case 14: goto L_0x00b5;
                    case 15: goto L_0x0098;
                    case 16: goto L_0x006b;
                    case 17: goto L_0x0046;
                    case 18: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r11 = super.onTransact(r11, r12, r13, r14)
                return r11
            L_0x0011:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0023
                android.os.Parcelable$Creator r11 = android.net.Uri.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                android.net.Uri r11 = (android.net.Uri) r11
                goto L_0x0024
            L_0x0023:
                r11 = r0
            L_0x0024:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0033
                android.os.Parcelable$Creator r14 = android.content.ContentValues.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r0 = r14
                android.content.ContentValues r0 = (android.content.ContentValues) r0
            L_0x0033:
                java.lang.String r14 = r12.readString()
                java.lang.String[] r12 = r12.createStringArray()
                int r11 = r10.update(r11, r0, r14, r12)
                r13.writeNoException()
                r13.writeInt(r11)
                return r1
            L_0x0046:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0058
                android.os.Parcelable$Creator r11 = android.net.Uri.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r0 = r11
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x0058:
                java.lang.String r11 = r12.readString()
                java.lang.String[] r12 = r12.createStringArray()
                int r11 = r10.delete(r0, r11, r12)
                r13.writeNoException()
                r13.writeInt(r11)
                return r1
            L_0x006b:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x007d
                android.os.Parcelable$Creator r11 = android.net.Uri.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                android.net.Uri r11 = (android.net.Uri) r11
                goto L_0x007e
            L_0x007d:
                r11 = r0
            L_0x007e:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x008d
                android.os.Parcelable$Creator r14 = android.content.ContentValues.CREATOR
                java.lang.Object r12 = r14.createFromParcel(r12)
                r0 = r12
                android.content.ContentValues r0 = (android.content.ContentValues) r0
            L_0x008d:
                java.lang.String r11 = r10.insert(r11, r0)
                r13.writeNoException()
                r13.writeString(r11)
                return r1
            L_0x0098:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x00aa
                android.os.Parcelable$Creator r11 = android.net.Uri.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r0 = r11
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x00aa:
                java.lang.String r11 = r10.getType(r0)
                r13.writeNoException()
                r13.writeString(r11)
                return r1
            L_0x00b5:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x00c7
                android.os.Parcelable$Creator r11 = android.net.Uri.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r0 = r11
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x00c7:
                r3 = r0
                java.lang.String[] r4 = r12.createStringArray()
                java.lang.String r5 = r12.readString()
                java.lang.String[] r6 = r12.createStringArray()
                java.lang.String r7 = r12.readString()
                r2 = r10
                java.util.Map r11 = r2.query(r3, r4, r5, r6, r7)
                r13.writeNoException()
                r13.writeMap(r11)
                return r1
            L_0x00e4:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                java.lang.String r12 = r12.readString()
                r10.executeAppOpenAdCallback(r11, r12)
                r13.writeNoException()
                return r1
            L_0x00f6:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener r12 = com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.asInterface(r12)
                r10.registerAppOpenAdListener(r11, r12)
                r13.writeNoException()
                return r1
            L_0x010c:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                java.lang.String r12 = r12.readString()
                r10.executeDisLikeClosedCallback(r11, r12)
                r13.writeNoException()
                return r1
            L_0x011e:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                r10.unregisterDisLikeClosedListener(r11)
                r13.writeNoException()
                return r1
            L_0x012c:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.bytedance.sdk.openadsdk.IDislikeClosedListener r12 = com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.asInterface(r12)
                r10.registerDisLikeClosedListener(r11, r12)
                r13.writeNoException()
                return r1
            L_0x0142:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                java.lang.String r12 = r12.readString()
                r10.broadcastPermissionListener(r11, r12)
                r13.writeNoException()
                return r1
            L_0x0154:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.bytedance.sdk.openadsdk.ICommonPermissionListener r12 = com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.asInterface(r12)
                r10.registerPermissionListener(r11, r12)
                r13.writeNoException()
                return r1
            L_0x016a:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                int r12 = r12.readInt()
                r10.broadcastDialogListener(r11, r12)
                r13.writeNoException()
                return r1
            L_0x017c:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.bytedance.sdk.openadsdk.ICommonDialogListener r12 = com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.asInterface(r12)
                r10.registerDialogListener(r11, r12)
                r13.writeNoException()
                return r1
            L_0x0192:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                java.lang.String r12 = r12.readString()
                r10.executeFullVideoCallback(r11, r12)
                r13.writeNoException()
                return r1
            L_0x01a4:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener r12 = com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.asInterface(r12)
                r10.registerFullVideoListener(r11, r12)
                r13.writeNoException()
                return r1
            L_0x01ba:
                r12.enforceInterface(r2)
                java.lang.String r3 = r12.readString()
                java.lang.String r4 = r12.readString()
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x01cd
                r5 = r1
                goto L_0x01cf
            L_0x01cd:
                r11 = 0
                r5 = r11
            L_0x01cf:
                int r6 = r12.readInt()
                java.lang.String r7 = r12.readString()
                int r8 = r12.readInt()
                java.lang.String r9 = r12.readString()
                r2 = r10
                r2.executeRewardVideoCallback(r3, r4, r5, r6, r7, r8, r9)
                r13.writeNoException()
                return r1
            L_0x01e7:
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.bytedance.sdk.openadsdk.IRewardAdInteractionListener r12 = com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.asInterface(r12)
                r10.registerRewardVideoListener(r11, r12)
                r13.writeNoException()
                return r1
            L_0x01fd:
                r13.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.IListenerManager.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        /* renamed from: com.bytedance.sdk.openadsdk.IListenerManager$Stub$a */
        private static class C3005a implements IListenerManager {

            /* renamed from: a */
            public static IListenerManager f6854a;

            /* renamed from: b */
            private IBinder f6855b;

            C3005a(IBinder iBinder) {
                this.f6855b = iBinder;
            }

            public IBinder asBinder() {
                return this.f6855b;
            }

            public void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iRewardAdInteractionListener != null ? iRewardAdInteractionListener.asBinder() : null);
                    if (this.f6855b.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerRewardVideoListener(str, iRewardAdInteractionListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    String str5 = str;
                    obtain.writeString(str);
                    String str6 = str2;
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    obtain.writeString(str3);
                    obtain.writeInt(i2);
                    obtain.writeString(str4);
                    try {
                        if (this.f6855b.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                            return;
                        }
                        Stub.getDefaultImpl().executeRewardVideoCallback(str, str2, z, i, str3, i2, str4);
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iFullScreenVideoAdInteractionListener != null ? iFullScreenVideoAdInteractionListener.asBinder() : null);
                    if (this.f6855b.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerFullVideoListener(str, iFullScreenVideoAdInteractionListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void executeFullVideoCallback(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f6855b.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().executeFullVideoCallback(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCommonDialogListener != null ? iCommonDialogListener.asBinder() : null);
                    if (this.f6855b.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerDialogListener(str, iCommonDialogListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void broadcastDialogListener(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (this.f6855b.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().broadcastDialogListener(str, i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCommonPermissionListener != null ? iCommonPermissionListener.asBinder() : null);
                    if (this.f6855b.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerPermissionListener(str, iCommonPermissionListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void broadcastPermissionListener(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f6855b.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().broadcastPermissionListener(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iDislikeClosedListener != null ? iDislikeClosedListener.asBinder() : null);
                    if (this.f6855b.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerDisLikeClosedListener(str, iDislikeClosedListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unregisterDisLikeClosedListener(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    if (this.f6855b.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unregisterDisLikeClosedListener(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f6855b.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().executeDisLikeClosedCallback(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iAppOpenAdInteractionListener != null ? iAppOpenAdInteractionListener.asBinder() : null);
                    if (this.f6855b.transact(12, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerAppOpenAdListener(str, iAppOpenAdInteractionListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f6855b.transact(13, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().executeAppOpenAdCallback(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr2);
                    obtain.writeString(str2);
                    if (!this.f6855b.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().query(uri, strArr, str, strArr2, str2);
                    }
                    obtain2.readException();
                    HashMap readHashMap = obtain2.readHashMap(getClass().getClassLoader());
                    obtain2.recycle();
                    obtain.recycle();
                    return readHashMap;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getType(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f6855b.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getType(uri);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String insert(Uri uri, ContentValues contentValues) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f6855b.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().insert(uri, contentValues);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int delete(Uri uri, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.f6855b.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().delete(uri, str, strArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.f6855b.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().update(uri, contentValues, str, strArr);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IListenerManager iListenerManager) {
            if (C3005a.f6854a != null || iListenerManager == null) {
                return false;
            }
            C3005a.f6854a = iListenerManager;
            return true;
        }

        public static IListenerManager getDefaultImpl() {
            return C3005a.f6854a;
        }
    }
}
