package com.s4y.service4you.Authentication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.s4y.service4you.Authentication.Register.RegisterPersonalInfoActivity;
import com.s4y.service4you.Activities.MainActivity;
import com.s4y.service4you.R;

/**
 * Created by boldi on 2018. 09. 04..
 */

public class LoginActivity extends AppCompatActivity {

    private EditText txtEmial;
    private EditText txtPassword;

    private Button btnLogin;
    private Button btnRegister;

    private ImageButton btnFacebook;

    private String Email;
    private String Password;

    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtEmial = findViewById(R.id.txt_emial_login);
        txtPassword = findViewById(R.id.txt_password_login);
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register1);
        btnFacebook = findViewById(R.id.imgbtn_facebook);

        sharedPreferences = getSharedPreferences("Login",MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("UserName",Email);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEmial.getText().toString().equals("") || txtPassword.getText().toString().equals("")){
                    toastMassage("Valamelyik mező üres!");
                }else {
                    Email = txtEmial.getText().toString();
                    Password = txtPassword.getText().toString();
                    editor.putString("UserName",Email);
                    editor.putString("Password",Password);
                    editor.apply();
                    Intent i = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,RegisterPersonalInfoActivity.class);
                startActivity(i);
            }
        });
    }

    private void toastMassage(String massage){
        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
    }
}
