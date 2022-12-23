package com.p374my.target;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p398ms.p399bd.p400o.Pgl.C12379c;

/* renamed from: com.my.target.d5 */
public final class C9660d5 extends C9736h5 {

    /* renamed from: a */
    public static final int[] f23755a = C9704f8.m28041a(260, 272, 268, 276, 516, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 532, 528, IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, 512, 264, 256, C12379c.COLLECT_MODE_ML_TEEN);

    /* renamed from: b */
    public Method f23756b;

    public C9660d5() {
        try {
            this.f23756b = BluetoothDevice.class.getMethod("isConnected", new Class[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static List<String> m27825a(BluetoothAdapter bluetoothAdapter, Method method) {
        ArrayList arrayList = new ArrayList();
        try {
            for (BluetoothDevice next : bluetoothAdapter.getBondedDevices()) {
                if (Arrays.binarySearch(f23755a, next.getBluetoothClass().getDeviceClass()) < 0) {
                    if (((Boolean) method.invoke(next, new Object[0])).booleanValue()) {
                        String name = next.getName();
                        if (!TextUtils.isEmpty(name)) {
                            arrayList.add(new String(Base64.encode(name.getBytes(), 2), "UTF-8"));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public void collectData(Context context) {
        if (this.f23756b != null) {
            if (!C9736h5.checkPermission("android.permission.BLUETOOTH", context)) {
                removeAll();
                return;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                removeAll();
                return;
            }
            List<String> a = m27825a(defaultAdapter, this.f23756b);
            String str = null;
            if (!a.isEmpty()) {
                str = C9704f8.m28038a(a);
            }
            addParam("bdn", str);
        }
    }
}
