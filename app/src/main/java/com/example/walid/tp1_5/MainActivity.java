package com.example.walid.tp1_5;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    RecyclerView myrcv;
    EtudiantAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Setup and Handover data to recyclerview
        myrcv = (RecyclerView) findViewById(R.id.rcv);
        List<Etudiant> data = genererEtudiants();
        myAdapter = new EtudiantAdapter(MainActivity.this, data);
        myrcv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        myrcv.setAdapter(myAdapter);
    }
    private List<Etudiant> genererEtudiants(){
        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiants.add(new Etudiant("GLID","Etudiant 1", "nom.prenom@gmail.com",1));
        etudiants.add(new Etudiant("SRS", "Etudiant 2", "nom.prenom@gmail.com",2));
        etudiants.add(new Etudiant("SRS", "Etudiant 3", "nom.prenom@gmail.com",0));
        etudiants.add(new Etudiant("GLID", "Etudiant 4", "nom.prenom@gmail.com",4));
        etudiants.add(new Etudiant("SRS", "Etudiant 5", "nom.prenom@gmail.com",0));
        return etudiants;
    }
}
