package MARCH21Inheritance;

public class I6Child extends I6ParentQ {
    int y;
    I6Child (int y, int x){
        super(x);       //parent class attr x initialized by constructor
        this.y=y;
    }
    void callThisMethod(){
        int a=super.getX();
        a++;
    }
}
