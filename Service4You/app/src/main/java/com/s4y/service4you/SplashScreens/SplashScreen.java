package com.s4y.service4you.SplashScreens;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.s4y.service4you.Authentication.LoginActivity;
import com.s4y.service4you.MainActivity;
import com.s4y.service4you.R;

public class SplashScreen extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    private String UserName;
    private String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);

        sharedPreferences = getSharedPreferences("Login",MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                UserName = sharedPreferences.getString("UserName","");
                Password = sharedPreferences.getString("Password","");
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, 1000);
    }
}

