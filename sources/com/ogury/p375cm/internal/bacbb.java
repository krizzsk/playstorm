package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.bacbb */
public final class bacbb {

    /* renamed from: com.ogury.cm.internal.bacbb$aaaaa */
    public static final class aaaaa extends Thread {

        /* renamed from: a */
        final /* synthetic */ bbaaa f25918a;

        aaaaa(bbaaa bbaaa) {
            this.f25918a = bbaaa;
        }

        public final void run() {
            this.f25918a.mo66502a();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m30926a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, bbaaa bbaaa, int i2, Object obj) {
        bbabc.m30943b(bbaaa, "block");
        aaaaa aaaaa2 = new aaaaa(bbaaa);
        aaaaa2.start();
        return aaaaa2;
    }
}
