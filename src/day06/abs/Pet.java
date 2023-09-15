package day06.abs;

public abstract class Pet {
    //공통 속성
    private String name;
    private String kind;
    private int age;

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //공통 기능
    public abstract void takeNep();//낮잠 기능


    public abstract void eat();  // 밥 먹는 기능

}
