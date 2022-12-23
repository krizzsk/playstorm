package com.ogury.p376ed.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import java.util.Collection;
import java.util.List;
import p394io.presage.mraid.browser.Android8AndLaterShortcutActivity;
import p394io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.hs */
public final class C10603hs {

    /* renamed from: a */
    public static final C10604a f26757a = new C10604a((byte) 0);

    /* renamed from: b */
    private Context f26758b;

    /* renamed from: c */
    private final C10646ix f26759c;

    /* renamed from: d */
    private final C10539fv f26760d;

    /* renamed from: e */
    private C10616ib f26761e;

    /* renamed from: f */
    private C10606hu f26762f;

    /* renamed from: g */
    private ShortcutInfo f26763g;

    private C10603hs(Context context, C10646ix ixVar, C10539fv fvVar, C10616ib ibVar, C10606hu huVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(ixVar, "mraidShortcutIcon");
        C10765mq.m32773b(fvVar, "bitmapDownloader");
        C10765mq.m32773b(ibVar, "shortcutManagerFactory");
        C10765mq.m32773b(huVar, "prefs");
        this.f26758b = context;
        this.f26759c = ixVar;
        this.f26760d = fvVar;
        this.f26761e = ibVar;
        this.f26762f = huVar;
    }

    public /* synthetic */ C10603hs(Context context, C10646ix ixVar) {
        this(context, ixVar, new C10539fv(), new C10616ib(), new C10606hu(context));
    }

    /* renamed from: com.ogury.ed.internal.hs$a */
    public static final class C10604a {
        public /* synthetic */ C10604a(byte b) {
            this();
        }

        private C10604a() {
        }
    }

    /* renamed from: a */
    public final void mo67572a() {
        Bitmap b;
        if (!this.f26759c.mo67662e() && (b = m32286b()) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f26763g = m32282a(b);
                ShortcutManager a = C10616ib.m32359a(this.f26758b);
                ShortcutInfo shortcutInfo = this.f26763g;
                ShortcutInfo shortcutInfo2 = null;
                if (shortcutInfo == null) {
                    C10765mq.m32771a("shortcutInfo");
                    shortcutInfo = null;
                }
                String id = shortcutInfo.getId();
                C10765mq.m32770a((Object) id, "shortcutInfo.id");
                if (m32285a(a, id)) {
                    ShortcutInfo shortcutInfo3 = this.f26763g;
                    if (shortcutInfo3 == null) {
                        C10765mq.m32771a("shortcutInfo");
                    } else {
                        shortcutInfo2 = shortcutInfo3;
                    }
                    m32288b(shortcutInfo2, a);
                } else {
                    ShortcutInfo shortcutInfo4 = this.f26763g;
                    if (shortcutInfo4 == null) {
                        C10765mq.m32771a("shortcutInfo");
                    } else {
                        shortcutInfo2 = shortcutInfo4;
                    }
                    m32283a(shortcutInfo2, a);
                }
            } else {
                if (this.f26762f.mo67574a(this.f26759c.mo67658a()) || this.f26762f.mo67576c(this.f26759c.mo67658a())) {
                    m32284a(this.f26759c.mo67659b());
                }
                m32287b(b);
            }
            this.f26762f.mo67573a(this.f26759c.mo67658a(), this.f26759c.mo67661d());
        }
    }

    /* renamed from: b */
    private final Bitmap m32286b() {
        return C10539fv.m32045a(this.f26759c.mo67660c());
    }

    /* renamed from: a */
    private static boolean m32285a(ShortcutManager shortcutManager, String str) {
        List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
        C10765mq.m32770a((Object) pinnedShortcuts, "shortcutManager.pinnedShortcuts");
        Iterable<ShortcutInfo> iterable = pinnedShortcuts;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (ShortcutInfo id : iterable) {
            if (C10765mq.m32772a((Object) str, (Object) id.getId())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final ShortcutInfo m32282a(Bitmap bitmap) {
        ShortcutInfo build = new ShortcutInfo.Builder(this.f26758b, this.f26759c.mo67658a()).setShortLabel(this.f26759c.mo67659b()).setIcon(Icon.createWithBitmap(bitmap)).setIntent(m32281a((Class<?>) Android8AndLaterShortcutActivity.class)).build();
        C10765mq.m32770a((Object) build, "Builder(context, mraidSh…va))\n            .build()");
        return build;
    }

    /* renamed from: a */
    private static void m32283a(ShortcutInfo shortcutInfo, ShortcutManager shortcutManager) {
        if (shortcutManager.isRequestPinShortcutSupported()) {
            shortcutManager.requestPinShortcut(shortcutInfo, (IntentSender) null);
        }
    }

    /* renamed from: b */
    private static boolean m32288b(ShortcutInfo shortcutInfo, ShortcutManager shortcutManager) {
        return shortcutManager.updateShortcuts(C10692km.m32644a(shortcutInfo));
    }

    /* renamed from: b */
    private final void m32287b(Bitmap bitmap) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.shortcut.INTENT", m32281a((Class<?>) ShortcutActivity.class));
        intent.putExtra("android.intent.extra.shortcut.NAME", this.f26759c.mo67659b());
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        try {
            this.f26758b.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final Intent m32281a(Class<?> cls) {
        Intent intent = new Intent(this.f26758b.getApplicationContext(), cls);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.putExtra("identifier", this.f26759c.mo67658a());
        intent.addFlags(8388608);
        intent.addFlags(67108864);
        intent.setAction("android.intent.action.MAIN");
        return intent;
    }

    /* renamed from: a */
    private final void m32284a(String str) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        try {
            this.f26758b.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }
}
