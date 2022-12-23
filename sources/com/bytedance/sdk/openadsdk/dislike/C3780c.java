package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.c */
/* compiled from: TTDislikeDialogDefault */
public class C3780c extends TTDislikeDialogAbstract {

    /* renamed from: a */
    private TTDislikeListView f9844a;

    /* renamed from: b */
    private TTDislikeListView f9845b;

    /* renamed from: c */
    private RelativeLayout f9846c;

    /* renamed from: d */
    private View f9847d;

    /* renamed from: e */
    private C3787b f9848e;

    /* renamed from: f */
    private C3787b f9849f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3498n f9850g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3786a f9851h;

    /* renamed from: i */
    private String f9852i;

    /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$a */
    /* compiled from: TTDislikeDialogDefault */
    public interface C3786a {
        /* renamed from: a */
        void mo20585a();

        /* renamed from: a */
        void mo20586a(int i, FilterWord filterWord);

        /* renamed from: b */
        void mo20587b();

        /* renamed from: c */
        void mo20588c();
    }

    public C3780c(Context context, C3498n nVar) {
        super(context, C2984t.m8434g(context, "tt_dislikeDialog"));
        this.f9850g = nVar;
    }

    /* renamed from: a */
    public void mo20589a(C3498n nVar) {
        C3787b bVar = this.f9848e;
        if (bVar != null && nVar != null) {
            this.f9850g = nVar;
            bVar.mo20599a(nVar.mo19661ae());
            setMaterialMeta(this.f9850g);
        }
    }

    /* renamed from: a */
    public void mo20590a(C3786a aVar) {
        this.f9851h = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        m12430a();
        m12431a(getContext());
        m12434b();
        setMaterialMeta(this.f9850g);
    }

    /* renamed from: a */
    public void mo20591a(String str) {
        this.f9852i = str;
    }

    public int getLayoutId() {
        return C2984t.m8433f(getContext(), "tt_dislike_dialog_layout");
    }

    public int[] getTTDislikeListViewIds() {
        return new int[]{C2984t.m8432e(getContext(), "tt_filer_words_lv"), C2984t.m8432e(getContext(), "tt_filer_words_lv_second")};
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(C4020v.m13306c(getContext()) - 120, -2);
    }

    public void show() {
        super.show();
        m12437c();
    }

