package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.C5116a;
import com.fyber.inneractive.sdk.protobuf.C5119a0;
import com.fyber.inneractive.sdk.protobuf.C5125c;
import com.fyber.inneractive.sdk.protobuf.C5151i;
import com.fyber.inneractive.sdk.protobuf.C5172j;
import com.fyber.inneractive.sdk.protobuf.C5205q;
import com.fyber.inneractive.sdk.protobuf.C5211r0;
import com.fyber.inneractive.sdk.protobuf.C5250y;
import com.fyber.inneractive.sdk.protobuf.C5251y0;
import com.fyber.inneractive.sdk.protobuf.C5252z;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class TokenParametersOuterClass$TokenParameters extends GeneratedMessageLite<TokenParametersOuterClass$TokenParameters, C4196b> implements C5211r0 {
    public static final int AAID_FIELD_NUMBER = 54;
    public static final int ABEXPERIMENTS_FIELD_NUMBER = 63;
    public static final int AIRPLANEMODE_FIELD_NUMBER = 50;
    public static final int AMAZONID_FIELD_NUMBER = 53;
    public static final int APPBUILDVERSION_FIELD_NUMBER = 55;
    public static final int APPVERSION_FIELD_NUMBER = 6;
    public static final int BATTERYCHARGING_FIELD_NUMBER = 43;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 44;
    public static final int BLUETOOTHPLUGGED_FIELD_NUMBER = 46;
    public static final int BUNDLEID_FIELD_NUMBER = 4;
    public static final int CARRIERNAME_FIELD_NUMBER = 18;
    public static final int CCPASTRING_FIELD_NUMBER = 27;
    public static final int COUNTRYCODE_FIELD_NUMBER = 17;
    public static final int DARKMODE_FIELD_NUMBER = 49;
    /* access modifiers changed from: private */
    public static final TokenParametersOuterClass$TokenParameters DEFAULT_INSTANCE;
    public static final int DEVICEAPI_FIELD_NUMBER = 8;
    public static final int DEVICEHEIGHT_FIELD_NUMBER = 13;
    public static final int DEVICELANGUAGE_FIELD_NUMBER = 10;
    public static final int DEVICEMODEL_FIELD_NUMBER = 5;
    public static final int DEVICEOS_FIELD_NUMBER = 7;
    public static final int DEVICEWIDTH_FIELD_NUMBER = 12;
    public static final int DNDMODE_FIELD_NUMBER = 51;
    public static final int DNT_FIELD_NUMBER = 24;
    public static final int FRAMEWORKNAME_FIELD_NUMBER = 15;
    public static final int FREESPACE_FIELD_NUMBER = 47;
    public static final int GDPRCONSENT_FIELD_NUMBER = 25;
    public static final int GDPRSTRING_FIELD_NUMBER = 26;
    public static final int HEADSETPLUGGED_FIELD_NUMBER = 45;
    public static final int HORACCURACY_FIELD_NUMBER = 39;
    public static final int IDFA_FIELD_NUMBER = 22;
    public static final int IDFV_FIELD_NUMBER = 23;
    public static final int INPUTLANGUAGES_FIELD_NUMBER = 21;
    public static final int ISRINGMUTED_FIELD_NUMBER = 52;
    public static final int KEYWORDS_FIELD_NUMBER = 36;
    public static final int LASTADOMAINS_FIELD_NUMBER = 57;
    public static final int LASTADVERTISEDBUNDLES_FIELD_NUMBER = 58;
    public static final int LATITUDE_FIELD_NUMBER = 37;
    public static final int LGPDCONSENT_FIELD_NUMBER = 66;
    public static final int LONGITUDE_FIELD_NUMBER = 38;
    public static final int LOWPOWERMODE_FIELD_NUMBER = 48;
    public static final int MEDIATIONTYPE_FIELD_NUMBER = 14;
    public static final int MOBILECOUNTRYCODE_FIELD_NUMBER = 19;
    public static final int MOBILENETWORKCODE_FIELD_NUMBER = 20;
    public static final int MOCKRESPONSEID_FIELD_NUMBER = 65;
    public static final int MUTEAUDIO_FIELD_NUMBER = 32;
    public static final int NETWORK_FIELD_NUMBER = 31;
    public static final int OFFSETFROMGMT_FIELD_NUMBER = 28;
    public static final int OSVERSION_FIELD_NUMBER = 9;
    private static volatile C5251y0<TokenParametersOuterClass$TokenParameters> PARSER = null;
    public static final int PORTAL_FIELD_NUMBER = 64;
    public static final int PRIORCLICKS_FIELD_NUMBER = 59;
    public static final int PRIORCLICKTYPES_FIELD_NUMBER = 61;
    public static final int PRIORSKIP_FIELD_NUMBER = 60;
    public static final int PXRATIO_FIELD_NUMBER = 11;
    public static final int SDKVERSION_FIELD_NUMBER = 3;
    public static final int SECURECONTENT_FIELD_NUMBER = 42;
    public static final int SESSIONDURATION_FIELD_NUMBER = 56;
    public static final int TIMEACCURACY_FIELD_NUMBER = 41;
    public static final int TOTALSPACE_FIELD_NUMBER = 16;
    public static final int TRACKINGSTATUS_FIELD_NUMBER = 29;
    public static final int USERAGENT_FIELD_NUMBER = 2;
    public static final int USERAGE_FIELD_NUMBER = 33;
    public static final int USERGENDER_FIELD_NUMBER = 34;
    public static final int USERID_FIELD_NUMBER = 30;
    public static final int USERSESSIONS_FIELD_NUMBER = 62;
    public static final int VERACCURACY_FIELD_NUMBER = 40;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int ZIPCODE_FIELD_NUMBER = 35;
    private static final C5252z.C5260h.C5261a<Integer, C4205k> priorClicks_converter_ = new C4195a();
    private NullableString aaid_;
    private C5252z.C5263j<Experiment> abExperiments_ = GeneratedMessageLite.emptyProtobufList();
    private NullableBool airplaneMode_;
    private NullableString amazonId_;
    private NullableString appBuildVersion_;
    private NullableString appVersion_;
    private NullableBool batteryCharging_;
    private NullableUInt32 batteryLevel_;
    private int bitField0_;
    private NullableBool bluetoothPlugged_;
    private NullableString bundleID_;
    private NullableString carrierName_;
    private NullableString ccpaString_;
    private NullableString countryCode_;
    private boolean darkMode_;
    private NullableUInt32 deviceApi_;
    private NullableUInt32 deviceHeight_;
    private NullableString deviceLanguage_;
    private NullableString deviceModel_;
    private NullableString deviceOS_;
    private NullableUInt32 deviceWidth_;
    private NullableBool dndMode_;
    private boolean dnt_;
    private int frameworkName_;
    private NullableUInt32 freeSpace_;
    private NullableBool gdprConsent_;
    private NullableString gdprString_;
    private NullableBool headsetPlugged_;
    private NullableFloat horAccuracy_;
    private NullableString idfa_;
    private NullableString idfv_;
    private NullableString inputLanguages_;
    private NullableBool isRingMuted_;
    private NullableString keywords_;
    private C5252z.C5263j<LastAdomain> lastAdomains_ = GeneratedMessageLite.emptyProtobufList();
    private C5252z.C5263j<LastAdvertisedBundle> lastAdvertisedBundles_ = GeneratedMessageLite.emptyProtobufList();
    private NullableFloat latitude_;
    private NullableBool lgpdConsent_;
    private NullableFloat longitude_;
    private NullableBool lowPowerMode_;
    private NullableString mediationType_;
    private NullableString mobileCountryCode_;
    private NullableString mobileNetworkCode_;
    private NullableString mockResponseId_;
    private boolean muteAudio_;
    private NullableString network_;
    private NullableSInt32 offsetFromGMT_;
    private NullableString osVersion_;
    private NullableUInt32 portal_;
    private C5252z.C5263j<PriorVideoClickType> priorClickTypes_ = GeneratedMessageLite.emptyProtobufList();
    private int priorClicksMemoizedSerializedSize;
    private C5252z.C5259g priorClicks_ = GeneratedMessageLite.emptyIntList();
    private NullableBool priorSkip_;
    private NullableFloat pxRatio_;
    private NullableString sdkVersion_;
    private int secureContent_;
    private NullableUInt32 sessionDuration_;
    private NullableFloat timeAccuracy_;
    private NullableUInt32 totalSpace_;
    private NullableUInt32 trackingStatus_;
    private NullableUInt32 userAge_;
    private NullableString userAgent_;
    private int userGender_;
    private NullableString userID_;
    private C5252z.C5263j<UserSession> userSessions_ = GeneratedMessageLite.emptyProtobufList();
    private NullableFloat verAccuracy_;
    private NullableString version_;
    private NullableString zipCode_;

    public static final class Experiment extends GeneratedMessageLite<Experiment, C4184a> implements C4197c {
        /* access modifiers changed from: private */
        public static final Experiment DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        private static volatile C5251y0<Experiment> PARSER = null;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String identifier_ = "";
        private String variant_ = "";

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$Experiment$a */
        public static final class C4184a extends GeneratedMessageLite.C5108a<Experiment, C4184a> implements C4197c {
            public C4184a() {
                super(Experiment.DEFAULT_INSTANCE);
            }
        }

        static {
            Experiment experiment = new Experiment();
            DEFAULT_INSTANCE = experiment;
            GeneratedMessageLite.registerDefaultInstance(Experiment.class, experiment);
        }

        private Experiment() {
        }

        /* access modifiers changed from: private */
        public void clearIdentifier() {
            this.bitField0_ &= -2;
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        /* access modifiers changed from: private */
        public void clearVariant() {
            this.bitField0_ &= -3;
            this.variant_ = getDefaultInstance().getVariant();
        }

        public static Experiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4184a newBuilder() {
            return (C4184a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Experiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<Experiment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIdentifier(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifier_ = str;
        }

        /* access modifiers changed from: private */
        public void setIdentifierBytes(C5151i iVar) {
            C5116a.checkByteStringIsUtf8(iVar);
            this.identifier_ = iVar.mo25993i();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setVariant(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.variant_ = str;
        }

        /* access modifiers changed from: private */
        public void setVariantBytes(C5151i iVar) {
            C5116a.checkByteStringIsUtf8(iVar);
            this.variant_ = iVar.mo25993i();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "identifier_", "variant_"});
                case 3:
                    return new Experiment();
                case 4:
                    return new C4184a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<Experiment> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (Experiment.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getIdentifier() {
            return this.identifier_;
        }

        public C5151i getIdentifierBytes() {
            return C5151i.m15767a(this.identifier_);
        }

        public String getVariant() {
            return this.variant_;
        }

        public C5151i getVariantBytes() {
            return C5151i.m15767a(this.variant_);
        }

        public boolean hasIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVariant() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C4184a newBuilder(Experiment experiment) {
            return (C4184a) DEFAULT_INSTANCE.createBuilder(experiment);
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Experiment parseFrom(C5151i iVar) throws C5119a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static Experiment parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static Experiment parseFrom(byte[] bArr) throws C5119a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Experiment parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Experiment parseFrom(InputStream inputStream) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Experiment parseFrom(C5172j jVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Experiment parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class LastAdomain extends GeneratedMessageLite<LastAdomain, C4185a> implements C4199e {
        public static final int ADOMAIN_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final LastAdomain DEFAULT_INSTANCE;
        private static volatile C5251y0<LastAdomain> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String adomain_ = "";
        private int bitField0_;
        private int type_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdomain$a */
        public static final class C4185a extends GeneratedMessageLite.C5108a<LastAdomain, C4185a> implements C4199e {
            public C4185a() {
                super(LastAdomain.DEFAULT_INSTANCE);
            }
        }

        static {
            LastAdomain lastAdomain = new LastAdomain();
            DEFAULT_INSTANCE = lastAdomain;
            GeneratedMessageLite.registerDefaultInstance(LastAdomain.class, lastAdomain);
        }

        private LastAdomain() {
        }

        /* access modifiers changed from: private */
        public void clearAdomain() {
            this.bitField0_ &= -3;
            this.adomain_ = getDefaultInstance().getAdomain();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static LastAdomain getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4185a newBuilder() {
            return (C4185a) DEFAULT_INSTANCE.createBuilder();
        }

        public static LastAdomain parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdomain parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<LastAdomain> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAdomain(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.adomain_ = str;
        }

        /* access modifiers changed from: private */
        public void setAdomainBytes(C5151i iVar) {
            C5116a.checkByteStringIsUtf8(iVar);
            this.adomain_ = iVar.mo25993i();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setType(C4205k kVar) {
            this.type_ = kVar.mo24088a();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "adomain_"});
                case 3:
                    return new LastAdomain();
                case 4:
                    return new C4185a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<LastAdomain> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (LastAdomain.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getAdomain() {
            return this.adomain_;
        }

        public C5151i getAdomainBytes() {
            return C5151i.m15767a(this.adomain_);
        }

        public C4205k getType() {
            C4205k a = C4205k.m13364a(this.type_);
            return a == null ? C4205k.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasAdomain() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4185a newBuilder(LastAdomain lastAdomain) {
            return (C4185a) DEFAULT_INSTANCE.createBuilder(lastAdomain);
        }

        public static LastAdomain parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdomain parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static LastAdomain parseFrom(C5151i iVar) throws C5119a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static LastAdomain parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static LastAdomain parseFrom(byte[] bArr) throws C5119a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastAdomain parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static LastAdomain parseFrom(InputStream inputStream) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdomain parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdomain parseFrom(C5172j jVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static LastAdomain parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class LastAdvertisedBundle extends GeneratedMessageLite<LastAdvertisedBundle, C4186a> implements C4200f {
        /* access modifiers changed from: private */
        public static final LastAdvertisedBundle DEFAULT_INSTANCE;
        public static final int LASTBUNDLE_FIELD_NUMBER = 2;
        private static volatile C5251y0<LastAdvertisedBundle> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String lastBundle_ = "";
        private int type_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdvertisedBundle$a */
        public static final class C4186a extends GeneratedMessageLite.C5108a<LastAdvertisedBundle, C4186a> implements C4200f {
            public C4186a() {
                super(LastAdvertisedBundle.DEFAULT_INSTANCE);
            }
        }

        static {
            LastAdvertisedBundle lastAdvertisedBundle = new LastAdvertisedBundle();
            DEFAULT_INSTANCE = lastAdvertisedBundle;
            GeneratedMessageLite.registerDefaultInstance(LastAdvertisedBundle.class, lastAdvertisedBundle);
        }

        private LastAdvertisedBundle() {
        }

        /* access modifiers changed from: private */
        public void clearLastBundle() {
            this.bitField0_ &= -3;
            this.lastBundle_ = getDefaultInstance().getLastBundle();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static LastAdvertisedBundle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4186a newBuilder() {
            return (C4186a) DEFAULT_INSTANCE.createBuilder();
        }

        public static LastAdvertisedBundle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdvertisedBundle parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<LastAdvertisedBundle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLastBundle(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.lastBundle_ = str;
        }

        /* access modifiers changed from: private */
        public void setLastBundleBytes(C5151i iVar) {
            C5116a.checkByteStringIsUtf8(iVar);
            this.lastBundle_ = iVar.mo25993i();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setType(C4205k kVar) {
            this.type_ = kVar.mo24088a();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "lastBundle_"});
                case 3:
                    return new LastAdvertisedBundle();
                case 4:
                    return new C4186a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<LastAdvertisedBundle> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (LastAdvertisedBundle.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getLastBundle() {
            return this.lastBundle_;
        }

        public C5151i getLastBundleBytes() {
            return C5151i.m15767a(this.lastBundle_);
        }

        public C4205k getType() {
            C4205k a = C4205k.m13364a(this.type_);
            return a == null ? C4205k.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasLastBundle() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4186a newBuilder(LastAdvertisedBundle lastAdvertisedBundle) {
            return (C4186a) DEFAULT_INSTANCE.createBuilder(lastAdvertisedBundle);
        }

        public static LastAdvertisedBundle parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdvertisedBundle parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static LastAdvertisedBundle parseFrom(C5151i iVar) throws C5119a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static LastAdvertisedBundle parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static LastAdvertisedBundle parseFrom(byte[] bArr) throws C5119a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastAdvertisedBundle parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static LastAdvertisedBundle parseFrom(InputStream inputStream) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdvertisedBundle parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdvertisedBundle parseFrom(C5172j jVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static LastAdvertisedBundle parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class NullableBool extends GeneratedMessageLite<NullableBool, C4187a> implements C5211r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final NullableBool DEFAULT_INSTANCE;
        private static volatile C5251y0<NullableBool> PARSER;
        private int bitField0_;
        private boolean data_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool$a */
        public static final class C4187a extends GeneratedMessageLite.C5108a<NullableBool, C4187a> implements C5211r0 {
            public C4187a() {
                super(NullableBool.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableBool nullableBool = new NullableBool();
            DEFAULT_INSTANCE = nullableBool;
            GeneratedMessageLite.registerDefaultInstance(NullableBool.class, nullableBool);
        }

        private NullableBool() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = false;
        }

        public static NullableBool getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4187a newBuilder() {
            return (C4187a) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableBool parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableBool parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<NullableBool> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(boolean z) {
            this.bitField0_ |= 1;
            this.data_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableBool();
                case 4:
                    return new C4187a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<NullableBool> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableBool.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4187a newBuilder(NullableBool nullableBool) {
            return (C4187a) DEFAULT_INSTANCE.createBuilder(nullableBool);
        }

        public static NullableBool parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableBool parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableBool parseFrom(C5151i iVar) throws C5119a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableBool parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableBool parseFrom(byte[] bArr) throws C5119a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableBool parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableBool parseFrom(InputStream inputStream) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableBool parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableBool parseFrom(C5172j jVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableBool parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class NullableFloat extends GeneratedMessageLite<NullableFloat, C4188a> implements C5211r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final NullableFloat DEFAULT_INSTANCE;
        private static volatile C5251y0<NullableFloat> PARSER;
        private int bitField0_;
        private float data_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableFloat$a */
        public static final class C4188a extends GeneratedMessageLite.C5108a<NullableFloat, C4188a> implements C5211r0 {
            public C4188a() {
                super(NullableFloat.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableFloat nullableFloat = new NullableFloat();
            DEFAULT_INSTANCE = nullableFloat;
            GeneratedMessageLite.registerDefaultInstance(NullableFloat.class, nullableFloat);
        }

        private NullableFloat() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0.0f;
        }

        public static NullableFloat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4188a newBuilder() {
            return (C4188a) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableFloat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableFloat parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<NullableFloat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(float f) {
            this.bitField0_ |= 1;
            this.data_ = f;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableFloat();
                case 4:
                    return new C4188a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<NullableFloat> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableFloat.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public float getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4188a newBuilder(NullableFloat nullableFloat) {
            return (C4188a) DEFAULT_INSTANCE.createBuilder(nullableFloat);
        }

        public static NullableFloat parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableFloat parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableFloat parseFrom(C5151i iVar) throws C5119a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableFloat parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableFloat parseFrom(byte[] bArr) throws C5119a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableFloat parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableFloat parseFrom(InputStream inputStream) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableFloat parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableFloat parseFrom(C5172j jVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableFloat parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class NullableSInt32 extends GeneratedMessageLite<NullableSInt32, C4189a> implements C5211r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final NullableSInt32 DEFAULT_INSTANCE;
        private static volatile C5251y0<NullableSInt32> PARSER;
        private int bitField0_;
        private int data_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableSInt32$a */
        public static final class C4189a extends GeneratedMessageLite.C5108a<NullableSInt32, C4189a> implements C5211r0 {
            public C4189a() {
                super(NullableSInt32.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableSInt32 nullableSInt32 = new NullableSInt32();
            DEFAULT_INSTANCE = nullableSInt32;
            GeneratedMessageLite.registerDefaultInstance(NullableSInt32.class, nullableSInt32);
        }

        private NullableSInt32() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static NullableSInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4189a newBuilder() {
            return (C4189a) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableSInt32 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableSInt32 parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<NullableSInt32> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(int i) {
            this.bitField0_ |= 1;
            this.data_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဏ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableSInt32();
                case 4:
                    return new C4189a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<NullableSInt32> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableSInt32.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4189a newBuilder(NullableSInt32 nullableSInt32) {
            return (C4189a) DEFAULT_INSTANCE.createBuilder(nullableSInt32);
        }

        public static NullableSInt32 parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableSInt32 parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableSInt32 parseFrom(C5151i iVar) throws C5119a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableSInt32 parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableSInt32 parseFrom(byte[] bArr) throws C5119a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableSInt32 parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableSInt32 parseFrom(InputStream inputStream) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableSInt32 parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableSInt32 parseFrom(C5172j jVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableSInt32 parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class NullableString extends GeneratedMessageLite<NullableString, C4190a> implements C5211r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final NullableString DEFAULT_INSTANCE;
        private static volatile C5251y0<NullableString> PARSER;
        private int bitField0_;
        private String data_ = "";

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString$a */
        public static final class C4190a extends GeneratedMessageLite.C5108a<NullableString, C4190a> implements C5211r0 {
            public C4190a() {
                super(NullableString.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableString nullableString = new NullableString();
            DEFAULT_INSTANCE = nullableString;
            GeneratedMessageLite.registerDefaultInstance(NullableString.class, nullableString);
        }

        private NullableString() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = getDefaultInstance().getData();
        }

        public static NullableString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4190a newBuilder() {
            return (C4190a) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableString parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableString parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<NullableString> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.data_ = str;
        }

        /* access modifiers changed from: private */
        public void setDataBytes(C5151i iVar) {
            C5116a.checkByteStringIsUtf8(iVar);
            this.data_ = iVar.mo25993i();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableString();
                case 4:
                    return new C4190a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<NullableString> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableString.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getData() {
            return this.data_;
        }

        public C5151i getDataBytes() {
            return C5151i.m15767a(this.data_);
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4190a newBuilder(NullableString nullableString) {
            return (C4190a) DEFAULT_INSTANCE.createBuilder(nullableString);
        }

        public static NullableString parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableString parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableString parseFrom(C5151i iVar) throws C5119a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableString parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableString parseFrom(byte[] bArr) throws C5119a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableString parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableString parseFrom(InputStream inputStream) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableString parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableString parseFrom(C5172j jVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableString parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class NullableUInt32 extends GeneratedMessageLite<NullableUInt32, C4191a> implements C5211r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final NullableUInt32 DEFAULT_INSTANCE;
        private static volatile C5251y0<NullableUInt32> PARSER;
        private int bitField0_;
        private int data_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32$a */
        public static final class C4191a extends GeneratedMessageLite.C5108a<NullableUInt32, C4191a> implements C5211r0 {
            public C4191a() {
                super(NullableUInt32.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public C4191a mo24064a(int i) {
                mo25812c();
                ((NullableUInt32) this.f13688b).setData(i);
                return this;
            }
        }

        static {
            NullableUInt32 nullableUInt32 = new NullableUInt32();
            DEFAULT_INSTANCE = nullableUInt32;
            GeneratedMessageLite.registerDefaultInstance(NullableUInt32.class, nullableUInt32);
        }

        private NullableUInt32() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static NullableUInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4191a newBuilder() {
            return (C4191a) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableUInt32 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableUInt32 parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<NullableUInt32> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(int i) {
            this.bitField0_ |= 1;
            this.data_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableUInt32();
                case 4:
                    return new C4191a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<NullableUInt32> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableUInt32.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4191a newBuilder(NullableUInt32 nullableUInt32) {
            return (C4191a) DEFAULT_INSTANCE.createBuilder(nullableUInt32);
        }

        public static NullableUInt32 parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableUInt32 parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableUInt32 parseFrom(C5151i iVar) throws C5119a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableUInt32 parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableUInt32 parseFrom(byte[] bArr) throws C5119a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableUInt32 parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableUInt32 parseFrom(InputStream inputStream) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableUInt32 parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableUInt32 parseFrom(C5172j jVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableUInt32 parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class PriorVideoClickType extends GeneratedMessageLite<PriorVideoClickType, C4192a> implements C4201g {
        public static final int CLICKTYPE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final PriorVideoClickType DEFAULT_INSTANCE;
        private static volatile C5251y0<PriorVideoClickType> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int clickType_;
        private int type_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$PriorVideoClickType$a */
        public static final class C4192a extends GeneratedMessageLite.C5108a<PriorVideoClickType, C4192a> implements C4201g {
            public C4192a() {
                super(PriorVideoClickType.DEFAULT_INSTANCE);
            }
        }

        static {
            PriorVideoClickType priorVideoClickType = new PriorVideoClickType();
            DEFAULT_INSTANCE = priorVideoClickType;
            GeneratedMessageLite.registerDefaultInstance(PriorVideoClickType.class, priorVideoClickType);
        }

        private PriorVideoClickType() {
        }

        /* access modifiers changed from: private */
        public void clearClickType() {
            this.bitField0_ &= -3;
            this.clickType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static PriorVideoClickType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4192a newBuilder() {
            return (C4192a) DEFAULT_INSTANCE.createBuilder();
        }

        public static PriorVideoClickType parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriorVideoClickType parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<PriorVideoClickType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClickType(C4208n nVar) {
            this.clickType_ = nVar.mo24088a();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setClickTypeValue(int i) {
            this.bitField0_ |= 2;
            this.clickType_ = i;
        }

        /* access modifiers changed from: private */
        public void setType(C4205k kVar) {
            this.type_ = kVar.mo24088a();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "type_", "clickType_"});
                case 3:
                    return new PriorVideoClickType();
                case 4:
                    return new C4192a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<PriorVideoClickType> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (PriorVideoClickType.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public C4208n getClickType() {
            C4208n a = C4208n.m13368a(this.clickType_);
            return a == null ? C4208n.UNRECOGNIZED : a;
        }

        public int getClickTypeValue() {
            return this.clickType_;
        }

        public C4205k getType() {
            C4205k a = C4205k.m13364a(this.type_);
            return a == null ? C4205k.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasClickType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4192a newBuilder(PriorVideoClickType priorVideoClickType) {
            return (C4192a) DEFAULT_INSTANCE.createBuilder(priorVideoClickType);
        }

        public static PriorVideoClickType parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PriorVideoClickType parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PriorVideoClickType parseFrom(C5151i iVar) throws C5119a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PriorVideoClickType parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PriorVideoClickType parseFrom(byte[] bArr) throws C5119a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PriorVideoClickType parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static PriorVideoClickType parseFrom(InputStream inputStream) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriorVideoClickType parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PriorVideoClickType parseFrom(C5172j jVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PriorVideoClickType parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class SessionData extends GeneratedMessageLite<SessionData, C4193a> implements C4203i {
        public static final int CLICKS_FIELD_NUMBER = 2;
        public static final int COMPLETIONS_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final SessionData DEFAULT_INSTANCE;
        public static final int IMPRESSIONS_FIELD_NUMBER = 1;
        private static volatile C5251y0<SessionData> PARSER;
        private int bitField0_;
        private int clicks_;
        private int completions_;
        private int impressions_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData$a */
        public static final class C4193a extends GeneratedMessageLite.C5108a<SessionData, C4193a> implements C4203i {
            public C4193a() {
                super(SessionData.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionData sessionData = new SessionData();
            DEFAULT_INSTANCE = sessionData;
            GeneratedMessageLite.registerDefaultInstance(SessionData.class, sessionData);
        }

        private SessionData() {
        }

        /* access modifiers changed from: private */
        public void clearClicks() {
            this.bitField0_ &= -3;
            this.clicks_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCompletions() {
            this.bitField0_ &= -5;
            this.completions_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearImpressions() {
            this.bitField0_ &= -2;
            this.impressions_ = 0;
        }

        public static SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4193a newBuilder() {
            return (C4193a) DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<SessionData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClicks(int i) {
            this.bitField0_ |= 2;
            this.clicks_ = i;
        }

        /* access modifiers changed from: private */
        public void setCompletions(int i) {
            this.bitField0_ |= 4;
            this.completions_ = i;
        }

        /* access modifiers changed from: private */
        public void setImpressions(int i) {
            this.bitField0_ |= 1;
            this.impressions_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "impressions_", "clicks_", "completions_"});
                case 3:
                    return new SessionData();
                case 4:
                    return new C4193a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<SessionData> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (SessionData.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getClicks() {
            return this.clicks_;
        }

        public int getCompletions() {
            return this.completions_;
        }

        public int getImpressions() {
            return this.impressions_;
        }

        public boolean hasClicks() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCompletions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasImpressions() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4193a newBuilder(SessionData sessionData) {
            return (C4193a) DEFAULT_INSTANCE.createBuilder(sessionData);
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static SessionData parseFrom(C5151i iVar) throws C5119a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static SessionData parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static SessionData parseFrom(byte[] bArr) throws C5119a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionData parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static SessionData parseFrom(InputStream inputStream) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionData parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SessionData parseFrom(C5172j jVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SessionData parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class UserSession extends GeneratedMessageLite<UserSession, C4194a> implements C4207m {
        /* access modifiers changed from: private */
        public static final UserSession DEFAULT_INSTANCE;
        private static volatile C5251y0<UserSession> PARSER = null;
        public static final int SESSIONDATAITEMS_FIELD_NUMBER = 3;
        public static final int SUBTYPE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private C5252z.C5263j<SessionData> sessionDataItems_ = GeneratedMessageLite.emptyProtobufList();
        private int subType_;
        private int type_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession$a */
        public static final class C4194a extends GeneratedMessageLite.C5108a<UserSession, C4194a> implements C4207m {
            public C4194a() {
                super(UserSession.DEFAULT_INSTANCE);
            }
        }

        static {
            UserSession userSession = new UserSession();
            DEFAULT_INSTANCE = userSession;
            GeneratedMessageLite.registerDefaultInstance(UserSession.class, userSession);
        }

        private UserSession() {
        }

        /* access modifiers changed from: private */
        public void addAllSessionDataItems(Iterable<? extends SessionData> iterable) {
            ensureSessionDataItemsIsMutable();
            C5116a.addAll(iterable, this.sessionDataItems_);
        }

        /* access modifiers changed from: private */
        public void addSessionDataItems(SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(sessionData);
        }

        /* access modifiers changed from: private */
        public void clearSessionDataItems() {
            this.sessionDataItems_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSubType() {
            this.bitField0_ &= -3;
            this.subType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureSessionDataItemsIsMutable() {
            C5252z.C5263j<SessionData> jVar = this.sessionDataItems_;
            if (!jVar.mo25843d()) {
                this.sessionDataItems_ = GeneratedMessageLite.mutableCopy(jVar);
            }
        }

        public static UserSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4194a newBuilder() {
            return (C4194a) DEFAULT_INSTANCE.createBuilder();
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5251y0<UserSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeSessionDataItems(int i) {
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setSessionDataItems(int i, SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.set(i, sessionData);
        }

        /* access modifiers changed from: private */
        public void setSubType(C4204j jVar) {
            this.subType_ = jVar.mo24088a();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setSubTypeValue(int i) {
            this.bitField0_ |= 2;
            this.subType_ = i;
        }

        /* access modifiers changed from: private */
        public void setType(C4205k kVar) {
            this.type_ = kVar.mo24088a();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"bitField0_", "type_", "subType_", "sessionDataItems_", SessionData.class});
                case 3:
                    return new UserSession();
                case 4:
                    return new C4194a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5251y0<UserSession> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (UserSession.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public SessionData getSessionDataItems(int i) {
            return this.sessionDataItems_.get(i);
        }

        public int getSessionDataItemsCount() {
            return this.sessionDataItems_.size();
        }

        public List<SessionData> getSessionDataItemsList() {
            return this.sessionDataItems_;
        }

        public C4203i getSessionDataItemsOrBuilder(int i) {
            return this.sessionDataItems_.get(i);
        }

        public List<? extends C4203i> getSessionDataItemsOrBuilderList() {
            return this.sessionDataItems_;
        }

        public C4204j getSubType() {
            C4204j a = C4204j.m13362a(this.subType_);
            return a == null ? C4204j.UNRECOGNIZED : a;
        }

        public int getSubTypeValue() {
            return this.subType_;
        }

        public C4205k getType() {
            C4205k a = C4205k.m13364a(this.type_);
            return a == null ? C4205k.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasSubType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4194a newBuilder(UserSession userSession) {
            return (C4194a) DEFAULT_INSTANCE.createBuilder(userSession);
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static UserSession parseFrom(C5151i iVar) throws C5119a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        /* access modifiers changed from: private */
        public void addSessionDataItems(int i, SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(i, sessionData);
        }

        public static UserSession parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static UserSession parseFrom(byte[] bArr) throws C5119a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserSession parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static UserSession parseFrom(InputStream inputStream) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserSession parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static UserSession parseFrom(C5172j jVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static UserSession parseFrom(C5172j jVar, C5205q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$a */
    public class C4195a implements C5252z.C5260h.C5261a<Integer, C4205k> {
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b */
    public static final class C4196b extends GeneratedMessageLite.C5108a<TokenParametersOuterClass$TokenParameters, C4196b> implements C5211r0 {
        public C4196b() {
            super(TokenParametersOuterClass$TokenParameters.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$c */
    public interface C4197c extends C5211r0 {
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$d */
    public enum C4198d implements C5252z.C5255c {
        NATIVE(0),
        UNITY3D(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10354a;

        /* access modifiers changed from: public */
        C4198d(int i) {
            this.f10354a = i;
        }

        /* renamed from: a */
        public final int mo24088a() {
            if (this != UNRECOGNIZED) {
                return this.f10354a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$e */
    public interface C4199e extends C5211r0 {
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$f */
    public interface C4200f extends C5211r0 {
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$g */
    public interface C4201g extends C5211r0 {
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$i */
    public interface C4203i extends C5211r0 {
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$m */
    public interface C4207m extends C5211r0 {
    }

    static {
        TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = new TokenParametersOuterClass$TokenParameters();
        DEFAULT_INSTANCE = tokenParametersOuterClass$TokenParameters;
        GeneratedMessageLite.registerDefaultInstance(TokenParametersOuterClass$TokenParameters.class, tokenParametersOuterClass$TokenParameters);
    }

    private TokenParametersOuterClass$TokenParameters() {
    }

    /* access modifiers changed from: private */
    public void addAbExperiments(Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(experiment);
    }

    /* access modifiers changed from: private */
    public void addAllAbExperiments(Iterable<? extends Experiment> iterable) {
        ensureAbExperimentsIsMutable();
        C5116a.addAll(iterable, this.abExperiments_);
    }

    /* access modifiers changed from: private */
    public void addAllLastAdomains(Iterable<? extends LastAdomain> iterable) {
        ensureLastAdomainsIsMutable();
        C5116a.addAll(iterable, this.lastAdomains_);
    }

    /* access modifiers changed from: private */
    public void addAllLastAdvertisedBundles(Iterable<? extends LastAdvertisedBundle> iterable) {
        ensureLastAdvertisedBundlesIsMutable();
        C5116a.addAll(iterable, this.lastAdvertisedBundles_);
    }

    /* access modifiers changed from: private */
    public void addAllPriorClickTypes(Iterable<? extends PriorVideoClickType> iterable) {
        ensurePriorClickTypesIsMutable();
        C5116a.addAll(iterable, this.priorClickTypes_);
    }

    /* access modifiers changed from: private */
    public void addAllPriorClicks(Iterable<? extends C4205k> iterable) {
        ensurePriorClicksIsMutable();
        for (C4205k a : iterable) {
            ((C5250y) this.priorClicks_).mo26305c(a.mo24088a());
        }
    }

    /* access modifiers changed from: private */
    public void addAllPriorClicksValue(Iterable<Integer> iterable) {
        ensurePriorClicksIsMutable();
        for (Integer intValue : iterable) {
            ((C5250y) this.priorClicks_).mo26305c(intValue.intValue());
        }
    }

    /* access modifiers changed from: private */
    public void addAllUserSessions(Iterable<? extends UserSession> iterable) {
        ensureUserSessionsIsMutable();
        C5116a.addAll(iterable, this.userSessions_);
    }

    /* access modifiers changed from: private */
    public void addLastAdomains(LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(lastAdomain);
    }

    /* access modifiers changed from: private */
    public void addLastAdvertisedBundles(LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(lastAdvertisedBundle);
    }

    /* access modifiers changed from: private */
    public void addPriorClickTypes(PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(priorVideoClickType);
    }

    /* access modifiers changed from: private */
    public void addPriorClicks(C4205k kVar) {
        kVar.getClass();
        ensurePriorClicksIsMutable();
        ((C5250y) this.priorClicks_).mo26305c(kVar.mo24088a());
    }

    /* access modifiers changed from: private */
    public void addPriorClicksValue(int i) {
        ensurePriorClicksIsMutable();
        ((C5250y) this.priorClicks_).mo26305c(i);
    }

    /* access modifiers changed from: private */
    public void addUserSessions(UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(userSession);
    }

    /* access modifiers changed from: private */
    public void clearAaid() {
        this.aaid_ = null;
        this.bitField0_ &= -8193;
    }

    /* access modifiers changed from: private */
    public void clearAbExperiments() {
        this.abExperiments_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearAirplaneMode() {
        this.airplaneMode_ = null;
        this.bitField0_ &= -513;
    }

    /* access modifiers changed from: private */
    public void clearAmazonId() {
        this.amazonId_ = null;
        this.bitField0_ &= -4097;
    }

    /* access modifiers changed from: private */
    public void clearAppBuildVersion() {
        this.appBuildVersion_ = null;
        this.bitField0_ &= -16385;
    }

    /* access modifiers changed from: private */
    public void clearAppVersion() {
        this.appVersion_ = null;
    }

    /* access modifiers changed from: private */
    public void clearBatteryCharging() {
        this.batteryCharging_ = null;
    }

    /* access modifiers changed from: private */
    public void clearBatteryLevel() {
        this.batteryLevel_ = null;
    }

    /* access modifiers changed from: private */
    public void clearBluetoothPlugged() {
        this.bluetoothPlugged_ = null;
        this.bitField0_ &= -129;
    }

    /* access modifiers changed from: private */
    public void clearBundleID() {
        this.bundleID_ = null;
    }

    /* access modifiers changed from: private */
    public void clearCarrierName() {
        this.carrierName_ = null;
    }

    /* access modifiers changed from: private */
    public void clearCcpaString() {
        this.ccpaString_ = null;
    }

    /* access modifiers changed from: private */
    public void clearCountryCode() {
        this.countryCode_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDarkMode() {
        this.darkMode_ = false;
    }

    /* access modifiers changed from: private */
    public void clearDeviceApi() {
        this.deviceApi_ = null;
        this.bitField0_ &= -2;
    }

    /* access modifiers changed from: private */
    public void clearDeviceHeight() {
        this.deviceHeight_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDeviceLanguage() {
        this.deviceLanguage_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDeviceModel() {
        this.deviceModel_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDeviceOS() {
        this.deviceOS_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDeviceWidth() {
        this.deviceWidth_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDndMode() {
        this.dndMode_ = null;
        this.bitField0_ &= -1025;
    }

    /* access modifiers changed from: private */
    public void clearDnt() {
        this.bitField0_ &= -17;
        this.dnt_ = false;
    }

    /* access modifiers changed from: private */
    public void clearFrameworkName() {
        this.frameworkName_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearFreeSpace() {
        this.freeSpace_ = null;
    }

    /* access modifiers changed from: private */
    public void clearGdprConsent() {
        this.gdprConsent_ = null;
    }

    /* access modifiers changed from: private */
    public void clearGdprString() {
        this.gdprString_ = null;
    }

    /* access modifiers changed from: private */
    public void clearHeadsetPlugged() {
        this.headsetPlugged_ = null;
        this.bitField0_ &= -65;
    }

    /* access modifiers changed from: private */
    public void clearHorAccuracy() {
        this.horAccuracy_ = null;
    }

    /* access modifiers changed from: private */
    public void clearIdfa() {
        this.idfa_ = null;
        this.bitField0_ &= -5;
    }

    /* access modifiers changed from: private */
    public void clearIdfv() {
        this.idfv_ = null;
        this.bitField0_ &= -9;
    }

    /* access modifiers changed from: private */
    public void clearInputLanguages() {
        this.inputLanguages_ = null;
    }

    /* access modifiers changed from: private */
    public void clearIsRingMuted() {
        this.isRingMuted_ = null;
        this.bitField0_ &= -2049;
    }

    /* access modifiers changed from: private */
    public void clearKeywords() {
        this.keywords_ = null;
    }

    /* access modifiers changed from: private */
    public void clearLastAdomains() {
        this.lastAdomains_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearLastAdvertisedBundles() {
        this.lastAdvertisedBundles_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = null;
    }

    /* access modifiers changed from: private */
    public void clearLgpdConsent() {
        this.lgpdConsent_ = null;
    }

    /* access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = null;
    }

    /* access modifiers changed from: private */
    public void clearLowPowerMode() {
        this.lowPowerMode_ = null;
        this.bitField0_ &= -257;
    }

    /* access modifiers changed from: private */
    public void clearMediationType() {
        this.mediationType_ = null;
    }

    /* access modifiers changed from: private */
    public void clearMobileCountryCode() {
        this.mobileCountryCode_ = null;
    }

    /* access modifiers changed from: private */
    public void clearMobileNetworkCode() {
        this.mobileNetworkCode_ = null;
    }

    /* access modifiers changed from: private */
    public void clearMockResponseId() {
        this.mockResponseId_ = null;
        this.bitField0_ &= -65537;
    }

    /* access modifiers changed from: private */
    public void clearMuteAudio() {
        this.muteAudio_ = false;
    }

    /* access modifiers changed from: private */
    public void clearNetwork() {
        this.network_ = null;
    }

    /* access modifiers changed from: private */
    public void clearOffsetFromGMT() {
        this.offsetFromGMT_ = null;
    }

    /* access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = null;
    }

    /* access modifiers changed from: private */
    public void clearPortal() {
        this.portal_ = null;
        this.bitField0_ &= -32769;
    }

    /* access modifiers changed from: private */
    public void clearPriorClickTypes() {
        this.priorClickTypes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearPriorClicks() {
        this.priorClicks_ = GeneratedMessageLite.emptyIntList();
    }

    /* access modifiers changed from: private */
    public void clearPriorSkip() {
        this.priorSkip_ = null;
    }

    /* access modifiers changed from: private */
    public void clearPxRatio() {
        this.pxRatio_ = null;
        this.bitField0_ &= -3;
    }

    /* access modifiers changed from: private */
    public void clearSdkVersion() {
        this.sdkVersion_ = null;
    }

    /* access modifiers changed from: private */
    public void clearSecureContent() {
        this.secureContent_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearSessionDuration() {
        this.sessionDuration_ = null;
    }

    /* access modifiers changed from: private */
    public void clearTimeAccuracy() {
        this.timeAccuracy_ = null;
    }

    /* access modifiers changed from: private */
    public void clearTotalSpace() {
        this.totalSpace_ = null;
    }

    /* access modifiers changed from: private */
    public void clearTrackingStatus() {
        this.trackingStatus_ = null;
        this.bitField0_ &= -33;
    }

    /* access modifiers changed from: private */
    public void clearUserAge() {
        this.userAge_ = null;
    }

    /* access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = null;
    }

    /* access modifiers changed from: private */
    public void clearUserGender() {
        this.userGender_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearUserID() {
        this.userID_ = null;
    }

    /* access modifiers changed from: private */
    public void clearUserSessions() {
        this.userSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearVerAccuracy() {
        this.verAccuracy_ = null;
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
    }

    /* access modifiers changed from: private */
    public void clearZipCode() {
        this.zipCode_ = null;
    }

    private void ensureAbExperimentsIsMutable() {
        C5252z.C5263j<Experiment> jVar = this.abExperiments_;
        if (!jVar.mo25843d()) {
            this.abExperiments_ = GeneratedMessageLite.mutableCopy(jVar);
        }
    }

    private void ensureLastAdomainsIsMutable() {
        C5252z.C5263j<LastAdomain> jVar = this.lastAdomains_;
        if (!jVar.mo25843d()) {
            this.lastAdomains_ = GeneratedMessageLite.mutableCopy(jVar);
        }
    }

    private void ensureLastAdvertisedBundlesIsMutable() {
        C5252z.C5263j<LastAdvertisedBundle> jVar = this.lastAdvertisedBundles_;
        if (!jVar.mo25843d()) {
            this.lastAdvertisedBundles_ = GeneratedMessageLite.mutableCopy(jVar);
        }
    }

    private void ensurePriorClickTypesIsMutable() {
        C5252z.C5263j<PriorVideoClickType> jVar = this.priorClickTypes_;
        if (!jVar.mo25843d()) {
            this.priorClickTypes_ = GeneratedMessageLite.mutableCopy(jVar);
        }
    }

    private void ensurePriorClicksIsMutable() {
        C5252z.C5259g gVar = this.priorClicks_;
        if (!((C5125c) gVar).f13728a) {
            this.priorClicks_ = GeneratedMessageLite.mutableCopy(gVar);
        }
    }

    private void ensureUserSessionsIsMutable() {
        C5252z.C5263j<UserSession> jVar = this.userSessions_;
        if (!jVar.mo25843d()) {
            this.userSessions_ = GeneratedMessageLite.mutableCopy(jVar);
        }
    }

    public static TokenParametersOuterClass$TokenParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeAaid(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.aaid_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.aaid_ = nullableString;
        } else {
            NullableString.C4190a newBuilder = NullableString.newBuilder(this.aaid_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableString);
            this.aaid_ = (NullableString) newBuilder.mo25811b();
        }
        this.bitField0_ |= 8192;
    }

    /* access modifiers changed from: private */
    public void mergeAirplaneMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.airplaneMode_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.airplaneMode_ = nullableBool;
        } else {
            NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.airplaneMode_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
            this.airplaneMode_ = (NullableBool) newBuilder.mo25811b();
        }
        this.bitField0_ |= 512;
    }

    /* access modifiers changed from: private */
    public void mergeAmazonId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.amazonId_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.amazonId_ = nullableString;
        } else {
            NullableString.C4190a newBuilder = NullableString.newBuilder(this.amazonId_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableString);
            this.amazonId_ = (NullableString) newBuilder.mo25811b();
        }
        this.bitField0_ |= 4096;
    }

    /* access modifiers changed from: private */
    public void mergeAppBuildVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appBuildVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.appBuildVersion_ = nullableString;
        } else {
            NullableString.C4190a newBuilder = NullableString.newBuilder(this.appBuildVersion_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableString);
            this.appBuildVersion_ = (NullableString) newBuilder.mo25811b();
        }
        this.bitField0_ |= 16384;
    }

    /* access modifiers changed from: private */
    public void mergeAppVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.appVersion_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.appVersion_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.appVersion_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeBatteryCharging(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.batteryCharging_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.batteryCharging_ = nullableBool;
            return;
        }
        NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.batteryCharging_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
        this.batteryCharging_ = (NullableBool) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeBatteryLevel(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.batteryLevel_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.batteryLevel_ = nullableUInt32;
            return;
        }
        NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.batteryLevel_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
        this.batteryLevel_ = (NullableUInt32) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeBluetoothPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.bluetoothPlugged_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.bluetoothPlugged_ = nullableBool;
        } else {
            NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.bluetoothPlugged_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
            this.bluetoothPlugged_ = (NullableBool) newBuilder.mo25811b();
        }
        this.bitField0_ |= 128;
    }

    /* access modifiers changed from: private */
    public void mergeBundleID(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.bundleID_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.bundleID_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.bundleID_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.bundleID_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeCarrierName(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.carrierName_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.carrierName_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.carrierName_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.carrierName_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeCcpaString(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.ccpaString_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.ccpaString_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.ccpaString_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.ccpaString_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeCountryCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.countryCode_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.countryCode_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.countryCode_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.countryCode_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeDeviceApi(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceApi_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.deviceApi_ = nullableUInt32;
        } else {
            NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.deviceApi_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
            this.deviceApi_ = (NullableUInt32) newBuilder.mo25811b();
        }
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void mergeDeviceHeight(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceHeight_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.deviceHeight_ = nullableUInt32;
            return;
        }
        NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.deviceHeight_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
        this.deviceHeight_ = (NullableUInt32) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeDeviceLanguage(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceLanguage_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.deviceLanguage_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.deviceLanguage_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.deviceLanguage_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeDeviceModel(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceModel_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.deviceModel_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.deviceModel_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.deviceModel_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeDeviceOS(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceOS_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.deviceOS_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.deviceOS_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.deviceOS_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeDeviceWidth(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceWidth_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.deviceWidth_ = nullableUInt32;
            return;
        }
        NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.deviceWidth_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
        this.deviceWidth_ = (NullableUInt32) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeDndMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.dndMode_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.dndMode_ = nullableBool;
        } else {
            NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.dndMode_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
            this.dndMode_ = (NullableBool) newBuilder.mo25811b();
        }
        this.bitField0_ |= 1024;
    }

    /* access modifiers changed from: private */
    public void mergeFreeSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.freeSpace_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.freeSpace_ = nullableUInt32;
            return;
        }
        NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.freeSpace_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
        this.freeSpace_ = (NullableUInt32) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeGdprConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.gdprConsent_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.gdprConsent_ = nullableBool;
            return;
        }
        NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.gdprConsent_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
        this.gdprConsent_ = (NullableBool) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeGdprString(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.gdprString_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.gdprString_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.gdprString_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.gdprString_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeHeadsetPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.headsetPlugged_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.headsetPlugged_ = nullableBool;
        } else {
            NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.headsetPlugged_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
            this.headsetPlugged_ = (NullableBool) newBuilder.mo25811b();
        }
        this.bitField0_ |= 64;
    }

    /* access modifiers changed from: private */
    public void mergeHorAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.horAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.horAccuracy_ = nullableFloat;
            return;
        }
        NullableFloat.C4188a newBuilder = NullableFloat.newBuilder(this.horAccuracy_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableFloat);
        this.horAccuracy_ = (NullableFloat) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeIdfa(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.idfa_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.idfa_ = nullableString;
        } else {
            NullableString.C4190a newBuilder = NullableString.newBuilder(this.idfa_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableString);
            this.idfa_ = (NullableString) newBuilder.mo25811b();
        }
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void mergeIdfv(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.idfv_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.idfv_ = nullableString;
        } else {
            NullableString.C4190a newBuilder = NullableString.newBuilder(this.idfv_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableString);
            this.idfv_ = (NullableString) newBuilder.mo25811b();
        }
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void mergeInputLanguages(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.inputLanguages_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.inputLanguages_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.inputLanguages_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.inputLanguages_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeIsRingMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.isRingMuted_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.isRingMuted_ = nullableBool;
        } else {
            NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.isRingMuted_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
            this.isRingMuted_ = (NullableBool) newBuilder.mo25811b();
        }
        this.bitField0_ |= 2048;
    }

    /* access modifiers changed from: private */
    public void mergeKeywords(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.keywords_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.keywords_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.keywords_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.keywords_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeLatitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.latitude_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.latitude_ = nullableFloat;
            return;
        }
        NullableFloat.C4188a newBuilder = NullableFloat.newBuilder(this.latitude_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableFloat);
        this.latitude_ = (NullableFloat) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeLgpdConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.lgpdConsent_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.lgpdConsent_ = nullableBool;
            return;
        }
        NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.lgpdConsent_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
        this.lgpdConsent_ = (NullableBool) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeLongitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.longitude_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.longitude_ = nullableFloat;
            return;
        }
        NullableFloat.C4188a newBuilder = NullableFloat.newBuilder(this.longitude_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableFloat);
        this.longitude_ = (NullableFloat) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeLowPowerMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.lowPowerMode_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.lowPowerMode_ = nullableBool;
        } else {
            NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.lowPowerMode_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
            this.lowPowerMode_ = (NullableBool) newBuilder.mo25811b();
        }
        this.bitField0_ |= 256;
    }

    /* access modifiers changed from: private */
    public void mergeMediationType(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mediationType_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.mediationType_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.mediationType_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.mediationType_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeMobileCountryCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mobileCountryCode_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.mobileCountryCode_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.mobileCountryCode_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.mobileCountryCode_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeMobileNetworkCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mobileNetworkCode_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.mobileNetworkCode_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.mobileNetworkCode_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.mobileNetworkCode_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeMockResponseId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mockResponseId_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.mockResponseId_ = nullableString;
        } else {
            NullableString.C4190a newBuilder = NullableString.newBuilder(this.mockResponseId_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableString);
            this.mockResponseId_ = (NullableString) newBuilder.mo25811b();
        }
        this.bitField0_ |= 65536;
    }

    /* access modifiers changed from: private */
    public void mergeNetwork(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.network_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.network_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.network_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.network_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeOffsetFromGMT(NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        NullableSInt32 nullableSInt322 = this.offsetFromGMT_;
        if (nullableSInt322 == null || nullableSInt322 == NullableSInt32.getDefaultInstance()) {
            this.offsetFromGMT_ = nullableSInt32;
            return;
        }
        NullableSInt32.C4189a newBuilder = NullableSInt32.newBuilder(this.offsetFromGMT_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableSInt32);
        this.offsetFromGMT_ = (NullableSInt32) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeOsVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.osVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.osVersion_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.osVersion_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.osVersion_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergePortal(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.portal_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.portal_ = nullableUInt32;
        } else {
            NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.portal_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
            this.portal_ = (NullableUInt32) newBuilder.mo25811b();
        }
        this.bitField0_ |= 32768;
    }

    /* access modifiers changed from: private */
    public void mergePriorSkip(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.priorSkip_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.priorSkip_ = nullableBool;
            return;
        }
        NullableBool.C4187a newBuilder = NullableBool.newBuilder(this.priorSkip_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableBool);
        this.priorSkip_ = (NullableBool) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergePxRatio(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.pxRatio_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.pxRatio_ = nullableFloat;
        } else {
            NullableFloat.C4188a newBuilder = NullableFloat.newBuilder(this.pxRatio_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableFloat);
            this.pxRatio_ = (NullableFloat) newBuilder.mo25811b();
        }
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void mergeSdkVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.sdkVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.sdkVersion_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.sdkVersion_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.sdkVersion_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeSessionDuration(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.sessionDuration_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.sessionDuration_ = nullableUInt32;
            return;
        }
        NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.sessionDuration_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
        this.sessionDuration_ = (NullableUInt32) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeTimeAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.timeAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.timeAccuracy_ = nullableFloat;
            return;
        }
        NullableFloat.C4188a newBuilder = NullableFloat.newBuilder(this.timeAccuracy_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableFloat);
        this.timeAccuracy_ = (NullableFloat) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeTotalSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.totalSpace_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.totalSpace_ = nullableUInt32;
            return;
        }
        NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.totalSpace_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
        this.totalSpace_ = (NullableUInt32) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeTrackingStatus(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.trackingStatus_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.trackingStatus_ = nullableUInt32;
        } else {
            NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.trackingStatus_);
            newBuilder.mo25812c();
            newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
            this.trackingStatus_ = (NullableUInt32) newBuilder.mo25811b();
        }
        this.bitField0_ |= 32;
    }

    /* access modifiers changed from: private */
    public void mergeUserAge(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.userAge_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.userAge_ = nullableUInt32;
            return;
        }
        NullableUInt32.C4191a newBuilder = NullableUInt32.newBuilder(this.userAge_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableUInt32);
        this.userAge_ = (NullableUInt32) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeUserAgent(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.userAgent_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.userAgent_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.userAgent_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.userAgent_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeUserID(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.userID_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.userID_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.userID_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.userID_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeVerAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.verAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.verAccuracy_ = nullableFloat;
            return;
        }
        NullableFloat.C4188a newBuilder = NullableFloat.newBuilder(this.verAccuracy_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableFloat);
        this.verAccuracy_ = (NullableFloat) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.version_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.version_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.version_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.version_ = (NullableString) newBuilder.mo25811b();
    }

    /* access modifiers changed from: private */
    public void mergeZipCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.zipCode_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.zipCode_ = nullableString;
            return;
        }
        NullableString.C4190a newBuilder = NullableString.newBuilder(this.zipCode_);
        newBuilder.mo25812c();
        newBuilder.mo25810a(newBuilder.f13688b, nullableString);
        this.zipCode_ = (NullableString) newBuilder.mo25811b();
    }

    public static C4196b newBuilder() {
        return (C4196b) DEFAULT_INSTANCE.createBuilder();
    }

    public static TokenParametersOuterClass$TokenParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(ByteBuffer byteBuffer) throws C5119a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C5251y0<TokenParametersOuterClass$TokenParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeAbExperiments(int i) {
        ensureAbExperimentsIsMutable();
        this.abExperiments_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeLastAdomains(int i) {
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeLastAdvertisedBundles(int i) {
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removePriorClickTypes(int i) {
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeUserSessions(int i) {
        ensureUserSessionsIsMutable();
        this.userSessions_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAaid(NullableString nullableString) {
        nullableString.getClass();
        this.aaid_ = nullableString;
        this.bitField0_ |= 8192;
    }

    /* access modifiers changed from: private */
    public void setAbExperiments(int i, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.set(i, experiment);
    }

    /* access modifiers changed from: private */
    public void setAirplaneMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.airplaneMode_ = nullableBool;
        this.bitField0_ |= 512;
    }

    /* access modifiers changed from: private */
    public void setAmazonId(NullableString nullableString) {
        nullableString.getClass();
        this.amazonId_ = nullableString;
        this.bitField0_ |= 4096;
    }

    /* access modifiers changed from: private */
    public void setAppBuildVersion(NullableString nullableString) {
        nullableString.getClass();
        this.appBuildVersion_ = nullableString;
        this.bitField0_ |= 16384;
    }

    /* access modifiers changed from: private */
    public void setAppVersion(NullableString nullableString) {
        nullableString.getClass();
        this.appVersion_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setBatteryCharging(NullableBool nullableBool) {
        nullableBool.getClass();
        this.batteryCharging_ = nullableBool;
    }

    /* access modifiers changed from: private */
    public void setBatteryLevel(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.batteryLevel_ = nullableUInt32;
    }

    /* access modifiers changed from: private */
    public void setBluetoothPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        this.bluetoothPlugged_ = nullableBool;
        this.bitField0_ |= 128;
    }

    /* access modifiers changed from: private */
    public void setBundleID(NullableString nullableString) {
        nullableString.getClass();
        this.bundleID_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setCarrierName(NullableString nullableString) {
        nullableString.getClass();
        this.carrierName_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setCcpaString(NullableString nullableString) {
        nullableString.getClass();
        this.ccpaString_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setCountryCode(NullableString nullableString) {
        nullableString.getClass();
        this.countryCode_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setDarkMode(boolean z) {
        this.darkMode_ = z;
    }

    /* access modifiers changed from: private */
    public void setDeviceApi(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceApi_ = nullableUInt32;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void setDeviceHeight(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceHeight_ = nullableUInt32;
    }

    /* access modifiers changed from: private */
    public void setDeviceLanguage(NullableString nullableString) {
        nullableString.getClass();
        this.deviceLanguage_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setDeviceModel(NullableString nullableString) {
        nullableString.getClass();
        this.deviceModel_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setDeviceOS(NullableString nullableString) {
        nullableString.getClass();
        this.deviceOS_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setDeviceWidth(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceWidth_ = nullableUInt32;
    }

    /* access modifiers changed from: private */
    public void setDndMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.dndMode_ = nullableBool;
        this.bitField0_ |= 1024;
    }

    /* access modifiers changed from: private */
    public void setDnt(boolean z) {
        this.bitField0_ |= 16;
        this.dnt_ = z;
    }

    /* access modifiers changed from: private */
    public void setFrameworkName(C4198d dVar) {
        this.frameworkName_ = dVar.mo24088a();
    }

    /* access modifiers changed from: private */
    public void setFrameworkNameValue(int i) {
        this.frameworkName_ = i;
    }

    /* access modifiers changed from: private */
    public void setFreeSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.freeSpace_ = nullableUInt32;
    }

    /* access modifiers changed from: private */
    public void setGdprConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        this.gdprConsent_ = nullableBool;
    }

    /* access modifiers changed from: private */
    public void setGdprString(NullableString nullableString) {
        nullableString.getClass();
        this.gdprString_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setHeadsetPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        this.headsetPlugged_ = nullableBool;
        this.bitField0_ |= 64;
    }

    /* access modifiers changed from: private */
    public void setHorAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.horAccuracy_ = nullableFloat;
    }

    /* access modifiers changed from: private */
    public void setIdfa(NullableString nullableString) {
        nullableString.getClass();
        this.idfa_ = nullableString;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void setIdfv(NullableString nullableString) {
        nullableString.getClass();
        this.idfv_ = nullableString;
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void setInputLanguages(NullableString nullableString) {
        nullableString.getClass();
        this.inputLanguages_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setIsRingMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        this.isRingMuted_ = nullableBool;
        this.bitField0_ |= 2048;
    }

    /* access modifiers changed from: private */
    public void setKeywords(NullableString nullableString) {
        nullableString.getClass();
        this.keywords_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setLastAdomains(int i, LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.set(i, lastAdomain);
    }

    /* access modifiers changed from: private */
    public void setLastAdvertisedBundles(int i, LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.set(i, lastAdvertisedBundle);
    }

    /* access modifiers changed from: private */
    public void setLatitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.latitude_ = nullableFloat;
    }

    /* access modifiers changed from: private */
    public void setLgpdConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        this.lgpdConsent_ = nullableBool;
    }

    /* access modifiers changed from: private */
    public void setLongitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.longitude_ = nullableFloat;
    }

    /* access modifiers changed from: private */
    public void setLowPowerMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.lowPowerMode_ = nullableBool;
        this.bitField0_ |= 256;
    }

    /* access modifiers changed from: private */
    public void setMediationType(NullableString nullableString) {
        nullableString.getClass();
        this.mediationType_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setMobileCountryCode(NullableString nullableString) {
        nullableString.getClass();
        this.mobileCountryCode_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setMobileNetworkCode(NullableString nullableString) {
        nullableString.getClass();
        this.mobileNetworkCode_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setMockResponseId(NullableString nullableString) {
        nullableString.getClass();
        this.mockResponseId_ = nullableString;
        this.bitField0_ |= 65536;
    }

    /* access modifiers changed from: private */
    public void setMuteAudio(boolean z) {
        this.muteAudio_ = z;
    }

    /* access modifiers changed from: private */
    public void setNetwork(NullableString nullableString) {
        nullableString.getClass();
        this.network_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setOffsetFromGMT(NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        this.offsetFromGMT_ = nullableSInt32;
    }

    /* access modifiers changed from: private */
    public void setOsVersion(NullableString nullableString) {
        nullableString.getClass();
        this.osVersion_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setPortal(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.portal_ = nullableUInt32;
        this.bitField0_ |= 32768;
    }

    /* access modifiers changed from: private */
    public void setPriorClickTypes(int i, PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.set(i, priorVideoClickType);
    }

    /* access modifiers changed from: private */
    public void setPriorClicks(int i, C4205k kVar) {
        kVar.getClass();
        ensurePriorClicksIsMutable();
        C5252z.C5259g gVar = this.priorClicks_;
        int a = kVar.mo24088a();
        C5250y yVar = (C5250y) gVar;
        yVar.mo25844e();
        yVar.mo26307d(i);
        int[] iArr = yVar.f13961b;
        int i2 = iArr[i];
        iArr[i] = a;
    }

    /* access modifiers changed from: private */
    public void setPriorClicksValue(int i, int i2) {
        ensurePriorClicksIsMutable();
        C5250y yVar = (C5250y) this.priorClicks_;
        yVar.mo25844e();
        yVar.mo26307d(i);
        int[] iArr = yVar.f13961b;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    /* access modifiers changed from: private */
    public void setPriorSkip(NullableBool nullableBool) {
        nullableBool.getClass();
        this.priorSkip_ = nullableBool;
    }

    /* access modifiers changed from: private */
    public void setPxRatio(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.pxRatio_ = nullableFloat;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void setSdkVersion(NullableString nullableString) {
        nullableString.getClass();
        this.sdkVersion_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setSecureContent(C4202h hVar) {
        this.secureContent_ = hVar.mo24088a();
    }

    /* access modifiers changed from: private */
    public void setSecureContentValue(int i) {
        this.secureContent_ = i;
    }

    /* access modifiers changed from: private */
    public void setSessionDuration(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.sessionDuration_ = nullableUInt32;
    }

    /* access modifiers changed from: private */
    public void setTimeAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.timeAccuracy_ = nullableFloat;
    }

    /* access modifiers changed from: private */
    public void setTotalSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.totalSpace_ = nullableUInt32;
    }

    /* access modifiers changed from: private */
    public void setTrackingStatus(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.trackingStatus_ = nullableUInt32;
        this.bitField0_ |= 32;
    }

    /* access modifiers changed from: private */
    public void setUserAge(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.userAge_ = nullableUInt32;
    }

    /* access modifiers changed from: private */
    public void setUserAgent(NullableString nullableString) {
        nullableString.getClass();
        this.userAgent_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setUserGender(C4206l lVar) {
        this.userGender_ = lVar.mo24088a();
    }

    /* access modifiers changed from: private */
    public void setUserGenderValue(int i) {
        this.userGender_ = i;
    }

    /* access modifiers changed from: private */
    public void setUserID(NullableString nullableString) {
        nullableString.getClass();
        this.userID_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setUserSessions(int i, UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.set(i, userSession);
    }

    /* access modifiers changed from: private */
    public void setVerAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.verAccuracy_ = nullableFloat;
    }

    /* access modifiers changed from: private */
    public void setVersion(NullableString nullableString) {
        nullableString.getClass();
        this.version_ = nullableString;
    }

    /* access modifiers changed from: private */
    public void setZipCode(NullableString nullableString) {
        nullableString.getClass();
        this.zipCode_ = nullableString;
    }

    public final Object dynamicMethod(GeneratedMessageLite.C5112e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000B\u0000\u0001\u0001BB\u0000\u0006\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\bဉ\u0000\t\t\n\t\u000bဉ\u0001\f\t\r\t\u000e\t\u000f\f\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016ဉ\u0002\u0017ဉ\u0003\u0018ဇ\u0004\u0019\t\u001a\t\u001b\t\u001c\t\u001dဉ\u0005\u001e\t\u001f\t \u0007!\t\"\f#\t$\t%\t&\t'\t(\t)\t*\f+\t,\t-ဉ\u0006.ဉ\u0007/\t0ဉ\b1\u00072ဉ\t3ဉ\n4ဉ\u000b5ဉ\f6ဉ\r7ဉ\u000e8\t9\u001b:\u001b;,<\t=\u001b>\u001b?\u001b@ဉ\u000fAဉ\u0010B\t", new Object[]{"bitField0_", "version_", "userAgent_", "sdkVersion_", "bundleID_", "deviceModel_", "appVersion_", "deviceOS_", "deviceApi_", "osVersion_", "deviceLanguage_", "pxRatio_", "deviceWidth_", "deviceHeight_", "mediationType_", "frameworkName_", "totalSpace_", "countryCode_", "carrierName_", "mobileCountryCode_", "mobileNetworkCode_", "inputLanguages_", "idfa_", "idfv_", "dnt_", "gdprConsent_", "gdprString_", "ccpaString_", "offsetFromGMT_", "trackingStatus_", "userID_", "network_", "muteAudio_", "userAge_", "userGender_", "zipCode_", "keywords_", "latitude_", "longitude_", "horAccuracy_", "verAccuracy_", "timeAccuracy_", "secureContent_", "batteryCharging_", "batteryLevel_", "headsetPlugged_", "bluetoothPlugged_", "freeSpace_", "lowPowerMode_", "darkMode_", "airplaneMode_", "dndMode_", "isRingMuted_", "amazonId_", "aaid_", "appBuildVersion_", "sessionDuration_", "lastAdomains_", LastAdomain.class, "lastAdvertisedBundles_", LastAdvertisedBundle.class, "priorClicks_", "priorSkip_", "priorClickTypes_", PriorVideoClickType.class, "userSessions_", UserSession.class, "abExperiments_", Experiment.class, "portal_", "mockResponseId_", "lgpdConsent_"});
            case 3:
                return new TokenParametersOuterClass$TokenParameters();
            case 4:
                return new C4196b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C5251y0<TokenParametersOuterClass$TokenParameters> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (TokenParametersOuterClass$TokenParameters.class) {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new GeneratedMessageLite.C5109b<>(DEFAULT_INSTANCE);
                            PARSER = y0Var;
                        }
                    }
                }
                return y0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public NullableString getAaid() {
        NullableString nullableString = this.aaid_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public Experiment getAbExperiments(int i) {
        return this.abExperiments_.get(i);
    }

    public int getAbExperimentsCount() {
        return this.abExperiments_.size();
    }

    public List<Experiment> getAbExperimentsList() {
        return this.abExperiments_;
    }

    public C4197c getAbExperimentsOrBuilder(int i) {
        return this.abExperiments_.get(i);
    }

    public List<? extends C4197c> getAbExperimentsOrBuilderList() {
        return this.abExperiments_;
    }

    public NullableBool getAirplaneMode() {
        NullableBool nullableBool = this.airplaneMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getAmazonId() {
        NullableString nullableString = this.amazonId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppBuildVersion() {
        NullableString nullableString = this.appBuildVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppVersion() {
        NullableString nullableString = this.appVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getBatteryCharging() {
        NullableBool nullableBool = this.batteryCharging_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableUInt32 getBatteryLevel() {
        NullableUInt32 nullableUInt32 = this.batteryLevel_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getBluetoothPlugged() {
        NullableBool nullableBool = this.bluetoothPlugged_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getBundleID() {
        NullableString nullableString = this.bundleID_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCarrierName() {
        NullableString nullableString = this.carrierName_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCcpaString() {
        NullableString nullableString = this.ccpaString_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCountryCode() {
        NullableString nullableString = this.countryCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getDarkMode() {
        return this.darkMode_;
    }

    public NullableUInt32 getDeviceApi() {
        NullableUInt32 nullableUInt32 = this.deviceApi_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getDeviceHeight() {
        NullableUInt32 nullableUInt32 = this.deviceHeight_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableString getDeviceLanguage() {
        NullableString nullableString = this.deviceLanguage_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getDeviceModel() {
        NullableString nullableString = this.deviceModel_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getDeviceOS() {
        NullableString nullableString = this.deviceOS_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableUInt32 getDeviceWidth() {
        NullableUInt32 nullableUInt32 = this.deviceWidth_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getDndMode() {
        NullableBool nullableBool = this.dndMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public boolean getDnt() {
        return this.dnt_;
    }

    public C4198d getFrameworkName() {
        C4198d dVar;
        int i = this.frameworkName_;
        if (i == 0) {
            dVar = C4198d.NATIVE;
        } else if (i != 1) {
            dVar = null;
        } else {
            dVar = C4198d.UNITY3D;
        }
        return dVar == null ? C4198d.UNRECOGNIZED : dVar;
    }

    public int getFrameworkNameValue() {
        return this.frameworkName_;
    }

    public NullableUInt32 getFreeSpace() {
        NullableUInt32 nullableUInt32 = this.freeSpace_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getGdprConsent() {
        NullableBool nullableBool = this.gdprConsent_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getGdprString() {
        NullableString nullableString = this.gdprString_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getHeadsetPlugged() {
        NullableBool nullableBool = this.headsetPlugged_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getHorAccuracy() {
        NullableFloat nullableFloat = this.horAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getIdfa() {
        NullableString nullableString = this.idfa_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getIdfv() {
        NullableString nullableString = this.idfv_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getInputLanguages() {
        NullableString nullableString = this.inputLanguages_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getIsRingMuted() {
        NullableBool nullableBool = this.isRingMuted_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getKeywords() {
        NullableString nullableString = this.keywords_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public LastAdomain getLastAdomains(int i) {
        return this.lastAdomains_.get(i);
    }

    public int getLastAdomainsCount() {
        return this.lastAdomains_.size();
    }

    public List<LastAdomain> getLastAdomainsList() {
        return this.lastAdomains_;
    }

    public C4199e getLastAdomainsOrBuilder(int i) {
        return this.lastAdomains_.get(i);
    }

    public List<? extends C4199e> getLastAdomainsOrBuilderList() {
        return this.lastAdomains_;
    }

    public LastAdvertisedBundle getLastAdvertisedBundles(int i) {
        return this.lastAdvertisedBundles_.get(i);
    }

    public int getLastAdvertisedBundlesCount() {
        return this.lastAdvertisedBundles_.size();
    }

    public List<LastAdvertisedBundle> getLastAdvertisedBundlesList() {
        return this.lastAdvertisedBundles_;
    }

    public C4200f getLastAdvertisedBundlesOrBuilder(int i) {
        return this.lastAdvertisedBundles_.get(i);
    }

    public List<? extends C4200f> getLastAdvertisedBundlesOrBuilderList() {
        return this.lastAdvertisedBundles_;
    }

    public NullableFloat getLatitude() {
        NullableFloat nullableFloat = this.latitude_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableBool getLgpdConsent() {
        NullableBool nullableBool = this.lgpdConsent_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getLongitude() {
        NullableFloat nullableFloat = this.longitude_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableBool getLowPowerMode() {
        NullableBool nullableBool = this.lowPowerMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getMediationType() {
        NullableString nullableString = this.mediationType_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMobileCountryCode() {
        NullableString nullableString = this.mobileCountryCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMobileNetworkCode() {
        NullableString nullableString = this.mobileNetworkCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMockResponseId() {
        NullableString nullableString = this.mockResponseId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getMuteAudio() {
        return this.muteAudio_;
    }

    public NullableString getNetwork() {
        NullableString nullableString = this.network_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableSInt32 getOffsetFromGMT() {
        NullableSInt32 nullableSInt32 = this.offsetFromGMT_;
        return nullableSInt32 == null ? NullableSInt32.getDefaultInstance() : nullableSInt32;
    }

    public NullableString getOsVersion() {
        NullableString nullableString = this.osVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableUInt32 getPortal() {
        NullableUInt32 nullableUInt32 = this.portal_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public PriorVideoClickType getPriorClickTypes(int i) {
        return this.priorClickTypes_.get(i);
    }

    public int getPriorClickTypesCount() {
        return this.priorClickTypes_.size();
    }

    public List<PriorVideoClickType> getPriorClickTypesList() {
        return this.priorClickTypes_;
    }

    public C4201g getPriorClickTypesOrBuilder(int i) {
        return this.priorClickTypes_.get(i);
    }

    public List<? extends C4201g> getPriorClickTypesOrBuilderList() {
        return this.priorClickTypes_;
    }

    public C4205k getPriorClicks(int i) {
        C5252z.C5260h.C5261a<Integer, C4205k> aVar = priorClicks_converter_;
        C5250y yVar = (C5250y) this.priorClicks_;
        yVar.mo26307d(i);
        Integer valueOf = Integer.valueOf(yVar.f13961b[i]);
        ((C4195a) aVar).getClass();
        C4205k a = C4205k.m13364a(valueOf.intValue());
        return a == null ? C4205k.UNRECOGNIZED : a;
    }

    public int getPriorClicksCount() {
        return ((C5250y) this.priorClicks_).size();
    }

    public List<C4205k> getPriorClicksList() {
        return new C5252z.C5260h(this.priorClicks_, priorClicks_converter_);
    }

    public int getPriorClicksValue(int i) {
        C5250y yVar = (C5250y) this.priorClicks_;
        yVar.mo26307d(i);
        return yVar.f13961b[i];
    }

    public List<Integer> getPriorClicksValueList() {
        return this.priorClicks_;
    }

    public NullableBool getPriorSkip() {
        NullableBool nullableBool = this.priorSkip_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getPxRatio() {
        NullableFloat nullableFloat = this.pxRatio_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getSdkVersion() {
        NullableString nullableString = this.sdkVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public C4202h getSecureContent() {
        C4202h a = C4202h.m13360a(this.secureContent_);
        return a == null ? C4202h.UNRECOGNIZED : a;
    }

    public int getSecureContentValue() {
        return this.secureContent_;
    }

    public NullableUInt32 getSessionDuration() {
        NullableUInt32 nullableUInt32 = this.sessionDuration_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableFloat getTimeAccuracy() {
        NullableFloat nullableFloat = this.timeAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableUInt32 getTotalSpace() {
        NullableUInt32 nullableUInt32 = this.totalSpace_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getTrackingStatus() {
        NullableUInt32 nullableUInt32 = this.trackingStatus_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getUserAge() {
        NullableUInt32 nullableUInt32 = this.userAge_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableString getUserAgent() {
        NullableString nullableString = this.userAgent_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public C4206l getUserGender() {
        C4206l a = C4206l.m13366a(this.userGender_);
        return a == null ? C4206l.UNRECOGNIZED : a;
    }

    public int getUserGenderValue() {
        return this.userGender_;
    }

    public NullableString getUserID() {
        NullableString nullableString = this.userID_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public UserSession getUserSessions(int i) {
        return this.userSessions_.get(i);
    }

    public int getUserSessionsCount() {
        return this.userSessions_.size();
    }

    public List<UserSession> getUserSessionsList() {
        return this.userSessions_;
    }

    public C4207m getUserSessionsOrBuilder(int i) {
        return this.userSessions_.get(i);
    }

    public List<? extends C4207m> getUserSessionsOrBuilderList() {
        return this.userSessions_;
    }

    public NullableFloat getVerAccuracy() {
        NullableFloat nullableFloat = this.verAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getVersion() {
        NullableString nullableString = this.version_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getZipCode() {
        NullableString nullableString = this.zipCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean hasAaid() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasAirplaneMode() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAmazonId() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasAppBuildVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasAppVersion() {
        return this.appVersion_ != null;
    }

    public boolean hasBatteryCharging() {
        return this.batteryCharging_ != null;
    }

    public boolean hasBatteryLevel() {
        return this.batteryLevel_ != null;
    }

    public boolean hasBluetoothPlugged() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasBundleID() {
        return this.bundleID_ != null;
    }

    public boolean hasCarrierName() {
        return this.carrierName_ != null;
    }

    public boolean hasCcpaString() {
        return this.ccpaString_ != null;
    }

    public boolean hasCountryCode() {
        return this.countryCode_ != null;
    }

    public boolean hasDeviceApi() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeviceHeight() {
        return this.deviceHeight_ != null;
    }

    public boolean hasDeviceLanguage() {
        return this.deviceLanguage_ != null;
    }

    public boolean hasDeviceModel() {
        return this.deviceModel_ != null;
    }

    public boolean hasDeviceOS() {
        return this.deviceOS_ != null;
    }

    public boolean hasDeviceWidth() {
        return this.deviceWidth_ != null;
    }

    public boolean hasDndMode() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDnt() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFreeSpace() {
        return this.freeSpace_ != null;
    }

    public boolean hasGdprConsent() {
        return this.gdprConsent_ != null;
    }

    public boolean hasGdprString() {
        return this.gdprString_ != null;
    }

    public boolean hasHeadsetPlugged() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHorAccuracy() {
        return this.horAccuracy_ != null;
    }

    public boolean hasIdfa() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIdfv() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasInputLanguages() {
        return this.inputLanguages_ != null;
    }

    public boolean hasIsRingMuted() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasKeywords() {
        return this.keywords_ != null;
    }

    public boolean hasLatitude() {
        return this.latitude_ != null;
    }

    public boolean hasLgpdConsent() {
        return this.lgpdConsent_ != null;
    }

    public boolean hasLongitude() {
        return this.longitude_ != null;
    }

    public boolean hasLowPowerMode() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMediationType() {
        return this.mediationType_ != null;
    }

    public boolean hasMobileCountryCode() {
        return this.mobileCountryCode_ != null;
    }

    public boolean hasMobileNetworkCode() {
        return this.mobileNetworkCode_ != null;
    }

    public boolean hasMockResponseId() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasNetwork() {
        return this.network_ != null;
    }

    public boolean hasOffsetFromGMT() {
        return this.offsetFromGMT_ != null;
    }

    public boolean hasOsVersion() {
        return this.osVersion_ != null;
    }

    public boolean hasPortal() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasPriorSkip() {
        return this.priorSkip_ != null;
    }

    public boolean hasPxRatio() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSdkVersion() {
        return this.sdkVersion_ != null;
    }

    public boolean hasSessionDuration() {
        return this.sessionDuration_ != null;
    }

    public boolean hasTimeAccuracy() {
        return this.timeAccuracy_ != null;
    }

    public boolean hasTotalSpace() {
        return this.totalSpace_ != null;
    }

    public boolean hasTrackingStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserAge() {
        return this.userAge_ != null;
    }

    public boolean hasUserAgent() {
        return this.userAgent_ != null;
    }

    public boolean hasUserID() {
        return this.userID_ != null;
    }

    public boolean hasVerAccuracy() {
        return this.verAccuracy_ != null;
    }

    public boolean hasVersion() {
        return this.version_ != null;
    }

    public boolean hasZipCode() {
        return this.zipCode_ != null;
    }

    public static C4196b newBuilder(TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters) {
        return (C4196b) DEFAULT_INSTANCE.createBuilder(tokenParametersOuterClass$TokenParameters);
    }

    public static TokenParametersOuterClass$TokenParameters parseDelimitedFrom(InputStream inputStream, C5205q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(C5151i iVar) throws C5119a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    /* access modifiers changed from: private */
    public void addAbExperiments(int i, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(i, experiment);
    }

    /* access modifiers changed from: private */
    public void addLastAdomains(int i, LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(i, lastAdomain);
    }

    /* access modifiers changed from: private */
    public void addLastAdvertisedBundles(int i, LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(i, lastAdvertisedBundle);
    }

    /* access modifiers changed from: private */
    public void addPriorClickTypes(int i, PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(i, priorVideoClickType);
    }

    /* access modifiers changed from: private */
    public void addUserSessions(int i, UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(i, userSession);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(C5151i iVar, C5205q qVar) throws C5119a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr) throws C5119a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$h */
    public enum C4202h implements C5252z.C5255c {
        UNSECURE(0),
        SECURE(1),
        PARTIALLYSECURE(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10360a;

        /* access modifiers changed from: public */
        C4202h(int i) {
            this.f10360a = i;
        }

        /* renamed from: a */
        public final int mo24088a() {
            if (this != UNRECOGNIZED) {
                return this.f10360a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C4202h m13360a(int i) {
            if (i == 0) {
                return UNSECURE;
            }
            if (i == 1) {
                return SECURE;
            }
            if (i != 2) {
                return null;
            }
            return PARTIALLYSECURE;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j */
    public enum C4204j implements C5252z.C5255c {
        UNITCONTENTTYPEUNKNOWN(0),
        DISPLAY(1),
        f10363d(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10366a;

        /* access modifiers changed from: public */
        C4204j(int i) {
            this.f10366a = i;
        }

        /* renamed from: a */
        public final int mo24088a() {
            if (this != UNRECOGNIZED) {
                return this.f10366a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C4204j m13362a(int i) {
            if (i == 0) {
                return UNITCONTENTTYPEUNKNOWN;
            }
            if (i == 1) {
                return DISPLAY;
            }
            if (i != 2) {
                return null;
            }
            return f10363d;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k */
    public enum C4205k implements C5252z.C5255c {
        UNITDISPLAYTYPEUNKNOWN(0),
        BANNER(1),
        INTERSTITIAL(2),
        REWARDED(3),
        MRECT(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10374a;

        /* access modifiers changed from: public */
        C4205k(int i) {
            this.f10374a = i;
        }

        /* renamed from: a */
        public final int mo24088a() {
            if (this != UNRECOGNIZED) {
                return this.f10374a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C4205k m13364a(int i) {
            if (i == 0) {
                return UNITDISPLAYTYPEUNKNOWN;
            }
            if (i == 1) {
                return BANNER;
            }
            if (i == 2) {
                return INTERSTITIAL;
            }
            if (i == 3) {
                return REWARDED;
            }
            if (i != 4) {
                return null;
            }
            return MRECT;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$l */
    public enum C4206l implements C5252z.C5255c {
        UNKNOWN(0),
        MALE(1),
        FEMALE(2),
        OTHER(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10381a;

        /* access modifiers changed from: public */
        C4206l(int i) {
            this.f10381a = i;
        }

        /* renamed from: a */
        public final int mo24088a() {
            if (this != UNRECOGNIZED) {
                return this.f10381a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C4206l m13366a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MALE;
            }
            if (i == 2) {
                return FEMALE;
            }
            if (i != 3) {
                return null;
            }
            return OTHER;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$n */
    public enum C4208n implements C5252z.C5255c {
        NOCLICK(0),
        CTABUTTON(1),
        COMPANION(2),
        VIDEOVIEW(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10388a;

        /* access modifiers changed from: public */
        C4208n(int i) {
            this.f10388a = i;
        }

        /* renamed from: a */
        public final int mo24088a() {
            if (this != UNRECOGNIZED) {
                return this.f10388a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C4208n m13368a(int i) {
            if (i == 0) {
                return NOCLICK;
            }
            if (i == 1) {
                return CTABUTTON;
            }
            if (i == 2) {
                return COMPANION;
            }
            if (i != 3) {
                return null;
            }
            return VIDEOVIEW;
        }
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr, C5205q qVar) throws C5119a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(InputStream inputStream) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(InputStream inputStream, C5205q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(C5172j jVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(C5172j jVar, C5205q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
