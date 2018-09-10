package com.s4y.service4you.SplashScreens;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.s4y.service4you.Authentication.LoginActivity;
import com.s4y.service4you.LocalDBHelper;
import com.s4y.service4you.R;

public class SplashScreenFirstTime extends AppCompatActivity {
    
    private Button btnNext;

    private SharedPreferences sharedPreferences;
    private Boolean firstTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_firsttime);

        sharedPreferences = getSharedPreferences("FirstTimePref",MODE_PRIVATE);

        btnNext = findViewById(R.id.btnNextSplash);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        firstTime = sharedPreferences.getBoolean("firstTime",true);

        if(firstTime){
            firstTime = false;
            editor.putBoolean("firstTime",firstTime);
            editor.apply();
            btnNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(SplashScreenFirstTime.this, LoginActivity.class);
                    startActivity(i);
                    SplashScreenFirstTime.this.finish();
                }
            });
        }else {
            Intent i = new Intent(SplashScreenFirstTime.this,SplashScreen.class);
            startActivity(i);
            SplashScreenFirstTime.this.finish();
        }

    }
}
