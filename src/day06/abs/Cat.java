package day06.abs;

public class Cat extends Pet{
    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNep() {
        System.out.println("켓타워에서 잔다");
    }

    @Override
    public void eat() {
        System.out.println("고양이 생선 먹는다");
    }

}
