package com.applovin.impl.mediation.debugger.p038ui.testmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.C1423a;
import com.applovin.impl.sdk.utils.C2038f;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.C2392R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private final Button f2595a;

    /* renamed from: b */
    private final C1423a f2596b;

    /* renamed from: c */
    private C1721b f2597c;

    /* renamed from: d */
    private MaxAdFormat f2598d;

    /* renamed from: e */
    private C1720a f2599e;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$a */
    public interface C1720a {
        void onClick(AdControlButton adControlButton);
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$b */
    public enum C1721b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2595a = new Button(getContext());
        this.f2596b = new C1423a(getContext(), 20, 16842873);
        this.f2597c = C1721b.LOAD;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2595a.setTextColor(-1);
        this.f2595a.setOnClickListener(this);
        frameLayout.addView(this.f2595a, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2596b.setColor(-1);
        addView(this.f2596b, new FrameLayout.LayoutParams(-1, -1, 17));
        m3603a(C1721b.LOAD);
    }

    /* renamed from: a */
    private void m3603a(C1721b bVar) {
        if (C1721b.LOADING == bVar) {
            setEnabled(false);
            this.f2596b.mo12732a();
        } else {
            setEnabled(true);
            this.f2596b.mo12733b();
        }
        this.f2595a.setText(m3604b(bVar));
        this.f2595a.setBackgroundColor(m3605c(bVar));
    }

    /* renamed from: b */
    private String m3604b(C1721b bVar) {
        return C1721b.LOAD == bVar ? "Load" : C1721b.LOADING == bVar ? "" : "Show";
    }

    /* renamed from: c */
    private int m3605c(C1721b bVar) {
        return C2038f.m4879a((C1721b.LOAD == bVar || C1721b.LOADING == bVar) ? C2392R.color.applovin_sdk_brand_color : C2392R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public C1721b getControlState() {
        return this.f2597c;
    }

    public MaxAdFormat getFormat() {
        return this.f2598d;
    }

    public void onClick(View view) {
        C1720a aVar = this.f2599e;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(C1721b bVar) {
        if (this.f2597c != bVar) {
            m3603a(bVar);
        }
        this.f2597c = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f2598d = maxAdFormat;
    }

    public void setOnClickListener(C1720a aVar) {
        this.f2599e = aVar;
    }
}
