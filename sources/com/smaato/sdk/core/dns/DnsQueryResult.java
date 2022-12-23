package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.DnsMessage;
import com.smaato.sdk.core.util.Objects;
import java.net.InetAddress;

final class DnsQueryResult {
    public final int port;
    public final DnsMessage query;
    public final QueryMethod queryMethod;
    public final DnsMessage response;
    public final InetAddress serverAddress;

    public enum QueryMethod {
        UDP,
        TCP
    }

    DnsQueryResult(InetAddress inetAddress, QueryMethod queryMethod2, DnsMessage dnsMessage, DnsMessage dnsMessage2, int i) {
        this.queryMethod = (QueryMethod) Objects.requireNonNull(queryMethod2);
        this.query = (DnsMessage) Objects.requireNonNull(dnsMessage);
        this.response = (DnsMessage) Objects.requireNonNull(dnsMessage2);
        this.serverAddress = (InetAddress) Objects.requireNonNull(inetAddress);
        this.port = i;
    }

    public String toString() {
        return this.response.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean wasSuccessful() {
        return this.response.responseCode == DnsMessage.ResponseCode.NO_ERROR;
    }
}
