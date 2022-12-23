package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.config.o */
public class C4323o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10678a;

    /* renamed from: com.fyber.inneractive.sdk.config.o$a */
    public class C4324a implements Runnable {
        public C4324a() {
        }

        public void run() {
            IAConfigManager iAConfigManager = C4323o.this.f10678a;
            iAConfigManager.f10555t.mo24781c(iAConfigManager.f10528B);
        }
    }

    public C4323o(IAConfigManager iAConfigManager) {
        this.f10678a = iAConfigManager;
    }

    public void run() {
        IAConfigManager iAConfigManager = this.f10678a;
        if (iAConfigManager.f10552q == null) {
            Context context = iAConfigManager.f10541f;
            HashSet hashSet = new HashSet();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            List<InputMethodInfo> list = null;
            try {
                list = inputMethodManager.getEnabledInputMethodList();
            } catch (Throwable unused) {
            }
            if (list != null) {
                int i = 0;
                for (InputMethodInfo enabledInputMethodSubtypeList : list) {
                    for (InputMethodSubtype next : inputMethodManager.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                        if (next.getMode().equals("keyboard") && i < 10) {
                            String locale = next.getLocale();
                            if (!TextUtils.isEmpty(locale)) {
                                try {
                                    String replace = locale.replace("_", "-");
                                    hashSet.add(replace);
                                    IAlog.m16699a("Available input language: %s", replace);
                                    i++;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 24) {
                    hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(",")));
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (locale2 != null) {
                        hashSet.add(locale2.toString().replace("_", "-"));
                    }
                }
            }
            iAConfigManager.f10552q = new ArrayList(hashSet);
        }
        C5357n.f14225b.post(new C4324a());
    }
}
