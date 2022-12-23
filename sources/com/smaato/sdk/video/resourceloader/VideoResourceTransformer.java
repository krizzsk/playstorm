package com.smaato.sdk.video.resourceloader;

import android.net.Uri;
import com.smaato.sdk.core.resourceloader.ResourceTransformer;
import com.smaato.sdk.core.util.Objects;

public class VideoResourceTransformer implements ResourceTransformer<Uri, Uri> {
    public Uri transform(Uri uri) {
        return (Uri) Objects.requireNonNull(uri);
    }
}
