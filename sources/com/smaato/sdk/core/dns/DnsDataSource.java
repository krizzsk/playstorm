package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.DnsException;
import com.smaato.sdk.core.dns.DnsQueryResult;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

final class DnsDataSource {
    DnsDataSource() {
    }

    public DnsQueryResult query(DnsMessage dnsMessage, InetAddress inetAddress, int i) throws DnsException {
        ArrayList arrayList = new ArrayList();
        try {
            DnsMessage queryUdp = queryUdp(dnsMessage, inetAddress, i);
            if (!queryUdp.truncated) {
                return new DnsQueryResult(inetAddress, DnsQueryResult.QueryMethod.UDP, dnsMessage, queryUdp, i);
            }
        } catch (IOException e) {
            arrayList.add(e);
        }
        try {
            return new DnsQueryResult(inetAddress, DnsQueryResult.QueryMethod.TCP, dnsMessage, queryTcp(dnsMessage, inetAddress, i), i);
        } catch (IOException e2) {
            arrayList.add(e2);
            throw new DnsException.MultipleDnsException(arrayList);
        }
    }

    private DnsMessage queryUdp(DnsMessage dnsMessage, InetAddress inetAddress, int i) throws IOException {
        DatagramPacket asDatagram = dnsMessage.asDatagram(inetAddress, i);
        byte[] bArr = new byte[1024];
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(5000);
            datagramSocket.send(asDatagram);
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 1024);
            datagramSocket.receive(datagramPacket);
            DnsMessage dnsMessage2 = new DnsMessage(datagramPacket.getData());
            if (dnsMessage2.f27127id == dnsMessage.f27127id) {
                datagramSocket.close();
                return dnsMessage2;
            }
            throw new DnsException.IdMismatch(dnsMessage, dnsMessage2);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private DnsMessage queryTcp(DnsMessage dnsMessage, InetAddress inetAddress, int i) throws IOException {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(inetAddress, i), 5000);
            socket.setSoTimeout(5000);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dnsMessage.writeTo(dataOutputStream);
            dataOutputStream.flush();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            for (int i2 = 0; i2 < readUnsignedShort; i2 += dataInputStream.read(bArr, i2, readUnsignedShort - i2)) {
            }
            DnsMessage dnsMessage2 = new DnsMessage(bArr);
            if (dnsMessage2.f27127id == dnsMessage.f27127id) {
                socket.close();
                return dnsMessage2;
            }
            throw new DnsException.IdMismatch(dnsMessage, dnsMessage2);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
