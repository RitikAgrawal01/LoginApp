package com.example.android.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AfterLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);


        String username = getIntent().getStringExtra("keyname");

        TextView showUsername = (TextView) findViewById(R.id.show_username);
        showUsername.setText(username);
    }

}