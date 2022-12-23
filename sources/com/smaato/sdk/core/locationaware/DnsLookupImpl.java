package com.smaato.sdk.core.locationaware;

import com.smaato.sdk.core.dns.DnsName;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DnsLookupImpl implements DnsLookup {
    private static final String[] SERVERS = {"8.8.8.8", "[2001:4860:4860::8888]"};
    private final Logger logger;
    private final AtomicInteger sequence = new AtomicInteger();

    public DnsLookupImpl(Logger logger2) {
        this.logger = logger2;
    }

    public List<TxtRecord> blockingTxt(String str) throws IOException {
        String[] strArr = SERVERS;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            DatagramPacket createPacket = createPacket(InetAddress.getByName(strArr[i]), str, QType.TXT, QClass.IN);
            DatagramSocket datagramSocket = new DatagramSocket();
            try {
                datagramSocket.send(createPacket);
                DatagramPacket datagramPacket = new DatagramPacket(new byte[256], 256);
                datagramSocket.receive(datagramPacket);
                datagramSocket.close();
                try {
                    return readTxtPacket(new DataInputStream(new ByteArrayInputStream(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength())));
                } catch (Exception e) {
                    this.logger.error(LogDomain.NETWORK, DnsLookupImpl.class.getSimpleName(), "dns error", e);
                    i++;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return Collections.emptyList();
        throw th;
    }

    private DatagramPacket createPacket(InetAddress inetAddress, String str, QType qType, QClass qClass) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        writeHeader(dataOutputStream);
        writeQuestion(dataOutputStream, str, qType, qClass);
        dataOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new DatagramPacket(byteArray, byteArray.length, inetAddress, 53);
    }

    private void writeHeader(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.sequence.incrementAndGet());
        dataOutputStream.writeShort(384);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
    }

    private void writeQuestion(DataOutputStream dataOutputStream, String str, QType qType, QClass qClass) throws IOException {
        for (String bytes : str.split(DnsName.ESCAPED_DOT)) {
            byte[] bytes2 = bytes.getBytes("US-ASCII");
            dataOutputStream.writeByte(bytes2.length);
            dataOutputStream.write(bytes2);
        }
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(qType.value);
        dataOutputStream.writeShort(qClass.value);
    }

    private List<TxtRecord> readTxtPacket(DataInputStream dataInputStream) throws IOException {
        int[] readHeader = readHeader(dataInputStream);
        for (int i = 0; i < readHeader[2]; i++) {
            readName(dataInputStream);
            dataInputStream.readShort();
            dataInputStream.readShort();
        }
        ArrayList arrayList = new ArrayList(readHeader[3]);
        for (int i2 = 0; i2 < readHeader[3]; i2++) {
            dataInputStream.readShort();
            dataInputStream.readShort();
            dataInputStream.readShort();
            int readInt = dataInputStream.readInt();
            byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr);
            arrayList.add(TxtRecord.create(new String(bArr), readInt));
        }
        return arrayList;
    }

    private int[] readHeader(DataInputStream dataInputStream) throws IOException {
        return new int[]{dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort()};
    }

    private List<String> readName(DataInputStream dataInputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            if (readUnsignedByte <= 0) {
                return arrayList;
            }
            byte[] bArr = new byte[readUnsignedByte];
            dataInputStream.readFully(bArr);
            arrayList.add(new String(bArr));
        }
    }
}
