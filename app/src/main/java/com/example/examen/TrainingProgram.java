package com.example.examen;

public class TrainingProgram {
    private String name;
    private int iconResource;

    public TrainingProgram(String name, int iconResource) {
        this.name = name;
        this.iconResource = iconResource;
    }

    public String getName() {
        return name;
    }

    public int getIconResource() {
        return iconResource;
    }
}
