package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.android.exoplayer2.C5487C;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.inmobi.media.cy */
/* compiled from: MediaRenderView */
public final class C5958cy extends VideoView implements Application.ActivityLifecycleCallbacks, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f15134l = C5958cy.class.getSimpleName();

    /* renamed from: a */
    public C5960a f15135a;

    /* renamed from: b */
    public Bitmap f15136b;

    /* renamed from: c */
    public ViewGroup f15137c;

    /* renamed from: d */
    public C5961b f15138d;

    /* renamed from: e */
    int f15139e;

    /* renamed from: f */
    boolean f15140f;

    /* renamed from: g */
    public String f15141g;

    /* renamed from: h */
    public String f15142h;

    /* renamed from: i */
    boolean f15143i;

    /* renamed from: j */
    int f15144j;

    /* renamed from: k */
    int f15145k;

    /* renamed from: m */
    private boolean f15146m = false;

    /* renamed from: n */
    private WeakReference<Activity> f15147n;

    /* renamed from: com.inmobi.media.cy$b */
    /* compiled from: MediaRenderView */
    interface C5961b {
        /* renamed from: a */
        void mo35066a();

        /* renamed from: a */
        void mo35067a(C5958cy cyVar);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
    }

    public C5958cy(Activity activity) {
        super(activity);
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f15139e = 100;
        this.f15144j = -1;
        this.f15145k = 0;
        this.f15140f = false;
        this.f15147n = new WeakReference<>(activity);
        C6227ho.m18539a((Context) activity, (Application.ActivityLifecycleCallbacks) this);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getHolder().setSizeFromLayout();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            Context c = C6227ho.m18551c();
            if (c != null) {
                setBackground(new BitmapDrawable(c.getResources(), this.f15136b));
                return;
            }
            return;
        }
        setBackgroundDrawable(new BitmapDrawable(this.f15136b));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mo35044a();
        return false;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                String unused = C5958cy.f15134l;
                if (C5958cy.this.f15135a == null) {
                    C5960a unused2 = C5958cy.this.f15135a = new C5960a(C5958cy.this.getContext());
                    C5958cy.this.f15135a.setAnchorView(C5958cy.this);
                    C5958cy cyVar = C5958cy.this;
                    cyVar.setMediaController(cyVar.f15135a);
                    C5958cy.this.requestLayout();
                    C5958cy.this.requestFocus();
                }
            }
        });
        int i = this.f15145k;
        if (i < getDuration()) {
            this.f15145k = i;
            seekTo(i);
        }
        this.f15143i = true;
        this.f15138d.mo35066a();
        start();
    }

    public final void setPlaybackData(String str) {
        this.f15142h = m17811a(str);
        this.f15141g = "anonymous";
        if (this.f15136b == null) {
            this.f15136b = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
            this.f15136b = m17812b(this.f15142h);
        }
    }

    public final void start() {
        if (!this.f15146m) {
            super.start();
        }
    }

    public final void pause() {
        super.pause();
    }

    /* renamed from: a */
    public final void mo35044a() {
        stopPlayback();
        m17814c();
        super.setMediaController((MediaController) null);
        this.f15135a = null;
        C5961b bVar = this.f15138d;
        if (bVar != null) {
            bVar.mo35067a(this);
        }
    }

    public final ViewGroup getViewContainer() {
        return this.f15137c;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.f15137c = viewGroup;
    }

    public final void setListener(C5961b bVar) {
        this.f15138d = bVar;
    }

    /* renamed from: c */
    private void m17814c() {
        ViewGroup viewGroup = this.f15137c;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f15137c);
            }
            ViewGroup viewGroup3 = (ViewGroup) getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f15137c = null;
        }
    }

    /* renamed from: a */
    public static String m17811a(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            if ((b & 128) > 0) {
                sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb.append(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & Ascii.f17944SI]}));
            } else {
                sb.append((char) b);
            }
        }
        try {
            return new String(sb.toString().getBytes(), C5487C.ISO88591_NAME);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static Bitmap m17812b(String str) {
        try {
            return (Bitmap) Class.forName("android.media.ThumbnailUtils").getDeclaredMethod("createVideoThumbnail", new Class[]{String.class, Integer.TYPE}).invoke((Object) null, new Object[]{str, 1});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: com.inmobi.media.cy$a */
    /* compiled from: MediaRenderView */
    public static class C5960a extends MediaController {
        public C5960a(Context context) {
            super(context);
        }

        public final void show(int i) {
            super.show(i);
            if (Build.VERSION.SDK_INT < 19) {
                try {
                    Field declaredField = MediaController.class.getDeclaredField("mAnchor");
                    declaredField.setAccessible(true);
                    View view = (View) declaredField.get(this);
                    Field declaredField2 = MediaController.class.getDeclaredField("mDecor");
                    declaredField2.setAccessible(true);
                    View view2 = (View) declaredField2.get(this);
                    Field declaredField3 = MediaController.class.getDeclaredField("mDecorLayoutParams");
                    declaredField3.setAccessible(true);
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) declaredField3.get(this);
                    Field declaredField4 = MediaController.class.getDeclaredField("mWindowManager");
                    declaredField4.setAccessible(true);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    view2.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(view.getHeight(), Integer.MIN_VALUE));
                    view2.setPadding(0, 0, 0, 0);
                    layoutParams.verticalMargin = 0.0f;
                    layoutParams.horizontalMargin = 0.0f;
                    layoutParams.width = view.getWidth();
                    layoutParams.gravity = 8388659;
                    layoutParams.x = iArr[0];
                    layoutParams.y = (iArr[1] + view.getHeight()) - view2.getMeasuredHeight();
                    ((WindowManager) declaredField4.get(this)).updateViewLayout(view2, layoutParams);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f15147n.get() != null && ((Activity) this.f15147n.get()).equals(activity)) {
            this.f15146m = false;
            start();
        }
    }

    public final void onActivityStopped(Activity activity) {
        Activity activity2 = (Activity) this.f15147n.get();
        if (activity2 != null && activity2.equals(activity)) {
            this.f15146m = true;
            if (getCurrentPosition() != 0) {
                this.f15145k = getCurrentPosition();
            }
            pause();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
