package inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 = new Box(10);
        // Box box2 = new Box(box1);
        // System.out.println(box1.l + " " + box1.w + " " + box1.h);
        // System.out.println(box2.l + " " + box2.w + " " + box2.h);

        // BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.l + " " + box3.w + " " + box3.h + " " + box3.weight);

        // BoxWeight box4 = new BoxWeight(1,2,3,4);
        // System.out.println(box4.l + " " + box4.w + " " + box4.h + " " + box4.weight);

        // System.out.println(box5.l + " " + box5.w + " " + box5.h + " " + box5.weight);
        Box box5 = new BoxWeight(5,6,7,8); 
        // here there is reference called box5 which is of type Box but is it pointing a object of class BoxWeight but since the BoxWeight is a child of Box it is important to understand that it is the type of the reference varible that actually determines and not the type of the object that determines what members can be accessed.
        // But there only l , w, h can be accessed and not the weight.
        // so the things which come under the box are only accessible to reference box and not things from the child class.
        // so you can have a parent reference variable and child class object.
        System.out.println(box5.l);
    }
}
