package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.aacbb */
public final class aacbb {

    /* renamed from: a */
    public static final aacbb f25674a = new aacbb();

    private aacbb() {
    }

    /* renamed from: a */
    public static String m30673a(int i) {
        String binaryString = Integer.toBinaryString(i);
        bbabc.m30940a((Object) binaryString, "binaryString");
        bbabc.m30943b(binaryString, "receiver$0");
        int length = 32 - binaryString.length();
        if (length > 0) {
            int i2 = 1;
            while (true) {
                binaryString = "0".concat(String.valueOf(binaryString));
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return binaryString;
    }
}
