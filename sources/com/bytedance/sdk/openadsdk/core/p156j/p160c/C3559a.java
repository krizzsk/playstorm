package com.bytedance.sdk.openadsdk.core.p156j.p160c;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c.a */
/* compiled from: ResourceHelper */
public class C3559a {

    /* renamed from: a */
    public static final Set<String> f8943a = new HashSet<String>() {
        {
            add(MimeTypes.IMAGE_JPEG);
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };

    /* renamed from: b */
    public static Set<String> f8944b = new HashSet<String>() {
        {
            add("application/x-javascript");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c.a$a */
    /* compiled from: ResourceHelper */
    public enum C3562a {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c.a$b */
    /* compiled from: ResourceHelper */
    public enum C3563b {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* renamed from: a */
    public static Point m11141a(Context context, int i, int i2, C3563b bVar) {
        if (context == null) {
            context = C3578m.m11231a();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int e = C4020v.m13315e(context, (float) i);
        int e2 = C4020v.m13315e(context, (float) i2);
        if (e <= width && e2 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (C3563b.HTML_RESOURCE == bVar) {
            point2.x = Math.min(width, e);
            point2.y = Math.min(height, e2);
        } else {
            float f = (float) e;
            float f2 = f / ((float) width);
            float f3 = (float) e2;
            float f4 = f3 / ((float) height);
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = C4020v.m13311d(context, (float) point2.x);
        point2.y = C4020v.m13311d(context, (float) point2.y);
        return point2;
    }
}
