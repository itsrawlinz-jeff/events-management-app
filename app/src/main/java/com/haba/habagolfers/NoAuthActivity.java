package com.haba.habagolfers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoAuthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_auth);

        final Button sign_up = findViewById(R.id.sign_up);
        final Button login = findViewById(R.id.login);

        sign_up.setOnClickListener(view -> startActivity(new Intent(NoAuthActivity.this, SignUpActivity.class)));

        login.setOnClickListener(view -> startActivity(new Intent(NoAuthActivity.this, LoginActivity.class)));
    }
}