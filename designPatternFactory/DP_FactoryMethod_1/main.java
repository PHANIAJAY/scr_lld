package DP_FactoryMethod_1;

public class main {
    public static void main(String[] args) {
        Person p=PersonFactory.create("Male");
        p.wish("hello");
    }
}
