package com.p374my.target;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.p374my.target.C9894p1;
import java.util.List;

/* renamed from: com.my.target.v5 */
public class C10000v5 extends FrameLayout {

    /* renamed from: a */
    public final ListView f24822a;

    /* renamed from: b */
    public final ImageButton f24823b;

    /* renamed from: c */
    public final View f24824c;

    /* renamed from: d */
    public final int f24825d;

    /* renamed from: e */
    public final int f24826e;

    /* renamed from: com.my.target.v5$a */
    public interface C10001a {
        /* renamed from: a */
        void mo64135a();

        /* renamed from: a */
        void mo64138a(C9894p1.C9895a aVar, Context context);
    }

    /* renamed from: com.my.target.v5$b */
    public static class C10002b implements View.OnClickListener {

        /* renamed from: a */
        public final C10001a f24827a;

        public C10002b(C10001a aVar) {
            this.f24827a = aVar;
        }

        public void onClick(View view) {
            this.f24827a.mo64135a();
        }
    }

    /* renamed from: com.my.target.v5$c */
    public static class C10003c implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final C10001a f24828a;

        /* renamed from: b */
        public final List<C9894p1.C9895a> f24829b;

        public C10003c(C10001a aVar, List<C9894p1.C9895a> list) {
            this.f24828a = aVar;
            this.f24829b = list;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0 && i < this.f24829b.size()) {
                this.f24828a.mo64138a(this.f24829b.get(i), view.getContext());
            }
        }
    }

    /* renamed from: com.my.target.v5$d */
    public static class C10004d extends BaseAdapter {

        /* renamed from: a */
        public final List<C9894p1.C9895a> f24830a;

        public C10004d(List<C9894p1.C9895a> list) {
            this.f24830a = list;
        }

        public int getCount() {
            return this.f24830a.size();
        }

        public Object getItem(int i) {
            return this.f24830a.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            Button button = new Button(viewGroup.getContext());
            boolean z = false;
            button.setFocusable(false);
            button.setFocusableInTouchMode(false);
            button.setClickable(false);
            C10059y8 c = C10059y8.m29843c(viewGroup.getContext());
            int b = c.mo65778b(24);
            button.setPadding(b, button.getPaddingTop(), b, button.getPaddingBottom());
            button.setAllCaps(false);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                button.setStateListAnimator((StateListAnimator) null);
            }
            button.setLines(1);
            button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            button.setEllipsize(TextUtils.TruncateAt.END);
            button.setTypeface((Typeface) null, 0);
            button.setGravity(8388627);
            button.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            if (i == 0) {
                z = true;
            }
            Drawable a = C10000v5.m29567b(c, z);
            if (i2 >= 16) {
                button.setBackground(a);
            } else {
                button.setBackgroundDrawable(a);
            }
            if (i >= 0 && i < this.f24830a.size()) {
                button.setText(this.f24830a.get(i).f24471a);
            }
            return button;
        }
    }

    public C10000v5(Context context) {
        super(context);
        ListView listView = new ListView(context);
        this.f24822a = listView;
        C10059y8 c = C10059y8.m29843c(context);
        this.f24825d = c.mo65778b(500);
        this.f24826e = c.mo65777a(0.5f);
        ImageButton imageButton = new ImageButton(context);
        this.f24823b = imageButton;
        imageButton.setImageBitmap(C9905p5.m28987a(context));
        C10059y8.m29829a((View) imageButton, -1, -3158065);
        View view = new View(context);
        this.f24824c = view;
        view.setBackgroundColor(-5131855);
        addView(listView);
        addView(view);
        addView(imageButton);
    }

    /* renamed from: b */
    public static Drawable m29567b(C10059y8 y8Var, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1, -1});
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3158065, -3158065});
        if (z) {
            float b = (float) y8Var.mo65778b(8);
            float[] fArr = {b, b, b, b, 0.0f, 0.0f, 0.0f, 0.0f};
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable2.setCornerRadii(fArr);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        if (Build.VERSION.SDK_INT < 21) {
            return stateListDrawable;
        }
        return new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, StateSet.WILD_CARD}, new int[]{C10059y8.m29822a(-3158065), C10059y8.m29822a(-1)}), stateListDrawable, (Drawable) null);
    }

    /* renamed from: a */
    public void mo65607a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 512.0f, 0.0f);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        this.f24822a.startAnimation(translateAnimation);
    }

    /* renamed from: a */
    public void mo65608a(List<C9894p1.C9895a> list, C10001a aVar) {
        if (list != null) {
            this.f24822a.setAdapter(new C10004d(list));
            this.f24822a.setOnItemClickListener(new C10003c(aVar, list));
            C10002b bVar = new C10002b(aVar);
            this.f24823b.setOnClickListener(bVar);
            setOnClickListener(bVar);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max((i3 - this.f24822a.getMeasuredWidth()) / 2, getPaddingLeft());
        this.f24823b.layout(max, (i4 - getPaddingBottom()) - this.f24823b.getMeasuredHeight(), this.f24823b.getMeasuredWidth() + max, i4 - getPaddingBottom());
        this.f24824c.layout(max, this.f24823b.getTop() - this.f24824c.getMeasuredHeight(), this.f24824c.getMeasuredWidth() + max, this.f24823b.getTop());
        this.f24822a.layout(max, this.f24824c.getTop() - this.f24822a.getMeasuredHeight(), this.f24822a.getMeasuredWidth() + max, this.f24824c.getTop());
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = (Math.min(size, this.f24825d) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        this.f24823b.measure(makeMeasureSpec, paddingTop);
        this.f24824c.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.f24826e, 1073741824));
        this.f24822a.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((paddingTop - this.f24826e) - this.f24823b.getMeasuredHeight(), Integer.MIN_VALUE));
        setMeasuredDimension(size, size2);
    }
}
