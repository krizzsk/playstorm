package p394io.presage.common.token;

import android.content.Context;
import android.util.Base64;
import com.ogury.p376ed.internal.C10430dc;
import com.ogury.p376ed.internal.C10463dq;
import com.ogury.p376ed.internal.C10510ez;
import com.ogury.p376ed.internal.C10514fa;
import com.ogury.p376ed.internal.C10536fs;
import com.ogury.p376ed.internal.C10542fx;
import com.ogury.p376ed.internal.C10765mq;
import com.ogury.p376ed.internal.C10804nz;

/* renamed from: io.presage.common.token.OguryTokenProvider */
public final class OguryTokenProvider {

    /* renamed from: a */
    public static final OguryTokenProvider f29341a = new OguryTokenProvider();

    private OguryTokenProvider() {
    }

    public static final String getBidderToken(Context context) {
        C10765mq.m32773b(context, "context");
        String jSONObject = new C10536fs(new C10514fa(context), new C10510ez(context), new C10542fx(context), C10430dc.f26375a, new C10463dq(context).mo67196a()).mo67449a().mo67445a().toString();
        C10765mq.m32770a((Object) jSONObject, "tokenBuilder.build().serializedJson.toString()");
        byte[] bytes = jSONObject.getBytes(C10804nz.f27018a);
        C10765mq.m32770a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        C10765mq.m32770a((Object) encodeToString, "encodeToString(token.toB…eArray(), Base64.NO_WRAP)");
        return encodeToString;
    }
}
