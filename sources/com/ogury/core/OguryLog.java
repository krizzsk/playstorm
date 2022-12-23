package com.ogury.core;

import androidx.room.RoomDatabase;
import com.ogury.core.internal.C10218ah;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.OguryIntegrationLogger;

/* compiled from: OguryLog.kt */
public final class OguryLog {
    public static final OguryLog INSTANCE = new OguryLog();

    private OguryLog() {
    }

    /* compiled from: OguryLog.kt */
    public enum Level {
        ;

        public abstract int getLogPriority();

        /* renamed from: com.ogury.core.OguryLog$Level$d */
        /* compiled from: OguryLog.kt */
        static final class C10199d extends Level {
            public final int getLogPriority() {
                return RoomDatabase.MAX_BIND_PARAMETER_CNT;
            }

            C10199d(String str, int i) {
                super(str, 0, (C10218ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$a */
        /* compiled from: OguryLog.kt */
        static final class C10196a extends Level {
            public final int getLogPriority() {
                return 3;
            }

            C10196a(String str, int i) {
                super(str, 1, (C10218ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$c */
        /* compiled from: OguryLog.kt */
        static final class C10198c extends Level {
            public final int getLogPriority() {
                return 4;
            }

            C10198c(String str, int i) {
                super(str, 2, (C10218ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$b */
        /* compiled from: OguryLog.kt */
        static final class C10197b extends Level {
            public final int getLogPriority() {
                return 6;
            }

            C10197b(String str, int i) {
                super(str, 3, (C10218ah) null);
            }
        }
    }

    public static final void enable(Level level) {
        C10219ai.m31036b(level, "level");
        OguryIntegrationLogger.setLevel(level.getLogPriority());
    }
}
