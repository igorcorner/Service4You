package com.s4y.service4you.Authentication.Register;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.s4y.service4you.MainActivity;
import com.s4y.service4you.R;

import static com.s4y.service4you.R.color.SelectedBlue;

/**
 * Created by boldi on 2018. 09. 04..
 */

public class RegisterLoginInfoActivity extends AppCompatActivity {

    private EditText txtUserName;
    private EditText txtEmail;
    private EditText txtPassword;
    private EditText txtPWagain;

    private Button btnRegister;

    private String Surname;
    private String MiddleName;
    private String PostNumb;
    private String City;
    private String Address;

    private int Sex = 0;

    private int BdYear;
    private int BdMonth;
    private int BdDay;

    private String UserName;
    private String Email;
    private String Password;
    private String PWagain;

    private ImageButton btn_a1;
    private ImageButton btn_a2;
    private ImageButton btn_a3;
    private ImageButton btn_a4;
    private ImageButton btn_a5;
    private ImageButton btn_a6;

    private int selectedAvatar = 0;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_logininfo);

        txtUserName = findViewById(R.id.txt_username_reg);
        txtEmail = findViewById(R.id.txt_email_reg);
        txtPassword = findViewById(R.id.txt_password_reg);
        txtPWagain = findViewById(R.id.txt_pw_again);
        btnRegister = findViewById(R.id.btn_register);

        btn_a1 = findViewById(R.id.img_avatar);
        btn_a2 = findViewById(R.id.img_avatar1);
        btn_a3 = findViewById(R.id.img_avatar2);
        btn_a4 = findViewById(R.id.img_avatar3);
        btn_a5 = findViewById(R.id.img_avatar4);
        btn_a6 = findViewById(R.id.img_avatar5);


        sharedPreferences = getSharedPreferences("PersonalInfoLoginPref",MODE_PRIVATE);
        Surname = sharedPreferences.getString("Surname","");
        MiddleName = sharedPreferences.getString("MiddleName","");
        PostNumb  = sharedPreferences.getString("PostNumb","");
        City = sharedPreferences.getString("City","");
        Address = sharedPreferences.getString("Address","");
        Sex = sharedPreferences.getInt("Sex",0);
        BdYear = sharedPreferences.getInt("BdYear",0);
        BdMonth = sharedPreferences.getInt("BdMonth",0);
        BdDay = sharedPreferences.getInt("BdDay",0);
        imgButtonControl();
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtUserName.getText().toString().equals("") || txtEmail.getText().toString().equals("") || txtPassword.getText().toString().equals("") || txtPWagain.getText().toString().equals("")) {
                    toastMassage("Kérjük töltse ki az összes információt!");
                }

                UserName = txtUserName.getText().toString();
                Email = txtEmail.getText().toString();
                Password = txtPassword.getText().toString();
                PWagain = txtPWagain.getText().toString();
                Intent i = new Intent(RegisterLoginInfoActivity.this,MainActivity.class);
                startActivity(i);
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
    private void toastMassage(String massage){
        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
    }
}