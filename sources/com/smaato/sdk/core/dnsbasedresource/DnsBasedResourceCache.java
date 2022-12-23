package com.smaato.sdk.core.dnsbasedresource;

import android.app.Application;
import android.content.SharedPreferences;
import com.smaato.sdk.core.dns.DnsResolver;
import com.smaato.sdk.core.dns.ResolverResult;
import com.smaato.sdk.core.dns.TXT;
import com.smaato.sdk.core.flow.Action0;
import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.Callable;

public abstract class DnsBasedResourceCache {
    public final Application application;
    private final DnsResolver dnsResolver;
    private String inMemoryCache;
    private String initialResource;
    private final Logger logger;
    private final String resourceKey;
    private final Schedulers schedulers;

    /* access modifiers changed from: protected */
    public abstract String extractVersion(String str);

    /* access modifiers changed from: protected */
    public abstract String getDomainForDnsQuery();

    /* access modifiers changed from: protected */
    public abstract String getInitialResource();

    /* access modifiers changed from: protected */
    public abstract String getResourceUrl();

    protected DnsBasedResourceCache(Application application2, Schedulers schedulers2, DnsResolver dnsResolver2, String str, Logger logger2) {
        this.application = application2;
        this.resourceKey = str;
        this.schedulers = schedulers2;
        this.dnsResolver = dnsResolver2;
        this.logger = logger2;
    }

    /* access modifiers changed from: protected */
    public void start() {
        this.initialResource = getInitialResource();
        update();
    }

    public Flow<String> get() {
        return Flow.fromCallable(new Callable() {
            public final Object call() {
                return DnsBasedResourceCache.this.readLocalResource();
            }
        }).subscribeOn(this.schedulers.mo68934io());
    }

    public String getBlocking() {
        return readLocalResource();
    }

    private void update() {
        Flow.fromAction(new Action0() {
            public final void invoke() {
                DnsBasedResourceCache.this.updateLocalResource();
            }
        }).subscribeOn(this.schedulers.mo68934io()).subscribe();
    }

    /* access modifiers changed from: private */
    public void updateLocalResource() {
        String readResourceFromNetwork;
        synchronized (this) {
            String actualVersionNumberFromDns = getActualVersionNumberFromDns();
            if (!getLocalVersionNumber().equals(actualVersionNumberFromDns) && (readResourceFromNetwork = readResourceFromNetwork()) != null) {
                saveLocalVersionNumber(actualVersionNumberFromDns);
                saveLocalResource(readResourceFromNetwork);
            }
        }
    }

    /* access modifiers changed from: private */
    public String readLocalResource() {
        String str;
        synchronized (this) {
            if (this.inMemoryCache == null) {
                this.inMemoryCache = getSharedPreferences().getString(this.resourceKey, this.initialResource);
            }
            str = this.inMemoryCache;
        }
        return str;
    }

    private String getLocalVersionNumber() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences.getString(this.resourceKey + ".version", "");
    }

    private void saveLocalVersionNumber(String str) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putString(this.resourceKey + ".version", str).apply();
    }

    private void saveLocalResource(String str) {
        getSharedPreferences().edit().putString(this.resourceKey, str).apply();
    }

    private SharedPreferences getSharedPreferences() {
        return this.application.getSharedPreferences("com.smaato.sdk.prefs", 0);
    }

    private String getActualVersionNumberFromDns() {
        try {
            ResolverResult<D> resolve = this.dnsResolver.resolve(getDomainForDnsQuery(), TXT.class);
            if (resolve.getAnswers().size() > 0) {
                return extractVersion(((TXT) resolve.getAnswers().toArray()[0]).getText());
            }
            return null;
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, "Error in finding version from DNS", e);
            return null;
        }
    }

    private String readResourceFromNetwork() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(getResourceUrl()).openConnection().getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (IOException e) {
            this.logger.error(LogDomain.CORE, "Error in reading resource from DNS", e);
            return null;
        }
    }
}
