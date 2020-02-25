package Homework;

public class Person {
private String name;
private int birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }
    public Person(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}

