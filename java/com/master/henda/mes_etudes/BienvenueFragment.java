package com.master.henda.mes_etudes;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class BienvenueFragment extends Fragment {

    private TextView input_nom;
    private TextView input_prenom;
    private TextView input_mail;

    public BienvenueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_bienvenue, container, false);
        View view = inflater.inflate(R.layout.fragment_bienvenue, container, false);





        return view;
    }

    /**
     * Logging out the user. Will set isLoggedIn flag to false in shared
     * preferences Clears the user data from sqlite users table
     * */
    private void logoutEnseignant() {


        // Launching the login activity
       // Intent intent = new Intent(BienvenueFragment.this, Profile_enseignant.class);
       //startActivity(intent);
        //finish();
        Intent intent = new Intent(getActivity(), Profile_enseignant.class);
        startActivity(intent);
        getActivity().finish();
    }




}


