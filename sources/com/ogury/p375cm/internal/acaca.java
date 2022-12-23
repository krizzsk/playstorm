package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.acaca */
public final class acaca {

    /* renamed from: a */
    public static final acaca f25841a = new acaca();

    private acaca() {
    }

    /* renamed from: a */
    public static String m30828a(acabc acabc) {
        StringBuilder sb;
        String str;
        bbabc.m30943b(acabc, "requestType");
        int i = acacb.f25842a[acabc.ordinal()];
        if (i == 1) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/ask";
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/edit";
        } else if (i == 3) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/event";
        } else if (i == 4) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/external-consent/tcfv2";
        } else if (i == 5) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/external-consent/boolean";
        } else {
            throw new babbb();
        }
        sb.append(str);
        return sb.toString();
    }
}
