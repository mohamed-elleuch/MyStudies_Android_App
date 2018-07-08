package com.master.henda.mes_etudes;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by aa on 23/06/2016.
 */
public class DateDialog extends android.support.v4.app.DialogFragment implements DatePickerDialog.OnDateSetListener {


    EditText dateAvis;

   public DateDialog(View view) {

       dateAvis=(EditText)view;
   }

    public Dialog onCreateDialog(Bundle savedInstanceState){

        final Calendar c=Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month= c.get(Calendar.MONTH);
        int day= c.get(Calendar.DAY_OF_MONTH);
     return new DatePickerDialog(getActivity(),this,year,month,day);

    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {

        String date=day+"-"+(month+1)+"-"+year;
        dateAvis.setText(date);
    }

}
