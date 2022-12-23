package com.applovin.impl.mediation.debugger.p038ui.p040b.p041a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.sdk.utils.C2038f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C2392R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a.a */
public class C1694a extends C1707c {

    /* renamed from: a */
    private final C1661b f2473a;

    /* renamed from: o */
    private final Context f2474o;

    public C1694a(C1661b bVar, Context context) {
        super(C1707c.C1710b.DETAIL);
        this.f2473a = bVar;
        this.f2474o = context;
        this.f2541d = m3476q();
        this.f2542e = m3477r();
    }

    /* renamed from: q */
    private SpannedString m3476q() {
        return StringUtils.createSpannedString(this.f2473a.mo13437i(), mo13486b() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
    }

    /* renamed from: r */
    private SpannedString m3477r() {
        if (!mo13486b()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(m3478s());
        spannableStringBuilder.append(new SpannableString("\n"));
        spannableStringBuilder.append(m3479t());
        if (this.f2473a.mo13428a() == C1661b.C1662a.INVALID_INTEGRATION) {
            spannableStringBuilder.append(new SpannableString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: s */
    private SpannedString m3478s() {
        if (!this.f2473a.mo13432d()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
        }
        if (!TextUtils.isEmpty(this.f2473a.mo13438j())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f2473a.mo13438j(), ViewCompat.MEASURED_STATE_MASK));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString(this.f2473a.mo13433e() ? "Retrieving SDK Version..." : "SDK Found", ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: t */
    private SpannedString m3479t() {
        if (!this.f2473a.mo13433e()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
        }
        if (TextUtils.isEmpty(this.f2473a.mo13439k())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f2473a.mo13439k(), ViewCompat.MEASURED_STATE_MASK));
        if (this.f2473a.mo13434f()) {
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f2473a.mo13440l(), ViewCompat.MEASURED_STATE_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: b */
    public boolean mo13486b() {
        return this.f2473a.mo13428a() != C1661b.C1662a.MISSING;
    }

    /* renamed from: d */
    public C1661b mo13503d() {
        return this.f2473a;
    }

    /* renamed from: e */
    public int mo13504e() {
        int o = this.f2473a.mo13443o();
        return o > 0 ? o : C2392R.C2393drawable.applovin_ic_mediation_placeholder;
    }

    /* renamed from: f */
    public int mo13505f() {
        return mo13486b() ? C2392R.C2393drawable.applovin_ic_disclosure_arrow : super.mo13504e();
    }

    /* renamed from: g */
    public int mo13506g() {
        return C2038f.m4879a(C2392R.color.applovin_sdk_disclosureButtonColor, this.f2474o);
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + this.f2541d + ", detailText=" + this.f2542e + ", network=" + this.f2473a + "}";
    }
}
