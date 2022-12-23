package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.c */
/* compiled from: ViewOption */
public final class C9252c {

    /* renamed from: a */
    private Context f22408a;

    /* renamed from: b */
    private String f22409b;

    /* renamed from: c */
    private int f22410c;

    /* renamed from: d */
    private float f22411d;

    /* renamed from: e */
    private float f22412e;

    /* renamed from: f */
    private int f22413f;

    /* renamed from: g */
    private int f22414g;

    /* renamed from: h */
    private View f22415h;

    /* renamed from: i */
    private List<CampaignEx> f22416i;

    /* renamed from: j */
    private int f22417j;

    /* renamed from: k */
    private boolean f22418k;

    /* renamed from: com.mbridge.msdk.video.dynview.c$b */
    /* compiled from: ViewOption */
    public interface C9255b {
        /* renamed from: a */
        C9255b mo62374a(float f);

        /* renamed from: a */
        C9255b mo62375a(int i);

        /* renamed from: a */
        C9255b mo62376a(Context context);

        /* renamed from: a */
        C9255b mo62377a(View view);

        /* renamed from: a */
        C9255b mo62378a(String str);

        /* renamed from: a */
        C9255b mo62379a(List<CampaignEx> list);

        /* renamed from: a */
        C9255b mo62380a(boolean z);

        /* renamed from: a */
        C9252c mo62381a();

        /* renamed from: b */
        C9255b mo62382b(float f);

        /* renamed from: b */
        C9255b mo62383b(int i);

        /* renamed from: c */
        C9255b mo62384c(int i);

        /* renamed from: d */
        C9255b mo62385d(int i);
    }

    /* renamed from: a */
    public final Context mo62364a() {
        return this.f22408a;
    }

    /* renamed from: b */
    public final String mo62365b() {
        return this.f22409b;
    }

    /* renamed from: c */
    public final float mo62366c() {
        return this.f22411d;
    }

    /* renamed from: d */
    public final float mo62367d() {
        return this.f22412e;
    }

    /* renamed from: e */
    public final int mo62368e() {
        return this.f22413f;
    }

    /* renamed from: f */
    public final View mo62369f() {
        return this.f22415h;
    }

    /* renamed from: g */
    public final List<CampaignEx> mo62370g() {
        return this.f22416i;
    }

    /* renamed from: h */
    public final int mo62371h() {
        return this.f22410c;
    }

    /* renamed from: i */
    public final int mo62372i() {
        return this.f22417j;
    }

    /* renamed from: j */
    public final boolean mo62373j() {
        return this.f22418k;
    }

    private C9252c(C9254a aVar) {
        this.f22412e = aVar.f22423e;
        this.f22411d = aVar.f22422d;
        this.f22413f = aVar.f22424f;
        this.f22414g = aVar.f22425g;
        this.f22408a = aVar.f22419a;
        this.f22409b = aVar.f22420b;
        this.f22410c = aVar.f22421c;
        this.f22415h = aVar.f22426h;
        this.f22416i = aVar.f22427i;
        this.f22417j = aVar.f22428j;
        this.f22418k = aVar.f22429k;
    }

    /* renamed from: com.mbridge.msdk.video.dynview.c$a */
    /* compiled from: ViewOption */
    public static class C9254a implements C9255b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f22419a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f22420b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f22421c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public float f22422d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public float f22423e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f22424f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f22425g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public View f22426h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public List<CampaignEx> f22427i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f22428j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f22429k;

        /* renamed from: a */
        public final C9255b mo62376a(Context context) {
            this.f22419a = context.getApplicationContext();
            return this;
        }

        /* renamed from: a */
        public final C9255b mo62378a(String str) {
            this.f22420b = str;
            return this;
        }

        /* renamed from: a */
        public final C9255b mo62375a(int i) {
            this.f22421c = i;
            return this;
        }

        /* renamed from: a */
        public final C9255b mo62374a(float f) {
            this.f22422d = f;
            return this;
        }

        /* renamed from: b */
        public final C9255b mo62382b(float f) {
            this.f22423e = f;
            return this;
        }

        /* renamed from: b */
        public final C9255b mo62383b(int i) {
            this.f22424f = i;
            return this;
        }

        /* renamed from: c */
        public final C9255b mo62384c(int i) {
            this.f22425g = i;
            return this;
        }

        /* renamed from: a */
        public final C9255b mo62377a(View view) {
            this.f22426h = view;
            return this;
        }

        /* renamed from: a */
        public final C9255b mo62379a(List<CampaignEx> list) {
            this.f22427i = list;
            return this;
        }

        /* renamed from: d */
        public final C9255b mo62385d(int i) {
            this.f22428j = i;
            return this;
        }

        /* renamed from: a */
        public final C9255b mo62380a(boolean z) {
            this.f22429k = z;
            return this;
        }

        /* renamed from: a */
        public final C9252c mo62381a() {
            return new C9252c(this);
        }
    }
}
