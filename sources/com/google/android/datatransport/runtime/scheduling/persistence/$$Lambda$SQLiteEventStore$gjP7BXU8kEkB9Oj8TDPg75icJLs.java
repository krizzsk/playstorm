package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.-$$Lambda$SQLiteEventStore$gjP7BXU8kEkB9Oj8TDPg75icJLs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SQLiteEventStore$gjP7BXU8kEkB9Oj8TDPg75icJLs implements SQLiteEventStore.Function {
    public static final /* synthetic */ $$Lambda$SQLiteEventStore$gjP7BXU8kEkB9Oj8TDPg75icJLs INSTANCE = new $$Lambda$SQLiteEventStore$gjP7BXU8kEkB9Oj8TDPg75icJLs();

    private /* synthetic */ $$Lambda$SQLiteEventStore$gjP7BXU8kEkB9Oj8TDPg75icJLs() {
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$readPayload$15((Cursor) obj);
    }
}
