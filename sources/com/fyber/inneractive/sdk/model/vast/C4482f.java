package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.vast.C4439a;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.model.vast.f */
public class C4482f {

    /* renamed from: a */
    public Integer f11084a;

    /* renamed from: b */
    public Integer f11085b;

    /* renamed from: c */
    public String f11086c;

    /* renamed from: d */
    public C4485i f11087d;

    /* renamed from: e */
    public String f11088e;

    /* renamed from: f */
    public String f11089f;

    /* renamed from: g */
    public String f11090g;

    /* renamed from: h */
    public List<String> f11091h;

    /* renamed from: i */
    public C4439a.C4440a f11092i;

    /* renamed from: j */
    public List<C4492p> f11093j;

    public String toString() {
        StringBuilder sb = new StringBuilder("Companion: ");
        sb.append(" w:");
        sb.append(this.f11084a);
        sb.append(" h:");
        sb.append(this.f11085b);
        sb.append(" ctr:");
        sb.append(this.f11090g);
        sb.append(" clt:");
        sb.append(this.f11091h);
        if (!TextUtils.isEmpty(this.f11089f)) {
            sb.append(" html:");
            sb.append(this.f11089f);
        }
        if (this.f11087d != null) {
            sb.append(" static:");
            sb.append(this.f11087d.f11103b);
            sb.append("creative:");
            sb.append(this.f11087d.f11102a);
        }
        if (!TextUtils.isEmpty(this.f11088e)) {
            sb.append(" iframe:");
            sb.append(this.f11088e);
        }
        sb.append(" events:");
        sb.append(this.f11093j);
        if (this.f11092i != null) {
            sb.append(" reason:");
            sb.append(this.f11092i.f10981a);
        }
        return sb.toString();
    }
}
