package MMAPRIL1Review;

public class M6RetailStore {
    private String product;
    private int quantity;
    private static int totalQuantity;

    public M6RetailStore(String product, int quantity){         //Constructor
        this.product = product;
        this.quantity = quantity;
        totalQuantity += this.quantity;                     //for opening day
    }

    public void receive(int quan){
        this.quantity+=quan;
        totalQuantity+=quan;                            //for next receiving
    }
    public void sell(int quan){
        this.quantity-=quan;
        totalQuantity-=quan;                            //for next sells
    }
    public void showQuantity(){
        System.out.println(this.product+"= "+this.quantity);
    }
    public static void showTotalQuantity(){
        System.out.println("Total Quantity= "+totalQuantity);
    }
}
