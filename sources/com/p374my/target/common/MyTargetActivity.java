package com.p374my.target.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

/* renamed from: com.my.target.common.MyTargetActivity */
public class MyTargetActivity extends Activity {
    public static ActivityEngine activityEngine;
    private ActivityEngine engine;
    private FrameLayout rootLayout;

    /* renamed from: com.my.target.common.MyTargetActivity$ActivityEngine */
    public interface ActivityEngine {
        boolean onActivityBackPressed();

        void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout);

        void onActivityDestroy();

        boolean onActivityOptionsItemSelected(MenuItem menuItem);

        void onActivityPause();

        void onActivityResume();

        void onActivityStart();

        void onActivityStop();
    }

    public void onBackPressed() {
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 == null || activityEngine2.onActivityBackPressed()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        ActivityEngine activityEngine2 = activityEngine;
        this.engine = activityEngine2;
        activityEngine = null;
        if (activityEngine2 == null || intent == null) {
            finish();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        this.rootLayout = frameLayout;
        this.engine.onActivityCreate(this, intent, frameLayout);
        setContentView(this.rootLayout);
    }

    public void onDestroy() {
        super.onDestroy();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityDestroy();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 == null || !activityEngine2.onActivityOptionsItemSelected(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityPause();
        }
    }

    public void onResume() {
        super.onResume();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityResume();
        }
    }

    public void onStart() {
        super.onStart();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityStart();
        }
    }

    public void onStop() {
        super.onStop();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityStop();
        }
    }
}
