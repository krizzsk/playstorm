package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.p374my.target.C9606a7;
import com.p374my.target.common.models.ImageData;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.my.target.j7 */
public class C9784j7 extends ViewGroup implements View.OnTouchListener, C9606a7 {

    /* renamed from: a */
    public final TextView f24137a;

    /* renamed from: b */
    public final TextView f24138b;

    /* renamed from: c */
    public final TextView f24139c;

    /* renamed from: d */
    public final C9720g6 f24140d;

    /* renamed from: e */
    public final C10059y8 f24141e;

    /* renamed from: f */
    public final C9804k6 f24142f;

    /* renamed from: g */
    public final C9759i7 f24143g;

    /* renamed from: h */
    public final HashMap<View, Boolean> f24144h;

    /* renamed from: i */
    public final C10020w5 f24145i;

    /* renamed from: j */
    public final Button f24146j;

    /* renamed from: k */
    public final int f24147k;

    /* renamed from: l */
    public final int f24148l;

    /* renamed from: m */
    public final int f24149m;

    /* renamed from: n */
    public final boolean f24150n;

    /* renamed from: o */
    public final double f24151o;

    /* renamed from: p */
    public C9606a7.C9607a f24152p;

    /* renamed from: com.my.target.j7$a */
    public class C9785a implements View.OnClickListener {
        public C9785a() {
        }

        public void onClick(View view) {
            if (C9784j7.this.f24152p != null) {
                C9784j7.this.f24152p.mo63484d();
            }
        }
    }

    /* renamed from: com.my.target.j7$b */
    public interface C9786b {
        /* renamed from: a */
        void mo64470a(C9640c2 c2Var);

