package com.example.dell.saturdaycodingsignin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListener();
    }
    public void onClickListener()
    {
        username=(EditText)findViewById(R.id.editText_username);
        password=(EditText)findViewById(R.id.editText_password);
        submit=(Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Hello") && password.getText().toString().equals("Hello")) {
                    Toast.makeText(MainActivity.this, "You are successfully login", Toast.LENGTH_LONG).show();
                    Intent it=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(it);
                }
            }
        });
    }
}
