package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;

public class AuthorityInfoBean {
    public int getAuthGenDataStatus() {
        if (!C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
            return Integer.parseInt(C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_GENERAL_DATA));
        }
        return 1;
    }

    public int getAuthDeviceIdStatus() {
        if (!C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
            return Integer.parseInt(C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_DEVICE_ID));
        }
        return 1;
    }

    public int getAuthSerialIdStatus() {
        if (!C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
            return Integer.parseInt(C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_SERIAL_ID));
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AuthorityInfoBean mo15806a(int i) {
        C2338a.m5535a().mo15733a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i));
        C2338a.m5535a().mo15733a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i));
        C2338a.m5535a().mo15733a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AuthorityInfoBean mo15807b(int i) {
        C2338a.m5535a().mo15733a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AuthorityInfoBean mo15808c(int i) {
        C2338a.m5535a().mo15733a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AuthorityInfoBean mo15809d(int i) {
        C2338a.m5535a().mo15733a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final AuthorityInfoBean mo15810e(int i) {
        C2338a.m5535a().mo15733a(MBridgeConstans.AUTHORITY_OTHER, String.valueOf(i));
        return this;
    }
}
