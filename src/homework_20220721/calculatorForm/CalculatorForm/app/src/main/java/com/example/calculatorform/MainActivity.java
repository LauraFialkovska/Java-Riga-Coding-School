package com.example.calculatorform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allignRight();
        displayZeroByDefault();
    }

    public void allignRight() {
        displayContainer = (TextView) findViewById(R.id.displayContainer);
        displayContainer.setGravity(Gravity.RIGHT);
    }

    public void displayZeroByDefault() {
        displayContainer = (TextView) findViewById(R.id.displayContainer);
        displayContainer.setText("0");
    }
}