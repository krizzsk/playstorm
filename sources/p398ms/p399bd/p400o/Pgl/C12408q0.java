package p398ms.p399bd.p400o.Pgl;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ms.bd.o.Pgl.q0 */
public class C12408q0 extends C12404o0 {

    /* renamed from: a */
    private Interceptor f29425a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f29426b;

    /* renamed from: ms.bd.o.Pgl.q0$pgla */
    class pgla implements Interceptor {
        pgla() {
        }

        public SsResponse intercept(Interceptor.Chain chain) throws Exception {
            SsResponse proceed = chain.proceed(chain.request());
            Iterator it = proceed.headers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Header header = (Header) it.next();
                if (((String) pblk.m34714a(16777217, 0, 0, "b86b16", new byte[]{107, 119, 81, 91, Ascii.DC4, 41, 102})).equals(header.getName()) && header.getValue() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) pblk.m34714a(16777217, 0, 0, "eb8180", new byte[]{102, 101, 91, 122, 3, 38, 114, 66}));
                    arrayList.add(header.getValue());
                    pblb.m34697a(117440513, 0, C12408q0.this.f29426b, (String) pblk.m34714a(16777217, 0, 0, "e1acaa", new byte[]{102, 54, 2, Ascii.CAN, 76, 98}), (String[]) arrayList.toArray(new String[0]));
                    break;
                }
            }
            return proceed;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo76444a(long j) {
        this.f29426b = j;
        pgla pgla2 = new pgla();
        this.f29425a = pgla2;
        RetrofitUtils.addInterceptor(pgla2);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        RetrofitUtils.removeInterceptor(this.f29425a);
        super.finalize();
    }
}
