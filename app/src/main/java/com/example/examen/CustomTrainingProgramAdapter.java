package com.example.examen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class CustomTrainingProgramAdapter extends ArrayAdapter<TrainingProgram> {

    private final Context context;
    private final List<TrainingProgram> trainingProgramList;

    public CustomTrainingProgramAdapter(Context context, List<TrainingProgram> trainingProgramList) {
        super(context, R.layout.list_item, trainingProgramList);
        this.context = context;
        this.trainingProgramList = trainingProgramList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        TextView textView = rowView.findViewById(R.id.training_program_text_view);
        ImageView imageView = rowView.findViewById(R.id.training_program_image_view);

        textView.setText(trainingProgramList.get(position).getName());
        imageView.setImageResource(trainingProgramList.get(position).getIconResource());

        return rowView;
    }
}

