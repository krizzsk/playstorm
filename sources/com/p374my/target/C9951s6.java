package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p374my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.s6 */
public class C9951s6 extends RecyclerView.Adapter<C9953b> {

    /* renamed from: a */
    public final Context f24634a;

    /* renamed from: b */
    public final List<C9751i2> f24635b = new ArrayList();

    /* renamed from: c */
    public C9954c f24636c;

    /* renamed from: com.my.target.s6$a */
    public static class C9952a extends FrameLayout {

        /* renamed from: a */
        public int f24637a;

        /* renamed from: b */
        public int f24638b;

        public C9952a(Context context) {
            super(context);
        }

        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (size == 0) {
                size = this.f24637a;
            }
            if (size2 == 0) {
                size2 = this.f24638b;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        }
    }

    /* renamed from: com.my.target.s6$b */
    public static class C9953b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final C9804k6 f24639a;

        /* renamed from: b */
        public final FrameLayout f24640b;

        public C9953b(FrameLayout frameLayout, C9804k6 k6Var, FrameLayout frameLayout2) {
            super(frameLayout);
            this.f24639a = k6Var;
            this.f24640b = frameLayout2;
        }
    }

    /* renamed from: com.my.target.s6$c */
    public interface C9954c extends View.OnClickListener {
        void onCardRender(int i);
    }

    public C9951s6(Context context) {
        this.f24634a = context;
    }

    /* renamed from: a */
    public C9953b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C9952a aVar = new C9952a(this.f24634a);
        aVar.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        C9804k6 k6Var = new C9804k6(this.f24634a);
        C10059y8.m29840b(k6Var, "card_media_view");
        aVar.addView(k6Var, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(this.f24634a);
        if (viewGroup.isClickable()) {
            C10059y8.m29829a((View) frameLayout, 0, 1153821432);
        }
        aVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return new C9953b(aVar, k6Var, frameLayout);
    }

    /* renamed from: a */
    public void mo65384a() {
        this.f24635b.clear();
        notifyDataSetChanged();
        this.f24636c = null;
    }

    /* renamed from: a */
    public void onViewRecycled(C9953b bVar) {
        int adapterPosition = bVar.getAdapterPosition();
        C9751i2 i2Var = (adapterPosition <= 0 || adapterPosition >= this.f24635b.size()) ? null : this.f24635b.get(adapterPosition);
        bVar.f24639a.setImageData((ImageData) null);
        ImageData image = i2Var != null ? i2Var.getImage() : null;
        if (image != null) {
            C9807k8.m28512a(image, (ImageView) bVar.f24639a);
        }
        bVar.f24640b.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: a */
    public void onBindViewHolder(C9953b bVar, int i) {
        C9954c cVar = this.f24636c;
        if (cVar != null) {
            cVar.onCardRender(i);
        }
        ImageData imageData = null;
        C9751i2 i2Var = i < this.f24635b.size() ? this.f24635b.get(i) : null;
        if (i2Var != null) {
            imageData = i2Var.getImage();
        }
        if (imageData != null) {
            bVar.f24639a.setPlaceholderDimensions(imageData.getWidth(), imageData.getHeight());
            Bitmap bitmap = imageData.getBitmap();
            if (bitmap != null) {
                bVar.f24639a.setImageBitmap(bitmap);
            } else {
                C9807k8.m28516b(imageData, bVar.f24639a);
            }
        }
        C9804k6 a = bVar.f24639a;
        a.setContentDescription("card_" + i);
        bVar.f24640b.setOnClickListener(this.f24636c);
    }

    /* renamed from: a */
    public void mo65387a(C9954c cVar) {
        this.f24636c = cVar;
    }

    /* renamed from: a */
    public void mo65388a(List<C9751i2> list) {
        this.f24635b.addAll(list);
    }

    public int getItemCount() {
        return this.f24635b.size();
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i == this.f24635b.size() - 1 ? 2 : 0;
    }
}
