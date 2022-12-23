package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.IAppActiveListener;
import com.unity3d.services.core.lifecycle.LifecycleCache;
import com.unity3d.services.core.lifecycle.LifecycleEvent;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class IntervalTimer implements IIntervalTimer, IAppActiveListener {
    private final AtomicInteger _currentPosition = new AtomicInteger(0);
    private final Integer _delayMs = 1000;
    private final AtomicBoolean _hasPaused = new AtomicBoolean(false);
    private final Integer _intervalDuration;
    private final AtomicBoolean _isRunning = new AtomicBoolean(false);
    private LifecycleCache _lifecycleCache;
    private Integer _nextInterval;
    private final String _timedActivityName;
    private IIntervalTimerListener _timerListener;
    private ScheduledExecutorService _timerService;
    private final Integer _totalDurationMs;
    private final Integer _totalIntervals;

    public IntervalTimer(String str, Integer num, Integer num2, IIntervalTimerListener iIntervalTimerListener, LifecycleCache lifecycleCache) {
        this._timedActivityName = str;
        this._totalDurationMs = num;
        this._totalIntervals = num2;
        this._timerListener = iIntervalTimerListener;
        this._lifecycleCache = lifecycleCache;
        Integer valueOf = Integer.valueOf(num2.intValue() == 0 ? this._totalDurationMs.intValue() : this._totalDurationMs.intValue() / this._totalIntervals.intValue());
        this._intervalDuration = valueOf;
        this._nextInterval = valueOf;
        this._lifecycleCache.addListener(this._timedActivityName, this);
    }

    public void start(ScheduledExecutorService scheduledExecutorService) {
        if (this._isRunning.compareAndSet(false, true)) {
            this._timerService = scheduledExecutorService;
            schedule();
        }
    }

    private void schedule() {
        try {
            this._timerService.scheduleAtFixedRate(new Runnable() {
                public void run() {
                    IntervalTimer.this.onNextMs();
                }
            }, (long) this._delayMs.intValue(), (long) this._delayMs.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | RejectedExecutionException e) {
            DeviceLog.debug("ERROR: IntervalTimer failed to start due to exception " + e.getLocalizedMessage());
        }
    }

    public void onNextMs() {
        if (this._currentPosition.addAndGet(this._delayMs.intValue()) >= this._nextInterval.intValue()) {
            onNextInterval();
        }
    }

    public void onNextInterval() {
        IIntervalTimerListener iIntervalTimerListener = this._timerListener;
        if (iIntervalTimerListener != null) {
            iIntervalTimerListener.onNextIntervalTriggered();
        }
        killIfCompleted();
        this._nextInterval = Integer.valueOf(this._nextInterval.intValue() + this._intervalDuration.intValue());
    }

    public void killIfCompleted() {
        if (this._nextInterval.compareTo(this._totalDurationMs) >= 0) {
            kill();
        }
    }

    public void stopTimer() {
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this._timerService.shutdown();
        }
        this._isRunning.getAndSet(false);
    }

    public void kill() {
        stopTimer();
        this._lifecycleCache.removeListener(this._timedActivityName);
        this._timerListener = null;
    }

    /* renamed from: com.unity3d.services.core.timer.IntervalTimer$2 */
    static /* synthetic */ class C120932 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.lifecycle.LifecycleEvent[] r0 = com.unity3d.services.core.lifecycle.LifecycleEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent = r0
                com.unity3d.services.core.lifecycle.LifecycleEvent r1 = com.unity3d.services.core.lifecycle.LifecycleEvent.PAUSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.lifecycle.LifecycleEvent r1 = com.unity3d.services.core.lifecycle.LifecycleEvent.RESUMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.timer.IntervalTimer.C120932.<clinit>():void");
        }
    }

    public void onAppStateChanged(LifecycleEvent lifecycleEvent) {
        int i = C120932.$SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent[lifecycleEvent.ordinal()];
        if (i == 1) {
            this._hasPaused.getAndSet(true);
            stopTimer();
        } else if (i == 2 && this._hasPaused.get()) {
            this._hasPaused.getAndSet(false);
            start(Executors.newSingleThreadScheduledExecutor());
        }
    }
}
