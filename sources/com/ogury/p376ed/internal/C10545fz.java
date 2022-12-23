package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.fz */
public final class C10545fz {

    /* renamed from: a */
    public static final C10545fz f26659a = new C10545fz();

    private C10545fz() {
    }

    /* renamed from: a */
    public static String m32056a(int i) {
        switch (i) {
            case 0:
                return "LOAD_FAILED";
            case 1:
                return "NO_INTERNET_CONNECTION";
            case 2:
                return "AD_DISABLED";
            case 3:
                return "PROFIG_NOT_SYNCED";
            case 4:
                return "AD_EXPIRED";
            case 5:
                return "SDK_INIT_NOT_CALLED";
            case 6:
                return "SDK_INIT_FAILED";
            case 7:
                return "ACTIVITY_IN_BACKGROUND";
            case 8:
                return "ANOTHER_AD_ALREADY_DISPLAYED";
            default:
                return C10765mq.m32765a("Unknown error ", (Object) Integer.valueOf(i));
        }
    }
}
