package com.example.userregform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText uName, uEmail, uPhone, uCity, uPassword;
    Button submit;
    TextView showUNmae, showUEmail, showUPhone, showUCity, showUPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uName = (EditText) findViewById(R.id.uName);
        uEmail = (EditText) findViewById(R.id.uEmail);
        uPhone = (EditText) findViewById(R.id.uPhone);
        uCity = (EditText) findViewById(R.id.uCity);
        uPassword = (EditText) findViewById(R.id.uPassword);

        submit = (Button) findViewById(R.id.submit);

        showUNmae = (TextView) findViewById(R.id.showUName);
        showUEmail = (TextView) findViewById(R.id.showUEmail);
        showUPhone = (TextView) findViewById(R.id.showUPhone);
        showUCity = (TextView) findViewById(R.id.showUCity);
        showUPassword = (TextView) findViewById(R.id.showUPassword);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = uName.getText().toString();
                String email = uEmail.getText().toString();
                int phone = Integer.parseInt(uPhone.getText().toString());
                String city = uCity.getText().toString();
                String password = uPassword.getText().toString();

                showUNmae.setText(name);
                showUEmail.setText(email);
                showUPhone.setText(String.valueOf(phone));
                showUCity.setText(city);
                showUPassword.setText(password);
            }
        });
    }
}