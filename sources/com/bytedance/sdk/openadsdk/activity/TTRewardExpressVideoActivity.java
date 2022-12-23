package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3485l;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import java.util.HashMap;
import java.util.Map;

public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
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
        this.f7020m.mo19058a(this.f7019l.mo19292b(), this.f7010c, this.f7000a, mo18416H(), jVar);
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
                TTRewardExpressVideoActivity.this.f7024q.removeMessages(300);
                TTRewardExpressVideoActivity.this.mo18412D();
                TTRewardExpressVideoActivity.this.f7019l.mo19293b(true);
                TTRewardExpressVideoActivity.this.mo18576M();
                if (C3485l.m10539b(TTRewardExpressVideoActivity.this.f7010c)) {
                    TTRewardExpressVideoActivity.this.f6987N.set(true);
                    TTRewardExpressVideoActivity.this.mo18444m();
                } else if (TTRewardExpressVideoActivity.this.mo18439h()) {
                    TTRewardExpressVideoActivity.this.mo18423a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.f7183S = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.mo18517L();
            }

            /* renamed from: b */
            public void mo16465b(long j, int i) {
                TTRewardExpressVideoActivity.this.f7024q.removeMessages(300);
                if (C3953b.m12901c()) {
                    TTRewardExpressVideoActivity.this.mo18578c("onVideoError");
                } else if (TTRewardExpressVideoActivity.this.f7184T != null) {
                    TTRewardExpressVideoActivity.this.f7184T.onVideoError();
                }
                TTRewardExpressVideoActivity.this.mo18411C();
                if (!TTRewardExpressVideoActivity.this.f7020m.mo19070b()) {
                    TTRewardExpressVideoActivity.this.mo18412D();
                    TTRewardExpressVideoActivity.this.mo18517L();
                    TTRewardExpressVideoActivity.this.f7020m.mo19082m();
                    if (TTRewardExpressVideoActivity.this.mo18439h()) {
                        TTRewardExpressVideoActivity.this.mo18423a(false);
                    } else {
                        TTRewardExpressVideoActivity.this.finish();
                    }
                    TTRewardExpressVideoActivity.this.f7019l.mo19291a(true);
                    TTRewardExpressVideoActivity.this.f7020m.mo19056a(true ^ TTRewardExpressVideoActivity.this.f7020m.mo19051B() ? 1 : 0, 2);
                }
            }

            /* renamed from: a */
            public void mo16462a() {
                TTRewardExpressVideoActivity.this.f7024q.removeMessages(300);
                TTRewardExpressVideoActivity.this.mo18412D();
                if (TTRewardExpressVideoActivity.this.mo18439h()) {
                    TTRewardExpressVideoActivity.this.mo18423a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.f7020m.mo19056a(TTRewardExpressVideoActivity.this.f7020m.mo19051B() ^ true ? 1 : 0, TTRewardExpressVideoActivity.this.f7020m.mo19051B() ^ true ? 1 : 0);
                TTRewardExpressVideoActivity.this.f7020m.mo19082m();
            }

            /* renamed from: a */
            public void mo16464a(long j, long j2) {
                if (!TTRewardExpressVideoActivity.this.f6981H && TTRewardExpressVideoActivity.this.f7020m.mo19070b()) {
                    TTRewardExpressVideoActivity.this.f7020m.mo19084o();
                }
                if (!TTRewardExpressVideoActivity.this.f7029v.get()) {
                    TTRewardExpressVideoActivity.this.f7024q.removeMessages(300);
                    if (j != TTRewardExpressVideoActivity.this.f7020m.mo19075f()) {
                        TTRewardExpressVideoActivity.this.mo18412D();
                    }
                    if (TTRewardExpressVideoActivity.this.f7020m.mo19070b()) {
                        TTRewardExpressVideoActivity.this.f7020m.mo19057a(j);
                        int f = C3578m.m11241h().mo19941f(String.valueOf(TTRewardExpressVideoActivity.this.f7027t));
                        boolean z = TTRewardExpressVideoActivity.this.f7019l.mo19299h() && f != -1 && f >= 0;
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                        long j3 = j / 1000;
                        tTRewardExpressVideoActivity.f7026s = (int) (tTRewardExpressVideoActivity.f7020m.mo19052C() - ((double) j3));
                        int i = (int) j3;
                        if ((TTRewardExpressVideoActivity.this.f6974A.get() || TTRewardExpressVideoActivity.this.f7032y.get()) && TTRewardExpressVideoActivity.this.f7020m.mo19070b()) {
                            TTRewardExpressVideoActivity.this.f7020m.mo19084o();
                        }
                        if (TTRewardExpressVideoActivity.this.f7026s >= 0) {
                            TTRewardExpressVideoActivity.this.f7018k.mo19027a(String.valueOf(TTRewardExpressVideoActivity.this.f7026s), (CharSequence) null);
                        }
                        TTRewardExpressVideoActivity.this.f7016i.mo19319c(i);
                        TTRewardExpressVideoActivity.this.mo18577a(j, j2);
                        if (!(TTRewardExpressVideoActivity.this.f7019l == null || TTRewardExpressVideoActivity.this.f7019l.mo19285a() == null)) {
                            TTRewardExpressVideoActivity.this.f7019l.mo19285a().mo17175a((CharSequence) String.valueOf(TTRewardExpressVideoActivity.this.f7026s), i, 0);
                        }
                        if (TTRewardExpressVideoActivity.this.f7026s > 0) {
                            if (!z || i < f || TTRewardExpressVideoActivity.this.f7010c.mo19705f() == 5) {
                                TTRewardExpressVideoActivity.this.f7018k.mo19027a(String.valueOf(TTRewardExpressVideoActivity.this.f7026s), (CharSequence) null);
                                return;
                            }
                            TTRewardExpressVideoActivity.this.f7030w.getAndSet(true);
                            TTRewardExpressVideoActivity.this.f7018k.mo19037d(true);
                            TTRewardExpressVideoActivity.this.f7018k.mo19027a(String.valueOf(TTRewardExpressVideoActivity.this.f7026s), (CharSequence) C3537f.f8808c);
                            TTRewardExpressVideoActivity.this.f7018k.mo19038e(true);
                        } else if (TTRewardExpressVideoActivity.this.mo18439h()) {
                            TTRewardExpressVideoActivity.this.mo18423a(false);
                        } else {
                            TTRewardExpressVideoActivity.this.finish();
                        }
                    }
                }
            }
        });
        boolean a = mo18426a(j, z, (Map<String, Object>) hashMap);
        if (a && !z) {
            this.f7182R = (int) (System.currentTimeMillis() / 1000);
        }
        return a;
    }
}
