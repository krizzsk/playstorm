package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.DnsException;
import com.smaato.sdk.core.util.p382fi.Supplier;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Set;

final class DnsClient {
    private final DnsDataSource dataSource;
    private final Supplier<Integer> dnsIdSupplier;
    private final Set<InetAddress> dnsServers;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Supplier<java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    DnsClient(com.smaato.sdk.core.dns.DnsDataSource r1, com.smaato.sdk.core.util.p382fi.Supplier<java.lang.Integer> r2, java.util.Set<java.net.InetAddress> r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.core.dns.DnsDataSource r1 = (com.smaato.sdk.core.dns.DnsDataSource) r1
            r0.dataSource = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.core.util.fi.Supplier r1 = (com.smaato.sdk.core.util.p382fi.Supplier) r1
            r0.dnsIdSupplier = r1
            java.util.Set r1 = com.smaato.sdk.core.util.collections.Sets.toImmutableSet(r3)
            r0.dnsServers = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.dns.DnsClient.<init>(com.smaato.sdk.core.dns.DnsDataSource, com.smaato.sdk.core.util.fi.Supplier, java.util.Set):void");
    }

    public DnsQueryResult query(Request request) throws DnsException {
        DnsMessage buildMessage = buildMessage(request);
        ArrayList arrayList = new ArrayList(this.dnsServers.size());
        for (InetAddress query : this.dnsServers) {
            try {
                DnsQueryResult query2 = this.dataSource.query(buildMessage, query, 53);
                if (query2.wasSuccessful()) {
                    return query2;
                }
                arrayList.add(new DnsException.ErrorResponseException(buildMessage, query2));
            } catch (DnsException e) {
                arrayList.add(e);
            }
        }
        if (arrayList.isEmpty()) {
            throw new DnsException.NoQueryPossibleException(buildMessage);
        }
        throw new DnsException.MultipleDnsException(arrayList);
    }

    private DnsMessage buildMessage(Request request) {
        return DnsMessage.builder().setQuestion(request).setId(this.dnsIdSupplier.get().intValue()).setRecursionDesired(true).build();
    }
}
