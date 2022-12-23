package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.-$$Lambda$SQLiteEventStore$8DhP1OvEO8M6Rk0AUupPmfOot0Y  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SQLiteEventStore$8DhP1OvEO8M6Rk0AUupPmfOot0Y implements SQLiteEventStore.Function {
    public static final /* synthetic */ $$Lambda$SQLiteEventStore$8DhP1OvEO8M6Rk0AUupPmfOot0Y INSTANCE = new $$Lambda$SQLiteEventStore$8DhP1OvEO8M6Rk0AUupPmfOot0Y();

    private /* synthetic */ $$Lambda$SQLiteEventStore$8DhP1OvEO8M6Rk0AUupPmfOot0Y() {
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$loadActiveContexts$9((Cursor) obj);
    }
}
