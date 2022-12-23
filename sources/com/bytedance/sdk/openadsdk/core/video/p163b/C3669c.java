package com.bytedance.sdk.openadsdk.core.video.p163b;

import com.bytedance.sdk.component.utils.C2964f;
import com.bytedance.sdk.openadsdk.p129a.C3019b;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.c */
/* compiled from: TotalCountLruDiskDir */
public class C3669c extends C3019b {
    public C3669c(int i, int i2) {
        super(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18366a(List<File> list) {
        int size = list.size();
        if (!mo18367a(0, size)) {
            for (File next : list) {
                C2964f.m8359c(next);
                size--;
                if (mo18368a(next, 0, size)) {
                    return;
                }
            }
        }
    }
}
