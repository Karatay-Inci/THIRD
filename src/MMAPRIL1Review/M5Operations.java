package MMAPRIL1Review;

public class M5Operations {
    public int a,b,c;
    public M5Operations(){
        this.a=10;
        this.b=20;
        this.c=30;
    }
    public M5Operations(int a){
        this.a=a;
        this.b=20;
        this.c=30;
    }
    public M5Operations(int a,int b){
        this.a=a;
        this.b=b;
        this.c=30;
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add (int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
}
