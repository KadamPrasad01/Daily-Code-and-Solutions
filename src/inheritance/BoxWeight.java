package inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = 0;
    }

    BoxWeight(double l , double w , double h , double weight){
        // this.l = l;    this is the same constructor from the parent class but you have written this again here there is repititon which can be solved by super() keyword which call the constructor from the parent class
        // this.w = w;
        // this.h = h;

        super(l,w,h);
        this.weight = weight;
    }
}
