package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() {
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    };
    public final String description;
    public final String value;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.value = str3;
    }

    TextInformationFrame(Parcel parcel) {
        super((String) Util.castNonNull(parcel.readString()));
        this.description = parcel.readString();
        this.value = (String) Util.castNonNull(parcel.readString());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f14472id
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            switch(r1) {
                case 82815: goto L_0x00fd;
                case 82878: goto L_0x00f2;
                case 82897: goto L_0x00e7;
                case 83253: goto L_0x00dd;
                case 83254: goto L_0x00d3;
                case 83255: goto L_0x00c8;
                case 83341: goto L_0x00bd;
                case 83378: goto L_0x00b3;
                case 83536: goto L_0x00a8;
                case 83552: goto L_0x009c;
                case 2567331: goto L_0x0091;
                case 2569357: goto L_0x0085;
                case 2569891: goto L_0x0079;
                case 2570401: goto L_0x006d;
                case 2570410: goto L_0x0061;
                case 2571565: goto L_0x0055;
                case 2575251: goto L_0x004a;
                case 2581512: goto L_0x003f;
                case 2581513: goto L_0x0034;
                case 2581514: goto L_0x0028;
                case 2583398: goto L_0x001c;
                case 2590194: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0107
        L_0x0010:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 11
            goto L_0x0108
        L_0x001c:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 9
            goto L_0x0108
        L_0x0028:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 19
            goto L_0x0108
        L_0x0034:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 5
            goto L_0x0108
        L_0x003f:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r3
            goto L_0x0108
        L_0x004a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r6
            goto L_0x0108
        L_0x0055:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 21
            goto L_0x0108
        L_0x0061:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 15
            goto L_0x0108
        L_0x006d:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 14
            goto L_0x0108
        L_0x0079:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 13
            goto L_0x0108
        L_0x0085:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 17
            goto L_0x0108
        L_0x0091:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 7
            goto L_0x0108
        L_0x009c:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 10
            goto L_0x0108
        L_0x00a8:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 20
            goto L_0x0108
        L_0x00b3:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r4
            goto L_0x0108
        L_0x00bd:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 8
            goto L_0x0108
        L_0x00c8:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 18
            goto L_0x0108
        L_0x00d3:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r2
            goto L_0x0108
        L_0x00dd:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r5
            goto L_0x0108
        L_0x00e7:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 12
            goto L_0x0108
        L_0x00f2:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 16
            goto L_0x0108
        L_0x00fd:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 6
            goto L_0x0108
        L_0x0107:
            r0 = -1
        L_0x0108:
            switch(r0) {
                case 0: goto L_0x01ed;
                case 1: goto L_0x01ed;
                case 2: goto L_0x01e7;
                case 3: goto L_0x01e7;
                case 4: goto L_0x01e1;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01db;
                case 7: goto L_0x01db;
                case 8: goto L_0x01b2;
                case 9: goto L_0x01b2;
                case 10: goto L_0x01a4;
                case 11: goto L_0x01a4;
                case 12: goto L_0x0180;
                case 13: goto L_0x0180;
                case 14: goto L_0x0151;
                case 15: goto L_0x0122;
                case 16: goto L_0x011b;
                case 17: goto L_0x011b;
                case 18: goto L_0x0114;
                case 19: goto L_0x0114;
                case 20: goto L_0x010d;
                case 21: goto L_0x010d;
                default: goto L_0x010b;
            }
        L_0x010b:
            goto L_0x01f2
        L_0x010d:
            java.lang.String r0 = r7.value
            r8.setWriter(r0)
            goto L_0x01f2
        L_0x0114:
            java.lang.String r0 = r7.value
            r8.setConductor(r0)
            goto L_0x01f2
        L_0x011b:
            java.lang.String r0 = r7.value
            r8.setComposer(r0)
            goto L_0x01f2
        L_0x0122:
            java.lang.String r0 = r7.value
            java.util.List r0 = parseId3v2point4TimestampFrameForDate(r0)
            int r1 = r0.size()
            if (r1 == r6) goto L_0x0146
            if (r1 == r5) goto L_0x013d
            if (r1 == r3) goto L_0x0134
            goto L_0x01f2
        L_0x0134:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.setReleaseDay(r1)
        L_0x013d:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.setReleaseMonth(r1)
        L_0x0146:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.setReleaseYear(r0)
            goto L_0x01f2
        L_0x0151:
            java.lang.String r0 = r7.value
            java.util.List r0 = parseId3v2point4TimestampFrameForDate(r0)
            int r1 = r0.size()
            if (r1 == r6) goto L_0x0175
            if (r1 == r5) goto L_0x016c
            if (r1 == r3) goto L_0x0163
            goto L_0x01f2
        L_0x0163:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.setRecordingDay(r1)
        L_0x016c:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.setRecordingMonth(r1)
        L_0x0175:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.setRecordingYear(r0)
            goto L_0x01f2
        L_0x0180:
            java.lang.String r0 = r7.value     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            java.lang.String r0 = r0.substring(r5, r2)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            java.lang.String r1 = r7.value     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            java.lang.String r1 = r1.substring(r4, r5)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            com.google.android.exoplayer2.MediaMetadata$Builder r8 = r8.setRecordingMonth(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            r8.setRecordingDay(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f2 }
            goto L_0x01f2
        L_0x01a4:
            java.lang.String r0 = r7.value     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            r8.setRecordingYear(r0)     // Catch:{  }
            goto L_0x01f2
        L_0x01b2:
            java.lang.String r0 = r7.value
            java.lang.String r1 = "/"
            java.lang.String[] r0 = com.google.android.exoplayer2.util.Util.split(r0, r1)
            r1 = r0[r4]     // Catch:{  }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{  }
            int r2 = r0.length     // Catch:{  }
            if (r2 <= r6) goto L_0x01ce
            r0 = r0[r6]     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            goto L_0x01cf
        L_0x01ce:
            r0 = 0
        L_0x01cf:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{  }
            com.google.android.exoplayer2.MediaMetadata$Builder r8 = r8.setTrackNumber(r1)     // Catch:{  }
            r8.setTotalTrackCount(r0)     // Catch:{  }
            goto L_0x01f2
        L_0x01db:
            java.lang.String r0 = r7.value
            r8.setAlbumTitle(r0)
            goto L_0x01f2
        L_0x01e1:
            java.lang.String r0 = r7.value
            r8.setAlbumArtist(r0)
            goto L_0x01f2
        L_0x01e7:
            java.lang.String r0 = r7.value
            r8.setArtist(r0)
            goto L_0x01f2
        L_0x01ed:
            java.lang.String r0 = r7.value
            r8.setTitle(r0)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata$Builder):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!Util.areEqual(this.f14472id, textInformationFrame.f14472id) || !Util.areEqual(this.description, textInformationFrame.description) || !Util.areEqual(this.value, textInformationFrame.value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f14472id.hashCode()) * 31;
        String str = this.description;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f14472id;
        String str2 = this.description;
        String str3 = this.value;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14472id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }

    private static List<Integer> parseId3v2point4TimestampFrameForDate(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
