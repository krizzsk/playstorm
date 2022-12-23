package com.bykv.p068vk.openvk.component.video.api.p086d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bykv.p068vk.openvk.component.video.api.p084b.C2519a;
import java.lang.ref.WeakReference;

/* renamed from: com.bykv.vk.openvk.component.video.api.d.b */
/* compiled from: IMediaLayout */
public interface C2524b<T> extends C2519a {

    /* renamed from: com.bykv.vk.openvk.component.video.api.d.b$a */
    /* compiled from: IMediaLayout */
    public enum C2525a {
        hideCloseBtn,
        alwayShowBackBtn,
        alwayShowMediaView,
        fixedSize,
        hideBackBtn,
        hideTopMoreBtn
    }

    /* renamed from: a */
    void mo16423a();

    /* renamed from: a */
    void mo16424a(Drawable drawable);

    /* renamed from: a */
    void mo16425a(T t, WeakReference<Context> weakReference, boolean z);

    /* renamed from: a */
    void mo16426a(boolean z);

    /* renamed from: b */
    void mo16427b();

    /* renamed from: c */
    View mo16428c();
}
