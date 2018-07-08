package com.master.henda.mes_etudes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileEnseignant_fragment extends Fragment {
    private TextView nom;
    private TextView prenom;
    private TextView titre;
    private TextView mail;
    private TextView ville;
    private TextView cin;
    private TextView tel;
    private TextView fac;

    public ProfileEnseignant_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_profile_enseignant_fragment, container, false);

        View view = inflater.inflate(R.layout.fragment_profile_enseignant_fragment, container, false);

        nom = (TextView) view.findViewById(R.id.nom);
        prenom = (TextView) view.findViewById(R.id.prenom);
        titre = (TextView) view.findViewById(R.id.mail_ens);
        mail = (TextView) view.findViewById(R.id.mail);
        ville = (TextView) view.findViewById(R.id.ville);
        cin = (TextView) view.findViewById(R.id.cin);
        tel = (TextView) view.findViewById(R.id.tel);
        fac = (TextView) view.findViewById(R.id.fac);

        return view;
    }

}
