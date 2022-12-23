package p398ms.p399bd.p400o.Pgl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: ms.bd.o.Pgl.pblr */
class pblr extends SSLSocketFactory {

    /* renamed from: b */
    private static final String[] f29408b = {(String) pblk.m34714a(16777217, 0, 0, "fe1361", new byte[]{67, 75, 113, 81, 88, 104, 55})};

    /* renamed from: a */
    final SSLSocketFactory f29409a;

    public pblr(SSLSocketFactory sSLSocketFactory) {
        this.f29409a = sSLSocketFactory;
    }

    /* renamed from: a */
    private Socket m34744a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f29408b);
        }
        return socket;
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return m34744a(this.f29409a.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return m34744a(this.f29409a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m34744a(this.f29409a.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m34744a(this.f29409a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m34744a(this.f29409a.createSocket(socket, str, i, z));
    }

    public String[] getDefaultCipherSuites() {
        return this.f29409a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f29409a.getSupportedCipherSuites();
    }
}
