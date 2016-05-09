package model;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private int id;
    private String name;
    private ArrayList<Lesson> lessons  = new ArrayList<>();
    private ArrayList<String> week = new ArrayList<>();
    public Schedule(){}

    public Schedule(int id, String name){
        setId(id);
        setName(name);
    }
    public Schedule(int id, String name, ArrayList<Lesson> lessons){
        this(id, name);
        setLessons(lessons);
    }
    public Schedule(int id, String name, ArrayList<Lesson> lessons,ArrayList<String> week){
        this(id, name,lessons);
        setWeek(week);
    }
    public void addLesson(Lesson lesson){
        lessons.add(lesson);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public ArrayList<String> getWeek() {
        return week;
    }

    public void setWeek(ArrayList<String> week) {
        this.week = week;
    }
}
