package com.weebly.ghostcoder.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void Login(View view)
    {
        Intent intent= new Intent(this,Profile.class);
        Toast.makeText(this  , "Login", Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }
    public void SignUp(View view)
    {
        Intent intent= new Intent(this,SignUp.class);
        Toast.makeText(this  , "SignUp", Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }

}
