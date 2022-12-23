package com.smaato.sdk.video.vast.player.exception;

public class TimeoutVideoPlayerException extends VideoPlayerException {
    public TimeoutVideoPlayerException() {
        super("An operation takes too long to complete");
    }
}
