package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.util.IAlog;

public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* renamed from: a */
    public VideoView f10338a;

    /* renamed from: b */
    public int f10339b = 0;

    /* renamed from: c */
    public final MediaPlayer.OnPreparedListener f10340c = new C4173a();

    /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore$a */
    public class C4173a implements MediaPlayer.OnPreparedListener {
        public C4173a() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            IAlog.m16699a("onPrepared", new Object[0]);
            InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = InneractiveRichMediaVideoPlayerActivityCore.this;
            inneractiveRichMediaVideoPlayerActivityCore.f10338a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.f10339b);
            InneractiveRichMediaVideoPlayerActivityCore.this.f10338a.start();
        }
    }

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra("video_url", str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.m16699a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    public void onCreate(Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f10339b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(C4167R.layout.ia_rich_media_video);
        this.f10338a = (VideoView) findViewById(C4167R.C4169id.mraid_video_view);
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra("video_url")) ? null : intent.getStringExtra("video_url");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m16699a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f10338a.setVideoPath(stringExtra);
            this.f10338a.setOnCompletionListener(new C4181h(this));
            this.f10338a.setOnErrorListener(new C4182i(this));
            this.f10338a.setOnPreparedListener(this.f10340c);
        }
        findViewById(C4167R.C4169id.ia_iv_close_button).setOnClickListener(new C4180g(this));
    }

    public void onPause() {
        super.onPause();
        this.f10339b = this.f10338a.getCurrentPosition();
        this.f10338a.pause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f10338a;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }
}
