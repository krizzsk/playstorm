package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.dislike.C3780c;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.util.ArrayList;

public class TTAdDislikeDialog extends FrameLayout {

    /* renamed from: a */
    private View f7606a;

    /* renamed from: b */
    private TTDislikeListView f7607b;

    /* renamed from: c */
    private TTDislikeListView f7608c;

    /* renamed from: d */
    private RelativeLayout f7609d;

    /* renamed from: e */
    private View f7610e;

    /* renamed from: f */
    private C3780c.C3787b f7611f;

    /* renamed from: g */
    private C3780c.C3787b f7612g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3498n f7613h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3222a f7614i;

    /* renamed from: j */
    private boolean f7615j;

    /* renamed from: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a */
    public interface C3222a {
        /* renamed from: a */
        void mo18404a(int i, FilterWord filterWord);

        /* renamed from: a */
        void mo18405a(View view);

        /* renamed from: b */
        void mo18406b(View view);

        /* renamed from: c */
        void mo18407c(View view);
    }

    public TTAdDislikeDialog(Context context, C3498n nVar) {
        this(context.getApplicationContext());
        this.f7613h = nVar;
        m9395c();
    }

    public TTAdDislikeDialog(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7615j = false;
        m9389a(context, attributeSet);
    }

    /* renamed from: a */
    private void m9389a(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTAdDislikeDialog.this.mo18868b();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f7606a = LayoutInflater.from(context).inflate(C2984t.m8433f(context, "tt_dislike_dialog_layout"), this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = C4020v.m13315e(getContext(), 20.0f);
        layoutParams.rightMargin = C4020v.m13315e(getContext(), 20.0f);
        this.f7606a.setLayoutParams(layoutParams);
        this.f7606a.setClickable(true);
        m9396d();
        m9395c();
    }

    /* renamed from: c */
    private void m9395c() {
        if (this.f7613h != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            C3780c.C3787b bVar = new C3780c.C3787b(from, this.f7613h.mo19661ae());
            this.f7611f = bVar;
            this.f7607b.setAdapter(bVar);
            C3780c.C3787b bVar2 = new C3780c.C3787b(from, new ArrayList());
            this.f7612g = bVar2;
            bVar2.mo20600a(false);
            this.f7608c.setAdapter(this.f7612g);
            this.f7607b.setMaterialMeta(this.f7613h);
            this.f7608c.setMaterialMeta(this.f7613h);
        }
    }

    /* renamed from: d */
    private void m9396d() {
        this.f7609d = (RelativeLayout) this.f7606a.findViewById(C2984t.m8432e(getContext(), "tt_dislike_title_content"));
        this.f7610e = this.f7606a.findViewById(C2984t.m8432e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) this.f7606a.findViewById(C2984t.m8432e(getContext(), "tt_dislike_header_back"));
        textView.setText(C2984t.m8425a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) this.f7606a.findViewById(C2984t.m8432e(getContext(), "tt_dislike_header_tv"))).setText(C2984t.m8425a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTAdDislikeDialog.this.m9397e();
                if (TTAdDislikeDialog.this.f7614i != null) {
                    TTAdDislikeDialog.this.f7614i.mo18407c(view);
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.f7606a.findViewById(C2984t.m8432e(getContext(), "tt_filer_words_lv"));
        this.f7607b = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x0027 }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x0027 }
                    boolean r2 = r1.hasSecondOptions()     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0027
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    r2.m9390a((com.bytedance.sdk.openadsdk.FilterWord) r1)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f7614i     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0026
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f7614i     // Catch:{ all -> 0x0027 }
                    r2.mo18404a(r3, r1)     // Catch:{ all -> 0x0027 }
                L_0x0026:
                    return
                L_0x0027:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r1 = r1.f7614i
                    if (r1 == 0) goto L_0x0048
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r1 = r1.f7614i     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.core.e.n r2 = r2.f7613h     // Catch:{ all -> 0x0048 }
                    java.util.List r2 = r2.mo19661ae()     // Catch:{ all -> 0x0048 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.FilterWord r2 = (com.bytedance.sdk.openadsdk.FilterWord) r2     // Catch:{ all -> 0x0048 }
                    r1.mo18404a(r3, r2)     // Catch:{ all -> 0x0048 }
                L_0x0048:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    r1.mo18868b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.C32203.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.f7606a.findViewById(C2984t.m8432e(getContext(), "tt_filer_words_lv_second"));
        this.f7608c = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f7614i
                    if (r2 == 0) goto L_0x001b
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x001b }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f7614i     // Catch:{ all -> 0x001b }
                    r2.mo18404a(r3, r1)     // Catch:{ all -> 0x001b }
                L_0x001b:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    r1.mo18868b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.C32214.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
    }

    /* renamed from: a */
    public void mo18867a() {
        if (this.f7606a.getParent() == null) {
            addView(this.f7606a);
        }
        m9397e();
        setVisibility(0);
        this.f7615j = true;
        C3222a aVar = this.f7614i;
        if (aVar != null) {
            aVar.mo18405a(this);
        }
    }

    /* renamed from: b */
    public void mo18868b() {
        setVisibility(8);
        this.f7615j = false;
        C3222a aVar = this.f7614i;
        if (aVar != null) {
            aVar.mo18406b(this);
        }
    }

    public void setCallback(C3222a aVar) {
        this.f7614i = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m9397e() {
        RelativeLayout relativeLayout = this.f7609d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f7610e;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f7607b;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        C3780c.C3787b bVar = this.f7612g;
        if (bVar != null) {
            bVar.mo20598a();
        }
        TTDislikeListView tTDislikeListView2 = this.f7608c;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9390a(FilterWord filterWord) {
        if (filterWord != null) {
            C3780c.C3787b bVar = this.f7612g;
            if (bVar != null) {
                bVar.mo20599a(filterWord.getOptions());
            }
            RelativeLayout relativeLayout = this.f7609d;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            View view = this.f7610e;
            if (view != null) {
                view.setVisibility(0);
            }
            TTDislikeListView tTDislikeListView = this.f7607b;
            if (tTDislikeListView != null) {
                tTDislikeListView.setVisibility(8);
            }
            TTDislikeListView tTDislikeListView2 = this.f7608c;
            if (tTDislikeListView2 != null) {
                tTDislikeListView2.setVisibility(0);
            }
        }
    }
}
