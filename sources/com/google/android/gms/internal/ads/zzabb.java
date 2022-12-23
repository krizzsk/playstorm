package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzabb {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzaax zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (zzeh.zzc(newPullParser, "x:xmpmeta")) {
                zzfrh zzo = zzfrh.zzo();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (zzeh.zzc(newPullParser, "rdf:Description")) {
                        String[] strArr = zza;
                        int i = 0;
                        int i2 = 0;
                        while (i2 < 4) {
                            String zza2 = zzeh.zza(newPullParser, strArr[i2]);
                            if (zza2 == null) {
                                i2++;
                            } else if (Integer.parseInt(zza2) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = zzb;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String zza3 = zzeh.zza(newPullParser, strArr2[i3]);
                                    if (zza3 != null) {
                                        j = Long.parseLong(zza3);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = zzc;
                                while (true) {
                                    if (i >= 2) {
                                        zzo = zzfrh.zzo();
                                        break;
                                    }
                                    String zza4 = zzeh.zza(newPullParser, strArr3[i]);
                                    if (zza4 != null) {
                                        zzo = zzfrh.zzq(new zzaaw(MimeTypes.IMAGE_JPEG, "Primary", 0, 0), new zzaaw("video/mp4", "MotionPhoto", Long.parseLong(zza4), 0));
                                        break;
                                    }
                                    i++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    } else if (zzeh.zzc(newPullParser, "Container:Directory")) {
                        zzo = zzb(newPullParser, "Container", "Item");
                    } else if (zzeh.zzc(newPullParser, "GContainer:Directory")) {
                        zzo = zzb(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!zzeh.zzb(newPullParser, "x:xmpmeta"));
                if (zzo.isEmpty()) {
                    return null;
                }
                return new zzaax(j2, zzo);
            }
            throw zzbp.zza("Couldn't find xmp metadata", (Throwable) null);
        } catch (zzbp | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfrh zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        zzfre zzi = zzfrh.zzi();
        do {
            xmlPullParser.next();
            if (zzeh.zzc(xmlPullParser, concat)) {
                String zza2 = zzeh.zza(xmlPullParser, str2.concat(":Mime"));
                String zza3 = zzeh.zza(xmlPullParser, str2.concat(":Semantic"));
                String zza4 = zzeh.zza(xmlPullParser, str2.concat(":Length"));
                String zza5 = zzeh.zza(xmlPullParser, str2.concat(":Padding"));
                if (zza2 == null || zza3 == null) {
                    return zzfrh.zzo();
                }
                zzi.zze(new zzaaw(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0, zza5 != null ? Long.parseLong(zza5) : 0));
            }
        } while (!zzeh.zzb(xmlPullParser, concat2));
        return zzi.zzg();
    }
}
