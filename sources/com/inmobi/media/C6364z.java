package com.inmobi.media;

import android.view.MotionEvent;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.z */
/* compiled from: MovementGestureDetector */
public class C6364z {

    /* renamed from: a */
    public float f16169a;

    /* renamed from: b */
    public float f16170b;

    /* renamed from: c */
    public float f16171c;

    /* renamed from: d */
    public float f16172d;

    /* renamed from: e */
    public int f16173e;

    /* renamed from: f */
    public int f16174f;

    /* renamed from: g */
    public float f16175g;

    /* renamed from: h */
    public JSONArray f16176h;

    /* renamed from: i */
    public MotionEvent f16177i;

    /* renamed from: j */
    public int f16178j = Integer.MAX_VALUE;

    /* renamed from: k */
    public final C6365a f16179k;

    /* renamed from: l */
    private final String f16180l = C6364z.class.getSimpleName();

    /* renamed from: com.inmobi.media.z$a */
    /* compiled from: MovementGestureDetector */
    public interface C6365a {
        /* renamed from: a */
        void mo35606a(MotionEvent motionEvent);

        /* renamed from: a */
        void mo35607a(MotionEvent motionEvent, MotionEvent motionEvent2);

        /* renamed from: a */
        void mo35609a(C6364z zVar);
    }

    public C6364z(C6365a aVar) {
        this.f16179k = aVar;
        this.f16173e = -1;
        this.f16174f = -1;
    }

    /* renamed from: a */
    public static int m19150a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (int) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: a */
    public static float m19149a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float degrees = ((float) Math.toDegrees((double) (((float) Math.atan2((double) (f2 - f4), (double) (f - f3))) - ((float) Math.atan2((double) (f6 - f8), (double) (f5 - f7)))))) % 360.0f;
        if (degrees < -180.0f) {
            degrees += 360.0f;
        }
        return degrees > 180.0f ? degrees - 360.0f : degrees;
    }
}
