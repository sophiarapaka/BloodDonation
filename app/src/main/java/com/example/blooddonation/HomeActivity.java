package com.example.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize buttons
        Button btnDonationHistory = findViewById(R.id.btnDonationHistory);
        Button btnEligibilityCheck = findViewById(R.id.btnCheckEligibility);
        Button btnFindCenters = findViewById(R.id.btnFindCenters);
        Button btnDonationTips = findViewById(R.id.btnDonationTips);

        // Set up button click listeners using lambda expressions
        btnDonationHistory.setOnClickListener(v -> openActivity(DonationHistoryActivity.class));
        btnEligibilityCheck.setOnClickListener(v -> openActivity(EligibilityCheckActivity.class));
        btnFindCenters.setOnClickListener(v -> openActivity(FindCentersActivity.class));
        btnDonationTips.setOnClickListener(v -> openActivity(DonationTipsActivity.class));
    }

    // Generic method to open an activity
    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(HomeActivity.this, activityClass);
        startActivity(intent);
    }
}
