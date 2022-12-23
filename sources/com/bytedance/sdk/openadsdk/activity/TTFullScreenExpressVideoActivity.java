package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.component.reward.p144b.C3329c;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import java.util.HashMap;
import java.util.Map;

public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo18417I() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo18445n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo18461t() {
        if (this.f7010c == null) {
            finish();
            return;
        }
        this.f7022o.mo19107a(false);
        super.mo18461t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18433d() {
        super.mo18433d();
        if (C3501p.m10769i(this.f7010c)) {
            this.f7022o.mo19107a(true);
            this.f7022o.mo19110b();
            mo18423a(false);
            return;
        }
        mo18434d(0);
    }

    /* renamed from: a */
    public boolean mo18514a(long j, boolean z) {
        C3167j jVar;
        if (this.f7019l == null || this.f7019l.mo19285a() == null) {
            jVar = new C3167j();
        } else {
            jVar = this.f7019l.mo19285a().getAdShowTime();
        }
        C3167j jVar2 = jVar;
        if (this.f6985L == null || !(this.f6985L instanceof C3329c) || this.f6986M) {
            this.f7020m.mo19058a(this.f7019l.mo19292b(), this.f7010c, this.f7000a, mo18416H(), jVar2);
        } else {
            this.f7020m.mo19058a(((C3329c) this.f6985L).mo19185d(), this.f7010c, this.f7000a, mo18416H(), jVar2);
        }
        HashMap hashMap = new HashMap();
        if (this.f7019l != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.f7019l.mo19300i()));
        }
        if (!TextUtils.isEmpty(this.f6977D)) {
            hashMap.put("rit_scene", this.f6977D);
        }
        this.f7020m.mo19063a((Map<String, Object>) hashMap);
        this.f7020m.mo19059a((C2526c.C2527a) new C2526c.C2527a() {
            /* renamed from: a */
            public void mo16463a(long j, int i) {
                TTFullScreenExpressVideoActivity.this.f7024q.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.mo18412D();
                TTFullScreenExpressVideoActivity.this.f7019l.mo19293b(true);
                TTFullScreenExpressVideoActivity.this.mo18517L();
                if (TTFullScreenExpressVideoActivity.this.mo18439h()) {
                    TTFullScreenExpressVideoActivity.this.mo18423a(false);
                } else if (C3498n.m10583c(TTFullScreenExpressVideoActivity.this.f7010c)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                } else if (TTFullScreenExpressVideoActivity.this.f7019l != null && TTFullScreenExpressVideoActivity.this.f7019l.mo19285a() != null) {
                    TTFullScreenExpressVideoActivity.this.f7019l.mo19285a().mo17175a((CharSequence) "0", 0, 0);
                    if (TTFullScreenExpressVideoActivity.this.f7019l.mo19299h()) {
                        TTFullScreenExpressVideoActivity.this.f7018k.mo19027a("0", (CharSequence) "X");
                        TTFullScreenExpressVideoActivity.this.f7018k.mo19038e(true);
                    }
                }
            }

            /* renamed from: b */
            public void mo16465b(long j, int i) {
                TTFullScreenExpressVideoActivity.this.f7024q.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.mo18411C();
                if (!TTFullScreenExpressVideoActivity.this.f7020m.mo19070b()) {
                    TTFullScreenExpressVideoActivity.this.mo18412D();
                    TTFullScreenExpressVideoActivity.this.f7020m.mo19082m();
                    C2975l.m8391e("TTFullScreenExpressVideoActivity", "onError、、、、、、、、");
                    TTFullScreenExpressVideoActivity.this.f7019l.mo19291a(true);
                    if (TTFullScreenExpressVideoActivity.this.mo18439h()) {
                        TTFullScreenExpressVideoActivity.this.mo18423a(false);
                        TTFullScreenExpressVideoActivity.this.f7020m.mo19056a(true ^ TTFullScreenExpressVideoActivity.this.f7020m.mo19051B() ? 1 : 0, 2);
                        return;
                    }
                    TTFullScreenExpressVideoActivity.this.finish();
                }
            }

            /* renamed from: a */
            public void mo16462a() {
                TTFullScreenExpressVideoActivity.this.f7024q.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.mo18412D();
                C2975l.m8384b("TTFullScreenExpressVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenExpressVideoActivity.this.mo18439h()) {
                    TTFullScreenExpressVideoActivity.this.mo18423a(false);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
                TTFullScreenExpressVideoActivity.this.f7020m.mo19056a(TTFullScreenExpressVideoActivity.this.f7020m.mo19051B() ^ true ? 1 : 0, TTFullScreenExpressVideoActivity.this.f7020m.mo19051B() ^ true ? 1 : 0);
                TTFullScreenExpressVideoActivity.this.f7020m.mo19082m();
            }

            /* renamed from: a */
            public void mo16464a(long j, long j2) {
                if (!TTFullScreenExpressVideoActivity.this.f6981H && TTFullScreenExpressVideoActivity.this.f7020m.mo19070b()) {
                    TTFullScreenExpressVideoActivity.this.f7020m.mo19084o();
                }
                if (!TTFullScreenExpressVideoActivity.this.f7029v.get()) {
                    TTFullScreenExpressVideoActivity.this.f7024q.removeMessages(300);
                    if (j != TTFullScreenExpressVideoActivity.this.f7020m.mo19075f()) {
                        TTFullScreenExpressVideoActivity.this.mo18412D();
                    }
                    if (TTFullScreenExpressVideoActivity.this.f7020m.mo19070b()) {
                        TTFullScreenExpressVideoActivity.this.f7020m.mo19057a(j);
                        TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                        long j3 = j / 1000;
                        tTFullScreenExpressVideoActivity.f7026s = (int) (tTFullScreenExpressVideoActivity.f7020m.mo19052C() - ((double) j3));
                        int i = (int) j3;
                        if ((TTFullScreenExpressVideoActivity.this.f6974A.get() || TTFullScreenExpressVideoActivity.this.f7032y.get()) && TTFullScreenExpressVideoActivity.this.f7020m.mo19070b()) {
                            TTFullScreenExpressVideoActivity.this.f7020m.mo19084o();
                        }
                        if (!(TTFullScreenExpressVideoActivity.this.f7019l == null || TTFullScreenExpressVideoActivity.this.f7019l.mo19285a() == null)) {
                            TTFullScreenExpressVideoActivity.this.f7019l.mo19285a().mo17175a((CharSequence) String.valueOf(TTFullScreenExpressVideoActivity.this.f7026s), i, 0);
                        }
                        if (TTFullScreenExpressVideoActivity.this.f7019l.mo19299h()) {
                            TTFullScreenExpressVideoActivity.this.mo18518e(i);
                            if (TTFullScreenExpressVideoActivity.this.f7026s >= 0) {
                                TTFullScreenExpressVideoActivity.this.f7018k.mo19037d(true);
                                TTFullScreenExpressVideoActivity.this.f7018k.mo19027a(String.valueOf(TTFullScreenExpressVideoActivity.this.f7026s), (CharSequence) null);
                            }
                        }
                        if (TTFullScreenExpressVideoActivity.this.f7026s <= 0) {
                            C2975l.m8384b("TTFullScreenExpressVideoActivity", "onProgressUpdate、、、、、、、、");
                            if (TTFullScreenExpressVideoActivity.this.mo18439h()) {
                                TTFullScreenExpressVideoActivity.this.mo18423a(false);
                            } else if (C3498n.m10583c(TTFullScreenExpressVideoActivity.this.f7010c)) {
                                TTFullScreenExpressVideoActivity.this.finish();
                            }
                        }
                    }
                }
            }
        });
        return mo18426a(j, z, (Map<String, Object>) hashMap);
    }
}
