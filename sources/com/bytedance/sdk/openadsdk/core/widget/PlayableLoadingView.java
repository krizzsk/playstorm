package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import java.util.Locale;

public class PlayableLoadingView extends FrameLayout {

    /* renamed from: a */
    private ProgressBar f9641a;

    /* renamed from: b */
    private TextView f9642b;

    /* renamed from: c */
    private TextView f9643c;

    public PlayableLoadingView(Context context) {
        super(context);
        m12268a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12268a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12268a(context);
    }

    /* renamed from: a */
    private void m12268a(Context context) {
        setBackgroundColor(Color.parseColor("#0D1833"));
        setClickable(true);
        setVisibility(8);
        LayoutInflater.from(context).inflate(C2984t.m8433f(context, "tt_playable_loading_layout"), this, true);
        this.f9641a = (ProgressBar) findViewById(C2984t.m8432e(context, "tt_playable_pb_view"));
        this.f9642b = (TextView) findViewById(C2984t.m8432e(context, "tt_playable_progress_tip"));
        TextView textView = (TextView) findViewById(C2984t.m8432e(context, "tt_playable_play"));
        this.f9643c = textView;
        textView.setText(C2984t.m8425a(context, "tt_try_now"));
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        ProgressBar progressBar = this.f9641a;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
        TextView textView = this.f9642b;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public void mo20475a() {
        setVisibility(8);
    }

    /* renamed from: b */
    public void mo20476b() {
        setVisibility(0);
    }

    public TextView getPlayView() {
        return this.f9643c;
    }
}
