package com.johhns.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> arrayMascotas ;
    RecyclerView       recView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText( this, "cero", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
Toast.makeText( this, "uno", Toast.LENGTH_LONG).show();
        arrayMascotas = new ArrayList<>();
        Toast.makeText( this, "dos", Toast.LENGTH_LONG).show();
        recView = (RecyclerView) findViewById(R.id.rcView1) ;
        Toast.makeText( this, "tres", Toast.LENGTH_LONG).show();
        recView.setLayoutManager(new LinearLayoutManager(this));

        crear_mascotas();
        Toast.makeText( this, "cuatro", Toast.LENGTH_LONG).show();
        Adaptador adaptador = new Adaptador(arrayMascotas);
        recView.setAdapter(adaptador);
        Toast.makeText( this, "cinco", Toast.LENGTH_LONG).show();


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