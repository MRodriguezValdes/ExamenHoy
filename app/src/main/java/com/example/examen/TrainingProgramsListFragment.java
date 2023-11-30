package com.example.examen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TrainingProgramsListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_training_programs_list, container, false);

        ListView listView = view.findViewById(R.id.training_programs_list_view);

        List<TrainingProgram> trainingPrograms = new ArrayList<>();
        trainingPrograms.add(new TrainingProgram("Extremists a tope", R.drawable._1));
        trainingPrograms.add( new TrainingProgram("Agonia maxima ",R.drawable._2));
        trainingPrograms.add( new TrainingProgram("Entrenament especial ",R.drawable._3));
        trainingPrograms.add( new TrainingProgram("Força i longitud ",R.drawable._4));



        // Agrega otros elementos de la lista con sus respectivos iconos

        CustomTrainingProgramAdapter adapter = new CustomTrainingProgramAdapter(requireContext(), trainingPrograms);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Obtener el TrainingProgram seleccionado en la lista
                TrainingProgram selectedProgram = (TrainingProgram) parent.getItemAtPosition(position);

                // Crear una instancia del fragmento de detalles y pasar los detalles según el elemento seleccionado
                TrainingProgramDetailsFragment detailsFragment = new TrainingProgramDetailsFragment();
                Bundle bundle = new Bundle();
                bundle.putString("selectedItem", selectedProgram.getName()); // Suponiendo que getName() devuelve el nombre del programa
                detailsFragment.setArguments(bundle);

                // Reemplazar el fragmento de detalles en el contenedor
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, detailsFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });



        return view;
    }

}