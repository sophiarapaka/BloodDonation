package com.example.blooddonation;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DonationHistoryActivity extends AppCompatActivity {

    private RecyclerView recyclerViewHistory;
    private DonationHistoryAdapter donationHistoryAdapter;
    private List<DonationRecord> donationHistoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_history);

        recyclerViewHistory = findViewById(R.id.recyclerViewHistory);
        recyclerViewHistory.setLayoutManager(new LinearLayoutManager(this));

        // Sample donation data
        donationHistoryList = new ArrayList<>();
        donationHistoryList.add(new DonationRecord("2023-11-15", "Blood Donation Center A"));
        donationHistoryList.add(new DonationRecord("2023-08-22", "Blood Donation Center B"));
        donationHistoryList.add(new DonationRecord("2023-05-10", "Blood Donation Center C"));

        // Set up the adapter
        donationHistoryAdapter = new DonationHistoryAdapter(donationHistoryList);
        recyclerViewHistory.setAdapter(donationHistoryAdapter);
    }
}
