package designPatternBuilder;

public class Client {
    public static void main(String[] args) throws Exception {
          Student.Builder builder= Student.getBuilder();


//        Student st=new Student(builder);
//
//        Student s=builder.build();

        Student s1=Student.getBuilder()
                .setAge(29)
                .setName("Rajeev")
                .setGradyear(2019)
                .build();
    }
}
