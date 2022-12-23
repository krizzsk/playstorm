package com.google.firebase.messaging;

import com.google.android.datatransport.Transformer;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* renamed from: com.google.firebase.messaging.-$$Lambda$uEJG-TB5tb-7m58JwTwENhOn6oY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uEJGTB5tb7m58JwTwENhOn6oY implements Transformer {
    public static final /* synthetic */ $$Lambda$uEJGTB5tb7m58JwTwENhOn6oY INSTANCE = new $$Lambda$uEJGTB5tb7m58JwTwENhOn6oY();

    private /* synthetic */ $$Lambda$uEJGTB5tb7m58JwTwENhOn6oY() {
    }

    public final Object apply(Object obj) {
        return ((MessagingClientEventExtension) obj).toByteArray();
    }
}
