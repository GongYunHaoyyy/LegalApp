package com.example.yuanyuanlai.legalapp.Bean;


public class PhoneVerification {

    private String phone;

    private int verificationCode;

    public PhoneVerification(String mPhone, int mVerificationCode) {

        phone = mPhone;
        verificationCode = mVerificationCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(int verificationCode) {
        this.verificationCode = verificationCode;
    }

}
