package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;

public interface VideoRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        /* access modifiers changed from: private */
        public final VideoRendererEventListener listener;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$a */
        public class C5053a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f13512a;

            public C5053a(DecoderCounters decoderCounters) {
                this.f13512a = decoderCounters;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoEnabled(this.f13512a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$b */
        public class C5054b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f13514a;

            /* renamed from: b */
            public final /* synthetic */ long f13515b;

            /* renamed from: c */
            public final /* synthetic */ long f13516c;

            public C5054b(String str, long j, long j2) {
                this.f13514a = str;
                this.f13515b = j;
                this.f13516c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoDecoderInitialized(this.f13514a, this.f13515b, this.f13516c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$c */
        public class C5055c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4869i f13518a;

            public C5055c(C4869i iVar) {
                this.f13518a = iVar;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoInputFormatChanged(this.f13518a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$d */
        public class C5056d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f13520a;

            /* renamed from: b */
            public final /* synthetic */ long f13521b;

            public C5056d(int i, long j) {
                this.f13520a = i;
                this.f13521b = j;
            }

            public void run() {
                EventDispatcher.this.listener.onDroppedFrames(this.f13520a, this.f13521b);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$e */
        public class C5057e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f13523a;

            /* renamed from: b */
            public final /* synthetic */ int f13524b;

            /* renamed from: c */
            public final /* synthetic */ int f13525c;

            /* renamed from: d */
            public final /* synthetic */ float f13526d;

            public C5057e(int i, int i2, int i3, float f) {
                this.f13523a = i;
                this.f13524b = i2;
                this.f13525c = i3;
                this.f13526d = f;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoSizeChanged(this.f13523a, this.f13524b, this.f13525c, this.f13526d);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$f */
        public class C5058f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Surface f13528a;

            public C5058f(Surface surface) {
                this.f13528a = surface;
            }

            public void run() {
                EventDispatcher.this.listener.onRenderedFirstFrame(this.f13528a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$g */
        public class C5059g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f13530a;

            public C5059g(DecoderCounters decoderCounters) {
                this.f13530a = decoderCounters;
            }

            public void run() {
                this.f13530a.ensureUpdated();
                EventDispatcher.this.listener.onVideoDisabled(this.f13530a);
            }
        }

        public EventDispatcher(Handler handler2, VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) C5023a.m15300a(handler2) : null;
            this.listener = videoRendererEventListener;
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C5054b(str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C5059g(decoderCounters));
            }
        }

        public void droppedFrames(int i, long j) {
            if (this.listener != null) {
                this.handler.post(new C5056d(i, j));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C5053a(decoderCounters));
            }
        }

        public void inputFormatChanged(C4869i iVar) {
            if (this.listener != null) {
                this.handler.post(new C5055c(iVar));
            }
        }

        public void renderedFirstFrame(Surface surface) {
            if (this.listener != null) {
                this.handler.post(new C5058f(surface));
            }
        }

        public void videoSizeChanged(int i, int i2, int i3, float f) {
            if (this.listener != null) {
                this.handler.post(new C5057e(i, i2, i3, f));
            }
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(C4869i iVar);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
