package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3445a;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3922a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3926e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p182b.C3936b;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import java.util.ArrayList;
import java.util.List;

public class TTDislikeListView extends ListView {

    /* renamed from: a */
    protected IListenerManager f9824a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3498n f9825b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AdapterView.OnItemClickListener f9826c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f9827d;

    /* renamed from: e */
    private AdapterView.OnItemClickListener f9828e = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (TTDislikeListView.this.getAdapter() == null || TTDislikeListView.this.getAdapter().getItem(i) == null || !(TTDislikeListView.this.getAdapter().getItem(i) instanceof FilterWord)) {
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
            FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i);
            if (!filterWord.hasSecondOptions()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(filterWord);
                if (TTDislikeListView.this.f9825b != null) {
                    C3156e.m9187a(TTDislikeListView.this.f9825b, (List<FilterWord>) arrayList);
                }
                if (!TextUtils.isEmpty(TTDislikeListView.this.f9827d)) {
                    if (C3953b.m12901c()) {
                        TTDislikeListView.this.m12415a("onItemClickClosed");
                    } else {
                        C3445a.C3452a e = C3524h.m10852d().mo19850e(TTDislikeListView.this.f9827d);
                        if (e != null) {
                            e.mo19451a();
                            C3524h.m10852d().mo19856f(TTDislikeListView.this.f9827d);
                        }
                    }
                }
            }
            try {
                if (TTDislikeListView.this.f9826c != null) {
                    TTDislikeListView.this.f9826c.onItemClick(adapterView, view, i, j);
                }
            } catch (Throwable unused) {
            }
        }
    };

    public TTDislikeListView(Context context) {
        super(context);
        m12411a();
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12411a();
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12411a();
    }

    public void setMaterialMeta(C3498n nVar) {
        this.f9825b = nVar;
    }

    /* renamed from: a */
    private void m12411a() {
        super.setOnItemClickListener(this.f9828e);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f9826c = onItemClickListener;
    }

    public void setClosedListenerKey(String str) {
        this.f9827d = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12415a(final String str) {
        C2952e.m8317c(new C2955g("Reward_executeMultiProcessCallback") {
            public void run() {
                try {
                    if (!TextUtils.isEmpty(TTDislikeListView.this.f9827d)) {
                        TTDislikeListView.this.mo20574a(6).executeDisLikeClosedCallback(TTDislikeListView.this.f9827d, str);
                    }
                } catch (Throwable th) {
                    C2975l.m8388c("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IListenerManager mo20574a(int i) {
        if (this.f9824a == null) {
            this.f9824a = C3922a.asInterface(C3917a.m12866a(C3578m.m11231a()).mo20811a(i));
        }
        return this.f9824a;
    }

    /* renamed from: a */
    public static void m12413a(final int i, final String str, final C3445a.C3452a aVar) {
        if (C3953b.m12901c()) {
            C2952e.m8317c(new C2955g("DislikeClosed_registerMultiProcessListener") {
                public void run() {
                    C3917a a = C3917a.m12866a(C3578m.m11231a());
                    if (i == 6 && aVar != null) {
                        try {
                            C2975l.m8384b("TTDislikeListView", "start registerDislikeClickCloseListener ! ");
                            C3936b bVar = new C3936b(str, aVar);
                            IListenerManager asInterface = C3926e.asInterface(a.mo20811a(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, bVar);
                                C2975l.m8384b("TTDislikeListView", "end registerDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            C2975l.m8384b("TTDislikeListView", "multiProcess registerDislikeClickCloseListener error");
                        }
                    }
                }
            }, 5);
        }
    }

    /* renamed from: a */
    public static void m12412a(final int i, final String str) {
        if (C3953b.m12901c()) {
            C2952e.m8317c(new C2955g("DislikeClosed_unregisterMultiProcessListener") {
                public void run() {
                    C3917a a = C3917a.m12866a(C3578m.m11231a());
                    if (i == 6) {
                        try {
                            C2975l.m8384b("TTDislikeListView", "start unregisterDislikeClickCloseListener ! ");
                            IListenerManager asInterface = C3926e.asInterface(a.mo20811a(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                                C2975l.m8384b("TTDislikeListView", "end unregisterDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException unused) {
                            C2975l.m8384b("TTDislikeListView", "multiProcess unregisterMultiProcessListener error");
                        }
                    }
                }
            }, 5);
        }
    }
}
