package com.p374my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.p374my.target.C9738h7;
import com.p374my.target.C9784j7;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.views.StarsRatingView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.i7 */
public class C9759i7 extends RecyclerView {

    /* renamed from: a */
    public final View.OnClickListener f24075a;

    /* renamed from: b */
    public final C9738h7 f24076b;

    /* renamed from: c */
    public final View.OnClickListener f24077c;

    /* renamed from: d */
    public final LinearSnapHelper f24078d;

    /* renamed from: e */
    public List<C9640c2> f24079e;

    /* renamed from: f */
    public C9784j7.C9786b f24080f;

    /* renamed from: g */
    public boolean f24081g;

    /* renamed from: h */
    public boolean f24082h;

    /* renamed from: com.my.target.i7$a */
    public class C9760a implements View.OnClickListener {
        public C9760a() {
        }

        public void onClick(View view) {
            View findContainingItemView;
            if (C9759i7.this.f24081g || (findContainingItemView = C9759i7.this.getCardLayoutManager().findContainingItemView(view)) == null) {
                return;
            }
            if (!C9759i7.this.getCardLayoutManager().mo64188a(findContainingItemView) && !C9759i7.this.f24082h) {
                C9759i7.this.mo64291a(findContainingItemView);
            } else if (view.isClickable() && C9759i7.this.f24080f != null && C9759i7.this.f24079e != null) {
                C9759i7.this.f24080f.mo64470a((C9640c2) C9759i7.this.f24079e.get(C9759i7.this.getCardLayoutManager().getPosition(findContainingItemView)));
            }
        }
    }

    /* renamed from: com.my.target.i7$b */
    public class C9761b implements View.OnClickListener {
        public C9761b() {
        }

