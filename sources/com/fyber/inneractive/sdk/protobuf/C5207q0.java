package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q0 */
public interface C5207q0 extends C5211r0 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.q0$a */
    public interface C5208a extends C5211r0, Cloneable {
    }

    int getSerializedSize();

    C5208a newBuilderForType();

    C5208a toBuilder();

    C5151i toByteString();

    void writeTo(C5183l lVar) throws IOException;
}
