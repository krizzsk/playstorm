package com.mbridge.msdk.foundation.same.net.stack;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.C8449a;
import com.mbridge.msdk.foundation.same.net.C8498i;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p309e.C8478b;
import com.mbridge.msdk.foundation.same.net.stack.C8509b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.Connection;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.MediaType;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.RequestBody;
import com.mbridge.msdk.thrid.okhttp.Response;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class OkHttpStack implements C8508a {
    private final OkHttpClient mClient = C8509b.C8513a.f20620a.mo57660b();

    private static void setConnectionParametersForRequest(Request.Builder builder, C8498i<?> iVar) throws IOException {
        switch (iVar.mo57610a()) {
            case 0:
                builder.get();
                return;
            case 1:
                builder.post(createRequestBody(iVar));
                return;
            case 2:
                builder.put(createRequestBody(iVar));
                return;
            case 3:
                builder.delete();
                return;
            case 4:
                builder.head();
                return;
            case 5:
                builder.method("OPTIONS", (RequestBody) null);
                return;
            case 6:
                builder.method("TRACE", (RequestBody) null);
                return;
            case 7:
                builder.patch(createRequestBody(iVar));
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static RequestBody createRequestBody(C8498i iVar) {
        byte[] e = iVar.mo57578e();
        if (e == null) {
            return null;
        }
        return RequestBody.create((MediaType) null, e);
    }

    public C8478b performRequest(C8498i<?> iVar) throws IOException {
        int h = iVar.mo57626h();
        int i = iVar.mo57627i();
        int j = iVar.mo57628j();
        int k = iVar.mo57629k();
        int l = iVar.mo57630l();
        if (i == 0) {
            i = h;
        }
        if (j == 0) {
            j = h;
        }
        if (k != 0) {
            h = k;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Protocol.HTTP_1_1);
        arrayList.add(Protocol.HTTP_2);
        OkHttpClient.Builder eventListener = this.mClient.newBuilder().protocols(arrayList).readTimeout((long) j, TimeUnit.MILLISECONDS).connectTimeout((long) i, TimeUnit.MILLISECONDS).writeTimeout((long) h, TimeUnit.MILLISECONDS).eventListener(new DefaultEventListener(iVar.mo57620b()));
        if (l > 0) {
            eventListener.callTimeout((long) l, TimeUnit.MILLISECONDS);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("connectTimeout: ");
        sb.append(i);
        sb.append(" readTimeout: ");
        sb.append(j);
        sb.append(" writeTimeout: ");
        sb.append(h);
        sb.append(" callTimeout: ");
        sb.append(l == 0 ? "not set" : Integer.valueOf(l));
        C8608u.m24880a("OkHttpStack", sb.toString());
        Request.Builder builder = new Request.Builder();
        for (Map.Entry next : iVar.mo57624d().entrySet()) {
            builder.addHeader((String) next.getKey(), (String) next.getValue());
        }
        setConnectionParametersForRequest(builder, iVar);
        Response execute = eventListener.build().newCall(builder.url(iVar.mo57620b()).build()).execute();
        Headers headers = execute.headers();
        ArrayList arrayList2 = new ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            String name = headers.name(i2);
            String value = headers.value(i2);
            if (name != null) {
                arrayList2.add(new C8457b(name, value));
            }
        }
        return new C8478b(execute.code(), arrayList2, execute.body().byteStream());
    }

    private static class DefaultEventListener extends EventListener {
        private long callDuring;
        private long callStart;
        private long connectDuring;
        private String connectErrorMessage;
        private long connectStart;
        private long connectionDuring;
        private long connectionStart;
        private long dnsDuring;
        private String dnsResult;
        private long dnsStart;
        private String hostName;
        private C8509b.C8514b httpStatus;
        private boolean isReportHttpStatus;
        private String method;

        public DefaultEventListener(String str) {
            try {
                boolean a = C8509b.m24590a().mo57659a(str);
                this.isReportHttpStatus = a;
                if (a) {
                    this.httpStatus = C8509b.m24590a().mo57661c();
                }
            } catch (Exception unused) {
                this.isReportHttpStatus = false;
                this.httpStatus = null;
            }
        }

        public void callStart(Call call) {
            super.callStart(call);
            try {
                C8449a.m24396a().mo57537b();
            } catch (Exception unused) {
            }
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.callStart = System.currentTimeMillis();
                if (call != null) {
                    try {
                        this.method = call.request().method();
                    } catch (Exception unused2) {
                        this.method = "";
                    }
                }
            }
        }

        public void dnsStart(Call call, String str) {
            super.dnsStart(call, str);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.dnsStart = System.currentTimeMillis();
            }
        }

        public void dnsEnd(Call call, String str, List<InetAddress> list) {
            super.dnsEnd(call, str, list);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                try {
                    this.dnsDuring = System.currentTimeMillis() - this.dnsStart;
                    if (TextUtils.isEmpty(str)) {
                        this.hostName = "unKnown";
                    } else {
                        this.hostName = str;
                    }
                    if (list != null) {
                        if (list.size() != 0) {
                            InetAddress inetAddress = list.get(0);
                            if (inetAddress != null) {
                                if (!TextUtils.isEmpty(inetAddress.getHostAddress())) {
                                    this.dnsResult = inetAddress.getHostAddress();
                                    return;
                                }
                            }
                            this.dnsResult = "unKnown";
                            return;
                        }
                    }
                    this.dnsResult = "unKnown";
                } catch (Exception e) {
                    C8608u.m24884d("OkHttpStack", e.getMessage());
                    this.hostName = "";
                    this.dnsResult = "";
                }
            }
        }

        public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            super.connectStart(call, inetSocketAddress, proxy);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectStart = System.currentTimeMillis();
            }
        }

        public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            super.connectEnd(call, inetSocketAddress, proxy, protocol);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectDuring = System.currentTimeMillis() - this.connectStart;
                this.connectErrorMessage = "";
            }
        }

        public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
            super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectDuring = System.currentTimeMillis() - this.connectStart;
                this.connectErrorMessage = iOException != null ? iOException.getMessage() : "IO Exception";
            }
        }

        public void connectionAcquired(Call call, Connection connection) {
            super.connectionAcquired(call, connection);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectionStart = System.currentTimeMillis();
            }
        }

        public void connectionReleased(Call call, Connection connection) {
            super.connectionReleased(call, connection);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectionDuring = System.currentTimeMillis() - this.connectionStart;
            }
        }

        public void callEnd(Call call) {
            super.callEnd(call);
            try {
                C8449a.m24396a().mo57538c();
            } catch (Exception unused) {
            }
            if (this.isReportHttpStatus && this.httpStatus != null) {
                try {
                    this.callDuring = System.currentTimeMillis() - this.callStart;
                    this.httpStatus.f20621a = 0;
                    this.httpStatus.f20624d = this.method;
                    this.httpStatus.f20622b = this.callDuring;
                    this.httpStatus.f20625e = this.hostName;
                    this.httpStatus.f20627g = this.dnsDuring;
                    this.httpStatus.f20628h = this.dnsResult;
                    this.httpStatus.f20629i = this.connectDuring;
                    this.httpStatus.f20631k = this.connectionDuring;
                    C8509b.m24590a().mo57658a(this.httpStatus);
                } catch (Exception e) {
                    C8608u.m24884d("OkHttpStack", e.getMessage());
                }
            }
        }

        public void callFailed(Call call, IOException iOException) {
            super.callFailed(call, iOException);
            try {
                C8449a.m24396a().mo57539d();
            } catch (Exception unused) {
            }
            if (this.isReportHttpStatus && this.httpStatus != null) {
                try {
                    this.callDuring = System.currentTimeMillis() - this.callStart;
                    if (!TextUtils.isEmpty(this.connectErrorMessage)) {
                        this.httpStatus.f20621a = 1;
                        this.httpStatus.f20630j = this.connectErrorMessage;
                    } else {
                        this.httpStatus.f20621a = 2;
                    }
                    this.httpStatus.f20623c = iOException != null ? iOException.getMessage() : "IO Exception";
                    this.httpStatus.f20622b = this.callDuring;
                    this.httpStatus.f20625e = this.hostName;
                    this.httpStatus.f20624d = this.method;
                    this.httpStatus.f20627g = this.dnsDuring;
                    this.httpStatus.f20628h = this.dnsResult;
                    this.httpStatus.f20629i = this.connectDuring;
                    this.httpStatus.f20631k = this.connectionDuring;
                    C8509b.m24590a().mo57658a(this.httpStatus);
                } catch (Exception e) {
                    C8608u.m24884d("OkHttpStack", e.getMessage());
                }
            }
        }
    }
}
