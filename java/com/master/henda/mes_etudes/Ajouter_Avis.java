package com.master.henda.mes_etudes;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.master.henda.mes_etudes.HttpManager.HttpManager;



/**
 * A simple {@link Fragment} subclass.
 */
public class Ajouter_Avis extends Fragment {


    private EditText matiere;
    private EditText dateAvis;
    private EditText horaireAvis;
    private EditText duréeAvis;
    private EditText lieuAvis;
    private EditText groupeAvis;
    private EditText filiereAvis;
    private Spinner typedavis;

    private Button ajouter;


    String params, ch = "";
    String url = "http://10.0.2.2/versionF/ajout_avis.php";

    public Ajouter_Avis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //  return inflater.inflate(R.layout.fragment_ajouter__avis, container, false);

        View view = inflater.inflate(R.layout.fragment_ajouter__avis, container, false);


        matiere = (EditText) view.findViewById(R.id.matiere);
        dateAvis = (EditText) view.findViewById(R.id.dateAvis);
        horaireAvis = (EditText) view.findViewById(R.id.horaireAvis);
        duréeAvis = (EditText) view.findViewById(R.id.duréeAvis);
        lieuAvis = (EditText) view.findViewById(R.id.lieuAvis);
        typedavis = (Spinner) view.findViewById(R.id.typedavis);
        groupeAvis = (EditText) view.findViewById(R.id.groupeAvis);
        filiereAvis = (EditText) view.findViewById(R.id.filiereAvis);
        ajouter = (Button) view.findViewById(R.id.ajouter);


        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Mytask tasck = new Mytask();
                params = "type_avis=" + typedavis.getSelectedItem().toString()
                        + "&matiere_avis=" + matiere.getText().toString()
                        + "&date_avis=" + dateAvis.getText().toString()
                        + "&horaire_avis=" + horaireAvis.getText().toString()
                        + "&duree_avis=" + duréeAvis.getText().toString()
                        + "&salle_avis=" + lieuAvis.getText().toString()
                        + "&groupe_etd=" + groupeAvis.getText().toString()
                        + "&niveau_etd=" + filiereAvis.getText().toString();


                tasck.execute(url, params);
                Toast.makeText(getActivity().getApplicationContext(), "insertion terminer avec succées", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    public void onStart() {

        super.onStart();
        // EditText dateAvis = (EditText)findViewById(R.id.dateAvis);

        dateAvis.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    DateDialog dialog = new DateDialog(v);
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    dialog.show(ft, "DatePicker");

                }
            }

        });



        horaireAvis.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    TimeDialog dialog = new TimeDialog(v);
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    dialog.show(ft, "TimePicker");
                }
            }
        });

    }


}


class Mytask extends AsyncTask<String,String,String>
{


    @Override
    protected String doInBackground(String... params) {
        String s = HttpManager.posdata(params[0], params[1]);
        return  s;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        //  Toast.makeText(getActivity(), "this is my Toast message!!! =)",Toast.LENGTH_LONG).show();
        //  Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
    }
}