package com.bytedance.sdk.openadsdk.p129a;

import com.bytedance.sdk.component.utils.C2975l;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.sdk.openadsdk.a.b */
/* compiled from: TotalCountLruDiskFile */
public class C3019b extends C3016a {

    /* renamed from: a */
    private int f6926a = 15;

    /* renamed from: b */
    private int f6927b = 3;

    /* renamed from: c */
    private volatile boolean f6928c;

    public C3019b(int i, int i2) {
        if (i > 0) {
            this.f6926a = i;
            this.f6927b = i2;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    public C3019b(int i, int i2, boolean z) {
        if (i > 0) {
            this.f6926a = i;
            this.f6927b = i2;
            this.f6928c = z;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18367a(long j, int i) {
        return i <= this.f6926a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18368a(File file, long j, int i) {
        return i <= this.f6927b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18366a(List<File> list) {
        if (this.f6928c) {
            m8569d(list);
            this.f6928c = false;
            return;
        }
        m8568c(list);
    }

    /* renamed from: c */
    private void m8568c(List<File> list) {
        long b = mo18369b(list);
        int size = list.size();
        if (!mo18367a(b, size)) {
            for (File next : list) {
                long length = next.length();
                if (next.delete()) {
                    size--;
                    b -= length;
                    C2975l.m8387c("TotalCountLruDiskFile", "Cache file " + next + " is deleted because it exceeds cache limit");
                } else {
                    C2975l.m8387c("TotalCountLruDiskFile", "Error deleting file " + next + " for trimming cache");
                }
                if (mo18368a(next, b, size)) {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private void m8569d(List<File> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    long b = mo18369b(list);
                    int size = list.size();
                    boolean a = mo18367a(b, size);
                    if (a) {
                        C2975l.m8387c("splashLoadAd", "Do not meet the delete condition, do not perform a delete operation(true)" + a);
                        return;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (File next : list) {
                        treeMap.put(Long.valueOf(next.lastModified()), next);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null) {
                            if (!a) {
                                C2975l.m8391e("splashLoadAd", "LRUDeleteFile deleting fileTime " + ((Long) entry.getKey()).longValue());
                                File file = (File) entry.getValue();
                                long length = file.length();
                                if (file.delete()) {
                                    size--;
                                    b -= length;
                                    C2975l.m8387c("splashLoadAd", "Delete, the current total number of a Cache file：" + size);
                                } else {
                                    C2975l.m8391e("splashLoadAd", "Error deleting file " + file + " for trimming cache");
                                }
                                if (mo18368a(file, b, size)) {
                                    C2975l.m8387c("splashLoadAd", "Stop deleting, the current total number totalCount：" + size + " Maximum storage limit number maxCount " + this.f6926a + " Minimum number " + this.f6927b);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
