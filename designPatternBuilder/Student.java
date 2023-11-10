package designPatternBuilder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityname;
    private String batch;
    private long id;
    private int gradyear;
    private String phoneNumber;

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityname;
        private String batch;
        private long id;
        private int gradyear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityname() {
            return universityname;
        }

        public Builder setUniversityname(String universityname) {
            this.universityname = universityname;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradyear() {
            return gradyear;
        }

        public Builder setGradyear(int gradyear) {
            this.gradyear = gradyear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() throws Exception {
            if(getGradyear()<2000){
                throw new Exception("Validation Failed");
            }
            return new Student(this);
        }
    }

    private Student(Builder builder) throws Exception {
        this.age= builder.getAge();
        this.name= builder.getName();
        this.gradyear=builder.getGradyear();

    }



}
