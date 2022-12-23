package com.smaato.sdk.core.gdpr;

enum CmpV2Purpose {
    INFORMATION_STORAGE_AND_ACCESS(1),
    SELECT_BASIS_ADS(2),
    PERSONALISED_ADS_PROFILE(3),
    SELECT_PERSONALISED_ADS(4),
    CREATE_PERSONALISED_CONTENT_PROFILE(5),
    SELECT_PERSONALISED_CONTENT(6),
    MEASURE_AND_PERFORMANCE(7),
    MEASURE_CONTENT_PERFORMANCE(8),
    APPLY_MARKET_RESEARCH(9),
    DEVELOP_AND_IMPROVE_PRODUCTS(10);
    

    /* renamed from: id */
    public final int f27134id;

    private CmpV2Purpose(int i) {
        this.f27134id = i;
    }
}
