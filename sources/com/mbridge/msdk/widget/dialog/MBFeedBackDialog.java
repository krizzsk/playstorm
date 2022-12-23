package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;

public class MBFeedBackDialog extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9593a f23594a;

    /* renamed from: b */
    private TextView f23595b;

    /* renamed from: c */
    private LinearLayout f23596c;

    /* renamed from: d */
    private Button f23597d;

    /* renamed from: e */
    private Button f23598e;

    /* renamed from: f */
    private int f23599f;

    /* renamed from: g */
    private int f23600g;

    public MBFeedBackDialog(Context context, C9593a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(C8594o.m24812a(context, "mbridge_cm_feedbackview", "layout"), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f23594a = aVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f23595b = (TextView) inflate.findViewById(C8594o.m24812a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                C8608u.m24880a("MBAlertDialog", e.getMessage());
            }
            try {
                this.f23596c = (LinearLayout) inflate.findViewById(C8594o.m24812a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f23597d = (Button) inflate.findViewById(C8594o.m24812a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f23598e = (Button) inflate.findViewById(C8594o.m24812a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                C8608u.m24880a("MBAlertDialog", e2.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        Button button = this.f23598e;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f23594a != null) {
                        MBFeedBackDialog.this.f23594a.mo15754a();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        Button button2 = this.f23597d;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f23594a != null) {
                        MBFeedBackDialog.this.f23594a.mo15755b();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        setOnCancelListener(new DialogInterface.OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                if (MBFeedBackDialog.this.f23594a != null) {
                    MBFeedBackDialog.this.f23594a.mo15755b();
                }
            }
        });
    }

    public void setCancelButtonClickable(boolean z) {
        Button button = this.f23598e;
        if (button != null) {
            button.setClickable(z);
        }
    }

    public void clear() {
        if (this.f23594a != null) {
            this.f23594a = null;
        }
    }

    public C9593a getListener() {
        return this.f23594a;
    }

    public void setListener(C9593a aVar) {
        this.f23594a = aVar;
    }

    public void setTitle(String str) {
        TextView textView = this.f23595b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f23596c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = C8613y.m24929b(C2350a.m5601e().mo15792g(), 38.0f);
            layoutParams.rightMargin = C8613y.m24929b(C2350a.m5601e().mo15792g(), 38.0f);
            layoutParams.topMargin = C8613y.m24929b(C2350a.m5601e().mo15792g(), 20.0f);
            layoutParams.bottomMargin = C8613y.m24929b(C2350a.m5601e().mo15792g(), 24.0f);
            this.f23596c.addView(viewGroup, layoutParams);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.f23597d;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setCancelText(String str) {
        Button button = this.f23598e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e) {
            C8608u.m24884d("MBAlertDialog", e.getMessage());
            super.show();
        }
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT >= 19) {
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } else {
                window.getDecorView().setSystemUiVisibility(2);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setDialogWidthAndHeight(float f, float f2) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (isScreenOrientationPortrait(getContext())) {
            this.f23600g = displayMetrics.widthPixels;
            this.f23599f = displayMetrics.heightPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = (int) (((float) this.f23599f) * f2);
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f23600g = displayMetrics.heightPixels;
        this.f23599f = displayMetrics.widthPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = (int) (((float) this.f23599f) * f);
        attributes2.height = -1;
        attributes2.gravity = 17;
        getWindow().setAttributes(attributes2);
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }
}
