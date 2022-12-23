package p394io.presage;

import android.content.Context;
import com.ogury.sdk.Ogury;
import com.ogury.sdk.OguryConfiguration;

@Deprecated
/* renamed from: io.presage.Presage */
public class Presage {

    /* renamed from: a */
    private static Presage f29335a;

    @Deprecated
    public static Presage getInstance() {
        if (f29335a == null) {
            f29335a = new Presage();
        }
        return f29335a;
    }

    private Presage() {
    }

    @Deprecated
    public void start(String str, Context context) {
        Ogury.start(new OguryConfiguration.Builder(context, str).build());
    }
}
