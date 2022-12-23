package com.bytedance.sdk.openadsdk.core.p152f;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3573l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.dislike.C3778b;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.bytedance.sdk.openadsdk.utils.C4010q;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.f.a */
/* compiled from: TTNativeAdImpl */
public class C3510a implements TTNativeAd {

    /* renamed from: a */
    private int f8697a;

    /* renamed from: b */
    private boolean f8698b;

    /* renamed from: c */
    private boolean f8699c;
    /* access modifiers changed from: protected */

    /* renamed from: g */
    public final C3573l f8700g;

    /* renamed from: h */
    protected final C3498n f8701h;

    /* renamed from: i */
    protected final Context f8702i;

    /* renamed from: j */
    protected TTAdDislike f8703j;

    /* renamed from: k */
    protected int f8704k;

    /* renamed from: l */
    protected String f8705l;

    /* renamed from: a */
    private String m10819a(int i) {
        return i != 1 ? i != 2 ? (i == 5 || i != 9) ? "embeded_ad" : "draw_ad" : "interaction" : "banner_ad";
    }

    public View getAdView() {
        return null;
    }

    public C3510a(Context context, C3498n nVar, int i) {
        if (nVar == null) {
            C2975l.m8383b("materialMeta can't been null");
        }
        this.f8701h = nVar;
        this.f8702i = context;
        this.f8704k = i;
        this.f8700g = new C3573l(this.f8702i, this, nVar, m10819a(i));
    }

    public void registerViewForInteraction(ViewGroup viewGroup, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C2975l.m8383b("container can't been null");
        } else if (view == null) {
            C2975l.m8383b("clickView can't been null");
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(view);
            registerViewForInteraction(viewGroup, arrayList, (List<View>) null, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C2975l.m8383b("container can't been null");
        } else if (list == null) {
            C2975l.m8383b("clickView can't been null");
        } else if (list.size() <= 0) {
            C2975l.m8383b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, list, list2, (View) null, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C2975l.m8383b("container can't been null");
        } else if (list == null) {
            C2975l.m8383b("clickView can't been null");
        } else if (list.size() <= 0) {
            C2975l.m8383b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, (List<View>) null, list, list2, view, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C2975l.m8383b("container can't been null");
        } else if (list2 == null) {
            C2975l.m8383b("clickView can't been null");
        } else if (list2.size() <= 0) {
            C2975l.m8383b("clickViews size must been more than 1");
        } else {
            m10822a(list3 != null && list3.size() > 0);
            if (m10823a()) {
                list3 = m10820a(list2, list3);
            }
            this.f8700g.mo20067a(viewGroup, list, list2, list3, view, adInteractionListener);
        }
    }

    /* renamed from: a */
    private List<View> m10820a(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }

    public TTImage getVideoCoverImage() {
        C3498n nVar = this.f8701h;
        if (nVar == null || nVar.mo19607J() == null) {
            return null;
        }
        return new TTImage(this.f8701h.mo19607J().mo16341b(), this.f8701h.mo19607J().mo16344c(), this.f8701h.mo19607J().mo16358h());
    }

    public Bitmap getAdLogo() {
        return BitmapFactory.decodeResource(this.f8702i.getResources(), C2984t.m8431d(C3578m.m11231a(), "tt_ad_logo_new"));
    }

    public String getTitle() {
        if (this.f8701h.mo19657aa() != null && !TextUtils.isEmpty(this.f8701h.mo19657aa().mo19495b())) {
            return this.f8701h.mo19657aa().mo19495b();
        }
        if (!TextUtils.isEmpty(getSource())) {
            return getSource();
        }
        return this.f8701h.mo19618U();
    }

    public String getDescription() {
        if (!TextUtils.isEmpty(this.f8701h.mo19618U())) {
            return this.f8701h.mo19618U();
        }
        return this.f8701h.mo19619V();
    }

    public String getButtonText() {
        return this.f8701h.mo19620W();
    }

    public int getAppScore() {
        if (this.f8701h.mo19657aa() != null) {
            return (int) this.f8701h.mo19657aa().mo19500d();
        }
        return 0;
    }

