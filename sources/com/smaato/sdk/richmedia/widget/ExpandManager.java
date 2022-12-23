package com.smaato.sdk.richmedia.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import com.smaato.sdk.core.lifecycle.ActivityProvider;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.ViewUtils;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.C11182R;
import com.smaato.sdk.richmedia.widget.ClosableView;
import com.smaato.sdk.richmedia.widget.ExpandManager;

final class ExpandManager {
    private Dialog dialog;

    interface Listener {
        void onCloseClicked(ImageButton imageButton);

        void onExpanded(ImageButton imageButton);

        void onFailedToExpand();
    }

    ExpandManager() {
    }

    /* access modifiers changed from: package-private */
    public void expand(View view, Listener listener) {
        Activity currentActivity = ActivityProvider.get().getCurrentActivity();
        if (currentActivity == null) {
            listener.onFailedToExpand();
            return;
        }
        ClosableView closableView = new ClosableView(currentActivity);
        closableView.setOnCloseClickListener(new ClosableView.OnCloseClickListener(listener, closableView) {
            public final /* synthetic */ ExpandManager.Listener f$1;
            public final /* synthetic */ ClosableView f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onCloseClick() {
                ExpandManager.this.lambda$expand$0$ExpandManager(this.f$1, this.f$2);
            }
        });
        ViewUtils.removeFromParent(view);
        closableView.addContent(view);
        Dialog dialog2 = new Dialog(currentActivity, C11182R.style.smaato_sdk_richmedia_expandable_dialog);
        this.dialog = dialog2;
        dialog2.setContentView(closableView);
        this.dialog.setCanceledOnTouchOutside(false);
        this.dialog.setOnShowListener(new DialogInterface.OnShowListener(closableView) {
            public final /* synthetic */ ClosableView f$1;

            {
                this.f$1 = r2;
            }

            public final void onShow(DialogInterface dialogInterface) {
                ExpandManager.Listener.this.onExpanded(this.f$1.getCloseButton());
            }
        });
        this.dialog.setOnKeyListener(new DialogInterface.OnKeyListener(listener, closableView) {
            public final /* synthetic */ ExpandManager.Listener f$1;
            public final /* synthetic */ ClosableView f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return ExpandManager.this.lambda$expand$2$ExpandManager(this.f$1, this.f$2, dialogInterface, i, keyEvent);
            }
        });
        this.dialog.show();
    }

    public /* synthetic */ boolean lambda$expand$2$ExpandManager(Listener listener, ClosableView closableView, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        lambda$expand$0$ExpandManager(listener, closableView);
        return false;
    }

    /* access modifiers changed from: package-private */
    public void collapse() {
        Objects.onNotNull(this.dialog, new Consumer() {
            public final void accept(Object obj) {
                ExpandManager.this.lambda$collapse$3$ExpandManager((Dialog) obj);
            }
        });
    }

    public /* synthetic */ void lambda$collapse$3$ExpandManager(Dialog dialog2) {
        dialog2.dismiss();
        this.dialog = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: notifyAboutClose */
    public void lambda$expand$0$ExpandManager(Listener listener, ClosableView closableView) {
        listener.onCloseClicked(closableView.getCloseButton());
    }
}