    /* renamed from: a */
    private void m12430a() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: b */
    private void m12434b() {
        setOnShowListener(new DialogInterface.OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                if (C3780c.this.f9851h != null) {
                    C3780c.this.f9851h.mo20585a();
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                if (C3780c.this.f9851h != null) {
                    C3780c.this.f9851h.mo20587b();
                }
            }
        });
        C3787b bVar = new C3787b(getLayoutInflater(), this.f9850g.mo19661ae());
        this.f9848e = bVar;
        this.f9844a.setAdapter(bVar);
        C3787b bVar2 = new C3787b(getLayoutInflater(), new ArrayList());
        this.f9849f = bVar2;
        bVar2.mo20600a(false);
        this.f9845b.setAdapter(this.f9849f);
    }

    /* renamed from: a */
    private void m12431a(Context context) {
        this.f9846c = (RelativeLayout) findViewById(C2984t.m8432e(getContext(), "tt_dislike_title_content"));
        this.f9847d = findViewById(C2984t.m8432e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) findViewById(C2984t.m8432e(getContext(), "tt_dislike_header_back"));
        textView.setText(C2984t.m8425a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) findViewById(C2984t.m8432e(getContext(), "tt_dislike_header_tv"))).setText(C2984t.m8425a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3780c.this.m12437c();
                if (C3780c.this.f9851h != null) {
                    C3780c.this.f9851h.mo20588c();
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(C2984t.m8432e(getContext(), "tt_filer_words_lv"));
        this.f9844a = tTDislikeListView;
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
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3780c.this     // Catch:{ all -> 0x0027 }
                    r2.m12432a((com.bytedance.sdk.openadsdk.FilterWord) r1)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3780c.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f9851h     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0026
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3780c.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f9851h     // Catch:{ all -> 0x0027 }
                    r2.mo20586a(r3, r1)     // Catch:{ all -> 0x0027 }
                L_0x0026:
                    return
                L_0x0027:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C3780c.this
                    com.bytedance.sdk.openadsdk.dislike.c$a r1 = r1.f9851h
                    if (r1 == 0) goto L_0x0048
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C3780c.this     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r1 = r1.f9851h     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3780c.this     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.core.e.n r2 = r2.f9850g     // Catch:{ all -> 0x0048 }
                    java.util.List r2 = r2.mo19661ae()     // Catch:{ all -> 0x0048 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.FilterWord r2 = (com.bytedance.sdk.openadsdk.FilterWord) r2     // Catch:{ all -> 0x0048 }
                    r1.mo20586a(r3, r2)     // Catch:{ all -> 0x0048 }
                L_0x0048:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C3780c.this
                    r1.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dislike.C3780c.C37844.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.f9844a.setClosedListenerKey(this.f9852i);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(C2984t.m8432e(getContext(), "tt_filer_words_lv_second"));
        this.f9845b = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3780c.this
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f9851h
                    if (r2 == 0) goto L_0x001b
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x001b }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3780c.this     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f9851h     // Catch:{ all -> 0x001b }
                    r2.mo20586a(r3, r1)     // Catch:{ all -> 0x001b }
                L_0x001b:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C3780c.this
                    r1.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dislike.C3780c.C37855.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.f9845b.setClosedListenerKey(this.f9852i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12437c() {
        RelativeLayout relativeLayout = this.f9846c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f9847d;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f9844a;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        C3787b bVar = this.f9849f;
        if (bVar != null) {
            bVar.mo20598a();
        }
        TTDislikeListView tTDislikeListView2 = this.f9845b;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12432a(FilterWord filterWord) {
        if (filterWord != null) {
            C3787b bVar = this.f9849f;
            if (bVar != null) {
                bVar.mo20599a(filterWord.getOptions());
            }
            RelativeLayout relativeLayout = this.f9846c;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            View view = this.f9847d;
            if (view != null) {
                view.setVisibility(0);
            }
            TTDislikeListView tTDislikeListView = this.f9844a;
            if (tTDislikeListView != null) {
                tTDislikeListView.setVisibility(8);
            }
            TTDislikeListView tTDislikeListView2 = this.f9845b;
            if (tTDislikeListView2 != null) {
                tTDislikeListView2.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$b */
    /* compiled from: TTDislikeDialogDefault */
    public static class C3787b extends BaseAdapter {

        /* renamed from: a */
        private boolean f9858a = true;

        /* renamed from: b */
        private final List<FilterWord> f9859b;

        /* renamed from: c */
        private final LayoutInflater f9860c;

        public long getItemId(int i) {
            return (long) i;
        }

        public C3787b(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.f9859b = list;
            this.f9860c = layoutInflater;
        }

        /* renamed from: a */
        public void mo20600a(boolean z) {
            this.f9858a = z;
        }

        public int getCount() {
            List<FilterWord> list = this.f9859b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f9859b.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C3788a aVar;
            if (view == null) {
                aVar = new C3788a();
                LayoutInflater layoutInflater = this.f9860c;
                view2 = layoutInflater.inflate(C2984t.m8433f(layoutInflater.getContext(), "tt_dialog_listview_item"), viewGroup, false);
                aVar.f9861a = (TextView) view2.findViewById(C2984t.m8432e(this.f9860c.getContext(), "tt_item_tv"));
                aVar.f9862b = (ImageView) view2.findViewById(C2984t.m8432e(this.f9860c.getContext(), "tt_item_arrow"));
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C3788a) view.getTag();
            }
            FilterWord filterWord = this.f9859b.get(i);
            aVar.f9861a.setText(filterWord.getName());
            if (i != this.f9859b.size() - 1) {
                aVar.f9861a.setBackgroundResource(C2984t.m8431d(this.f9860c.getContext(), "tt_dislike_middle_seletor"));
            } else {
                aVar.f9861a.setBackgroundResource(C2984t.m8431d(this.f9860c.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.f9858a && i == 0) {
                aVar.f9861a.setBackgroundResource(C2984t.m8431d(this.f9860c.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                aVar.f9862b.setVisibility(0);
            } else {
                aVar.f9862b.setVisibility(8);
            }
            return view2;
        }

        /* renamed from: a */
        public void mo20599a(List<FilterWord> list) {
            if (list != null && !list.isEmpty()) {
                this.f9859b.clear();
                this.f9859b.addAll(list);
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo20598a() {
            this.f9859b.clear();
            notifyDataSetChanged();
        }

        /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$b$a */
        /* compiled from: TTDislikeDialogDefault */
        private static class C3788a {

            /* renamed from: a */
            TextView f9861a;

            /* renamed from: b */
            ImageView f9862b;

            private C3788a() {
            }
        }
    }
}
