package com.johhns.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> arrayMascotas ;
    RecyclerView       recView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayMascotas = new ArrayList<>();
        recView = (RecyclerView) findViewById(R.id.rcView1) ;
        recView.setLayoutManager(new LinearLayoutManager(this));

        crear_mascotas();
        Adaptador adaptador = new Adaptador(arrayMascotas);
        recView.setAdapter(adaptador);


    }

    private void crear_mascotas() {
        arrayMascotas.add( new Mascota( R.drawable.lazy , "Lazy" , 7 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.manchas , "Mancjas" , 5 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.oso , "Oso" , 2 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.peluchin , "Peluchin" , 5 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.punky , "Punky" , 4 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.rex , "Rex" , 3 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.rocky , "Rocky" , 5 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.romi , "Romy" , 4 ) ) ;
    }


}