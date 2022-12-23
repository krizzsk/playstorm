package com.smaato.sdk.video.vast.build.compare;

import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Comparator;

public class MediaFileComparator implements Comparator<MediaFile> {
    private final BitrateComparator bitrateComparator;
    private final SizeComparator<MediaFile> sizeComparator;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.smaato.sdk.video.vast.build.compare.SizeComparator<com.smaato.sdk.video.vast.model.MediaFile>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaFileComparator(com.smaato.sdk.video.vast.build.compare.SizeComparator<com.smaato.sdk.video.vast.model.MediaFile> r2, com.smaato.sdk.video.vast.build.compare.BitrateComparator r3) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "sizeComparator can not be null in MediaFileComparator"
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2, r0)
            com.smaato.sdk.video.vast.build.compare.SizeComparator r2 = (com.smaato.sdk.video.vast.build.compare.SizeComparator) r2
            r1.sizeComparator = r2
            java.lang.String r2 = "bitrateComparator cannot be null in MediaFileComparator"
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r3, r2)
            com.smaato.sdk.video.vast.build.compare.BitrateComparator r2 = (com.smaato.sdk.video.vast.build.compare.BitrateComparator) r2
            r1.bitrateComparator = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.build.compare.MediaFileComparator.<init>(com.smaato.sdk.video.vast.build.compare.SizeComparator, com.smaato.sdk.video.vast.build.compare.BitrateComparator):void");
    }

    public int compare(MediaFile mediaFile, MediaFile mediaFile2) {
        int compare = this.sizeComparator.compare(mediaFile, mediaFile2);
        return compare == 0 ? this.bitrateComparator.compare(mediaFile, mediaFile2) : compare;
    }
}
