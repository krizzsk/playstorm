package com.mbridge.msdk.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C8594o;

public class SoundImageView extends ImageView {

    /* renamed from: a */
    private boolean f23368a = true;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SoundImageView(Context context) {
        super(context);
    }

    public boolean getStatus() {
        return this.f23368a;
    }

    public void setSoundStatus(boolean z) {
        this.f23368a = z;
        if (z) {
            setImageResource(C8594o.m24812a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(C8594o.m24812a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }
}
