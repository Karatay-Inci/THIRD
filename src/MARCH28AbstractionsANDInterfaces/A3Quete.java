package MARCH28AbstractionsANDInterfaces;

abstract class A3Quete {
    private String customerName;
    private int totalSquareFeet;
    private double price;

    A3Quete(){
        this.customerName="John Doe";
        this.totalSquareFeet=0;
        this.price=0;
    }
     A3Quete(String customerName, int totalSquareFeet, double price) {
        this.customerName = customerName;
        this.totalSquareFeet = totalSquareFeet;
        this.price = price;
    }
    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public void setTotalSquareFeet(int totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateTotalPrice();
    abstract void printQuete();

    @Override
    public String toString() {
        return "A3Quete{" +
                "customerName='" + customerName + '\'' +
                ", totalSquareFeet=" + totalSquareFeet +
                ", price=" + price +
                '}';
    }
}
