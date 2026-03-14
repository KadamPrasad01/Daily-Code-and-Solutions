package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(3);
        son.career();
        son.partner();

        Daughter daug = new Daughter(2);
        daug.career();
        daug.partner();
    }
}
