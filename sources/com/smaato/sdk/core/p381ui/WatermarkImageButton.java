package com.smaato.sdk.core.p381ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.smaato.sdk.core.C10932R;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.util.Intents;

/* renamed from: com.smaato.sdk.core.ui.WatermarkImageButton */
public final class WatermarkImageButton extends ImageButton {
    public WatermarkImageButton(Context context) {
        super(context);
        init();
    }

    public WatermarkImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public WatermarkImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public WatermarkImageButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    private void init() {
        if (!SmaatoSdk.isWatermarkEnabled()) {
            setVisibility(8);
            return;
        }
        setImageDrawable(getResources().getDrawable(C10932R.C10933drawable.smaato_sdk_core_watermark));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        setPadding(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setBackgroundColor(getResources().getColor(17170445));
        setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                WatermarkImageButton.this.lambda$init$0$WatermarkImageButton(view);
            }
        });
    }

    public /* synthetic */ void lambda$init$0$WatermarkImageButton(View view) {
        Intents.startIntent(getContext(), Intents.createViewIntent("https://www.smaato.com/privacy/"));
    }
}
