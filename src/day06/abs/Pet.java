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
    // 추상 메서드 : 오버라이딩의 강제화
    public abstract void takeNep();//낮잠 기능
    public abstract void eat();  // 밥 먹는 기능

    public void walk(){// 일반 메서드 : 오버라이딩 후 자유롭게 사용 가능

    }

    public final String info(){ // 자식 객체들은 이 내용을 바꿀 수 없다
        return "Hello"+name;
    }

}
