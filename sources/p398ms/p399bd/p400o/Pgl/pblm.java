package p398ms.p399bd.p400o.Pgl;

import com.google.common.base.Ascii;
import org.json.JSONObject;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblm */
public abstract class pblm extends pblb.pgla {

    /* renamed from: a */
    private static pblm f29399a;

    /* renamed from: ms.bd.o.Pgl.pblm$pgla */
    public static class pgla {

        /* renamed from: a */
        private long f29400a;

        /* renamed from: b */
        private long f29401b;

        /* renamed from: c */
        private String f29402c;

        /* renamed from: d */
        private String f29403d;

        /* renamed from: a */
        public void mo76455a(String str) {
            this.f29402c = str;
            this.f29403d = null;
            this.f29400a = System.currentTimeMillis();
        }

        /* renamed from: a */
        public void mo76456a(String str, int i) {
            pblm a = pblm.m34720a();
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f29400a;
                long j2 = currentTimeMillis - j;
                this.f29401b = j2;
                a.mo76451a(j2, j, this.f29402c, this.f29403d, str, i, (JSONObject) null);
            }
        }

        /* renamed from: b */
        public void mo76457b(String str, int i) {
            pblm a = pblm.m34720a();
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f29400a;
                long j2 = currentTimeMillis - j;
                this.f29401b = j2;
                a.mo76454b(j2, j, this.f29402c, this.f29403d, str, i, (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    public static synchronized pblm m34720a() {
        pblm pblm;
        synchronized (pblm.class) {
            pblm = f29399a;
        }
        return pblm;
    }

    /* renamed from: a */
    public static synchronized void m34721a(pblm pblm) {
        synchronized (pblm.class) {
            f29399a = pblm;
        }
    }

    /* renamed from: a */
    public Object mo76450a(int i, int i2, long j, String str, Object obj) throws Throwable {
        if (i != 131073) {
            if (i == 131074) {
                String[] strArr = (String[]) obj;
                if (!(str == null || strArr == null || strArr.length == 0)) {
                    mo76452a(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
                }
            }
            return null;
        } else if (str == null || !mo76453a(str)) {
            return null;
        } else {
            return (String) pblk.m34714a(16777217, 0, 0, "15fb7c", new byte[]{Ascii.f17944SI, Ascii.f17938FS});
        }
    }

    /* renamed from: a */
    public abstract void mo76451a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo76452a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    public abstract boolean mo76453a(String str);

    /* renamed from: b */
    public abstract void mo76454b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);
}
