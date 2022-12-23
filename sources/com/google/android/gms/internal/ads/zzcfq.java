package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcfq extends ScheduledThreadPoolExecutor {
    zzcfq(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
