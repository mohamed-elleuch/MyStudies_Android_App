package com.master.henda.mes_etudes;



import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by aa on 25/06/2016.
 */
public class TimeDialog extends android.support.v4.app.DialogFragment implements TimePickerDialog.OnTimeSetListener {

    EditText horaireAvis;
    public TimeDialog(View view) {

        horaireAvis=(EditText)view;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState){

        final Calendar c=Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        return new TimePickerDialog(getActivity(),this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));

    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        String time= hourOfDay+":"+minute;

            horaireAvis.setText(time);



    }











}
