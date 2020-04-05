package MARCH17REVIEW;

public class E1CarInsurance {
    private int modelYear;
    private int numberOfTickets;
    private int numberOfAccidents;
    private double offer;
    final double basePrice=99.9;
    public E1CarInsurance(int modelYear, int numberOfTickets,int numberOfAccidents){
        this.modelYear=modelYear;
        this.numberOfTickets=numberOfTickets;
        this.numberOfAccidents=numberOfAccidents;
        this.offer=0;
    }
    public void setModelYear(int modelYear){
        this.modelYear=modelYear;
    }
    public int getModelYear(){
        return this.modelYear;
    }
    public void setNumberOfTickets(int tickets){
        this.numberOfTickets=tickets;
    }
    public int getNumberOfTickets(){
        return this.numberOfTickets;
    }
    public void setNumberOfAccidents(int accidents){
        this.numberOfAccidents=accidents;
    }
    public int getNumberOfAccidents(){
        return this.numberOfAccidents;
    }
    public void setOffer(int offer){
        this.offer=offer;
    }
    public double getOffer(){
        return this.offer;
    }
    public double makeOffer(int year){
        this.offer = this.basePrice+(year-this.modelYear)*50+(30*this.numberOfTickets)+(100*this.numberOfAccidents);
        return this.offer;
    }

    @Override
    public String toString() {
        return "E1CarInsurance{" +
                "modelYear=" + modelYear +
                ", numberOfTickets=" + numberOfTickets +
                ", numberOfAccidents=" + numberOfAccidents +
                ", offer=" + offer +
                ", basePrice=" + basePrice +
                '}';
    }
}
