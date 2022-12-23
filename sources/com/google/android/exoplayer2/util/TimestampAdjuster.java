package com.google.android.exoplayer2.util;

public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void sharedInitializeOrWait(boolean r5, long r6) throws java.lang.InterruptedException {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.firstSampleTimestampUs     // Catch:{ all -> 0x0037 }
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch:{ all -> 0x0037 }
            long r0 = r4.timestampOffsetUs     // Catch:{ all -> 0x0037 }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            monitor-exit(r4)
            return
        L_0x001f:
            if (r5 == 0) goto L_0x002b
            java.lang.ThreadLocal<java.lang.Long> r5 = r4.nextSampleTimestampUs     // Catch:{ all -> 0x0037 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0037 }
            r5.set(r6)     // Catch:{ all -> 0x0037 }
            goto L_0x0035
        L_0x002b:
            long r5 = r4.timestampOffsetUs     // Catch:{ all -> 0x0037 }
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            r4.wait()     // Catch:{ all -> 0x0037 }
            goto L_0x002b
        L_0x0035:
            monitor-exit(r4)
            return
        L_0x0037:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.TimestampAdjuster.sharedInitializeOrWait(boolean, long):void");
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        if (this.firstSampleTimestampUs != Long.MAX_VALUE) {
            if (this.firstSampleTimestampUs != MODE_SHARED) {
                j = this.firstSampleTimestampUs;
            }
        }
        j = -9223372036854775807L;
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        if (this.lastUnadjustedTimestampUs != -9223372036854775807L) {
            j = this.lastUnadjustedTimestampUs + this.timestampOffsetUs;
        } else {
            j = getFirstSampleTimestampUs();
        }
        return j;
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = -9223372036854775807L;
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastUnadjustedTimestampUs != -9223372036854775807L) {
            long usToNonWrappedPts = usToNonWrappedPts(this.lastUnadjustedTimestampUs);
            long j2 = (4294967296L + usToNonWrappedPts) / MAX_PTS_PLUS_ONE;
            long j3 = ((j2 - 1) * MAX_PTS_PLUS_ONE) + j;
            j += j2 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j3 - usToNonWrappedPts) < Math.abs(j - usToNonWrappedPts)) {
                j = j3;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long adjustSampleTimestamp(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.timestampOffsetUs == -9223372036854775807L) {
            if (this.firstSampleTimestampUs == MODE_SHARED) {
                j2 = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
            } else {
                j2 = this.firstSampleTimestampUs;
            }
            this.timestampOffsetUs = j2 - j;
            notifyAll();
        }
        this.lastUnadjustedTimestampUs = j;
        return j + this.timestampOffsetUs;
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % MAX_PTS_PLUS_ONE;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }
}
