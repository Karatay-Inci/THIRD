//This is parent class
package MARCH21Inheritance;

public class I3Calculator {
    protected int display;
    public I3Calculator(){
        this.display=0;
        System.out.println("Display value:"+this.display);
    }
    protected int add(int a, int b){
        return a+b;
    }
    public int subst(int a,int b){
        return a-b;
    }
    private int divide(int a,int b){
        return a/b;
    }
    int multip(int a,int b){
        return a*b;
    }
}
