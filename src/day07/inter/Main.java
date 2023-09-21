package day07.inter;

public class Main {
    public static void main(String[] args) {

        Animal duck = new Duck();
        BadAnimal bullDog = new BullDog();
        Shark shark = new Shark();
        Violent  rabbit = new Rabbit();

        Animal[]animals = {duck,(Animal) rabbit,(Animal) bullDog};

        for (Animal animal : animals) {
            animal.feed("맛돌이 사료");

        }

    }
}