    public int getAppCommentNum() {
        if (this.f8701h.mo19657aa() != null) {
            return this.f8701h.mo19657aa().mo19501e();
        }
        return 0;
    }

    public int getAppSize() {
        if (this.f8701h.mo19657aa() != null) {
            return this.f8701h.mo19657aa().mo19502f();
        }
        return 0;
    }

    public String getSource() {
        return this.f8701h.mo19608K();
    }

    public TTImage getIcon() {
        if (this.f8701h.mo19610M() == null) {
            return null;
        }
        return C3484k.m10521a(this.f8701h.mo19610M());
    }

    public List<TTImage> getImageList() {
        ArrayList arrayList = new ArrayList();
        if (this.f8701h.mo19613P() != null && !this.f8701h.mo19613P().isEmpty()) {
            for (C3484k a : this.f8701h.mo19613P()) {
                arrayList.add(C3484k.m10521a(a));
            }
        }
        return arrayList;
    }

    public int getInteractionType() {
        C3498n nVar = this.f8701h;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19609L();
    }

    public int getImageMode() {
        C3498n nVar = this.f8701h;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19660ad();
    }

    public List<FilterWord> getFilterWords() {
        C3498n nVar = this.f8701h;
        if (nVar == null) {
            return null;
        }
        return nVar.mo19661ae();
    }

    public TTAdDislike getDislikeDialog(Activity activity) {
        if (this.f8703j == null) {
            m10821a(activity);
        }
        return this.f8703j;
    }

    public TTAdDislike getDislikeDialog(final TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(this.f8701h);
            return new TTAdDislike() {
                public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
                }

                public void showDislikeDialog() {
                    if ((tTDislikeDialogAbstract.getContext() instanceof Activity) && !((Activity) tTDislikeDialogAbstract.getContext()).isFinishing()) {
                        tTDislikeDialogAbstract.show();
                    }
                }
            };
        }
        throw new IllegalArgumentException("dialog is null, please check");
    }

    public View getAdLogoView() {
        if (this.f8702i == null) {
            C2975l.m8391e("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(this.f8702i);
        imageView.setImageResource(C2984t.m8431d(this.f8702i, "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3510a.this.showPrivacyActivity();
            }
        });
        return imageView;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C3498n nVar = this.f8701h;
        if (nVar != null) {
            return nVar.mo19666aj();
        }
        return null;
    }

    /* renamed from: a */
    private void m10821a(Activity activity) {
        Context context = this.f8702i;
        Context context2 = activity;
        if (context instanceof Activity) {
            context2 = activity;
            if (!((Activity) context).isFinishing()) {
                context2 = this.f8702i;
            }
        }
        this.f8703j = new C3778b(context2, this.f8701h);
    }

    /* renamed from: a */
    private void m10822a(boolean z) {
        C3814b c = C3814b.m12522b().mo20632a(this.f8704k).mo20637c(String.valueOf(C4014u.m13223f(this.f8701h)));
        if (z) {
            C3815b.m12552a().mo20668c(c);
        } else {
            C3815b.m12552a().mo20669d(c);
        }
    }

    /* renamed from: a */
    private boolean m10823a() {
        C3498n nVar = this.f8701h;
        if (nVar == null || nVar.mo19609L() == 5) {
            return false;
        }
        if (this.f8697a == 0) {
            this.f8697a = C4014u.m13223f(this.f8701h);
        }
        if (C3578m.m11241h().mo19934d(this.f8697a) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18944a(String str) {
        this.f8705l = str;
    }

    public void showPrivacyActivity() {
        Context context = this.f8702i;
        if (context != null) {
            TTWebsiteActivity.m8985a(context, this.f8701h, this.f8705l);
        }
    }

    public String getAdCreativeToken() {
        return this.f8701h.mo19730n();
    }

    public void win(Double d) {
        if (!this.f8698b) {
            C4010q.m13163a(this.f8701h, d);
            this.f8698b = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f8699c) {
            C4010q.m13164a(this.f8701h, d, str, str2);
            this.f8699c = true;
        }
    }

    public void setPrice(Double d) {
        C3573l lVar = this.f8700g;
        if (lVar != null) {
            lVar.mo20068a(d);
        }
    }
}
