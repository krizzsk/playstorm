package com.mbridge.msdk.video.dynview.p360i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;

/* renamed from: com.mbridge.msdk.video.dynview.i.a */
/* compiled from: BlurUtil */
public class C9295a {

    /* renamed from: a */
    private static volatile C9295a f22531a;

    /* renamed from: a */
    public static C9295a m26655a() {
        if (f22531a == null) {
            synchronized (C9295a.class) {
                if (f22531a == null) {
                    f22531a = new C9295a();
                }
            }
        }
        return f22531a;
    }

    /* renamed from: a */
    public final Bitmap mo62489a(Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT < 17) {
                return m26654a(i);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(C2350a.m5601e().mo15792g());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(18.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m26654a(int i) {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            if (i == 1) {
                bitmap.eraseColor(Color.parseColor("#FF0000"));
            } else {
                bitmap.eraseColor(Color.parseColor("#FFFFFF"));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }
}
