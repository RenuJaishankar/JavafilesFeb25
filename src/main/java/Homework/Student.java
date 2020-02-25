package Homework;

public class Student extends Person {
    //student variables
    private String name;
    private int age;
    private int gradYear;
    private int studentI;
    private int studentID;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setStudentI(int studentI) {
        this.studentI = studentI;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public int getStudentI() {
        return studentI;
    }

    public int getStudentID() {
        return studentID;
    }

    // constructor with all variables
    public Student(String name, int age, int gradYear, int studentID, int birthday) {
        super(name, birthday);
        this.name = name;
        this.age = age;
        this.gradYear = gradYear;
        this.studentID = studentID;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradYear=" + gradYear +
                ", studentID=" + studentID +
                '}';
    }


}
