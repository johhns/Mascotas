package com.johhns.mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> arrayMascotas ;
    RecyclerView       recView ;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar1);
        if (toolbar != null){
            setSupportActionBar(toolbar);
        }

        arrayMascotas = new ArrayList<>();
        recView = (RecyclerView) findViewById(R.id.rcView1) ;
        recView.setLayoutManager(new LinearLayoutManager(this));

        crear_mascotas();

        Adaptador adapter = new Adaptador(arrayMascotas);
        recView.setAdapter(adapter);

    }

    private void crear_mascotas() {
        arrayMascotas.add( new Mascota( R.drawable.lazy , "Lazy" , 7 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.manchas , "Manchas" , 5 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.oso , "Oso" , 2 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.punky , "Punky" , 4 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.rex , "Rex" , 3 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.rocky , "Rocky" , 5 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.romi , "Romy" , 4 ) ) ;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mFavoritos:
                Intent intent = new Intent(this, Favoritos.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}