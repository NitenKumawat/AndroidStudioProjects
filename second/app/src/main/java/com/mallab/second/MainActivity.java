package com.mallab.second;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.usernameEditText);
        password = findViewById(R.id.passwordEditText);
    }

    public void onLoginButtonClick(View view) {
        String uname = username.getText().toString();
        String pass = password.getText().toString();


        if (uname.equals("niten") && pass.equals("niten")) {
            Intent intent = new Intent(this, WelcomeActivity.class);
            startActivity(intent);
        } else {
            makeText(this, "Invalid usaename and password", LENGTH_SHORT).show();

        }
    }
}
