package designPatternPrototypeAndRegistry;

public class Student implements prototype<Student>{
    private String name;
    private int age;
    private String batchname;
    private double psp;

    private double batchpsp;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchpsp(double batchpsp) {
        this.batchpsp = batchpsp;
    }

    Student(){
    }

    Student(Student other){
        this.batchpsp = other.batchpsp;
        this.psp = other.psp;
        this.batchname = other.batchname;
        this.age = other.age;
        this.name = other.name;

    }

    @Override
    public Student clone() {
        Student st=new Student(this);
        return st;
    }
}
