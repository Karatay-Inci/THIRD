package MARCH17REVIEW;

public class E3CoffeeMaker {
    private int cups;
    private int timer;
    private boolean brew;

    public E3CoffeeMaker(int cups){
        this.cups=cups;
        this.timer=0;
        this.brew=false;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isBrew() {
        return brew;
    }

    public void setBrew(boolean brew) {
        this.brew = brew;
    }

    public void resetTimer(){
        this.timer=0;
        System.out.println("Timer resetted");
    }
    public void brewCoffee(){
        if (this.timer==0){
            System.out.println("Coffee stared to brew");
        }
        else{
            System.out.println("Coffee will start to brew in"+this.timer+" minutes");
        }
    }


    @Override
    public String toString() {
        return "E3CoffeeMaker{" +
                "cups=" + cups +
                ", timer=" + timer +
                ", brew=" + brew +
                '}';
    }
}
