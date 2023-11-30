package com.example.examen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TrainingProgramDetailsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training_program_details, container, false);

        // Obtener los detalles del argumento pasado desde el fragmento de la lista
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("selectedItem")) {
            String selectedItem = bundle.getString("selectedItem");

            // Mostrar los detalles correspondientes en el fragmento de detalles
            TextView detailsTextView = view.findViewById(R.id.detailsTextView);
            detailsTextView.setText(getTrainingProgramDetails(selectedItem));
        }

        return view;
    }

    // Función para obtener los detalles según el elemento seleccionado
    private String getTrainingProgramDetails(String selectedItem) {
        // Aquí puedes establecer los detalles según el elemento seleccionado
        // Por ejemplo, puedes usar un switch o if-else para establecer los detalles para cada opción
        switch (selectedItem) {
            case "Extremists a tope":
                return "Correr 5 km\nHacer prensa 3 veces al día\nComer dinosaurios";

            // Otros casos para el resto de las opciones

            default:
                return "Detalles no disponibles";
        }
    }
}
