package com.smaato.sdk.core.datacollector;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.NullableSupplier;
import com.smaato.sdk.core.util.p382fi.Supplier;

class UserAgentProvider implements Supplier<String> {
    private final Context context;

    UserAgentProvider(Context context2) {
        this.context = (Context) Objects.requireNonNull(context2);
    }

    public String get() {
        String str;
        if (Build.VERSION.SDK_INT >= 17) {
            str = WebSettings.getDefaultUserAgent(this.context);
        } else {
            str = (String) Threads.runOnUiBlocking(new NullableSupplier() {
                public final Object get() {
                    return UserAgentProvider.this.lambda$get$0$UserAgentProvider();
                }
            });
        }
        if (str == null) {
            str = System.getProperty("http.agent");
        }
        return str == null ? "" : str;
    }

    public /* synthetic */ String lambda$get$0$UserAgentProvider() {
        return new WebView(this.context).getSettings().getUserAgentString();
    }
}
