package com.saypromo;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.inmobi.media.C5976de;
import com.saypromo.ads.C10896R;
import com.saypromo.base.AdSettings;
import com.saypromo.base.AdStateType;
import com.saypromo.base.AdType;
import com.saypromo.core.api.AdUnitEvent;
import com.saypromo.core.device.Device;
import com.saypromo.core.log.DeviceLog;
import com.saypromo.core.misc.ViewUtilities;
import com.saypromo.listeners.IVideoPlayerListener;
import com.saypromo.listeners.IWebPlayerListener;
import com.saypromo.video.VideoPlayerView;
import com.saypromo.webplayer.WebPlayer;
import com.tapjoy.TJAdUnitConstants;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;

public class SPAdActivity extends Activity implements IVideoPlayerListener, IWebPlayerListener {
    public static final String EXTRA_ACTIVITY_ID = "activityId";
    public static final String EXTRA_DISPLAY_CUTOUT_MODE = "displayCutoutMode";
    public static final String EXTRA_KEEP_SCREEN_ON = "keepScreenOn";
    public static final String EXTRA_KEY_EVENT_LIST = "keyEvents";
    public static final String EXTRA_SYSTEM_UI_VISIBILITY = "systemUiVisibility";
    public static final String EXTRA_VIEWS = "views";
    private int _activityId;
    /* access modifiers changed from: private */
    public String _adContentType;
    private ImageView _backBtnImageView;
    private int _contentHeightOffset = 0;
    /* access modifiers changed from: private */
    public int _contentWidthOffset = 0;
    /* access modifiers changed from: private */
    public RelativeLayout _countdownLeftRelativeLayout;
    private TextView _countdownLeftTextView;
    private View _countdownLeftView;
    /* access modifiers changed from: private */
    public RelativeLayout _countdownRightRelativeLayout;
    private TextView _countdownRightTextView;
    private View _countdownRightView;
    /* access modifiers changed from: private */
    public int _countdownState = 3;
    /* access modifiers changed from: private */
    public int _countdownValue = 0;
    private Timer _coutdownTime;
    /* access modifiers changed from: private */
    public String _currentPosition;
    private int _displayCutoutMode;
    /* access modifiers changed from: private */
    public boolean _isActivityPaused;
    private Boolean _isApplicationFinished;
    /* access modifiers changed from: private */
    public boolean _isTablet;
    public boolean _isVideoShowed;
    boolean _keepScreenOn;
    private ArrayList<Integer> _keyEventList;
    protected RelativeLayout _layout;
    private ImageView _logoImageView;
    /* access modifiers changed from: private */
    public View _progressView;
    /* access modifiers changed from: private */
    public AdSettings _settings = new AdSettings();
    private int _systemUiVisibility;
    private ValueAnimator _valueAnimator;
    private int _videoStopPosition;
    /* access modifiers changed from: private */
    public VideoPlayerView _videoView;
    /* access modifiers changed from: private */
    public FrameLayout _videoViewLayout;
    private String[] _views;
    /* access modifiers changed from: private */
    public WebPlayer _webView;
    private boolean isCloseBtnEnabled;
    public long lastOpenUrlTimestamp = 0;
    public long lastWebPlayerClickTimestamp = 0;
    public long lastWebPlayerEventTimestamp = 0;

