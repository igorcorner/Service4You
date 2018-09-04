package com.s4y.service4you.Authentication.Register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.s4y.service4you.R;

/**
 * Created by boldi on 2018. 09. 04..
 */

public class RegisterPersonalInfoActivity extends AppCompatActivity {

    private EditText txtSurname;
    private EditText txtMiddlename;
    private EditText txtPostNumb;
    private EditText txtCity;
    private EditText txtAddress;

    private NumberPicker numbYear;
    private NumberPicker numbMonths;
    private NumberPicker numbDay;

    private RadioGroup rGroup;
    private RadioButton rbtnMan;
    private RadioButton rbtnWoman;

    private Button btnNext;

    private String Surname;
    private String MiddleName;
    private String PostNumb;
    private String City;
    private String Address;

    private int BDYear;
    private int BDMonth;
    private int BDDay;

    private int Man = 0;
    private int Woman = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_personalinfo);

        txtSurname = findViewById(R.id.txt_surname_reg);
        txtMiddlename = findViewById(R.id.txt_middlename_reg);
        txtPostNumb = findViewById(R.id.txt_postnumb_reg);
        txtCity = findViewById(R.id.txt_city_reg);
        txtAddress = findViewById(R.id.txt_address_reg);
        numbYear = findViewById(R.id.numb_year);
        numbMonths = findViewById(R.id.numb_month);
        numbDay = findViewById(R.id.numb_day);
        rGroup = findViewById(R.id.rGroup);
        rbtnMan = findViewById(R.id.rbtn_man);
        rbtnWoman = findViewById(R.id.rbtn_woman);
        btnNext = findViewById(R.id.btn_next);

        numbYear.setMinValue(1920);
        numbYear.setMaxValue(2000);

        numbMonths.setMaxValue(12);
        numbMonths.setMinValue(1);

        numbDay.setMinValue(1);
        numbDay.setMaxValue(31);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if ( txtSurname.getText().toString().equals("") || txtMiddlename.getText().toString().equals("") || numbYear.getValue() == 0 || numbMonths.getValue() == 0 || numbDay.getValue() == 0 ||
                    txtPostNumb.getText().toString().equals("") || txtCity.getText().toString().equals("") || txtAddress.getText().toString().equals("") || !rGroup.isPressed() ) {
                    toastMassage("Kérjük töltse ki az összes információt!");
            }else{
                Surname = txtSurname.getText().toString();
                MiddleName = txtMiddlename.getText().toString();
                PostNumb = txtPostNumb.getText().toString();
                City = txtCity.getText().toString();
                Address = txtAddress.getText().toString();

                BDYear = numbYear.getValue();
                BDMonth = numbMonths.getValue();
                BDDay = numbDay.getValue();

                if(rbtnMan.isChecked()){
                    Man = 1;
                }else if(rbtnWoman.isChecked()){
                    Woman = 1;
                }
            }
                Intent i = new Intent(RegisterPersonalInfoActivity.this,RegisterLoginInfoActivity.class);
                startActivity(i);
            }
        });
    }
    private void toastMassage(String massage){
        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
    }

}