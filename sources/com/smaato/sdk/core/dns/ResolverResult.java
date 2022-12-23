package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.Data;
import com.smaato.sdk.core.dns.DnsMessage;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import java.util.Set;

public final class ResolverResult<D extends Data> {
    private final Set<D> data;
    private final Request request;
    private final DnsMessage.ResponseCode responseCode;

    ResolverResult(Request request2, DnsQueryResult dnsQueryResult) {
        Objects.requireNonNull(dnsQueryResult);
        DnsMessage dnsMessage = dnsQueryResult.response;
        this.request = (Request) Objects.requireNonNull(request2);
        this.responseCode = dnsMessage.responseCode;
        this.data = Sets.toImmutableSet(dnsMessage.getAnswersFor(request2));
    }

    public Set<D> getAnswers() {
        return this.data;
    }

    public final String toString() {
        return ResolverResult.class.getName() + 10 + "Question: " + this.request + 10 + "Response Code: " + this.responseCode + 10;
    }
}
