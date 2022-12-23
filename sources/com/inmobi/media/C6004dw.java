package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.dw */
/* compiled from: ViewableAd */
public abstract class C6004dw {

    /* renamed from: a */
    protected C6286j f15271a;

    /* renamed from: b */
    C6005a f15272b;

    /* renamed from: c */
    protected C6125fq f15273c;

    /* renamed from: d */
    private WeakReference<View> f15274d;

    /* renamed from: a */
    public abstract View mo35114a(View view, ViewGroup viewGroup, boolean z);

    /* renamed from: a */
    public abstract void mo35116a(byte b);

    /* renamed from: a */
    public abstract void mo35117a(Context context, byte b);

    /* renamed from: a */
    public abstract void mo35119a(Map<View, FriendlyObstructionPurpose> map);

    /* renamed from: c */
    public View mo35121c() {
        return null;
    }

    /* renamed from: d */
    public abstract void mo35122d();

    /* renamed from: com.inmobi.media.dw$a */
    /* compiled from: ViewableAd */
    public static abstract class C6005a {

        /* renamed from: a */
        public boolean f15275a;

        /* renamed from: a */
        public abstract View mo35124a(View view, ViewGroup viewGroup, boolean z, C6337q qVar);

        /* renamed from: a */
        public void mo35125a() {
            if (!this.f15275a) {
                this.f15275a = true;
            }
        }
    }

    public C6004dw(C6286j jVar) {
        this.f15271a = jVar;
        this.f15273c = jVar.getAdConfig();
    }

    /* renamed from: a */
    public C6005a mo35115a() {
        return this.f15272b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35118a(View view) {
        this.f15274d = new WeakReference<>(view);
    }

    /* renamed from: b */
    public View mo35120b() {
        WeakReference<View> weakReference = this.f15274d;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: e */
    public void mo35123e() {
        WeakReference<View> weakReference = this.f15274d;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
