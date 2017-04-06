package com.securelockview.sample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kevalpatel.passcodeview.PinChangeListener;
import com.kevalpatel.passcodeview.pinview.PinView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PinView pinView = (PinView) findViewById(R.id.pin_view);
        pinView.setPinToCheck("1234");
        pinView.setPinChangeListener(new PinChangeListener() {
            @Override
            public void onAuthenticationSuccessful() {
                Toast.makeText(MainActivity.this, "Auth successful.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAuthenticationFailed() {
                Toast.makeText(MainActivity.this, "Auth failed.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}