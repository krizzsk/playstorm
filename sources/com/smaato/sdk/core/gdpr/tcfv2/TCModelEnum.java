package com.smaato.sdk.core.gdpr.tcfv2;

import com.smaato.sdk.core.gdpr.tcfv2.model.PurposeRestrictionVector;
import com.smaato.sdk.core.gdpr.tcfv2.model.SortedVector;

public enum TCModelEnum {
    version {
        public Object getValue(TCModel tCModel) {
            return Integer.valueOf(tCModel.getVersion());
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setVersion(((Integer) obj).intValue());
        }
    },
    created {
        public Object getValue(TCModel tCModel) {
            return tCModel.getCreated();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setCreated((String) obj);
        }
    },
    lastUpdated {
        public Object getValue(TCModel tCModel) {
            return tCModel.getLastUpdated();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setLastUpdated((String) obj);
        }
    },
    cmpId {
        public Object getValue(TCModel tCModel) {
            return Integer.valueOf(tCModel.getCmpId());
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setCmpId(((Integer) obj).intValue());
        }
    },
    cmpVersion {
        public Object getValue(TCModel tCModel) {
            return Integer.valueOf(tCModel.getCmpVersion());
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setCmpVersion(((Integer) obj).intValue());
        }
    },
    consentScreen {
        public Object getValue(TCModel tCModel) {
            return Integer.valueOf(tCModel.getConsentScreen());
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setConsentScreen(((Integer) obj).intValue());
        }
    },
    consentLanguage {
        public Object getValue(TCModel tCModel) {
            return tCModel.getConsentLanguage();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setConsentLanguage((String) obj);
        }
    },
    vendorListVersion {
        public Object getValue(TCModel tCModel) {
            return Integer.valueOf(tCModel.getVendorListVersion());
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setVendorListVersion(((Integer) obj).intValue());
        }
    },
    policyVersion {
        public Object getValue(TCModel tCModel) {
            return Integer.valueOf(tCModel.getPolicyVersion());
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPolicyVersion(((Integer) obj).intValue());
        }
    },
    isServiceSpecific {
        public Object getValue(TCModel tCModel) {
            return tCModel.getServiceSpecific();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setServiceSpecific((Boolean) obj);
        }
    },
    useNonStandardStacks {
        public Object getValue(TCModel tCModel) {
            return tCModel.getUseNonStandardStacks();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setUseNonStandardStacks((Boolean) obj);
        }
    },
    publisherCountryCode {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPublisherCountryCode();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPublisherCountryCode((String) obj);
        }
    },
    purposeOneTreatment {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPurposeOneTreatment();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPurposeOneTreatment((Boolean) obj);
        }
    },
    specialFeatureOptIns {
        public Object getValue(TCModel tCModel) {
            return tCModel.getSpecialFeatureOptIns();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setSpecialFeatureOptIns((SortedVector) obj);
        }
    },
    purposeConsents {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPurposeConsents();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPurposeConsents((SortedVector) obj);
        }
    },
    purposeLegitimateInterest {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPurposeLegitimateInterest();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPurposeLegitimateInterest((SortedVector) obj);
        }
    },
    vendorConsents {
        public Object getValue(TCModel tCModel) {
            return tCModel.getVendorConsents();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setVendorConsents((SortedVector) obj);
        }
    },
    vendorLegitimateInterest {
        public Object getValue(TCModel tCModel) {
            return tCModel.getVendorLegitimateInterest();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setVendorLegitimateInterest((SortedVector) obj);
        }
    },
    publisherRestrictions {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPublisherRestrictions();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPublisherRestrictions((PurposeRestrictionVector) obj);
        }
    },
    vendorsAllowed {
        public Object getValue(TCModel tCModel) {
            return tCModel.getVendorsAllowed();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setVendorsAllowed((SortedVector) obj);
        }
    },
    vendorsDisclosed {
        public Object getValue(TCModel tCModel) {
            return tCModel.getVendorsDisclosed();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setVendorsDisclosed((SortedVector) obj);
        }
    },
    publisherConsents {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPublisherConsents();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPublisherConsents((SortedVector) obj);
        }
    },
    publisherLegitimateInterest {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPublisherLegitimateInterest();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPublisherLegitimateInterest((SortedVector) obj);
        }
    },
    publisherCustomConsents {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPublisherCustomConsents();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPublisherCustomConsents((SortedVector) obj);
        }
    },
    publisherCustomLegitimateInterest {
        public Object getValue(TCModel tCModel) {
            return tCModel.getPublisherCustomLegitimateInterest();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setPublisherCustomLegitimateInterest((SortedVector) obj);
        }
    },
    numCustomPurposes {
        public Object getValue(TCModel tCModel) {
            return Integer.valueOf(tCModel.getNumCustomPurposes());
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setNumCustomPurposes(((Integer) obj).intValue());
        }
    },
    supportOOB {
        public Object getValue(TCModel tCModel) {
            return tCModel.getSupportOOB();
        }

        public void setValue(TCModel tCModel, Object obj) {
            tCModel.setSupportOOB((Boolean) obj);
        }
    };

    public abstract Object getValue(TCModel tCModel);

    public abstract void setValue(TCModel tCModel, Object obj);
}
