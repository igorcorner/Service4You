package com.s4y.service4you.Authentication.Register;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.s4y.service4you.R;

import java.util.Date;

/**
 * Created by boldi on 2018. 09. 04..
 */

public class RegisterPersonalInfoActivity extends AppCompatActivity  implements DatePickerDialog.OnDateSetListener {

    private EditText txtSurname;
    private EditText txtMiddlename;
    private EditText txtPostNumb;
    private EditText txtCity;
    private EditText txtAddress;

    private RadioGroup rGroup;
    private RadioButton rbtnMan;
    private RadioButton rbtnWoman;

    private Button btnNext;

    private Button bdButton;

    private String Surname;
    private String MiddleName;
    private String PostNumb;
    private String City;
    private String Address;;

    private int Man = 0;
    private int Woman = 0;

    private Date dBirthday;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_personalinfo);

        txtSurname = findViewById(R.id.txt_surname_reg);
        txtMiddlename = findViewById(R.id.txt_middlename_reg);
        txtPostNumb = findViewById(R.id.txt_postnumb_reg);
        txtCity = findViewById(R.id.txt_city_reg);
        txtAddress = findViewById(R.id.txt_address_reg);
        rGroup = findViewById(R.id.rGroup);
        rbtnMan = findViewById(R.id.rbtn_man);
        rbtnWoman = findViewById(R.id.rbtn_woman);
        btnNext = findViewById(R.id.btn_next);
        bdButton = findViewById(R.id.btn_birthday);

        bdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DatePickerDialog datePickerDialog = new DatePickerDialog(RegisterPersonalInfoActivity.this, RegisterPersonalInfoActivity.this, 1960, 1, 1);
                datePickerDialog.setButton(DatePickerDialog.BUTTON_POSITIVE,"Ok", datePickerDialog);
                datePickerDialog.show();
                datePickerDialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        dBirthday = new Date(year, month, dayOfMonth);
                        datePickerDialog.dismiss();
                    }
                });
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtSurname.getText().toString().equals("") || txtMiddlename.getText().toString().equals("") ||
                        txtPostNumb.getText().toString().equals("") || txtCity.getText().toString().equals("") || txtAddress.getText().toString().equals("") || !rGroup.isPressed()) {
                    toastMassage("Kérjük töltse ki az összes információt!");
                } else {
                    Surname = txtSurname.getText().toString();
                    MiddleName = txtMiddlename.getText().toString();
                    PostNumb = txtPostNumb.getText().toString();
                    City = txtCity.getText().toString();
                    Address = txtAddress.getText().toString();


                    if (rbtnMan.isChecked()) {
                        Man = 1;
                    } else if (rbtnWoman.isChecked()) {
                        Woman = 1;
                    }
                }
                Intent i = new Intent(RegisterPersonalInfoActivity.this, RegisterLoginInfoActivity.class);
                startActivity(i);
            }
        });
    }
    private void toastMassage(String massage){
        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

    }
}