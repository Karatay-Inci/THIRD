package MARCH28AbstractionsANDInterfaces;

public class A3Tiling extends A3Quete{
    private String material;
    A3Tiling(){
        super();
    }
    A3Tiling(String customerName, int totalSquareFeet, double price , String material){
        super(customerName,totalSquareFeet,price);
        this.material=material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    double calculateTotalmaterialPrice() {
        if (this.material.equalsIgnoreCase("wood")){
            return this.getTotalSquareFeet()*2.4;
        }
        else if (this.material.equalsIgnoreCase("title")){
            return this.getTotalSquareFeet()*1.99;
        }
        else {
            System.out.println("wrong material");
            return 0.0;
        }
    }

    double calculateTotalPrice(){
        this.setPrice(this.calculateTotalmaterialPrice()+4*this.getTotalSquareFeet());
        return this.getPrice();
    }
    void printQuete(){
        System.out.println(""+
                "Customer Name :\t"+this.getCustomerName()+
                "Total sqrFeet :\t"+this.getTotalSquareFeet()+
                "Material Price : \t"+this.calculateTotalmaterialPrice()+
                "Total Price :\t"+this.getPrice());
    }

    @Override
    public String toString() {
        return "A3Tiling{" +
                "material='" + material + '\'' +
                '}';
    }
}
