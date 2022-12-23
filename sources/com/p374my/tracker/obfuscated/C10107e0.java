package com.p374my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.my.tracker.obfuscated.e0 */
public final class C10107e0 {

    /* renamed from: a */
    private int f25177a = -1;

    /* renamed from: b */
    private int f25178b = -1;

    /* renamed from: c */
    private String f25179c;

    C10107e0() {
    }

    /* renamed from: a */
    public void mo66161a(Context context) {
        this.f25177a = -1;
        this.f25178b = -1;
        NetworkInfo networkInfo = null;
        this.f25179c = null;
        if (C10113h0.m30081a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                }
                if (networkInfo != null) {
                    int type = networkInfo.getType();
                    if (type == 0) {
                        this.f25177a = 2;
                    } else if (type != 1) {
                        this.f25177a = 1;
                    } else {
                        this.f25177a = 3;
                    }
                    this.f25179c = networkInfo.getType() == 0 ? networkInfo.getSubtypeName() : networkInfo.getTypeName();
                }
            } catch (SecurityException unused) {
                C10175u0.m30440a("No permissions for access to network state");
            }
        }
        if (!C10113h0.m30080a() && C10113h0.m30081a("android.permission.BLUETOOTH", context)) {
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    this.f25178b = defaultAdapter.isEnabled() ? 1 : 0;
                }
            } catch (SecurityException unused2) {
                C10175u0.m30440a("Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
            }
        }
    }

    /* renamed from: a */
    public void mo66162a(C10129m0 m0Var, Context context) {
        m0Var.mo66261a(this.f25177a, this.f25179c);
        int i = this.f25178b;
        if (i != -1) {
            m0Var.mo66308g(i);
        }
    }

    /* renamed from: b */
    public void mo66163b(Context context) {
    }
}
