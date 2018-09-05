package com.s4y.service4you;


/**
 * Created by boldi on 2018. 09. 05..
 */

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import com.s4y.service4you.Authentication.Register.RegisterPersonalInfoActivity;

import java.util.Calendar;
import java.util.Date;


public  class PopupBirthday extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    private DatePicker dpBirthday;
    private Date dBirthday;

@Override
public Dialog onCreateDialog(Bundle savedInstanceState) {
// Use the current date as the default date in the picker
final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
        }

public void onDateSet(DatePicker view, int year, int month, int day) {
            dBirthday = new Date(year,month,day);
            }
        }
