package com.johhns.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {


    ArrayList<Mascota> aMascotas ;
    RecyclerView       recView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar barra_acciones = findViewById( R.id.miActionBar ) ;
        setSupportActionBar(barra_acciones);

        aMascotas = new ArrayList<>() ;
        recView = findViewById(R.id.rcView1) ;
        recView.setLayoutManager( new LinearLayoutManager( this ));

        crear_mascotas();

        Adaptador adaptador = new Adaptador( aMascotas ) ;
        recView.setAdapter(adaptador);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    private void crear_mascotas() {
        aMascotas.add( new Mascota( R.drawable.manchas , "Manchas" , 5 ) ) ;
        aMascotas.add( new Mascota( R.drawable.punky , "Punky" , 4 ) ) ;
        aMascotas.add( new Mascota( R.drawable.rex , "Rex" , 3 ) ) ;
        aMascotas.add( new Mascota( R.drawable.rocky , "Rocky" , 2 ) ) ;
        aMascotas.add( new Mascota( R.drawable.romi , "Romy" , 1 ) ) ;
    }


}