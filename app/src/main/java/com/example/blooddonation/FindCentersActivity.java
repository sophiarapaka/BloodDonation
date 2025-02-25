package com.example.blooddonation;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FindCentersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DonationCenterAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_centers);

        recyclerView = findViewById(R.id.recyclerViewCenters);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Load local donation centers
        List<DonationCenter> centers = getDummyCenters();
        adapter = new DonationCenterAdapter(centers);
        recyclerView.setAdapter(adapter);
    }

    // Hardcoded donation center data
    private List<DonationCenter> getDummyCenters() {
        List<DonationCenter> centers = new ArrayList<>();
        centers.add(new DonationCenter("Red Cross Center", "123 Main St, Hyderabad", "9876543210"));
        centers.add(new DonationCenter("Lions Blood Bank", "456 Park Lane, Mumbai", "8765432109"));
        centers.add(new DonationCenter("Government Hospital", "789 Health Road, Delhi", "7654321098"));
        return centers;
    }
}
