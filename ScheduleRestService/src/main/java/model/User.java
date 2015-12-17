package model;


public class User {

    private String name;
    private String surname;
    private int course;
    private String group;
    private String email;
    private String password;

    public User(){}

    public User(String name, String surname, int course,String group, String email, String password/*, Schedule schedule*/){
        setName(name);
        setSurname(surname);
        setCourse(course);
        setGroup(group);
        setEmail(email);
        setPassword(password);
        /*setSchedule(schedule);*/
    }

    public String toString(){
        return new String("Name: " + this.getName() + ", surname: " + this.getSurname() + ", course: " +
                + this.getCourse() + ", group: " + this.getGroup() + ", email: " + this.getEmail());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }*/
}
