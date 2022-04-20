package com.elearning.algo2;

public enum TaskName {
    ASSIGNMENT("Nilai Tugas", 20),
    QUIZ("Nilai Quiz", 20),
    UTS("Nilai UTS", 30),
    UAS("Nilai UAS", 30);

    public final String name;
    public final double weight;

    TaskName(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
