package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p095b.C2622c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3765x;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3606d;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3610e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3611f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3621m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.dislike.C3778b;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4010q;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a */
/* compiled from: TTBannerExpressAdImpl */
public class C3445a extends C3621m implements C2989x.C2990a {

    /* renamed from: a */
    protected BannerExpressView f8350a;

    /* renamed from: b */
    protected final Context f8351b;

    /* renamed from: c */
    protected C3498n f8352c;

    /* renamed from: d */
    protected AdSlot f8353d;

    /* renamed from: e */
    protected TTNativeExpressAd.ExpressAdInteractionListener f8354e;

    /* renamed from: f */
    TTDislikeDialogAbstract f8355f;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3778b f8356h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4026c f8357i;

    /* renamed from: j */
    private C2989x f8358j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f8359k;

    /* renamed from: l */
    private int f8360l = 0;

    /* renamed from: m */
    private TTAdDislike.DislikeInteractionCallback f8361m;

    /* renamed from: n */
    private Context f8362n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Queue<Long> f8363o = new LinkedList();

    /* renamed from: p */
    private boolean f8364p;

    /* renamed from: q */
    private boolean f8365q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Double f8366r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f8367s = "banner_ad";
    /* access modifiers changed from: private */

    /* renamed from: t */
    public NativeExpressView f8368t;

    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a$a */
    /* compiled from: TTBannerExpressAdImpl */
    public interface C3452a {
        /* renamed from: a */
        void mo19451a();
    }

    public C3445a(Context context, C3498n nVar, AdSlot adSlot) {
        this.f8351b = context;
        this.f8352c = nVar;
        this.f8353d = adSlot;
        mo19447a(context, nVar, adSlot);
    }

