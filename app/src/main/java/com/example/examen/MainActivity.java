package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.layout_land);

            // Cargar TrainingProgramsListFragment en el contenedor
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentList, new TrainingProgramsListFragment())
                    .commit();
        } else {
            setContentView(R.layout.activity_main);

            // Si estás en orientación vertical, probablemente debas mostrar TrainingProgramsListFragment
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerView, new TrainingProgramsListFragment())
                    .commit();
        }
    }

}