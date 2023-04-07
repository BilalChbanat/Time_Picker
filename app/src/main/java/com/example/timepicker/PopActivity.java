package com.example.timepicker;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

public class PopActivity extends DialogFragment implements View.OnClickListener {

    View view;
    TimePicker tp;
    Button buDome;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        view=inflater.inflate(R.layout.pop_activity,container,false);
        tp=(TimePicker)view.findViewById(R.id.tp1);
        buDome=(Button)view.findViewById(R.id.buDome);
        buDome.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        this.dismiss();
        String myTime= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            myTime = tp.getHour()+":"+tp.getMinute();
        }
        MainActivity ma=(MainActivity)getActivity();
        ma.SetDate(myTime);
    }

    public void show(FragmentManager fm, String show_fragment) {
    }
}