        /* renamed from: a */
        void mo64471a(List<C9640c2> list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9784j7(Context context) {
        super(context);
        Context context2 = context;
        C10059y8.m29829a((View) this, -1, -3806472);
        boolean z = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        this.f24150n = z;
        this.f24151o = z ? 0.5d : 0.7d;
        C9720g6 g6Var = new C9720g6(context2);
        this.f24140d = g6Var;
        C10059y8 c = C10059y8.m29843c(context);
        this.f24141e = c;
        TextView textView = new TextView(context2);
        this.f24137a = textView;
        TextView textView2 = new TextView(context2);
        this.f24138b = textView2;
        TextView textView3 = new TextView(context2);
        this.f24139c = textView3;
        C9804k6 k6Var = new C9804k6(context2);
        this.f24142f = k6Var;
        Button button = new Button(context2);
        this.f24146j = button;
        C9759i7 i7Var = new C9759i7(context2);
        this.f24143g = i7Var;
        g6Var.setContentDescription("close");
        g6Var.setVisibility(4);
        k6Var.setContentDescription(RewardPlus.ICON);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        button.setPadding(c.mo65778b(15), c.mo65778b(10), c.mo65778b(15), c.mo65778b(10));
        button.setMinimumWidth(c.mo65778b(100));
        button.setMaxEms(12);
        button.setTransformationMethod((TransformationMethod) null);
        button.setSingleLine();
        button.setTextSize(18.0f);
        button.setEllipsize(TextUtils.TruncateAt.END);
        if (Build.VERSION.SDK_INT >= 21) {
            button.setElevation((float) c.mo65778b(2));
        }
        C10059y8.m29839b(button, -16733198, -16746839, c.mo65778b(2));
        button.setTextColor(-1);
        i7Var.setPadding(0, 0, 0, c.mo65778b(8));
        i7Var.setSideSlidesMargins(c.mo65778b(10));
        if (z) {
            int b = c.mo65778b(18);
            this.f24148l = b;
            this.f24147k = b;
            textView.setTextSize((float) c.mo65779d(24));
            textView3.setTextSize((float) c.mo65779d(20));
            textView2.setTextSize((float) c.mo65779d(20));
            this.f24149m = c.mo65778b(96);
            textView.setTypeface((Typeface) null, 1);
        } else {
            this.f24147k = c.mo65778b(12);
            this.f24148l = c.mo65778b(10);
            textView.setTextSize(22.0f);
            textView3.setTextSize(18.0f);
            textView2.setTextSize(18.0f);
            this.f24149m = c.mo65778b(64);
        }
        C10020w5 w5Var = new C10020w5(context2);
        this.f24145i = w5Var;
        C10059y8.m29840b(this, "ad_view");
        C10059y8.m29840b(textView, "title_text");
        C10059y8.m29840b(textView3, "description_text");
        C10059y8.m29840b(k6Var, ViewHierarchyConstants.ICON_BITMAP);
        C10059y8.m29840b(g6Var, "close_button");
        C10059y8.m29840b(textView2, "category_text");
        addView(i7Var);
        addView(k6Var);
        addView(textView);
        addView(textView2);
        addView(w5Var);
        addView(textView3);
        addView(g6Var);
        addView(button);
        this.f24144h = new HashMap<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28410a(View view) {
        C9606a7.C9607a aVar = this.f24152p;
        if (aVar != null) {
            aVar.mo63485e();
        }
    }

    /* renamed from: a */
    public final void mo64477a(C9894p1 p1Var) {
        this.f24145i.setImageBitmap(p1Var.mo65194c().getBitmap());
        this.f24145i.setOnClickListener(new C9785a());
    }

    /* renamed from: d */
    public void mo63478d() {
        this.f24140d.setVisibility(0);
    }

    public View getCloseButton() {
        return this.f24140d;
    }

    public int[] getNumbersOfCurrentShowingCards() {
        int findFirstVisibleItemPosition = this.f24143g.getCardLayoutManager().findFirstVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = this.f24143g.getCardLayoutManager().findLastCompletelyVisibleItemPosition();
        int i = 0;
        if (findFirstVisibleItemPosition == -1 || findLastCompletelyVisibleItemPosition == -1) {
            return new int[0];
        }
        int i2 = (findLastCompletelyVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i2];
        while (i < i2) {
            iArr[i] = findFirstVisibleItemPosition;
            i++;
            findFirstVisibleItemPosition++;
        }
        return iArr;
    }

    public View getView() {
        return this;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        C9720g6 g6Var = this.f24140d;
        g6Var.layout(i3 - g6Var.getMeasuredWidth(), i2, i3, this.f24140d.getMeasuredHeight() + i2);
        C10059y8.m29831a((View) this.f24145i, this.f24140d.getLeft() - this.f24145i.getMeasuredWidth(), this.f24140d.getTop(), this.f24140d.getLeft(), this.f24140d.getBottom());
        if (i7 > i6 || this.f24150n) {
            int bottom = this.f24140d.getBottom();
            int measuredHeight = this.f24143g.getMeasuredHeight() + Math.max(this.f24137a.getMeasuredHeight() + this.f24138b.getMeasuredHeight(), this.f24142f.getMeasuredHeight()) + this.f24139c.getMeasuredHeight();
            int i8 = this.f24148l;
            int i9 = measuredHeight + (i8 * 2);
            if (i9 < i7 && (i5 = (i7 - i9) / 2) > bottom) {
                bottom = i5;
            }
            C9804k6 k6Var = this.f24142f;
            k6Var.layout(i8 + i, bottom, k6Var.getMeasuredWidth() + i + this.f24148l, i2 + this.f24142f.getMeasuredHeight() + bottom);
            this.f24137a.layout(this.f24142f.getRight(), bottom, this.f24142f.getRight() + this.f24137a.getMeasuredWidth(), this.f24137a.getMeasuredHeight() + bottom);
            this.f24138b.layout(this.f24142f.getRight(), this.f24137a.getBottom(), this.f24142f.getRight() + this.f24138b.getMeasuredWidth(), this.f24137a.getBottom() + this.f24138b.getMeasuredHeight());
            int max = Math.max(Math.max(this.f24142f.getBottom(), this.f24138b.getBottom()), this.f24137a.getBottom());
            TextView textView = this.f24139c;
            int i10 = this.f24148l + i;
            textView.layout(i10, max, textView.getMeasuredWidth() + i10, this.f24139c.getMeasuredHeight() + max);
            int max2 = Math.max(max, this.f24139c.getBottom());
            int i11 = this.f24148l;
            int i12 = max2 + i11;
            C9759i7 i7Var = this.f24143g;
            i7Var.layout(i + i11, i12, i3, i7Var.getMeasuredHeight() + i12);
            this.f24143g.mo64293a(!this.f24150n);
            return;
        }
        this.f24143g.mo64293a(false);
        C9804k6 k6Var2 = this.f24142f;
        int i13 = this.f24148l;
        k6Var2.layout(i13, (i4 - i13) - k6Var2.getMeasuredHeight(), this.f24148l + this.f24142f.getMeasuredWidth(), i4 - this.f24148l);
        int max3 = ((Math.max(this.f24142f.getMeasuredHeight(), this.f24146j.getMeasuredHeight()) - this.f24137a.getMeasuredHeight()) - this.f24138b.getMeasuredHeight()) / 2;
        if (max3 < 0) {
            max3 = 0;
        }
        this.f24138b.layout(this.f24142f.getRight(), ((i4 - this.f24148l) - max3) - this.f24138b.getMeasuredHeight(), this.f24142f.getRight() + this.f24138b.getMeasuredWidth(), (i4 - this.f24148l) - max3);
        this.f24137a.layout(this.f24142f.getRight(), this.f24138b.getTop() - this.f24137a.getMeasuredHeight(), this.f24142f.getRight() + this.f24137a.getMeasuredWidth(), this.f24138b.getTop());
        int max4 = (Math.max(this.f24142f.getMeasuredHeight(), this.f24137a.getMeasuredHeight() + this.f24138b.getMeasuredHeight()) - this.f24146j.getMeasuredHeight()) / 2;
        if (max4 < 0) {
            max4 = 0;
        }
        Button button = this.f24146j;
        int measuredWidth = (i3 - this.f24148l) - button.getMeasuredWidth();
        int measuredHeight2 = ((i4 - this.f24148l) - max4) - this.f24146j.getMeasuredHeight();
        int i14 = this.f24148l;
        button.layout(measuredWidth, measuredHeight2, i3 - i14, (i4 - i14) - max4);
        C9759i7 i7Var2 = this.f24143g;
        int i15 = this.f24148l;
        i7Var2.layout(i15, i15, i3, i7Var2.getMeasuredHeight() + i15);
        this.f24139c.layout(0, 0, 0, 0);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C9759i7 i7Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f24140d.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f24142f.measure(View.MeasureSpec.makeMeasureSpec(this.f24149m, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f24149m, Integer.MIN_VALUE));
        this.f24145i.measure(i, i2);
        if (size2 > size || this.f24150n) {
            this.f24146j.setVisibility(8);
            int measuredHeight = this.f24140d.getMeasuredHeight();
            if (this.f24150n) {
                measuredHeight = this.f24148l;
            }
            this.f24137a.measure(View.MeasureSpec.makeMeasureSpec((size - (this.f24148l * 2)) - this.f24142f.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f24138b.measure(View.MeasureSpec.makeMeasureSpec((size - (this.f24148l * 2)) - this.f24142f.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f24139c.measure(View.MeasureSpec.makeMeasureSpec(size - (this.f24148l * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int max = ((size2 - measuredHeight) - Math.max(this.f24137a.getMeasuredHeight() + this.f24138b.getMeasuredHeight(), this.f24142f.getMeasuredHeight() - (this.f24148l * 2))) - this.f24139c.getMeasuredHeight();
            int i5 = size - this.f24148l;
            if (size2 > size) {
                double d = this.f24151o;
                if (((double) (((float) max) / ((float) size2))) > d) {
                    max = (int) (((double) size2) * d);
                }
            }
            if (this.f24150n) {
                i7Var = this.f24143g;
                i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                i4 = View.MeasureSpec.makeMeasureSpec(max - (this.f24148l * 2), Integer.MIN_VALUE);
            } else {
                i7Var = this.f24143g;
                i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                i4 = View.MeasureSpec.makeMeasureSpec(max - (this.f24148l * 2), 1073741824);
            }
            i7Var.measure(i3, i4);
        } else {
            this.f24146j.setVisibility(0);
            this.f24146j.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int measuredWidth = this.f24146j.getMeasuredWidth();
            int i6 = (size / 2) - (this.f24148l * 2);
            if (measuredWidth > i6) {
                this.f24146j.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
            this.f24137a.measure(View.MeasureSpec.makeMeasureSpec((((size - this.f24142f.getMeasuredWidth()) - measuredWidth) - this.f24147k) - this.f24148l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f24138b.measure(View.MeasureSpec.makeMeasureSpec((((size - this.f24142f.getMeasuredWidth()) - measuredWidth) - this.f24147k) - this.f24148l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f24143g.measure(View.MeasureSpec.makeMeasureSpec(size - this.f24148l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((((size2 - Math.max(this.f24142f.getMeasuredHeight(), Math.max(this.f24146j.getMeasuredHeight(), this.f24137a.getMeasuredHeight() + this.f24138b.getMeasuredHeight()))) - (this.f24148l * 2)) - this.f24143g.getPaddingBottom()) - this.f24143g.getPaddingTop(), Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, size2);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f24144h.containsKey(view)) {
            return false;
        }
        if (!this.f24144h.get(view).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(-3806472);
        } else if (action == 1) {
            setBackgroundColor(-1);
            C9606a7.C9607a aVar = this.f24152p;
            if (aVar != null) {
                aVar.mo63485e();
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    public void setBanner(C9697f2 f2Var) {
        ImageData closeIcon = f2Var.getCloseIcon();
        if (closeIcon == null || closeIcon.getData() == null) {
            Bitmap a = C9905p5.m28985a(this.f24141e.mo65778b(28));
            if (a != null) {
                this.f24140d.mo64102a(a, false);
            }
        } else {
            this.f24140d.mo64102a(closeIcon.getData(), true);
        }
        this.f24146j.setText(f2Var.getCtaText());
        ImageData icon = f2Var.getIcon();
        if (icon != null) {
            this.f24142f.setPlaceholderDimensions(icon.getWidth(), icon.getHeight());
            C9807k8.m28516b(icon, this.f24142f);
        }
        this.f24137a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f24137a.setText(f2Var.getTitle());
        String category = f2Var.getCategory();
        String subCategory = f2Var.getSubCategory();
        String str = "";
        if (!TextUtils.isEmpty(category)) {
            str = str + category;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(subCategory)) {
            str = str + ", ";
        }
        if (!TextUtils.isEmpty(subCategory)) {
            str = str + subCategory;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f24138b.setText(str);
            this.f24138b.setVisibility(0);
        } else {
            this.f24138b.setVisibility(8);
        }
        this.f24139c.setText(f2Var.getDescription());
        this.f24143g.mo64292a(f2Var.getInterstitialAdCards());
        C9894p1 adChoices = f2Var.getAdChoices();
        if (adChoices != null) {
            mo64477a(adChoices);
        } else {
            this.f24145i.setVisibility(8);
        }
    }

    public void setCarouselListener(C9786b bVar) {
        this.f24143g.setCarouselListener(bVar);
    }

    public void setClickArea(C9929r1 r1Var) {
        boolean z = true;
        if (r1Var.f24595o) {
            setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C9784j7.this.m28410a(view);
                }
            });
            C10059y8.m29829a((View) this, -1, -3806472);
            setClickable(true);
            return;
        }
        this.f24137a.setOnTouchListener(this);
        this.f24138b.setOnTouchListener(this);
        this.f24142f.setOnTouchListener(this);
        this.f24139c.setOnTouchListener(this);
        this.f24146j.setOnTouchListener(this);
        setOnTouchListener(this);
        this.f24144h.put(this.f24137a, Boolean.valueOf(r1Var.f24583c));
        this.f24144h.put(this.f24138b, Boolean.valueOf(r1Var.f24593m));
        this.f24144h.put(this.f24142f, Boolean.valueOf(r1Var.f24585e));
        this.f24144h.put(this.f24139c, Boolean.valueOf(r1Var.f24584d));
        HashMap<View, Boolean> hashMap = this.f24144h;
        Button button = this.f24146j;
        if (!r1Var.f24594n && !r1Var.f24589i) {
            z = false;
        }
        hashMap.put(button, Boolean.valueOf(z));
        this.f24144h.put(this, Boolean.valueOf(r1Var.f24594n));
    }

    public void setInterstitialPromoViewListener(C9606a7.C9607a aVar) {
        this.f24152p = aVar;
    }
}
