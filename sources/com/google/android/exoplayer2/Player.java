package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public interface Player {
    public static final int COMMAND_ADJUST_DEVICE_VOLUME = 25;
    public static final int COMMAND_CHANGE_MEDIA_ITEMS = 19;
    public static final int COMMAND_GET_AUDIO_ATTRIBUTES = 20;
    public static final int COMMAND_GET_CURRENT_MEDIA_ITEM = 15;
    public static final int COMMAND_GET_DEVICE_VOLUME = 22;
    public static final int COMMAND_GET_MEDIA_ITEMS_METADATA = 17;
    public static final int COMMAND_GET_TEXT = 27;
    public static final int COMMAND_GET_TIMELINE = 16;
    public static final int COMMAND_GET_VOLUME = 21;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_PLAY_PAUSE = 1;
    public static final int COMMAND_PREPARE_STOP = 2;
    public static final int COMMAND_SEEK_BACK = 10;
    public static final int COMMAND_SEEK_FORWARD = 11;
    public static final int COMMAND_SEEK_IN_CURRENT_WINDOW = 4;
    public static final int COMMAND_SEEK_TO_DEFAULT_POSITION = 3;
    public static final int COMMAND_SEEK_TO_NEXT = 8;
    public static final int COMMAND_SEEK_TO_NEXT_WINDOW = 7;
    public static final int COMMAND_SEEK_TO_PREVIOUS = 6;
    public static final int COMMAND_SEEK_TO_PREVIOUS_WINDOW = 5;
    public static final int COMMAND_SEEK_TO_WINDOW = 9;
    public static final int COMMAND_SET_DEVICE_VOLUME = 24;
    public static final int COMMAND_SET_MEDIA_ITEMS_METADATA = 18;
    public static final int COMMAND_SET_REPEAT_MODE = 14;
    public static final int COMMAND_SET_SHUFFLE_MODE = 13;
    public static final int COMMAND_SET_SPEED_AND_PITCH = 12;
    public static final int COMMAND_SET_VIDEO_SURFACE = 26;
    public static final int COMMAND_SET_VOLUME = 23;
    public static final int DISCONTINUITY_REASON_AUTO_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_INTERNAL = 5;
    public static final int DISCONTINUITY_REASON_REMOVE = 4;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int DISCONTINUITY_REASON_SKIP = 3;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 14;
    public static final int EVENT_IS_LOADING_CHANGED = 4;
    public static final int EVENT_IS_PLAYING_CHANGED = 8;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 19;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 15;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 13;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 5;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 7;
    public static final int EVENT_PLAYER_ERROR = 11;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 16;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 6;
    public static final int EVENT_POSITION_DISCONTINUITY = 12;
    public static final int EVENT_REPEAT_MODE_CHANGED = 9;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 17;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 18;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 10;
    @Deprecated
    public static final int EVENT_STATIC_METADATA_CHANGED = 3;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int MEDIA_ITEM_TRANSITION_REASON_AUTO = 1;
    public static final int MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED = 3;
    public static final int MEDIA_ITEM_TRANSITION_REASON_REPEAT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_SEEK = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED = 0;
    public static final int TIMELINE_CHANGE_REASON_SOURCE_UPDATE = 1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
    }

    @Deprecated
    public interface EventListener {
        void onAvailableCommandsChanged(Commands commands) {
        }

        void onEvents(Player player, Events events) {
        }

        void onIsLoadingChanged(boolean z) {
        }

        void onIsPlayingChanged(boolean z) {
        }

        @Deprecated
        void onLoadingChanged(boolean z) {
        }

        void onMaxSeekToPreviousPositionChanged(int i) {
        }

        void onMediaItemTransition(MediaItem mediaItem, int i) {
        }

        void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        void onPlayWhenReadyChanged(boolean z, int i) {
        }

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        void onPlaybackStateChanged(int i) {
        }

        void onPlaybackSuppressionReasonChanged(int i) {
        }

        void onPlayerError(PlaybackException playbackException) {
        }

        void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Deprecated
        void onPlayerStateChanged(boolean z, int i) {
        }

        void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Deprecated
        void onPositionDiscontinuity(int i) {
        }

        void onPositionDiscontinuity(PositionInfo positionInfo, PositionInfo positionInfo2, int i) {
        }

        void onRepeatModeChanged(int i) {
        }

        void onSeekBackIncrementChanged(long j) {
        }

        void onSeekForwardIncrementChanged(long j) {
        }

        @Deprecated
        void onSeekProcessed() {
        }

        void onShuffleModeEnabledChanged(boolean z) {
        }

        @Deprecated
        void onStaticMetadataChanged(List<Metadata> list) {
        }

        void onTimelineChanged(Timeline timeline, int i) {
        }

        void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }
    }

    public interface Listener extends VideoListener, AudioListener, TextOutput, MetadataOutput, DeviceListener, EventListener {
        void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        void onAudioSessionIdChanged(int i) {
        }

        void onAvailableCommandsChanged(Commands commands) {
        }

        void onCues(List<Cue> list) {
        }

        void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        void onDeviceVolumeChanged(int i, boolean z) {
        }

        void onEvents(Player player, Events events) {
        }

        void onIsLoadingChanged(boolean z) {
        }

        void onIsPlayingChanged(boolean z) {
        }

        void onMediaItemTransition(MediaItem mediaItem, int i) {
        }

        void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        void onMetadata(Metadata metadata) {
        }

        void onPlayWhenReadyChanged(boolean z, int i) {
        }

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        void onPlaybackStateChanged(int i) {
        }

        void onPlaybackSuppressionReasonChanged(int i) {
        }

        void onPlayerError(PlaybackException playbackException) {
        }

        void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        void onPositionDiscontinuity(PositionInfo positionInfo, PositionInfo positionInfo2, int i) {
        }

        void onRenderedFirstFrame() {
        }

        void onRepeatModeChanged(int i) {
        }

        void onSeekBackIncrementChanged(long j) {
        }

        void onSeekForwardIncrementChanged(long j) {
        }

        void onShuffleModeEnabledChanged(boolean z) {
        }

        void onSkipSilenceEnabledChanged(boolean z) {
        }

        void onSurfaceSizeChanged(int i, int i2) {
        }

        void onTimelineChanged(Timeline timeline, int i) {
        }

        void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        void onVideoSizeChanged(VideoSize videoSize) {
        }

        void onVolumeChanged(float f) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    @Deprecated
    void addListener(EventListener eventListener);

    void addListener(Listener listener);

    void addMediaItem(int i, MediaItem mediaItem);

    void addMediaItem(MediaItem mediaItem);

    void addMediaItems(int i, List<MediaItem> list);

    void addMediaItems(List<MediaItem> list);

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(Surface surface);

    void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    void decreaseDeviceVolume();

    Looper getApplicationLooper();

    AudioAttributes getAudioAttributes();

    Commands getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    List<Cue> getCurrentCues();

    long getCurrentLiveOffset();

    Object getCurrentManifest();

    MediaItem getCurrentMediaItem();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    @Deprecated
    List<Metadata> getCurrentStaticMetadata();

    Timeline getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    TrackSelectionArray getCurrentTrackSelections();

    int getCurrentWindowIndex();

    DeviceInfo getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    int getMaxSeekToPreviousPosition();

    MediaItem getMediaItemAt(int i);

    int getMediaItemCount();

    MediaMetadata getMediaMetadata();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    PlaybackException getPlayerError();

    MediaMetadata getPlaylistMetadata();

    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    VideoSize getVideoSize();

    float getVolume();

    @Deprecated
    boolean hasNext();

    boolean hasNextWindow();

    @Deprecated
    boolean hasPrevious();

    boolean hasPreviousWindow();

    void increaseDeviceVolume();

    boolean isCommandAvailable(int i);

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowLive();

    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i, int i2);

    void moveMediaItems(int i, int i2, int i3);

    @Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @Deprecated
    void previous();

    void release();

    @Deprecated
    void removeListener(EventListener eventListener);

    void removeListener(Listener listener);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void seekToNext();

    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousWindow();

    void setDeviceMuted(boolean z);

    void setDeviceVolume(int i);

    void setMediaItem(MediaItem mediaItem);

    void setMediaItem(MediaItem mediaItem, long j);

    void setMediaItem(MediaItem mediaItem, boolean z);

    void setMediaItems(List<MediaItem> list);

    void setMediaItems(List<MediaItem> list, int i, long j);

    void setMediaItems(List<MediaItem> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlaybackSpeed(float f);

    void setPlaylistMetadata(MediaMetadata mediaMetadata);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setVideoSurface(Surface surface);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f);

    void stop();

    @Deprecated
    void stop(boolean z);

    public static final class Events {
        private final FlagSet flags;

        public Events(FlagSet flagSet) {
            this.flags = flagSet;
        }

        public boolean contains(int i) {
            return this.flags.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.flags.containsAny(iArr);
        }

        public int size() {
            return this.flags.size();
        }

        public int get(int i) {
            return this.flags.get(i);
        }

        public int hashCode() {
            return this.flags.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Events)) {
                return false;
            }
            return this.flags.equals(((Events) obj).flags);
        }
    }

    public static final class PositionInfo implements Bundleable {
        public static final Bundleable.Creator<PositionInfo> CREATOR = $$Lambda$Player$PositionInfo$RpbCqv78C7E3v6rJy_yB5z2EE.INSTANCE;
        private static final int FIELD_AD_GROUP_INDEX = 4;
        private static final int FIELD_AD_INDEX_IN_AD_GROUP = 5;
        private static final int FIELD_CONTENT_POSITION_MS = 3;
        private static final int FIELD_PERIOD_INDEX = 1;
        private static final int FIELD_POSITION_MS = 2;
        private static final int FIELD_WINDOW_INDEX = 0;
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;
        public final int periodIndex;
        public final Object periodUid;
        public final long positionMs;
        public final int windowIndex;
        public final Object windowUid;

        public PositionInfo(Object obj, int i, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.windowUid = obj;
            this.windowIndex = i;
            this.periodUid = obj2;
            this.periodIndex = i2;
            this.positionMs = j;
            this.contentPositionMs = j2;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PositionInfo positionInfo = (PositionInfo) obj;
            if (this.windowIndex == positionInfo.windowIndex && this.periodIndex == positionInfo.periodIndex && this.positionMs == positionInfo.positionMs && this.contentPositionMs == positionInfo.contentPositionMs && this.adGroupIndex == positionInfo.adGroupIndex && this.adIndexInAdGroup == positionInfo.adIndexInAdGroup && Objects.equal(this.windowUid, positionInfo.windowUid) && Objects.equal(this.periodUid, positionInfo.periodUid)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.windowUid, Integer.valueOf(this.windowIndex), this.periodUid, Integer.valueOf(this.periodIndex), Integer.valueOf(this.windowIndex), Long.valueOf(this.positionMs), Long.valueOf(this.contentPositionMs), Integer.valueOf(this.adGroupIndex), Integer.valueOf(this.adIndexInAdGroup));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(keyForField(0), this.windowIndex);
            bundle.putInt(keyForField(1), this.periodIndex);
            bundle.putLong(keyForField(2), this.positionMs);
            bundle.putLong(keyForField(3), this.contentPositionMs);
            bundle.putInt(keyForField(4), this.adGroupIndex);
            bundle.putInt(keyForField(5), this.adIndexInAdGroup);
            return bundle;
        }

        /* access modifiers changed from: private */
        public static PositionInfo fromBundle(Bundle bundle) {
            return new PositionInfo((Object) null, bundle.getInt(keyForField(0), -1), (Object) null, bundle.getInt(keyForField(1), -1), bundle.getLong(keyForField(2), -9223372036854775807L), bundle.getLong(keyForField(3), -9223372036854775807L), bundle.getInt(keyForField(4), -1), bundle.getInt(keyForField(5), -1));
        }

        private static String keyForField(int i) {
            return Integer.toString(i, 36);
        }
    }

    public static final class Commands implements Bundleable {
        public static final Bundleable.Creator<Commands> CREATOR = $$Lambda$Player$Commands$17cOzc9uq_flOs3WWiuTTJTipb0.INSTANCE;
        public static final Commands EMPTY = new Builder().build();
        private static final int FIELD_COMMANDS = 0;
        /* access modifiers changed from: private */
        public final FlagSet flags;

        public static final class Builder {
            private static final int[] SUPPORTED_COMMANDS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
            private final FlagSet.Builder flagsBuilder;

            public Builder() {
                this.flagsBuilder = new FlagSet.Builder();
            }

            private Builder(Commands commands) {
                FlagSet.Builder builder = new FlagSet.Builder();
                this.flagsBuilder = builder;
                builder.addAll(commands.flags);
            }

            public Builder add(int i) {
                this.flagsBuilder.add(i);
                return this;
            }

            public Builder addIf(int i, boolean z) {
                this.flagsBuilder.addIf(i, z);
                return this;
            }

            public Builder addAll(int... iArr) {
                this.flagsBuilder.addAll(iArr);
                return this;
            }

            public Builder addAll(Commands commands) {
                this.flagsBuilder.addAll(commands.flags);
                return this;
            }

            public Builder addAllCommands() {
                this.flagsBuilder.addAll(SUPPORTED_COMMANDS);
                return this;
            }

            public Builder remove(int i) {
                this.flagsBuilder.remove(i);
                return this;
            }

            public Builder removeIf(int i, boolean z) {
                this.flagsBuilder.removeIf(i, z);
                return this;
            }

            public Builder removeAll(int... iArr) {
                this.flagsBuilder.removeAll(iArr);
                return this;
            }

            public Commands build() {
                return new Commands(this.flagsBuilder.build());
            }
        }

        private Commands(FlagSet flagSet) {
            this.flags = flagSet;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean contains(int i) {
            return this.flags.contains(i);
        }

        public int size() {
            return this.flags.size();
        }

        public int get(int i) {
            return this.flags.get(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Commands)) {
                return false;
            }
            return this.flags.equals(((Commands) obj).flags);
        }

        public int hashCode() {
            return this.flags.hashCode();
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.flags.size(); i++) {
                arrayList.add(Integer.valueOf(this.flags.get(i)));
            }
            bundle.putIntegerArrayList(keyForField(0), arrayList);
            return bundle;
        }

        /* access modifiers changed from: private */
        public static Commands fromBundle(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(keyForField(0));
            if (integerArrayList == null) {
                return EMPTY;
            }
            Builder builder = new Builder();
            for (int i = 0; i < integerArrayList.size(); i++) {
                builder.add(integerArrayList.get(i).intValue());
            }
            return builder.build();
        }

        private static String keyForField(int i) {
            return Integer.toString(i, 36);
        }
    }
}
