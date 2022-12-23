package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import com.google.common.base.Ascii;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.l0 */
public class C12398l0 {

    /* renamed from: a */
    private static volatile boolean f29388a;

    /* renamed from: b */
    private static final Map<String, C12379c> f29389b = new ConcurrentHashMap();

    /* renamed from: ms.bd.o.Pgl.l0$pgla */
    public interface pgla {
        Map<String, String> frameSign(String str, int i);

        Map<String, String> getFeatureHash(String str, byte[] bArr);

        Map<String, String> getReportRaw(String str, int i, Map<String, String> map);

        String getToken();

        void report(String str);

        void setBDDeviceID(String str);

        void setCollectMode(int i);

        void setDeviceID(String str);

        void setInstallID(String str);

        void setSessionID(String str);
    }

    /* renamed from: a */
    public static String m34675a() {
        return (String) pblb.m34696a(67108867);
    }

    /* renamed from: a */
    public static synchronized pgla m34676a(String str) {
        synchronized (C12398l0.class) {
            if (str == null) {
                throw new NullPointerException((String) pblk.m34714a(16777217, 0, 0, "50af32", new byte[]{37, 34, 2, 59, 40, 101, 59, 4, 35, 34, 100, 48, Ascii.ETB, 82, Ascii.f17947US, 32, 34}));
            } else if (!f29388a) {
                return null;
            } else {
                Object a = pblb.m34699a(67108866, str);
                if (a == null) {
                    return null;
                }
                C12379c cVar = f29389b.get(str);
                if (cVar == null) {
                    return null;
                }
                C12396k0 k0Var = new C12396k0(cVar, pgla.m34772a().mo76482b(), ((Long) a).longValue());
                return k0Var;
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m34677a(Context context, C12379c cVar, String str, String str2) {
        C12379c cVar2 = cVar;
        synchronized (C12398l0.class) {
            if (context == null) {
                throw new NullPointerException((String) pblk.m34714a(16777217, 0, 0, "c3c598", new byte[]{113, 62, Ascii.f17943RS, 85, 3, 55, 116, 82, 49, 106, 103, 61, Ascii.DC4, 1, 8, 32, 116, 82, 48, 96, 50, 63, 5, 77, 10}));
            } else if (cVar2 != null) {
                String str3 = cVar2.f29371a;
                String str4 = (str3 == null || str3.length() <= 0) ? cVar2.f29377g : cVar2.f29371a;
                if (str4 == null || str4.length() <= 0) {
                    throw new NullPointerException((String) pblk.m34714a(16777217, 0, 0, "8b4cf5", new byte[]{40, 112, 87, 62, 125, 98, 54, 86, 118, 39, 105, 98, 66, 87, 74, 39, 47}));
                }
                synchronized (C12398l0.class) {
                    if (!f29388a) {
                        Context applicationContext = context.getApplicationContext();
                        pgla.m34772a().mo76481a(applicationContext);
                        try {
                            pblu.m34750a(applicationContext, str2);
                        } catch (Throwable unused) {
                        }
                        pblu.m34750a(applicationContext, str);
                        String str5 = (String) pblk.m34714a(16777217, 0, 0, "ac6ae2", new byte[]{62, 108, 86});
                        pblb.m34700a(16777218, (pblb.pgla) new C12401n());
                        pblb.m34700a(16777217, (pblb.pgla) new C12423y());
                        String str6 = (String) pblk.m34714a(16777217, 0, 0, "48316a", new byte[]{107, 55, 68});
                        pblb.m34700a(16777219, (pblb.pgla) new C12382d0());
                        pblb.m34700a(16777221, (pblb.pgla) new C12384e0());
                        pblb.m34700a(16777222, (pblb.pgla) new C12386f0());
                        pblb.m34700a(16777223, (pblb.pgla) new C12388g0());
                        pblb.m34700a(16777224, (pblb.pgla) new C12390h0());
                        pblb.m34700a(16777225, (pblb.pgla) new C12392i0());
                        pblb.m34700a(16777226, (pblb.pgla) new C12394j0());
                        pblb.m34700a(16777228, (pblb.pgla) new C12381d());
                        pblb.m34700a((int) InputDeviceCompat.SOURCE_JOYSTICK, (pblb.pgla) new C12383e());
                        pblb.m34700a(16777233, (pblb.pgla) new C12385f());
                        pblb.m34700a(16777235, (pblb.pgla) new C12387g());
                        pblb.m34700a(16777238, (pblb.pgla) new C12389h());
                        pblb.m34700a(16777239, (pblb.pgla) new C12391i());
                        pblb.m34700a(16777241, (pblb.pgla) new C12393j());
                        pblb.m34700a(16777242, (pblb.pgla) new C12395k());
                        pblb.m34700a(16777243, (pblb.pgla) new C12397l());
                        pblb.m34700a(16777244, (pblb.pgla) new C12399m());
                        pblb.m34700a(16777245, (pblb.pgla) new C12403o());
                        pblb.m34700a(16777246, (pblb.pgla) new C12405p());
                        pblb.m34700a(16777247, (pblb.pgla) new C12407q());
                        pblb.m34700a(16777248, (pblb.pgla) new C12409r());
                        pblb.m34700a(16777249, (pblb.pgla) new C12411s());
                        pblb.m34700a(16777250, (pblb.pgla) new C12413t());
                        pblb.m34700a(16777251, (pblb.pgla) new C12415u());
                        pblb.m34700a(16777240, (pblb.pgla) new C12417v());
                        pblb.m34700a(16777252, (pblb.pgla) new C12419w());
                        pblb.m34700a(16777253, (pblb.pgla) new C12421x());
                        pblb.m34700a(16777254, (pblb.pgla) new C12425z());
                        pblb.m34700a(16777255, (pblb.pgla) new C12376a0());
                        pblb.m34700a(16777256, (pblb.pgla) new C12378b0());
                        pblb.m34700a(16777257, (pblb.pgla) new C12380c0());
                        pblb.m34700a((int) InputDeviceCompat.SOURCE_HDMI, pbly.m34765b() ? new C12406p0() : new C12402n0());
                        pblb.m34700a(33554434, (pblb.pgla) new C12408q0());
                        pblj.m34711a();
                        com.bytedance.mobsec.metasec.p089ov.pgla.m6460a();
                        pblk.m34714a(16777219, 0, 0, (String) null, applicationContext);
                        pblk.m34714a(16777220, 0, 0, (String) null, (Object) null);
                        f29388a = true;
                    }
                }
                if (f29389b.containsKey(str4)) {
                    return false;
                }
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(cVar2.mo76429a(cVar2.f29371a));
                jSONArray.put(cVar2.mo76429a(cVar2.f29378h));
                jSONArray.put(cVar2.mo76429a(cVar2.f29377g));
                jSONArray.put(cVar2.mo76429a(cVar2.f29379i));
                jSONArray.put(cVar2.mo76429a(C12422x0.m34801a()));
                jSONArray.put(cVar2.mo76429a(cVar2.f29372b));
                jSONArray.put(cVar2.mo76429a(cVar2.f29373c));
                jSONArray.put(cVar2.mo76429a(cVar2.f29374d));
                jSONArray.put(cVar2.mo76429a(cVar2.f29375e));
                jSONArray.put(cVar2.mo76429a(cVar2.f29376f));
                jSONArray.put(String.valueOf(cVar2.f29380j));
                jSONArray.put(String.valueOf(cVar2.f29381k));
                jSONArray.put(String.valueOf(cVar2.f29382l));
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry next : cVar2.f29383m.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                        jSONArray2.put(cVar2.mo76429a(next.getKey()));
                        jSONArray2.put(cVar2.mo76429a(next.getValue()));
                    }
                }
                jSONArray.put(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                for (Map.Entry next2 : cVar2.f29384n.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next2.getKey())) {
                        jSONArray3.put(cVar2.mo76429a(next2.getKey()));
                        jSONArray3.put(cVar2.mo76429a(next2.getValue()));
                    }
                }
                jSONArray.put(jSONArray3);
                if (!((Boolean) pblb.m34699a(67108865, jSONArray.toString())).booleanValue()) {
                    return false;
                }
                f29389b.put(str4, cVar2);
                return true;
            } else {
                throw new NullPointerException((String) pblk.m34714a(16777217, 0, 0, "c20a0c", new byte[]{113, 63, 77, 19, 6, 115, 32, Ascii.DLE, 110, 36, 126, 52, 3, Ascii.ESC, 0, 96, 32, 17, 100, 113, 124, 37, 79, Ascii.f17936EM}));
            }
        }
    }
}
