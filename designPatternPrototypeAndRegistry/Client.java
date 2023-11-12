package designPatternPrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
     StudentRegistry s=new StudentRegistry();
     fillStudentRegistry(s);

     Student ss=s.get("apr21Student").clone();
     ss.setName("Ajay");
     ss.setAge(22);
     ss.setPsp(28);

     Student sm= s.get("apr21Student");
     sm.setName("Ujwal");
        System.out.println("DEBUG");
    }

    public static void fillStudentRegistry(StudentRegistry registry) {
          //protype 1
        Student aprStudent = new Student();
        aprStudent.setBatchpsp(45);
        aprStudent.setBatchname("apr21");
        registry.register("apr21Student", aprStudent);

        //protype 2
        IntelligentStudent I=new IntelligentStudent();
        I.setBatchname("Ramna");
        I.setBatchpsp(43);
        registry.register("April22Students",I);


    }
}
