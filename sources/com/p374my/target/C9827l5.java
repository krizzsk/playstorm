package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.tracker.MyTracker;

/* renamed from: com.my.target.l5 */
public final class C9827l5 extends C9736h5 {

    /* renamed from: com.my.target.l5$a */
    public static final class C9828a {

        /* renamed from: a */
        public static final String f24254a;

        static {
            String str;
            try {
                str = MyTracker.getTrackerConfig().getId();
                if (TextUtils.isEmpty(str)) {
                    C9672e0.m27882a("MyTrackerHelper: myTracker id is empty");
                    str = null;
                }
            } catch (Throwable th) {
                C9672e0.m27882a("MyTrackerHelper: error occurred while working with myTracker, " + th.getMessage());
            }
            f24254a = str;
        }
    }

    public void collectData(Context context) {
        String str = C9828a.f24254a;
        if (str != null) {
            addParam("mtr_id", str);
        }
    }
}