    /* renamed from: a */
    public void mo19447a(Context context, C3498n nVar, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, nVar, adSlot);
        this.f8350a = bannerExpressView;
        mo19448a(bannerExpressView.getCurView(), this.f8352c);
    }

    public View getExpressAdView() {
        return this.f8350a;
    }

    public int getImageMode() {
        C3498n nVar = this.f8352c;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19660ad();
    }

    public List<FilterWord> getFilterWords() {
        C3498n nVar = this.f8352c;
        if (nVar == null) {
            return null;
        }
        return nVar.mo19661ae();
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f8354e = expressAdInteractionListener;
        this.f8350a.setExpressInteractionListener(expressAdInteractionListener);
    }

    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
        this.f8354e = adInteractionListener;
        this.f8350a.setExpressInteractionListener(adInteractionListener);
    }

    public int getInteractionType() {
        C3498n nVar = this.f8352c;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19609L();
    }

    public void render() {
        this.f8350a.mo19432b();
    }

    public void destroy() {
        BannerExpressView bannerExpressView = this.f8350a;
        if (bannerExpressView != null) {
            bannerExpressView.mo19433c();
        }
        m10327c();
    }

    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (dislikeInteractionCallback != null && activity != null) {
            this.f8361m = dislikeInteractionCallback;
            m10318a(activity, dislikeInteractionCallback);
        }
    }

    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract == null) {
            C2975l.m8383b("dialog is null, please check");
            return;
        }
        this.f8355f = tTDislikeDialogAbstract;
        tTDislikeDialogAbstract.setMaterialMeta(this.f8352c);
        BannerExpressView bannerExpressView = this.f8350a;
        if (bannerExpressView != null && bannerExpressView.getCurView() != null) {
            this.f8350a.getCurView().setOuterDislike(tTDislikeDialogAbstract);
        }
    }

    /* renamed from: a */
    private void m10318a(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (this.f8356h == null) {
            this.f8356h = new C3778b(activity, this.f8352c);
        }
        this.f8362n = activity;
        this.f8356h.setDislikeInteractionCallback(dislikeInteractionCallback);
        BannerExpressView bannerExpressView = this.f8350a;
        if (bannerExpressView != null && bannerExpressView.getCurView() != null) {
            this.f8350a.getCurView().setDislike(this.f8356h);
        }
    }

    /* renamed from: a */
    private C4026c m10317a(C3498n nVar) {
        if (nVar.mo19609L() == 4) {
            return C4027d.m13342a(this.f8351b, nVar, this.f8367s);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10325b(C3498n nVar) {
        if (this.f8350a.getNextView() != null && this.f8350a.mo19436f()) {
            m10326b(this.f8350a.getNextView(), nVar);
            mo19448a(this.f8350a.getNextView(), nVar);
        }
    }

    /* renamed from: b */
    private void m10326b(NativeExpressView nativeExpressView, C3498n nVar) {
        if (nativeExpressView != null && nVar != null) {
            if (this.f8361m != null) {
                this.f8356h.mo20583a(nVar);
                if (nativeExpressView != null) {
                    nativeExpressView.setDislike(this.f8356h);
                }
            }
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f8355f;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
                if (nativeExpressView != null) {
                    nativeExpressView.setOuterDislike(this.f8355f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19448a(final NativeExpressView nativeExpressView, C3498n nVar) {
        if (nativeExpressView != null && nVar != null) {
            this.f8352c = nVar;
            this.f8357i = m10317a(nVar);
            this.f8368t = nativeExpressView;
            final String a = C4002l.m13120a();
            final C3452a a2 = mo19446a();
            nativeExpressView.setClosedListenerKey(a);
            nativeExpressView.setBannerClickClosedListener(a2);
            nativeExpressView.setBackupListener(new C2622c() {
                /* renamed from: a */
                public boolean mo16718a(ViewGroup viewGroup, int i) {
                    try {
                        nativeExpressView.mo20128m();
                        BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                        bannerExpressBackupView.setClosedListenerKey(a);
                        bannerExpressBackupView.mo19420a(C3445a.this.f8352c, nativeExpressView, C3445a.this.f8357i);
                        bannerExpressBackupView.setDislikeInner(C3445a.this.f8356h);
                        bannerExpressBackupView.setDislikeOuter(C3445a.this.f8355f);
                        return true;
                    } catch (Exception unused) {
                        return false;
                    }
                }
            });
            C3156e.m9179a(nVar);
            EmptyView a3 = m10314a((ViewGroup) nativeExpressView);
            if (a3 == null) {
                a3 = new EmptyView(this.f8351b, nativeExpressView);
                nativeExpressView.addView(a3);
            }
            final C3498n nVar2 = nVar;
            final EmptyView emptyView = a3;
            final NativeExpressView nativeExpressView2 = nativeExpressView;
            a3.setCallback(new EmptyView.C3399a() {
                /* renamed from: a */
                public void mo19364a(boolean z) {
                    if (z) {
                        C3445a.this.m10323b();
                        C2975l.m8384b("TTBannerExpressAd", "Get focus, start timing");
                    } else {
                        C3445a.this.m10327c();
                        C2975l.m8384b("TTBannerExpressAd", "Lose focus, stop timing");
                    }
                    C2952e.m8311b().execute(new C3453b(z, nVar2, C3445a.this));
                }

                /* renamed from: a */
                public void mo19362a() {
                    C3445a.this.m10323b();
                }

                /* renamed from: b */
                public void mo19365b() {
                    if (C3445a.this.f8350a != null) {
                        EmptyView emptyView = emptyView;
                        C3445a aVar = C3445a.this;
                        if (emptyView == aVar.m10314a((ViewGroup) aVar.f8350a.getCurView())) {
                            C3445a.this.m10327c();
                        }
                    }
                    C3445a.this.m10329c(nVar2);
                }

                /* renamed from: a */
                public void mo19363a(View view) {
                    C3524h.m10852d().mo19835a(a, a2);
                    C2975l.m8384b("TTBannerExpressAd", "ExpressView SHOW");
                    if (C3445a.this.f8363o != null) {
                        C3445a.this.f8363o.offer(Long.valueOf(System.currentTimeMillis()));
                    }
                    HashMap hashMap = new HashMap();
                    NativeExpressView nativeExpressView = nativeExpressView2;
                    if (nativeExpressView != null) {
                        hashMap.put("dynamic_show_type", Integer.valueOf(nativeExpressView.getDynamicShowType()));
                    }
                    if (view != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("width", view.getWidth());
                            jSONObject.put("height", view.getHeight());
                            jSONObject.put("alpha", (double) view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        hashMap.put("root_view", jSONObject.toString());
                    }
                    C3156e.m9175a(C3445a.this.f8351b, nVar2, C3445a.this.f8367s, (Map<String, Object>) hashMap, C3445a.this.f8366r);
                    if (C3445a.this.f8354e != null) {
                        C3445a.this.f8354e.onAdShow(view, nVar2.mo19609L());
                    }
                    if (nVar2.mo19665ai()) {
                        C4014u.m13188a(nVar2, view);
                    }
                    C3445a.this.m10323b();
                    if (!(C3445a.this.f9175g.getAndSet(true) || C3445a.this.f8350a == null || C3445a.this.f8350a.getCurView() == null || C3445a.this.f8350a.getCurView().getWebView() == null)) {
                        C4020v.m13279a(C3445a.this.f8351b, C3445a.this.f8352c, C3445a.this.f8367s, C3445a.this.f8350a.getCurView().getWebView().getWebView());
                    }
                    if (C3445a.this.f8350a != null && C3445a.this.f8350a.getCurView() != null) {
                        C3445a.this.f8350a.getCurView().mo20126k();
                        C3445a.this.f8350a.getCurView().mo20124i();
                    }
                }
            });
            C3611f fVar = new C3611f(this.f8351b, nVar, this.f8367s, 2);
            fVar.mo19396a((View) nativeExpressView);
            fVar.mo19399a((TTNativeExpressAd) this);
            fVar.mo19402a(this.f8357i);
            nativeExpressView.setClickListener(fVar);
            C3610e eVar = new C3610e(this.f8351b, nVar, this.f8367s, 2);
            eVar.mo19396a((View) nativeExpressView);
            eVar.mo19399a((TTNativeExpressAd) this);
            eVar.mo19402a(this.f8357i);
            nativeExpressView.setClickCreativeListener(eVar);
            a3.setNeedCheckingShow(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10323b() {
        C2989x xVar = this.f8358j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
            this.f8358j.sendEmptyMessageDelayed(112202, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10327c() {
        C2989x xVar = this.f8358j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10329c(C3498n nVar) {
        Queue<Long> queue = this.f8363o;
        if (queue != null && queue.size() > 0 && nVar != null) {
            try {
                long longValue = this.f8363o.poll().longValue();
                if (longValue > 0 && this.f8368t != null) {
                    C3156e.m9189a((System.currentTimeMillis() - longValue) + "", nVar, this.f8367s, this.f8368t.getAdShowTime());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a$b */
    /* compiled from: TTBannerExpressAdImpl */
    private static class C3453b implements Runnable {

        /* renamed from: a */
        boolean f8382a;

        /* renamed from: b */
        C3498n f8383b;

        /* renamed from: c */
        WeakReference<C3445a> f8384c;

        C3453b(boolean z, C3498n nVar, C3445a aVar) {
            this.f8382a = z;
            this.f8383b = nVar;
            this.f8384c = new WeakReference<>(aVar);
        }

        public void run() {
            WeakReference<C3445a> weakReference = this.f8384c;
            if (weakReference != null && weakReference.get() != null) {
                ((C3445a) this.f8384c.get()).m10321a(this.f8382a, this.f8383b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10321a(boolean z, C3498n nVar) {
        Long poll;
        if (z) {
            try {
                this.f8363o.offer(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (this.f8363o.size() > 0 && this.f8368t != null && (poll = this.f8363o.poll()) != null) {
            long longValue = poll.longValue();
            C3156e.m9189a((System.currentTimeMillis() - longValue) + "", nVar, this.f8367s, this.f8368t.getAdShowTime());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public EmptyView m10314a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C3498n nVar = this.f8352c;
        if (nVar != null) {
            return nVar.mo19666aj();
        }
        return null;
    }

    public String getAdCreativeToken() {
        return this.f8352c.mo19730n();
    }

    public void setSlideIntervalTime(int i) {
        if (i > 0) {
            this.f8367s = "slide_banner_ad";
            mo19448a(this.f8350a.getCurView(), this.f8352c);
            this.f8350a.setDuration(1000);
            if (i < 30000) {
                i = 30000;
            } else if (i > 120000) {
                i = 120000;
            }
            this.f8359k = i;
            this.f8358j = new C2989x(Looper.getMainLooper(), this);
            this.f8353d.setIsRotateBanner(1);
            this.f8353d.setRotateTime(this.f8359k);
            this.f8353d.setRotateOrder(1);
        }
    }

    /* renamed from: d */
    private void m10330d() {
        C3606d.m11392a(this.f8351b).mo20180a(this.f8353d, 1, (TTAdNative.NativeExpressAdListener) null, new C3606d.C3609a() {
            /* renamed from: a */
            public void mo19450a(List<C3498n> list) {
                if (list == null || list.isEmpty()) {
                    C3445a.this.m10323b();
                    return;
                }
                C3498n nVar = list.get(0);
                C3445a.this.f8350a.mo19429a(nVar, C3445a.this.f8353d);
                C3445a.this.m10325b(nVar);
                C3445a.this.f8350a.mo19434d();
            }

            /* renamed from: a */
            public void mo19449a() {
                C3445a.this.m10323b();
            }
        }, 5000);
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        if (message.what == 112202) {
            if (C3765x.m12370a(this.f8350a, 50, 1)) {
                this.f8360l += 1000;
            }
            if (this.f8360l >= this.f8359k) {
                m10330d();
                AdSlot adSlot = this.f8353d;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.f8360l = 0;
                m10327c();
                return;
            }
            m10323b();
        }
    }

    public void win(Double d) {
        if (!this.f8364p) {
            C4010q.m13163a(this.f8352c, d);
            this.f8364p = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f8365q) {
            C4010q.m13164a(this.f8352c, d, str, str2);
            this.f8365q = true;
        }
    }

    public void setPrice(Double d) {
        this.f8366r = d;
    }

    /* renamed from: a */
    public C3452a mo19446a() {
        return new C3452a() {
            /* renamed from: a */
            public void mo19451a() {
                View view;
                int width = C3445a.this.f8368t.getWidth();
                int height = C3445a.this.f8368t.getHeight();
                if (((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d)) {
                    view = LayoutInflater.from(C3445a.this.f8351b).inflate(C2984t.m8433f(C3445a.this.f8351b, "tt_banner_ad_closed_300_250"), (ViewGroup) null, false);
                } else {
                    view = LayoutInflater.from(C3445a.this.f8351b).inflate(C2984t.m8433f(C3445a.this.f8351b, "tt_banner_ad_closed_320_50"), (ViewGroup) null, false);
                }
                C3445a aVar = C3445a.this;
                EmptyView a = aVar.m10314a((ViewGroup) aVar.f8368t);
                C3445a.this.f8368t.removeAllViews();
                C3445a.this.f8368t.addView(view, new ViewGroup.LayoutParams(width, height));
                view.findViewById(C2984t.m8432e(C3445a.this.f8351b, "tt_ad_closed_page_logo")).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m8985a(C3445a.this.f8351b, C3445a.this.f8352c, C3445a.this.f8367s);
                    }
                });
                TextView textView = (TextView) view.findViewById(C2984t.m8432e(C3445a.this.f8351b, "tt_ad_closed_text"));
                textView.setText(C2984t.m8425a(C3445a.this.f8351b, "tt_ad_is_closed"));
                textView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m8985a(C3445a.this.f8351b, C3445a.this.f8352c, C3445a.this.f8367s);
                    }
                });
                C3445a.this.f8368t.setClickCreativeListener((C3610e) null);
                C3445a.this.f8368t.setClickListener((C3611f) null);
                if (C3578m.m11241h().mo19961n() == 1) {
                    C3445a.this.m10327c();
                } else if (C3445a.this.f8359k != 0) {
                    C3445a.this.f8368t.addView(a);
                }
            }
        };
    }
}
