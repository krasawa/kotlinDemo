package demo.kotlin.java;

import java.util.ArrayList;
import java.util.List;

public class FunctionExamples {
    private List<Consent> consentList = createConsentList();

    enum ConsentType {
        TOU("Terms of use"), PRIVACY("Privacy policy"), PARENT_CONSENT("Parent consent"), ADS("Ads"), THIRD("Third party"), NON_EU_USER("non_eu");

        ConsentType(String name) {
            this.name = name;
        }
        private String name;
    }

    public boolean isNonEuUser() {
        for(Consent consent : consentList) {
            if (consent.getConsentType() == ConsentType.NON_EU_USER) {
                return consent.getValue();
            }
        }
        return false;
    }

    private List<Consent> createConsentList() {
        List<Consent> consents =  new ArrayList(6);
        consents.add(new Consent(ConsentType.TOU, false, true, true));
        consents.add(new Consent(ConsentType.PRIVACY, false, true, true));
        consents.add(new Consent(ConsentType.PARENT_CONSENT, false, true, true));
        consents.add(new Consent(ConsentType.ADS, false, true, true));
        consents.add(new Consent(ConsentType.THIRD, false, true, true));
        consents.add(new Consent(ConsentType.NON_EU_USER, false, true, true));
        return consents;
    }
}
