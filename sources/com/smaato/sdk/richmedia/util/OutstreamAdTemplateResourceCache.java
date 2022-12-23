package com.smaato.sdk.richmedia.util;

import android.app.Application;
import com.smaato.sdk.core.dns.DnsResolver;
import com.smaato.sdk.core.dnsbasedresource.DnsBasedResourceCache;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.rawresourceloader.RawResourceLoader;
import com.smaato.sdk.richmedia.C11182R;

public class OutstreamAdTemplateResourceCache extends DnsBasedResourceCache {
    private final RawResourceLoader rawResourceLoader;

    /* access modifiers changed from: protected */
    public String getDomainForDnsQuery() {
        return "smaato_outstream_ad_template\\.txt.sdk-files.smaato.net";
    }

    /* access modifiers changed from: protected */
    public String getResourceUrl() {
        return "https://sdk-files.smaato.net/smaato_outstream_ad_template.txt";
    }

    public OutstreamAdTemplateResourceCache(Application application, Schedulers schedulers, DnsResolver dnsResolver, RawResourceLoader rawResourceLoader2, Logger logger) {
        super(application, schedulers, dnsResolver, "outstream_ad_template", logger);
        this.rawResourceLoader = rawResourceLoader2;
        start();
    }

    /* access modifiers changed from: protected */
    public String getInitialResource() {
        return this.rawResourceLoader.readRawTextFile(C11182R.raw.html_player_vast);
    }

    /* access modifiers changed from: protected */
    public String extractVersion(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(";");
        if (!split[0].contains("=")) {
            return null;
        }
        String[] split2 = split[0].split("=");
        if (split2.length != 2 || !split2[0].equalsIgnoreCase("v")) {
            return null;
        }
        return split2[1];
    }
}
