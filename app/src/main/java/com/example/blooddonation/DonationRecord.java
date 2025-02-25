package com.example.blooddonation;

// Replace with your actual package name

public class DonationRecord {

    private String donationDate;
    private String donationLocation;

    public DonationRecord(String donationDate, String donationLocation) {
        this.donationDate = donationDate;
        this.donationLocation = donationLocation;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public String getDonationLocation() {
        return donationLocation;
    }

    public void setDonationLocation(String donationLocation) {
        this.donationLocation = donationLocation;
    }
}
