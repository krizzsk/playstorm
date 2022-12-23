package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.collections.Sets;
import java.net.InetAddress;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class DiDns {
    private static final Set<InetAddress> DNS_SERVERS = Sets.m32967of(InetAddressUtil.ipv4From("8.8.8.8"), InetAddressUtil.ipv6From("[2001:4860:4860::8888]"));

    private DiDns() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiDns$SQRorG2POSefiIAcTz1wwseJjA.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerFactory(DnsResolver.class, $$Lambda$DiDns$4fFXlHAecQlnG4bCMUjegDKcSbw.INSTANCE);
        diRegistry.registerFactory(DnsClient.class, $$Lambda$DiDns$ci2lAiQtKo70BWQj0JrApXQLB4.INSTANCE);
        diRegistry.registerFactory(DnsDataSource.class, $$Lambda$DiDns$fgDx3iEDQEBQlNSuyf9ljlYpNc.INSTANCE);
    }

    static /* synthetic */ DnsResolver lambda$createRegistry$0(DiConstructor diConstructor) {
        return new DnsResolver((DnsClient) diConstructor.get(DnsClient.class));
    }

    static /* synthetic */ DnsClient lambda$createRegistry$2(DiConstructor diConstructor) {
        return new DnsClient((DnsDataSource) diConstructor.get(DnsDataSource.class), $$Lambda$DiDns$6enUQS0LD4CFX6FI81TLx7m5Ks.INSTANCE, DNS_SERVERS);
    }

    static /* synthetic */ DnsDataSource lambda$createRegistry$3(DiConstructor diConstructor) {
        return new DnsDataSource();
    }

    private static class IdGenerator {
        private static final AtomicInteger nextGeneratedId = new AtomicInteger(1);

        private IdGenerator() {
        }

        /* access modifiers changed from: private */
        public static int generateViewId() {
            AtomicInteger atomicInteger;
            int i;
            int i2;
            do {
                atomicInteger = nextGeneratedId;
                i = atomicInteger.get();
                i2 = i + 1;
                if (i2 > 16777215) {
                    i2 = 1;
                }
            } while (!atomicInteger.compareAndSet(i, i2));
            return i;
        }
    }
}
