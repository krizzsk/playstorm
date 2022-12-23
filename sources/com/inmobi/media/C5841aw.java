package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.inmobi.media.aw */
/* compiled from: AdAssetBatch */
public final class C5841aw {

    /* renamed from: a */
    public List<C5839av> f14732a = new ArrayList();

    /* renamed from: b */
    Set<C5895bn> f14733b;

    /* renamed from: c */
    Set<String> f14734c = new HashSet();

    /* renamed from: d */
    int f14735d;

    /* renamed from: e */
    int f14736e;

    /* renamed from: f */
    public String f14737f;

    /* renamed from: g */
    public String f14738g;

    /* renamed from: h */
    private String f14739h;

    /* renamed from: i */
    private String f14740i;

    /* renamed from: j */
    private final WeakReference<C5871bh> f14741j;

    public C5841aw(String str, String str2, Set<C5895bn> set, C5871bh bhVar) {
        this.f14739h = str;
        this.f14740i = str2;
        this.f14733b = set;
        this.f14741j = new WeakReference<>(bhVar);
    }

    public C5841aw(String str, Set<C5895bn> set, C5871bh bhVar, String str2) {
        this.f14739h = str;
        this.f14738g = str2;
        this.f14733b = set;
        this.f14741j = new WeakReference<>(bhVar);
    }

    /* renamed from: a */
    public final C5871bh mo34757a() {
        return (C5871bh) this.f14741j.get();
    }

    public final String toString() {
        return "AdAssetBatch{mRawAssets=" + this.f14733b + ", mBatchDownloadSuccessCount=" + this.f14735d + ", mBatchDownloadFailureCount=" + this.f14736e + '}';
    }
}
