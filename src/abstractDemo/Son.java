package abstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
        this.age = age;
    }
    @Override
    void career(){
        System.out.println("My name is Doctor");
    }

    void partner(){
        System.out.println("I love Doctor and she is ");
    }
}
