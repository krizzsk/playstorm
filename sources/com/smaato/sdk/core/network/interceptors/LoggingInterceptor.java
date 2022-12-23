package com.smaato.sdk.core.network.interceptors;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Headers;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LoggingInterceptor implements Interceptor {
    private final Logger logger;
    private final boolean loggingEnabled;

    public LoggingInterceptor(Boolean bool, Logger logger2) {
        this.loggingEnabled = bool.booleanValue();
        this.logger = logger2;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (!this.loggingEnabled) {
            return chain.proceed(chain.request());
        }
        try {
            return logResponseAndRestoreBody(chain.proceed(logRequestAndRestoreBody(chain.request())), System.currentTimeMillis() - System.currentTimeMillis());
        } catch (Exception e) {
            log(e);
            throw e;
        }
    }

    private Request logRequestAndRestoreBody(Request request) {
        this.logger.info(LogDomain.NETWORK, "--> %s %s", request.method(), request.uri().toString());
        logHeaders(request.headers());
        return logAndRestoreBody(request);
    }

    private Response logResponseAndRestoreBody(Response response, long j) {
        this.logger.info(LogDomain.NETWORK, "<-- %d (%dms) %s", Integer.valueOf(response.responseCode()), Long.valueOf(j), response.request().uri().toString());
        logHeaders(response.headers());
        return logAndRestoreBody(response);
    }

    private void log(Throwable th) {
        this.logger.error(LogDomain.NETWORK, th, "<-- HTTP FAILED", new Object[0]);
    }

    private void logHeaders(Headers headers) {
        for (String next : headers.names()) {
            this.logger.debug(LogDomain.NETWORK, "%s: %s", next, C$r8$backportedMethods$utility$String$2$joinIterable.join(", ", headers.values(next)));
        }
    }

    private Request logAndRestoreBody(Request request) {
        byte[] bArr;
        if (request.body() == null) {
            this.logger.debug(LogDomain.NETWORK, "No request body", new Object[0]);
            return request;
        }
        try {
            bArr = readIntoByteArray(request.body());
            BodyLogger bodyLogger = new BodyLogger(this.logger);
            bodyLogger.write(bArr);
            bodyLogger.close();
        } catch (Throwable th) {
            this.logger.debug(LogDomain.NETWORK, th, "--> Logging body failed", new Object[0]);
            bArr = new byte[0];
        }
        return request.buildUpon().body(new Request.Body(bArr) {
            public final /* synthetic */ byte[] f$0;

            {
                this.f$0 = r1;
            }

            public final void writeTo(OutputStream outputStream) {
                outputStream.write(this.f$0);
            }
        }).build();
    }

    private Response logAndRestoreBody(Response response) {
        byte[] bArr;
        InputStream source;
        try {
            source = response.body().source();
            bArr = readIntoByteArray(source);
            BodyLogger bodyLogger = new BodyLogger(this.logger);
            bodyLogger.write(bArr);
            bodyLogger.close();
            if (source != null) {
                source.close();
            }
        } catch (Throwable th) {
            this.logger.debug(LogDomain.NETWORK, th, "<Logging body failed>", new Object[0]);
            bArr = new byte[0];
        }
        return response.buildUpon().body(createBody(response.body().contentLength(), bArr)).build();
        throw th;
    }

    private byte[] readIntoByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private byte[] readIntoByteArray(Request.Body body) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        body.writeTo(byteArrayOutputStream);
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private Response.Body createBody(final long j, final byte[] bArr) {
        return new Response.Body() {
            public InputStream source() {
                return new ByteArrayInputStream(bArr);
            }

            public long contentLength() {
                return j;
            }
        };
    }
}
