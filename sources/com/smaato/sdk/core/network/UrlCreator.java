package com.smaato.sdk.core.network;

import android.net.Uri;
import com.smaato.sdk.core.util.Objects;
import java.util.Map;

public final class UrlCreator {
    public String createUrl(String str, Map<String, String> map) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(map);
        return applyParameters(Uri.parse(str), map).toString();
    }

    private Uri applyParameters(Uri uri, Map<String, String> map) {
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build();
    }

    public String extractHostname(String str) {
        Objects.requireNonNull(str, "Parameter url cannot be null for UrlCreator::extractHostname");
        return Uri.parse(str).getHost();
    }

    public String extractScheme(String str) {
        Objects.requireNonNull(str, "Parameter url cannot be null for UrlCreator::extractScheme");
        return Uri.parse(str).getScheme();
    }

    public boolean isSecureScheme(String str) {
        return "https".equalsIgnoreCase(str);
    }

    public boolean isInsecureScheme(String str) {
        return "http".equalsIgnoreCase(str);
    }

    public boolean isSupportedForNetworking(String str) {
        String extractScheme = extractScheme(str);
        return isSecureScheme(extractScheme) || isInsecureScheme(extractScheme);
    }
}
