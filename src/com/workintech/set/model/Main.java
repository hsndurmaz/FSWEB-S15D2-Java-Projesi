package com.workintech.set.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Task task1= new Task("java", "write list", "ann",Priority.LOW, Status.ASSIGNED);
        Task task2= new Task("java", "write list", "ann",Priority.LOW, Status.ASSIGNED);
        Task task3= new Task("java", "write list", "ann",Priority.LOW, Status.ASSIGNED);
        Task task4= new Task("java", "write list", "ann",Priority.LOW, Status.ASSIGNED);
        Task task5= new Task("java", "write list", "ann",Priority.LOW, Status.ASSIGNED);
        Set<Task> annsTask = new LinkedHashSet<>();
        annsTask.add(task1);
        annsTask.add(task5);

        Set<Task> bobsTask = new LinkedHashSet<>();
        bobsTask.add(task2);
        bobsTask.add(task4);

        Set<Task> carolsTask = new LinkedHashSet<>();
        carolsTask.add(task3);

        TaskData taskData = new TaskData(annsTask,bobsTask,carolsTask);
        List<Set<Task>> tasks = new ArrayList<>();
        tasks.add(annsTask);
        tasks.add(bobsTask);
        tasks.add(carolsTask);
        System.out.println(taskData.getUnion(tasks));

        System.out.println("All tasks: ");
        System.out.println(taskData.getTasks("all"));
        System.out.println("Anns tasks: ");
        System.out.println(taskData.getAnnsTasks());
        System.out.println("Bobs tasks: ");
        System.out.println(taskData.getBobsTasks());
        System.out.println("Carols tasks: ");
        System.out.println(taskData.getCarolsTasks());
    }
}
