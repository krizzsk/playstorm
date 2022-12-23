package com.smaato.sdk.video.vast.player.exception;

public class MalformedVideoPlayerException extends VideoPlayerException {
    public MalformedVideoPlayerException() {
        super("Bitstream is not conforming to the related coding standard or file spec");
    }
}
