package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Set;

public final class MediaFileResult {
    public final Set<Integer> errors;
    public final MediaFile mediaFile;

    private MediaFileResult(Set<Integer> set, MediaFile mediaFile2) {
        this.errors = (Set) Objects.requireNonNull(set);
        this.mediaFile = mediaFile2;
    }

    public static class Builder {
        private Set<Integer> errors;
        private MediaFile mediaFile;

        public Builder setMediaFile(MediaFile mediaFile2) {
            this.mediaFile = mediaFile2;
            return this;
        }

        public Builder setErrors(Set<Integer> set) {
            this.errors = set;
            return this;
        }

        public MediaFileResult build() {
            return new MediaFileResult(Sets.toImmutableSet(this.errors), this.mediaFile);
        }
    }
}
