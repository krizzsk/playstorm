package com.google.android.exoplayer2.p195ui;

import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.AdViewProvider */
public interface AdViewProvider {
    ViewGroup getAdViewGroup();

    List<AdOverlayInfo> getAdOverlayInfos() {
        return ImmutableList.m20745of();
    }
}
