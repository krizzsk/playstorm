package com.smaato.sdk.core.util.memory;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

final class LeakProtectionImpl implements LeakProtection {
    private final Map<LeakProtectionReference, Runnable> destructs = new HashMap();
    private final ReferenceQueue<Object> queue = new ReferenceQueue<>();

    LeakProtectionImpl() {
        new Thread(new Runnable() {
            public final void run() {
                LeakProtectionImpl.this.lambda$new$0$LeakProtectionImpl();
            }
        }).start();
    }

    public /* synthetic */ void lambda$new$0$LeakProtectionImpl() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
            while (true) {
                LeakProtectionReference leakProtectionReference = (LeakProtectionReference) this.queue.poll();
                if (leakProtectionReference != null) {
                    if (leakProtectionReference.canClear()) {
                        Runnable removeDestructionAction = removeDestructionAction(leakProtectionReference);
                        if (removeDestructionAction != null) {
                            removeDestructionAction.run();
                        }
                        leakProtectionReference.clear();
                    }
                }
            }
        }
    }

    public synchronized void listenToObject(Object obj, Runnable runnable) {
        this.destructs.put(new LeakProtectionReference(obj, this.queue), runnable);
    }

    private synchronized Runnable removeDestructionAction(LeakProtectionReference leakProtectionReference) {
        return this.destructs.remove(leakProtectionReference);
    }

    private static final class LeakProtectionReference<T> extends PhantomReference<T> {
        private boolean cleared;

        private LeakProtectionReference(T t, ReferenceQueue<? super T> referenceQueue) {
            super(t, referenceQueue);
        }

        /* access modifiers changed from: private */
        public boolean canClear() {
            if (this.cleared) {
                return false;
            }
            this.cleared = true;
            return true;
        }
    }
}
