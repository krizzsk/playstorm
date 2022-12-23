package com.fyber.inneractive.sdk.external;

public class ImpressionData {

    /* renamed from: a */
    public Pricing f10799a = new Pricing();

    /* renamed from: b */
    public Video f10800b;

    /* renamed from: c */
    public String f10801c;

    /* renamed from: d */
    public Long f10802d;

    /* renamed from: e */
    public String f10803e;

    /* renamed from: f */
    public String f10804f;

    /* renamed from: g */
    public String f10805g;

    /* renamed from: h */
    public String f10806h;

    /* renamed from: i */
    public String f10807i;

    public static class Pricing {

        /* renamed from: a */
        public double f10808a;

        /* renamed from: b */
        public String f10809b;

        public String getCurrency() {
            return this.f10809b;
        }

        public double getValue() {
            return this.f10808a;
        }

        public void setValue(double d) {
            this.f10808a = d;
        }

        public String toString() {
            return "Pricing{value=" + this.f10808a + ", currency='" + this.f10809b + '\'' + '}';
        }
    }

    public static class Video {

        /* renamed from: a */
        public boolean f10810a;

        /* renamed from: b */
        public long f10811b;

        public Video(boolean z, long j) {
            this.f10810a = z;
            this.f10811b = j;
        }

        public long getDuration() {
            return this.f10811b;
        }

        public boolean isSkippable() {
            return this.f10810a;
        }

        public String toString() {
            return "Video{skippable=" + this.f10810a + ", duration=" + this.f10811b + '}';
        }
    }

    public String getAdvertiserDomain() {
        return this.f10807i;
    }

    public String getCampaignId() {
        return this.f10806h;
    }

    public String getCountry() {
        return this.f10803e;
    }

    public String getCreativeId() {
        return this.f10805g;
    }

    public Long getDemandId() {
        return this.f10802d;
    }

    public String getDemandSource() {
        return this.f10801c;
    }

    public String getImpressionId() {
        return this.f10804f;
    }

    public Pricing getPricing() {
        return this.f10799a;
    }

    public Video getVideo() {
        return this.f10800b;
    }

    public void setAdvertiserDomain(String str) {
        this.f10807i = str;
    }

    public void setCampaignId(String str) {
        this.f10806h = str;
    }

    public void setCountry(String str) {
        this.f10803e = str;
    }

    public void setCpmValue(String str) {
        double d;
        try {
            d = Double.parseDouble(str);
        } catch (Exception unused) {
            d = 0.0d;
        }
        this.f10799a.f10808a = d;
    }

    public void setCreativeId(String str) {
        this.f10805g = str;
    }

    public void setCurrency(String str) {
        this.f10799a.f10809b = str;
    }

    public void setDemandId(Long l) {
        this.f10802d = l;
    }

    public void setDemandSource(String str) {
        this.f10801c = str;
    }

    public void setDuration(long j) {
        this.f10800b.f10811b = j;
    }

    public void setImpressionId(String str) {
        this.f10804f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f10799a = pricing;
    }

    public void setVideo(Video video) {
        this.f10800b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f10799a + ", video=" + this.f10800b + ", demandSource='" + this.f10801c + '\'' + ", country='" + this.f10803e + '\'' + ", impressionId='" + this.f10804f + '\'' + ", creativeId='" + this.f10805g + '\'' + ", campaignId='" + this.f10806h + '\'' + ", advertiserDomain='" + this.f10807i + '\'' + '}';
    }
}
