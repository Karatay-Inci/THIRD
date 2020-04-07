package MARCH22POLYMORPHISM;

public class P6StaticVariable {
    static int a = 0;
    int b = 0;
    public P6StaticVariable(){
        this.a++;
        this.b++;
    }
    public static void getA(){
        System.out.println("a="+a);
    }
    public void getB(){
        System.out.println("b="+this.b);
    }
}
