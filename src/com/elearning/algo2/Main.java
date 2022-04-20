package com.elearning.algo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        String name;
        double totalValue = 0;
        final double minimumValue = 70;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        name = input.nextLine();

        System.out.print("Masukan Nilai Tugas: ");
        final double assignmentValue = input.nextInt();
        Task assignment = new Task(TaskName.ASSIGNMENT, assignmentValue);
        tasks.add(assignment);

        System.out.print("Masukan Nilai Quiz: ");
        final double quizValue = input.nextInt();
        Task quiz = new Task(TaskName.QUIZ, quizValue);
        tasks.add(quiz);

        System.out.print("Masukan Nilai UTS: ");
        final double utsValue = input.nextInt();
        Task uts = new Task(TaskName.UTS, utsValue);
        tasks.add(uts);

        System.out.print("Masukan Nilai UAS: ");
        final double uasValue = input.nextInt();
        Task uas = new Task(TaskName.UAS, uasValue);
        tasks.add(uas);


        System.out.println("---------------");
        System.out.println(" LAPORAN HASIL ");
        System.out.println("---------------");

        //Weight Assignment     20%
        //Weight Quiz           20%
        //Weight UTS            30%
        //Weight UAS            30%
        for (Task task : tasks) {
            System.out.println(task.task.name + " : " + task.value);
            totalValue += task.value * task.task.weight / 100;
        }

        if (tasks.stream().noneMatch(task -> task.value < minimumValue)) {
            System.out.println("Selamat " + name + " Sudah LULUS");
        } else {
            for (Task task : tasks) {
                if (task.value < minimumValue) {
                    System.out.println(task.task.name + " Masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
                }
            }
        }

        System.out.println("Nilai Total : " + totalValue);
        System.out.println("Grade Nilai : " + gradeValue(totalValue));
    }

    //Grade Value Rules
    // A       >= 85.00  - 100
    // B       >= 75.00  - 84.99
    // C       >= 60.00  - 74.99
    // D       >= 45.00  - 59.99
    // E       >= 0.00   - 44.99
    static String gradeValue(double value) {
        if (value >= 85.00) {
            return "A";
        } else if (value >= 75.00 && value <= 84.99) {
            return "B";
        } else if (value >= 60.00 && value <= 74.99) {
            return "C";
        } else if (value >= 45.00 && value <= 59.99) {
            return "D";
        } else {
            return "E";
        }
    }
}
