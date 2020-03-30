package REVIEWmarch17;

public class E1CarInsuranceTest  {
    public static void main(String[] args) {
        E1CarInsurance myIns= new E1CarInsurance(2015,0,0);
        double myOffer=  myIns.makeOffer(2020);
        System.out.println(myOffer);
        E1CarInsurance myIns2= new E1CarInsurance(2019,3,2);
        System.out.println(myIns2.makeOffer(2020));
    }
}
