package com.elearning.algo2;

public class Task {
    TaskName task;
    double value;

    public Task(TaskName task, double value) {
        this.task = task;
        this.value = value;
    }

    public TaskName getTask() {
        return task;
    }

    public void setTask(TaskName task) {
        this.task = task;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task=" + task +
                ", value=" + value +
                '}';
    }
}
