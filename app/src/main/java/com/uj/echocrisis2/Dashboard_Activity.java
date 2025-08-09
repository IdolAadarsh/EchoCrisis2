package com.uj.echocrisis2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard_Activity extends AppCompatActivity {

    Button btnGoToInsurance, btnFinancialHelp, btnMedicalHelp , btnBankingHelp;
    TextView txtWelcome;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnGoToInsurance = findViewById(R.id.btnGoToInsurance);
        btnFinancialHelp = findViewById(R.id.btnFinancialHelp);
        btnMedicalHelp = findViewById(R.id.btnMedicalHelp);
        btnBankingHelp = findViewById(R.id.btnBankingHelp);
        txtWelcome = findViewById(R.id.txtWelcome);


        // Receiving data from MainActivity
        String username = getIntent().getStringExtra("username");
        txtWelcome.setText("Welcome, " + username);

        btnGoToInsurance.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard_Activity.this, InsuranceClaimActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });

        btnFinancialHelp.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard_Activity.this, FinancialHelpActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });

        btnMedicalHelp.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard_Activity.this, MedicalHelpActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });

        btnBankingHelp.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard_Activity.this, BankingHelpActivity.class);
            startActivity(intent);
        });
    }
}
