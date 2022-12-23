package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p153g.C3517d;
import com.bytedance.sdk.openadsdk.core.p153g.C3518e;
import com.bytedance.sdk.openadsdk.core.widget.C3750b;
import com.bytedance.sdk.openadsdk.dislike.C3778b;
import com.bytedance.sdk.openadsdk.utils.C3978c;
import com.bytedance.sdk.openadsdk.utils.C3981d;
import com.facebook.internal.NativeProtocol;
import org.json.JSONException;
import org.json.JSONObject;

public class TTDelegateActivity extends Activity {

    /* renamed from: a */
    private Intent f7062a;

    /* renamed from: b */
    private AlertDialog f7063b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3750b f7064c;

    /* renamed from: d */
    private TTAdDislike f7065d;

    /* renamed from: a */
    public static void m8754a() {
        Intent intent = new Intent(C3578m.m11231a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 5);
        if (C3578m.m11231a() != null) {
            C3578m.m11231a().startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m8755a(C3498n nVar, String str) {
        Intent intent = new Intent(C3578m.m11231a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("materialmeta", nVar.mo19674ar().toString());
        intent.putExtra("closed_listener_key", str);
        if (C3578m.m11231a() != null) {
            C3578m.m11231a().startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        m8760b();
        this.f7062a = getIntent();
        if (C3578m.m11231a() == null) {
            C3578m.m11233a(this);
        }
    }

    /* renamed from: b */
    private void m8760b() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C3578m.m11231a() == null) {
            C3578m.m11233a(this);
        }
        setIntent(intent);
        this.f7062a = intent;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (getIntent() != null) {
            m8761c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f7063b != null && this.f7063b.isShowing()) {
                this.f7063b.dismiss();
            }
            if (this.f7064c != null && this.f7064c.isShowing()) {
                this.f7064c.dismiss();
            }
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    /* renamed from: c */
    private void m8761c() {
        int intExtra = this.f7062a.getIntExtra("type", 0);
        String stringExtra = this.f7062a.getStringExtra("app_download_url");
        this.f7062a.getStringExtra(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);
        if (intExtra == 1) {
            return;
        }
        if (intExtra == 3) {
            m8758a(stringExtra, this.f7062a.getStringExtra("dialog_title_key"), this.f7062a.getStringExtra("dialog_content_key"));
        } else if (intExtra == 4) {
            m8759a(this.f7062a.getStringExtra("permission_id_key"), this.f7062a.getStringArrayExtra("permission_content_key"));
        } else if (intExtra == 5) {
            m8762d();
        } else if (intExtra != 6) {
            finish();
        } else {
            m8756a(this.f7062a.getStringExtra("materialmeta"), this.f7062a.getStringExtra("closed_listener_key"));
        }
    }

    /* renamed from: a */
    private void m8756a(String str, String str2) {
        if (str != null && this.f7065d == null) {
            try {
                C3778b bVar = new C3778b(this, C3423b.m10208a(new JSONObject(str)));
                this.f7065d = bVar;
                bVar.mo20584a(str2);
                this.f7065d.setDislikeInteractionCallback(new TTAdDislike.DislikeInteractionCallback() {
                    public void onSelected(int i, String str) {
                        C2975l.m8387c("showDislike", "onSelected->position=" + i + ",value=" + str);
                        TTDelegateActivity.this.finish();
                    }

                    public void onCancel() {
                        C2975l.m8387c("showDislike", "onCancel->onCancel....");
                        TTDelegateActivity.this.finish();
                    }

                    public void onRefuse() {
                        C2975l.m8387c("showDislike", "onRefuse->onRefuse....");
                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        TTAdDislike tTAdDislike = this.f7065d;
        if (tTAdDislike != null) {
            tTAdDislike.showDislikeDialog();
        }
    }

    /* renamed from: d */
    private void m8762d() {
        if (this.f7064c == null) {
            C3750b bVar = new C3750b(this);
            this.f7064c = bVar;
            bVar.mo20546a(C2984t.m8425a(this, "no_thank_you"), (C3750b.C3754b) new C3750b.C3754b() {
                /* renamed from: a */
                public void mo18508a() {
                    TTAdSdk.setGdpr(0);
                    if (TTDelegateActivity.this.f7064c.isShowing()) {
                        TTDelegateActivity.this.f7064c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            }).mo20547a(C2984t.m8425a(this, "yes_i_agree"), (C3750b.C3755c) new C3750b.C3755c() {
                /* renamed from: a */
                public void mo18507a() {
                    TTAdSdk.setGdpr(1);
                    if (TTDelegateActivity.this.f7064c.isShowing()) {
                        TTDelegateActivity.this.f7064c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            });
        }
        if (!this.f7064c.isShowing()) {
            this.f7064c.show();
        }
    }

    /* renamed from: a */
    private void m8759a(final String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            finish();
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                C3517d.m10832a().mo19822a((Activity) this, strArr, (C3518e) new C3518e() {
                    /* renamed from: a */
                    public void mo18509a() {
                        C3981d.m13044a(str);
                        TTDelegateActivity.this.finish();
                    }

                    /* renamed from: a */
                    public void mo18510a(String str) {
                        C3981d.m13045a(str, str);
                        TTDelegateActivity.this.finish();
                    }
                });
            } catch (Exception unused) {
                finish();
            }
        } else {
            C2975l.m8384b(TTAdConstant.TAG, "Already have permission");
            finish();
        }
    }

    /* renamed from: a */
    private void m8758a(final String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C2984t.m8425a(this, "tt_tip");
        }
        String str4 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        m8757a(str4, str3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C3978c.m13034a(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C3978c.m13037b(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                C3978c.m13038c(str);
                TTDelegateActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    private void m8757a(String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
        String str3;
        try {
            if (this.f7063b == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    str3 = "Theme.Dialog.TTDownload";
                } else {
                    str3 = "Theme.Dialog.TTDownloadOld";
                }
                this.f7063b = new AlertDialog.Builder(this, C2984t.m8434g(this, str3)).create();
            }
            this.f7063b.setTitle(String.valueOf(str));
            this.f7063b.setMessage(String.valueOf(str2));
            this.f7063b.setButton(-1, C2984t.m8425a(this, "tt_label_ok"), onClickListener);
            this.f7063b.setButton(-2, C2984t.m8425a(this, "tt_label_cancel"), onClickListener2);
            this.f7063b.setOnCancelListener(onCancelListener);
            if (!this.f7063b.isShowing()) {
                this.f7063b.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C3517d.m10832a().mo19823a((Activity) this, strArr, iArr);
        finish();
    }
}
