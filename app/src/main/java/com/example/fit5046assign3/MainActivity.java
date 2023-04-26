package com.example.fit5046assign3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText userName = findViewById(R.id.user_name_edittext);
        EditText password = findViewById(R.id.password_edittext);
        Button login = findViewById(R.id.login_button);

        login.setOnClickListener(v -> {
            String usernameText = userName.getText().toString();
            String passwordText = password.getText().toString();
            Log.d("DEBUG", "username: " + usernameText + "password: " + passwordText);
        });
    }
}