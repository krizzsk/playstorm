package com.mbridge.msdk.foundation.same.p301c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.p299a.C8414a;
import com.mbridge.msdk.foundation.same.p299a.C8416c;
import com.mbridge.msdk.foundation.same.p301c.C8429d;
import com.mbridge.msdk.foundation.same.p303e.C8437b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8611x;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.c.b */
/* compiled from: CommonImageLoader */
public final class C8425b {

    /* renamed from: a */
    private static C8425b f20387a;

    /* renamed from: b */
    private C8437b f20388b;

    /* renamed from: c */
    private C8416c<String, Bitmap> f20389c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinkedHashMap<String, List<C8428c>> f20390d = new LinkedHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f20391e = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    String string = message.getData().getString("message_key");
                    Bitmap a = C8424a.m24337a(message.getData().getString("message_bitmap"));
                    C8425b.this.mo57505a(string, a);
                    LinkedList linkedList = (LinkedList) C8425b.this.f20390d.get(string);
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C8428c cVar = (C8428c) it.next();
                            if (cVar != null) {
                                cVar.onSuccessLoad(a, string);
                            }
                        }
                    }
                    C8425b.this.f20390d.remove(string);
                } else if (message.what == 2) {
                    String string2 = message.getData().getString("message_key");
                    String string3 = message.getData().getString("message_message");
                    LinkedList linkedList2 = (LinkedList) C8425b.this.f20390d.get(string2);
                    if (linkedList2 != null) {
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            C8428c cVar2 = (C8428c) it2.next();
                            if (cVar2 != null) {
                                cVar2.onFailedLoad(string3, string2);
                            }
                        }
                    }
                    C8425b.this.f20390d.remove(string2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    /* renamed from: a */
    public final void mo57505a(String str, Bitmap bitmap) {
        if (m24345d(str) == null && bitmap != null) {
            this.f20389c.mo15675a(str, bitmap);
        }
    }

    /* renamed from: d */
    private Bitmap m24345d(String str) {
        return this.f20389c.mo15677b(str);
    }

    private C8425b(Context context) {
        this.f20388b = new C8437b(context);
        C2278a f = C2283b.m5275a().mo15571f(C2350a.m5601e().mo15793h());
        int i = 10;
        int s = f != null ? f.mo15533s() : 10;
        this.f20389c = new C8414a(((int) Runtime.getRuntime().maxMemory()) / (s > 0 ? s : i));
    }

    /* renamed from: a */
    public static C8425b m24339a(Context context) {
        if (f20387a == null) {
            f20387a = new C8425b(context);
        }
        return f20387a;
    }

    /* renamed from: a */
    public final void mo57504a() {
        this.f20389c.mo15678b();
        LinkedHashMap<String, List<C8428c>> linkedHashMap = this.f20390d;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    /* renamed from: b */
    public static void m24344b() {
        f20387a.mo57508c();
    }

    /* renamed from: a */
    public final void mo57506a(String str, C8428c cVar) {
        String a = C8611x.m24899a(str);
        if (!C8613y.m24926a(str) && !C8613y.m24926a(str) && !C8613y.m24926a(a)) {
            File file = new File(a);
            Bitmap d = m24345d(str);
            if (d != null && !d.isRecycled()) {
                cVar.onSuccessLoad(d, str);
            } else if (file.exists()) {
                Bitmap a2 = C8424a.m24337a(a);
                if (a2 == null || a2.isRecycled()) {
                    m24342a(str, str, a, true, false, cVar);
                    return;
                }
                mo57505a(str, a2);
                cVar.onSuccessLoad(a2, str);
            } else {
                m24342a(str, str, a, false, false, cVar);
            }
        }
    }

    /* renamed from: a */
    public final Bitmap mo57503a(String str) {
        Bitmap a;
        if (C8613y.m24926a(str)) {
            return null;
        }
        String a2 = C8611x.m24899a(str);
        File file = new File(a2);
        if (m24345d(str) != null) {
            return m24345d(str);
        }
        if (!file.exists() || (a = C8424a.m24337a(a2)) == null) {
            return null;
        }
        mo57505a(str, a);
        return a;
    }

    /* renamed from: b */
    public final boolean mo57507b(String str) {
        if (C8613y.m24926a(str)) {
            return false;
        }
        File file = new File(C8611x.m24899a(str));
        if (m24345d(str) == null && !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m24342a(String str, String str2, String str3, boolean z, boolean z2, C8428c cVar) {
        if (!this.f20390d.containsKey(str2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(cVar);
            this.f20390d.put(str2, linkedList);
            this.f20388b.mo57528a(m24340a(str, str2, str3, z, z2));
            return;
        }
        LinkedList linkedList2 = (LinkedList) this.f20390d.get(str2);
        if (linkedList2 != null && !linkedList2.contains(cVar)) {
            linkedList2.add(cVar);
        }
    }

    /* renamed from: a */
    private C8429d m24340a(String str, String str2, String str3, boolean z, boolean z2) {
        C84272 r6 = new C8429d.C8431a() {
            /* renamed from: a */
            public final void mo57511a(String str, String str2) {
                Message obtainMessage = C8425b.this.f20391e.obtainMessage();
                obtainMessage.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString("message_key", str);
                bundle.putString("message_bitmap", str2);
                obtainMessage.setData(bundle);
                C8425b.this.f20391e.sendMessage(obtainMessage);
            }

            /* renamed from: b */
            public final void mo57512b(String str, String str2) {
                Message obtainMessage = C8425b.this.f20391e.obtainMessage();
                obtainMessage.what = 2;
                Bundle bundle = new Bundle();
                bundle.putString("message_key", str);
                bundle.putString("message_message", str2);
                obtainMessage.setData(bundle);
                C8425b.this.f20391e.sendMessage(obtainMessage);
            }
        };
        C8429d dVar = new C8429d(str, str2, str3);
        dVar.mo57516a(z);
        dVar.mo57515a((C8429d.C8431a) r6);
        return dVar;
    }

    /* renamed from: c */
    public final void mo57508c() {
        C8416c<String, Bitmap> cVar = this.f20389c;
        if (cVar != null) {
            cVar.mo15678b();
        }
    }

    /* renamed from: c */
    public final void mo57509c(String str) {
        try {
            if (this.f20389c != null && this.f20389c.mo15673a().contains(str)) {
                this.f20389c.mo15674a(str);
            }
        } catch (Throwable th) {
            C8608u.m24884d("ImageLoader", th.getMessage());
        }
    }
}
