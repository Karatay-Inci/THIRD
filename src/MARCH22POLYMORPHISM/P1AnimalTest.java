package MARCH22POLYMORPHISM;

public class P1AnimalTest {
    public static void main(String[] args) {
        P1Animals animal = new P1Animals();
        P1Animals cat = new P1Cat();
        P1Animals dog = new P1Dog();
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }
}
