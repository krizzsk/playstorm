package com.google.android.exoplayer2.p195ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p195ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.p195ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.exoplayer2.ui.PlayerView */
public class PlayerView extends FrameLayout implements AdViewProvider {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int PICTURE_TYPE_NOT_SET = -1;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final FrameLayout adOverlayFrameLayout;
    private final ImageView artworkView;
    private final View bufferingView;
    private final ComponentListener componentListener;
    private final AspectRatioFrameLayout contentFrame;
    private final PlayerControlView controller;
    private boolean controllerAutoShow;
    /* access modifiers changed from: private */
    public boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private PlayerControlView.VisibilityListener controllerVisibilityListener;
    private CharSequence customErrorMessage;
    private Drawable defaultArtwork;
    private ErrorMessageProvider<? super PlaybackException> errorMessageProvider;
    private final TextView errorMessageView;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;
    private final FrameLayout overlayFrameLayout;
    /* access modifiers changed from: private */
    public Player player;
    private int showBuffering;
    /* access modifiers changed from: private */
    public final View shutterView;
    /* access modifiers changed from: private */
    public final SubtitleView subtitleView;
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    /* access modifiers changed from: private */
    public int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$ShowBuffering */
    public @interface ShowBuffering {
    }

    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public PlayerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r6v3, types: [int] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PlayerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r18.<init>(r19, r20, r21)
            com.google.android.exoplayer2.ui.PlayerView$ComponentListener r3 = new com.google.android.exoplayer2.ui.PlayerView$ComponentListener
            r3.<init>()
            r1.componentListener = r3
            boolean r3 = r18.isInEditMode()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x004c
            r1.contentFrame = r4
            r1.shutterView = r4
            r1.surfaceView = r4
            r1.surfaceViewIgnoresVideoAspectRatio = r5
            r1.artworkView = r4
            r1.subtitleView = r4
            r1.bufferingView = r4
            r1.errorMessageView = r4
            r1.controller = r4
            r1.adOverlayFrameLayout = r4
            r1.overlayFrameLayout = r4
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r0)
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 23
            if (r0 < r3) goto L_0x0041
            android.content.res.Resources r0 = r18.getResources()
            configureEditModeLogoV23(r0, r2)
            goto L_0x0048
        L_0x0041:
            android.content.res.Resources r0 = r18.getResources()
            configureEditModeLogo(r0, r2)
        L_0x0048:
            r1.addView(r2)
            return
        L_0x004c:
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.layout.exo_player_view
            r6 = 5000(0x1388, float:7.006E-42)
            r7 = 1
            if (r2 == 0) goto L_0x00d1
            android.content.res.Resources$Theme r8 = r19.getTheme()
            int[] r9 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView
            r10 = r21
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r2, r9, r10, r5)
            int r9 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_shutter_background_color     // Catch:{ all -> 0x00cc }
            boolean r9 = r8.hasValue(r9)     // Catch:{ all -> 0x00cc }
            int r10 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_shutter_background_color     // Catch:{ all -> 0x00cc }
            int r10 = r8.getColor(r10, r5)     // Catch:{ all -> 0x00cc }
            int r11 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_player_layout_id     // Catch:{ all -> 0x00cc }
            int r3 = r8.getResourceId(r11, r3)     // Catch:{ all -> 0x00cc }
            int r11 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_use_artwork     // Catch:{ all -> 0x00cc }
            boolean r11 = r8.getBoolean(r11, r7)     // Catch:{ all -> 0x00cc }
            int r12 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_default_artwork     // Catch:{ all -> 0x00cc }
            int r12 = r8.getResourceId(r12, r5)     // Catch:{ all -> 0x00cc }
            int r13 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_use_controller     // Catch:{ all -> 0x00cc }
            boolean r13 = r8.getBoolean(r13, r7)     // Catch:{ all -> 0x00cc }
            int r14 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_surface_type     // Catch:{ all -> 0x00cc }
            int r14 = r8.getInt(r14, r7)     // Catch:{ all -> 0x00cc }
            int r15 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_resize_mode     // Catch:{ all -> 0x00cc }
            int r15 = r8.getInt(r15, r5)     // Catch:{ all -> 0x00cc }
            int r4 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_show_timeout     // Catch:{ all -> 0x00cc }
            int r6 = r8.getInt(r4, r6)     // Catch:{ all -> 0x00cc }
            int r4 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_hide_on_touch     // Catch:{ all -> 0x00cc }
            boolean r4 = r8.getBoolean(r4, r7)     // Catch:{ all -> 0x00cc }
            int r5 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_auto_show     // Catch:{ all -> 0x00cc }
            boolean r5 = r8.getBoolean(r5, r7)     // Catch:{ all -> 0x00cc }
            int r7 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_show_buffering     // Catch:{ all -> 0x00cc }
            r21 = r3
            r3 = 0
            int r7 = r8.getInteger(r7, r3)     // Catch:{ all -> 0x00cc }
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_keep_content_on_player_reset     // Catch:{ all -> 0x00cc }
            r16 = r4
            boolean r4 = r1.keepContentOnPlayerReset     // Catch:{ all -> 0x00cc }
            boolean r3 = r8.getBoolean(r3, r4)     // Catch:{ all -> 0x00cc }
            r1.keepContentOnPlayerReset = r3     // Catch:{ all -> 0x00cc }
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.styleable.PlayerView_hide_during_ads     // Catch:{ all -> 0x00cc }
            r4 = 1
            boolean r3 = r8.getBoolean(r3, r4)     // Catch:{ all -> 0x00cc }
            r8.recycle()
            r4 = r16
            r17 = r3
            r3 = r21
            r21 = r6
            r6 = r5
            r5 = r17
            goto L_0x00de
        L_0x00cc:
            r0 = move-exception
            r8.recycle()
            throw r0
        L_0x00d1:
            r21 = r6
            r4 = 1
            r5 = 1
            r6 = 1
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 1
            r14 = 1
            r15 = 0
        L_0x00de:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r19)
            r8.inflate(r3, r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r3)
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_content_frame
            android.view.View r3 = r1.findViewById(r3)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r3 = (com.google.android.exoplayer2.p195ui.AspectRatioFrameLayout) r3
            r1.contentFrame = r3
            if (r3 == 0) goto L_0x00f9
            setResizeModeRaw(r3, r15)
        L_0x00f9:
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_shutter
            android.view.View r3 = r1.findViewById(r3)
            r1.shutterView = r3
            if (r3 == 0) goto L_0x0108
            if (r9 == 0) goto L_0x0108
            r3.setBackgroundColor(r10)
        L_0x0108:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r3 = r1.contentFrame
            if (r3 == 0) goto L_0x019b
            if (r14 == 0) goto L_0x019b
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r8 = -1
            r3.<init>(r8, r8)
            r8 = 2
            if (r14 == r8) goto L_0x0177
            r8 = 3
            if (r14 == r8) goto L_0x014e
            r8 = 4
            if (r14 == r8) goto L_0x0126
            android.view.SurfaceView r8 = new android.view.SurfaceView
            r8.<init>(r0)
            r1.surfaceView = r8
        L_0x0124:
            r9 = 1
            goto L_0x017f
        L_0x0126:
            java.lang.String r8 = "com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ Exception -> 0x0145 }
            r9 = 1
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0145 }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r15 = 0
            r10[r15] = r14     // Catch:{ Exception -> 0x0145 }
            java.lang.reflect.Constructor r8 = r8.getConstructor(r10)     // Catch:{ Exception -> 0x0145 }
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0145 }
            r10[r15] = r0     // Catch:{ Exception -> 0x0145 }
            java.lang.Object r8 = r8.newInstance(r10)     // Catch:{ Exception -> 0x0145 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x0145 }
            r1.surfaceView = r8     // Catch:{ Exception -> 0x0145 }
            goto L_0x0124
        L_0x0145:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "video_decoder_gl_surface_view requires an ExoPlayer dependency"
            r2.<init>(r3, r0)
            throw r2
        L_0x014e:
            java.lang.String r8 = "com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ Exception -> 0x016e }
            r9 = 1
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x016e }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r15 = 0
            r10[r15] = r14     // Catch:{ Exception -> 0x016e }
            java.lang.reflect.Constructor r8 = r8.getConstructor(r10)     // Catch:{ Exception -> 0x016e }
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x016e }
            r10[r15] = r0     // Catch:{ Exception -> 0x016e }
            java.lang.Object r8 = r8.newInstance(r10)     // Catch:{ Exception -> 0x016e }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x016e }
            r1.surfaceView = r8     // Catch:{ Exception -> 0x016e }
            r8 = r9
            goto L_0x0180
        L_0x016e:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "spherical_gl_surface_view requires an ExoPlayer dependency"
            r2.<init>(r3, r0)
            throw r2
        L_0x0177:
            r9 = 1
            android.view.TextureView r8 = new android.view.TextureView
            r8.<init>(r0)
            r1.surfaceView = r8
        L_0x017f:
            r8 = 0
        L_0x0180:
            android.view.View r10 = r1.surfaceView
            r10.setLayoutParams(r3)
            android.view.View r3 = r1.surfaceView
            com.google.android.exoplayer2.ui.PlayerView$ComponentListener r10 = r1.componentListener
            r3.setOnClickListener(r10)
            android.view.View r3 = r1.surfaceView
            r10 = 0
            r3.setClickable(r10)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r3 = r1.contentFrame
            android.view.View r14 = r1.surfaceView
            r3.addView(r14, r10)
            r3 = r8
            goto L_0x01a0
        L_0x019b:
            r9 = 1
            r3 = 0
            r1.surfaceView = r3
            r3 = 0
        L_0x01a0:
            r1.surfaceViewIgnoresVideoAspectRatio = r3
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_ad_overlay
            android.view.View r3 = r1.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.adOverlayFrameLayout = r3
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_overlay
            android.view.View r3 = r1.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.overlayFrameLayout = r3
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_artwork
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.artworkView = r3
            if (r11 == 0) goto L_0x01c6
            if (r3 == 0) goto L_0x01c6
            r3 = r9
            goto L_0x01c7
        L_0x01c6:
            r3 = 0
        L_0x01c7:
            r1.useArtwork = r3
            if (r12 == 0) goto L_0x01d5
            android.content.Context r3 = r18.getContext()
            android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r3, r12)
            r1.defaultArtwork = r3
        L_0x01d5:
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_subtitles
            android.view.View r3 = r1.findViewById(r3)
            com.google.android.exoplayer2.ui.SubtitleView r3 = (com.google.android.exoplayer2.p195ui.SubtitleView) r3
            r1.subtitleView = r3
            if (r3 == 0) goto L_0x01e9
            r3.setUserDefaultStyle()
            com.google.android.exoplayer2.ui.SubtitleView r3 = r1.subtitleView
            r3.setUserDefaultTextSize()
        L_0x01e9:
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_buffering
            android.view.View r3 = r1.findViewById(r3)
            r1.bufferingView = r3
            r8 = 8
            if (r3 == 0) goto L_0x01f8
            r3.setVisibility(r8)
        L_0x01f8:
            r1.showBuffering = r7
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_error_message
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.errorMessageView = r3
            if (r3 == 0) goto L_0x0209
            r3.setVisibility(r8)
        L_0x0209:
            int r3 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_controller
            android.view.View r3 = r1.findViewById(r3)
            com.google.android.exoplayer2.ui.PlayerControlView r3 = (com.google.android.exoplayer2.p195ui.PlayerControlView) r3
            int r7 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_controller_placeholder
            android.view.View r7 = r1.findViewById(r7)
            if (r3 == 0) goto L_0x021d
            r1.controller = r3
            r8 = 0
            goto L_0x024d
        L_0x021d:
            if (r7 == 0) goto L_0x0249
            com.google.android.exoplayer2.ui.PlayerControlView r3 = new com.google.android.exoplayer2.ui.PlayerControlView
            r8 = 0
            r10 = 0
            r3.<init>(r0, r10, r8, r2)
            r1.controller = r3
            int r0 = com.google.android.exoplayer2.p195ui.C5701R.C5703id.exo_controller
            r3.setId(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            r0.setLayoutParams(r2)
            android.view.ViewParent r0 = r7.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.indexOfChild(r7)
            r0.removeView(r7)
            com.google.android.exoplayer2.ui.PlayerControlView r3 = r1.controller
            r0.addView(r3, r2)
            goto L_0x024d
        L_0x0249:
            r0 = 0
            r8 = 0
            r1.controller = r0
        L_0x024d:
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            if (r0 == 0) goto L_0x0254
            r3 = r21
            goto L_0x0255
        L_0x0254:
            r3 = r8
        L_0x0255:
            r1.controllerShowTimeoutMs = r3
            r1.controllerHideOnTouch = r4
            r1.controllerAutoShow = r6
            r1.controllerHideDuringAds = r5
            if (r13 == 0) goto L_0x0265
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            if (r0 == 0) goto L_0x0265
            r5 = r9
            goto L_0x0266
        L_0x0265:
            r5 = r8
        L_0x0266:
            r1.useController = r5
            r18.hideController()
            r18.updateContentDescription()
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            if (r0 == 0) goto L_0x0277
            com.google.android.exoplayer2.ui.PlayerView$ComponentListener r2 = r1.componentListener
            r0.addVisibilityListener(r2)
        L_0x0277:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p195ui.PlayerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void switchTargetView(Player player2, PlayerView playerView, PlayerView playerView2) {
        if (playerView != playerView2) {
            if (playerView2 != null) {
                playerView2.setPlayer(player2);
            }
            if (playerView != null) {
                playerView.setPlayer((Player) null);
            }
        }
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player2) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.checkArgument(player2 == null || player2.getApplicationLooper() == Looper.getMainLooper());
        Player player3 = this.player;
        if (player3 != player2) {
            if (player3 != null) {
                player3.removeListener((Player.Listener) this.componentListener);
                if (player3.isCommandAvailable(26)) {
                    View view = this.surfaceView;
                    if (view instanceof TextureView) {
                        player3.clearVideoTextureView((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        player3.clearVideoSurfaceView((SurfaceView) view);
                    }
                }
            }
            SubtitleView subtitleView2 = this.subtitleView;
            if (subtitleView2 != null) {
                subtitleView2.setCues((List<Cue>) null);
            }
            this.player = player2;
            if (useController()) {
                this.controller.setPlayer(player2);
            }
            updateBuffering();
            updateErrorMessage();
            updateForCurrentTrackSelections(true);
            if (player2 != null) {
                if (player2.isCommandAvailable(26)) {
                    View view2 = this.surfaceView;
                    if (view2 instanceof TextureView) {
                        player2.setVideoTextureView((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        player2.setVideoSurfaceView((SurfaceView) view2);
                    }
                    updateAspectRatio();
                }
                if (this.subtitleView != null && player2.isCommandAvailable(27)) {
                    this.subtitleView.setCues(player2.getCurrentCues());
                }
                player2.addListener((Player.Listener) this.componentListener);
                maybeShowController(false);
                return;
            }
            hideController();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setResizeMode(int i) {
        Assertions.checkStateNotNull(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public int getResizeMode() {
        Assertions.checkStateNotNull(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    public boolean getUseArtwork() {
        return this.useArtwork;
    }

    public void setUseArtwork(boolean z) {
        Assertions.checkState(!z || this.artworkView != null);
        if (this.useArtwork != z) {
            this.useArtwork = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public boolean getUseController() {
        return this.useController;
    }

    public void setUseController(boolean z) {
        Assertions.checkState(!z || this.controller != null);
        if (this.useController != z) {
            this.useController = z;
            if (useController()) {
                this.controller.setPlayer(this.player);
            } else {
                PlayerControlView playerControlView = this.controller;
                if (playerControlView != null) {
                    playerControlView.hide();
                    this.controller.setPlayer((Player) null);
                }
            }
            updateContentDescription();
        }
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setErrorMessageProvider(ErrorMessageProvider<? super PlaybackException> errorMessageProvider2) {
        if (this.errorMessageProvider != errorMessageProvider2) {
            this.errorMessageProvider = errorMessageProvider2;
            updateErrorMessage();
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        Assertions.checkState(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player2 = this.player;
        if (player2 != null && player2.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean isDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (isDpadKey && useController() && !this.controller.isVisible()) {
            maybeShowController(true);
        } else if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
        } else if (!isDpadKey || !useController()) {
            return false;
        } else {
            maybeShowController(true);
            return false;
        }
        return true;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.dispatchMediaKeyEvent(keyEvent);
    }

    public boolean isControllerVisible() {
        PlayerControlView playerControlView = this.controller;
        return playerControlView != null && playerControlView.isVisible();
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public void hideController() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            playerControlView.hide();
        }
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public void setControllerShowTimeoutMs(int i) {
        Assertions.checkStateNotNull(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.isVisible()) {
            showController();
        }
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public void setControllerHideOnTouch(boolean z) {
        Assertions.checkStateNotNull(this.controller);
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerVisibilityListener(PlayerControlView.VisibilityListener visibilityListener) {
        Assertions.checkStateNotNull(this.controller);
        PlayerControlView.VisibilityListener visibilityListener2 = this.controllerVisibilityListener;
        if (visibilityListener2 != visibilityListener) {
            if (visibilityListener2 != null) {
                this.controller.removeVisibilityListener(visibilityListener2);
            }
            this.controllerVisibilityListener = visibilityListener;
            if (visibilityListener != null) {
                this.controller.addVisibilityListener(visibilityListener);
            }
        }
    }

    @Deprecated
    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setControlDispatcher(controlDispatcher);
    }

    public void setShowRewindButton(boolean z) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowRewindButton(z);
    }

    public void setShowFastForwardButton(boolean z) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowFastForwardButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowPreviousButton(z);
    }

    public void setShowNextButton(boolean z) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowNextButton(z);
    }

    public void setRepeatToggleModes(int i) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    public void setShowShuffleButton(boolean z) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowShuffleButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowMultiWindowTimeBar(z);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        Assertions.checkStateNotNull(this.contentFrame);
        this.contentFrame.setAspectRatioListener(aspectRatioListener);
    }

    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isTouching = true;
            return true;
        } else if (action != 1 || !this.isTouching) {
            return false;
        } else {
            this.isTouching = false;
            performClick();
            return true;
        }
    }

    public boolean performClick() {
        super.performClick();
        return toggleControllerVisibility();
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    /* access modifiers changed from: protected */
    public void onContentAspectRatioChanged(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) Assertions.checkStateNotNull(this.adOverlayFrameLayout, "exo_ad_overlay must be present for ad playback");
    }

    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        if (this.overlayFrameLayout != null) {
            arrayList.add(new AdOverlayInfo(this.overlayFrameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        if (this.controller != null) {
            arrayList.add(new AdOverlayInfo(this.controller, 0));
        }
        return ImmutableList.copyOf(arrayList);
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        Assertions.checkStateNotNull(this.controller);
        return true;
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean useArtwork() {
        if (!this.useArtwork) {
            return false;
        }
        Assertions.checkStateNotNull(this.artworkView);
        return true;
    }

    /* access modifiers changed from: private */
    public boolean toggleControllerVisibility() {
        if (!useController() || this.player == null) {
            return false;
        }
        if (!this.controller.isVisible()) {
            maybeShowController(true);
        } else if (this.controllerHideOnTouch) {
            this.controller.hide();
        }
        return true;
    }

    private void maybeShowController(boolean z) {
        if ((!isPlayingAd() || !this.controllerHideDuringAds) && useController()) {
            boolean z2 = this.controller.isVisible() && this.controller.getShowTimeoutMs() <= 0;
            boolean shouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z || z2 || shouldShowControllerIndefinitely) {
                showController(shouldShowControllerIndefinitely);
            }
        }
    }

    private boolean shouldShowControllerIndefinitely() {
        Player player2 = this.player;
        if (player2 == null) {
            return true;
        }
        int playbackState = player2.getPlaybackState();
        if (!this.controllerAutoShow || (playbackState != 1 && playbackState != 4 && this.player.getPlayWhenReady())) {
            return false;
        }
        return true;
    }

    private void showController(boolean z) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z ? 0 : this.controllerShowTimeoutMs);
            this.controller.show();
        }
    }

    /* access modifiers changed from: private */
    public boolean isPlayingAd() {
        Player player2 = this.player;
        return player2 != null && player2.isPlayingAd() && this.player.getPlayWhenReady();
    }

    /* access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z) {
        Player player2 = this.player;
        if (player2 != null && !player2.getCurrentTrackGroups().isEmpty()) {
            if (z && !this.keepContentOnPlayerReset) {
                closeShutter();
            }
            TrackSelectionArray currentTrackSelections = player2.getCurrentTrackSelections();
            for (int i = 0; i < currentTrackSelections.length; i++) {
                TrackSelection trackSelection = currentTrackSelections.get(i);
                if (trackSelection != null) {
                    for (int i2 = 0; i2 < trackSelection.length(); i2++) {
                        if (MimeTypes.getTrackType(trackSelection.getFormat(i2).sampleMimeType) == 2) {
                            hideArtwork();
                            return;
                        }
                    }
                    continue;
                }
            }
            closeShutter();
            if (!useArtwork() || (!setArtworkFromMediaMetadata(player2.getMediaMetadata()) && !setDrawableArtwork(this.defaultArtwork))) {
                hideArtwork();
            }
        } else if (!this.keepContentOnPlayerReset) {
            hideArtwork();
            closeShutter();
        }
    }

    /* access modifiers changed from: private */
    public void updateAspectRatio() {
        Player player2 = this.player;
        VideoSize videoSize = player2 != null ? player2.getVideoSize() : VideoSize.UNKNOWN;
        int i = videoSize.width;
        int i2 = videoSize.height;
        int i3 = videoSize.unappliedRotationDegrees;
        float f = 0.0f;
        float f2 = (i2 == 0 || i == 0) ? 0.0f : (((float) i) * videoSize.pixelWidthHeightRatio) / ((float) i2);
        if (this.surfaceView instanceof TextureView) {
            if (f2 > 0.0f && (i3 == 90 || i3 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.textureViewRotation != 0) {
                this.surfaceView.removeOnLayoutChangeListener(this.componentListener);
            }
            this.textureViewRotation = i3;
            if (i3 != 0) {
                this.surfaceView.addOnLayoutChangeListener(this.componentListener);
            }
            applyTextureViewRotation((TextureView) this.surfaceView, this.textureViewRotation);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.contentFrame;
        if (!this.surfaceViewIgnoresVideoAspectRatio) {
            f = f2;
        }
        onContentAspectRatioChanged(aspectRatioFrameLayout, f);
    }

    @RequiresNonNull({"artworkView"})
    private boolean setArtworkFromMediaMetadata(MediaMetadata mediaMetadata) {
        if (mediaMetadata.artworkData == null) {
            return false;
        }
        return setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(mediaMetadata.artworkData, 0, mediaMetadata.artworkData.length)));
    }

    @RequiresNonNull({"artworkView"})
    private boolean setDrawableArtwork(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                onContentAspectRatioChanged(this.contentFrame, ((float) intrinsicWidth) / ((float) intrinsicHeight));
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.artworkView.setVisibility(4);
        }
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void updateBuffering() {
        int i;
        if (this.bufferingView != null) {
            Player player2 = this.player;
            boolean z = true;
            int i2 = 0;
            if (player2 == null || player2.getPlaybackState() != 2 || ((i = this.showBuffering) != 2 && (i != 1 || !this.player.getPlayWhenReady()))) {
                z = false;
            }
            View view = this.bufferingView;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* access modifiers changed from: private */
    public void updateErrorMessage() {
        ErrorMessageProvider<? super PlaybackException> errorMessageProvider2;
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
                return;
            }
            Player player2 = this.player;
            PlaybackException playerError = player2 != null ? player2.getPlayerError() : null;
            if (playerError == null || (errorMessageProvider2 = this.errorMessageProvider) == null) {
                this.errorMessageView.setVisibility(8);
                return;
            }
            this.errorMessageView.setText((CharSequence) errorMessageProvider2.getErrorMessage(playerError).second);
            this.errorMessageView.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void updateContentDescription() {
        PlayerControlView playerControlView = this.controller;
        String str = null;
        if (playerControlView == null || !this.useController) {
            setContentDescription((CharSequence) null);
        } else if (playerControlView.getVisibility() == 0) {
            if (this.controllerHideOnTouch) {
                str = getResources().getString(C5701R.string.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(C5701R.string.exo_controls_show));
        }
    }

    /* access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (!isPlayingAd() || !this.controllerHideDuringAds) {
            maybeShowController(false);
        } else {
            hideController();
        }
    }

    private static void configureEditModeLogoV23(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C5701R.C5702drawable.exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(C5701R.color.exo_edit_mode_background_color, (Resources.Theme) null));
    }

    private static void configureEditModeLogo(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C5701R.C5702drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(C5701R.color.exo_edit_mode_background_color));
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* access modifiers changed from: private */
    public static void applyTextureViewRotation(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i == 0)) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate((float) i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$ComponentListener */
    private final class ComponentListener implements Player.Listener, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.VisibilityListener {
        private Object lastPeriodUidWithTracks;
        private final Timeline.Period period = new Timeline.Period();

        public ComponentListener() {
        }

        public void onCues(List<Cue> list) {
            if (PlayerView.this.subtitleView != null) {
                PlayerView.this.subtitleView.onCues(list);
            }
        }

        public void onVideoSizeChanged(VideoSize videoSize) {
            PlayerView.this.updateAspectRatio();
        }

        public void onRenderedFirstFrame() {
            if (PlayerView.this.shutterView != null) {
                PlayerView.this.shutterView.setVisibility(4);
            }
        }

        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            Player player = (Player) Assertions.checkNotNull(PlayerView.this.player);
            Timeline currentTimeline = player.getCurrentTimeline();
            if (currentTimeline.isEmpty()) {
                this.lastPeriodUidWithTracks = null;
            } else if (!player.getCurrentTrackGroups().isEmpty()) {
                this.lastPeriodUidWithTracks = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), this.period, true).uid;
            } else {
                Object obj = this.lastPeriodUidWithTracks;
                if (obj != null) {
                    int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                    if (indexOfPeriod == -1 || player.getCurrentWindowIndex() != currentTimeline.getPeriod(indexOfPeriod, this.period).windowIndex) {
                        this.lastPeriodUidWithTracks = null;
                    } else {
                        return;
                    }
                }
            }
            PlayerView.this.updateForCurrentTrackSelections(false);
        }

        public void onPlaybackStateChanged(int i) {
            PlayerView.this.updateBuffering();
            PlayerView.this.updateErrorMessage();
            PlayerView.this.updateControllerVisibility();
        }

        public void onPlayWhenReadyChanged(boolean z, int i) {
            PlayerView.this.updateBuffering();
            PlayerView.this.updateControllerVisibility();
        }

        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            if (PlayerView.this.isPlayingAd() && PlayerView.this.controllerHideDuringAds) {
                PlayerView.this.hideController();
            }
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.applyTextureViewRotation((TextureView) view, PlayerView.this.textureViewRotation);
        }

        public void onClick(View view) {
            boolean unused = PlayerView.this.toggleControllerVisibility();
        }

        public void onVisibilityChange(int i) {
            PlayerView.this.updateContentDescription();
        }
    }
}
