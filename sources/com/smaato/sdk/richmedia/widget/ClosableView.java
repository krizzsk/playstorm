package com.smaato.sdk.richmedia.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.C11182R;

public final class ClosableView extends FrameLayout {
    private ImageButton close;
    private FrameLayout container = ((FrameLayout) findViewById(C11182R.C11184id.container));
    private OnCloseClickListener listener;

    public interface OnCloseClickListener {
        void onCloseClick();
    }

    public ClosableView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(C11182R.layout.smaato_sdk_richmedia_layout_closable, this, true);
        ImageButton imageButton = (ImageButton) findViewById(C11182R.C11184id.close);
        this.close = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClosableView.this.lambda$new$0$ClosableView(view);
            }
        });
    }

    public /* synthetic */ void lambda$new$0$ClosableView(View view) {
        callOnCloseListener();
    }

    public ImageButton getCloseButton() {
        return this.close;
    }

    /* access modifiers changed from: package-private */
    public boolean isCloseRegionVisible(Rect rect, Rect rect2) {
        return rect.contains(getRectForNewSize(rect2));
    }

    /* access modifiers changed from: package-private */
    public boolean hasContent() {
        return this.container.getChildCount() > 0 && getParent() != null;
    }

    private Rect getRectForNewSize(Rect rect) {
        Rect rect2 = new Rect();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.close.getLayoutParams();
        Gravity.apply(layoutParams.gravity, layoutParams.width, layoutParams.height, rect, rect2);
        return rect2;
    }

    /* access modifiers changed from: package-private */
    public void addContent(View view) {
        this.container.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setOnCloseClickListener(OnCloseClickListener onCloseClickListener) {
        this.listener = onCloseClickListener;
    }

    public void callOnCloseListener() {
        Objects.onNotNull(this.listener, $$Lambda$83SwcdXIyxy0mQX9UE0wcqcKCyA.INSTANCE);
    }
}
