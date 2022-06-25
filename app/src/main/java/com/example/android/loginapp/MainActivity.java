package com.example.android.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private TextView username;
    private TextView password;
    private TextView validPswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        validPswd = findViewById(R.id.validation_pswd);

        button = findViewById(R.id.loginbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = username.getText().toString();
                String pass_word = password.getText().toString();

                if(user_name.isEmpty()){
                    username.setText("Required!");
                }
                else if(pass_word.isEmpty() || pass_word.length()<8){
                    validPswd.setText("Please enter a valid password!");
                }
                else{
                    Intent intent = new Intent(MainActivity.this, AfterLoginActivity.class);
                    intent.putExtra("keyname", user_name);
                    startActivity(intent);
                }
            }
        });
    }

}