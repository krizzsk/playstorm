package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a */
/* compiled from: FullViewManager */
public class C8874a {

    /* renamed from: b */
    private static volatile C8874a f21652b;

    /* renamed from: a */
    private WeakReference<Context> f21653a;

    private C8874a(Context context) {
        this.f21653a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static C8874a m25853a(Context context) {
        if (f21652b == null) {
            synchronized (C8874a.class) {
                if (f21652b == null) {
                    f21652b = new C8874a(context);
                }
            }
        }
        return f21652b;
    }

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$a */
    /* compiled from: FullViewManager */
    private class C8877a implements C8428c {

        /* renamed from: b */
        private WeakReference<MBridgeTopFullView> f21659b;

        public final void onFailedLoad(String str, String str2) {
        }

        public C8877a(MBridgeTopFullView mBridgeTopFullView) {
            this.f21659b = new WeakReference<>(mBridgeTopFullView);
        }

        public final void onSuccessLoad(Bitmap bitmap, String str) {
            WeakReference<MBridgeTopFullView> weakReference = this.f21659b;
            if (weakReference != null && weakReference.get() != null) {
                ((MBridgeTopFullView) this.f21659b.get()).getMBridgeFullViewDisplayIcon().setImageBitmap(C8874a.m25852a(C8874a.this, bitmap, 25));
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$2 */
    /* compiled from: FullViewManager */
    static /* synthetic */ class C88762 {

        /* renamed from: a */
        static final /* synthetic */ int[] f21657a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a[] r0 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8873a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21657a = r0
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a r1 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8873a.FULL_TOP_VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21657a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a r1 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8873a.FULL_MIDDLE_VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.mbfullview.C8874a.C88762.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo58473a(BaseView.C8873a aVar, CampaignEx campaignEx, BaseView baseView) {
        int i = C88762.f21657a[aVar.ordinal()];
        if (i == 1) {
            MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
            if (mBridgeTopFullView != null) {
                Context context = (Context) this.f21653a.get();
                if (context != null) {
                    C8425b.m24339a(context).mo57506a(campaignEx.getIconUrl(), (C8428c) new C8877a(mBridgeTopFullView));
                }
                mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setText(campaignEx.getAppName());
                mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setText(campaignEx.getAppDesc());
                mBridgeTopFullView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
                mBridgeTopFullView.getStarLevelLayoutView().setRating((int) campaignEx.getRating());
            }
        } else if (i == 2) {
            baseView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
        }
    }

    /* renamed from: a */
    public final void mo58475a(boolean z, BaseView baseView, int i) {
        RelativeLayout.LayoutParams layoutParams;
        Context context = (Context) this.f21653a.get();
        if (context != null) {
            if (z) {
                layoutParams = new RelativeLayout.LayoutParams((int) (m25851a(z) / 3.0f), C8613y.m24929b(context, 45.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = C8613y.m24929b(context, 10.0f);
                layoutParams.rightMargin = C8613y.m24769a(context) && i == 0 ? C8613y.m24956k(context) + C8613y.m24929b(context, 8.0f) : C8613y.m24929b(context, 8.0f);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, C8613y.m24929b(context, 45.0f));
                layoutParams.addRule(12);
            }
            baseView.getmAnimationContent().setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private float m25851a(boolean z) {
        try {
            Context context = (Context) this.f21653a.get();
            if (context == null) {
                return 0.0f;
            }
            float i = (float) C8613y.m24952i(context);
            return z ? i + ((float) C8613y.m24956k(context)) : i;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: a */
    public final void mo58476a(final boolean z, boolean z2, final BaseView baseView) {
        int parseColor = Color.parseColor("#ff264870");
        baseView.getmAnimationPlayer().setBackgroundColor(parseColor);
        Context context = (Context) this.f21653a.get();
        if (z) {
            if (baseView.style == BaseView.C8873a.FULL_TOP_VIEW && context != null) {
                baseView.getmAnimationContent().setBackgroundResource(C8594o.m24812a(context, "mbridge_nativex_fullview_background", "drawable"));
                baseView.getmAnimationPlayer().setBackgroundColor(parseColor);
            }
            if (z2) {
                baseView.getmAnimationPlayer().getBackground().setAlpha(80);
            } else {
                baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
                baseView.getmAnimationPlayer().getBackground().setAlpha(200);
            }
        } else if (baseView.style != BaseView.C8873a.FULL_MIDDLE_VIEW) {
            if (context != null) {
                baseView.getmAnimationContent().setBackgroundResource(C8594o.m24812a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                baseView.getmAnimationPlayer().setBackgroundResource(C8594o.m24812a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                return;
            }
            return;
        }
        if (z2) {
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
                    baseView.getmAnimationPlayer().getBackground().setAlpha(z ? 200 : 255);
                    C8874a.m25854a(C8874a.this, (View) baseView.getmAnimationPlayer());
                }
            }, 1000);
        }
    }

    /* renamed from: a */
    public final void mo58472a(View view, BaseView baseView) {
        if (view != null && baseView != null) {
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            baseView.f21644i.addView(view);
        }
    }

    /* renamed from: a */
    public final void mo58474a(BaseView baseView, boolean z) {
        if (baseView != null && Build.VERSION.SDK_INT >= 11) {
            baseView.setSystemUiVisibility(z ? 0 : InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Bitmap m25852a(C8874a aVar, Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        bitmap.getWidth();
        float f = (float) i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: a */
    static /* synthetic */ void m25854a(C8874a aVar, View view) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
            alphaAnimation.setDuration(800);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatCount(2);
            alphaAnimation.setRepeatMode(1);
            view.startAnimation(alphaAnimation);
        }
    }
}
