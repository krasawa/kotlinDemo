package demo.kotlin.java;

public class Consent {
    private FunctionExamples.ConsentType consentType;
    private boolean value;
    private boolean required;
    private boolean enabled;

    public Consent(FunctionExamples.ConsentType consentType, boolean value, boolean required, boolean enabled) {
        this.consentType = this.consentType;
        this.value = value;
        this.required = required;
        this.enabled = enabled;
    }

    public FunctionExamples.ConsentType getConsentType() {
        return consentType;
    }

    public boolean getValue() {
        return value;
    }

    public boolean isRequired() {
        return required;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
