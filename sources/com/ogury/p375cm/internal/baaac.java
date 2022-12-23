package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.baaac */
public final class baaac {

    /* renamed from: a */
    public static final baaac f25873a = new baaac();

    private baaac() {
    }

    /* renamed from: a */
    public static String m30884a(int i) {
        switch (i) {
            case -2:
                return "cloud-service-permission-denied";
            case -1:
                return "cloud-service-network-connection-failed";
            case 0:
                return "ok";
            case 1:
                return "payment-cancelled";
            case 2:
                return "cloud-service-network-connection-failed";
            case 3:
                return "payment-not-allowed";
            case 4:
                return "store-product-not-available";
            case 5:
                return "client-invalid";
            case 7:
                return "item-already-owned";
            default:
                return "unknown";
        }
    }
}
