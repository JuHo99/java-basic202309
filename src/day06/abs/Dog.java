package day06.abs;

public class Dog extends Pet{
    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNep() {
        System.out.println("마당에서 잔다");
    }

    public void eat(){
        System.out.println("강아지 밥 먹는다");
    }

}
