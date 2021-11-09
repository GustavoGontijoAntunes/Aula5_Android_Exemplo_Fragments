package com.example.aula5_exemplofragments.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.aula5_exemplofragments.Fragments.AboutFragment;
import com.example.aula5_exemplofragments.Fragments.MusicasFragment;
import com.example.aula5_exemplofragments.R;

public class MainActivity extends AppCompatActivity {

    AboutFragment aboutFragment;
    MusicasFragment musicasFragment;

    Button btnSobre, btnMusicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSobre = findViewById(R.id.btnSobre);
        btnMusicas = findViewById(R.id.btnMusicas);

        aboutFragment = new AboutFragment();
        musicasFragment = new MusicasFragment();
        // Criar Transaction
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, aboutFragment);
        transaction.commit();

        btnSobre.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, aboutFragment);
                transaction.commit();
            }
        });

        btnMusicas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, musicasFragment);
                transaction.commit();
            }
        });
    }
}