    static /* synthetic */ int access$1110(SPAdActivity sPAdActivity) {
        int i = sPAdActivity._countdownValue;
        sPAdActivity._countdownValue = i - 1;
        return i;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this._isApplicationFinished = false;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            this._adContentType = getIntent().getExtras().getString("contentType");
            InitUIView();
            if (bundle == null) {
                this._views = getIntent().getStringArrayExtra("views");
                this._keyEventList = getIntent().getIntegerArrayListExtra("keyEvents");
                if (getIntent().hasExtra("systemUiVisibility")) {
                    this._systemUiVisibility = getIntent().getIntExtra("systemUiVisibility", 0);
                }
                if (getIntent().hasExtra("activityId")) {
                    this._activityId = getIntent().getIntExtra("activityId", -1);
                }
                if (getIntent().hasExtra("displayCutoutMode")) {
                    this._displayCutoutMode = getIntent().getIntExtra("displayCutoutMode", 0);
                }
                AdUnitEvent adUnitEvent = AdUnitEvent.ON_CREATE;
            } else {
                this._views = bundle.getStringArray("views");
                this._systemUiVisibility = bundle.getInt("systemUiVisibility", 0);
                this._keyEventList = bundle.getIntegerArrayList("keyEvents");
                this._keepScreenOn = bundle.getBoolean("keepScreenOn");
                this._activityId = bundle.getInt("activityId", -1);
                this._displayCutoutMode = bundle.getInt("displayCutoutMode", 0);
                setKeepScreenOn(this._keepScreenOn);
                AdUnitEvent adUnitEvent2 = AdUnitEvent.ON_RESTORE;
            }
            setSystemUiVisibility(this._systemUiVisibility);
            setLayoutInDisplayCutoutMode(this._displayCutoutMode);
        } catch (Exception e) {
            DeviceLog.error("SayPromo", e.getLocalizedMessage());
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        TrackDebugEvent("sdk_appear", "", 0, 0, 0);
    }

    private void InitUIView() {
        setContentView(C10896R.layout.activity_layout);
        SetSettings();
        WebPlayer webPlayer = (WebPlayer) findViewById(C10896R.C10898id.webView);
        this._webView = webPlayer;
        webPlayer.init(this._settings.AppId, this._settings.PlaceId, this._settings.DebugId);
        this._webView.setWebPlayerListener(this);
        this._videoView = (VideoPlayerView) findViewById(C10896R.C10898id.videoPlayerView);
        this._backBtnImageView = (ImageView) findViewById(C10896R.C10898id.bckBtnImageView);
        this._countdownLeftRelativeLayout = (RelativeLayout) findViewById(C10896R.C10898id.countdownLeftRelativeLayout);
        this._countdownLeftTextView = (TextView) findViewById(C10896R.C10898id.countdownLeftTextView);
        this._countdownLeftView = findViewById(C10896R.C10898id.countdownLeftView);
        this._countdownRightRelativeLayout = (RelativeLayout) findViewById(C10896R.C10898id.countdownRightRelativeLayout);
        this._countdownRightTextView = (TextView) findViewById(C10896R.C10898id.countdownRightTextView);
        this._countdownRightView = findViewById(C10896R.C10898id.countdownRightView);
        this._videoViewLayout = (FrameLayout) findViewById(C10896R.C10898id.videoViewLayout);
        this._progressView = findViewById(C10896R.C10898id.progressView);
        this._logoImageView = (ImageView) findViewById(C10896R.C10898id.logoImageView);
        this._isTablet = getResources().getBoolean(C10896R.bool.isTablet);
        UpdateCloseBtnState(false);
        playAds(this._settings.AdType);
        CheckScreenOffset();
    }

