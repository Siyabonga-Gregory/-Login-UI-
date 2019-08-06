package com.weebly.ghostcoder.login;
/*
 Project   : Simply Login UI
 Date      : 2018/Jan/09
 author    : Siyabonga Gregory
 Alias     : GhostCoder ++
 web       : https://www.ghostcoder.weebly.com
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sign_up);
    }
}
