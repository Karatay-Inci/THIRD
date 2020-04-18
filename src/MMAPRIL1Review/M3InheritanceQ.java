package MMAPRIL1Review;

public class M3InheritanceQ {
    private static int additionPrivateStatic(int a, int b){
        return a+b;
    }

    {
        M3InheritanceQ.additionPrivateStatic(4,7);
    }
    public static int additionPublicStatic(int a,int b){
        return a+b;
    }
    private int additionPrivate(int a, int b){
        return a+b;
    }
    {
        this.additionPrivate(8,7);
    }
    public int additionPublic (int a, int b){
        return a+b;
    }
}
