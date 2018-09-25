package com.s4y.service4you.Authentication.Register;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
import android.widget.TextView;
import android.widget.Toast;

import com.s4y.service4you.R;

import java.util.Date;

/**
 * Created by boldi on 2018. 09. 04..
 */

public class RegisterPersonalInfoActivity extends AppCompatActivity   {

    private EditText txtSurname;
    private EditText txtMiddlename;
    private EditText txtPostNumb;
    private EditText txtCity;
    private EditText txtAddress;

    private TextView txtvBirthday;

    private RadioGroup rGroup;
    private RadioButton rbtnMan;
    private RadioButton rbtnWoman;

    private Button btnNext;
    private Button bdButton;

    private DatePickerDialog.OnDateSetListener dPDialogListener;
    private String Surname;
    private String MiddleName;
    private String PostNumb;
    private String City;
    private String Address;

    private int Sex = 0;

    private int BdYear;
    private int BdMonth;
    private int BdDay;

    private SharedPreferences sharedPreferences;

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
        txtvBirthday = findViewById(R.id.txtv_birthday);

        sharedPreferences = getSharedPreferences("PersonalInfoLoginPref",MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        bdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(RegisterPersonalInfoActivity.this, R.style.Theme_AppCompat_DayNight, dPDialogListener, 1970,01,01);
                dialog.show();
            }
        });
        dPDialogListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                txtvBirthday.setText(year+" / "+month+" / "+dayOfMonth);
                BdYear = year;
                BdMonth = month;
                BdDay = dayOfMonth;
            }
        };

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtSurname.getText().toString().equals("") || txtMiddlename.getText().toString().equals("") ||
                        txtPostNumb.getText().toString().equals("") || txtCity.getText().toString().equals("") || txtAddress.getText().toString().equals("") ) {
                    toastMassage("Kérjük töltse ki az összes információt!");
                } else {
                    Surname = txtSurname.getText().toString();
                    MiddleName = txtMiddlename.getText().toString();
                    PostNumb = txtPostNumb.getText().toString();
                    City = txtCity.getText().toString();
                    Address = txtAddress.getText().toString();
                    if(rbtnMan.isChecked()){Sex = 1;} else if(rbtnWoman.isChecked()){Sex = 0;}
                    editor.putString("Surname",Surname);
                    editor.putString("MiddleName",MiddleName);
                    editor.putString("PostNumb",PostNumb);
                    editor.putString("City",City);
                    editor.putString("Address",Address);
                    editor.putInt("Sex",Sex);
                    editor.putInt("BdYear",BdYear);
                    editor.putInt("BdMonth",BdMonth);
                    editor.putInt("BdDay",BdDay);
                    editor.apply();

                    Intent i = new Intent(RegisterPersonalInfoActivity.this, RegisterLoginInfoActivity.class);
                    startActivity(i);

                }
            }
        });
    }

    private void toastMassage(String massage){
        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
    }

}