package com.example.blooddonation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EligibilityCheckActivity extends AppCompatActivity {

    private EditText ageInput, weightInput;
    private TextView resultText;
    private Button checkEligibilityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eligibility_check);

        // Initialize UI components
        ageInput = findViewById(R.id.ageInput);
        weightInput = findViewById(R.id.weightInput);
        resultText = findViewById(R.id.resultText);
        checkEligibilityButton = findViewById(R.id.checkEligibilityButton);

        // Set button click listener
        checkEligibilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEligibility();
            }
        });
    }

    private void checkEligibility() {
        // Get user input
        String ageStr = ageInput.getText().toString().trim();
        String weightStr = weightInput.getText().toString().trim();

        // Validate input
        if (ageStr.isEmpty() || weightStr.isEmpty()) {
            resultText.setText("Please enter both age and weight.");
            return;
        }

        int age = Integer.parseInt(ageStr);
        int weight = Integer.parseInt(weightStr);

        // Check eligibility criteria
        if (age >= 18 && age <= 65 && weight >= 50) {
            resultText.setText("✅ You are eligible to donate blood!");
        } else {
            resultText.setText("❌ You are not eligible to donate blood.");
        }
    }
}
