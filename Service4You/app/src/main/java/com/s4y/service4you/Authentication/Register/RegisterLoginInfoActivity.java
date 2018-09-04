package com.s4y.service4you.Authentication.Register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.s4y.service4you.MainActivity;
import com.s4y.service4you.R;

/**
 * Created by boldi on 2018. 09. 04..
 */

public class RegisterLoginInfoActivity extends AppCompatActivity {

    private EditText txtUserName;
    private EditText txtEmail;
    private EditText txtPassword;
    private EditText txtPWagain;

    private Button btnRegister;

    private String UserName;
    private String Email;
    private String Password;
    private String PWagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_logininfo);

        txtUserName = findViewById(R.id.txt_username_reg);
        txtEmail = findViewById(R.id.txt_email_reg);
        txtPassword = findViewById(R.id.txt_password_reg);
        txtPWagain = findViewById(R.id.txt_pw_again);
        btnRegister = findViewById(R.id.btn_register);

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

    private void toastMassage(String massage){
        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
    }
}