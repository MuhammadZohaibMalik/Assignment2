package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView sickText;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sickText = findViewById(R.id.sickText);
        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(v -> {
            // Add action here, for now, we'll just show a Toast message
            Toast.makeText(MainActivity.this, "Start button clicked!", Toast.LENGTH_SHORT).show();
        });
    }
}