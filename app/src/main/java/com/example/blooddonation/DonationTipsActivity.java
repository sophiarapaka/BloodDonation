package com.example.blooddonation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DonationTipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donation_tips_activity);

        // Initialize the TextViews
        TextView tvTip1 = findViewById(R.id.tvTip1);
        TextView tvTip2 = findViewById(R.id.tvTip2);
        TextView tvTip3 = findViewById(R.id.tvTip3);
        TextView tvTip4 = findViewById(R.id.tvTip4);
        TextView tvTip5 = findViewById(R.id.tvTip5);

        // Set text for each tip
        tvTip1.setText("1. Stay hydrated before donating blood. Learn more.");
        tvTip2.setText("2. Eat well before your donation. Here's a list of blood donation tips.");
        tvTip3.setText("3. Ensure that you are eligible to donate. Visit the National Blood Service for more details.");
        tvTip4.setText("4. After donating, rest and rehydrate. Tips for post-donation recovery.");
        tvTip5.setText("5. Make a regular habit of donating blood. Why regular donation matters.");

        // Set clickable links
        tvTip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.redcrossblood.org/donate-blood/how-to-donate/eligibility-requirements.html");
            }
        });

        tvTip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.webmd.com/a-to-z-guides/ss/slideshow-donation-tips");
            }
        });

        tvTip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.blood.co.uk/what-is-blood-donation/");
            }
        });

        tvTip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://my.clevelandclinic.org/health/articles/17701-blood-donation");
            }
        });

        tvTip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.healthline.com/health/blood-donation-tips");
            }
        });
    }

    // Method to open a URL
    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
