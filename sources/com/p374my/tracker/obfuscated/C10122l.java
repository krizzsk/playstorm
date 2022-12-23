package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import java.util.Collections;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.l */
public final class C10122l {

    /* renamed from: b */
    public static int f25233b = 5;

    /* renamed from: a */
    private volatile boolean f25234a = true;

    /* renamed from: a */
    static void m30145a(C10129m0 m0Var, Context context) {
        List<CellInfo> allCellInfo;
        int i = Build.VERSION.SDK_INT;
        if (i < 17) {
            C10175u0.m30440a("EnvironmentParamsDataProvider: low Android version");
            return;
        }
        if (i < 29) {
            if (!C10113h0.m30081a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                C10175u0.m30440a("EnvironmentParamsDataProvider: can't access information");
                return;
            }
        } else if (!C10113h0.m30081a("android.permission.ACCESS_FINE_LOCATION", context)) {
            C10175u0.m30440a("EnvironmentParamsDataProvider: can't access information");
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && (allCellInfo = telephonyManager.getAllCellInfo()) != null) {
                if (!allCellInfo.isEmpty()) {
                    boolean z = true;
                    for (CellInfo next : allCellInfo) {
                        if (next.isRegistered()) {
                            if (next instanceof CellInfoCdma) {
                                m30146a(m0Var, (CellInfoCdma) next);
                            } else if (next instanceof CellInfoGsm) {
                                m30147a(m0Var, (CellInfoGsm) next);
                            } else if (next instanceof CellInfoLte) {
                                m30148a(m0Var, (CellInfoLte) next);
                            } else {
                                int i2 = Build.VERSION.SDK_INT;
                                if (i2 >= 18 && (next instanceof CellInfoWcdma)) {
                                    m30151a(m0Var, (CellInfoWcdma) next);
                                } else if (i2 >= 29 && (next instanceof CellInfoTdscdma)) {
                                    m30150a(m0Var, (CellInfoTdscdma) next);
                                } else if (i2 >= 29 && (next instanceof CellInfoNr)) {
                                    m30149a(m0Var, (CellInfoNr) next);
                                }
                            }
                            z = false;
                        }
                    }
                    if (z) {
                        m30152a(m0Var, telephonyManager);
                    }
                }
            }
        } catch (Throwable th) {
            C10175u0.m30441a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
        }
    }

    /* renamed from: a */
    static void m30146a(C10129m0 m0Var, CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        m0Var.mo66260a(cellIdentity.getNetworkId(), cellIdentity.getSystemId(), cellIdentity.getBasestationId(), cellIdentity.getLatitude(), cellIdentity.getLongitude(), cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    /* renamed from: a */
    static void m30147a(C10129m0 m0Var, CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        m0Var.mo66270a(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getArfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getBsic() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : Integer.MAX_VALUE);
    }

    /* renamed from: a */
    static void m30148a(C10129m0 m0Var, CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        m0Var.mo66282b(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), i >= 24 ? cellIdentity.getEarfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getPci() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : Integer.MAX_VALUE);
    }

    /* renamed from: a */
    static void m30149a(C10129m0 m0Var, CellInfoNr cellInfoNr) {
        CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
        CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellInfoNr.getCellSignalStrength();
        m0Var.mo66271a(cellIdentityNr.getMccString(), cellIdentityNr.getMncString(), cellIdentityNr.getNci(), cellIdentityNr.getTac(), cellIdentityNr.getNrarfcn(), cellIdentityNr.getPci(), cellSignalStrengthNr.getLevel(), cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getAsuLevel());
    }

    /* renamed from: a */
    static void m30150a(C10129m0 m0Var, CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        m0Var.mo66269a(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    /* renamed from: a */
    static void m30151a(C10129m0 m0Var, CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        m0Var.mo66281b(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getUarfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getPsc() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    /* renamed from: a */
    static void m30152a(C10129m0 m0Var, TelephonyManager telephonyManager) {
        String str;
        String str2;
        String str3;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        if (cellLocation instanceof GsmCellLocation) {
            String networkOperator = telephonyManager.getNetworkOperator();
            String str4 = null;
            if (!TextUtils.isEmpty(networkOperator)) {
                try {
                    str3 = networkOperator.substring(0, 3);
                    try {
                        str4 = networkOperator.substring(3);
                    } catch (Throwable unused) {
                        C10175u0.m30440a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                        str2 = str3;
                        str = str4;
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        m0Var.mo66270a(str2, str, gsmCellLocation.getCid(), gsmCellLocation.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    }
                } catch (Throwable unused2) {
                    str3 = null;
                    C10175u0.m30440a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                    str2 = str3;
                    str = str4;
                    GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
                    m0Var.mo66270a(str2, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                }
                str2 = str3;
                str = str4;
            } else {
                str2 = null;
                str = null;
            }
            GsmCellLocation gsmCellLocation22 = (GsmCellLocation) cellLocation;
            m0Var.mo66270a(str2, str, gsmCellLocation22.getCid(), gsmCellLocation22.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    /* renamed from: a */
    public static boolean m30153a(int i) {
        return Integer.MAX_VALUE != i;
    }

    /* renamed from: a */
    public static boolean m30154a(long j) {
        return Long.MAX_VALUE != j;
    }

    /* renamed from: b */
    static void m30155b(C10129m0 m0Var, Context context) {
        List<ScanResult> scanResults;
        if (C10113h0.m30081a("android.permission.ACCESS_WIFI_STATE", context)) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                if (wifiManager == null) {
                    return;
                }
                if (wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        m0Var.mo66268a(connectionInfo.getSSID(), connectionInfo.getBSSID(), connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                    }
                    if ((Build.VERSION.SDK_INT >= 24 && !C10113h0.m30081a("android.permission.ACCESS_FINE_LOCATION", context) && !C10113h0.m30081a("android.permission.ACCESS_COARSE_LOCATION", context)) || (scanResults = wifiManager.getScanResults()) == null) {
                        return;
                    }
                    if (!scanResults.isEmpty()) {
                        Collections.sort(scanResults, $$Lambda$l$Et7DzeS9hEUVL2jCD186bWN6aW8.INSTANCE);
                        int min = Math.min(scanResults.size(), f25233b);
                        for (int i = 0; i < min; i++) {
                            ScanResult scanResult = scanResults.get(i);
                            m0Var.mo66267a(scanResult.SSID, scanResult.BSSID, scanResult.level);
                        }
                    }
                }
            } catch (Throwable th) {
                C10175u0.m30441a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            }
        }
    }

    /* renamed from: a */
    public void mo66217a(Context context) {
    }

    /* renamed from: a */
    public void mo66218a(boolean z) {
        this.f25234a = z;
    }

    /* renamed from: b */
    public void mo66219b(Context context) {
    }

    /* renamed from: c */
    public void mo66220c(C10129m0 m0Var, Context context) {
        if (this.f25234a) {
            m30145a(m0Var, context);
            m30155b(m0Var, context);
        }
    }
}