        public void onClick(View view) {
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof C9721g7)) {
                parent = parent.getParent();
            }
            if (C9759i7.this.f24080f != null && C9759i7.this.f24079e != null && parent != null) {
                C9759i7.this.f24080f.mo64470a((C9640c2) C9759i7.this.f24079e.get(C9759i7.this.getCardLayoutManager().getPosition((View) parent)));
            }
        }
    }

    /* renamed from: com.my.target.i7$c */
    public static class C9762c extends RecyclerView.Adapter<C9763d> {

        /* renamed from: a */
        public final Context f24085a;

        /* renamed from: b */
        public final List<C9640c2> f24086b;

        /* renamed from: c */
        public final List<C9640c2> f24087c = new ArrayList();

        /* renamed from: d */
        public final boolean f24088d;

        /* renamed from: e */
        public View.OnClickListener f24089e;

        /* renamed from: f */
        public View.OnClickListener f24090f;

        public C9762c(List<C9640c2> list, Context context) {
            this.f24086b = list;
            this.f24085a = context;
            this.f24088d = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        }

        /* renamed from: a */
        public C9763d onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C9763d(new C9721g7(this.f24088d, this.f24085a));
        }

        /* renamed from: a */
        public List<C9640c2> mo64301a() {
            return this.f24086b;
        }

        /* renamed from: a */
        public void mo64302a(View.OnClickListener onClickListener) {
            this.f24090f = onClickListener;
        }

        /* renamed from: a */
        public final void mo64303a(C9640c2 c2Var, C9721g7 g7Var) {
            ImageData image = c2Var.getImage();
            if (image != null) {
                C9804k6 smartImageView = g7Var.getSmartImageView();
                smartImageView.setPlaceholderDimensions(image.getWidth(), image.getHeight());
                C9807k8.m28516b(image, smartImageView);
            }
            g7Var.getTitleTextView().setText(c2Var.getTitle());
            g7Var.getDescriptionTextView().setText(c2Var.getDescription());
            g7Var.getCtaButtonView().setText(c2Var.getCtaText());
            TextView domainTextView = g7Var.getDomainTextView();
            String domain = c2Var.getDomain();
            StarsRatingView ratingView = g7Var.getRatingView();
            if ("web".equals(c2Var.getNavigationType())) {
                ratingView.setVisibility(8);
                domainTextView.setVisibility(0);
                domainTextView.setText(domain);
                return;
            }
            domainTextView.setVisibility(8);
            float rating = c2Var.getRating();
            if (rating > 0.0f) {
                ratingView.setVisibility(0);
                ratingView.setRating(rating);
                return;
            }
            ratingView.setVisibility(8);
        }

        /* renamed from: a */
        public void onViewRecycled(C9763d dVar) {
            C9721g7 a = dVar.mo64307a();
            a.mo64109a((View.OnClickListener) null, (C9929r1) null);
            a.getCtaButtonView().setOnClickListener((View.OnClickListener) null);
        }

        /* renamed from: a */
        public void onBindViewHolder(C9763d dVar, int i) {
            C9721g7 a = dVar.mo64307a();
            C9640c2 c2Var = mo64301a().get(i);
            if (!this.f24087c.contains(c2Var)) {
                this.f24087c.add(c2Var);
                C10039x8.m29720c((List<C9626b3>) c2Var.getStatHolder().mo63675a("render"), dVar.itemView.getContext());
            }
            mo64303a(c2Var, a);
            a.mo64109a(this.f24089e, c2Var.getClickArea());
            a.getCtaButtonView().setOnClickListener(this.f24090f);
        }

        /* renamed from: b */
        public void mo64306b(View.OnClickListener onClickListener) {
            this.f24089e = onClickListener;
        }

        public int getItemCount() {
            return mo64301a().size();
        }

        public int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == getItemCount() - 1 ? 2 : 0;
        }
    }

    /* renamed from: com.my.target.i7$d */
    public static class C9763d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final C9721g7 f24091a;

        public C9763d(C9721g7 g7Var) {
            super(g7Var);
            this.f24091a = g7Var;
        }

        /* renamed from: a */
        public C9721g7 mo64307a() {
            return this.f24091a;
        }
    }

    public C9759i7(Context context) {
        this(context, (AttributeSet) null);
    }

    public C9759i7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9759i7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24075a = new C9760a();
        this.f24077c = new C9761b();
        setOverScrollMode(2);
        this.f24076b = new C9738h7(context);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        this.f24078d = linearSnapHelper;
        linearSnapHelper.attachToRecyclerView(this);
    }

    private List<C9640c2> getVisibleCards() {
        int findFirstCompletelyVisibleItemPosition;
        int findLastCompletelyVisibleItemPosition;
        ArrayList arrayList = new ArrayList();
        if (this.f24079e != null && (findFirstCompletelyVisibleItemPosition = getCardLayoutManager().findFirstCompletelyVisibleItemPosition()) <= (findLastCompletelyVisibleItemPosition = getCardLayoutManager().findLastCompletelyVisibleItemPosition()) && findFirstCompletelyVisibleItemPosition >= 0 && findLastCompletelyVisibleItemPosition < this.f24079e.size()) {
            while (findFirstCompletelyVisibleItemPosition <= findLastCompletelyVisibleItemPosition) {
                arrayList.add(this.f24079e.get(findFirstCompletelyVisibleItemPosition));
                findFirstCompletelyVisibleItemPosition++;
            }
        }
        return arrayList;
    }

    private void setCardLayoutManager(C9738h7 h7Var) {
        h7Var.mo64187a((C9738h7.C9739a) new C9738h7.C9739a() {
            /* renamed from: a */
            public final void mo63327a() {
                C9759i7.this.mo64290a();
            }
        });
        super.setLayoutManager(h7Var);
    }

    /* renamed from: a */
    public final void mo64290a() {
        C9784j7.C9786b bVar = this.f24080f;
        if (bVar != null) {
            bVar.mo64471a(getVisibleCards());
        }
    }

    /* renamed from: a */
    public void mo64291a(View view) {
        int[] calculateDistanceToFinalSnap = this.f24078d.calculateDistanceToFinalSnap(getCardLayoutManager(), view);
        if (calculateDistanceToFinalSnap != null) {
            smoothScrollBy(calculateDistanceToFinalSnap[0], 0);
        }
    }

    /* renamed from: a */
    public void mo64292a(List<C9640c2> list) {
        C9762c cVar = new C9762c(list, getContext());
        this.f24079e = list;
        cVar.mo64306b(this.f24075a);
        cVar.mo64302a(this.f24077c);
        setCardLayoutManager(this.f24076b);
        setAdapter(cVar);
    }

    /* renamed from: a */
    public void mo64293a(boolean z) {
        if (z) {
            this.f24078d.attachToRecyclerView(this);
        } else {
            this.f24078d.attachToRecyclerView((RecyclerView) null);
        }
    }

    public C9738h7 getCardLayoutManager() {
        return this.f24076b;
    }

    public LinearSnapHelper getSnapHelper() {
        return this.f24078d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 > i4) {
            this.f24082h = true;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.f24081g = z;
        if (!z) {
            mo64290a();
        }
    }

    public void setCarouselListener(C9784j7.C9786b bVar) {
        this.f24080f = bVar;
    }

    public void setSideSlidesMargins(int i) {
        getCardLayoutManager().mo64186a(i);
    }
}
