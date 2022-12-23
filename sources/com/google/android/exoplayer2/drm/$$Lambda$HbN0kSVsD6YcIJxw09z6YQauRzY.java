package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.-$$Lambda$HbN0kSVsD6YcIJxw09z6YQauRzY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HbN0kSVsD6YcIJxw09z6YQauRzY implements Consumer {
    public static final /* synthetic */ $$Lambda$HbN0kSVsD6YcIJxw09z6YQauRzY INSTANCE = new $$Lambda$HbN0kSVsD6YcIJxw09z6YQauRzY();

    private /* synthetic */ $$Lambda$HbN0kSVsD6YcIJxw09z6YQauRzY() {
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
    }
}
