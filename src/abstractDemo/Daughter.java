package abstractDemo;

public class Daughter extends Parent{
    Daughter(int age){
        super(age);
        this.age = age;
    }
     @Override
    void career(){
        System.out.println("My name is Coder");
    }

    void partner(){
        System.out.println("I love daug and she is ");
    }
}
