package com.s4y.service4you.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.s4y.service4you.R;


public class EditProfileAvtivity extends AppCompatActivity {
    private ImageView imgBack;

    private EditText txtSurname;
    private EditText txtMidleName;
    private EditText txtEmail;
    private EditText txtUserName;
    private EditText Password;

    private ImageButton btn_a1;
    private ImageButton btn_a2;
    private ImageButton btn_a3;
    private ImageButton btn_a4;
    private ImageButton btn_a5;
    private ImageButton btn_a6;

    private int selectedAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_avtivity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgBack = findViewById(R.id.ivBackArrow);
        btn_a1 = findViewById(R.id.img_avatare);
        btn_a2 = findViewById(R.id.img_avatar1e);
        btn_a3 = findViewById(R.id.img_avatar2e);
        btn_a4 = findViewById(R.id.img_avatar3e);
        btn_a5 = findViewById(R.id.img_avatar4e);
        btn_a6 = findViewById(R.id.img_avatar5e);
        imgButtonControl();
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EditProfileAvtivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
    private void imgButtonControl(){
        btn_a1.setBackgroundColor(Color.TRANSPARENT);
        btn_a2.setBackgroundColor(Color.TRANSPARENT);
        btn_a3.setBackgroundColor(Color.TRANSPARENT);
        btn_a4.setBackgroundColor(Color.TRANSPARENT);
        btn_a5.setBackgroundColor(Color.TRANSPARENT);
        btn_a6.setBackgroundColor(Color.TRANSPARENT);
        btn_a1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_a1.setBackgroundColor(Color.BLUE);
                btn_a2.setBackgroundColor(Color.TRANSPARENT);
                btn_a3.setBackgroundColor(Color.TRANSPARENT);
                btn_a4.setBackgroundColor(Color.TRANSPARENT);
                btn_a5.setBackgroundColor(Color.TRANSPARENT);
                btn_a6.setBackgroundColor(Color.TRANSPARENT);
                selectedAvatar = 1;
            }
        });
        btn_a2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_a1.setBackgroundColor(Color.TRANSPARENT);
                btn_a2.setBackgroundColor(Color.BLUE);
                btn_a3.setBackgroundColor(Color.TRANSPARENT);
                btn_a4.setBackgroundColor(Color.TRANSPARENT);
                btn_a5.setBackgroundColor(Color.TRANSPARENT);
                btn_a6.setBackgroundColor(Color.TRANSPARENT);
                selectedAvatar = 2;
            }
        });
        btn_a3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_a1.setBackgroundColor(Color.TRANSPARENT);
                btn_a2.setBackgroundColor(Color.TRANSPARENT);
                btn_a3.setBackgroundColor(Color.BLUE);
                btn_a4.setBackgroundColor(Color.TRANSPARENT);
                btn_a5.setBackgroundColor(Color.TRANSPARENT);
                btn_a6.setBackgroundColor(Color.TRANSPARENT);
                selectedAvatar = 3;
            }
        });
        btn_a4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_a1.setBackgroundColor(Color.TRANSPARENT);
                btn_a2.setBackgroundColor(Color.TRANSPARENT);
                btn_a3.setBackgroundColor(Color.TRANSPARENT);
                btn_a4.setBackgroundColor(Color.BLUE);
                btn_a5.setBackgroundColor(Color.TRANSPARENT);
                btn_a6.setBackgroundColor(Color.TRANSPARENT);
                selectedAvatar = 4;
            }
        });
        btn_a5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_a1.setBackgroundColor(Color.TRANSPARENT);
                btn_a2.setBackgroundColor(Color.TRANSPARENT);
                btn_a3.setBackgroundColor(Color.TRANSPARENT);
                btn_a4.setBackgroundColor(Color.TRANSPARENT);
                btn_a5.setBackgroundColor(Color.BLUE);
                btn_a6.setBackgroundColor(Color.TRANSPARENT);
                selectedAvatar = 5;
            }
        });
        btn_a6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_a1.setBackgroundColor(Color.TRANSPARENT);
                btn_a2.setBackgroundColor(Color.TRANSPARENT);
                btn_a3.setBackgroundColor(Color.TRANSPARENT);
                btn_a4.setBackgroundColor(Color.TRANSPARENT);
                btn_a5.setBackgroundColor(Color.TRANSPARENT);
                btn_a6.setBackgroundColor(Color.BLUE);
                selectedAvatar = 6;
            }
        });
    }
}
