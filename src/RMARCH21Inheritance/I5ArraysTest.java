package RMARCH21Inheritance;

public class I5ArraysTest {
    public static void main(String[] args) {
        I5ArrayOps myArr = new I5ArrayOps();
        int [] arr = {1,2,3,4,5,64,7,7,8};
        int index=myArr.findIndex(arr,7);
        System.out.println(index);
        System.out.println();

        I5ArraysStatsQ myStat = new I5ArraysStatsQ(arr);
        System.out.println(myStat.findAverage());
        System.out.println(myStat.findMax());
        int maxIndex=myStat.findMaxIndex();
        System.out.println(maxIndex);
    }
}
