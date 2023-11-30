package com.example.examen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

            // Configurar la imagen correspondiente
            ImageView detailsImageView = view.findViewById(R.id.detailsImageView);
            detailsImageView.setImageResource(getTrainingProgramImage(selectedItem));
        }

        return view;
    }

    // Función para obtener la imagen según el elemento seleccionado
    private String getTrainingProgramDetails(String selectedItem) {
        // Devuelve el texto correspondiente al elemento seleccionado
        // (Utiliza un switch o if-else para definir el texto para cada opción)
        // Ejemplo:
        switch (selectedItem) {
            case "Extremists a tope":
                return "Correr 5 km\nHacer prensa 3 veces al día\nComer dinosaurios";
            // Otros casos para el resto de las opciones
            case "Agonia maxima":
                return "molt be 1";
            case  "Entrenament especial":
                return "molt be 2";
            case  "Força i longitud":
                return "molt be 3";
            default:
                return "Detalles no disponibles";
        }
    }
    private int getTrainingProgramImage(String selectedItem) {
        // Aquí debes devolver el recurso de imagen correspondiente a cada elemento
        // Puedes usar un switch o if-else para asignar la imagen según el elemento seleccionado
        switch (selectedItem) {
            case "Extremists a tope":
                return R.drawable._1; // Reemplaza con el recurso de imagen correspondiente

            // Otros casos para el resto de las opciones

            default:
                return R.drawable.baseline_question_mark_24; // Imagen por defecto o un recurso válido
        }
    }

}