    public void CheckScreenOffset() {
        double d;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        double d2 = 0.0d;
        try {
            d2 = this._settings.VideoWidth.doubleValue() / ((double) point.x);
            d = this._settings.VideoHeight.doubleValue() / ((double) point.y);
        } catch (Exception unused) {
            d = 0.0d;
        }
        boolean z = true;
        this._contentWidthOffset = 0;
        this._contentHeightOffset = 0;
        if (!this._isTablet) {
            int abs = StrictMath.abs((int) ((((float) point.y) - ((((float) point.x) * 16.0f) / 9.0f)) / 2.0f));
            this._contentHeightOffset = abs;
            if (abs == 0) {
                z = false;
            }
        } else if (d2 < d) {
            this._contentWidthOffset = StrictMath.abs((int) ((((double) point.x) - (this._settings.VideoWidth.doubleValue() * (1.0d / d))) / 2.0d));
        } else {
            this._contentHeightOffset = StrictMath.abs((int) ((((double) point.y) - (this._settings.VideoHeight.doubleValue() * (1.0d / d2))) / 2.0d));
        }
        this._contentHeightOffset = StrictMath.max(this._contentHeightOffset, 9);
        if (this._isVideoShowed || point.x > point.y) {
            this._contentWidthOffset = 0;
            this._contentHeightOffset = 0;
        }
        this._backBtnImageView.setPadding(ConvertDpToPixels(12.0f) + this._contentWidthOffset, ConvertDpToPixels(12.0f) + this._contentHeightOffset, ConvertDpToPixels(12.0f) + this._contentWidthOffset, ConvertDpToPixels(20.0f) + this._contentHeightOffset);
        this._logoImageView.setPadding(ConvertDpToPixels(9.0f) + this._contentWidthOffset, ConvertDpToPixels(12.0f) + this._contentHeightOffset, ConvertDpToPixels(9.0f) + this._contentWidthOffset, ConvertDpToPixels(12.0f) + this._contentHeightOffset);
        this._countdownLeftRelativeLayout.setPadding(ConvertDpToPixels(9.0f) + this._contentWidthOffset, ConvertDpToPixels(9.0f) + this._contentHeightOffset, ConvertDpToPixels(9.0f) + this._contentWidthOffset, ConvertDpToPixels(9.0f) + this._contentHeightOffset);
        this._countdownRightRelativeLayout.setPadding(ConvertDpToPixels(9.0f) + this._contentWidthOffset, ConvertDpToPixels(9.0f) + this._contentHeightOffset, ConvertDpToPixels(9.0f) + this._contentWidthOffset, ConvertDpToPixels(9.0f) + this._contentHeightOffset);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, ConvertDpToPixels(6.0f));
        int i = this._contentWidthOffset;
        int i2 = this._contentHeightOffset;
        if (i > i2) {
            layoutParams.setMargins(i, 0, 0, 0);
        } else if (z) {
            layoutParams.setMargins(0, 0, 0, i2);
        }
        layoutParams.gravity = 8388691;
        this._progressView.setLayoutParams(layoutParams);
    }

    public void SetSettings() {
        if (this._adContentType.equals("interstitial")) {
            this._settings = SPInterstitialManager.GetAdSettings();
        } else {
            this._settings = SPRewardedManager.GetAdSettings();
        }
    }

    /* renamed from: com.saypromo.SPAdActivity$7 */
    static /* synthetic */ class C108807 {
        static final /* synthetic */ int[] $SwitchMap$com$saypromo$base$AdType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.saypromo.base.AdType[] r0 = com.saypromo.base.AdType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$saypromo$base$AdType = r0
                com.saypromo.base.AdType r1 = com.saypromo.base.AdType.AdNoneType     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$saypromo$base$AdType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.saypromo.base.AdType r1 = com.saypromo.base.AdType.AdVideoType     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$saypromo$base$AdType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.saypromo.base.AdType r1 = com.saypromo.base.AdType.AdHtmlType     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$saypromo$base$AdType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.saypromo.base.AdType r1 = com.saypromo.base.AdType.AdVideoAndHtmlType     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.saypromo.SPAdActivity.C108807.<clinit>():void");
        }
    }

    public void playAds(AdType adType) {
        int i = C108807.$SwitchMap$com$saypromo$base$AdType[adType.ordinal()];
        if (i == 2) {
            this._webView.setAlpha(0.0f);
            this._webView.setVisibility(4);
            this._isVideoShowed = false;
            this._videoViewLayout.setAlpha(1.0f);
            this._videoView.setAlpha(1.0f);
            this._videoView.prepare(this._settings.VideoUrl, this._settings.AppId, this._settings.PlaceId, this._settings.DebugId, (float) Device.getStreamVolume(3), 0);
            this._videoView.play(this);
            UpdateClosePanelPosition(this._settings.VideoBtnPosition);
            UpdateLogoPosition(this._settings.VideoSayPosition);
            if (this._settings.VideoShowTimer.booleanValue()) {
                StartTimer();
                UpdateCloseBtnState(false);
            } else {
                StartTimerWithoutCounterForCloseBtn();
            }
            TrackDebugEvent("video_show", "", 0, 0, 0);
        } else if (i == 3) {
            this._videoViewLayout.setAlpha(0.0f);
            this._videoView.setAlpha(0.0f);
            this._videoView.setVisibility(4);
            this._webView.setAlpha(1.0f);
            this._webView.loadUrl(this._settings.WebUrl);
            this._webView.TrackDebugEvent("html_load");
            UpdateClosePanelPosition(this._settings.WebBtnPosition);
            UpdateLogoPosition(this._settings.WebSayPosition);
            if (this._settings.WebShowTimer.booleanValue()) {
                StartTimer();
                UpdateCloseBtnState(false);
            } else {
                StartTimerWithoutCounterForCloseBtn();
            }
            this._webView.TrackDebugEvent("html_show");
        } else if (i == 4) {
            this._webView.setAlpha(0.0f);
            this._webView.setVisibility(4);
            this._webView.loadUrl(this._settings.WebUrl);
            this._webView.TrackDebugEvent("html_load");
            this._isVideoShowed = false;
            this._videoViewLayout.setAlpha(1.0f);
            this._videoView.setAlpha(1.0f);
            this._videoView.prepare(this._settings.VideoUrl, this._settings.AppId, this._settings.PlaceId, this._settings.DebugId, (float) Device.getStreamVolume(3), 0);
            this._videoView.play(this);
            UpdateClosePanelPosition(this._settings.VideoBtnPosition);
            UpdateLogoPosition(this._settings.VideoSayPosition);
            if (this._settings.VideoShowTimer.booleanValue()) {
                StartTimer();
                UpdateCloseBtnState(false);
            } else {
                StartTimerWithoutCounterForCloseBtn();
            }
            TrackDebugEvent("video_show", "", 0, 0, 0);
        }
    }

    public void onVideoCompleted() {
        this._isVideoShowed = true;
        if (this._settings.AdType == AdType.AdVideoAndHtmlType) {
            runOnUiThread(new Runnable() {
                public void run() {
                    SPAdActivity.this._videoView.setAlpha(0.0f);
                    SPAdActivity.this._videoView.setVisibility(4);
                    SPAdActivity.this.lastWebPlayerClickTimestamp = Device.getTimestampInMillis() - 500;
                    SPAdActivity.this._webView.setAlpha(1.0f);
                    SPAdActivity.this._webView.setVisibility(0);
                    SPAdActivity.this._videoViewLayout.setAlpha(0.0f);
                    SPAdActivity sPAdActivity = SPAdActivity.this;
                    sPAdActivity.UpdateClosePanelPosition(sPAdActivity._settings.WebBtnPosition);
                    SPAdActivity sPAdActivity2 = SPAdActivity.this;
                    sPAdActivity2.UpdateLogoPosition(sPAdActivity2._settings.WebSayPosition);
                    SPAdActivity.this.CheckScreenOffset();
                    if (SPAdActivity.this._settings.WebShowTimer.booleanValue()) {
                        SPAdActivity.this.UpdateCloseBtnState(false);
                        SPAdActivity.this.StartTimer();
                    } else {
                        SPAdActivity.this.StartTimerWithoutCounterForCloseBtn();
                    }
                    SPAdActivity.this._webView.TrackDebugEvent("html_show");
                    if (SPAdActivity.this._adContentType.equals("interstitial")) {
                        SPInterstitialManager.SendCustomEvent("html_show");
                    } else {
                        SPRewardedManager.SendCustomEvent("html_show");
                    }
                }
            });
        } else if (this._settings.AdType == AdType.AdVideoType) {
            runOnUiThread(new Runnable() {
                public void run() {
                    SPAdActivity.this._videoView.setAlpha(0.0f);
                    SPAdActivity.this._webView.setAlpha(0.0f);
                    SPAdActivity.this._videoViewLayout.setAlpha(0.0f);
                    SPAdActivity.this.UpdateLogoPosition("");
                    SPAdActivity.this.OpenPlayURL("", "");
                }
            });
        }
        CleanVideoPlayerData();
    }

    public void onVideoClicked(float f, float f2) {
        if (this._videoView.isPlaying()) {
            long currentPosition = (long) this._videoView.getCurrentPosition();
            long duration = (long) this._videoView.getDuration();
            long j = currentPosition / 1000;
            if (j > ((long) this._settings.VideoClickableAfter)) {
                if (this._settings.VideoClickableBehavior == 0) {
                    OpenPlayURL("video", ConvertCoordinatesData(f, f2));
                } else {
                    this._videoView.stop();
                    onVideoCompleted();
                }
                long j2 = duration - currentPosition;
                if (this._settings.StoreId == null || this._settings.StoreId.isEmpty()) {
                    TrackDebugEvent("video_clicked", this._settings.ResultUrl, j2, currentPosition, duration);
                    return;
                }
                TrackDebugEvent("video_clicked", this._settings.StoreId, j2, currentPosition, duration);
                return;
            }
            DeviceLog.info("Info", "Touch will be enabled after " + (((long) this._settings.VideoClickableAfter) - j) + " seconds:");
        }
    }

    public void onVideoPlaying(final float f) {
        if (this._settings.VideoShowProgressBar.booleanValue()) {
            runOnUiThread(new Runnable() {
                public void run() {
                    Display defaultDisplay = SPAdActivity.this.getWindowManager().getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    int i = point.x;
                    if (SPAdActivity.this._isTablet) {
                        i = (int) (SPAdActivity.this._settings.VideoWidth.doubleValue() - ((double) SPAdActivity.this._contentWidthOffset));
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{SPAdActivity.this._progressView.getMeasuredWidth(), Math.round(((float) i) * f)});
                    ofInt.setInterpolator(new LinearInterpolator());
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            ViewGroup.LayoutParams layoutParams = SPAdActivity.this._progressView.getLayoutParams();
                            layoutParams.width = intValue;
                            SPAdActivity.this._progressView.setLayoutParams(layoutParams);
                        }
                    });
                    ofInt.setDuration(500);
                    ofInt.start();
                }
            });
        }
    }

    public void onWebPlayerClicked(float f, float f2) {
        String str;
        if (Device.getTimestampInMillis() - this.lastWebPlayerClickTimestamp > 1000) {
            this.lastWebPlayerClickTimestamp = Device.getTimestampInMillis();
            this._webView.TrackDebugEvent("html_click");
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                str = ("" + "&x=" + decimalFormat.format((double) f).replace(',', '.')) + "&y=" + decimalFormat.format((double) f2).replace(',', '.');
            } catch (Error | Exception e) {
                e.printStackTrace();
                str = "";
            }
            OpenPlayURL(TJAdUnitConstants.String.HTML, str);
        }
    }

    public void onWebPlayerSentEvent(String str) {
        if (Device.getTimestampInMillis() - this.lastWebPlayerEventTimestamp > 500) {
            this.lastWebPlayerEventTimestamp = Device.getTimestampInMillis();
            if (this._adContentType.equals("interstitial")) {
                SPInterstitialManager.SendCustomEvent(str);
            } else {
                SPRewardedManager.SendCustomEvent(str);
            }
        }
    }

    private void CleanVideoPlayerData() {
        try {
            this._videoView.setVideoURI((Uri) null);
        } catch (Exception e) {
            DeviceLog.error(e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: private */
    public void UpdateCloseBtnState(boolean z) {
        this.isCloseBtnEnabled = z;
        if (z) {
            this._backBtnImageView.setImageAlpha(255);
        } else {
            this._backBtnImageView.setImageAlpha(126);
        }
    }

    public void OpenPlayURL(String str, String str2) {
        if (Device.getTimestampInMillis() - this.lastOpenUrlTimestamp > 1000) {
            this.lastOpenUrlTimestamp = Device.getTimestampInMillis();
            if (this._settings.StoreId == null || this._settings.StoreId.isEmpty()) {
                TrackDebugEvent("open_url", this._settings.ResultUrl, 0, 0, 0);
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this._settings.ResultUrl)));
            } else {
                TrackDebugEvent("open_url", this._settings.StoreId, 0, 0, 0);
                try {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this._settings.StoreId)));
                } catch (ActivityNotFoundException unused) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + this._settings.StoreId)));
                }
            }
            if (this._adContentType.equals("interstitial")) {
                SPInterstitialManager.AdsClicked(str, str2);
            } else {
                SPRewardedManager.AdsClicked(str, str2);
            }
        }
    }

    public void TrackDebugEvent(String str, String str2, long j, long j2, long j3) {
        if (this._adContentType.equals("interstitial")) {
            SPInterstitialManager.TrackDebugEvent(str, str2, j, j2, j3);
        } else {
            SPRewardedManager.TrackDebugEvent(str, str2, j, j2, j3);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        setViews(this._views);
        if (this._isActivityPaused) {
            this._isActivityPaused = false;
            if (this._settings.AdStateType == AdStateType.AdPlayingStateType) {
                if (!this._isVideoShowed) {
                    this._videoView.seekTo(this._videoStopPosition);
                    this._videoView.play(this);
                } else if (this._settings.AdType == AdType.AdVideoType) {
                    finishAdView();
                }
            }
            ValueAnimator valueAnimator = this._valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.resume();
            }
            TrackDebugEvent("view_appear", this._adContentType, 0, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this._isActivityPaused = true;
        if (this._settings.AdStateType == AdStateType.AdPlayingStateType) {
            if (!this._isVideoShowed) {
                this._videoStopPosition = this._videoView.getCurrentPosition();
                this._videoView.pause();
                ValueAnimator valueAnimator = this._valueAnimator;
                if (valueAnimator != null) {
                    valueAnimator.pause();
                }
            }
            TrackDebugEvent("view_disappear", this._adContentType, 0, 0, 0);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("systemUiVisibility", this._systemUiVisibility);
        bundle.putIntegerArrayList("keyEvents", this._keyEventList);
        bundle.putBoolean("keepScreenOn", this._keepScreenOn);
        bundle.putStringArray("views", this._views);
        bundle.putInt("activityId", this._activityId);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!this._isApplicationFinished.booleanValue()) {
            CleanVideoPlayerData();
            if (this._adContentType.equals("interstitial")) {
                SPInterstitialManager.SendSayPromoAdsShowError("Activity was destroyed.");
            } else {
                SPRewardedManager.SendSayPromoAdsShowError("Activity was destroyed.");
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<Integer> arrayList = this._keyEventList;
        return arrayList != null && arrayList.contains(Integer.valueOf(i));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            for (int put2 : iArr) {
                jSONArray2.put(put2);
            }
        } catch (Exception unused) {
        }
    }

    public void setViewFrame(String str, int i, int i2, int i3, int i4) {
        if (str.equals("adunit")) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this._layout.setLayoutParams(layoutParams);
        }
    }

    public Map<String, Integer> getViewFrame(String str) {
        if (!str.equals("adunit")) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this._layout.getLayoutParams();
        HashMap hashMap = new HashMap();
        hashMap.put("x", Integer.valueOf(layoutParams.leftMargin));
        hashMap.put("y", Integer.valueOf(layoutParams.topMargin));
        hashMap.put("width", Integer.valueOf(this._layout.getWidth()));
        hashMap.put("height", Integer.valueOf(this._layout.getHeight()));
        return hashMap;
    }

    public void setViews(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (this._views == null) {
            this._views = new String[0];
        }
        new ArrayList(Arrays.asList(this._views)).removeAll(arrayList);
        this._views = strArr;
        for (String str : strArr) {
        }
    }

    private boolean handleViewPlacement(View view) {
        if (view == null) {
            finish();
            DeviceLog.error("Could not place view because it is null, finishing activity");
            return false;
        } else if (view.getParent() == null || !view.getParent().equals(this._layout)) {
            ViewUtilities.removeViewFromParent(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            layoutParams.setMargins(0, 0, 0, 0);
            view.setPadding(0, 0, 0, 0);
            this._layout.addView(view, layoutParams);
            return true;
        } else {
            this._layout.bringChildToFront(view);
            return true;
        }
    }

    public String[] getViews() {
        return this._views;
    }

    public boolean setKeepScreenOn(boolean z) {
        this._keepScreenOn = z;
        if (getWindow() == null) {
            return false;
        }
        if (z) {
            getWindow().addFlags(128);
            return true;
        }
        getWindow().clearFlags(128);
        return true;
    }

    public boolean setSystemUiVisibility(int i) {
        this._systemUiVisibility = i;
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                getWindow().getDecorView().setSystemUiVisibility(i);
                return true;
            } catch (Exception e) {
                DeviceLog.exception("Error while setting SystemUIVisibility", e);
            }
        }
        return false;
    }

    public void setKeyEventList(ArrayList<Integer> arrayList) {
        this._keyEventList = arrayList;
    }

    public void setLayoutInDisplayCutoutMode(int i) {
        this._displayCutoutMode = i;
        if (Build.VERSION.SDK_INT >= 28 && getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            try {
                attributes.getClass().getField("layoutInDisplayCutoutMode").setInt(attributes, i);
            } catch (IllegalAccessException e) {
                DeviceLog.debug("Error setting layoutInDisplayCutoutMode", e);
            } catch (NoSuchFieldException e2) {
                DeviceLog.debug("Error getting layoutInDisplayCutoutMode", e2);
            }
        }
    }

    public void closeBtnClicked(View view) {
        if (!this.isCloseBtnEnabled) {
            return;
        }
        if ((this._settings.AdType == AdType.AdVideoAndHtmlType || this._settings.AdType == AdType.AdVideoType) && this._videoView.getAlpha() == 1.0f) {
            this._videoView.stop();
            onVideoCompleted();
            return;
        }
        finishAdView();
    }

    public void finishAdView() {
        this._isApplicationFinished = true;
        CleanVideoPlayerData();
        if (this._adContentType.equals("interstitial")) {
            SPInterstitialManager.AdsSuccessfulFinish();
        } else {
            SPRewardedManager.AdsSuccessfulFinish();
        }
        TrackDebugEvent("sdk_disappear", "", 0, 0, 0);
        finish();
    }

    /* access modifiers changed from: private */
    public void UpdateLogoPosition(String str) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this._logoImageView.setImageAlpha(255);
        if (str.equals("top-left")) {
            layoutParams.gravity = 51;
        } else if (str.equals(C5976de.DEFAULT_POSITION)) {
            layoutParams.gravity = 53;
        } else if (str.equals("bottom-left")) {
            layoutParams.gravity = 83;
        } else if (str.equals("bottom-right")) {
            layoutParams.gravity = 85;
        } else {
            this._logoImageView.setImageAlpha(0);
        }
        this._logoImageView.setLayoutParams(layoutParams);
    }

    public void UpdateClosePanelPosition(String str) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this._currentPosition = str;
        if (str.equals("left")) {
            layoutParams.gravity = 3;
            this._countdownLeftRelativeLayout.setAlpha(1.0f);
            this._countdownRightRelativeLayout.setAlpha(0.0f);
        } else {
            layoutParams.gravity = 5;
            this._countdownLeftRelativeLayout.setAlpha(0.0f);
            this._countdownRightRelativeLayout.setAlpha(1.0f);
        }
        this._backBtnImageView.setLayoutParams(layoutParams);
    }

    public void StartTimer() {
        if (!this._isVideoShowed) {
            this._countdownValue = this._settings.VideoSkipAfter;
        } else {
            this._countdownValue = this._settings.WebSkipAfter;
        }
        UpdateCountdown(0);
        Timer timer = new Timer();
        this._coutdownTime = timer;
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                SPAdActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        if (!SPAdActivity.this._isActivityPaused) {
                            SPAdActivity.access$1110(SPAdActivity.this);
                            SPAdActivity.this.UpdateCountdown(500);
                            if (SPAdActivity.this._countdownValue <= 0) {
                                C108764.this.cancel();
                            }
                            if (SPAdActivity.this._countdownState == 1) {
                                SPAdActivity.this.UpdateCloseBtnState(true);
                            }
                        }
                    }
                });
            }
        }, 1000, 1000);
    }

    public void StartTimerWithoutCounterForCloseBtn() {
        int i;
        this._countdownValue = 0;
        if (!this._isVideoShowed) {
            i = this._settings.VideoSkipAfter;
        } else {
            i = this._settings.WebSkipAfter;
        }
        long j = (long) i;
        this._countdownState = 3;
        UpdateCountdown(0);
        this._backBtnImageView.setImageAlpha(0);
        if (this._currentPosition.equals("left")) {
            this._countdownLeftRelativeLayout.setAlpha(0.0f);
        } else {
            this._countdownRightRelativeLayout.setAlpha(0.0f);
        }
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                if (SPAdActivity.this._currentPosition.equals("left")) {
                    SPAdActivity.this._countdownLeftRelativeLayout.setAlpha(1.0f);
                } else {
                    SPAdActivity.this._countdownRightRelativeLayout.setAlpha(1.0f);
                }
                SPAdActivity.this.UpdateCloseBtnState(true);
            }
        }, j * 1000);
    }

    /* access modifiers changed from: private */
    public void UpdateCountdown(long j) {
        if (!this._isActivityPaused) {
            UpdateCountdownText();
            int i = this._countdownValue;
            if (i >= 10) {
                if (this._countdownState != 3) {
                    this._countdownState = 3;
                    AnimateCountdownViewSize(72.0f, j);
                }
            } else if (i > 0) {
                if (this._countdownState != 2) {
                    this._countdownState = 2;
                    AnimateCountdownViewSize(62.0f, j);
                }
            } else if (this._countdownState != 1) {
                this._countdownState = 1;
                AnimateCountdownViewSize(34.0f, j);
            }
        }
    }

    private void UpdateCountdownText() {
        if (this._countdownValue <= 0) {
            this._countdownLeftTextView.setAlpha(0.0f);
            this._countdownRightTextView.setAlpha(0.0f);
        } else if (this._currentPosition.equals("left")) {
            TextView textView = this._countdownLeftTextView;
            textView.setText("" + this._countdownValue);
        } else {
            TextView textView2 = this._countdownRightTextView;
            textView2.setText("" + this._countdownValue);
        }
    }

    public void AnimateCountdownViewSize(float f, long j) {
        final View view;
        if (this._currentPosition.equals("left")) {
            view = this._countdownLeftView;
        } else {
            view = this._countdownRightView;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getMeasuredWidth(), ConvertDpToPixels(f)});
        this._valueAnimator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = intValue;
                view.setLayoutParams(layoutParams);
            }
        });
        this._valueAnimator.setDuration(j);
        this._valueAnimator.start();
    }

    public int ConvertDpToPixels(float f) {
        return Math.round(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics()));
    }

    private String ConvertCoordinatesData(float f, float f2) {
        try {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            float f3 = f / ((float) point.x);
            float f4 = f2 / ((float) point.y);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            return ("" + "&x=" + decimalFormat.format((double) f3).replace(',', '.')) + "&y=" + decimalFormat.format((double) f4).replace(',', '.');
        } catch (Error | Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
