package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;

public interface AudioRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        /* access modifiers changed from: private */
        public final AudioRendererEventListener listener;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$a */
        public class C4670a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f11674a;

            public C4670a(DecoderCounters decoderCounters) {
                this.f11674a = decoderCounters;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioEnabled(this.f11674a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$b */
        public class C4671b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f11676a;

            /* renamed from: b */
            public final /* synthetic */ long f11677b;

            /* renamed from: c */
            public final /* synthetic */ long f11678c;

            public C4671b(String str, long j, long j2) {
                this.f11676a = str;
                this.f11677b = j;
                this.f11678c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioDecoderInitialized(this.f11676a, this.f11677b, this.f11678c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$c */
        public class C4672c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4869i f11680a;

            public C4672c(C4869i iVar) {
                this.f11680a = iVar;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioInputFormatChanged(this.f11680a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$d */
        public class C4673d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f11682a;

            /* renamed from: b */
            public final /* synthetic */ long f11683b;

            /* renamed from: c */
            public final /* synthetic */ long f11684c;

            public C4673d(int i, long j, long j2) {
                this.f11682a = i;
                this.f11683b = j;
                this.f11684c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioTrackUnderrun(this.f11682a, this.f11683b, this.f11684c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$e */
        public class C4674e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f11686a;

            public C4674e(DecoderCounters decoderCounters) {
                this.f11686a = decoderCounters;
            }

            public void run() {
                this.f11686a.ensureUpdated();
                EventDispatcher.this.listener.onAudioDisabled(this.f11686a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$f */
        public class C4675f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f11688a;

            public C4675f(int i) {
                this.f11688a = i;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioSessionId(this.f11688a);
            }
        }

        public EventDispatcher(Handler handler2, AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) C5023a.m15300a(handler2) : null;
            this.listener = audioRendererEventListener;
        }

        public void audioSessionId(int i) {
            if (this.listener != null) {
                this.handler.post(new C4675f(i));
            }
        }

        public void audioTrackUnderrun(int i, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C4673d(i, j, j2));
            }
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C4671b(str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C4674e(decoderCounters));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C4670a(decoderCounters));
            }
        }

        public void inputFormatChanged(C4869i iVar) {
            if (this.listener != null) {
                this.handler.post(new C4672c(iVar));
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(C4869i iVar);

    void onAudioSessionId(int i);

    void onAudioTrackUnderrun(int i, long j, long j2);
}
