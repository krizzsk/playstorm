package com.mbridge.msdk.out;

import com.mbridge.msdk.system.C9131a;

public class MBridgeSDKFactory {
    private static C9131a instance;

    private MBridgeSDKFactory() {
    }

    public static C9131a getMBridgeSDK() {
        if (instance == null) {
            synchronized (MBridgeSDKFactory.class) {
                if (instance == null) {
                    instance = new C9131a();
                }
            }
        }
        return instance;
    }
}
