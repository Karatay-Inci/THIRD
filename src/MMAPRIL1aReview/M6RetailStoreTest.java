package MMAPRIL1aReview;

public class M6RetailStoreTest {
    public static void main(String[] args) {
        M6RetailStore store1 = new M6RetailStore("cookie",200);
        M6RetailStore store2 = new M6RetailStore("candy",500);
        store1.showQuantity();
        store2.showQuantity();
        M6RetailStore.showTotalQuantity();

        System.out.println();

        store1.receive(300);
        store2.receive(600);
        store1.showQuantity();
        store2.showQuantity();
        M6RetailStore.showTotalQuantity();

    }
}
