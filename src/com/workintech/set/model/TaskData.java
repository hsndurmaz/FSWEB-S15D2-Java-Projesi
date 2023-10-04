package com.workintech.set.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
   private Set<Task> annsTasks;
   private Set<Task> bobsTasks;
   private Set<Task> carolsTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getTasks(String taskOwner){
        Set<Task> task = new HashSet<>();
        if(taskOwner.equals("ann")){
            return annsTasks;
        }if(taskOwner.equals("bob")){
            return bobsTasks;
        }if(taskOwner.equals("carol")){
            return carolsTasks;
        }if(taskOwner.equals("all")){
           List<Set<Task>> taskList= new ArrayList<>();
           taskList.add(annsTasks);
           taskList.add(carolsTasks);
           taskList.add(bobsTasks);
           return  getUnion(taskList);
        }
        return new HashSet<>();

    }
    public Set<Task> getUnion(List<Set<Task>> taskList){
        Set<Task> totals = new HashSet<>();
        for(Set<Task> tasks : taskList){
            totals.addAll(tasks);
        }
        return totals;
    }
    public  Set<Task> getIntersection (Set<Task> first, Set<Task> second){
        Set<Task > intersection= new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }
    public Set<Task> getDifference(Set<Task> first, Set<Task> second){
        Set<Task> differences= new HashSet<>(first);
        differences.removeAll(second);
        return differences;
    }

}
