package MARCH22POLYMORPHISM;

public class P6StaticVariableTestQ {
    public static void main(String[] args) {
        P6StaticVariable o1 = new P6StaticVariable();
        P6StaticVariable.getA();
        o1.getB();

        P6StaticVariable o2 = new P6StaticVariable();
        P6StaticVariable.getA();
        o2.getB();

        P6StaticVariable o3 = new P6StaticVariable();
        P6StaticVariable.getA();
        o3.getB();

        /*
        System.out.println("b="+o1.b);
        System.out.println("a="+P6StaticVariable.a);

        System.out.println("b="+o2.b);
        System.out.println("a="+P6StaticVariable.a);




        P6StaticVar.getA();
        o1.getB();
        P6StaticVar.getA();
        o2.getB();
        */

    }
}
