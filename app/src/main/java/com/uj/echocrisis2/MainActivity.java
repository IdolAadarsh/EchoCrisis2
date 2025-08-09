package com.uj.echocrisis2;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonInsurance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInsurance = findViewById(R.id.buttonGoToInsurance);
        // buttonDownloadTemplates = findViewById(R.id.buttonDownloadTemplate);

        // Launch Dashboard Activity
        buttonInsurance.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Dashboard_Activity.class);
            startActivity(intent);
        });


    }
}
